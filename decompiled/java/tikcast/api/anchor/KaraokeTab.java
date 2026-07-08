package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeTab {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("offset")
    public long offset;

    @C09CT("tab_name")
    public String tabName = "";

    @C09CT("song_list")
    public List<KaraokeSong> songList = new ArrayList();
}
