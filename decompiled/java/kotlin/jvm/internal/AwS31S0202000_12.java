package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C20656615sK;
import X.C746520TQc;
import android.view.Surface;
import com.byted.cast.common.api.ISurfaceListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS31S0202000_12 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AwS31S0202000_12 awS31S0202000_12) {
        ((ISurfaceListener) awS31S0202000_12.l0).surfaceAvailable((Surface) awS31S0202000_12.l1, awS31S0202000_12.i2, awS31S0202000_12.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S0202000_12 awS31S0202000_12) {
        C013C c013c = (C013C) awS31S0202000_12.l0;
        if (!c013c.element) {
            c013c.element = true;
            if (!C746520TQc.LIZIZ) {
                C746520TQc c746520TQc = C746520TQc.LIZ;
                int i = awS31S0202000_12.i2;
                int i2 = awS31S0202000_12.i3;
                c746520TQc.getClass();
                C746520TQc.LIZ(i, i2, 1);
            }
            ((C20656615sK) awS31S0202000_12.l1).LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0202000_12(C013C c013c, int i, int i2, C20656615sK c20656615sK, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c013c;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = c20656615sK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0202000_12(ISurfaceListener iSurfaceListener, Surface surface, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = iSurfaceListener;
        this.l1 = surface;
        this.i2 = i;
        this.i3 = i2;
    }
}
