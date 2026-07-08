package com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel;

import X.C01GW;
import X.C078N;
import X.C098200Yq;
import X.C09U0;
import X.C0DRR;
import X.C0DRV;
import X.C0DRX;
import X.C0P7S;
import X.C0PM7;
import X.C0PRC;
import X.C0Q3E;
import X.C1227904rF;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C1537720q7O;
import X.C1548820qPI;
import X.C1603960rqE;
import X.C1741890vQh;
import X.C1807670x8n;
import X.C1872780ypo;
import X.C189200o6;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C262100zr;
import X.C301530Brr;
import X.C443030HYv;
import X.C452501pT;
import X.C646370PWx;
import X.C651740PhM;
import X.C651800PhS;
import X.C651810PhT;
import X.C651820PhU;
import X.C651970Phj;
import X.C651980Phk;
import X.C661440Px0;
import X.C661450Px1;
import X.C661490Px5;
import X.C661510Px7;
import X.C661550PxB;
import X.C663990Q2r;
import X.C737030Svd;
import X.C948503nH;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634840OvC;
import X.InterfaceC641090PCp;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.model.SearchAwemePoolEnterInnerFlowRequestNG;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAwemePoolViewModelNG extends ViewModel implements InterfaceC1141530foN {
    public static final C651820PhU LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final AtomicInteger LLIZ;
    public static final C01GW<Map<String, Aweme>> LLIZLLLIL;
    public final Map<String, Aweme> LL;
    public C651810PhT LLILLJJLI;
    public final int LLILLL;
    public volatile C09U0 LLILZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0PhU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchAwemePoolViewModelNG.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = new Object() { // from class: X.0PhU
        };
        LLIZ = new AtomicInteger(-1);
        LLIZLLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(338));
        if (C078N.LIZ()) {
            C1548820qPI.LIZLLL("searchUpdateAwemePoolEvent", new InterfaceC1141530foN() { // from class: X.0PhO
                @Override // X.InterfaceC1141530foN
                public final void mh2(C262100zr c262100zr) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C651770PhP(c262100zr, null), 2);
                }
            });
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LLIZ.decrementAndGet();
        EventBus.LIZLLL().LJJI(this);
        if (!C078N.LIZ()) {
            C1548820qPI.LJIIIIZZ("searchUpdateAwemePoolEvent", this);
        }
        super.onCleared();
    }

    public SearchAwemePoolViewModelNG() {
        Map<String, Aweme> concurrentHashMap;
        if (!C078N.LIZ()) {
            C1548820qPI.LIZLLL("searchUpdateAwemePoolEvent", this);
        }
        if (C078N.LIZ()) {
            LLILZIL.getClass();
            concurrentHashMap = LLIZLLLIL.getValue();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        this.LL = concurrentHashMap;
        this.LLILLL = LLIZ.incrementAndGet();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Object c098200Yq;
        JSONObject jSONObjectLIZIZ;
        String string = null;
        if (C078N.LIZ()) {
            C09U0 c09u0 = this.LLILZ;
            if (c09u0 == null) {
                synchronized (this) {
                    c09u0 = this.LLILZ;
                    if (c09u0 == null) {
                        c09u0 = (C09U0) C1807670x8n.p();
                        this.LLILZ = c09u0;
                    }
                }
            }
            C948503nH.LJFF(this, c09u0.LIZ, new C651740PhM(c262100zr, this, null));
            return;
        }
        try {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                C1872780ypo.LIZ.getClass();
                jSONObjectLIZIZ = C1872780ypo.LIZIZ(interfaceC1107590evd);
            } else {
                jSONObjectLIZIZ = null;
            }
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (jSONObjectLIZIZ != null) {
                string = JSONObjectProtectorUtils.getString(jSONObjectLIZIZ, "awemes");
            }
            Type type = new TypeToken<List<? extends Aweme>>() { // from class: X.0PhN
            }.getType();
            c1227904rF.getClass();
            c098200Yq = (List) C1227904rF.LIZJ(string, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            wQ2((List) c098200Yq);
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) throws JSONException {
        Aweme aweme;
        String aid;
        WeakReference<C661440Px0> weakReference;
        C661440Px0 c661440Px0;
        InterfaceC641090PCp interfaceC641090PCp;
        SearchAwemePoolEnterInnerFlowRequestNG searchAwemePoolEnterInnerFlowRequestNG;
        C651810PhT c651810PhT;
        SearchAwemePoolEnterInnerFlowRequestNG searchAwemePoolEnterInnerFlowRequestNG2;
        InterfaceC634840OvC interfaceC634840OvC;
        if (this.LLILLL != LLIZ.get() || c737030Svd.LIZ != 66) {
            return;
        }
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            C651810PhT c651810PhT2 = this.LLILLJJLI;
            if (c651810PhT2 != null && (interfaceC634840OvC = c651810PhT2.LIZ) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("backAwemeID", aweme.getAid());
                interfaceC634840OvC.sendEvent("returnFromFeedWithInfo", jSONObject);
            }
            C651810PhT c651810PhT3 = this.LLILLJJLI;
            if (c651810PhT3 == null || (searchAwemePoolEnterInnerFlowRequestNG = c651810PhT3.LIZIZ) == null || !Intrinsics.LJFF(searchAwemePoolEnterInnerFlowRequestNG.backToEnterAweme, Boolean.TRUE) || (c651810PhT = this.LLILLJJLI) == null || (searchAwemePoolEnterInnerFlowRequestNG2 = c651810PhT.LIZIZ) == null || (aid = searchAwemePoolEnterInnerFlowRequestNG2.entryAwemeID) == null) {
                aid = aweme.getAid();
            }
            if (aid != null && (weakReference = C651800PhS.LIZ.get(aid)) != null && (c661440Px0 = weakReference.get()) != null) {
                C661490Px5 dataProvider = c661440Px0.getDataProvider();
                if (dataProvider != null && (interfaceC641090PCp = dataProvider.LJII) != null) {
                    String strLIZ = C0P7S.LIZ(interfaceC641090PCp.getIdentifier(), aweme.getAid());
                    C661510Px7 c661510Px7 = C661510Px7.LIZ;
                    boolean z = !c737030Svd.LJIIIZ;
                    long j = c737030Svd.LJFF;
                    long j2 = c737030Svd.LJIIIIZZ;
                    c661510Px7.getClass();
                    C661510Px7.LIZJ(j, j2, aweme, strLIZ, z);
                }
                HandlerHook.viewPost(c661440Px0, new ARunnableS110S0100000_10(c661440Px0, 82));
            }
        }
        this.LLILLJJLI = null;
    }

    public final void wQ2(List<? extends Aweme> list) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAwemePool ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (list != null) {
            for (Aweme aweme : list) {
                String aid = aweme.getAid();
                if (aid != null) {
                    this.LL.put(aid, aweme);
                }
            }
        }
    }

    public final void vQ2(C19EG c19eg, InterfaceC634840OvC interfaceC634840OvC, SearchAwemePoolEnterInnerFlowRequestNG searchAwemePoolEnterInnerFlowRequestNG) {
        boolean zBooleanValue;
        String str;
        WeakReference<C661440Px0> weakReference;
        C661440Px0 c661440Px0;
        C661490Px5 dataProvider;
        View view;
        View viewFindViewByIdSelector;
        C661440Px0 c661440Px02;
        C661450Px1 c661450Px1;
        C661490Px5 dataProvider2;
        C661550PxB c661550PxBLJ;
        LynxView lynxView;
        if (c19eg == null) {
            return;
        }
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        Boolean bool = searchAwemePoolEnterInnerFlowRequestNG.continueToPlay;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && C123100dR.LIZ(searchAwemePoolEnterInnerFlowRequestNG.containerID)) {
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            } else {
                view = null;
            }
            if ((view instanceof C1537720q7O) && (lynxView = (LynxView) view) != null) {
                viewFindViewByIdSelector = lynxView.findViewByIdSelector(searchAwemePoolEnterInnerFlowRequestNG.containerID);
            } else {
                viewFindViewByIdSelector = null;
            }
            if ((viewFindViewByIdSelector instanceof C661440Px0) && (c661440Px02 = (C661440Px0) viewFindViewByIdSelector) != null) {
                String str2 = searchAwemePoolEnterInnerFlowRequestNG.entryAwemeID;
                if (str2 != null) {
                    C651800PhS.LIZ.put(str2, new WeakReference<>(c661440Px02));
                }
                if ((c661440Px02 instanceof C661450Px1) && (c661450Px1 = (C661450Px1) c661440Px02) != null && (dataProvider2 = c661450Px1.getDataProvider()) != null && (c661550PxBLJ = dataProvider2.LJ()) != null) {
                    c661550PxBLJ.LJ = c661450Px1.getPosition();
                }
            }
        }
        this.LLILLJJLI = new C651810PhT(interfaceC634840OvC, searchAwemePoolEnterInnerFlowRequestNG);
        final C0DRR c0drr = new C0DRR(this, searchAwemePoolEnterInnerFlowRequestNG.awemeIDs, searchAwemePoolEnterInnerFlowRequestNG.loadMoreRequest);
        final AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(searchAwemePoolEnterInnerFlowRequestNG, 320);
        C1603960rqE.LIZ = new C0DRV(c19eg, new C0DRX(c0drr, awS589S0100000_10) { // from class: X.0DRW
            public final C0DRX LIZ;
            public final Function1<List<? extends Aweme>, Unit> LIZIZ;

            @Override // X.C0DRX
            public final Object LIZ(InterfaceC1364105Vn<? super List<? extends Aweme>> interfaceC1364105Vn) {
                return this.LIZ.LIZ(interfaceC1364105Vn);
            }

            @Override // X.C0DRX
            public final boolean getHasMore() {
                return this.LIZ.getHasMore();
            }

            @Override // X.C0DRX
            public final List<Aweme> getAwemeList() {
                List<Aweme> awemeList = this.LIZ.getAwemeList();
                this.LIZIZ.invoke(awemeList);
                return awemeList;
            }

            {
                this.LIZ = c0drr;
                this.LIZIZ = awS589S0100000_10;
            }
        });
        C651980Phk c651980Phk = C651970Phj.LLILLL;
        Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("is_aladdin", "1"), new Pair("search_result_id", searchAwemePoolEnterInnerFlowRequestNG.entryAwemeID), new Pair("rank", CardStruct.IStatusCode.DEFAULT), new Pair("is_search_scene", "1"), new Pair("search_keyword", c0prc.LLIZLLLIL), new Pair("search_type", "general"), new Pair("search_id", c0prc.LLILLL), new Pair("last_from_group_id", ((C0PM7) iSearchContextAbilityLJI.ak0().LIZJ()).LLILLL), new Pair("is_from_video", "1"), new Pair("search_entrance", ((C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ()).LL), new Pair("list_item_id", searchAwemePoolEnterInnerFlowRequestNG.entryAwemeID), new Pair("enter_from_merge", ((C646370PWx) iSearchContextAbilityLJI.wO2().LIZJ()).LLILLL), new Pair("enter_method", "video_cell"), new Pair("group_id", searchAwemePoolEnterInnerFlowRequestNG.entryAwemeID)), searchAwemePoolEnterInnerFlowRequestNG.LIZ);
        c651980Phk.getClass();
        C651980Phk.LJFF(mapLJIIL, false);
        C651980Phk.LJFF(searchAwemePoolEnterInnerFlowRequestNG.LIZ, true);
        if (Intrinsics.LJFF(searchAwemePoolEnterInnerFlowRequestNG.continueToPlay, bool2) && (str = searchAwemePoolEnterInnerFlowRequestNG.entryAwemeID) != null && (weakReference = C651800PhS.LIZ.get(str)) != null && (c661440Px0 = weakReference.get()) != null && (dataProvider = c661440Px0.getDataProvider()) != null) {
            C661510Px7.LIZ.getClass();
            C661510Px7.LIZ(dataProvider, true, false);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, searchAwemePoolEnterInnerFlowRequestNG.entryAwemeID);
        smartRouteBuildRoute.withParam("refer", "general_search");
        smartRouteBuildRoute.withParam("video_from", "from_search_mix");
        smartRouteBuildRoute.withParam("search_detail", C301530Brr.LIZ());
        smartRouteBuildRoute.withParam("page_type", 9);
        smartRouteBuildRoute.withParam("search_keyword", c0prc.LLIZLLLIL);
        smartRouteBuildRoute.withParam("is_update_search_result_id", true);
        smartRouteBuildRoute.withParam("search_id", c0prc.LLILLL);
        smartRouteBuildRoute.withParam("playlist_search_id", c0prc.LLILLL);
        smartRouteBuildRoute.withParam("is_from_video", 1);
        smartRouteBuildRoute.withParam("key_search_type", 3);
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
        smartRouteBuildRoute.withParam("previous_page", "general_search");
        if (C078N.LIZ()) {
            smartRouteBuildRoute.withParam("extra_load_more_upon_entrance", true);
        }
        this.LL.get(searchAwemePoolEnterInnerFlowRequestNG.entryAwemeID);
        C443030HYv.LIZ(smartRouteBuildRoute, searchAwemePoolEnterInnerFlowRequestNG.seekTime);
        String str3 = searchAwemePoolEnterInnerFlowRequestNG.LIZ.get("cid");
        if (str3 != null) {
            smartRouteBuildRoute.withParam("cid", str3);
        }
        String str4 = searchAwemePoolEnterInnerFlowRequestNG.LIZ.get("enter_method");
        if (str4 != null) {
            smartRouteBuildRoute.withParam("enter_method", str4);
        }
        Boolean bool3 = searchAwemePoolEnterInnerFlowRequestNG.isShowCollectionBanner;
        if (bool3 != null) {
            zBooleanValue = bool3.booleanValue();
        } else {
            zBooleanValue = false;
        }
        smartRouteBuildRoute.withParam("is_show_collect_banner", zBooleanValue);
        String str5 = searchAwemePoolEnterInnerFlowRequestNG.loadEmptyText;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        smartRouteBuildRoute.withParam("load_empty_text", str5);
        Boolean bool4 = searchAwemePoolEnterInnerFlowRequestNG.isShowCollectionBanner;
        if (bool4 != null && bool4.booleanValue()) {
            String str7 = searchAwemePoolEnterInnerFlowRequestNG.tabShowName;
            if (str7 == null) {
                str7 = "";
            }
            smartRouteBuildRoute.withParam("tab_show_name", str7);
            String str8 = searchAwemePoolEnterInnerFlowRequestNG.tabShowCount;
            if (str8 != null) {
                str6 = str8;
            }
            smartRouteBuildRoute.withParam("tab_count", str6);
        }
        HashMap map = new HashMap();
        map.put("is_enable_inner_flow_lynx_container", searchAwemePoolEnterInnerFlowRequestNG.isEnableLynxContainer);
        PoiDataStruct poiDataStruct = searchAwemePoolEnterInnerFlowRequestNG.poiData;
        if (poiDataStruct != null) {
            map.put("is_show_poi_bottom_bar", "1");
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(poiDataStruct);
            strLJIIIIZZ.toString();
            map.put("poi_data", strLJIIIIZZ);
            for (Map.Entry<String, String> entry : searchAwemePoolEnterInnerFlowRequestNG.LIZ.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "pass_through_log_params")) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        smartRouteBuildRoute.withParam("feed_param_extra", map);
        smartRouteBuildRoute.open();
    }
}
