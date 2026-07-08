package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallItemInfoDTO {

    @C09CT("play_config")
    public Map<String, Object> config;

    @C09CT("container_type")
    public String containerType;

    @C09CT("gec_card_config")
    public ECMixMallItemInfoGecCardDTO gecCard;

    @C09CT("lynx_config")
    public ECMixMallItemInfoLynxDTO lynx;

    @C09CT("preload_config")
    public List<PreloadConfig> preloadConfig;

    @C09CT("style")
    public ECMixMallStyleDTO style;
}
