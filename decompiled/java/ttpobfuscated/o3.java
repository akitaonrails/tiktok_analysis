package ttpobfuscated;

import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C189200o6;
import X.C452501pT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 {
    public static final C01GW e = C452501pT.LIZIZ(a.a);
    public static final C01GW f = C452501pT.LIZIZ(b.a);
    public static final Object g = new Object();

    public static final class a extends C09AY implements Function0<Regex> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final Regex a() {
            return new Regex("(\\d\\d):(\\d\\d)$");
        }

        @Override // kotlin.jvm.functions.Function0
        public Regex invoke() {
            return new Regex("(\\d\\d):(\\d\\d)$");
        }
    }

    public static final class b extends C09AY implements Function0<Regex> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        public final Regex a() {
            return new Regex("(\\d\\d)(\\d\\d)$");
        }

        @Override // kotlin.jvm.functions.Function0
        public Regex invoke() {
            return new Regex("(\\d\\d)(\\d\\d)$");
        }
    }

    public static final String a() {
        return c(new Date(), null, null, 3, null);
    }

    public static final Regex b() {
        return (Regex) e.getValue();
    }

    public static final Regex c() {
        return (Regex) f.getValue();
    }

    public static final Long a(String str) {
        Date dateB = b(str, null, 1, null);
        if (dateB == null) {
            return null;
        }
        return Long.valueOf(dateB.getTime());
    }

    public static final String b(String str) {
        return ((Regex) f.getValue()).replace(str, "$1:$2");
    }

    public static final String a(long j) {
        return c(new Date(j), null, null, 3, null);
    }

    public static final Date a(String str, Locale locale) {
        String str2;
        int length = kotlin.text.a0.LJLIIIL(str).toString().length();
        if (length != 8) {
            if (length == 14) {
                str2 = "yyyyMMddHHmmss";
            } else {
                throw new IllegalArgumentException("Invalid stringDate argument");
            }
        } else {
            str2 = "yyyyMMdd";
        }
        return new SimpleDateFormat(str2, locale).parse(str);
    }

    public static final Date b(String str, Locale locale) {
        Date date;
        synchronized (g) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", locale);
                try {
                    date = simpleDateFormat.parse(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return simpleDateFormat.parse(((Regex) e.getValue()).replace(str, "$1$2"));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return date;
    }

    public static final void a(SimpleDateFormat simpleDateFormat, TimeZone timeZone) {
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
    }

    public static final String a(Date date, TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    public static final String b(Date date, TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH", locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    public static final String c(Date date, TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return b(simpleDateFormat.format(date));
    }

    public static /* synthetic */ Date a(String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.US;
        }
        return a(str, locale);
    }

    public static /* synthetic */ Date b(String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.US;
        }
        return b(str, locale);
    }

    public static /* synthetic */ String a(Date date, TimeZone timeZone, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = null;
        }
        if ((i & 2) != 0) {
            locale = Locale.US;
        }
        return a(date, timeZone, locale);
    }

    public static /* synthetic */ String b(Date date, TimeZone timeZone, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = null;
        }
        if ((i & 2) != 0) {
            locale = Locale.US;
        }
        return b(date, timeZone, locale);
    }

    public static /* synthetic */ String c(Date date, TimeZone timeZone, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = null;
        }
        if ((i & 2) != 0) {
            locale = Locale.US;
        }
        return c(date, timeZone, locale);
    }
}
