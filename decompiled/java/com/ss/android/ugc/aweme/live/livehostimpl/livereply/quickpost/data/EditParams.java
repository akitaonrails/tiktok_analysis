package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class EditParams implements Serializable {
    public static final int $stable = 8;
    public int endTime;
    public EditRenderElementsLocal renderElements;
    public int startTime;

    public EditParams() {
        this(0, 0, null);
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setRenderElements(EditRenderElementsLocal editRenderElementsLocal) {
        this.renderElements = editRenderElementsLocal;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public EditParams(int i, int i2, EditRenderElementsLocal editRenderElementsLocal) {
        this.startTime = i;
        this.endTime = i2;
        this.renderElements = editRenderElementsLocal;
    }
}
