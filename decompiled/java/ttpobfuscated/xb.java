package ttpobfuscated;

import X.C08FF;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public enum xb {
    us,
    nonUs,
    migrated;

    public static final a a = new a();

    public static final /* synthetic */ xb[] a() {
        return new xb[]{us, nonUs, migrated};
    }

    public static final class a {
        public final xb a(String str) {
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            if (Intrinsics.LJFF(lowerCase, "us".toLowerCase(locale))) {
                return xb.us;
            }
            if (Intrinsics.LJFF(lowerCase, "nonUs".toLowerCase(locale))) {
                return xb.nonUs;
            }
            if (Intrinsics.LJFF(lowerCase, "migrated".toLowerCase(locale))) {
                return xb.migrated;
            }
            return null;
        }
    }

    public static xb valueOf(String str) {
        return (xb) C08FF.LIZ(xb.class, str);
    }
}
