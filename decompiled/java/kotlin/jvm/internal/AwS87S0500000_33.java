package kotlin.jvm.internal;

import X.C09AY;
import X.C0KS8;
import X.C0KSH;
import X.C0KSW;
import X.C0KSY;
import X.C0KT0;
import X.C1AFX;
import X.C21665319qd;
import X.C21665819qi;
import X.EnumC1095410ebz;
import X.EnumC375190EnN;
import X.EnumC429510Gsn;
import Y.ARunnableS21S0500000_33;
import android.graphics.Matrix;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: loaded from: classes34.dex */
public class AwS87S0500000_33 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS87S0500000_33 awS87S0500000_33) {
        HandlerHook.viewPost(((C21665319qd) awS87S0500000_33.l0).LLLLLLLZIL(), new ARunnableS21S0500000_33((Matrix) awS87S0500000_33.l1, (C21665319qd) awS87S0500000_33.l0, (C21665819qi) awS87S0500000_33.l4, (EnumC375190EnN) awS87S0500000_33.l2, (Float) awS87S0500000_33.l3, 1));
        if (((Matrix) awS87S0500000_33.l1) != null) {
            ((C21665319qd) awS87S0500000_33.l0).LLLLLLZZ().setImageMatrix(new Matrix((Matrix) awS87S0500000_33.l1));
        }
        C21665319qd c21665319qd = (C21665319qd) awS87S0500000_33.l0;
        c21665319qd.LLLJ = true;
        c21665319qd.LLLLZLLIL();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS87S0500000_33 awS87S0500000_33) {
        String strLIZ;
        EnumC1095410ebz enumC1095410ebz;
        JoinDialogProxyViewModel joinDialogProxyViewModel = (JoinDialogProxyViewModel) awS87S0500000_33.l0;
        if (joinDialogProxyViewModel.LLILLL == null && ((enumC1095410ebz = (EnumC1095410ebz) awS87S0500000_33.l1) == EnumC1095410ebz.ONLY_SUPER_FAN || enumC1095410ebz == EnumC1095410ebz.BOTH)) {
            C0KSH.LJIIIIZZ(joinDialogProxyViewModel.getDataChannel(), ((C0KT0) awS87S0500000_33.l2).LIZIZ, true);
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel2 = (JoinDialogProxyViewModel) awS87S0500000_33.l0;
        joinDialogProxyViewModel2.LLILLL = new C1AFX((C0KSY) awS87S0500000_33.l3, (C0KS8) awS87S0500000_33.l4);
        if (joinDialogProxyViewModel2.LLIZLLLIL == EnumC429510Gsn.SUPER_FAN) {
            joinDialogProxyViewModel2.LLIZ.setValue(((JoinDialogProxyViewModel) awS87S0500000_33.l0).yQ2(EnumC429510Gsn.SUPER_FAN));
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel3 = (JoinDialogProxyViewModel) awS87S0500000_33.l0;
        C0KSW c0ksw = ((C0KS8) awS87S0500000_33.l4).LIZIZ;
        String strLIZIZ = null;
        if (c0ksw != null) {
            strLIZ = c0ksw.LIZ();
        } else {
            strLIZ = null;
        }
        C0KSW c0ksw2 = ((C0KS8) awS87S0500000_33.l4).LIZIZ;
        if (c0ksw2 != null) {
            strLIZIZ = c0ksw2.LIZIZ();
        }
        joinDialogProxyViewModel3.LLILZ = !Intrinsics.LJFF(strLIZ, strLIZIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S0500000_33(Matrix matrix, C21665319qd c21665319qd, C21665819qi c21665819qi, EnumC375190EnN enumC375190EnN, Float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c21665319qd;
        this.l1 = matrix;
        this.l2 = enumC375190EnN;
        this.l3 = f;
        this.l4 = c21665819qi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S0500000_33(JoinDialogProxyViewModel joinDialogProxyViewModel, JoinDialogProxyViewModel joinDialogProxyViewModel2, EnumC1095410ebz enumC1095410ebz, C0KT0 c0kt0, C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
        super(0);
        this.$t = c0ks8;
        this.l0 = joinDialogProxyViewModel;
        this.l1 = joinDialogProxyViewModel2;
        this.l2 = enumC1095410ebz;
        this.l3 = c0kt0;
        this.l4 = c0ksy;
    }
}
