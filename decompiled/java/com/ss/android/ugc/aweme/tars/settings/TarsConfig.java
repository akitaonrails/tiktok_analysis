package com.ss.android.ugc.aweme.tars.settings;

import X.C01GW;
import X.C08FF;
import X.C09CT;
import X.C13BV;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C882510Yjh;
import X.EnumC892800Z0s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class TarsConfig {
    public static final C882510Yjh Companion = new Object() { // from class: X.0Yjh
    };
    public static final C01GW<TaskConfig> EMPTY$delegate = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(313));

    @C09CT("tars_graph")
    public final List<TarsGraphEdge> graph;

    @C09CT("pipeline_configs")
    public final List<TaskConfig> pipelineConfigs;
    public final String template;

    public static final class LoraParameter {

        @C09CT("lora_resource_name")
        public final String loraResourceName;

        @C09CT("lora_scale")
        public final float loraScale;

        public LoraParameter() {
            this("", 1.0f);
        }

        public LoraParameter(String str, float f) {
            this.loraResourceName = str;
            this.loraScale = f;
        }
    }

    public static final class PreDecision {
        public final String position;

        @C09CT("strategy")
        public Object pspStrategy;

        @C09CT("value")
        public final String staticValue;
        public final String type;

        public PreDecision() {
            this(PreDecisionType.STATIC.getValue(), Position.BEFORE_PREPROCESSOR.getValue(), PreDecisionValue.DEVICE.getValue(), null);
        }

        public final boolean isCollaborate() {
            return Intrinsics.LJFF(this.type, PreDecisionType.STRATEGY.getValue()) && this.pspStrategy != null;
        }

        public final boolean isDeviceOnly() {
            return Intrinsics.LJFF(this.type, PreDecisionType.STATIC.getValue()) && Intrinsics.LJFF(this.staticValue, PreDecisionValue.DEVICE.getValue());
        }

        public final boolean isEdgeOnly() {
            return Intrinsics.LJFF(this.type, PreDecisionType.STATIC.getValue()) && Intrinsics.LJFF(this.staticValue, PreDecisionValue.EDGE.getValue());
        }

        public final boolean isGeminiOnly() {
            return Intrinsics.LJFF(this.type, PreDecisionType.STATIC.getValue()) && Intrinsics.LJFF(this.staticValue, PreDecisionValue.GEMINI_NANO.getValue());
        }

        public enum Position {
            BEFORE_PREPROCESSOR("before_preprocessor"),
            AFTER_CLIENT_PREPROCESSOR("after_client_preprocessor");


            @C09CT("value")
            public final String value;

            public static Position valueOf(String str) {
                return (Position) C08FF.LIZ(Position.class, str);
            }

            public final String getValue() {
                return this.value;
            }

            Position(String str) {
                this.value = str;
            }
        }

        public enum PreDecisionType {
            STATIC("static"),
            STRATEGY("strategy"),
            MODEL("model");


            @C09CT("value")
            public final String value;

            public static PreDecisionType valueOf(String str) {
                return (PreDecisionType) C08FF.LIZ(PreDecisionType.class, str);
            }

            public final String getValue() {
                return this.value;
            }

            PreDecisionType(String str) {
                this.value = str;
            }
        }

        public enum PreDecisionValue {
            EDGE("edge"),
            CLOUD("cloud"),
            GEMINI_NANO("gemini_nano"),
            DEVICE("device");


            @C09CT("value")
            public final String value;

            public static PreDecisionValue valueOf(String str) {
                return (PreDecisionValue) C08FF.LIZ(PreDecisionValue.class, str);
            }

            public final String getValue() {
                return this.value;
            }

            PreDecisionValue(String str) {
                this.value = str;
            }
        }

        public final void setPspStrategy(Object obj) {
            this.pspStrategy = obj;
        }

        public PreDecision(String str, String str2, String str3, Object obj) {
            this.type = str;
            this.position = str2;
            this.staticValue = str3;
            this.pspStrategy = obj;
        }
    }

    public static final class ResourceNewConfig {
        public final Map<String, String> config;

        @C09CT("download_tool")
        public final String downloadTools;

        @C09CT("resource_file")
        public final String resourceFileName;

        @C09CT("resource_name")
        public final String resourceName;

        @C09CT("resource_type")
        public final String resourceType;

        public ResourceNewConfig() {
            this("", "", "", "", C2097608Jq.LJ());
        }

        public final boolean isFromGecko() {
            return Intrinsics.LJFF(this.downloadTools, "gecko");
        }

        public final boolean isFromLocal() {
            return Intrinsics.LJFF(this.downloadTools, "local");
        }

        public final boolean isLangModel() {
            return Intrinsics.LJFF(this.resourceType, "lang_model");
        }

        public final boolean isLoraResource() {
            return Intrinsics.LJFF(this.resourceType, "lora");
        }

        public final boolean isPitaya() {
            return Intrinsics.LJFF(this.downloadTools, "pitaya");
        }

        public final boolean isTriggerFetch() {
            Boolean boolLJLI;
            String str = this.config.get("trigger_fetch");
            if (str == null || (boolLJLI = a0.LJLI(str)) == null) {
                return false;
            }
            return boolLJLI.booleanValue();
        }

        public final Long modelSize() {
            String str = this.config.get("model_size_byte");
            if (str != null) {
                return C2095008Iq.LJIILIIL(str);
            }
            return null;
        }

        public final boolean needVerifyModel() {
            Boolean boolLJLI;
            String str = this.config.get("is_verify_model_file");
            if (str == null || (boolLJLI = a0.LJLI(str)) == null) {
                return false;
            }
            return boolLJLI.booleanValue();
        }

        public final String resourceIdentity() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.resourceFileName);
            sbLIZ.append('_');
            sbLIZ.append(this.downloadTools);
            sbLIZ.append('_');
            sbLIZ.append(this.resourceName);
            sbLIZ.append('_');
            sbLIZ.append(this.resourceType);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ResourceNewConfig(String str, String str2, String str3, String str4, Map<String, String> map) {
            this.resourceName = str;
            this.resourceType = str2;
            this.downloadTools = str3;
            this.resourceFileName = str4;
            this.config = map;
        }
    }

    public static final class ServiceAuthConfig {
        public final String authorisation;

        @C09CT("model_name")
        public final String modelName;

        @C09CT("service_host")
        public final String serviceHost;

        public ServiceAuthConfig() {
            this("", "", "");
        }

        public ServiceAuthConfig(String str, String str2, String str3) {
            this.serviceHost = str;
            this.authorisation = str2;
            this.modelName = str3;
        }
    }

    public static final class TarsGraphEdge {

        @C09CT("from")
        public final String from;

        @C09CT("to")
        public final String to;
        public final int type;

        public TarsGraphEdge() {
            this("", "", 0);
        }

        public TarsGraphEdge(String str, String str2, int i) {
            this.from = str;
            this.to = str2;
            this.type = i;
        }
    }

    public static final class TarsMapping {

        @C09CT("source")
        public final String sourceKey;

        @C09CT("target")
        public final String targetKey;
        public final int type;

        public TarsMapping() {
            this("", "", 0);
        }

        public TarsMapping(String str, String str2, int i) {
            this.sourceKey = str;
            this.targetKey = str2;
            this.type = i;
        }
    }

    public static final class TarsTransmute {

        @C09CT("from_key")
        public final String fromKey;

        @C09CT("from_node")
        public final String fromNode;

        @C09CT("from_type")
        public final String fromType;

        @C09CT("to_key")
        public final String toKey;

        @C09CT("to_node")
        public final String toNode;

        @C09CT("to_type")
        public final String toType;

        public TarsTransmute() {
            this("", "", "", "", "", "");
        }

        public TarsTransmute(String str, String str2, String str3, String str4, String str5, String str6) {
            this.fromNode = str;
            this.fromKey = str2;
            this.fromType = str3;
            this.toNode = str4;
            this.toKey = str5;
            this.toType = str6;
        }
    }

    public TarsConfig() {
        this(null, null, null, 7, null);
    }

    public static final class Engine {
        public final EngineConfig config;
        public Object features;

        @C09CT("monitor_config")
        public Object monitorConfig;

        @C09CT("offloading_config")
        public Object offloadingConfig;

        @C09CT("resources")
        public final List<ResourceNewConfig> resourceConf;
        public Object track;
        public final String type;

        public Engine() {
            this(EnumC892800Z0s.BYTENNLLM.getValue(), new EngineConfig(null, null, null, 7, null), null, null, null, null, null);
        }

        public int hashCode() {
            int iHashCode = ((this.type.hashCode() * 31) + this.config.hashCode()) * 31;
            List<ResourceNewConfig> list = this.resourceConf;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Object obj = this.features;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.track;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.monitorConfig;
            int iHashCode5 = (iHashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.offloadingConfig;
            return iHashCode5 + (obj4 != null ? obj4.hashCode() : 0);
        }

        public final void setFeatures(Object obj) {
            this.features = obj;
        }

        public final void setMonitorConfig(Object obj) {
            this.monitorConfig = obj;
        }

        public final void setOffloadingConfig(Object obj) {
            this.offloadingConfig = obj;
        }

        public final void setTrack(Object obj) {
            this.track = obj;
        }

        public Engine(String str, EngineConfig engineConfig, List<ResourceNewConfig> list, Object obj, Object obj2, Object obj3, Object obj4) {
            this.type = str;
            this.config = engineConfig;
            this.resourceConf = list;
            this.features = obj;
            this.track = obj2;
            this.monitorConfig = obj3;
            this.offloadingConfig = obj4;
        }
    }

    public static final class Processor {
        public final Map<String, String> config;

        @C09CT("mapping")
        public final List<TarsMapping> keyMapping;

        @C09CT("params")
        public final List<String> params;
        public final String type;

        public Processor() {
            this(null, null, null, null, 15, null);
        }

        public final String getInputKey(String str) {
            TarsMapping next;
            Iterator<TarsMapping> it2 = this.keyMapping.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.targetKey, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TarsMapping tarsMapping = next;
            if (tarsMapping == null) {
                return null;
            }
            return tarsMapping.sourceKey;
        }

        public final String getOutputKey(String str) {
            TarsMapping next;
            Iterator<TarsMapping> it2 = this.keyMapping.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.sourceKey, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TarsMapping tarsMapping = next;
            if (tarsMapping == null) {
                return null;
            }
            return tarsMapping.targetKey;
        }

        public Processor(String str, Map<String, String> map, List<TarsMapping> list, List<String> list2) {
            this.type = str;
            this.config = map;
            this.keyMapping = list;
            this.params = list2;
        }

        public Processor(String str, Map map, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2);
        }
    }

    public static final class ServiceConfig {
        public final ServiceAuthConfig config;
        public final String type;

        public ServiceConfig() {
            this("", null);
        }

        public ServiceConfig(String str, ServiceAuthConfig serviceAuthConfig) {
            this.type = str;
            this.config = serviceAuthConfig;
        }
    }

    public static final class EngineConfig {

        @C09CT("inference_params")
        public final Map<String, String> inferenceParams;

        @C09CT("load_params")
        public final Map<String, String> loadParams;

        @C09CT("lora_params")
        public final List<LoraParameter> loraParams;

        public EngineConfig() {
            this(null, null, null, 7, null);
        }

        public int hashCode() {
            return (((this.loadParams.hashCode() * 31) + this.inferenceParams.hashCode()) * 31) + this.loraParams.hashCode();
        }

        public EngineConfig(Map<String, String> map, Map<String, String> map2, List<LoraParameter> list) {
            this.loadParams = map;
            this.inferenceParams = map2;
            this.loraParams = list;
        }

        public EngineConfig(Map map, Map map2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C2097608Jq.LJ() : map, (i & 2) != 0 ? C2097608Jq.LJ() : map2, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public TarsConfig(List<TaskConfig> list, List<TarsGraphEdge> list2, String str) {
        this.pipelineConfigs = list;
        this.graph = list2;
        this.template = str;
    }

    public TarsConfig(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? "" : str);
    }

    public static final class TaskConfig {
        public final boolean batch;
        public final ServiceConfig cloud;
        public final Map<String, String> config;
        public final ServiceConfig edge;
        public final Engine engine;
        public final Processor postprocessor;
        public final PreDecision predecision;
        public final Processor preprocessor;
        public final String task;
        public final List<TarsTransmute> transmutes;
        public final String type;

        public TaskConfig() {
            this(null, null, false, null, null, null, null, null, null, null, null, 2047, null);
        }

        public TaskConfig(String str, String str2, boolean z, PreDecision preDecision, ServiceConfig serviceConfig, ServiceConfig serviceConfig2, Processor processor, Processor processor2, Engine engine, Map<String, String> map, List<TarsTransmute> list) {
            this.task = str;
            this.type = str2;
            this.batch = z;
            this.predecision = preDecision;
            this.edge = serviceConfig;
            this.cloud = serviceConfig2;
            this.preprocessor = processor;
            this.postprocessor = processor2;
            this.engine = engine;
            this.config = map;
            this.transmutes = list;
        }

        public TaskConfig(String str, String str2, boolean z, PreDecision preDecision, ServiceConfig serviceConfig, ServiceConfig serviceConfig2, Processor processor, Processor processor2, Engine engine, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : preDecision, (i & 16) != 0 ? null : serviceConfig, (i & 32) != 0 ? null : serviceConfig2, (i & 64) != 0 ? null : processor, (i & 128) != 0 ? null : processor2, (i & 256) == 0 ? engine : null, (i & 512) != 0 ? new LinkedHashMap() : map, (i & 1024) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
