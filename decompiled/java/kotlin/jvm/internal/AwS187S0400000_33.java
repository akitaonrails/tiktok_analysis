package kotlin.jvm.internal;

import X.C09AY;
import X.C1118780fDg;
import X.C1118840fDm;
import X.C1126540fQC;
import X.C1863240yaQ;
import X.C19404410vq;
import X.C20441214yg;
import X.C2182691Abb;
import X.C2182701Abc;
import X.C259800zU;
import X.C930540aK4;
import X.InterfaceC1331000kjy;
import X.InterfaceC1631620sYq;
import Y.ARunnableS66S0300000_33;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes34.dex */
public class AwS187S0400000_33 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS187S0400000_33 awS187S0400000_33, Object obj, Object obj2, Object obj3) {
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) obj3;
        final C2182701Abc c2182701Abc = (C2182701Abc) awS187S0400000_33.l0;
        if (c2182701Abc.LJIIJ) {
            FrameLayout frameLayout = (FrameLayout) awS187S0400000_33.l1;
            C1126540fQC c1126540fQC = (C1126540fQC) awS187S0400000_33.l2;
            c2182701Abc.getClass();
            if (frameLayout != null) {
                HandlerHook.viewPost(frameLayout, new ARunnableS66S0300000_33(c2182701Abc, frameLayout, c1126540fQC, 6));
            }
            C1118840fDm c1118840fDm = (C1118840fDm) awS187S0400000_33.l3;
            C1118780fDg.LIZIZ(c1118840fDm, 0, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
            C20441214yg.LIZIZ("GiftExpressionHelper", "playSmallFlyGiftOnMask return for screen is cleared");
        } else {
            final C1118840fDm c1118840fDm2 = (C1118840fDm) awS187S0400000_33.l3;
            final FrameLayout frameLayout2 = (FrameLayout) awS187S0400000_33.l1;
            final C1126540fQC c1126540fQC2 = (C1126540fQC) awS187S0400000_33.l2;
            c2182701Abc.LJIIIIZZ = animatedDrawable2;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
                animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.1Abi
                    @Override // X.InterfaceC1331000kjy
                    public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelper", "playSmallGiftOnMask onAnimationStart");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelper", "playSmallGiftOnMask onAnimationRepeat");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelper", "playSmallGiftOnMask onAnimationStop");
                        HandlerHook.viewPost(c2182701Abc.LIZIZ.LJJIIJ(), new ARunnableS66S0300000_33(c2182701Abc, frameLayout2, c1126540fQC2, 5));
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                        if (i == 1) {
                            C1118840fDm c1118840fDm3 = c1118840fDm2;
                            C1118780fDg.LIZIZ(c1118840fDm3, 0, c1118840fDm3.LIZJ, 1, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                        }
                    }
                });
                animatedDrawable2.start();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS187S0400000_33 awS187S0400000_33, Object obj, Object obj2, Object obj3) {
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) obj3;
        final C2182691Abb c2182691Abb = (C2182691Abb) awS187S0400000_33.l0;
        if (c2182691Abb.LJIILL) {
            FrameLayout frameLayout = (FrameLayout) awS187S0400000_33.l1;
            C1126540fQC c1126540fQC = (C1126540fQC) awS187S0400000_33.l2;
            c2182691Abb.getClass();
            HandlerHook.viewPost(frameLayout, new ARunnableS66S0300000_33(c2182691Abb, frameLayout, c1126540fQC, 3));
            C1118840fDm c1118840fDm = (C1118840fDm) awS187S0400000_33.l3;
            C1118780fDg.LIZIZ(c1118840fDm, 0, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
            C20441214yg.LIZIZ("GiftExpressionHelperV2", "playSmallFlyGiftOnMask return for screen is cleared");
        } else {
            final C1118840fDm c1118840fDm2 = (C1118840fDm) awS187S0400000_33.l3;
            final FrameLayout frameLayout2 = (FrameLayout) awS187S0400000_33.l1;
            final C1126540fQC c1126540fQC2 = (C1126540fQC) awS187S0400000_33.l2;
            c2182691Abb.LJIILIIL = animatedDrawable2;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
                animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.1Abj
                    @Override // X.InterfaceC1331000kjy
                    public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelperV2", "playSmallGiftOnMask onAnimationStart");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelperV2", "playSmallGiftOnMask onAnimationRepeat");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelperV2", "playSmallGiftOnMask onAnimationStop");
                        C2182691Abb c2182691Abb2 = c2182691Abb;
                        HandlerHook.viewPost(c2182691Abb2.LIZIZ, new ARunnableS66S0300000_33(c2182691Abb2, frameLayout2, c1126540fQC2, 2));
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                        if (i == 1) {
                            C1118840fDm c1118840fDm3 = c1118840fDm2;
                            C1118780fDg.LIZIZ(c1118840fDm3, 0, c1118840fDm3.LIZJ, 1, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                        }
                    }
                });
                animatedDrawable2.start();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS187S0400000_33 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r4 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIJI(r3)
            if (r0 == 0) goto La2
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L33
            r4.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto La0
            r0 = 1
        L3e:
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS66S0001000_33 r6 = new kotlin.jvm.internal.AwS66S0001000_33
            r0 = 6
            r6.<init>(r3, r0)
            r4.LJJIJIIJI(r6)
        L56:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r10 = 0
            r0 = 2131822471(0x7f110787, float:1.9277714E38)
            java.lang.String r12 = X.C0MBB.LIZIZ(r0, r4)
            X.1A43 r13 = new X.1A43
            r0 = r17
            java.lang.Object r5 = r0.l0
            X.00zU r5 = (X.C259800zU) r5
            java.lang.Object r3 = r0.l1
            X.0yaQ r3 = (X.C1863240yaQ) r3
            java.lang.Object r2 = r0.l2
            X.10vq r2 = (X.C19404410vq) r2
            java.lang.Object r0 = r0.l3
            com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo r0 = (com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo) r0
            r1 = r13
            r15 = r0
            r16 = r3
            r17 = r6
            r18 = r5
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 770874410(0x2df29c2a, float:2.7581566E-11)
            X.12De r15 = X.C13Z4.LIZJ(r0, r1, r4)
            r9 = 0
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1456(0x5b0, float:2.04E-42)
            r11 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r4
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        La0:
            r0 = 0
            goto L3e
        La2:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS187S0400000_33.invoke$2(kotlin.jvm.internal.AwS187S0400000_33, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS187S0400000_33(C259800zU c259800zU, C259800zU<Balloon> c259800zU2, C1863240yaQ c1863240yaQ, C19404410vq c19404410vq, ConversationInfo conversationInfo) {
        super(3);
        this.$t = conversationInfo;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1863240yaQ;
        this.l3 = c19404410vq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS187S0400000_33(C2182691Abb c2182691Abb, FrameLayout frameLayout, C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2182691Abb;
        this.l1 = frameLayout;
        this.l2 = c1126540fQC;
        this.l3 = c1118840fDm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS187S0400000_33(C2182701Abc c2182701Abc, FrameLayout frameLayout, C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2182701Abc;
        this.l1 = frameLayout;
        this.l2 = c1126540fQC;
        this.l3 = c1118840fDm;
    }
}
