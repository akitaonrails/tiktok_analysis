package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1602860roS;
import X.C2188811AlT;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class InitFacebookAdsTask implements C0CCZ, InterfaceC799590VYf {
    public boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitFacebookAdsTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        C1602860roS.LIZ.getClass();
        return C1602860roS.LJ() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    public static String LJ(String str) {
        if (Intrinsics.LJFF(str, "442045605112854")) {
            return "6aca615dce62457a701f54c27ac5dbdfe19f679b92574f36adbb3a5ca0e4a8a9";
        }
        if (Intrinsics.LJFF(str, "1144383419389381")) {
            return "265878b74c34bfdb77c140eaccdf6fe0e44c87510cffb2016bacccb5471ac3ac";
        }
        return "100555c36740ca167076b0e7034cbc2de901a1c0283a4f1dee647ed6a20e483b";
    }

    public static Uri[] LJFF(Context context) {
        String str;
        Uri[] uriArr = new Uri[2];
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        if (i != 1180) {
            if (i != 1233) {
                str = null;
            } else {
                str = "1144383419389381";
            }
        } else {
            str = "442045605112854";
        }
        if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("content://com.facebook.katana.provider.InstallReferrerProvider/");
            sbLIZ.append("597615686992125");
            uriArr[0] = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
            if (str != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("content://com.facebook.katana.provider.InstallReferrerProvider/");
                sbLIZ2.append(str);
                uriArr[1] = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2));
            }
            return uriArr;
        }
        if (context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("content://com.instagram.contentprovider.InstallReferrerProvider/");
            sbLIZ3.append("597615686992125");
            uriArr[0] = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3));
            if (str != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("content://com.instagram.contentprovider.InstallReferrerProvider/");
                sbLIZ4.append(str);
                uriArr[1] = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        return uriArr;
    }

    public static byte[] LJIIIIZZ(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static Map LJIIIZ(String str) {
        HashMap map = new HashMap();
        for (String str2 : a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6)) {
            if (a0.LJJIIZI(str2, "=", false)) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{"="}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() > 1) {
                    map.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                }
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.InitFacebookAdsTask.run(android.content.Context):void");
    }

    public static String LIZ(String str, String str2, String str3) {
        try {
            byte[] bArrLJIIIIZZ = LJIIIIZZ(str);
            byte[] bArrLJIIIIZZ2 = LJIIIIZZ(str2);
            byte[] bArrLJIIIIZZ3 = LJIIIIZZ(str3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrLJIIIIZZ, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArrLJIIIIZZ3));
            return new String(cipher.doFinal(bArrLJIIIIZZ2), StandardCharsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
