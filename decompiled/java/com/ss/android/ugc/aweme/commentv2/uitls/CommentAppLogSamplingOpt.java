package com.ss.android.ugc.aweme.commentv2.uitls;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentAppLogSamplingOpt {
    public static final CommentAppLogSamplingOpt LIZ = new CommentAppLogSamplingOpt();
    public static final Config LIZIZ = new Config(false, false, Collections.singletonList("view_comment"));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(202));

    public static final class Config {

        @C09CT("enable_after_process")
        public final boolean enableAfterProcess;

        @C09CT("enable_before_process")
        public final boolean enableBeforeProcess;

        @C09CT("before_process_event_name_list")
        public final List<String> samplingEventList;

        public Config() {
            this(false, false, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enableBeforeProcess == config.enableBeforeProcess && this.enableAfterProcess == config.enableAfterProcess && Intrinsics.LJFF(this.samplingEventList, config.samplingEventList);
        }

        public final int hashCode() {
            int iZ2 = ((C786410Ut5.Z2(this.enableBeforeProcess) * 31) + C786410Ut5.Z2(this.enableAfterProcess)) * 31;
            List<String> list = this.samplingEventList;
            return iZ2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enableBeforeProcess=");
            sbLIZ.append(this.enableBeforeProcess);
            sbLIZ.append(", enableAfterProcess=");
            sbLIZ.append(this.enableAfterProcess);
            sbLIZ.append(", samplingEventList=");
            sbLIZ.append(this.samplingEventList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, boolean z2, List<String> list) {
            this.enableBeforeProcess = z;
            this.enableAfterProcess = z2;
            this.samplingEventList = list;
        }
    }
}
