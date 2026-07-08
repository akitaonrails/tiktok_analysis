package kotlin.jvm.internal;

import X.AbstractC854320XfK;
import X.C013C;
import X.C09AY;
import X.C0V6R;
import X.C0XGR;
import X.C0XQ5;
import X.C0XVX;
import X.C1076010e6h;
import X.C1237330iIt;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C1397650mTT;
import X.C1397660mTU;
import X.C13LP;
import X.C1575450r6F;
import X.C19241810Po;
import X.C19514611Wm;
import X.C197039127h;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C238400w2;
import X.C259800zU;
import X.C786410Ut5;
import X.C798640VUo;
import X.C806990VlB;
import X.C807000VlC;
import X.C807040VlG;
import X.C807090VlL;
import X.C807160VlS;
import X.C807170VlT;
import X.C807210VlX;
import X.C818420W8q;
import X.C822800WPm;
import X.C837830Wtp;
import X.C838040WuA;
import X.C846430XIj;
import X.C853810XeV;
import X.C853820XeW;
import X.C853830XeX;
import X.C853840XeY;
import X.C853970Xel;
import X.C853980Xem;
import X.C854170Xf5;
import X.C854180Xf6;
import X.C854720Xfy;
import X.EnumC807010VlD;
import X.EnumC807050VlH;
import X.EnumC807060VlI;
import X.InterfaceC794700VFk;
import X.InterfaceC794710VFl;
import X.InterfaceC794770VFr;
import X.InterfaceC807030VlF;
import X.InterfaceC849390XTt;
import X.InterfaceC853780XeS;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup;
import com.ss.android.ugc.aweme.frequency.model.DetectBehavior;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import com.ss.android.ugc.aweme.trace.UnsampledTraceLoggerImpl;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadProxy;
import com.ss.android.ugc.bytex.pthread.base.convergence.monitor.ThreadStartMonitor;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS379S0200000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        String str = (String) obj;
        ((JSONObject) awS379S0200000_13.l0).opt(str);
        return new C798640VUo(CastIntegerProtector.parseInt(str), ((JSONObject) awS379S0200000_13.l1).optInt(str));
    }

    public static final Object invoke$1(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        ((VoiceChatUserInfoFragment) awS379S0200000_13.l0).WR((Context) awS379S0200000_13.l1, ((Number) obj).intValue(), true);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C854180Xf6) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILJJIL();
            C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
            c1076010e6h.LJIIJ().LJFF(false);
            c1076010e6h.LJII().LJFF(false);
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("unbind phone failed"), false, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C853810XeV) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILJJIL();
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            ((C853810XeV) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILIIL();
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("Unbind email failed"), true, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C853820XeW) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIIL();
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            ((C853820XeW) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILIIL();
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("Unbind email failed"), true, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C853830XeX) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILJJIL();
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            ((C853830XeX) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILIIL();
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("Unbind phone failed"), true, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C853970Xel) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIIL();
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            ((C853970Xel) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILIIL();
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("Unbind email failed"), true, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C853980Xem) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILJJIL();
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            ((C853980Xem) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILIIL();
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("Unbind phone failed"), true, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        C0XVX.LIZ.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "log_out");
        c0xgr.LIZLLL("exit_method", "verify");
        C20684815ws.LJIILLIIL("exit_verify_email_popup", c0xgr.LIZ);
        C0XQ5.LIZIZ().verifyEmail((Activity) awS379S0200000_13.l0, "log_out", null, new C854720Xfy((InterfaceC849390XTt) awS379S0200000_13.l1, 8));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Activity) awS379S0200000_13.l0).getString(2131827374), new AwS379S0200000_13((Activity) awS379S0200000_13.l0, (InterfaceC849390XTt) awS379S0200000_13.l1, 16));
        c1397620mTQ.LIZJ(1, ((Activity) awS379S0200000_13.l0).getString(2131827373), new AwS592S0100000_13((InterfaceC849390XTt) awS379S0200000_13.l1, 67));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        c1397660mTU.LIZJ = false;
        if (!((Activity) awS379S0200000_13.l0).isFinishing()) {
            c1397660mTU.LIZ().LIZIZ(null);
        }
        ((InterfaceC849390XTt) awS379S0200000_13.l1).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        InterfaceC794710VFl interfaceC794710VFlLIZ;
        InterfaceC794700VFk interfaceC794700VFk;
        InterfaceC807030VlF interfaceC807030VlF;
        ((Number) obj).longValue();
        C807160VlS c807160VlS = ((C807090VlL) awS379S0200000_13.l0).LIZIZ;
        Object obj2 = c807160VlS.LIZLLL;
        String strLJIJI = null;
        if ((obj2 instanceof InterfaceC807030VlF) && (interfaceC807030VlF = (InterfaceC807030VlF) obj2) != null) {
            C807000VlC c807000VlC = C807000VlC.LIZ;
            String str = c807160VlS.LIZIZ;
            c807000VlC.getClass();
            interfaceC794710VFlLIZ = interfaceC807030VlF.LIZ(C807000VlC.LIZ(str));
            C807000VlC c807000VlC2 = C807000VlC.LIZ;
            String str2 = c807160VlS.LIZIZ;
            c807000VlC2.getClass();
            interfaceC807030VlF.LIZ(C807000VlC.LIZ(str2));
            interfaceC807030VlF.LJFF(interfaceC794710VFlLIZ);
        } else {
            interfaceC794710VFlLIZ = null;
        }
        C807090VlL c807090VlL = (C807090VlL) awS379S0200000_13.l1;
        if (c807090VlL != null && interfaceC794710VFlLIZ != null) {
            Object obj3 = c807090VlL.LJFF;
            if ((obj3 instanceof InterfaceC794770VFr) && (interfaceC794700VFk = (InterfaceC794700VFk) obj3) != null) {
                strLJIJI = interfaceC794700VFk.LJIJI();
            }
            interfaceC794710VFlLIZ.LJFF(strLJIJI);
        }
        ((C807090VlL) awS379S0200000_13.l0).LJFF = interfaceC794710VFlLIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS379S0200000_13.l0).getString(2131824622), new AwS592S0100000_13((BaseUpdatePasswordFragment) awS379S0200000_13.l1, 35));
        c1397620mTQ.LIZJ(1, ((Context) awS379S0200000_13.l0).getString(2131824600), new AwS592S0100000_13((BaseUpdatePasswordFragment) awS379S0200000_13.l1, 36));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        OneClickLoginService oneClickLoginService = (OneClickLoginService) awS379S0200000_13.l0;
        String strLIZLLL = C0XQ5.LIZLLL();
        AFwS285S0000000_2 aFwS285S0000000_2 = AFwS285S0000000_2.get$arr$(59);
        oneClickLoginService.getClass();
        OneClickLoginService.LJIL(strLIZLLL, (String) obj, aFwS285S0000000_2);
        if (!C846430XIj.LIZIZ()) {
            ((Function0) awS379S0200000_13.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        KidsRelaunchPopup kidsRelaunchPopup = (KidsRelaunchPopup) awS379S0200000_13.l0;
        kidsRelaunchPopup.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        c2344009Gk.LJFF("enter_from", (String) kidsRelaunchPopup.LL.getValue());
        C20684815ws.LJIILLIIL("confirm_relaunch_app_popup", c2344009Gk.LIZ);
        ((C1397660mTU) obj).LIZJ = false;
        ((C1397650mTT) ListProtector.get(((C1397630mTR) awS379S0200000_13.l1).LJ, 0)).LIZ(new AwS592S0100000_13((KidsRelaunchPopup) awS379S0200000_13.l0, 92));
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        ((View) awS379S0200000_13.l0).draw((Canvas) awS379S0200000_13.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        String str;
        OutreachFlowReportItem outreachFlowReportItem = (OutreachFlowReportItem) obj;
        List list = (List) awS379S0200000_13.l0;
        OutreachInfo outreachInfo = outreachFlowReportItem.outreachInfo;
        if (outreachInfo != null) {
            str = outreachInfo.outreachKey;
        } else {
            str = null;
        }
        if (!C13LP.LJJJJ(str, list)) {
            return Boolean.TRUE;
        }
        ((C238400w2) awS379S0200000_13.l1).element = C818420W8q.LIZ(outreachFlowReportItem.showReportInfo);
        return Boolean.FALSE;
    }

    public static final Object invoke$24(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        int iIntValue;
        int iIntValue2;
        Map map = (Map) obj;
        C013C c013c = (C013C) awS379S0200000_13.l0;
        List listSingletonList = Collections.singletonList(new DetectBehavior("total", "exposure", ((C822800WPm) awS379S0200000_13.l1).LIZIZ.getLimit()));
        boolean z = false;
        if (!(listSingletonList instanceof Collection) || !listSingletonList.isEmpty()) {
            Iterator it2 = listSingletonList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DetectBehavior detectBehavior = (DetectBehavior) it2.next();
                Integer num = (Integer) map.get(detectBehavior.type);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer num2 = detectBehavior.value;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue >= iIntValue2) {
                    z = true;
                    break;
                }
            }
        }
        c013c.element = z;
        return Boolean.valueOf(((C013C) awS379S0200000_13.l0).element);
    }

    public static final Object invoke$25(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        JSONObject jSONObjectLIZIZ;
        JSONArray jSONArrayOptJSONArray;
        C838040WuA c838040WuA = (C838040WuA) obj;
        if (c838040WuA != null && (jSONObjectLIZIZ = C837830Wtp.LIZIZ(c838040WuA)) != null && (jSONArrayOptJSONArray = jSONObjectLIZIZ.optJSONArray("permissions")) != null) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (strOptString != null) {
                    arrayList.add(strOptString);
                }
            }
            C19514611Wm c19514611Wm = (C19514611Wm) awS379S0200000_13.l0;
            c19514611Wm.LIZIZ.clear();
            c19514611Wm.LIZIZ.addAll(arrayList);
        }
        ((C19514611Wm) awS379S0200000_13.l1).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS379S0200000_13 awS379S0200000_13, Object obj) throws JSONException {
        long jLongValue = ((Number) obj).longValue();
        C807000VlC c807000VlC = C807000VlC.LIZ;
        EnumC807060VlI enumC807060VlI = EnumC807060VlI.ALOG;
        c807000VlC.getClass();
        EnumC807010VlD enumC807010VlDLJ = C807000VlC.LJ(enumC807060VlI);
        ((TraceLogWrapApiImpl) awS379S0200000_13.l0).LIZIZ.LIZIZ(((C807170VlT) awS379S0200000_13.l1).LIZ, enumC807010VlDLJ);
        C807040VlG c807040VlG = ((TraceLogWrapApiImpl) awS379S0200000_13.l0).LIZIZ;
        String str = ((C807170VlT) awS379S0200000_13.l1).LIZ;
        boolean zLJIIJJI = TraceLogWrapApiImpl.LJIIJJI(enumC807010VlDLJ);
        EnumC807050VlH enumC807050VlH = EnumC807050VlH.CUSTOM_EVENT;
        C807170VlT c807170VlT = (C807170VlT) awS379S0200000_13.l1;
        c807040VlG.LIZJ(str, new C807210VlX(zLJIIJJI, enumC807050VlH, null, false, 0, c807170VlT.LJI, c807170VlT.LJ, c807170VlT.LJFF, null, 0, 0L, null, 3868));
        C807170VlT c807170VlT2 = (C807170VlT) awS379S0200000_13.l1;
        if (c807170VlT2.LIZJ == null) {
            c807170VlT2.LIZJ = new JSONObject();
        }
        C807170VlT c807170VlT3 = (C807170VlT) awS379S0200000_13.l1;
        JSONObject jSONObject = c807170VlT3.LIZJ;
        if (jSONObject != null) {
            jSONObject.put("log_biz", c807170VlT3.LJIIIIZZ);
            String str2 = c807170VlT3.LJIIJ;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("log_level", str2);
            jSONObject.put("log_tag", c807170VlT3.LJIIIZ);
            jSONObject.put("log_msg", c807170VlT3.LJIIJJI);
        }
        TraceLogWrapApiImpl traceLogWrapApiImpl = (TraceLogWrapApiImpl) awS379S0200000_13.l0;
        C807170VlT c807170VlT4 = (C807170VlT) awS379S0200000_13.l1;
        Long l = c807170VlT4.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        }
        traceLogWrapApiImpl.LJIILIIL(c807170VlT4, jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS379S0200000_13 awS379S0200000_13, Object obj) throws JSONException {
        String strEncodeToString;
        int i;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray2;
        long jLongValue = ((Number) obj).longValue();
        UnsampledTraceLoggerImpl unsampledTraceLoggerImpl = (UnsampledTraceLoggerImpl) awS379S0200000_13.l0;
        C0V6R c0v6r = (C0V6R) awS379S0200000_13.l1;
        unsampledTraceLoggerImpl.getClass();
        JSONObject jSONObjectLIZ = c0v6r.LIZ();
        String string = null;
        int length = 0;
        if (jSONObjectLIZ != null && (jSONArrayOptJSONArray = jSONObjectLIZ.optJSONArray("wrapper_array_data")) != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("wrapper_array_data")) != null) {
            string = jSONArrayOptJSONArray2.toString();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        UnsampledTraceLoggerImpl unsampledTraceLoggerImpl2 = (UnsampledTraceLoggerImpl) awS379S0200000_13.l0;
        if (string == null) {
            unsampledTraceLoggerImpl2.getClass();
        } else {
            if (unsampledTraceLoggerImpl2.LJ) {
                try {
                    strEncodeToString = Base64.encodeToString(ZstdCompress.compress(string.getBytes(Charsets.UTF_8)), 2);
                    if (strEncodeToString == null) {
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } else {
                strEncodeToString = string;
            }
            int length2 = strEncodeToString.length() / unsampledTraceLoggerImpl2.LIZIZ;
            if (strEncodeToString.length() % unsampledTraceLoggerImpl2.LIZIZ == 0) {
                i = 0;
            } else {
                i = 1;
            }
            int i2 = length2 + i;
            boolean z = unsampledTraceLoggerImpl2.LJ;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = unsampledTraceLoggerImpl2.LIZIZ;
                int i5 = i3 * i4;
                int i6 = i3 + 1;
                int i7 = i4 * i6;
                int length3 = strEncodeToString.length();
                if (i7 > length3) {
                    i7 = length3;
                }
                String strSubstring = strEncodeToString.substring(i5, i7);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[id@");
                sbLIZ.append(strEncodeToString.hashCode());
                sbLIZ.append('|');
                sbLIZ.append(z ? 1 : 0);
                sbLIZ.append("::index@");
                sbLIZ.append(i3);
                sbLIZ.append("::size@");
                sbLIZ.append(i2);
                sbLIZ.append("]message::");
                sbLIZ.append(strSubstring);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C806990VlB c806990VlBLIZJ = unsampledTraceLoggerImpl2.LIZJ();
                if (c806990VlBLIZJ != null) {
                    c806990VlBLIZJ.LIZ("TraceLog", strLIZIZ);
                }
                i3 = i6;
            }
        }
        if (((UnsampledTraceLoggerImpl) awS379S0200000_13.l0).LJFF) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j = jCurrentTimeMillis2 - jLongValue;
            C807000VlC c807000VlC = C807000VlC.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t_biz", "trace_log");
            jSONObject.put("t_m_cgy", "write");
            if (string != null) {
                length = string.length();
            }
            jSONObject.put("t_s_cgy", String.valueOf(length));
            jSONObject.put("t_sc", j);
            jSONObject.put("t_fst", String.valueOf(jCurrentTimeMillis - jLongValue));
            jSONObject.put("t_ext", String.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
            c807000VlC.getClass();
            C807000VlC.LIZLLL(jSONObject);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        Thread thread = (Thread) obj;
        if (((C238400w2) awS379S0200000_13.l0).element > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - ((C238400w2) awS379S0200000_13.l0).element;
            if (jCurrentTimeMillis >= SuperThreadPool.INSTANCE.getMinDispatchDelay()) {
                ThreadStartMonitor.INSTANCE.onNewThreadMonitor(jCurrentTimeMillis, ((ThreadProxy) awS379S0200000_13.l1).mDelegate.getName());
            }
        }
        ((ThreadProxy) awS379S0200000_13.l1).mRunState.set(2);
        ((ThreadProxy) awS379S0200000_13.l1).mAttachThread = thread;
        try {
            ((ThreadProxy) awS379S0200000_13.l1).mDelegate.run();
            ((ThreadProxy) awS379S0200000_13.l1).mAttachThread = null;
            ((ThreadProxy) awS379S0200000_13.l1).mRunState.set(-1);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ThreadProxy) awS379S0200000_13.l1).mAttachThread = null;
            ((ThreadProxy) awS379S0200000_13.l1).mRunState.set(-1);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        ((C259800zU) awS379S0200000_13.l0).element = obj;
        ((CountDownLatch) awS379S0200000_13.l1).countDown();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C1575450r6F) awS379S0200000_13.l0).LIZJ.invoke();
        } else {
            ((C197039127h) awS379S0200000_13.l1).setLoading(false);
            ((C197039127h) awS379S0200000_13.l1).setEnabled(false);
            C786410Ut5.w5((C197039127h) awS379S0200000_13.l1, 0.4f);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C853840XeY) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIIL();
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            ((C853840XeY) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIILIIL();
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("Unbind email failed"), true, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS379S0200000_13 awS379S0200000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C854170Xf5) awS379S0200000_13.l0).getClass();
            AbstractC854320XfK.LJIIL();
            InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS != null) {
                interfaceC853780XeS.LIZIZ(null, true);
            }
        } else {
            InterfaceC853780XeS interfaceC853780XeS2 = (InterfaceC853780XeS) awS379S0200000_13.l1;
            if (interfaceC853780XeS2 != null) {
                interfaceC853780XeS2.LIZ(new Exception("unbind email failed"), false, null);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS379S0200000_13(C259800zU c259800zU, C259800zU<byte[]> c259800zU2, CountDownLatch countDownLatch) {
        super(1);
        this.$t = countDownLatch;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C013C c013c, C822800WPm c822800WPm, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c822800WPm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C807090VlL c807090VlL, C807090VlL c807090VlL2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c807090VlL;
        this.l1 = c807090VlL2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C853810XeV c853810XeV, InterfaceC853780XeS interfaceC853780XeS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c853810XeV;
        this.l1 = interfaceC853780XeS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C853820XeW c853820XeW, InterfaceC853780XeS interfaceC853780XeS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c853820XeW;
        this.l1 = interfaceC853780XeS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C853830XeX c853830XeX, InterfaceC853780XeS interfaceC853780XeS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c853830XeX;
        this.l1 = interfaceC853780XeS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C853840XeY c853840XeY, InterfaceC853780XeS interfaceC853780XeS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c853840XeY;
        this.l1 = interfaceC853780XeS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C853970Xel c853970Xel, InterfaceC853780XeS interfaceC853780XeS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c853970Xel;
        this.l1 = interfaceC853780XeS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C853980Xem c853980Xem, InterfaceC853780XeS interfaceC853780XeS, int i) {
        super(1);
        this.$t = i;
        this.l0 = c853980Xem;
        this.l1 = interfaceC853780XeS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C854170Xf5 c854170Xf5, C1237330iIt c1237330iIt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c854170Xf5;
        this.l1 = c1237330iIt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C854180Xf6 c854180Xf6, C1237330iIt c1237330iIt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c854180Xf6;
        this.l1 = c1237330iIt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C1575450r6F c1575450r6F, C197039127h c197039127h, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1575450r6F;
        this.l1 = c197039127h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(C19514611Wm c19514611Wm, C19514611Wm c19514611Wm2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19514611Wm;
        this.l1 = c19514611Wm2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(Activity activity, InterfaceC849390XTt interfaceC849390XTt, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = interfaceC849390XTt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(Context context, BaseUpdatePasswordFragment baseUpdatePasswordFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = baseUpdatePasswordFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(Canvas canvas, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(VoiceChatUserInfoFragment voiceChatUserInfoFragment, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = voiceChatUserInfoFragment;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(OneClickLoginService oneClickLoginService, AwS162S1100000_13 awS162S1100000_13, int i) {
        super(1);
        this.$t = i;
        this.l0 = oneClickLoginService;
        this.l1 = awS162S1100000_13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(KidsRelaunchPopup kidsRelaunchPopup, C1397630mTR c1397630mTR, int i) {
        super(1);
        this.$t = i;
        this.l0 = kidsRelaunchPopup;
        this.l1 = c1397630mTR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(TraceLogWrapApiImpl traceLogWrapApiImpl, C807170VlT c807170VlT, int i) {
        super(1);
        this.$t = i;
        this.l0 = traceLogWrapApiImpl;
        this.l1 = c807170VlT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(UnsampledTraceLoggerImpl unsampledTraceLoggerImpl, C0V6R c0v6r, int i) {
        super(1);
        this.$t = i;
        this.l0 = unsampledTraceLoggerImpl;
        this.l1 = c0v6r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(ThreadProxy threadProxy, C238400w2 c238400w2, int i) {
        super(1);
        this.$t = i;
        this.l1 = threadProxy;
        this.l0 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS379S0200000_13(List list, List<String> list2, C238400w2 c238400w2) {
        super(1);
        this.$t = c238400w2;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS379S0200000_13(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        super(1);
        this.$t = i;
        this.l0 = jSONObject;
        this.l1 = jSONObject2;
    }
}
