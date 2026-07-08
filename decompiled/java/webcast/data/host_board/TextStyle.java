package webcast.data.host_board;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TextStyle {

    @C09CT("text_font")
    public String textFont = "";

    @C09CT("text_color")
    public String textColor = "";

    public final int hashCode() {
        return (this.textFont.hashCode() * 31) + this.textColor.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(TextStyle.class, cls)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        if (Intrinsics.LJFF(this.textFont, textStyle.textFont) && Intrinsics.LJFF(this.textColor, textStyle.textColor)) {
            return true;
        }
        return false;
    }
}
