package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C2344809Gs;
import X.C813020Vuu;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class UploadInstallEventTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "UploadInstallEventTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2344809Gs.LJ("UploadInstallEventTask");
        SharedPreferences sharedPreferencesLJ = C813020Vuu.LJIIL().LJ(context);
        if (sharedPreferencesLJ != null && sharedPreferencesLJ.getBoolean("is_first_install", false)) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("install");
            C813020Vuu.LJIIL().LJI(context, "is_first_install", false);
        }
    }
}
