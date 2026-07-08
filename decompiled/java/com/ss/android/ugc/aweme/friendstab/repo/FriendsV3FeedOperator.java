package com.ss.android.ugc.aweme.friendstab.repo;

import X.C1227904rF;
import X.C1351070lGL;
import X.C1386160mAw;
import X.C1587910rQL;
import X.C2286608xc;
import X.C296460Bjg;
import X.EnumC1587000rOs;
import X.InterfaceC1364105Vn;
import X.InterfaceC2177008fw;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3FeedOperator implements IFriendsV3FeedOperator {
    @Override // com.ss.android.ugc.aweme.friendstab.repo.IFriendsV3FeedOperator
    public Object getFriendsTextDetail(String str, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn) {
        int iLIZLLL;
        if (C296460Bjg.LIZJ()) {
            iLIZLLL = 1;
        } else {
            iLIZLLL = C296460Bjg.LIZLLL();
        }
        C1227904rF c1227904rF = C1227904rF.LIZ;
        List listSingletonList = Collections.singletonList(str);
        c1227904rF.getClass();
        String strLJI = C1227904rF.LJI(listSingletonList);
        if (strLJI == null) {
            strLJI = "";
        }
        return FriendsV3FeedApi.LIZIZ.getFriendsTextDetail(strLJI, iLIZLLL, obj, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.repo.IFriendsV3FeedOperator
    public Object getFriendsTextHistory(int i, String str, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn) {
        int iLIZLLL;
        if (C296460Bjg.LIZJ()) {
            iLIZLLL = 1;
        } else {
            iLIZLLL = C296460Bjg.LIZLLL();
        }
        return FriendsV3FeedApi.LIZIZ.getFriendsTextHistory(i, iLIZLLL, str, obj, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.repo.IFriendsV3FeedOperator
    public Object getFriendsV3Feeds(String str, String str2, int i, int i2, int i3, int i4, EnumC1587000rOs enumC1587000rOs, Long l, String str3, @InterfaceC2177008fw Object obj, String str4, String str5, String str6, String str7, String str8, String str9, int i5, String str10, int i6, Boolean bool, Integer num, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn) {
        int iLIZLLL;
        String scene;
        boolean zLIZJ = C296460Bjg.LIZJ();
        boolean zLIZJ2 = C1587910rQL.LIZJ();
        if (zLIZJ) {
            iLIZLLL = 1;
        } else {
            iLIZLLL = C296460Bjg.LIZLLL();
        }
        FriendsV3FeedApi friendsV3FeedApi = FriendsV3FeedApi.LIZIZ;
        if (enumC1587000rOs != null) {
            scene = enumC1587000rOs.getScene();
        } else {
            scene = null;
        }
        return friendsV3FeedApi.getFriendsV3Feeds(str, str2, i, i2, i3, i4, scene, l, C1351070lGL.LIZ(), C1386160mAw.LJIIIIZZ(Boolean.valueOf(zLIZJ2)), iLIZLLL, str3, obj, str4, str5, str6, str7, str8, str9, C2286608xc.LJ(i5), str10, i6, bool, num, interfaceC1364105Vn);
    }
}
