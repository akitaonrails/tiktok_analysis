package com.bytedance.android.livesdk.rank.api.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class RankItem {

    @C09CT("delta")
    public long delta;

    @C09CT("rank")
    public long rank;

    @C09CT("score")
    public long score;

    @C09CT("user")
    public User user;

    @C09CT("gap_description")
    public String gapDescription = "";

    @C09CT("rich_description")
    public String richDescription = "";

    @C09CT("city_code")
    public String cityCode = "";

    @C09CT("gap_rich_description")
    public String gapRichDescription = "";
}
