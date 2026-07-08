package com.ss.android.ugc.aweme.live.player;

import X.C08JS;
import X.C098200Yq;
import X.C189200o6;
import X.C786410Ut5;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.TaxonomyTagInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDataCenterLiveAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class DataCenterLiveAwemeSPI implements IDataCenterLiveAwemeService {
    @Override // com.ss.android.ugc.aweme.IDataCenterLiveAwemeService
    public final String LIZ(Aweme aweme) {
        String str;
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.roomData;
        } else {
            str = null;
        }
        SlimRoom slimRoom = (SlimRoom) C08JS.LIZ(str, SlimRoom.class);
        if (slimRoom == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("live_json_string_data", slimRoom.getMultiStreamData());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("live_room_mode", slimRoom.liveRoomMode);
            TaxonomyTagInfo taxonomyTagInfo = slimRoom.taxonomyTagInfo;
            if (taxonomyTagInfo != null) {
                jSONObject2.put("level1_tag", taxonomyTagInfo.level1Tag);
                jSONObject2.put("level2_tag", taxonomyTagInfo.level2Tag);
            }
            jSONObject.put("extra", jSONObject2);
            C189200o6.m2constructorimpl(jSONObject.put("room_id", slimRoom.getId()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.IDataCenterLiveAwemeService
    public final String LIZIZ(Aweme aweme) {
        String multiStreamData;
        Integer numValueOf;
        JSONObject jSONObject = new JSONObject();
        if (aweme != null) {
            try {
                LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                com.ss.android.ugc.aweme.feed.model.live.TaxonomyTagInfo taxonomyTagInfo = null;
                if (newLiveRoomDataExt == null) {
                    RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                    if (roomFeedCellStruct != null) {
                        newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData();
                    } else {
                        newLiveRoomDataExt = null;
                    }
                }
                if (newLiveRoomDataExt == null) {
                    multiStreamData = null;
                } else {
                    multiStreamData = newLiveRoomDataExt.getMultiStreamData();
                }
                jSONObject.put("live_json_string_data", multiStreamData);
                JSONObject jSONObject2 = new JSONObject();
                if (newLiveRoomDataExt != null) {
                    numValueOf = Integer.valueOf(newLiveRoomDataExt.liveRoomMode);
                } else {
                    numValueOf = null;
                }
                jSONObject2.put("live_room_mode", numValueOf);
                if (newLiveRoomDataExt != null) {
                    taxonomyTagInfo = newLiveRoomDataExt.taxonomyTagInfo;
                }
                if (taxonomyTagInfo != null) {
                    jSONObject2.put("level1_tag", new JSONArray((Collection) taxonomyTagInfo.getLevel1Tag()));
                    jSONObject2.put("level2_tag", taxonomyTagInfo.getLevel2Tag());
                }
                jSONObject.put("extra", jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }
}
