package com.ss.android.ugc.aweme.homepage.msadapt;

import X.C0J5E;
import X.C0T2Y;
import X.C128Y;
import X.C148G;
import X.C199Y;
import X.C19EG;
import X.C20629915o1;
import X.C343710Ddh;
import X.C740740T3w;
import X.InterfaceC1593630rZZ;
import X.InterfaceC20622815ms;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.login.ILoginUtilsService;
import com.ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes25.dex */
public final class MSAdaptionService implements IMSAdaptionService {
    public Aweme LIZ;

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final Aweme gt() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LIZ(Fragment fragment) {
        if (fragment != null) {
            new WeakReference(fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean LIZIZ(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        boolean zLIZLLL = LIZLLL(context);
        if (context.getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!zLIZLLL || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean LIZJ(Context context) {
        if (context == null) {
            return false;
        }
        return C148G.LJ(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean LIZLLL(Context context) {
        if (context == null || !LIZJ(context)) {
            return false;
        }
        return C148G.LJFF(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJ(BaseActivity baseActivity) {
        Object objLIZ;
        Fragment fragment;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        if ((baseActivity instanceof C199Y) && (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) baseActivity)) != null && (objLIZ instanceof C0J5E) && (fragment = (Fragment) objLIZ) != null && (lifecycle = fragment.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null && currentState.isAtLeast(Lifecycle.State.RESUMED)) {
            LJIIIZ(baseActivity);
            int iLIZ = C148G.LIZ(baseActivity);
            if (LIZLLL(baseActivity)) {
                if (iLIZ == 3 || iLIZ == 1) {
                    ((ILoginUtilsService) ServiceManager.get().getService(ILoginUtilsService.class)).LIZ(new Bundle());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJI(C19EG c19eg) {
        if (LIZJ(c19eg)) {
            C740740T3w.LIZIZ(c19eg, c19eg, new C0T2Y() { // from class: X.0rn5
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    if (aweme != null) {
                        this.LL.LIZ = aweme;
                    }
                }
            });
            c19eg.setRequestedOrientation(-1);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJII(Aweme aweme) {
        this.LIZ = aweme;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final InterfaceC1593630rZZ LJIIIIZZ(Activity activity) {
        C19EG c19eg;
        if (activity == null) {
            return null;
        }
        if (activity instanceof C19EG) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        C128Y c128yBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
        if (!(c128yBQ2 instanceof InterfaceC1593630rZZ)) {
            return null;
        }
        return (InterfaceC1593630rZZ) c128yBQ2;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJIIIZ(BaseActivity baseActivity) {
        if (LIZIZ(baseActivity)) {
            SmartRouter.buildRoute(baseActivity, "//duo").open();
            baseActivity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final ReportActivityStatusTask LJFF(Bundle bundle, boolean z) {
        return new ReportActivityStatusTask(bundle, z);
    }
}
