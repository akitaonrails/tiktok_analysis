package com.lynx.react.bridge;

import X.C1298840ju6;
import X.EnumC1299070juT;
import android.text.TextUtils;
import com.lynx.tasm.LynxEnv;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public final class PiperData {
    public long LIZ;
    public ByteBuffer LIZIZ;
    public EnumC1299070juT LIZJ;
    public final boolean LIZLLL;
    public final Object LJ;

    public static native long nativeParseStringData(String str);

    public static native void nativeReleaseData(long j);

    private boolean recycleIfIsDisposable() {
        if (this.LIZLLL && this.LIZJ != EnumC1299070juT.Empty) {
            LIZLLL();
        }
        return this.LIZLLL;
    }

    public final boolean LIZJ() {
        return this.LIZJ == EnumC1299070juT.String && this.LIZ == 0;
    }

    public final void LIZLLL() {
        if (this.LIZ != 0 && LynxEnv.inst().isNativeLibraryLoaded()) {
            nativeReleaseData(this.LIZ);
            this.LIZ = 0L;
        }
        this.LIZJ = EnumC1299070juT.Empty;
        this.LIZIZ = null;
    }

    public int getBufferPosition() {
        ByteBuffer byteBuffer = this.LIZIZ;
        if (byteBuffer == null) {
            return 0;
        }
        return byteBuffer.position();
    }

    public int getDataType() {
        return this.LIZJ.ordinal();
    }

    public PiperData() {
        this.LIZJ = EnumC1299070juT.Empty;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        if (this.LIZJ != EnumC1299070juT.Empty) {
            LIZLLL();
        }
    }

    public ByteBuffer getBuffer() {
        return this.LIZIZ;
    }

    public long getNativePtr() {
        return this.LIZ;
    }

    public PiperData(Object obj) {
        this.LIZJ = EnumC1299070juT.Empty;
        this.LIZJ = EnumC1299070juT.Map;
        C1298840ju6.LIZ.getClass();
        this.LIZIZ = C1298840ju6.LIZIZ(obj);
        this.LIZLLL = true;
        this.LJ = obj;
    }

    public static PiperData LIZ(Object obj) {
        return new PiperData(obj);
    }

    public static PiperData LIZIZ(String str) {
        if (LynxEnv.inst().isNativeLibraryLoaded() && !TextUtils.isEmpty(str)) {
            return new PiperData(str);
        }
        return new PiperData();
    }

    public PiperData(String str) {
        this.LIZJ = EnumC1299070juT.Empty;
        this.LIZJ = EnumC1299070juT.String;
        this.LIZ = nativeParseStringData(str);
        this.LIZLLL = true;
        this.LJ = str;
    }
}
