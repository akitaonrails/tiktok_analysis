package webcast.data.multi_guest_play;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TextHeaderMaterialInfo {

    @C09CT("color")
    public int color;

    @C09CT("stroke")
    public int stroke;

    @C09CT("text")
    public String text = "";

    @C09CT("font_name")
    public String fontName = "";

    public final int hashCode() {
        return (((((this.stroke * 31) + this.color) * 31) + this.text.hashCode()) * 31) + this.fontName.hashCode();
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
        if (!Intrinsics.LJFF(TextHeaderMaterialInfo.class, cls)) {
            return false;
        }
        TextHeaderMaterialInfo textHeaderMaterialInfo = (TextHeaderMaterialInfo) obj;
        if (this.stroke == textHeaderMaterialInfo.stroke && this.color == textHeaderMaterialInfo.color && Intrinsics.LJFF(this.text, textHeaderMaterialInfo.text) && Intrinsics.LJFF(this.fontName, textHeaderMaterialInfo.fontName)) {
            return true;
        }
        return false;
    }
}
