package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.message.proto.PerceptionSheetInfo;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class PerceptionMessage extends AbstractC1136060ffY {

    @C09CT("dialog")
    public PerceptionDialogInfo dialog;

    @C09CT("end_time")
    public int endTime;

    @C09CT("float_icon_type")
    public int floatIconType;

    @C09CT("float_style")
    public int floatStyle;

    @C09CT("float_text")
    public Text floatText;

    @C09CT("punish_info")
    public PunishEventInfo publicEventInfo;

    @C09CT("sheet")
    public PerceptionSheetInfo sheet;

    @C09CT("show_violation_warning")
    public Boolean showViolation;

    @C09CT("toast")
    public Text toast;

    public PerceptionMessage() {
        this.type = C001A.PERCEPTION_MESSAGE;
    }
}
