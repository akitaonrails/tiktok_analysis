package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveScriptsRow {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("thumbnail")
    public ImageModel thumbnail;

    @C09CT("video_timestamp_seconds")
    public int videoTimestampSeconds;

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("script_text")
    public String scriptText = "";
}
