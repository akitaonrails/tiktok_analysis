package kotlin.jvm.internal;

import X.C09AY;
import X.C0ET4;
import X.C109Y;
import X.C192E;
import X.C192F;
import X.C197039127h;
import X.C19A3;
import X.C1DRG;
import X.C21389018nA;
import X.C21390118nL;
import X.C21391118nV;
import X.C21391718nb;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C559610Lx9;
import X.C814420VxA;
import X.InterfaceC2260821DeK;
import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS47S0310000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS47S0310000_32 awS47S0310000_32, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C21390118nL c21390118nL = (C21390118nL) awS47S0310000_32.l0;
        ViewGroup viewGroup = (ViewGroup) awS47S0310000_32.l1;
        C21391718nb c21391718nb = (C21391718nb) awS47S0310000_32.l2;
        C21389018nA c21389018nALJ = C21391118nV.LJ(c21391718nb, awS47S0310000_32.z3, fFloatValue);
        viewGroup.offsetDescendantRectToMyCoords(c21390118nL, new Rect());
        float f = r1.left + c21389018nALJ.LIZIZ;
        float f2 = c21391718nb.LIZLLL;
        float f3 = c21389018nALJ.LIZ;
        return new Pair(Float.valueOf(f + ((f2 * f3) / 2.0f)), Float.valueOf(r1.top + c21389018nALJ.LIZJ + ((c21389018nALJ.LJ * f3) / 2.0f)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS47S0310000_32 awS47S0310000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C192F c192f = new C192F((C1DRG) obj, (C19A3) awS47S0310000_32.l1, (C109Y) awS47S0310000_32.l2, awS47S0310000_32.z3);
        ((C559610Lx9) awS47S0310000_32.l0).getClass();
        C559610Lx9.LIZ(c192f);
        c192f.afterInit$als_release(jUptimeMillis);
        return c192f;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS47S0310000_32 awS47S0310000_32, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C192E c192e = new C192E((C1DRG) obj, (C19A3) awS47S0310000_32.l1, (C109Y) awS47S0310000_32.l2, awS47S0310000_32.z3);
        ((C559610Lx9) awS47S0310000_32.l0).getClass();
        C559610Lx9.LIZ(c192e);
        c192e.afterInit$als_release(jUptimeMillis);
        return c192e;
    }

    public static final Object invoke$3(AwS47S0310000_32 awS47S0310000_32, Object obj) {
        LayerDrawable layerDrawableLJIILIIL;
        C197039127h c197039127h = (C197039127h) obj;
        if (awS47S0310000_32.z3) {
            c197039127h.setTextColorRes(R.attr.zi);
        } else {
            c197039127h.setTextColorRes(((InterfaceC2260821DeK) awS47S0310000_32.l0).LJIIIZ());
        }
        USSESSellerModuleV3VH uSSESSellerModuleV3VH = (USSESSellerModuleV3VH) awS47S0310000_32.l1;
        USSESSellerModuleVO uSSESSellerModuleVO = (USSESSellerModuleVO) awS47S0310000_32.l2;
        InterfaceC2260821DeK interfaceC2260821DeK = (InterfaceC2260821DeK) awS47S0310000_32.l0;
        uSSESSellerModuleV3VH.getClass();
        if (uSSESSellerModuleVO.followVoucher != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZ = R.raw.icon_coupon_label_fill;
            c419910GdJ.LJ = Integer.valueOf(interfaceC2260821DeK.LIZJ());
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(uSSESSellerModuleV3VH.itemView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            c384050F3z.LIZIZ = Integer.valueOf(interfaceC2260821DeK.LIZLLL());
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(50));
            layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(uSSESSellerModuleV3VH.itemView.getContext()));
        } else {
            layerDrawableLJIILIIL = null;
        }
        c197039127h.setButtonEndIconDrawable(layerDrawableLJIILIIL);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0310000_32(C21390118nL c21390118nL, ViewGroup viewGroup, C21391718nb c21391718nb, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c21390118nL;
        this.l1 = viewGroup;
        this.l2 = c21391718nb;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0310000_32(boolean z, InterfaceC2260821DeK interfaceC2260821DeK, USSESSellerModuleV3VH uSSESSellerModuleV3VH, USSESSellerModuleVO uSSESSellerModuleVO, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = interfaceC2260821DeK;
        this.l1 = uSSESSellerModuleV3VH;
        this.l2 = uSSESSellerModuleVO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0310000_32(C0ET4 c0et4, C559610Lx9 c559610Lx9, C19A3 c19a3, C109Y c109y, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = c19a3;
        this.l2 = c109y;
        this.z3 = z;
    }
}
