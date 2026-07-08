package com.ss.android.ugc.aweme.social.creation.edit.component.filter.core.story;

import X.AbstractC194560119y;
import X.C0LCS;
import X.C194561119z;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C529130Kp5;
import X.C529150Kp7;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class StoryEditFilterState extends UiState {
    public static final int $stable = 8;
    public final C529150Kp7 cancelStatus;
    public final C0LCS<FilterBean> curFilter;
    public final Map<EffectCategoryResponse, List<FilterBean>> data;
    public final C529130Kp5 panelShow;
    public final AbstractC194560119y ui;

    public StoryEditFilterState() {
        this(null, new C0LCS(null), null, C2097608Jq.LJ(), new C194561119z());
    }

    public final StoryEditFilterState copy(C529130Kp5 c529130Kp5, C0LCS<? extends FilterBean> c0lcs, C529150Kp7 c529150Kp7, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, AbstractC194560119y abstractC194560119y) {
        return new StoryEditFilterState(c529130Kp5, c0lcs, c529150Kp7, map, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditFilterState)) {
            return false;
        }
        StoryEditFilterState storyEditFilterState = (StoryEditFilterState) obj;
        return Intrinsics.LJFF(this.panelShow, storyEditFilterState.panelShow) && Intrinsics.LJFF(this.curFilter, storyEditFilterState.curFilter) && Intrinsics.LJFF(this.cancelStatus, storyEditFilterState.cancelStatus) && Intrinsics.LJFF(this.data, storyEditFilterState.data) && Intrinsics.LJFF(this.ui, storyEditFilterState.ui);
    }

    public int hashCode() {
        C529130Kp5 c529130Kp5 = this.panelShow;
        int iHashCode = (((c529130Kp5 == null ? 0 : c529130Kp5.hashCode()) * 31) + this.curFilter.hashCode()) * 31;
        C529150Kp7 c529150Kp7 = this.cancelStatus;
        return ((((iHashCode + (c529150Kp7 != null ? c529150Kp7.hashCode() : 0)) * 31) + this.data.hashCode()) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryEditFilterState(panelShow=");
        sbLIZ.append(this.panelShow);
        sbLIZ.append(", curFilter=");
        sbLIZ.append(this.curFilter);
        sbLIZ.append(", cancelStatus=");
        sbLIZ.append(this.cancelStatus);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getCancelStatus() {
        return this.cancelStatus;
    }

    public final C0LCS<FilterBean> getCurFilter() {
        return this.curFilter;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final C529130Kp5 getPanelShow() {
        return this.panelShow;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryEditFilterState(C529130Kp5 c529130Kp5, C0LCS<? extends FilterBean> c0lcs, C529150Kp7 c529150Kp7, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.panelShow = c529130Kp5;
        this.curFilter = c0lcs;
        this.cancelStatus = c529150Kp7;
        this.data = map;
        this.ui = abstractC194560119y;
    }
}
