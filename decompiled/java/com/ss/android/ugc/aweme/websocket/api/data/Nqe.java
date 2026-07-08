package com.ss.android.ugc.aweme.websocket.api.data;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class Nqe {

    @C09CT("http_rtt")
    public Integer httpRtt;

    @C09CT("real_net_type")
    public Integer realNetType;

    @C09CT("tcp_rtt")
    public Integer tcpRtt;

    public Nqe() {
        this(null, null, null);
    }

    public Nqe(Integer num, Integer num2, Integer num3) {
        this.httpRtt = num;
        this.realNetType = num2;
        this.tcpRtt = num3;
    }
}
