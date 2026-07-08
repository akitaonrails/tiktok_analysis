package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C08LX;
import X.C08LY;
import X.C09CT;
import X.C1035880d3y;
import X.C1939607ik;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class FixIabEsFocusExp {
    public static final Config LIZ = new Config(false, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(292));

    public static boolean LIZ(String str) {
        List listLJJLIIIJ;
        String str2 = ((Config) LIZIZ.getValue()).config;
        if (str2 == null || (listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{','}, false, 0, 6)) == null) {
            return false;
        }
        C08LX c08lx = new C08LX(new C08LY(new C1939607ik(listLJJLIIIJ), AFwS252S0000000_16.get$arr$(356)));
        while (c08lx.hasNext()) {
            if (Intrinsics.LJFF(c08lx.next(), str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        String advId;
        List<String> list;
        C01GW c01gw = LIZIZ;
        if (!((Config) c01gw.getValue()).enable) {
            if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (advId = awemeRawAd.getAdvId()) != null && !a0.LJJJIL(advId) && (list = ((Config) c01gw.getValue()).enableAdvid) != null && !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), advId)) {
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final class Config {

        @C09CT("config")
        public final String config;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enableAdvid")
        public final List<String> enableAdvid;

        public Config() {
            this(false, null, null);
        }

        public Config(boolean z, String str, List<String> list) {
            this.enable = z;
            this.config = str;
            this.enableAdvid = list;
        }
    }
}
