package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class FindGiftBlackList {
    public static final TypeAdapter ADAPTER;

    @C09CT("black_list")
    public List<Long> blackList;

    public FindGiftBlackList() {
        this(C1697810uHb.LJIIJJI(8275L, 7775L, 7099L));
    }

    static {
        new FindGiftBlackList(C1697810uHb.LJIIJJI(8275L, 7775L, 7099L));
        ADAPTER = new FindGiftBlackList_OptTypeAdapter(NormalGson.singleton());
    }

    public FindGiftBlackList(List<Long> list) {
        this.blackList = list;
    }
}
