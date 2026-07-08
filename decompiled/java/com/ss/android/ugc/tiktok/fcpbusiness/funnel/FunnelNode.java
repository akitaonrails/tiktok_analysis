package com.ss.android.ugc.tiktok.fcpbusiness.funnel;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.EnumC707850Rpf;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FunnelNode implements Serializable {
    public final String avoidWinnerKey;

    @C09CT("componentKey")
    public final String componentKey;

    @C09CT("decisionPairs")
    public final List<DecisionPair> decisionPairs;

    @C09CT("isContainer")
    public final Boolean isContainer;

    @C09CT("isMustShowStrategy")
    public final Boolean isMustShowStrategy;

    @C09CT("isSkipAvoidStrategy")
    public final Boolean isSkipAvoidStrategy;

    @C09CT("isStandardize")
    public final Boolean isStandardize;

    @C09CT("real_component_key")
    public final String realComponentKey;

    @C09CT("state")
    public final EnumC707850Rpf state;

    public FunnelNode() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunnelNode)) {
            return false;
        }
        FunnelNode funnelNode = (FunnelNode) obj;
        return Intrinsics.LJFF(this.componentKey, funnelNode.componentKey) && Intrinsics.LJFF(this.isContainer, funnelNode.isContainer) && Intrinsics.LJFF(this.isStandardize, funnelNode.isStandardize) && Intrinsics.LJFF(this.isSkipAvoidStrategy, funnelNode.isSkipAvoidStrategy) && Intrinsics.LJFF(this.isMustShowStrategy, funnelNode.isMustShowStrategy) && this.state == funnelNode.state && Intrinsics.LJFF(this.avoidWinnerKey, funnelNode.avoidWinnerKey) && Intrinsics.LJFF(this.realComponentKey, funnelNode.realComponentKey) && Intrinsics.LJFF(this.decisionPairs, funnelNode.decisionPairs);
    }

    public int hashCode() {
        String str = this.componentKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isContainer;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isStandardize;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSkipAvoidStrategy;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isMustShowStrategy;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        EnumC707850Rpf enumC707850Rpf = this.state;
        int iHashCode6 = (iHashCode5 + (enumC707850Rpf == null ? 0 : enumC707850Rpf.hashCode())) * 31;
        String str2 = this.avoidWinnerKey;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.realComponentKey;
        return ((iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.decisionPairs.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FunnelNode(componentKey=");
        sbLIZ.append(this.componentKey);
        sbLIZ.append(", isContainer=");
        sbLIZ.append(this.isContainer);
        sbLIZ.append(", isStandardize=");
        sbLIZ.append(this.isStandardize);
        sbLIZ.append(", isSkipAvoidStrategy=");
        sbLIZ.append(this.isSkipAvoidStrategy);
        sbLIZ.append(", isMustShowStrategy=");
        sbLIZ.append(this.isMustShowStrategy);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", avoidWinnerKey=");
        sbLIZ.append(this.avoidWinnerKey);
        sbLIZ.append(", realComponentKey=");
        sbLIZ.append(this.realComponentKey);
        sbLIZ.append(", decisionPairs=");
        sbLIZ.append(this.decisionPairs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getInFunnel() {
        EnumC707850Rpf enumC707850Rpf = this.state;
        return enumC707850Rpf != null && enumC707850Rpf.getLevel() > EnumC707850Rpf.ENABLE_REQUEST_AVOID.getLevel();
    }

    public final Boolean isContainer() {
        return this.isContainer;
    }

    public final Boolean isMustShowStrategy() {
        return this.isMustShowStrategy;
    }

    public final Boolean isSkipAvoidStrategy() {
        return this.isSkipAvoidStrategy;
    }

    public final Boolean isStandardize() {
        return this.isStandardize;
    }

    public FunnelNode(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, EnumC707850Rpf enumC707850Rpf, String str2, String str3, List<DecisionPair> list) {
        this.componentKey = str;
        this.isContainer = bool;
        this.isStandardize = bool2;
        this.isSkipAvoidStrategy = bool3;
        this.isMustShowStrategy = bool4;
        this.state = enumC707850Rpf;
        this.avoidWinnerKey = str2;
        this.realComponentKey = str3;
        this.decisionPairs = list;
    }

    public FunnelNode(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, EnumC707850Rpf enumC707850Rpf, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "unknown" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? Boolean.FALSE : bool2, (i & 8) != 0 ? Boolean.FALSE : bool3, (i & 16) != 0 ? Boolean.FALSE : bool4, (i & 32) != 0 ? EnumC707850Rpf.INIT : enumC707850Rpf, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? str3 : null, (i & 256) != 0 ? C13BV.INSTANCE : list);
    }
}
