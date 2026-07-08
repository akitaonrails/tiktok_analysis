package com.ss.android.ugc.aweme.editorpro.toolbanner;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MAEDraftItemData {

    @C09CT("index")
    public final String index;

    @C09CT("template_name")
    public final String templateName;

    @C09CT("video_type")
    public final String videoType;

    @C09CT("zip_url")
    public final String zipUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MAEDraftItemData)) {
            return false;
        }
        MAEDraftItemData mAEDraftItemData = (MAEDraftItemData) obj;
        return Intrinsics.LJFF(this.templateName, mAEDraftItemData.templateName) && Intrinsics.LJFF(this.zipUrl, mAEDraftItemData.zipUrl) && Intrinsics.LJFF(this.index, mAEDraftItemData.index) && Intrinsics.LJFF(this.videoType, mAEDraftItemData.videoType);
    }

    public final int hashCode() {
        String str = this.templateName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.zipUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.index;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MAEDraftItemData(templateName=");
        sbLIZ.append(this.templateName);
        sbLIZ.append(", zipUrl=");
        sbLIZ.append(this.zipUrl);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", videoType=");
        sbLIZ.append(this.videoType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MAEDraftItemData(String str, String str2, String str3, String str4) {
        this.templateName = str;
        this.zipUrl = str2;
        this.index = str3;
        this.videoType = str4;
    }
}
