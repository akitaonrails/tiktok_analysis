package com.google.gson;

import X.C09DL;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDateTypeAdapter extends TypeAdapter<Date> {
    public final Class<? extends Date> LIZ;
    public final List<DateFormat> LIZIZ;

    public final String toString() {
        DateFormat dateFormat = this.LIZIZ.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DefaultDateTypeAdapter(");
            sbLIZ.append(((SimpleDateFormat) dateFormat).toPattern());
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DefaultDateTypeAdapter(");
        sbLIZ2.append(dateFormat.getClass().getSimpleName());
        sbLIZ2.append(')');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZ(Class cls) {
        if (cls != Date.class && cls != java.sql.Date.class && cls != Timestamp.class) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Date type must be one of ");
            sbLIZ.append(Date.class);
            sbLIZ.append(", ");
            sbLIZ.append(Timestamp.class);
            sbLIZ.append(", or ");
            sbLIZ.append(java.sql.Date.class);
            sbLIZ.append(" but was ");
            sbLIZ.append(cls);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r3 = X.C09DB.LIZIZ(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date read(X.C09CU r5) {
        /*
            r4 = this;
            X.09D6 r1 = r5.LJJLIIIJ()
            X.09D6 r0 = X.C09D6.NULL
            if (r1 != r0) goto Ld
            r5.LJJJJJL()
            r3 = 0
        Lc:
            return r3
        Ld:
            java.lang.String r3 = r5.LJJJZ()
            java.util.List<java.text.DateFormat> r2 = r4.LIZIZ
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L71
        L1c:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L71
            java.text.DateFormat r0 = (java.text.DateFormat) r0     // Catch: java.lang.Throwable -> L71
            java.util.Date r3 = r0.parse(r3)     // Catch: java.text.ParseException -> L2d java.lang.Throwable -> L71
            goto L32
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L71
            goto L1c
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
            goto L3f
        L34:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L67 java.lang.Throwable -> L71
            r0 = 0
            r1.<init>(r0)     // Catch: java.text.ParseException -> L67 java.lang.Throwable -> L71
            java.util.Date r3 = X.C09DB.LIZIZ(r3, r1)     // Catch: java.text.ParseException -> L67 java.lang.Throwable -> L71
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
        L3f:
            java.lang.Class<? extends java.util.Date> r1 = r4.LIZ
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r1 == r0) goto Lc
            java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
            if (r1 != r0) goto L53
            java.sql.Timestamp r2 = new java.sql.Timestamp
            long r0 = r3.getTime()
            r2.<init>(r0)
            return r2
        L53:
            java.lang.Class<java.sql.Date> r0 = java.sql.Date.class
            if (r1 != r0) goto L61
            java.sql.Date r2 = new java.sql.Date
            long r0 = r3.getTime()
            r2.<init>(r0)
            return r2
        L61:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L67:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L71
            com.google.gson.s r0 = new com.google.gson.s     // Catch: java.lang.Throwable -> L71
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L71
            throw r0     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.DefaultDateTypeAdapter.read(X.09CU):java.lang.Object");
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        LIZ(cls);
        this.LIZ = cls;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Date date) {
        Date date2 = date;
        if (date2 == null) {
            c09dl.LJIJJ();
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                c09dl.LJJJJJ(((DateFormat) ((ArrayList) this.LIZIZ).get(0)).format(date2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public DefaultDateTypeAdapter(int i, int i2, Class cls) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        LIZ(cls);
        this.LIZ = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (com.google.gson.internal.p.LIZ >= 9) {
            arrayList.add(com.google.gson.internal.u.LIZ(i, i2));
        }
    }
}
