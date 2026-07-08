package com.ss.android.ugc.aweme.groupcreation.assem;

import X.C019F;
import X.C13LE;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.groupcreation.vm.UnifiedGroupCreationVM;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PublicGroupCreationAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PublicGroupCreationAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/groupcreation/vm/UnifiedGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PublicGroupCreationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UnifiedGroupCreationVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 230), AFwS229S0000000_2.get$arr$(191), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C1527305yR.class, null), checkSupervisorPrepared());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10) {
        /*
            r9 = this;
            r3 = r9
            super.onViewCreated(r10)
            X.0qg8 r0 = r3.LLJ
            java.lang.Object r0 = r0.getValue()
            X.05yR r0 = (X.C1527305yR) r0
            if (r0 == 0) goto L4e
            X.0i4b r0 = r0.LL
            if (r0 == 0) goto L4e
            X.0i4t r0 = r0.LIZ
            if (r0 == 0) goto L4e
            boolean r0 = r0.LJJIIZI
            r2 = 1
            if (r0 != r2) goto L4e
            android.view.View r0 = r3.LJJIJL()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L2f
            r0 = -1
            r1.height = r0
            android.view.View r0 = r3.LJJIJL()
            X.C786410Ut5.W5(r0, r1)
        L2f:
            kotlin.jvm.internal.AwS57S0210000_2 r1 = new kotlin.jvm.internal.AwS57S0210000_2
            r0 = 1
            r1.<init>(r2, r3, r10, r0)
            X.C723850SaN.LIZLLL(r3, r1)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r3.LLIZLLLIL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.groupcreation.assem.PublicGroupCreationAssem.LLJI
            com.bytedance.assem.arch.viewModel.AssemViewModel r4 = r1.getValue()
            X.06Ia r5 = new X.C2217381BqS() { // from class: X.06Ia
                static {
                    /*
                        X.06Ia r0 = new X.06Ia
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.06Ia) X.06Ia.LL X.06Ia
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1583806Ia.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.06Jq> r3 = X.C1588006Jq.class
                        java.lang.String r2 = "getCurrentCategory()Lcom/ss/android/ugc/aweme/GroupCategory;"
                        r1 = 0
                        java.lang.String r0 = "currentCategory"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1583806Ia.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.06Jq r2 = (X.C1588006Jq) r2
                        X.0i5R r0 = r2.LL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1583806Ia.get(java.lang.Object):java.lang.Object");
                }
            }
            r6 = 0
            r0 = 10
            kotlin.jvm.internal.AFwS285S0000000_2 r7 = kotlin.jvm.internal.AFwS285S0000000_2.get$arr$(r0)
            r8 = 6
            X.C736680Sv4.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            return
        L4e:
            r2 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.groupcreation.assem.PublicGroupCreationAssem.onViewCreated(android.view.View):void");
    }
}
