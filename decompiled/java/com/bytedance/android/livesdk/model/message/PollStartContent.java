package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PollStartContent {

    @C09CT("end_time")
    public long endTime;

    @C09CT("operator")
    public User operator;

    @C09CT("option_list")
    public List<PollOptionInfo> optionList = new ArrayList();

    @C09CT("start_time")
    public long startTime;

    @C09CT("title")
    public String title;
}
