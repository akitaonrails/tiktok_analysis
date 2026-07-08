package com.ss.android.ugc.aweme.feed.model.tuc;

import X.C09CT;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TUCBannerData implements Serializable {

    @C09CT("banner_action")
    public TUCProcessData action;

    @C09CT("event")
    public TUCEventData event;

    @C09CT("left_icon")
    public TUCIconData leftIcon;

    @C09CT("right_icon")
    public TUCIconData rightIcon;

    @C09CT("scenario")
    public String scenario;

    @C09CT("title")
    public TUCLinkTextData title;

    @C09CT("type")
    public String type;

    public TUCBannerData() {
        this(null, null, null, null, null, null, null);
    }

    public TUCBannerData(String str, String str2, TUCEventData tUCEventData, TUCIconData tUCIconData, TUCLinkTextData tUCLinkTextData, TUCIconData tUCIconData2, TUCProcessData tUCProcessData) {
        this.scenario = str;
        this.type = str2;
        this.event = tUCEventData;
        this.leftIcon = tUCIconData;
        this.title = tUCLinkTextData;
        this.rightIcon = tUCIconData2;
        this.action = tUCProcessData;
    }
}
