package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageInfoList {
    public List<Float> c3Feature;
    public List<FaceFeatureV2> faceFeatureV2;
    public MetaExt meta;
    public List<Float> relationTag;
    public List<Integer> saliencyMask;
    public ThemeFeature themeFeature;

    public ImageInfoList() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final void setC3Feature(List<Float> list) {
        this.c3Feature = list;
    }

    public final void setFaceFeatureV2(List<FaceFeatureV2> list) {
        this.faceFeatureV2 = list;
    }

    public final void setMeta(MetaExt metaExt) {
        this.meta = metaExt;
    }

    public final void setRelationTag(List<Float> list) {
        this.relationTag = list;
    }

    public final void setSaliencyMask(List<Integer> list) {
        this.saliencyMask = list;
    }

    public final void setThemeFeature(ThemeFeature themeFeature) {
        this.themeFeature = themeFeature;
    }

    public ImageInfoList(MetaExt metaExt, List<Float> list, List<Integer> list2, List<FaceFeatureV2> list3, ThemeFeature themeFeature, List<Float> list4) {
        this.meta = metaExt;
        this.c3Feature = list;
        this.saliencyMask = list2;
        this.faceFeatureV2 = list3;
        this.themeFeature = themeFeature;
        this.relationTag = list4;
    }

    public ImageInfoList(MetaExt metaExt, List list, List list2, List list3, ThemeFeature themeFeature, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MetaExt(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null) : metaExt, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3, (i & 16) != 0 ? new ThemeFeature(null, null, 3, null) : themeFeature, (i & 32) != 0 ? C13BV.INSTANCE : list4);
    }
}
