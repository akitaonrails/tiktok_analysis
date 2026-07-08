package com.lynx.canvas;

import X.C1288370jdD;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1283810jVr;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes21.dex */
public class FirstFrameAwareSurfaceTexture extends SurfaceTexture implements SurfaceTexture.OnFrameAvailableListener {
    public InterfaceC1283810jVr LL;
    public Handler LLILLJJLI;
    public boolean mFirstFrameHasPassed;

    public FirstFrameAwareSurfaceTexture() {
        super(0);
        super.setOnFrameAvailableListener(this, new BPEAHandler(Looper.getMainLooper()));
    }

    @Override // android.graphics.SurfaceTexture
    public void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release with ");
        sbLIZ.append(this);
        C1288370jdD.LIZJ("KryptonFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
        super.release();
    }

    /* JADX INFO: renamed from: com.lynx.canvas.FirstFrameAwareSurfaceTexture$1, reason: invalid class name */
    public class AnonymousClass1 extends BPEAHandler {
        public final /* synthetic */ SurfaceTexture.OnFrameAvailableListener LL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("FirstFrameAwareSurfaceTexture@bfae.setOnFrameAvailableListenerInternal$1");
            this.LL.onFrameAvailable(FirstFrameAwareSurfaceTexture.this);
            C1C7U.LIZIZ("FirstFrameAwareSurfaceTexture@bfae.setOnFrameAvailableListenerInternal$1");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Looper looper, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
            super(looper, null);
            this.LL = onFrameAvailableListener;
        }
    }

    public final void LIZIZ(InterfaceC1283810jVr interfaceC1283810jVr) {
        this.LL = interfaceC1283810jVr;
        if (this.mFirstFrameHasPassed) {
            ((SurfaceHolder) interfaceC1283810jVr).LIZJ();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Handler handler = this.LLILLJJLI;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(0);
            messageObtainMessage.setAsynchronous(true);
            C786410Ut5.LJLJJL(this.LLILLJJLI, messageObtainMessage);
        }
        if (!this.mFirstFrameHasPassed) {
            this.mFirstFrameHasPassed = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger first frame callback with ");
            sbLIZ.append(this.LL);
            C1288370jdD.LIZJ("KryptonFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1283810jVr interfaceC1283810jVr = this.LL;
            if (interfaceC1283810jVr != null) {
                ((SurfaceHolder) interfaceC1283810jVr).LIZJ();
            }
        }
    }

    @Override // android.graphics.SurfaceTexture
    public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        if (onFrameAvailableListener != null) {
            this.LLILLJJLI = new AnonymousClass1(Looper.getMainLooper(), onFrameAvailableListener);
        } else {
            this.LLILLJJLI = null;
        }
    }

    @Override // android.graphics.SurfaceTexture
    public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        Looper mainLooper;
        if (onFrameAvailableListener != null) {
            if (handler != null) {
                mainLooper = handler.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            this.LLILLJJLI = new AnonymousClass1(mainLooper, onFrameAvailableListener);
            return;
        }
        this.LLILLJJLI = null;
    }
}
