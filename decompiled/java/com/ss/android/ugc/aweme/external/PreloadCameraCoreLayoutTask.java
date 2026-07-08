package com.ss.android.ugc.aweme.external;

import X.C0CCZ;
import X.C0VZ0;
import X.C201955140j;
import X.C201967140v;
import X.C280080AyM;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class PreloadCameraCoreLayoutTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadCameraCoreLayoutTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        C201955140j.LJIILL(c201967140v, "PreloadCameraLayout", "preload layout start");
        if (((Number) C280080AyM.LIZ.getValue()).intValue() == 1) {
            ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).preloadLayoutSerial();
        } else {
            ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).preloadLayoutFiles();
        }
        C201955140j.LJIILL(c201967140v, "PreloadCameraLayout", "preload layout end");
    }
}
