package com.lynx.tasm.rendernode.compat;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes21.dex */
public class RenderNodeImpl extends RenderNodeCompat {
    public RenderNode renderNode;

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public boolean hasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void init() {
        this.renderNode = new RenderNode("");
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public Object getRenderNode() {
        return this.renderNode;
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas) {
        ((RecordingCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void endRecording(Canvas canvas) {
        this.renderNode.endRecording();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public RecordingCanvas beginRecording(int i, int i2) {
        return this.renderNode.beginRecording();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas, Object obj) {
        canvas.drawRenderNode((RenderNode) obj);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void setPosition(int i, int i2, int i3, int i4) {
        this.renderNode.setPosition(i, i2, i3, i4);
    }
}
