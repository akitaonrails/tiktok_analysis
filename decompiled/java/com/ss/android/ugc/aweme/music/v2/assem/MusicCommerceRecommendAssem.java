package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C630920Oos;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1839000xxK;
import X.InterfaceC2217461Bqa;
import X.InterfaceC631090Op9;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCommerceRecommendAssem extends DynamicAssem implements InterfaceC1839000xxK, CommerceRecommendAbility {
    public static final C630920Oos LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1224));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1225));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1222));
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public Integer LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Oos] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCommerceRecommendAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = new Object() { // from class: X.0Oos
        };
    }

    public MusicCommerceRecommendAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1228), AFwS240S0000000_9.get$arr$(520), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1229));
        this.LLJJJ = 0;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1227));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1223));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // X.InterfaceC1839000xxK
    public final void u1() {
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility
    public final InterfaceC631090Op9 Gm0() {
        return (InterfaceC631090Op9) this.LLJJJJ.getValue();
    }

    public final MusicDetailViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1839000xxK
    public final void V7() {
        IPlayerComponentAbility iPlayerComponentAbility;
        if (lp().LLJJJJ) {
            Integer num = this.LLJJJ;
            if ((num == null || num.intValue() != 3) && (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJJIL.getValue()) != null) {
                iPlayerComponentAbility.LLLLLLLLLL();
            }
        }
    }

    @Override // X.InterfaceC1839000xxK
    public final void fn() {
        IPlayerComponentAbility iPlayerComponentAbility;
        if (lp().LLJJJJ) {
            Integer num = this.LLJJJ;
            if ((num == null || num.intValue() != 3) && (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJJIL.getValue()) != null) {
                iPlayerComponentAbility.tryResumePlay();
            }
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        ViewStub viewStub = new ViewStub(context);
        C786410Ut5.Y5(viewStub, new ViewGroup.LayoutParams(-2, -1));
        Zo(viewStub);
        super.xo();
    }

    @Override // X.InterfaceC1839000xxK
    public final void ae(MusicModel musicModel) {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        MusicCommerceRecommendViewModel musicCommerceRecommendViewModel = (MusicCommerceRecommendViewModel) ViewModelProviders.of(fragmentLJI).get(MusicCommerceRecommendViewModel.class);
        musicModel.getMusicId();
        musicCommerceRecommendViewModel.getClass();
        musicCommerceRecommendViewModel.LLILLL = musicModel.getMusic();
        musicCommerceRecommendViewModel.LLILLJJLI = true;
        ShootAbility shootAbility = (ShootAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ShootAbility.class, null);
        if (shootAbility != null) {
            shootAbility.nm1();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.music.v2.assem.MusicCommerceRecommendAssem for r13v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            r13 = this;
            r13.mo127do()
            androidx.fragment.app.Fragment r5 = X.C724240Sb0.LJI(r13)
            if (r5 != 0) goto La
            return
        La:
            r7 = 0
            X.0Q7z r4 = X.C1558360qeg.LJFF(r5, r7)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r7)
            if (r6 != 0) goto L57
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility.class
            X.C1558520qew.LJII(r4, r13, r0, r7, r7)
        L1c:
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r5)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel> r0 = com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel.class
            androidx.lifecycle.ViewModel r1 = r1.get(r0)
            com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel r1 = (com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel) r1
            com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel r5 = r13.lp()
            X.0Op8 r6 = new X.C2217381BqS() { // from class: X.0Op8
                static {
                    /*
                        X.0Op8 r0 = new X.0Op8
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Op8) X.0Op8.LL X.0Op8
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C631080Op8.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0Omq> r3 = X.C629660Omq.class
                        java.lang.String r2 = "getMusicDetail()Lcom/bytedance/assem/arch/extensions/Async;"
                        r1 = 0
                        java.lang.String r0 = "musicDetail"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C631080Op8.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0Omq r2 = (X.C629660Omq) r2
                        X.06Xk<com.ss.android.ugc.aweme.music.model.MusicDetail> r0 = r2.LL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C631080Op8.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS553S0100000_9 r9 = new kotlin.jvm.internal.AwS553S0100000_9
            r0 = 1226(0x4ca, float:1.718E-42)
            r9.<init>(r13, r0)
            kotlin.jvm.internal.AwS375S0200000_9 r10 = new kotlin.jvm.internal.AwS375S0200000_9
            r0 = 68
            r10.<init>(r1, r13, r0)
            r11 = 6
            r8 = r7
            r12 = r7
            com.bytedance.assem.arch.viewModel.AssemViewModel.asyncSubscribe$default(r5, r6, r7, r8, r9, r10, r11, r12)
            X.01GW r0 = r13.LLJJJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility r0 = (com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility) r0
            if (r0 == 0) goto L54
            int r0 = r0.uz1()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L54:
            r13.LLJJJ = r7
            return
        L57:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L6f
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L6f
            if (r0 == 0) goto L67
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L6f
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L6f
            r0.add(r13)     // Catch: java.lang.IllegalArgumentException -> L6f
            goto L1c
        L67:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L6f
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L6f
            throw r1     // Catch: java.lang.IllegalArgumentException -> L6f
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility.class
            r2[r1] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r13)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L9f
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r7, r7)
            goto L1c
        L9f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicCommerceRecommendAssem.onViewCreated(android.view.View):void");
    }
}
