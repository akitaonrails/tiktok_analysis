package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftPageByCreator {

    @C09CT("display")
    public boolean display;

    @C09CT("page_type")
    public int pageType;

    @C09CT("page_name")
    public String pageName = "";

    @C09CT("gifts")
    public List<GiftStructByCreator> gifts = new ArrayList();
}
