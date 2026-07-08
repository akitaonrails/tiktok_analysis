package com.bytedance.hybrid.spark.schema;

import X.C01CL;
import X.C01GW;
import X.C1530030puz;
import X.C1939007ie;
import X.C1942307jB;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaBundle {
    public static final C1939007ie Companion = new Object() { // from class: X.07ie
    };
    public boolean hasUncommittedChanges;
    public final C01GW innerBundles$delegate;
    public boolean isChanged;
    public String name;
    public final String originalUrl;
    public SchemaBundle outerBundle;
    public final C01GW queries$delegate;
    public final SparkContext sparkContext;
    public Uri uri;
    public final C01GW uriBuilder$delegate;
    public String url;

    private final Map<String, SchemaBundle> getInnerBundles() {
        return (Map) this.innerBundles$delegate.getValue();
    }

    private final Map<String, String> getQueries() {
        return (Map) this.queries$delegate.getValue();
    }

    private final Uri.Builder getUriBuilder() {
        return (Uri.Builder) this.uriBuilder$delegate.getValue();
    }

    public final void commit() {
        C1530030puz.LIZIZ("SchemaBundle", "commit", this.sparkContext);
        if (this.hasUncommittedChanges) {
            getUriBuilder().clearQuery();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : getQueries().entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
            getUriBuilder().encodedQuery(a0.LJJJLIIL(sb, "&").toString());
            Uri uriBuild = getUriBuilder().build();
            this.uri = uriBuild;
            this.url = uriBuild.toString();
            SchemaBundle schemaBundle = this.outerBundle;
            if (schemaBundle != null) {
                schemaBundle.commitByInner(this, this.name);
            }
            this.hasUncommittedChanges = false;
        }
    }

    public final String getPath() {
        return this.uri.getPath();
    }

    public final SchemaBundle getUrlBundle() {
        SchemaBundle queryAsSchemaBundle = getQueryAsSchemaBundle("url");
        if (queryAsSchemaBundle != null) {
            return queryAsSchemaBundle;
        }
        SchemaBundle queryAsSchemaBundle2 = getQueryAsSchemaBundle("surl");
        return queryAsSchemaBundle2 == null ? getQueryAsSchemaBundle("res_url") : queryAsSchemaBundle2;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + C786410Ut5.Z2(this.hasUncommittedChanges);
    }

    public final Map<String, String> getAllQueries() {
        Map<String, String> queries;
        Iterator<Map.Entry<String, SchemaBundle>> it2 = getInnerBundles().entrySet().iterator();
        do {
            queries = null;
            if (!it2.hasNext()) {
                break;
            }
            queries = it2.next().getValue().getQueries();
        } while (!(!queries.isEmpty()));
        return queries;
    }

    public final boolean isUrlChanged() {
        SchemaBundle schemaBundle = getInnerBundles().get("url");
        if (schemaBundle == null && (schemaBundle = getInnerBundles().get("surl")) == null) {
            schemaBundle = getInnerBundles().get("res_url");
        }
        if (schemaBundle == null || !schemaBundle.isChanged) {
            String strLIZIZ = C1942307jB.LIZIZ(this.uri, "url");
            if (strLIZIZ == null && (strLIZIZ = C1942307jB.LIZIZ(this.uri, "surl")) == null) {
                strLIZIZ = C1942307jB.LIZIZ(this.uri, "res_url");
            }
            if (Intrinsics.LJFF(strLIZIZ, this.originalUrl)) {
                return false;
            }
        }
        return true;
    }

    public final SparkContext getSparkContext() {
        return this.sparkContext;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isChanged() {
        return this.isChanged;
    }

    private final SchemaBundle getQueryAsSchemaBundle(String str) {
        SchemaBundle schemaBundle = getInnerBundles().get(str);
        if (schemaBundle == null) {
            String strDecode = Uri.decode(getQueryParameter(str));
            if (strDecode != null) {
                SchemaBundle schemaBundle2 = new SchemaBundle(this, str, strDecode, this.sparkContext);
                getInnerBundles().put(str, schemaBundle2);
                return schemaBundle2;
            }
            return null;
        }
        return schemaBundle;
    }

    public final void deleteQuery(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key ");
        sbLIZ.append(str);
        sbLIZ.append(" is deleted");
        C1530030puz.LIZIZ("SchemaBundle", C2188811AlT.LIZIZ(sbLIZ), this.sparkContext);
        if (getInnerBundles().get(str) != null) {
            getInnerBundles().remove(str);
        }
        this.hasUncommittedChanges = true;
        this.isChanged = true;
        getQueries().remove(str);
    }

    public boolean equals(Object obj) {
        SchemaBundle schemaBundle;
        if ((obj instanceof SchemaBundle) && (schemaBundle = (SchemaBundle) obj) != null && !schemaBundle.hasUncommittedChanges && !this.hasUncommittedChanges) {
            if (getQueries().size() != schemaBundle.getQueries().size()) {
                return false;
            }
            for (Map.Entry<String, String> entry : getQueries().entrySet()) {
                if (UriProtector.parse(Uri.decode(entry.getValue())).isHierarchical()) {
                    if (!Intrinsics.LJFF(getQueryAsSchemaBundle(entry.getKey()), schemaBundle.getQueryAsSchemaBundle(entry.getKey()))) {
                        return false;
                    }
                } else if (!Intrinsics.LJFF(entry.getValue(), schemaBundle.getQueryParameter(entry.getKey()))) {
                    return false;
                }
            }
            return Intrinsics.LJFF(C01CL.LIZIZ(this.uri), C01CL.LIZIZ(schemaBundle.uri));
        }
        return super.equals(obj);
    }

    public final String getQueryParameter(String str) {
        return getQueries().get(str);
    }

    public final String getQueryParameterFromInnerBundle(String str) {
        Iterator<Map.Entry<String, SchemaBundle>> it2 = getInnerBundles().entrySet().iterator();
        while (it2.hasNext()) {
            String queryParameter = it2.next().getValue().getQueryParameter(str);
            if (queryParameter != null) {
                return queryParameter;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, String> resetQuery(Map<String, String> map) {
        map.clear();
        String encodedQuery = this.uri.getEncodedQuery();
        if (encodedQuery == null) {
            return map;
        }
        Iterator it2 = a0.LJJLIIIJILLIZJL(encodedQuery, new String[]{"&"}, 0, 6).iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() == 2) {
                map.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
            }
        }
        return map;
    }

    public final void setPath(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("path ");
        sbLIZ.append(str);
        sbLIZ.append(" is set");
        C1530030puz.LIZIZ("SchemaBundle", C2188811AlT.LIZIZ(sbLIZ), this.sparkContext);
        this.hasUncommittedChanges = true;
        this.isChanged = true;
        getUriBuilder().path(str);
    }

    public final void setUrl(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url ");
        sbLIZ.append(str);
        sbLIZ.append(" is set");
        C1530030puz.LIZIZ("SchemaBundle", C2188811AlT.LIZIZ(sbLIZ), this.sparkContext);
        this.url = str;
        this.uri = UriProtector.parse(str);
        getUriBuilder().clearQuery();
        getUriBuilder().scheme(this.uri.getScheme()).authority(this.uri.getAuthority()).path(this.uri.getPath()).query(this.uri.getQuery()).fragment(this.uri.getFragment());
        resetQuery(getQueries());
        getInnerBundles().clear();
        SchemaBundle schemaBundle = this.outerBundle;
        if (schemaBundle != null) {
            schemaBundle.commitByInner(this, this.name);
        }
        this.hasUncommittedChanges = false;
        this.isChanged = true;
    }

    public SchemaBundle(String str, SparkContext sparkContext) {
        this.url = str;
        this.sparkContext = sparkContext;
        Uri uri = UriProtector.parse(str);
        this.uri = uri;
        String strLIZIZ = C1942307jB.LIZIZ(uri, "url");
        if (strLIZIZ == null && (strLIZIZ = C1942307jB.LIZIZ(this.uri, "surl")) == null) {
            strLIZIZ = C1942307jB.LIZIZ(this.uri, "res_url");
        }
        this.originalUrl = strLIZIZ;
        this.uriBuilder$delegate = C452501pT.LIZIZ(new AwS547S0100000_3(this, 14));
        this.innerBundles$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(341));
        this.queries$delegate = C452501pT.LIZIZ(new AwS547S0100000_3(this, 13));
    }

    private final void commitByInner(SchemaBundle schemaBundle, String str) {
        if (getInnerBundles().get(str) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(schemaBundle.getUrl());
        sbLIZ.append(" is appended");
        C1530030puz.LIZIZ("SchemaBundle", C2188811AlT.LIZIZ(sbLIZ), this.sparkContext);
        this.hasUncommittedChanges = true;
        this.isChanged = true;
        getQueries().put(str, Uri.encode(schemaBundle.getUrl()));
        commit();
    }

    public final void appendQueryParameter(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(str2);
        sbLIZ.append(" is appended");
        C1530030puz.LIZIZ("SchemaBundle", C2188811AlT.LIZIZ(sbLIZ), this.sparkContext);
        if (getInnerBundles().get(str) != null) {
            getInnerBundles().remove(str);
        }
        this.isChanged = true;
        this.hasUncommittedChanges = true;
        getQueries().put(str, str2);
    }

    public SchemaBundle(SchemaBundle schemaBundle, String str, String str2, SparkContext sparkContext) {
        this(str2, sparkContext);
        this.outerBundle = schemaBundle;
        this.name = str;
    }
}
