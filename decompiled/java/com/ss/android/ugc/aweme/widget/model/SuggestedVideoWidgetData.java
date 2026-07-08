package com.ss.android.ugc.aweme.widget.model;

import X.C1841050y0d;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SuggestedVideoWidgetData {
    public static final C1841050y0d Companion = new Object() { // from class: X.0y0d
    };
    public final String caption;
    public final String coverUrl;
    public final String deepLink;
    public final String itemTag;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedVideoWidgetData)) {
            return false;
        }
        SuggestedVideoWidgetData suggestedVideoWidgetData = (SuggestedVideoWidgetData) obj;
        return Intrinsics.LJFF(this.caption, suggestedVideoWidgetData.caption) && Intrinsics.LJFF(this.coverUrl, suggestedVideoWidgetData.coverUrl) && Intrinsics.LJFF(this.itemTag, suggestedVideoWidgetData.itemTag) && Intrinsics.LJFF(this.deepLink, suggestedVideoWidgetData.deepLink);
    }

    public int hashCode() {
        return (((((this.caption.hashCode() * 31) + this.coverUrl.hashCode()) * 31) + this.itemTag.hashCode()) * 31) + this.deepLink.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoWidgetData(caption=");
        sbLIZ.append(this.caption);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", itemTag=");
        sbLIZ.append(this.itemTag);
        sbLIZ.append(", deepLink=");
        sbLIZ.append(this.deepLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoWidgetData() {
        this("", "", "", "");
    }

    public SuggestedVideoWidgetData(String str, String str2, String str3, String str4) {
        this.caption = str;
        this.coverUrl = str2;
        this.itemTag = str3;
        this.deepLink = str4;
    }
}
