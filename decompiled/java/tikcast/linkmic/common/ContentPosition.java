package tikcast.linkmic.common;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;

/* JADX INFO: loaded from: classes.dex */
public final class ContentPosition {

    @C09CT("content_i_d")
    public String contentID = "";

    @C09CT("content_linkmic_i_d")
    public String contentLinkmicID = "";

    @C09CT("content_type")
    public int contentType;

    @C09CT("pos")
    public MicPositionData pos;

    @C09CT("start_time_nano")
    public long startTimeNano;
}
