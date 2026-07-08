package com.ss.android.ugc.localnotify;

import X.C087E;
import X.C0VPZ;
import X.C0VQ2;
import X.C2188811AlT;
import X.C797270VPh;
import X.InterfaceC304970BxP;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.localnotify.CommonLocalNotifyService;
import com.ss.android.ugc.localnotifyapi.ILocalNotifyApi;

/* JADX INFO: loaded from: classes14.dex */
public final class CommonLocalNotifyService implements ILocalNotifyApi {
    public static int LIZ = -1;

    public static void LIZJ() {
        boolean z = C797270VPh.LIZ;
        if (z != LIZ) {
            if (z) {
                C0VPZ.LIZ.getClass();
                long jLIZIZ = C0VPZ.LIZIZ(0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateLastLaunchDate(");
                sbLIZ.append(jLIZIZ);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                ((Keva) C087E.LIZ.getValue()).storeLong("last_launched_date_ts", jLIZIZ);
                C0VQ2.LIZ().LIZJ();
            } else {
                C0VQ2.LIZ().LJFF();
            }
            LIZ = z ? 1 : 0;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkStatusChange() - isLocalPush status changed! ");
            sbLIZ2.append(LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final boolean LIZ() {
        boolean z = C797270VPh.LIZ;
        return C797270VPh.LIZ;
    }

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initCommon() - ");
        sbLIZ.append(LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZ == -1) {
            SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0VQ3
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    this.LL.getClass();
                    CommonLocalNotifyService.LIZJ();
                }
            });
        }
        LIZJ();
    }
}
