package com.bytedance.effectcreatormobile.infrastructure.network.model;

/* JADX INFO: loaded from: classes.dex */
public final class ServerTimeExtra {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: dc, reason: collision with root package name */
    public final String f328dc;
    public final String logid;
    public final long now;
    public final long server_stream_time;

    public ServerTimeExtra() {
        this(0L, null, 0L, null);
    }

    public ServerTimeExtra(long j, String str, long j2, String str2) {
        this.now = j;
        this.logid = str;
        this.server_stream_time = j2;
        this.f328dc = str2;
    }
}
