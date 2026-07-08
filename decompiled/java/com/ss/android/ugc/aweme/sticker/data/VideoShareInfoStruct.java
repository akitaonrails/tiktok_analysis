package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoShareInfoStruct implements Serializable {

    @C09CT("original_author_id")
    public String authorId;

    @C09CT("original_author_name")
    public String authorName;

    @C09CT("original_item_id")
    public String awemeId;

    @C09CT("aweme_type")
    public int awemeType;

    @C09CT("original_index")
    public int photomodeIndex;

    @C09CT("original_sec_author_id")
    public String secAuthorId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoShareInfoStruct(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", secAuthorId=");
        sbLIZ.append(this.secAuthorId);
        sbLIZ.append(", authorName=");
        sbLIZ.append(this.authorName);
        sbLIZ.append(", photomodeIndex=");
        sbLIZ.append(this.photomodeIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoShareInfoStruct() {
        this("", 0, "", "", "", -1);
    }

    public VideoShareInfoStruct(String str, int i, String str2, String str3, String str4, int i2) {
        this.awemeId = str;
        this.awemeType = i;
        this.authorId = str2;
        this.secAuthorId = str3;
        this.authorName = str4;
        this.photomodeIndex = i2;
    }
}
