package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBBoardAuditResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("reasons")
        public List<InterceptReason> reasons = new ArrayList();
    }
}
