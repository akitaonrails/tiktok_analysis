package com.bytedance.ies.im.core.exp;

import X.C09CT;
import X.C0C64;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKServerUnreadCountExp {
    public static final IMServerUnreadConfiguration LIZ = new IMServerUnreadConfiguration(false, 0, 0, null, null, 31, null);

    public static IMServerUnreadConfiguration LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        IMServerUnreadConfiguration iMServerUnreadConfiguration = LIZ;
        IMServerUnreadConfiguration iMServerUnreadConfiguration2 = (IMServerUnreadConfiguration) c0c64LJIILLIIL.LJJII(IMServerUnreadConfiguration.class, iMServerUnreadConfiguration, "imsdk_server_unread_count", true);
        return iMServerUnreadConfiguration2 != null ? iMServerUnreadConfiguration2 : iMServerUnreadConfiguration;
    }

    public static final class IMServerUnreadConfiguration {

        @C09CT("enable")
        public final boolean isEnabled;

        @C09CT("recovery_version_android")
        public final int recoveryVersionAndroid;

        @C09CT("recovery_version_ios")
        public final int recoveryVersionIOS;

        @C09CT("server_unread_inbox")
        public final List<Integer> serverUnreadInbox;

        @C09CT("unread_verification_inbox")
        public final List<Integer> unreadVerificationInbox;

        public IMServerUnreadConfiguration() {
            this(false, 0, 0, null, null, 31, null);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public IMServerUnreadConfiguration(boolean z, int i, int i2, List<Integer> list, List<Integer> list2) {
            this.isEnabled = z;
            this.recoveryVersionIOS = i;
            this.recoveryVersionAndroid = i2;
            this.unreadVerificationInbox = list;
            this.serverUnreadInbox = list2;
        }

        public IMServerUnreadConfiguration(boolean z, int i, int i2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? C1697810uHb.LJIIJJI(0, 1) : list, (i3 & 16) != 0 ? Collections.singletonList(4) : list2);
        }
    }
}
