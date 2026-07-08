package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ActionSheetDO extends BaseWidgetDO {

    @C09CT("background")
    public final BackgroundDO background;

    @C09CT("card_list")
    public final List<CardDO> cardList;

    @C09CT("cancel_touch_outside")
    public final Integer dismissible;

    @C09CT("has_overlay")
    public final Integer hasOverlay;

    @C09CT("header")
    public final CardDO header;

    @C09CT("height")
    public final String height;

    @C09CT("theme")
    public final String theme;

    public ActionSheetDO() {
        this(null, null, null, null, null, null, null);
    }

    public final ActionSheetDO copy(BackgroundDO backgroundDO, CardDO cardDO, String str, Integer num, List<CardDO> list, Integer num2, String str2) {
        return new ActionSheetDO(backgroundDO, cardDO, str, num, list, num2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSheetDO)) {
            return false;
        }
        ActionSheetDO actionSheetDO = (ActionSheetDO) obj;
        return Intrinsics.LJFF(this.background, actionSheetDO.background) && Intrinsics.LJFF(this.header, actionSheetDO.header) && Intrinsics.LJFF(this.height, actionSheetDO.height) && Intrinsics.LJFF(this.dismissible, actionSheetDO.dismissible) && Intrinsics.LJFF(this.cardList, actionSheetDO.cardList) && Intrinsics.LJFF(this.hasOverlay, actionSheetDO.hasOverlay) && Intrinsics.LJFF(this.theme, actionSheetDO.theme);
    }

    public int hashCode() {
        BackgroundDO backgroundDO = this.background;
        int iHashCode = (backgroundDO == null ? 0 : backgroundDO.hashCode()) * 31;
        CardDO cardDO = this.header;
        int iHashCode2 = (iHashCode + (cardDO == null ? 0 : cardDO.hashCode())) * 31;
        String str = this.height;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.dismissible;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<CardDO> list = this.cardList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.hasOverlay;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.theme;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionSheetDO(background=");
        sbLIZ.append(this.background);
        sbLIZ.append(", header=");
        sbLIZ.append(this.header);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", dismissible=");
        sbLIZ.append(this.dismissible);
        sbLIZ.append(", cardList=");
        sbLIZ.append(this.cardList);
        sbLIZ.append(", hasOverlay=");
        sbLIZ.append(this.hasOverlay);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.theme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final BackgroundDO getBackground() {
        return this.background;
    }

    public final List<CardDO> getCardList() {
        return this.cardList;
    }

    public final Integer getDismissible() {
        return this.dismissible;
    }

    public final Integer getHasOverlay() {
        return this.hasOverlay;
    }

    public final CardDO getHeader() {
        return this.header;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getTheme() {
        return this.theme;
    }

    public ActionSheetDO(BackgroundDO backgroundDO, CardDO cardDO, String str, Integer num, List<CardDO> list, Integer num2, String str2) {
        super(null, null, 1, null, null);
        this.background = backgroundDO;
        this.header = cardDO;
        this.height = str;
        this.dismissible = num;
        this.cardList = list;
        this.hasOverlay = num2;
        this.theme = str2;
    }
}
