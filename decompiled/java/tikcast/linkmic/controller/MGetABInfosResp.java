package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MGetABInfosResp {

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("infos")
    public List<ABInfos> infos = new ArrayList();
}
