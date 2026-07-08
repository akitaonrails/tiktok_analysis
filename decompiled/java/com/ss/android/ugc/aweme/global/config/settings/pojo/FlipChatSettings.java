package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class FlipChatSettings {

    @C09CT("main_switch")
    public Boolean mainSwitch;

    @C09CT("msg_cell_avatar_url")
    public String msgCellAvatarUrl;

    @C09CT("msg_cell_name")
    public String msgCellName;

    @C09CT("show_launch_page_popup")
    public Boolean showLaunchPagePopup;

    @C09CT("show_login_icon")
    public Boolean showLoginIcon;

    @C09CT("show_msg_cell")
    public Boolean showMsgCell;

    public String getMsgCellAvatarUrl() throws C316660CbA {
        String str = this.msgCellAvatarUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getMsgCellName() throws C316660CbA {
        String str = this.msgCellName;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Boolean getMainSwitch() {
        return this.mainSwitch;
    }

    public Boolean getShowLaunchPagePopup() {
        return this.showLaunchPagePopup;
    }

    public Boolean getShowLoginIcon() {
        return this.showLoginIcon;
    }

    public Boolean getShowMsgCell() {
        return this.showMsgCell;
    }
}
