package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.Caption;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptionItem {

    @C09CT("caption")
    public List<Caption> caption = new ArrayList();

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
