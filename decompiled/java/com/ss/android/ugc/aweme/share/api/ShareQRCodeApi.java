package com.ss.android.ugc.aweme.share.api;

import X.C15O7;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareQRCodeApi {

    public interface RealApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/share/qrcode/create/v1/")
        C15O7<QRCodeInfo> getUserQRCodeInfo(@InterfaceC1501050pAF("schema_type") int i, @InterfaceC1501050pAF("object_id") String str);
    }
}
