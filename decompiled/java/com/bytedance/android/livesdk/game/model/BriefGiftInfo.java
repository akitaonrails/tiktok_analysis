package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BriefGiftInfo {

    @C09CT("auth_param")
    public AuthParam authParam;

    @C09CT("need_auth")
    public boolean needAuth;

    @C09CT("type")
    public int type;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("name")
    public String name = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("items")
    public List<GiftItem> items = new ArrayList();
}
