package com.lynx.canvas;

import X.C2188811AlT;
import X.EnumC1285200jY6;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.lynx.base.log.LynxLog;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class UICanvasSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public PlatformCanvasView LL;
    public long LLILLJJLI;
    public final float LLILLL;

    private native long nativeCreateSurface(Surface surface);

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceCreated ");
        sbLIZ.append(surfaceHolder);
        LynxLog.i("KryptonUISurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = nativeCreateSurface(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceDestroyed ");
        sbLIZ.append(surfaceHolder);
        LynxLog.i("KryptonUISurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LJI();
        this.LLILLJJLI = 0L;
    }

    public UICanvasSurfaceView(s sVar, int i) {
        super(sVar);
        getHolder().addCallback(this);
        if (i == 1) {
            setZOrderOnTop(true);
        } else if (i == 2) {
            setZOrderMediaOverlay(true);
        }
        getHolder().setFormat(1);
        this.LLILLL = getContext().getResources().getDisplayMetrics().density;
        this.LL = new PlatformCanvasView();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceChanged ");
        sbLIZ.append(surfaceHolder);
        sbLIZ.append(" ");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(i2);
        sbLIZ.append(" ");
        sbLIZ.append(i3);
        LynxLog.i("KryptonUISurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        PlatformCanvasView platformCanvasView = this.LL;
        long j = this.LLILLJJLI;
        platformCanvasView.getClass();
        platformCanvasView.LJ(j, i2, i3, EnumC1285200jY6.SCALE_TO_FILL);
    }
}
