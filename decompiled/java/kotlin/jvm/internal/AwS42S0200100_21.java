package kotlin.jvm.internal;

import X.AbstractC1384320m7y;
import X.AbstractC1396720mRy;
import X.AbstractC1397150mSf;
import X.C08XD;
import X.C09AY;
import X.C1396780mS4;
import X.C1396790mS5;
import X.C1397140mSe;
import Y.AComparatorS518S0100000_21;
import com.bytedance.common.meteor.render.newcache.BitmapCacheManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS42S0200100_21 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS42S0200100_21 awS42S0200100_21) {
        AbstractC1396720mRy<AbstractC1384320m7y> next;
        ((AbstractC1397150mSf) awS42S0200100_21.l0).LIZJ.LIZ.addAll((List) awS42S0200100_21.l1);
        C1396790mS5 c1396790mS5 = ((AbstractC1397150mSf) awS42S0200100_21.l0).LIZJ;
        long j = awS42S0200100_21.j2;
        c1396790mS5.getClass();
        if (!c1396790mS5.LIZ.isEmpty() && c1396790mS5.LIZ.size() > c1396790mS5.LIZLLL) {
            LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> linkedList = c1396790mS5.LIZ;
            C1396780mS4 c1396780mS4 = new C1396780mS4(c1396790mS5, j);
            Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                if (((Boolean) c1396780mS4.invoke(it2.next())).booleanValue()) {
                    it2.remove();
                }
            }
            while (c1396790mS5.LIZ.size() > c1396790mS5.LIZLLL) {
                Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it3 = c1396790mS5.LIZ.iterator();
                if (!it3.hasNext()) {
                    next = null;
                } else {
                    next = it3.next();
                    if (it3.hasNext()) {
                        Comparable<?> comparableInvoke = c1396790mS5.LIZIZ.LIZLLL.LJFF.invoke(next.LJ());
                        if (comparableInvoke != null) {
                            Comparable<?> comparable = comparableInvoke;
                            do {
                                AbstractC1396720mRy<AbstractC1384320m7y> next2 = it3.next();
                                Comparable<?> comparableInvoke2 = c1396790mS5.LIZIZ.LIZLLL.LJFF.invoke(next2.LJ());
                                if (comparableInvoke2 != null) {
                                    Comparable<?> comparable2 = comparableInvoke2;
                                    if (comparable.compareTo(comparable2) > 0) {
                                        next = next2;
                                        comparable = comparable2;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Comparable<kotlin.Any?>");
                                }
                            } while (it3.hasNext());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Comparable<kotlin.Any?>");
                        }
                    }
                }
                AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = next;
                if (abstractC1396720mRy != null) {
                    AwS630S0100000_16 awS630S0100000_16 = c1396790mS5.LIZIZ.LIZLLL.LJIIIZ;
                    if (awS630S0100000_16 != null) {
                        awS630S0100000_16.invoke(abstractC1396720mRy.LJ(), 2);
                    }
                    c1396790mS5.LIZ.remove(abstractC1396720mRy);
                    BitmapCacheManager.LIZ(abstractC1396720mRy.LLJILJILJ);
                    abstractC1396720mRy.LLJILJILJ = null;
                }
            }
        }
        if (c1396790mS5.LIZIZ.LIZLLL.LJIILIIL) {
            LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> linkedList2 = c1396790mS5.LIZ;
            if (linkedList2.size() > 1) {
                C08XD.LJJ(linkedList2, new AComparatorS518S0100000_21(c1396790mS5, 7));
            }
        }
        Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it4 = c1396790mS5.LIZ.iterator();
        while (it4.hasNext()) {
            it4.next().LJJ(c1396790mS5.LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS42S0200100_21 awS42S0200100_21) {
        ((C1397140mSe) awS42S0200100_21.l0).LIZLLL.LJFF.getClass();
        ((C1397140mSe) awS42S0200100_21.l0).LJIIIZ(awS42S0200100_21.j2, (List) awS42S0200100_21.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0200100_21(C1397140mSe c1397140mSe, List list, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1397140mSe;
        this.l1 = list;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0200100_21(AbstractC1397150mSf abstractC1397150mSf, List list, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1397150mSf;
        this.l1 = list;
        this.j2 = j;
    }
}
