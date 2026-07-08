package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ItemType {
    public static final /* synthetic */ ItemType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("text")
    public static final ItemType TEXT;

    @C09CT("unordered_list")
    public static final ItemType UNORDERED_LIST;

    public static InterfaceC2044707zh<ItemType> getEntries() {
        return LLILLJJLI;
    }

    static {
        ItemType itemType = new ItemType("TEXT", 0);
        TEXT = itemType;
        ItemType itemType2 = new ItemType("UNORDERED_LIST", 1);
        UNORDERED_LIST = itemType2;
        ItemType[] itemTypeArr = {itemType, itemType2};
        LL = itemTypeArr;
        LLILLJJLI = new C2254308sP(itemTypeArr);
    }

    public static ItemType[] values() {
        return (ItemType[]) LL.clone();
    }

    public static ItemType valueOf(String str) {
        return (ItemType) C08FF.LIZ(ItemType.class, str);
    }

    public ItemType(String str, int i) {
    }
}
