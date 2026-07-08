package com.google.gson.internal.bind;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeTypeAdapter extends TypeAdapter<Time> {
    public static final v LIZIZ = new v() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat LIZ = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.TypeAdapter
    public final Time read(C09CU c09cu) {
        synchronized (this) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            try {
                return new Time(this.LIZ.parse(c09cu.LJJJZ()).getTime());
            } catch (ParseException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new s(e);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Time time) {
        String str;
        Time time2 = time;
        synchronized (this) {
            if (time2 == null) {
                str = null;
            } else {
                str = this.LIZ.format((Date) time2);
            }
            c09dl.LJJJJJ(str);
        }
    }
}
