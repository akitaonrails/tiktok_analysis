package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("alog_to_applog_regular")
public final class LinkMicALogToAppLogRegular {
    public static final LinkMicALogToAppLogRegular INSTANCE = new LinkMicALogToAppLogRegular();
    public static final LinkMicALogToAppLogRegularBean DEFAULT = new LinkMicALogToAppLogRegularBean(null, null, null, null, null, 31, null);

    private final LinkMicALogToAppLogRegularBean getValue() {
        LinkMicALogToAppLogRegularBean linkMicALogToAppLogRegularBean = (LinkMicALogToAppLogRegularBean) SettingsManager.INSTANCE.getValueSafely(LinkMicALogToAppLogRegular.class);
        return linkMicALogToAppLogRegularBean == null ? DEFAULT : linkMicALogToAppLogRegularBean;
    }

    public final List<String> getBlockList() {
        return getValue().blockList;
    }

    public final List<String> getLevelAllowList() {
        return getValue().levelAllowList;
    }

    public final List<String> getRoleAllowList() {
        return getValue().roleAllowList;
    }

    public final List<String> getTagModuleAllowList() {
        return getValue().tagModuleAllowList;
    }

    public final List<String> getWhiteList() {
        return getValue().whiteList;
    }
}
