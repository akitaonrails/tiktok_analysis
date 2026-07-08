package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CarouselItem extends BaseWidgetDO {

    @C09CT("card_list")
    public final List<CardDO> cardList;

    public CarouselItem() {
        this(null);
    }

    public final CarouselItem copy(List<CardDO> list) {
        return new CarouselItem(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarouselItem) && Intrinsics.LJFF(this.cardList, ((CarouselItem) obj).cardList);
    }

    public int hashCode() {
        List<CardDO> list = this.cardList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselItem(cardList=");
        sbLIZ.append(this.cardList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<CardDO> getCardList() {
        return this.cardList;
    }

    public CarouselItem(List<CardDO> list) {
        super(null, null, 1, null, null);
        this.cardList = list;
    }
}
