package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CheckAnchorPermissionResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("have_permission")
        public boolean havePermission;

        @C09CT("in_blacklist")
        public boolean inBlacklist;

        @C09CT("is_game_room")
        public boolean isGameRoom;

        @C09CT("reason")
        public String reason = "";

        @C09CT("show_entrance")
        public boolean showEntrance;
    }
}
