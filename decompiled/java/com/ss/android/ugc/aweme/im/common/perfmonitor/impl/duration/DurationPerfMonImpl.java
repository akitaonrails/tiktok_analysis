package com.ss.android.ugc.aweme.im.common.perfmonitor.impl.duration;

import X.AbstractC1492605sq;
import X.AbstractC1493005su;
import X.C054G;
import X.C0I0B;
import X.C0PEM;
import X.C1492405so;
import X.C1492505sp;
import X.C1DFB;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C450520Hla;
import X.InterfaceC1493105sv;
import X.InterfaceC1493405sy;
import X.InterfaceC1493505sz;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class DurationPerfMonImpl implements DurationPerfMon {
    public final InterfaceC1493405sy LIZIZ;
    public final InterfaceC1493105sv LIZJ;
    public final Function0<Stopwatch> LIZLLL;
    public final C054G LJ;
    public final ConcurrentHashMap<String, Stopwatch> LJFF;

    public DurationPerfMonImpl() {
        this(null);
    }

    static {
        new DurationPerfMonImpl(null);
    }

    public DurationPerfMonImpl(Object obj) {
        C1492405so c1492405so = new InterfaceC1493405sy() { // from class: X.05so
            @Override // X.InterfaceC1493405sy
            public final void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
            }
        };
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(1464);
        C1DFB c1dfb = C0PEM.LIZJ;
        this.LIZIZ = c1492405so;
        this.LIZJ = interfaceC1493505szLIZIZ;
        this.LIZLLL = aFwS187S0000000_2;
        this.LJ = C2296808zG.LIZ(c1dfb.plus(C2296908zH.LIZ()));
        this.LJFF = new ConcurrentHashMap<>();
    }

    public static JSONObject LIZLLL(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
    public final boolean LIZ(C450520Hla c450520Hla) {
        Stopwatch stopwatch = this.LJFF.get(c450520Hla.toString());
        if (stopwatch != null && stopwatch.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
    public final boolean LIZIZ(AbstractC1492605sq abstractC1492605sq, boolean z) {
        Stopwatch stopwatch;
        String string = abstractC1492605sq.toString();
        if (this.LJFF.get(string) != null && (stopwatch = this.LJFF.get(string)) != null && stopwatch.isRunning() && !z) {
            return false;
        }
        this.LJFF.put(string, this.LIZLLL.invoke());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
    public final void LIZJ(AbstractC1492605sq abstractC1492605sq, AbstractC1493005su abstractC1493005su) {
        String string = abstractC1492605sq.toString();
        Stopwatch stopwatchRemove = this.LJFF.remove(string);
        if (stopwatchRemove != null && stopwatchRemove.isRunning()) {
            stopwatchRemove.stop();
            C23250099c.LIZLLL(this.LJ, null, null, new C1492505sp(abstractC1492605sq, this, abstractC1493005su, stopwatchRemove.LIZ(), string, null), 3);
        }
    }
}
