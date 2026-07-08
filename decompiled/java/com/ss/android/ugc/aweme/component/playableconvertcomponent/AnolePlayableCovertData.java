package com.ss.android.ugc.aweme.component.playableconvertcomponent;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnolePlayableCovertData implements Serializable {
    public static final int $stable = 8;

    @C09CT("call_to_action")
    public final ButtonData ctaButton;

    @C09CT("desc")
    public final String desc;

    @C09CT("label")
    public final SponsoredLabel label;

    @C09CT("log_info")
    public final AnoleLogInfo logInfo;

    @C09CT("not_interested_btn")
    public final ButtonData notInterestedButton;

    @C09CT("thumb")
    public final String thumb;

    @C09CT("title")
    public final String title;

    public AnolePlayableCovertData() {
        this(null, null, null, null, null, null, null);
    }

    public AnolePlayableCovertData(SponsoredLabel sponsoredLabel, String str, String str2, String str3, ButtonData buttonData, ButtonData buttonData2, AnoleLogInfo anoleLogInfo) {
        this.label = sponsoredLabel;
        this.thumb = str;
        this.title = str2;
        this.desc = str3;
        this.notInterestedButton = buttonData;
        this.ctaButton = buttonData2;
        this.logInfo = anoleLogInfo;
    }
}
