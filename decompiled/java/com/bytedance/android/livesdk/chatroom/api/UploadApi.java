package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.retrofit2.mime.TypedOutput;

/* JADX INFO: loaded from: classes5.dex */
public interface UploadApi {
    @InterfaceC1501170pAR("/webcast/certification/submit_cert_data/")
    AbstractC19484711Kz<C470590Icr<UploadResult>> upload(@InterfaceC1485405rg TypedOutput typedOutput);

    @InterfaceC1501170pAR("/webcast/certification/submit_cert_data/")
    C11NZ<C470590Icr<UploadResult>> upload2(@InterfaceC1485405rg TypedOutput typedOutput);
}
