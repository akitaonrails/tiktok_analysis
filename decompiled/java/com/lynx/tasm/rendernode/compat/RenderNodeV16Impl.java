package com.lynx.tasm.rendernode.compat;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import android.view.HardwareCanvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes33.dex */
public class RenderNodeV16Impl extends RenderNodeV14Impl {
    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public boolean hasDisplayList() {
        return this.displayList.isValid();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void init() {
        try {
            if (this.sGLESConstructor == null) {
                Constructor<?> declaredConstructor = Class.forName("android.view.GLES20DisplayList").getDeclaredConstructor(String.class);
                this.sGLESConstructor = declaredConstructor;
                declaredConstructor.setAccessible(true);
            }
            this.displayList = (DisplayList) this.sGLESConstructor.newInstance("");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas) {
        drawRenderNode(canvas, this.displayList);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void endRecording(Canvas canvas) {
        ((HardwareCanvas) canvas).onPostDraw();
        this.displayList.end();
        this.displayList.setCaching(true);
        this.displayList.setLeftTopRightBottom(this.left, this.top, this.right, this.bottom);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public Canvas beginRecording(int i, int i2) {
        HardwareCanvas hardwareCanvasStart = this.displayList.start();
        setViewport(i, i2, hardwareCanvasStart);
        hardwareCanvasStart.onPreDraw((Rect) null);
        return hardwareCanvasStart;
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas, Object obj) {
        ((HardwareCanvas) canvas).drawDisplayList((DisplayList) obj, (Rect) null, 1);
    }
}
