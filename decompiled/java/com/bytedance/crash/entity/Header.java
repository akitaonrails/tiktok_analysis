package com.bytedance.crash.entity;

import X.C0VJO;
import X.C0VSJ;
import X.C1284490jWx;
import X.C2112008Pe;
import X.C2188811AlT;
import X.C802300Vdc;
import X.C802770VeN;
import X.C802790VeP;
import X.C803540Vfc;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.LocaleInfo;
import com.bytedance.crash.monitor.f;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class Header {
    public static int LIZJ = -1;
    public long LIZIZ = -1;
    public final JSONObject LIZ = new JSONObject();

    public static Header LIZIZ(f fVar, long j, CrashType crashType, int i) {
        int i2;
        Header header = new Header();
        C802770VeN.LJII(header.LIZ, j);
        C0VJO.LJIIIIZZ(header.LIZ, "device_id", fVar.LIZLLL(CardStruct.IStatusCode.DEFAULT));
        C0VJO.LJIIIIZZ(header.LIZ, "user_id", Long.valueOf(fVar.LJI()));
        C0VJO.LJIIIIZZ(header.LIZ, "channel", fVar.LIZIZ());
        C0VJO.LJIIIIZZ(header.LIZ, "mp_params", null);
        try {
            i2 = CastIntegerProtector.parseInt(fVar.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i2 = 4444;
        }
        C0VJO.LJIIIIZZ(header.LIZ, "aid", Integer.valueOf(i2));
        C803540Vfc c803540VfcLJII = fVar.LJII();
        String str = c803540VfcLJII.LIZLLL;
        if (str != null) {
            C0VJO.LJIIIIZZ(header.LIZ, "app_version", str);
        }
        long j2 = c803540VfcLJII.LIZ;
        if (j2 != 0) {
            C0VJO.LJIIIIZZ(header.LIZ, "version_code", Long.valueOf(j2));
        }
        long j3 = c803540VfcLJII.LIZIZ;
        if (j3 != 0) {
            C0VJO.LJIIIIZZ(header.LIZ, "update_version_code", Long.valueOf(j3));
        }
        long j4 = c803540VfcLJII.LIZJ;
        if (j4 != 0) {
            C0VJO.LJIIIIZZ(header.LIZ, "manifest_version_code", Long.valueOf(j4));
        }
        Map<String, Object> mapLIZJ = fVar.LIZJ();
        if (mapLIZJ != null) {
            for (String str2 : mapLIZJ.keySet()) {
                if (mapLIZJ.get(str2) != null) {
                    C0VJO.LJIIIIZZ(header.LIZ, str2, mapLIZJ.get(str2));
                }
            }
        }
        header.LIZLLL(j, crashType, i, null);
        return header;
    }

    public static Header LIZJ(C802790VeP c802790VeP, long j, CrashType crashType, int i) {
        int i2;
        Header header = new Header();
        C802770VeN.LJII(header.LIZ, j);
        JSONObject jSONObject = header.LIZ;
        if (!jSONObject.has("device_id")) {
            C0VJO.LJIIIIZZ(jSONObject, "device_id", c802790VeP.LIZLLL(CardStruct.IStatusCode.DEFAULT));
        }
        if (!jSONObject.has("channel")) {
            C0VJO.LJIIIIZZ(jSONObject, "channel", c802790VeP.LJIILIIL(j));
        }
        try {
            i2 = CastIntegerProtector.parseInt(c802790VeP.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i2 = 4444;
        }
        C0VJO.LJIIIIZZ(jSONObject, "aid", Integer.valueOf(i2));
        C803540Vfc c803540VfcLJIILL = c802790VeP.LJIILL(j);
        if (c803540VfcLJIILL == null && (c803540VfcLJIILL = c802790VeP.LJIILL(0L)) == null) {
            c803540VfcLJIILL = c802790VeP.LJII();
        }
        String str = c803540VfcLJIILL.LIZLLL;
        if (str != null) {
            C0VJO.LJIIIIZZ(jSONObject, "app_version", str);
        }
        long j2 = c803540VfcLJIILL.LIZ;
        if (j2 != 0) {
            C0VJO.LJIIIIZZ(jSONObject, "version_code", Long.valueOf(j2));
        }
        long j3 = c803540VfcLJIILL.LIZIZ;
        if (j3 != 0) {
            C0VJO.LJIIIIZZ(jSONObject, "update_version_code", Long.valueOf(j3));
        }
        long j4 = c803540VfcLJIILL.LIZJ;
        if (j4 != 0) {
            C0VJO.LJIIIIZZ(jSONObject, "manifest_version_code", Long.valueOf(j4));
        }
        header.LIZLLL(j, crashType, i, null);
        return header;
    }

    public final void LIZLLL(long j, CrashType crashType, int i, File file) {
        JSONObject jSONObject = this.LIZ;
        C802770VeN c802770VeNLIZ = C802770VeN.LIZ();
        if (c802770VeNLIZ != null) {
            c802770VeNLIZ.LJFF().putTo(jSONObject);
        }
        JSONObject jSONObject2 = this.LIZ;
        C802770VeN c802770VeNLIZ2 = C802770VeN.LIZ();
        if (c802770VeNLIZ2 != null) {
            c802770VeNLIZ2.LIZJ().putTo(jSONObject2);
        }
        this.LIZIZ = C802770VeN.LIZLLL();
        JSONObject jSONObject3 = this.LIZ;
        C802770VeN c802770VeNLIZ3 = C802770VeN.LIZ();
        if (c802770VeNLIZ3 != null) {
            if (c802770VeNLIZ3.LJFF == null) {
                synchronized (C1284490jWx.class) {
                    try {
                        if (c802770VeNLIZ3.LJFF == null) {
                            c802770VeNLIZ3.LJFF = C1284490jWx.LIZ(c802770VeNLIZ3.LIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C1284490jWx c1284490jWx = c802770VeNLIZ3.LJFF;
            C0VJO.LJIIIIZZ(jSONObject3, "gl_vendor", c1284490jWx.LL);
            C0VJO.LJIIIIZZ(jSONObject3, "gl_renderer", c1284490jWx.LLILLJJLI);
            C0VJO.LJIIIIZZ(jSONObject3, "gl_version", c1284490jWx.LLILLL);
        }
        C0VJO.LJIIIIZZ(this.LIZ, "crash_type", crashType.getName());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android_");
        sbLIZ.append(this.LIZ.optString("device_id"));
        sbLIZ.append("_");
        sbLIZ.append(j);
        sbLIZ.append("_");
        sbLIZ.append(i);
        sbLIZ.append("_");
        sbLIZ.append(crashType.getName());
        C0VJO.LJIIIIZZ(this.LIZ, "unique_key", C2188811AlT.LIZIZ(sbLIZ));
        LocaleInfo.putTo(this.LIZ, file);
    }

    public static Header LIZ(C802790VeP c802790VeP, long j, long j2, CrashType crashType, int i, File file) {
        int i2;
        boolean z;
        String str;
        C803540Vfc c803540VfcLJIIZILJ;
        String str2;
        Header header = new Header();
        C802770VeN.LJII(header.LIZ, j);
        JSONObject jSONObject = header.LIZ;
        String strLJ = c802790VeP.LJIIL.LJ(j2);
        if (TextUtils.isEmpty(strLJ)) {
            strLJ = CardStruct.IStatusCode.DEFAULT;
        }
        C0VJO.LJIIIIZZ(jSONObject, "device_id", strLJ);
        C0VJO.LJIIIIZZ(header.LIZ, "user_id", Long.valueOf(c802790VeP.LJIIL.LJI(j2)));
        C0VJO.LJIIIIZZ(header.LIZ, "channel", c802790VeP.LJIILIIL(j2));
        C0VJO.LJIIIIZZ(header.LIZ, "mp_params", null);
        try {
            i2 = CastIntegerProtector.parseInt(c802790VeP.LJIIL.LIZIZ(j2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i2 = 4444;
        }
        C0VJO.LJIIIIZZ(header.LIZ, "aid", Integer.valueOf(i2));
        JSONObject jSONObject2 = header.LIZ;
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "version.json"));
        if (strLJFF != null) {
            try {
                C0VJO.LIZLLL(jSONObject2, new JSONObject(strLJFF));
                C802300Vdc.LIZ();
                z = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            try {
                JSONObject jSONObject3 = header.LIZ;
                C0VJO.LJIIIIZZ(jSONObject3, "init_version_name", jSONObject3.opt("version_name"));
                JSONObject jSONObject4 = header.LIZ;
                C0VJO.LJIIIIZZ(jSONObject4, "init_update_version_code", jSONObject4.opt("update_version_code"));
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            C0VJO.LJIIIIZZ(header.LIZ, "version_type", "crash_dump");
        } else {
            long jOptLong = header.LIZ.optLong("last_update_time");
            if (jOptLong > 0 && j > jOptLong && (c803540VfcLJIIZILJ = c802790VeP.LJIIZILJ(jOptLong)) != null && c803540VfcLJIIZILJ.LIZ != 0 && (str2 = c803540VfcLJIIZILJ.LIZLLL) != null) {
                C0VJO.LJIIIIZZ(header.LIZ, "app_version", str2);
                C0VJO.LJIIIIZZ(header.LIZ, "update_version_code", Long.valueOf(c803540VfcLJIIZILJ.LIZIZ));
                C0VJO.LJIIIIZZ(header.LIZ, "version_code", Long.valueOf(c803540VfcLJIIZILJ.LIZ));
                C0VJO.LJIIIIZZ(header.LIZ, "manifest_version_code", Long.valueOf(c803540VfcLJIIZILJ.LIZJ));
                C0VJO.LJIIIIZZ(header.LIZ, "version_type", "last_update_time");
            } else {
                C803540Vfc c803540VfcLJIILL = c802790VeP.LJIILL(j2);
                if (c803540VfcLJIILL != null && c803540VfcLJIILL.LIZ != 0 && (str = c803540VfcLJIILL.LIZLLL) != null) {
                    C0VJO.LJIIIIZZ(header.LIZ, "app_version", str);
                    C0VJO.LJIIIIZZ(header.LIZ, "update_version_code", Long.valueOf(c803540VfcLJIILL.LIZIZ));
                    C0VJO.LJIIIIZZ(header.LIZ, "version_code", Long.valueOf(c803540VfcLJIILL.LIZ));
                    C0VJO.LJIIIIZZ(header.LIZ, "manifest_version_code", Long.valueOf(c803540VfcLJIILL.LIZJ));
                    C0VJO.LJIIIIZZ(header.LIZ, "version_type", "crash_time");
                } else {
                    C0VJO.LJIIIIZZ(header.LIZ, "version_type", "app_info");
                }
            }
        }
        if (file != null) {
            JSONObject jSONObject5 = header.LIZ;
            String strLJFF2 = C2112008Pe.LJFF(new C0VSJ(file, "common_params.json"));
            if (strLJFF2 != null) {
                try {
                    C0VJO.LIZLLL(jSONObject5, new JSONObject(strLJFF2));
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
        }
        header.LIZLLL(j2, crashType, i, file);
        return header;
    }
}
