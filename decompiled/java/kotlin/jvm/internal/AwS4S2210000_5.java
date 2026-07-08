package kotlin.jvm.internal;

import X.C09AY;
import X.C0E1T;
import X.C0E5S;
import X.C1397620mTQ;
import X.C376460EpQ;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AwS4S2210000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
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

    public static final Object invoke$0(AwS4S2210000_5 awS4S2210000_5, Object obj) {
        ((C1397620mTQ) obj).LJII(2131848055, new AwS4S2210000_5((C376460EpQ) awS4S2210000_5.l2, awS4S2210000_5.s0, awS4S2210000_5.s1, (Function2) awS4S2210000_5.l3, awS4S2210000_5.z4, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S2210000_5 awS4S2210000_5, Object obj) {
        ((C0E5S) ((C376460EpQ) awS4S2210000_5.l2).LJIIIZ.getValue()).w6(null, false, false);
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        ((C376460EpQ) awS4S2210000_5.l2).LJIIIZ(awS4S2210000_5.s0, awS4S2210000_5.s1, (Function2) awS4S2210000_5.l3, awS4S2210000_5.z4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S2210000_5(C376460EpQ c376460EpQ, C376460EpQ c376460EpQ2, String str, String str2, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l2 = c376460EpQ;
        this.s0 = c376460EpQ2;
        this.s1 = str;
        this.l3 = str2;
        this.z4 = function2;
    }
}
