package com.ss.ugc.effectplatform.model.whitelist;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabelInReq;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectWhitelistFeatureFlagSceneStruct {

    @C09CT("forbid_list_config")
    public final EffectLabelInReq blacklistConfig;

    @C09CT("exclude_picker_effects")
    public final boolean excludePickerEffects;

    @C09CT("excluded_category_keys")
    public final List<String> excludedCategoryKeys;

    @C09CT("non_picker_forbid_v2_tags")
    public final List<String> nonPickerBlacklistV2Tags;

    @C09CT("allow_list_config")
    public final EffectLabelInReq whitelistConfig;

    public EffectWhitelistFeatureFlagSceneStruct() {
        this(null, null, null, false, null, 31, null);
    }

    public EffectWhitelistFeatureFlagSceneStruct(EffectLabelInReq effectLabelInReq, EffectLabelInReq effectLabelInReq2, List<String> list, boolean z, List<String> list2) {
        this.whitelistConfig = effectLabelInReq;
        this.blacklistConfig = effectLabelInReq2;
        this.excludedCategoryKeys = list;
        this.excludePickerEffects = z;
        this.nonPickerBlacklistV2Tags = list2;
    }

    public EffectWhitelistFeatureFlagSceneStruct(EffectLabelInReq effectLabelInReq, EffectLabelInReq effectLabelInReq2, List list, boolean z, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new EffectLabelInReq(null, null, null, 7, null) : effectLabelInReq, (i & 2) != 0 ? new EffectLabelInReq(null, null, null, 7, null) : effectLabelInReq2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : list2);
    }
}
