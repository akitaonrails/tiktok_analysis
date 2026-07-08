package com.ss.android.ugc.aweme.shortvideo.effectdiscover;

import X.AbstractC1638880skY;
import X.AbstractC194560119y;
import X.C1638920skc;
import X.C194561119z;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectDiscoverPanelState extends UiState {
    public static final int $stable = 8;
    public final boolean emptySearchString;
    public final String searchKeyWord;
    public final AbstractC1638880skY searchState;
    public final AbstractC194560119y ui;

    public final EffectDiscoverPanelState copy(AbstractC1638880skY abstractC1638880skY, boolean z, String str, AbstractC194560119y abstractC194560119y) {
        return new EffectDiscoverPanelState(abstractC1638880skY, z, str, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectDiscoverPanelState)) {
            return false;
        }
        EffectDiscoverPanelState effectDiscoverPanelState = (EffectDiscoverPanelState) obj;
        return Intrinsics.LJFF(this.searchState, effectDiscoverPanelState.searchState) && this.emptySearchString == effectDiscoverPanelState.emptySearchString && Intrinsics.LJFF(this.searchKeyWord, effectDiscoverPanelState.searchKeyWord) && Intrinsics.LJFF(this.ui, effectDiscoverPanelState.ui);
    }

    public int hashCode() {
        return (((((this.searchState.hashCode() * 31) + C786410Ut5.Z2(this.emptySearchString)) * 31) + this.searchKeyWord.hashCode()) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectDiscoverPanelState(searchState=");
        sbLIZ.append(this.searchState);
        sbLIZ.append(", emptySearchString=");
        sbLIZ.append(this.emptySearchString);
        sbLIZ.append(", searchKeyWord=");
        sbLIZ.append(this.searchKeyWord);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EffectDiscoverPanelState() {
        this(C1638920skc.LIZ, true, "", new C194561119z());
    }

    public final boolean getEmptySearchString() {
        return this.emptySearchString;
    }

    public final String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public final AbstractC1638880skY getSearchState() {
        return this.searchState;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public EffectDiscoverPanelState(AbstractC1638880skY abstractC1638880skY, boolean z, String str, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.searchState = abstractC1638880skY;
        this.emptySearchString = z;
        this.searchKeyWord = str;
        this.ui = abstractC194560119y;
    }
}
