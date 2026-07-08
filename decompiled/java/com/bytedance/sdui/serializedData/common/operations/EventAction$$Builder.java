package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class EventAction$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        EventAction eventAction = (EventAction) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = eventAction.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        String str2 = eventAction.LIZIZ;
        if (str2 != null) {
            c_d.LJIIJJI(2, str2);
        }
        c_d.LJIILJJIL(3, eventAction.LIZJ.longValue());
        c_d.LJFF();
    }
}
