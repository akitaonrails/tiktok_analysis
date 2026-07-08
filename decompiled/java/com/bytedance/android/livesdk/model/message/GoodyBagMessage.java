package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagSkin;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GoodyBagMessage extends AbstractC1136060ffY {

    @C09CT("base_info")
    public GoodyBagBaseInfo baseInfo;

    @C09CT("goody_bag_skin")
    public GoodyBagSkin goodyBagSkin;

    @C09CT("type")
    public int type;

    @C09CT("winners")
    public List<GoodyBagWinnerInfo> winners;

    public GoodyBagMessage() {
        super.type = C001A.GOODY_BAG_MESSAGE;
        this.winners = new ArrayList();
    }
}
