package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class OrderEntranceType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ OrderEntranceType[] $VALUES;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final OrderEntranceType UNKNOWN = new OrderEntranceType("UNKNOWN", 0);

    @C09CT("1")
    public static final OrderEntranceType OPEN = new OrderEntranceType("OPEN", 1);

    @C09CT("2")
    public static final OrderEntranceType CLOSE = new OrderEntranceType("CLOSE", 2);

    public static final /* synthetic */ OrderEntranceType[] $values() {
        return new OrderEntranceType[]{UNKNOWN, OPEN, CLOSE};
    }

    public static InterfaceC2044707zh<OrderEntranceType> getEntries() {
        return $ENTRIES;
    }

    static {
        OrderEntranceType[] orderEntranceTypeArr$values = $values();
        $VALUES = orderEntranceTypeArr$values;
        $ENTRIES = new C2254308sP(orderEntranceTypeArr$values);
    }

    public static OrderEntranceType[] values() {
        return (OrderEntranceType[]) $VALUES.clone();
    }

    public static OrderEntranceType valueOf(String str) {
        return (OrderEntranceType) C08FF.LIZ(OrderEntranceType.class, str);
    }

    public OrderEntranceType(String str, int i) {
    }
}
