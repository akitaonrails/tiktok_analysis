package com.bytedance.sdui.serializedData.common.event;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class LoadEvent$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        c$d c_d = new c$d(outputStream);
        String str = ((LoadEvent) absSerializedData).LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        c_d.LJFF();
    }
}
