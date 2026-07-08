package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class HostOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        HostOperation hostOperation = (HostOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        if (hostOperation.LIZ != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                hostOperation.LIZ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(1, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
            }
        }
        if (hostOperation.LIZIZ != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                hostOperation.LIZIZ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(2, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
            }
        }
        if (hostOperation.LIZJ != null) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                hostOperation.LIZJ.LIZ(byteArrayOutputStream2);
                c_d.LJIIIIZZ(4, byteArrayOutputStream2.toByteArray());
                byteArrayOutputStream2.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream2.close();
            }
        }
        if (hostOperation.LIZLLL != null) {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            try {
                hostOperation.LIZLLL.LIZ(byteArrayOutputStream3);
                c_d.LJIIIIZZ(5, byteArrayOutputStream3.toByteArray());
                byteArrayOutputStream3.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream3.close();
            }
        }
        if (hostOperation.LJ != null) {
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            try {
                hostOperation.LJ.LIZ(byteArrayOutputStream4);
                c_d.LJIIIIZZ(6, byteArrayOutputStream4.toByteArray());
                byteArrayOutputStream4.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream4.close();
            }
        }
        if (hostOperation.LJFF != null) {
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                hostOperation.LJFF.LIZ(byteArrayOutputStream5);
                c_d.LJIIIIZZ(7, byteArrayOutputStream5.toByteArray());
                byteArrayOutputStream5.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream5.close();
            }
        }
        if (hostOperation.LJI != null) {
            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
            try {
                hostOperation.LJI.LIZ(byteArrayOutputStream6);
                c_d.LJIIIIZZ(8, byteArrayOutputStream6.toByteArray());
                byteArrayOutputStream6.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream6.close();
            }
        }
        if (hostOperation.LJII != null) {
            ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
            try {
                hostOperation.LJII.LIZ(byteArrayOutputStream7);
                c_d.LJIIIIZZ(9, byteArrayOutputStream7.toByteArray());
                byteArrayOutputStream7.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream7.close();
            }
        }
        if (hostOperation.LJIIIIZZ != null) {
            ByteArrayOutputStream byteArrayOutputStream8 = new ByteArrayOutputStream();
            try {
                hostOperation.LJIIIIZZ.LIZ(byteArrayOutputStream8);
                c_d.LJIIIIZZ(10, byteArrayOutputStream8.toByteArray());
                byteArrayOutputStream8.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream8.close();
            }
        }
        if (hostOperation.LJIIIZ != null) {
            ByteArrayOutputStream byteArrayOutputStream9 = new ByteArrayOutputStream();
            try {
                hostOperation.LJIIIZ.LIZ(byteArrayOutputStream9);
                c_d.LJIIIIZZ(11, byteArrayOutputStream9.toByteArray());
                byteArrayOutputStream9.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream9.close();
            }
        }
        if (hostOperation.LJIIJ != null) {
            ByteArrayOutputStream byteArrayOutputStream10 = new ByteArrayOutputStream();
            try {
                hostOperation.LJIIJ.LIZ(byteArrayOutputStream10);
                c_d.LJIIIIZZ(12, byteArrayOutputStream10.toByteArray());
                byteArrayOutputStream10.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream10.close();
            }
        }
        if (hostOperation.LJIIJJI != null) {
            ByteArrayOutputStream byteArrayOutputStream11 = new ByteArrayOutputStream();
            try {
                hostOperation.LJIIJJI.LIZ(byteArrayOutputStream11);
                c_d.LJIIIIZZ(13, byteArrayOutputStream11.toByteArray());
                byteArrayOutputStream11.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream11.close();
            }
        }
        if (hostOperation.LJIIL != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                hostOperation.LJIIL.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(14, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream.close();
            }
        }
        if (hostOperation.LJIILIIL != null) {
            ByteArrayOutputStream byteArrayOutputStream12 = new ByteArrayOutputStream();
            try {
                hostOperation.LJIILIIL.LIZ(byteArrayOutputStream12);
                c_d.LJIIIIZZ(15, byteArrayOutputStream12.toByteArray());
                byteArrayOutputStream12.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream12.close();
            }
        }
        c_d.LJFF();
    }
}
