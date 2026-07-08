package com.ss.android.ugc.tiktok.security.csrf;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class CSRFSettingsBean {

    @C09CT("csrf_get_api_block_list")
    public final List<BlockRuleBean> getApiBlockList;

    @C09CT("csrf_get_path_white_list")
    public final List<String> getPathWhiteList;

    @C09CT("csrf_get_white_list")
    public final List<String> getWhiteList;

    @C09CT("enable_get_apicall_report")
    public final boolean isApiCallReport;

    @C09CT("enable_csrf_cookie_block")
    public final boolean isBlockCookie;

    @C09CT("enable_csrf_token_block")
    public final boolean isBlockToken;

    @C09CT("enable_ttp_cookie_block")
    public final boolean isBlockTtnet;

    @C09CT("enable_crosssite_apicall_report")
    public final boolean isCrosssiteReport;

    @C09CT("enable_get_api_block")
    public final boolean isGetApiBlock;

    @C09CT("enable_csrf_navigation_block")
    public final boolean isNavigationBlock;

    @C09CT("csrf_post_api_block_list")
    public final List<BlockRuleBean> postApiBlockList;

    @C09CT("csrf_post_path_white_list")
    public final List<String> postPathWhiteList;

    @C09CT("csrf_post_white_list")
    public final List<String> postWhiteList;

    public CSRFSettingsBean() {
        this(false, false, false, false, false, false, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    public CSRFSettingsBean(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<BlockRuleBean> list5, List<BlockRuleBean> list6) {
        this.isBlockCookie = z;
        this.isBlockToken = z2;
        this.isBlockTtnet = z3;
        this.isApiCallReport = z4;
        this.isCrosssiteReport = z5;
        this.isNavigationBlock = z6;
        this.isGetApiBlock = z7;
        this.getWhiteList = list;
        this.getPathWhiteList = list2;
        this.postWhiteList = list3;
        this.postPathWhiteList = list4;
        this.getApiBlockList = list5;
        this.postApiBlockList = list6;
    }
}
