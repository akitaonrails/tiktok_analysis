package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class EmphasisStyle {

    @C09CT("center_y")
    public String centerY;

    @C09CT("color")
    public List<Float> color;

    @C09CT("height")
    public String height;

    @C09CT("offset")
    public List<Float> offset;

    @C09CT("offset_height_scale")
    public List<Float> offsetHeightStyle;

    @C09CT("scale")
    public List<Float> scale;

    @C09CT("stroke_cap")
    public String strokeCap;

    @C09CT("stroke_join")
    public String strokeJoin;

    @C09CT("stroke_width")
    public Float strokeWidth;

    /* JADX WARN: Multi-variable type inference failed */
    public EmphasisStyle() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public EmphasisStyle(List<Float> list, Float f, List<Float> list2, List<Float> list3, String str, String str2, List<Float> list4, String str3, String str4) {
        this.color = list;
        this.strokeWidth = f;
        this.offset = list2;
        this.scale = list3;
        this.centerY = str;
        this.height = str2;
        this.offsetHeightStyle = list4;
        this.strokeCap = str3;
        this.strokeJoin = str4;
    }

    public /* synthetic */ EmphasisStyle(List list, Float f, List list2, List list3, String str, String str2, List list4, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : str3, (i & 256) == 0 ? str4 : null);
    }
}
