package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CelebrationPost {

    @C09CT("bg_music_id")
    public long bgMusicId;

    @C09CT("emote")
    public EmoteModel emote;

    @C09CT("img_bg")
    public ImageModel imgBg;

    @C09CT("publish_params")
    public PublishPageParams publishParams;

    @C09CT("content")
    public String content = "";

    @C09CT("tags")
    public List<Hashtag> tags = new ArrayList();

    @C09CT("img_title")
    public String imgTitle = "";
}
