package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import X.C01GW;
import X.C07CX;
import X.C0C98;
import X.C0Q2Q;
import X.C0Q3E;
import X.C0QDA;
import X.C0QQF;
import X.C11JF;
import X.C11S5;
import X.C13LP;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1ER1;
import X.C20684815ws;
import X.C2082308Dt;
import X.C238400w2;
import X.C294700Bgq;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C645930PVf;
import X.C646370PWx;
import X.C664180Q3k;
import X.C665580Q8u;
import X.C667120QEs;
import X.C667130QEt;
import X.C786410Ut5;
import X.InterfaceC1210900hcG;
import Y.ACListenerS4S1500000_10;
import Y.ACListenerS77S0300000_10;
import Y.AfS8S0600000_10;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.model.suggest.WordRecord;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService;
import com.ss.android.ugc.aweme.search.entry.core.config.DetailSearchBarStyleConfig;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.ECDetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugInfo;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class DetailFeedSearchHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static C667120QEs LLILLJJLI;
    public static C11JF LLILLL;
    public static final DetailFeedSearchHelper LL = new DetailFeedSearchHelper();
    public static boolean LLILZ = true;
    public static final List<String> LLILZIL = C13LP.LJLIL(C665580Q8u.LIZIZ.LJII(), C1697810uHb.LJIIJJI("playlist", "chat", "notification_page", "selfharm", "discovery", "others_homepage", "personal_homepage", "homepage_explore", "homepage_nearby", "general_search", "search_result", "challenge", "single_song", "prop_page", "collection_video", "trending_inflow_page", "group_chat", "link_auto_message", "account_history", "edm_search", "visual_search", "repost_feed", "smart_search", "smart_search_title", "school_community_page"));
    public static final Set<Integer> LLILZLL = new LinkedHashSet();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        C11JF c11jf = LLILLL;
        if (c11jf != null && !c11jf.isDisposed()) {
            LLILLL.dispose();
        }
        LLILLL = null;
        LLILZLL.clear();
    }

    public static SearchSugWordResponse LIZIZ(SuggestWordStruct suggestWordStruct) {
        WordRecord wordRecord;
        SearchSugWordResponse searchSugWordResponse = new SearchSugWordResponse();
        searchSugWordResponse.qrecVirtualEnable = suggestWordStruct.getQrecVirtualEnable();
        List<WordStruct> words = suggestWordStruct.getWords();
        ArrayList arrayList = null;
        if (words != null) {
            ArrayList arrayList2 = new ArrayList();
            for (WordStruct wordStruct : words) {
                if (wordStruct != null) {
                    SearchSugInfo searchSugInfo = new SearchSugInfo();
                    searchSugInfo.sugWord = wordStruct.getWord();
                    searchSugInfo.groupId = wordStruct.getWordId();
                    searchSugInfo.penetrateInfo = wordStruct.getPenetrateInfo();
                    Word wordRecord2 = wordStruct.getWordRecord();
                    if (wordRecord2 != null) {
                        wordRecord = new WordRecord(wordRecord2.getWordsLang(), wordRecord2.getTextnetId(), wordRecord2.getQrecJsonInfo());
                    } else {
                        wordRecord = null;
                    }
                    searchSugInfo.wordRecord = wordRecord;
                    arrayList2.add(searchSugInfo);
                }
            }
            arrayList = arrayList2;
        }
        searchSugWordResponse.sugWordList = arrayList;
        return searchSugWordResponse;
    }

    public static String LIZJ(Context context) {
        if (((DetailSearchBarStyleConfig) C0C98.LIZIZ.getValue()).placeHolderWordChange != 0) {
            return context.getResources().getString(2131858107);
        }
        return context.getResources().getString(2131847195);
    }

    public static String LIZLLL(Map map) {
        String str = (String) map.get("enter_from");
        if (TextUtils.isEmpty(str)) {
            return "unknow";
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LJ(String str) {
        if (str == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        switch (str.hashCode()) {
            case -1731750228:
                if (!str.equals("single_song")) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            case -989034367:
                if (!str.equals("photos")) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            case -562830579:
                if (!str.equals("personal_homepage")) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            case 3052376:
                if (!str.equals("chat")) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            case 809483594:
                if (!str.equals("others_homepage")) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            case 998835423:
                if (!str.equals("general_search")) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            case 1425879700:
                if (!str.equals("search_result")) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return "1";
            default:
                return CardStruct.IStatusCode.DEFAULT;
        }
    }

    public static View LJFF(View view) {
        View viewFindViewWithTag = view.findViewWithTag("search_bar");
        if (viewFindViewWithTag == null) {
            ViewStub viewStub = (ViewStub) ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIIIIZZ(view).get("search_bar_in_feed");
            if (viewStub == null) {
                return null;
            }
            viewStub.setLayoutResource(R.layout.etn);
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            viewLJLLLL.setTag("search_bar");
            return viewLJLLLL;
        }
        return viewFindViewWithTag;
    }

    public static void LJIIJJI(LifecycleOwner lifecycleOwner) {
        View view = ((Fragment) lifecycleOwner).getView();
        if (view == null) {
            return;
        }
        Iterator<Map.Entry<String, View>> it2 = ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIIIIZZ(view).entrySet().iterator();
        while (it2.hasNext()) {
            View value = it2.next().getValue();
            if (value != null) {
                C786410Ut5.LJLLLLLL(8, value);
            }
        }
        View viewFindViewWithTag = view.findViewWithTag("search_bar");
        if (viewFindViewWithTag != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewWithTag);
        }
    }

    public static void LJIILLIIL(Map map) {
        String strLIZLLL;
        Object obj;
        C664180Q3k c664180Q3k = new C664180Q3k();
        String str = "1";
        "1".toString();
        c664180Q3k.LJ("is_from_video", "1");
        c664180Q3k.LJIIZILJ("enter_method", "enter");
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str2 = (String) linkedHashMap.get("blankpage_id");
        if (str2 != null) {
            c664180Q3k.LJ("blankpage_id", str2);
        }
        if (map.containsKey("tab_name") && (obj = linkedHashMap.get("tab_name")) != null) {
            c664180Q3k.LJ("tab_name", obj.toString());
        }
        if (map.containsKey("isTrending")) {
            strLIZLLL = "trending_inflow";
        } else {
            LL.getClass();
            strLIZLLL = LIZLLL(map);
        }
        c664180Q3k.LJIJJ(strLIZLLL);
        String str3 = (String) linkedHashMap.get("is_from_photo");
        if (str3 != null) {
            if (Intrinsics.LJFF(str3, "1")) {
                c664180Q3k.LJ("is_from_video", (String) linkedHashMap.get("is_from_video"));
            }
            c664180Q3k.LJ("is_from_photo", str3);
        }
        if (!C1ER1.LIZIZ.LIZLLL()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c664180Q3k.LJ("has_coin_task", str);
        c664180Q3k.LJ("search_entrance", ((C646370PWx) C0Q3E.LJI().wO2().LIZJ()).LLILLL);
        c664180Q3k.LJ("is_from_comment", CardStruct.IStatusCode.DEFAULT);
        c664180Q3k.LJ("from_page", "graphic_detail");
        C645930PVf.LIZ(c664180Q3k);
        ECDetailFeedSearchHelper.LL.getClass();
        if (ECDetailFeedSearchHelper.LJIIIIZZ(map)) {
            c664180Q3k.LJIJJ(ECDetailFeedSearchHelper.LIZ(map));
            String strLIZJ = ECDetailFeedSearchHelper.LIZJ(map);
            if (strLIZJ != null) {
                c664180Q3k.LJ("search_entrance", strLIZJ);
            }
        }
        c664180Q3k.LJIILJJIL();
    }

    public final boolean LJIIL(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || ((Fragment) lifecycleOwner).getView() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        if (C294700Bgq.LIZ()) {
            release();
        }
        LLILLJJLI = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        LLILLJJLI = null;
    }

    public static void LIZ(C0QDA c0qda, Map map) {
        if (map.containsKey("isTrending")) {
            c0qda.LJJJJ("trending_inflow");
        } else {
            LL.getClass();
            c0qda.LJJJJ(LIZLLL(map));
        }
        if (map.containsKey("tab_name")) {
            c0qda.LJJJJIZL(map.get("tab_name"));
        }
    }

    public static void LJII(View view, Map map) {
        View view2 = ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIIIIZZ(view).get("search_icon_in_feed");
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
            C786410Ut5.T4(view2, 1.0f);
            C786410Ut5.I7(new ACListenerS77S0300000_10((Object) view, (View) map, (Map<String, String>) view2, (View) 2), view2);
        }
    }

    public static void LJIIIIZZ(SmartRoute smartRoute, Map map) {
        if (map.containsKey("isTrending")) {
            smartRoute.withParam("search_position", "trending_inflow");
            smartRoute.withParam("tab_name", LIZLLL(map));
            smartRoute.withParam("enter_from", "trending_inflow");
        } else {
            if (map.containsKey("tab_name")) {
                smartRoute.withParam("tab_name", (String) map.get("tab_name"));
            }
            smartRoute.withParam("enter_from", LIZLLL(map));
        }
    }

    public static void LJIILL(String str, Map map) {
        if (!C20684815ws.LJI("search_button_show")) {
            return;
        }
        C0Q2Q<C667130QEt> c0q2q = new C0Q2Q<C667130QEt>() { // from class: X.0QEt
        };
        String strLIZLLL = LIZLLL(map);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c0q2q.LJFF("search_position", strLIZLLL, c2082308Dt);
        c0q2q.LJFF("group_id", str, c2082308Dt);
        c0q2q.LJFF("is_from_video", "1", c2082308Dt);
        if (map.containsKey("isTrending")) {
            c0q2q.LJ("search_position", "trending_inflow");
            LL.getClass();
            c0q2q.LJ("tab_name", LIZLLL(map));
        } else {
            if (map.containsKey("tab_name")) {
                c0q2q.LJ("tab_name", (String) map.get("tab_name"));
            }
            String str2 = (String) map.get("is_from_photo");
            if (str2 != null && Intrinsics.LJFF(str2, "1")) {
                c0q2q.LJ("is_from_photo", str2);
                String str3 = (String) map.get("enter_entrance_style");
                if (str3 != null) {
                    c0q2q.LJ("enter_entrance_style", str3);
                }
                String str4 = (String) map.get("is_from_video");
                if (str4 != null) {
                    c0q2q.LJ("is_from_video", str4);
                }
            }
        }
        c0q2q.LJIILJJIL();
    }

    public static void LJIIJ(View view, Map map, Map map2, Aweme aweme) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.lu5);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_search_sug_word);
        View viewFindViewById = view.findViewById(R.id.nh9);
        TextView textView = (TextView) view.findViewById(R.id.za6);
        viewFindViewById.setBackgroundResource(R.drawable.d39);
        tuxIconView.setTintColorRes(R.attr.ef);
        tuxTextView.setTextColorRes(R.attr.ef);
        C01GW c01gw = C0C98.LIZIZ;
        if (((DetailSearchBarStyleConfig) c01gw.getValue()).placeHolderEnhance != 0) {
            tuxTextView.setTextColorRes(R.attr.zi);
            tuxIconView.setTintColorRes(R.attr.zi);
            tuxIconView.LIZJ(true);
            tuxTextView.setShadowLayer(C418440Gaw.LIZIZ(1), 0.0f, 1.0f, Color.argb(64, 0, 0, 0));
            textView.setShadowLayer(C418440Gaw.LIZIZ(1), 0.0f, 1.0f, Color.argb(64, 0, 0, 0));
            if (((Number) C07CX.LIZ.getValue()).intValue() >= 2) {
                C07CX.LIZ(tuxTextView);
                C07CX.LIZ(textView);
            }
        }
        if (((DetailSearchBarStyleConfig) c01gw.getValue()).bgColorStyle != 0) {
            viewFindViewById.setBackgroundResource(R.drawable.d37);
        } else if (((DetailSearchBarStyleConfig) c01gw.getValue()).borderStyle != 0) {
            viewFindViewById.setBackgroundResource(R.drawable.d36);
        }
        if (((DetailSearchBarStyleConfig) c01gw.getValue()).placeHolderWordChange != 0 && LLILZ) {
            tuxTextView.setText(view.getContext().getString(2131858107));
            LLILZ = false;
        }
        LJIIZILJ(false, view, map, map2, LIZJ(view.getContext()), null, null, aweme);
    }

    public static Bundle LJI(Map map, Map map2, String str, SearchSugWordResponse searchSugWordResponse, Aweme aweme) {
        String str2;
        String imprId;
        String str3;
        List<SearchSugInfo> list;
        SearchSugInfo searchSugInfo;
        WordRecord wordRecord;
        List<SearchSugInfo> list2;
        SearchSugInfo searchSugInfo2;
        SearchSugInfo searchSugInfo3;
        List<SearchSugInfo> list3;
        List<SearchSugInfo> list4;
        ISearchCoinHintService.LIZ.getClass();
        ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("is_from_video", "1", bundle);
        C786410Ut5.LJJJI("in_single_stack", "true", bundle);
        C786410Ut5.LJJJI("group_id", (String) map.get("group_id"), bundle);
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("set_hint_by_sug_word", "true", bundle);
        } else {
            C786410Ut5.LJJJI("keyword", str, bundle);
            if (searchSugWordResponse != null && (list2 = searchSugWordResponse.sugWordList) != null && (searchSugInfo2 = (SearchSugInfo) ListProtector.get(list2, 0)) != null) {
                str2 = searchSugInfo2.groupId;
            } else {
                str2 = null;
            }
            C786410Ut5.LJJJI("hint_group_id", str2, bundle);
            if (searchSugWordResponse != null) {
                imprId = searchSugWordResponse.getImprId();
            } else {
                imprId = null;
            }
            C786410Ut5.LJJJI("hint_imp_id", imprId, bundle);
            if (searchSugWordResponse != null && (list = searchSugWordResponse.sugWordList) != null && (searchSugInfo = (SearchSugInfo) ListProtector.get(list, 0)) != null && (wordRecord = searchSugInfo.wordRecord) != null) {
                str3 = wordRecord.textnetId;
            } else {
                str3 = null;
            }
            C786410Ut5.LJJJI("key_log_hint_query_category", str3, bundle);
        }
        C786410Ut5.LJJJI("is_from_outside", "true", bundle);
        if (map.containsKey("isTrending")) {
            C786410Ut5.LJJJI("search_position", "trending_inflow", bundle);
            C786410Ut5.LJJJI("tab_name", LIZLLL(map), bundle);
            C786410Ut5.LJJJI("enter_from", "trending_inflow", bundle);
        } else {
            if (map.containsKey("tab_name")) {
                C786410Ut5.LJJJI("tab_name", (String) map.get("tab_name"), bundle);
            }
            C786410Ut5.LJJJI("enter_from", LIZLLL(map), bundle);
        }
        C786410Ut5.LJJJI("is_feed_liked", String.valueOf(map2.get("is_feed_liked")), bundle);
        C786410Ut5.LJJJI("is_feed_collected", String.valueOf(map2.get("is_feed_collected")), bundle);
        C786410Ut5.LJJJI("is_feed_forward_clicked", String.valueOf(map2.get("is_feed_forward_clicked")), bundle);
        C786410Ut5.LJJJI("is_feed_comment_clicked", String.valueOf(map2.get("is_feed_comment_clicked")), bundle);
        C786410Ut5.LJJJI("back_flag", "1", bundle);
        C786410Ut5.LJJJI("set_hint_by_sug_word", "true", bundle);
        C786410Ut5.LJJJI("enter_method", "default_search_keyword", bundle);
        String str5 = (String) map.get("is_enter_graphic_detail");
        if (str5 != null) {
            C786410Ut5.LJJJI("is_enter_graphic_detail", str5, bundle);
        }
        String str6 = (String) map.get("is_from_photo");
        if (str6 != null) {
            if (Intrinsics.LJFF(str6, "1")) {
                C786410Ut5.LJJJI("is_from_video", (String) map.get("is_from_video"), bundle);
            }
            C786410Ut5.LJJJI("is_from_photo", str6, bundle);
        }
        if (searchSugWordResponse != null && (list3 = searchSugWordResponse.sugWordList) != null && (!list3.isEmpty()) && (list4 = searchSugWordResponse.sugWordList) != null) {
            searchSugInfo3 = (SearchSugInfo) ListProtector.get(list4, 0);
            if (searchSugInfo3 != null) {
                str4 = searchSugInfo3.sugWord;
            }
        } else {
            searchSugInfo3 = null;
        }
        if (Intrinsics.LJFF(str, str4)) {
            C786410Ut5.LJJJI("penetrate_info", searchSugInfo3.penetrateInfo, bundle);
        }
        if (iSearchCoinHintServiceLIZ != null && iSearchCoinHintServiceLIZ.LIZJ(aweme, "search_bar_inner")) {
            C786410Ut5.LJJJI("has_coin_entrance", "1", bundle);
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(android.view.View r23, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse r24, java.util.Map r25, java.util.Map r26, com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse r27, com.ss.android.ugc.aweme.feed.model.Aweme r28, android.view.View r29) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper.LJIIIZ(android.view.View, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse, java.util.Map, java.util.Map, com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(android.view.View r14, java.util.Map r15, java.util.Map r16, java.lang.String r17, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper.LJIILIIL(android.view.View, java.util.Map, java.util.Map, java.lang.String, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(com.bytedance.tux.input.TuxTextView r10, java.lang.String r11, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse r12, java.util.Map r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, com.bytedance.tux.icon.TuxIconView r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper.LJIJ(com.bytedance.tux.input.TuxTextView, java.lang.String, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse, java.util.Map, com.ss.android.ugc.aweme.feed.model.Aweme, com.bytedance.tux.icon.TuxIconView, android.view.View):void");
    }

    public final void LJIILJJIL(LifecycleOwner lifecycleOwner, View view, String str, Map<String, String> map, Map<String, Boolean> map2, Aweme aweme, View view2) {
        String strLIZLLL;
        Integer num;
        String str2;
        String str3;
        if (map.containsKey("isTrending")) {
            strLIZLLL = "trending_inflow";
        } else {
            strLIZLLL = LIZLLL(map);
        }
        Integer num2 = null;
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        C667120QEs c667120QEs = LLILLJJLI;
        if (c667120QEs != null) {
            str2 = c667120QEs.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            C667120QEs c667120QEs2 = LLILLJJLI;
            if (c667120QEs2 != null) {
                str3 = c667120QEs2.LIZIZ;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, strLIZLLL)) {
                C667120QEs c667120QEs3 = LLILLJJLI;
                if (c667120QEs3 != null) {
                    num2 = c667120QEs3.LIZJ;
                }
                if (Intrinsics.LJFF(num2, num)) {
                    return;
                }
            }
        }
        release();
        LLILLJJLI = new C667120QEs(str, strLIZLLL, num);
        SearchApiNew.LIZ.getClass();
        LLILLL = (C11JF) SearchApiNew.LIZ().LIZLLL(str, strLIZLLL, num).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS8S0600000_10(view, view2, lifecycleOwner, aweme, map, map2, 0), new AfS8S0600000_10(view, view2, lifecycleOwner, aweme, map, map2, 1));
    }

    public static void LJIIZILJ(boolean z, final View view, final Map map, final Map map2, final String str, final SearchSugWordResponse searchSugWordResponse, final SuggestWordResponse suggestWordResponse, final Aweme aweme) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.nhb);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.za6);
        C427690Gpr.LJI(linearLayout, AFwS293S0000000_10.get$arr$(3));
        if (z) {
            ISearchCoinHintService.LIZ.getClass();
            ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
            if (iSearchCoinHintServiceLIZ != null) {
                iSearchCoinHintServiceLIZ.LJI(aweme, "search_bar_inner");
            }
            C786410Ut5.R7(linearLayout, new ACListenerS4S1500000_10(view, map2, aweme, str, map, searchSugWordResponse, 0));
            C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0QEo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws JSONException {
                    String str2;
                    String str3;
                    String str4;
                    String imprId;
                    boolean z2;
                    String str5;
                    String imprId2;
                    List<SearchSugInfo> list;
                    SearchSugInfo searchSugInfo;
                    WordRecord wordRecord;
                    List<SearchSugInfo> list2;
                    SearchSugInfo searchSugInfo2;
                    List<SearchSugInfo> list3;
                    SearchSugInfo searchSugInfo3;
                    WordRecord wordRecord2;
                    List<SearchSugInfo> list4;
                    SearchSugInfo searchSugInfo4;
                    ECDetailFeedSearchHelper eCDetailFeedSearchHelper = ECDetailFeedSearchHelper.LL;
                    Map<String, String> map3 = map;
                    eCDetailFeedSearchHelper.getClass();
                    if (ECDetailFeedSearchHelper.LJIIIIZZ(map3) && C123100dR.LIZ(str)) {
                        String str6 = str;
                        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
                        Context context = view.getContext();
                        detailFeedSearchHelper.getClass();
                        if (!Intrinsics.LJFF(str6, DetailFeedSearchHelper.LIZJ(context))) {
                            ECDetailFeedSearchHelper.LJIIJ(map, str, suggestWordResponse);
                        }
                    }
                    DetailFeedSearchHelper detailFeedSearchHelper2 = DetailFeedSearchHelper.LL;
                    View view3 = view;
                    Map<String, String> map4 = map;
                    Map<String, Boolean> map5 = map2;
                    String str7 = str;
                    SearchSugWordResponse searchSugWordResponse2 = searchSugWordResponse;
                    Aweme aweme2 = aweme;
                    detailFeedSearchHelper2.getClass();
                    if (view3.getAlpha() == 0.0f) {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("DetailFeedSearchHelper", "search bar is not visiable, alpha = 0, disable nativate action");
                        return;
                    }
                    IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
                    if (iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view3);
                        c1389890mGx.LJIIIZ(2131834392);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    if (!ECDetailFeedSearchHelper.LJIIIIZZ(map4) && !ECDetailFeedSearchHelper.LJII(map4)) {
                        ISearchCoinHintService.LIZ.getClass();
                        ISearchCoinHintService iSearchCoinHintServiceLIZ2 = C0QQF.LIZ();
                        C0PVM c0pvm = new C0PVM();
                        c0pvm.LJIIZILJ("search_position", DetailFeedSearchHelper.LIZLLL(map4));
                        c0pvm.LJIIZILJ("words_source", "search_bar_inner");
                        DetailFeedSearchHelper.LIZ(c0pvm, map4);
                        c0pvm.LJJ(Boolean.TRUE);
                        c0pvm.LJJJJL(0);
                        if (searchSugWordResponse2 != null && (list4 = searchSugWordResponse2.sugWordList) != null && (searchSugInfo4 = (SearchSugInfo) C13LP.LJJJLL(list4)) != null) {
                            str2 = searchSugInfo4.wordsLang;
                        } else {
                            str2 = null;
                        }
                        c0pvm.LJIIZILJ("query_lang", str2);
                        if (searchSugWordResponse2 != null && (list3 = searchSugWordResponse2.sugWordList) != null && (searchSugInfo3 = (SearchSugInfo) C13LP.LJJJLL(list3)) != null && (wordRecord2 = searchSugInfo3.wordRecord) != null) {
                            str3 = wordRecord2.textnetId;
                        } else {
                            str3 = null;
                        }
                        c0pvm.LJIIZILJ("query_category_full", str3);
                        c0pvm.LJIIZILJ("words_content", str7);
                        if (searchSugWordResponse2 != null && (list2 = searchSugWordResponse2.sugWordList) != null && (searchSugInfo2 = (SearchSugInfo) C13LP.LJJJLL(list2)) != null) {
                            str4 = searchSugInfo2.groupId;
                        } else {
                            str4 = null;
                        }
                        c0pvm.LJIIZILJ("group_id", str4);
                        if (searchSugWordResponse2 != null) {
                            imprId = searchSugWordResponse2.getImprId();
                        } else {
                            imprId = null;
                        }
                        c0pvm.LJIIZILJ("impr_id", imprId);
                        if (iSearchCoinHintServiceLIZ2 != null && iSearchCoinHintServiceLIZ2.LIZJ(aweme2, "search_bar_inner")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c0pvm.LJJIZ(z2);
                        if (searchSugWordResponse2 != null && (list = searchSugWordResponse2.sugWordList) != null && (searchSugInfo = (SearchSugInfo) C13LP.LJJJLL(list)) != null && (wordRecord = searchSugInfo.wordRecord) != null) {
                            str5 = wordRecord.qrecJsonInfo;
                        } else {
                            str5 = null;
                        }
                        c0pvm.LJIJI("qrec_json_info", str5);
                        String str8 = map4.get("is_from_photo");
                        if (str8 != null) {
                            if (Intrinsics.LJFF(str8, "1")) {
                                c0pvm.LJ("is_from_video", map4.get("is_from_video"));
                            }
                            c0pvm.LJ("is_from_photo", str8);
                        }
                        c0pvm.LJIIZILJ("position_type", "inner_searchbox");
                        c0pvm.LJIILJJIL();
                        C667750QHd c667750QHd = new C667750QHd(new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)));
                        if (searchSugWordResponse2 != null) {
                            imprId2 = searchSugWordResponse2.getImprId();
                        } else {
                            imprId2 = "";
                        }
                        c667750QHd.LJFF(imprId2);
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view3.getContext(), "//search");
                    smartRouteBuildRoute.withParam(DetailFeedSearchHelper.LJI(map4, map5, str7, searchSugWordResponse2, aweme2));
                    smartRouteBuildRoute.withParam("search_saf", ((Boolean) C276400AsQ.LIZIZ.getValue()).booleanValue());
                    smartRouteBuildRoute.withParam("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken("c4790.d0", PageFinder.via(view3), null));
                    if (ECDetailFeedSearchHelper.LJIIIIZZ(map4)) {
                        smartRouteBuildRoute.withParam("target_tab", EnumC669620QOi.SHOP.getTabName());
                        smartRouteBuildRoute.withParam("is_from_shop_tab_video", 1);
                        smartRouteBuildRoute.withParam("last_search_position", ECDetailFeedSearchHelper.LIZ(map4));
                        smartRouteBuildRoute.withParam("enter_method", "default_search_keyword_outer");
                    }
                    try {
                        smartRouteBuildRoute.withParam("extra_mob_params", C786410Ut5.J3(new JSONObject().put("position_type", "inner_searchbox")));
                        C189200o6.m2constructorimpl(smartRouteBuildRoute);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    smartRouteBuildRoute.open();
                    C737030Svd c737030Svd = new C737030Svd(90, map4.get("group_id"));
                    if (C1ER1.LIZIZ.LJJII().LJFF(aweme2)) {
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("search_bar_click_region", "click_search_icon", bundle);
                        c737030Svd.LIZJ = bundle;
                    }
                    C1440005kM.LIZ(c737030Svd);
                }
            });
            final C238400w2 c238400w2 = new C238400w2();
            ECDetailFeedSearchHelper.LL.getClass();
            if (!ECDetailFeedSearchHelper.LJII(map) && !ECDetailFeedSearchHelper.LJIIIIZZ(map)) {
                tuxTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0QEp
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        boolean z2;
                        if (!TextUtils.isEmpty(str) && motionEvent.getAction() == 0) {
                            c238400w2.element = System.currentTimeMillis();
                            C1ER1 c1er1 = C1ER1.LIZIZ;
                            Context context = view.getContext();
                            DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
                            Map<String, String> map3 = map;
                            Map<String, Boolean> map4 = map2;
                            String str2 = str;
                            SearchSugWordResponse searchSugWordResponse2 = searchSugWordResponse;
                            Aweme aweme2 = aweme;
                            detailFeedSearchHelper.getClass();
                            c1er1.LLLIIIIL(context, DetailFeedSearchHelper.LJI(map3, map4, str2, searchSugWordResponse2, aweme2));
                        } else if (!TextUtils.isEmpty(str)) {
                            boolean z3 = true;
                            if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
                                int scaledTouchSlop = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                DetailFeedSearchHelper.LL.getClass();
                                float f = -scaledTouchSlop;
                                if (x >= f && y >= f && x < (view2.getRight() - view2.getLeft()) + scaledTouchSlop && y < (view2.getBottom() - view2.getTop()) + scaledTouchSlop) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    C1ER1.LIZIZ.LLJJJJJIL(c238400w2.element, "default_search_keyword_outside", true);
                                    return false;
                                }
                                if (motionEvent.getAction() != 3) {
                                    z3 = false;
                                }
                                C1ER1.LIZIZ.LLJJJJJIL(c238400w2.element, "default_search_keyword_outside", z3);
                                return false;
                            }
                        }
                        return false;
                    }
                });
                return;
            }
            return;
        }
        C786410Ut5.R7(linearLayout, new ACListenerS4S1500000_10(view, map2, aweme, str, map, searchSugWordResponse, 1));
        C786410Ut5.h9(tuxTextView, new ACListenerS4S1500000_10(view, map2, aweme, str, map, searchSugWordResponse, 2));
    }
}
