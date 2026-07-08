package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SearchRivalsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class Cell {

        @C09CT("cell_type")
        public int cellType;

        @C09CT("room")
        public Room room;
    }

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public int nextOffset;

        @C09CT("cell_list")
        public List<Cell> cellList = new ArrayList();

        @C09CT("rival_extra_infos")
        public Map<Long, RivalExtraInfo> rivalExtraInfos = new LinkedHashMap();

        @C09CT("search_id")
        public String searchId = "";

        @C09CT("rival_user_to_extra_infos")
        public Map<Long, RivalExtraInfo> rivalUserToExtraInfos = new LinkedHashMap();
    }
}
