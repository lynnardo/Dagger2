package com.var.dagger2;

import dagger.Component;

/**
 * 作者: 李景龙
 * 日期: 2016/12/15
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
