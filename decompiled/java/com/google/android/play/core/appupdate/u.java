package com.google.android.play.core.appupdate;

import X.C2461909kn;
import X.C2462009ko;
import X.C2462109kp;
import X.C2465209lK;
import X.C786410Ut5;
import X.C835460Wq0;
import X.C835510Wq5;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class u {
    public static final C2461909kn LJ = new C2461909kn("AppUpdateService");
    public static final Intent LJFF = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final C2465209lK LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public final w LIZLLL;

    public static Bundle LIZIZ() {
        Map map;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        synchronized (C2462109kp.class) {
            Map map2 = C2462109kp.LIZ;
            if (!((HashMap) map2).containsKey("app_update")) {
                HashMap map3 = new HashMap();
                map3.put("java", 11004);
                ((HashMap) map2).put("app_update", map3);
            }
            map = (Map) ((HashMap) map2).get("app_update");
        }
        bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        C786410Ut5.LJJIIJZLJL(bundle, bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    public static C835510Wq5 LIZJ() {
        C2461909kn c2461909kn = LJ;
        Object[] objArr = {-9};
        if (Log.isLoggable("PlayCore", 6)) {
            C2461909kn.LIZLLL(c2461909kn.LIZ, "onError(%d)", objArr);
        } else {
            c2461909kn.getClass();
        }
        return C835460Wq0.LIZLLL(new com.google.android.play.core.install.a(-9));
    }

    public u(Context context, w wVar) {
        int length;
        String strEncodeToString;
        this.LIZIZ = context.getPackageName();
        this.LIZJ = context;
        this.LIZLLL = wVar;
        try {
            if (C786410Ut5.V3(context.getPackageManager(), "com.android.vending", 0).enabled) {
                Signature[] signatureArr = C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 64).signatures;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
                    int i = 0;
                    do {
                        byte[] byteArray = signatureArr[i].toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException e) {
                            TryCatchGuardChecker.doCheck(e);
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString) && ((!Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString))) {
                            i++;
                        } else {
                            Context contextN3 = C786410Ut5.N3(context);
                            this.LIZ = new C2465209lK(contextN3 != null ? contextN3 : context, LJ, LJFF);
                            return;
                        }
                    } while (i < length);
                    return;
                }
                C2461909kn c2461909kn = C2462009ko.LIZ;
                Object[] objArr = new Object[0];
                if (Log.isLoggable("PlayCore", 5)) {
                    C2461909kn.LIZLLL(c2461909kn.LIZ, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                } else {
                    c2461909kn.getClass();
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static Bundle LIZ(u uVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIIJZLJL(bundle, LIZIZ());
        C786410Ut5.LJJJI("package.name", str, bundle);
        try {
            numValueOf = Integer.valueOf(C786410Ut5.Y3(uVar.LIZJ.getPackageManager(), uVar.LIZJ.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C2461909kn c2461909kn = LJ;
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                C2461909kn.LIZLLL(c2461909kn.LIZ, "The current version of the app could not be retrieved", objArr);
            } else {
                c2461909kn.getClass();
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }
}
