package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CountCfg {

    @C09CT("background_clear")
    public final BadgeBackgroundClearCfg backgroundClearCfg;

    @C09CT("basic_info_list")
    public final List<BasicInfo> basicInfoList;

    @C09CT("count")
    public final Integer count;

    @C09CT("enable_number_reddot_cleanup")
    public final Boolean enableNumberReddotCleanup;

    @C09CT("number_reddot_cleanup_time")
    public final Long numberReddotCleanupTime;

    @C09CT("number_reddot_cleanup_type")
    public final String numberReddotCleanupType;

    @C09CT("reddot_strong_to_weak")
    public final BadgeRedDotStrongToWeakCfg redDotStrongToWeakCfg;

    @C09CT("show_type")
    public final Integer showType;

    @C09CT("text")
    public final String text;

    @C09CT("text_end_time_s")
    public final Long textEndTimeS;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountCfg(showType=");
        sbLIZ.append(this.showType);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textEndTimeS=");
        sbLIZ.append(this.textEndTimeS);
        sbLIZ.append(", basicInfoList=");
        sbLIZ.append(this.basicInfoList);
        sbLIZ.append(", backgroundClearCfg=");
        sbLIZ.append(this.backgroundClearCfg);
        sbLIZ.append(", redDotStrongToWeakCfg=");
        sbLIZ.append(this.redDotStrongToWeakCfg);
        sbLIZ.append(", enableNumberReddotCleanup=");
        sbLIZ.append(this.enableNumberReddotCleanup);
        sbLIZ.append(", numberReddotCleanupTime=");
        sbLIZ.append(this.numberReddotCleanupTime);
        sbLIZ.append(", numberReddotCleanupType=");
        sbLIZ.append(this.numberReddotCleanupType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CountCfg(Integer num, Integer num2, String str, Long l, List<BasicInfo> list, BadgeBackgroundClearCfg badgeBackgroundClearCfg, BadgeRedDotStrongToWeakCfg badgeRedDotStrongToWeakCfg, Boolean bool, Long l2, String str2) {
        this.showType = num;
        this.count = num2;
        this.text = str;
        this.textEndTimeS = l;
        this.basicInfoList = list;
        this.backgroundClearCfg = badgeBackgroundClearCfg;
        this.redDotStrongToWeakCfg = badgeRedDotStrongToWeakCfg;
        this.enableNumberReddotCleanup = bool;
        this.numberReddotCleanupTime = l2;
        this.numberReddotCleanupType = str2;
    }
}
