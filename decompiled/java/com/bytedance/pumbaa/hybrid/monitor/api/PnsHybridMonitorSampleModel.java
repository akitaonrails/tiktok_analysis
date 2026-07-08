package com.bytedance.pumbaa.hybrid.monitor.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsHybridMonitorSampleModel {

    @C09CT("jsb")
    public double jsb;

    @C09CT("jsinjection")
    public double jsinjection;

    @C09CT("webview")
    public double webview;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsHybridMonitorSampleModel)) {
            return false;
        }
        PnsHybridMonitorSampleModel pnsHybridMonitorSampleModel = (PnsHybridMonitorSampleModel) obj;
        return Double.compare(this.webview, pnsHybridMonitorSampleModel.webview) == 0 && Double.compare(this.jsb, pnsHybridMonitorSampleModel.jsb) == 0 && Double.compare(this.jsinjection, pnsHybridMonitorSampleModel.jsinjection) == 0;
    }

    public PnsHybridMonitorSampleModel() {
        this(0.01d, 0.01d, 0.01d);
    }

    public PnsHybridMonitorSampleModel(double d, double d2, double d3) {
        this.webview = d;
        this.jsb = d2;
        this.jsinjection = d3;
    }
}
