package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class ProjectDModifyH5Message extends AbstractC1136060ffY {

    @C09CT("buttom_right")
    public String mBottomRightUrl;

    @C09CT("top_left")
    public String mTopLeftUrl;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public ProjectDModifyH5Message() {
        this.type = C001A.D_H5_MESSAGE;
    }
}
