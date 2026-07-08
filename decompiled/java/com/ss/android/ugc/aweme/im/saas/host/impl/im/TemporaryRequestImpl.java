package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C1477105qL;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.im.saas.host.api.im.TemporaryRequestApi;

/* JADX INFO: loaded from: classes3.dex */
public final class TemporaryRequestImpl implements TemporaryRequestApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.TemporaryRequestApi
    public final Object LIZ(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C1477105qL.LIZJ().acknowledgeNoticeRead("inbox_activity_status", "inbox", 2, str, str2, interfaceC1364105Vn);
    }
}
