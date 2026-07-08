package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AddressJumpType {

    @C09CT("1")
    public static final AddressJumpType ADDRESS_EDIT;

    @C09CT("2")
    public static final AddressJumpType ADDRESS_LIST;
    public static final /* synthetic */ AddressJumpType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<AddressJumpType> getEntries() {
        return LLILLJJLI;
    }

    static {
        AddressJumpType addressJumpType = new AddressJumpType("ADDRESS_EDIT", 0);
        ADDRESS_EDIT = addressJumpType;
        AddressJumpType addressJumpType2 = new AddressJumpType("ADDRESS_LIST", 1);
        ADDRESS_LIST = addressJumpType2;
        AddressJumpType[] addressJumpTypeArr = {addressJumpType, addressJumpType2};
        LL = addressJumpTypeArr;
        LLILLJJLI = new C2254308sP(addressJumpTypeArr);
    }

    public static AddressJumpType[] values() {
        return (AddressJumpType[]) LL.clone();
    }

    public static AddressJumpType valueOf(String str) {
        return (AddressJumpType) C08FF.LIZ(AddressJumpType.class, str);
    }

    public AddressJumpType(String str, int i) {
    }
}
