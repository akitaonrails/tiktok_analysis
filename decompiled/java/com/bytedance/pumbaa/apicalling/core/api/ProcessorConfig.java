package com.bytedance.pumbaa.apicalling.core.api;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ProcessorConfig {

    @C09CT("api_sample_rate")
    public final Map<Integer, Float> apiSampleRate;

    @C09CT("default_sample_rate")
    public final Float defaultSampleRate;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("guard_fields")
    public final GuardFields guardFields;

    @C09CT("intercept_api_list")
    public final List<Integer> interceptApiList;

    @C09CT("skip_guard_for_intercept_api")
    public final boolean skipGuardForInterceptApi;

    public static final class GuardFields {

        @C09CT("category")
        public final List<String> category;

        @C09CT("extra")
        public final List<String> extra;

        @C09CT("metric")
        public final List<String> metric;

        public GuardFields() {
            this(null, null, null);
        }

        public final JSONObject LIZ() {
            JSONObject jSONObject = new JSONObject();
            try {
                List<String> list = this.category;
                if (list != null) {
                    jSONObject.put("category", list);
                }
                List<String> list2 = this.metric;
                if (list2 != null) {
                    jSONObject.put("metric", list2);
                }
                List<String> list3 = this.extra;
                if (list3 != null) {
                    jSONObject.put("extra", list3);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return jSONObject;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return jSONObject;
            }
        }

        public final String toString() {
            return C786410Ut5.J3(LIZ());
        }

        public GuardFields(List<String> list, List<String> list2, List<String> list3) {
            this.category = list;
            this.metric = list2;
            this.extra = list3;
        }
    }

    public ProcessorConfig() {
        this(false, null, null, null, false, null);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", this.enable);
            jSONObject.put("intercept_api_list", this.interceptApiList);
            jSONObject.put("default_sample_rate", this.defaultSampleRate);
            jSONObject.put("api_sample_rate", this.apiSampleRate);
            jSONObject.put("skip_guard_for_intercept_api", this.skipGuardForInterceptApi);
            GuardFields guardFields = this.guardFields;
            C189200o6.m2constructorimpl(jSONObject.put("guard_fields", guardFields != null ? guardFields.LIZ() : null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return C786410Ut5.J3(jSONObject);
    }

    public ProcessorConfig(boolean z, List<Integer> list, Float f, Map<Integer, Float> map, boolean z2, GuardFields guardFields) {
        this.enable = z;
        this.interceptApiList = list;
        this.defaultSampleRate = f;
        this.apiSampleRate = map;
        this.skipGuardForInterceptApi = z2;
        this.guardFields = guardFields;
    }
}
