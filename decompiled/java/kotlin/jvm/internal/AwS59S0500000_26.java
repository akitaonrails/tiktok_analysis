package kotlin.jvm.internal;

import X.C09AY;
import X.C1720310urt;
import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.pipo.ttpay.landing.WelcomePageViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS59S0500000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS59S0500000_26 r11, java.lang.Object r12) {
        /*
            r4 = r12
            X.0urh r4 = (X.C1720190urh) r4
            X.06Xi r5 = new X.06Xi
            java.lang.Object r0 = r11.l0
            X.0urt r0 = (X.C1720310urt) r0
            r5.<init>(r0)
            java.lang.Object r0 = r11.l1
            com.bytedance.pipo.stellar.base.resourceloader.StellarChunk r0 = (com.bytedance.pipo.stellar.base.resourceloader.StellarChunk) r0
            com.bytedance.pipo.stellar.base.resourceloader.StellarStyle r6 = r0.mainStyle
            r7 = 0
            X.0uro r8 = new X.0uro
            java.lang.Object r3 = r11.l2
            com.bytedance.pipo.stellar.base.fragment.StellarViewModel r3 = (com.bytedance.pipo.stellar.base.fragment.StellarViewModel) r3
            com.bytedance.pipo.stellar.base.model.CardDO r2 = r0.header
            r3.getClass()
            r10 = 0
            if (r2 == 0) goto L8d
            java.lang.String r0 = r2.getType()
            if (r0 == 0) goto L8d
            java.lang.String r0 = r2.getType()
            com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter r1 = r3.is2(r0)
            if (r1 == 0) goto L8b
            X.0utU r0 = X.C1721300utU.LIZ
            r0.getClass()
            X.0usH r1 = X.C1721300utU.LJII(r1, r2)
        L3a:
            boolean r0 = r1 instanceof X.C1720570usJ
            if (r0 == 0) goto L89
            X.0usJ r1 = (X.C1720570usJ) r1
            if (r1 == 0) goto L89
            T r1 = r1.LLJJ
            com.bytedance.pipo.stellar.base.model.NavBarDO r1 = (com.bytedance.pipo.stellar.base.model.NavBarDO) r1
        L46:
            X.002o r0 = r3.getState()
            X.0urh r0 = (X.C1720190urh) r0
            boolean r0 = r0.LLILZIL
            if (r1 == 0) goto L8d
            com.bytedance.pipo.stellar.base.model.NavBarDO r2 = com.bytedance.pipo.stellar.base.fragment.StellarViewModel.EQ2(r1, r0)
            if (r2 == 0) goto L8d
            java.lang.Object r1 = r11.l2
            com.bytedance.pipo.stellar.base.fragment.StellarViewModel r1 = (com.bytedance.pipo.stellar.base.fragment.StellarViewModel) r1
            boolean r0 = r4.LLILZIL
            r1.getClass()
            com.bytedance.pipo.stellar.base.model.NavBarDO r1 = com.bytedance.pipo.stellar.base.fragment.StellarViewModel.EQ2(r2, r0)
        L63:
            java.lang.Object r0 = r11.l1
            com.bytedance.pipo.stellar.base.resourceloader.StellarChunk r0 = (com.bytedance.pipo.stellar.base.resourceloader.StellarChunk) r0
            com.bytedance.pipo.stellar.base.model.CardDO r0 = r0.header
            if (r0 == 0) goto L87
            com.bytedance.pipo.stellar.base.model.BackgroundDO r0 = r0.getBackground()
        L6f:
            r8.<init>(r1, r0)
            java.lang.Object r0 = r11.l3
            com.bytedance.pipo.stellar.base.model.CardDO r0 = (com.bytedance.pipo.stellar.base.model.CardDO) r0
            if (r0 != 0) goto L7e
            java.lang.Object r0 = r11.l4
            com.bytedance.pipo.stellar.base.resourceloader.StellarChunk r0 = (com.bytedance.pipo.stellar.base.resourceloader.StellarChunk) r0
            com.bytedance.pipo.stellar.base.model.StellarTooltipDO r10 = r0.tooltipDO
        L7e:
            r11 = 0
            r12 = 208(0xd0, float:2.91E-43)
            r9 = r7
            X.0urh r0 = X.C1720190urh.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L87:
            r0 = r10
            goto L6f
        L89:
            r1 = r10
            goto L46
        L8b:
            r1 = r10
            goto L3a
        L8d:
            r1 = r10
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS59S0500000_26.invoke$0(kotlin.jvm.internal.AwS59S0500000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS59S0500000_26 awS59S0500000_26, Object obj) {
        ((WelcomePageViewModel) awS59S0500000_26.l0).setState(new AwS121S0400000_26((StellarChunk) awS59S0500000_26.l1, (StellarChunk) awS59S0500000_26.l2, (List<CardDO>) awS59S0500000_26.l3, (List<CardDO>) awS59S0500000_26.l4, (StellarChunk) 7));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0500000_26(C1720310urt c1720310urt, StellarChunk stellarChunk, StellarViewModel stellarViewModel, CardDO cardDO, StellarChunk stellarChunk2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1720310urt;
        this.l1 = stellarChunk;
        this.l2 = stellarViewModel;
        this.l3 = cardDO;
        this.l4 = stellarChunk2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS59S0500000_26(WelcomePageViewModel welcomePageViewModel, WelcomePageViewModel welcomePageViewModel2, StellarChunk stellarChunk, List<CardDO> list, List<CardDO> list2, StellarChunk stellarChunk2) {
        super(1);
        this.$t = stellarChunk2;
        this.l0 = welcomePageViewModel;
        this.l1 = welcomePageViewModel2;
        this.l2 = stellarChunk;
        this.l3 = list;
        this.l4 = list2;
    }
}
