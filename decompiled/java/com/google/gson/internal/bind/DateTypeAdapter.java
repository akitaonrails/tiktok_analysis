package com.google.gson.internal.bind;

import X.C09CU;
import X.C09D6;
import X.C09DB;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.p;
import com.google.gson.internal.u;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final v LIZIZ = new v() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    public final List<DateFormat> LIZ;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p.LIZ >= 9) {
            arrayList.add(u.LIZ(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Date read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            c09cu.LJJJJJL();
            return null;
        }
        String strLJJJZ = c09cu.LJJJZ();
        synchronized (this) {
            Iterator it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                try {
                    return ((DateFormat) it2.next()).parse(strLJJJZ);
                } catch (ParseException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            try {
                return C09DB.LIZIZ(strLJJJZ, new ParsePosition(0));
            } catch (ParseException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new s(strLJJJZ, e2);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                c09dl.LJIJJ();
            } else {
                c09dl.LJJJJJ(((DateFormat) ((ArrayList) this.LIZ).get(0)).format(date2));
            }
        }
    }
}
