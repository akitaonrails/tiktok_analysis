package kotlin.jvm.internal;

import X.C09AY;
import X.C1DYL;
import X.C491160JNy;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS34S0100001_35 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS34S0100001_35 awS34S0100001_35) {
        C786410Ut5.T4(((C1DYL) awS34S0100001_35.l0).LIZ, awS34S0100001_35.f1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS34S0100001_35 awS34S0100001_35) {
        C491160JNy c491160JNy = ((PcsCourseVideoEditMainAssem) awS34S0100001_35.l0).LLJJIJIL;
        if (c491160JNy != null) {
            c491160JNy.setSeekbarProgress(awS34S0100001_35.f1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0100001_35(C1DYL c1dyl, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1dyl;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0100001_35(PcsCourseVideoEditMainAssem pcsCourseVideoEditMainAssem, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = pcsCourseVideoEditMainAssem;
        this.f1 = f;
    }
}
