package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.DonationSticker;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DecorationModifyMessage extends AbstractC1136060ffY {

    @C09CT("donation_sticker")
    public List<DonationSticker> decorationList;

    public DecorationModifyMessage() {
        this.type = C001A.MODIFY_DECORATION;
    }
}
