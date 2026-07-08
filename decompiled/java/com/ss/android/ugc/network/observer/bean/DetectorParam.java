package com.ss.android.ugc.network.observer.bean;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes24.dex */
public final class DetectorParam {

    @C09CT("black_timeout")
    public int blackTimeout;

    @C09CT("dns_timeout")
    public int dnsTimeout;

    @C09CT("frequency_limit")
    public int frequencyLimit;

    @C09CT("ping_timeout")
    public int pingTimeout;

    @C09CT("start_timeout")
    public int startTimeout;

    @C09CT("target_list")
    public String[] targetList;

    @C09CT("tcp_timeout")
    public int tcpTimeout;

    public DetectorParam() {
        this.startTimeout = 5000;
        this.dnsTimeout = 2000;
        this.pingTimeout = LivePreCreateNextRoomPlayer.ENABLE;
        this.tcpTimeout = 4000;
        this.blackTimeout = 300000;
        this.frequencyLimit = 4;
        this.targetList = new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"};
    }

    public DetectorParam(String[] strArr) {
        this.startTimeout = 5000;
        this.dnsTimeout = 2000;
        this.pingTimeout = LivePreCreateNextRoomPlayer.ENABLE;
        this.tcpTimeout = 4000;
        this.blackTimeout = 300000;
        this.frequencyLimit = 4;
        this.targetList = strArr;
    }
}
