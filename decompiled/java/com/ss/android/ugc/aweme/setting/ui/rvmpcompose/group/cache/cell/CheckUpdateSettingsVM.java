package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell;

import X.C036E;
import X.C1388190mED;
import X.C1669660tYC;
import X.C19261910Xh;
import X.C1926807gg;
import X.C2018607vU;
import X.InterfaceC0148002o;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class CheckUpdateSettingsVM extends BaseCellSettingsVM<C2018607vU> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2018607vU(null, new C1926807gg(this), C1669660tYC.Q, 2131828599, null, C1669660tYC.LJJIII, null, new AwS617S0100000_3(this, 48), null);
    }

    public final void vQ2(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            return;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILJJIL();
                C19261910Xh.LIZ(activityLIZ);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        setState(AFwS231S0000000_3.get$arr$(64));
    }
}
