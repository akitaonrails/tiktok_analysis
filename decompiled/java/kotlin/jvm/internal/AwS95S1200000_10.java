package kotlin.jvm.internal;

import X.C09AY;
import X.C0P7Y;
import X.C0PEM;
import X.C0PIF;
import X.C0PQG;
import X.C0PQR;
import X.C0PQV;
import X.C0PQX;
import X.C0PRC;
import X.C0Q9J;
import X.C1202104n5;
import X.C123100dR;
import X.C1397620mTQ;
import X.C13LC;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1821507Bl;
import X.C1839507Ij;
import X.C1848510yCf;
import X.C1858660yT2;
import X.C1863850ybP;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C341380DZw;
import X.C639560P6s;
import X.C643200PKs;
import X.C643420PLo;
import X.C662750Pz7;
import X.C662810PzD;
import X.C676940Qgu;
import X.C678910Qk5;
import X.C680390QmT;
import X.C683220Qr2;
import X.C684120QsU;
import X.C684410Qsx;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC645610PTz;
import X.EnumC657940PrM;
import X.EnumC682590Qq1;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchLynxFilterAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.background.PhotoSearchBackgroundFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell.SearchQueryCorrectCell;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS95S1200000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((C678910Qk5) awS95S1200000_10.l1).LJIIJ((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((C678910Qk5) awS95S1200000_10.l1).LJIIJ((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, false);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJII(2131847083, null);
        c1397620mTQ.LJFF(2131847084, new AwS95S1200000_10(awS95S1200000_10.s0, (String) awS95S1200000_10.l1, (CharSequence) awS95S1200000_10.l2, (CharSequence) 11));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS95S1200000_10 awS95S1200000_10, Object obj) throws JSONException {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Object obj2;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        if (awS95S1200000_10.s0 != null) {
            TakoAnswerBaseAssem takoAnswerBaseAssem = (TakoAnswerBaseAssem) awS95S1200000_10.l1;
            CharSequence charSequence = (CharSequence) awS95S1200000_10.l2;
            String str = awS95S1200000_10.s0;
            String strValueOf = String.valueOf(charSequence);
            str.toString();
            takoAnswerBaseAssem.getClass();
            String str2 = "";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("business_event_keys_stay_time", "tikbot_webpage_stay_time");
            jSONObject.put("business_event_keys_button_click", "tikbot_webpage_button_click");
            jSONObject.put("business_event_keys_close", "tikbot_webpage_close");
            JSONObject jSONObject2 = new JSONObject();
            Object obj8 = null;
            try {
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoAnswerBaseAssem), ITakoContextAbility.class, null);
                if (iTakoContextAbility != null && (c13lcT712 = iTakoContextAbility.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                    String str3 = c1863850ybP2.LL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject2.put("enter_from", str3);
                    String str4 = c1863850ybP2.LLILLJJLI;
                    if (str4 == null) {
                        str4 = "";
                    }
                    jSONObject2.put("enter_method", str4);
                    String str5 = c1863850ybP2.LLILZIL;
                    if (str5 == null) {
                        str5 = "";
                    }
                    jSONObject2.put("process_id", str5);
                    jSONObject2.put("tako_session_id", c1863850ybP2.LLILZLL);
                    C724270Sb3 c724270Sb3 = takoAnswerBaseAssem.LLJI;
                    if (c724270Sb3 != null) {
                        obj3 = c724270Sb3.LL;
                    } else {
                        obj3 = null;
                    }
                    jSONObject2.put("message_id", ((C1858660yT2) obj3).LLILLJJLI);
                    C724270Sb3 c724270Sb32 = takoAnswerBaseAssem.LLJI;
                    if (c724270Sb32 != null) {
                        obj4 = c724270Sb32.LL;
                    } else {
                        obj4 = null;
                    }
                    jSONObject2.put("bot_id", String.valueOf(((C1858660yT2) obj4).LLILZIL));
                    String str6 = c1863850ybP2.LLILLL;
                    if (str6 == null) {
                        str6 = "";
                    }
                    jSONObject2.put("search_id", str6);
                    jSONObject2.put("link_name", strValueOf);
                    jSONObject2.put("link_url", str);
                    C724270Sb3 c724270Sb33 = takoAnswerBaseAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj5 = c724270Sb33.LL;
                    } else {
                        obj5 = null;
                    }
                    Long lValueOf = Long.valueOf(((C1858660yT2) obj5).LLILZ);
                    if (lValueOf.longValue() > 0) {
                        lValueOf.longValue();
                        C724270Sb3 c724270Sb34 = takoAnswerBaseAssem.LLJI;
                        if (c724270Sb34 != null) {
                            obj7 = c724270Sb34.LL;
                        } else {
                            obj7 = null;
                        }
                        jSONObject2.put("action_item_id", ((C1858660yT2) obj7).LLILZ);
                    }
                    C724270Sb3 c724270Sb35 = takoAnswerBaseAssem.LLJI;
                    if (c724270Sb35 != null) {
                        obj6 = c724270Sb35.LL;
                    } else {
                        obj6 = null;
                    }
                    String str7 = ((C1858660yT2) obj6).LLILLL;
                    if (C123100dR.LIZ(str7) && str7 != null) {
                        jSONObject2.put("sub_process_id", str7);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://search_third_party/?url=");
            sbLIZ.append(str);
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("business_event_tracking", C786410Ut5.J3(jSONObject2)).appendQueryParameter("business_event_keys", C786410Ut5.J3(jSONObject)).appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis()));
            JSONObject jSONObject3 = new JSONObject();
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoAnswerBaseAssem), ITakoContextAbility.class, null);
            if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                String str8 = c1863850ybP.LL;
                if (str8 == null) {
                    str8 = "";
                }
                jSONObject3.put("tako_enter_from", str8);
                String str9 = c1863850ybP.LLILLJJLI;
                if (str9 == null) {
                    str9 = "";
                }
                jSONObject3.put("tako_enter_method", str9);
                String str10 = c1863850ybP.LLILZIL;
                if (str10 != null) {
                    str2 = str10;
                }
                jSONObject3.put("tako_process_id", str2);
                C724270Sb3 c724270Sb36 = takoAnswerBaseAssem.LLJI;
                if (c724270Sb36 != null) {
                    obj2 = c724270Sb36.LL;
                } else {
                    obj2 = null;
                }
                jSONObject3.put("tako_message_id", ((C1858660yT2) obj2).LLILLJJLI);
                C724270Sb3 c724270Sb37 = takoAnswerBaseAssem.LLJI;
                if (c724270Sb37 != null) {
                    obj8 = c724270Sb37.LL;
                }
                String str11 = ((C1858660yT2) obj8).LLILLL;
                if (C123100dR.LIZ(str11) && str11 != null) {
                    jSONObject3.put("sub_process_id", str11);
                }
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("report_event_tracking", C786410Ut5.J3(jSONObject3));
            C19EG c19egLIZ = C724240Sb0.LIZ(takoAnswerBaseAssem);
            if (c19egLIZ != null) {
                SmartRouter.buildRoute(c19egLIZ, builderAppendQueryParameter2.build().toString()).open();
            }
            takoAnswerBaseAssem.DP0(String.valueOf(charSequence), str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        C341380DZw c341380DZw = C341380DZw.LIZ;
        View view = (View) awS95S1200000_10.l1;
        String value = awS95S1200000_10.s0;
        Map map = (Map) awS95S1200000_10.l2;
        c341380DZw.getClass();
        boolean z = C0Q9J.LIZ;
        if (value == null) {
            value = EnumC682590Qq1.MULTI_VIDEO.getValue();
        }
        List listLIZLLL = C684120QsU.LIZLLL(value);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "click_button");
        linkedHashMap.put("is_page", "1");
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value2 = entry.getValue();
            if (value2 != null) {
                linkedHashMap.put(key, value2);
            }
        }
        C684120QsU.LIZIZ(view, new C683220Qr2(value, null, "", listLIZLLL, linkedHashMap, null, null, null, false, false, false, false, null, null, null, 262114), false, null, null, 28);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((SearchQueryCorrectCell) awS95S1200000_10.l1).N5((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, true);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((SearchQueryCorrectCell) awS95S1200000_10.l1).N5((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, true);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((SearchQueryCorrectCell) awS95S1200000_10.l1).N5((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, false);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((SearchQueryCorrectCell) awS95S1200000_10.l1).N5((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, false);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((SearchQueryCorrectCell) awS95S1200000_10.l1).N5((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, false);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        if (((Boolean) ((Function0) awS95S1200000_10.l1).invoke()).booleanValue()) {
            ((C0PQR) awS95S1200000_10.l2).LIZLLL().postValue(obj);
        } else {
            C1202104n5.LIZ().LJIILIIL("fail", C0PQG.INSERT_FAIL.getMessage(), awS95S1200000_10.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C0PQV((EnumC645610PTz) awS95S1200000_10.l1, awS95S1200000_10.s0, (Function1) awS95S1200000_10.l2, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((C678910Qk5) awS95S1200000_10.l1).LJIIJ((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, false);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS95S1200000_10 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS95S1200000_10.invoke$20(kotlin.jvm.internal.AwS95S1200000_10, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        Function1 function1;
        List<Aweme> list;
        ContinuousLoadingAwemeList continuousLoadingAwemeList = (ContinuousLoadingAwemeList) obj;
        if (continuousLoadingAwemeList != null && (list = continuousLoadingAwemeList.awemeList) != null) {
            String str = awS95S1200000_10.s0;
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                C643200PKs.LIZJ(it2.next(), str);
            }
        }
        if (C1821507Bl.LIZ() && (function1 = (Function1) awS95S1200000_10.l1) != null) {
            function1.invoke(continuousLoadingAwemeList);
        } else {
            Function1 function12 = (Function1) awS95S1200000_10.l2;
            if (function12 != null) {
                function12.invoke(continuousLoadingAwemeList);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        String str;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
        AddressCardProducts addressCardProducts = (AddressCardProducts) awS95S1200000_10.l1;
        if (addressCardProducts != null) {
            EcStoreLiveAssem ecStoreLiveAssem = (EcStoreLiveAssem) awS95S1200000_10.l2;
            enterRoomConfig.mRoomsData.extraSchema = C662810PzD.LJI(addressCardProducts, false, ecStoreLiveAssem.LLJLL, null, C1558520qew.LJIIL(ecStoreLiveAssem), ecStoreLiveAssem.getContext(), EnumC657940PrM.GENERAL_SEARCH_STORE_CARD);
        }
        try {
            str = ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL((EcStoreLiveAssem) awS95S1200000_10.l2), ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = "";
        }
        C662810PzD.LIZ(enterRoomConfig, ((EcStoreLiveAssem) awS95S1200000_10.l2).LLJLL, str);
        String str2 = awS95S1200000_10.s0;
        if (str2 != null) {
            enterRoomConfig.mLogData.sourceBtmToken = str2;
        }
        return enterRoomConfig;
    }

    public static final Object invoke$3(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((C678910Qk5) awS95S1200000_10.l1).LJIIJ((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, true);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((C678910Qk5) awS95S1200000_10.l1).LJIIJ((QueryCorrectComponentInfo) awS95S1200000_10.l2, awS95S1200000_10.s0, false);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        int iOptInt;
        C676940Qgu c676940Qgu = (C676940Qgu) obj;
        boolean z4 = true;
        if (!((JSONObject) awS95S1200000_10.l1).has("filterVisible") && !((JSONObject) awS95S1200000_10.l1).has("filter_visible")) {
            z = false;
        } else {
            z = true;
        }
        if (!((JSONObject) awS95S1200000_10.l1).has("filterSelectedCount") && !((JSONObject) awS95S1200000_10.l1).has("filter_selected_count")) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str = awS95S1200000_10.s0;
        String strOptString = ((JSONObject) awS95S1200000_10.l1).optString("sortKey");
        if (strOptString.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            strOptString = c676940Qgu.LLILLJJLI;
        }
        String strOptString2 = ((JSONObject) awS95S1200000_10.l1).optString("sortTitle");
        if (strOptString2.length() <= 0) {
            strOptString2 = c676940Qgu.LLILLL;
        }
        boolean zOptBoolean = ((JSONObject) awS95S1200000_10.l1).optBoolean("sortPanelOpen", c676940Qgu.LLILZ);
        if (!z) {
            z4 = c676940Qgu.LLILZIL;
        }
        ECSearchLynxFilterAssem eCSearchLynxFilterAssem = (ECSearchLynxFilterAssem) awS95S1200000_10.l2;
        JSONObject jSONObject = (JSONObject) awS95S1200000_10.l1;
        boolean zOptBoolean2 = c676940Qgu.LLILZLL;
        eCSearchLynxFilterAssem.getClass();
        if (jSONObject.has("filterVisible")) {
            zOptBoolean2 = jSONObject.optBoolean("filterVisible", zOptBoolean2);
        } else if (jSONObject.has("filter_visible")) {
            zOptBoolean2 = jSONObject.optBoolean("filter_visible", zOptBoolean2);
        }
        if (z2) {
            JSONObject jSONObject2 = (JSONObject) awS95S1200000_10.l1;
            iOptInt = jSONObject2.optInt("filterSelectedCount", jSONObject2.optInt("filter_selected_count", c676940Qgu.LLIZ));
        } else {
            iOptInt = c676940Qgu.LLIZ;
        }
        return new C676940Qgu(str, strOptString, strOptString2, zOptBoolean, iOptInt, z4, zOptBoolean2);
    }

    public static final Object invoke$6(AwS95S1200000_10 awS95S1200000_10, Object obj) throws JSONException {
        int i;
        String strXQ2;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("words_source", "photo_search");
        C680390QmT c680390QmT = (C680390QmT) awS95S1200000_10.l1;
        if (c680390QmT != null) {
            i = c680390QmT.LIZ;
        } else {
            i = 1;
        }
        jSONObject.put("words_position", i);
        jSONObject.put("entity_coord", awS95S1200000_10.s0);
        jSONObject.put("is_user_add", 1);
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchBackgroundFragment) awS95S1200000_10.l2).LLILZIL;
        String str = null;
        if (photoSearchBaseVM != null) {
            strXQ2 = photoSearchBaseVM.xQ2(null);
        } else {
            strXQ2 = null;
        }
        jSONObject.put("raw_pic", strXQ2);
        PhotoSearchBaseVM photoSearchBaseVM2 = ((PhotoSearchBackgroundFragment) awS95S1200000_10.l2).LLILZIL;
        if (photoSearchBaseVM2 != null) {
            str = photoSearchBaseVM2.LLJJIJI;
        }
        jSONObject.put("first_photo_search_id", str);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        ((OpenAlertMethod) awS95S1200000_10.l1).processKeyboard((Activity) awS95S1200000_10.l2, awS95S1200000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        C1848510yCf c1848510yCf = (C1848510yCf) obj;
        c1848510yCf.LJFF(new AwS124S1100000_10(awS95S1200000_10.s0, (SearchJediMixFeedFragment) awS95S1200000_10.l1, 10));
        if (((Boolean) C639560P6s.LIZ.getValue()).booleanValue()) {
            if (!C0P7Y.LIZ()) {
                int iIdentityHashCode = System.identityHashCode(((SearchJediMixFeedFragment) awS95S1200000_10.l1).LLJI);
                C662750Pz7 c662750Pz7 = C662750Pz7.LIZ;
                ViewGroup viewGroup = (ViewGroup) awS95S1200000_10.l2;
                Integer numValueOf = Integer.valueOf(iIdentityHashCode);
                c662750Pz7.getClass();
                c1848510yCf.LJI(C662750Pz7.LIZIZ(viewGroup, numValueOf));
                ((LiveData) ((SearchJediMixFeedFragment) awS95S1200000_10.l1).LLLLLLIL.getValue()).setValue(Integer.valueOf(iIdentityHashCode));
            } else {
                C662750Pz7 c662750Pz72 = C662750Pz7.LIZ;
                SearchResultParam searchResultParam = ((SearchJediMixFeedFragment) awS95S1200000_10.l1).LLJI;
                c662750Pz72.getClass();
                if (searchResultParam != null) {
                    c662750Pz72.getClass();
                    ((LiveData) C662750Pz7.LJFF.getValue()).setValue(Integer.valueOf(System.identityHashCode(searchResultParam)));
                }
                c1848510yCf.LJI(C662750Pz7.LIZIZ((ViewGroup) awS95S1200000_10.l2, null));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS95S1200000_10 awS95S1200000_10, Object obj) {
        String str;
        List list = (List) obj;
        C0PIF c0pif = C0PIF.LIZ;
        String str2 = ((C643420PLo) awS95S1200000_10.l1).LIZJ;
        c0pif.getClass();
        int i = 0;
        C0PIF.LJ(str2, null, list, false);
        SearchMixFeed searchMixFeed = (SearchMixFeed) awS95S1200000_10.l2;
        C643420PLo c643420PLo = (C643420PLo) awS95S1200000_10.l1;
        String str3 = awS95S1200000_10.s0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme = (Aweme) obj2;
                if (C1839507Ij.LIZ()) {
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_result_id", searchMixFeed.getProviderDocIdStr());
                }
                if (c643420PLo.LJ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                AwemeExtKt.appendExtraParamUseInSearch(aweme, "is_page", str);
                AwemeExtKt.appendExtraParamUseInSearch(aweme, "token_type", str3);
                AwemeExtKt.appendExtraParamUseInSearch(aweme, "fullscreen_actual_rank", String.valueOf(i));
                if (C123100dR.LIZ(searchMixFeed.getDynamicPatch().getTokenType())) {
                    AwemeBizExtKt.setSearchFeedType(aweme, "SearchLynxVideo");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(C643420PLo c643420PLo, SearchMixFeed searchMixFeed, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c643420PLo;
        this.l2 = searchMixFeed;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS95S1200000_10(EnumC645610PTz enumC645610PTz, EnumC645610PTz enumC645610PTz2, String str, Function1<? super C0PQX, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = enumC645610PTz;
        this.s0 = enumC645610PTz2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(C678910Qk5 c678910Qk5, QueryCorrectComponentInfo queryCorrectComponentInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c678910Qk5;
        this.l2 = queryCorrectComponentInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(C680390QmT c680390QmT, String str, PhotoSearchBackgroundFragment photoSearchBackgroundFragment, int i) {
        super(1);
        this.$t = i;
        this.l1 = c680390QmT;
        this.s0 = str;
        this.l2 = photoSearchBackgroundFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(C684410Qsx c684410Qsx, Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c684410Qsx;
        this.l2 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(AddressCardProducts addressCardProducts, EcStoreLiveAssem ecStoreLiveAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = addressCardProducts;
        this.l2 = ecStoreLiveAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(OpenAlertMethod openAlertMethod, Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = openAlertMethod;
        this.l2 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(SearchJediMixFeedFragment searchJediMixFeedFragment, ViewGroup viewGroup, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = searchJediMixFeedFragment;
        this.l2 = viewGroup;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(SearchQueryCorrectCell searchQueryCorrectCell, QueryCorrectComponentInfo queryCorrectComponentInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = searchQueryCorrectCell;
        this.l2 = queryCorrectComponentInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(String str, View view, Map map, int i) {
        super(1);
        this.$t = i;
        this.l1 = view;
        this.s0 = str;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS95S1200000_10(String str, String str2, TakoAnswerBaseAssem<T> takoAnswerBaseAssem, CharSequence charSequence) {
        super(1);
        this.$t = charSequence;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = takoAnswerBaseAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(String str, Function1 function1, Function1 function12, int i) {
        super(1);
        this.$t = i;
        this.l1 = function1;
        this.l2 = function12;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(AwS150S0101000_10 awS150S0101000_10, C0PQR c0pqr, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS150S0101000_10;
        this.l2 = c0pqr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS95S1200000_10(JSONObject jSONObject, String str, ECSearchLynxFilterAssem eCSearchLynxFilterAssem, int i) {
        super(1);
        this.$t = i;
        this.l1 = jSONObject;
        this.s0 = str;
        this.l2 = eCSearchLynxFilterAssem;
    }
}
