package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C0X4S;
import X.C2344809Gs;
import X.C813020Vuu;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.wrapper.ITaskExecutorApi;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public final class AntispamApiUploadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AntispamApiUploadTask";
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
        C2344809Gs.LJ("AntispamApiUploadTask");
        if (C813020Vuu.LJIIL().LIZIZ(context, "is_first_install", true)) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData(C0X4S.INSTALL.getReportName());
            C813020Vuu.LJIIL().LJI(context, "is_first_install", false);
        }
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData(C0X4S.COLD_START.getReportName());
        ITaskExecutorApi iTaskExecutorApi = (ITaskExecutorApi) PluggableExtentionKt.pluggableSpi$default(ITaskExecutorApi.class, false, false, false, 14, null);
        if (iTaskExecutorApi != null) {
            iTaskExecutorApi.LIZ("AntispamApiUploadTask");
        }
    }
}
