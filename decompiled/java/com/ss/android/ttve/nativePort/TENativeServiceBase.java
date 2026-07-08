package com.ss.android.ttve.nativePort;

import X.C2185851Agh;
import X.C2185861Agi;
import X.InterfaceC1464170oCl;
import X.InterfaceC2185721AgU;
import X.InterfaceC2185751AgX;
import X.InterfaceC2185781Aga;
import X.InterfaceC2185791Agb;
import X.InterfaceC2185801Agc;
import X.InterfaceC2185811Agd;
import X.InterfaceC2185821Age;
import X.InterfaceC2185831Agf;
import X.InterfaceC2185841Agg;

/* JADX INFO: loaded from: classes34.dex */
public class TENativeServiceBase {
    public InterfaceC2185781Aga mAudioExtendToFileCallback;
    public InterfaceC2185801Agc mEncoderDataCallback;
    public InterfaceC2185791Agb mExtractFrameProcessCallback;
    public InterfaceC2185821Age mGetImageCallback;
    public InterfaceC2185811Agd mKeyFrameCallback;
    public InterfaceC2185831Agf mMVInitedCallback;
    public InterfaceC2185841Agg mMattingCallback;
    public InterfaceC2185751AgX mOnErrorListener;
    public InterfaceC2185751AgX mOnInfoListener;
    public InterfaceC2185721AgU mOpenGLCallback;
    public InterfaceC2185821Age mSeekFrameCallback;

    public void nativeCallback_onExtractFrameProcess(float f) {
    }

    public void setExtractFrameProcessCallback(InterfaceC2185791Agb interfaceC2185791Agb) {
    }

    public void nativeCallback_onAudioExtendToFileCancel() {
        InterfaceC2185781Aga interfaceC2185781Aga = this.mAudioExtendToFileCallback;
        if (interfaceC2185781Aga != null) {
            interfaceC2185781Aga.getClass();
        }
    }

    public void nativeCallback_onMVInited() {
        InterfaceC2185831Agf interfaceC2185831Agf = this.mMVInitedCallback;
        if (interfaceC2185831Agf != null) {
            ((C2185861Agi) interfaceC2185831Agf).LIZ.getClass();
        }
    }

    public void nativeCallback_onMattingStartedCallback() {
        if (this.mMattingCallback != null) {
            throw null;
        }
    }

    public InterfaceC2185801Agc getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public InterfaceC2185751AgX getErrorListener() {
        return this.mOnErrorListener;
    }

    public InterfaceC2185751AgX getInfoListener() {
        return this.mOnInfoListener;
    }

    public InterfaceC2185721AgU getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void nativeCallback_onAudioExtendToFileFinish(boolean z) {
        InterfaceC2185781Aga interfaceC2185781Aga = this.mAudioExtendToFileCallback;
        if (interfaceC2185781Aga != null) {
            interfaceC2185781Aga.getClass();
        }
    }

    public void nativeCallback_onAudioExtendToFileProcess(float f) {
        InterfaceC2185781Aga interfaceC2185781Aga = this.mAudioExtendToFileCallback;
        if (interfaceC2185781Aga != null) {
            interfaceC2185781Aga.getClass();
        }
    }

    public void nativeCallback_onMattingDoneCallback(float f) {
        if (this.mMattingCallback == null) {
        } else {
            throw null;
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

    public void setAudioExtendToFileCallback(InterfaceC2185781Aga interfaceC2185781Aga) {
        this.mAudioExtendToFileCallback = interfaceC2185781Aga;
    }

    public void setEncoderDataListener(InterfaceC2185801Agc interfaceC2185801Agc) {
        this.mEncoderDataCallback = interfaceC2185801Agc;
    }

    public void setErrorListener(InterfaceC2185751AgX interfaceC2185751AgX) {
        this.mOnErrorListener = interfaceC2185751AgX;
    }

    public void setGetImageCallback(InterfaceC2185821Age interfaceC2185821Age) {
        this.mGetImageCallback = interfaceC2185821Age;
    }

    public void setGetSeekFrameCallback(InterfaceC2185821Age interfaceC2185821Age) {
        this.mGetImageCallback = interfaceC2185821Age;
    }

    public void setInfoListener(InterfaceC2185751AgX interfaceC2185751AgX) {
        this.mOnInfoListener = interfaceC2185751AgX;
    }

    public void setKeyFrameCallback(InterfaceC2185811Agd interfaceC2185811Agd) {
        this.mKeyFrameCallback = interfaceC2185811Agd;
    }

    public void setMattingCallback(InterfaceC2185841Agg interfaceC2185841Agg) {
        this.mMattingCallback = interfaceC2185841Agg;
    }

    public void setOpenGLListeners(InterfaceC2185721AgU interfaceC2185721AgU) {
        this.mOpenGLCallback = interfaceC2185721AgU;
    }

    public void setSeekFrameCallback(InterfaceC2185821Age interfaceC2185821Age) {
        this.mSeekFrameCallback = interfaceC2185821Age;
    }

    public void setmMVInitedCallback(InterfaceC2185831Agf interfaceC2185831Agf) {
        this.mMVInitedCallback = interfaceC2185831Agf;
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

    public void nativeCallback_onDisplayCallback(int i, int i2, int i3) {
        if (this.mKeyFrameCallback == null) {
        } else {
            throw null;
        }
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        InterfaceC2185751AgX interfaceC2185751AgX = this.mOnInfoListener;
        if (interfaceC2185751AgX != null) {
            interfaceC2185751AgX.onCallback(i, i2, f, null);
        }
    }

    public void nativeCallback_onMattingErrorCallback(int i, int i2, float f) {
        if (this.mMattingCallback == null) {
        } else {
            throw null;
        }
    }

    public void nativeCallback_onProcessCallback(int i, int i2, String str) {
        if (this.mKeyFrameCallback == null) {
        } else {
            throw null;
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, long j, int i, boolean z) {
        InterfaceC1464170oCl interfaceC1464170oCl;
        InterfaceC2185801Agc interfaceC2185801Agc = this.mEncoderDataCallback;
        if (interfaceC2185801Agc != null) {
            C2185851Agh c2185851Agh = (C2185851Agh) interfaceC2185801Agc;
            c2185851Agh.getClass();
            if (bArr != null && j >= 0 && i > 0 && (interfaceC1464170oCl = c2185851Agh.LIZ.LLLL) != null) {
                interfaceC1464170oCl.onEncoderDataAvailable(bArr, j, i, z);
            }
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        InterfaceC2185751AgX interfaceC2185751AgX = this.mOnErrorListener;
        if (interfaceC2185751AgX != null) {
            interfaceC2185751AgX.onCallback(i, i2, f, str);
        }
    }

    public void nativeCallback_onMattingProgressCallback(int i, float f, float f2, boolean z) {
        if (this.mMattingCallback == null) {
        } else {
            throw null;
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i, int i2, int i3, float f) {
        InterfaceC2185821Age interfaceC2185821Age = this.mGetImageCallback;
        if (interfaceC2185821Age != null) {
            return interfaceC2185821Age.LIZ(bArr, i, i2, i3, f);
        }
        return 0;
    }

    public int nativeCallback_onSeekFrameData(byte[] bArr, int i, int i2, int i3, float f) {
        InterfaceC2185821Age interfaceC2185821Age = this.mSeekFrameCallback;
        if (interfaceC2185821Age != null) {
            return interfaceC2185821Age.LIZ(bArr, i, i2, i3, f);
        }
        return 0;
    }
}
