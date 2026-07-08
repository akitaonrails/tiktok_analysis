package com.ss.android.ugc.aweme.im.saas.host.impl.im.utils;

import X.C1720406oU;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344809Gs;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;

/* JADX INFO: loaded from: classes3.dex */
public final class IMALogService implements IMALogApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi
    public final boolean LJIILIIL() {
        return C1720406oU.LIZIZ.LIZ("dm_dev_pull_message_result");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi
    public final boolean LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("alog_write_for_all_channel", true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi
    public final void logException(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C2344809Gs.LIZLLL(6, "IM-Exception", message);
        C2344809Gs.LJI(th);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi
    public final void LIZJ(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IM-Exception ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C2344809Gs.LIZLLL(6, strLIZIZ, message);
        Npth.reportBizException("im_fatal", th, str, C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi
    public final void LIZ(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IM-");
        sbLIZ.append(str);
        C2344809Gs.LIZLLL(i, C2188811AlT.LIZIZ(sbLIZ), str2);
    }
}
