package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBIntentLeads;
import java.util.ArrayList;
import java.util.List;
import webcast.data.PaginationInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBDMIntentListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("leads_list")
        public List<SMBIntentLeads> leadsList = new ArrayList();

        @C09CT("pagination_info")
        public PaginationInfo paginationInfo;
    }
}
