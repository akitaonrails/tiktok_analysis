package com.ss.android.ugc.aweme.pipo.errorsdk;

import X.C1725060uzY;
import X.C1725130uzf;
import X.InterfaceC921603iw;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.errorsdk.ab.ErrorCodeSdkConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorCodeSdkImpl implements IErrorCodeSdk {
    @Override // com.ss.android.ugc.aweme.pipo.errorsdk.IErrorCodeSdk
    public final InterfaceC921603iw LIZ(String str, String str2, String str3, String str4) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ErrorCodeSdkConfig errorCodeSdkConfig = C1725130uzf.LIZ;
        ErrorCodeSdkConfig errorCodeSdkConfig2 = (ErrorCodeSdkConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_error_sdk_config", ErrorCodeSdkConfig.class, errorCodeSdkConfig);
        if (errorCodeSdkConfig2 != null) {
            errorCodeSdkConfig = errorCodeSdkConfig2;
        }
        if (errorCodeSdkConfig.enable) {
            return new C1725060uzY(str, str2, str3, str4);
        }
        return new InterfaceC921603iw() { // from class: X.03jw
            @Override // X.InterfaceC921603iw
            public final void LIZ(C1710940ucm c1710940ucm, String str5, String str6, String str7, C921403iu c921403iu) {
            }

            @Override // X.InterfaceC921603iw
            public final void LIZIZ(String str5, C921303it c921303it) {
            }

            @Override // X.InterfaceC921603iw
            public final void LIZLLL(C1710940ucm c1710940ucm, String str5, InterfaceC1725110uzd interfaceC1725110uzd) {
            }

            @Override // X.InterfaceC921603iw
            public final String LIZJ(String str5, String str6) {
                return C786410Ut5.J3(new JSONObject());
            }
        };
    }
}
