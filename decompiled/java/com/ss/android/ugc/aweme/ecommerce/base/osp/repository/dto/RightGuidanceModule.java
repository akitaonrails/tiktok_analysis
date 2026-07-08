package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RightGuidanceModule {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("background_dark_color")
    public String backgroundDarkColor;

    @C09CT("content")
    public ECRichText content;

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public ECRichText title;

    @C09CT("type")
    public Integer type;

    public RightGuidanceModule() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RightGuidanceModule)) {
            return false;
        }
        RightGuidanceModule rightGuidanceModule = (RightGuidanceModule) obj;
        return Intrinsics.LJFF(this.title, rightGuidanceModule.title) && Intrinsics.LJFF(this.content, rightGuidanceModule.content) && Intrinsics.LJFF(this.backgroundColor, rightGuidanceModule.backgroundColor) && Intrinsics.LJFF(this.backgroundDarkColor, rightGuidanceModule.backgroundDarkColor) && Intrinsics.LJFF(this.schema, rightGuidanceModule.schema) && Intrinsics.LJFF(this.type, rightGuidanceModule.type);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.content;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        String str = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundDarkColor;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightGuidanceModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", backgroundDarkColor=");
        sbLIZ.append(this.backgroundDarkColor);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RightGuidanceModule(ECRichText eCRichText, ECRichText eCRichText2, String str, String str2, String str3, Integer num) {
        this.title = eCRichText;
        this.content = eCRichText2;
        this.backgroundColor = str;
        this.backgroundDarkColor = str2;
        this.schema = str3;
        this.type = num;
    }
}
