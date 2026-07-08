package com.bytedance.pitaya.api.feature;

import X.C2188811AlT;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface IFeatureSchema {
    CollectFeaturesResult LIZ(List list, JSONObject jSONObject, double d);

    JSONObject LIZIZ(String str, List<String> list, JSONObject jSONObject);

    public static final class CollectFeaturesResult implements ReflectionCall {
        public final PTYError error;
        public final JSONObject features;

        public final CollectFeaturesResult copy(JSONObject jSONObject, PTYError pTYError) {
            return new CollectFeaturesResult(jSONObject, pTYError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectFeaturesResult)) {
                return false;
            }
            CollectFeaturesResult collectFeaturesResult = (CollectFeaturesResult) obj;
            return Intrinsics.LJFF(this.features, collectFeaturesResult.features) && Intrinsics.LJFF(this.error, collectFeaturesResult.error);
        }

        public int hashCode() {
            JSONObject jSONObject = this.features;
            int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            PTYError pTYError = this.error;
            return iHashCode + (pTYError != null ? pTYError.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectFeaturesResult(features=");
            sbLIZ.append(this.features);
            sbLIZ.append(", error=");
            sbLIZ.append(this.error);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PTYError getError() {
            return this.error;
        }

        public final JSONObject getFeatures() {
            return this.features;
        }

        public CollectFeaturesResult(JSONObject jSONObject, PTYError pTYError) {
            this.features = jSONObject;
            this.error = pTYError;
        }
    }

    public static final class CollectSchemaResult implements ReflectionCall {
        public final PTYError error;
        public final String schema;

        public final CollectSchemaResult copy(String str, PTYError pTYError) {
            return new CollectSchemaResult(str, pTYError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectSchemaResult)) {
                return false;
            }
            CollectSchemaResult collectSchemaResult = (CollectSchemaResult) obj;
            return Intrinsics.LJFF(this.schema, collectSchemaResult.schema) && Intrinsics.LJFF(this.error, collectSchemaResult.error);
        }

        public int hashCode() {
            String str = this.schema;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            PTYError pTYError = this.error;
            return iHashCode + (pTYError != null ? pTYError.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectSchemaResult(schema=");
            sbLIZ.append(this.schema);
            sbLIZ.append(", error=");
            sbLIZ.append(this.error);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PTYError getError() {
            return this.error;
        }

        public final String getSchema() {
            return this.schema;
        }

        public CollectSchemaResult(String str, PTYError pTYError) {
            this.schema = str;
            this.error = pTYError;
        }
    }
}
