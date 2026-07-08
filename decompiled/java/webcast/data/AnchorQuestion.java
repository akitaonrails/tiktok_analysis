package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorQuestion {

    @C09CT("question_type")
    public int questionType;

    @C09CT("skippable")
    public boolean skippable;

    @C09CT("question_id")
    public String questionId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("options")
    public List<AnchorQuestionOption> options = new ArrayList();

    @C09CT("extra")
    public String extra = "";

    @C09CT("low_rating_text")
    public String lowRatingText = "";

    @C09CT("high_rating_text")
    public String highRatingText = "";
}
