package com.bytedance.bdinstall.storage;

import X.C0WI8;
import X.C0WIB;
import X.C0WID;
import X.C0XBK;
import X.C2123908Tt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C824170WUt;
import X.C844580XBg;
import Y.ARunnableS82S0200000_13;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsDeviceParamsProvider implements C0XBK {
    public final Context LIZ;
    public final C0WID LIZIZ;
    public final C0WIB LIZJ;
    public final C0WI8 LIZLLL;
    public String LJ;
    public String LJFF;
    public volatile String LJI;
    public final String LJII;

    @Override // X.C0XBK
    public final String LIZLLL() {
        if (!TextUtils.isEmpty(this.LJFF)) {
            return this.LJFF;
        }
        try {
            SharedPreferences sharedPreferencesLIZ = C844580XBg.LIZ(this.LIZ, this.LIZIZ.LJ);
            String string = sharedPreferencesLIZ.getString("clientudid", null);
            if (!C2123908Tt.LJ(string)) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor editorEdit = sharedPreferencesLIZ.edit();
                editorEdit.putString("clientudid", string);
                editorEdit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(this.LJII);
                string = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LJFF = string;
            return string;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // X.C0XBK
    public final String getDeviceId() {
        if (!TextUtils.isEmpty(this.LJI)) {
            return this.LJI;
        }
        this.LJI = this.LIZJ.LIZIZ("", "");
        return this.LJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[PHI: r6
      0x0084: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:16:0x003e, B:21:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0XBK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getOpenUdid() {
        /*
            r7 = this;
            java.lang.String r0 = r7.LJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r7.LJ
            return r0
        Lb:
            android.content.Context r0 = r7.LIZ
            r2 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L17
            java.lang.String r3 = X.C313590CQz.LIZ(r0)     // Catch: java.lang.Exception -> L17
            goto L1c
        L17:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = r2
        L1c:
            android.content.Context r1 = r7.LIZ
            X.0WID r0 = r7.LIZIZ
            X.0XBz r0 = r0.LJ
            android.content.SharedPreferences r5 = X.C844580XBg.LIZ(r1, r0)
            java.lang.String r4 = "openudid"
            java.lang.String r6 = r5.getString(r4, r2)
            boolean r0 = X.C2123908Tt.LJ(r3)     // Catch: java.lang.Exception -> L7f
            if (r0 == 0) goto L3a
            java.lang.String r0 = "9774d56d682e549c"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L7f
            if (r0 == 0) goto L85
        L3a:
            boolean r0 = X.C2123908Tt.LJ(r6)     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L84
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L7f
            r2.<init>()     // Catch: java.lang.Exception -> L7f
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch: java.lang.Exception -> L7f
            r0 = 80
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L7f
            r0 = 16
            java.lang.String r6 = r1.toString(r0)     // Catch: java.lang.Exception -> L7f
            r0 = 0
            char r1 = r6.charAt(r0)     // Catch: java.lang.Exception -> L7f
            r0 = 45
            if (r1 != r0) goto L60
            r0 = 1
            java.lang.String r6 = r6.substring(r0)     // Catch: java.lang.Exception -> L7f
        L60:
            int r0 = r6.length()     // Catch: java.lang.Exception -> L7f
            int r2 = 13 - r0
            if (r2 <= 0) goto L84
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            r1.<init>()     // Catch: java.lang.Exception -> L7f
        L6d:
            if (r2 <= 0) goto L77
            r0 = 70
            r1.append(r0)     // Catch: java.lang.Exception -> L7f
            int r2 = r2 + (-1)
            goto L6d
        L77:
            r1.append(r6)     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L7f
            goto L85
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L85
        L84:
            r3 = r6
        L85:
            android.content.SharedPreferences$Editor r0 = r5.edit()
            r0.putString(r4, r3)
            r0.apply()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto La5
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = r7.LJII
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        La5:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lad
            r7.LJ = r3
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.storage.AbsDeviceParamsProvider.getOpenUdid():java.lang.String");
    }

    @Override // X.C0XBK
    public final void LIZIZ(Account account) {
        C0WI8 c0wi8 = this.LIZLLL;
        if (c0wi8 != null) {
            String strLIZ = this.LIZIZ.LJ.LIZ();
            if (account != null) {
                c0wi8.LIZLLL = account;
                if (c0wi8.LJ.size() > 0) {
                    C824170WUt.LIZJ(strLIZ).execute(new ARunnableS82S0200000_13(c0wi8, account, 44));
                }
            }
        }
    }

    @Override // X.C0XBK
    public final void LIZJ(String str) {
        if (C2123908Tt.LIZ(str)) {
            String str2 = this.LJI;
            if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && !str.equals(str2)) {
                this.LJI = this.LIZJ.LIZIZ(str, this.LJI);
            }
        }
    }

    public AbsDeviceParamsProvider(Context context, C0WID c0wid) {
        String str;
        if (c0wid.LIZIZ) {
            str = "_local";
        } else {
            str = "";
        }
        this.LJII = str;
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = contextN3;
        this.LIZIZ = c0wid;
        C0WIB c0wib = new C0WIB(contextN3, c0wid.LIZ, c0wid.LJ);
        this.LIZJ = c0wib;
        if (!C844580XBg.LIZ(context, c0wid.LJ).getBoolean("is_migrate", false)) {
            C0WI8 c0wi8 = new C0WI8(context, c0wid.LIZLLL, c0wid.LJ);
            this.LIZLLL = c0wi8;
            c0wib.LIZ = c0wi8;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 || (i == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                context.getApplicationInfo();
            }
        }
        LIZIZ(c0wid.LIZJ);
    }
}
