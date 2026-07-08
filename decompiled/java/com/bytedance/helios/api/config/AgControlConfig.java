package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13LQ;
import X.C1697810uHb;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class AgControlConfig {

    @C09CT("ag_control_enable")
    public boolean agControlEnable;

    @C09CT("ag_control_schema")
    public final NetworkCondition agControlList;

    @C09CT("ag_control_strategy")
    public Set<String> agControlStrategyEnable;

    @C09CT("ag_hybrid_allow_site")
    public final Set<String> agHybridAllowSite;

    @C09CT("all_block_list")
    public final NetworkCondition allBlockList;

    @C09CT("cdn_allow_list")
    public final NetworkCondition cdnAllowList;

    @C09CT("cdn_domain_allow_list")
    public final Set<String> cdnDomainAllowList;

    @C09CT("cdn_domain_list")
    public final Set<String> cdnDomainList;

    @C09CT("cookie_store_region_allow_list")
    public final NetworkCondition cookieStoreRegionAllowList;

    @C09CT("cookie_store_region_block_list")
    public final NetworkCondition cookieStoreRegionBlockList;

    @C09CT("hybrid_block_list")
    public final NetworkCondition hybridBlockList;

    @C09CT("is_block_bd_1st")
    public boolean isBlockBd1st;

    @C09CT("native_block_list")
    public final NetworkCondition nativeBlockList;

    @C09CT("report_only_when_block")
    public boolean reportOnlyWhenBlock;

    @C09CT("skip_for_special_ua")
    public boolean skipForSpecialUA;

    @C09CT("vgeo_domain_list")
    public final Set<String> vgeoDomainList;

    public AgControlConfig() {
        this(false, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public AgControlConfig(boolean z, boolean z2, boolean z3, Set<String> set, boolean z4, NetworkCondition networkCondition, Set<String> set2, Set<String> set3, NetworkCondition networkCondition2, NetworkCondition networkCondition3, NetworkCondition networkCondition4, Set<String> set4, Set<String> set5, NetworkCondition networkCondition5, NetworkCondition networkCondition6, NetworkCondition networkCondition7) {
        this.agControlEnable = z;
        this.isBlockBd1st = z2;
        this.reportOnlyWhenBlock = z3;
        this.agControlStrategyEnable = set;
        this.skipForSpecialUA = z4;
        this.agControlList = networkCondition;
        this.cdnDomainList = set2;
        this.cdnDomainAllowList = set3;
        this.cdnAllowList = networkCondition2;
        this.cookieStoreRegionAllowList = networkCondition3;
        this.cookieStoreRegionBlockList = networkCondition4;
        this.vgeoDomainList = set4;
        this.agHybridAllowSite = set5;
        this.allBlockList = networkCondition5;
        this.hybridBlockList = networkCondition6;
        this.nativeBlockList = networkCondition7;
    }

    public AgControlConfig(boolean z, boolean z2, boolean z3, Set set, boolean z4, NetworkCondition networkCondition, Set set2, Set set3, NetworkCondition networkCondition2, NetworkCondition networkCondition3, NetworkCondition networkCondition4, Set set4, Set set5, NetworkCondition networkCondition5, NetworkCondition networkCondition6, NetworkCondition networkCondition7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? C13LQ.LJLIIL(new String[]{"1", "2", "3", "4", "5", "6", "8", "9", "10", "11"}) : set, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? new NetworkCondition(C1697810uHb.LJIIJJI(new ValueCondition("End", C13LQ.LJLIIL(new String[]{".us.tiktokv.com", ".us.tiktok.com", ".tiktokv.us", ".tiktokw.us", ".adsintegrity.us", ".us.tiktokapis.com", ".tiktokcdn-us.com"}), 1.0d), new ValueCondition("Exact", C13LQ.LJLIIL(new String[]{"us.tiktokv.com", "us.tiktok.com", "tiktokv.us", "tiktokw.us", "adsintegrity.us", "us.tiktokapis.com", "tiktokcdn-us.com"}), 1.0d)), null, null, 6, null) : networkCondition, (i & 64) != 0 ? C13LQ.LJLIIL(new String[]{"tiktokcdn-us.com", "tiktokcdn.com", "tiktokcdn-eu.com", "oecstatic.com", "lf16-effectcdn.byteeffecttos-g.com", "lf19-effectcdn.byteeffecttos-g.com", "sf31-effect.letschattos3.com", "sf16-effect-tiktok.byteeffecttos-g.com", "sf19-effect-tiktok.byteeffecttos-g.com", "sf16-effect-capcut.byteeffecttos-g.com", "sf19-effect-capcut.byteeffecttos-g.com"}) : set2, (i & 128) != 0 ? C13LQ.LJLIIL(new String[]{"sf16-va.tiktokcdn.com", "lfm-gecko-source.tiktokcdn-us.com", "lf16-gecko-source.tiktokcdn-us.com", "lf19-gecko-source.tiktokcdn-us.com", "lf-main-gecko-source.tiktokcdn.com", "lf16-gecko-source.tiktokcdn.com", "lf19-gecko-source.tiktokcdn.com", "lf21-gecko-source.tiktokcdn.com", "lf77-gecko-source.tiktokcdn.com", "lf16-effectcdn.byteeffecttos-g.com", "lf19-effectcdn.byteeffecttos-g.com", "lf16-effectcdn-va.tiktokcdn.com", "lf19-effectcdn-va.tiktokcdn.com", "lf21-effectcdn-va.tiktokcdn.com", "sf31-effect.letschattos3.com", "sf16-effect-tiktok.byteeffecttos-g.com", "sf19-effect-tiktok.byteeffecttos-g.com", "sf16-effect-capcut.byteeffecttos-g.com", "sf19-effect-capcut.byteeffecttos-g.com", "lf19-pitayacdn.tiktokcdn.com", "lf16-pitayacdn.tiktokcdn.com", "sf16-on-device-ml-product-sign.tiktokcdn.com", "sf19-on-device-ml-product-sign.tiktokcdn.com", "sf16-on-device-ml-product-sign.tiktokcdn-us.com", "sf19-on-device-ml-product-sign.tiktokcdn-us.com", "sf16-on-device-ml-product-sign.tiktokcdn-eu.com", "sf19-on-device-ml-product-sign.tiktokcdn-eu.com", "p16-sg.tiktokcdn.com", "p16-sign-va.tiktokcdn.com", "p16-amd-va.tiktokcdn.com", "p16-sign-useast2a.tiktokcdn.com", "p16-sign-sg.tiktokcdn.com", "p77-sign-va.tiktokcdn.com", "p16-useast2a.tiktokcdn.com", "p77-sg.tiktokcdn.com", "p16-pu-sign-ie.tiktokcdn-eu.com", "p77-sign-sg.tiktokcdn.com", "p58-sg.tiktokcdn.com", "p9-sign-sg.tiktokcdn.com", "p77-sign-va-lite.tiktokcdn.com", "p58-sign-sg.tiktokcdn.com", "p77-sign-sg-lite.tiktokcdn.com", "p53-sg.tiktokcdn.com", "p16.tiktokcdn.com", "p16-pu-ie.tiktokcdn-eu.com", "p58-va.tiktokcdn.com", "p9-sg.tiktokcdn.com", "sf16.tiktokcdn.com", "p77-va.tiktokcdn.com", "p3-sg.tiktokcdn.com", "p58-sign-va.tiktokcdn.com", "p16-m-sign-useast2a.ibyteimg.com", "p16-m-sign-va.ibyteimg.com", "p16-m-sign-sg.ibyteimg.com", "p16.tiktokcdn.com", "sf16-ies-music.tiktokcdn.com", "p16-graph-va.tiktokcdn.com", "sf16-sg.tiktokcdn.com"}) : set3, (i & 256) != 0 ? null : networkCondition2, (i & 512) != 0 ? new NetworkCondition(Collections.singletonList(new ValueCondition("Exact", C13LQ.LJLIIL(new String[]{"api-boot.tiktokv.com", "libra-boot.tiktokv.com", "gecko-boot.tiktokv.com", "tnc-boot.tiktokv.com", "api-core-boot.tiktokv.com", "vcs-boot.tiktokv.com", "log-boot.tiktokv.com", "rtlog-boot.tiktokv.com", "mon-boot.tiktokv.com", "pitaya-boot.tiktokv.com", "webcast-boot.tiktokv.com", "mssdk-boot.tiktokv.com", "jsb-boot.tiktokv.com", "ugattribution-boot.tiktokv.com", "xdevice-boot.tiktokv.com", "live.tiktok.com", "livecenter.tiktok.com", "m.tiktok.com", "newsroom.tiktok.com", "now.tiktok.com", "open-api.tiktok.com", "p0-pu-private-useast8.tiktok.com", "p0-tiktok-dm-private-useast8.tiktok.com", "support.tiktok.com", "t.tiktok.com", "tv.tiktok.com", "vm.tiktok.com", "vt.tiktok.com", "rc-verification-va.tiktokv.com", "zero-rating.tiktok.com", "p16-va-tiktok.ibyteimg.com"}), 1.0d)), Collections.singletonList(new ValueCondition("Start", C13LQ.LJLIIL(new String[]{"/feedback/3/common_feedback_list/", "/api/v1/governance/creator/violation/", "/aweme/v1/data/user/info/", "/aweme/v1/material/upload/", "/aweme/v1/data/user/info/request/cancel/", "/webcast/review/get_ban_record/", "/webcast/review/general_appeal/", "/tiktok/age/verify/", "/tiktok/v1/age/verify/", "/tiktok/v1/facial/age/estimation/", "/aweme/v1/adult/verify/get/accepted/id/types/", "/tiktok/age/strategy/detail/get/v1/", "/tiktok/account/status/get/v1", "/tiktok/v1/user/survey_collection/upload/", "/tiktok/v1/violation/ban_survey/", "/tiktok/v2/violation/detail", "/aweme/v1/violation/list/", "/aweme/v2/appeal/status", "/aweme/v2/appeal/commit", "/tiktok/v1/appeal/reason/", "/feedback/3/common_feedback_list/", "/captcha/", "/ies/speed/", "/service/2/device_register/", "/passport", "/get_domains/"}), 1.0d)), null, 4, null) : networkCondition3, (i & 1024) != 0 ? new NetworkCondition(Collections.singletonList(new ValueCondition("Exact", C13LQ.LJLIIL(new String[]{"api19-core-c-useast1a.tiktokv.com", "oec16-normal-alisg.tiktokv.com", "api16-normal-c-alisg.tiktokv.com", "mon15-normal-useast1a.tiktokv.com", "search22-normal-c-useast1a.tiktokv.com", "mcs-va.tiktokv.com", "log22-normal-useast1a.tiktokv.com", "webcast22-normal-c-useast1a.tiktokv.com", "0pbxmo.xzcs3zlph.com", "api19-normal-c-useast1a.tiktokv.com", "webcast16-normal-c-alisg.tiktokv.com", "api32-normal-alisg.tiktokv.com", "webcast16-normal-c-useast1a.tiktokv.com", "api22-core-c-useast1a.tiktokv.com", "log16-normal-useast1a.tiktokv.com", "api22-normal-c-useast1a.tiktokv.com", "search16-normal-c-useast1a.tiktokv.com", "rtlog16-normal-useast1a.tiktokv.com", "hotapi22-normal-useast1a.tiktokv.com", "api31-normal-useast1a.tiktokv.com", "api32-normal-useast1a.tiktokv.com", "api31-normal-alisg.tiktokv.com", "api23-normal-useast1a.tiktokv.com", "gecko31-normal-alisg.tiktokv.com", "api16-normal-c-useast1a.tiktokv.com", "log-boot.tiktokv.com", "log16-normal-alisg.tiktokv.com", "api22-core-c-alisg.tiktokv.com", "gecko31-normal-useast1a.tiktokv.com", "api16-core-c-alisg.tiktokv.com", "api22-normal-c-alisg.tiktokv.com", "mcs-sg.tiktokv.com"}), 1.0d)), null, null, 6, null) : networkCondition4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? Collections.singleton("tiktokv.com") : set4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? Collections.singleton("activity.tiktok.com") : set5, (i & 8192) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition5, (i & 16384) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition6, (i & 32768) != 0 ? new NetworkCondition(null, null, null, 7, null) : networkCondition7);
    }
}
