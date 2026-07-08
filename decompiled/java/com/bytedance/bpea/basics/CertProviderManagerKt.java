package com.bytedance.bpea.basics;

import X.C20146113sB;

/* JADX INFO: loaded from: classes31.dex */
public final class CertProviderManagerKt {
    public static final Cert findCert(String str, int i) {
        Cert certFindCert = CertProviderManager.INSTANCE.findCert(str, i);
        if (certFindCert == null) {
            C20146113sB c20146113sB = new C20146113sB(str, null);
            c20146113sB.attachCustomInfo("dataflowID", Integer.valueOf(i));
            return c20146113sB;
        }
        return certFindCert;
    }

    public static final Cert findCert(String str, int i, String str2) {
        Cert certFindCert = CertProviderManager.INSTANCE.findCert(str, i, str2);
        if (certFindCert == null) {
            C20146113sB c20146113sB = new C20146113sB(str, str2);
            c20146113sB.attachCustomInfo("dataflowID", Integer.valueOf(i));
            return c20146113sB;
        }
        return certFindCert;
    }
}
