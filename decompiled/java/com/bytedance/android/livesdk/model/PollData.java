package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C13LP;
import X.C512401z8;
import X.C786410Ut5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PollData {

    @C09CT("end_time")
    public long endTime;

    @C09CT("end_type")
    public int endType;

    @C09CT("gift")
    public Gift gift;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("is_suggested_question")
    public boolean isSuggestedQuestion;

    @C09CT("operator")
    public User operator;

    @C09CT("original_poll_duration_ms")
    public long originalPollDurationMs;

    @C09CT("poll_id")
    public long pollId;

    @C09CT("poll_index")
    public long pollIndex;

    @C09CT("kind")
    public int pollKind;

    @C09CT("poll_status")
    public int pollStatus;

    @C09CT("poll_user_cnt")
    public long pollUserCnt;

    @C09CT("start_time")
    public long startTime;

    @C09CT("template_id")
    public Long templateId;

    @C09CT("title")
    public String title;

    @C09CT("vote_limit")
    public PollVoteLimit voteLimit;

    @C09CT("poll_option_list")
    public List<PollOptionInfo> pollOptionList = new ArrayList();

    @C09CT("poll_sponsor")
    public String pollSponsor = "";

    @C09CT("suggested_question_key")
    public String suggestedQuestionKey = "";

    public final String LIZ() {
        return ((PollOptionInfo) ListProtector.get(this.pollOptionList, 0)).votes == ((PollOptionInfo) ListProtector.get(this.pollOptionList, 1)).votes ? "tie_up" : ((PollOptionInfo) ListProtector.get(this.pollOptionList, 0)).votes > ((PollOptionInfo) ListProtector.get(this.pollOptionList, 1)).votes ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public final String LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (PollOptionInfo pollOptionInfo : this.pollOptionList) {
            jSONObject.put(pollOptionInfo.displayContent, String.valueOf(pollOptionInfo.votes));
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String LIZJ() {
        List listLJLLLL = C13LP.LJLLLL(new C512401z8(7), this.pollOptionList);
        return ((PollOptionInfo) C13LP.LJJJJZI(listLJLLLL)).votes == ((PollOptionInfo) C13LP.LJJLIIIJJI(listLJLLLL)).votes ? "tie_up" : ((PollOptionInfo) C13LP.LJJJJZI(listLJLLLL)).displayContent;
    }
}
