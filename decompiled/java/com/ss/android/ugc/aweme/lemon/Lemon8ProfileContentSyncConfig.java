package com.ss.android.ugc.aweme.lemon;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class Lemon8ProfileContentSyncConfig {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("banner_button_text")
    public final String bannerButtonText;

    @C09CT("banner_content")
    public final String bannerContent;

    @C09CT("popup_bottom_des")
    public final String bottomDes;

    @C09CT("can_show_popup")
    public final boolean canShowPopup;

    @C09CT("popup_content_items")
    public final List<Object> contentItems;

    @C09CT("cur_showed_count")
    public final int curShowedCount;

    @C09CT("max_show_count")
    public final int maxShowCount;

    @C09CT("min_config_show_duration_day")
    public final int minConfigShowDurationDay;

    @C09CT("min_show_duration_day")
    public final int minShowDurationDay;

    @C09CT("popup_auth_content_image_urls")
    public final List<Lemon8SyncPopupImages> popupAuthContentImageUrls;

    @C09CT("popup_avatar_image_list")
    public final List<String> popupAvatarList;

    @C09CT("popup_avatar_url")
    public final String popupAvatarUrl;

    @C09CT("popup_confirm_button_text")
    public final String popupConfirmButtonText;

    @C09CT("popup_content")
    public final String popupContent;

    @C09CT("is_fallback")
    public final boolean popupIsFallbackStyle;

    @C09CT("popup_learn_more_schema")
    public final String popupLearnMoreSchema;

    @C09CT("popup_learn_more_text")
    public final String popupLearnMoreText;

    @C09CT("popup_nickname")
    public final String popupNickname;

    @C09CT("popup_title")
    public final String popupTitle;

    @C09CT("popup_toggle_text")
    public final String popupToggleText;

    @C09CT("popup_config_header_image")
    public final List<String> popupTopImage;

    @C09CT("popup_post_cover_image_list")
    public final List<String> postCoverImages;

    @C09CT("show_style")
    public final int showStyle;

    @C09CT("popup_show_toggle")
    public final boolean showToggle;

    @C09CT("toast_result_fail_text")
    public final String toastResultFailText;

    @C09CT("toast_result_success_text")
    public final String toastResultSuccessText;

    @C09CT("uid")
    public final String uid;

    public Lemon8ProfileContentSyncConfig() {
        this(-1, "", "", "", "", "", "", "", "", "", "", "", "", false, null, null, null, 0, 0, 0, null, null, false, null, null, false, 1);
    }

    public Lemon8ProfileContentSyncConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, List<String> list, List<Object> list2, String str13, int i2, int i3, int i4, String str14, List<Lemon8SyncPopupImages> list3, boolean z2, List<String> list4, List<String> list5, boolean z3, int i5) {
        this.showStyle = i;
        this.bannerContent = str;
        this.bannerButtonText = str2;
        this.popupAvatarUrl = str3;
        this.popupNickname = str4;
        this.popupTitle = str5;
        this.popupContent = str6;
        this.popupLearnMoreText = str7;
        this.popupLearnMoreSchema = str8;
        this.popupToggleText = str9;
        this.popupConfirmButtonText = str10;
        this.toastResultSuccessText = str11;
        this.toastResultFailText = str12;
        this.canShowPopup = z;
        this.postCoverImages = list;
        this.contentItems = list2;
        this.bottomDes = str13;
        this.maxShowCount = i2;
        this.minShowDurationDay = i3;
        this.curShowedCount = i4;
        this.uid = str14;
        this.popupAuthContentImageUrls = list3;
        this.showToggle = z2;
        this.popupAvatarList = list4;
        this.popupTopImage = list5;
        this.popupIsFallbackStyle = z3;
        this.minConfigShowDurationDay = i5;
    }
}
