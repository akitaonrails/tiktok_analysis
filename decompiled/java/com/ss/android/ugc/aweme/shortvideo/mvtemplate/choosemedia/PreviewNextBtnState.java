package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PreviewNextBtnState implements C004I {
    public static final int $stable = 0;
    public final boolean isClickable;
    public final String text;

    public PreviewNextBtnState() {
        this(null, false);
    }

    public final PreviewNextBtnState copy(String str, boolean z) {
        return new PreviewNextBtnState(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewNextBtnState)) {
            return false;
        }
        PreviewNextBtnState previewNextBtnState = (PreviewNextBtnState) obj;
        return Intrinsics.LJFF(this.text, previewNextBtnState.text) && this.isClickable == previewNextBtnState.isClickable;
    }

    public int hashCode() {
        String str = this.text;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isClickable);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewNextBtnState(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", isClickable=");
        sbLIZ.append(this.isClickable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isClickable() {
        return this.isClickable;
    }

    public PreviewNextBtnState(String str, boolean z) {
        this.text = str;
        this.isClickable = z;
    }
}
