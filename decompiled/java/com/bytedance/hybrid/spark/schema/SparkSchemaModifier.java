package com.bytedance.hybrid.spark.schema;

import X.C098200Yq;
import X.C1530010pux;
import X.C1530030puz;
import X.C189200o6;
import X.C2188811AlT;
import X.InterfaceC1938407iY;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkSchemaModifier {
    public static SparkSchemaModifier globalPostModifier;
    public static SparkSchemaModifier globalPreModifier;
    public final String identifier;
    public InterfaceC1938407iY paramRules;
    public InterfaceC1938407iY pathRules;
    public InterfaceC1938407iY regexRules;
    public boolean replaceByParamEnabled;
    public boolean replaceByPathEnabled;
    public boolean replaceByRegexEnabled;
    public final int version;
    public static final C1530010pux Companion = new C1530010pux();
    public static final CopyOnWriteArrayList<SparkSchemaModifier> normalModifiers = new CopyOnWriteArrayList<>();

    private final String handleSchema(String str, SparkContext sparkContext) {
        SchemaBundle schemaBundle = new SchemaBundle(str, sparkContext);
        handleSchemaBundle(schemaBundle, sparkContext);
        return schemaBundle.getUrl();
    }

    public final void handleSchemaBundle(SchemaBundle schemaBundle, SparkContext sparkContext) {
        Object c098200Yq;
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        StringBuilder sb = new StringBuilder();
        String url = schemaBundle.getUrl();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.identifier);
            sbLIZ.append(" path rules start executing");
            C1530030puz.LIZIZ("SparkSchemaModifier", C2188811AlT.LIZIZ(sbLIZ), sparkContext);
            InterfaceC1938407iY interfaceC1938407iY = this.pathRules;
            if (interfaceC1938407iY != null && (strLIZ3 = interfaceC1938407iY.LIZ(schemaBundle)) != null) {
                sb.append(strLIZ3);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.identifier);
            sbLIZ2.append(" param rules start executing");
            C1530030puz.LIZIZ("SparkSchemaModifier", C2188811AlT.LIZIZ(sbLIZ2), sparkContext);
            InterfaceC1938407iY interfaceC1938407iY2 = this.paramRules;
            if (interfaceC1938407iY2 != null && (strLIZ2 = interfaceC1938407iY2.LIZ(schemaBundle)) != null) {
                sb.append(strLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.identifier);
            sbLIZ3.append(" regex rules start executing");
            C1530030puz.LIZIZ("SparkSchemaModifier", C2188811AlT.LIZIZ(sbLIZ3), sparkContext);
            InterfaceC1938407iY interfaceC1938407iY3 = this.regexRules;
            if (interfaceC1938407iY3 != null && (strLIZ = interfaceC1938407iY3.LIZ(schemaBundle)) != null) {
                sb.append(strLIZ);
                c098200Yq = sb;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(",failed because of ");
            sbLIZ4.append(thM5exceptionOrNullimpl.getMessage());
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(this.identifier);
            sbLIZ5.append(" execution fails, ");
            sbLIZ5.append(thM5exceptionOrNullimpl.getMessage());
            C1530030puz.LIZ("SparkSchemaModifier", C2188811AlT.LIZIZ(sbLIZ5), sparkContext);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        String string = a0.LJJJLIIL(sb, ",").toString();
        if (!a0.LJJJIL(string)) {
            C1530010pux c1530010pux = Companion;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", this.identifier);
            jSONObject.put("version", this.version);
            jSONObject.put("time_cost", jCurrentTimeMillis2);
            jSONObject.put("origin_schema", url);
            jSONObject.put("schema", schemaBundle.getUrl());
            jSONObject.put("pipeline", string);
            c1530010pux.getClass();
            C1530010pux.LIZIZ("SparkSchemaModifierPipeline", jSONObject, sparkContext);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("origin schema ");
        sbLIZ6.append(url);
        sbLIZ6.append(" hits ");
        sbLIZ6.append(this.identifier);
        sbLIZ6.append(" version ");
        sbLIZ6.append(this.version);
        sbLIZ6.append(", pipeline: ");
        sbLIZ6.append(string);
        sbLIZ6.append(", finished in ");
        sbLIZ6.append(jCurrentTimeMillis2);
        sbLIZ6.append(", new schema: ");
        sbLIZ6.append(schemaBundle.getUrl());
        C1530030puz.LIZIZ("SparkSchemaModifier", C2188811AlT.LIZIZ(sbLIZ6), sparkContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SparkSchemaModifier(com.google.gson.n r7, java.lang.String r8, int r9) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.schema.SparkSchemaModifier.<init>(com.google.gson.n, java.lang.String, int):void");
    }
}
