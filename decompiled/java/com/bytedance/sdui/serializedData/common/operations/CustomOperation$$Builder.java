package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class CustomOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        CustomOperation customOperation = (CustomOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = customOperation.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        String str2 = customOperation.LIZIZ;
        if (str2 != null) {
            c_d.LJIIJJI(2, str2);
        }
        String str3 = customOperation.LIZJ;
        if (str3 != null) {
            c_d.LJIIJJI(3, str3);
        }
        c_d.LJIILJJIL(4, customOperation.LIZLLL.longValue());
        c_d.LJFF();
    }
}
