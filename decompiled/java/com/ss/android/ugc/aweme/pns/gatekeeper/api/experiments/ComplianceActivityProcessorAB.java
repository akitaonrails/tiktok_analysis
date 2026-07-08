package com.ss.android.ugc.aweme.pns.gatekeeper.api.experiments;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
public final class ComplianceActivityProcessorAB {
    public static final boolean DISABLED = false;
    public static final ComplianceActivityProcessorAB INSTANCE = new ComplianceActivityProcessorAB();

    public final boolean isEnabled() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_compliance_activity_processor", false);
    }
}
