package com.bytedance.lynx.media;

import X.AbstractC1299960jvu;
import X.C1298530jtb;
import X.C1473760oSE;
import X.C1AML;
import android.content.Context;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import j27.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxAudioEngineView extends AbsMediaEngineView<C1473760oSE> {
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        boolean z;
        TraceEvent.LIZIZ("LynxAudioEngineView.createView");
        C1AML c1aml = new C1AML(context) { // from class: X.0oSE
            public boolean LLILLL;

            @Override // X.C1AML
            public final void LJFF() {
                this.LLILLL = false;
            }

            @Override // X.C1AML
            public final boolean LIZLLL() {
                return this.LLILLL;
            }

            {
                new LinkedHashMap();
            }

            @Override // X.C1AML
            public final void LIZJ(C1491120ouE c1491120ouE) {
                InterfaceC1491100ouC mediaView = getMediaView();
                if (mediaView != null) {
                    LynxLog.i("LynxAudioEngineLayout", "invoke prepare");
                    mediaView.LJII(c1491120ouE);
                    this.LLILLL = true;
                }
            }

            @Override // X.C1AML
            public void setPlayParams(Map<String, ? extends Object> map) {
                Boolean bool;
                InterfaceC1491100ouC mediaView = getMediaView();
                C1473660oS4 c1473660oS4 = new C1473660oS4(getContext());
                c1473660oS4.LIZIZ = c1473660oS4.LJFF;
                LynxLog.i("LynxAudioEngineLayout", "mediaView trigger initialize");
                c1473660oS4.LJIILL(map);
                setMediaView(c1473660oS4);
                Object obj = map.get("auto_prepare");
                if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
                    InterfaceC1491100ouC mediaView2 = getMediaView();
                    if (mediaView2 != null) {
                        mediaView2.LJII(null);
                    }
                    this.LLILLL = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Trigger prepare for mediaView ");
                    sbLIZ.append(getMediaView());
                    LynxLog.i("LynxAudioEngineLayout", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (mediaView != null) {
                    mediaView.destroy();
                }
            }
        };
        s sVarLIZIZ = C1298530jtb.LIZIZ(context);
        if (sVarLIZIZ != null) {
            AbstractC1299960jvu abstractC1299960jvu = sVarLIZIZ.LLL;
            this.LLJL = abstractC1299960jvu;
            if (abstractC1299960jvu != null) {
                z = true;
            } else {
                z = false;
            }
            this.LLJLIL = z;
        }
        this.LLJIJIL = "x-audio-ng";
        TraceEvent.LJII("LynxAudioEngineView.createView");
        return c1aml;
    }

    public LynxAudioEngineView(s sVar, Object obj) {
        super(sVar, obj);
    }
}
