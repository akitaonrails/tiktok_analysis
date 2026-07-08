package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiSendDmsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("success_send_to_uid_list")
        public List<String> successSendToUidList = new ArrayList();
    }
}
