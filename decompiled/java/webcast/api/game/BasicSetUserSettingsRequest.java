package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.UserSetting;

/* JADX INFO: loaded from: classes.dex */
public final class BasicSetUserSettingsRequest {

    @C09CT("user_settings")
    public List<UserSetting> userSettings = new ArrayList();

    @C09CT("room_id_str")
    public String roomIdStr = "";
}
