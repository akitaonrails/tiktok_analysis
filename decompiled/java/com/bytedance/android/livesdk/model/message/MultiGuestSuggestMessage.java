package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestSuggestMessage extends AbstractC1136060ffY {

    @C09CT("suggested_image")
    public List<ImageModel> suggestedImage;

    public MultiGuestSuggestMessage() {
        this.type = C001A.MULTI_GUEST_SUGGEST_MESSAGE;
        this.suggestedImage = new ArrayList();
    }
}
