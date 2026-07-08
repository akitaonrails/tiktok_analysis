package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BindCampaignResult {

    @C09CT("data")
    public Response data;

    public static final class Response {

        @C09CT("result_code")
        public int resultCode;

        @C09CT("err_msg")
        public String errMsg = "";

        @C09CT("task_results")
        public List<TaskResult> taskResults = new ArrayList();
    }
}
