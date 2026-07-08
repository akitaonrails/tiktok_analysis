package com.ss.android.ugc.aweme.feed.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceSpecificTimeGeckoConfig {
    public static final SpecificTimeGeckoSettingModel LIZ = new SpecificTimeGeckoSettingModel(null, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(181));

    public static final class SpecificTimeGeckoSettingModel {

        @C09CT("channel_list")
        public final List<String> channelList;

        @C09CT("expire_time")
        public final long expireTime;

        public SpecificTimeGeckoSettingModel() {
            this(null, 0L);
        }

        public SpecificTimeGeckoSettingModel(List<String> list, long j) {
            this.channelList = list;
            this.expireTime = j;
        }
    }
}
