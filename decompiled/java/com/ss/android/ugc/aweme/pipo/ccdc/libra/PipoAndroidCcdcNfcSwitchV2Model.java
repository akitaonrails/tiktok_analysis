package com.ss.android.ugc.aweme.pipo.ccdc.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAndroidCcdcNfcSwitchV2Model {

    @C09CT("enable_nfc")
    public final boolean enableNFC;

    @C09CT("filter_no_nfc_permission")
    public final boolean filterNoNfcPermission;

    public PipoAndroidCcdcNfcSwitchV2Model() {
        this(true, false);
    }

    public PipoAndroidCcdcNfcSwitchV2Model(boolean z, boolean z2) {
        this.enableNFC = z;
        this.filterNoNfcPermission = z2;
    }
}
