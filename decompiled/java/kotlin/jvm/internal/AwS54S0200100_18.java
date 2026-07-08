package kotlin.jvm.internal;

import X.C09AY;
import X.C1167410gU7;
import X.C1167440gUA;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719612Di;
import X.C23260099m;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public class AwS54S0200100_18 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public long j2;
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
    public AwS54S0200100_18(long j, C1167410gU7 c1167410gU7, C23260099m c23260099m, int i) {
        super(3);
        this.$t = i;
        this.j2 = j;
        this.l0 = c1167410gU7;
        this.l1 = c23260099m;
    }

    public static final Object invoke$0(AwS54S0200100_18 awS54S0200100_18, Object obj, Object obj2, Object obj3) throws Exception {
        boolean z;
        Integer numValueOf;
        List listLJLIL;
        List<Aweme> list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        long jLongValue = ((Number) obj3).longValue();
        Integer numValueOf2 = Integer.valueOf((int) (awS54S0200100_18.j2 - jLongValue));
        int i = 0;
        if (numValueOf2.intValue() != list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            numValueOf = Integer.valueOf(list.size() - numValueOf2.intValue());
        } else {
            numValueOf = null;
        }
        ((C1167410gU7) awS54S0200100_18.l0).LJIJJ = Boolean.valueOf(zBooleanValue);
        ((C1167410gU7) awS54S0200100_18.l0).LJIJI = Long.valueOf(jLongValue);
        Set<String> set = ((C1167410gU7) awS54S0200100_18.l0).LJJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        set.addAll(arrayList);
        if (((C1167410gU7) awS54S0200100_18.l0).LIZJ()) {
            if (jLongValue > ((C1167410gU7) awS54S0200100_18.l0).LJIILJJIL.getSecond().longValue()) {
                ((C1167410gU7) awS54S0200100_18.l0).LJIJ = new Pair<>(Long.valueOf(jLongValue + 1), ((C1167410gU7) awS54S0200100_18.l0).LJIJ.getSecond());
                ((ArrayList) ((C1167410gU7) awS54S0200100_18.l0).LJIIZILJ).addAll(0, list);
                ((ArrayList) ((C1167410gU7) awS54S0200100_18.l0).LJJIFFI).addAll(0, list);
                C1167410gU7 c1167410gU7 = (C1167410gU7) awS54S0200100_18.l0;
                int i2 = c1167410gU7.LJIL;
                if (!list.isEmpty()) {
                    Iterator<Aweme> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().isSubOnlyVideo() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                c1167410gU7.LJIL = i2 + i;
                InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS54S0200100_18.l1;
                long j = awS54S0200100_18.j2;
                C1167410gU7 c1167410gU72 = (C1167410gU7) awS54S0200100_18.l0;
                if (j == c1167410gU72.LJ - 1) {
                    list = c1167410gU72.LJIIZILJ;
                }
                C1167440gUA c1167440gUA = new C1167440gUA(list, zBooleanValue, Long.valueOf(jLongValue), null, numValueOf, 8);
                C189200o6.m2constructorimpl(c1167440gUA);
                interfaceC1364105Vn.resumeWith(c1167440gUA);
            } else {
                C1167410gU7 c1167410gU73 = (C1167410gU7) awS54S0200100_18.l0;
                ArrayList arrayList2 = new ArrayList();
                for (Aweme aweme : list) {
                    Aweme aweme2 = aweme;
                    Iterator it4 = ((ArrayList) c1167410gU73.LJJI).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (Intrinsics.LJFF(((Aweme) it4.next()).getAid(), aweme2.getAid())) {
                                break;
                            }
                        } else {
                            arrayList2.add(aweme);
                            break;
                        }
                    }
                }
                C1167410gU7 c1167410gU74 = (C1167410gU7) awS54S0200100_18.l0;
                c1167410gU74.LJIJ = new Pair<>(Long.valueOf(c1167410gU74.LJIILJJIL.getSecond().longValue() + 1), ((C1167410gU7) awS54S0200100_18.l0).LJIJ.getSecond());
                ((ArrayList) ((C1167410gU7) awS54S0200100_18.l0).LJIIZILJ).addAll(0, arrayList2);
                ((ArrayList) ((C1167410gU7) awS54S0200100_18.l0).LJJIFFI).addAll(0, arrayList2);
                C1167410gU7 c1167410gU75 = (C1167410gU7) awS54S0200100_18.l0;
                int i3 = c1167410gU75.LJIL;
                if (!arrayList2.isEmpty()) {
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        if (((Aweme) it5.next()).isSubOnlyVideo() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                c1167410gU75.LJIL = i3 + i;
                C1167410gU7 c1167410gU76 = (C1167410gU7) awS54S0200100_18.l0;
                c1167410gU76.LJIJJLI = true;
                InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS54S0200100_18.l1;
                if (awS54S0200100_18.j2 == c1167410gU76.LJ - 1) {
                    listLJLIL = C13LP.LJLIL(c1167410gU76.LJIIZILJ, c1167410gU76.LJIILIIL);
                } else {
                    listLJLIL = C13LP.LJLIL(arrayList2, c1167410gU76.LJIILIIL);
                }
                C1167440gUA c1167440gUA2 = new C1167440gUA(listLJLIL, false, null, null, numValueOf, 12);
                C189200o6.m2constructorimpl(c1167440gUA2);
                interfaceC1364105Vn2.resumeWith(c1167440gUA2);
            }
            return Unit.LIZ;
        }
        throw new Exception();
    }

    public static final Object invoke$1(AwS54S0200100_18 awS54S0200100_18, Object obj, Object obj2, Object obj3) {
        boolean z;
        Integer numValueOf;
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        long jLongValue = ((Number) obj3).longValue();
        Integer numValueOf2 = Integer.valueOf((int) (jLongValue - awS54S0200100_18.j2));
        int i = 0;
        if (numValueOf2.intValue() != list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            numValueOf = Integer.valueOf(list.size() - numValueOf2.intValue());
        } else {
            numValueOf = null;
        }
        ((C1167410gU7) awS54S0200100_18.l0).LJIILLIIL = Boolean.valueOf(zBooleanValue);
        ((C1167410gU7) awS54S0200100_18.l0).LJIILL = Long.valueOf(jLongValue);
        Set<String> set = ((C1167410gU7) awS54S0200100_18.l0).LJJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        set.addAll(arrayList);
        if (!Intrinsics.LJFF(((C1167410gU7) awS54S0200100_18.l0).LJIJ, new Pair(Long.MAX_VALUE, Long.MAX_VALUE))) {
            if (jLongValue < ((C1167410gU7) awS54S0200100_18.l0).LJIJ.getFirst().longValue()) {
                ((C1167410gU7) awS54S0200100_18.l0).LJIILJJIL = new Pair<>(0L, Long.valueOf(jLongValue - 1));
                C19719612Di.LJJI(list, ((C1167410gU7) awS54S0200100_18.l0).LJIILIIL);
                C19719612Di.LJJI(list, ((C1167410gU7) awS54S0200100_18.l0).LJJI);
                C1167410gU7 c1167410gU7 = (C1167410gU7) awS54S0200100_18.l0;
                int i2 = c1167410gU7.LJIL;
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (((Aweme) it3.next()).isSubOnlyVideo() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                c1167410gU7.LJIL = i2 + i;
                InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS54S0200100_18.l1;
                C1167440gUA c1167440gUA = new C1167440gUA(list, true, Long.valueOf(jLongValue), null, numValueOf, 8);
                C189200o6.m2constructorimpl(c1167440gUA);
                interfaceC1364105Vn.resumeWith(c1167440gUA);
            } else {
                ((C1167410gU7) awS54S0200100_18.l0).LJIILJJIL = new Pair<>(0L, Long.valueOf(((C1167410gU7) awS54S0200100_18.l0).LJIJ.getFirst().longValue() - 1));
                C1167410gU7 c1167410gU72 = (C1167410gU7) awS54S0200100_18.l0;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    Aweme aweme = (Aweme) obj4;
                    Iterator it4 = ((ArrayList) c1167410gU72.LJJIFFI).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (Intrinsics.LJFF(((Aweme) it4.next()).getAid(), aweme.getAid())) {
                                break;
                            }
                        } else {
                            arrayList2.add(obj4);
                            break;
                        }
                    }
                }
                C19719612Di.LJJI(arrayList2, ((C1167410gU7) awS54S0200100_18.l0).LJIILIIL);
                C19719612Di.LJJI(arrayList2, ((C1167410gU7) awS54S0200100_18.l0).LJJI);
                C1167410gU7 c1167410gU73 = (C1167410gU7) awS54S0200100_18.l0;
                int i3 = c1167410gU73.LJIL;
                if (!arrayList2.isEmpty()) {
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        if (((Aweme) it5.next()).isSubOnlyVideo() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                c1167410gU73.LJIL = i3 + i;
                C1167410gU7 c1167410gU74 = (C1167410gU7) awS54S0200100_18.l0;
                c1167410gU74.LJIJJLI = true;
                InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS54S0200100_18.l1;
                C1167440gUA c1167440gUA2 = new C1167440gUA(C13LP.LJLIL(c1167410gU74.LJIIZILJ, arrayList2), false, null, null, numValueOf, 12);
                C189200o6.m2constructorimpl(c1167440gUA2);
                interfaceC1364105Vn2.resumeWith(c1167440gUA2);
            }
        } else {
            C19719612Di.LJJI(list, ((C1167410gU7) awS54S0200100_18.l0).LJIILIIL);
            C19719612Di.LJJI(list, ((C1167410gU7) awS54S0200100_18.l0).LJJI);
            C1167410gU7 c1167410gU75 = (C1167410gU7) awS54S0200100_18.l0;
            int i4 = c1167410gU75.LJIL;
            if (!list.isEmpty()) {
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    if (((Aweme) it6.next()).isSubOnlyVideo() && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            c1167410gU75.LJIL = i4 + i;
            ((C1167410gU7) awS54S0200100_18.l0).LJIILJJIL = new Pair<>(0L, Long.valueOf(jLongValue - 1));
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) awS54S0200100_18.l1;
            C1167440gUA c1167440gUA3 = new C1167440gUA(list, zBooleanValue, Long.valueOf(jLongValue), null, numValueOf, 8);
            C189200o6.m2constructorimpl(c1167440gUA3);
            interfaceC1364105Vn3.resumeWith(c1167440gUA3);
        }
        return Unit.LIZ;
    }
}
