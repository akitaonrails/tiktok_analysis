package com.bytedance.creativex.recorder.filter.panel;

import X.AbstractC194560119y;
import X.C1641840spK;
import X.C2188811AlT;
import X.C529150Kp7;
import X.C786410Ut5;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FilterPanelState extends UiState {
    public final C1641840spK data;
    public final boolean disableFilter;
    public final C529150Kp7 enterFilterBoxEvent;
    public final Pair<String, String> pendingSelected;
    public final FilterBean selectedFilter;
    public final AbstractC194560119y ui;

    public final FilterPanelState copy(AbstractC194560119y abstractC194560119y, FilterBean filterBean, boolean z, C1641840spK c1641840spK, C529150Kp7 c529150Kp7, Pair<String, String> pair) {
        return new FilterPanelState(abstractC194560119y, filterBean, z, c1641840spK, c529150Kp7, pair);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterPanelState)) {
            return false;
        }
        FilterPanelState filterPanelState = (FilterPanelState) obj;
        return Intrinsics.LJFF(this.ui, filterPanelState.ui) && Intrinsics.LJFF(this.selectedFilter, filterPanelState.selectedFilter) && this.disableFilter == filterPanelState.disableFilter && Intrinsics.LJFF(this.data, filterPanelState.data) && Intrinsics.LJFF(this.enterFilterBoxEvent, filterPanelState.enterFilterBoxEvent) && Intrinsics.LJFF(this.pendingSelected, filterPanelState.pendingSelected);
    }

    public int hashCode() {
        int iHashCode = this.ui.hashCode() * 31;
        FilterBean filterBean = this.selectedFilter;
        int iHashCode2 = (((((iHashCode + (filterBean == null ? 0 : filterBean.hashCode())) * 31) + C786410Ut5.Z2(this.disableFilter)) * 31) + this.data.hashCode()) * 31;
        C529150Kp7 c529150Kp7 = this.enterFilterBoxEvent;
        return ((iHashCode2 + (c529150Kp7 != null ? c529150Kp7.hashCode() : 0)) * 31) + this.pendingSelected.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterPanelState(ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(", selectedFilter=");
        sbLIZ.append(this.selectedFilter);
        sbLIZ.append(", disableFilter=");
        sbLIZ.append(this.disableFilter);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", enterFilterBoxEvent=");
        sbLIZ.append(this.enterFilterBoxEvent);
        sbLIZ.append(", pendingSelected=");
        sbLIZ.append(this.pendingSelected);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1641840spK getData() {
        return this.data;
    }

    public final boolean getDisableFilter() {
        return this.disableFilter;
    }

    public final C529150Kp7 getEnterFilterBoxEvent() {
        return this.enterFilterBoxEvent;
    }

    public final Pair<String, String> getPendingSelected() {
        return this.pendingSelected;
    }

    public final FilterBean getSelectedFilter() {
        return this.selectedFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public FilterPanelState(AbstractC194560119y abstractC194560119y, FilterBean filterBean, boolean z, C1641840spK c1641840spK, C529150Kp7 c529150Kp7, Pair<String, String> pair) {
        super(abstractC194560119y);
        this.ui = abstractC194560119y;
        this.selectedFilter = filterBean;
        this.disableFilter = z;
        this.data = c1641840spK;
        this.enterFilterBoxEvent = c529150Kp7;
        this.pendingSelected = pair;
    }
}
