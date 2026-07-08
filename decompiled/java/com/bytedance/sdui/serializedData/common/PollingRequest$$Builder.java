package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class PollingRequest$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        c$d c_d = new c$d(outputStream);
        String str = ((PollingRequest) absSerializedData).LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        Long l = 0L;
        c_d.LJIILJJIL(3, l.longValue());
        Long l2 = 0L;
        c_d.LJIILJJIL(4, l2.longValue());
        c_d.LJFF();
    }
}
