package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import X.C00ZX;
import X.C0QDQ;
import X.C0QXR;
import X.C11JL;
import X.C123100dR;
import X.C13LP;
import X.C1507790pL7;
import X.C1697810uHb;
import X.C1742080vR0;
import X.C667120QEs;
import X.C786410Ut5;
import Y.ACListenerS14S1400000_10;
import Y.ACListenerS4S1500000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ECDetailFeedSearchHelper implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final ECDetailFeedSearchHelper LL = new ECDetailFeedSearchHelper();
    public static C667120QEs LLILLJJLI;
    public static C11JL LLILLL;

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
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZ(Map map) {
        String str = (String) map.get("search_feed_scene");
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -950750629:
                if (!str.equals("SHOP_TAB_IN_MALL")) {
                    return null;
                }
                return "mall_search_video";
            case 86031413:
                if (!str.equals("ORDER_CENTER_IN_MALL")) {
                    return null;
                }
                return "order_page_video";
            case 583509793:
                if (!str.equals("SHOP_TAB_IN_GENERAL")) {
                    return null;
                }
                return "ecom_search_video";
            case 874988777:
                if (!str.equals("MALL_FEED")) {
                    return null;
                }
                return "mall_video";
            case 1858542110:
                if (!str.equals("ORDER_CENTER_OUT_MALL")) {
                    return null;
                }
                return "order_page_video";
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer LIZIZ(Map map) {
        String str = (String) map.get("search_feed_scene");
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -950750629:
                if (!str.equals("SHOP_TAB_IN_MALL")) {
                    return null;
                }
                return Integer.valueOf(C0QXR.SHOP_SEARCH_IN_MALL_VIDEO.getValue());
            case 86031413:
                if (!str.equals("ORDER_CENTER_IN_MALL")) {
                    return null;
                }
                break;
            case 874988777:
                if (!str.equals("MALL_FEED")) {
                    return null;
                }
                return Integer.valueOf(C0QXR.MALL_FEED_VIDEO.getValue());
            case 1291081950:
                if (!str.equals("VIDEO_TAB_IN_SIMPLE")) {
                    return null;
                }
                return Integer.valueOf(C0QXR.VIDEO_VERTICAL_TAB_VIDEO_CELL.getValue());
            case 1858542110:
                if (!str.equals("ORDER_CENTER_OUT_MALL")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return Integer.valueOf(C0QXR.ORDER_GUESS_VIDEO.getValue());
    }

    public static String LIZJ(Map map) {
        String str = (String) map.get("enter_from");
        String str2 = (String) map.get("search_entrance");
        if (Intrinsics.LJFF(str, "goods_search") && (Intrinsics.LJFF(str2, "mall") || Intrinsics.LJFF(str2, "homepage_mall"))) {
            return str2;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003b A[EDGE_INSN: B:59:0x003b->B:15:0x003b BREAK  A[LOOP:0: B:5:0x000b->B:62:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[LOOP:0: B:5:0x000b->B:62:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.ECDetailFeedSearchHelper.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static boolean LJII(Map map) {
        String str = (String) map.get("search_feed_scene");
        if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("ORDER_CENTER_IN_MALL", "ORDER_CENTER_OUT_MALL", "MALL_FEED", "SHOP_TAB_IN_MALL", "VIDEO_TAB_IN_SIMPLE"))) {
            return C0QDQ.LIZ(str);
        }
        return false;
    }

    public static boolean LJIIIIZZ(Map map) {
        DetailFeedSearchHelper.LL.getClass();
        IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
        if (iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
            return false;
        }
        String str = (String) map.get("search_feed_scene");
        if (!C13LP.LJJJJ(str, Collections.singletonList("SHOP_TAB_IN_GENERAL"))) {
            return false;
        }
        return C0QDQ.LIZ(str);
    }

    public final boolean LJI(LifecycleOwner lifecycleOwner) {
        Fragment fragment;
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || !(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null || fragment.getView() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        LLILLJJLI = null;
        if (((Number) C00ZX.LIZ.getValue()).intValue() == 1) {
            C11JL c11jl = LLILLL;
            if (c11jl != null && !c11jl.isDisposed()) {
                c11jl.dispose();
            }
            LLILLL = null;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        LLILLJJLI = null;
    }

    public static String LJ(Aweme aweme, Map map) {
        Object obj = map.get("ec_search_traffic_source_list");
        if (!C123100dR.LIZ((String) obj)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return C1742080vR0.LJIIIIZZ(aweme);
    }

    public static void LJIIJ(Map map, String str, SuggestWordResponse suggestWordResponse) throws JSONException {
        String id;
        String str2;
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        Word word;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        if (str == null) {
            str = "";
        }
        jSONObject.put("words_content", str);
        jSONObject.put("words_source", "search_bar_outer");
        jSONObject.put("words_position", 0);
        LL.getClass();
        String strLIZ = LIZ(map);
        if (strLIZ == null) {
            strLIZ = "";
        }
        jSONObject.put("search_position", strLIZ);
        String strLIZJ = LIZJ(map);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        jSONObject.put("search_entrance", strLIZJ);
        if (suggestWordResponse == null || (list = suggestWordResponse.data) == null || (typeWords = (TypeWords) C13LP.LJJJLL(list)) == null || (list2 = typeWords.words) == null || (word = (Word) C13LP.LJJJLL(list2)) == null || (id = word.getId()) == null) {
            id = "";
        }
        jSONObject.put("group_id", id);
        if (suggestWordResponse != null && (str2 = suggestWordResponse.logId) != null) {
            str3 = str2;
        }
        jSONObject.put("impr_id", str3);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("trending_words_click", jSONObject);
    }

    public static void LJIIJJI(Map map, String str, SuggestWordResponse suggestWordResponse) throws JSONException {
        String id;
        String str2;
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        Word word;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        if (str == null) {
            str = "";
        }
        jSONObject.put("words_content", str);
        jSONObject.put("words_source", "search_bar_outer");
        jSONObject.put("words_position", 0);
        LL.getClass();
        String strLIZ = LIZ(map);
        if (strLIZ == null) {
            strLIZ = "";
        }
        jSONObject.put("search_position", strLIZ);
        String strLIZJ = LIZJ(map);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        jSONObject.put("search_entrance", strLIZJ);
        if (suggestWordResponse == null || (list = suggestWordResponse.data) == null || (typeWords = (TypeWords) C13LP.LJJJLL(list)) == null || (list2 = typeWords.words) == null || (word = (Word) C13LP.LJJJLL(list2)) == null || (id = word.getId()) == null) {
            id = "";
        }
        jSONObject.put("group_id", id);
        if (suggestWordResponse != null && (str2 = suggestWordResponse.logId) != null) {
            str3 = str2;
        }
        jSONObject.put("impr_id", str3);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("trending_words_show", jSONObject);
    }

    public static void LJFF(View view, SuggestWordResponse suggestWordResponse, Map map, Map map2, Aweme aweme) throws JSONException {
        String word;
        String strLIZJ;
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        Word word2;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_search_sug_word);
        if (suggestWordResponse != null && (list = suggestWordResponse.data) != null && (typeWords = (TypeWords) C13LP.LJJJLL(list)) != null && (list2 = typeWords.words) != null && (word2 = (Word) C13LP.LJJJLL(list2)) != null) {
            word = word2.getWord();
        } else {
            word = null;
        }
        String str = "";
        if (TextUtils.isEmpty(word)) {
            DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
            Context context = view.getContext();
            detailFeedSearchHelper.getClass();
            strLIZJ = DetailFeedSearchHelper.LIZJ(context);
        } else {
            if (word != null) {
                str = word;
            }
            strLIZJ = word;
        }
        tuxTextView.setText(strLIZJ);
        DetailFeedSearchHelper.LL.getClass();
        DetailFeedSearchHelper.LJIJ(tuxTextView, word, null, map, aweme, null, null);
        if (C123100dR.LIZ(word) && !Intrinsics.LJFF(word, DetailFeedSearchHelper.LIZJ(view.getContext()))) {
            LJIIJJI(map, word, suggestWordResponse);
        }
        boolean zLJFF = Intrinsics.LJFF(tuxTextView.getText().toString(), word);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.nhb);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.za6);
        if (zLJFF) {
            C786410Ut5.R7(linearLayout, new ACListenerS14S1400000_10(view, suggestWordResponse, aweme, str, map, map2, 0));
            C786410Ut5.h9(tuxTextView2, new ACListenerS4S1500000_10(view, suggestWordResponse, aweme, str, map, map2, 3));
        } else {
            C786410Ut5.R7(linearLayout, new ACListenerS14S1400000_10(view, suggestWordResponse, aweme, str, map, map2, 1));
            C786410Ut5.h9(tuxTextView2, new ACListenerS14S1400000_10(view, suggestWordResponse, aweme, str, map, map2, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(android.view.View r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10, java.util.Map r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.ECDetailFeedSearchHelper.LJIIIZ(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.util.Map, java.util.Map):void");
    }
}
