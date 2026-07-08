package ttpobfuscated;

import X.C0X0W;
import X.C0X33;
import X.C0XLP;
import X.C0XLQ;
import X.C0XLY;
import kotlin.jvm.functions.Function0;
import okhttp3.Request;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class p1 extends gg {
    public final String a;
    public final Function0<String> b;
    public final String c;
    public final String d;

    public final String a() {
        ua.a.b().e().getClass();
        new y5();
        return String.valueOf(y5.b.getVersion());
    }

    @Override // ttpobfuscated.gg
    public C0XLY a(C0X0W c0x0w) {
        Request request = c0x0w.request();
        C0XLP c0xlpLJIIJ = request.url().LJIIJ();
        c0xlpLJIIJ.LIZJ("app_version", this.a);
        c0xlpLJIIJ.LIZJ("platform", "android");
        c0xlpLJIIJ.LIZJ("os_version", this.c);
        c0xlpLJIIJ.LIZJ("ttp_version", this.d);
        c0xlpLJIIJ.LIZJ("current_version", a());
        String strInvoke = this.b.invoke();
        if (strInvoke != null && (!kotlin.text.a0.LJJJIL(strInvoke))) {
            c0xlpLJIIJ.LIZJ("experiment_group", kotlin.text.a0.LJLIIIL(strInvoke).toString());
        }
        C0XLQ c0xlqLIZLLL = c0xlpLJIIJ.LIZLLL();
        C0X33 c0x33NewBuilder = request.newBuilder();
        c0x33NewBuilder.LJIIIIZZ(c0xlqLIZLLL);
        Request requestLIZIZ = c0x33NewBuilder.LIZIZ();
        q3.b.a(q3.a, "ServerConfigInterceptor - request: " + requestLIZIZ, (String) null, (Throwable) null, 6, (Object) null);
        return c0x0w.LIZ(requestLIZIZ);
    }

    public p1(String str, Function0<String> function0, String str2, String str3) {
        this.a = str;
        this.b = function0;
        this.c = str2;
        this.d = str3;
    }
}
