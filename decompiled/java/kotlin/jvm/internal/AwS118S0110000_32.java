package kotlin.jvm.internal;

import X.AbstractC813200VvC;
import X.AnonymousClass1920;
import X.AnonymousClass1937;
import X.AnonymousClass1993;
import X.C01GW;
import X.C09AY;
import X.C0ET4;
import X.C103100aD;
import X.C10J3;
import X.C10K1;
import X.C10K3;
import X.C1420670n4b;
import X.C1440005kM;
import X.C190I;
import X.C190Z;
import X.C19224310Iv;
import X.C19224510Ix;
import X.C196Y;
import X.C1DRG;
import X.C21373418ke;
import X.C21389418nE;
import X.C21389518nF;
import X.C214693190h;
import X.C214720191i;
import X.C21511719Gp;
import X.C2188811AlT;
import X.C287690BPj;
import X.C309130C9v;
import X.C461720I8s;
import X.C559610Lx9;
import X.C707060RoO;
import X.C786410Ut5;
import X.C861800XrO;
import X.C957403oi;
import X.InterfaceC21392018ne;
import X.InterfaceC21512019Gs;
import X.InterfaceC721300SRc;
import Y.AAListenerS10S0100002_32;
import Y.AAListenerS265S0200000_13;
import Y.ACListenerS134S0200000_32;
import Y.AUListenerS159S0300000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.im.sdk.u16.data.model.DisableChatUnder16Resp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryInboxAvatarMorphConfig;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageInfo;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS118S0110000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        int i;
        C190Z c190z = (C190Z) obj;
        C861800XrO c861800XrO = new C861800XrO(C1420670n4b.LIZLLL(((AnonymousClass1920) awS118S0110000_32.l0).O4(), ((AnonymousClass1920) awS118S0110000_32.l0).P4()));
        boolean zLJIIJJI = C1420670n4b.LJIIJJI(((AnonymousClass1920) awS118S0110000_32.l0).P4());
        if (C1420670n4b.LJIILIIL() && C1420670n4b.LIZJ(((AnonymousClass1920) awS118S0110000_32.l0).P4()) == 0) {
            i = 0;
        } else {
            i = 8;
        }
        return C190Z.LJFF(c190z, i, zLJIIJJI, false, c861800XrO, awS118S0110000_32.z1, 316);
    }

    public static final Object invoke$1(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        return C190Z.LJFF((C190Z) obj, 0, false, false, new C861800XrO(C1420670n4b.LIZLLL(((AnonymousClass1920) awS118S0110000_32.l0).O4(), ((AnonymousClass1920) awS118S0110000_32.l0).P4())), awS118S0110000_32.z1, 319);
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        C10J3 c10j3;
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (awS118S0110000_32.z1) {
            c10j3 = C10K1.LIZ;
        } else {
            c10j3 = AnonymousClass1937.LIZ;
        }
        C19224510Ix c19224510Ix = new C19224510Ix(c1drg, c10j3);
        ((C559610Lx9) awS118S0110000_32.l0).getClass();
        C559610Lx9.LIZ(c19224510Ix);
        c19224510Ix.afterInit$als_release(jUptimeMillis);
        return c19224510Ix;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        C10J3 c10j3;
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (awS118S0110000_32.z1) {
            c10j3 = C10K3.LIZ;
        } else {
            c10j3 = AnonymousClass1937.LIZ;
        }
        C19224310Iv c19224310Iv = new C19224310Iv(c1drg, c10j3);
        ((C559610Lx9) awS118S0110000_32.l0).getClass();
        C559610Lx9.LIZ(c19224310Iv);
        c19224310Iv.afterInit$als_release(jUptimeMillis);
        return c19224310Iv;
    }

    public static final Object invoke$12(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        SAFFragmentRootScene sAFFragmentRootScene = (SAFFragmentRootScene) obj;
        if (sAFFragmentRootScene != null) {
            sAFFragmentRootScene.d5((AbstractC813200VvC) awS118S0110000_32.l0, awS118S0110000_32.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        String str;
        String str2;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("page_name", "video");
        if (awS118S0110000_32.z1) {
            str = "yes";
        } else {
            str = "no";
        }
        c957403oi.LIZLLL("is_single_anchor", str);
        if (awS118S0110000_32.z1) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        c957403oi.LIZLLL("entrance_form", str2);
        c957403oi.LIZLLL("anchor_show_type", "video_cart_tag");
        c957403oi.LJ((Map) awS118S0110000_32.l0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        C21373418ke c21373418ke = new C21373418ke((Context) obj);
        boolean z = awS118S0110000_32.z1;
        Function0 function0 = (Function0) awS118S0110000_32.l0;
        c21373418ke.setSelected(z);
        C786410Ut5.kb(c21373418ke, new ACListenerS134S0200000_32(c21373418ke, function0, 19));
        return c21373418ke;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        C21373418ke c21373418ke = (C21373418ke) obj;
        boolean zIsSelected = c21373418ke.isSelected();
        boolean z = awS118S0110000_32.z1;
        if (zIsSelected != z) {
            c21373418ke.setSelected(z);
        }
        C786410Ut5.kb(c21373418ke, new ACListenerS134S0200000_32(c21373418ke, (Function0) awS118S0110000_32.l0, 20));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        return Boolean.valueOf(((FcpPageNode) obj).isPageMatch((FcpPageInfo) awS118S0110000_32.l0, awS118S0110000_32.z1));
    }

    public static final Object invoke$17(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        DisableChatUnder16Resp disableChatUnder16Resp = (DisableChatUnder16Resp) obj;
        C21511719Gp c21511719Gp = C21511719Gp.LIZ;
        Keva keva = (Keva) awS118S0110000_32.l0;
        boolean z = awS118S0110000_32.z1;
        c21511719Gp.getClass();
        if (disableChatUnder16Resp != null) {
            keva.storeBoolean("is_u16_fetched", true);
            keva.storeBoolean(C21511719Gp.LIZ(), disableChatUnder16Resp.isChatFucOffLine);
            if (!C287690BPj.LIZ()) {
                C21511719Gp.LIZJ(keva, z);
            }
            C1440005kM.LIZ(new IEvent() { // from class: X.0Yo1
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("disable chat config saved ");
            sbLIZ.append(disableChatUnder16Resp.isChatFucOffLine);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C21511719Gp.LIZIZ = true;
        CopyOnWriteArrayList<InterfaceC21512019Gs> copyOnWriteArrayList = C21511719Gp.LJ.get(C461720I8s.LIZIZ());
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC21512019Gs> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
        Iterator<Function0<Unit>> it3 = C21511719Gp.LIZLLL.iterator();
        while (it3.hasNext()) {
            it3.next().invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        List<User> list;
        C190I c190i = (C190I) obj;
        boolean z = awS118S0110000_32.z1;
        List list2 = (List) awS118S0110000_32.l0;
        if (list2 != null && !list2.isEmpty()) {
            list = (List) awS118S0110000_32.l0;
        } else {
            list = c190i.LIZLLL;
        }
        return C190I.LJII(c190i, z, list, 3);
    }

    public static final Object invoke$3(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        List<User> collabUserList;
        C190I c190i = (C190I) obj;
        boolean z = awS118S0110000_32.z1;
        if (z) {
            collabUserList = ((C214693190h) awS118S0110000_32.l0).P4().creativeModel.collabInfoModel.getCollabUserList();
        } else {
            collabUserList = c190i.LIZLLL;
        }
        return C190I.LJII(c190i, z, collabUserList, 3);
    }

    public static final Object invoke$4(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        boolean z;
        C190Z c190z = (C190Z) obj;
        boolean z2 = awS118S0110000_32.z1;
        if (z2) {
            z = ((C214720191i) awS118S0110000_32.l0).LLJILJIL;
        } else {
            z = false;
        }
        return C190Z.LJFF(c190z, 0, z2, false, null, z, 381);
    }

    public static final Object invoke$5(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        boolean z;
        C190Z c190z = (C190Z) obj;
        if (((C214720191i) awS118S0110000_32.l0).T2().LIZIZ) {
            z = awS118S0110000_32.z1;
        } else {
            z = false;
        }
        return C190Z.LJFF(c190z, 0, false, false, null, z, 383);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        C10J3 c10j3;
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (awS118S0110000_32.z1) {
            c10j3 = C10K1.LIZ;
        } else {
            c10j3 = AnonymousClass1937.LIZ;
        }
        C19224510Ix c19224510Ix = new C19224510Ix(c1drg, c10j3);
        ((C559610Lx9) awS118S0110000_32.l0).getClass();
        C559610Lx9.LIZ(c19224510Ix);
        c19224510Ix.afterInit$als_release(jUptimeMillis);
        return c19224510Ix;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        C10J3 c10j3;
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (awS118S0110000_32.z1) {
            c10j3 = C10K3.LIZ;
        } else {
            c10j3 = AnonymousClass1937.LIZ;
        }
        C19224310Iv c19224310Iv = new C19224310Iv(c1drg, c10j3);
        ((C559610Lx9) awS118S0110000_32.l0).getClass();
        C559610Lx9.LIZ(c19224310Iv);
        c19224310Iv.afterInit$als_release(jUptimeMillis);
        return c19224310Iv;
    }

    public static final Object invoke$8(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        if (!awS118S0110000_32.z1) {
            fFloatValue = 1.0f - fFloatValue;
        }
        ((C196Y) awS118S0110000_32.l0).U1(fFloatValue, 1.0f - fFloatValue);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS118S0110000_32 awS118S0110000_32, Object obj) {
        boolean z;
        InterfaceC721300SRc c21389518nF;
        AnonymousClass1993 anonymousClass1993 = (AnonymousClass1993) obj;
        InterfaceC21392018ne interfaceC21392018ne = (InterfaceC21392018ne) awS118S0110000_32.l0;
        boolean z2 = false;
        if (interfaceC21392018ne != null) {
            anonymousClass1993.LIZJ = interfaceC21392018ne;
            anonymousClass1993.LJIIJ = true;
            StoryInboxAvatarMorphConfig storyInboxAvatarMorphConfig = (StoryInboxAvatarMorphConfig) C309130C9v.LIZ.getValue();
            if (storyInboxAvatarMorphConfig != null) {
                z2 = storyInboxAvatarMorphConfig.translucent;
            }
            anonymousClass1993.LIZLLL = z2;
        } else if (C707060RoO.LIZIZ().animationType == 3) {
            anonymousClass1993.LJJ = 1;
            anonymousClass1993.LJJI = 1;
            anonymousClass1993.LJIIJ = true;
        } else {
            C01GW c01gw = C103100aD.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    c21389518nF = new C21389418nE();
                } else {
                    c21389518nF = new C21389518nF(awS118S0110000_32.z1);
                }
                anonymousClass1993.LIZJ = c21389518nF;
                anonymousClass1993.LJIIJ = true;
            } else if (((Number) c01gw.getValue()).intValue() == 3) {
                if (Build.VERSION.SDK_INT >= 29) {
                    anonymousClass1993.LIZJ = new InterfaceC21392018ne() { // from class: X.18nD
                        @Override // X.InterfaceC21392018ne
                        public final Animator LIZ(View view, View view2) {
                            int iIntValue;
                            Pair<C21390118nL, C21390118nL> pairLIZIZ = C21389218nC.LIZIZ(view);
                            if (pairLIZIZ == null) {
                                return C21389218nC.LIZJ(view);
                            }
                            C21390118nL first = pairLIZIZ.getFirst();
                            C21390118nL second = pairLIZIZ.getSecond();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, first.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = -16777216;
                            }
                            ColorDrawable colorDrawable = new ColorDrawable(iIntValue);
                            colorDrawable.setAlpha(76);
                            first.setBackground(colorDrawable);
                            final float width = second.getWidth() / 2.0f;
                            final float height = second.getHeight() / 2.0f;
                            Interpolator interpolatorLIZIZ = C0GY9.LIZIZ(0.7f, 0.0f, 1.0f, 1.0f);
                            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(C294650Bgl.LIZ());
                            valueAnimatorOfFloat.setInterpolator(interpolatorLIZIZ);
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat2.setDuration(150L);
                            valueAnimatorOfFloat2.setInterpolator(interpolatorLIZIZ);
                            C786410Ut5.S5(second, 1.0f);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(second, (Property<C21390118nL, Float>) View.ALPHA, 1.0f, 0.0f);
                            objectAnimatorOfFloat.setDuration(C289430BWb.LIZ());
                            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                            second.setRenderNodeDriver(new InterfaceC21389118nB() { // from class: X.18n6
                                @Override // X.InterfaceC21389118nB
                                public final void LIZ(RenderNode renderNode) {
                                    float animatedFraction = 1.0f + ((-1.0f) * valueAnimatorOfFloat.getAnimatedFraction());
                                    renderNode.setPivotX(width);
                                    renderNode.setPivotY(height);
                                    renderNode.setScaleX(animatedFraction);
                                    renderNode.setScaleY(animatedFraction);
                                }
                            });
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(second, 23));
                            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS159S0300000_32(valueAnimatorOfFloat2, colorDrawable, first, 3));
                            valueAnimatorOfFloat.addListener(new AAListenerS10S0100002_32(second, width, height, 0));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, objectAnimatorOfFloat);
                            animatorSet.addListener(new AAListenerS265S0200000_13(view, second, 2));
                            return animatorSet;
                        }

                        @Override // X.InterfaceC21392018ne
                        public final Animator LIZIZ(View view, View view2) {
                            return C21389218nC.LIZ(view2);
                        }
                    };
                    anonymousClass1993.LJIIJ = false;
                } else {
                    anonymousClass1993.LIZJ = new C21389518nF(awS118S0110000_32.z1);
                    anonymousClass1993.LJIIJ = true;
                }
            } else if (((Number) c01gw.getValue()).intValue() == 2) {
                anonymousClass1993.LIZJ = new C21389518nF(awS118S0110000_32.z1);
                anonymousClass1993.LJIIJ = true;
            } else {
                final boolean z3 = awS118S0110000_32.z1;
                anonymousClass1993.LIZJ = new InterfaceC21392018ne() { // from class: X.18nH
                    @Override // X.InterfaceC21392018ne
                    public final Animator LIZ(View view, View view2) {
                        List listLIZ;
                        if (z3) {
                            return C21389618nG.LIZLLL(view, new InterpolatorC448120Hhi(4.0f));
                        }
                        try {
                            listLIZ = C21389618nG.LIZ(view);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            listLIZ = C13BV.INSTANCE;
                        }
                        if (!(!listLIZ.isEmpty())) {
                            return C21389618nG.LIZLLL(view, new InterpolatorC448120Hhi(4.0f));
                        }
                        return ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(C294650Bgl.LIZ());
                    }

                    @Override // X.InterfaceC21392018ne
                    public final Animator LIZIZ(View view, View view2) {
                        return C21389618nG.LJI(view2, z3);
                    }
                };
                anonymousClass1993.LJIIJ = true;
            }
        }
        anonymousClass1993.LJIIIZ = true;
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS118S0110000_32(X.C214720191i r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 4 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS118S0110000_32.<init>(X.191i, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(AbstractC813200VvC abstractC813200VvC, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC813200VvC;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(InterfaceC21392018ne interfaceC21392018ne, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC21392018ne;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(AnonymousClass1920 anonymousClass1920, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = anonymousClass1920;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(C196Y c196y, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c196y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(Keva keva, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keva;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(FcpPageInfo fcpPageInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = fcpPageInfo;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(Function0 function0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(boolean z, C214693190h c214693190h, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c214693190h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S0110000_32(boolean z, boolean z2, List<? extends User> list) {
        super(1);
        this.$t = list;
        this.z1 = z;
        this.l0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S0110000_32(boolean z, boolean z2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0110000_32(C0ET4 c0et4, C559610Lx9 c559610Lx9, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.z1 = z;
    }
}
