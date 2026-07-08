package com.ss.android.ugc.aweme.im.strategy.track.data;

import X.AbstractC909800Zmc;
import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SCPTrackNode extends AbstractC909800Zmc {

    @C09CT("config_name")
    public String configName;

    @C09CT("has_exception")
    public Boolean hasException;

    @C09CT("node_attribute")
    public String nodeAttribute;

    @C09CT("node_list")
    public List<SCPTrackNode> nodeList;

    @C09CT("node_operation")
    public String nodeOperation;

    @C09CT("node_type")
    public String nodeType;

    @C09CT("node_value")
    public String nodeValue;

    @C09CT("pass")
    public Boolean pass;

    public SCPTrackNode() {
        this(null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SCPTrackNode)) {
            return false;
        }
        SCPTrackNode sCPTrackNode = (SCPTrackNode) obj;
        return Intrinsics.LJFF(this.nodeAttribute, sCPTrackNode.nodeAttribute) && Intrinsics.LJFF(this.nodeType, sCPTrackNode.nodeType) && Intrinsics.LJFF(this.nodeOperation, sCPTrackNode.nodeOperation) && Intrinsics.LJFF(this.nodeValue, sCPTrackNode.nodeValue) && Intrinsics.LJFF(this.configName, sCPTrackNode.configName) && Intrinsics.LJFF(this.nodeList, sCPTrackNode.nodeList) && Intrinsics.LJFF(this.pass, sCPTrackNode.pass) && Intrinsics.LJFF(this.hasException, sCPTrackNode.hasException);
    }

    public final int hashCode() {
        String str = this.nodeAttribute;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nodeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nodeOperation;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nodeValue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.configName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<SCPTrackNode> list = this.nodeList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.pass;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasException;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SCPTrackNode(nodeAttribute=");
        sbLIZ.append(this.nodeAttribute);
        sbLIZ.append(", nodeType=");
        sbLIZ.append(this.nodeType);
        sbLIZ.append(", nodeOperation=");
        sbLIZ.append(this.nodeOperation);
        sbLIZ.append(", nodeValue=");
        sbLIZ.append(this.nodeValue);
        sbLIZ.append(", configName=");
        sbLIZ.append(this.configName);
        sbLIZ.append(", nodeList=");
        sbLIZ.append(this.nodeList);
        sbLIZ.append(", pass=");
        sbLIZ.append(this.pass);
        sbLIZ.append(", hasException=");
        sbLIZ.append(this.hasException);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SCPTrackNode(String str, String str2, String str3, String str4, String str5, List<SCPTrackNode> list, Boolean bool, Boolean bool2) {
        this.nodeAttribute = str;
        this.nodeType = str2;
        this.nodeOperation = str3;
        this.nodeValue = str4;
        this.configName = str5;
        this.nodeList = list;
        this.pass = bool;
        this.hasException = bool2;
    }
}
