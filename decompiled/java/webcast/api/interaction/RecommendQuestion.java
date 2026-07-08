package webcast.api.interaction;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendQuestion {

    @C09CT("tag")
    public String tag = "";

    @C09CT("questions")
    public List<String> questions = new ArrayList();

    @C09CT("question_details")
    public List<Question> questionDetails = new ArrayList();

    @C09CT("tag_key")
    public String tagKey = "";
}
