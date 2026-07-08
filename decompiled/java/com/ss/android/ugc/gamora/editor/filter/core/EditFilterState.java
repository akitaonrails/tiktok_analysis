package com.ss.android.ugc.gamora.editor.filter.core;

import X.AbstractC194560119y;
import X.C0LCS;
import X.C1453000nuk;
import X.C1644450stX;
import X.C194561119z;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C529130Kp5;
import X.C529150Kp7;
import X.InterfaceC1461390o8H;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class EditFilterState extends UiState {
    public final C529150Kp7 cancelStatus;
    public final C0LCS<C1453000nuk> curFilter;
    public final Map<EffectCategoryResponse, List<FilterBean>> data;
    public final InterfaceC1461390o8H gestureService;
    public final C1644450stX<Boolean, Boolean> panelShow;
    public final C529150Kp7 photoEditorHidePanel;
    public final C529130Kp5 switchFilter;
    public final AbstractC194560119y ui;
    public final C529150Kp7 unRegisterGestureService;

    public EditFilterState() {
        this(null, null, new C0LCS(null), null, null, C2097608Jq.LJ(), null, null, new C194561119z());
    }

    public final EditFilterState copy(C1644450stX<Boolean, Boolean> c1644450stX, C529150Kp7 c529150Kp7, C0LCS<C1453000nuk> c0lcs, C529150Kp7 c529150Kp72, C529130Kp5 c529130Kp5, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, InterfaceC1461390o8H interfaceC1461390o8H, C529150Kp7 c529150Kp73, AbstractC194560119y abstractC194560119y) {
        return new EditFilterState(c1644450stX, c529150Kp7, c0lcs, c529150Kp72, c529130Kp5, map, interfaceC1461390o8H, c529150Kp73, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFilterState)) {
            return false;
        }
        EditFilterState editFilterState = (EditFilterState) obj;
        return Intrinsics.LJFF(this.panelShow, editFilterState.panelShow) && Intrinsics.LJFF(this.photoEditorHidePanel, editFilterState.photoEditorHidePanel) && Intrinsics.LJFF(this.curFilter, editFilterState.curFilter) && Intrinsics.LJFF(this.cancelStatus, editFilterState.cancelStatus) && Intrinsics.LJFF(this.switchFilter, editFilterState.switchFilter) && Intrinsics.LJFF(this.data, editFilterState.data) && Intrinsics.LJFF(this.gestureService, editFilterState.gestureService) && Intrinsics.LJFF(this.unRegisterGestureService, editFilterState.unRegisterGestureService) && Intrinsics.LJFF(this.ui, editFilterState.ui);
    }

    public int hashCode() {
        C1644450stX<Boolean, Boolean> c1644450stX = this.panelShow;
        int iHashCode = (c1644450stX == null ? 0 : c1644450stX.hashCode()) * 31;
        C529150Kp7 c529150Kp7 = this.photoEditorHidePanel;
        int iHashCode2 = (((iHashCode + (c529150Kp7 == null ? 0 : c529150Kp7.hashCode())) * 31) + this.curFilter.hashCode()) * 31;
        C529150Kp7 c529150Kp72 = this.cancelStatus;
        int iHashCode3 = (iHashCode2 + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C529130Kp5 c529130Kp5 = this.switchFilter;
        int iHashCode4 = (((iHashCode3 + (c529130Kp5 == null ? 0 : c529130Kp5.hashCode())) * 31) + this.data.hashCode()) * 31;
        InterfaceC1461390o8H interfaceC1461390o8H = this.gestureService;
        int iHashCode5 = (iHashCode4 + (interfaceC1461390o8H == null ? 0 : interfaceC1461390o8H.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.unRegisterGestureService;
        return ((iHashCode5 + (c529150Kp73 != null ? c529150Kp73.hashCode() : 0)) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditFilterState(panelShow=");
        sbLIZ.append(this.panelShow);
        sbLIZ.append(", photoEditorHidePanel=");
        sbLIZ.append(this.photoEditorHidePanel);
        sbLIZ.append(", curFilter=");
        sbLIZ.append(this.curFilter);
        sbLIZ.append(", cancelStatus=");
        sbLIZ.append(this.cancelStatus);
        sbLIZ.append(", switchFilter=");
        sbLIZ.append(this.switchFilter);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", gestureService=");
        sbLIZ.append(this.gestureService);
        sbLIZ.append(", unRegisterGestureService=");
        sbLIZ.append(this.unRegisterGestureService);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getCancelStatus() {
        return this.cancelStatus;
    }

    public final C0LCS<C1453000nuk> getCurFilter() {
        return this.curFilter;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final InterfaceC1461390o8H getGestureService() {
        return this.gestureService;
    }

    public final C1644450stX<Boolean, Boolean> getPanelShow() {
        return this.panelShow;
    }

    public final C529150Kp7 getPhotoEditorHidePanel() {
        return this.photoEditorHidePanel;
    }

    public final C529130Kp5 getSwitchFilter() {
        return this.switchFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final C529150Kp7 getUnRegisterGestureService() {
        return this.unRegisterGestureService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditFilterState(C1644450stX<Boolean, Boolean> c1644450stX, C529150Kp7 c529150Kp7, C0LCS<C1453000nuk> c0lcs, C529150Kp7 c529150Kp72, C529130Kp5 c529130Kp5, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, InterfaceC1461390o8H interfaceC1461390o8H, C529150Kp7 c529150Kp73, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.panelShow = c1644450stX;
        this.photoEditorHidePanel = c529150Kp7;
        this.curFilter = c0lcs;
        this.cancelStatus = c529150Kp72;
        this.switchFilter = c529130Kp5;
        this.data = map;
        this.gestureService = interfaceC1461390o8H;
        this.unRegisterGestureService = c529150Kp73;
        this.ui = abstractC194560119y;
    }
}
