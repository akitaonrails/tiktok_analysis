package com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment;

import X.AbstractC342230DbJ;
import X.AnonymousClass0951;
import X.C099R;
import X.C09IC;
import X.C09IR;
import X.C13BV;
import X.C1BNE;
import X.C2252321DDq;
import X.C2286608xc;
import X.InterfaceC342240DbK;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PrefabViewModel<E, T extends AbstractC342230DbJ<E>> extends CommonFetchViewModel<List<? extends T>> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public int LLJI;

    public abstract InterfaceC342240DbK<E, List<T>> xQ2();

    public abstract void yQ2();

    public final Unit AQ2() {
        C2252321DDq c2252321DDq = this.LLIZLLLIL;
        c2252321DDq.setValue(C2286608xc.LJ(((Number) c2252321DDq.getValue()).intValue() + 1));
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }

    public PrefabViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLILZLL = c2252321DDqLIZ2;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ2);
        C09IC.LIZ(C09IR.LIZIZ(0, 0, null, 7));
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(0);
        this.LLIZLLLIL = c2252321DDqLIZ3;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ3);
    }

    @Override // com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.CommonFetchViewModel
    public final InterfaceC342240DbK wQ2() {
        return xQ2();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(java.util.List<? extends X.C342250DbL<E>> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C342210DbH
            if (r0 == 0) goto L5a
            r6 = r9
            X.0DbH r6 = (X.C342210DbH) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r3 = 1
            if (r0 == 0) goto L52
            if (r0 != r3) goto L63
            X.0DbL r1 = r6.LLILLJJLI
            java.lang.Object r2 = r6.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.C155000ia.LIZIZ(r5)
        L28:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L50
            r0 = 5
        L31:
            r1.LIZJ = r0
        L33:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r1 = r2.next()
            X.0DbL r1 = (X.C342250DbL) r1
            X.0DbK r0 = r7.xQ2()
            r6.LL = r2
            r6.LLILLJJLI = r1
            r6.LLILZIL = r3
            java.lang.Object r5 = r0.LIZ(r1)
            if (r5 != r4) goto L28
            return r4
        L50:
            r0 = 0
            goto L31
        L52:
            X.C155000ia.LIZIZ(r5)
            java.util.Iterator r2 = r8.iterator()
            goto L33
        L5a:
            X.0DbH r6 = new X.0DbH
            r6.<init>(r7, r9)
            goto L12
        L60:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.PrefabViewModel.zQ2(java.util.List, X.05Vn):java.lang.Object");
    }
}
