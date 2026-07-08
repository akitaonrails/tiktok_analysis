package kotlin.jvm.internal;

import X.C09AY;
import X.C1833430xoL;
import X.C1835390xrV;
import X.C19292910dr;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS143S0110000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
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

    public static final Object invoke$0(AwS143S0110000_27 awS143S0110000_27) {
        if (awS143S0110000_27.z1) {
            TakoContentAssem takoContentAssem = (TakoContentAssem) awS143S0110000_27.l0;
            if (takoContentAssem.LLLJIL) {
                takoContentAssem.LLLJIL = false;
                ITakoAIBotUIAbility iTakoAIBotUIAbilityKp = takoContentAssem.kp();
                if (iTakoAIBotUIAbilityKp != null) {
                    iTakoAIBotUIAbilityKp.MI2(takoContentAssem.LLLJ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS143S0110000_27 awS143S0110000_27) {
        boolean z = awS143S0110000_27.z1;
        C1835390xrV.LIZ = z;
        C1833430xoL c1833430xoL = (C1833430xoL) awS143S0110000_27.l0;
        c1833430xoL.LJI = Boolean.TRUE;
        C19292910dr c19292910dr = c1833430xoL.LJII;
        if (c19292910dr != null) {
            c19292910dr.LJI(new AwS39S0010000_27(z, 26));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS143S0110000_27 awS143S0110000_27) {
        boolean z = awS143S0110000_27.z1;
        C1835390xrV.LIZ = z;
        C1833430xoL c1833430xoL = (C1833430xoL) awS143S0110000_27.l0;
        c1833430xoL.LJI = Boolean.FALSE;
        C19292910dr c19292910dr = c1833430xoL.LJII;
        if (c19292910dr != null) {
            c19292910dr.LJI(new AwS39S0010000_27(z, 27));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0110000_27(C1833430xoL c1833430xoL, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1833430xoL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0110000_27(boolean z, TakoContentAssem takoContentAssem, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = takoContentAssem;
    }
}
