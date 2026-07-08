package com.bytedance.pipo.security.certificate.api;

import X.C0X9S;
import X.C1726490v1r;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;

/* JADX INFO: loaded from: classes27.dex */
public interface CertApi {
    public static final C1726490v1r LIZ = C1726490v1r.LIZ;

    @InterfaceC1501170pAR("/payment/v1/cert")
    C0X9S<CertificateResponse> requestCertificate(@InterfaceC1501350pAj("x-pipo-sign-src") String str, @InterfaceC1501350pAj("pipo-fp-session-id") String str2, @InterfaceC1501350pAj("x-pipo-phpout") String str3, @InterfaceC1485405rg CertificateRequest certificateRequest);
}
