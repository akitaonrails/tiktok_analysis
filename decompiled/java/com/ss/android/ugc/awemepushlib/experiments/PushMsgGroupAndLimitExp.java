package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class PushMsgGroupAndLimitExp {
    public static final MetaData LIZ = new MetaData(false, false, 20, 10);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(188));

    public static final boolean LIZ() {
        return ((MetaData) LIZIZ.getValue()).enable;
    }

    public static final boolean LIZIZ() {
        return LIZ() && ((MetaData) LIZIZ.getValue()).enableCustomGroup;
    }

    public static final class MetaData {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_custom_push_group")
        public final boolean enableCustomGroup;

        @C09CT("push_custom_group_cnt_up_limit")
        public final int pushCustomGroupCntUpLimit;

        @C09CT("push_msg_cnt_up_limit")
        public final int pushMsgCntUpLimit;

        public MetaData() {
            this(false, false, 20, 10);
        }

        public MetaData(boolean z, boolean z2, int i, int i2) {
            this.enable = z;
            this.enableCustomGroup = z2;
            this.pushMsgCntUpLimit = i;
            this.pushCustomGroupCntUpLimit = i2;
        }
    }
}
