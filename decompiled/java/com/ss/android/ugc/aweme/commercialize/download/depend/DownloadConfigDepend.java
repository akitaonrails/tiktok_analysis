package com.ss.android.ugc.aweme.commercialize.download.depend;

import X.C0XQ7;
import X.InterfaceC1500070p8f;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.socialbase.ttnet.IDownloadApi;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;

/* JADX INFO: loaded from: classes14.dex */
public final class DownloadConfigDepend implements IDownloadConfigDepend {
    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public InterfaceC1500070p8f getTTNetDownloadHttpService() {
        return new InterfaceC1500070p8f() { // from class: X.0X7H
            public IDownloadApi LIZ;

            /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
            @Override // X.InterfaceC1500070p8f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1B8V LIZ(java.lang.String r18, java.util.List r19) {
                /*
                    Method dump skipped, instruction units count: 325
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0X7H.LIZ(java.lang.String, java.util.List):X.1B8V");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public String getDeviceId() {
        return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public String getSettingString() {
        return SharePrefCache.inst().getDownloadSdkConfig().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public String getUserId() {
        return C0XQ7.LJFF().getCurUserId();
    }
}
