package com.ss.android.ugc.aweme.commercialize.model;

import X.C098200Yq;
import X.C09C2;
import X.C09CT;
import X.C1010350cOn;
import X.C189200o6;
import X.C1AF0;
import X.C2097608Jq;
import android.graphics.Color;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentModel implements Serializable {
    public static final C1010350cOn Companion = new Object() { // from class: X.0cOn
    };

    @C09CT("component_id")
    public final long ID;
    public Integer _containerPlaceholderBackGroundColor;
    public Integer adFastScrollStatusValue;
    public Map<String, AlphaVideoData> alphaVideoData;

    @C09CT("container_type")
    public final String containerType;

    @C09CT("data")
    public Map<String, ? extends Object> data;
    public transient JSONArray eventDynamicParamRuleCache;
    public boolean eventDynamicParamRuleInit;

    @C09CT("container_fading_edges")
    public final List<FadingEdgeData> fadingEdges;

    @C09CT("layout")
    public final AnoleComponentLayoutModel layout;

    @C09CT("prerender_failed_strategy")
    public final String prerenderFailedStrategy;

    @C09CT("render_strategy")
    public final String rawRenderStrategy;

    @C09CT("render_strategy_configs")
    public final Map<String, Object> renderStrategyConfigs;

    @C09CT("resource_loading_strategy")
    public final String resourceLoadingStrategy;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("size")
    public final AnoleComponentSizeModel size;

    @C09CT("skip_count_reset_strategy")
    public final String skipCountResetStrategy;

    @C09CT("skip_pre_business_check")
    public final boolean skipPreBusinessCheck;

    @C09CT("slot_id")
    public final String slotID;

    @C09CT("component_type")
    public final String type;

    @C09CT("use_lynx_ssr")
    public final boolean useLynxSSR;

    @C09CT("z_index")
    public final int zIndex;

    public final boolean getEnableShopVideoRedirectLiveInfoCta() {
        Object c098200Yq;
        try {
            Map<String, ? extends Object> map = this.data;
            Object obj = map != null ? map.get("information_cta") : null;
            c098200Yq = obj instanceof Map ? (Map) obj : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Map map2 = (Map) c098200Yq;
        if (map2 == null) {
            return false;
        }
        Object obj2 = map2.get("shop_video_redirect_live");
        return Intrinsics.LJFF(obj2 instanceof Boolean ? obj2 : null, Boolean.TRUE);
    }

    public final Map<String, Object> getEventInfos() {
        Object c098200Yq;
        try {
            Map<String, ? extends Object> map = this.data;
            Object obj = map != null ? map.get("event_infos") : null;
            c098200Yq = obj instanceof Map ? (Map) obj : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (Map) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final boolean getShouldRerenderWhenDisappeared() {
        Object c098200Yq;
        try {
            JSONObject ugenTempMeta = getUgenTempMeta();
            c098200Yq = ugenTempMeta != null ? Boolean.valueOf(ugenTempMeta.optBoolean("shouldRerenderWhenDisappeared")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return Intrinsics.LJFF(C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq, Boolean.TRUE);
    }

    public final boolean getShouldRerenderWhenSizeChanged() {
        Object c098200Yq;
        try {
            JSONObject ugenTempMeta = getUgenTempMeta();
            c098200Yq = ugenTempMeta != null ? Boolean.valueOf(ugenTempMeta.optBoolean("shouldRerenderWhenSizeChanged")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return Intrinsics.LJFF(C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq, Boolean.TRUE);
    }

    public final Map<String, Object> getTtsLogInfo() {
        Object c098200Yq;
        try {
            Map<String, ? extends Object> map = this.data;
            Object obj = map != null ? map.get("tts_log_info") : null;
            c098200Yq = obj instanceof Map ? (Map) obj : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (Map) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final JSONObject getUgenData() {
        Object c098200Yq;
        try {
            Map<String, ? extends Object> map = this.data;
            c098200Yq = map != null ? new JSONObject(map) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final JSONObject getUgenJumpModel() {
        Object c098200Yq;
        try {
            JSONObject ugenData = getUgenData();
            c098200Yq = ugenData != null ? ugenData.optJSONObject("jump_model") : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final JSONObject getUgenTempMeta() {
        Object c098200Yq;
        try {
            JSONObject ugenTemplateModel = getUgenTemplateModel();
            c098200Yq = ugenTemplateModel != null ? ugenTemplateModel.optJSONObject("meta") : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final JSONObject getUgenTemplateModel() {
        Object c098200Yq;
        try {
            Map<String, ? extends Object> map = this.data;
            Object obj = map != null ? map.get("ugen_dsl") : null;
            String str = obj instanceof String ? (String) obj : null;
            c098200Yq = str != null ? new JSONObject(str) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final CoinRewardData getCoinRewardData() {
        Object c098200Yq;
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("coin_reward_data") : null;
        if (!(obj instanceof Map) || obj == null) {
            return null;
        }
        Gson gsonLIZ = C09C2.LIZ();
        try {
            c098200Yq = (CoinRewardData) gsonLIZ.LJII(gsonLIZ.LJIILL(obj), CoinRewardData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (CoinRewardData) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final Integer getContainerPlaceholderBackGroundColor() {
        Object obj;
        Object c098200Yq;
        Integer num = this._containerPlaceholderBackGroundColor;
        if (num != null) {
            return num;
        }
        Map<String, ? extends Object> map = this.data;
        if (map != null && (obj = map.get("container_placeholder_background_color")) != null) {
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                if (!(!a0.LJJJIL(str))) {
                    str = null;
                }
                if (str != null) {
                    try {
                        c098200Yq = Integer.valueOf(Color.parseColor(str));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    Integer num2 = (Integer) c098200Yq;
                    if (num2 != null) {
                        this._containerPlaceholderBackGroundColor = Integer.valueOf(num2.intValue());
                        return num2;
                    }
                }
            }
        }
        return null;
    }

    public final boolean getEnableCRouter() {
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("jump_router_type") : null;
        Double d = obj instanceof Double ? (Double) obj : null;
        return d != null && ((int) d.doubleValue()) == 1;
    }

    public final JSONArray getEventDynamicParamRule() {
        Object c098200Yq;
        if (this.eventDynamicParamRuleInit) {
            return this.eventDynamicParamRuleCache;
        }
        try {
            Map<String, ? extends Object> map = this.data;
            Object obj = map != null ? map.get("event_dynamic_param_rule") : null;
            String str = obj instanceof String ? (String) obj : null;
            c098200Yq = str != null ? new JSONArray(str) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        JSONArray jSONArray = (JSONArray) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.eventDynamicParamRuleCache = jSONArray;
        this.eventDynamicParamRuleInit = true;
        return jSONArray;
    }

    public final String getFrontendData() {
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("frontend_data") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final List<String> getGeckoChannels() {
        List list;
        Map<String, ? extends Object> map = this.data;
        ArrayList arrayList = null;
        Object obj = map != null ? map.get("gecko_channel") : null;
        if ((obj instanceof List) && (list = (List) obj) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if ((obj2 instanceof String) && obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    public final String getImageUrl() {
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("image_url") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final AnoleLogInfo getLogInfo() {
        Object c098200Yq;
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("log_info") : null;
        if (!(obj instanceof Map) || obj == null) {
            return null;
        }
        Gson gsonLIZ = C09C2.LIZ();
        try {
            c098200Yq = (AnoleLogInfo) gsonLIZ.LJII(gsonLIZ.LJIILL(obj), AnoleLogInfo.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (AnoleLogInfo) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final String getLynxSchema() {
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("lynx_schema") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Double getPdpScreenOpenType() {
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("screen_open_type") : null;
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    public final List<String> getRequiringReportScenes() {
        List list;
        Map<String, ? extends Object> map = this.data;
        ArrayList arrayList = null;
        Object obj = map != null ? map.get("requiring_report_scenes") : null;
        if ((obj instanceof List) && (list = (List) obj) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if ((obj2 instanceof String) && obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    public final boolean getSkipSchemaDataConcat() {
        Boolean bool;
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("skip_schema_data_concat") : null;
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Map<String, Object> getSpeedPrerenderConfig() {
        Map<String, Object> map = this.renderStrategyConfigs;
        Object obj = map != null ? map.get("speed_prerender_config") : null;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final float getUgenResourceReadyPercent() {
        Float f;
        Map<String, ? extends Object> map = this.data;
        Object obj = map != null ? map.get("resource_ready_percent") : null;
        if (obj instanceof Double) {
            return (float) ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof Float) || (f = (Float) obj) == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public final boolean isInteractionDisabled() {
        Object obj;
        Number number;
        Map<String, ? extends Object> map = this.data;
        return (map == null || (obj = map.get("interaction_disabled")) == null || !(obj instanceof Number) || (number = (Number) obj) == null || number.intValue() != 1) ? false : true;
    }

    public final boolean isSpeedPrerender() {
        return Intrinsics.LJFF(this.rawRenderStrategy, "speed_prerender");
    }

    public final String requireScene() {
        String str = this.scene;
        return str == null ? "feed" : str;
    }

    public final String getRefer() {
        AnoleLogInfo logInfo = getLogInfo();
        if (logInfo != null) {
            return logInfo.refer;
        }
        return null;
    }

    public final Integer getRenderPlayProgressThresholdValue() {
        if (!isSpeedPrerender()) {
            return LIZ(this.renderStrategyConfigs);
        }
        Integer num = this.adFastScrollStatusValue;
        if (num == null) {
            return null;
        }
        return num.intValue() == 1 ? getSpeedPrerenderConfigFastRenderStrategyThresholdValue() : num.intValue() == 0 ? getSpeedPrerenderConfigSlowRenderStrategyThresholdValue() : getSpeedPrerenderConfigSlowRenderStrategyThresholdValue();
    }

    public final String getRenderStrategy() {
        if (!isSpeedPrerender()) {
            return this.rawRenderStrategy;
        }
        Integer num = this.adFastScrollStatusValue;
        return num == null ? "speed_prerender" : num.intValue() == 1 ? getSpeedPrerenderConfigFastRenderStrategy() : num.intValue() == 0 ? getSpeedPrerenderConfigSlowRenderStrategy() : getSpeedPrerenderConfigSlowRenderStrategy();
    }

    public final Map<String, Object> getSpeedPrerenderConfigFast() {
        Map<String, Object> speedPrerenderConfig = getSpeedPrerenderConfig();
        Object obj = speedPrerenderConfig != null ? speedPrerenderConfig.get("fast") : null;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final String getSpeedPrerenderConfigFastRenderStrategy() {
        Map<String, Object> speedPrerenderConfigFast = getSpeedPrerenderConfigFast();
        Object obj = speedPrerenderConfigFast != null ? speedPrerenderConfigFast.get("render_strategy") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Integer getSpeedPrerenderConfigFastRenderStrategyThresholdValue() {
        Map<String, Object> speedPrerenderConfigFast = getSpeedPrerenderConfigFast();
        Object obj = speedPrerenderConfigFast != null ? speedPrerenderConfigFast.get("render_strategy_configs") : null;
        return LIZ(obj instanceof Map ? (Map) obj : null);
    }

    public final Map<String, Object> getSpeedPrerenderConfigSlow() {
        Map<String, Object> speedPrerenderConfig = getSpeedPrerenderConfig();
        Object obj = speedPrerenderConfig != null ? speedPrerenderConfig.get("slow") : null;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final String getSpeedPrerenderConfigSlowRenderStrategy() {
        Map<String, Object> speedPrerenderConfigSlow = getSpeedPrerenderConfigSlow();
        Object obj = speedPrerenderConfigSlow != null ? speedPrerenderConfigSlow.get("render_strategy") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Integer getSpeedPrerenderConfigSlowRenderStrategyThresholdValue() {
        Map<String, Object> speedPrerenderConfigSlow = getSpeedPrerenderConfigSlow();
        Object obj = speedPrerenderConfigSlow != null ? speedPrerenderConfigSlow.get("render_strategy_configs") : null;
        return LIZ(obj instanceof Map ? (Map) obj : null);
    }

    public final String getTag() {
        AnoleLogInfo logInfo = getLogInfo();
        if (logInfo != null) {
            return logInfo.tag;
        }
        return null;
    }

    public final long getID() {
        return this.ID;
    }

    public static Integer LIZ(Map map) {
        Object obj;
        if (map != null) {
            obj = map.get("play_progress_threshold_value");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (!(obj instanceof Double)) {
            return null;
        }
        return Integer.valueOf((int) ((Number) obj).doubleValue());
    }

    public final AlphaVideoData getAlphaVideoData(String str) {
        Map<String, AlphaVideoData> mapLJ;
        Object obj;
        Map map;
        if (this.alphaVideoData == null) {
            try {
                Map<String, ? extends Object> map2 = this.data;
                if (map2 != null) {
                    obj = map2.get("video_map");
                } else {
                    obj = null;
                }
                if ((obj instanceof Map) && (map = (Map) obj) != null) {
                    mapLJ = (Map) C09C2.LIZ().LJIIIIZZ(C09C2.LIZ().LJIILL(map), new TypeToken<Map<String, ? extends AlphaVideoData>>() { // from class: X.04Zl
                    }.getType());
                } else {
                    mapLJ = C2097608Jq.LJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LIZJ("parse alpha video data failed");
                mapLJ = C2097608Jq.LJ();
            }
            this.alphaVideoData = mapLJ;
        }
        Map<String, AlphaVideoData> map3 = this.alphaVideoData;
        if (map3 == null) {
            return null;
        }
        return map3.get(str);
    }

    public final void setAdFastScrollStatusValue(Integer num) {
        this.adFastScrollStatusValue = num;
    }

    public final void setData(Map<String, ? extends Object> map) {
        this.data = map;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final <T> T parseDataToStructure(Gson gson, Class<T> cls, Function2<? super Boolean, ? super Throwable, Unit> function2) {
        T t;
        try {
            t = (T) gson.LJII(gson.LJIILL(this.data), cls);
            C189200o6.m2constructorimpl(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            t = (T) new C098200Yq(th);
            C189200o6.m2constructorimpl(t);
        }
        if (C189200o6.m8isSuccessimpl(t) && function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(t);
        if (thM5exceptionOrNullimpl != null && function2 != null) {
            function2.invoke(Boolean.FALSE, thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(t)) {
            return null;
        }
        return t;
    }

    public AnoleComponentModel(long j, String str, String str2, String str3, int i, AnoleComponentSizeModel anoleComponentSizeModel, AnoleComponentLayoutModel anoleComponentLayoutModel, String str4, Map<String, ? extends Object> map, String str5, Map<String, ? extends Object> map2, String str6, String str7, List<FadingEdgeData> list, boolean z, boolean z2, String str8) {
        this.ID = j;
        this.type = str;
        this.containerType = str2;
        this.slotID = str3;
        this.zIndex = i;
        this.size = anoleComponentSizeModel;
        this.layout = anoleComponentLayoutModel;
        this.rawRenderStrategy = str4;
        this.renderStrategyConfigs = map;
        this.prerenderFailedStrategy = str5;
        this.data = map2;
        this.resourceLoadingStrategy = str6;
        this.skipCountResetStrategy = str7;
        this.fadingEdges = list;
        this.skipPreBusinessCheck = z;
        this.useLynxSSR = z2;
        this.scene = str8;
    }
}
