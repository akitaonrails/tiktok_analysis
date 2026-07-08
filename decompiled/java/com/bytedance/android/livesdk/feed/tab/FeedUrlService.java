package com.bytedance.android.livesdk.feed.tab;

import X.C01GW;
import X.C086I;
import X.C09JN;
import X.C0IKQ;
import X.C0IUV;
import X.C0IUW;
import X.C0IV7;
import X.C0J0Q;
import X.C0J1O;
import X.C0J1U;
import X.C0J7I;
import X.C0VMT;
import X.C1090000eTG;
import X.C1093420eYm;
import X.C1105280eru;
import X.C1161920gLG;
import X.C11JN;
import X.C11NZ;
import X.C11S5;
import X.C1515210pX5;
import X.C1701940uOG;
import X.C19748512Ol;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C465050ILn;
import X.C467450IUt;
import X.C468110IXh;
import X.C468640IZi;
import X.C469370Iat;
import X.C469420Iay;
import X.C469500Ib6;
import X.C469510Ib7;
import X.C469770IbX;
import X.C470870IdJ;
import X.C470980IdU;
import X.C471000IdW;
import X.C471030IdZ;
import X.C471300Ie0;
import X.C471440IeE;
import X.C472700IgG;
import X.C473300IhE;
import X.C474870Ijl;
import X.C477010InD;
import X.C477190InV;
import X.C477740IoO;
import X.C480460Ism;
import X.C486690J6t;
import X.C497740JfY;
import X.C516801zq;
import X.C516901zr;
import X.C823050WQl;
import X.EnumC467180ITs;
import X.EnumC469490Ib5;
import X.EnumC471790Ien;
import X.EnumC477350Inl;
import X.InterfaceC467290IUd;
import X.InterfaceC469760IbW;
import X.InterfaceC470690Id1;
import X.InterfaceC470900IdM;
import X.InterfaceC471040Ida;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS82S0200000_13;
import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import Y.AkS104S1100000_7;
import Y.AkS156S0000000_7;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.drawerfeed.basic.DefaultDrawerFeedFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.game.category.GameDrawerBottomFeedFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.game.drops.GameDropsDrawerFeedFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.game.esport.GameESportDrawerFeedFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.game.guess.GameGuessDrawerFeedFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.game.normal.GameDrawerFeedFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchResultFragment;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryFragment;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.android.livesdk.livesetting.feed.FeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopliveOptRefreshReqSetting;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerArchOpt2ndSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.ServerFeature;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import webcast.api.room.PackageInfo;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyInfo;
import webcast.api.room.StrategyResource;

