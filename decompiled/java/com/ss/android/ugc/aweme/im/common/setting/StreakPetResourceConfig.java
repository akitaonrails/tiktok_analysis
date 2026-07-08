package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetResourceConfig {

    @C09CT("cold_start_resource_description")
    public final List<StreakPetResourceDescription> coldStartResourceDescriptionList;

    @C09CT("enter_chat_page_resource_description")
    public final List<StreakPetResourceDescription> enterChatPageResourceDescriptionList;

    @C09CT("streak_group_pet_resource_description")
    public final Map<String, StreakPetResourceDescription> streakGroupPetResourceDescriptionMap;

    @C09CT("streak_pet_resource_description")
    public final Map<String, StreakPetResourceDescription> streakPetResourceDescriptionMap;

    public StreakPetResourceConfig() {
        this(null, null, null, null, 15, null);
    }

    public StreakPetResourceConfig(List<StreakPetResourceDescription> list, List<StreakPetResourceDescription> list2, Map<String, StreakPetResourceDescription> map, Map<String, StreakPetResourceDescription> map2) {
        this.coldStartResourceDescriptionList = list;
        this.enterChatPageResourceDescriptionList = list2;
        this.streakPetResourceDescriptionMap = map;
        this.streakGroupPetResourceDescriptionMap = map2;
    }

    public StreakPetResourceConfig(List list, List list2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C2097608Jq.LJ() : map, (i & 8) != 0 ? C2097608Jq.LJ() : map2);
    }
}
