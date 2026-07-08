package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class EventOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        EventOperation eventOperation = (EventOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        eventOperation.getClass();
        Long l = 0L;
        c_d.LJIILJJIL(1, l.longValue());
        String str = eventOperation.LIZ;
        if (str != null) {
            c_d.LJIIJJI(2, str);
        }
        c_d.LJFF();
    }
}
