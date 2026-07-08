package com.lynx.tasm.rendernode.compat;

import android.graphics.Canvas;
import android.view.HardwareCanvas;
import android.view.RenderNode;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes33.dex */
public class RenderNodeV21Impl extends RenderNodeCompat {
    public static Method sStartMethod;
    public RenderNode renderNode;

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public boolean hasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void init() {
        this.renderNode = RenderNode.create("", (View) null);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public Object getRenderNode() {
        return this.renderNode;
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas) {
        ((HardwareCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void endRecording(Canvas canvas) {
        this.renderNode.end((HardwareCanvas) canvas);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public HardwareCanvas beginRecording(int i, int i2) {
        try {
            if (sStartMethod == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = RenderNode.class.getDeclaredMethod("start", cls, cls);
                sStartMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return (HardwareCanvas) sStartMethod.invoke(this.renderNode, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas, Object obj) {
        ((HardwareCanvas) canvas).drawRenderNode((RenderNode) obj);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void setPosition(int i, int i2, int i3, int i4) {
        this.renderNode.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
