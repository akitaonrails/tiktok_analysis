package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftsBoxInfo {

    @C09CT("gifts_info_in_box")
    public List<GiftInfoInBox> gifts;

    public GiftsBoxInfo() {
        this(new ArrayList());
    }

    public GiftsBoxInfo(List<GiftInfoInBox> list) {
        this.gifts = list;
    }
}
