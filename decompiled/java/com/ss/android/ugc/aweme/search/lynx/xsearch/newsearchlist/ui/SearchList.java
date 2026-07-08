package com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui;

import X.AbstractC20634115oh;
import X.C08JS;
import X.C0DYC;
import X.C0H9H;
import X.C0PMK;
import X.C0R0K;
import X.C0R0L;
import X.C0R0M;
import X.C0R0N;
import X.C0R0P;
import X.C0R0S;
import X.C0R0T;
import X.C0R0W;
import X.C0R0Y;
import X.C0R45;
import X.C1298720jtu;
import X.C1319030kQf;
import X.C1319150kQr;
import X.C15438062q;
import X.C1903607cw;
import X.C301440Bri;
import X.C640750PBh;
import X.C644690PQl;
import X.C651930Phf;
import X.C688780R0a;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC420801kM;
import X.InterfaceC688940R0q;
import X.ViewTreeObserverOnPreDrawListenerC688950R0r;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.ISearchList;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.EcomSearchListPlayer;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.SearchListPlayer;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchList extends UIList implements ISearchList {
    public C0R0M LLLLII;
    public long LLLLIIIILLL;
    public Long LLLLIIL;
    public JavaOnlyMap LLLLIILL;
    public JavaOnlyMap LLLLIILLL;
    public final List<Function0<Unit>> LLLLIL;

    @InterfaceC1967107nB
    public void becomeactive() {
        this.LLLLII.LIZIZ().LIZIZ(true);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final JSONObject getPlatformCustomInfo() {
        this.LLLLII.getClass();
        return new JSONObject();
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        Boolean bool;
        Iterator it2 = ((ArrayList) this.LLLLIL).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        ((ArrayList) this.LLLLIL).clear();
        this.LLIZLLLIL = false;
        if (this.LLLLIIL == null) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.LLLLIIIILLL);
            this.LLLLIIL = lValueOf;
            if (lValueOf != null) {
                C644690PQl.LJIJJLI = lValueOf.longValue();
            }
        }
        super.onPropsUpdated();
        C1319030kQf c1319030kQf = this.LLILLL;
        C0R0L c0r0l = c1319030kQf instanceof C0R0L ? (C0R0L) c1319030kQf : null;
        if (c0r0l != null) {
            JavaOnlyMap javaOnlyMap = this.LLLLIILL;
            if (javaOnlyMap != null) {
                c0r0l.LLLLIL(javaOnlyMap);
                this.LLLLIILL = null;
            } else {
                JavaOnlyMap javaOnlyMap2 = this.LLLLIILLL;
                if (javaOnlyMap2 != null) {
                    ReadableArray array = javaOnlyMap2.getArray("updateAction");
                    ReadableArray array2 = javaOnlyMap2.getArray("insertAction");
                    ReadableArray array3 = javaOnlyMap2.getArray("removeAction");
                    boolean z = javaOnlyMap2.getBoolean("needUpdate", false);
                    if (array3 != null) {
                        for (int size = array3.size() - 1; -1 < size; size--) {
                            c0r0l.LLJLL.LIZIZ.remove(Integer.valueOf(array3.getInt(size)));
                        }
                    }
                    if (array2 != null) {
                        int size2 = array2.size();
                        for (int i = 0; i < size2; i++) {
                            ReadableMap map = array2.getMap(i);
                            c0r0l.LLJLL.LIZIZ.add(map.getInt("position"), map.getString("item-key"));
                        }
                    }
                    if (array != null) {
                        int size3 = array.size();
                        for (int i2 = 0; i2 < size3; i2++) {
                            ReadableMap map2 = array.getMap(i2);
                            c0r0l.LLJLL.LIZIZ.set(map2.getInt("from"), map2.getString("item-key"));
                        }
                    }
                    if (z) {
                        ((RecyclerView) c0r0l.LLJLILLLLZIIL.mView).invalidateItemDecorations();
                    }
                    this.LLLLIILLL = null;
                } else {
                    Object objLIZ = C0DYC.LIZ(this.mContext, "__is_no_diff");
                    if (!(objLIZ instanceof Boolean) || (bool = (Boolean) objLIZ) == null || !bool.booleanValue()) {
                        c0r0l.LLLLIL(LJJIIZI());
                    }
                }
            }
        }
        this.LLLLII.LIZIZ().getClass();
        C0R0K c0r0kLIZIZ = this.LLLLII.LIZIZ();
        C1319030kQf c1319030kQf2 = this.LLILLL;
        c0r0kLIZIZ.LJIJ = c1319030kQf2 != null ? c1319030kQf2.LLJ : null;
        C0R0N c0r0n = c0r0kLIZIZ.LJIJI;
        if (c0r0n != null) {
            C0R0S c0r0s = (C0R0S) c0r0n.LLILLL.getValue();
            C0R0K c0r0k = c0r0n.LLILLJJLI;
            c0r0s.LLILZLL = c0r0k.LJIIJ;
            JavaOnlyArray javaOnlyArray = c0r0k.LJIJ;
            c0r0s.LLIZ = javaOnlyArray != null ? javaOnlyArray.size() : 0;
        }
        c0r0kLIZIZ.LJJI = false;
        C0R0M c0r0m = this.LLLLII;
        if (!C1903607cw.LIZ(c0r0m.LL.mContext.LLJJIII)) {
            if (c0r0m.LIZIZ().LIZJ != -1) {
                C0R0K c0r0kLIZIZ2 = c0r0m.LIZIZ();
                final C0R0K c0r0kLIZIZ3 = c0r0m.LIZIZ();
                c0r0kLIZIZ2.LIZ = new C0PMK(c0r0kLIZIZ3) { // from class: X.0Pd3
                    public final C0R0K LIZ;

                    @Override // X.C0PMK
                    public final List<Aweme> Mk() {
                        DynamicPatch dynamicPatch;
                        List<DynamicPatch.SearchMultiTabListData> awemeMultiTabList;
                        C0R0K c0r0k2 = this.LIZ;
                        int i3 = c0r0k2.LIZJ;
                        C649040Pd0 c649040Pd0LIZ = C647140PZw.LIZ.LIZ(c0r0k2.LJIIIIZZ);
                        if (c649040Pd0LIZ == null || (dynamicPatch = c649040Pd0LIZ.LIZ) == null || (awemeMultiTabList = dynamicPatch.getAwemeMultiTabList()) == null || i3 < 0 || i3 >= awemeMultiTabList.size()) {
                            return null;
                        }
                        return ((DynamicPatch.SearchMultiTabListData) ListProtector.get(awemeMultiTabList, i3)).tabAwemeList;
                    }

                    {
                        this.LIZ = c0r0kLIZIZ3;
                    }
                };
            } else if (c0r0m.LIZIZ().LJIIIIZZ != -1) {
                C0R0K c0r0kLIZIZ4 = c0r0m.LIZIZ();
                final C0R0K c0r0kLIZIZ5 = c0r0m.LIZIZ();
                c0r0kLIZIZ4.LIZ = new C0PMK(c0r0kLIZIZ5) { // from class: X.0Pd4
                    public final C0R0K LIZ;

                    @Override // X.C0PMK
                    public final List<Aweme> Mk() {
                        DynamicPatch dynamicPatch;
                        C649040Pd0 c649040Pd0LIZ = C647140PZw.LIZ.LIZ(this.LIZ.LJIIIIZZ);
                        if (c649040Pd0LIZ == null || (dynamicPatch = c649040Pd0LIZ.LIZ) == null) {
                            return null;
                        }
                        return dynamicPatch.getAwemeList();
                    }

                    {
                        this.LIZ = c0r0kLIZIZ5;
                    }
                };
            }
        }
        if (C301440Bri.LIZ() && this.LLLLII.LIZIZ().LJIILJJIL) {
            this.LLLLII.LIZLLL(C0R0P.DOUBLE_COLUMN);
        } else {
            this.LLLLII.LIZLLL(C0R0P.DEFAULT);
        }
    }

    @InterfaceC1967107nB
    public void resignactive() {
        this.LLLLII.LIZIZ().LIZIZ(false);
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList, com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        T t;
        super.destroy();
        C0R0M c0r0m = this.LLLLII;
        for (InterfaceC420801kM interfaceC420801kM : c0r0m.LIZ()) {
            if (!interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
            }
        }
        Iterator<InterfaceC688940R0q> it2 = c0r0m.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        c0r0m.LLILZ.clear();
        c0r0m.LIZ().clear();
        c0r0m.LIZIZ().LIZ();
        SearchList searchList = c0r0m.LL;
        if (searchList == null || (t = searchList.mView) == 0) {
            return;
        }
        t.setTag(R.id.u74, null);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        this.LLLLIIIILLL = System.currentTimeMillis();
        super.initialize();
        this.mView.addOnAttachStateChangeListener(new C0R45(this, 6));
        ISearchList.LJJIZ.getClass();
        this.LLLLII.LIZIZ().LJIIZILJ = new C0R0Y(this, C0R0T.LIZIZ.getValue());
        C0R0M c0r0m = this.LLLLII;
        if (a0.LJJIIZI(c0r0m.LL.mContext.LLJJIII, "tiktok_ecommerce_general_products_card_v3", false)) {
            c0r0m.LIZJ(new EcomSearchListPlayer(c0r0m.LL, c0r0m.LIZIZ()));
        } else {
            c0r0m.LIZJ(new SearchListPlayer(c0r0m.LL, c0r0m.LIZIZ()));
        }
        final SearchList searchList = c0r0m.LL;
        final C0R0K c0r0kLIZIZ = c0r0m.LIZIZ();
        c0r0m.LIZJ(new InterfaceC688940R0q(searchList, c0r0kLIZIZ) { // from class: X.0PMJ
            public final SearchList LL;
            public final C0R0K LLILLJJLI;

            @Override // X.InterfaceC688940R0q
            public final void destroy() {
                EventBus.LIZLLL().LJJI(this);
            }

            public final List<C0PML> LIZ(ViewGroup viewGroup) {
                ViewGroup viewGroup2;
                ArrayList arrayList = new ArrayList();
                if (viewGroup == null) {
                    return arrayList;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
                        arrayList.addAll(LIZ(viewGroup2));
                        if (viewGroup2 instanceof C0PML) {
                            arrayList.add(viewGroup2);
                        }
                    }
                }
                return arrayList;
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onLynxOpenGeneralizedMultiVideoEvent(AnonymousClass0343 anonymousClass0343) {
                C0PML next;
                String str = anonymousClass0343.LIZ;
                Iterator<C0PML> it2 = LIZ((ViewGroup) this.LL.mView).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJIIIIZZ(str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0PML c0pml = next;
                if (c0pml != null) {
                    c0pml.LJFF();
                }
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void openDetailPage(C2036407yM c2036407yM) {
                List<Aweme> listMk;
                String string;
                String strLJ;
                Object next;
                C1606420ruC c1606420ruCLIZ;
                Bundle bundleLJFF;
                Fragment fragmentLIZ;
                View view;
                T t = this.LL.mView;
                new C667750QHd(C1388190mED.LIZ(t.getContext()), C651580Ph6.LIZLLL(t)).LJ();
                Bundle bundle = c2036407yM.LIZ;
                Map<String, String> map = c2036407yM.LIZJ;
                C0PMK c0pmk = this.LLILLJJLI.LIZ;
                if (c0pmk == null || (listMk = c0pmk.Mk()) == null || (string = bundle.getString(FollowStatusChangeMethod.PARAM_UID)) == null) {
                    return;
                }
                Iterator it2 = ((ArrayList) LIZ((ViewGroup) this.LL.mView)).iterator();
                while (true) {
                    strLJ = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((C0PML) next).LJIIIIZZ(string)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0PML c0pml = (C0PML) next;
                if (c0pml != null && (view = c0pml.getView()) != null) {
                    c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
                } else {
                    c1606420ruCLIZ = null;
                }
                C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
                C786410Ut5.LJJJI("enter_from", c0prc.LIZIZ(), bundle);
                C786410Ut5.LJJJI("search_keyword", c0prc.LLIZLLLIL, bundle);
                C786410Ut5.LJJJI("search_id", c0prc.LLILLL, bundle);
                C786410Ut5.LJJJI("key_search_type", C0PSI.LIZ(c0prc.LL), bundle);
                SmartRoute smartRoute = new SmartRoute(C1388190mED.LIZ(this.LL.mView.getContext()));
                smartRoute.withUrl("//aweme/detail");
                if (c1606420ruCLIZ != null) {
                    bundleLJFF = c1606420ruCLIZ.LJFF();
                } else {
                    bundleLJFF = null;
                }
                smartRoute.withBundleAnimation(bundleLJFF);
                smartRoute.withParam("activity_has_activity_options", true);
                smartRoute.withParam("feed_param_extra", C2097608Jq.LJI(new Pair("token_type", "tt_trendingcontent")));
                if (C123100dR.LIZ(map.get("cid"))) {
                    smartRoute.withParam("cid", map.get("cid"));
                }
                smartRoute.withParam("search_detail", C301530Brr.LIZ());
                String searchFeedType = AwemeBizExtKt.getSearchFeedType((Aweme) ListProtector.get(listMk, 0));
                if (Intrinsics.LJFF(searchFeedType, "SearchHotSpot")) {
                    C1440005kM.LIZ(new C7816033m(listMk, string));
                    bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 71);
                    smartRoute.withParam("video_from", "from_search_mix");
                } else if (Intrinsics.LJFF(searchFeedType, "search_horizontal_tab_lynx")) {
                    C1603960rqE.LJFF = 74;
                    bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 74);
                    smartRoute.withParam("video_from", "from_search_activity");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str = map.get("activity_keyword");
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("activity_keyword", str);
                    String str3 = map.get("video_card_type");
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap.put("video_card_type", str3);
                    String str4 = map.get("search_id");
                    if (str4 == null) {
                        str4 = "";
                    }
                    linkedHashMap.put("search_id", str4);
                    String string2 = map.get("search_keyword");
                    if (string2 == null && (string2 = bundle.getString("search_keyword")) == null) {
                        string2 = "";
                    }
                    linkedHashMap.put("search_keyword", string2);
                    String string3 = map.get("search_type");
                    if (string3 == null && (string3 = bundle.getString("key_search_type")) == null) {
                        string3 = "";
                    }
                    linkedHashMap.put("search_type", string3);
                    String str5 = map.get("search_result_id");
                    if (str5 != null) {
                        str2 = str5;
                    }
                    linkedHashMap.put("search_result_id", str2);
                    C651970Phj.LLILLL.getClass();
                    C651980Phk.LJFF(linkedHashMap, false);
                } else {
                    C0PIF c0pif = C0PIF.LIZ;
                    T t2 = this.LL.mView;
                    c0pif.getClass();
                    InterfaceC641090PCp interfaceC641090PCpLIZ = C642600PIk.LIZ(t2);
                    if (interfaceC641090PCpLIZ != null) {
                        fragmentLIZ = interfaceC641090PCpLIZ.LIZ();
                    } else {
                        fragmentLIZ = null;
                    }
                    C0PIF.LJIIJ(fragmentLIZ);
                    C0PNL c0pnl = new C0PNL();
                    c0pnl.LJIL(listMk);
                    Aweme aweme = (Aweme) C13LP.LJJJLZIJ(0, listMk);
                    if (aweme != null) {
                        strLJ = C643200PKs.LJ(aweme);
                    }
                    c0pnl.LLJJL = strLJ;
                    String strLJIIIZ = C0PIF.LJIIIZ(this.LL.mView);
                    if (strLJIIIZ == null) {
                        strLJIIIZ = CardStruct.IStatusCode.DEFAULT;
                    }
                    c0pnl.LLJJJJ = strLJIIIZ;
                    c0pnl.LLJJJJJIL = string;
                    c0pnl.LLJJJJLIIL = false;
                    C1603960rqE.LIZ = c0pnl;
                    smartRoute.withParam("video_from", "from_search_ad_no_request");
                }
                if (c0pml != null) {
                    c0pml.LJFF();
                }
                smartRoute.withParam(bundle);
                smartRoute.open();
            }

            {
                this.LL = searchList;
                this.LLILLJJLI = c0r0kLIZIZ;
                EventBus.LIZLLL().LJIJJ(this);
            }
        });
        final SearchList searchList2 = c0r0m.LL;
        c0r0m.LIZIZ();
        c0r0m.LIZJ(new InterfaceC688940R0q(searchList2) { // from class: X.0PMM
            public final SearchList LL;

            @Override // X.InterfaceC688940R0q
            public final void destroy() {
                EventBus.LIZLLL().LJJI(this);
            }

            {
                this.LL = searchList2;
                EventBus.LIZLLL().LJIJJ(this);
            }

            public final List<C0PML> LIZ(ViewGroup viewGroup) {
                ViewGroup viewGroup2;
                ArrayList arrayList = new ArrayList();
                if (viewGroup == null) {
                    return arrayList;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
                        arrayList.addAll(LIZ(viewGroup2));
                        if (viewGroup2 instanceof C0PML) {
                            arrayList.add(viewGroup2);
                        }
                    }
                }
                return arrayList;
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onOpenMiniDramaInnerFlowEvent(C1435505jd c1435505jd) {
                C0PML next;
                String string = c1435505jd.LIZ.getString(FollowStatusChangeMethod.PARAM_UID);
                Iterator<C0PML> it2 = LIZ((ViewGroup) this.LL.mView).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJIIIIZZ(string)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0PML c0pml = next;
                if (c0pml == null) {
                    return;
                }
                String string2 = c1435505jd.LIZ.getString("inner_drama_url");
                c0pml.LIZJ();
                c0pml.LJFF();
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1388190mED.LIZ(this.LL.mView.getContext()), string2);
                smartRouteBuildRoute.withParam("use_share_player", "1");
                smartRouteBuildRoute.open();
            }

            @C14EU
            public final void onReceiveSyncMiniDramaListEvent(C7805033b c7805033b) {
                AbstractC21673619ry adapter;
                int i = c7805033b.LIZIZ;
                if (i >= 0 && (adapter = ((RecyclerView) this.LL.mView).getAdapter()) != null && i < adapter.getItemCount()) {
                    SearchList searchList3 = this.LL;
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    javaOnlyMap.put("position", Integer.valueOf(c7805033b.LIZIZ));
                    searchList3.getClass();
                    searchList3.scrollToPosition(javaOnlyMap, new C0PMN());
                }
            }
        });
        c0r0m.LIZJ(new C0R0N(c0r0m.LL, c0r0m.LIZIZ()));
        SearchList searchList3 = c0r0m.LL;
        c0r0m.LIZIZ();
        c0r0m.LIZJ(new C651930Phf(searchList3));
        c0r0m.LIZJ(new C688780R0a(c0r0m.LL, c0r0m.LIZIZ()));
        c0r0m.LIZJ(new C0R0W(c0r0m.LL, c0r0m.LIZIZ()));
    }

    public SearchList(s sVar) {
        super(sVar, null);
        C0R0M c0r0m = this.LLLLII;
        this.LLLLII = c0r0m == null ? new C0R0M(this) : c0r0m;
        this.LLLLIL = new ArrayList();
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList
    public final RecyclerView LJJIJLIJ(final Context context) {
        return new RecyclerView(context, this) { // from class: X.0R0V
            public final SearchList LL;
            public final WeakReference<SearchList> LLILLJJLI;

            @Override // android.view.ViewGroup, android.view.View
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                C688820R0e c688820R0e;
                ViewParent parent;
                SearchList searchList;
                C688800R0c c688800R0c;
                UIComponent uIComponent;
                boolean z;
                WeakReference<SearchList> weakReference = this.LLILLJJLI;
                if (weakReference != null && (searchList = weakReference.get()) != null && (c688800R0c = searchList.LLLLII.LIZIZ().LJIJJ) != null) {
                    C0R0K c0r0k = c688800R0c.LIZ.LLILLJJLI;
                    if (c0r0k.LJIIJ && c0r0k.LJIJ != null && motionEvent.getActionIndex() == 0) {
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            if ((motionEvent.getAction() == 0 || (motionEvent.getAction() == 2 && c688800R0c.LIZ.LLILLL == -1.0f)) && c688800R0c.LIZ.LIZIZ(c688800R0c.LIZIZ)) {
                                C0R0W c0r0w = c688800R0c.LIZ;
                                c0r0w.LLILLJJLI.LJJ = true;
                                c0r0w.LLILLL = motionEvent.getX();
                                c688800R0c.LIZ.LLILZ = motionEvent.getY();
                                c688800R0c.LIZIZ.requestDisallowInterceptTouchEvent(true);
                            } else {
                                C0R0W c0r0w2 = c688800R0c.LIZ;
                                if (c0r0w2.LLILLJJLI.LJJ && c0r0w2.LLILLL != -1.0f) {
                                    float x = motionEvent.getX() - c688800R0c.LIZ.LLILLL;
                                    float y = motionEvent.getY();
                                    C0R0W c0r0w3 = c688800R0c.LIZ;
                                    float f = y - c0r0w3.LLILZ;
                                    c0r0w3.LLILLL = motionEvent.getX();
                                    c688800R0c.LIZ.LLILZ = motionEvent.getY();
                                    if (Math.abs(f) > c688800R0c.LIZ.LLILZIL && Math.abs(f) > ((double) Math.abs(x)) * 0.5d) {
                                        c688800R0c.LIZIZ.getParent().requestDisallowInterceptTouchEvent(false);
                                    } else {
                                        C0R0W c0r0w4 = c688800R0c.LIZ;
                                        if (c0r0w4.LLILZLL == 1 && c0r0w4.LIZIZ(c688800R0c.LIZIZ)) {
                                            C0R0W c0r0w5 = c688800R0c.LIZ;
                                            C1318570kPv c1318570kPvLIZ = c0r0w5.LIZ(c688800R0c.LIZIZ);
                                            float f2 = -x;
                                            if (c1318570kPvLIZ != null && (uIComponent = c1318570kPvLIZ.LL.LLILLJJLI) != null && f2 != 0.0f) {
                                                if (f2 > 0.0f) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                c0r0w5.LIZJ(z);
                                                uIComponent.setWidth((int) Math.max(Math.min(uIComponent.getWidth() + f2 + f2, c0r0w5.LLILLJJLI.LJIL), 0.0f));
                                                c1318570kPvLIZ.itemView.requestLayout();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            C0R0W c0r0w6 = c688800R0c.LIZ;
                            c0r0w6.LLILLJJLI.LJJ = false;
                            c0r0w6.LLILLL = -1.0f;
                            c0r0w6.LLILZ = -1.0f;
                        }
                    }
                }
                C688970R0t edgeEffectFactory = getEdgeEffectFactory();
                if ((edgeEffectFactory instanceof C688820R0e) && (c688820R0e = (C688820R0e) edgeEffectFactory) != null) {
                    C688810R0d c688810R0d = c688820R0e.LIZ;
                    c688810R0d.getClass();
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 2) {
                            float f3 = x2 - c688810R0d.LIZ;
                            float f4 = y2 - c688810R0d.LIZIZ;
                            if (C0QDN.LIZJ(getContext())) {
                                if (Math.abs(f4) > Math.abs(f3)) {
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(false);
                                    }
                                } else {
                                    ViewParent parent3 = getParent();
                                    if (parent3 != null) {
                                        parent3.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            } else if (Math.abs(f4) > scaledTouchSlop && Math.abs(f4) > Math.abs(f3) && (parent = getParent()) != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    } else {
                        c688810R0d.LIZ = x2;
                        c688810R0d.LIZIZ = y2;
                        if (C0QDN.LIZJ(getContext())) {
                            ViewParent parent4 = getParent();
                            if (parent4 != null) {
                                parent4.requestDisallowInterceptTouchEvent(false);
                            }
                        } else {
                            ViewParent parent5 = getParent();
                            if (parent5 != null) {
                                parent5.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            {
                super(context);
                this.LL = this;
                setTag(R.id.p7s, Unit.LIZ);
                if (context instanceof s) {
                    new WeakReference(context);
                    this.LLILLJJLI = new WeakReference<>(this.LL);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0R0b, X.0kQr] */
    @Override // com.lynx.tasm.behavior.ui.list.UIList
    /* JADX INFO: renamed from: LJJIZ */
    public final RecyclerView createView(Context context) {
        final RecyclerView recyclerViewLJJIZ = super.createView(context);
        recyclerViewLJJIZ.clearOnScrollListeners();
        C0R0M c0r0m = this.LLLLII;
        if (c0r0m == null) {
            c0r0m = new C0R0M(this);
        }
        this.LLLLII = c0r0m;
        final C1298720jtu c1298720jtu = this.mContext.LLIZ;
        ?? r2 = new C1319150kQr(c1298720jtu, recyclerViewLJJIZ) { // from class: X.0R0b
            public static final /* synthetic */ int LJ = 0;

            @Override // X.C1319150kQr, X.InterfaceC1319180kQu
            public final void LIZJ(C1318570kPv c1318570kPv) {
                super.LIZJ(c1318570kPv);
            }
        };
        this.LLJJIJIIJIL = r2;
        C0R0L c0r0l = new C0R0L(this, r2, this.LLLLII.LIZIZ());
        this.LLILLL = c0r0l;
        recyclerViewLJJIZ.setAdapter(c0r0l);
        return recyclerViewLJJIZ;
    }

    @InterfaceC1312540kGC(name = "activearea")
    public void activeAreaFromLynx(ReadableMap readableMap) {
        C0R0M c0r0m = this.LLLLII;
        c0r0m.getClass();
        if (readableMap instanceof JavaOnlyMap) {
            c0r0m.LJ((JavaOnlyMap) readableMap, ISearchList.ActiveArea.class, new AwS589S0100000_10(c0r0m, 156));
        }
    }

    @InterfaceC1312540kGC(name = "bounce")
    public void bounceFromLynx(boolean z) {
        this.LLLLII.LIZIZ().LIZJ(z);
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    @InterfaceC1312540kGC(name = "snaptogrid")
    public void enableSnapGrid(boolean z) {
        C0R0K c0r0kLIZIZ = this.LLLLII.LIZIZ();
        c0r0kLIZIZ.LJIIL = z;
        C0R0N c0r0n = c0r0kLIZIZ.LJIILIIL;
        if (c0r0n != null && z) {
            ((AbstractC20634115oh) c0r0n.LLILLJJLI.LJJIFFI.getValue()).LIZIZ((RecyclerView) c0r0n.LL.mView);
        }
    }

    @InterfaceC1312540kGC(name = "horizontalstyle")
    public void horizontalStyleFromLynx(ReadableMap readableMap) {
        Object objLIZ;
        C0R0M c0r0m = this.LLLLII;
        c0r0m.getClass();
        if (readableMap instanceof JavaOnlyMap) {
            C0R0K c0r0kLIZIZ = c0r0m.LIZIZ();
            try {
                objLIZ = C08JS.LIZ(C08JS.LIZLLL(readableMap), ISearchList.HorizontalStyle.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                objLIZ = null;
            }
            c0r0kLIZIZ.LIZLLL((ISearchList.HorizontalStyle) objLIZ);
        }
    }

    @InterfaceC1312540kGC(name = "isSearchAutoPlayNode")
    public void markAsAutoPlayNode(boolean z) {
        T t;
        C0R0M c0r0m = this.LLLLII;
        if (!z) {
            c0r0m.getClass();
            return;
        }
        SearchList searchList = c0r0m.LL;
        if (searchList == null || (t = searchList.mView) == 0) {
            return;
        }
        t.setTag(R.id.u74, Unit.LIZ);
    }

    @InterfaceC1967107nB
    public void scrolltoindex(ReadableMap readableMap) {
        C0R0M c0r0m = this.LLLLII;
        c0r0m.getClass();
        if (readableMap instanceof JavaOnlyMap) {
            c0r0m.LJ((JavaOnlyMap) readableMap, ISearchList.ScrollAnchorInfo.class, new AwS589S0100000_10(c0r0m, 157));
        } else {
            c0r0m.LIZIZ().getClass();
        }
    }

    @InterfaceC1312540kGC(name = "sendPlayStatusEventForUnplayAbleView")
    public void sendPlayStatusEventForUnplayableView(boolean z) {
        SearchListPlayer searchListPlayer = this.LLLLII.LIZIZ().LJIILL;
        if (searchListPlayer != null) {
            searchListPlayer.LLILZ = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList
    public final void setListPlatformInfo(ReadableMap readableMap) {
        super.setListPlatformInfo(readableMap);
        this.LLLLIILL = (JavaOnlyMap) readableMap;
        this.LLLLIILLL = null;
        C0DYC.LIZIZ(this.mContext, "__is_no_diff", Boolean.FALSE);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setScrollMonitorTag(String str) {
        ((ArrayList) this.LLLLIL).add(new AwS554S0100000_10(str, this, 325));
    }

    @InterfaceC1312540kGC(name = fe.e)
    public void setSessionId(String str) {
        if (!C1903607cw.LIZ(this.mContext.LLJJIII) && str != null && str.length() != 0) {
            C0R0M c0r0m = this.LLLLII;
            c0r0m.getClass();
            if (str != null && str.length() != 0) {
                c0r0m.LIZIZ().LJ(CastIntegerProtector.parseInt(str));
            }
        }
    }

    @InterfaceC1312540kGC(name = "tabindex")
    public void setTabIndex(Integer num) {
        boolean zBooleanValue;
        Boolean bool;
        C0R0M c0r0m = this.LLLLII;
        if (num != null) {
            C0R0K c0r0kLIZIZ = c0r0m.LIZIZ();
            int iIntValue = num.intValue();
            int i = c0r0kLIZIZ.LIZJ;
            c0r0kLIZIZ.LIZJ = iIntValue;
            SearchListPlayer searchListPlayer = c0r0kLIZIZ.LIZLLL;
            if (searchListPlayer != null && i != -1) {
                Object objLIZ = C0DYC.LIZ(searchListPlayer.LL.mContext, "search_list_play_state");
                if ((objLIZ instanceof Boolean) && (bool = (Boolean) objLIZ) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                searchListPlayer.LLILLL = zBooleanValue;
                searchListPlayer.LLIZ = null;
                if (searchListPlayer.LLILZ) {
                    searchListPlayer.LLILZLL = null;
                    return;
                }
                return;
            }
            return;
        }
        c0r0m.getClass();
    }

    @InterfaceC1312540kGC(name = "skipAutoPlayOnViewAttachToWindow")
    public void skipAutoPlayOnViewAttachToWindow(boolean z) {
        this.LLLLII.LIZIZ().getClass();
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList
    public final void updateListActionInfo(ReadableMap readableMap) {
        super.updateListActionInfo(readableMap);
        this.LLLLIILL = null;
        this.LLLLIILLL = (JavaOnlyMap) readableMap;
        C0DYC.LIZIZ(this.mContext, "__is_no_diff", Boolean.TRUE);
    }

    @InterfaceC1312540kGC(name = "autoplayverticalstyle")
    public void useDoubleColumnAutoplayStyle(boolean z) {
        this.LLLLII.LIZIZ().LJIILJJIL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutFinish(long j, LynxBaseUI lynxBaseUI) {
        C0R0L c0r0l;
        int i;
        super.onLayoutFinish(j, lynxBaseUI);
        if (LJJJJI()) {
            String str = null;
            if ((lynxBaseUI instanceof UIComponent) && lynxBaseUI != null) {
                C1319030kQf c1319030kQf = this.LLILLL;
                if ((c1319030kQf instanceof C0R0L) && (c0r0l = (C0R0L) c1319030kQf) != null) {
                    UIComponent uIComponent = (UIComponent) lynxBaseUI;
                    if (uIComponent != null) {
                        str = uIComponent.LLILLJJLI;
                    }
                    if (Intrinsics.LJFF(str, "bounce-view") && !c0r0l.LLJLL.LJJI && uIComponent != null) {
                        if (uIComponent.getWidth() == 0 && (i = c0r0l.LLJLL.LJIL) > 0) {
                            uIComponent.setWidth(i);
                        }
                        T t = uIComponent.mView;
                        ViewTreeObserverOnPreDrawListenerC688950R0r viewTreeObserverOnPreDrawListenerC688950R0r = new ViewTreeObserverOnPreDrawListenerC688950R0r(t, new AwS219S0300000_10(uIComponent, uIComponent, c0r0l, 13));
                        C786410Ut5.y3(t.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC688950R0r);
                        t.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC688950R0r);
                    }
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList
    @InterfaceC1967107nB
    public void scrollToPosition(ReadableMap readableMap, Callback callback) {
        int i;
        Object obj;
        C0R0M c0r0m = this.LLLLII;
        c0r0m.getClass();
        int i2 = readableMap.getInt("position");
        try {
            i = readableMap.getInt("offset");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = 0;
        }
        int iLIZIZ = C0H9H.LIZIZ(i);
        Set<InterfaceC688940R0q> set = c0r0m.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
        Iterator<InterfaceC688940R0q> it2 = set.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC688940R0q next = it2.next();
            if (next instanceof SearchListPlayer) {
                obj = next;
            }
            arrayList.add(obj);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (next2 != null) {
                obj = next2;
                break;
            }
        }
        SearchListPlayer searchListPlayer = (SearchListPlayer) obj;
        if (searchListPlayer != null) {
            searchListPlayer.Ot0(new C640750PBh(i2, null, false, iLIZIZ, 6), AFwS196S0000000_10.get$arr$(360));
        }
    }
}
