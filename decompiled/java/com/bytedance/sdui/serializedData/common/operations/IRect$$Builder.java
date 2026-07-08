package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class IRect$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        IRect iRect = (IRect) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIIIZ(1, Integer.valueOf(iRect.LIZ).intValue());
        c_d.LJIIIZ(2, Integer.valueOf(iRect.LIZIZ).intValue());
        c_d.LJIIIZ(3, Integer.valueOf(iRect.LIZJ).intValue());
        c_d.LJIIIZ(4, Integer.valueOf(iRect.LIZLLL).intValue());
        c_d.LJFF();
    }
}
