package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class Achievement {
    public static final TypeAdapter ADAPTER = new Achievement_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_end_encourage_diamond_list")
    public List<Long> diamondList;

    @C09CT("live_end_encourage_duration_list")
    public List<Long> durationList;

    public Achievement() {
        this(C1697810uHb.LJIIJJI(40L, 90L, 500L, 1000L), C1697810uHb.LJIIJJI(900L, 10000L, 100000L, 1000000L));
    }

    public final List<Long> getDiamondList() {
        return this.diamondList;
    }

    public final List<Long> getDurationList() {
        return this.durationList;
    }

    public final void setDiamondList(List<Long> list) {
        this.diamondList = list;
    }

    public final void setDurationList(List<Long> list) {
        this.durationList = list;
    }

    public Achievement(List<Long> list, List<Long> list2) {
        this.durationList = list;
        this.diamondList = list2;
    }
}
