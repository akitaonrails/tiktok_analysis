package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import java.util.ArrayList;
import java.util.List;
import webcast.data.InteractionConflict;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseData {

    @C09CT("duration_ms")
    public long durationMs;

    @C09CT("end_time")
    public long endTime;

    @C09CT("interaction_conflict")
    public InteractionConflict interactionConflict;

    @C09CT("poll_id")
    public long pollId;

    @C09CT("poll_index")
    public long pollIndex;

    @C09CT("sei")
    public LiveMessageSEI sei;

    @C09CT("start_time")
    public long startTime;

    @C09CT("poll_id_str")
    public String pollIdStr = "";

    @C09CT("poll_option_list")
    public List<PollOptionInfo> pollOptionList = new ArrayList();

    @C09CT("title")
    public String title = "";
}
