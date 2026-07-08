package com.ss.android.vesdk.filterparam;

import X.EnumC356280Dxy;

/* JADX INFO: loaded from: classes6.dex */
public class VEMattingTypeParam {
    public String algorithmConfigPath;
    public String extInfoJson;
    public String extMaskPath;
    public EnumC356280Dxy mattingType = EnumC356280Dxy.MATTING_TYPE_NONE;
    public String workSpace;

    public int getMattingTypeByNative() {
        return this.mattingType.ordinal();
    }
}
