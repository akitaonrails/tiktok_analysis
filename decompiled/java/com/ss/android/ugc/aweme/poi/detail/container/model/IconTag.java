package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class IconTag implements Serializable {

    @C09CT("icon")
    public final DynamicIcon icon;

    @C09CT("tag_content")
    public final String tagContent;

    @C09CT("tag_id")
    public final String tagId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconTag(tagContent=");
        sbLIZ.append(this.tagContent);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", tagId=");
        sbLIZ.append(this.tagId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        String str = this.tagContent;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IconTag) || !Intrinsics.LJFF(this.tagContent, ((IconTag) obj).tagContent)) {
            return false;
        }
        return true;
    }

    public IconTag(String str, DynamicIcon dynamicIcon, String str2) {
        this.tagContent = str;
        this.icon = dynamicIcon;
        this.tagId = str2;
    }
}
