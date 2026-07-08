package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class TreeOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        TreeOperation treeOperation = (TreeOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIILJJIL(1, Long.valueOf(treeOperation.LIZ).longValue());
        c_d.LJIILJJIL(2, Long.valueOf(treeOperation.LIZIZ).longValue());
        c_d.LJIILJJIL(3, Long.valueOf(treeOperation.LIZJ).longValue());
        c_d.LJFF();
    }
}
