package kotlin.jvm.internal;

import X.C09AY;
import X.C1073040e1u;
import X.C1073410e2V;
import X.C128Y;
import X.C1910890zpH;
import X.C19EG;
import X.C19EH;
import X.C2252611DEt;
import X.C786410Ut5;
import X.EnumC1070340dxY;
import X.InterfaceC1034470d1h;
import X.InterfaceC20236714Gf;
import android.app.Activity;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.web.utils.AdWebUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS4S0510000_16 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

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

    public static final Object invoke$0(AwS4S0510000_16 awS4S0510000_16) {
        ((C1073040e1u) awS4S0510000_16.l0).LIZIZ((C1073410e2V) awS4S0510000_16.l1, (EnumC1070340dxY) awS4S0510000_16.l2, awS4S0510000_16.z5, (InterfaceC20236714Gf) awS4S0510000_16.l3, (Function1) awS4S0510000_16.l4);
        C1073040e1u c1073040e1u = (C1073040e1u) awS4S0510000_16.l0;
        ((C1910890zpH) c1073040e1u.LIZLLL.getValue()).LIZ("request_fb_contact", "update auth show time");
        c1073040e1u.LIZ.storeLong("last_show_contact_time", System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0510000_16 awS4S0510000_16) {
        ((C1073040e1u) awS4S0510000_16.l0).LIZIZ((C1073410e2V) awS4S0510000_16.l1, (EnumC1070340dxY) awS4S0510000_16.l2, awS4S0510000_16.z5, (InterfaceC20236714Gf) awS4S0510000_16.l3, (Function1) awS4S0510000_16.l4);
        C1073040e1u c1073040e1u = (C1073040e1u) awS4S0510000_16.l0;
        ((C1910890zpH) c1073040e1u.LIZLLL.getValue()).LIZ("request_fb_contact", "update auth show time");
        c1073040e1u.LIZ.storeLong("last_show_contact_time", System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS4S0510000_16 awS4S0510000_16) {
        InterfaceC1034470d1h interfaceC1034470d1h;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        Fragment fragment;
        C19EG c19eg;
        InterfaceC1034470d1h interfaceC1034470d1h2;
        C128Y c128y = (Fragment) awS4S0510000_16.l0;
        if ((c128y instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h2 = (InterfaceC1034470d1h) c128y) != null) {
            interfaceC1034470d1h2.SQ();
        }
        AdWebUtils adWebUtils = (AdWebUtils) awS4S0510000_16.l1;
        FrameLayout frameLayout = (FrameLayout) awS4S0510000_16.l2;
        C128Y c128y2 = (Fragment) awS4S0510000_16.l0;
        if (c128y2 instanceof InterfaceC1034470d1h) {
            interfaceC1034470d1h = (InterfaceC1034470d1h) c128y2;
        } else {
            interfaceC1034470d1h = null;
        }
        Function1 function1 = (Function1) awS4S0510000_16.l3;
        adWebUtils.getClass();
        AdWebUtils.LIZLLL(frameLayout, interfaceC1034470d1h, function1);
        Fragment fragment2 = (Fragment) awS4S0510000_16.l0;
        if (fragment2 != null) {
            Activity activity = (Activity) awS4S0510000_16.l4;
            boolean z = awS4S0510000_16.z5;
            FrameLayout frameLayout2 = (FrameLayout) awS4S0510000_16.l2;
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                supportFragmentManager = c19eg.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
            WeakReference<Fragment> weakReference = AdWebUtils.LIZIZ;
            if (weakReference != null && (fragment = weakReference.get()) != null) {
                if (!Intrinsics.LJFF(fragment, fragment2)) {
                    C786410Ut5.LJZ(0, frameLayout2);
                } else {
                    AdWebUtils.LIZIZ = null;
                }
            }
            if (z && supportFragmentManager != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIIZILJ(fragment2);
                c19ehLJIIJ.LJIIJ();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0510000_16(C1073040e1u c1073040e1u, C1073410e2V c1073410e2V, EnumC1070340dxY enumC1070340dxY, boolean z, C2252611DEt c2252611DEt, AwS595S0100000_16 awS595S0100000_16, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1073040e1u;
        this.l1 = c1073410e2V;
        this.l2 = enumC1070340dxY;
        this.z5 = z;
        this.l3 = c2252611DEt;
        this.l4 = awS595S0100000_16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0510000_16(Fragment fragment, Fragment fragment2, AdWebUtils adWebUtils, FrameLayout frameLayout, Function1<? super Boolean, Unit> function1, Activity activity, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = fragment;
        this.l1 = fragment2;
        this.l2 = adWebUtils;
        this.l3 = frameLayout;
        this.l4 = function1;
        this.z5 = activity;
    }
}
