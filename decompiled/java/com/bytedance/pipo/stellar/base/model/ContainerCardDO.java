package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ContainerCardDO extends BaseWidgetDO {

    @C09CT("card_list")
    public final List<CardDO> cardList;

    @C09CT("card_version")
    public final String cardVersion;

    @C09CT("divider")
    public final StellarDividerDO divider;

    @C09CT("layout_param")
    public final LayoutParamDO layoutParam;

    public ContainerCardDO() {
        this(null, null, null, null);
    }

    public final ContainerCardDO copy(String str, LayoutParamDO layoutParamDO, List<CardDO> list, StellarDividerDO stellarDividerDO) {
        return new ContainerCardDO(str, layoutParamDO, list, stellarDividerDO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContainerCardDO)) {
            return false;
        }
        ContainerCardDO containerCardDO = (ContainerCardDO) obj;
        return Intrinsics.LJFF(this.cardVersion, containerCardDO.cardVersion) && Intrinsics.LJFF(this.layoutParam, containerCardDO.layoutParam) && Intrinsics.LJFF(this.cardList, containerCardDO.cardList) && Intrinsics.LJFF(this.divider, containerCardDO.divider);
    }

    public int hashCode() {
        String str = this.cardVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LayoutParamDO layoutParamDO = this.layoutParam;
        int iHashCode2 = (iHashCode + (layoutParamDO == null ? 0 : layoutParamDO.hashCode())) * 31;
        List<CardDO> list = this.cardList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        StellarDividerDO stellarDividerDO = this.divider;
        return iHashCode3 + (stellarDividerDO != null ? stellarDividerDO.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContainerCardDO(cardVersion=");
        sbLIZ.append(this.cardVersion);
        sbLIZ.append(", layoutParam=");
        sbLIZ.append(this.layoutParam);
        sbLIZ.append(", cardList=");
        sbLIZ.append(this.cardList);
        sbLIZ.append(", divider=");
        sbLIZ.append(this.divider);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<CardDO> getCardList() {
        return this.cardList;
    }

    public final String getCardVersion() {
        return this.cardVersion;
    }

    public final StellarDividerDO getDivider() {
        return this.divider;
    }

    public final LayoutParamDO getLayoutParam() {
        return this.layoutParam;
    }

    public ContainerCardDO(String str, LayoutParamDO layoutParamDO, List<CardDO> list, StellarDividerDO stellarDividerDO) {
        super(null, null, 1, null, null);
        this.cardVersion = str;
        this.layoutParam = layoutParamDO;
        this.cardList = list;
        this.divider = stellarDividerDO;
    }
}
