package com.ss.android.ugc.aweme.net.interceptor;

import X.C0XK8;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes24.dex */
public final class ResponseExtraParser {

    public static class OldErrorModel {
        public Data data;

        public static class Data {
            public String description;
            public int error_code;
            public String verify_center_decision_conf;
            public String verify_center_secondary_decision_conf;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0XK5 LIZIZ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.interceptor.ResponseExtraParser.LIZIZ(java.lang.String):X.0XK5");
    }

    public static void LIZ(String str, C0XK8 c0xk8) {
        int i;
        String str2;
        OldErrorModel oldErrorModel = (OldErrorModel) GsonProtectorUtils.fromJson(new Gson(), str, OldErrorModel.class);
        OldErrorModel.Data data = oldErrorModel.data;
        if (data == null) {
            i = 0;
        } else {
            i = data.error_code;
        }
        c0xk8.LIZ = i;
        if (data == null) {
            str2 = null;
        } else {
            str2 = data.description;
        }
        c0xk8.LIZIZ = str2;
        c0xk8.LIZJ = null;
        if (data != null) {
            String str3 = data.verify_center_decision_conf;
            c0xk8.LIZJ = str3;
            if (TextUtils.isEmpty(str3)) {
                c0xk8.LIZJ = oldErrorModel.data.verify_center_secondary_decision_conf;
            }
        }
    }
}
