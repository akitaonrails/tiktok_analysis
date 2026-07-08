package kotlin.jvm.internal;

import X.C09AY;
import X.C0R9E;
import X.C1295960jpS;
import X.C1576740r8K;
import X.C1589640rT8;
import X.C19EG;
import X.C291001Au;
import X.C339190DRl;
import X.C614770O9j;
import X.C631370Opb;
import X.C690440R6k;
import X.C724240Sb0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.educate.BackToFYPGuideAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS309S0000000_24 extends C09AY implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS309S0000000_24(int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS309S0000000_24(BackToFYPGuideAssem backToFYPGuideAssem, int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS309S0000000_24 awS309S0000000_24, Object obj, Object obj2) {
        C1576740r8K c1576740r8KLIZ;
        BackToFYPGuideAssem backToFYPGuideAssem = (BackToFYPGuideAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((VideoItemParams) C631370Opb.LIZ(backToFYPGuideAssem)).getAweme().getAid();
            C1589640rT8.LIZIZ.U1();
            boolean z = true;
            if (backToFYPGuideAssem.tp()) {
                C339190DRl.LIZLLL(backToFYPGuideAssem.LJJIJL());
                C1576740r8K c1576740r8KLIZ2 = C690440R6k.LIZ();
                if (c1576740r8KLIZ2 != null) {
                    c1576740r8KLIZ2.LJ(true);
                }
                C1295960jpS c1295960jpS = backToFYPGuideAssem.LLJL;
                if (c1295960jpS != null) {
                    c1295960jpS.playAnimation();
                }
                backToFYPGuideAssem.up("show");
            } else {
                C19EG c19egLIZ = C724240Sb0.LIZ(backToFYPGuideAssem);
                if (c19egLIZ != null && (c1576740r8KLIZ = C690440R6k.LIZ()) != null) {
                    if (((Number) c291001Au.LIZ).intValue() != 0 || !C614770O9j.LIZIZ.LJ().LJJIIJ(0, c19egLIZ)) {
                        z = false;
                    }
                    c1576740r8KLIZ.LJ(z);
                }
                C339190DRl.LIZIZ(backToFYPGuideAssem.LJJIJL());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS309S0000000_24 awS309S0000000_24, Object obj, Object obj2) {
        BackToFYPGuideAssem backToFYPGuideAssem = (BackToFYPGuideAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((VideoItemParams) C631370Opb.LIZ(backToFYPGuideAssem)).getAweme().getAid();
            C1589640rT8.LIZIZ.U1();
            if (backToFYPGuideAssem.tp() && backToFYPGuideAssem.LJJIJL().getVisibility() == 0) {
                if (((C0R9E) c291001Au.LIZ).LIZIZ) {
                    backToFYPGuideAssem.up("draw_up");
                } else {
                    backToFYPGuideAssem.up("draw_down");
                }
                backToFYPGuideAssem.L3();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS309S0000000_24 awS309S0000000_24, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setContentDescription("Story Reveal");
        return Unit.LIZ;
    }
}
