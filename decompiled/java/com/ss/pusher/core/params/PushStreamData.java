package com.ss.pusher.core.params;

import X.C01GW;
import X.C09CT;
import X.C1908507dj;
import X.C2097608Jq;
import X.C452501pT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class PushStreamData {
    public static final C1908507dj LIZIZ = new C1908507dj();

    @C09CT("node_infos")
    public final Map<String, List<NodeInfo>> nodeInfoMap = C2097608Jq.LJ();
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 81));

    /* JADX INFO: loaded from: classes14.dex */
    public static final class NodeInfo {

        @C09CT("DomainParseType")
        public final int domainParseType = 1;

        @C09CT("IP")
        public final String ip = "";

        @C09CT("ProtocolType")
        public final int protocolType;
    }
}
