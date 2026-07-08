package com.ss.android.ugc.aweme.minidrama.common.component.model;

import X.C054200Hs;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MyListBannerType implements Serializable {
    public static final C054200Hs Companion;
    public static final /* synthetic */ MyListBannerType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final MyListBannerType MY_LIST_BANNER_TYPE_REVISIT;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final MyListBannerType MY_LIST_BANNER_TYPE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<MyListBannerType> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.00Hs] */
    static {
        MyListBannerType myListBannerType = new MyListBannerType("MY_LIST_BANNER_TYPE_UNKNOWN", 0, 0);
        MY_LIST_BANNER_TYPE_UNKNOWN = myListBannerType;
        MyListBannerType myListBannerType2 = new MyListBannerType("MY_LIST_BANNER_TYPE_REVISIT", 1, 1);
        MY_LIST_BANNER_TYPE_REVISIT = myListBannerType2;
        MyListBannerType[] myListBannerTypeArr = {myListBannerType, myListBannerType2};
        LLILLJJLI = myListBannerTypeArr;
        LLILLL = new C2254308sP(myListBannerTypeArr);
        Companion = new Object() { // from class: X.00Hs
        };
    }

    public static MyListBannerType[] values() {
        return (MyListBannerType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static MyListBannerType valueOf(String str) {
        return (MyListBannerType) C08FF.LIZ(MyListBannerType.class, str);
    }

    public MyListBannerType(String str, int i, int i2) {
        this.LL = i2;
    }
}
