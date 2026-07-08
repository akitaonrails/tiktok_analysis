package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class NodeOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        NodeOperation nodeOperation = (NodeOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIILJJIL(1, nodeOperation.LIZ.longValue());
        String str = nodeOperation.LIZIZ;
        if (str != null) {
            c_d.LJIIJJI(2, str);
        }
        if (nodeOperation.LIZJ != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                nodeOperation.LIZJ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(3, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream.close();
                throw th;
            }
        }
        List<String> list = nodeOperation.LIZLLL;
        for (int i = 0; i < list.size(); i++) {
            c_d.LJIIJJI(4, (String) ListProtector.get(list, i));
        }
        c_d.LJFF();
    }
}
