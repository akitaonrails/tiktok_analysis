package com.bytedance.effectcreatormobile.ckeapi.api.cutout;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class CutoutResCheckFileData {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("circle")
    public final List<String> circle;

    @C09CT("eraser")
    public final List<String> eraser;

    @C09CT("painter")
    public final List<String> painter;

    @C09CT("vos_matting")
    public final List<String> vosMatting;

    @C09CT("vos_matting_blend")
    public final List<String> vosMattingBlend;

    public CutoutResCheckFileData() {
        this(null, null, null, null, null, 31, null);
    }

    public CutoutResCheckFileData(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.eraser = list;
        this.painter = list2;
        this.circle = list3;
        this.vosMatting = list4;
        this.vosMattingBlend = list5;
    }

    public CutoutResCheckFileData(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C13BV.INSTANCE : list5);
    }
}
