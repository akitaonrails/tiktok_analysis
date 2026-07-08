package com.ss.android.ugc.aweme.internalshare.impl.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SendVideoToChatGroupMemberUidConfig {
    public static final SettingConfig LIZ = new SettingConfig(5, 10);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(282));

    public static final class SettingConfig {

        @C09CT("group_count_limit")
        public final int groupCountLimit;

        @C09CT("member_count_limit")
        public final int memberCountLimit;

        public SettingConfig() {
            this(5, 10);
        }

        public SettingConfig(int i, int i2) {
            this.groupCountLimit = i;
            this.memberCountLimit = i2;
        }
    }
}
