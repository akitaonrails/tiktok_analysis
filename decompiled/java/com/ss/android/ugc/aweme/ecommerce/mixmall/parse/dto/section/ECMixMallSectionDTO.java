package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.section;

import X.C09CT;
import com.google.gson.h;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.tab.ECMixMallMultiTabDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.vo.item.ECMixMallPadStyleItemBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallSectionDTO {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("items")
    public ArrayList<ECMixMallItemDTO> items;

    @C09CT("multi_tab")
    public ECMixMallMultiTabDTO multiTab;

    @C09CT("pad_styles")
    public ArrayList<ECMixMallPadStyleItemBean> padStyles;

    @C09CT("style")
    public ECMixMallStyleDTO style;

    @C09CT("webcast_lru_cache_list")
    public h webcastLruCacheList;
}
