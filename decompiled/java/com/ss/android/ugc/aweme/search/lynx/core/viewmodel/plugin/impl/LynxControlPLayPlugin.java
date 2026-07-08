package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.impl;

import X.AbstractC1156450gCR;
import X.C08CX;
import X.C0BQ9;
import X.C1156440gCQ;
import X.C1156460gCS;
import X.C13IQ;
import X.C13LQ;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1D61;
import X.C1D63;
import X.C659080PtC;
import X.EnumC115000c8;
import X.EnumC648210Pbf;
import X.InterfaceC1541990qEH;
import X.InterfaceC2250311D5x;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class LynxControlPLayPlugin implements InterfaceC2250311D5x {
    public static final int $stable = 8;
    public final String tag = "LynxControlPLayPlugin";
    public final Set<C1D61> lifecycleStages = C13LQ.LJLIIL(new EnumC648210Pbf[]{EnumC648210Pbf.ON_PLAY_START, EnumC648210Pbf.ON_PLAY_STOP, EnumC648210Pbf.ON_PLAY_COMPLETE});

    @Override // X.InterfaceC2250311D5x
    public void destroy() {
    }

    @Override // X.InterfaceC2250311D5x
    public int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC2250311D5x
    public Set<C1D61> getLifecycleStages() {
        return this.lifecycleStages;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) throws JSONException {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        C1537720q7O c1537720q7O = null;
        if (c1537480q70 != null) {
            interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        if (interfaceC1541990qEHLJIJJ instanceof C1537720q7O) {
            c1537720q7O = (C1537720q7O) interfaceC1541990qEHLJIJJ;
        }
        C1D61 c1d61 = c1d63.LIZ.LIZ;
        if (c1d61 == EnumC648210Pbf.ON_PLAY_START) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("play_status", 1);
            if (C0BQ9.LIZ()) {
                jSONObject.put("muted", C659080PtC.LIZIZ() ? 1 : 0);
            }
            if (c1537720q7O != null) {
                c1537720q7O.LIZ("card_should_play", jSONObject);
            }
        } else if (c1d61 == EnumC648210Pbf.ON_PLAY_STOP) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_status", 0);
            if (c1537720q7O != null) {
                c1537720q7O.LIZ("card_should_play", jSONObject2);
            }
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
