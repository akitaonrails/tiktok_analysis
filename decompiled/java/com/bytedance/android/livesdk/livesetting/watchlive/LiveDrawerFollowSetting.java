package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.DrawerFollow;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("tt_live_drawer_follow_experiment")
public final class LiveDrawerFollowSetting {
    public static final DrawerFollow DEFAULT;
    public static final LiveDrawerFollowSetting INSTANCE = new LiveDrawerFollowSetting();
    public static final Keva keva;
    public static int showFollowEntranceTime;
    public static String storeKey;
    public static long userId;
    public static final DrawerFollow value;

    public final boolean hasFollow(int i) {
        return 1 == i || 2 == i;
    }

    static {
        DrawerFollow drawerFollow = new DrawerFollow();
        DEFAULT = drawerFollow;
        showFollowEntranceTime = -100;
        storeKey = "";
        value = (DrawerFollow) SettingsManager.INSTANCE.getValueSafely("tt_live_drawer_follow_experiment", drawerFollow);
        keva = Keva.getRepo("tt_live_drawer_follow_repo");
    }

    private final String getData() {
        return new SimpleDateFormat("yyyy_MM_dd").format(new Date());
    }

    private final String getStoreKey() {
        if (TextUtils.isEmpty(storeKey)) {
            if (userId <= 0) {
                userId = UserService.getInstance().user().getCurrentUserId();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_follow_entrance_time_");
            sbLIZ.append(userId);
            sbLIZ.append('_');
            sbLIZ.append(getData());
            storeKey = C2188811AlT.LIZIZ(sbLIZ);
        }
        return storeKey;
    }

    public final boolean isFollowEntranceExp() {
        DrawerFollow drawerFollow = value;
        if (drawerFollow != null) {
            return drawerFollow.drawerFollowEntrance;
        }
        return false;
    }

    public final boolean isFollowTab() {
        DrawerFollow drawerFollow = value;
        return drawerFollow != null && 2 == drawerFollow.drawerFollowStyle;
    }

    public final boolean isFollowWindow() {
        DrawerFollow drawerFollow = value;
        return drawerFollow != null && 1 == drawerFollow.drawerFollowStyle;
    }

    public final boolean isGameEntranceExp() {
        DrawerFollow drawerFollow = value;
        if (drawerFollow != null) {
            return drawerFollow.drawerGameEntrance;
        }
        return false;
    }

    public final void updateEntranceTime() {
        showFollowEntranceTime--;
        if (TextUtils.isEmpty(storeKey)) {
            return;
        }
        keva.storeInt(storeKey, showFollowEntranceTime);
    }

    public final int getShowTime() {
        getStoreKey();
        if (showFollowEntranceTime == -100) {
            Keva keva2 = keva;
            String str = storeKey;
            DrawerFollow drawerFollow = value;
            showFollowEntranceTime = keva2.getInt(str, drawerFollow != null ? drawerFollow.entranceShowTime : 0);
        }
        return showFollowEntranceTime;
    }

    public final boolean isFollowExp() {
        return isFollowTab() || isFollowWindow();
    }

    public final boolean isFollowEntrance(String str, String str2) {
        DrawerFollow drawerFollow;
        List<String> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!isFollowEntranceExp() || (drawerFollow = value) == null || (list = drawerFollow.unFollowEntrances) == null || !list.contains(strLIZIZ)) {
            return false;
        }
        return true;
    }

    public final boolean isShowFollow(String str, String str2) {
        if (!isShowFollowTab(str, str2) && !isShowFollowWindow(str, str2)) {
            return false;
        }
        return true;
    }

    public final boolean isShowFollowTab(String str, String str2) {
        if (Intrinsics.LJFF(str, str2) && isFollowTab()) {
            return true;
        }
        return false;
    }

    public final boolean isShowFollowWindow(String str, String str2) {
        if (Intrinsics.LJFF(str, str2) && isFollowWindow()) {
            return true;
        }
        return false;
    }
}
