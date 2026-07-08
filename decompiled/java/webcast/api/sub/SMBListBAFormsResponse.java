package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBFormInfo;
import java.util.ArrayList;
import java.util.List;
import webcast.data.PaginationInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBListBAFormsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("pagination_info")
        public PaginationInfo paginationInfo;

        @C09CT("form_info_list")
        public List<SMBFormInfo> formInfoList = new ArrayList();

        @C09CT("used_form_ids")
        public List<Long> usedFormIds = new ArrayList();
    }
}
