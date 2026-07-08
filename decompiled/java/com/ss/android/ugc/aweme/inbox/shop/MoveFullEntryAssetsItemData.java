package com.ss.android.ugc.aweme.inbox.shop;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class MoveFullEntryAssetsItemData implements InterfaceC1891350zJl {

    @C09CT("action_area_text")
    public final String actionAreaText;

    @C09CT("content")
    public final String content;

    @C09CT("dark_icon_url")
    public final String darkIconUrl;

    @C09CT("light_icon_url")
    public final String lightIconUrl;

    @C09CT("schema_link")
    public final String schemaLink;

    public MoveFullEntryAssetsItemData() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoveFullEntryAssetsItemData)) {
            return false;
        }
        MoveFullEntryAssetsItemData moveFullEntryAssetsItemData = (MoveFullEntryAssetsItemData) obj;
        return Intrinsics.LJFF(this.content, moveFullEntryAssetsItemData.content) && Intrinsics.LJFF(this.actionAreaText, moveFullEntryAssetsItemData.actionAreaText) && Intrinsics.LJFF(this.lightIconUrl, moveFullEntryAssetsItemData.lightIconUrl) && Intrinsics.LJFF(this.darkIconUrl, moveFullEntryAssetsItemData.darkIconUrl) && Intrinsics.LJFF(this.schemaLink, moveFullEntryAssetsItemData.schemaLink);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionAreaText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lightIconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkIconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.schemaLink;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MoveFullEntryAssetsItemData(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", actionAreaText=");
        sbLIZ.append(this.actionAreaText);
        sbLIZ.append(", lightIconUrl=");
        sbLIZ.append(this.lightIconUrl);
        sbLIZ.append(", darkIconUrl=");
        sbLIZ.append(this.darkIconUrl);
        sbLIZ.append(", schemaLink=");
        sbLIZ.append(this.schemaLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public MoveFullEntryAssetsItemData(String str, String str2, String str3, String str4, String str5) {
        this.content = str;
        this.actionAreaText = str2;
        this.lightIconUrl = str3;
        this.darkIconUrl = str4;
        this.schemaLink = str5;
    }
}
