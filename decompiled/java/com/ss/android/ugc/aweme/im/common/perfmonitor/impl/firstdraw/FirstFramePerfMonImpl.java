package com.ss.android.ugc.aweme.im.common.perfmonitor.impl.firstdraw;

import X.C0T6G;
import X.InterfaceC1224904ql;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory;
import com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon;
import com.ss.android.ugc.aweme.im.common.perfmonitor.impl.SimpleStopwatch;
import com.ss.android.ugc.aweme.im.common.perfmonitor.impl.firstdraw.FirstFramePerfMonImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class FirstFramePerfMonImpl implements FirstFramePerfMon {
    public static final /* synthetic */ int LIZJ = 0;
    public final Map<String, SimpleStopwatch> LIZIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon
    public final void LIZIZ(String str) {
        IStopwatchFactory iStopwatchFactory = (IStopwatchFactory) PluggableExtentionKt.pluggableSpiForReal(IStopwatchFactory.class);
        SimpleStopwatch simpleStopwatchLIZIZ = null;
        if (iStopwatchFactory != null) {
            simpleStopwatchLIZIZ = iStopwatchFactory.LIZIZ();
        }
        if ((simpleStopwatchLIZIZ instanceof SimpleStopwatch) && simpleStopwatchLIZIZ != null) {
            this.LIZIZ.put(str, simpleStopwatchLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon
    public final void LIZ(View view, final String str, final InterfaceC1224904ql interfaceC1224904ql) {
        new C0T6G(view, new InterfaceC1224904ql() { // from class: X.04qj
            @Override // X.InterfaceC1224904ql
            public final void LIZ() throws JSONException {
                SimpleStopwatch simpleStopwatch = (SimpleStopwatch) ((LinkedHashMap) this.LIZIZ).get(str);
                if (simpleStopwatch == null) {
                    return;
                }
                simpleStopwatch.stop();
                FirstFramePerfMonImpl firstFramePerfMonImpl = this;
                String str2 = str;
                long j = simpleStopwatch.LIZJ - simpleStopwatch.LIZIZ;
                firstFramePerfMonImpl.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("im_first_frame_");
                sbLIZ.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("draw_time", j);
                C793770VBv.LJII(strLIZIZ, new JSONObject(), jSONObject, null);
                InterfaceC1224904ql interfaceC1224904ql2 = interfaceC1224904ql;
                if (interfaceC1224904ql2 != null) {
                    interfaceC1224904ql2.LIZ();
                }
            }

            @Override // X.InterfaceC1224904ql
            public final void LIZIZ() {
                InterfaceC1224904ql interfaceC1224904ql2 = interfaceC1224904ql;
                if (interfaceC1224904ql2 != null) {
                    interfaceC1224904ql2.LIZIZ();
                }
            }
        });
    }
}
