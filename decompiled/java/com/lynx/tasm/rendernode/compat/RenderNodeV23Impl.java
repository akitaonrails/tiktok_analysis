package com.lynx.tasm.rendernode.compat;

import android.graphics.Canvas;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public class RenderNodeV23Impl extends RenderNodeCompat {
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
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void endRecording(Canvas canvas) {
        this.renderNode.end((DisplayListCanvas) canvas);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public DisplayListCanvas beginRecording(int i, int i2) {
        return this.renderNode.start(i, i2);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas, Object obj) {
        ((DisplayListCanvas) canvas).drawRenderNode((RenderNode) obj);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void setPosition(int i, int i2, int i3, int i4) {
        this.renderNode.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
