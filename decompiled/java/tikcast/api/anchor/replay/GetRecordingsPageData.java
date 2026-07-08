package tikcast.api.anchor.replay;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public final class GetRecordingsPageData {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("next_offset")
    public long nextOffset;

    @C09CT("notification_bar")
    public NotificationBarInfo notificationBar;

    @C09CT("setting_infos")
    public SettingInfos settingInfos;

    @C09CT("highlight_list")
    public List<LiveFragmentDetail> highlightList = new ArrayList();

    @C09CT("clip_list")
    public List<LiveFragmentDetail> clipList = new ArrayList();

    @C09CT("replay_list")
    public List<RoomReplay> replayList = new ArrayList();
}
