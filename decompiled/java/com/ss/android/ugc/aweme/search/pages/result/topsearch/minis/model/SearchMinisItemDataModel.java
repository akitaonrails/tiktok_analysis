package com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.discover.model.SearchMinisItem;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisItemDataModel implements Serializable, InterfaceC1891350zJl {
    public static final int $stable = 8;

    @C09CT("etParams")
    public final HashMap<String, String> etParams;

    @C09CT("isInDetailsPage")
    public final boolean isInDetailsPage;

    @C09CT("item_rank")
    public final String itemRank;

    @C09CT("minis")
    public final SearchMinisItem minis;

    @C09CT("card_text_button")
    public final String minisButtonText;

    @C09CT("card_text_recent")
    public final String minisRecentText;

    public SearchMinisItemDataModel() {
        this(new SearchMinisItem(null, null, null, null, null, null, null), null, null, null, false, null);
    }

    public final SearchMinisItemDataModel copy(SearchMinisItem searchMinisItem, String str, String str2, HashMap<String, String> map, boolean z, String str3) {
        return new SearchMinisItemDataModel(searchMinisItem, str, str2, map, z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMinisItemDataModel)) {
            return false;
        }
        SearchMinisItemDataModel searchMinisItemDataModel = (SearchMinisItemDataModel) obj;
        return Intrinsics.LJFF(this.minis, searchMinisItemDataModel.minis) && Intrinsics.LJFF(this.minisButtonText, searchMinisItemDataModel.minisButtonText) && Intrinsics.LJFF(this.minisRecentText, searchMinisItemDataModel.minisRecentText) && Intrinsics.LJFF(this.etParams, searchMinisItemDataModel.etParams) && this.isInDetailsPage == searchMinisItemDataModel.isInDetailsPage && Intrinsics.LJFF(this.itemRank, searchMinisItemDataModel.itemRank);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int iHashCode = this.minis.hashCode() * 31;
        String str = this.minisButtonText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.minisRecentText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HashMap<String, String> map = this.etParams;
        int iHashCode4 = (((iHashCode3 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.isInDetailsPage)) * 31;
        String str3 = this.itemRank;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMinisItemDataModel(minis=");
        sbLIZ.append(this.minis);
        sbLIZ.append(", minisButtonText=");
        sbLIZ.append(this.minisButtonText);
        sbLIZ.append(", minisRecentText=");
        sbLIZ.append(this.minisRecentText);
        sbLIZ.append(", etParams=");
        sbLIZ.append(this.etParams);
        sbLIZ.append(", isInDetailsPage=");
        sbLIZ.append(this.isInDetailsPage);
        sbLIZ.append(", itemRank=");
        sbLIZ.append(this.itemRank);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final HashMap<String, String> getEtParams() {
        return this.etParams;
    }

    public final String getItemRank() {
        return this.itemRank;
    }

    public final SearchMinisItem getMinis() {
        return this.minis;
    }

    public final String getMinisButtonText() {
        return this.minisButtonText;
    }

    public final String getMinisRecentText() {
        return this.minisRecentText;
    }

    public final boolean isInDetailsPage() {
        return this.isInDetailsPage;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public SearchMinisItemDataModel(SearchMinisItem searchMinisItem, String str, String str2, HashMap<String, String> map, boolean z, String str3) {
        this.minis = searchMinisItem;
        this.minisButtonText = str;
        this.minisRecentText = str2;
        this.etParams = map;
        this.isInDetailsPage = z;
        this.itemRank = str3;
    }
}
