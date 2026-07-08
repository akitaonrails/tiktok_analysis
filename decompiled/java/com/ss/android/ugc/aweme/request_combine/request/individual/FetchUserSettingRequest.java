package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.AbstractC848400XPy;
import X.C0CO3;
import X.C0XQ7;
import X.C10FJ;
import X.C20684815ws;
import X.C2344009Gk;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUserSettingRequest;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchUserSettingRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchUserSettingRequest";
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

    public static void LIZ() {
        String str = ComplianceServiceProvider.LJI().LJIJ() == 1 ? "on" : "off";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C20684815ws.LJIILLIIL("tns_remove_photosensitive_status", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.IDLE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0COz] */
    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJIILL(new C10FJ() { // from class: X.0COz
                @Override // X.C10FJ
                public final void Hl(PushSettings pushSettings) {
                    this.LL.getClass();
                    FetchUserSettingRequest.LIZ();
                }

                @Override // X.C10FJ
                public final void onFailed(Exception exc) {
                    this.LL.getClass();
                    FetchUserSettingRequest.LIZ();
                }
            });
        }
    }
}
