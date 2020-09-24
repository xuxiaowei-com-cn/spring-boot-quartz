layui.define(['layer'], function (exports) {

    const index = {
        hello: function (str) {
            layer.msg('Hello, 欢迎使用 ' + (str || 'quartz'));
        }
    };

    // 输出 index 接口
    exports('index', index);
});
