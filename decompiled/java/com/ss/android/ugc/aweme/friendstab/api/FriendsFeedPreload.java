package com.ss.android.ugc.aweme.friendstab.api;

import X.C08JS;
import X.C0NMC;
import X.C0VNS;
import X.C1499810p8F;
import X.C1516430pZ3;
import X.C15438062q;
import X.C1587600rPq;
import X.C1587620rPs;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C15O7;
import X.C1616470sAP;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C312040CLa;
import X.C443120HZe;
import X.EnumC1360770lVz;
import X.EnumC1586890rOh;
import X.InterfaceC727570SgN;
import Y.ACallableS252S0200000_24;
import android.os.Bundle;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedListApi;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedPreload implements InterfaceC727570SgN<FriendsFeedListApi.FriendsFeedApi, Future<FriendsFeedResponse>> {
    public static final C1587600rPq Companion = new Object() { // from class: X.0rPq
    };
    public static List<C0VNS> clientReadGidsAll = new ArrayList();
    public Bundle preloadBundle;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(true, Api.LIZ, null, FriendsTabPreloadTTLSetting.INSTANCE.getValue(), false, 24);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        C15O7.LIZJ(new ACallableS252S0200000_24(exc, this, 1));
        return true;
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload, reason: avoid collision after fix types in other method */
    public Future<FriendsFeedResponse> preload2(Bundle bundle, Function1<? super Class<FriendsFeedListApi.FriendsFeedApi>, ? extends FriendsFeedListApi.FriendsFeedApi> function1) {
        String string;
        String string2;
        String string3;
        String string4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload, bundle = ");
        if (bundle != null) {
            string = bundle.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        this.preloadBundle = bundle;
        C443120HZe<List<String>, List<String>, List<C0VNS>> history = C1595430rcT.LIZIZ.LIZJ().readHistory(EnumC1360770lVz.PRELOAD_FEED);
        List<String> first = history.getFirst();
        List<String> second = history.getSecond();
        List<C0VNS> third = history.getThird();
        clientReadGidsAll.clear();
        clientReadGidsAll.addAll(new ArrayList(third));
        List<C0VNS> list = clientReadGidsAll;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0VNS> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        String strLIZLLL = C08JS.LIZLLL(arrayList);
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(-1, "others_homepage", "others_homepage", "/tiktok/v1/friend/friend_feed", C1697810uHb.LJIIJJI("source", "max_count", "pull_type", "aweme_ids", "page_token"));
        Bundle bundle2 = this.preloadBundle;
        String str = "";
        if (bundle2 == null || (string2 = bundle2.getString("aweme_ids", "")) == null) {
            string2 = "";
        }
        C312040CLa.LIZ.getClass();
        if (C312040CLa.LIZIZ()) {
            return null;
        }
        Bundle bundle3 = this.preloadBundle;
        if (bundle3 != null && (string4 = bundle3.getString(Scene.SCENE_SERVICE, "")) != null) {
            str = string4;
        }
        Bundle bundle4 = this.preloadBundle;
        String str2 = "unknown";
        if (bundle4 != null && (string3 = bundle4.getString("red_dot_source", "unknown")) != null) {
            str2 = string3;
        }
        FriendsFeedListApi.FriendsFeedApi friendsFeedApiInvoke = function1.invoke(FriendsFeedListApi.FriendsFeedApi.class);
        C0NMC c0nmc = C0NMC.REFRESH;
        int type = c0nmc.getType();
        Integer numValueOf = Integer.valueOf(C1589640rT8.LIZIZ.F2() ? 1 : 0);
        FriendsFeedListApi.FriendsFeedApi friendsFeedApi = FriendsFeedListApi.LIZ;
        int iLIZLLL = C1587620rPs.LIZLLL();
        int dataLevel = EnumC1586890rOh.SORT.getDataLevel();
        int type2 = c0nmc.getType();
        C1616470sAP.LIZ.getClass();
        String strLIZLLL2 = C1616470sAP.LIZ("Friends").LIZLLL();
        String strLIZLLL3 = C08JS.LIZLLL(first);
        String strLIZLLL4 = C08JS.LIZLLL(second);
        C1516430pZ3 c1516430pZ3 = C1516430pZ3.LL;
        String strLIZ = C1516430pZ3.LIZ();
        boolean zLJI = MethodIDManager.LJI(137880);
        ListenableFuture<FriendsFeedResponse> friendsFeedListEnhance = friendsFeedApiInvoke.getFriendsFeedListEnhance(1, str, type, numValueOf, iLIZLLL, dataLevel, 6, type2, string2, strLIZLLL2, null, strLIZLLL3, null, strLIZLLL4, strLIZLLL, strLIZ, 1, false, null, preloadExtraInfo, str2, null, null, null, null, null, null, null, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return friendsFeedListEnhance;
    }
}
