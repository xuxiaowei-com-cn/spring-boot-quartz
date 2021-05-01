package cn.com.xuxiaowei.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 日期工具类
 *
 * @author 徐晓伟
 */
public class DateUtils {

    /**
     * 简单日期格式
     */
    public static final String SIMPLE_DATE = "yyyyMMdd";

    /**
     * 简单日期时间格式
     */
    public static final String SIMPLE_DATE_TIME = "yyyyMMddHHmmss";

    /**
     * 简单全日期时间格式
     */
    public static final String SIMPLE_ALL_DATE_TIME = "yyyyMMddHHmmssSSS";

    /**
     * 简单分隔日期格式
     */
    public static final String SIMPLE_SEPARATE_DATE = "yyyy-MM-dd";

    /**
     * 简单分隔全日期格式
     */
    public static final String SIMPLE_SEPARATE_ALL_DATE = "yyyy-MM-dd HH:mm";

    /**
     * 简单分隔全日期时间格式
     */
    public static final String SIMPLE_SEPARATE_ALL_DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    /**
     * 12月
     */
    public static final int DECEMBER = 12;

    /**
     * 根据 日期格式 将 字符串转化为 日期
     *
     * @param text    字符串
     * @param pattern 日期格式
     * @return 返回 日期
     */
    public static LocalDate parse(String text, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(text, dateTimeFormatter);
    }

    /**
     * 根据 日期时间格式 将 字符串转化为 日期时间
     *
     * @param text    字符串
     * @param pattern 日期时间格式
     * @return 返回 日期
     */
    public static LocalDateTime parseDatetime(String text, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(text, dateTimeFormatter);
    }

    /**
     * 根据 日期格式 将 字符串转化为 日期时间
     *
     * @param text      字符串
     * @param pattern   日期格式
     * @param localTime 时间
     * @return 返回 日期时间
     */
    public static LocalDateTime parse(String text, String pattern, LocalTime localTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(text, dateTimeFormatter).atTime(localTime);
    }

    /**
     * 根据 日期时间、格式 处理为字符串
     *
     * @param localDateTime 日期时间
     * @param pattern       格式
     * @return 返回 字符串
     */
    public static String format(LocalDateTime localDateTime, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localDateTime.format(dateTimeFormatter);
    }

    /**
     * 根据 日期、格式 处理为字符串
     *
     * @param localDate 日期
     * @param pattern   格式
     * @return 返回 字符串
     */
    public static String format(LocalDate localDate, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localDate.format(dateTimeFormatter);
    }

    /**
     * 根据 时间、格式 处理为字符串
     *
     * @param localTime 时间
     * @param pattern   格式
     * @return 返回 字符串
     */
    public static String format(LocalTime localTime, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localTime.format(dateTimeFormatter);
    }

    /**
     * LocalDateTime 转 Date
     *
     * @param localDateTime java 8 日期时间
     * @return 返回 Date
     */
    public static Date parse(LocalDateTime localDateTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        return Date.from(zdt.toInstant());
    }

    /**
     * 根据身份证号码获取出生日期
     *
     * @param idCard 身份证号码（15或18位）
     * @return 返回 出生日期（如身份号码不挣钱，将返回 null）
     */
    public static String getBirthday(String idCard) {
        if (idCard == null) {
            return null;
        }
        int length = idCard.length();
        int normalIdCard = 18;
        int shorterIdCard = 15;
        if (length == normalIdCard) {
            return idCard.substring(6, 14);
        } else if (length == shorterIdCard) {
            return "19" + idCard.substring(6, 12);
        }
        return null;
    }

    /**
     * 根据身份证号码获取出生日期
     *
     * @param idCard 身份证号码（15或18位）
     * @return 返回 出生日期（如身份号码不挣钱，将返回 null）
     */
    public static LocalDate parseBirthday(String idCard) {
        String birthday = getBirthday(idCard);
        if (birthday == null) {
            return null;
        }
        return parse(birthday, SIMPLE_DATE);
    }

    /**
     * 根据身份证号码获取出生日期
     *
     * @param idCard 身份证号码（15或18位）
     * @return 返回 出生日期（如身份号码不挣钱，将返回 null）
     */
    public static LocalDateTime parseBirthdayTime(String idCard) {
        LocalDate birthday = parseBirthday(idCard);
        if (birthday == null) {
            return null;
        }
        return birthday.atTime(LocalTime.MIN);
    }

    /**
     * 根据 日期时间，获取下个月开始的日期时间
     *
     * @param localDateTime 日期时间
     * @return 返回 下个月开始的日期时间（00:00:00.000）
     */
    public static LocalDateTime nextMonthStart(LocalDateTime localDateTime) {
        int monthValue = localDateTime.getMonthValue();
        if (monthValue == DECEMBER) {
            return localDateTime.withYear(localDateTime.getYear() + 1).withMonth(1)
                    .withDayOfMonth(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
        }
        return localDateTime.withMonth(monthValue + 1).withDayOfMonth(1)
                .withHour(0).withMinute(0).withSecond(0).withNano(0);
    }

    /**
     * 根据 日期，获取下个月开始的日期
     *
     * @param localDate 日期
     * @return 返回 下个月开始的日期
     */
    public static LocalDate nextMonthStart(LocalDate localDate) {
        int monthValue = localDate.getMonthValue();
        if (monthValue == DECEMBER) {
            return localDate.withYear(localDate.getYear() + 1).withMonth(1)
                    .withDayOfMonth(1);
        }
        return localDate.withMonth(monthValue + 1).withDayOfMonth(1);
    }

    /**
     * 判断是否同年
     *
     * @param localDateTime      日期时间
     * @param otherLocalDateTime 另一个日期时间
     * @return 返回是否同年
     */
    public static boolean identicalYear(LocalDateTime localDateTime, LocalDateTime otherLocalDateTime) {
        int year = localDateTime.getYear();
        int otherYear = otherLocalDateTime.getYear();
        return year == otherYear;
    }

    /**
     * 判断是否同年同月
     *
     * @param localDateTime      日期时间
     * @param otherLocalDateTime 另一个日期时间
     * @return 返回是否同年
     */
    public static boolean identicalYearMonth(LocalDateTime localDateTime, LocalDateTime otherLocalDateTime) {
        int year = localDateTime.getYear();
        int otherYear = otherLocalDateTime.getYear();
        int monthValue = localDateTime.getMonthValue();
        int otherMonthValue = otherLocalDateTime.getMonthValue();
        return year == otherYear && monthValue == otherMonthValue;
    }

}
