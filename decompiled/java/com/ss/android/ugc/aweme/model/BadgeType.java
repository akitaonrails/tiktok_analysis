package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class BadgeType {

    @C09CT("1")
    public static final BadgeType HEAT_SCORE;
    public static final /* synthetic */ BadgeType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final BadgeType NUM_WATCHED;

    public static InterfaceC2044707zh<BadgeType> getEntries() {
        return LLILLJJLI;
    }

    static {
        BadgeType badgeType = new BadgeType("NUM_WATCHED", 0);
        NUM_WATCHED = badgeType;
        BadgeType badgeType2 = new BadgeType("HEAT_SCORE", 1);
        HEAT_SCORE = badgeType2;
        BadgeType[] badgeTypeArr = {badgeType, badgeType2};
        LL = badgeTypeArr;
        LLILLJJLI = new C2254308sP(badgeTypeArr);
    }

    public static BadgeType[] values() {
        return (BadgeType[]) LL.clone();
    }

    public static BadgeType valueOf(String str) {
        return (BadgeType) C08FF.LIZ(BadgeType.class, str);
    }

    public BadgeType(String str, int i) {
    }
}
