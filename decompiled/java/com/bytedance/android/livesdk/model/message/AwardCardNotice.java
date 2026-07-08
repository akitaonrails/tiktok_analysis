package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AwardCardNotice {

    @C09CT("awarded_users")
    public List<BattleUserInfo> awardedUsers = new ArrayList();

    @C09CT("display_content")
    public Text displayContent;
}
