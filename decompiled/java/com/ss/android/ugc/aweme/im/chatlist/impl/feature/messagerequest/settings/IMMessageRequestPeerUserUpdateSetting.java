package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMMessageRequestPeerUserUpdateSetting {
    public static final IMMessageRequestPeerUserUpdateSetting LIZ = new IMMessageRequestPeerUserUpdateSetting();
    public static final MessageRequestPeerUserFetchStrategy LIZIZ = new MessageRequestPeerUserFetchStrategy(new MessageRequestPeerUserBatchUpdateStrategy(true, 86400), new MessageRequestPeerUserFetchSegmentStrategy(true, 20, 10, 5, true));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(349));

    public static final class MessageRequestPeerUserFetchStrategy {

        @C09CT("batch_update_strategy")
        public final MessageRequestPeerUserBatchUpdateStrategy batchUpdateStrategy;

        @C09CT("batch_update_segment_strategy")
        public final MessageRequestPeerUserFetchSegmentStrategy segmentStrategy;

        public MessageRequestPeerUserFetchStrategy() {
            this(new MessageRequestPeerUserBatchUpdateStrategy(true, 86400L), new MessageRequestPeerUserFetchSegmentStrategy(true, 20, 10, 5, true));
        }

        public MessageRequestPeerUserFetchStrategy(MessageRequestPeerUserBatchUpdateStrategy messageRequestPeerUserBatchUpdateStrategy, MessageRequestPeerUserFetchSegmentStrategy messageRequestPeerUserFetchSegmentStrategy) {
            this.batchUpdateStrategy = messageRequestPeerUserBatchUpdateStrategy;
            this.segmentStrategy = messageRequestPeerUserFetchSegmentStrategy;
        }
    }

    public static final class MessageRequestPeerUserBatchUpdateStrategy {

        @C09CT("batch_update_enable")
        public final boolean enableBatchUpdate;

        @C09CT("batch_update_interval")
        public final long updateIntervalInSecond;

        public MessageRequestPeerUserBatchUpdateStrategy() {
            this(true, 86400L);
        }

        public MessageRequestPeerUserBatchUpdateStrategy(boolean z, long j) {
            this.enableBatchUpdate = z;
            this.updateIntervalInSecond = j;
        }
    }

    public static final class MessageRequestPeerUserFetchSegmentStrategy {

        @C09CT("batch_update_segment_strategy_enable")
        public final boolean enableSegmentFetch;

        @C09CT("batch_update_first_segment_count")
        public final int firstSegmentFetchCount;

        @C09CT("batch_update_segment_interval")
        public final int segmentIntervalInSecond;

        @C09CT("batch_update_subsequent_segment_depend_on_action")
        public final boolean subsequentFetchByAction;

        @C09CT("batch_update_subsequent_segment_count")
        public final int subsequentSegmentCount;

        public MessageRequestPeerUserFetchSegmentStrategy() {
            this(true, 20, 10, 5, true);
        }

        public MessageRequestPeerUserFetchSegmentStrategy(boolean z, int i, int i2, int i3, boolean z2) {
            this.enableSegmentFetch = z;
            this.firstSegmentFetchCount = i;
            this.subsequentSegmentCount = i2;
            this.segmentIntervalInSecond = i3;
            this.subsequentFetchByAction = z2;
        }
    }
}
