package com.ss.android.ugc.aweme.im.strategy.track.data;

import X.AbstractC909800Zmc;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC909380Zlw;
import X.InterfaceC1707406mO;
import X.InterfaceC1891350zJl;
import X.InterfaceC898340ZMa;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SCPQueryData extends AbstractC909800Zmc implements InterfaceC1891350zJl {

    @C09CT("business_config_map")
    public final Map<String, IBusinessConfig> businessConfigMap;

    @C09CT("meta_data")
    public final InterfaceC898340ZMa metaData;

    @C09CT("node_data_provider")
    public final InterfaceC1707406mO nodeDataProvider;

    @C09CT("query_time")
    public final long queryTime;

    @C09CT("query_type")
    public final int queryType;

    @C09CT("result")
    public final List<IBusinessConfig> result;

    @C09CT("root_holder")
    public final DecisionTree rootHolder;

    @C09CT(Scene.SCENE_SERVICE)
    public final EnumC909380Zlw scene;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SCPQueryData)) {
            return false;
        }
        SCPQueryData sCPQueryData = (SCPQueryData) obj;
        return this.scene == sCPQueryData.scene && Intrinsics.LJFF(this.rootHolder, sCPQueryData.rootHolder) && Intrinsics.LJFF(this.nodeDataProvider, sCPQueryData.nodeDataProvider) && Intrinsics.LJFF(this.metaData, sCPQueryData.metaData) && Intrinsics.LJFF(this.businessConfigMap, sCPQueryData.businessConfigMap) && Intrinsics.LJFF(this.result, sCPQueryData.result) && this.queryTime == sCPQueryData.queryTime && this.queryType == sCPQueryData.queryType;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.scene.hashCode() * 31;
        DecisionTree decisionTree = this.rootHolder;
        int iHashCode2 = (((((iHashCode + (decisionTree == null ? 0 : decisionTree.hashCode())) * 31) + this.nodeDataProvider.hashCode()) * 31) + this.metaData.hashCode()) * 31;
        Map<String, IBusinessConfig> map = this.businessConfigMap;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<IBusinessConfig> list = this.result;
        return ((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.queryTime)) * 31) + this.queryType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SCPQueryData(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", rootHolder=");
        sbLIZ.append(this.rootHolder);
        sbLIZ.append(", nodeDataProvider=");
        sbLIZ.append(this.nodeDataProvider);
        sbLIZ.append(", metaData=");
        sbLIZ.append(this.metaData);
        sbLIZ.append(", businessConfigMap=");
        sbLIZ.append(this.businessConfigMap);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", queryTime=");
        sbLIZ.append(this.queryTime);
        sbLIZ.append(", queryType=");
        sbLIZ.append(this.queryType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SCPQueryData(EnumC909380Zlw enumC909380Zlw, DecisionTree decisionTree, InterfaceC1707406mO interfaceC1707406mO, InterfaceC898340ZMa interfaceC898340ZMa, Map<String, ? extends IBusinessConfig> map, List<? extends IBusinessConfig> list, long j, int i) {
        this.scene = enumC909380Zlw;
        this.rootHolder = decisionTree;
        this.nodeDataProvider = interfaceC1707406mO;
        this.metaData = interfaceC898340ZMa;
        this.businessConfigMap = map;
        this.result = list;
        this.queryTime = j;
        this.queryType = i;
    }
}
