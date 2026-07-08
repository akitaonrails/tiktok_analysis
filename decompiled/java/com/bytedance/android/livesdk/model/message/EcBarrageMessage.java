package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class EcBarrageMessage extends AbstractC1136060ffY {

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("background_opacity")
    public double backgroundOpacity;

    @C09CT("content")
    public Text content;

    @C09CT("duration")
    public long duration;

    @C09CT("icon")
    public ImageModel icon;

    public EcBarrageMessage() {
        this.type = C001A.EC_BARRAGE_MESSAGE;
    }
}
