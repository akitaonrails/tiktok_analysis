package com.ss.android.ugc.aweme.net.experiment;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C1499060p72;
import X.C452501pT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomNetTimeOutExperiment {
    public static final EcomNetTimeoutConfigModel[] LIZ = new EcomNetTimeoutConfigModel[0];
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1499060p72());

    public static final class EcomNetTimeoutConfigModel {

        @C09CT("socket_connect_timeout")
        public final long connectLimit;

        @C09CT("path")
        public final Set<String> pathSet;

        @C09CT("protect_timeout")
        public final long protectLimit;

        @C09CT("socket_read_timeout")
        public final long readLimit;

        @C09CT("socket_write_timeout")
        public final long writeLimit;

        public EcomNetTimeoutConfigModel() {
            this(null, 0L, 0L, 0L, 0L, 31, null);
        }

        public EcomNetTimeoutConfigModel(Set<String> set, long j, long j2, long j3, long j4) {
            this.pathSet = set;
            this.connectLimit = j;
            this.readLimit = j2;
            this.writeLimit = j3;
            this.protectLimit = j4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EcomNetTimeoutConfigModel(Set set, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            long j5 = j4;
            long j6 = j2;
            long j7 = j;
            Set set2 = (i & 1) != 0 ? C08CX.INSTANCE : set;
            j7 = (i & 2) != 0 ? 15000L : j7;
            j6 = (i & 4) != 0 ? 15000L : j6;
            long j8 = (i & 8) == 0 ? j3 : 15000L;
            this(set2, j7, j6, j8, (i & 16) != 0 ? j7 + j6 + j8 : j5);
        }
    }
}
