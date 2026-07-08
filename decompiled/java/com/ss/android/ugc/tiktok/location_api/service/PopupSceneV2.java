package com.ss.android.ugc.tiktok.location_api.service;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes19.dex */
public final class PopupSceneV2 {

    @C09CT("hidden_popup_title")
    public final int hidePopupTitle;

    @C09CT("open_settings_text")
    public final String openSettingsText;

    @C09CT("open_settings_title_text")
    public final String openSettingsTitleText;

    @C09CT("popup_text")
    public final String popupText;

    @C09CT("popup_ui_type")
    public final int popupUIType;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("show_open_settings")
    public final int showOpenSetting;

    @C09CT("show_preinstructions")
    public final int showPreInstruction;

    public PopupSceneV2(String str, int i, int i2, int i3, String str2, String str3, String str4, int i4) {
        this.scene = str;
        this.showPreInstruction = i;
        this.popupUIType = i2;
        this.showOpenSetting = i3;
        this.popupText = str2;
        this.openSettingsText = str3;
        this.openSettingsTitleText = str4;
        this.hidePopupTitle = i4;
    }
}
