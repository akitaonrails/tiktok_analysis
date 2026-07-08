package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleComboInfo {

    @C09CT("combo_count")
    public long comboCount;

    @C09CT("combo_count_str")
    public String comboCountStr;

    @C09CT("combo_icon_url")
    public String comboIconUrl;

    @C09CT("combo_rule_guide_schema")
    public String comboRuleGuideSchema;

    @C09CT("combo_status")
    public long comboStatus;

    @C09CT("combo_type")
    public int comboType;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_id_str")
    public String userIdStr;

    public BattleComboInfo() {
        this(0L, 0L, 0L, null, 0, null, "", "");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleComboInfo(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", comboStatus=");
        sbLIZ.append(this.comboStatus);
        sbLIZ.append(", comboCount=");
        sbLIZ.append(this.comboCount);
        sbLIZ.append(", comboIconUrl=");
        sbLIZ.append(this.comboIconUrl);
        sbLIZ.append(", comboType=");
        sbLIZ.append(this.comboType);
        sbLIZ.append(", comboRuleGuideSchema=");
        sbLIZ.append(this.comboRuleGuideSchema);
        sbLIZ.append(", userIdStr=");
        sbLIZ.append(this.userIdStr);
        sbLIZ.append(", comboCountStr=");
        sbLIZ.append(this.comboCountStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BattleComboInfo(long j, long j2, long j3, String str, int i, String str2, String str3, String str4) {
        this.userId = j;
        this.comboStatus = j2;
        this.comboCount = j3;
        this.comboIconUrl = str;
        this.comboType = i;
        this.comboRuleGuideSchema = str2;
        this.userIdStr = str3;
        this.comboCountStr = str4;
    }
}
