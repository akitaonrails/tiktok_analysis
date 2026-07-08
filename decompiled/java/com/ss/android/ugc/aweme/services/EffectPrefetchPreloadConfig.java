package com.ss.android.ugc.aweme.services;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectPrefetchPreloadConfig implements IEffectPrefetchPreloadConfigService {
    public static final EffectPrefetchPreloadConfig INSTANCE = new EffectPrefetchPreloadConfig();
    public final /* synthetic */ IEffectPrefetchPreloadConfigService $$delegate_0 = EffectPrefetchPreloadConfigServiceImpl.createIEffectPrefetchPreloadConfigServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int leftPrefetchCount() {
        return this.$$delegate_0.leftPrefetchCount();
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int leftPreloadCount() {
        return this.$$delegate_0.leftPreloadCount();
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public boolean propPanelPrefetchEnabled() {
        return this.$$delegate_0.propPanelPrefetchEnabled();
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public boolean propPanelPreloadEnabled() {
        return this.$$delegate_0.propPanelPreloadEnabled();
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int rightPrefetchCount() {
        return this.$$delegate_0.rightPrefetchCount();
    }

    @Override // com.ss.android.ugc.aweme.services.IEffectPrefetchPreloadConfigService
    public int rightPreloadCount() {
        return this.$$delegate_0.rightPreloadCount();
    }
}