/* JADX INFO: loaded from: classes8.dex */
public class FeedUrlService implements ILiveFeedApiService {
    public boolean LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void I9() {
        String str = TopliveOptRefreshReqSetting.INSTANCE.getConfig() ? "toplive_refresh" : "enter_auto_foru_feed_draw_refresh";
        boolean zLJI = MethodIDManager.LJI(72076);
        if (C0IUW.LIZIZ() == null && !C0IUW.LIZJ) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (C0IUW.LJ(str)) {
                C0IUW.LJI = jUptimeMillis;
                C0IUW.LIZLLL(0, -1L);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void P4() {
        if (this.LL || !this.LLILLJJLI) {
            return;
        }
        C471000IdW.LJ().LJIIIIZZ().LJJLL(new AfS176S0100000_7(this, 63), new AfS132S0000000_7(13));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void PJ0() {
        DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
        if (value != null) {
            if (value.isPreLoadingForuData || value.isPreLoadingGameData) {
                ((Map) C470980IdU.LIZ.getValue()).clear();
                ((Map) C470980IdU.LIZIZ.getValue()).clear();
                C470980IdU.LIZ().clear();
            }
        }
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C468110IXh U91() {
        if (C468110IXh.LIZIZ == null) {
            synchronized (C468110IXh.class) {
                try {
                    if (C468110IXh.LIZIZ == null) {
                        C468110IXh.LIZIZ = new C468110IXh();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C468110IXh.LIZIZ;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void Ww0() {
        C1093420eYm.LIZ("cold_start");
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void aw2() {
        C469510Ib7.LIZ.clear();
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void ef() {
        C20441214yg.LJIIIZ("LiveIconGeneratorLog", "there is error");
        Zg();
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C467450IUt mk() {
        return C467450IUt.LJIIL.getValue();
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void np2() {
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).wS()) {
            return;
        }
        C471000IdW c471000IdWLJ = C471000IdW.LJ();
        if (c471000IdWLJ.LIZ == null) {
            C480460Ism.LIZ().getClass();
            c471000IdWLJ.LIZ = (FeedTabApi) C480460Ism.LIZLLL(FeedTabApi.class);
        }
        c471000IdWLJ.LIZ.queryTab(0).LJL(C11S5.LIZ()).LJJJJZI(new AkS156S0000000_7(4)).LJJIJIIJIL(new AfS176S0100000_7(c471000IdWLJ, 65)).LJJLL(new AfS132S0000000_7(14), new C516901zr(7));
        C468640IZi c468640IZi = C468640IZi.LL;
        if (LiveWatchLaterSettingSetting.INSTANCE.getValue() <= 0 || C468640IZi.LLILLL) {
            return;
        }
        C468640IZi.LLILLL = true;
        C468640IZi.LIZLLL();
        ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).registerLiveStatusSignal("live_watch_later", c468640IZi);
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).observeAccountChange(new C0J7I() { // from class: X.0Idb
            @Override // X.C0J7I
            public final void LIZ() {
                C468640IZi.LIZLLL();
            }
        });
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).zX1();
        CommonSkylightDataManager.LIZ.LJFF(C468640IZi.LLILZ);
    }

    public final void onInit() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(R.layout.gdp));
        hashSet.add(Integer.valueOf(R.layout.hmq));
        hashSet.add(Integer.valueOf(R.layout.hmn));
        hashSet.add(Integer.valueOf(R.layout.gdk));
        C1105280eru.LIZIZ(null, hashSet);
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C471300Ie0 ot() {
        C471300Ie0.LJ.getClass();
        return C471300Ie0.LJFF.getValue();
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C0IV7 tv0() {
        return new C0IV7();
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C486690J6t ut() {
        return C486690J6t.LIZJ.getValue();
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void v3() {
        if (this.LL || this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final Boolean Eo() {
        return Boolean.valueOf(C471000IdW.LJFF(C471000IdW.LJ().LIZLLL()));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final String Km0() {
        C471000IdW.LJ().getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        C1515210pX5.LIZLLL().getClass();
        sbLIZ.append(C1515210pX5.LIZJ());
        sbLIZ.append("/webcast/feed/?content_type=0&style=2&channel_id=21&sub_channel_id=0&tab_id=1&type=live&sub_type=live");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void Zg() {
        C11NZ.LJJJJZ(Boolean.valueOf(C471000IdW.LJFF(C471000IdW.LJ().LIZLLL()))).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS132S0000000_7(16));
        C20441214yg.LJIIIZ("LiveIconGeneratorLog", "feedurlservice#requestTabListForyouPage");
        C471000IdW.LJ().LJIIIIZZ().LJJLL(new AfS176S0100000_7(this, 64), new AfS132S0000000_7(15));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final String i0() {
        C471000IdW c471000IdWLJ = C471000IdW.LJ();
        String str = c471000IdWLJ.LJ;
        if (str != null) {
            return str;
        }
        if (C497740JfY.LJII() == null) {
            return "";
        }
        if (c471000IdWLJ.LJFF == null) {
            c471000IdWLJ.LJFF = KevaImpl.getRepo("live_tab_type_repo", 0);
        }
        String string = c471000IdWLJ.LJFF.getString("ttlive_live_tab_type", "");
        c471000IdWLJ.LJ = string;
        return string;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void H12() {
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void Js0() {
        C474870Ijl c474870Ijl = C474870Ijl.LIZ;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final boolean mI0() {
        return C0IUW.LIZJ;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void zX1() {
        CommonSkylightDataManager commonSkylightDataManager = CommonSkylightDataManager.LIZ;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void zr() {
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final List<Integer> BY1(String str) {
        Object obj;
        Map<String, C1090000eTG> mapDu2 = ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).Du2(str);
        ArrayList arrayList = new ArrayList();
        if (mapDu2 != null && !mapDu2.isEmpty()) {
            for (String str2 : mapDu2.keySet()) {
                try {
                    C1090000eTG c1090000eTG = mapDu2.get(str2);
                    if (c1090000eTG != null && (obj = c1090000eTG.LIZJ) != null) {
                        ServerFeature serverFeature = (ServerFeature) C19748512Ol.LIZJ.LJII(obj.toString(), ServerFeature.class);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getFeatureIndexsByGroup foreach: feature = ");
                        sbLIZ.append(c1090000eTG);
                        C20441214yg.LIZIZ("FeedUrlService", C2188811AlT.LIZIZ(sbLIZ));
                        if (serverFeature != null && CastLongProtector.parseLong(serverFeature.endTime) * 1000 > System.currentTimeMillis()) {
                            arrayList.add(Integer.valueOf(serverFeature.index));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getFeatureIndexsByGroup foreach add: index = ");
                            sbLIZ2.append(serverFeature.index);
                            C20441214yg.LIZIZ("FeedUrlService", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).nl0(EnumC467180ITs.SERVER_FEATURE.getGroupName(), str2);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("error on getFeatureIndexsByGroup e = ");
                    sbLIZ3.append(e);
                    C20441214yg.LJIIIZ("FeedUrlService", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getFeatureIndexsByGroup return: ");
            sbLIZ4.append(arrayList);
            C20441214yg.LJIIIZ("FeedUrlService", C2188811AlT.LIZIZ(sbLIZ4));
        }
        return arrayList;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void Jn0(StrategyData strategyData) {
        StrategyResource strategyResource = strategyData.strategyPlatformConfig;
        if (strategyResource != null) {
            C823050WQl.LIZJ().submit(new ARunnableS107S0100000_7(strategyResource, 195));
        }
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final Map<String, Object> L7(long j) {
        return LIZ(j, C471000IdW.LJ().LIZJ());
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void Xm(List<ItemTab> list) {
        C471000IdW c471000IdWLJ = C471000IdW.LJ();
        c471000IdWLJ.LJIIIZ(list);
        if (C471030IdZ.LIZ().getEnableGetLiveTabTypeOpt()) {
            c471000IdWLJ.LIZ(list);
        }
        this.LL = true;
        boolean zLJFF = C471000IdW.LJFF(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("successfully, showLiveIconEntrance：");
        sbLIZ.append(zLJFF);
        C20441214yg.LJIIIZ("LiveIconGeneratorLog", C2188811AlT.LIZIZ(sbLIZ));
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).notifyShowLiveIconEntrance(zLJFF);
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final boolean Ze1(final Map map) {
        if (!C0IUV.LIZ) {
            C465050ILn.LIZLLL("live_entrance_click");
            C0IUV.LIZ = true;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            C465050ILn.LIZLLL("webcast_feed_fetch");
            InterfaceC467290IUd interfaceC467290IUd = new InterfaceC467290IUd() { // from class: X.0IUm
                @Override // X.InterfaceC467290IUd
                public final void LIZ(Throwable th) {
                    C0IUV.LJIIIIZZ(th);
                }

                @Override // X.InterfaceC467290IUd
                public final void LIZIZ(C0ITP c0itp, String str) {
                    C0IUV.LJIIIZ(c0itp, str, jElapsedRealtime, map, jCurrentTimeMillis, true, false);
                }
            };
            if (C0IUW.LIZIZ() != null) {
                interfaceC467290IUd.LIZIZ(C0IUW.LIZLLL, C0IUW.LJFF);
            } else {
                C0IUW.LIZ = interfaceC467290IUd;
                C0IUW.LJ("enter_auto_foru_feed_draw_refresh");
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final Map<String, Object> ux(long j) {
        return LIZ(j, C471000IdW.LJ().LIZLLL());
    }

    public static Map LIZ(long j, List list) {
        ItemTab itemTab;
        HashMap map = new HashMap();
        if (C0IKQ.LIZ(list)) {
            return map;
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                itemTab = (ItemTab) it2.next();
                if (itemTab != null && itemTab.getId() == j) {
                    break;
                }
            } else {
                itemTab = (ItemTab) ListProtector.get(arrayList, 0);
                if (itemTab != null) {
                    break;
                }
            }
        }
        map.put("feed_url", itemTab.getInnerStreamUrl());
        map.put("feed_style", Integer.valueOf(itemTab.getStyle()));
        map.put("feed_name", itemTab.getName());
        return map;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void Cz1(C19EG c19eg, String str) {
        String strLIZIZ;
        TabFeedViewModel tabFeedViewModel;
        DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
        if (value != null) {
            if (!value.isPreLoadingForuData && !value.isPreLoadingGameData) {
                if ((value.isPreLoadingForuUI || value.isPreLoadingGameUI) && (tabFeedViewModel = (TabFeedViewModel) C470980IdU.LIZ().get(str)) != null) {
                    tabFeedViewModel.EQ2();
                    return;
                }
                return;
            }
            if (C470980IdU.LIZ().get(str) == null) {
                if (c19eg == null) {
                    return;
                }
                TabFeedViewModel tabFeedViewModel2 = (TabFeedViewModel) C470980IdU.LIZ().get(str);
                if (tabFeedViewModel2 == null) {
                    C01GW c01gw = C470980IdU.LIZIZ;
                    C471440IeE c471440IeE = (C471440IeE) ((Map) c01gw.getValue()).get(str);
                    if (c471440IeE == null) {
                        C01GW c01gw2 = C470980IdU.LIZ;
                        InterfaceC470690Id1 c470870IdJ = (InterfaceC470690Id1) ((Map) c01gw2.getValue()).get(str);
                        if (c470870IdJ == null) {
                            c470870IdJ = new C470870IdJ();
                            ((Map) c01gw2.getValue()).put(str, c470870IdJ);
                        }
                        C480460Ism.LIZ().getClass();
                        c471440IeE = new C471440IeE(new FeedRepository(c470870IdJ, (FeedApi) C480460Ism.LIZLLL(FeedApi.class), new C0J1U(), new C0J1O()));
                        ((Map) c01gw.getValue()).put(str, c471440IeE);
                    }
                    c471440IeE.LIZIZ = new InterfaceC470900IdM() { // from class: X.0IdT
                        @Override // X.InterfaceC470900IdM
                        public final void qD() {
                        }

                        @Override // X.InterfaceC470900IdM
                        public final int uL() {
                            int i = (LiveFeedPreloadSetting.INSTANCE.getValue().feedPreloadStyleTwo - 1) * 2;
                            if (i > 1) {
                                return i;
                            }
                            int value2 = FeedPreloadSetting.INSTANCE.getValue();
                            if (value2 <= 1) {
                                return 4;
                            }
                            return value2;
                        }

                        @Override // X.InterfaceC470900IdM
                        public final String url() {
                            return !C2093608Ic.LJ(C470980IdU.LIZIZ()) ? C470980IdU.LIZIZ() : "";
                        }
                    };
                    tabFeedViewModel2 = (TabFeedViewModel) ViewModelProviders.of(c19eg, c471440IeE).get(str, TabFeedViewModel.class);
                    tabFeedViewModel2.EQ2();
                    tabFeedViewModel2.FQ2();
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "foru")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("enter_auto_vertical_");
                        sbLIZ.append(str);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strLIZIZ = "drawer_enter_from_room";
                    }
                    tabFeedViewModel2.LLJILLL.LH2(strLIZIZ);
                    C470980IdU.LIZ().put(str, tabFeedViewModel2);
                }
                tabFeedViewModel2.BQ2();
                return;
            }
            TabFeedViewModel tabFeedViewModel3 = (TabFeedViewModel) C470980IdU.LIZ().get(str);
            if (tabFeedViewModel3 == null) {
                return;
            }
            tabFeedViewModel3.EQ2();
        }
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void OY(String str, StrategyData strategyData) {
        String str2;
        Map map;
        if (strategyData != null && (str2 = strategyData.strategyId) != null && (map = (Map) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, str2, new TypeToken<Map<String, ServerFeature>>() { // from class: X.0IdV
        }.getType())) != null && !map.isEmpty()) {
            HashMap map2 = new HashMap();
            for (Object obj : map.keySet()) {
                map2.put(obj, GsonProtectorUtils.toJson(C19748512Ol.LIZJ, map.get(obj)));
            }
            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).Xu0(C0J0Q.APP, str, map2);
        }
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final LiveSearchResultFragment WM(C469370Iat c469370Iat, C469420Iay c469420Iay) {
        LiveSearchResultFragment liveSearchResultFragment = new LiveSearchResultFragment();
        liveSearchResultFragment.LLIZ = c469370Iat;
        liveSearchResultFragment.LLIZLLLIL = c469420Iay;
        return liveSearchResultFragment;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C472700IgG mL1(C477740IoO c477740IoO, EnumC477350Inl enumC477350Inl) {
        return new C472700IgG(c477740IoO);
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final void p22(List<StrategyInfo> list, List<PackageInfo> list2) {
        C0VMT.LIZ().runInTransaction(new ARunnableS82S0200000_13(list2, list, 75));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C473300IhE y30(int i, boolean z) {
        return new C473300IhE(i, z);
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final Fragment YU(InterfaceC469760IbW interfaceC469760IbW, C469770IbX c469770IbX, EnumC469490Ib5 enumC469490Ib5) {
        boolean z;
        LiveDrawerArchOpt2ndSetting liveDrawerArchOpt2ndSetting = LiveDrawerArchOpt2ndSetting.INSTANCE;
        if (!liveDrawerArchOpt2ndSetting.enable() && !((ArrayList) C469510Ib7.LIZ()).contains(enumC469490Ib5)) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create, drawerFeedType: ");
        sbLIZ.append(enumC469490Ib5.name());
        sbLIZ.append(", isNewArch: ");
        sbLIZ.append(z);
        sbLIZ.append(", LiveDrawerArchOpt2ndSetting.enable: ");
        sbLIZ.append(liveDrawerArchOpt2ndSetting.enable());
        sbLIZ.append(",drawerFeedType in getNewArchTypeFromSetting: ");
        sbLIZ.append(((ArrayList) C469510Ib7.LIZ()).contains(enumC469490Ib5));
        C20441214yg.LIZIZ("DrawerFeedLiveFactoryMgr", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            HashMap<EnumC469490Ib5, InterfaceC471040Ida> map = C469510Ib7.LIZ;
            InterfaceC471040Ida interfaceC471040Ida = map.get(enumC469490Ib5);
            if (interfaceC471040Ida == null) {
                switch (C469500Ib6.LIZ[enumC469490Ib5.ordinal()]) {
                    case 1:
                        interfaceC471040Ida = new InterfaceC471040Ida() { // from class: X.0Idr
                            @Override // X.InterfaceC471040Ida
                            public final Fragment LIZ(InterfaceC469760IbW interfaceC469760IbW2, C469770IbX c469770IbX2) {
                                return new GameDrawerFeedFragment(interfaceC469760IbW2, c469770IbX2, new C471130Idj(this), new C471180Ido(this));
                            }
                        };
                        break;
                    case 2:
                        interfaceC471040Ida = new InterfaceC471040Ida() { // from class: X.0Idz
                            @Override // X.InterfaceC471040Ida
                            public final Fragment LIZ(InterfaceC469760IbW interfaceC469760IbW2, C469770IbX c469770IbX2) {
                                return new GameESportDrawerFeedFragment(interfaceC469760IbW2, c469770IbX2, new C471230Idt(this), new C471240Idu(this));
                            }
                        };
                        break;
                    case 3:
                        interfaceC471040Ida = new InterfaceC471040Ida() { // from class: X.0Idy
                            @Override // X.InterfaceC471040Ida
                            public final Fragment LIZ(InterfaceC469760IbW interfaceC469760IbW2, C469770IbX c469770IbX2) {
                                return new GameDropsDrawerFeedFragment(interfaceC469760IbW2, c469770IbX2, new C471220Ids(this), new C471200Idq(this));
                            }
                        };
                        break;
                    case 4:
                        interfaceC471040Ida = new InterfaceC471040Ida() { // from class: X.0Idw
                            @Override // X.InterfaceC471040Ida
                            public final Fragment LIZ(InterfaceC469760IbW interfaceC469760IbW2, C469770IbX c469770IbX2) {
                                return new GameGuessDrawerFeedFragment(interfaceC469760IbW2, c469770IbX2, new C471120Idi(this), new C471170Idn(this));
                            }
                        };
                        break;
                    case 5:
                        interfaceC471040Ida = new InterfaceC471040Ida() { // from class: X.0Idk
                            @Override // X.InterfaceC471040Ida
                            public final Fragment LIZ(InterfaceC469760IbW interfaceC469760IbW2, C469770IbX c469770IbX2) {
                                GameDrawerCategoryFragment gameDrawerCategoryFragmentE90;
                                IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
                                if (iGameService != null && (gameDrawerCategoryFragmentE90 = iGameService.e90(interfaceC469760IbW2, c469770IbX2)) != null) {
                                    return gameDrawerCategoryFragmentE90;
                                }
                                return new GameDrawerFeedFragment(interfaceC469760IbW2, c469770IbX2, new C471110Idh(this), new C471150Idl(this));
                            }
                        };
                        break;
                    case 6:
                        interfaceC471040Ida = new InterfaceC471040Ida() { // from class: X.0Idv
                            @Override // X.InterfaceC471040Ida
                            public final Fragment LIZ(InterfaceC469760IbW interfaceC469760IbW2, C469770IbX c469770IbX2) {
                                return new GameDrawerBottomFeedFragment(interfaceC469760IbW2, c469770IbX2, new C471100Idg(this), new C471160Idm(this));
                            }
                        };
                        break;
                    default:
                        interfaceC471040Ida = new InterfaceC471040Ida() { // from class: X.0Idx
                            @Override // X.InterfaceC471040Ida
                            public final Fragment LIZ(InterfaceC469760IbW interfaceC469760IbW2, C469770IbX c469770IbX2) {
                                return new DefaultDrawerFeedFragment(interfaceC469760IbW2, c469770IbX2, new C471090Idf(this), new C471190Idp(this));
                            }
                        };
                        break;
                }
            }
            map.put(enumC469490Ib5, interfaceC471040Ida);
            return interfaceC471040Ida.LIZ(interfaceC469760IbW, c469770IbX);
        }
        String str = c469770IbX.LIZ;
        if (str == null) {
            str = "";
        }
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = new DrawerFeedLiveFragmentV2();
        drawerFeedLiveFragmentV2.LLJ = interfaceC469760IbW;
        drawerFeedLiveFragmentV2.LLJILJILJ = str;
        return drawerFeedLiveFragmentV2;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final EnterRoomConfig nY(int i, List<FeedItem> list, FeedExtra feedExtra) {
        FeedItem feedItem;
        if (C086I.LIZIZ(list) || (feedItem = (FeedItem) ListProtector.get(list, i)) == null || !(feedItem.item instanceof Room)) {
            return null;
        }
        EnterRoomConfig enterRoomConfigLIZIZ = C0IUV.LIZIZ(feedItem, feedExtra);
        if (enterRoomConfigLIZIZ != null) {
            ArrayList<EnterRoomConfig> arrayList = new ArrayList<>(list.size());
            ArrayList<EnterRoomConfig> arrayList2 = new ArrayList<>(list.size());
            for (int i2 = 0; i2 < i; i2++) {
                EnterRoomConfig enterRoomConfigLIZJ = C0IUV.LIZJ((FeedItem) ListProtector.get(list, i2), feedExtra);
                if (enterRoomConfigLIZJ != null) {
                    arrayList2.add(enterRoomConfigLIZJ);
                }
            }
            int size = list.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                EnterRoomConfig enterRoomConfigLIZJ2 = C0IUV.LIZJ((FeedItem) ListProtector.get(list, i), feedExtra);
                if (enterRoomConfigLIZJ2 != null) {
                    arrayList.add(enterRoomConfigLIZJ2);
                }
            }
            EnterRoomConfig.LogData logData = enterRoomConfigLIZIZ.mLogData;
            logData.moreConfig = arrayList;
            logData.frontRoomConfig = arrayList2;
            if (feedExtra != null) {
                enterRoomConfigLIZIZ.mRoomsData.hasMoreExtra = Boolean.valueOf(feedExtra.hasMore);
                EnterRoomConfig.RoomsData roomsData = enterRoomConfigLIZIZ.mRoomsData;
                roomsData.maxTimeExtra = feedExtra.maxTime;
                roomsData.unReadIdExtra = feedExtra.unreadExtra;
            }
        }
        return enterRoomConfigLIZIZ;
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C11JN IC(String str, String str2, String str3, Map map) {
        String url = str2;
        if (url == null || url.length() == 0) {
            url = FeedDrawMtSetting.INSTANCE.getValue().getUrl();
            map.put("channel_id", "21");
        }
        C480460Ism.LIZ().getClass();
        return ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).feed(url, 0L, str3, map).LJJJJZI(new AkS104S1100000_7(str, map, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0ITo
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FeedApiManager@9905.realFetchFeedData$6");
                Pair pair = (Pair) obj;
                C467130ITn.LIZ(new C0ITP((List) pair.getFirst(), (FeedExtra) pair.getSecond()));
                C1C7U.LIZIZ("FeedApiManager@9905.realFetchFeedData$6");
            }
        }).LJJIJIIJI(new C516801zq(map, str, 9));
    }

    @Override // com.bytedance.android.feed.api.ILiveFeedApiService
    public final C477190InV TI(C477010InD c477010InD, EnumC477350Inl enumC477350Inl, EnumC471790Ien enumC471790Ien, LifecycleOwner lifecycleOwner) {
        return new C477190InV(c477010InD, enumC477350Inl, enumC471790Ien, lifecycleOwner);
    }
}
