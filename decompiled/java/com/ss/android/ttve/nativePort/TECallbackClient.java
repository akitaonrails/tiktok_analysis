package com.ss.android.ttve.nativePort;

import X.C2185711AgT;
import X.C2185731AgV;
import X.C355680Dx0;
import X.EnumC2185621AgK;
import X.InterfaceC2185701AgS;
import X.InterfaceC2185721AgU;
import X.InterfaceC2185751AgX;
import X.InterfaceC2185771AgZ;
import X.InterfaceC448730Hih;
import android.graphics.PointF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.vesdk.VERectF;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.ss.android.vesdk.algorithm.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes34.dex */
public class TECallbackClient {
    public NativeCallbacks.IAmbientLoudnessCallback mAmbientLoudnessCallback;
    public NativeCallbacks.IAudioCaptureCallback mAudioCaptureCallback;
    public NativeCallbacks.ICameraFrameCallback mBufferedFrameCallback;
    public InterfaceC2185701AgS mByteBufferAllocator;
    public InterfaceC2185751AgX mCommonCallback;
    public InterfaceC2185771AgZ mDisplayParamsListener;
    public NativeCallbacks.IFrameEffectCallback mFrameEffectCallback;
    public NativeCallbacks.IGetFrameCallback mGetFrameCallback;
    public NativeCallbacks.ILensCallback mLensCallback;
    public InterfaceC2185721AgU mOpenGLCallback;
    public InterfaceC448730Hih mScanListener;
    public NativeCallbacks.ICameraFrameCallback mTextureFrameCallback;

    public void nativeCallback_onCameraFacingChangedCallback(boolean z) {
    }

    public void nativeCallback_onDisplaySizeChangedCallback(int i, int i2, int i3, int i4) {
    }

    public void setDisplayParamsListener(InterfaceC2185771AgZ interfaceC2185771AgZ) {
    }

    public InterfaceC2185721AgU getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    private void nativeCallback_onAmbientDetectCallback(double[] dArr) {
        NativeCallbacks.IAmbientLoudnessCallback iAmbientLoudnessCallback = this.mAmbientLoudnessCallback;
        if (iAmbientLoudnessCallback != null) {
            iAmbientLoudnessCallback.onResults(dArr);
        }
    }

    public ByteBuffer nativeCallback_allocateBuffer(int i) {
        return nativeCallback_allocateBuffer(i, true);
    }

