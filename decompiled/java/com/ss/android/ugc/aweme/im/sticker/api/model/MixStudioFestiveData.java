package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MixStudioFestiveData implements Serializable {

    @C09CT("festive_effective_end_date_yyyyMMdd")
    public final String festiveEffectiveEndDate;

    @C09CT("festive_effective_start_date_yyyyMMdd")
    public final String festiveEffectiveStartDate;

    @C09CT("festive_emojis")
    public final List<Emoji> festiveEmojis;

    @C09CT("festive_id")
    public final String festiveId;

    @C09CT("festive_intro_sheet_image_dark_cdn_url")
    public final String festiveIntroSheetImageDarkCdnUrl;

    @C09CT("festive_intro_sheet_image_light_cdn_url")
    public final String festiveIntroSheetImageLightCdnUrl;

    @C09CT("festive_time_formatter_pattern")
    public final String festiveTimeFormatterPattern;

    public MixStudioFestiveData() {
        this(null, null, null, null, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/christmas_light.webp", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/christmas_dark.webp", "yyyyMMdd");
    }

    public final boolean isValidTime() {
        String str;
        LocalDate localDate;
        String str2 = this.festiveEffectiveStartDate;
        if (str2 == null) {
            return false;
        }
        MixStudioFestiveSettings mixStudioFestiveSettings = MixStudioFestiveSettings.INSTANCE;
        LocalDate localDate2 = LocalDate.parse(str2, mixStudioFestiveSettings.getDateTimeFormatter$im_sticker_saas_release());
        if (localDate2 == null || (str = this.festiveEffectiveEndDate) == null || (localDate = LocalDate.parse(str, mixStudioFestiveSettings.getDateTimeFormatter$im_sticker_saas_release())) == null) {
            return false;
        }
        LocalDate localDateNow = LocalDate.now();
        return localDateNow.compareTo((ChronoLocalDate) localDate2) >= 0 && localDateNow.compareTo((ChronoLocalDate) localDate) <= 0;
    }

    public MixStudioFestiveData(String str, List<Emoji> list, String str2, String str3, String str4, String str5, String str6) {
        this.festiveId = str;
        this.festiveEmojis = list;
        this.festiveEffectiveStartDate = str2;
        this.festiveEffectiveEndDate = str3;
        this.festiveIntroSheetImageLightCdnUrl = str4;
        this.festiveIntroSheetImageDarkCdnUrl = str5;
        this.festiveTimeFormatterPattern = str6;
    }
}
