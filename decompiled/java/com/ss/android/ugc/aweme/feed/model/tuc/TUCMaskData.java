package com.ss.android.ugc.aweme.feed.model.tuc;

import X.C09CT;
import com.ss.android.ugc.tiktok.tuc.model.TUCBackgroundData;
import com.ss.android.ugc.tiktok.tuc.model.TUCButtonData;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TUCMaskData implements Serializable {

    @C09CT("accessory")
    public final TUCButtonData accessory;

    @C09CT("background")
    public final TUCBackgroundData background;

    @C09CT("buttons")
    public final List<TUCButtonData> buttons;

    @C09CT("content")
    public final TUCLinkTextData content;

    @C09CT("eventTrack")
    public final TUCEventData event;

    @C09CT("extra_tip")
    public final MaskExtraTipData extraTip;

    @C09CT("icon")
    public final TUCIconData icon;

    @C09CT("title")
    public final TUCLinkTextData title;

    public TUCMaskData() {
        this(null, null, null, null, null, null, null, null);
    }

    public TUCMaskData(TUCEventData tUCEventData, TUCIconData tUCIconData, TUCLinkTextData tUCLinkTextData, TUCLinkTextData tUCLinkTextData2, TUCButtonData tUCButtonData, List<TUCButtonData> list, TUCBackgroundData tUCBackgroundData, MaskExtraTipData maskExtraTipData) {
        this.event = tUCEventData;
        this.icon = tUCIconData;
        this.title = tUCLinkTextData;
        this.content = tUCLinkTextData2;
        this.accessory = tUCButtonData;
        this.buttons = list;
        this.background = tUCBackgroundData;
        this.extraTip = maskExtraTipData;
    }
}
