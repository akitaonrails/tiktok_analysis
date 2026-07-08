package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.BackGroundImageState;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class LinkStateMessage extends AbstractC1136060ffY {

    @C09CT("audio_muted_remote_channels")
    public List<Long> audioMutedRemoteChannels;

    @C09CT("background")
    public BackGroundImageState background;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("client_send_time")
    public long clientSendTime;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("linker_mode")
    public int linkerMode;

    @C09CT("need_ack")
    public int needAck;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    @C09CT("state_type")
    public int stateType;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    @C09CT("user_states")
    public List<LinkUserState> userStates;

    @C09CT("version")
    public long version;

    @C09CT("wallpaper_url")
    public String wallpaperUrl;

    public LinkStateMessage() {
        this.type = C001A.LINK_STATE_MESSAGE;
        this.userStates = C13BV.INSTANCE;
        this.wallpaperUrl = "";
        this.uiPos = new ArrayList();
        this.spotList = new ArrayList();
        this.audioMutedRemoteChannels = new ArrayList();
    }
}
