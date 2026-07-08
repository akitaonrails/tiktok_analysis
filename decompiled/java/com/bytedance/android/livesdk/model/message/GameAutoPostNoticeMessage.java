package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameAutoPostNoticeMessage extends AbstractC1136060ffY {

    @C09CT("fragments")
    public List<LiveFragment> fragments;

    @C09CT("main_title")
    public Text mainTitle;

    @C09CT("sub_title")
    public Text subTitle;

    public GameAutoPostNoticeMessage() {
        this.type = C001A.GAME_AUTO_POST_NOTICE_MESSAGE;
        this.fragments = new ArrayList();
    }
}
