package com.ss.android.ugc.aweme.sticker.panel.info;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectInfoPanelState extends UiState {
    public static final int $stable = 8;
    public final String creatorName;
    public final Effect effect;
    public final boolean isDiscoverVisible;
    public final boolean isFavorite;
    public final boolean isFavoriteVisible;
    public final boolean isPreviouslyVisible;
    public final boolean isReportAndBlockVisible;
    public final AbstractC194560119y ui;
    public final String userId;
    public final boolean wasVisible;

    public EffectInfoPanelState() {
        this(null, null, null, false, false, false, false, false, false, new C194561119z());
    }

    public final EffectInfoPanelState copy(Effect effect, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC194560119y abstractC194560119y) {
        return new EffectInfoPanelState(effect, str, str2, z, z2, z3, z4, z5, z6, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectInfoPanelState)) {
            return false;
        }
        EffectInfoPanelState effectInfoPanelState = (EffectInfoPanelState) obj;
        return Intrinsics.LJFF(this.effect, effectInfoPanelState.effect) && Intrinsics.LJFF(this.creatorName, effectInfoPanelState.creatorName) && Intrinsics.LJFF(this.userId, effectInfoPanelState.userId) && this.isFavorite == effectInfoPanelState.isFavorite && this.isFavoriteVisible == effectInfoPanelState.isFavoriteVisible && this.isReportAndBlockVisible == effectInfoPanelState.isReportAndBlockVisible && this.isDiscoverVisible == effectInfoPanelState.isDiscoverVisible && this.isPreviouslyVisible == effectInfoPanelState.isPreviouslyVisible && this.wasVisible == effectInfoPanelState.wasVisible && Intrinsics.LJFF(this.ui, effectInfoPanelState.ui);
    }

    public int hashCode() {
        Effect effect = this.effect;
        int iHashCode = (effect == null ? 0 : effect.hashCode()) * 31;
        String str = this.creatorName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        return ((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFavorite)) * 31) + C786410Ut5.Z2(this.isFavoriteVisible)) * 31) + C786410Ut5.Z2(this.isReportAndBlockVisible)) * 31) + C786410Ut5.Z2(this.isDiscoverVisible)) * 31) + C786410Ut5.Z2(this.isPreviouslyVisible)) * 31) + C786410Ut5.Z2(this.wasVisible)) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectInfoPanelState(effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", creatorName=");
        sbLIZ.append(this.creatorName);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", isFavorite=");
        sbLIZ.append(this.isFavorite);
        sbLIZ.append(", isFavoriteVisible=");
        sbLIZ.append(this.isFavoriteVisible);
        sbLIZ.append(", isReportAndBlockVisible=");
        sbLIZ.append(this.isReportAndBlockVisible);
        sbLIZ.append(", isDiscoverVisible=");
        sbLIZ.append(this.isDiscoverVisible);
        sbLIZ.append(", isPreviouslyVisible=");
        sbLIZ.append(this.isPreviouslyVisible);
        sbLIZ.append(", wasVisible=");
        sbLIZ.append(this.wasVisible);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCreatorName() {
        return this.creatorName;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean getWasVisible() {
        return this.wasVisible;
    }

    public final boolean isDiscoverVisible() {
        return this.isDiscoverVisible;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isFavoriteVisible() {
        return this.isFavoriteVisible;
    }

    public final boolean isPreviouslyVisible() {
        return this.isPreviouslyVisible;
    }

    public final boolean isReportAndBlockVisible() {
        return this.isReportAndBlockVisible;
    }

    public EffectInfoPanelState(Effect effect, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.effect = effect;
        this.creatorName = str;
        this.userId = str2;
        this.isFavorite = z;
        this.isFavoriteVisible = z2;
        this.isReportAndBlockVisible = z3;
        this.isDiscoverVisible = z4;
        this.isPreviouslyVisible = z5;
        this.wasVisible = z6;
        this.ui = abstractC194560119y;
    }
}
