package kotlin.jvm.internal;

import X.AbstractC1789120wes;
import X.AbstractC1789510wfV;
import X.C09AY;
import X.C0Y8T;
import X.C1336205Ku;
import X.C15438062q;
import X.C1786440waY;
import X.C1786460waa;
import X.C1786470wab;
import X.C1786490wad;
import X.C1786640was;
import X.C1786660wau;
import X.C1786680waw;
import X.C1786850wbD;
import X.C1786890wbH;
import X.C1786910wbJ;
import X.C1787830wcn;
import X.C1788400wdi;
import X.C1788430wdl;
import X.C1788480wdq;
import X.C1788530wdv;
import X.C1788540wdw;
import X.C1788590we1;
import X.C1788610we3;
import X.C1788860weS;
import X.C1788880weU;
import X.C1789100weq;
import X.C1789110wer;
import X.C1789520wfW;
import X.C1789810wfz;
import X.C1789830wg1;
import X.C1789850wg3;
import X.C189200o6;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21300318Xh;
import X.C790730V0d;
import X.C790740V0e;
import X.C790750V0f;
import X.EnumC1157990gEv;
import X.EnumC1779090wOh;
import X.EnumC1787180wbk;
import X.InterfaceC1780600wR8;
import X.InterfaceC1786610wap;
import X.InterfaceC1786840wbC;
import X.InterfaceC21300418Xi;
import android.view.View;
import com.bytedance.iap.core.model.IAPProductDetail;
import com.bytedance.iap.core.model.IAPQueryRequest;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class AwS17S0300100_27 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        String conversationId;
        C0Y8T c0y8tWQ2 = ((DetailMediaGridContentAssem) awS17S0300100_27.l0).ip().wQ2();
        if (c0y8tWQ2 != null && (conversationId = c0y8tWQ2.getConversationId()) != null) {
            C1336205Ku.LIZ(false).getImChatService().LJIIZILJ(((View) awS17S0300100_27.l2).getContext(), Long.valueOf(awS17S0300100_27.j3), conversationId);
        }
        ((InterfaceC21300418Xi) ((C21300318Xh) awS17S0300100_27.l1).LJFF.getValue()).LIZIZ(EnumC1779090wOh.DISMISS);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        C1788860weS c1788860weS = (C1788860weS) obj;
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair(c1788860weS.LJI, "false"), new Pair(c1788860weS.LIZIZ, ((IAPQueryRequest) awS17S0300100_27.l0).merchantId), new Pair(c1788860weS.LIZJ, ((IAPQueryRequest) awS17S0300100_27.l0).productType.getValue()), new Pair(c1788860weS.LJ, ((IAPQueryRequest) awS17S0300100_27.l0).productIds.toString()), new Pair(c1788860weS.LIZLLL, "true"), new Pair(c1788860weS.LJII, String.valueOf(((EnumC1787180wbk) ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l1)).LIZ).LIZ).getCode())), new Pair(c1788860weS.LJIIIIZZ, ((EnumC1787180wbk) ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l1)).LIZ).LIZ).getMessage()), new Pair(c1788860weS.LJIIJ, String.valueOf(awS17S0300100_27.j3))), ((C1788540wdw) awS17S0300100_27.l2).LIZJ.getCommonEventInfo());
    }

    public static final Object invoke$10(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        Object objValueOf;
        C1786680waw c1786680waw;
        C1786660wau c1786660wau = (C1786660wau) obj;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(c1786660wau.LIZJ, "207");
        String str = c1786660wau.LIZLLL;
        Throwable th = (Throwable) awS17S0300100_27.l0;
        if ((th instanceof C1786680waw) && (c1786680waw = (C1786680waw) th) != null) {
            objValueOf = Integer.valueOf(c1786680waw.getErrorCode());
        } else {
            objValueOf = "-1";
        }
        pairArr[1] = new Pair(str, objValueOf.toString());
        pairArr[2] = new Pair(c1786660wau.LJ, ((Throwable) awS17S0300100_27.l0).getMessage());
        pairArr[3] = new Pair(c1786660wau.LIZIZ, String.valueOf(((C1786640was) awS17S0300100_27.l1).LIZIZ.currentTimeMillis() - awS17S0300100_27.j3));
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1787830wcn) awS17S0300100_27.l2).LIZIZ()), ((C1786640was) awS17S0300100_27.l1).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$11(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        return C2097608Jq.LJIIL(((InterfaceC1786610wap) awS17S0300100_27.l0).getParams(), C2097608Jq.LJIIL(C2097908Jt.LIZJ(new Pair(((C1788480wdq) obj).LIZIZ, String.valueOf(((C1788400wdi) awS17S0300100_27.l1).LIZJ.currentTimeMillis() - awS17S0300100_27.j3))), ((C1787830wcn) awS17S0300100_27.l2).LIZIZ()));
    }

    public static final Object invoke$12(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        Object objValueOf;
        C1786680waw c1786680waw;
        C1788430wdl c1788430wdl = (C1788430wdl) obj;
        Map<String, String> params = ((InterfaceC1786610wap) awS17S0300100_27.l0).getParams();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(c1788430wdl.LIZIZ, "1");
        pairArr[1] = new Pair(c1788430wdl.LIZJ, "1");
        String str = c1788430wdl.LIZLLL;
        Throwable th = (Throwable) awS17S0300100_27.l1;
        if ((th instanceof C1786680waw) && (c1786680waw = (C1786680waw) th) != null) {
            objValueOf = Integer.valueOf(c1786680waw.getErrorCode());
        } else {
            objValueOf = "-1";
        }
        pairArr[2] = new Pair(str, objValueOf.toString());
        pairArr[3] = new Pair(c1788430wdl.LJ, ((Throwable) awS17S0300100_27.l1).getMessage());
        pairArr[4] = new Pair(c1788430wdl.LJFF, String.valueOf(((C1788400wdi) awS17S0300100_27.l2).LIZJ.currentTimeMillis() - awS17S0300100_27.j3));
        return C2097608Jq.LJIIL(params, C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static final Object invoke$13(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        String string;
        C1786890wbH c1786890wbH = (C1786890wbH) obj;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(c1786890wbH.LIZIZ, String.valueOf(awS17S0300100_27.j3));
        pairArr[1] = new Pair(c1786890wbH.LIZJ, String.valueOf(EnumC1157990gEv.PENDING.getValue()));
        pairArr[2] = new Pair(c1786890wbH.LIZLLL, "-202");
        pairArr[3] = new Pair(c1786890wbH.LJ, String.valueOf(((C790750V0f) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZ));
        String str = c1786890wbH.LJFF;
        Integer num = ((C790750V0f) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        pairArr[4] = new Pair(str, string);
        pairArr[5] = new Pair(c1786890wbH.LJI, ((C790750V0f) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZIZ);
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1787830wcn) awS17S0300100_27.l1).LIZIZ()), ((C1786850wbD) awS17S0300100_27.l2).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$14(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        String string;
        C1786890wbH c1786890wbH = (C1786890wbH) obj;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(c1786890wbH.LIZIZ, String.valueOf(awS17S0300100_27.j3));
        pairArr[1] = new Pair(c1786890wbH.LIZJ, String.valueOf(EnumC1157990gEv.UNKNOWN.getValue()));
        pairArr[2] = new Pair(c1786890wbH.LIZLLL, "203");
        pairArr[3] = new Pair(c1786890wbH.LJ, String.valueOf(((C790750V0f) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZ));
        String str = c1786890wbH.LJFF;
        Integer num = ((C790750V0f) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        pairArr[4] = new Pair(str, string);
        pairArr[5] = new Pair(c1786890wbH.LJI, ((C790750V0f) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZIZ);
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1787830wcn) awS17S0300100_27.l1).LIZIZ()), ((C1786850wbD) awS17S0300100_27.l2).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$15(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        String string;
        C1786890wbH c1786890wbH = (C1786890wbH) obj;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(c1786890wbH.LIZIZ, String.valueOf(awS17S0300100_27.j3));
        pairArr[1] = new Pair(c1786890wbH.LIZJ, String.valueOf(EnumC1157990gEv.UNKNOWN.getValue()));
        pairArr[2] = new Pair(c1786890wbH.LIZLLL, "206");
        pairArr[3] = new Pair(c1786890wbH.LJ, String.valueOf(((C790730V0d) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZ));
        String str = c1786890wbH.LJFF;
        Integer num = ((C790730V0d) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        pairArr[4] = new Pair(str, string);
        pairArr[5] = new Pair(c1786890wbH.LJI, ((C790730V0d) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZIZ);
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1787830wcn) awS17S0300100_27.l1).LIZIZ()), ((C1786850wbD) awS17S0300100_27.l2).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$16(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        String string;
        C1786890wbH c1786890wbH = (C1786890wbH) obj;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(c1786890wbH.LIZIZ, String.valueOf(awS17S0300100_27.j3));
        pairArr[1] = new Pair(c1786890wbH.LIZJ, String.valueOf(EnumC1157990gEv.UNKNOWN.getValue()));
        pairArr[2] = new Pair(c1786890wbH.LIZLLL, "203");
        pairArr[3] = new Pair(c1786890wbH.LJ, String.valueOf(((C790740V0e) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZ));
        String str = c1786890wbH.LJFF;
        Integer num = ((C790740V0e) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        pairArr[4] = new Pair(str, string);
        pairArr[5] = new Pair(c1786890wbH.LJI, ((C790740V0e) ((InterfaceC1786840wbC) awS17S0300100_27.l0)).LIZIZ);
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1787830wcn) awS17S0300100_27.l1).LIZIZ()), ((C1786850wbD) awS17S0300100_27.l2).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$2(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        C1788860weS c1788860weS = (C1788860weS) obj;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(c1788860weS.LJI, "true");
        pairArr[1] = new Pair(c1788860weS.LIZIZ, ((IAPQueryRequest) awS17S0300100_27.l0).merchantId);
        pairArr[2] = new Pair(c1788860weS.LIZJ, ((IAPQueryRequest) awS17S0300100_27.l0).productType.getValue());
        pairArr[3] = new Pair(c1788860weS.LJ, ((IAPQueryRequest) awS17S0300100_27.l0).productIds.toString());
        String str = c1788860weS.LJFF;
        Iterable iterable = (Iterable) ((C1789100weq) ((AbstractC1789120wes) awS17S0300100_27.l1)).LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IAPProductDetail) it2.next()).LIZ);
        }
        pairArr[4] = new Pair(str, arrayList.toString());
        pairArr[5] = new Pair(c1788860weS.LIZLLL, "false");
        pairArr[6] = new Pair(c1788860weS.LJIIJ, String.valueOf(awS17S0300100_27.j3));
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1788530wdv) awS17S0300100_27.l2).LIZJ.getCommonEventInfo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        C1788860weS c1788860weS = (C1788860weS) obj;
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair(c1788860weS.LJI, "false"), new Pair(c1788860weS.LIZIZ, ((IAPQueryRequest) awS17S0300100_27.l0).merchantId), new Pair(c1788860weS.LIZJ, ((IAPQueryRequest) awS17S0300100_27.l0).productType.getValue()), new Pair(c1788860weS.LJ, ((IAPQueryRequest) awS17S0300100_27.l0).productIds.toString()), new Pair(c1788860weS.LIZLLL, "false"), new Pair(c1788860weS.LJII, String.valueOf(((EnumC1787180wbk) ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l1)).LIZ).LIZ).getCode())), new Pair(c1788860weS.LJIIIIZZ, ((EnumC1787180wbk) ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l1)).LIZ).LIZ).getMessage()), new Pair(c1788860weS.LJIIIZ, ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l1)).LIZ).LIZIZ.getMessage()), new Pair(c1788860weS.LJIIJ, String.valueOf(awS17S0300100_27.j3))), ((C1788530wdv) awS17S0300100_27.l2).LIZJ.getCommonEventInfo());
    }

    public static final Object invoke$4(AwS17S0300100_27 awS17S0300100_27, Object obj) throws JSONException {
        C1789830wg1 c1789830wg1 = (C1789830wg1) obj;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(c1789830wg1.LIZIZ, ((C1789850wg3) awS17S0300100_27.l0).LIZIZ.toString());
        pairArr[1] = new Pair(c1789830wg1.LIZJ, ((C1789850wg3) awS17S0300100_27.l0).LIZJ.toString());
        String str = c1789830wg1.LIZLLL;
        C1789810wfz c1789810wfz = (C1789810wfz) awS17S0300100_27.l1;
        List<C1786470wab> list = (List) awS17S0300100_27.l2;
        c1789810wfz.getClass();
        JSONArray jSONArray = new JSONArray();
        for (C1786470wab c1786470wab : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_sku_id", c1786470wab.LIZ);
            jSONObject.put("sku_id", c1786470wab.LIZIZ);
            jSONObject.put("base_plan_id", c1786470wab.LIZJ);
            jSONObject.put("offer_id", c1786470wab.LIZLLL);
            jSONArray.put(jSONObject);
        }
        pairArr[2] = new Pair(str, jSONArray.toString());
        pairArr[3] = new Pair(c1789830wg1.LJ, String.valueOf(System.currentTimeMillis() - awS17S0300100_27.j3));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final Object invoke$5(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        C1786490wad c1786490wad = (C1786490wad) obj;
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair(c1786490wad.LIZLLL, CardStruct.IStatusCode.DEFAULT), new Pair(c1786490wad.LIZIZ, ((C1786460waa) awS17S0300100_27.l0).LIZIZ.toString()), new Pair(c1786490wad.LIZJ, ((List) awS17S0300100_27.l1).toString()), new Pair(c1786490wad.LJI, String.valueOf(System.currentTimeMillis() - awS17S0300100_27.j3))), ((C1786440waY) awS17S0300100_27.l2).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$6(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        Object objValueOf;
        String message;
        C1786910wbJ c1786910wbJ;
        C1786910wbJ c1786910wbJ2;
        C1786490wad c1786490wad = (C1786490wad) obj;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(c1786490wad.LIZIZ, ((C1786460waa) awS17S0300100_27.l0).LIZIZ.toString());
        pairArr[1] = new Pair(c1786490wad.LJI, String.valueOf(System.currentTimeMillis() - awS17S0300100_27.j3));
        pairArr[2] = new Pair(c1786490wad.LIZLLL, "211");
        String str = c1786490wad.LJ;
        Throwable th = (Throwable) awS17S0300100_27.l1;
        if ((th instanceof C1786910wbJ) && (c1786910wbJ2 = (C1786910wbJ) th) != null) {
            objValueOf = Integer.valueOf(c1786910wbJ2.getErrorCode());
        } else {
            objValueOf = "-1";
        }
        pairArr[3] = new Pair(str, objValueOf.toString());
        String str2 = c1786490wad.LJFF;
        Throwable th2 = (Throwable) awS17S0300100_27.l1;
        if (!(th2 instanceof C1786910wbJ) || (c1786910wbJ = (C1786910wbJ) th2) == null || (message = c1786910wbJ.getErrorMessage()) == null) {
            message = ((Throwable) awS17S0300100_27.l1).getMessage();
        }
        pairArr[4] = new Pair(str2, message);
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1786440waY) awS17S0300100_27.l2).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$7(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        C1789520wfW c1789520wfW = (C1789520wfW) obj;
        return C2097608Jq.LJIIIIZZ(new Pair(c1789520wfW.LIZIZ, ((AbstractC1789510wfV) awS17S0300100_27.l0).LJI()), new Pair(c1789520wfW.LIZJ, "true"), new Pair(c1789520wfW.LIZLLL, ((AbstractC1789510wfV) awS17S0300100_27.l0).LJFF(awS17S0300100_27.l1)), new Pair(c1789520wfW.LJ, ((AbstractC1789510wfV) awS17S0300100_27.l0).LJII(((C1789100weq) ((AbstractC1789120wes) awS17S0300100_27.l2)).LIZ)), new Pair(c1789520wfW.LJIIIIZZ, String.valueOf(awS17S0300100_27.j3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        C1789520wfW c1789520wfW = (C1789520wfW) obj;
        return C2097608Jq.LJIIIIZZ(new Pair(c1789520wfW.LIZIZ, ((AbstractC1789510wfV) awS17S0300100_27.l0).LJI()), new Pair(c1789520wfW.LIZJ, "false"), new Pair(c1789520wfW.LIZLLL, ((AbstractC1789510wfV) awS17S0300100_27.l0).LJFF(awS17S0300100_27.l1)), new Pair(c1789520wfW.LJFF, String.valueOf(((EnumC1787180wbk) ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l2)).LIZ).LIZ).getCode())), new Pair(c1789520wfW.LJI, ((EnumC1787180wbk) ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l2)).LIZ).LIZ).getMessage()), new Pair(c1789520wfW.LJII, ((C1788880weU) ((C1789110wer) ((AbstractC1789120wes) awS17S0300100_27.l2)).LIZ).LIZIZ.getMessage()), new Pair(c1789520wfW.LJIIIIZZ, String.valueOf(awS17S0300100_27.j3)));
    }

    public static final Object invoke$9(AwS17S0300100_27 awS17S0300100_27, Object obj) {
        C1786910wbJ c1786910wbJ;
        Object objValueOf;
        String message;
        C1786910wbJ c1786910wbJ2;
        C1786910wbJ c1786910wbJ3;
        C1788610we3 c1788610we3 = (C1788610we3) obj;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(c1788610we3.LIZIZ, C189200o6.m9toStringimpl(awS17S0300100_27.l0));
        pairArr[1] = new Pair(c1788610we3.LIZJ, String.valueOf(System.currentTimeMillis() - awS17S0300100_27.j3));
        String str = c1788610we3.LIZLLL;
        Throwable th = (Throwable) awS17S0300100_27.l1;
        if (th instanceof C1786910wbJ) {
            c1786910wbJ = (C1786910wbJ) th;
        } else {
            c1786910wbJ = null;
        }
        Object objValueOf2 = "-1";
        if (c1786910wbJ == null) {
            objValueOf = "-1";
        } else {
            objValueOf = Integer.valueOf(c1786910wbJ.getErrorCode());
        }
        pairArr[2] = new Pair(str, objValueOf.toString());
        String str2 = c1788610we3.LJ;
        Throwable th2 = (Throwable) awS17S0300100_27.l1;
        if ((th2 instanceof C1786910wbJ) && (c1786910wbJ3 = (C1786910wbJ) th2) != null) {
            objValueOf2 = Integer.valueOf(c1786910wbJ3.getErrorCode());
        }
        pairArr[3] = new Pair(str2, objValueOf2.toString());
        String str3 = c1788610we3.LJFF;
        Throwable th3 = (Throwable) awS17S0300100_27.l1;
        if (!(th3 instanceof C1786910wbJ) || (c1786910wbJ2 = (C1786910wbJ) th3) == null || (message = c1786910wbJ2.getErrorMessage()) == null) {
            message = ((Throwable) awS17S0300100_27.l1).getMessage();
        }
        pairArr[4] = new Pair(str3, message);
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), ((C1788590we1) awS17S0300100_27.l2).LIZ.getCommonEventInfo());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0300100_27(long j, InterfaceC1786840wbC interfaceC1786840wbC, C1787830wcn c1787830wcn, C1786850wbD c1786850wbD, int i) {
        super(1);
        this.$t = i;
        this.j3 = j;
        this.l0 = interfaceC1786840wbC;
        this.l1 = c1787830wcn;
        this.l2 = c1786850wbD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0300100_27(C1786460waa c1786460waa, long j, Throwable th, C1786440waY c1786440waY, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1786460waa;
        this.j3 = j;
        this.l1 = th;
        this.l2 = c1786440waY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS17S0300100_27) (LINE:84017161) kotlin.jvm.internal.AwS17S0300100_27.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS17S0300100_27(C1786460waa c1786460waa, C1786460waa c1786460waa2, List<? extends InterfaceC1780600wR8> list, long j, C1786440waY c1786440waY) {
        Object obj;
        super(1);
        this.$t = c1786440waY;
        this.l0 = c1786460waa;
        this.l1 = c1786460waa2;
        this.j3 = list;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0300100_27(InterfaceC1786610wap interfaceC1786610wap, C1788400wdi c1788400wdi, long j, C1787830wcn c1787830wcn, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1786610wap;
        this.l1 = c1788400wdi;
        this.j3 = j;
        this.l2 = c1787830wcn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0300100_27(InterfaceC1786610wap interfaceC1786610wap, Throwable th, C1788400wdi c1788400wdi, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1786610wap;
        this.l1 = th;
        this.l2 = c1788400wdi;
        this.j3 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0000: IPUT (r8 I:int), (r2 I:kotlin.jvm.internal.AwS17S0300100_27) (LINE:84213760) kotlin.jvm.internal.AwS17S0300100_27.$t int, block:B:2:0x0000 */
    public AwS17S0300100_27(AbstractC1789510wfV abstractC1789510wfV, AbstractC1789510wfV<Object, Object> abstractC1789510wfV2, Object obj, AbstractC1789120wes<Object, C1788880weU<EnumC1787180wbk>> abstractC1789120wes, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = abstractC1789510wfV;
        this.l1 = abstractC1789510wfV2;
        this.l2 = obj;
        this.j3 = abstractC1789120wes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0000: IPUT (r8 I:int), (r2 I:kotlin.jvm.internal.AwS17S0300100_27) (LINE:84279296) kotlin.jvm.internal.AwS17S0300100_27.$t int, block:B:2:0x0000 */
    public AwS17S0300100_27(C1789850wg3 c1789850wg3, C1789850wg3 c1789850wg32, C1789810wfz c1789810wfz, List<C1786470wab> list, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = c1789850wg3;
        this.l1 = c1789850wg32;
        this.l2 = c1789810wfz;
        this.j3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS17S0300100_27) (LINE:84344841) kotlin.jvm.internal.AwS17S0300100_27.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS17S0300100_27(IAPQueryRequest iAPQueryRequest, IAPQueryRequest iAPQueryRequest2, AbstractC1789120wes<List<IAPProductDetail>, C1788880weU<EnumC1787180wbk>> abstractC1789120wes, long j, C1788530wdv c1788530wdv) {
        Object obj;
        super(1);
        this.$t = c1788530wdv;
        this.l0 = iAPQueryRequest;
        this.l1 = iAPQueryRequest2;
        this.j3 = abstractC1789120wes;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS17S0300100_27) (LINE:84410377) kotlin.jvm.internal.AwS17S0300100_27.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS17S0300100_27(IAPQueryRequest iAPQueryRequest, IAPQueryRequest iAPQueryRequest2, AbstractC1789120wes<List<IAPProductDetail>, C1788880weU<EnumC1787180wbk>> abstractC1789120wes, long j, C1788540wdw c1788540wdw) {
        Object obj;
        super(1);
        this.$t = c1788540wdw;
        this.l0 = iAPQueryRequest;
        this.l1 = iAPQueryRequest2;
        this.j3 = abstractC1789120wes;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0300100_27(DetailMediaGridContentAssem detailMediaGridContentAssem, C21300318Xh c21300318Xh, View view, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = detailMediaGridContentAssem;
        this.l1 = c21300318Xh;
        this.l2 = view;
        this.j3 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0300100_27(Object obj, long j, Throwable th, C1788590we1 c1788590we1, int i) {
        super(1);
        this.$t = i;
        this.l0 = obj;
        this.j3 = j;
        this.l1 = th;
        this.l2 = c1788590we1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0300100_27(Throwable th, C1786640was c1786640was, long j, C1787830wcn c1787830wcn, int i) {
        super(1);
        this.$t = i;
        this.l0 = th;
        this.l1 = c1786640was;
        this.j3 = j;
        this.l2 = c1787830wcn;
    }
}
