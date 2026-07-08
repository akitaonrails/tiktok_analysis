package com.ss.android.ugc.aweme.base;

import X.AbstractC738140SxQ;
import X.C0PDM;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1566540qrs;
import X.C723580SZw;
import X.InterfaceC1593530rZP;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: loaded from: classes25.dex */
public class BaseMainContainerAssem extends AbstractC738140SxQ implements InterfaceC1593530rZP {
    public final /* synthetic */ C1566540qrs $$delegate_0 = new C1566540qrs();
    public final C1559260qg8 restoreData$delegate = new C1559260qg8(new C723580SZw(this, C0PDM.class, null), checkSupervisorPrepared());

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1593530rZP
    public void onActivityFinish() {
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // X.InterfaceC1593530rZP
    public void onAssemLoaded() {
    }

    @Override // X.InterfaceC1593530rZP
    public void onBackPress() {
    }

    public void onBeforeCreate() {
    }

    @Override // X.InterfaceC1593530rZP
    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onNewIntent(Intent intent) {
    }

    @Override // X.InterfaceC1593530rZP
    public void onRecreate() {
    }

    @Override // X.InterfaceC1593530rZP
    public void onReleaseInstance(boolean z) {
    }

    @Override // X.InterfaceC1593530rZP
    public void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC1593530rZP
    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onWindowFocusChanged(boolean z, boolean z2) {
    }

    public void splashOverShowMandatoryLoginPage() {
    }

    private final C0PDM getRestoreData() {
        return (C0PDM) this.restoreData$delegate.getValue();
    }

    public boolean isFragmentCreateViewCalled() {
        return this.$$delegate_0.LIZIZ;
    }

    public boolean isFragmentOnViewCreatedCalled() {
        return this.$$delegate_0.LIZJ;
    }

    public boolean isOnCreateFromMainCalled() {
        return this.$$delegate_0.LIZ;
    }

    @Override // X.AbstractC738140SxQ
    public void onCreate() {
        if (!isOnCreateFromMainCalled()) {
            onAssemLoaded();
            onBeforeCreate();
            C0PDM restoreData = getRestoreData();
            onCreate(restoreData != null ? restoreData.LL : null);
        }
        super.onCreate();
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    public void onCreate(Bundle bundle) {
        setOnCreateFromMainCalled(true);
    }

    public void setFragmentCreateViewCalled(boolean z) {
        this.$$delegate_0.LIZIZ = z;
    }

    public void setFragmentOnViewCreatedCalled(boolean z) {
        this.$$delegate_0.LIZJ = z;
    }

    public void setOnCreateFromMainCalled(boolean z) {
        this.$$delegate_0.LIZ = z;
    }
}
