package com.bytedance.android.livesdk.feed.skylight;

import X.C01GW;
import X.C09JN;
import X.C0IJT;
import X.C0IUF;
import X.C0IV1;
import X.C0IVA;
import X.C0IVB;
import X.C0J7I;
import X.C0UO0;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C13BV;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C471740Iei;
import X.C471770Iel;
import X.C473350IhJ;
import X.C474500IjA;
import X.C480460Ism;
import X.EnumC471720Ieg;
import X.EnumC471750Iej;
import X.EnumC471790Ien;
import X.InterfaceC420801kM;
import X.InterfaceC472150IfN;
import X.InterfaceC476860Imy;
import Y.AObserverS211S0100000_7;
import Y.AfS176S0100000_7;
import Y.AfS3S0100100_7;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightOptSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveNetOptV2;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestCentralizedEntranceStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveAddFeedApiParamsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightRefreshOptSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.LiveTab;

/* JADX INFO: loaded from: classes8.dex */
public final class CommonSkylightDataManager implements InterfaceC476860Imy {
    public static volatile boolean LIZJ;
    public static BaseListResponse<FeedItem, FeedExtra> LJ;
    public static Pair<Long, ? extends BaseListResponse<FeedItem, FeedExtra>> LJFF;
    public static int LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;
    public static int LJIILIIL;
    public static WeakReference<InterfaceC420801kM> LJIILJJIL;
    public static Boolean LJIILLIIL;
    public static boolean LJIJ;
    public static FeedItem LJIJJ;
    public static final CommonSkylightDataManager$pollObservable$1 LJIJJLI;
    public static final CommonSkylightDataManager LIZ = new CommonSkylightDataManager();
    public static final C0IV1 LIZIZ = new C0IUF() { // from class: X.0IV1
        @Override // X.C0IUF
        public final C0IV2 LIZ() {
            return C0IV2.TOPLIVE_POLLING;
        }
    };
    public static final List<C0IVA> LIZLLL = new CopyOnWriteArrayList();
    public static EnumC471720Ieg LJIILL = EnumC471720Ieg.TOP_LIVE;
    public static final Keva LJIIZILJ = KevaImpl.getRepo("repo_common_skylight", 0);
    public static final C01GW LJIJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(49));

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0IV1] */
    static {
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).observeAccountChange(new C0J7I() { // from class: X.0Iee
            @Override // X.C0J7I
            public final void LIZ() {
                C20441214yg.LIZIZ("SkylightDataManager", "observeAccountChange: clear cache");
                CommonSkylightDataManager.LJIILLIIL = null;
                CommonSkylightDataManager.LJ = null;
                CommonSkylightDataManager.LJFF = null;
                CommonSkylightDataManager.LJIJ = false;
            }
        });
        LJIJJLI = new CommonSkylightDataManager$pollObservable$1();
    }

    public final LiveTab LIZ() {
        String str = C473350IhJ.LIZ;
        LiveTab value = C473350IhJ.LIZJ.getValue();
        return value == null ? C473350IhJ.LIZIZ : value;
    }

    @Override // X.InterfaceC476860Imy
    public final FeedItem LIZIZ() {
        FeedItem feedItem = LJIJJ;
        LJIJJ = null;
        return feedItem;
    }

    @Override // X.InterfaceC476860Imy
    public final boolean LIZLLL() {
        return LIZIZ.LIZIZ;
    }

    @Override // X.InterfaceC476860Imy
    public final boolean LJI() {
        return LJ != null && (SystemClock.uptimeMillis() - LJIIIIZZ) + ((long) 2000) <= LJJ();
    }

    @Override // X.InterfaceC476860Imy
    public final void LJII() {
        InterfaceC420801kM interfaceC420801kM;
        WeakReference<InterfaceC420801kM> weakReference = LJIILJJIL;
        if (weakReference != null && (interfaceC420801kM = weakReference.get()) != null) {
            interfaceC420801kM.dispose();
        }
        LJIILJJIL = null;
        LIZIZ.LJ();
    }

    @Override // X.InterfaceC476860Imy
    public final List<FeedItem> LJIIIIZZ() {
        List<FeedItem> list;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = LJ;
        if (baseListResponse == null || (list = baseListResponse.data) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (FeedItem feedItem : list) {
            if (feedItem.type == 21) {
                arrayList.add(feedItem);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC476860Imy
    public final boolean LJIIJ() {
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = LJ;
        if (baseListResponse != null) {
            return baseListResponse.LIZ;
        }
        return false;
    }

    @Override // X.InterfaceC476860Imy
    public final void LJIILL() {
        BaseListResponse<FeedItem, FeedExtra> second;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = LJ;
        if (baseListResponse != null) {
            baseListResponse.LIZ = true;
        }
        Pair<Long, ? extends BaseListResponse<FeedItem, FeedExtra>> pair = LJFF;
        if (pair == null || (second = pair.getSecond()) == null) {
            return;
        }
        second.LIZ = true;
    }

    @Override // X.InterfaceC476860Imy
    public final void LJIJJ() {
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).jL1()) {
            if (TopLiveNetOptV2.INSTANCE.getValue().getOptGoLiveRequest() && LJIJ && Intrinsics.LJFF(LJIILLIIL, Boolean.TRUE)) {
                return;
            }
            ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).requestLivePermission(new InterfaceC472150IfN() { // from class: X.0Ief
                @Override // X.InterfaceC472150IfN
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC472150IfN
                public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map<String, String> map) {
                    Intrinsics.LJFF(CommonSkylightDataManager.LJIILLIIL, bool);
                    CommonSkylightDataManager.LJIILLIIL = bool;
                    if (bool != null) {
                        Keva keva = CommonSkylightDataManager.LJIIZILJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("user_live_permission_");
                        sbLIZ.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
                        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), bool.booleanValue());
                        CommonSkylightDataManager.LJIJ = true;
                    }
                }
            }, "");
        }
    }

    public final Boolean LJIJJLI() {
        String str = C473350IhJ.LIZ;
        return Boolean.valueOf(Intrinsics.LJFF(C473350IhJ.LIZJ.getValue(), C473350IhJ.LIZIZ));
    }

    public final boolean LJIL() {
        return LIZJ || LIZIZ.LIZIZ;
    }

    @Override // X.InterfaceC476860Imy
    public final boolean hasLivePermission() {
        Boolean bool = LJIILLIIL;
        if (bool != null) {
            return bool.booleanValue();
        }
        Keva keva = LJIIZILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user_live_permission_");
        sbLIZ.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static long LJJ() {
        if (LiveSkylightRefreshOptSetting.enableTopLiveAutoRefresh()) {
            long j = LiveSkylightRefreshOptSetting.INSTANCE.config().intervalTopliveSecond;
            if (j >= 30) {
                return TimeUnit.SECONDS.toMillis(j);
            }
        }
        long jRefreshInterval = LiveInfeedSkylightOptSetting.refreshInterval();
        return jRefreshInterval > 0 ? TimeUnit.MINUTES.toMillis(jRefreshInterval) : ((Number) LJIJI.getValue()).longValue();
    }

    @Override // X.InterfaceC476860Imy
    public final int LJIILJJIL() {
        return LJI;
    }

    @Override // X.InterfaceC476860Imy
    public final void LIZJ(C0IVA c0iva) {
        List<C0IVA> list = LIZLLL;
        if (((CopyOnWriteArrayList) list).contains(c0iva)) {
            ((CopyOnWriteArrayList) list).remove(c0iva);
        }
    }

    @Override // X.InterfaceC476860Imy
    public final int LJ(EnumC471790Ien enumC471790Ien) {
        if (enumC471790Ien == EnumC471790Ien.NEARBY) {
            return C471770Iel.LIZJ;
        }
        return LJIIIZ;
    }

    @Override // X.InterfaceC476860Imy
    public final void LJFF(C0IVA c0iva) {
        List<C0IVA> list = LIZLLL;
        if (!((CopyOnWriteArrayList) list).contains(c0iva)) {
            ((CopyOnWriteArrayList) list).add(c0iva);
        }
    }

    @Override // X.InterfaceC476860Imy
    public final int LJIIIZ(EnumC471790Ien enumC471790Ien) {
        if (enumC471790Ien == EnumC471790Ien.NEARBY) {
            return C471770Iel.LJFF;
        }
        return LJIIL;
    }

    @Override // X.InterfaceC476860Imy
    public final int LJIIZILJ(EnumC471790Ien enumC471790Ien) {
        if (enumC471790Ien == EnumC471790Ien.NEARBY) {
            return C471770Iel.LJ;
        }
        return LJIIJJI;
    }

    @Override // X.InterfaceC476860Imy
    public final void LJIJ(EnumC471750Iej enumC471750Iej) {
        long jCurrentTimeMillis;
        Map<String, String> linkedHashMap;
        String str;
        EnumC471720Ieg enumC471720Ieg;
        C0IV1 c0iv1 = LIZIZ;
        if (c0iv1.LIZIZ) {
            return;
        }
        c0iv1.LIZJ(true);
        if (!LJI()) {
            LJ = null;
            LJFF = null;
        }
        LJII = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshData: running, from ");
        sbLIZ.append(enumC471750Iej);
        C20441214yg.LJIIIZ("SkylightDataManager", C2188811AlT.LIZIZ(sbLIZ));
        EnumC471750Iej enumC471750Iej2 = EnumC471750Iej.ENTER_TOPLIVE;
        if (enumC471750Iej != enumC471750Iej2 && enumC471750Iej != EnumC471750Iej.MULTI_TOPLIVE_MANUAL_REFRESH) {
            jCurrentTimeMillis = -1;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        C480460Ism.LIZ().getClass();
        FeedApi feedApi = (FeedApi) C480460Ism.LIZLLL(FeedApi.class);
        if (MultiTopLiveAddFeedApiParamsSetting.isEnable() && (enumC471750Iej == enumC471750Iej2 || (enumC471750Iej == EnumC471750Iej.AUTO_REFRESH && LJIILL == EnumC471720Ieg.TOP_LIVE))) {
            linkedHashMap = C2097608Jq.LJIIJ(new Pair("enable_mg_tab", String.valueOf(MultiGuestCentralizedEntranceStyleSetting.INSTANCE.hangoutEnable())));
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        feedApi.feed("/webcast/feed/", 0L, "tiktok_message_toplive", linkedHashMap).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS3S0100100_7(jCurrentTimeMillis, enumC471750Iej, 3), new AfS176S0100000_7(enumC471750Iej, 62));
        int i = C471740Iei.LIZ[enumC471750Iej.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "click";
                        } else {
                            str = "watch_later_change";
                        }
                    } else {
                        str = "back_from_live";
                    }
                } else {
                    str = "time_auto";
                }
            } else {
                str = "manual";
            }
        } else {
            str = "manual_pull_down";
        }
        if (enumC471750Iej != EnumC471750Iej.ENTER_LIVE_TAB && enumC471750Iej != EnumC471750Iej.MANUAL_REFRESH_LIVE_TAB && enumC471750Iej != EnumC471750Iej.MANUAL_REFRESH_PULL_DOWN) {
            enumC471720Ieg = LJIILL;
        } else {
            enumC471720Ieg = EnumC471720Ieg.LIVE_TAB;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_cover_refresh");
        c474500IjALIZ.LJJII(enumC471720Ieg.getEnterFrom(), "enter_from_merge");
        c474500IjALIZ.LJJII(enumC471720Ieg.getEnterMethod(), "enter_method");
        c474500IjALIZ.LJJII(str, "refresh_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC476860Imy
    public final int LJIJI(EnumC471790Ien enumC471790Ien) {
        if (enumC471790Ien == EnumC471790Ien.NEARBY) {
            return C471770Iel.LIZLLL;
        }
        return LJIIJ;
    }

    public static void LJJIFFI(long j, List list) {
        if (j > 0 && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((FeedItem) it2.next()).receiveTime = j;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0204, code lost:
    
        r0 = new com.bytedance.android.livesdk.model.FeedItem();
        r0.type = 22;
        r3.add(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c4  */
    /* JADX WARN: Type inference failed for: r0v109, types: [T, X.0IfS] */
    /* JADX WARN: Type inference failed for: r0v166, types: [T, X.0IfR] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0IfP] */
    /* JADX WARN: Type inference failed for: r0v94, types: [T, X.0IfO] */
    @Override // X.InterfaceC476860Imy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.live.network.response.BaseListResponse<com.bytedance.android.livesdk.model.FeedItem, com.bytedance.android.live.base.model.feed.FeedExtra> LJIIL(X.EnumC471790Ien r20, java.lang.Boolean r21) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager.LJIIL(X.0Ien, java.lang.Boolean):com.bytedance.android.live.network.response.BaseListResponse");
    }

    @Override // X.InterfaceC476860Imy
    public final void LJIILIIL(C0IVB c0ivb, EnumC471750Iej enumC471750Iej) {
        Map<String, String> linkedHashMap;
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceRefreshWithCallBack: running, from ");
        sbLIZ.append(enumC471750Iej);
        C20441214yg.LJIIIZ("SkylightDataManager", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        FeedApi feedApi = (FeedApi) C480460Ism.LIZLLL(FeedApi.class);
        if (MultiTopLiveAddFeedApiParamsSetting.isEnable() && enumC471750Iej == EnumC471750Iej.MULTI_TOPLIVE_MANUAL_REFRESH) {
            linkedHashMap = C2097608Jq.LJIIJ(new Pair("enable_mg_tab", String.valueOf(MultiGuestCentralizedEntranceStyleSetting.INSTANCE.hangoutEnable())));
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        feedApi.feed("/webcast/feed/", 0L, "tiktok_message_toplive", linkedHashMap).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(c0ivb, enumC471750Iej, 242), new AfS176S0100000_7(c0ivb, enumC471750Iej, 243));
    }

    @Override // X.InterfaceC476860Imy
    public final Pair<Integer, Pair<Integer, Integer>> LJIILLIIL(GuestApplyInfo guestApplyInfo, boolean z) {
        List<FeedItem> list;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse;
        List<FeedItem> list2;
        Room room;
        List<FeedItem> list3;
        FeedItem feedItem;
        List<FeedItem> list4;
        FeedItem feedItem2;
        List<FeedItem> list5;
        List<FeedItem> list6;
        FeedItem feedItem3;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse2 = LJ;
        if (baseListResponse2 != null && (list = baseListResponse2.data) != null) {
            Iterator<FeedItem> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().type == 21) {
                    if (i >= 0 && (baseListResponse = LJ) != null && (list2 = baseListResponse.data) != null) {
                        Iterator<FeedItem> it3 = list2.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            FeedItem next = it3.next();
                            if (next.type == 21 && (room = next.getRoom()) != null && room.getId() == guestApplyInfo.roomId) {
                                if (i2 >= 0) {
                                    if (guestApplyInfo.applyStatus == 3) {
                                        BaseListResponse<FeedItem, FeedExtra> baseListResponse3 = LJ;
                                        if (baseListResponse3 != null && (list6 = baseListResponse3.data) != null && (feedItem3 = (FeedItem) ListProtector.get(list6, i2)) != null) {
                                            feedItem3.type = 1;
                                            feedItem3.skylightMultiGuestApplyInfo = null;
                                        }
                                        return new Pair<>(Integer.valueOf(i2 + 1), null);
                                    }
                                    if (z) {
                                        if (i != i2) {
                                            BaseListResponse<FeedItem, FeedExtra> baseListResponse4 = LJ;
                                            if (baseListResponse4 == null || (list5 = baseListResponse4.data) == null) {
                                                return null;
                                            }
                                            Object obj = ListProtector.get(list5, i);
                                            ListProtector.set(list5, i, ListProtector.get(list5, i2));
                                            ListProtector.set(list5, i2, obj);
                                        }
                                        BaseListResponse<FeedItem, FeedExtra> baseListResponse5 = LJ;
                                        if (baseListResponse5 != null && (list4 = baseListResponse5.data) != null && (feedItem2 = (FeedItem) ListProtector.get(list4, i)) != null) {
                                            feedItem2.skylightMultiGuestApplyInfo = guestApplyInfo;
                                        }
                                        if (i == i2) {
                                            return new Pair<>(Integer.valueOf(i2 + 1), null);
                                        }
                                        int i3 = i2 + 1;
                                        return new Pair<>(Integer.valueOf(i3), new Pair(Integer.valueOf(i3), Integer.valueOf(i + 1)));
                                    }
                                    BaseListResponse<FeedItem, FeedExtra> baseListResponse6 = LJ;
                                    if (baseListResponse6 != null && (list3 = baseListResponse6.data) != null && (feedItem = (FeedItem) ListProtector.get(list3, i2)) != null) {
                                        feedItem.skylightMultiGuestApplyInfo = guestApplyInfo;
                                    }
                                    int i4 = i2 + 1;
                                    return new Pair<>(Integer.valueOf(i4), new Pair(Integer.valueOf(i4), Integer.valueOf(i4)));
                                }
                            } else {
                                i2++;
                            }
                        }
                        return null;
                    }
                } else {
                    i++;
                }
            }
        }
        return null;
    }

    public final void LJJI(LifecycleOwner lifecycleOwner, AObserverS211S0100000_7 aObserverS211S0100000_7) {
        C473350IhJ.LIZJ.observe(lifecycleOwner, aObserverS211S0100000_7);
    }

    @Override // X.InterfaceC476860Imy
    public final void LJIIJJI(LifecycleOwner lifecycleOwner, boolean z, EnumC471720Ieg enumC471720Ieg) {
        InterfaceC420801kM interfaceC420801kM;
        if (lifecycleOwner == null) {
            return;
        }
        LJIILL = enumC471720Ieg;
        WeakReference<InterfaceC420801kM> weakReference = LJIILJJIL;
        if (weakReference != null && (interfaceC420801kM = weakReference.get()) != null) {
            interfaceC420801kM.dispose();
        }
        LJIILJJIL = new WeakReference<>(C11NZ.LJJJJLI(LJJ(), TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0Ieh
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CommonSkylightDataManager@25b.startPolling$d$1");
                CommonSkylightDataManager.LIZ.LJIJ(EnumC471750Iej.AUTO_REFRESH);
                C1C7U.LIZIZ("CommonSkylightDataManager@25b.startPolling$d$1");
            }
        }, new C09JN() { // from class: X.0Iek
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CommonSkylightDataManager@25b.startPolling$d$2");
                C1C7U.LIZIZ("CommonSkylightDataManager@25b.startPolling$d$2");
            }
        }));
        if (z) {
            lifecycleOwner.getLifecycle().addObserver(LJIJJLI);
        }
        LIZIZ.LIZLLL();
    }
}
