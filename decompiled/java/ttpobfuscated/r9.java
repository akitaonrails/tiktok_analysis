package ttpobfuscated;

import X.C09AY;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller;

/* JADX INFO: loaded from: classes36.dex */
public class r9 extends s8 {

    public final class a extends C09AY implements Function0<Unit> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ String b;
        public final /* synthetic */ r9 c;
        public final /* synthetic */ String d;

        public final void a() {
            if (this.a != null) {
                String str = this.b;
                r9 r9Var = this.c;
                String str2 = this.d;
                if (str != null) {
                    TTPOrbuNetworkCaller.INSTANCE.logInNative(r9Var.a("Duration: " + ((long) ((System.nanoTime() - r2.longValue()) / 1000000.0d)) + " ms - " + str, str2));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l, String str, r9 r9Var, String str2) {
            super(0);
            this.a = l;
            this.b = str;
            this.c = r9Var;
            this.d = str2;
        }
    }

    public final class b extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ r9 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                r9 r9Var = this.b;
                String str2 = this.c;
                Throwable th = this.d;
                String strA = r9Var.a(str, str2);
                if (th != null) {
                    strA = strA + " with error: " + th.getMessage();
                }
                TTPOrbuNetworkCaller.INSTANCE.logInNative(strA);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, r9 r9Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = r9Var;
            this.c = str2;
            this.d = th;
        }
    }

    public final class c extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ r9 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                r9 r9Var = this.b;
                String str2 = this.c;
                Throwable th = this.d;
                String str3 = "Error: " + r9Var.a(str, str2);
                if (th != null) {
                    str3 = str3 + " with error: " + th.getMessage();
                }
                TTPOrbuNetworkCaller.INSTANCE.logInNative(str3);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, r9 r9Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = r9Var;
            this.c = str2;
            this.d = th;
        }
    }

    public final class d extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ r9 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                r9 r9Var = this.b;
                String str2 = this.c;
                Throwable th = this.d;
                String strA = r9Var.a(str, str2);
                if (th != null) {
                    strA = strA + " with error: " + th.getMessage();
                }
                TTPOrbuNetworkCaller.INSTANCE.logInNative(strA);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, r9 r9Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = r9Var;
            this.c = str2;
            this.d = th;
        }
    }

    public final class e extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ r9 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                r9 r9Var = this.b;
                String str2 = this.c;
                Throwable th = this.d;
                String str3 = "Warning: " + r9Var.a(str, str2);
                if (th != null) {
                    str3 = str3 + " with error: " + th.getMessage();
                }
                TTPOrbuNetworkCaller.INSTANCE.logInNative(str3);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, r9 r9Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = r9Var;
            this.c = str2;
            this.d = th;
        }
    }

    public r9() {
        INVOKESTATIC_ttpobfuscated_r9_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("orbuculum");
        TTPOrbuNetworkCaller.INSTANCE.setBuildType("release");
    }

    public static void INVOKESTATIC_ttpobfuscated_r9_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    @Override // ttpobfuscated.s8, ttpobfuscated.q3
    public void a(Long l, String str, String str2) {
        b(new a(l, str, this, str2));
    }

    @Override // ttpobfuscated.s8, ttpobfuscated.q3
    public void b(String str, String str2, Throwable th) {
        a(new c(str, this, str2, th));
    }

    @Override // ttpobfuscated.s8, ttpobfuscated.q3
    public void c(String str, String str2, Throwable th) {
        a(new e(str, this, str2, th));
    }

    @Override // ttpobfuscated.s8, ttpobfuscated.q3
    public void d(String str, String str2, Throwable th) {
        a(new b(str, this, str2, th));
    }

    @Override // ttpobfuscated.s8, ttpobfuscated.q3
    public void a(String str, String str2, Throwable th) {
        a(new d(str, this, str2, th));
    }
}
