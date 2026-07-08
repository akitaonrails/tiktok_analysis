package kotlin.jvm.internal;

import X.C05XL;
import X.C09AY;
import X.C15FV;
import X.C15FX;
import X.C15TW;
import X.C16F5;
import X.C20441214yg;
import X.C20489115Fh;
import X.C20489215Fi;
import X.C2188811AlT;
import X.C427330GpH;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C925640aCA;
import X.C973660bRc;
import X.C975320bUI;
import X.C978500bZQ;
import X.EnumC20488815Fe;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS77S0100100_31 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS77S0100100_31 awS77S0100100_31) {
        C16F5 c16f5 = ((C15FX) awS77S0100100_31.l0).LLJJIII;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        View view = ((C15FX) awS77S0100100_31.l0).LLJJIJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C15FX c15fx = (C15FX) awS77S0100100_31.l0;
        C15FV c15fv = c15fx.LLJJJJLIIL;
        if (c15fv == null) {
            c15fv = null;
        }
        if (((int) c15fv.LLLF) == 1) {
            c15fx.setBonusResultBg(EnumC20488815Fe.TASK_FAILED);
            C20441214yg.LJIIIZ("bonusResultContainer", "update failed battle result container");
            String strLJIJI = C497740JfY.LJIJI(2131853290);
            C15FX c15fx2 = (C15FX) awS77S0100100_31.l0;
            C20489215Fi c20489215Fi = new C20489215Fi(null, strLJIJI, null);
            C427330GpH c427330GpH = c15fx2.LLJJI;
            C15FX.LJIILIIL(c15fx2, c20489215Fi, new C20489115Fh(null, c427330GpH, c427330GpH, c15fx2.LLJJ));
            C20441214yg.LJIIIZ("BattleTaskContainer", "update bonusResultContainer failed resource");
        } else {
            C20441214yg.LJIIIZ("bonusResultContainer", "update battle result container to reward background");
            ((C15FX) awS77S0100100_31.l0).setBonusResultBg(EnumC20488815Fe.TASK_CAPSULE);
            C15FX c15fx3 = (C15FX) awS77S0100100_31.l0;
            C15FV c15fv2 = c15fx3.LLJJJJLIIL;
            if (c15fv2 == null) {
                c15fv2 = null;
            }
            C20489215Fi c20489215Fi2 = new C20489215Fi(c15fv2.LLL, null, null);
            C427330GpH c427330GpH2 = c15fx3.LLJJI;
            C15FX.LJIILIIL(c15fx3, c20489215Fi2, new C20489115Fh(null, c427330GpH2, c427330GpH2, c15fx3.LLJJ));
            C20441214yg.LJIIIZ("BattleTaskContainer", "update bonusResultContainer success resource");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eggtask_reward_over, left_time = ");
        sbLIZ.append(awS77S0100100_31.j1);
        C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS77S0100100_31 awS77S0100100_31) throws JSONException {
        boolean z;
        C15FV c15fv;
        C15FV c15fv2;
        C15FX c15fx = (C15FX) awS77S0100100_31.l0;
        if (c15fx.LL) {
            long j = awS77S0100100_31.j1;
            C15FV c15fv3 = c15fx.LLJJJJLIIL;
            Boolean boolValueOf = null;
            if (c15fv3 == null) {
                c15fv3 = null;
            }
            c15fx.LJIIZILJ(j, c15fv3.LLJJJ);
            C15FX c15fx2 = (C15FX) awS77S0100100_31.l0;
            if (!c15fx2.LLJLLL) {
                c15fx2.LLJLLL = true;
                if (!c15fx2.LLJL) {
                    C15FV c15fv4 = c15fx2.LLJJJJLIIL;
                    if (c15fv4 == null) {
                        c15fv = null;
                    } else {
                        c15fv = c15fv4;
                    }
                    String str = c15fv.LLJJJIL;
                    if (c15fv4 == null) {
                        c15fv2 = null;
                    } else {
                        c15fv2 = c15fv4;
                    }
                    int i = c15fv2.LLJJJJ;
                    if (c15fv4 == null) {
                        c15fv4 = null;
                    }
                    C925640aCA.LJIILJJIL(i, str, c15fv4.LJI());
                }
                ((C15FX) awS77S0100100_31.l0).LJI();
                C978500bZQ.LIZIZ("match_color_eggs_task_start");
                JSONObject jSONObject = C975320bUI.LIZ;
                C15FX c15fx3 = (C15FX) awS77S0100100_31.l0;
                boolean z2 = c15fx3.LLJL;
                long j2 = awS77S0100100_31.j1;
                C15FV c15fv5 = c15fx3.LLJJJJLIIL;
                if (c15fv5 == null) {
                    c15fv5 = null;
                }
                String str2 = c15fv5.LLJJJIL;
                JSONObject jSONObject2 = new JSONObject();
                C975320bUI.LJIIJJI(str2, j2, jSONObject2);
                if (z2) {
                    C975320bUI.LJIILL("task_start", jSONObject2);
                } else {
                    C975320bUI.LJIILLIIL("task_start", jSONObject2);
                }
                C973660bRc c973660bRc = C973660bRc.LIZ;
                if (((C15FX) awS77S0100100_31.l0).getTranslationY() == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                c973660bRc.LJLJJL(1, !z, ((C15FX) awS77S0100100_31.l0).getCpcToastShow());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("eggtask_task_start, left_time = ");
                sbLIZ.append(awS77S0100100_31.j1);
                C20441214yg.LJIIIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ));
            }
            C15FV c15fv6 = ((C15FX) awS77S0100100_31.l0).LLJJJJLIIL;
            if (c15fv6 == null) {
                c15fv6 = null;
            }
            if (!c15fv6.LJI()) {
                JSONObject jSONObject3 = C975320bUI.LIZ;
                C15FV c15fv7 = ((C15FX) awS77S0100100_31.l0).LLJJJJLIIL;
                if (c15fv7 == null) {
                    c15fv7 = null;
                }
                C975320bUI.LIZ.putOpt("pk_msc_task_progress", Long.valueOf(c15fv7.LLJJIJI));
            }
            ValueAnimator valueAnimator = ((C15FX) awS77S0100100_31.l0).LLJJLIIIJLLLLLLLZ;
            if (valueAnimator != null) {
                boolValueOf = Boolean.valueOf(valueAnimator.isRunning());
            }
            if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                ((C15FX) awS77S0100100_31.l0).LJIIIIZZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS77S0100100_31 awS77S0100100_31) {
        if (!((C05XL) awS77S0100100_31.l0).isCompleted()) {
            ((C05XL) awS77S0100100_31.l0).LJIIZILJ(Unit.LIZ);
        }
        C15TW.LIZLLL.remove(Long.valueOf(awS77S0100100_31.j1));
        return C15TW.LJ.remove(Long.valueOf(awS77S0100100_31.j1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0100100_31(long j, C05XL c05xl, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05xl;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0100100_31(C15FX c15fx, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c15fx;
        this.j1 = j;
    }
}
