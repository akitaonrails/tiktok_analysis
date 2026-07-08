package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Highlight {

    @C09CT("description")
    public final String description;

    @C09CT("image")
    public final String image;

    @C09CT("title")
    public final InteractiveTitle title;

    public Highlight() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Highlight)) {
            return false;
        }
        Highlight highlight = (Highlight) obj;
        return Intrinsics.LJFF(this.image, highlight.image) && Intrinsics.LJFF(this.title, highlight.title) && Intrinsics.LJFF(this.description, highlight.description);
    }

    public final int hashCode() {
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InteractiveTitle interactiveTitle = this.title;
        int iHashCode2 = (iHashCode + (interactiveTitle == null ? 0 : interactiveTitle.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Highlight(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Highlight(String str, InteractiveTitle interactiveTitle, String str2) {
        this.image = str;
        this.title = interactiveTitle;
        this.description = str2;
    }
}
