package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class UIOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        UIOperation uIOperation = (UIOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = uIOperation.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        List<String> list = uIOperation.LIZIZ;
        for (int i = 0; i < list.size(); i++) {
            c_d.LJIIJJI(2, (String) ListProtector.get(list, i));
        }
        String str2 = uIOperation.LIZJ;
        if (str2 != null) {
            c_d.LJIIJJI(3, str2);
        }
        String str3 = uIOperation.LIZLLL;
        if (str3 != null) {
            c_d.LJIIJJI(4, str3);
        }
        c_d.LJIILJJIL(5, uIOperation.LJ.longValue());
        c_d.LJFF();
    }
}
