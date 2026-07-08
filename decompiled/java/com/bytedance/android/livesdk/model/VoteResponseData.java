package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class VoteResponseData {

    @C09CT("comment_banned")
    public boolean commentBanned;

    @C09CT("option_list")
    public List<PollOptionInfo> optionList = C13BV.INSTANCE;
}
