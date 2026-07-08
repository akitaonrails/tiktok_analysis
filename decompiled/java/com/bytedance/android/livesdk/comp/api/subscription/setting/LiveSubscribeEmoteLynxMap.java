package com.bytedance.android.livesdk.comp.api.subscription.setting;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSubscribeEmoteLynxMap {
    public final String emotePollResultList;
    public final String emotePollResultListHalfScreen;
    public final String emotePollVoterList;
    public final String emotePollVoterListHalfScreen;
    public final JSONObject jsonObject;
    public final String userEmoteFaq;
    public final String userEmotesReviewList;

    public final String getEmotePollResultList() {
        return this.emotePollResultList;
    }

    public final String getEmotePollResultListHalfScreen() {
        return this.emotePollResultListHalfScreen;
    }

    public final String getEmotePollVoterList() {
        return this.emotePollVoterList;
    }

    public final String getEmotePollVoterListHalfScreen() {
        return this.emotePollVoterListHalfScreen;
    }

    public final String getUserEmoteFaq() {
        return this.userEmoteFaq;
    }

    public final String getUserEmotesReviewList() {
        return this.userEmotesReviewList;
    }

    public LiveSubscribeEmoteLynxMap(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        this.jsonObject = jSONObject;
        this.userEmotesReviewList = jSONObject.optString("emotes_review_list", "");
        this.userEmoteFaq = jSONObject.optString("emotes_faq", "");
        this.emotePollResultList = jSONObject.optString("emote_poll_result_list", "");
        this.emotePollVoterList = jSONObject.optString("emote_poll_voter_list", "");
        this.emotePollResultListHalfScreen = jSONObject.optString("emote_poll_result_list_halfscreen", "");
        this.emotePollVoterListHalfScreen = jSONObject.optString("emote_poll_voter_list_halfscreen", "");
    }

    public final String getScheme(String str) {
        return this.jsonObject.optString(str, "");
    }
}
