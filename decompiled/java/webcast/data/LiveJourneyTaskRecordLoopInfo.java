package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveJourneyTaskRecordLoopInfo {

    @C09CT("already_loop_num")
    public long alreadyLoopNum;

    @C09CT("loop_details")
    public List<Detail> loopDetails = new ArrayList();

    @C09CT("max_loop_num")
    public long maxLoopNum;

    /* JADX INFO: loaded from: classes29.dex */
    public static final class Detail {

        @C09CT("exp_xfold_card_info")
        public LiveJourneyTaskRecordInfoExpXFoldCardInfo expXfoldCardInfo;

        @C09CT("finish_time")
        public long finishTime;

        @C09CT("loop_num")
        public long loopNum;

        @C09CT("reward_num")
        public long rewardNum;

        @C09CT("start_time")
        public long startTime;
    }
}
