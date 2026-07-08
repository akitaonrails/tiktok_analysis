package com.ss.android.ugc.profile.platform.framework.aweme.profile;

import X.C1585030rLh;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C486860J7k;
import X.C786410Ut5;
import X.EnumC992240bva;
import Y.AObserverS81S0400000_24;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ChangeTabProtocol;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ProfileChangeTabInterceptor implements ChangeTabProtocol {
    public final void LIZ(C19EG c19eg, Intent intent) {
        Bundle extras;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileChangeTabInterceptor", "onChangeTab perform intercept");
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (extras == null) {
                extras = new Bundle();
            }
        } else {
            extras = new Bundle();
        }
        C786410Ut5.LJJJI("fromStart", "MainPage", extras);
        extras.putBoolean("isSmoothScroll", true);
        Hox.LLJILJIL.LIZ(c19eg).TQ2(extras, "USER", false);
    }

    @Override // com.ss.android.ugc.aweme.base.ChangeTabProtocol
    public final boolean IW(C19EG c19eg, Intent intent, String str, EnumC992240bva enumC992240bva) {
        if (!Intrinsics.LJFF(str, "USER") || C1585030rLh.LJIJ("USER")) {
            return false;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChangeTab need intercept state = ");
        sbLIZ.append(c19eg.getLifecycle().getCurrentState());
        sbLIZ.append(' ');
        C1720106oR.LJI("ProfileChangeTabInterceptor", C2188811AlT.LIZIZ(sbLIZ));
        if (c19eg.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) <= 0) {
            C1720106oR.LJI("ProfileChangeTabInterceptor", "onChangeTab perform intercept delay when resumed");
            Hox.LLJILJIL.LIZ(c19eg).TQ2(new Bundle(), "HOME", false);
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19eg);
            if (!scrollSwitchStateManagerLIZIZ.GQ2()) {
                scrollSwitchStateManagerLIZIZ.LLJJIJI.observe(c19eg, new AObserverS81S0400000_24(this, c19eg, intent, scrollSwitchStateManagerLIZIZ, 1));
                return true;
            }
            LIZ(c19eg, intent);
            return true;
        }
        LIZ(c19eg, intent);
        return true;
    }
}
