package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C13LP;
import X.C23250099c;
import X.C316080CaE;
import X.C322320CkI;
import X.C322410CkR;
import X.C322460CkW;
import X.C336230DGb;
import X.C495401wO;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS112S0101000_4 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS112S0101000_4 awS112S0101000_4, Object obj) {
        ((C336230DGb) awS112S0101000_4.l0).LLILLJJLI.Sf(awS112S0101000_4.i1, ((Number) obj).intValue());
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS112S0101000_4 r17, java.lang.Object r18) {
        /*
            r6 = r18
            X.0CwA r6 = (X.C329680CwA) r6
            boolean r0 = X.C301390Brd.LIZ()
            r7 = r17
            if (r0 == 0) goto L2a
            boolean r0 = r6.LLIZLLLIL
            if (r0 == 0) goto L2a
            java.util.List<X.0CyP> r0 = r6.LLILLJJLI
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r2.next()
            X.0CyP r0 = (X.C331070CyP) r0
            boolean r0 = r0.LLILZIL
            if (r0 != 0) goto L99
            int r1 = r1 + 1
            goto L17
        L2a:
            X.0DV2 r2 = new X.0DV2
            X.0DV3 r1 = X.C0DV3.CLICK_BAR
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LLILZLL
            r8 = 0
            r2.<init>(r1, r8, r0)
            r2.LJIILJJIL()
            java.util.List<X.0CyP> r1 = r6.LLILLJJLI
            int r5 = r7.i1
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
            r1 = 0
            r3 = r8
        L4c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r9 = r10.next()
            int r2 = r1 + 1
            if (r1 < 0) goto La0
            X.0CyP r9 = (X.C331070CyP) r9
            if (r1 != r5) goto L7f
            boolean r0 = r9.LLILZIL
            if (r0 != 0) goto L7f
            r16 = 1
            r3 = r9
        L65:
            java.lang.String r12 = r9.LL
            int r13 = r9.LLILLJJLI
            java.lang.Boolean r14 = r9.LLILLL
            java.lang.String r15 = r9.LLILZ
            X.0Cw8 r1 = r9.LLILZLL
            X.07Wt r0 = r9.LLIZ
            X.0CyP r11 = new X.0CyP
            r18 = r0
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r4.add(r11)
            r1 = r2
            goto L4c
        L7f:
            r16 = 0
            goto L65
        L82:
            if (r3 == 0) goto L88
            X.0Cw8 r3 = r3.LLILZLL
            if (r3 != 0) goto L8a
        L88:
            X.0Cw8 r3 = r6.LL
        L8a:
            java.lang.Object r2 = r7.l0
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel r2 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel) r2
            kotlin.jvm.internal.AwS213S0300000_4 r1 = new kotlin.jvm.internal.AwS213S0300000_4
            r0 = 6
            r1.<init>(r4, r2, r3, r0)
            r2.setState(r1)
            goto L9d
        L98:
            r1 = -1
        L99:
            int r0 = r7.i1
            if (r1 != r0) goto L2a
        L9d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La0:
            X.C1697810uHb.LJIJI()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS112S0101000_4.invoke$1(kotlin.jvm.internal.AwS112S0101000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS112S0101000_4 awS112S0101000_4, Object obj) {
        ((EffectDraftDetailViewModel) awS112S0101000_4.l0).setState(new C322410CkR(((Boolean) obj).booleanValue(), awS112S0101000_4.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS112S0101000_4 awS112S0101000_4, Object obj) {
        C322460CkW c322460CkW;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(awS112S0101000_4.i1, ((C322320CkI) obj).LLILLL.LIZ);
        if ((objLJJJLZIJ instanceof C322460CkW) && (c322460CkW = (C322460CkW) objLJJJLZIJ) != null) {
            C316080CaE c316080CaE = (C316080CaE) ((EffectDraftDetailViewModel) awS112S0101000_4.l0).LL.getValue();
            String str = c322460CkW.LJIIJ;
            AwS112S0101000_4 awS112S0101000_42 = new AwS112S0101000_4(awS112S0101000_4.i1, (EffectDraftDetailViewModel) awS112S0101000_4.l0, 2);
            c316080CaE.getClass();
            if (str.length() == 0) {
                awS112S0101000_42.invoke(Boolean.FALSE);
            } else {
                C23250099c.LIZLLL(c316080CaE.LIZ.invoke(), C0PEM.LIZJ, null, new C495401wO(str, awS112S0101000_42, null), 2);
            }
        } else {
            ((EffectDraftDetailViewModel) awS112S0101000_4.l0).setState(new AwS19S0001000_4(awS112S0101000_4.i1, 0));
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS112S0101000_4(int r3, com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS112S0101000_4.<init>(int, com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0101000_4(int i, SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = searchProsConsTabAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0101000_4(C336230DGb c336230DGb, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c336230DGb;
        this.i1 = i;
    }
}
