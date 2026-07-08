package oo5;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1738850vLn;
import X.C2188811AlT;
import X.EnumC1738800vLi;
import X.InterfaceC1738830vLl;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import co5.g;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import go5.d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import oo5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class b implements eo5.b {
    public static d LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static boolean LJI;
    public static eo5.b LJII;
    public static co5.d LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static int LJIIL;
    public static boolean LJIILIIL;
    public static String LJIILLIIL;
    public static int LJIJ;
    public static long LJIJI;
    public static final b LJIJJLI = new b();
    public static String LJIILJJIL = "pitaya";
    public static String LJIILL = "pitaya";
    public static boolean LJIIZILJ = true;
    public static String LJIJJ = "";

    public static C1738850vLn LIZJ() {
        String str;
        C1738850vLn c1738850vLn = new C1738850vLn(LIZLLL, LJ, LJIJJ);
        TimeZone timeZone = TimeZone.getTimeZone("gmt");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        c1738850vLn.LIZIZ = simpleDateFormat.format(new Date());
        c1738850vLn.LIZ = LIZJ;
        String str2 = LJFF;
        if (str2 != null && str2.length() != 0 && System.currentTimeMillis() - LJIJI < 86400000 && (str = LJFF) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c1738850vLn.LIZJ);
            linkedHashMap.put("pipo-fp-session-id", str);
            c1738850vLn.LIZJ = linkedHashMap;
        }
        return c1738850vLn;
    }

    public static d LIZLLL() {
        if (LIZIZ) {
            return LIZ;
        }
        throw new IllegalArgumentException("please init first");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[PHI: r1
      0x0057: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v9 java.lang.String) binds: [B:17:0x0054, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r1
      0x0015: PHI (r1v9 java.lang.String) = (r1v0 java.lang.String), (r1v10 java.lang.String) binds: [B:17:0x0054, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL() {
        /*
            r0 = 1010050(0xf6982, double:4.99031E-318)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            yo5.a$a r4 = new yo5.a$a
            go5.d r0 = oo5.b.LIZ
            yo5.a$a r0 = r0.LJIIJJI
            java.lang.String r3 = ""
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.LIZ
            if (r1 == 0) goto L53
        L15:
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L57
        L19:
            r4.<init>(r1, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = "sdk_aid"
            java.lang.String r0 = "460479"
            r2.put(r1, r0)
            java.lang.String r0 = "sdk_version"
            r2.put(r0, r5)
            java.lang.String r1 = r4.LIZ
            if (r1 != 0) goto L32
            r1 = r3
        L32:
            java.lang.String r0 = "app_version"
            r2.put(r0, r1)
            java.lang.String r0 = r4.LIZIZ
            if (r0 == 0) goto L3c
            r3 = r0
        L3c:
            java.lang.String r0 = "update_version_code"
            r2.put(r0, r3)
            java.lang.String r1 = "os_version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r2.put(r1, r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r0 = "sdk_session_launch"
            com.ss.android.common.lib.AppLogNewUtils.onEventV3(r0, r1)
            return
        L53:
            r1 = r3
            if (r0 == 0) goto L57
            goto L15
        L57:
            r0 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: oo5.b.LJIIL():void");
    }

    public static String LJ(int i) {
        if (i == EnumC1738800vLi.Default.getValue()) {
            return "server";
        }
        return "pitaya";
    }

    public static void LIZIZ(Application application, Intent intent) throws Throwable {
        Intent intent2 = intent;
        ContextWrapper contextWrapper = application;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextWrapper, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, contextWrapper);
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMyKARBxRzjCMDbyrLkNUV6xYe3yTxj", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11090, "android/app/Application", "startActivity", contextWrapper, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11090, "android/app/Application", "startActivity", null, objArr, contextWrapper, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                contextWrapper = (ContextWrapper) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        contextWrapper.startActivity(intent2);
        c0wst.LIZ(11090, "android/app/Application", "startActivity", null, objArr, contextWrapper, c0wzw, true);
    }

    public static void LJFF(Bitmap bitmap, final eo5.b bVar) {
        int i = LJIJ + 1;
        LJIJ = i;
        InterfaceC1738830vLl interfaceC1738830vLl = LIZ.LJIIJ;
        if (interfaceC1738830vLl != null && i < 16) {
            interfaceC1738830vLl.LIZ(LJIIL, new eo5.b() { // from class: X.0vLj
                @Override // eo5.b
                public final void LIZ(int i2, int i3, String str, g gVar, String str2) {
                    String str3;
                    if (b.LJIIZILJ) {
                        if (i2 != -1) {
                            str3 = "pitaya";
                        } else {
                            str3 = "server";
                        }
                        b.LJIILL = str3;
                        b.LJIIZILJ = false;
                    }
                    if (i2 == 1) {
                        b.LJIILLIIL = "pitaya";
                    }
                    bVar.LIZ(i2, i3, str, gVar, str2);
                }
            }, bitmap);
        } else {
            bVar.LIZ(-1, -1, "needs to be uploaded", new g(bitmap, 510), "video");
        }
    }

    public static void LJIILIIL(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("merchant_user_id", LIZLLL);
            jSONObject.put("merchant_id", LIZJ);
            jSONObject.put("product_type", "instant_payment");
            jSONObject.put("sdk_version", String.valueOf(1010050L));
            LIZ.LIZJ.onEventV3(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to send event: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIIIZZ(long j, long j2, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", "info_confirm_ocr");
        jSONObject.put("obj_id", str);
        jSONObject.put("click_timestamp", j);
        jSONObject.put("finish_timestamp", j2);
        jSONObject.put("duration", j2 - j);
        LJIJJLI.getClass();
        jSONObject.put("ocr_mode", LJ(LJIIL));
        LJIILIIL("fp_sdk_checkout_ocr_fillin", jSONObject);
    }

    public static void LJIIIZ(long j, long j2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", str);
        jSONObject.put("render_cost", j2 - j);
        jSONObject.put("timestamp", j2);
        LJIJJLI.getClass();
        jSONObject.put("ocr_mode", LJ(LJIIL));
        LJIILIIL("fp_sdk_checkout_ocr_show", jSONObject);
    }

    public static void LJIIJ(long j, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", "payin_checkout_ocr");
        jSONObject.put("obj_id", str);
        jSONObject.put("popup_id", str2);
        jSONObject.put("timestamp", j);
        LJIJJLI.getClass();
        jSONObject.put("ocr_mode", LJ(LJIIL));
        LJIILIIL("fp_sdk_checkout_popup_click", jSONObject);
    }

    public static void LJIIJJI(long j, String str, List list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", "payin_checkout_ocr");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i2);
                sbLIZ.append(", ");
                sbLIZ.append((String) obj);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "; ", null, null, 0, null, null, 62);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("{ ");
        sbLIZ2.append(strLJJLIIIJ);
        sbLIZ2.append(" }");
        jSONObject.put("obj_id", C2188811AlT.LIZIZ(sbLIZ2));
        jSONObject.put("popup_id", str);
        jSONObject.put("timestamp", j);
        LJIJJLI.getClass();
        jSONObject.put("ocr_mode", LJ(LJIIL));
        LJIILIIL("fp_sdk_checkout_popup_show", jSONObject);
    }

    public static void LJI(long j, long j2, long j3, long j4, String str) {
        String str2;
        int i = LJIIL;
        if (i == EnumC1738800vLi.Default.getValue()) {
            str2 = "server";
        } else if (i != EnumC1738800vLi.DetectAndRecognize.getValue() && i != EnumC1738800vLi.NativeRecognizeInner.getValue() && i != EnumC1738800vLi.NativeRecognize.getValue()) {
            str2 = "";
        } else {
            str2 = "pitaya";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", str);
        jSONObject.put("duration", j);
        jSONObject.put("recognize_type", str2);
        jSONObject.put("start_time", j2);
        jSONObject.put("finish_time", j3);
        jSONObject.put("start_back_up_server_timestamps", j4);
        LJIILIIL("rd_pipo_ocr_finish_album_recognize", jSONObject);
    }

    @Override // eo5.b
    public final void LIZ(int i, int i2, String str, g gVar, String str2) {
        String str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onOcrResult] code:");
        sbLIZ.append(i);
        sbLIZ.append(" detailCode:");
        sbLIZ.append(i2);
        sbLIZ.append(" msg:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (gVar != null) {
            str3 = gVar.LIZLLL;
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0) {
            LJIILIIL = true;
        }
        eo5.b bVar = LJII;
        if (bVar != null) {
            bVar.LIZ(i, i2, str, gVar, str2);
        }
        LJII = null;
        LJI = false;
        LJ = "";
    }

    public static void LJII(b bVar, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", str);
        jSONObject.put("obj_id", str2);
        jSONObject.put("timestamp", System.currentTimeMillis());
        if (str3 != null && str3.length() != 0) {
            jSONObject.put("is_edit_ocr_card_no", str3);
        }
        if (str4 != null && str4.length() != 0) {
            jSONObject.put("is_edit_ocr_expiration_date", str4);
        }
        if (str5 != null && str5.length() != 0) {
            jSONObject.put("is_edit_ocr_card_holdername", str5);
        }
        LJIJJLI.getClass();
        jSONObject.put("ocr_mode", LJ(LJIIL));
        LJIILIIL("fp_sdk_checkout_ocr_click", jSONObject);
    }
}
