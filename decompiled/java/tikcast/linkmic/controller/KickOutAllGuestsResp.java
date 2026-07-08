package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class KickOutAllGuestsResp {

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("removed_user_ids")
    public List<Long> removedUserIds = new ArrayList();

    @C09CT("removed_linker_session_ids")
    public Map<Long, String> removedLinkerSessionIds = new LinkedHashMap();
}
