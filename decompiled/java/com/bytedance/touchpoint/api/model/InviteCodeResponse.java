package com.bytedance.touchpoint.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InviteCodeResponse {

    @C09CT("data")
    public Data data;

    @C09CT("err_no")
    public int errNo;

    @C09CT("err_tips")
    public String errTips = "";

    @C09CT("status_code")
    public int status_code;

    public static final class DisplayRewards {

        @C09CT("display_cash_amount")
        public final Integer displayCashAmount;

        public DisplayRewards() {
            this(0);
        }

        public DisplayRewards(Integer num) {
            this.displayCashAmount = num;
        }
    }

    public static final class Action {

        @C09CT("action_method")
        public final Integer actionMethod;

        @C09CT("action_type")
        public final Integer actionType;

        @C09CT("link")
        public final String link;

        public Action(Integer num, Integer num2, String str) {
            this.actionType = num;
            this.actionMethod = num2;
            this.link = str;
        }
    }

    public static final class UserInfo {

        @C09CT("avatar_url")
        public final String avatarUrl;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("name")
        public final String name;

        public UserInfo(String str, String str2, String str3) {
            this.id = str;
            this.name = str2;
            this.avatarUrl = str3;
        }
    }

    public static final class Button {

        @C09CT("action")
        public final Action action;

        @C09CT("background_color")
        public final List<String> bgColor;

        @C09CT("gradient_type")
        public final int gradientType;

        @C09CT("locations")
        public final List<Float> locations;

        @C09CT("text")
        public final Title text;

        public Button(Title title, List<String> list, int i, List<Float> list2, Action action) {
            this.text = title;
            this.bgColor = list;
            this.gradientType = i;
            this.locations = list2;
            this.action = action;
        }
    }

    public static final class InviteResultPopup {

        @C09CT("buttons")
        public final List<Button> buttons;

        @C09CT("cover_image")
        public final String coverImage;

        @C09CT("description")
        public final Title decription;

        @C09CT("popup_type")
        public final String popupType;

        @C09CT("title")
        public final Title title;

        public InviteResultPopup(String str, String str2, Title title, Title title2, List<Button> list) {
            this.popupType = str;
            this.coverImage = str2;
            this.title = title;
            this.decription = title2;
            this.buttons = list;
        }
    }

    public static final class Data {

        @C09CT("display_rewards")
        public final DisplayRewards displayRewards;

        @C09CT("invite_bind_result_inapp_push")
        public final InAppPush inviteResultInAppPush;

        @C09CT("invite_bind_result_popup")
        public final InviteResultPopup inviteResultPopup;

        @C09CT("invitee_info")
        public final UserInfo inviteeInfo;

        @C09CT("invite_bind_status")
        public final Integer inviterBindStatus;

        @C09CT("inviter_info")
        public final UserInfo inviterInfo;

        @C09CT("invite_bind_result_message")
        public final String inviterResultMessage;

        public Data() {
            this(null, null, null, -1, "", null, null);
        }

        public Data(DisplayRewards displayRewards, UserInfo userInfo, UserInfo userInfo2, Integer num, String str, InviteResultPopup inviteResultPopup, InAppPush inAppPush) {
            this.displayRewards = displayRewards;
            this.inviteeInfo = userInfo;
            this.inviterInfo = userInfo2;
            this.inviterBindStatus = num;
            this.inviterResultMessage = str;
            this.inviteResultPopup = inviteResultPopup;
            this.inviteResultInAppPush = inAppPush;
        }
    }
}
