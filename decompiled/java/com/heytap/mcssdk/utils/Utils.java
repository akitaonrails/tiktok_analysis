package com.heytap.mcssdk.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.PushService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes14.dex */
public class Utils {
    public static String getString(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append((char) i);
        }
        return sb.toString();
    }

    public static int getVersionCode(Context context) {
        int i = 0;
        try {
            i = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getVersionCode--Exception:");
            sbLIZ.append(e.getMessage());
            e.b(C2188811AlT.LIZIZ(sbLIZ));
            return i;
        }
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return C786410Ut5.Y3(context.getPackageManager(), str, 0).versionCode;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getVersionCode--Exception:");
            sbLIZ.append(e.getMessage());
            e.b(C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
    }

    public static String getVersionName(Context context) {
        try {
            return C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getVersionName--Exception:");
            sbLIZ.append(e.getMessage());
            e.b(C2188811AlT.LIZIZ(sbLIZ));
            return CardStruct.IStatusCode.DEFAULT;
        }
    }

    public static String getVersionName(Context context, String str) {
        try {
            return C786410Ut5.Y3(context.getPackageManager(), str, 0).versionName;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getVersionName--Exception:");
            sbLIZ.append(e.getMessage());
            e.b(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static boolean isExistPackage(Context context, String str) {
        try {
            C786410Ut5.Y3(context.getPackageManager(), str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isExistPackage NameNotFoundException:");
            sbLIZ.append(e.getMessage());
            e.e(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static boolean isSupportPush(Context context, String str, String str2) {
        StringBuilder sbLIZ;
        String message;
        Bundle bundle;
        try {
            ApplicationInfo applicationInfoV3 = C786410Ut5.V3(context.getPackageManager(), str, 128);
            if (applicationInfoV3 == null || (bundle = applicationInfoV3.metaData) == null) {
                return false;
            }
            return bundle.getBoolean(str2, false);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSupportPush NameNotFoundException:");
            message = e.getMessage();
            sbLIZ.append(message);
            e.e(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSupportPush Exception:");
            message = e2.getMessage();
            sbLIZ.append(message);
            e.e(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public static int parseInt(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            e.e("parseInt--NumberFormatException" + e.getMessage());
            return -1;
        }
    }

    public static boolean isSupportPushByClient(Context context) {
        return PushService.a.a.isSupportPushByClient(context);
    }
}
