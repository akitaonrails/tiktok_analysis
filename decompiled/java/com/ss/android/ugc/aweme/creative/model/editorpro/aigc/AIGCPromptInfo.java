package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class AIGCPromptInfo {

    @C09CT("ratio")
    public final String aspectRatio;

    @C09CT("duration")
    public final int duration;

    @C09CT("images")
    public final List<ImageInfo> images;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("type")
    public final String type;

    public AIGCPromptInfo() {
        this(null, null, 0, null, null, 31, null);
    }

    public AIGCPromptInfo(String str, List<ImageInfo> list, int i, String str2, String str3) {
        this.prompt = str;
        this.images = list;
        this.duration = i;
        this.aspectRatio = str2;
        this.type = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AIGCPromptInfo(String str, List list, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = str3;
        int i3 = i;
        List list2 = list;
        String str5 = (i2 & 1) != 0 ? "" : str;
        list2 = (i2 & 2) != 0 ? C13BV.INSTANCE : list2;
        i3 = (i2 & 4) != 0 ? 0 : i3;
        String str6 = (i2 & 8) == 0 ? str2 : "";
        if ((i2 & 16) != 0) {
            if (list2.isEmpty()) {
                str4 = "t2v";
            } else if (list2.size() == 1) {
                str4 = "i2v";
            } else {
                str4 = "fl2v";
            }
        }
        this(str5, list2, i3, str6, str4);
    }
}
