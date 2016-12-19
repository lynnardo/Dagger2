package com.var.dagger2;

import com.var.dagger2.modle.User;

import dagger.Module;
import dagger.Provides;

/**
 * 作者: 李景龙
 * 日期: 2016/12/15
 */
@Module
public class MainModule {
    @Provides
    public User provideUser() {
        return new User("李四");
    }
}
