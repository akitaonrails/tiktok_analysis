package ttpobfuscated;

import X.C08RN;
import X.C095E;
import X.C095G;
import X.C09A1;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C0VSJ;
import X.C0VSV;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C786450Ut9;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 {
    public final File a;
    public final C095E<String> b = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final InterfaceC497601wk c = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public BufferedWriter d;

    public final void a() {
        try {
            try {
                BufferedWriter bufferedWriter = this.d;
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                }
                BufferedWriter bufferedWriter2 = this.d;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                this.d = null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                q3.a.getClass();
                q3.a.c.b("Exception while closing Writer: ", "FileLogger", e);
                this.d = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.d = null;
            throw th;
        }
    }

    public final void b() throws IOException {
        if (!this.a.exists()) {
            this.a.createNewFile();
        }
        this.d = new BufferedWriter(new OutputStreamWriter(new C0VSV(this.a, true), Charsets.UTF_8));
    }

    public final void c() {
        this.b.LJIIJJI(null);
        C2296808zG.LIZJ(this.c, null);
    }

    public final void d() {
        C23250099c.LIZLLL(this.c, null, null, new a(null), 3);
    }

    @C09DV(c = "ttp.orbu.sdk.filelogger.FileLogger$startWriterCoroutine$1", f = "FileLogger.kt", l = {88}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public Object b;
        public long c;
        public int d;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:6:0x001d). Please report as a decompilation issue!!! */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.x4.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return x4.this.new a(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return x4.this.new a(interfaceC1364105Vn);
        }
    }

    public x4(Context context) {
        this.a = new C0VSJ(INVOKEVIRTUAL_ttpobfuscated_x4_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "ttpSDKLogcat");
        d();
    }

    public static File INVOKEVIRTUAL_ttpobfuscated_x4_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    public final void a(int i) {
        if (!this.a.exists()) {
            return;
        }
        long j = i;
        if (this.a.length() + j <= 5242880) {
            return;
        }
        a();
        C0VSJ c0vsj = new C0VSJ(this.a.getParent(), this.a.getName() + ".temp");
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, "r");
        try {
            long length = randomAccessFile.length() - (5242880 - j);
            if (length < 0) {
                length = 0;
            }
            randomAccessFile.seek(length);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj));
            try {
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (true) {
                    int i2 = randomAccessFile.read(bArr);
                    if (i2 != -1) {
                        bufferedOutputStream.write(bArr, 0, i2);
                    } else {
                        C2107108Nh.LIZ(bufferedOutputStream, null);
                        C2107108Nh.LIZ(randomAccessFile, null);
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C2107108Nh.LIZ(randomAccessFile, th);
                throw th2;
            }
        }
    }

    public final void a(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(o3.a(System.currentTimeMillis()));
        sb.append(" ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append("\n");
        if (th != null) {
            sb.append(Log.getStackTraceString(th));
            sb.append("\n");
        }
        this.b.LJIIIIZZ(sb.toString());
    }

    public static /* synthetic */ void a(x4 x4Var, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        x4Var.a(str, str2, th);
    }
}
