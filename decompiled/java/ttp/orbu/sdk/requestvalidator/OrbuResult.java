package ttp.orbu.sdk.requestvalidator;

import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public abstract class OrbuResult {
    public static final b Companion = new b();
    public final int code;
    public final String reason;

    public static final class a extends OrbuResult {
        public static final a a = new a();

        public a() {
            super(0, "");
        }
    }

    public static final class c extends OrbuResult {
        public static final c a = new c();

        public c() {
            super(2, "INVALID DATAFLOWID");
        }
    }

    public static final class d extends OrbuResult {
        public static final d a = new d();

        public d() {
            super(1, "REJECTED");
        }
    }

    public final int getCode() {
        return this.code;
    }

    public final String getReason() {
        return this.reason;
    }

    public static final class e extends OrbuResult {
        public e(int i) {
            super(i, "");
        }
    }

    public static final class b {
        public final OrbuResult a(String str, Integer num) {
            int iIntValue;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -934710369) {
                if (iHashCode != -793050291) {
                    if (iHashCode != 1337643805) {
                        if (iHashCode == 1595321386 && lowerCase.equals("invaliddataflowid")) {
                            return c.a;
                        }
                    } else if (lowerCase.equals("returncode")) {
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        return new e(iIntValue);
                    }
                } else if (lowerCase.equals("approve")) {
                    return a.a;
                }
            } else if (lowerCase.equals("reject")) {
                return d.a;
            }
            return d.a;
        }
    }

    public OrbuResult(int i, String str) {
        this.code = i;
        this.reason = str;
    }
}
