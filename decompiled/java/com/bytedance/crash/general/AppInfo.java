package com.bytedance.crash.general;

import X.AnonymousClass0825;
import X.C0VJB;
import X.C0VJL;
import X.C0VJO;
import X.C0VSJ;
import X.C2188811AlT;
import X.C2405009bc;
import X.C786410Ut5;
import Y.AComparatorS32S0000000_13;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AppInfo implements Serializable {
    public static final long serialVersionUID = 1;
    public Map<String, Object> mAppExtension;
    public int mAppVersionCode;
    public String mAppVersionName;
    public String mBitWide;
    public String mDisplayName;
    public long mLastUpdateTime;
    public String mNpthBytraceId;
    public int mNpthVersionCode;
    public String mNpthVersionName;
    public String mPackageName;
    public String mReleaseBuild;

    public static void clear(File file) {
        File[] sortedFilesArray = getSortedFilesArray(file);
        if (sortedFilesArray != null) {
            if (sortedFilesArray.length > 3) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (int i = 3; i < sortedFilesArray.length; i++) {
                    long lastUpdateTime = getLastUpdateTime(sortedFilesArray[i]);
                    if (lastUpdateTime < 0 || jCurrentTimeMillis - lastUpdateTime > 1209600000) {
                        sortedFilesArray[i].delete();
                    }
                }
            }
        }
    }

    public static long getLastUpdateTime(File file) {
        try {
            return CastLongProtector.parseLong(file.getName().substring(0, r2.length() - 4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    public static File[] getSortedFilesArray(File file) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: X.0VfE
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".aif");
            }
        });
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, new AComparatorS32S0000000_13(5));
        }
        return fileArrListFiles;
    }

    public void putTo(JSONObject jSONObject) {
        C0VJO.LJIIIIZZ(jSONObject, "package", this.mPackageName);
        C0VJO.LJIIIIZZ(jSONObject, "display_name", this.mDisplayName);
        C0VJO.LJIIIIZZ(jSONObject, "app_version", this.mAppVersionName);
        C0VJO.LJIIIIZZ(jSONObject, "version_code", Integer.valueOf(this.mAppVersionCode));
        C0VJO.LJIIIIZZ(jSONObject, "verify_info", this.mBitWide);
        C0VJO.LJIIIIZZ(jSONObject, "release_build", this.mReleaseBuild);
        C0VJO.LJIIIIZZ(jSONObject, "bytrace_id", this.mNpthBytraceId);
        C0VJO.LJIIIIZZ(jSONObject, "sdk_version", Integer.valueOf(this.mNpthVersionCode));
        C0VJO.LJIIIIZZ(jSONObject, "sdk_version_name", this.mNpthVersionName);
        C0VJO.LJIIIIZZ(jSONObject, "last_update_time", Long.valueOf(this.mLastUpdateTime));
        Map<String, Object> map = this.mAppExtension;
        if (map != null) {
            for (String str : map.keySet()) {
                C0VJO.LJIIIIZZ(jSONObject, str, this.mAppExtension.get(str));
            }
        }
    }

    public static AppInfo findAppInfo(File file, long j) {
        AppInfo appInfo;
        File[] sortedFilesArray = getSortedFilesArray(file);
        if (sortedFilesArray != null) {
            for (File file2 : sortedFilesArray) {
                try {
                    appInfo = (AppInfo) C0VJB.LIZ(file2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (appInfo != null && j > appInfo.mLastUpdateTime) {
                    return appInfo;
                }
            }
            return null;
        }
        return null;
    }

    public static synchronized AppInfo get(Context context, File file) {
        C0VSJ c0vsj;
        PackageInfo packageInfoY3;
        String str;
        int i;
        String packageName = context.getPackageName();
        try {
            packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), packageName, 0);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(packageInfoY3.lastUpdateTime);
                sbLIZ.append(".aif");
                c0vsj = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
                try {
                    AppInfo appInfo = (AppInfo) C0VJB.LIZ(c0vsj);
                    if (appInfo != null) {
                        return appInfo;
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                th = th2;
                c0vsj = null;
            }
        } catch (Throwable th3) {
            th = th3;
            c0vsj = null;
            packageInfoY3 = null;
        }
        AppInfo appInfo2 = new AppInfo();
        appInfo2.mPackageName = packageName;
        if (NativeBridge.LJJIJIIJI()) {
            str = "64";
        } else {
            str = "32";
        }
        appInfo2.mBitWide = str;
        appInfo2.mReleaseBuild = C2405009bc.LIZ();
        appInfo2.mNpthVersionCode = 40201164;
        appInfo2.mNpthVersionName = AnonymousClass0825.LIZ;
        appInfo2.mNpthBytraceId = C0VJL.LIZIZ().LIZLLL;
        if (C2405009bc.LIZIZ == null) {
            C2405009bc.LIZIZ = new C2405009bc();
        }
        appInfo2.mAppExtension = C2405009bc.LIZIZ.LIZ;
        if (packageInfoY3 != null) {
            appInfo2.mLastUpdateTime = packageInfoY3.lastUpdateTime;
            appInfo2.mAppVersionCode = packageInfoY3.versionCode;
            appInfo2.mAppVersionName = packageInfoY3.versionName;
            ApplicationInfo applicationInfo = packageInfoY3.applicationInfo;
            if (applicationInfo != null && (i = applicationInfo.labelRes) > 0) {
                appInfo2.mDisplayName = context.getString(i);
            }
        }
        if (c0vsj != null) {
            clear(file);
            C0VJB.LIZIZ(c0vsj, appInfo2);
        }
        return appInfo2;
    }
}
