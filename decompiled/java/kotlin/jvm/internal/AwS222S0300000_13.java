package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C013C;
import X.C09AY;
import X.C0XQ5;
import X.C0XVC;
import X.C0XZJ;
import X.C1238280iKQ;
import X.C1519120pdO;
import X.C1906580ziK;
import X.C1914170zuZ;
import X.C1914320zuo;
import X.C807000VlC;
import X.C807040VlG;
import X.C807090VlL;
import X.C807140VlQ;
import X.C807150VlR;
import X.C807180VlU;
import X.C807210VlX;
import X.C822720WPe;
import X.C822800WPm;
import X.C822810WPn;
import X.C844470XAv;
import X.C849300XTk;
import X.C851520Xao;
import X.C851660Xb2;
import X.C852050Xbf;
import X.EnumC1518670pcf;
import X.EnumC807010VlD;
import X.EnumC807050VlH;
import X.EnumC807060VlI;
import X.EnumC852910Xd3;
import X.InterfaceC1519250pdb;
import X.InterfaceC794700VFk;
import X.InterfaceC794710VFl;
import X.InterfaceC794770VFr;
import X.InterfaceC807030VlF;
import X.InterfaceC822740WPg;
import X.InterfaceC851540Xaq;
import X.InterfaceC851560Xas;
import X.InterfaceC851650Xb1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.DialogOption;
import com.ss.android.ugc.aweme.frequency.model.DetectBehavior;
import com.ss.android.ugc.aweme.frequency.model.ExitRule;
import com.ss.android.ugc.aweme.frequency.model.FrequencyRule;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS222S0300000_13 extends C09AY implements Function1 {
    public final int $t;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        C851520Xao.LIZ((EnumC852910Xd3) awS222S0300000_13.l0, (C0XZJ) obj, (BaseAccountFlowFragment) awS222S0300000_13.l1, (InterfaceC851540Xaq) awS222S0300000_13.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        C0XZJ c0xzj = (C0XZJ) obj;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) awS222S0300000_13.l0;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) awS222S0300000_13.l1;
        InterfaceC851540Xaq interfaceC851540Xaq = (InterfaceC851540Xaq) awS222S0300000_13.l2;
        int errorCode = c0xzj.getErrorCode();
        if (!SignUpOrLoginActivity.LLJJJJ.contains(Integer.valueOf(errorCode)) && errorCode != 1704) {
            String string = null;
            if (SignUpOrLoginActivity.LLJJJJJIL.contains(Integer.valueOf(errorCode))) {
                String message = c0xzj.getMessage();
                if (message == null) {
                    Context context = baseAccountFlowFragment.getContext();
                    if (context != null) {
                        string = context.getString(2131834217);
                    }
                } else {
                    string = message;
                }
                interfaceC851540Xaq.LIZIZ(1, string);
            } else {
                String message2 = c0xzj.getMessage();
                if (message2 == null) {
                    Context context2 = baseAccountFlowFragment.getContext();
                    if (context2 != null) {
                        string = context2.getString(2131834217);
                    }
                } else {
                    string = message2;
                }
                interfaceC851540Xaq.LIZIZ(0, string);
            }
        } else {
            interfaceC851540Xaq.LIZJ(baseAccountFlowFragment, enumC852910Xd3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        C849300XTk c849300XTk = (C849300XTk) awS222S0300000_13.l0;
        DialogOption dialogOption = (DialogOption) awS222S0300000_13.l1;
        Activity activity = (Activity) awS222S0300000_13.l2;
        c849300XTk.getClass();
        C849300XTk.LIZIZ(dialogOption, activity);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        C849300XTk c849300XTk = (C849300XTk) awS222S0300000_13.l0;
        DialogOption dialogOption = (DialogOption) awS222S0300000_13.l1;
        Activity activity = (Activity) awS222S0300000_13.l2;
        c849300XTk.getClass();
        C849300XTk.LIZIZ(dialogOption, activity);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        C849300XTk c849300XTk = (C849300XTk) awS222S0300000_13.l0;
        DialogOption dialogOption = (DialogOption) awS222S0300000_13.l1;
        Activity activity = (Activity) awS222S0300000_13.l2;
        c849300XTk.getClass();
        C849300XTk.LIZIZ(dialogOption, activity);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        boolean z;
        int iIntValue;
        Map map = (Map) obj;
        C013C c013c = (C013C) awS222S0300000_13.l0;
        C822810WPn c822810WPn = (C822810WPn) awS222S0300000_13.l1;
        List list = (List) awS222S0300000_13.l2;
        c822810WPn.getClass();
        Iterator it2 = list.iterator();
        while (true) {
            z = false;
            int iIntValue2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            DetectBehavior detectBehavior = (DetectBehavior) it2.next();
            Integer num = (Integer) map.get(detectBehavior.type);
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            Integer num2 = detectBehavior.value;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
            if (iIntValue2 >= iIntValue) {
                z = true;
                break;
            }
        }
        c013c.element = z;
        return Boolean.valueOf(((C013C) awS222S0300000_13.l0).element);
    }

    public static final Object invoke$2(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        C0XVC.LIZ(null, "CustomizedHook", "login");
        ((SignUpOrLoginActivity) awS222S0300000_13.l0).LLLZIL((BaseAccountFlowFragment) awS222S0300000_13.l1, (Bundle) awS222S0300000_13.l2);
        if (C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(1, 1, "");
        }
        C1238280iKQ.LIZIZ(11);
        C0XQ5.LJII(C0XQ5.LIZJ());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        EnumC807050VlH enumC807050VlH;
        long jLongValue = ((Number) obj).longValue();
        C807000VlC c807000VlC = C807000VlC.LIZ;
        EnumC807060VlI enumC807060VlI = (EnumC807060VlI) awS222S0300000_13.l0;
        c807000VlC.getClass();
        EnumC807010VlD enumC807010VlDLJ = C807000VlC.LJ(enumC807060VlI);
        ((TraceLogWrapApiImpl) awS222S0300000_13.l1).LIZIZ.LIZIZ(((C807180VlU) awS222S0300000_13.l2).LIZ, enumC807010VlDLJ);
        C807040VlG c807040VlG = ((TraceLogWrapApiImpl) awS222S0300000_13.l1).LIZIZ;
        String str = ((C807180VlU) awS222S0300000_13.l2).LIZ;
        boolean zLJIIJJI = TraceLogWrapApiImpl.LJIIJJI(enumC807010VlDLJ);
        C807180VlU c807180VlU = (C807180VlU) awS222S0300000_13.l2;
        if (c807180VlU.LJII) {
            enumC807050VlH = EnumC807050VlH.CUSTOM_EVENT;
        } else {
            enumC807050VlH = EnumC807050VlH.EVENT;
        }
        c807040VlG.LIZJ(str, new C807210VlX(zLJIIJJI, enumC807050VlH, null, false, 0, c807180VlU.LJI, c807180VlU.LJ, c807180VlU.LJFF, null, 0, 0L, null, 3868));
        TraceLogWrapApiImpl traceLogWrapApiImpl = (TraceLogWrapApiImpl) awS222S0300000_13.l1;
        C807180VlU c807180VlU2 = (C807180VlU) awS222S0300000_13.l2;
        Long l = c807180VlU2.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        }
        traceLogWrapApiImpl.LJIILIIL(c807180VlU2, jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C807000VlC c807000VlC = C807000VlC.LIZ;
        EnumC807060VlI enumC807060VlI = (EnumC807060VlI) awS222S0300000_13.l0;
        c807000VlC.getClass();
        EnumC807010VlD enumC807010VlDLJ = C807000VlC.LJ(enumC807060VlI);
        ((TraceLogWrapApiImpl) awS222S0300000_13.l1).LIZIZ.LIZIZ(((C807140VlQ) awS222S0300000_13.l2).LIZ, enumC807010VlDLJ);
        C807040VlG c807040VlG = ((TraceLogWrapApiImpl) awS222S0300000_13.l1).LIZIZ;
        String str = ((C807140VlQ) awS222S0300000_13.l2).LIZ;
        boolean zLJIIJJI = TraceLogWrapApiImpl.LJIIJJI(enumC807010VlDLJ);
        EnumC807050VlH enumC807050VlH = EnumC807050VlH.NET_API;
        C807140VlQ c807140VlQ = (C807140VlQ) awS222S0300000_13.l2;
        String str2 = c807140VlQ.LJI;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        int i = c807140VlQ.LJII;
        long j = c807140VlQ.LJIIIIZZ;
        String str4 = c807140VlQ.LJIIIZ;
        if (str4 != null) {
            str3 = str4;
        }
        c807040VlG.LIZJ(str, new C807210VlX(zLJIIJJI, enumC807050VlH, null, false, 0, null, c807140VlQ.LJ, c807140VlQ.LJFF, str2, i, j, str3, 60));
        TraceLogWrapApiImpl traceLogWrapApiImpl = (TraceLogWrapApiImpl) awS222S0300000_13.l1;
        C807140VlQ c807140VlQ2 = (C807140VlQ) awS222S0300000_13.l2;
        Long l = c807140VlQ2.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        }
        traceLogWrapApiImpl.LJIILIIL(c807140VlQ2, jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C807000VlC c807000VlC = C807000VlC.LIZ;
        EnumC807060VlI enumC807060VlI = (EnumC807060VlI) awS222S0300000_13.l0;
        c807000VlC.getClass();
        EnumC807010VlD enumC807010VlDLJ = C807000VlC.LJ(enumC807060VlI);
        ((TraceLogWrapApiImpl) awS222S0300000_13.l1).LIZIZ.LIZIZ(((C807150VlR) awS222S0300000_13.l2).LIZ, enumC807010VlDLJ);
        C807040VlG c807040VlG = ((TraceLogWrapApiImpl) awS222S0300000_13.l1).LIZIZ;
        String str = ((C807150VlR) awS222S0300000_13.l2).LIZ;
        boolean zLJIIJJI = TraceLogWrapApiImpl.LJIIJJI(enumC807010VlDLJ);
        EnumC807050VlH enumC807050VlH = EnumC807050VlH.PAGE;
        C807150VlR c807150VlR = (C807150VlR) awS222S0300000_13.l2;
        String str2 = c807150VlR.LJI;
        if (str2 == null) {
            str2 = "";
        }
        boolean zLJFF = Intrinsics.LJFF(c807150VlR.LJII, Boolean.TRUE);
        C807150VlR c807150VlR2 = (C807150VlR) awS222S0300000_13.l2;
        c807040VlG.LIZJ(str, new C807210VlX(zLJIIJJI, enumC807050VlH, str2, zLJFF, c807150VlR2.LJIIIIZZ, null, c807150VlR2.LJ, c807150VlR2.LJFF, null, 0, 0L, null, 3872));
        TraceLogWrapApiImpl traceLogWrapApiImpl = (TraceLogWrapApiImpl) awS222S0300000_13.l1;
        C807150VlR c807150VlR3 = (C807150VlR) awS222S0300000_13.l2;
        Long l = c807150VlR3.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        }
        traceLogWrapApiImpl.LJIILIIL(c807150VlR3, jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        InterfaceC794710VFl interfaceC794710VFl;
        InterfaceC794700VFk interfaceC794700VFk;
        ((Number) obj).longValue();
        InterfaceC807030VlF interfaceC807030VlF = (InterfaceC807030VlF) awS222S0300000_13.l0;
        if (interfaceC807030VlF != null) {
            interfaceC807030VlF.LJFF((InterfaceC794710VFl) awS222S0300000_13.l1);
        }
        C807090VlL c807090VlL = (C807090VlL) awS222S0300000_13.l2;
        if (c807090VlL != null && (interfaceC794710VFl = (InterfaceC794710VFl) awS222S0300000_13.l1) != null) {
            Object obj2 = c807090VlL.LJFF;
            String strLJIJI = null;
            if ((obj2 instanceof InterfaceC794770VFr) && (interfaceC794700VFk = (InterfaceC794700VFk) obj2) != null) {
                strLJIJI = interfaceC794700VFk.LJIJI();
            }
            interfaceC794710VFl.LJFF(strLJIJI);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        return new C822810WPn((List) obj, (ExitRule) awS222S0300000_13.l0, (InterfaceC822740WPg) awS222S0300000_13.l1, ((C822720WPe) awS222S0300000_13.l2).LIZIZ);
    }

    public static final Object invoke$8(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        return new C822800WPm((List) obj, (FrequencyRule) awS222S0300000_13.l0, (InterfaceC822740WPg) awS222S0300000_13.l1, ((C822720WPe) awS222S0300000_13.l2).LIZIZ);
    }

    public static final Object invoke$9(AwS222S0300000_13 awS222S0300000_13, Object obj) {
        Context contextLIZ;
        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = (NetworkUniversalPopupDispatchResponse) obj;
        if (networkUniversalPopupDispatchResponse != null && C1519120pdO.LIZJ(networkUniversalPopupDispatchResponse)) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            C1914320zuo c1914320zuo = new C1914320zuo(networkUniversalPopupDispatchResponse, Integer.valueOf(EnumC1518670pcf.SCENE_PULL_WITH_ID.getValue()));
            C1914170zuZ c1914170zuZ = (C1914170zuZ) awS222S0300000_13.l1;
            final C852050Xbf c852050Xbf = (C852050Xbf) awS222S0300000_13.l2;
            InterfaceC1519250pdb interfaceC1519250pdb = new InterfaceC1519250pdb() { // from class: X.0Xbg
                @Override // X.InterfaceC1519250pdb
                public final InterfaceC1519200pdW LIZ() {
                    return null;
                }

                @Override // X.InterfaceC1519250pdb
                public final Map<String, String> LIZIZ() {
                    return C2097608Jq.LJ();
                }

                @Override // X.InterfaceC1519250pdb
                public final /* bridge */ /* synthetic */ InterfaceC1914220zue LIZJ() {
                    return c852050Xbf;
                }
            };
            c1914170zuZ.getClass();
            C1914170zuZ.LIZJ(c1914320zuo, contextLIZ, interfaceC1519250pdb);
        } else {
            ((Function0) awS222S0300000_13.l0).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS222S0300000_13(C013C c013c, C013C c013c2, C822810WPn c822810WPn, List<DetectBehavior> list) {
        super(1);
        this.$t = list;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = c822810WPn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(InterfaceC807030VlF interfaceC807030VlF, InterfaceC794710VFl interfaceC794710VFl, C807090VlL c807090VlL, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC807030VlF;
        this.l1 = interfaceC794710VFl;
        this.l2 = c807090VlL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(EnumC807060VlI enumC807060VlI, TraceLogWrapApiImpl traceLogWrapApiImpl, C807140VlQ c807140VlQ, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC807060VlI;
        this.l1 = traceLogWrapApiImpl;
        this.l2 = c807140VlQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(EnumC807060VlI enumC807060VlI, TraceLogWrapApiImpl traceLogWrapApiImpl, C807150VlR c807150VlR, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC807060VlI;
        this.l1 = traceLogWrapApiImpl;
        this.l2 = c807150VlR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(EnumC807060VlI enumC807060VlI, TraceLogWrapApiImpl traceLogWrapApiImpl, C807180VlU c807180VlU, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC807060VlI;
        this.l1 = traceLogWrapApiImpl;
        this.l2 = c807180VlU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(C849300XTk c849300XTk, DialogOption dialogOption, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l0 = c849300XTk;
        this.l1 = dialogOption;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(SignUpOrLoginActivity signUpOrLoginActivity, BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = signUpOrLoginActivity;
        this.l1 = baseAccountFlowFragment;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(ExitRule exitRule, InterfaceC822740WPg interfaceC822740WPg, C822720WPe c822720WPe, int i) {
        super(1);
        this.$t = i;
        this.l0 = exitRule;
        this.l1 = interfaceC822740WPg;
        this.l2 = c822720WPe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(FrequencyRule frequencyRule, InterfaceC822740WPg interfaceC822740WPg, C822720WPe c822720WPe, int i) {
        super(1);
        this.$t = i;
        this.l0 = frequencyRule;
        this.l1 = interfaceC822740WPg;
        this.l2 = c822720WPe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(AwS557S0100000_13 awS557S0100000_13, C1914170zuZ c1914170zuZ, C852050Xbf c852050Xbf, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS557S0100000_13;
        this.l1 = c1914170zuZ;
        this.l2 = c852050Xbf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(InterfaceC851560Xas interfaceC851560Xas, EnumC852910Xd3 enumC852910Xd3, BaseAccountFlowFragment baseAccountFlowFragment, C851660Xb2 c851660Xb2, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC852910Xd3;
        this.l1 = baseAccountFlowFragment;
        this.l2 = c851660Xb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS222S0300000_13(InterfaceC851650Xb1 interfaceC851650Xb1, EnumC852910Xd3 enumC852910Xd3, BaseAccountFlowFragment baseAccountFlowFragment, C851660Xb2 c851660Xb2, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC852910Xd3;
        this.l1 = baseAccountFlowFragment;
        this.l2 = c851660Xb2;
    }
}
