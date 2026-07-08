package com.ss.android.ugc.aweme.series.common.utils;

import X.AbstractC19486711Lt;
import X.C09CT;
import X.C09JN;
import X.C11S5;
import X.C1620870sHV;
import X.EnumC1612940s4i;
import X.InterfaceC781210Ukh;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaMonitor {
    public static final /* synthetic */ int LIZ = 0;

    public static final class LogData {

        @C09CT("check_type")
        public final EnumC1612940s4i checkType;

        @C09CT("extra")
        public final String extra;

        public final JSONObject LIZ() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("check_type", this.checkType.name().toLowerCase(Locale.ROOT));
            jSONObject.putOpt("extra", this.extra);
            return jSONObject;
        }

        public LogData(EnumC1612940s4i enumC1612940s4i, String str) {
            this.checkType = enumC1612940s4i;
            this.extra = str;
        }
    }

    public static void LIZ(Function0 function0) {
        AbstractC19486711Lt.LJIIJJI(new C1620870sHV(function0, 0)).LJIJJLI(C11S5.LIZ()).LJIJI(new C09JN() { // from class: X.0roD
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MiniDramaMonitor@b3f6.async$3");
                C1C7U.LIZIZ("MiniDramaMonitor@b3f6.async$3");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0s5h
            @Override // X.InterfaceC781210Ukh
            public final void run() {
            }
        });
    }
}
