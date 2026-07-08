package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcCcdcBindPromoRetentionConfigModel {

    @C09CT("freq_in_mins")
    public final long freqInMins;

    @C09CT("freq_in_open_counts")
    public final long freqInOpenCounts;

    @C09CT("is_dialog_enabled")
    public final boolean isDialogEnabled;

    public PipoEcCcdcBindPromoRetentionConfigModel() {
        this(false, 999999999L, 999999999L);
    }

    public PipoEcCcdcBindPromoRetentionConfigModel(boolean z, long j, long j2) {
        this.isDialogEnabled = z;
        this.freqInMins = j;
        this.freqInOpenCounts = j2;
    }
}
