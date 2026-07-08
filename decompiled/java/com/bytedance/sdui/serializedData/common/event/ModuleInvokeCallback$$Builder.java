package com.bytedance.sdui.serializedData.common.event;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class ModuleInvokeCallback$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ModuleInvokeCallback moduleInvokeCallback = (ModuleInvokeCallback) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIILJJIL(1, Long.valueOf(moduleInvokeCallback.LIZ).longValue());
        String str = moduleInvokeCallback.LIZIZ;
        if (str != null) {
            c_d.LJIIJJI(2, str);
        }
        c_d.LJFF();
    }
}
