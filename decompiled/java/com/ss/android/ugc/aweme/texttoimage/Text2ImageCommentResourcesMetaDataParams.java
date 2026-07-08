package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageCommentResourcesMetaDataParams {

    @C09CT("ext")
    public String ext;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("sticker_panel")
    public String stickerPanel;

    @C09CT("sticker_path")
    public String stickerPath;

    @C09CT("version")
    public int version;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesMetaDataParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2ImageCommentResourcesMetaDataParams)) {
            return false;
        }
        Text2ImageCommentResourcesMetaDataParams text2ImageCommentResourcesMetaDataParams = (Text2ImageCommentResourcesMetaDataParams) obj;
        return Intrinsics.LJFF(this.stickerPath, text2ImageCommentResourcesMetaDataParams.stickerPath) && Intrinsics.LJFF(this.stickerPanel, text2ImageCommentResourcesMetaDataParams.stickerPanel) && Intrinsics.LJFF(this.stickerId, text2ImageCommentResourcesMetaDataParams.stickerId) && this.version == text2ImageCommentResourcesMetaDataParams.version && Intrinsics.LJFF(this.ext, text2ImageCommentResourcesMetaDataParams.ext);
    }

    public final int hashCode() {
        String str = this.stickerPath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stickerPanel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stickerId;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.version) * 31) + this.ext.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesMetaDataParams(stickerPath=");
        sbLIZ.append(this.stickerPath);
        sbLIZ.append(", stickerPanel=");
        sbLIZ.append(this.stickerPanel);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesMetaDataParams(String str, String str2, String str3, int i, String str4) {
        this.stickerPath = str;
        this.stickerPanel = str2;
        this.stickerId = str3;
        this.version = i;
        this.ext = str4;
    }

    public /* synthetic */ Text2ImageCommentResourcesMetaDataParams(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) == 0 ? str3 : null, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? "" : str4);
    }
}
