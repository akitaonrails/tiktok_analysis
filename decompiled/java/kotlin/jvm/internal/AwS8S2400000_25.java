package kotlin.jvm.internal;

import X.C020W;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0MAE;
import X.C1649150t17;
import X.C1649230t1F;
import X.C1667060tU0;
import X.C1673800tes;
import X.C1673830tev;
import X.C1698410uIZ;
import X.C19719212De;
import X.C23260099m;
import X.C375830EoP;
import X.EnumC1448590nnd;
import X.InterfaceC1364105Vn;
import X.InterfaceC898260ZLs;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS8S2400000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS8S2400000_25 awS8S2400000_25, Object obj) {
        C0MAE c0mae = (C0MAE) obj;
        c0mae.LIZIZ(null, null, new C19719212De(-954059156, new C1667060tU0((C05P0) awS8S2400000_25.l2, awS8S2400000_25.s0, awS8S2400000_25.s1), true));
        List<C1673800tes> list = ((C1673830tev) ((C05P1) awS8S2400000_25.l3).getValue()).LIZ;
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(103);
        FollowCreatorsViewModel followCreatorsViewModel = (FollowCreatorsViewModel) awS8S2400000_25.l4;
        InterfaceC898260ZLs interfaceC898260ZLs = (InterfaceC898260ZLs) awS8S2400000_25.l5;
        c0mae.LIZJ(list.size(), new C020W(aFwS266S0000000_25, list, 10), new C020W(AFwS266S0000000_25.get$arr$(104), list, 11), new C19719212De(-632812321, new C1698410uIZ(list, followCreatorsViewModel, interfaceC898260ZLs, 0), true));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S2400000_25 awS8S2400000_25, Object obj) {
        return C1649230t1F.LIZ((C1649230t1F) obj, new C375830EoP(new C1649150t17((Bitmap) awS8S2400000_25.l2, (EnumC1448590nnd) awS8S2400000_25.l3, (EnumC1448590nnd) awS8S2400000_25.l4, awS8S2400000_25.s0, awS8S2400000_25.s1, new AwS569S0100000_25((InterfaceC1364105Vn) awS8S2400000_25.l5, (InterfaceC1364105Vn<? super Unit>) 249))), null, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S2400000_25(C05P0 c05p0, String str, String str2, C05P0 c05p02, FollowCreatorsViewModel followCreatorsViewModel, InterfaceC898260ZLs interfaceC898260ZLs, int i) {
        super(1);
        this.$t = i;
        this.l2 = c05p0;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c05p02;
        this.l4 = followCreatorsViewModel;
        this.l5 = interfaceC898260ZLs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S2400000_25(Bitmap bitmap, EnumC1448590nnd enumC1448590nnd, EnumC1448590nnd enumC1448590nnd2, String str, String str2, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l2 = bitmap;
        this.l3 = enumC1448590nnd;
        this.l4 = enumC1448590nnd2;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = c23260099m;
    }
}
