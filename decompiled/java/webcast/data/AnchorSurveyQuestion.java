package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorSurveyQuestion {

    @C09CT("bucket_id")
    public int bucketId;

    @C09CT("question_type")
    public int questionType;

    @C09CT("question_id")
    public String questionId = "";

    @C09CT("question_title")
    public String questionTitle = "";

    @C09CT("options")
    public List<AnchorSurveyOption> options = new ArrayList();

    @C09CT("question_sub_title")
    public String questionSubTitle = "";
}
