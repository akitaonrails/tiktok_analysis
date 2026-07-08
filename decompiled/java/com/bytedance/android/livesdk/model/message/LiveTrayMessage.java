package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class LiveTrayMessage extends AbstractC1136060ffY {

    @C09CT("combo_count")
    public int comboCount;

    @C09CT("describe")
    public Text describe;

    @C09CT("group_count")
    public int groupCount;

    @C09CT("image")
    public ImageModel image;

    @C09CT("title")
    public Text title;

    @C09CT("user")
    public User user;

    public LiveTrayMessage() {
        this.type = C001A.TRAY_MESSAGE;
    }
}
