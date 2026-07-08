package com.ss.android.vesdk.filterparam;

import X.EnumC2008207to;

/* JADX INFO: loaded from: classes36.dex */
public class VENewAiCutOutClipFilterParam extends VEBaseFilterParam {
    public long archer_strategy;
    public VEMattingTypeParam baseType;
    public VEMattingTypeParam curType;
    public boolean disableDownSampleForBach;
    public boolean disableSaveCacheInCompile;
    public VEMattingFollowParam followParam;
    public String rgba;
    public String strokeParamJson;
    public EnumC2008207to blendMode = EnumC2008207to.MATTING_BLEND_MODE_NORMAL;
    public String blendColor = "#FF000000";

    public int getMattingBlendModeByNative() {
        return this.blendMode.ordinal();
    }

    public VENewAiCutOutClipFilterParam() {
        this.filterName = "video matting filter name";
        this.filterType = 62;
        this.filterDurationType = 1;
    }
}
