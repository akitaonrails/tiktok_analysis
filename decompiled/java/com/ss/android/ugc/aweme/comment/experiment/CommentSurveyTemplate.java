package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes10.dex */
public final class CommentSurveyTemplate {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("schema")
    public String schema;

    public CommentSurveyTemplate() {
        this("", "aweme://lynxview/?channel=ecosystem_content_templates&bundle=pages%2Fcomment_survey%2Ftemplate.js&use_spark=1&enable_prefetch=1");
    }

    public CommentSurveyTemplate(String str, String str2) {
        this.id = str;
        this.schema = str2;
    }
}
