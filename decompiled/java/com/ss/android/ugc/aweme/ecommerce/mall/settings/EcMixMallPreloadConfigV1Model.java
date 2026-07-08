package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallPreloadConfigV1Model {

    @C09CT("card_config")
    public final List<ECMixMallCardConfig> cardConfig;

    @C09CT("card_config_after_cache")
    public final List<ECMixMallCardConfig> cardConfigAfterCache;

    @C09CT("enable_full_preload_if_no_cache")
    public final Integer enableFullPreLoadIfNoCache;

    @C09CT("enable_mix_mall_preload")
    public final Integer enableMixMallPreload;

    @C09CT("enable_mix_mall_unique_preload")
    public final Integer enableMixMallUniquePreload;

    @C09CT("enable_pre_create_container")
    public final Integer enablePreCreateContainer;

    @C09CT("enable_pre_create_container_after_cache")
    public final Integer enablePreCreateContainerAfterCache;

    @C09CT("enable_pre_decode")
    public final Integer enablePreDecode;

    @C09CT("enable_pre_decode_after_cache")
    public final Integer enablePreDecodeAfterCache;

    @C09CT("enable_preload_global_props_clicking_tab")
    public final Integer enablePreloadGlobalPropsClickingTab;

    @C09CT("enable_preload_global_props_entering_vc")
    public final Integer enablePreloadGlobalPropsEnteringVC;

    @C09CT("enable_render_by_cache_first_screen")
    public final Integer enableRenderByCache;

    @C09CT("preload_cache_data_strategy")
    public final Integer preloadCacheStrategy;

    @C09CT("preload_strategy_version")
    public final String preloadStrategyVersion;

    public EcMixMallPreloadConfigV1Model() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public EcMixMallPreloadConfigV1Model(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<ECMixMallCardConfig> list, Integer num7, Integer num8, List<ECMixMallCardConfig> list2, Integer num9, Integer num10, Integer num11, String str) {
        this.enablePreCreateContainer = num;
        this.enablePreDecode = num2;
        this.enableFullPreLoadIfNoCache = num3;
        this.enableRenderByCache = num4;
        this.enablePreloadGlobalPropsClickingTab = num5;
        this.enablePreloadGlobalPropsEnteringVC = num6;
        this.cardConfig = list;
        this.enablePreCreateContainerAfterCache = num7;
        this.enablePreDecodeAfterCache = num8;
        this.cardConfigAfterCache = list2;
        this.preloadCacheStrategy = num9;
        this.enableMixMallPreload = num10;
        this.enableMixMallUniquePreload = num11;
        this.preloadStrategyVersion = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EcMixMallPreloadConfigV1Model(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List list, Integer num7, Integer num8, List list2, Integer num9, Integer num10, Integer num11, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? num : num, (i & 2) != 0 ? num : num2, (i & 4) != 0 ? 1 : num3, (i & 8) != 0 ? num : num4, (i & 16) != 0 ? num : num5, (i & 32) != 0 ? num : num6, (i & 64) != 0 ? C13BV.INSTANCE : list, (i & 128) != 0 ? num : num7, (i & 256) != 0 ? num : num8, (i & 512) != 0 ? C13BV.INSTANCE : list2, (i & 1024) == 0 ? num9 : 0, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 1 : num10, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 1 : num11, (i & 8192) != 0 ? CardStruct.IStatusCode.DEFAULT : str);
    }
}
