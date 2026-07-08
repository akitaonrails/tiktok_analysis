package com.bytedance.sdui.serializedData.common.event;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class CustomEvent$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        CustomEvent customEvent = (CustomEvent) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = customEvent.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        c_d.LJIILJJIL(2, Long.valueOf(customEvent.LIZIZ).longValue());
        String str2 = customEvent.LIZJ;
        if (str2 != null) {
            c_d.LJIIJJI(3, str2);
        }
        String str3 = customEvent.LIZLLL;
        if (str3 != null) {
            c_d.LJIIJJI(4, str3);
        }
        c_d.LJIILJJIL(5, Long.valueOf(customEvent.LJ).longValue());
        c_d.LJFF();
    }
}
