package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* JADX INFO: loaded from: classes.dex */
public final class CreateInfoPerceptionMessage {

    @C09CT("access_type")
    public int accessType;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("detail_url")
    public String detailUrl = "";
}
