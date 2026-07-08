package com.ss.android.ugc.aweme.social.creation.edit.component.filter.story;

import X.AbstractC194560119y;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class StoryEditFilterIndicatorState extends UiState {
    public static final int $stable = 8;
    public final FilterBean currentFilter;
    public final boolean isAutoUse;
    public final boolean isShowPrompt;
    public final AbstractC194560119y ui;

    public final StoryEditFilterIndicatorState copy(boolean z, boolean z2, FilterBean filterBean, AbstractC194560119y abstractC194560119y) {
        return new StoryEditFilterIndicatorState(z, z2, filterBean, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditFilterIndicatorState)) {
            return false;
        }
        StoryEditFilterIndicatorState storyEditFilterIndicatorState = (StoryEditFilterIndicatorState) obj;
        return this.isAutoUse == storyEditFilterIndicatorState.isAutoUse && this.isShowPrompt == storyEditFilterIndicatorState.isShowPrompt && Intrinsics.LJFF(this.currentFilter, storyEditFilterIndicatorState.currentFilter) && Intrinsics.LJFF(this.ui, storyEditFilterIndicatorState.ui);
    }

    public int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.isAutoUse) * 31) + C786410Ut5.Z2(this.isShowPrompt)) * 31;
        FilterBean filterBean = this.currentFilter;
        return ((iZ2 + (filterBean == null ? 0 : filterBean.hashCode())) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryEditFilterIndicatorState(isAutoUse=");
        sbLIZ.append(this.isAutoUse);
        sbLIZ.append(", isShowPrompt=");
        sbLIZ.append(this.isShowPrompt);
        sbLIZ.append(", currentFilter=");
        sbLIZ.append(this.currentFilter);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final FilterBean getCurrentFilter() {
        return this.currentFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final boolean isAutoUse() {
        return this.isAutoUse;
    }

    public final boolean isShowPrompt() {
        return this.isShowPrompt;
    }

    public StoryEditFilterIndicatorState(boolean z, boolean z2, FilterBean filterBean, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.isAutoUse = z;
        this.isShowPrompt = z2;
        this.currentFilter = filterBean;
        this.ui = abstractC194560119y;
    }
}
