package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes18.dex */
public final class LayerInfo {
    public int layer;
    public int order;

    public LayerInfo() {
    }

    public final int getLayer() {
        return this.layer;
    }

    public final int getOrder() {
        return this.order;
    }

    public final void setLayer(int i) {
        this.layer = i;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public LayerInfo(int i, int i2) {
        this();
        this.layer = i;
        this.order = i2;
    }
}
