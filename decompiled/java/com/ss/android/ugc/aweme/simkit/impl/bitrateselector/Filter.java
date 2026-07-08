package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import X.C09CT;
import X.C09RB;
import X.C1477350oY1;
import X.C1939607ik;
import X.C2188811AlT;
import X.InterfaceC1477220oXo;
import Y.AObjectS130S0000000_35;
import Y.AObjectS377S0100000_35;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class Filter {

    @C09CT("allow_gears")
    public final List<String> allowGears;

    @C09CT("allow_group")
    public final List<FilterGroup> allowGroup;

    @C09CT("forbidden_gears")
    public final List<String> forbiddenGears;

    @C09CT("forbidden_group")
    public final List<FilterGroup> forbiddenGroup;

    public static final Unit filter$lambda$0(InterfaceC1477220oXo interfaceC1477220oXo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source: ");
        sbLIZ.append(C1477350oY1.LIZ(interfaceC1477220oXo));
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Unit filter$lambda$10(InterfaceC1477220oXo interfaceC1477220oXo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after allowGroup: ");
        sbLIZ.append(C1477350oY1.LIZ(interfaceC1477220oXo));
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Unit filter$lambda$2(InterfaceC1477220oXo interfaceC1477220oXo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after forbiddenGears: ");
        sbLIZ.append(C1477350oY1.LIZ(interfaceC1477220oXo));
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Unit filter$lambda$4(InterfaceC1477220oXo interfaceC1477220oXo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after allowGears: ");
        sbLIZ.append(C1477350oY1.LIZ(interfaceC1477220oXo));
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Unit filter$lambda$7(InterfaceC1477220oXo interfaceC1477220oXo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after forbiddenGroup: ");
        sbLIZ.append(C1477350oY1.LIZ(interfaceC1477220oXo));
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public final <T extends InterfaceC1477220oXo> List<T> filter(List<? extends T> list) {
        List<T> listLJJII = C09RB.LJJII(C09RB.LJIJJ(C09RB.LJIIIZ(C09RB.LJIJJ(C09RB.LJIIIZ(C09RB.LJIJJ(C09RB.LJIIIZ(C09RB.LJIJJ(C09RB.LJIIJ(C09RB.LJIJJ(new C1939607ik(list), new AObjectS130S0000000_35(7)), new AObjectS377S0100000_35(this, 1)), new AObjectS130S0000000_35(8)), new AObjectS377S0100000_35(this, 2)), new AObjectS130S0000000_35(9)), new AObjectS377S0100000_35(this, 3)), new AObjectS130S0000000_35(10)), new AObjectS377S0100000_35(this, 4)), new AObjectS130S0000000_35(11)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end: ");
        sbLIZ.append(listLJJII.size());
        sbLIZ.append(" ================================ ");
        C2188811AlT.LIZIZ(sbLIZ);
        return listLJJII;
    }

    public static final boolean filter$lambda$1(Filter filter, InterfaceC1477220oXo interfaceC1477220oXo) {
        List<String> list = filter.forbiddenGears;
        if (list != null) {
            return list.contains(String.valueOf(interfaceC1477220oXo.getQualityType()));
        }
        return false;
    }

    public static final boolean filter$lambda$3(Filter filter, InterfaceC1477220oXo interfaceC1477220oXo) {
        List<String> list = filter.allowGears;
        if (list != null) {
            return list.contains(String.valueOf(interfaceC1477220oXo.getQualityType()));
        }
        return true;
    }

    public static final boolean filter$lambda$6(Filter filter, InterfaceC1477220oXo interfaceC1477220oXo) {
        List<FilterGroup> list = filter.forbiddenGroup;
        boolean zIsMatch = false;
        if (list != null) {
            for (FilterGroup filterGroup : list) {
                if (!zIsMatch) {
                    zIsMatch = filterGroup.isMatch(interfaceC1477220oXo);
                }
            }
        }
        return !zIsMatch;
    }

    public static final boolean filter$lambda$9(Filter filter, InterfaceC1477220oXo interfaceC1477220oXo) {
        List<FilterGroup> list = filter.allowGroup;
        Boolean boolValueOf = null;
        if (list != null) {
            for (FilterGroup filterGroup : list) {
                if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    boolValueOf = Boolean.valueOf(filterGroup.isMatch(interfaceC1477220oXo));
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return true;
        }
        return true;
    }

    public Filter(List<String> list, List<String> list2, List<FilterGroup> list3, List<FilterGroup> list4) {
        this.forbiddenGears = list;
        this.allowGears = list2;
        this.forbiddenGroup = list3;
        this.allowGroup = list4;
    }
}
