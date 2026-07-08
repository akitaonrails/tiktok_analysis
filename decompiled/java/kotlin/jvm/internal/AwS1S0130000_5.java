package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C0EGB;
import X.C0EGQ;
import X.C0EJ3;
import X.C0ELJ;
import X.C1451630nsX;
import X.C284630BDp;
import X.C301680Bs6;
import X.C350870DpF;
import X.C363750ENx;
import X.C365940EWi;
import X.C372050EiJ;
import X.InterfaceC1417120mys;
import X.InterfaceC1444130ngR;
import X.InterfaceC1456910o13;
import X.InterfaceC1460000o62;
import X.InterfaceC1461350o8D;
import X.InterfaceC363820EOe;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS1S0130000_5 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;
    public boolean z3;

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

    public static final Object invoke$0(AwS1S0130000_5 awS1S0130000_5) {
        InterfaceC1444130ngR interfaceC1444130ngRLLJIJIL;
        String enterFrom;
        if (awS1S0130000_5.z1) {
            InterfaceC1460000o62 interfaceC1460000o62T4 = ((C372050EiJ) awS1S0130000_5.l0).T4();
            if (interfaceC1460000o62T4 != null) {
                interfaceC1460000o62T4.refresh();
            }
            InterfaceC1456910o13 interfaceC1456910o13D6 = ((C372050EiJ) awS1S0130000_5.l0).d6();
            if (interfaceC1456910o13D6 != null) {
                interfaceC1456910o13D6.O32(true);
            }
            C0ELJ c0elj = ((C372050EiJ) awS1S0130000_5.l0).LLJZ;
            if (c0elj != null) {
                enterFrom = c0elj.getEnterFrom();
            } else {
                enterFrom = null;
            }
            if (Intrinsics.LJFF(enterFrom, "enter_from_album_editor_pro_entrance") && awS1S0130000_5.z2) {
                if (!C363750ENx.LIZ.LIZ("entranceTipsShown", false)) {
                    InterfaceC1460000o62 interfaceC1460000o62T42 = ((C372050EiJ) awS1S0130000_5.l0).T4();
                    if (interfaceC1460000o62T42 != null) {
                        interfaceC1460000o62T42.Fp2(15, true, new AwS549S0100000_5((C372050EiJ) awS1S0130000_5.l0, 828));
                    }
                } else {
                    InterfaceC1417120mys interfaceC1417120mysZ4 = ((C372050EiJ) awS1S0130000_5.l0).z4();
                    if (interfaceC1417120mysZ4 != null) {
                        interfaceC1417120mysZ4.lx1(true);
                    }
                }
            }
        }
        boolean z = !C301680Bs6.LIZ();
        InterfaceC1461350o8D interfaceC1461350o8DP4 = ((C372050EiJ) awS1S0130000_5.l0).P4();
        if (interfaceC1461350o8DP4 != null) {
            interfaceC1461350o8DP4.CU(z);
        }
        C1451630nsX c1451630nsXO4 = ((C372050EiJ) awS1S0130000_5.l0).O4();
        if (c1451630nsXO4 != null) {
            c1451630nsXO4.LIZIZ(AFwS234S0000000_5.get$arr$(355));
        }
        if (((C372050EiJ) awS1S0130000_5.l0).C5().hasInfoStickers() && ((Boolean) C284630BDp.LIZ.getValue()).booleanValue() && (interfaceC1444130ngRLLJIJIL = ((C372050EiJ) awS1S0130000_5.l0).LLJIJIL()) != null) {
            C372050EiJ c372050EiJ = (C372050EiJ) awS1S0130000_5.l0;
            c372050EiJ.C5().setVideoCanvasWidth(interfaceC1444130ngRLLJIJIL.LJFF());
            c372050EiJ.C5().setVideoCanvasHeight(interfaceC1444130ngRLLJIJIL.LIZJ());
            c372050EiJ.C5().setOutVideoWidth(interfaceC1444130ngRLLJIJIL.LIZLLL());
            c372050EiJ.C5().setOutVideoHeight(interfaceC1444130ngRLLJIJIL.LJI());
        }
        if (awS1S0130000_5.z2 && (awS1S0130000_5.z3 || C365940EWi.LIZJ(((C372050EiJ) awS1S0130000_5.l0).C5()))) {
            ((C372050EiJ) awS1S0130000_5.l0).o7();
        }
        if (!Intrinsics.LJFF(((C372050EiJ) awS1S0130000_5.l0).C5().getEditorProModel().getActionsViaEPMoreOptions(), "save_draft_via_more")) {
            ((C372050EiJ) awS1S0130000_5.l0).JY0().rh0(awS1S0130000_5.z1);
        }
        ((C372050EiJ) awS1S0130000_5.l0).JY0().eD0(awS1S0130000_5.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0130000_5 awS1S0130000_5) {
        NLENode stage;
        NLENode nLENodeDeepClone;
        NLEModel nLEModelDynamicCast;
        InterfaceC363820EOe interfaceC363820EOeP4;
        C0EJ3 c0ej3M5;
        if (((C0EGB) awS1S0130000_5.l0).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            if (!awS1S0130000_5.z1 && !awS1S0130000_5.z2 && (c0ej3M5 = ((C0EGB) awS1S0130000_5.l0).M5()) != null) {
                c0ej3M5.k1();
            }
            if (!awS1S0130000_5.z1 && !awS1S0130000_5.z2 && (interfaceC363820EOeP4 = ((C0EGB) awS1S0130000_5.l0).P4()) != null) {
                interfaceC363820EOeP4.k1();
            }
            C0EGQ c0egqN5 = ((C0EGB) awS1S0130000_5.l0).n5();
            if (c0egqN5 != null) {
                c0egqN5.k1();
            }
            C0E48 c0e48W1 = ((C0EGB) awS1S0130000_5.l0).W1();
            if (c0e48W1 != null && (stage = C350870DpF.LJI(c0e48W1).getStage()) != null && (nLENodeDeepClone = stage.deepClone(false)) != null && (nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone)) != null) {
                ((C0EGB) awS1S0130000_5.l0).LLILZ.LLLLIL().LJIIJ.invoke(nLEModelDynamicCast, Boolean.valueOf(awS1S0130000_5.z3), Boolean.valueOf(c0e48W1.Bo().LIZ()));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0130000_5(C0EGB c0egb, boolean z, boolean z2, boolean z3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0egb;
        this.z1 = z;
        this.z2 = z2;
        this.z3 = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0130000_5(boolean z, C372050EiJ c372050EiJ, boolean z2, boolean z3, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c372050EiJ;
        this.z2 = z2;
        this.z3 = z3;
    }
}
