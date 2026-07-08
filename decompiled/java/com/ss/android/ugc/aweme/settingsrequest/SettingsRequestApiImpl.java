package com.ss.android.ugc.aweme.settingsrequest;

import X.C04TD;
import X.C0CCZ;
import X.C0CL2;
import X.C10FG;
import X.C10FJ;
import X.C311990CKv;
import X.InterfaceC312000CKw;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi;
import com.ss.android.ugc.aweme.settingsrequest.task.SettingsReaderInitTask;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingsRequestApiImpl implements ISettingsRequestApi {
    public static ISettingsRequestApi LIZJ() {
        Object objLIZ = C04TD.LIZ(ISettingsRequestApi.class, false);
        if (objLIZ != null) {
            return (ISettingsRequestApi) objLIZ;
        }
        if (C04TD.Y4 == null) {
            synchronized (ISettingsRequestApi.class) {
                if (C04TD.Y4 == null) {
                    C04TD.Y4 = new SettingsRequestApiImpl();
                }
            }
        }
        return C04TD.Y4;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final C0CCZ LIZIZ() {
        return new SettingsReaderInitTask();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final void LIZLLL(C10FJ c10fj) {
        boolean zLJI = MethodIDManager.LJI(137845);
        C10FG.LIZ.getClass();
        C10FG.LIZLLL(c10fj, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final void LIZ(C0CL2 c0cl2, InterfaceC312000CKw interfaceC312000CKw) {
        C311990CKv.LIZ.put(c0cl2, interfaceC312000CKw);
    }
}
