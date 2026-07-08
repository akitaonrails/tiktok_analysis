package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class EmphasisParam {

    @C09CT("range")
    public List<Integer> range;

    @C09CT("repeatStyle")
    public String repeatStyle;

    @C09CT("text_emphasis_id")
    public String textEmphasisId;

    @C09CT("text_emphasis_path")
    public String textEmphasisPath;

    @C09CT("style")
    public EmphasisStyle textEmphasisStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public EmphasisParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public EmphasisParam(List<Integer> list, String str, String str2, EmphasisStyle emphasisStyle, String str3) {
        this.range = list;
        this.textEmphasisId = str;
        this.textEmphasisPath = str2;
        this.textEmphasisStyle = emphasisStyle;
        this.repeatStyle = str3;
    }

    public /* synthetic */ EmphasisParam(List list, String str, String str2, EmphasisStyle emphasisStyle, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : emphasisStyle, (i & 16) == 0 ? str3 : null);
    }
}
