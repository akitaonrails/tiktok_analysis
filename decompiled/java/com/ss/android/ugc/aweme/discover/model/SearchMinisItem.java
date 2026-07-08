package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisItem implements Serializable, InterfaceC1891350zJl {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_recently_used")
    public final Boolean isRecently;

    @C09CT("minis_type")
    public final String minisType;

    @C09CT("minis_schema")
    public final String schema;

    @C09CT("description")
    public final String subtitle;

    @C09CT("name")
    public final String title;

    public SearchMinisItem() {
        this(null, null, null, null, null, null, null);
    }

    public final SearchMinisItem copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        return new SearchMinisItem(str, str2, str3, str4, str5, str6, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMinisItem)) {
            return false;
        }
        SearchMinisItem searchMinisItem = (SearchMinisItem) obj;
        return Intrinsics.LJFF(this.title, searchMinisItem.title) && Intrinsics.LJFF(this.subtitle, searchMinisItem.subtitle) && Intrinsics.LJFF(this.clientKey, searchMinisItem.clientKey) && Intrinsics.LJFF(this.iconUrl, searchMinisItem.iconUrl) && Intrinsics.LJFF(this.schema, searchMinisItem.schema) && Intrinsics.LJFF(this.minisType, searchMinisItem.minisType) && Intrinsics.LJFF(this.isRecently, searchMinisItem.isRecently);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.schema;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.minisType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isRecently;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMinisItem(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", minisType=");
        sbLIZ.append(this.minisType);
        sbLIZ.append(", isRecently=");
        sbLIZ.append(this.isRecently);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMinisType() {
        return this.minisType;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isRecently() {
        return this.isRecently;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public SearchMinisItem(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        this.title = str;
        this.subtitle = str2;
        this.clientKey = str3;
        this.iconUrl = str4;
        this.schema = str5;
        this.minisType = str6;
        this.isRecently = bool;
    }
}
