package com.lynx.tasm.behavior.shadow.text;

import android.text.style.UnderlineSpan;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUnderlineSpan extends UnderlineSpan {
    public final int hashCode() {
        return getSpanTypeId() * 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getSpanTypeId() == ((UnderlineSpan) obj).getSpanTypeId()) {
            return true;
        }
        return false;
    }
}
