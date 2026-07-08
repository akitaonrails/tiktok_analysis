package com.bytedance.pns.engine;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class RealConfigProvider implements ConfigProvider {
    public final /* synthetic */ ConfigProvider $$delegate_0;

    @Override // com.bytedance.pns.engine.ConfigProvider
    public boolean bizEnable(String str) {
        return this.$$delegate_0.bizEnable(str);
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public long capacity() {
        return this.$$delegate_0.capacity();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public boolean enableActivate() {
        return this.$$delegate_0.enableActivate();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public boolean enableCallbackWithoutStrategy() {
        return this.$$delegate_0.enableCallbackWithoutStrategy();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public boolean enableLog() {
        return this.$$delegate_0.enableLog();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public boolean enableNameListAbility() {
        return this.$$delegate_0.enableNameListAbility();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public boolean enableValidateAbility() {
        return this.$$delegate_0.enableValidateAbility();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public Object extraConfigs(String str) {
        return this.$$delegate_0.extraConfigs(str);
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public String getBuiltinConfig() {
        return this.$$delegate_0.getBuiltinConfig();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public List<String> getBuiltinStrategyConfig() {
        return this.$$delegate_0.getBuiltinStrategyConfig();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public ConstPoolConfig getConstPoolConfig() {
        return this.$$delegate_0.getConstPoolConfig();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public Context getContext() {
        return this.$$delegate_0.getContext();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public List<String> getStrategyAllowList() {
        return this.$$delegate_0.getStrategyAllowList();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public List<String> getStrategyBlockList() {
        return this.$$delegate_0.getStrategyBlockList();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public String getStrategyConfig() {
        return this.$$delegate_0.getStrategyConfig();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public double reportSampleRate() {
        return this.$$delegate_0.reportSampleRate();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public int tc() {
        return this.$$delegate_0.tc();
    }

    @Override // com.bytedance.pns.engine.ConfigProvider
    public boolean triggerIdEnable(String str) {
        return this.$$delegate_0.triggerIdEnable(str);
    }

    public RealConfigProvider(ConfigProvider configProvider) {
        this.$$delegate_0 = configProvider;
    }
}
