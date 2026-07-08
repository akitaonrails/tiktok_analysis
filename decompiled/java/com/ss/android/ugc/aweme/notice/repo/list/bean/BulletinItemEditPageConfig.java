package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemEditPageConfig {

    @C09CT("active_icon_url")
    public final TuxImageModel activeIconUrl;

    @C09CT("background_url")
    public final TuxImageModel backgroundUrl;

    @C09CT("bubble_struct")
    public final BulletinBubbleStruct bubbleStruct;

    @C09CT("cursor_color")
    public final String cursorColor;

    @C09CT("front_style")
    public final Integer frontStyle;

    @C09CT("guide_text_struct")
    public final BulletinTextStruct guideTextStruct;

    @C09CT("inactive_icon_url")
    public final TuxImageModel inactiveIconUrl;

    @C09CT("keywords")
    public final List<String> keywords;

    @C09CT("status_bar_color")
    public final String statusBarColor;

    @C09CT("text_struct")
    public final BulletinTextStruct textStruct;

    public BulletinItemEditPageConfig() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public BulletinItemEditPageConfig(TuxImageModel tuxImageModel, BulletinTextStruct bulletinTextStruct, List<String> list, BulletinTextStruct bulletinTextStruct2, String str, TuxImageModel tuxImageModel2, TuxImageModel tuxImageModel3, BulletinBubbleStruct bulletinBubbleStruct, Integer num, String str2) {
        this.backgroundUrl = tuxImageModel;
        this.textStruct = bulletinTextStruct;
        this.keywords = list;
        this.guideTextStruct = bulletinTextStruct2;
        this.cursorColor = str;
        this.activeIconUrl = tuxImageModel2;
        this.inactiveIconUrl = tuxImageModel3;
        this.bubbleStruct = bulletinBubbleStruct;
        this.frontStyle = num;
        this.statusBarColor = str2;
    }
}
