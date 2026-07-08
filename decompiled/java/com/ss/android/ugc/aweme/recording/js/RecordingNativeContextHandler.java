package com.ss.android.ugc.aweme.recording.js;

import X.C01GW;
import X.C08YC;
import X.C09CT;
import X.C1227904rF;
import X.C452501pT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class RecordingNativeContextHandler {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(529));
    public final List<C08YC> LIZIZ = Collections.synchronizedList(new ArrayList());
    public final Object LIZJ = new Object();

    public static final class RequestNativeContext {

        @C09CT("request_context")
        public final List<RequestNativeContextItem> requestContext;

        public RequestNativeContext(List<RequestNativeContextItem> list) {
            this.requestContext = list;
        }
    }

    public final String LIZ(long j, String str) {
        long j2 = 2000 + j;
        ArrayList arrayList = new ArrayList(5);
        synchronized (this.LIZJ) {
            try {
                for (C08YC c08yc : this.LIZIZ) {
                    if (Intrinsics.LJFF(c08yc.LIZ, str)) {
                        long j3 = c08yc.LIZLLL;
                        if (j3 >= j) {
                            if (j3 > j2) {
                                break;
                            }
                            arrayList.add(new RequestNativeContextItem(c08yc.LIZIZ, c08yc.LIZJ, j3));
                            if (arrayList.size() >= 5) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            C1227904rF.LIZ.getClass();
            String strLJIILL = C1227904rF.LIZLLL().LJIILL(new RequestNativeContext(arrayList));
            strLJIILL.toString();
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final class RequestNativeContextItem {

        @C09CT("request_method")
        public final String requestMethod;

        @C09CT("request_url")
        public final String requestUrl;

        @C09CT("timestamp")
        public final long timestamp;

        public RequestNativeContextItem(String str, String str2, long j) {
            this.requestUrl = str;
            this.requestMethod = str2;
            this.timestamp = j;
        }
    }
}
