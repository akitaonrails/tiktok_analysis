package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class OptionCount {

    @C09CT("count")
    public int count;

    @C09CT("index")
    public final int index;

    @C09CT("text")
    public final String text;

    public OptionCount() {
        this(0, 0, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionCount)) {
            return false;
        }
        OptionCount optionCount = (OptionCount) obj;
        return this.index == optionCount.index && this.count == optionCount.count && Intrinsics.LJFF(this.text, optionCount.text);
    }

    public int hashCode() {
        return (((this.index * 31) + this.count) * 31) + this.text.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OptionCount(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public OptionCount(int i, int i2, String str) {
        this.index = i;
        this.count = i2;
        this.text = str;
    }
}
