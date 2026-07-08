package com.ss.android.ugc.aweme;

import X.C04TD;
import X.C0WZX;
import X.C10JQ;
import X.C10JV;
import X.C110W;
import X.C1389890mGx;
import X.C1607950rwf;
import X.C1701330uNH;
import X.C19225010Jc;
import X.C19EG;
import X.C2204961BRm;
import X.C306800C0w;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileNaviServiceImpl implements IProfileNaviService {
    public static IProfileNaviService LJI() {
        Object objLIZ = C04TD.LIZ(IProfileNaviService.class, false);
        if (objLIZ != null) {
            return (IProfileNaviService) objLIZ;
        }
        if (C04TD.LJJLL == null) {
            synchronized (IProfileNaviService.class) {
                if (C04TD.LJJLL == null) {
                    C04TD.LJJLL = new ProfileNaviServiceImpl();
                }
            }
        }
        return C04TD.LJJLL;
    }

    public ProfileNaviServiceImpl() {
        ((IProfileService) ServiceManager.get().getService(IProfileService.class)).newUserPresenter();
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final C10JV LIZLLL() {
        return C10JV.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final boolean LIZ(C110W c110w, int i) {
        return LJFF(new C1389890mGx(c110w), c110w.getContext().getResources(), i);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final boolean LIZIZ(int i, Fragment fragment) {
        return LJFF(new C1389890mGx(fragment), fragment.getResources(), i);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final boolean LIZJ(int i, C19EG c19eg) {
        return LJFF(new C1389890mGx(c19eg), c19eg.getResources(), i);
    }

    public static boolean LJFF(C1389890mGx c1389890mGx, Resources resources, int i) {
        int iLIZ = C306800C0w.LIZ();
        if (i < iLIZ) {
            return true;
        }
        c1389890mGx.LJIIJ(resources.getString(2131827142, Integer.valueOf(iLIZ)));
        c1389890mGx.LIZLLL(3000L);
        c1389890mGx.LJIIJJI();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LJ(Activity activity, View view, String str, C10JQ c10jq) throws Throwable {
        Set<MutableLiveData<Unit>> set = C19225010Jc.LIZ;
        Intent intent = new Intent(activity, (Class<?>) ProfileNaviActivity.class);
        intent.putExtra("enter_from", str);
        intent.putExtra("is_fullbody", c10jq.LIZ);
        intent.putExtra("continue_to_profile", false);
        intent.putExtra("enable_tracking", true);
        intent.putExtra("entry_point", 1);
        Bundle bundleLJFF = C1607950rwf.LIZLLL(activity, view, "transition").LJFF();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_2");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILL(activity, intent, bundleLJFF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KNq6bJnH0Df9Y/+WF/VwJ9T2chn8WZ8=", null));
    }
}
