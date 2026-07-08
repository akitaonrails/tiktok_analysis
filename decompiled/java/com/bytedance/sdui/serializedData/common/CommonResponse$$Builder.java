package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class CommonResponse$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        CommonResponse commonResponse = (CommonResponse) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIIIZ(1, Integer.valueOf(commonResponse.LIZ).intValue());
        String str = commonResponse.LIZIZ;
        if (str != null) {
            c_d.LJIIJJI(2, str);
        }
        c_d.LJFF();
    }
}
