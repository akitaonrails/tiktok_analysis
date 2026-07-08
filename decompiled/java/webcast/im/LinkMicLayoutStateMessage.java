package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMicLayoutStateMessage extends AbstractC1136060ffY {

    @C09CT("biz_layout_state")
    public BizLayoutState bizLayoutState;

    @C09CT("biz_spot_list")
    public List<BizSpotInfo> bizSpotList;

    @C09CT("channel_id")
    public long channelId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("version")
    public long version;

    public LinkMicLayoutStateMessage() {
        this.type = C001A.LINK_MIC_LAYOUT_STATE_MESSAGE;
        this.bizSpotList = new ArrayList();
    }
}
