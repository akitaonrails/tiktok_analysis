package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.EnumC20542815Zy;
import X.EnumC20542915Zz;

/* JADX INFO: loaded from: classes32.dex */
public final class DailyScreenTimeMeditation {

    @C09CT("button_type")
    public final EnumC20542915Zz buttonType;

    @C09CT("counts")
    public final Integer counts;

    @C09CT("seconds")
    public final Integer seconds;

    @C09CT("type")
    public final EnumC20542815Zy type;

    @C09CT("type_id")
    public final Integer typeID;

    public DailyScreenTimeMeditation(EnumC20542815Zy enumC20542815Zy, Integer num, Integer num2, Integer num3, EnumC20542915Zz enumC20542915Zz) {
        this.type = enumC20542815Zy;
        this.seconds = num;
        this.typeID = num2;
        this.counts = num3;
        this.buttonType = enumC20542915Zz;
    }
}
