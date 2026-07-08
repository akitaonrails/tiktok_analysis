package com.lynx.tasm.rendernode.compat;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes33.dex */
public class RenderNodeV18Impl extends RenderNodeV16Impl {
    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public /* bridge */ /* synthetic */ Object getRenderNode() {
        return super.getRenderNode();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV16Impl, com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public /* bridge */ /* synthetic */ boolean hasDisplayList() {
        return super.hasDisplayList();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV16Impl, com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public /* bridge */ /* synthetic */ void init() {
        super.init();
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV16Impl, com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public /* bridge */ /* synthetic */ void drawRenderNode(Canvas canvas) {
        super.drawRenderNode(canvas);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV16Impl, com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void endRecording(Canvas canvas) {
        this.displayList.end();
        this.displayList.setCaching(true);
        this.displayList.setLeftTopRightBottom(this.left, this.top, this.right, this.bottom);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV16Impl, com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public Canvas beginRecording(int i, int i2) {
        return this.displayList.start(i, i2);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV16Impl, com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public /* bridge */ /* synthetic */ void drawRenderNode(Canvas canvas, Object obj) {
        super.drawRenderNode(canvas, obj);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeV14Impl, com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public /* bridge */ /* synthetic */ void setPosition(int i, int i2, int i3, int i4) {
        super.setPosition(i, i2, i3, i4);
    }
}
