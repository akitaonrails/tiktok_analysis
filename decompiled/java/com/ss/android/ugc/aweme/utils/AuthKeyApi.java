package com.ss.android.ugc.aweme.utils;

import X.C11NZ;
import X.InterfaceC1485505rh;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface AuthKeyApi {
    @InterfaceC1501240pAY("/aweme/v1/upload/authkey/")
    @InterfaceC1485505rh
    C11NZ<UploadAuthKeyConfig> getUploadAuthKeyConfig(@InterfaceC1501150pAP Map<String, String> map);
}
