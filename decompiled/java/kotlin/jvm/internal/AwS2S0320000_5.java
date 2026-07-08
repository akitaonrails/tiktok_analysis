package kotlin.jvm.internal;

import X.C09AY;
import X.C0E1T;
import X.C0E5S;
import X.C1397620mTQ;
import X.C376460EpQ;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AwS2S0320000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

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

    public static final Object invoke$0(AwS2S0320000_5 awS2S0320000_5, Object obj) {
        ((C0E5S) ((C376460EpQ) awS2S0320000_5.l0).LJIIIZ.getValue()).w6(null, false, false);
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        ((C376460EpQ) awS2S0320000_5.l0).LJII((Function0) awS2S0320000_5.l1, (Function2) awS2S0320000_5.l2, awS2S0320000_5.z3, awS2S0320000_5.z4, true, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0320000_5 awS2S0320000_5, Object obj) {
        ((C1397620mTQ) obj).LJII(2131848055, new AwS2S0320000_5((C376460EpQ) awS2S0320000_5.l0, (Function0) awS2S0320000_5.l1, (Function2) awS2S0320000_5.l2, awS2S0320000_5.z3, awS2S0320000_5.z4, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0320000_5(C376460EpQ c376460EpQ, C376460EpQ c376460EpQ2, Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, boolean z2) {
        super(1);
        this.$t = z2 ? 1 : 0;
        this.l0 = c376460EpQ;
        this.l1 = c376460EpQ2;
        this.l2 = function0;
        this.z3 = function2;
        this.z4 = z;
    }
}
