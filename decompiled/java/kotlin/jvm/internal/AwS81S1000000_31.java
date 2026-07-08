package kotlin.jvm.internal;

import X.C09AY;
import X.C1075710e6D;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1397620mTQ;
import X.C157M;
import X.C15AJ;
import X.C15NF;
import X.C20426214wG;
import X.C20441214yg;
import X.C20610415ks;
import X.C20612215lA;
import X.C20614415lW;
import X.C20693315yF;
import X.C2188811AlT;
import X.C291001Au;
import X.C317910CdB;
import X.C786410Ut5;
import X.InterfaceC20476615Am;
import android.widget.ImageView;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS81S1000000_31 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S1000000_31(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C157M) obj).LIZLLL, awS81S1000000_31.s0));
    }

    public static final Object invoke$1(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C157M) obj).LIZLLL, awS81S1000000_31.s0));
    }

    public static final Object invoke$10(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        C20426214wG c20426214wGLJJIL = ((SymphonyEngine) obj).LJJIL(awS81S1000000_31.s0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recoverFlow, flowJson=");
        sbLIZ.append(awS81S1000000_31.s0);
        sbLIZ.append(", rootFlow=");
        sbLIZ.append(c20426214wGLJJIL);
        C20441214yg.LIZIZ("SymphonyEngineInstance", C2188811AlT.LIZIZ(sbLIZ));
        return c20426214wGLJJIL;
    }

    public static final Object invoke$11(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return C20693315yF.LJJIJL((C20693315yF) obj, awS81S1000000_31.s0, 0, false, false, false, false, 32766);
    }

    public static final Object invoke$12(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return C20614415lW.LIZ((C20614415lW) obj, new C291001Au(new C317910CdB(awS81S1000000_31.s0)), null, null, null, null, false, 125);
    }

    public static final Object invoke$13(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((ExploreCardInsertResultStruct) obj).requestId, awS81S1000000_31.s0));
    }

    public static final Object invoke$14(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return C15NF.LIZ((C15NF) obj, null, null, null, null, new C291001Au(awS81S1000000_31.s0), null, 47);
    }

    public static final Object invoke$2(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C157M) obj).LJ, awS81S1000000_31.s0));
    }

    public static final Object invoke$3(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C157M) obj).LJ, awS81S1000000_31.s0));
    }

    public static final Object invoke$4(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((InterfaceC20476615Am) obj).getGeniusId(), awS81S1000000_31.s0));
    }

    public static final Object invoke$5(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C15AJ) obj).getGeniusId(), awS81S1000000_31.s0));
    }

    public static final Object invoke$6(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        C1397620mTQ.LJI((C1397620mTQ) obj, awS81S1000000_31.s0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(awS81S1000000_31.s0);
        c1331670kl3LJIIIZ.LJJI((ImageView) obj);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJIIL();
        C1075710e6D.LIZ(awS81S1000000_31.s0, "go_live", "live_take_popup_in_room", true);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS81S1000000_31 awS81S1000000_31, Object obj) {
        return C20612215lA.LIZ((C20612215lA) obj, false, new C291001Au(new C20610415ks(awS81S1000000_31.s0, 0, false, false, 26)), null, 0, null, false, 61);
    }
}
