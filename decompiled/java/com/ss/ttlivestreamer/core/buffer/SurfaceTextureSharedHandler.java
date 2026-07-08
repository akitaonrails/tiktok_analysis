package com.ss.ttlivestreamer.core.buffer;

import X.C2188811AlT;
import X.InterfaceC1270400jAE;
import android.view.Surface;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public final class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
    public static final String LIZ = SurfaceTextureSharedHandler.class.getSimpleName();

    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
    public final void handlerExit() {
    }

    public static class SurfaceInternal extends Surface implements InterfaceC1270400jAE {
        public final int mHeight;
        public InterfaceC1270400jAE mListerne;
        public SurfaceTextureSharedHandler mParent;
        public final int mWidth;

        @Override // android.view.Surface
        public final void release() {
            super.release();
            SurfaceTextureSharedHandler surfaceTextureSharedHandler = this.mParent;
            if (surfaceTextureSharedHandler != null) {
                surfaceTextureSharedHandler.dispose();
                this.mParent = null;
            }
            String str = SurfaceTextureSharedHandler.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Release surface ");
            sbLIZ.append(this);
            sbLIZ.append(" with w ");
            sbLIZ.append(this.mWidth);
            sbLIZ.append(" h ");
            sbLIZ.append(this.mHeight);
            AVLog.iow(str, C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1270400jAE
        public final void LLII(long j, int i, float[] fArr) {
            InterfaceC1270400jAE interfaceC1270400jAE = this.mListerne;
            if (interfaceC1270400jAE != null) {
                interfaceC1270400jAE.LLII(j, i, fArr);
            }
            this.mParent.returnTextureFrame();
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
    public final void dispose() {
        super.dispose();
        GLThreadManager.get().decrementRef();
    }
}
