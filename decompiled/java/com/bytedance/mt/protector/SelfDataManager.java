package com.bytedance.mt.protector;

import X.C09DE;
import X.C09EU;
import X.C09EY;
import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.internal.Excluder;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SelfDataManager {
    public static final SelfDataManager LJ = new SelfDataManager();
    public final ThreadLocal<SelfDataItem> LIZ = new ThreadLocal<>();
    public final List<SelfDataItem> LIZIZ = Collections.synchronizedList(new ArrayList());
    public final Gson LIZJ;
    public final long LIZLLL;

    public static class SelfDataItem {

        @C09DE
        public k payload;
        public Throwable sourceThrowable;

        @C09DE
        public long timeStamp;

        @C09DE
        public String type;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SelfDataItem{, payload=");
            sbLIZ.append(this.payload);
            sbLIZ.append(", timeStamp=");
            sbLIZ.append(this.timeStamp);
            sbLIZ.append(", type=");
            sbLIZ.append(this.type);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public k toJsonObject(Gson gson) {
            return gson.LJIJJLI(this);
        }
    }

    public SelfDataManager() {
        e eVar = new e();
        eVar.LJIILL = true;
        Excluder excluderLIZ = eVar.LIZ.clone();
        excluderLIZ.LLILZ = true;
        eVar.LIZ = excluderLIZ;
        this.LIZJ = eVar.LIZ();
        this.LIZLLL = System.currentTimeMillis();
    }

    public static String LIZIZ(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }

    public final n LIZJ(Throwable th) {
        Throwable th2;
        Throwable th3;
        n nVar = new n();
        h hVar = new h();
        SelfDataItem selfDataItem = this.LIZ.get();
        if (selfDataItem != null && (th3 = selfDataItem.sourceThrowable) != null && th != null && (th3 == th || TextUtils.equals(LIZIZ(th3), LIZIZ(th)))) {
            hVar.LJJIFFI(selfDataItem.toJsonObject(this.LIZJ));
        } else {
            synchronized (this.LIZIZ) {
                try {
                    for (SelfDataItem selfDataItem2 : this.LIZIZ) {
                        if (th == null) {
                            hVar.LJJIFFI(selfDataItem2.toJsonObject(this.LIZJ));
                        } else if (selfDataItem2 != null && (th2 = selfDataItem2.sourceThrowable) != null && (th2 == th || TextUtils.equals(LIZIZ(th2), LIZIZ(th)))) {
                            hVar.LJJIFFI(selfDataItem2.toJsonObject(this.LIZJ));
                        }
                    }
                    this.LIZIZ.size();
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    throw th4;
                }
            }
        }
        nVar.LJJIFFI("initTimeStamp", new q((Number) Long.valueOf(this.LIZLLL)));
        nVar.LJJIFFI("reportTimeStamp", new q((Number) Long.valueOf(System.currentTimeMillis())));
        nVar.LJJIFFI("data", hVar);
        String str = "toJsonObject" + nVar.toString();
        C09EY c09ey = C09EU.LIZJ;
        C786410Ut5.j4("%s %s", new Object[]{"BusinessTokenManager", str});
        c09ey.LJ();
        return nVar;
    }

    public final void LIZ(String str, Throwable th, n nVar) {
        SelfDataItem selfDataItem = new SelfDataItem();
        selfDataItem.type = str;
        selfDataItem.payload = nVar;
        selfDataItem.sourceThrowable = th;
        selfDataItem.timeStamp = System.currentTimeMillis();
        if (this.LIZIZ.size() >= 5) {
            this.LIZIZ.remove(0);
        }
        this.LIZIZ.add(selfDataItem);
        this.LIZ.set(selfDataItem);
    }
}
