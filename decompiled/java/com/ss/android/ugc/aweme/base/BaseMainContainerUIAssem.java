package com.ss.android.ugc.aweme.base;

import X.C0PDM;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1566540qrs;
import X.C723580SZw;
import X.InterfaceC1593530rZP;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.assem.arch.view.UIContentAssem;

/* JADX INFO: loaded from: classes25.dex */
public class BaseMainContainerUIAssem extends UIContentAssem implements InterfaceC1593530rZP {
    public final /* synthetic */ C1566540qrs LLIZLLLIL = new C1566540qrs();
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C0PDM.class, null), checkSupervisorPrepared());

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1593530rZP
    public final void onActivityFinish() {
    }

    @Override // X.InterfaceC1593530rZP
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // X.InterfaceC1593530rZP
    public final void onAssemLoaded() {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onBackPress() {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onBeforeCreate() {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onRecreate() {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onReleaseInstance(boolean z) {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC1593530rZP
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC1593530rZP
    public void onWindowFocusChanged(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1593530rZP
    public final void splashOverShowMandatoryLoginPage() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        if (!this.LLIZLLLIL.LIZ) {
            C0PDM c0pdm = (C0PDM) this.LLJ.getValue();
            onCreate(c0pdm != null ? c0pdm.LL : null);
        }
        super.onCreate();
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        this.LLIZLLLIL.LIZ = true;
    }
}
