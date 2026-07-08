package com.ss.android.ugc.aweme.poi.search.data;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchFilterDataItem implements InterfaceC1891350zJl {

    @C09CT("filter_id")
    public final String filterId;

    @C09CT("is_selected")
    public final boolean isSelected;

    @C09CT("need_cache_state")
    public final boolean needCacheState;

    @C09CT("text")
    public final String text;

    public PoiSearchFilterDataItem() {
        this(null, null, false, false);
    }

    public final PoiSearchFilterDataItem copy(String str, String str2, boolean z, boolean z2) {
        return new PoiSearchFilterDataItem(str, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiSearchFilterDataItem)) {
            return false;
        }
        PoiSearchFilterDataItem poiSearchFilterDataItem = (PoiSearchFilterDataItem) obj;
        return Intrinsics.LJFF(this.text, poiSearchFilterDataItem.text) && Intrinsics.LJFF(this.filterId, poiSearchFilterDataItem.filterId) && this.needCacheState == poiSearchFilterDataItem.needCacheState && this.isSelected == poiSearchFilterDataItem.isSelected;
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.filterId;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.needCacheState)) * 31) + C786410Ut5.Z2(this.isSelected);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchFilterDataItem(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", filterId=");
        sbLIZ.append(this.filterId);
        sbLIZ.append(", needCacheState=");
        sbLIZ.append(this.needCacheState);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final boolean getNeedCacheState() {
        return this.needCacheState;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public PoiSearchFilterDataItem(String str, String str2, boolean z, boolean z2) {
        this.text = str;
        this.filterId = str2;
        this.needCacheState = z;
        this.isSelected = z2;
    }
}
