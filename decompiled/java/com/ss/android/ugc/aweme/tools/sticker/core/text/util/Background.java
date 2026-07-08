package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class Background {

    @C09CT("alpha")
    public Float alpha;

    @C09CT("color")
    public List<Float> color;

    @C09CT("enable")
    public Boolean enable;

    @C09CT("expandScale")
    public List<Float> expandScale;

    @C09CT("offsetScale")
    public List<Float> offsetScale;

    @C09CT("renderType")
    public String renderType;

    @C09CT("roundnessScale")
    public Float roundnessScale;

    @C09CT("solidColor")
    public List<Float> solidColor;

    /* JADX WARN: Multi-variable type inference failed */
    public Background() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public Background(Float f, Boolean bool, List<Float> list, List<Float> list2, String str, Float f2, List<Float> list3, List<Float> list4) {
        this.alpha = f;
        this.enable = bool;
        this.expandScale = list;
        this.offsetScale = list2;
        this.renderType = str;
        this.roundnessScale = f2;
        this.solidColor = list3;
        this.color = list4;
    }

    public /* synthetic */ Background(Float f, Boolean bool, List list, List list2, String str, Float f2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : f2, (i & 64) != 0 ? null : list3, (i & 128) == 0 ? list4 : null);
    }
}
