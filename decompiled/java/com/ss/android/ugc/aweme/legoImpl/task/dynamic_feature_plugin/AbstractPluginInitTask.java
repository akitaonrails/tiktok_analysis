package com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799980VZs;
import X.InterfaceC2210981Bg8;
import X.InterfaceC586170Myt;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import realtimefeedback.IRealtimeFeedbackService;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractPluginInitTask implements C0CCZ {
    public static final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final void LIZ(boolean z) {
        this.LL = z;
        if (!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            ((IPluginService) ServiceManager.get().getService(IPluginService.class)).startPluginRequest(null, null, Boolean.FALSE, this.LL, 101);
        } else {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(new InterfaceC2210981Bg8() { // from class: X.0XOs
                @Override // X.InterfaceC2210981Bg8
                public final void LIZ(boolean z2) {
                    this.LL.LJ(z2);
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZJ(boolean z2) {
                    this.LL.LJ(z2);
                }

                @Override // X.InterfaceC2210981Bg8
                public final void LIZIZ(String str, String str2) {
                    this.LL.LJ(true);
                }
            });
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new InterfaceC586170Myt() { // from class: X.0XOr
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z2, int i2, User user) {
                if (z2 && i == 3) {
                    ((IPluginService) ServiceManager.get().getService(IPluginService.class)).startPluginRequest(null, null, Boolean.FALSE, false, 102);
                }
            }
        });
        IRealtimeFeedbackService iRealtimeFeedbackService = (IRealtimeFeedbackService) PluggableExtentionKt.pluggableSpi$default(IRealtimeFeedbackService.class, false, false, false, 14, null);
        if (iRealtimeFeedbackService != null) {
            iRealtimeFeedbackService.LIZ(false, false);
        }
    }

    public final void LJ(boolean z) {
        if (z && LLILLJJLI.compareAndSet(false, true) && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            ((IPluginService) ServiceManager.get().getService(IPluginService.class)).startPluginRequest(null, null, Boolean.FALSE, this.LL, 101);
        }
    }
}
