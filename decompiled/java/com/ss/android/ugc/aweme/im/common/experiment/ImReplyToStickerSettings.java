package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class ImReplyToStickerSettings {
    public static final Config LIZ = new Config(0, 0, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1701));

    public static final class Config {

        @C09CT("message_lookup_limit")
        public final int messageLookupLimit;

        @C09CT("min_stickers_number")
        public final int minStickersNumber;

        @C09CT("supported_set_id_list")
        public final List<String> stickerSetIdList;

        public Config() {
            this(0, 0, null, 7, null);
        }

        public Config(int i, int i2, List<String> list) {
            this.messageLookupLimit = i;
            this.minStickersNumber = i2;
            this.stickerSetIdList = list;
        }

        public Config(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 20 : i, (i3 & 2) != 0 ? 10 : i2, (i3 & 4) != 0 ? Collections.singletonList("44142529795") : list);
        }
    }
}
