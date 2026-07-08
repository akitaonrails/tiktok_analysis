package com.ss.android.ugc.aweme.sticker.ab;

import X.C0C64;
import X.C1630230sWb;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectUploadPickerFolderUIExperiment {
    public static final int $stable = 0;
    public static final EffectUploadPickerFolderUIExperiment INSTANCE = new EffectUploadPickerFolderUIExperiment();
    public static final int OFF = 0;
    public static final int VARIANT_ONE = 1;

    public static final boolean isEnabled() {
        return (C0C64.LJIILLIIL().LJIJ(31744, 0, "effect_upload_picker_folded_status_enabled", true) <= 0 || C1630230sWb.LIZ || !C1630230sWb.LIZLLL || C1630230sWb.LIZIZ || C1630230sWb.LIZJ) ? false : true;
    }
}
