package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class UpdateDataEvent$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        UpdateDataEvent updateDataEvent = (UpdateDataEvent) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = updateDataEvent.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        String str2 = updateDataEvent.LIZIZ;
        if (str2 != null) {
            c_d.LJIIJJI(2, str2);
        }
        c_d.LJFF();
    }
}
