package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ComboSubSkuExpression {
    public static final int $stable = 8;

    @C09CT("combo_panel_title")
    public String comboPanelTitle;

    @C09CT("combo_sku_infos")
    public List<ComboSkuInfo> comboSkuInfos;

    @C09CT("combo_title")
    public String comboTitle;

    public ComboSubSkuExpression() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboSubSkuExpression)) {
            return false;
        }
        ComboSubSkuExpression comboSubSkuExpression = (ComboSubSkuExpression) obj;
        return Intrinsics.LJFF(this.comboTitle, comboSubSkuExpression.comboTitle) && Intrinsics.LJFF(this.comboPanelTitle, comboSubSkuExpression.comboPanelTitle) && Intrinsics.LJFF(this.comboSkuInfos, comboSubSkuExpression.comboSkuInfos);
    }

    public int hashCode() {
        String str = this.comboTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.comboPanelTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ComboSkuInfo> list = this.comboSkuInfos;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComboSubSkuExpression(comboTitle=");
        sbLIZ.append(this.comboTitle);
        sbLIZ.append(", comboPanelTitle=");
        sbLIZ.append(this.comboPanelTitle);
        sbLIZ.append(", comboSkuInfos=");
        sbLIZ.append(this.comboSkuInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ComboSubSkuExpression(String str, String str2, List<ComboSkuInfo> list) {
        this.comboTitle = str;
        this.comboPanelTitle = str2;
        this.comboSkuInfos = list;
    }
}
