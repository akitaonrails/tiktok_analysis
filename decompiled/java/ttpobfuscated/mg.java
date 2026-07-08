package ttpobfuscated;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public interface mg {
    public static final a a = a.a;

    boolean a();

    String b();

    String c();

    long d();

    String getName();

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final mg a(String str) {
            if (Build.VERSION.SDK_INT >= 26) {
                return new q9(str);
            }
            return new m7(str);
        }
    }
}
