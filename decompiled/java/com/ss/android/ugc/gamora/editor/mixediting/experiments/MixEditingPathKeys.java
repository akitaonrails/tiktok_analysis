package com.ss.android.ugc.gamora.editor.mixediting.experiments;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingPathKeys {

    @C09CT("delay_show_container")
    public final int delayShowContainer;

    @C09CT("enable_ai_template_recommend")
    public final boolean enableAITemplateRecommend;

    @C09CT("enable_auto_show_entrance")
    public final boolean enableAutoShowEntrance;

    @C09CT("enable_bottom_entrance")
    public final boolean enableBottomEntrance;

    @C09CT("enable_combine_effect_with_music")
    public final boolean enableCombineEffectWithMusic;

    @C09CT("enable_default_apply")
    public final int enableDefaultApply;

    @C09CT("enable_effect_recommend")
    public final boolean enableEffectRecommend;

    @C09CT("enable_mix_material")
    public final boolean enableMixMaterial;

    @C09CT("enable_sound_sync_recommend")
    public final boolean enableSoundSyncRecommend;

    @C09CT("enable_template_recommend")
    public final boolean enableTemplateRecommend;

    @C09CT("enable_upload_visual_features")
    public final boolean enableUploadVisualFeatures;

    @C09CT("filter_asset_type_list")
    public final List<Integer> filterAssetTypeList;

    @C09CT("sound_sync_insert_count")
    public final int soundSyncInsertCount;

    public MixEditingPathKeys() {
        this(false, false, false, false, false, false, false, false, false, 0, 0, 0, null, 8191, null);
    }

    public MixEditingPathKeys(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, List<Integer> list) {
        this.enableMixMaterial = z;
        this.enableBottomEntrance = z2;
        this.enableAutoShowEntrance = z3;
        this.enableEffectRecommend = z4;
        this.enableTemplateRecommend = z5;
        this.enableAITemplateRecommend = z6;
        this.enableSoundSyncRecommend = z7;
        this.enableUploadVisualFeatures = z8;
        this.enableCombineEffectWithMusic = z9;
        this.soundSyncInsertCount = i;
        this.enableDefaultApply = i2;
        this.delayShowContainer = i3;
        this.filterAssetTypeList = list;
    }

    public MixEditingPathKeys(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? false : z3, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? false : z5, (i4 & 32) != 0 ? false : z6, (i4 & 64) != 0 ? false : z7, (i4 & 128) != 0 ? false : z8, (i4 & 256) != 0 ? false : z9, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) == 0 ? i2 : 0, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i3, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list);
    }
}
