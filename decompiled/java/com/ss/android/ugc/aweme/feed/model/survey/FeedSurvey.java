package com.ss.android.ugc.aweme.feed.model.survey;

import X.C098200Yq;
import X.C09C2;
import X.C09CT;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class FeedSurvey implements Serializable {

    @C09CT("cancel_text")
    public String cancelText;

    @C09CT("bgd_customize_button")
    public ForceVideo customizeButton;

    @C09CT("extra")
    public String extra;

    @C09CT("bgd_video")
    public ForceVideo forceVideo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("questions")
    public Question[] questions;

    @C09CT("relation_info")
    public String relationsKey;

    @C09CT("submit_text")
    public String submitText;

    @C09CT("key")
    public String surveyKey;

    @C09CT("template_url")
    public String templateUrl;

    @C09CT("title")
    public String title;

    @C09CT("triggers")
    public List<TriggerData> triggerActions;

    @C09CT("bgd_video_cover")
    public ForceVideo videoCover;

    public FeedSurvey() {
        this("", "", null, null, "", "", "", null, null, null, null, "", "");
    }

    public final FeedSurvey copy(String str, String str2, String str3, List<TriggerData> list, String str4, String str5, String str6, Question[] questionArr, ForceVideo forceVideo, ForceVideo forceVideo2, ForceVideo forceVideo3, String str7, String str8) {
        return new FeedSurvey(str, str2, str3, list, str4, str5, str6, questionArr, forceVideo, forceVideo2, forceVideo3, str7, str8);
    }

    public final void setExtraData(ExtraData extraData) {
    }

    public String toString() {
        return "FeedSurvey(surveyKey=" + this.surveyKey + ", id=" + this.id + ", relationsKey=" + this.relationsKey + ", triggerActions=" + this.triggerActions + ", title=" + this.title + ", cancelText=" + this.cancelText + ", submitText=" + this.submitText + ", questions=" + Arrays.toString(this.questions) + ", forceVideo=" + this.forceVideo + ", videoCover=" + this.videoCover + ", customizeButton=" + this.customizeButton + ", extra=" + this.extra + ", templateUrl=" + this.templateUrl + ')';
    }

    public final ExtraData getExtraData() {
        Object c098200Yq;
        try {
            c098200Yq = (ExtraData) C09C2.LIZ().LJII(this.extra, ExtraData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (ExtraData) c098200Yq;
    }

    public final void setCancelText(String str) {
        this.cancelText = str;
    }

    public final void setCustomizeButton(ForceVideo forceVideo) {
        this.customizeButton = forceVideo;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setForceVideo(ForceVideo forceVideo) {
        this.forceVideo = forceVideo;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setQuestions(Question[] questionArr) {
        this.questions = questionArr;
    }

    public final void setRelationsKey(String str) {
        this.relationsKey = str;
    }

    public final void setSubmitText(String str) {
        this.submitText = str;
    }

    public final void setSurveyKey(String str) {
        this.surveyKey = str;
    }

    public final void setTemplateUrl(String str) {
        this.templateUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTriggerActions(List<TriggerData> list) {
        this.triggerActions = list;
    }

    public final void setVideoCover(ForceVideo forceVideo) {
        this.videoCover = forceVideo;
    }

    public FeedSurvey(String str, String str2, String str3, List<TriggerData> list, String str4, String str5, String str6, Question[] questionArr, ForceVideo forceVideo, ForceVideo forceVideo2, ForceVideo forceVideo3, String str7, String str8) {
        this.surveyKey = str;
        this.id = str2;
        this.relationsKey = str3;
        this.triggerActions = list;
        this.title = str4;
        this.cancelText = str5;
        this.submitText = str6;
        this.questions = questionArr;
        this.forceVideo = forceVideo;
        this.videoCover = forceVideo2;
        this.customizeButton = forceVideo3;
        this.extra = str7;
        this.templateUrl = str8;
    }
}
