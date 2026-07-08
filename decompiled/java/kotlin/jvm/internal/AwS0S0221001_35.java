package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C1780540wR2;
import X.C1DHY;
import X.C1DHZ;
import X.C2188811AlT;
import X.C2216241Boc;
import X.InterfaceC1780680wRG;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS0S0221001_35 extends C09AY implements Function0 {
    public final int $t;
    public float f5;
    public int i4;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AwS0S0221001_35 awS0S0221001_35) {
        List listLLIIII;
        if (((VECameraController) awS0S0221001_35.l0).LJIIJ()) {
            VECameraController vECameraController = (VECameraController) awS0S0221001_35.l0;
            float f = awS0S0221001_35.f5;
            if (f > 10.0f) {
                f = 10.0f;
            }
            vECameraController.LLJL = f;
        } else {
            ((VECameraController) awS0S0221001_35.l0).LLJL = awS0S0221001_35.f5;
        }
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZOOM maxZoom:");
        sbLIZ.append(((VECameraController) awS0S0221001_35.l0).LLJL);
        c2216241Boc.uu(C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) ((VECameraController) awS0S0221001_35.l0).LLJZIJLIL).clear();
        List list = (List) awS0S0221001_35.l1;
        if (list != null) {
            ((ArrayList) ((VECameraController) awS0S0221001_35.l0).LLJZIJLIL).addAll(list);
        }
        VECameraController vECameraController2 = (VECameraController) awS0S0221001_35.l0;
        if (vECameraController2.LLJLLIL) {
            int i = awS0S0221001_35.i4;
            int cameraPosition = vECameraController2.getCameraPosition();
            boolean zLJIIJ = ((VECameraController) awS0S0221001_35.l0).LJIIJ();
            boolean zLJIIIZ = ((VECameraController) awS0S0221001_35.l0).LJIIIZ();
            boolean z = awS0S0221001_35.z2;
            boolean z2 = awS0S0221001_35.z3;
            float f2 = awS0S0221001_35.f5;
            List list2 = (List) awS0S0221001_35.l1;
            if (list2 != null) {
                listLLIIII = C13LP.LLIIII(list2);
            } else {
                listLLIIII = null;
            }
            vECameraController2.LLLL = new C1780540wR2(i, cameraPosition, zLJIIJ, zLJIIIZ, z, z2, f2, listLLIIII);
        }
        List<InterfaceC1780680wRG> list3 = ((VECameraController) awS0S0221001_35.l0).LLLILZ;
        int i2 = awS0S0221001_35.i4;
        boolean z3 = awS0S0221001_35.z2;
        boolean z4 = awS0S0221001_35.z3;
        float f3 = awS0S0221001_35.f5;
        List<Integer> list4 = (List) awS0S0221001_35.l1;
        Iterator it2 = ((ArrayList) list3).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1780680wRG) it2.next()).LIZJ(i2, z3, z4, f3, list4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0221001_35 awS0S0221001_35) {
        C1DHZ c1dhz = ((C1DHY) awS0S0221001_35.l0).LIZIZ;
        if (c1dhz != null) {
            c1dhz.LIZJ(awS0S0221001_35.i4, awS0S0221001_35.z2, awS0S0221001_35.z3, awS0S0221001_35.f5, (List) awS0S0221001_35.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0221001_35(C1DHY c1dhy, C1DHY c1dhy2, int i, boolean z, boolean z2, float f, List<Integer> list) {
        super(0);
        this.$t = list;
        this.l0 = c1dhy;
        this.i4 = c1dhy2;
        this.z2 = i;
        this.z3 = z;
        this.f5 = z2 ? 1.0f : 0.0f;
        this.l1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0221001_35(VECameraController vECameraController, VECameraController vECameraController2, float f, List<Integer> list, int i, boolean z, boolean z2) {
        super(0);
        this.$t = z2 ? 1 : 0;
        this.l0 = vECameraController;
        this.f5 = vECameraController2;
        this.l1 = f;
        this.i4 = list;
        this.z2 = i;
        this.z3 = z;
    }
}
