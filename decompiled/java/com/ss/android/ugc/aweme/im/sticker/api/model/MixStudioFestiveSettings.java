package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C01GW;
import X.C1644806cI;
import X.C1867320yh0;
import X.C441280HSc;
import X.C452501pT;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class MixStudioFestiveSettings {
    public static final MixStudioFestiveSettings INSTANCE = new MixStudioFestiveSettings();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final MixStudioFestiveData f71default = new MixStudioFestiveData(null, null, null, null, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/christmas_light.webp", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/christmas_dark.webp", "yyyyMMdd");
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(194));
    public static final C01GW dateTimeFormatter$delegate = C452501pT.LIZIZ(new C1867320yh0());

    public final MixStudioFestiveData getConfig() {
        return (MixStudioFestiveData) config$delegate.getValue();
    }

    public final DateTimeFormatter getDateTimeFormatter$im_sticker_saas_release() {
        return (DateTimeFormatter) dateTimeFormatter$delegate.getValue();
    }

    public final List<Emoji> getFestiveEmojis() {
        if (getIsValidTime()) {
            return getConfig().festiveEmojis;
        }
        return null;
    }

    public final String getFestiveId() {
        if (getIsValidTime()) {
            return getConfig().festiveId;
        }
        return null;
    }

    public final boolean getIsValidTime() {
        return getConfig().isValidTime() && C441280HSc.LIZ() && C1644806cI.LIZJ();
    }

    public final String getFestiveIntroSheetCDNUrl(boolean z) {
        if (getIsValidTime()) {
            if (z) {
                return getConfig().festiveIntroSheetImageDarkCdnUrl;
            }
            return getConfig().festiveIntroSheetImageLightCdnUrl;
        }
        return null;
    }
}
