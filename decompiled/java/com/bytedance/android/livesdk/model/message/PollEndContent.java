package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PollEndContent {

    @C09CT("end_type")
    public int endType;

    @C09CT("operator")
    public User operator;

    @C09CT("option_list")
    public List<PollOptionInfo> optionList = new ArrayList();
}
