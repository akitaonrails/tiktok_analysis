package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes30.dex */
public class PublishSyncDuoshanAllConfig {

    @C09CT("register_duoshan")
    public PublishSyncDuoshanConfig registerDuoshan;

    @C09CT("ungister_duoshan")
    public PublishSyncDuoshanConfig ungisterDuoshan;

    public PublishSyncDuoshanConfig getRegisterDuoshan() throws C316660CbA {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.registerDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new C316660CbA();
    }

    public PublishSyncDuoshanConfig getUngisterDuoshan() throws C316660CbA {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.ungisterDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new C316660CbA();
    }
}
