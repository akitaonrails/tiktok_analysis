package com.ss.android.ugc.aweme.ecommerce.image.adapt;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.EnumC20159313uJ;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomCommonOptimizeConfigBean;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomImageAdaptSizeGlobalBean {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(100, 150, 220, 310, 400, 500, Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT), 900, 1100, 1300, 1600);
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(720, 1080, 1440);
    public static final EnumC20159313uJ LIZJ;
    public static final EnumC20159313uJ LIZLLL;

    @C09CT("adapt_strategy")
    public String adaptStrategy;

    @C09CT("config_screen_stages")
    public List<Integer> configScreenWidthStages;

    @C09CT("image_adaptive_size_with_main_tab_bottom")
    public String imageAdaptiveSizeWithMainTabBottom;

    @C09CT("image_element_load_opt")
    public EcomCommonOptimizeConfigBean imageElementLoadOpt;

    @C09CT("lru_cache_config")
    public EcomImageAdaptiveSizeLruCacheConfig lruCacheConfig;

    @C09CT("no_cache")
    public boolean noCache;

    @C09CT("test_config_screen")
    public List<Integer> testConfigScreen = C13BV.INSTANCE;

    @C09CT("all_stages")
    public List<Integer> allStages = LIZ;

    @C09CT("screen_stages")
    public List<Integer> screenWidthStages = LIZIZ;

    @C09CT("screen_adapt_type")
    public String screenAdaptType = LIZJ.getValue();

    @C09CT("image_adapt_type")
    public String imageAdaptType = LIZLLL.getValue();

    @C09CT("lru_cache_size")
    public int lruCacheSize = 50;

    static {
        EnumC20159313uJ enumC20159313uJ = EnumC20159313uJ.NEAR_ADDITION;
        LIZJ = enumC20159313uJ;
        LIZLLL = enumC20159313uJ;
    }
}
