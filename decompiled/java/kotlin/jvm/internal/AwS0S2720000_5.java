package kotlin.jvm.internal;

import X.C09AY;
import X.C0CNO;
import X.C0EM5;
import X.C238400w2;
import X.C259800zU;
import X.C363230ELx;
import X.EnumC356070Dxd;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS0S2720000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public String s1;
    public boolean z10;
    public boolean z9;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S2720000_5 awS0S2720000_5) {
        C0CNO.LIZLLL(0L, new AwS0S2720000_5((C363230ELx) awS0S2720000_5.l2, awS0S2720000_5.z9, (AVMusic) awS0S2720000_5.l3, awS0S2720000_5.s0, (C238400w2) awS0S2720000_5.l4, awS0S2720000_5.s1, awS0S2720000_5.z10, (Integer) awS0S2720000_5.l5, (Function0) awS0S2720000_5.l6, (C259800zU) awS0S2720000_5.l7, (Function1) awS0S2720000_5.l8, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2720000_5 awS0S2720000_5) {
        final NLETrackSlot nLETrackSlotLJIIJ = ((C363230ELx) awS0S2720000_5.l2).LJIIJ(awS0S2720000_5.z9, (AVMusic) awS0S2720000_5.l3, awS0S2720000_5.s0, ((C238400w2) awS0S2720000_5.l4).element, awS0S2720000_5.s1, 0L, awS0S2720000_5.z10, (Integer) awS0S2720000_5.l5);
        ((C363230ELx) awS0S2720000_5.l2).LJ();
        final C363230ELx c363230ELx = (C363230ELx) awS0S2720000_5.l2;
        final AVMusic aVMusic = (AVMusic) awS0S2720000_5.l3;
        boolean z = c363230ELx.LJIILLIIL;
        final Function0 function0 = (Function0) awS0S2720000_5.l6;
        final boolean z2 = awS0S2720000_5.z9;
        final C259800zU c259800zU = (C259800zU) awS0S2720000_5.l7;
        final Function1 function1 = (Function1) awS0S2720000_5.l8;
        c363230ELx.e1(aVMusic, z, false, true, new C0EM5() { // from class: X.0EM0
            @Override // X.C0EM5
            public final void onFailed() {
                c363230ELx.e1(aVMusic, false, false, true, this);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // X.C0EM5
            public final void onSuccess() {
                c363230ELx.LIZ(z2, c259800zU.element, true, nLETrackSlotLJIIJ, function1, function0);
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S2720000_5(C363230ELx c363230ELx, C363230ELx c363230ELx2, boolean z, AVMusic aVMusic, String str, C238400w2 c238400w2, String str2, boolean z2, Integer num, Function0<Unit> function0, C259800zU<EnumC356070Dxd> c259800zU, Function1<? super NLETrackSlot, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l2 = c363230ELx;
        this.z9 = c363230ELx2;
        this.l3 = z;
        this.s0 = aVMusic;
        this.l4 = str;
        this.s1 = c238400w2;
        this.z10 = str2;
        this.l5 = z2;
        this.l6 = num;
        this.l7 = function0;
        this.l8 = c259800zU;
    }
}
