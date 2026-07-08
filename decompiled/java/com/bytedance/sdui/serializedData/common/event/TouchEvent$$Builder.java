package com.bytedance.sdui.serializedData.common.event;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class TouchEvent$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        TouchEvent touchEvent = (TouchEvent) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = touchEvent.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        c_d.LJIILJJIL(2, Long.valueOf(touchEvent.LIZIZ).longValue());
        c_d.LIZIZ(Float.valueOf(touchEvent.LIZJ).floatValue(), 3);
        c_d.LIZIZ(Float.valueOf(touchEvent.LIZLLL).floatValue(), 4);
        c_d.LJIILJJIL(5, Long.valueOf(touchEvent.LJ).longValue());
        c_d.LJFF();
    }
}
