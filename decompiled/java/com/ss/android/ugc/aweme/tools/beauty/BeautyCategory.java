package com.ss.android.ugc.aweme.tools.beauty;

import X.C13LP;
import X.C19730012Hi;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class BeautyCategory {
    public final BeautyCategoryExtra beautyCategoryExtra;
    public final List<ComposerBeauty> beautyList;
    public final EffectCategoryResponse categoryResponse;
    public boolean selected;

    public int hashCode() {
        String id = this.categoryResponse.getId();
        return id != null ? id.hashCode() : this.categoryResponse.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautyCategory(category={id:");
        sbLIZ.append(this.categoryResponse.getId());
        sbLIZ.append(",name:");
        sbLIZ.append(this.categoryResponse.getName());
        sbLIZ.append(",key:");
        sbLIZ.append(this.categoryResponse.getKey());
        sbLIZ.append("}, extra={abGroup:");
        sbLIZ.append(this.beautyCategoryExtra.abGroup);
        sbLIZ.append(",panel_type:");
        sbLIZ.append(this.beautyCategoryExtra.panelType);
        sbLIZ.append("}, beautyList=[");
        sbLIZ.append(C13LP.LJJLIIIJ(this.beautyList, ",", null, null, 0, null, AFwS273S0000000_29.get$arr$(186), 30));
        sbLIZ.append("], )");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final BeautyCategoryExtra getBeautyCategoryExtra() {
        return this.beautyCategoryExtra;
    }

    public final List<ComposerBeauty> getBeautyList() {
        return this.beautyList;
    }

    public final EffectCategoryResponse getCategoryResponse() {
        return this.categoryResponse;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BeautyCategory)) {
            return false;
        }
        if (C19730012Hi.LIZ.LIZ()) {
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (Intrinsics.LJFF(beautyCategory.categoryResponse.getId(), this.categoryResponse.getId()) && Intrinsics.LJFF(beautyCategory.beautyList, this.beautyList)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(((BeautyCategory) obj).categoryResponse.getId(), this.categoryResponse.getId());
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra, List<ComposerBeauty> list, boolean z) {
        this.categoryResponse = effectCategoryResponse;
        this.beautyCategoryExtra = beautyCategoryExtra;
        this.beautyList = list;
        this.selected = z;
    }
}
