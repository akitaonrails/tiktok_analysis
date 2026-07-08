package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberShipModule {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("content")
    public ECRichText content;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("extra")
    public Map<String, String> extra;

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public ECRichText title;

    public MemberShipModule() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberShipModule)) {
            return false;
        }
        MemberShipModule memberShipModule = (MemberShipModule) obj;
        return Intrinsics.LJFF(this.title, memberShipModule.title) && Intrinsics.LJFF(this.content, memberShipModule.content) && Intrinsics.LJFF(this.buttonText, memberShipModule.buttonText) && Intrinsics.LJFF(this.schema, memberShipModule.schema) && Intrinsics.LJFF(this.extra, memberShipModule.extra) && Intrinsics.LJFF(this.daInfo, memberShipModule.daInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.content;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        String str = this.buttonText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schema;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.extra;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemberShipModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MemberShipModule(ECRichText eCRichText, ECRichText eCRichText2, String str, String str2, Map<String, String> map, String str3) {
        this.title = eCRichText;
        this.content = eCRichText2;
        this.buttonText = str;
        this.schema = str2;
        this.extra = map;
        this.daInfo = str3;
    }
}
