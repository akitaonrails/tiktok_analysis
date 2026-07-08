package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C0LAQ;
import X.C0LAU;
import X.C0LOK;
import X.C0MAE;
import X.C0MAS;
import X.C0MDU;
import X.C0MNQ;
import X.C0MNR;
import X.C0MNU;
import X.C1661770tLT;
import X.C19719212De;
import X.C373801cm;
import X.C546040LbG;
import X.C546230LbZ;
import X.C546730LcN;
import X.C547860LeC;
import X.C552830LmD;
import X.C557560Ltq;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.composer.model.ExternalContentShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.WritableAIGCGenerationModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class AwS59S1000000_8 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S1000000_8(int i) {
        super(1);
        this.$t = i;
        this.s0 = "preDownloadMusicForPhotoImport";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S1000000_8(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C0MNQ c0mnq = (C0MNQ) obj;
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(6);
        c0mnq.getClass();
        C0MNR c0mnr = new C0MNR(0);
        aFwS239S0000000_8.invoke(c0mnr);
        c0mnq.LIZ = c0mnr;
        String str = awS59S1000000_8.s0;
        c0mnq.LIZIZ = new C0MNU(120, str, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        ((C1661770tLT) obj).LIZ = awS59S1000000_8.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        return C0MDU.LIZ((C0MDU) obj, null, null, awS59S1000000_8.s0, null, null, null, 247);
    }

    public static final Object invoke$11(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        ((PromptPageMobParam) obj).waitingForPostProcess = new Pair<>(awS59S1000000_8.s0, Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C1661770tLT c1661770tLT = (C1661770tLT) obj;
        c1661770tLT.LIZ = awS59S1000000_8.s0;
        c1661770tLT.LJI = true;
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        return C557560Ltq.LIZ((C557560Ltq) obj, null, null, null, null, null, null, null, 0L, 0L, null, 0L, awS59S1000000_8.s0, SystemClock.elapsedRealtime(), 0L, false, 8339455);
    }

    public static final Object invoke$14(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        return C557560Ltq.LIZ((C557560Ltq) obj, null, null, null, null, null, null, null, 0L, 0L, awS59S1000000_8.s0, SystemClock.elapsedRealtime(), null, 0L, 0L, false, 8376319);
    }

    public static final Object invoke$15(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
        c0lab.LJ("photo_status", awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C552830LmD c552830LmD = (C552830LmD) obj;
        AwS93S1000000_8 awS93S1000000_8 = new AwS93S1000000_8(awS59S1000000_8.s0, 3);
        c552830LmD.getClass();
        c552830LmD.LIZ = (CFG) awS93S1000000_8.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C373801cm.LIZIZ(awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C373801cm.LIZIZ(awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C373801cm.LIZIZ(awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C1661770tLT c1661770tLT = (C1661770tLT) obj;
        c1661770tLT.LIZ = awS59S1000000_8.s0;
        c1661770tLT.LJI = true;
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C373801cm.LIZIZ(awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        C373801cm.LIZIZ(awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        final String str = awS59S1000000_8.s0;
        return C0LAQ.LIZ((C0LAQ) obj, null, new C0LAU(str) { // from class: X.0LAV
            public final String LIZ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0LAV) && Intrinsics.LJFF(this.LIZ, ((C0LAV) obj2).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error(msg=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
            }
        }, null, 5);
    }

    public static final Object invoke$3(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        ((C0MAE) obj).LIZIZ(null, null, new C19719212De(341980888, new C0MAS(awS59S1000000_8.s0), true));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        WritableAIGCGenerationModel writableAIGCGenerationModel = (WritableAIGCGenerationModel) obj;
        if (Intrinsics.LJFF(writableAIGCGenerationModel.getClientTaskId(), awS59S1000000_8.s0)) {
            writableAIGCGenerationModel.P3(UsageStatus.NOT_APPLY);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        WritableAIGCGenerationModel writableAIGCGenerationModel = (WritableAIGCGenerationModel) obj;
        writableAIGCGenerationModel.P3(UsageStatus.LOADING);
        writableAIGCGenerationModel.S5(awS59S1000000_8.s0);
        writableAIGCGenerationModel.setProgress(0);
        writableAIGCGenerationModel.pA(-1L);
        writableAIGCGenerationModel.Wn(-1L);
        C546730LcN.LIZ(writableAIGCGenerationModel);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        ((ExternalContentShareStoryInputData) obj).setContentUri(awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((AwemeDraft) obj).LIZ(), awS59S1000000_8.s0));
    }

    public static final Object invoke$8(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        ((Map) obj).put("error_msg", awS59S1000000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS59S1000000_8 awS59S1000000_8, Object obj) {
        String strInvoke;
        C546040LbG c546040LbGLIZIZ;
        Function1<CreativeModel, String> function1;
        AwemeDraft awemeDraft = (AwemeDraft) obj;
        String str = awS59S1000000_8.s0;
        C547860LeC.LIZ.getClass();
        C546230LbZ c546230LbZLJ = C547860LeC.LIZIZ().LJ(C0LOK.LIZ);
        if (c546230LbZLJ != null && (c546040LbGLIZIZ = c546230LbZLJ.LIZIZ()) != null && (function1 = c546040LbGLIZIZ.LIZLLL) != null) {
            strInvoke = function1.invoke(awemeDraft.LIZ);
        } else {
            strInvoke = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, strInvoke));
    }
}
