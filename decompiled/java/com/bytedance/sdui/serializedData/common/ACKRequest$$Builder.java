package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class ACKRequest$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ACKRequest aCKRequest = (ACKRequest) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = aCKRequest.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        c_d.LJIILJJIL(2, aCKRequest.LIZIZ.longValue());
        c_d.LJFF();
    }
}
