package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class ACKResponse$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ACKResponse aCKResponse = (ACKResponse) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = aCKResponse.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        c_d.LJIILJJIL(2, aCKResponse.LIZIZ.longValue());
        c_d.LJFF();
    }
}
