package com.ss.android.ugc.aweme.aigc.aifingerprint;

import X.C040I;
import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC2177008fw;
import com.google.gson.n;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* JADX INFO: loaded from: classes23.dex */
public final class AIFingerprintApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface GetApi {
        @InterfaceC1501200pAU("/api/aigc/fingerprint/query")
        C0X9S<QueryAigcFingerprintResponse> get(@InterfaceC1501070pAH("fingerprint_id") Long l, @InterfaceC1501070pAH("aweme_id") Long l2, @InterfaceC2177008fw Object obj);
    }

    public interface PostApi {
        @InterfaceC1501240pAY("/api/aigc/fingerprint/store")
        C0X9S<BaseNetResponse> post(@C040I n nVar, @InterfaceC2177008fw Object obj);
    }
}
