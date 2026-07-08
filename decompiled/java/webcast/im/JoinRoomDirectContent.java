package webcast.im;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class JoinRoomDirectContent {

    @C09CT("joiner")
    public Player joiner;

    @C09CT("joiner_ext_info")
    public RTCExtraInfo joinerExtInfo;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("joiner_link_mic_id")
    public String joinerLinkMicId = "";

    @C09CT("spot_list")
    public List<SpotInfo> spotList = new ArrayList();

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos = new ArrayList();
}
