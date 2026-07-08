package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class PermitOutsideApplyMessage extends AbstractC1136060ffY {

    @C09CT("anchor_avatar")
    public ImageModel anchorAvatar;

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("anchor_nickname")
    public String anchorNickname;

    @C09CT("permit_text")
    public String permitText;

    @C09CT("permit_time")
    public long permitTime;

    @C09CT("room_id")
    public long roomId;

    public PermitOutsideApplyMessage() {
        this.type = C001A.PERMIT_OUTSIDE_APPLY_MESSAGE;
        this.anchorNickname = "";
        this.permitText = "";
    }
}
