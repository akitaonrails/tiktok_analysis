package com.bytedance.pns.engine;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface ConfigProvider {
    boolean bizEnable(String str);

    long capacity();

    boolean enableActivate();

    boolean enableCallbackWithoutStrategy();

    boolean enableLog();

    boolean enableNameListAbility();

    boolean enableValidateAbility();

    Object extraConfigs(String str);

    String getBuiltinConfig();

    List<String> getBuiltinStrategyConfig();

    ConstPoolConfig getConstPoolConfig();

    Context getContext();

    List<String> getStrategyAllowList();

    List<String> getStrategyBlockList();

    String getStrategyConfig();

    double reportSampleRate();

    int tc();

    boolean triggerIdEnable(String str);
}
