package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class FansPrivilege {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("discord_entrance")
    public DiscordEntrance discordEntrance;

    @C09CT("fans_level_info")
    public FansLevelInfo fansLevelInfo;

    @C09CT("fans_privilege_details")
    public List<FansPrivilegeDetail> fansPrivilegeDetails;

    @C09CT("next_level_has_privilege")
    public FansScoreRule nextLevelHasPrivilege;
}
