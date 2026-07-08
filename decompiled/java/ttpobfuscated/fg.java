package ttpobfuscated;

import java.util.Date;
import java.util.UUID;
import ttpobfuscated.b2;

/* JADX INFO: loaded from: classes24.dex */
public interface fg<T extends b2> {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    UUID a();

    String b();

    zb c();

    String d();

    T e();

    String f();

    String g();

    Date h();

    public static final class b {
        public static <T extends b2> String c(fg<T> fgVar) {
            return "android";
        }

        public static <T extends b2> String a(fg<T> fgVar) {
            return fgVar.e().b();
        }

        public static <T extends b2> String b(fg<T> fgVar) {
            return fgVar.e().a();
        }
    }
}
