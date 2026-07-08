package tikcast.linkmic.controller;

import X.C09CT;
import X.C13BV;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.BackGroundImageState;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common.WallpaperImageState;

/* JADX INFO: loaded from: classes.dex */
public final class GetStateResp {

    @C09CT("back_ground_image")
    public BackGroundImageState backGroundImage;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("version")
    public long version;

    @C09CT("wallpaper_image")
    public WallpaperImageState wallpaperImage;

    @C09CT("states")
    public List<LinkUserState> states = C13BV.INSTANCE;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos = new ArrayList();

    @C09CT("spot_list")
    public List<SpotInfo> spotList = new ArrayList();

    @C09CT("audio_muted_remote_channels")
    public List<Long> audioMutedRemoteChannels = new ArrayList();
}
