package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionGuideMessage extends AbstractC1136060ffY {
    public final String LL;

    @C09CT("btn_name")
    public Text buttonName;

    @C09CT("btn_url")
    public String buttonUrl;

    @C09CT("capsule_scene")
    public String capsuleScene;

    @C09CT("description")
    public Text description;

    @C09CT("from_user_id")
    public long from_user_id;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return (a0.LJJJIL(this.LL) ^ true) || this.description != null;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return this.description != null;
    }

    public SubscriptionGuideMessage() {
        this.type = C001A.SUBSCRIPTION_GUIDE_MESSAGE;
        this.LL = "";
    }
}
