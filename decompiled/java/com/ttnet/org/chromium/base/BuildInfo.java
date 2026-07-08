package com.ttnet.org.chromium.base;

import X.C08VH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787230UuP;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class BuildInfo {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final String LJI = "";
    public final String LJIIIZ = "";

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] getAll() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.BuildInfo.getAll():java.lang.String[]");
    }

    public BuildInfo() {
        String str = "";
        this.LIZ = "";
        this.LIZJ = "";
        this.LJ = "";
        this.LJFF = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIJ = "";
        try {
            Context context = C787230UuP.LIZ;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfoY3 = C786410Ut5.Y3(packageManager, packageName, 0);
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoY3.getLongVersionCode() : packageInfoY3.versionCode;
            this.LIZIZ = longVersionCode;
            this.LIZJ = packageName;
            this.LIZLLL = longVersionCode;
            String str2 = packageInfoY3.versionName;
            if (str2 == null) {
                str2 = "";
            } else {
                str2.toString();
            }
            this.LJ = str2;
            context.getApplicationInfo();
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfoY3.applicationInfo);
            this.LIZ = applicationLabel == null ? "" : applicationLabel.toString();
            String installerPackageName = packageManager.getInstallerPackageName(packageName);
            if (installerPackageName != null) {
                installerPackageName.toString();
                str = installerPackageName;
            }
            this.LJFF = str;
            this.LJIIJ = "Not Enabled";
            this.LJII = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            String str3 = Build.FINGERPRINT;
            this.LJIIIIZZ = str3.substring(0, Math.min(str3.length(), 128));
            UiModeManager uiModeManager = (UiModeManager) C786410Ut5.H2(context, "uimode");
            this.LJIIJJI = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            this.LJIIL = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NameNotFoundException: ");
            sbLIZ.append(e);
            C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
        }
    }
}