    public ByteBuffer nativeCallback_allocateBufferFromAllocator(int i) {
        InterfaceC2185701AgS interfaceC2185701AgS = this.mByteBufferAllocator;
        if (interfaceC2185701AgS != null) {
            C2185711AgT c2185711AgT = (C2185711AgT) interfaceC2185701AgS;
            synchronized (c2185711AgT) {
                try {
                    if (!c2185711AgT.LIZ.isEmpty()) {
                        ByteBuffer byteBuffer = (ByteBuffer) ((LinkedList) c2185711AgT.LIZ).get(0);
                        ((LinkedList) c2185711AgT.LIZ).remove(0);
                        return byteBuffer;
                    }
                    return VEFrame.allocateFrame(i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return null;
    }

    public void nativeCallback_onAudioCaptureCallback(ByteBuffer byteBuffer) {
        NativeCallbacks.IAudioCaptureCallback iAudioCaptureCallback = this.mAudioCaptureCallback;
        if (iAudioCaptureCallback != null) {
            iAudioCaptureCallback.onReceive(byteBuffer);
        }
    }

    public void nativeCallback_onFrameEffectCallback(long j) {
        NativeCallbacks.IFrameEffectCallback iFrameEffectCallback = this.mFrameEffectCallback;
        if (iFrameEffectCallback != null) {
            iFrameEffectCallback.onResult(j);
        }
    }

    public void nativeCallback_onOpenGLCreate(int i) {
        InterfaceC2185721AgU interfaceC2185721AgU = this.mOpenGLCallback;
        if (interfaceC2185721AgU != null) {
            interfaceC2185721AgU.LIZJ(i);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i) {
        InterfaceC2185721AgU interfaceC2185721AgU = this.mOpenGLCallback;
        if (interfaceC2185721AgU != null) {
            interfaceC2185721AgU.LIZ(i);
        }
    }

    public void nativeCallback_onPreviewSurface(int i) {
        InterfaceC2185721AgU interfaceC2185721AgU = this.mOpenGLCallback;
        if (interfaceC2185721AgU != null) {
            interfaceC2185721AgU.LIZLLL(i);
        }
    }

    public void setAmbientLoudnessCallback(NativeCallbacks.IAmbientLoudnessCallback iAmbientLoudnessCallback) {
        this.mAmbientLoudnessCallback = iAmbientLoudnessCallback;
    }

    public void setAudioCaptureListener(NativeCallbacks.IAudioCaptureCallback iAudioCaptureCallback) {
        this.mAudioCaptureCallback = iAudioCaptureCallback;
    }

    public void setBufferedFrameListener(NativeCallbacks.ICameraFrameCallback iCameraFrameCallback) {
        this.mBufferedFrameCallback = iCameraFrameCallback;
    }

    public void setCommonCallback(InterfaceC2185751AgX interfaceC2185751AgX) {
        this.mCommonCallback = interfaceC2185751AgX;
    }

    public void setFrameEffectCallback(NativeCallbacks.IFrameEffectCallback iFrameEffectCallback) {
        this.mFrameEffectCallback = iFrameEffectCallback;
    }

    public void setGetFrameListener(NativeCallbacks.IGetFrameCallback iGetFrameCallback) {
        this.mGetFrameCallback = iGetFrameCallback;
    }

    public void setLensCallback(NativeCallbacks.ILensCallback iLensCallback) {
        this.mLensCallback = iLensCallback;
    }

    public void setOpenGLListeners(InterfaceC2185721AgU interfaceC2185721AgU) {
        this.mOpenGLCallback = interfaceC2185721AgU;
    }

    public void setTextureFrameListener(NativeCallbacks.ICameraFrameCallback iCameraFrameCallback) {
        this.mTextureFrameCallback = iCameraFrameCallback;
    }

    public ByteBuffer nativeCallback_allocateBuffer(int i, boolean z) {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        if (z) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        return byteBufferAllocateDirect.order(byteOrder);
    }

    public void nativeCallback_onOpenGLDrawAfter(int i, double d) {
        InterfaceC2185721AgU interfaceC2185721AgU = this.mOpenGLCallback;
        if (interfaceC2185721AgU != null) {
            interfaceC2185721AgU.LIZIZ(d, i);
        }
    }

    public void nativeCallback_onOpenGLDrawBefore(int i, double d) {
        InterfaceC2185721AgU interfaceC2185721AgU = this.mOpenGLCallback;
        if (interfaceC2185721AgU != null) {
            interfaceC2185721AgU.LJ(d);
        }
    }

    public void nativeCallback_onWriteImageCallback(int i, int i2) {
        NativeCallbacks.IGetFrameCallback iGetFrameCallback = this.mGetFrameCallback;
        if (iGetFrameCallback != null) {
            iGetFrameCallback.onResult(i, i2);
        }
    }

    public void setScanListener(InterfaceC448730Hih interfaceC448730Hih, InterfaceC2185701AgS interfaceC2185701AgS) {
        this.mScanListener = interfaceC448730Hih;
        this.mByteBufferAllocator = interfaceC2185701AgS;
    }

    public void nativeCallback_onLensCallbackError(int i, int i2, String str) {
        NativeCallbacks.ILensCallback iLensCallback = this.mLensCallback;
        if (iLensCallback != null) {
            iLensCallback.onError(i, i2, str);
        }
    }

    public void nativeCallback_onLensCallbackSuccess(int i, float f, int i2) {
        NativeCallbacks.ILensCallback iLensCallback = this.mLensCallback;
        if (iLensCallback != null) {
            iLensCallback.onSuccess(i, f, i2);
        }
    }

    private void nativeCallback_onScanCallback(ByteBuffer byteBuffer, byte[][] bArr, int i, int i2) {
        C2185731AgV c2185731AgV;
        InterfaceC448730Hih interfaceC448730Hih = this.mScanListener;
        if (interfaceC448730Hih != null) {
            VEFrame vEFrameCreateByteBufferFrame = null;
            if (bArr != null && bArr.length != 0) {
                ArrayList arrayList = new ArrayList(bArr.length);
                int i3 = 0;
                if (i == 12) {
                    if (i2 == 2) {
                        for (byte[] bArr2 : bArr) {
                            InterfaceC2185701AgS interfaceC2185701AgS = this.mByteBufferAllocator;
                            TEParcelWrapper tEParcelWrapper = new TEParcelWrapper(bArr2);
                            s sVar = new s() { // from class: X.1AgW
                                {
                                    this.type = 1;
                                }
                            };
                            tEParcelWrapper.readInt();
                            tEParcelWrapper.readString(tEParcelWrapper.readInt());
                            tEParcelWrapper.readString(tEParcelWrapper.readInt());
                            tEParcelWrapper.readString(tEParcelWrapper.readInt());
                            tEParcelWrapper.readString(tEParcelWrapper.readInt());
                            tEParcelWrapper.readFloat();
                            new VERectF();
                            tEParcelWrapper.readFloat();
                            tEParcelWrapper.readFloat();
                            tEParcelWrapper.readFloat();
                            tEParcelWrapper.readFloat();
                            PointF pointF = new PointF();
                            pointF.x = tEParcelWrapper.readFloat();
                            pointF.y = tEParcelWrapper.readFloat();
                            tEParcelWrapper.readBoolean();
                            int i4 = tEParcelWrapper.readInt();
                            int i5 = tEParcelWrapper.readInt();
                            if (vEFrameCreateByteBufferFrame == null && byteBuffer != null && i4 > 0 && i5 > 0) {
                                vEFrameCreateByteBufferFrame = VEFrame.createByteBufferFrame(byteBuffer, i4, i5, 0, 0L, EnumC2185621AgK.TEPixFmt_RGBA8, interfaceC2185701AgS);
                            }
                            arrayList.add(sVar);
                        }
                    } else {
                        VEFrame vEFrameCreateByteBufferFrame2 = null;
                        for (byte[] bArr3 : bArr) {
                            InterfaceC2185701AgS interfaceC2185701AgS2 = this.mByteBufferAllocator;
                            if (bArr3 == null) {
                                c2185731AgV = null;
                            } else {
                                TEParcelWrapper tEParcelWrapper2 = new TEParcelWrapper(bArr3);
                                c2185731AgV = new C2185731AgV();
                                tEParcelWrapper2.readInt();
                                tEParcelWrapper2.readInt();
                                tEParcelWrapper2.readFloat();
                                new VERectF();
                                tEParcelWrapper2.readFloat();
                                tEParcelWrapper2.readFloat();
                                tEParcelWrapper2.readFloat();
                                tEParcelWrapper2.readFloat();
                                int i6 = tEParcelWrapper2.readInt();
                                int i7 = tEParcelWrapper2.readInt();
                                if (vEFrameCreateByteBufferFrame2 == null && byteBuffer != null && i6 > 0 && i7 > 0) {
                                    vEFrameCreateByteBufferFrame2 = VEFrame.createByteBufferFrame(byteBuffer, i6, i7, 0, 0L, EnumC2185621AgK.TEPixFmt_RGBA8, interfaceC2185701AgS2);
                                }
                                c2185731AgV.LIZ = vEFrameCreateByteBufferFrame2;
                            }
                            vEFrameCreateByteBufferFrame2 = c2185731AgV.LIZ;
                            arrayList.add(c2185731AgV);
                        }
                    }
                } else if (i != 11) {
                    if (i == 13) {
                        while (i3 < bArr.length) {
                            TEParcelWrapper tEParcelWrapper3 = new TEParcelWrapper(bArr[i3]);
                            C355680Dx0 c355680Dx0 = new C355680Dx0();
                            c355680Dx0.LIZ = tEParcelWrapper3.readFloat();
                            c355680Dx0.retCode = tEParcelWrapper3.readInt();
                            arrayList.add(c355680Dx0);
                            i3++;
                        }
                    }
                } else {
                    while (i3 < bArr.length) {
                        arrayList.add(VEBachQRCodeResult.fromCameraParcel(bArr[i3]));
                        i3++;
                    }
                }
                interfaceC448730Hih.LIZ(arrayList);
                return;
            }
            interfaceC448730Hih.LIZ(null);
        }
    }

    public void nativeCallback_onBufferedFrameCallback(ByteBuffer byteBuffer, int i, int i2, long j) {
        NativeCallbacks.ICameraFrameCallback iCameraFrameCallback = this.mBufferedFrameCallback;
        if (iCameraFrameCallback != null) {
            iCameraFrameCallback.onResult(byteBuffer, i, i2, j);
        }
    }

    public void nativeCallback_onCommonCallback(int i, int i2, float f, String str) {
        InterfaceC2185751AgX interfaceC2185751AgX = this.mCommonCallback;
        if (interfaceC2185751AgX != null) {
            interfaceC2185751AgX.onCallback(i, i2, f, str);
        }
    }

    public void nativeCallback_onLensCallbackInfo(int i, int i2, int i3, String str) {
        NativeCallbacks.ILensCallback iLensCallback = this.mLensCallback;
        if (iLensCallback != null) {
            iLensCallback.onInfo(i, i2, i3, str);
        }
    }

    public void nativeCallback_onGetFrameCallback(int[] iArr, int i, int i2, long j, boolean z, int i3) {
        NativeCallbacks.IGetFrameCallback iGetFrameCallback = this.mGetFrameCallback;
        if (iGetFrameCallback != null) {
            iGetFrameCallback.onResult(iArr, i, i2, j, z, i3);
        }
    }

    public void nativeCallback_onTextureFrameCallback(int i, float[] fArr, int i2, int i3, int i4, long j) {
        NativeCallbacks.ICameraFrameCallback iCameraFrameCallback = this.mTextureFrameCallback;
        if (iCameraFrameCallback != null) {
            iCameraFrameCallback.onResult(i, fArr, i2, i3, i4, j);
        }
    }

    public void nativeCallback_onGetFrameCallback(String str, int i, int i2, long j, boolean z, int i3, int i4) {
        if (this.mGetFrameCallback != null) {
            this.mGetFrameCallback.onResult(VEFrame.createTextureFrame(str, i, i2, 0, j, EnumC2185621AgK.TEPixFmt_OpenGL_RGBA8), z, i3, i4);
        }
    }
}
