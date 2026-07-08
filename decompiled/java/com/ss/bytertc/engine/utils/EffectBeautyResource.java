package com.ss.bytertc.engine.utils;

import X.C08RN;
import X.C0VSJ;
import X.C0VSV;
import X.C2188811AlT;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class EffectBeautyResource {
    public static String GetEffectComposeMakeupPath() {
        Context applicationContext = ContextUtils.getApplicationContext();
        C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_ss_bytertc_engine_utils_EffectBeautyResource_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(applicationContext), "basic_beauty");
        copyAssetFolder(applicationContext, "basic_beauty", c0vsj.getAbsolutePath());
        return c0vsj.getAbsolutePath();
    }

    public static File INVOKEVIRTUAL_com_ss_bytertc_engine_utils_EffectBeautyResource_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static boolean copyAssetFile(Context context, String str, String str2) {
        try {
            C0VSJ c0vsj = new C0VSJ(str2);
            if (c0vsj.exists()) {
                return true;
            }
            InputStream inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen == null) {
                return false;
            }
            C0VSV c0vsv = new C0VSV(c0vsj);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i != -1) {
                    c0vsv.write(bArr, 0, i);
                } else {
                    inputStreamOpen.close();
                    c0vsv.close();
                    return true;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean copyAssetFolder(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list == null) {
                return false;
            }
            if (list.length == 0) {
                return copyAssetFile(context, str, str2);
            }
            boolean zMkdirs = new C0VSJ(str2).mkdirs();
            for (String str3 : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                String str4 = File.separator;
                sbLIZ.append(str4);
                sbLIZ.append(str3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(str4);
                sbLIZ2.append(str3);
                zMkdirs &= copyAssetFolder(context, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return zMkdirs;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
