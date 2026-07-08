package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.C0CO3;
import X.C100F;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FetchComplianceSettingRequest implements InterfaceC800130Va7 {
    public final C0CO3 LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchComplianceSettingRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return this.LL;
    }

    public FetchComplianceSettingRequest(C0CO3 c0co3) {
        this.LL = c0co3;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        ComplianceServiceProvider.LJJI().LJIJJLI(new C100F() { // from class: X.10Tm
            @Override // X.C100F
            public final void LIZIZ(boolean z2) {
            }
        }, 0);
    }
}
