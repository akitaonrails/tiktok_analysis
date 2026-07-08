package com.ss.android.ugc.aweme.plugin.downstreamexperiment;

import X.C0C5P;
import X.C10SV;
import X.C15438062q;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.EnumC586470MzN;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class DownstreamExperimentService implements IDownstreamExperimentService {
    public Map<String, ? extends List<Long>> LIZ = C2097608Jq.LJ();
    public final Set<EnumC586470MzN> LIZIZ = new LinkedHashSet();

    @Override // com.ss.android.ugc.aweme.plugin.downstreamexperiment.IDownstreamExperimentService
    public final void LIZ(List<IPluginService.PluginData> list) {
        IPluginService.DownstreamExperimentFilterConfig downstreamExperimentFilterConfig;
        List<IPluginService.DownstreamExperimentFilter> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IPluginService.PluginData pluginData : (ArrayList) list) {
            if (Intrinsics.LJFF(pluginData.showConfig.shouldShow, Boolean.TRUE) && (downstreamExperimentFilterConfig = pluginData.downstreamExperimentFilterConfig) != null && (list2 = downstreamExperimentFilterConfig.filters) != null) {
                for (IPluginService.DownstreamExperimentFilter downstreamExperimentFilter : list2) {
                    String str = downstreamExperimentFilter.downstreamService;
                    if (str != null) {
                        List arrayList = (List) linkedHashMap.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        linkedHashMap.put(str, arrayList);
                        List<Long> list3 = downstreamExperimentFilter.filterIds;
                        if (list3 != null) {
                            arrayList.addAll(list3);
                        }
                    }
                }
            }
        }
        this.LIZ = linkedHashMap;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            while (it3.hasNext()) {
                String strValueOf = String.valueOf(((Number) it3.next()).longValue());
                if (strValueOf.length() > 3) {
                    String strSubstring = strValueOf.substring(0, strValueOf.length() - 3);
                    C0C5P.LIZJ().getClass();
                    C0C5P.LIZ(strSubstring);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.plugin.downstreamexperiment.IDownstreamExperimentService
    public final List<Long> LIZIZ(EnumC586470MzN enumC586470MzN) {
        for (Map.Entry<String, ? extends List<Long>> entry : this.LIZ.entrySet()) {
            if (Intrinsics.LJFF(a0.LJLIL(entry.getKey(), '/'), enumC586470MzN.getEndpoint()) && (!entry.getValue().isEmpty())) {
                List<Long> value = entry.getValue();
                if (!this.LIZIZ.contains(enumC586470MzN)) {
                    this.LIZIZ.add(enumC586470MzN);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
                    Iterator<Long> it2 = value.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(it2.next().longValue()));
                    }
                    c2344009Gk.LJ(arrayList, "filters");
                    c2344009Gk.LJIIIIZZ("endpoint", enumC586470MzN.getEndpoint());
                    C10SV.LIZ(c2344009Gk);
                    C20684815ws.LJIILLIIL("joint_expr_config_req", c2344009Gk.LIZ);
                }
                return entry.getValue();
            }
        }
        return null;
    }
}
