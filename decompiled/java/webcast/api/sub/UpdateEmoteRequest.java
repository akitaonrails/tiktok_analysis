package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.SubPackageEmoteUpdate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdateEmoteRequest {

    @C09CT("is_custom_subwave_rewards")
    public boolean isCustomSubwaveRewards;

    @C09CT("is_fans_emote")
    public boolean isFansEmote;

    @C09CT("is_super_fan_emote")
    public boolean isSuperFanEmote;

    @C09CT("emote_list")
    public List<EmoteModel> emoteList = new ArrayList();

    @C09CT("package_emotes")
    public Map<String, SubPackageEmoteUpdate> packageEmotes = new LinkedHashMap();
}
