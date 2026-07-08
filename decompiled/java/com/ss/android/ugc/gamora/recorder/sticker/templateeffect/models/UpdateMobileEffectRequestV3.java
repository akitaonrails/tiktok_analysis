package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class UpdateMobileEffectRequestV3 {

    @C09CT("custom_app_effect_id")
    public final Long customAppEffectId;

    @C09CT("effect_source")
    public final Integer effectSource;

    @C09CT("icon_list")
    public final List<Icon> iconList;

    @C09CT("name")
    public final String name;

    public UpdateMobileEffectRequestV3(Long l, String str, List<Icon> list, Integer num) {
        this.customAppEffectId = l;
        this.name = str;
        this.iconList = list;
        this.effectSource = num;
    }
}
