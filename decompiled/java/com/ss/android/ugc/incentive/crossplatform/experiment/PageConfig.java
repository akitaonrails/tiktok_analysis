package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;
import X.C13BV;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class PageConfig {

    @C09CT("force_inherited_schema_params_keys")
    public final List<String> forceInheritedSchemaKeys;

    @C09CT("force_inherited_url_params_keys")
    public final List<String> forceInheritedUrlParamsKeys;

    @C09CT("need_merge_schema_params")
    public final boolean needMergeSchemaParams;

    @C09CT("need_merge_url_params")
    public final boolean needMergeUrlParams;

    @C09CT("never_inherited_schema_params_keys")
    public final List<String> neverInheritedSchemaParamsKeys;

    @C09CT("never_inherited_url_params_keys")
    public final List<String> neverInheritedUrlParamsKeys;

    @C09CT("source_page_path")
    public final String sourcePagePath;

    @C09CT("target_page_extra_schema_params_str")
    public final String targetPageExtraSchemaParams;

    @C09CT("target_page_path_with_params")
    public final String targetPagePathWithParams;

    @C09CT("target_page_schema_host")
    public final String targetPageSchemaHost;

    @C09CT("use_source_host_and_path_prefix")
    public final boolean useSourceHostAndPathPrefix;

    public PageConfig() {
        this(null, null, null, false, null, null, false, false, null, null, null, 2047, null);
    }

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = a0.LJJLIIIJILLIZJL(this.targetPageExtraSchemaParams, new String[]{"&"}, 0, 6).iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() == 2) {
                linkedHashMap.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
            }
        }
        return linkedHashMap;
    }

    public PageConfig(String str, String str2, String str3, boolean z, List<String> list, List<String> list2, boolean z2, boolean z3, List<String> list3, List<String> list4, String str4) {
        this.sourcePagePath = str;
        this.targetPagePathWithParams = str2;
        this.targetPageSchemaHost = str3;
        this.useSourceHostAndPathPrefix = z;
        this.forceInheritedUrlParamsKeys = list;
        this.neverInheritedUrlParamsKeys = list2;
        this.needMergeUrlParams = z2;
        this.needMergeSchemaParams = z3;
        this.forceInheritedSchemaKeys = list3;
        this.neverInheritedSchemaParamsKeys = list4;
        this.targetPageExtraSchemaParams = str4;
    }

    public PageConfig(String str, String str2, String str3, boolean z, List list, List list2, boolean z2, boolean z3, List list3, List list4, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? C13BV.INSTANCE : list2, (i & 64) != 0 ? true : z2, (i & 128) == 0 ? z3 : true, (i & 256) != 0 ? C13BV.INSTANCE : list3, (i & 512) != 0 ? C13BV.INSTANCE : list4, (i & 1024) == 0 ? str4 : "");
    }
}
