package com.lynx.tasm.behavior.shadow;

import X.C1311720kEs;
import X.InterfaceC1311950kFF;
import com.lynx.react.bridge.mapbuffer.ReadableCompactArrayBuffer;
import com.lynx.tasm.base.TraceEvent;

/* JADX INFO: loaded from: classes21.dex */
public class TextLayout {
    public final InterfaceC1311950kFF LIZ;

    public TextLayout(final C1311720kEs c1311720kEs) {
        this.LIZ = new InterfaceC1311950kFF() { // from class: X.0kFD
            @Override // X.InterfaceC1311950kFF
            public final float[] LIZJ(int i) {
                return c1311720kEs.LJIJJ.LIZ(i);
            }

            @Override // X.InterfaceC1311950kFF
            public final void LIZIZ(int i, ReadableCompactArrayBuffer readableCompactArrayBuffer) {
                c1311720kEs.LJIJJ.LIZJ(i, readableCompactArrayBuffer);
            }

            @Override // X.InterfaceC1311950kFF
            public final float[] LIZ(int i, float f, int i2, float f2, int i3, float[] fArr) {
                return c1311720kEs.LJIJJ.LJ(i, f, i2, f2, i3, fArr);
            }
        };
    }

    public float[] align(int i) {
        TraceEvent.LIZIZ("TextLayout.align");
        float[] fArrLIZJ = this.LIZ.LIZJ(i);
        TraceEvent.LJII("TextLayout.align");
        return fArrLIZJ;
    }

    public TextLayout(InterfaceC1311950kFF interfaceC1311950kFF) {
        this.LIZ = interfaceC1311950kFF;
    }

    public void dispatchLayoutBefore(int i, ReadableCompactArrayBuffer readableCompactArrayBuffer) {
        TraceEvent.LIZIZ("TextLayout.dispatchLayoutBefore");
        this.LIZ.LIZIZ(i, readableCompactArrayBuffer);
        TraceEvent.LJII("TextLayout.dispatchLayoutBefore");
    }

    public float[] measureText(int i, float f, int i2, float f2, int i3, float[] fArr) {
        TraceEvent.LIZIZ("TextLayout.measureText");
        float[] fArrLIZ = this.LIZ.LIZ(i, f, i2, f2, i3, fArr);
        TraceEvent.LJII("TextLayout.measureText");
        return fArrLIZ;
    }
}
