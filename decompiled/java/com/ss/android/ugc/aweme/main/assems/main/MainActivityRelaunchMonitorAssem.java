package com.ss.android.ugc.aweme.main.assems.main;

import X.AbstractC1604130rqV;
import X.C00RY;
import X.C01GW;
import X.C0RUJ;
import X.C1150504el;
import X.C1565880qqo;
import X.C1589360rSg;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C277070AtV;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1589340rSe;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes25.dex */
public final class MainActivityRelaunchMonitorAssem extends BaseMainContainerAssem implements C0RUJ {
    public final C01GW LL = C452501pT.LIZIZ(new C1565880qqo());
    public Configuration LLILLJJLI;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "main_activity_relaunch_monitor";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || !c19egLIZ.isChangingConfigurations()) {
            return;
        }
        C1589360rSg c1589360rSg = C1589360rSg.LIZ;
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        int changingConfigurations = c19egLIZ2 != null ? c19egLIZ2.getChangingConfigurations() : 0;
        c1589360rSg.getClass();
        if (changingConfigurations != 0) {
            C1589360rSg.LIZJ = EnumC1589340rSe.CONFIG_CHANGE;
            C1589360rSg.LIZLLL = changingConfigurations;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onRecreate() {
        super.onRecreate();
        C20684815ws.onEventV3("main_recreate_monitor");
        C1589360rSg.LIZ.getClass();
        C1589360rSg.LIZJ = EnumC1589340rSe.RECREATE;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || !c19egLIZ.isChangingConfigurations()) {
            return;
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        C20684815ws.LJIILLIIL("changing_configuration_recreate", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "homepage"), new Pair("changing_configurations", String.valueOf(c19egLIZ2 != null ? c19egLIZ2.getChangingConfigurations() : 0))));
        ((AbstractC1604130rqV) this.LL.getValue()).LJIIJJI(new AwS556S0100000_12(this, 515));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.LLILLJJLI;
        if (configuration2 == null) {
            configuration2 = configuration;
        }
        int i = configuration.navigation;
        int i2 = configuration2.navigation;
        if (i != i2) {
            C20684815ws.LJIILLIIL("activity_configuration_change", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "homepage"), new Pair("event_type", "navigation"), new Pair("old_navi", String.valueOf(i2)), new Pair("new_navi", String.valueOf(i))));
            ((AbstractC1604130rqV) this.LL.getValue()).LJIIJJI(new C00RY(i2, i));
            if (((Number) C277070AtV.LIZ.getValue()).intValue() == 1) {
                ((AbstractC1604130rqV) this.LL.getValue()).LJIIJJI(AFwS213S0000000_24.get$arr$(222));
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    c19egLIZ.recreate();
                }
            }
            ((AbstractC1604130rqV) this.LL.getValue()).LJIIJJI(new AwS425S0200000_24(configuration2, configuration, 25));
        }
        Configuration configuration3 = this.LLILLJJLI;
        if (configuration3 == null) {
            this.LLILLJJLI = new Configuration(configuration);
        } else {
            configuration3.setTo(configuration);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        Resources resources;
        Configuration configuration;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainActivityRelaunchMonitorAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (resources = c19egLIZ.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            this.LLILLJJLI = new Configuration(configuration);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
