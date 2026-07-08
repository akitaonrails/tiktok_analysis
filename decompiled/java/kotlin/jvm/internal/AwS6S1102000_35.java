package kotlin.jvm.internal;

import X.C09AY;
import X.C1DHY;
import X.C1DHZ;
import X.C1DIK;
import X.InterfaceC1281910jSn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1673870tez;
import X.InterfaceC2240011Clr;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS6S1102000_35 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS6S1102000_35 awS6S1102000_35) {
        C1DHZ c1dhz = ((C1DHY) awS6S1102000_35.l1).LIZIZ;
        if (c1dhz != null) {
            c1dhz.LJII(awS6S1102000_35.i2, awS6S1102000_35.i3, awS6S1102000_35.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S1102000_35 awS6S1102000_35) {
        C1DHZ c1dhz = ((C1DHY) awS6S1102000_35.l1).LIZIZ;
        if (c1dhz != null) {
            c1dhz.LIZIZ(awS6S1102000_35.i2, awS6S1102000_35.i3, awS6S1102000_35.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S1102000_35 awS6S1102000_35) {
        InterfaceC2240011Clr interfaceC2240011Clr;
        final VECameraController vECameraController = (VECameraController) awS6S1102000_35.l1;
        int i = awS6S1102000_35.i2;
        int i2 = awS6S1102000_35.i3;
        String str = awS6S1102000_35.s0;
        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super String, Unit> interfaceC1631620sYq = vECameraController.LLLILZJ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf(i2), str);
        }
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 5 && (interfaceC2240011Clr = vECameraController.LLJJ) != null) {
                        interfaceC2240011Clr.LJFF();
                    }
                } else {
                    InterfaceC2240011Clr interfaceC2240011Clr2 = vECameraController.LLJJ;
                    if (interfaceC2240011Clr2 != null) {
                        interfaceC2240011Clr2.LJII();
                    }
                }
            } else {
                vECameraController.LJIIJJI();
                vECameraController.X3().onCameraOpenSuccess();
                vECameraController.LLJJJJLIIL.LJJJLL(new InterfaceC1673870tez() { // from class: X.1DII
                });
            }
        } else {
            InterfaceC2240011Clr interfaceC2240011Clr3 = vECameraController.LLJJ;
            if (interfaceC2240011Clr3 != null) {
                interfaceC2240011Clr3.LJIIIZ();
            }
            Iterator<C1DIK> it2 = vECameraController.LLJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            vECameraController.LLJJJJLIIL.LLJILJIL.getISORange(new InterfaceC1281910jSn() { // from class: X.1DIH
                @Override // X.InterfaceC1281910jSn
                public final void LIZ(int[] iArr) {
                    VECameraController vECameraController2 = vECameraController;
                    vECameraController2.LLLI = iArr[0];
                    vECameraController2.LLLFZ = iArr[1];
                }
            });
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1102000_35(C1DHY c1dhy, int i, int i2, String str, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c1dhy;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1102000_35(VECameraController vECameraController, int i, int i2, String str, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = vECameraController;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
    }
}
