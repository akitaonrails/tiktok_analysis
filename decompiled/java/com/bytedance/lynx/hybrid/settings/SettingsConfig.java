package com.bytedance.lynx.hybrid.settings;

import X.C1701090uMt;
import X.C2188811AlT;
import X.InterfaceC1535910q4T;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SettingsConfig {
    public static final Companion Companion = new Companion();
    public final Companion.Builder builder;

    public static final class Companion {

        public static final class Builder {
            public Long absoluteInterval;
            public String host;
            public Long relativeInterval;
            public final Map<String, String> queries = new LinkedHashMap();
            public final Map<String, Function0<String>> queriesByExecution = new LinkedHashMap();
            public InterfaceC1535910q4T configParser = new InterfaceC1535910q4T() { // from class: X.0q4S
                @Override // X.InterfaceC1535910q4T
                public final C1701090uMt LIZ(String str) throws JSONException {
                    JSONObject jSONObjectLIZ = C1294090jmR.LIZ("data", new JSONObject(str));
                    if (jSONObjectLIZ != null) {
                        JSONObject jSONObject = new JSONObject();
                        Iterator<String> itKeys = jSONObjectLIZ.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONObject jSONObjectLIZ2 = C1294090jmR.LIZ(next, jSONObjectLIZ);
                            if (jSONObjectLIZ2 != null) {
                                jSONObject.put(next, JSONObjectProtectorUtils.getString(jSONObjectLIZ2, "val"));
                            }
                        }
                        return new C1701090uMt(C786410Ut5.J3(jSONObject), jSONObject);
                    }
                    return null;
                }
            };

            public final SettingsConfig build() {
                return new SettingsConfig(this, null);
            }

            public final String getHost$hybrid_settings_release() {
                String str = this.host;
                if (str != null) {
                    return str;
                }
                return null;
            }

            public final Long getAbsoluteInterval$hybrid_settings_release() {
                return this.absoluteInterval;
            }

            public final InterfaceC1535910q4T getConfigParser$hybrid_settings_release() {
                return this.configParser;
            }

            public final Map<String, String> getQueries$hybrid_settings_release() {
                return this.queries;
            }

            public final Map<String, Function0<String>> getQueriesByExecution$hybrid_settings_release() {
                return this.queriesByExecution;
            }

            public final Long getRelativeInterval$hybrid_settings_release() {
                return this.relativeInterval;
            }

            public final Builder addQueries(Map<String, String> map) {
                this.queries.putAll(map);
                return this;
            }

            public final Builder setAbsoluteInterval(long j) {
                this.absoluteInterval = Long.valueOf(j);
                return this;
            }

            public final void setAbsoluteInterval$hybrid_settings_release(Long l) {
                this.absoluteInterval = l;
            }

            public final Builder setConfigParser(InterfaceC1535910q4T interfaceC1535910q4T) {
                this.configParser = interfaceC1535910q4T;
                return this;
            }

            public final void setConfigParser$hybrid_settings_release(InterfaceC1535910q4T interfaceC1535910q4T) {
                this.configParser = interfaceC1535910q4T;
            }

            public final Builder setHost(String str) {
                if (!a0.LJJIJIIJIL(str, '/')) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('/');
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
                setHost$hybrid_settings_release(str);
                return this;
            }

            public final void setHost$hybrid_settings_release(String str) {
                this.host = str;
            }

            public final Builder setRelativeInterval(long j) {
                this.relativeInterval = Long.valueOf(j);
                return this;
            }

            public final void setRelativeInterval$hybrid_settings_release(Long l) {
                this.relativeInterval = l;
            }

            public final Builder appendQuery(String str, String str2) {
                this.queries.put(str, str2);
                return this;
            }

            public final Builder appendQuery(String str, Function0<String> function0) {
                this.queriesByExecution.put(str, function0);
                return this;
            }
        }
    }

    public /* synthetic */ SettingsConfig(Companion.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final String buildUrl() {
        StringBuilder sb = new StringBuilder(this.builder.getHost$hybrid_settings_release());
        boolean z = true;
        for (Map.Entry<String, String> entry : this.builder.getQueries$hybrid_settings_release().entrySet()) {
            if (z) {
                sb.append("?");
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        for (Map.Entry<String, Function0<String>> entry2 : this.builder.getQueriesByExecution$hybrid_settings_release().entrySet()) {
            if (z) {
                sb.append("?");
                z = false;
            } else {
                sb.append("&");
            }
            String strInvoke = entry2.getValue().invoke();
            if (strInvoke == null) {
                return null;
            }
            sb.append(entry2.getKey());
            sb.append("=");
            sb.append(strInvoke);
        }
        return sb.toString();
    }

    public final Long getAbsoluteInterval() {
        return this.builder.getAbsoluteInterval$hybrid_settings_release();
    }

    public final Long getRelativeInterval() {
        return this.builder.getRelativeInterval$hybrid_settings_release();
    }

    public SettingsConfig(Companion.Builder builder) {
        this.builder = builder;
    }

    public final C1701090uMt parseConfig(String str) {
        return this.builder.getConfigParser$hybrid_settings_release().LIZ(str);
    }
}
