package kotlin.jvm.internal;

import X.AbstractC683420QrM;
import X.C093Y;
import X.C09AY;
import X.C0PHW;
import X.C0PHX;
import X.C0Q67;
import X.C0QDD;
import X.C0QQZ;
import X.C1309760kBi;
import X.C14NX;
import X.C1623606Xi;
import X.C2097608Jq;
import X.C2190321Anu;
import X.C291001Au;
import X.C644220POq;
import X.C645770PUp;
import X.C649470Pdh;
import X.C653560PkI;
import X.C671310QUv;
import X.C681100Qnc;
import X.C681760Qog;
import X.C681900Qou;
import X.C683390QrJ;
import X.C684540QtA;
import X.EnumC664680Q5i;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS61S1000000_10 extends C09AY implements Function1 {
    public final int $t;
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
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S1000000_10(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        final String str = awS61S1000000_10.s0;
        return C683390QrJ.LIZ((C683390QrJ) obj, new AbstractC683420QrM(str) { // from class: X.0QrO
        }, null, null, 0, null, 30);
    }

    public static final Object invoke$1(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        final String str = awS61S1000000_10.s0;
        return C683390QrJ.LIZ((C683390QrJ) obj, new AbstractC683420QrM(str) { // from class: X.0QrP
        }, null, null, 0, null, 30);
    }

    public static final Object invoke$10(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return C684540QtA.LIZ((C684540QtA) obj, null, null, null, null, 0L, null, new C291001Au(awS61S1000000_10.s0), null, null, null, 959);
    }

    public static final Object invoke$11(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C684540QtA c684540QtA = (C684540QtA) obj;
        Set setLJ = C093Y.LJ(awS61S1000000_10.s0);
        setLJ.addAll(c684540QtA.LLILLL);
        return C684540QtA.LIZ(c684540QtA, null, null, setLJ, null, 0L, null, null, null, null, null, 1019);
    }

    public static final Object invoke$12(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C684540QtA c684540QtA = (C684540QtA) obj;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = awS61S1000000_10.s0;
        linkedHashSet.addAll(c684540QtA.LLILZLL);
        linkedHashSet.remove(str);
        return C684540QtA.LIZ(c684540QtA, null, null, null, null, 0L, linkedHashSet, null, null, null, null, 991);
    }

    public static final Object invoke$13(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return C684540QtA.LIZ((C684540QtA) obj, null, null, null, null, 0L, null, null, null, new C291001Au(awS61S1000000_10.s0), null, 767);
    }

    public static final Object invoke$14(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return C2097608Jq.LJIIIIZZ(new Pair("content_type", awS61S1000000_10.s0), new Pair("surface", "search_photo_card"), new Pair("prefetch_group", String.valueOf(C2190321Anu.LIZ())));
    }

    public static final Object invoke$15(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C0PHX c0phx = (C0PHX) obj;
        boolean z = false;
        if (c0phx != null) {
            c0phx.LJ();
            List<C0PHW> list = c0phx.LJIIJJI;
            if (list != null) {
                String str = awS61S1000000_10.s0;
                Iterator it2 = ((ArrayList) list).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((C0PHW) it2.next()).LIZ, str)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$16(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C14NX) obj).getId(), awS61S1000000_10.s0));
    }

    public static final Object invoke$17(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return C681100Qnc.LIZ((C681100Qnc) obj, 0, null, null, false, null, awS61S1000000_10.s0, 31);
    }

    public static final Object invoke$18(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return C681100Qnc.LIZ((C681100Qnc) obj, 0, awS61S1000000_10.s0, null, false, null, null, 61);
    }

    public static final Object invoke$19(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return awS61S1000000_10.s0;
    }

    public static final Object invoke$2(AwS61S1000000_10 awS61S1000000_10, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("container_type", C0QQZ.HALF_NEW.getValue());
        jSONObject.put("action", awS61S1000000_10.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C0Q67 c0q67 = (C0Q67) obj;
        String str = awS61S1000000_10.s0;
        EnumC664680Q5i enumC664680Q5i = c0q67.LL;
        c0q67.getClass();
        return new C0Q67(enumC664680Q5i, str);
    }

    public static final Object invoke$21(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((EcSearchAIHistoryWord) obj).word, awS61S1000000_10.s0));
    }

    public static final Object invoke$22(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((EcSearchAIHistoryWord) obj).word, awS61S1000000_10.s0));
    }

    public static final Object invoke$23(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        String str = awS61S1000000_10.s0;
        c649470Pdh.getClass();
        C649470Pdh.LJJIIZ((C1309760kBi) obj, str);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        String str = awS61S1000000_10.s0;
        c649470Pdh.getClass();
        C649470Pdh.LJJIIZ((C1309760kBi) obj, str);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return C671310QUv.LIZ((C671310QUv) obj, awS61S1000000_10.s0, null, null, null, false, false, 62);
    }

    public static final Object invoke$3(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C291001Au c291001Au = new C291001Au(new C681900Qou(new C1623606Xi(awS61S1000000_10.s0), false));
        obj.getClass();
        return new C681760Qog(c291001Au);
    }

    public static final Object invoke$4(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        List<Aweme> list;
        ContinuousLoadingAwemeList continuousLoadingAwemeList = (ContinuousLoadingAwemeList) obj;
        if (continuousLoadingAwemeList != null && (list = continuousLoadingAwemeList.awemeList) != null) {
            String str = awS61S1000000_10.s0;
            for (Aweme aweme : list) {
                int i = C0QDD.LLJI;
                C653560PkI.LIZ(str, aweme.getAid(), "hot_user", aweme);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C644220POq c644220POq = (C644220POq) obj;
        String str = awS61S1000000_10.s0;
        if (str == null) {
            str = "";
        }
        c644220POq.LIZJ(2, str);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        String str;
        TemplateData element = ((C14NX) obj).getElement();
        if (element != null) {
            str = element.id;
        } else {
            str = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, awS61S1000000_10.s0));
    }

    public static final Object invoke$7(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        String str;
        TemplateData element = ((C14NX) obj).getElement();
        if (element != null) {
            str = element.id;
        } else {
            str = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, awS61S1000000_10.s0));
    }

    public static final Object invoke$8(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        return C2097608Jq.LJIIIIZZ(new Pair("content_type", awS61S1000000_10.s0), new Pair("surface", "search_photo_card"), new Pair("prefetch_group", String.valueOf(C2190321Anu.LIZ())));
    }

    public static final Object invoke$9(AwS61S1000000_10 awS61S1000000_10, Object obj) {
        C684540QtA c684540QtA = (C684540QtA) obj;
        Set setLJ = C093Y.LJ(awS61S1000000_10.s0);
        setLJ.addAll(c684540QtA.LLILZLL);
        return C684540QtA.LIZ(c684540QtA, null, null, null, null, 0L, setLJ, null, null, null, null, 991);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S1000000_10(C645770PUp c645770PUp, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S1000000_10(String str, String str2, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }
}
