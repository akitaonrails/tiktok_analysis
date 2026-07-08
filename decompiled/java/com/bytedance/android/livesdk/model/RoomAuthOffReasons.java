package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.EnumC1090760eUU;

/* JADX INFO: loaded from: classes.dex */
public class RoomAuthOffReasons {

    @C09CT("gift")
    public String gift;

    @C09CT("gift_off_reason")
    public int unAvailableClickReason;

    public EnumC1090760eUU getUnAvailableClickReason() {
        return EnumC1090760eUU.parseEnum(this.unAvailableClickReason);
    }

    public String getGift() {
        return this.gift;
    }
}
