package com.ss.android.ugc.aweme.topic.ui;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C264910AZt;
import X.C419910GdJ;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC626900OiO;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS20S0101000_9;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicFloatingActionAssem extends ShootAssem implements ViewPagerPageSelectedSubscriber {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicFloatingActionAssem.class, "topicReviewVM", "getTopicReviewVM()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewVM;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopicFloatingActionAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicReviewVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1577), AFwS240S0000000_9.get$arr$(658), null, true);
    }

    public final void tp() {
        op().setText(this.LLJJJJJIL == 0 ? op().getContext().getString(2131827849) : op().getContext().getString(2131827863));
        TuxIconView tuxIconViewMp = mp();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = this.LLJJJJJIL == 0 ? R.raw.icon_video_fill : R.raw.icon_star_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        tuxIconViewMp.setTuxIcon(c419910GdJ);
        C786410Ut5.LJLZ((this.LLJJJJJIL == 1 && this.LLJJJJLIIL) ? 8 : 0, lp());
        lp().requestLayout();
        C786410Ut5.K7(lp(), new ACListenerS144S0100000_9(this, 92));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.topic.ui.TopicFloatingActionAssem for r14v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.ShootAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r15) {
        /*
            r14 = this;
            r8 = r14
            super.onViewCreated(r15)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r8.LLJJJJ
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.topic.ui.TopicFloatingActionAssem.LLJJL
            r7 = 0
            com.bytedance.assem.arch.viewModel.AssemViewModel r9 = r1.getValue()
            X.0OiH r10 = new X.C2217381BqS() { // from class: X.0OiH
                static {
                    /*
                        X.0OiH r0 = new X.0OiH
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0OiH) X.0OiH.LL X.0OiH
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C626830OiH.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0Ohd> r3 = X.C626430Ohd.class
                        java.lang.String r2 = "getHasReviewed()Z"
                        r1 = 0
                        java.lang.String r0 = "hasReviewed"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C626830OiH.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0Ohd r2 = (X.C626430Ohd) r2
                        boolean r0 = r2.LLILZIL
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C626830OiH.get(java.lang.Object):java.lang.Object");
                }
            }
            r11 = 0
            kotlin.jvm.internal.AwS623S0100000_9 r12 = new kotlin.jvm.internal.AwS623S0100000_9
            r0 = 153(0x99, float:2.14E-43)
            r12.<init>(r8, r0)
            r13 = 6
            X.C736680Sv4.LJIIIIZZ(r8, r9, r10, r11, r12, r13)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r8)
            if (r0 == 0) goto L33
            r5 = 0
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r11)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r11)
            if (r6 != 0) goto L34
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            X.C1558520qew.LJII(r4, r8, r0, r11, r11)
        L33:
            return
        L34:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L4c
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L4c
            if (r0 == 0) goto L44
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L4c
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L4c
            r0.add(r8)     // Catch: java.lang.IllegalArgumentException -> L4c
            return
        L44:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L4c
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L4c
            throw r1     // Catch: java.lang.IllegalArgumentException -> L4c
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            r2[r7] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L7a
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            return
        L7a:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.ui.TopicFloatingActionAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber
    public final void Pm0(int i, EnumC626900OiO enumC626900OiO) {
        if (((Boolean) C264910AZt.LIZ.getValue()).booleanValue() && i == 1 && this.LLJJJJLIIL) {
            C786410Ut5.LJLZ(8, lp());
            return;
        }
        lp().setPivotX(lp().getWidth() / 2.0f);
        lp().setPivotY(lp().getHeight() / 2.0f);
        lp().animate().scaleX(0.9f).scaleY(0.9f).setDuration(200L).withEndAction(new ARunnableS20S0101000_9(i, this, 4)).start();
    }
}
