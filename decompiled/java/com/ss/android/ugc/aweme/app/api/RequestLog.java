package com.ss.android.ugc.aweme.app.api;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public class RequestLog {

    @C09CT("other")
    public Other other;

    @C09CT("timing")
    public Timing timing;

    public static class DetailedDuration {

        @C09CT("body_recv")
        public String bodyRecv;

        @C09CT("dns")
        public String dns;

        @C09CT("inner")
        public String inner;

        @C09CT("rtt")
        public String rtt;

        @C09CT("send")
        public String send;

        @C09CT("ssl")
        public String ssl;

        @C09CT("tcp")
        public String tcp;

        @C09CT("ttfb")
        public String ttfb;
    }

    public static class Other {

        @C09CT("libcore")
        public String libcore;
    }

    public static class Timing {

        @C09CT("detailed_duration")
        public DetailedDuration detailedDuration;
    }
}
