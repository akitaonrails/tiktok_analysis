package ttpobfuscated;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface p8 {
    s7 a(List<String> list, Map<String, ? extends Object> map);

    public static abstract class a extends r4 {

        /* JADX INFO: renamed from: ttpobfuscated.p8$a$a, reason: collision with other inner class name */
        public static final class C0065a extends a {
            public C0065a(Throwable th) {
                super(th);
            }
        }

        public a(Throwable th) {
            super(th.getMessage());
        }
    }
}
