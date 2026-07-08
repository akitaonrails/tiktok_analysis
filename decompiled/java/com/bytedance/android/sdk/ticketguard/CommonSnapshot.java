package com.bytedance.android.sdk.ticketguard;

import X.C09CT;
import X.C0XNA;
import X.C0XNO;
import X.C0XNP;
import X.C0XNV;
import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class CommonSnapshot extends LocalSnapshot {

    @C09CT("host")
    public final String host;

    @C09CT("logid")
    public final String logid;

    @C09CT("path")
    public final String path;

    @C09CT("request_client_cert")
    public final String request_client_cert;

    @C09CT("request_csr")
    public final String request_csr;

    @C09CT("request_iteration_version")
    public final String request_iteration_version;

    @C09CT("request_ree_public_key")
    public final String request_ree_public_key;

    @C09CT("request_version")
    public final String request_version;

    public CommonSnapshot(C0XNV<?> c0xnv) {
        C0XNO c0xno;
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        List<Pair<String, String>> list;
        String str;
        String str2;
        P p = c0xnv.LIZ;
        C0XNA c0xna = null;
        if (p != 0) {
            c0xno = p.requestContent;
            if (c0xno != null) {
                c0xna = c0xno.LIZ;
            }
        } else {
            c0xno = null;
        }
        this.logid = c0xnv.LIZIZ;
        this.host = (c0xna == null || (str2 = c0xna.host) == null) ? "" : str2;
        this.path = (c0xna == null || (str = c0xna.path) == null) ? "" : str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c0xno != null && (list = c0xno.LIZIZ) != null) {
            for (Pair<String, String> pair : list) {
                linkedHashMap.put(pair.first, pair.second);
            }
        }
        String str3 = (String) linkedHashMap.get("tt-ticket-guard-client-csr");
        this.request_csr = (str3 == null || (strLIZ3 = C0XNP.LIZ(str3)) == null) ? "" : strLIZ3;
        String str4 = (String) linkedHashMap.get("tt-ticket-guard-client-cert");
        this.request_client_cert = (str4 == null || (strLIZ2 = C0XNP.LIZ(str4)) == null) ? "" : strLIZ2;
        String str5 = (String) linkedHashMap.get("tt-ticket-guard-public-key");
        this.request_ree_public_key = (str5 == null || (strLIZ = C0XNP.LIZ(str5)) == null) ? "" : strLIZ;
        String str6 = (String) linkedHashMap.get("tt-ticket-guard-iteration-version");
        this.request_iteration_version = str6 == null ? "" : str6;
        String str7 = (String) linkedHashMap.get("tt-ticket-guard-version");
        this.request_version = str7 != null ? str7 : "";
    }
}
