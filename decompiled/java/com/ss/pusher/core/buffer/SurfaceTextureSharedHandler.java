package com.ss.pusher.core.buffer;

import X.C2188811AlT;
import X.InterfaceC1273800jFi;
import android.view.Surface;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public final class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
    public static final String LIZ = SurfaceTextureSharedHandler.class.getSimpleName();

    @Override // com.ss.pusher.core.buffer.SurfaceTextureHelper
    public final void handlerExit() {
    }

    public static class SurfaceInternal extends Surface implements InterfaceC1273800jFi {
        public final int mHeight;
        public InterfaceC1273800jFi mListerne;
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

        public final void LIZ(long j, int i, float[] fArr) {
            InterfaceC1273800jFi interfaceC1273800jFi = this.mListerne;
            if (interfaceC1273800jFi != null) {
                ((SurfaceInternal) interfaceC1273800jFi).LIZ(j, i, fArr);
            }
            this.mParent.returnTextureFrame();
        }
    }

    @Override // com.ss.pusher.core.buffer.SurfaceTextureHelper
    public final void dispose() {
        super.dispose();
        GLThreadManager.LJ().LIZIZ();
    }
}
