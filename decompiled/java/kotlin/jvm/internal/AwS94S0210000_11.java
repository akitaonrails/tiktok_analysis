package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0H1U;
import X.C0RHO;
import X.C0RJE;
import X.C0SRL;
import X.C11NJ;
import X.C1388190mED;
import X.C13LE;
import X.C19602911ml;
import X.C19EG;
import X.C1AV3;
import X.C2097608Jq;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C299490BoZ;
import X.C299640Boo;
import X.C339190DRl;
import X.C692980RGe;
import X.C692990RGf;
import X.C695930RRn;
import X.C700140RdE;
import X.C700930ReV;
import X.C701040Reg;
import X.C701480RfO;
import X.C705930RmZ;
import X.C724100Sam;
import Y.ARunnableS80S0200000_11;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS94S0210000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS94S0210000_11 awS94S0210000_11) {
        boolean z;
        ReusedAssem reusedAssem = (ReusedAssem) awS94S0210000_11.l0;
        boolean zMp = awS94S0210000_11.z2;
        C701040Reg c701040Reg = (C701040Reg) awS94S0210000_11.l1;
        if (reusedAssem instanceof BaseCellTriggerComponent) {
            C013C c013c = new C013C();
            c013c.element = zMp;
            ARunnableS80S0200000_11 aRunnableS80S0200000_11 = new ARunnableS80S0200000_11(reusedAssem, c013c, c701040Reg, 36);
            ARunnableS80S0200000_11 aRunnableS80S0200000_112 = new ARunnableS80S0200000_11(reusedAssem, aRunnableS80S0200000_11, 37);
            if ((((Number) C299490BoZ.LIZ.getValue()).intValue() & 2) == 2) {
                if (!C0RJE.LIZIZ(reusedAssem, true)) {
                    zMp = ((BaseCellTriggerComponent) reusedAssem).mp();
                }
                c013c.element = zMp;
                if (reusedAssem != null) {
                    C724100Sam.LIZ(reusedAssem, zMp);
                }
                if (!C700140RdE.LJ((BaseCellTriggerComponent) reusedAssem) && c013c.element) {
                    aRunnableS80S0200000_112.run();
                } else {
                    aRunnableS80S0200000_11.run();
                }
            } else {
                if (C0RJE.LIZIZ(reusedAssem, true)) {
                    z = zMp;
                } else {
                    z = true;
                }
                c013c.element = z;
                if (reusedAssem != null) {
                    C724100Sam.LIZ(reusedAssem, z);
                }
                BaseCellTriggerComponent baseCellTriggerComponent = (BaseCellTriggerComponent) reusedAssem;
                if (!C700140RdE.LJ(baseCellTriggerComponent)) {
                    if ((C0RJE.LIZIZ(reusedAssem, true) && zMp) || baseCellTriggerComponent.mp()) {
                        aRunnableS80S0200000_112.run();
                    }
                } else {
                    aRunnableS80S0200000_11.run();
                }
            }
        } else if (reusedAssem instanceof ReusedAssem) {
            if (C695930RRn.LIZJ(reusedAssem)) {
                if (reusedAssem != null) {
                    C724100Sam.LIZ(reusedAssem, true);
                }
            } else if (reusedAssem != null) {
                C724100Sam.LIZ(reusedAssem, zMp);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS94S0210000_11 awS94S0210000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" --- doModifyActive --- component_clazz: ");
        sbLIZ.append(C13LE.LIZ(((C700930ReV) awS94S0210000_11.l0).getClass()).LJI());
        sbLIZ.append(" ---- component_key: ");
        sbLIZ.append(((FcpNodeProtocol) awS94S0210000_11.l1).LLLII());
        sbLIZ.append(" ---- active: ");
        sbLIZ.append(awS94S0210000_11.z2);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS94S0210000_11 awS94S0210000_11) {
        ViewGroup viewGroup;
        ReusedUIAssem reusedUIAssem;
        View viewLJJIJL = null;
        if (awS94S0210000_11.z2) {
            C339190DRl.LIZLLL((View) awS94S0210000_11.l0);
            if (C299640Boo.LIZ()) {
                LifecycleOwner parent = ((C701480RfO) awS94S0210000_11.l1).LIZIZ.getParent();
                if ((parent instanceof ReusedUIAssem) && (reusedUIAssem = (ReusedUIAssem) parent) != null) {
                    viewLJJIJL = reusedUIAssem.LJJIJL();
                }
                if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null && viewGroup.indexOfChild((View) awS94S0210000_11.l0) == -1) {
                    viewGroup.addView((View) awS94S0210000_11.l0);
                }
            }
        } else {
            C2180521AVm.LIZ((View) awS94S0210000_11.l0, null, C1AV3.LIZ("1", "Feed", null, "standard_runtime"));
            C0H1U.LIZIZ((View) awS94S0210000_11.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS94S0210000_11 awS94S0210000_11) {
        Activity activityLIZ;
        C19EG c19eg;
        C11NJ compositeDisposable;
        Context context;
        C692990RGf c692990RGf = (C692990RGf) awS94S0210000_11.l0;
        Aweme aweme = c692990RGf.LIZIZ;
        if (aweme != null) {
            boolean z = awS94S0210000_11.z2;
            VideoItemParams videoItemParams = (VideoItemParams) awS94S0210000_11.l1;
            C692980RGe c692980RGe = c692990RGf.LIZLLL;
            Fragment fragment = null;
            if (c692980RGe != null && (context = c692980RGe.getContext()) != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                C19602911ml c19602911ml = C19602911ml.LIZ;
                C692980RGe c692980RGe2 = c692990RGf.LIZLLL;
                if (c692980RGe2 != null) {
                    compositeDisposable = c692980RGe2.getCompositeDisposable();
                } else {
                    compositeDisposable = null;
                }
                C705930RmZ c705930RmZ = c692990RGf.LJ;
                C692980RGe c692980RGe3 = c692990RGf.LIZLLL;
                if (videoItemParams != null) {
                    fragment = videoItemParams.fragment;
                }
                c19602911ml.getClass();
                return C19602911ml.LJ(aweme, c19eg, z, compositeDisposable, c19eg, c705930RmZ, c692980RGe3, fragment, null, null, false);
            }
            return C2097608Jq.LJ();
        }
        return C2097608Jq.LJ();
    }

    public static final Object invoke$4(AwS94S0210000_11 awS94S0210000_11) {
        Fragment fragment;
        C0SRL c0srl = ((C0RHO) awS94S0210000_11.l0).LIZ;
        Aweme aweme = c0srl.LIZJ;
        if (aweme == null) {
            return C2097608Jq.LJ();
        }
        C19602911ml c19602911ml = C19602911ml.LIZ;
        C19EG c19eg = c0srl.LIZIZ;
        boolean z = awS94S0210000_11.z2;
        C11NJ compositeDisposable = ((C692980RGe) awS94S0210000_11.l1).getCompositeDisposable();
        Context contextLIZLLL = ((C0RHO) awS94S0210000_11.l0).LIZ.LIZLLL();
        C0RHO c0rho = (C0RHO) awS94S0210000_11.l0;
        C705930RmZ c705930RmZ = c0rho.LJ;
        C692980RGe c692980RGe = (C692980RGe) awS94S0210000_11.l1;
        VideoItemParams videoItemParams = c0rho.LIZIZ;
        if (videoItemParams != null) {
            fragment = videoItemParams.fragment;
        } else {
            fragment = null;
        }
        c19602911ml.getClass();
        return C19602911ml.LJ(aweme, c19eg, z, compositeDisposable, contextLIZLLL, c705930RmZ, c692980RGe, fragment, null, null, false);
    }

    public static final Object invoke$5(AwS94S0210000_11 awS94S0210000_11) {
        if (!awS94S0210000_11.z2) {
            ((PhotoSlideViewPagerComponent) awS94S0210000_11.l0).Jp(false);
        }
        Function0 function0 = (Function0) awS94S0210000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0210000_11(C692990RGf c692990RGf, boolean z, VideoItemParams videoItemParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = c692990RGf;
        this.z2 = z;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0210000_11(C0RHO c0rho, boolean z, C692980RGe c692980RGe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0rho;
        this.z2 = z;
        this.l1 = c692980RGe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0210000_11(C700930ReV c700930ReV, FcpNodeProtocol fcpNodeProtocol, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c700930ReV;
        this.l1 = fcpNodeProtocol;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS94S0210000_11(ReusedAssem reusedAssem, ReusedAssem<?> reusedAssem2, boolean z, C701040Reg c701040Reg) {
        super(0);
        this.$t = c701040Reg;
        this.l0 = reusedAssem;
        this.z2 = reusedAssem2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0210000_11(boolean z, View view, C701480RfO c701480RfO, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = view;
        this.l1 = c701480RfO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS94S0210000_11(boolean z, boolean z2, PhotoSlideViewPagerComponent photoSlideViewPagerComponent, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = photoSlideViewPagerComponent;
    }
}
