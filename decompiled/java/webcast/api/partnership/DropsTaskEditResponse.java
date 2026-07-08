package webcast.api.partnership;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DropsTaskEditResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("results")
        public List<TaskResult> results = new ArrayList();
    }

    public static final class TaskResult {

        @C09CT("err_code")
        public long errCode;

        @C09CT("task_id")
        public String taskId = "";
    }
}
