package com.lynx.tasm.core;

import X.C08RN;
import X.C0VSJ;
import X.C0VSP;
import X.C2188811AlT;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes14.dex */
public class ResourceLoader {
    private native void nativeConfigLynxResourceSetting();

    public static File LIZ(Context context) throws Throwable {
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

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00f2: MOVE (r8 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:16777458), block:B:36:0x00f2 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LIZIZ(java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.core.ResourceLoader.LIZIZ(java.lang.String):byte[]");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0131: MOVE (r6 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777521), block:B:60:0x0131 */
    private byte[] loadJSSource(String str) throws Throwable {
        InputStream inputStreamOpen;
        InputStream inputStream;
        C0VSJ c0vsj;
        InputStream inputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            LynxLog.w("ResourceLoader", "loadJSSource failed with empty name");
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadJSSource with name ");
        sbLIZ.append(str);
        LynxLog.i("ResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
        try {
            try {
                try {
                    if ("assets://lynx_core.js".equals(str) && LynxEnv.inst().isDevtoolEnabled()) {
                        try {
                            inputStreamOpen = LynxEnv.inst().getAppContext().getResources().getAssets().open("lynx_core_dev.js");
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            inputStreamOpen = null;
                        }
                        if (inputStreamOpen != null) {
                            try {
                                nativeConfigLynxResourceSetting();
                            } catch (IOException e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("loadJSSource ");
                                sbLIZ2.append(str);
                                sbLIZ2.append("with error message ");
                                sbLIZ2.append(e.getMessage());
                                LynxLog.e("ResourceLoader", C2188811AlT.LIZIZ(sbLIZ2));
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (IOException e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                }
                            }
                        }
                    } else {
                        inputStreamOpen = null;
                    }
                    if (inputStreamOpen == null) {
                        if (str.length() > 7 && str.startsWith("file://")) {
                            String strSubstring = str.substring(7);
                            if (strSubstring.startsWith("/")) {
                                c0vsj = new C0VSJ(strSubstring);
                            } else {
                                c0vsj = new C0VSJ(LIZ(LynxEnv.inst().getAppContext()), strSubstring);
                            }
                            inputStreamOpen = new C0VSP(c0vsj);
                        } else if (str.length() > 9 && str.startsWith("assets://")) {
                            inputStreamOpen = LynxEnv.inst().getAppContext().getResources().getAssets().open(str.substring(9));
                        } else if (str.startsWith("lynx_assets://")) {
                            return LIZIZ(str);
                        }
                    }
                    if (inputStreamOpen != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i != -1) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    inputStreamOpen.close();
                                    return byteArray;
                                } catch (IOException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    return byteArray;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    TryCatchGuardChecker.doCheck(th);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                            throw th;
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                inputStreamOpen = null;
            }
            LynxLog.e("ResourceLoader", "loadJSSource failed, can not load " + str);
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
