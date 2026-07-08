package kotlin.jvm.internal;

import X.C09AY;
import X.C0WZX;
import X.C14CR;
import X.C14NX;
import X.C14O8;
import X.C14TT;
import X.C1868620yj6;
import X.C201996141y;
import X.C20269114Sr;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2257631DYb;
import X.EnumC2257621DYa;
import android.content.Context;
import android.location.LocationManager;
import android.net.Uri;
import com.lynx.starlight.nodes.StarlightNode;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.startup.processor.aibot.AIBotDisclaimerDialogProcessor;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS144S1100000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS144S1100000_30 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS144S1100000_30.invoke$0(kotlin.jvm.internal.AwS144S1100000_30, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        TakoCarriedUpData takoCarriedUpData = (TakoCarriedUpData) obj;
        takoCarriedUpData.setAnswerMsgContent(awS144S1100000_30.s0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20269114Sr.LJI(linkedHashMap, (Map) awS144S1100000_30.l1);
        takoCarriedUpData.setMessageMobParams(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        Float fValueOf = Float.valueOf(fFloatValue);
        if (fValueOf != null) {
            float fFloatValue2 = fValueOf.floatValue();
            StarlightNode starlightNode = c14nx.LJFF().LIZ;
            starlightNode.nativeSetPositionPercent(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal(), fFloatValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        Message message = (Message) obj;
        message.sender = new MessageSender(2, 0L, 0L, false, "");
        message.msgType = 3;
        message.uuid = ((AIBotDisclaimerDialogProcessor) awS144S1100000_30.l1).LL;
        message.LIZLLL = System.currentTimeMillis();
        message.LIZIZ = 1;
        message.LIZJ(new AwS80S1000000_30(awS144S1100000_30.s0, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        String str = (String) obj;
        C14CR.LIZ(awS144S1100000_30.s0, str);
        Function1 function1 = (Function1) awS144S1100000_30.l1;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        String str = (String) obj;
        C14CR.LIZ(awS144S1100000_30.s0, str);
        Function1 function1 = (Function1) awS144S1100000_30.l1;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        return C2204961BRm.LJJLJLI((LocationManager) awS144S1100000_30.l1, awS144S1100000_30.s0, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8JrXbqszM7V1P5XLnXap+8RebhdG+Ma", null));
    }

    public static final Object invoke$15(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        String strLIZIZ;
        C1868620yj6 c1868620yj6 = (C1868620yj6) obj;
        if (c1868620yj6.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file:/");
            sbLIZ.append(c1868620yj6.LIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = awS144S1100000_30.s0;
        }
        C14TT c14tt = (C14TT) awS144S1100000_30.l1;
        boolean z = !Intrinsics.LJFF(strLIZIZ, c14tt.LLJJJIL);
        if (z) {
            c14tt.LLJJI = true;
        }
        c14tt.LLILLJJLI = z;
        C14TT c14tt2 = (C14TT) awS144S1100000_30.l1;
        c14tt2.LLJJIJIL = c14tt2.LLILLJJLI;
        c14tt2.LLJJJIL = strLIZIZ;
        c14tt2.LJIILLIIL();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        C14TT c14tt = (C14TT) awS144S1100000_30.l1;
        boolean z = !Intrinsics.LJFF(awS144S1100000_30.s0, c14tt.LLJJJIL);
        if (z) {
            c14tt.LLJJI = true;
        }
        c14tt.LLILLJJLI = z;
        C14TT c14tt2 = (C14TT) awS144S1100000_30.l1;
        c14tt2.LLJJIJIL = c14tt2.LLILLJJLI;
        c14tt2.LLJJJIL = awS144S1100000_30.s0;
        c14tt2.LJIILLIIL();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        C201996141y c201996141y = C201996141y.LIZ;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        c201996141y.getClass();
        C201996141y.LIZIZ((Context) obj, takoEnterParams, str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        Float fValueOf = Float.valueOf(fFloatValue);
        if (fValueOf != null) {
            float fFloatValue2 = fValueOf.floatValue();
            StarlightNode starlightNode = c14nx.LJFF().LIZ;
            starlightNode.nativeSetPosition(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal(), fFloatValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        if (str != null) {
            C14O8 c14o8LJFF = c14nx.LJFF();
            c14o8LJFF.getClass();
            EnumC2257621DYa enumC2257621DYaLIZIZ = C2257631DYb.LIZIZ(str);
            if (enumC2257621DYaLIZIZ != null) {
                StarlightNode starlightNode = c14o8LJFF.LIZ;
                starlightNode.nativeSetGapPercent(starlightNode.LIZ, enumC2257621DYaLIZIZ.ordinal(), fFloatValue);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        if (str != null) {
            C14O8 c14o8LJFF = c14nx.LJFF();
            c14o8LJFF.getClass();
            EnumC2257621DYa enumC2257621DYaLIZIZ = C2257631DYb.LIZIZ(str);
            if (enumC2257621DYaLIZIZ != null) {
                StarlightNode starlightNode = c14o8LJFF.LIZ;
                starlightNode.nativeSetGap(starlightNode.LIZ, enumC2257621DYaLIZIZ.ordinal(), fFloatValue);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        Float fValueOf = Float.valueOf(fFloatValue);
        if (fValueOf != null) {
            float fFloatValue2 = fValueOf.floatValue();
            StarlightNode starlightNode = c14nx.LJFF().LIZ;
            starlightNode.nativeSetMarginPercent(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal(), fFloatValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        Float fValueOf = Float.valueOf(fFloatValue);
        if (fValueOf != null) {
            float fFloatValue2 = fValueOf.floatValue();
            StarlightNode starlightNode = c14nx.LJFF().LIZ;
            starlightNode.nativeSetMargin(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal(), fFloatValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        Float fValueOf = Float.valueOf(fFloatValue);
        if (fValueOf != null) {
            float fFloatValue2 = fValueOf.floatValue();
            StarlightNode starlightNode = c14nx.LJFF().LIZ;
            starlightNode.nativeSetPaddingPercent(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal(), fFloatValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS144S1100000_30 awS144S1100000_30, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C14NX c14nx = (C14NX) awS144S1100000_30.l1;
        String str = awS144S1100000_30.s0;
        Float fValueOf = Float.valueOf(fFloatValue);
        if (fValueOf != null) {
            c14nx.LJFF().LJFF(fValueOf.floatValue(), str);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS144S1100000_30(X.C14TT r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 15 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS144S1100000_30.<init>(X.14TT, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1100000_30(C14NX c14nx, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c14nx;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1100000_30(LocationManager locationManager, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = locationManager;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1100000_30(Uri uri, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = uri;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1100000_30(AIBotDisclaimerDialogProcessor aIBotDisclaimerDialogProcessor, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aIBotDisclaimerDialogProcessor;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS144S1100000_30(String str, String str2, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1100000_30(String str, AFwS274S0000000_30 aFwS274S0000000_30, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = aFwS274S0000000_30;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS144S1100000_30(TakoEnterParams takoEnterParams, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l1 = takoEnterParams;
        this.s0 = str;
    }
}
