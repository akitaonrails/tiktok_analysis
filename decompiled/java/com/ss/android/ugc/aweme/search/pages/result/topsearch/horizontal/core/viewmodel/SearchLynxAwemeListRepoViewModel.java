package com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel;

import X.AbstractC1255880imo;
import X.C01GW;
import X.C07IQ;
import X.C0DY9;
import X.C0DYB;
import X.C0DYF;
import X.C0DYH;
import X.C0PDQ;
import X.C0PDT;
import X.C0PJH;
import X.C0PM7;
import X.C0PN8;
import X.C0PRC;
import X.C0PYE;
import X.C0Q3E;
import X.C0QAQ;
import X.C123100dR;
import X.C13BV;
import X.C14EU;
import X.C1603960rqE;
import X.C19719612Di;
import X.C19EG;
import X.C2097608Jq;
import X.C301260BrQ;
import X.C301530Brr;
import X.C452501pT;
import X.C639490P6l;
import X.C643420PLo;
import X.C643440PLq;
import X.C646000PVm;
import X.C646370PWx;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C651970Phj;
import X.C651980Phk;
import X.C663990Q2r;
import X.C737030Svd;
import X.InterfaceC634840OvC;
import X.InterfaceC643430PLp;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS169S0400000_10;
import kotlin.jvm.internal.AwS95S1200000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLynxAwemeListRepoViewModel extends ViewModel {
    public static final AtomicInteger LLILZLL = new AtomicInteger(-1);
    public Fragment LLILLJJLI;
    public InterfaceC643430PLp LLILLL;
    public C643440PLq LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1843));
    public final int LLILZIL = LLILZLL.incrementAndGet();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LLILZLL.decrementAndGet();
        EventBus.LIZLLL().LJJI(this);
        super.onCleared();
    }

    public SearchLynxAwemeListRepoViewModel() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) throws JSONException {
        Aweme aweme;
        C643440PLq c643440PLq;
        C643420PLo c643420PLo;
        InterfaceC634840OvC interfaceC634840OvC;
        if (this.LLILZIL != LLILZLL.get() || c737030Svd.LIZ != 66) {
            return;
        }
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (c643440PLq = this.LLILZ) != null && (c643420PLo = c643440PLq.LIZIZ) != null && c643420PLo.LJ && (interfaceC634840OvC = c643440PLq.LIZ) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("backAwemeID", aweme.getAid());
            interfaceC634840OvC.sendEvent("returnFromFeedWithInfo", jSONObject);
        }
        this.LLILZ = null;
    }

    public final C0DYF vQ2(SearchMixFeed searchMixFeed) {
        List<DynamicPatch.SearchMultiTabListData> awemeMultiTabList;
        List arrayList;
        List<DynamicPatch.SearchMultiTabListData> awemeMultiTabList2;
        List<Aweme> awemeList;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LL.getValue();
        Integer numValueOf = Integer.valueOf(searchMixFeed.retrieveIncrementalId());
        Object c0dyf = concurrentHashMap.get(numValueOf);
        if (c0dyf == null) {
            DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
            List<Aweme> awemeList2 = null;
            if (dynamicPatch != null) {
                awemeList2 = dynamicPatch.getAwemeList();
            }
            if (awemeList2 != null && !awemeList2.isEmpty()) {
                DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
                if (dynamicPatch2 == null || (awemeList = dynamicPatch2.getAwemeList()) == null) {
                    awemeList = C13BV.INSTANCE;
                }
                c0dyf = new C0DYF(awemeList);
            } else {
                DynamicPatch dynamicPatch3 = searchMixFeed.getDynamicPatch();
                if (dynamicPatch3 != null && (awemeMultiTabList = dynamicPatch3.getAwemeMultiTabList()) != null && !awemeMultiTabList.isEmpty()) {
                    DynamicPatch dynamicPatch4 = searchMixFeed.getDynamicPatch();
                    if (dynamicPatch4 != null && (awemeMultiTabList2 = dynamicPatch4.getAwemeMultiTabList()) != null) {
                        arrayList = new ArrayList();
                        Iterator<DynamicPatch.SearchMultiTabListData> it2 = awemeMultiTabList2.iterator();
                        while (it2.hasNext()) {
                            Iterable iterable = it2.next().tabAwemeList;
                            if (iterable == null) {
                                iterable = C13BV.INSTANCE;
                            }
                            C19719612Di.LJJI(iterable, arrayList);
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    c0dyf = new C0DYF(arrayList);
                } else {
                    c0dyf = new C0DYF(C13BV.INSTANCE);
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, c0dyf);
            if (objPutIfAbsent != null) {
                c0dyf = objPutIfAbsent;
            }
        }
        return (C0DYF) c0dyf;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.0DYA] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void wQ2(InterfaceC634840OvC interfaceC634840OvC, C643420PLo c643420PLo) {
        C19EG activity;
        InterfaceC643430PLp interfaceC643430PLp;
        C0PN8 c0pn8Wo;
        List<SearchMixFeed> items;
        SearchMixFeed next;
        String tokenType;
        String tokenType2;
        AbstractC1255880imo c0dy9;
        String tokenType3;
        String tokenType4;
        int i;
        Long l;
        C650960Pg6 immutableData;
        C0PYE c0pye;
        Fragment fragment = this.LLILLJJLI;
        if (fragment == null) {
            return;
        }
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        this.LLILZ = new C643440PLq(interfaceC634840OvC, c643420PLo);
        Fragment fragment2 = this.LLILLJJLI;
        if (fragment2 != null && (activity = fragment2.getActivity()) != null && (interfaceC643430PLp = this.LLILLL) != null && (c0pn8Wo = interfaceC643430PLp.wo(false)) != null && (items = c0pn8Wo.getItems()) != null) {
            Iterator<SearchMixFeed> it2 = items.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    DynamicPatch dynamicPatch = next.getDynamicPatch();
                    if (dynamicPatch != null && dynamicPatch.getOriginType() == c643420PLo.LIZ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SearchMixFeed searchMixFeed = next;
            if (searchMixFeed != null) {
                boolean zLIZ = C123100dR.LIZ(searchMixFeed.getDynamicPatch().getTokenType());
                final C0DYF c0dyfVQ2 = vQ2(searchMixFeed);
                List<String> list = c643420PLo.LIZIZ;
                c0dyfVQ2.LJI = false;
                c0dyfVQ2.LJFF = 0;
                ((ArrayList) c0dyfVQ2.LIZLLL).clear();
                List<Aweme> list2 = c0dyfVQ2.LIZLLL;
                ArrayList arrayList = new ArrayList();
                Iterator<String> it3 = list.iterator();
                while (it3.hasNext()) {
                    Aweme aweme = c0dyfVQ2.LIZ.get(it3.next());
                    if (aweme != null) {
                        arrayList.add(aweme);
                    }
                }
                ((ArrayList) list2).addAll(arrayList);
                C0DYH c0dyh = c643420PLo.LJIIJ;
                c0dyfVQ2.LIZIZ = c0dyh;
                if (c0dyh == null) {
                    c0dyfVQ2.LJ = false;
                }
                if (C301260BrQ.LIZ()) {
                    C0QAQ.LIZ(c0dyfVQ2.LIZLLL, c643420PLo.LJIIJJI, null, c643420PLo.LIZIZ, 0);
                }
                C0PN8 c0pn8Wo2 = interfaceC643430PLp.wo(false);
                C0PDT c0pdtFJ = interfaceC643430PLp.FJ();
                if (c643420PLo.LJFF && !Intrinsics.LJFF(searchMixFeed.getDynamicPatch().getNeedGeneralSearchVideos(), Boolean.FALSE)) {
                    if (interfaceC643430PLp.XL()) {
                        if (c643420PLo.LJIIIIZZ != null) {
                            ((ArrayList) c0dyfVQ2.LIZLLL).clear();
                            int i2 = 0;
                            for (String str : c643420PLo.LIZIZ) {
                                Aweme aweme2 = c0dyfVQ2.LIZ.get(str);
                                if (aweme2 != null) {
                                    if (c643420PLo.LJIIIIZZ.contains(str)) {
                                        ((ArrayList) c0dyfVQ2.LIZLLL).add(aweme2);
                                        i2++;
                                        if (i2 >= C07IQ.LIZ()) {
                                            break;
                                        }
                                    } else {
                                        ((ArrayList) c0dyfVQ2.LIZLLL).add(aweme2);
                                    }
                                }
                            }
                            c0dyfVQ2.LJFF = i2;
                            c0dyfVQ2.LJI = Intrinsics.LJFF(c643420PLo.LJIIIZ, Boolean.TRUE);
                        }
                        C0PJH c0pjhLJFF = C0PDQ.LJFF(C0PDQ.LIZ, new C639490P6l(new AwS169S0400000_10(c643420PLo, interfaceC643430PLp, c0pdtFJ, c0pn8Wo2, 1), false), c0prc.LLIZLLLIL, c643420PLo.LIZJ, interfaceC643430PLp.wo(false), interfaceC643430PLp.AE(), interfaceC643430PLp.KJ(), null, interfaceC643430PLp.g1(), null, null, 768);
                        if (c0pjhLJFF != null) {
                            interfaceC643430PLp.Je(c0pjhLJFF);
                            c0dy9 = c0pjhLJFF;
                        } else {
                            c0dy9 = interfaceC643430PLp.wo(true);
                        }
                    } else {
                        c0dy9 = interfaceC643430PLp.wo(true);
                    }
                } else {
                    DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
                    if (dynamicPatch2 != null) {
                        tokenType = dynamicPatch2.getTokenType();
                    } else {
                        tokenType = null;
                    }
                    if (C123100dR.LIZ(tokenType)) {
                        tokenType2 = searchMixFeed.getDynamicPatch().getTokenType();
                    } else {
                        tokenType2 = c643420PLo.LIZLLL;
                    }
                    final AwS95S1200000_10 awS95S1200000_10 = new AwS95S1200000_10(c643420PLo, searchMixFeed, tokenType2, 9);
                    c0dy9 = new C0DY9(fragment, new C0DYB(c0dyfVQ2, awS95S1200000_10) { // from class: X.0DYA
                        public final C0DYB LIZ;
                        public final Function1<List<? extends Aweme>, Unit> LIZIZ;

                        @Override // X.C0DYB
                        public final Object LIZ(InterfaceC1364105Vn<? super List<? extends Aweme>> interfaceC1364105Vn) {
                            return this.LIZ.LIZ(interfaceC1364105Vn);
                        }

                        @Override // X.C0DYB
                        public final boolean getHasMore() {
                            return this.LIZ.getHasMore();
                        }

                        @Override // X.C0DYB
                        public final List<Aweme> getAwemeList() {
                            List<Aweme> awemeList = this.LIZ.getAwemeList();
                            this.LIZIZ.invoke(awemeList);
                            return awemeList;
                        }

                        {
                            this.LIZ = c0dyfVQ2;
                            this.LIZIZ = awS95S1200000_10;
                        }
                    });
                }
                C1603960rqE.LIZ = c0dy9;
                DynamicPatch dynamicPatch3 = searchMixFeed.getDynamicPatch();
                if (dynamicPatch3 != null) {
                    tokenType3 = dynamicPatch3.getTokenType();
                } else {
                    tokenType3 = null;
                }
                if (C123100dR.LIZ(tokenType3)) {
                    tokenType4 = searchMixFeed.getDynamicPatch().getTokenType();
                } else {
                    tokenType4 = "video";
                }
                C651980Phk c651980Phk = C651970Phj.LLILLL;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("token_type", tokenType4), new Pair("is_aladdin", "1"), new Pair("search_result_id", c643420PLo.LIZJ), new Pair("rank", CardStruct.IStatusCode.DEFAULT), new Pair("is_search_scene", "1"), new Pair("search_keyword", c0prc.LLIZLLLIL), new Pair("search_type", "general"), new Pair("search_id", c0prc.LLILLL), new Pair("last_from_group_id", ((C0PM7) iSearchContextAbilityLJI.ak0().LIZJ()).LLILLL), new Pair("is_from_video", "1"), new Pair("search_entrance", ((C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ()).LL), new Pair("list_item_id", c643420PLo.LIZJ), new Pair("enter_from_merge", ((C646370PWx) iSearchContextAbilityLJI.wO2().LIZJ()).LLILLL), new Pair("enter_method", "video_cell"), new Pair("group_id", c643420PLo.LIZJ));
                c651980Phk.getClass();
                C651980Phk.LJFF(mapLJIIIIZZ, false);
                C651980Phk.LJFF(c643420PLo.LJIIJJI, true);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//aweme/detail");
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, c643420PLo.LIZJ);
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
                if (zLIZ) {
                    i = 80;
                } else {
                    i = 65280;
                }
                smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", i);
                smartRouteBuildRoute.withParam("previous_page", "general_search");
                if (c643420PLo.LJI) {
                    smartRouteBuildRoute.withParam("is_from_search_key_frame_anchor", true);
                }
                String str2 = c643420PLo.LJII;
                if (str2 != null && (Intrinsics.LJFF(str2, "comment") || Intrinsics.LJFF(str2, "share"))) {
                    smartRouteBuildRoute.withParam("open_sub_panel", str2);
                }
                C646000PVm c646000PVm = C650950Pg5.Companion;
                Fragment fragment3 = this.LLILLJJLI;
                c646000PVm.getClass();
                C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(fragment3, activity);
                if (c650950Pg5LJIIIZ != null && (immutableData = c650950Pg5LJIIIZ.getImmutableData()) != null && (c0pye = immutableData.searchSessionModel) != null) {
                    l = c0pye.searchSessionId;
                } else {
                    l = null;
                }
                smartRouteBuildRoute.withParam("search_session_id", l);
                smartRouteBuildRoute.open();
            }
        }
    }

    public final void xQ2(String str, SearchHorizontalData searchHorizontalData) {
        C0PN8 c0pn8Wo;
        List<SearchMixFeed> items;
        Object docId;
        InterfaceC643430PLp interfaceC643430PLp = this.LLILLL;
        if (interfaceC643430PLp != null && (c0pn8Wo = interfaceC643430PLp.wo(false)) != null && (items = c0pn8Wo.getItems()) != null) {
            Iterator<SearchMixFeed> it2 = items.iterator();
            while (true) {
                docId = null;
                if (!it2.hasNext()) {
                    break;
                }
                SearchMixFeed next = it2.next();
                DynamicPatch dynamicPatch = next.getDynamicPatch();
                if (dynamicPatch != null) {
                    docId = dynamicPatch.getDocId();
                }
                if (Intrinsics.LJFF(docId, str)) {
                    docId = next;
                    break;
                }
            }
            SearchMixFeed searchMixFeed = (SearchMixFeed) docId;
            if (searchMixFeed != null) {
                vQ2(searchMixFeed).LIZIZ(searchHorizontalData.LJ());
            }
        }
    }
}
