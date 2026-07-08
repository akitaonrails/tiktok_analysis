package com.ss.android.ttve.nativePort;

import X.C1AM2;
import X.C1AM3;
import X.C1AM4;
import X.C1AM5;
import X.C1AM6;
import X.C2178031ALx;
import X.C2188811AlT;
import X.C2484209oO;
import X.EnumC1687420u0q;
import X.InterfaceC21621119jV;
import X.InterfaceC2177981ALs;
import X.InterfaceC2178021ALw;
import X.InterfaceC2254431DLt;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.vesdk.VERecorder;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class TEEffectInterfaceV2 implements InterfaceC2254431DLt {
    public TEEffectCallback mEffectCallback = new TEEffectCallback();
    public volatile long mHandle;

    private native int nativeCallEffectAPI(long j, VERecorder.IVECallEffectAPIRunnable iVECallEffectAPIRunnable, int i, String str);

    private native int nativeCallEffectInterface(long j, long j2);

    private native int nativeCallEffectInterfaceWithObjectParams(long j, long j2, Object[] objArr);

    private native Object nativeCallEffectInterfaceWithObjectResult(long j, long j2);

    private native int nativeCallEffectInterfaceWithResult(long j, long j2, long j3);

    private native int nativeSetEffectCallback(long j, TEEffectCallback tEEffectCallback);

    private native int nativeSetEffectGeneralCallback(long j, VERecorder.IVEEffectGeneralCallback iVEEffectGeneralCallback);

    private void setEffectCallback() {
        if (this.mEffectCallback != null) {
            nativeSetEffectCallback(this.mHandle, this.mEffectCallback);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void release() {
        C2484209oO.LJI("TEEffectInterface", "release...");
        this.mEffectCallback = null;
        this.mHandle = 0L;
    }

    @Override // X.InterfaceC2254431DLt
    public void unregBachAlgorithmCallback() {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.unregBachAlgorithmCallback();
        }
    }

    public TEEffectInterfaceV2(long j) {
        this.mHandle = j;
        setEffectCallback();
    }

    @Override // X.InterfaceC2254431DLt
    public int callEffectInterface(TEBundle tEBundle) {
        if (this.mHandle == 0) {
            C2484209oO.LJIIIIZZ("TEEffectInterface", "callEffectInterface, but mHandle is invalid.");
            return -112;
        }
        int iNativeCallEffectInterface = nativeCallEffectInterface(this.mHandle, tEBundle.getHandle());
        tEBundle.recycle();
        return iNativeCallEffectInterface;
    }

    @Override // X.InterfaceC2254431DLt
    public Object callEffectInterfaceWithResult(TEBundle tEBundle) {
        if (this.mHandle == 0) {
            C2484209oO.LJIIIIZZ("TEEffectInterface", "callEffectInterfaceWithResult, but mHandle is invalid.");
            return null;
        }
        Object objNativeCallEffectInterfaceWithObjectResult = nativeCallEffectInterfaceWithObjectResult(this.mHandle, tEBundle.getHandle());
        tEBundle.recycle();
        return objNativeCallEffectInterfaceWithObjectResult;
    }

    @Override // X.InterfaceC2254431DLt
    public void regBachAlgorithmCallback(List<C2178031ALx> list) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.regBachAlgorithmCallback(list);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setARTextBitmapCallback(InterfaceC21621119jV interfaceC21621119jV) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setARTextBitmapCallback(interfaceC21621119jV);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setARTextLimitCountCallback(InterfaceC2177981ALs interfaceC2177981ALs) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setARTextLimitCountCallback(interfaceC2177981ALs);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setARTextParagraphContentCallback(InterfaceC2177981ALs interfaceC2177981ALs) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setARTextParagraphContentCallback(interfaceC2177981ALs);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setEffectAlgorithmInfoCallback(C1AM2 c1am2) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setEffectAlgorithmInfoCallback(c1am2);
        }
    }

    public int setEffectGeneralCallback(VERecorder.IVEEffectGeneralCallback iVEEffectGeneralCallback) {
        if (this.mHandle == 0) {
            C2484209oO.LJIIIIZZ("TEEffectInterface", "setEffectGeneralCallback, but mHandle is invalid.");
            return -1;
        }
        return nativeSetEffectGeneralCallback(this.mHandle, iVEEffectGeneralCallback);
    }

    @Override // X.InterfaceC2254431DLt
    public void setFaceDetectListener(C1AM6 c1am6) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setFaceDetectListener(c1am6);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setFaceInfoCallback(C1AM3 c1am3) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setFaceInfoCallback(c1am3);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setLandMarkDetectCallback(C1AM5 c1am5) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setLandmarkDetectListener(c1am5);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setSkeletonDetectCallback(InterfaceC2178021ALw interfaceC2178021ALw) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setSkeletonDetectCallback(interfaceC2178021ALw);
        } else {
            C2484209oO.LIZJ("TEEffectInterface", "setSkeletonDetectCallback failed");
        }
    }

    public void setSmartBeautyCallback(C1AM4 c1am4) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setOnSmartBeautyListener(c1am4);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setStickerRequestCallback(iStickerRequestCallback);
        }
    }

    @Override // X.InterfaceC2254431DLt
    public int callEffectInterfaceWithObjectParams(TEBundle tEBundle, Object[] objArr) {
        if (this.mHandle == 0) {
            C2484209oO.LJIIIIZZ("TEEffectInterface", "callEffectInterface, but mHandle is invalid.");
            return -112;
        }
        int iNativeCallEffectInterfaceWithObjectParams = nativeCallEffectInterfaceWithObjectParams(this.mHandle, tEBundle.getHandle(), objArr);
        tEBundle.recycle();
        return iNativeCallEffectInterfaceWithObjectParams;
    }

    @Override // X.InterfaceC2254431DLt
    public int callEffectInterfaceWithResult(TEBundle tEBundle, TEBundle tEBundle2) {
        if (this.mHandle == 0) {
            C2484209oO.LJIIIIZZ("TEEffectInterface", "callEffectInterfaceWithResult, but mHandle is invalid.");
            return -1;
        }
        int iNativeCallEffectInterfaceWithResult = nativeCallEffectInterfaceWithResult(this.mHandle, tEBundle.getHandle(), tEBundle2.getHandle());
        tEBundle.recycle();
        return iNativeCallEffectInterfaceWithResult;
    }

    @Override // X.InterfaceC2254431DLt
    public int callEffectAPI(VERecorder.IVECallEffectAPIRunnable iVECallEffectAPIRunnable, EnumC1687420u0q enumC1687420u0q, String str) {
        if (this.mHandle == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("callEffectAPI, but mHandle is invalid. context: ");
            sbLIZ.append(str);
            C2484209oO.LJIIIIZZ("TEEffectInterface", C2188811AlT.LIZIZ(sbLIZ));
            return -1;
        }
        return nativeCallEffectAPI(this.mHandle, iVECallEffectAPIRunnable, enumC1687420u0q.ordinal(), str);
    }
}
