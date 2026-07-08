package com.bytedance.android.livesdk.feed.drawerfeed.search.model;

import X.AbstractC472000If8;
import X.C09CT;
import X.C19748512Ol;
import X.C472010If9;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSearchAweme {
    public static final /* synthetic */ int LJI = 0;
    public AbstractC472000If8 LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public transient Room LJFF;

    @C09CT("aweme_type")
    public int awemeType;

    @C09CT("aweme_id")
    public String awemeId = "";

    @C09CT("rawdata")
    public String rawData = "";

    @C09CT("group_id")
    public String groupId = "";
    public String LIZ = "";

    public final Room LIZ() {
        if (this.LJFF == null) {
            Room room = (Room) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, this.rawData, Room.class);
            this.LJFF = room;
            if (room != null) {
                room.setRequestId(this.LIZ);
            }
        }
        return this.LJFF;
    }

    public LiveSearchAweme() {
        new n();
        this.LIZIZ = C472010If9.LIZIZ;
    }
}
