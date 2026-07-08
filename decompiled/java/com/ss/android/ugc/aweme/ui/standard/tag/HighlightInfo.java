package com.ss.android.ugc.aweme.ui.standard.tag;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("icon")
    public final DynamicIcon icon;

    @C09CT("tag_content")
    public final CharSequence tagContent;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightInfo)) {
            return false;
        }
        HighlightInfo highlightInfo = (HighlightInfo) obj;
        return Intrinsics.LJFF(this.tagContent, highlightInfo.tagContent) && Intrinsics.LJFF(this.icon, highlightInfo.icon);
    }

    public int hashCode() {
        CharSequence charSequence = this.tagContent;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        DynamicIcon dynamicIcon = this.icon;
        return iHashCode + (dynamicIcon != null ? dynamicIcon.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightInfo(tagContent=");
        sbLIZ.append((Object) this.tagContent);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HighlightInfo(CharSequence charSequence, DynamicIcon dynamicIcon) {
        this.tagContent = charSequence;
        this.icon = dynamicIcon;
    }
}
