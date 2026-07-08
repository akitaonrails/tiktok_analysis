package com.ss.android.ttve.nativePort;

import X.InterfaceC1286300jZs;
import X.InterfaceC1286330jZv;
import X.InterfaceC1286340jZw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes21.dex */
public class TEVideoUtilsCallback {
    public InterfaceC1286330jZv frameDataListener;
    public InterfaceC1286300jZs frameListener;
    public InterfaceC1286340jZw onFisishedListener;

    public InterfaceC1286300jZs getFrameAvailableListener() {
        return this.frameListener;
    }

    public static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static void onFinished(Object obj) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        InterfaceC1286340jZw interfaceC1286340jZw;
        if ((obj instanceof TEVideoUtilsCallback) && (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) != null && (interfaceC1286340jZw = tEVideoUtilsCallback.onFisishedListener) != null) {
            interfaceC1286340jZw.LIZIZ();
        }
    }

    public void setFrameDataListener(Object obj) {
        this.frameDataListener = (InterfaceC1286330jZv) obj;
    }

    public void setListener(Object obj) {
        this.frameListener = (InterfaceC1286300jZs) obj;
    }

    public void setOnFisishedListener(Object obj) {
        this.onFisishedListener = (InterfaceC1286340jZw) obj;
    }

    public static ByteBuffer allocateFrame(int i, int i2) {
        return ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean onFrameAvailable(ByteBuffer byteBuffer, int i, int i2, int i3) {
        InterfaceC1286300jZs interfaceC1286300jZs = this.frameListener;
        if (interfaceC1286300jZs != null && interfaceC1286300jZs.processFrame(byteBuffer, i, i2, i3)) {
            return true;
        }
        return false;
    }

    public static boolean onFrameAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        InterfaceC1286300jZs interfaceC1286300jZs;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (interfaceC1286300jZs = tEVideoUtilsCallback.frameListener) == null || !interfaceC1286300jZs.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable2(Object obj, byte[] bArr, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        InterfaceC1286300jZs interfaceC1286300jZs;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (interfaceC1286300jZs = tEVideoUtilsCallback.frameListener) == null || !interfaceC1286300jZs.processFrame(ByteBuffer.wrap(bArr), i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameDataAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        InterfaceC1286330jZv interfaceC1286330jZv;
        if ((obj instanceof TEVideoUtilsCallback) && (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) != null && (interfaceC1286330jZv = tEVideoUtilsCallback.frameDataListener) != null && interfaceC1286330jZv.LIZ()) {
            return true;
        }
        return false;
    }
}
