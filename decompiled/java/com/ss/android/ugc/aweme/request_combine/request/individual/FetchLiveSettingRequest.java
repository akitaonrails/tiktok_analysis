package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.C0CO3;
import X.C0CPK;
import X.C0CPQ;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC20318714ev;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchLiveSettingRequest implements InterfaceC800130Va7 {
    public final C0CPQ LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchLiveSettingRequest";
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
        return C0CO3.IDLE;
    }

    public FetchLiveSettingRequest(C0CPQ c0cpq) {
        this.LL = c0cpq;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C0CPK c0cpkLJI;
        InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4();
        if (interfaceC20318714evB4 != null && (c0cpkLJI = interfaceC20318714evB4.LJI()) != null) {
            c0cpkLJI.LIZIZ(context, this.LL);
        }
    }
}
