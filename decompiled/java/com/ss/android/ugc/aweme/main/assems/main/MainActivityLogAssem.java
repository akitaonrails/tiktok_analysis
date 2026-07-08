package com.ss.android.ugc.aweme.main.assems.main;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0RUJ;
import X.C1150504el;
import X.C19EG;
import X.C2188811AlT;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C991420buG;
import X.C991430buH;
import X.C991440buI;
import X.C991450buJ;
import X.C991460buK;
import X.C991470buL;
import X.C991490buN;
import X.EnumC452301pR;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class MainActivityLogAssem extends BaseMainContainerAssem implements C0RUJ {
    public final C01GW LL = C452501pT.LIZ(EnumC452301pR.NONE, new C991490buN());

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "main_activity_log";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
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
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainActivityLogAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        bo().LJIIJJI(new C991470buL(this));
        C1150504el.LIZ().LJI(strJ4, false);
    }

    public final AbstractC1604130rqV bo() {
        return (AbstractC1604130rqV) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onActivityFinish() {
        super.onActivityFinish();
        bo().LJIIJJI(new AwS560S0100000_16(this, 352));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onAssemLoaded() {
        super.onAssemLoaded();
        bo().LJIIJJI(new C991430buH(this));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onBeforeCreate() {
        super.onBeforeCreate();
        bo().LJIIJJI(new C991440buI(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        bo().LJIIJJI(new AwS560S0100000_16(this, 353));
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        bo().LJIIJJI(new AwS560S0100000_16(this, 354));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onRecreate() {
        super.onRecreate();
        bo().LJIIJJI(new AwS560S0100000_16(this, 355));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        bo().LJIIJJI(new C991450buJ(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        bo().LJIIJJI(new AwS134S0110000_16(this, c19egLIZ != null ? c19egLIZ.isChangingConfigurations() : false, 3));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bo().LJIIJJI(new AwS417S0200000_16(this, configuration, 26));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainActivityLogAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        bo().LJIIJJI(new C991460buK(this));
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AbstractC1604130rqV abstractC1604130rqVBo = bo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNewIntent ");
        sbLIZ.append(this);
        sbLIZ.append(' ');
        abstractC1604130rqVBo.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), intent);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onReleaseInstance(boolean z) {
        super.onReleaseInstance(z);
        bo().LJIIJJI(new AwS134S0110000_16(this, z, 2));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        super.onWindowFocusChanged(z, z2);
        bo().LJIIJJI(new C991420buG(this, z, z2));
    }
}
