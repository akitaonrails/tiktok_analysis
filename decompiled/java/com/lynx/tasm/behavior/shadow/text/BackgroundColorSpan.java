package com.lynx.tasm.behavior.shadow.text;

/* JADX INFO: loaded from: classes7.dex */
public class BackgroundColorSpan extends android.text.style.BackgroundColorSpan {
    public final int hashCode() {
        return getBackgroundColor() + 31;
    }

    public BackgroundColorSpan(int i) {
        super(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackgroundColorSpan) || getBackgroundColor() != ((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()) {
            return false;
        }
        return true;
    }
}
