package com.ss.android.ugc.aweme.series.feed.model;

import X.C01GW;
import X.C08FF;
import X.C09CT;
import X.C1573670r3N;
import X.C1573700r3Q;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.appdiff.ICommonMiniDramaAppDiffProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class MyListSceneEnum {
    public static final C1573670r3N Companion;
    public static final /* synthetic */ MyListSceneEnum[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;

    @C09CT("2")
    public static final MyListSceneEnum MY_LIST_SCENE_COLLECTION_FAVOURITE;

    @C09CT("1")
    public static final MyListSceneEnum MY_LIST_SCENE_COLLECTION_HISTORY;

    @C09CT("3")
    public static final MyListSceneEnum MY_LIST_SCENE_COLLECTION_PURCHASED;
    public static final MyListSceneEnum[] VALUES;
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<MyListSceneEnum> getEntries() {
        return LLILZLL;
    }

    static {
        ICommonMiniDramaAppDiffProtocol.LIZ.getClass();
        C01GW<ICommonMiniDramaAppDiffProtocol> c01gw = C1573700r3Q.LIZIZ;
        c01gw.getValue().LIZIZ();
        MyListSceneEnum myListSceneEnum = new MyListSceneEnum("MY_LIST_SCENE_COLLECTION_HISTORY", 0, "1", "history", 2131836554, 2131836553);
        MY_LIST_SCENE_COLLECTION_HISTORY = myListSceneEnum;
        c01gw.getValue().LJ();
        MyListSceneEnum myListSceneEnum2 = new MyListSceneEnum("MY_LIST_SCENE_COLLECTION_FAVOURITE", 1, "2", "favorites", 2131836535, 2131836534);
        MY_LIST_SCENE_COLLECTION_FAVOURITE = myListSceneEnum2;
        MyListSceneEnum myListSceneEnum3 = new MyListSceneEnum("MY_LIST_SCENE_COLLECTION_PURCHASED", 2, "3", "purchased", 2131836554, 2131836553);
        MY_LIST_SCENE_COLLECTION_PURCHASED = myListSceneEnum3;
        MyListSceneEnum[] myListSceneEnumArr = {myListSceneEnum, myListSceneEnum2, myListSceneEnum3};
        LLILZIL = myListSceneEnumArr;
        LLILZLL = new C2254308sP(myListSceneEnumArr);
        Companion = new C1573670r3N();
        VALUES = (MyListSceneEnum[]) getEntries().toArray(new MyListSceneEnum[0]);
    }

    public static MyListSceneEnum[] values() {
        return (MyListSceneEnum[]) LLILZIL.clone();
    }

    public final int getMessageRes() {
        return this.LLILZ;
    }

    public final String getSource() {
        return this.LLILLJJLI;
    }

    public final int getTitleRes() {
        return this.LLILLL;
    }

    public final String getValue() {
        return this.LL;
    }

    public static MyListSceneEnum valueOf(String str) {
        return (MyListSceneEnum) C08FF.LIZ(MyListSceneEnum.class, str);
    }

    public MyListSceneEnum(String str, int i, String str2, String str3, int i2, int i3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }
}
