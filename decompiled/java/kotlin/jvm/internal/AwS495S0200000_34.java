package kotlin.jvm.internal;

import X.C09AY;
import X.C2192231Aqz;
import X.InterfaceC1631620sYq;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes35.dex */
public class AwS495S0200000_34 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS495S0200000_34(C2192231Aqz c2192231Aqz, Set set, int i) {
        super(3);
        this.$t = i;
        this.l0 = set;
        this.l1 = c2192231Aqz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS495S0200000_34(C2192231Aqz c2192231Aqz, String[] strArr, int i) {
        super(3);
        this.$t = i;
        this.l0 = strArr;
        this.l1 = c2192231Aqz;
    }

    public static final Object invoke$0(AwS495S0200000_34 awS495S0200000_34, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        String[] strArr = (String[]) awS495S0200000_34.l0;
        if (zBooleanValue) {
            return ((C2192231Aqz) awS495S0200000_34.l1).LIZIZ.LJI(str, strArr);
        }
        if (!zBooleanValue2) {
            return super/*X.1Ar1*/.LJI(str, strArr);
        }
        String strLJJI = ((C2192231Aqz) awS495S0200000_34.l1).LJJI(str);
        if (!((C2192231Aqz) awS495S0200000_34.l1).LIZIZ.contains(strLJJI)) {
            return strArr;
        }
        String[] strArrLJI = ((C2192231Aqz) awS495S0200000_34.l1).LIZIZ.LJI(strLJJI, (String[]) awS495S0200000_34.l0);
        if (strArrLJI == null) {
            return strArrLJI;
        }
        String[] strArr2 = (String[]) awS495S0200000_34.l0;
        C2192231Aqz c2192231Aqz = (C2192231Aqz) awS495S0200000_34.l1;
        if (Arrays.equals(strArrLJI, strArr2)) {
            return strArrLJI;
        }
        c2192231Aqz.LJJII(str, new AwS648S0100000_34(c2192231Aqz, 30), strArrLJI);
        return strArrLJI;
    }

    public static final Object invoke$1(AwS495S0200000_34 awS495S0200000_34, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        Set<String> set = (Set) awS495S0200000_34.l0;
        if (zBooleanValue) {
            return ((C2192231Aqz) awS495S0200000_34.l1).LIZIZ.getStringSet(str, set);
        }
        if (!zBooleanValue2) {
            return super/*X.1Ar1*/.getStringSet(str, set);
        }
        String strLJJI = ((C2192231Aqz) awS495S0200000_34.l1).LJJI(str);
        if (!((C2192231Aqz) awS495S0200000_34.l1).LIZIZ.contains(strLJJI)) {
            return set;
        }
        Set<String> stringSet = ((C2192231Aqz) awS495S0200000_34.l1).LIZIZ.getStringSet(strLJJI, (Set) awS495S0200000_34.l0);
        if (stringSet == null) {
            return stringSet;
        }
        Set set2 = (Set) awS495S0200000_34.l0;
        C2192231Aqz c2192231Aqz = (C2192231Aqz) awS495S0200000_34.l1;
        if (Intrinsics.LJFF(stringSet, set2)) {
            return stringSet;
        }
        c2192231Aqz.LJJII(str, new AwS648S0100000_34(c2192231Aqz, 31), stringSet);
        return stringSet;
    }
}
