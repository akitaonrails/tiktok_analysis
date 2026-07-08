package kotlin.jvm.internal;

import X.C09AY;
import X.C1001830cB3;
import X.C1002190cBd;
import X.C1003070cD3;
import X.C1007270cJp;
import X.C1009990cOD;
import X.C1012000cRS;
import X.C1018390cbl;
import X.C1023640ckE;
import X.C1030850cvr;
import X.C1040110dAn;
import X.C1040410dBH;
import X.C1040440dBK;
import X.C1042680dEw;
import X.C1054460dXw;
import X.C1054480dXy;
import X.C1623606Xi;
import X.C20487315Ep;
import X.C2188811AlT;
import X.C2274521E1a;
import X.C2274541E1c;
import X.C844470XAv;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.lynx.hybrid.ssp.RecordingTopDomainRequestResult;
import com.google.gson.n;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.web.business.special.service.AdAutofillAIInfoApi;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS31S0000100_16 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0000100_16(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1018390cbl.LIZ.getClass();
        c1023640ckE.withParam(C1018390cbl.LIZJ, Long.valueOf(awS31S0000100_16.j0));
        c1023640ckE.withParam(C1018390cbl.LIZLLL, "premium_like_effect");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        return C1007270cJp.LIZ((C1007270cJp) obj, null, new C1623606Xi(Integer.valueOf((int) awS31S0000100_16.j0)), null, 5);
    }

    public static final Object invoke$12(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        String str;
        RecordingTopDomainRequestResult recordingTopDomainRequestResult = (RecordingTopDomainRequestResult) obj;
        if (recordingTopDomainRequestResult.LIZ) {
            str = "success";
        } else {
            str = "fail";
        }
        C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
        C1042680dEw.LIZ.getClass();
        c1001830cB3.log(C1042680dEw.LJIIJ, new AwS21S1100100_16(recordingTopDomainRequestResult, str, awS31S0000100_16.j0, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        return C20487315Ep.LIZ((C20487315Ep) obj, null, false, null, awS31S0000100_16.j0, false, null, 119);
    }

    public static final Object invoke$14(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJLIIIJL, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJLIIIJL, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJIILLIIL, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJIILLIIL, Long.valueOf(awS31S0000100_16.j0));
        c1023640ckE.withParam(C1009990cOD.LJJJ, 1L);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJIILLIIL, Long.valueOf(awS31S0000100_16.j0));
        c1023640ckE.withParam(C1009990cOD.LJJJ, 1L);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJLIIIJL, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJLIIIJL, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJIILLIIL, Long.valueOf(awS31S0000100_16.j0));
        C1012000cRS.LIZ.getClass();
        c1023640ckE.withParam(C1012000cRS.LIZJ, 1L);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJIILLIIL, Long.valueOf(awS31S0000100_16.j0));
        C1012000cRS.LIZ.getClass();
        c1023640ckE.withParam(C1012000cRS.LIZJ, 1L);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C2274541E1c.LIZ.getClass();
        ((n) obj).LJJIII(Long.valueOf(awS31S0000100_16.j0), C2274541E1c.LJJJZ.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C2274521E1a.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C2274521E1a.LJJJLIIL, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C2274521E1a.LIZ.getClass();
        ((n) obj).LJJIII(Long.valueOf(awS31S0000100_16.j0), C2274521E1a.LJJJLIIL.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1003070cD3.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1003070cD3.LIZIZ, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1054460dXw.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1054460dXw.LIZIZ, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1054480dXy.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1054480dXy.LIZIZ, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040440dBK.LIZ.getClass();
        c1023640ckE.withParam(C1040440dBK.LIZIZ, "AI_AUTOFILL");
        c1023640ckE.withParam(C1040440dBK.LIZJ, 1L);
        c1023640ckE.withParam(C1040440dBK.LIZLLL, "");
        c1023640ckE.withParam(C1040440dBK.LJ, "");
        c1023640ckE.withParam(C1040440dBK.LJFF, C1040110dAn.LLILZIL.LIZJ(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040440dBK.LIZ.getClass();
        c1023640ckE.withParam(C1040440dBK.LIZIZ, "AI_AUTOFILL");
        c1023640ckE.withParam(C1040440dBK.LIZJ, -1L);
        c1023640ckE.withParam(C1040440dBK.LIZLLL, "webview_destroyed");
        c1023640ckE.withParam(C1040440dBK.LJ, "webview_destroyed");
        c1023640ckE.withParam(C1040440dBK.LJFF, C1040110dAn.LLILZIL.LIZJ(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040410dBH.LIZ.getClass();
        C1002190cBd c1002190cBd = C1040410dBH.LIZIZ;
        AdAutofillAIInfoApi.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("https://");
        sbLIZ2.append(C844470XAv.LJIIIIZZ.LIZ);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append("/api/ad/iab/autofill/v1/");
        c1023640ckE.withParam(c1002190cBd, C2188811AlT.LIZIZ(sbLIZ));
        c1023640ckE.withParam(C1040410dBH.LIZJ, "AI_AUTOFILL");
        c1023640ckE.withParam(C1040410dBH.LIZLLL, 2L);
        c1023640ckE.withParam(C1040410dBH.LJ, 0L);
        c1023640ckE.withParam(C1040410dBH.LJFF, "");
        c1023640ckE.withParam(C1040410dBH.LJI, "");
        c1023640ckE.withParam(C1040410dBH.LJII, C1040110dAn.LLILZIL.LIZJ(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1009990cOD.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1009990cOD.LJJII, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS31S0000100_16 awS31S0000100_16, Object obj) {
        C1030850cvr.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1030850cvr.LJIILJJIL, Long.valueOf(awS31S0000100_16.j0));
        return Unit.LIZ;
    }
}
