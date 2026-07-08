package kotlin.jvm.internal;

import X.C09AY;
import X.C1578770rBb;
import X.C1579450rCh;
import X.C1579610rCx;
import X.C1579940rDU;
import X.C1618370sDT;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSkylightAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS32S0102000_24 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S0102000_24 awS32S0102000_24, Object obj) {
        ((DistributeStatusViewModel) awS32S0102000_24.l0).setState(new C1618370sDT(awS32S0102000_24.i1, awS32S0102000_24.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S0102000_24 awS32S0102000_24, Object obj) {
        int iLIZIZ;
        Function0<Context> function0;
        Context contextInvoke;
        C1579450rCh c1579450rCh = (C1579450rCh) obj;
        Pair pair = new Pair(Integer.valueOf(awS32S0102000_24.i1), Integer.valueOf(awS32S0102000_24.i2));
        int i = BaseSkylightAssem.LLJIJIL;
        C1579610rCx c1579610rCx = ((BaseSeriesSkyLightVM) awS32S0102000_24.l0).LLILZIL;
        if (c1579610rCx != null && (function0 = c1579610rCx.LIZIZ) != null && (contextInvoke = function0.invoke()) != null) {
            iLIZIZ = C1578770rBb.LIZIZ(contextInvoke, R.attr.e3);
        } else {
            iLIZIZ = -16777216;
        }
        return C1579450rCh.LIZ(c1579450rCh, pair, null, null, null, null, C1579940rDU.LIZ(iLIZIZ, awS32S0102000_24.i2), 30);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0102000_24(int i, int i2, BaseSeriesSkyLightVM baseSeriesSkyLightVM, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = baseSeriesSkyLightVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0102000_24(DistributeStatusViewModel distributeStatusViewModel, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = distributeStatusViewModel;
        this.i1 = i;
        this.i2 = i2;
    }
}
