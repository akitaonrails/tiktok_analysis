package com.ss.android.ugc.aweme.compliance.consent.deviceconsent.config;

import X.C100S;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IConsentConfigInitTaskService;

/* JADX INFO: loaded from: classes29.dex */
public final class ConsentConfigInitTaskServiceImpl implements IConsentConfigInitTaskService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IConsentConfigInitTaskService
    public final PrioritizedConsentConfigInitTask LIZ() {
        return new PrioritizedConsentConfigInitTask();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IConsentConfigInitTaskService
    public final DelayedConsentConfigInitTask LIZIZ() {
        return C100S.LIZ;
    }
}
