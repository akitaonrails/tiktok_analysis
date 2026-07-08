package com.ss.android.ugc.aweme.settingsrequest;

import X.C0C64;
import X.C0COD;
import X.C302240Bt0;
import X.C302300Bt6;
import X.InterfaceC302500BtQ;
import com.google.gson.n;
import com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi;

/* JADX INFO: loaded from: classes5.dex */
public final class AbTestManagerApiImpl implements IAbTestManagerApi {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean LIZJ() {
        C302240Bt0.LJFF().getClass();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean isContainsKeyWithLruEntries() {
        C302240Bt0.LJFF().getClass();
        return C0COD.LIZ() ? ((Boolean) C302300Bt6.LIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "contains_key_with_lruEntries", true, true);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean isReplaceAwemeCache() {
        C302240Bt0.LJFF().getClass();
        return C0C64.LJIILLIIL().LJIIIZ(31744, "is_replace_aweme_manager_with_lrucache", true, true);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZIZ(n nVar) {
        C302240Bt0.LJFF().LIZIZ(nVar);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZLLL(boolean z) {
        C302240Bt0.LJFF().LIZLLL(true);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LJ(InterfaceC302500BtQ interfaceC302500BtQ) {
        C302240Bt0.LJFF().LJ(interfaceC302500BtQ);
    }
}
