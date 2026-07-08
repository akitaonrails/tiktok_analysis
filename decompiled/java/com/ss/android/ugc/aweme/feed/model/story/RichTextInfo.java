package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RichTextInfo implements Serializable {

    @C09CT("end")
    public int end;

    @C09CT("gradient_colors")
    public List<Integer> gradientColors;

    @C09CT("start")
    public int start;

    public RichTextInfo() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextInfo)) {
            return false;
        }
        RichTextInfo richTextInfo = (RichTextInfo) obj;
        return this.start == richTextInfo.start && this.end == richTextInfo.end && Intrinsics.LJFF(this.gradientColors, richTextInfo.gradientColors);
    }

    public int hashCode() {
        return (((this.start * 31) + this.end) * 31) + this.gradientColors.hashCode();
    }

    public RichTextInfo(int i, int i2, List<Integer> list) {
        this.start = i;
        this.end = i2;
        this.gradientColors = list;
    }
}
