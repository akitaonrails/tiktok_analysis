package com.ss.android.ugc.aweme.net.model;

/* JADX INFO: loaded from: classes14.dex */
public final class UnexpectedNetworkMonitorConfig {
    public final UnexpectedConfig[] responses;
    public final UnexpectedConfig[] urls;

    public UnexpectedNetworkMonitorConfig(UnexpectedConfig[] unexpectedConfigArr, UnexpectedConfig[] unexpectedConfigArr2) {
        this.urls = unexpectedConfigArr;
        this.responses = unexpectedConfigArr2;
    }
}
