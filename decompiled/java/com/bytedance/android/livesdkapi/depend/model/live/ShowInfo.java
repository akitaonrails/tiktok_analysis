package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShowInfo {

    @C09CT("anchors")
    public List<User> anchors;

    @C09CT("show_end_time")
    public long showEndTime;

    @C09CT("show_introduction")
    public String showIntroduction = "";

    @C09CT("show_start_time")
    public long showStartTime;
}
