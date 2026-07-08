package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C036E;
import X.C0SUC;
import X.C10IU;
import X.C1389890mGx;
import X.C19EG;
import X.C2189821An6;
import X.C724240Sb0;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AkS65S0200000_28 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS65S0200000_28 akS65S0200000_28, View view) {
        C19EG c19egLIZ = C724240Sb0.LIZ((VideoReviewStatusBarAssem) akS65S0200000_28.l0);
        if (c19egLIZ != null) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    Function2<C2189821An6, Context, Unit> function2 = ((C10IU) akS65S0200000_28.l1).LLJ;
                    if (function2 != null) {
                        function2.invoke(C0SUC.LIZ(c19egLIZ), c19egLIZ);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$1(AkS65S0200000_28 akS65S0200000_28, View view) {
        C19EG c19egLIZ = C724240Sb0.LIZ((VideoReviewStatusBarAssem) akS65S0200000_28.l0);
        if (c19egLIZ != null) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    Function1<C19EG, Unit> function1 = ((C10IU) akS65S0200000_28.l1).LLJI;
                    if (function1 != null) {
                        function1.invoke(c19egLIZ);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
    }

    public AkS65S0200000_28(VideoReviewStatusBarAssem videoReviewStatusBarAssem, C10IU c10iu, int i) {
        this.$t = i;
        this.l0 = videoReviewStatusBarAssem;
        this.l1 = c10iu;
    }
}
