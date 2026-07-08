package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class Edges$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        Edges edges = (Edges) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LIZIZ(Float.valueOf(edges.LIZ).floatValue(), 1);
        c_d.LIZIZ(Float.valueOf(edges.LIZIZ).floatValue(), 2);
        c_d.LIZIZ(Float.valueOf(edges.LIZJ).floatValue(), 3);
        c_d.LIZIZ(Float.valueOf(edges.LIZLLL).floatValue(), 4);
        c_d.LJFF();
    }
}
