package com.lynx.tasm.core.resource;

import X.AbstractC1299950jvt;
import X.AbstractC1299960jvu;
import X.AbstractC1300020jw0;
import X.C08RN;
import X.C1289810jfX;
import X.C1299310jur;
import X.C1299660jvQ;
import X.C1299730jvX;
import X.C1299790jvd;
import X.C1299810jvf;
import X.C1301600jyY;
import X.C1301610jyZ;
import X.C2188811AlT;
import X.C786450Ut9;
import X.EnumC1299880jvm;
import X.InterfaceC1290540jgi;
import X.InterfaceC1299780jvc;
import X.InterfaceC1299820jvg;
import Y.ARunnableS4S1101100_20;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.core.resource.LynxResourceLoader;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxResourceLoader {
    public final C1299310jur LIZ;
    public final C1299790jvd LIZIZ;
    public final C1299810jvf LIZJ;
    public final AbstractC1299960jvu LIZLLL;
    public final WeakReference<InterfaceC1299820jvg> LJ;
    public final C1289810jfX LJFF = new C1289810jfX();

    private native void nativeConfigLynxResourceSetting();

    public static native void nativeInvokeCallback(long j, byte[] bArr, long j2, ByteBuffer byteBuffer, int i, String str);

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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LJ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.core.resource.LynxResourceLoader.LJ(java.lang.String):byte[]");
    }

    public final AbstractC1300020jw0 LIZLLL(int i) {
        AbstractC1300020jw0 abstractC1300020jw0;
        String str;
        C1299310jur c1299310jur = this.LIZ;
        if (c1299310jur != null) {
            if (i != 7) {
                if (i != 9) {
                    str = "";
                } else {
                    str = "EXTERNAL_JS_SOURCE";
                }
            } else {
                str = "DYNAMIC_COMPONENT";
            }
            abstractC1300020jw0 = (AbstractC1300020jw0) ((HashMap) c1299310jur.LJ).get(str);
            if (abstractC1300020jw0 == null) {
            }
            return abstractC1300020jw0;
        }
        abstractC1300020jw0 = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx resource provider is null, type: ");
        sbLIZ.append(i);
        LynxLog.e("LynxResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
        return abstractC1300020jw0;
    }

    public final boolean LIZJ(long j, String str, EnumC1299880jvm enumC1299880jvm) {
        boolean z;
        if (this.LIZJ.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generic template fetcher existed: ");
        sbLIZ.append(z);
        LynxLog.i("LynxResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            return false;
        }
        final C1299730jvX c1299730jvX = new C1299730jvX(str, j, this.LJFF, enumC1299880jvm);
        this.LIZJ.LIZ.LIZIZ(new C1301600jyY(str, enumC1299880jvm), new InterfaceC1290540jgi<C1299660jvQ>() { // from class: X.0jvR
            @Override // X.InterfaceC1290540jgi
            public final void LIZ(C1289590jfB<C1299660jvQ> c1289590jfB) {
                byte[] bArr;
                TemplateBundle templateBundle;
                ByteBuffer byteBuffer;
                boolean z2;
                C1299660jvQ c1299660jvQ = c1289590jfB.LIZIZ;
                String message = null;
                if (c1299660jvQ != null) {
                    bArr = c1299660jvQ.LIZ;
                    byteBuffer = c1299660jvQ.LIZIZ;
                    templateBundle = c1299660jvQ.LIZJ;
                } else {
                    bArr = null;
                    templateBundle = null;
                    byteBuffer = null;
                }
                Throwable th = c1289590jfB.LIZJ;
                if (th != null) {
                    message = th.getMessage();
                }
                C1299730jvX c1299730jvX2 = c1299730jvX;
                if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1299730jvX2.LIZIZ(z2, bArr, templateBundle, byteBuffer, message);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0135 A[EDGE_INSN: B:116:0x0135->B:61:0x0135 BREAK  A[LOOP:0: B:58:0x012b->B:60:0x0131], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131 A[Catch: all -> 0x0152, LOOP:0: B:58:0x012b->B:60:0x0131, LOOP_END, TryCatch #0 {all -> 0x0152, blocks: (B:56:0x011f, B:57:0x0122, B:58:0x012b, B:60:0x0131, B:61:0x0135, B:39:0x00be, B:41:0x00c4, B:43:0x00cc, B:45:0x00d8, B:46:0x00dd, B:47:0x00e3, B:48:0x00f5, B:50:0x00fb, B:52:0x0103, B:65:0x0144, B:67:0x014c), top: B:103:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r17, final long r18, final java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.core.resource.LynxResourceLoader.LJFF(int, long, java.lang.String):void");
    }

    public void loadBytecode(final long j, final String str, int i) {
        if (i == 16) {
            AbstractC1299960jvu abstractC1299960jvu = this.LIZLLL;
            if (abstractC1299960jvu != null) {
                abstractC1299960jvu.LIZ(new C1301600jyY(str, EnumC1299880jvm.LynxResourceTypeExternalByteCode), new InterfaceC1290540jgi<byte[]>(str, j) { // from class: X.0jvW
                    public final C1299800jve LIZ;

                    @Override // X.InterfaceC1290540jgi
                    public final void LIZ(C1289590jfB<byte[]> c1289590jfB) {
                        boolean z;
                        String message;
                        int i2 = 0;
                        if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Throwable th = c1289590jfB.LIZJ;
                        C1299800jve c1299800jve = this.LIZ;
                        byte[] bArr = c1289590jfB.LIZIZ;
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = "";
                        }
                        if (c1299800jve.LIZ()) {
                            if (z) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("load resource success with url: ");
                                sbLIZ.append(c1299800jve.LIZIZ);
                                LynxLog.i("LynxResourceLoader", C2188811AlT.LIZIZ(sbLIZ));
                                if (bArr == null || bArr.length == 0) {
                                    message = "get null data for provider.";
                                    i2 = 30301;
                                }
                                LynxResourceLoader.LIZIZ(c1299800jve.LIZJ, i2, message, bArr);
                                return;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("load resource failed with url: ");
                            sbLIZ2.append(c1299800jve.LIZIZ);
                            sbLIZ2.append(" error message: ");
                            sbLIZ2.append(message);
                            LynxLog.i("LynxResourceLoader", C2188811AlT.LIZIZ(sbLIZ2));
                            long j2 = c1299800jve.LIZJ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(message);
                            sbLIZ3.append(": ");
                            sbLIZ3.append(message);
                            LynxResourceLoader.LIZIZ(j2, 30301, C2188811AlT.LIZIZ(sbLIZ3), null);
                        }
                    }

                    {
                        this.LIZ = new C1299800jve(str, j);
                    }
                });
            } else {
                LIZIZ(j, -1, "No available provider or fetcher.", null);
            }
        }
    }

    public static void LIZIZ(long j, int i, String str, byte[] bArr) {
        nativeInvokeCallback(j, bArr, 0L, null, i, str);
    }

    private void loadResource(long j, String str, int i, boolean z) {
        if (z) {
            LJFF(i, j, str);
            return;
        }
        try {
            C1301610jyZ.LIZIZ().execute(new ARunnableS4S1101100_20(this, j, str, i, 1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(j, -1, th.getMessage(), null);
        }
    }

    public LynxResourceLoader(C1299310jur c1299310jur, InterfaceC1299780jvc interfaceC1299780jvc, InterfaceC1299820jvg interfaceC1299820jvg, AbstractC1299950jvt abstractC1299950jvt, AbstractC1299960jvu abstractC1299960jvu) {
        this.LIZ = c1299310jur;
        this.LIZIZ = new C1299790jvd(interfaceC1299780jvc);
        this.LJ = new WeakReference<>(interfaceC1299820jvg);
        this.LIZJ = new C1299810jvf(abstractC1299950jvt);
        this.LIZLLL = abstractC1299960jvu;
    }
}
