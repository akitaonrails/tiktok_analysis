package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CS;
import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class RoomFeedCellStruct implements Serializable {

    @C09CT("deduplication_type")
    public int deduplicationType;

    @C09CT("distance")
    public String distance;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("fans_struct")
    public FansStruct mFansStruct;

    @C09CT("rawdata")
    @C09CS(StringJsonAdapterFactory.class)
    public NewLiveRoomStruct newLiveRoomData;

    @C09CT("room")
    public LiveRoomStruct room;

    @C09CT("tag")
    public String tag;

    @C09CT("tag_id")
    public long tagId;

    @C09CT("type")
    public int type;

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            if (LiveRoomStruct.isValid(this.room)) {
                LiveRoomStruct liveRoomStruct = this.room;
                liveRoomStruct.liveRoomMode = this.newLiveRoomData.liveRoomMode;
                return liveRoomStruct;
            }
            NewLiveRoomStruct newLiveRoomStruct = this.newLiveRoomData;
            if (newLiveRoomStruct == null) {
                return null;
            }
            newLiveRoomStruct.init();
            LiveRoomStruct liveRoomStructRoomStructConstructor = this.newLiveRoomData.roomStructConstructor();
            this.room = liveRoomStructRoomStructConstructor;
            return liveRoomStructRoomStructConstructor;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public void setMockNewLiveRoomData(NewLiveRoomStruct newLiveRoomStruct) {
        this.newLiveRoomData = newLiveRoomStruct;
    }
}
