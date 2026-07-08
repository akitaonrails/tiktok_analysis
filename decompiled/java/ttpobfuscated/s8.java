package ttpobfuscated;

import X.C09AY;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes36.dex */
public class s8 implements q3 {
    public final String b = "ttp-log";
    public final String c = "ttp-log-perf";
    public x4 d;

    public final class a extends C09AY implements Function0<Unit> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ String b;
        public final /* synthetic */ s8 c;
        public final /* synthetic */ String d;

        public final void a() {
            if (this.a != null) {
                String str = this.b;
                s8 s8Var = this.c;
                String str2 = this.d;
                if (str != null) {
                    s8Var.a("Duration: " + ((long) ((System.nanoTime() - r2.longValue()) / 1000000.0d)) + " ms - " + str, str2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l, String str, s8 s8Var, String str2) {
            super(0);
            this.a = l;
            this.b = str;
            this.c = s8Var;
            this.d = str2;
        }
    }

    public final class b extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ s8 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                this.b.a(str, this.c);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, s8 s8Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = s8Var;
            this.c = str2;
            this.d = th;
        }
    }

    public final class c extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ s8 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                this.b.a(str, this.c);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, s8 s8Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = s8Var;
            this.c = str2;
            this.d = th;
        }
    }

    public final class d extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ s8 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                this.b.a(str, this.c);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, s8 s8Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = s8Var;
            this.c = str2;
            this.d = th;
        }
    }

    public final class e extends C09AY implements Function0<Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ s8 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        public final void a() {
            String str = this.a;
            if (str != null) {
                this.b.a(str, this.c);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, s8 s8Var, String str2, Throwable th) {
            super(0);
            this.a = str;
            this.b = s8Var;
            this.c = str2;
            this.d = th;
        }
    }

    public final x4 a() {
        return null;
    }

    public void a(Function0<Unit> function0) {
    }

    public final String b() {
        return this.b;
    }

    public final void b(Function0<Unit> function0) {
        q3.a.getClass();
        if (q3.a.d) {
            function0.invoke();
        }
    }

    public final String a(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            str2 = str2.concat(": ");
        }
        return str2 + str;
    }

    @Override // ttpobfuscated.q3
    public void a(Long l, String str, String str2) {
        b(new a(l, str, this, str2));
    }

    @Override // ttpobfuscated.q3
    public void b(String str, String str2, Throwable th) {
        a(new c(str, this, str2, th));
    }

    @Override // ttpobfuscated.q3
    public void c(String str, String str2, Throwable th) {
        a(new e(str, this, str2, th));
    }

    @Override // ttpobfuscated.q3
    public void d(String str, String str2, Throwable th) {
        a(new b(str, this, str2, th));
    }

    @Override // ttpobfuscated.q3
    public void a(String str, String str2, Throwable th) {
        a(new d(str, this, str2, th));
    }
}
