package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class LayoutOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        LayoutOperation layoutOperation = (LayoutOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIILJJIL(1, Long.valueOf(layoutOperation.LIZ).longValue());
        c_d.LIZIZ(Float.valueOf(layoutOperation.LIZIZ).floatValue(), 2);
        c_d.LIZIZ(Float.valueOf(layoutOperation.LIZJ).floatValue(), 3);
        c_d.LIZIZ(Float.valueOf(layoutOperation.LIZLLL).floatValue(), 4);
        c_d.LIZIZ(Float.valueOf(layoutOperation.LJ).floatValue(), 5);
        c_d.LIZIZ(Float.valueOf(layoutOperation.LJFF).floatValue(), 6);
        if (layoutOperation.LJI != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                layoutOperation.LJI.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(7, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
            }
        }
        if (layoutOperation.LJII != null) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                layoutOperation.LJII.LIZ(byteArrayOutputStream2);
                c_d.LJIIIIZZ(8, byteArrayOutputStream2.toByteArray());
                byteArrayOutputStream2.close();
            } finally {
            }
        }
        if (layoutOperation.LJIIIIZZ != null) {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            try {
                layoutOperation.LJIIIIZZ.LIZ(byteArrayOutputStream3);
                c_d.LJIIIIZZ(9, byteArrayOutputStream3.toByteArray());
                byteArrayOutputStream3.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream3.close();
            }
        }
        if (layoutOperation.LJIIIZ != null) {
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            try {
                layoutOperation.LJIIIZ.LIZ(byteArrayOutputStream4);
                c_d.LJIIIIZZ(10, byteArrayOutputStream4.toByteArray());
                byteArrayOutputStream4.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream4.close();
            }
        }
        if (layoutOperation.LJIIJ != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                layoutOperation.LJIIJ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(11, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream.close();
            }
        }
        c_d.LJFF();
    }
}
