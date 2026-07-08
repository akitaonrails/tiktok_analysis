package kotlin.jvm.internal;

import X.C09AY;
import X.C1001800cB0;
import X.C1001810cB1;
import X.C1002190cBd;
import X.C1003710cE5;
import X.C1023640ckE;
import X.C1055320dZK;
import X.C1055330dZL;
import X.C1071110dyn;
import X.C1073410e2V;
import X.C786410Ut5;
import X.C957403oi;
import X.EnumC1070890dyR;
import X.InterfaceC497601wk;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.wishlist.WishListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS103S0110000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        int i;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1055320dZK.LIZ.getClass();
        C1002190cBd c1002190cBd = C1055320dZK.LJ;
        if (awS103S0110000_16.z1) {
            i = 2;
        } else {
            i = 3;
        }
        c1023640ckE.withParam(c1002190cBd, Integer.valueOf(i));
        c1023640ckE.withParam(C1055320dZK.LIZJ, Long.valueOf(System.currentTimeMillis() - ((C1055330dZL) awS103S0110000_16.l0).LJI));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z = true;
        bundle.putBoolean("is_passive_pop_up", true);
        if (((C1073410e2V) awS103S0110000_16.l0).LIZ.LJ.LIZ != EnumC1070890dyR.NORMAL) {
            z = false;
        }
        bundle.putBoolean("is_normal_freq_control", z);
        bundle.putBoolean("is_followed_pop_up", awS103S0110000_16.z1);
        C786410Ut5.LJJIJL(bundle, "freq_data_before_pipeline", ((C1073410e2V) awS103S0110000_16.l0).LIZIZ.LJFF);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        if (awS103S0110000_16.z1) {
            ((Function0) awS103S0110000_16.l0).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        C1071110dyn c1071110dyn = (C1071110dyn) obj;
        c1071110dyn.LIZJ = (InterfaceC497601wk) awS103S0110000_16.l0;
        c1071110dyn.LIZJ(new AwS31S0010000_16(awS103S0110000_16.z1, 7));
        c1071110dyn.LIZLLL(AFwS252S0000000_16.get$arr$(469));
        c1071110dyn.LIZIZ(AFwS252S0000000_16.get$arr$(470));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        C1071110dyn c1071110dyn = (C1071110dyn) obj;
        c1071110dyn.LIZJ = (InterfaceC497601wk) awS103S0110000_16.l0;
        c1071110dyn.LIZJ(new AwS31S0010000_16(awS103S0110000_16.z1, 8));
        c1071110dyn.LIZLLL(AFwS252S0000000_16.get$arr$(471));
        c1071110dyn.LIZIZ(AFwS252S0000000_16.get$arr$(473));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((C1001810cB1) awS103S0110000_16.l0);
        C1001800cB0.LIZ.getClass();
        c1023640ckE.withParam(C1001800cB0.LJI, Double.valueOf(((C1001810cB1) awS103S0110000_16.l0).LIZ));
        c1023640ckE.withParam(C1001800cB0.LJFF, Boolean.valueOf(awS103S0110000_16.z1));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WishListFragment wishListFragment = (WishListFragment) awS103S0110000_16.l0;
        c957403oi.LIZJ("success", Integer.valueOf(awS103S0110000_16.z1 ? 1 : 0));
        c957403oi.LIZJ("load_time", Float.valueOf((jCurrentTimeMillis - wishListFragment.LLJI) / 1000.0f));
        c957403oi.LIZJ("schema_url", wishListFragment.LLJ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS103S0110000_16 awS103S0110000_16, Object obj) {
        String str;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        if (awS103S0110000_16.z1) {
            str = "now";
        } else {
            str = "idle";
        }
        C1003710cE5.LIZ.getClass();
        c1023640ckE.withParam(C1003710cE5.LJIIJ, str);
        c1023640ckE.withParam(C1003710cE5.LJIIL, (Integer) awS103S0110000_16.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0110000_16(InterfaceC497601wk interfaceC497601wk, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0110000_16(C1001810cB1 c1001810cB1, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1001810cB1;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0110000_16(C1073410e2V c1073410e2V, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1073410e2V;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0110000_16(WishListFragment wishListFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = wishListFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0110000_16(Function0 function0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0110000_16(boolean z, C1055330dZL c1055330dZL, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1055330dZL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0110000_16(boolean z, Integer num, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = num;
    }
}
