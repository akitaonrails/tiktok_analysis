package com.bytedance.pipo.stellar.base.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoStellarEventTrackReportSettingModel {

    @C09CT("repeated_inside_page")
    public final boolean repeatedInsidePage;

    @C09CT("repeated_when_back")
    public final boolean repeatedWhenBack;

    public PipoStellarEventTrackReportSettingModel() {
        this(true, true);
    }

    public PipoStellarEventTrackReportSettingModel(boolean z, boolean z2) {
        this.repeatedInsidePage = z;
        this.repeatedWhenBack = z2;
    }
}
