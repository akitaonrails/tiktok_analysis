package tikcast.api.standingscore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubmitFeedbackRequest {

    @C09CT("option_ids")
    public List<Long> optionIds = new ArrayList();

    @C09CT("reason")
    public String reason = "";
}
