package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.model.EcomRouteConfigModel;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECDispatchResourceConditionItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomLoadRetreatConfigData {

    @C09CT("block_gc")
    public final boolean blockGC;

    @C09CT("channel_start_scene_v2")
    public final Map<String, EcomRouteConfigModel> channelStartScene;

    @C09CT("channel_start_scene_high")
    public final Map<String, EcomRouteConfigModel> channelStartSceneHigh;

    @C09CT("channel_start_scene_low")
    public final Map<String, EcomRouteConfigModel> channelStartSceneLow;

    @C09CT("debug_scene")
    public final Map<String, String> debugScene;

    @C09CT("enable_sub")
    public final List<String> enableSubs;

    @C09CT("image_policy")
    public final EcomLoadRetreatConfigImagePolicy imagePolicy;

    @C09CT("native_prefetch_scene")
    public final Map<String, String> nativePrefetchScene;

    @C09CT("net_condition")
    public final ECDispatchResourceConditionItem netCondition;

    @C09CT("net_condition_reverse")
    public final boolean netConditionReverse;

    @C09CT("pages")
    public final Map<String, EcomLoadRetreatConfigPage> pages;

    @C09CT("quick_tap_max_detect_level")
    public final int quickTapMaxDetectLevel;

    @C09CT("retreat_disable_ui_tags")
    public final List<String> retreatDisableUiTags;

    @C09CT("router_start_scene")
    public final List<EcomRouteConfigModel> routerStartScene;

    @C09CT("router_start_scene_high")
    public final List<EcomRouteConfigModel> routerStartSceneHigh;

    @C09CT("router_start_scene_low")
    public final List<EcomRouteConfigModel> routerStartSceneLow;

    @C09CT("scenes")
    public final Map<String, EcomLoadRetreatConfigScene> scenes;

    public EcomLoadRetreatConfigData() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, 0, null, false, null, 131071, null);
    }

    public EcomLoadRetreatConfigData(List<String> list, Map<String, EcomLoadRetreatConfigPage> map, Map<String, EcomLoadRetreatConfigScene> map2, Map<String, EcomRouteConfigModel> map3, Map<String, EcomRouteConfigModel> map4, Map<String, EcomRouteConfigModel> map5, List<EcomRouteConfigModel> list2, List<EcomRouteConfigModel> list3, List<EcomRouteConfigModel> list4, Map<String, String> map6, boolean z, EcomLoadRetreatConfigImagePolicy ecomLoadRetreatConfigImagePolicy, Map<String, String> map7, int i, ECDispatchResourceConditionItem eCDispatchResourceConditionItem, boolean z2, List<String> list5) {
        this.enableSubs = list;
        this.pages = map;
        this.scenes = map2;
        this.channelStartScene = map3;
        this.channelStartSceneLow = map4;
        this.channelStartSceneHigh = map5;
        this.routerStartScene = list2;
        this.routerStartSceneLow = list3;
        this.routerStartSceneHigh = list4;
        this.nativePrefetchScene = map6;
        this.blockGC = z;
        this.imagePolicy = ecomLoadRetreatConfigImagePolicy;
        this.debugScene = map7;
        this.quickTapMaxDetectLevel = i;
        this.netCondition = eCDispatchResourceConditionItem;
        this.netConditionReverse = z2;
        this.retreatDisableUiTags = list5;
    }

    public EcomLoadRetreatConfigData(List list, Map map, Map map2, Map map3, Map map4, Map map5, List list2, List list3, List list4, Map map6, boolean z, EcomLoadRetreatConfigImagePolicy ecomLoadRetreatConfigImagePolicy, Map map7, int i, ECDispatchResourceConditionItem eCDispatchResourceConditionItem, boolean z2, List list5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? C2097608Jq.LJ() : map, (i2 & 4) != 0 ? C2097608Jq.LJ() : map2, (i2 & 8) != 0 ? C2097608Jq.LJ() : map3, (i2 & 16) != 0 ? C2097608Jq.LJ() : map4, (i2 & 32) != 0 ? C2097608Jq.LJ() : map5, (i2 & 64) != 0 ? C13BV.INSTANCE : list2, (i2 & 128) != 0 ? C13BV.INSTANCE : list3, (i2 & 256) != 0 ? C13BV.INSTANCE : list4, (i2 & 512) != 0 ? C2097608Jq.LJ() : map6, (i2 & 1024) != 0 ? false : z, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new EcomLoadRetreatConfigImagePolicy(null, null, null, null) : ecomLoadRetreatConfigImagePolicy, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C2097608Jq.LJ() : map7, (i2 & 8192) != 0 ? 10 : i, (i2 & 16384) != 0 ? null : eCDispatchResourceConditionItem, (32768 & i2) != 0 ? false : z2, (i2 & 65536) != 0 ? C13BV.INSTANCE : list5);
    }
}
