package kotlin.jvm.internal;

import X.C09AY;
import X.C1118780fDg;
import X.C1118840fDm;
import X.C1126540fQC;
import X.C20441214yg;
import X.C2182691Abb;
import X.C2182701Abc;
import X.C930540aK4;
import X.InterfaceC1331000kjy;
import X.InterfaceC1631620sYq;
import Y.ARunnableS102S0200000_33;
import Y.ARunnableS66S0300000_33;
import android.graphics.Point;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes34.dex */
public class AwS322S0300000_33 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
    public AwS322S0300000_33(C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, C2182691Abb c2182691Abb, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2182691Abb;
        this.l1 = c1118840fDm;
        this.l2 = c1126540fQC;
    }

    public static final Object invoke$0(AwS322S0300000_33 awS322S0300000_33, Object obj, Object obj2, Object obj3) {
        final AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) obj3;
        final C2182701Abc c2182701Abc = (C2182701Abc) awS322S0300000_33.l0;
        if (c2182701Abc.LJIIJ) {
            C1118780fDg.LIZIZ((C1118840fDm) awS322S0300000_33.l1, 0, 1, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
            C20441214yg.LIZIZ("GiftExpressionHelper", "playBigFlyGiftOnMask return for screen is cleared");
            C2182701Abc c2182701Abc2 = (C2182701Abc) awS322S0300000_33.l0;
            HandlerHook.viewPost(c2182701Abc2.LIZIZ.LJJIIJ(), new ARunnableS102S0200000_33((C1126540fQC) awS322S0300000_33.l2, c2182701Abc2, 12));
        } else {
            final C1118840fDm c1118840fDm = (C1118840fDm) awS322S0300000_33.l1;
            final C1126540fQC c1126540fQC = (C1126540fQC) awS322S0300000_33.l2;
            c2182701Abc.LJIIIZ = animatedDrawable2;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
                animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.1Abf
                    @Override // X.InterfaceC1331000kjy
                    public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelper", "playBigGiftOnMask onAnimationStart");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelper", "playBigGiftOnMask onAnimationRepeat");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelper", "playBigGiftOnMask onAnimationStop");
                        HandlerHook.viewPost(c2182701Abc.LIZIZ.LJJIIJ(), new ARunnableS66S0300000_33(c1126540fQC, animatedDrawable2, c2182701Abc, 4));
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                        if (i == 1) {
                            C1118780fDg.LIZIZ(new C1118840fDm(c1118840fDm.LIZ, new Pair(new Point(0, 0), new Point(0, 0)), 0, 0L, 12), 0, 1, 1, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                        }
                    }
                });
                animatedDrawable2.start();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS322S0300000_33 awS322S0300000_33, Object obj, Object obj2, Object obj3) {
        final AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) obj3;
        final C2182691Abb c2182691Abb = (C2182691Abb) awS322S0300000_33.l0;
        if (c2182691Abb.LJIILL) {
            C1118780fDg.LIZIZ((C1118840fDm) awS322S0300000_33.l1, 0, 1, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
            C20441214yg.LIZIZ("GiftExpressionHelperV2", "playBigFlyGiftOnMask return for screen is cleared");
            C2182691Abb c2182691Abb2 = (C2182691Abb) awS322S0300000_33.l0;
            HandlerHook.viewPost(c2182691Abb2.LIZIZ, new ARunnableS102S0200000_33((C1126540fQC) awS322S0300000_33.l2, c2182691Abb2, 9));
        } else {
            final C1118840fDm c1118840fDm = (C1118840fDm) awS322S0300000_33.l1;
            final C1126540fQC c1126540fQC = (C1126540fQC) awS322S0300000_33.l2;
            c2182691Abb.LJIILJJIL = animatedDrawable2;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
                animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.1Abg
                    @Override // X.InterfaceC1331000kjy
                    public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelperV2", "playBigGiftOnMask onAnimationStart");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelperV2", "playBigGiftOnMask onAnimationRepeat");
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                        C20441214yg.LIZIZ("GiftExpressionHelperV2", "playBigGiftOnMask onAnimationStop");
                        C2182691Abb c2182691Abb3 = c2182691Abb;
                        HandlerHook.viewPost(c2182691Abb3.LIZIZ, new ARunnableS66S0300000_33(c1126540fQC, animatedDrawable2, c2182691Abb3, 7));
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                        if (i == 1) {
                            C1118780fDg.LIZIZ(new C1118840fDm(c1118840fDm.LIZ, new Pair(new Point(0, 0), new Point(0, 0)), 0, 0L, 12), 0, 1, 1, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                        }
                    }
                });
                animatedDrawable2.start();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS322S0300000_33(C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, C2182701Abc c2182701Abc, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2182701Abc;
        this.l1 = c1118840fDm;
        this.l2 = c1126540fQC;
    }
}
