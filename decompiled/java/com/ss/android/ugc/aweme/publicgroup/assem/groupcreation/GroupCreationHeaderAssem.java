package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCreationHeaderAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupCreationHeaderAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/PublicGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupCreationHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PublicGroupCreationVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 765), AFwS229S0000000_2.get$arr$(470), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS546S0100000_2(this, 767));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 766));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 764));
        this.LLJJIJIL = new C1559260qg8(new C723580SZw(this, C1527305yR.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cj8;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            r4 = r10
            super.onViewCreated(r11)
            X.0qg8 r0 = r4.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            X.05yR r0 = (X.C1527305yR) r0
            if (r0 == 0) goto Lad
            X.0i4b r0 = r0.LL
            if (r0 == 0) goto Lad
            X.0i4t r0 = r0.LIZ
            if (r0 == 0) goto Lad
            kotlin.jvm.functions.Function2<android.view.ViewGroup, java.lang.Integer, android.view.View> r3 = r0.LJIILJJIL
        L18:
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto Lab
            X.0qg8 r0 = r4.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            X.05yR r0 = (X.C1527305yR) r0
            if (r0 == 0) goto La7
            X.0i4b r0 = r0.LL
            if (r0 == 0) goto La7
            X.0i4t r0 = r0.LIZ
            if (r0 == 0) goto La7
            int r0 = r0.LJIIZILJ
        L32:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto Lab
            int r2 = r0.intValue()
        L3c:
            if (r3 == 0) goto L7e
            X.01GW r0 = r4.LLJJIJIIJIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C1584506Ih.LIZIZ(r0)
            X.01GW r0 = r4.LLJJIJIIJIL
            java.lang.Object r0 = r0.getValue()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            X.C786410Ut5.LJJJJIZL(r0)
            X.01GW r0 = r4.LLJJIJIIJIL
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r3.invoke(r1, r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L71
            X.01GW r0 = r4.LLJJIJIIJIL
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r1)
        L71:
            X.01GW r0 = r4.LLJJIII
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r0 = 13
            r1.setTuxFont(r0)
        L7e:
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r4.LLJJI
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationHeaderAssem.LLJJJ
            com.bytedance.assem.arch.viewModel.AssemViewModel r5 = r1.getValue()
            X.06Ii r6 = new X.C2217381BqS() { // from class: X.06Ii
                static {
                    /*
                        X.06Ii r0 = new X.06Ii
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.06Ii) X.06Ii.LL X.06Ii
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1584606Ii.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0i5F> r3 = X.C1228870i5F.class
                        java.lang.String r2 = "getTitle()Ljava/lang/CharSequence;"
                        r1 = 0
                        java.lang.String r0 = "title"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1584606Ii.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0i5F r2 = (X.C1228870i5F) r2
                        java.lang.CharSequence r0 = r2.LLJIJIL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1584606Ii.get(java.lang.Object):java.lang.Object");
                }
            }
            r7 = 0
            kotlin.jvm.internal.AwS616S0100000_2 r8 = new kotlin.jvm.internal.AwS616S0100000_2
            r0 = 118(0x76, float:1.65E-43)
            r8.<init>(r4, r0)
            r9 = 6
            X.C736680Sv4.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r0 = r4.LLJJI
            com.bytedance.assem.arch.viewModel.AssemViewModel r5 = r0.getValue()
            X.06Ij r6 = new X.C2217381BqS() { // from class: X.06Ij
                static {
                    /*
                        X.06Ij r0 = new X.06Ij
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.06Ij) X.06Ij.LL X.06Ij
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1584706Ij.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0i5F> r3 = X.C1228870i5F.class
                        java.lang.String r2 = "getSubTitle()Ljava/lang/CharSequence;"
                        r1 = 0
                        java.lang.String r0 = "subTitle"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1584706Ij.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0i5F r2 = (X.C1228870i5F) r2
                        java.lang.CharSequence r0 = r2.LLJILJIL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1584706Ij.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS616S0100000_2 r8 = new kotlin.jvm.internal.AwS616S0100000_2
            r0 = 119(0x77, float:1.67E-43)
            r8.<init>(r4, r0)
            X.C736680Sv4.LJIIIIZZ(r4, r5, r6, r7, r8, r9)
            return
        La7:
            r0 = 2131100553(0x7f060389, float:1.781349E38)
            goto L32
        Lab:
            r2 = 0
            goto L3c
        Lad:
            r3 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationHeaderAssem.onViewCreated(android.view.View):void");
    }
}
