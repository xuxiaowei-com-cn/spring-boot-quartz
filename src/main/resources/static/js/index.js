layui.define(['layer'], function (exports) {

    const $ = layui.$,
        layer = layui.layer;

    const index = {
        hello: function (str) {
            layer.msg('Hello, 欢迎使用 ' + (str || 'quartz'));
        },

        /**
         * 展示页面
         * @param target 需要展示URL的位置
         * @param defaultHash 默认 hash 值
         * @param otherNav 其他导航栏，不为空
         * @param thisNav 当前导航栏，不为空
         * @param thisClass 当前 class，默认值：nav-this，可为空
         * @param forceHash 强制使用 hash
         */
        showNav: function (target, defaultHash, otherNav, thisNav, thisClass, forceHash) {
            const currentHash = forceHash ? forceHash : (window.location.hash.slice(1) || defaultHash || '/'); // 当前 hash
            thisClass = thisClass || 'nav-this' // this a class
            $(otherNav).removeClass(thisClass) // 移除 this
            $(thisNav).addClass(thisClass) // 添加 this
            $.get(currentHash).done(function (data) { // 请求 hash
                $(target).html(data) // 页面显示
            })
        }

    };

    // 输出 index 接口
    exports('index', index);
});
