package kotlin.jvm.internal;

import X.AbstractC1556970qcR;
import X.AbstractC1581290rFf;
import X.AnonymousClass0764;
import X.C05P0;
import X.C09AY;
import X.C09DL;
import X.C0AAV;
import X.C0S4U;
import X.C1388190mED;
import X.C13IQ;
import X.C1554610qYd;
import X.C1556990qcT;
import X.C1564880qpC;
import X.C1570120qxe;
import X.C1580100rDk;
import X.C1587030rOv;
import X.C1587090rP1;
import X.C1589640rT8;
import X.C1594190raT;
import X.C1594200raU;
import X.C1598180rgu;
import X.C1606640ruY;
import X.C1607880rwY;
import X.C1607890rwZ;
import X.C1608210rx5;
import X.C1609260rym;
import X.C1609600rzK;
import X.C1609610rzL;
import X.C1612700s4K;
import X.C1674100tfM;
import X.C1906570ziJ;
import X.C19BN;
import X.C19EG;
import X.C21660019pm;
import X.C2188811AlT;
import X.C296370BjX;
import X.C709070Rrd;
import X.C786410Ut5;
import X.EnumC1586970rOp;
import X.EnumC1612690s4J;
import X.EnumC19364510pP;
import X.InterfaceC1571310qzZ;
import X.InterfaceC1581320rFi;
import X.InterfaceC21392018ne;
import X.InterfaceC665370Q7z;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.router.RouteIntent;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import com.ss.android.ugc.aweme.detail.route.DetailRouterInterceptor;
import com.ss.android.ugc.aweme.detail.ui.saf.WithoutShellDetailSafRootFragment;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.assem.FriendsTabProtocolAssem;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3SkylightBridgeAssem;
import com.ss.android.ugc.aweme.im.common.experiment.IMChatToDetailSafConfig;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS268S0300000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS268S0300000_24 awS268S0300000_24) {
        C19EG c19egLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        List listLIZIZ;
        ViewGroup viewGroup;
        C786410Ut5.LJJJJI((ViewGroup) awS268S0300000_24.l0);
        List<View> list = (List) awS268S0300000_24.l1;
        ViewGroup viewGroup2 = (ViewGroup) awS268S0300000_24.l0;
        for (View view : list) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                }
            }
            C786410Ut5.T4(view, 0.0f);
            viewGroup2.addView(view);
        }
        Iterator<InterfaceC1571310qzZ> it2 = ((C1580100rDk) awS268S0300000_24.l2).LJIILIIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        Context context = ((ViewGroup) awS268S0300000_24.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            ViewGroup viewGroup3 = (ViewGroup) awS268S0300000_24.l0;
            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ);
            if (mainActivityScopeLIZJ != null && (interfaceC665370Q7z = mainActivityScopeLIZJ.LL) != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, TabIconCustomLayoutProtocol.class, false)) != null) {
                Iterator it3 = listLIZIZ.iterator();
                while (it3.hasNext()) {
                    ((TabIconCustomLayoutProtocol) it3.next()).WT0(viewGroup3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS268S0300000_24 awS268S0300000_24) {
        Bundle animationBundle;
        final boolean z;
        final boolean z2;
        WithoutShellDetailSafRootFragment withoutShellDetailSafRootFragment = new WithoutShellDetailSafRootFragment();
        RouteIntent routeIntent = (RouteIntent) awS268S0300000_24.l0;
        DetailRouterInterceptor detailRouterInterceptor = (DetailRouterInterceptor) awS268S0300000_24.l1;
        Bundle bundle = (Bundle) awS268S0300000_24.l2;
        if (routeIntent != null) {
            animationBundle = routeIntent.getAnimationBundle();
        } else {
            animationBundle = null;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (animationBundle != null) {
            final int i = animationBundle.getInt("android:activity.animHeight");
            final int i2 = animationBundle.getInt("android:activity.animWidth");
            final int i3 = animationBundle.getInt("android:activity.animStartX");
            final int i4 = animationBundle.getInt("android:activity.animStartY");
            int i5 = animationBundle.getInt("android:activity.animType");
            if (i5 != 2) {
                if (i5 != 11) {
                    C1607880rwY c1607880rwYLJ = C1607890rwZ.LJ(false, null, false, 7);
                    detailRouterInterceptor.getClass();
                    DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, c1607880rwYLJ);
                    return withoutShellDetailSafRootFragment;
                }
                if ((((Number) C0AAV.LIZ.getValue()).intValue() & 2) == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC21392018ne interfaceC21392018ne = new InterfaceC21392018ne() { // from class: X.0rwa
                    @Override // X.InterfaceC21392018ne
                    public final Animator LIZ(View view, View view2) {
                        if (((Boolean) C0B5K.LIZ.getValue()).booleanValue()) {
                            int i6 = i3 + (i2 / 2);
                            int i7 = i4 + (i / 2);
                            float width = view.getWidth();
                            float height = view.getHeight();
                            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i6, i7, (float) Math.sqrt((width * width) + (height * height)), 0.0f);
                            animatorCreateCircularReveal.setDuration(view.getContext().getResources().getInteger(R.integer.b0));
                            animatorCreateCircularReveal.setInterpolator(C1619980sG4.LJIIIZ());
                            return animatorCreateCircularReveal;
                        }
                        return C1607890rwZ.LJFF(view, view2, null, false);
                    }

                    @Override // X.InterfaceC21392018ne
                    public final Animator LIZIZ(View view, View view2) {
                        Animator animatorLIZIZ;
                        int i6 = i3;
                        int i7 = i4;
                        int i8 = i2;
                        int i9 = i;
                        boolean z5 = z2;
                        long integer = view2.getContext().getResources().getInteger(R.integer.b0);
                        if (z5) {
                            try {
                                animatorLIZIZ = C1607890rwZ.LIZIZ(view2, i6, i7, i8, i9, integer);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                animatorLIZIZ = null;
                            }
                            if (animatorLIZIZ != null) {
                                return animatorLIZIZ;
                            }
                        }
                        float width = view2.getWidth();
                        float height = view2.getHeight();
                        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, (i8 / 2) + i6, (i9 / 2) + i7, 0.0f, (float) Math.sqrt((width * width) + (height * height)));
                        animatorCreateCircularReveal.setDuration(integer);
                        animatorCreateCircularReveal.setInterpolator(C1619980sG4.LIZJ());
                        return animatorCreateCircularReveal;
                    }
                };
                detailRouterInterceptor.getClass();
                DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, interfaceC21392018ne);
                return withoutShellDetailSafRootFragment;
            }
            if (bundle.getBoolean("im_chat_to_detail_saf", false)) {
                C1606640ruY c1606640ruY = C1606640ruY.LIZ;
                c1606640ruY.getClass();
                IMChatToDetailSafConfig iMChatToDetailSafConfigLIZ = C1606640ruY.LIZ();
                c1606640ruY.getClass();
                if (C1606640ruY.LIZ().animStartFrom == 1) {
                    z4 = true;
                }
                if (iMChatToDetailSafConfigLIZ.exitAnim == 2) {
                    boolean z5 = iMChatToDetailSafConfigLIZ.animFadeIn;
                    bundle.putBoolean("im_detail_exit_anchor_present", true);
                    bundle.putInt("im_detail_exit_anchor_start_x", i3);
                    bundle.putInt("im_detail_exit_anchor_start_y", i4);
                    bundle.putInt("im_detail_exit_anchor_width", i2);
                    bundle.putInt("im_detail_exit_anchor_height", i);
                    bundle.putBoolean("im_detail_exit_anchor_with_alpha", z5);
                    bundle.putBoolean("im_detail_exit_anchor_center_origin", z4);
                }
                if (z4) {
                    final boolean z6 = iMChatToDetailSafConfigLIZ.animFadeIn;
                    final int i6 = iMChatToDetailSafConfigLIZ.exitAnim;
                    InterfaceC21392018ne interfaceC21392018ne2 = new InterfaceC21392018ne() { // from class: X.0rwS
                        @Override // X.InterfaceC21392018ne
                        public final Animator LIZ(View view, View view2) {
                            return C1607800rwQ.LIZ(i6, view, view2, view.getWidth() / 2, view.getHeight() / 2, 0, 0, z6);
                        }

                        @Override // X.InterfaceC21392018ne
                        public final Animator LIZIZ(View view, View view2) {
                            return C1607840rwU.LIZ(view2.getWidth() / 2, view2.getHeight() / 2, 0, 0, view2, z6);
                        }
                    };
                    detailRouterInterceptor.getClass();
                    DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, interfaceC21392018ne2);
                    return withoutShellDetailSafRootFragment;
                }
                final boolean z7 = iMChatToDetailSafConfigLIZ.animFadeIn;
                final int i7 = iMChatToDetailSafConfigLIZ.exitAnim;
                InterfaceC21392018ne interfaceC21392018ne3 = new InterfaceC21392018ne() { // from class: X.0rwT
                    @Override // X.InterfaceC21392018ne
                    public final Animator LIZ(View view, View view2) {
                        return C1607800rwQ.LIZ(i7, view, view2, i3, i4, i2, i, z7);
                    }

                    @Override // X.InterfaceC21392018ne
                    public final Animator LIZIZ(View view, View view2) {
                        return C1607840rwU.LIZ(i3, i4, i2, i, view2, z7);
                    }
                };
                detailRouterInterceptor.getClass();
                DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, interfaceC21392018ne3);
                return withoutShellDetailSafRootFragment;
            }
            if ((((Number) C0AAV.LIZ.getValue()).intValue() & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC21392018ne interfaceC21392018ne4 = new InterfaceC21392018ne(i3, i4, i2, i, z) { // from class: X.0Gis
                public final /* synthetic */ int LIZ;
                public final /* synthetic */ int LIZIZ;
                public final /* synthetic */ int LIZJ;
                public final /* synthetic */ boolean LIZLLL;

                @Override // X.InterfaceC21392018ne
                public final Animator LIZ(View view, View view2) {
                    return C1607890rwZ.LJFF(view, view2, null, false);
                }

                @Override // X.InterfaceC21392018ne
                public final Animator LIZIZ(View view, View view2) {
                    float width;
                    Animator animatorLIZJ;
                    int i8 = this.LIZ;
                    int i9 = this.LIZIZ;
                    int i10 = this.LIZJ;
                    boolean z8 = this.LIZLLL;
                    if (view2.getWidth() != 0) {
                        width = i10 / view2.getWidth();
                    } else {
                        width = 0.0f;
                    }
                    long integer = view2.getContext().getResources().getInteger(R.integer.b0);
                    if (z8) {
                        try {
                            animatorLIZJ = C1607890rwZ.LIZJ(view2, i8, i9, width, integer);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            animatorLIZJ = null;
                        }
                        if (animatorLIZJ != null) {
                            return animatorLIZJ;
                        }
                    }
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, width, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, width, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(C13LP.LLIIII(listLJIILJJIL));
                    view2.setPivotX(i8);
                    view2.setPivotY(i9);
                    animatorSet.setDuration(integer);
                    animatorSet.setInterpolator(C1619980sG4.LJIIIZ());
                    return animatorSet;
                }

                {
                    this.LIZLLL = z;
                }
            };
            detailRouterInterceptor.getClass();
            DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, interfaceC21392018ne4);
            return withoutShellDetailSafRootFragment;
        }
        boolean zLJFF = Intrinsics.LJFF(bundle.getString("video_from"), "from_offline_mode");
        boolean z8 = bundle.getBoolean("from_explore_video_cell", false);
        if (((Number) AnonymousClass0764.LIZ.getValue()).intValue() != 1) {
            z3 = false;
        }
        if (zLJFF) {
            InterfaceC21392018ne interfaceC21392018ne5 = new InterfaceC21392018ne() { // from class: X.0rwP
                @Override // X.InterfaceC21392018ne
                public final Animator LIZ(View view, View view2) {
                    return C1607890rwZ.LJ(false, null, false, 7).LIZ(view, view2);
                }

                @Override // X.InterfaceC21392018ne
                public final Animator LIZIZ(View view, View view2) {
                    C786410Ut5.Jc(view, 0.0f);
                    C786410Ut5.Jc(view2, 0.0f);
                    return ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(0L);
                }
            };
            detailRouterInterceptor.getClass();
            DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, interfaceC21392018ne5);
            return withoutShellDetailSafRootFragment;
        }
        if (z8) {
            C1607880rwY c1607880rwYLJ2 = C1607890rwZ.LJ(z3, null, false, 6);
            detailRouterInterceptor.getClass();
            DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, c1607880rwYLJ2);
            return withoutShellDetailSafRootFragment;
        }
        C1607880rwY c1607880rwYLJ3 = C1607890rwZ.LJ(false, null, false, 7);
        detailRouterInterceptor.getClass();
        DetailRouterInterceptor.LIZ(withoutShellDetailSafRootFragment, c1607880rwYLJ3);
        return withoutShellDetailSafRootFragment;
    }

    public static final Object invoke$10(AwS268S0300000_24 awS268S0300000_24) {
        FriendsV3SkylightBridgeAssem friendsV3SkylightBridgeAssem = (FriendsV3SkylightBridgeAssem) awS268S0300000_24.l0;
        friendsV3SkylightBridgeAssem.LLJJIII = false;
        ((View) friendsV3SkylightBridgeAssem.LLJILJIL.getValue()).setOnTouchListener(null);
        ((AbstractC1581290rFf) awS268S0300000_24.l2).LIZ((InterfaceC1581320rFi) ((FriendsV3SkylightBridgeAssem) awS268S0300000_24.l0).LLJJJJJIL.getValue());
        Function0 function0 = (Function0) awS268S0300000_24.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS268S0300000_24 awS268S0300000_24) {
        FriendsV3SkylightBridgeAssem friendsV3SkylightBridgeAssem = (FriendsV3SkylightBridgeAssem) awS268S0300000_24.l0;
        friendsV3SkylightBridgeAssem.LLJJIII = true;
        ((View) friendsV3SkylightBridgeAssem.LLJILJIL.getValue()).setOnTouchListener(new View.OnTouchListener() { // from class: X.0rFj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        ((AbstractC1581290rFf) awS268S0300000_24.l2).LIZIZ((InterfaceC1581320rFi) ((FriendsV3SkylightBridgeAssem) awS268S0300000_24.l0).LLJJJJJIL.getValue());
        Function0 function0 = (Function0) awS268S0300000_24.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS268S0300000_24 r14) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS268S0300000_24.invoke$12(kotlin.jvm.internal.AwS268S0300000_24):java.lang.Object");
    }

    public static final Object invoke$13(AwS268S0300000_24 awS268S0300000_24) {
        ((C09DL) awS268S0300000_24.l0).LJIILLIIL("storyItem");
        TypeAdapter typeAdapter = (TypeAdapter) awS268S0300000_24.l1;
        if (typeAdapter != null) {
            typeAdapter.write((C09DL) awS268S0300000_24.l0, (StoryInboxItem) awS268S0300000_24.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS268S0300000_24 awS268S0300000_24) {
        ((C09DL) awS268S0300000_24.l0).LJIILLIIL("liveItem");
        TypeAdapter typeAdapter = (TypeAdapter) awS268S0300000_24.l1;
        if (typeAdapter != null) {
            typeAdapter.write((C09DL) awS268S0300000_24.l0, (C1598180rgu) awS268S0300000_24.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS268S0300000_24 awS268S0300000_24) {
        if (((LifecycleOwner) awS268S0300000_24.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            ((C1608210rx5) awS268S0300000_24.l1).getValue();
        }
        Lifecycle lifecycle = ((LifecycleOwner) awS268S0300000_24.l0).getLifecycle();
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) awS268S0300000_24.l0;
        final C1608210rx5 c1608210rx5 = (C1608210rx5) awS268S0300000_24.l1;
        final Exception exc = (Exception) awS268S0300000_24.l2;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: knit.provider.VScopeStubImpl$addCheckLifecycleObserver$action$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) throws Exception {
                if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    try {
                        c1608210rx5.getValue();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Exception exc2 = new Exception(th);
                        exc2.setStackTrace(exc.getStackTrace());
                        throw exc2;
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS268S0300000_24 awS268S0300000_24) {
        int newContentCountForDisplay;
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.l2()) {
            ((C1587030rOv) awS268S0300000_24.l0).LJJIJ();
        } else {
            NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse = ((NewContentResponse) awS268S0300000_24.l1).getFriendsFeedResponse();
            int newContentCountForDisplay2 = 0;
            if (friendsFeedResponse != null && friendsFeedResponse.getNewContentCountForDisplay() > 0) {
                if (C296370BjX.LIZ()) {
                    if (!c1589640rT8.C2()) {
                        C1587030rOv c1587030rOv = (C1587030rOv) awS268S0300000_24.l0;
                        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2 = ((NewContentResponse) awS268S0300000_24.l1).getFriendsFeedResponse();
                        if (friendsFeedResponse2 != null) {
                            newContentCountForDisplay2 = friendsFeedResponse2.getNewContentCountForDisplay();
                        }
                        c1587030rOv.LJJIJIIJI("", newContentCountForDisplay2, (EnumC1586970rOp) awS268S0300000_24.l2);
                    } else {
                        ((C1587030rOv) awS268S0300000_24.l0).LJJIJ();
                        ((C1587030rOv) awS268S0300000_24.l0).LJJIJIIJIL((EnumC1586970rOp) awS268S0300000_24.l2);
                    }
                } else if (c1589640rT8.W2()) {
                    ((C1587030rOv) awS268S0300000_24.l0).LJJIJ();
                    ((C1587030rOv) awS268S0300000_24.l0).LJJIJIIJIL((EnumC1586970rOp) awS268S0300000_24.l2);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSuccess, onNumberDotUpdate,count:");
                    NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse3 = ((NewContentResponse) awS268S0300000_24.l1).getFriendsFeedResponse();
                    if (friendsFeedResponse3 != null) {
                        newContentCountForDisplay = friendsFeedResponse3.getNewContentCountForDisplay();
                    } else {
                        newContentCountForDisplay = 0;
                    }
                    sbLIZ.append(newContentCountForDisplay);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1587030rOv c1587030rOv2 = (C1587030rOv) awS268S0300000_24.l0;
                    NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse4 = ((NewContentResponse) awS268S0300000_24.l1).getFriendsFeedResponse();
                    if (friendsFeedResponse4 != null) {
                        newContentCountForDisplay2 = friendsFeedResponse4.getNewContentCountForDisplay();
                    }
                    c1587030rOv2.LJJIJIIJI("", newContentCountForDisplay2, (EnumC1586970rOp) awS268S0300000_24.l2);
                }
            } else {
                ((C1587030rOv) awS268S0300000_24.l0).LJJIJ();
                ((C1587030rOv) awS268S0300000_24.l0).LJJIJIIJIL((EnumC1586970rOp) awS268S0300000_24.l2);
            }
            C1587030rOv c1587030rOv3 = (C1587030rOv) awS268S0300000_24.l0;
            NewContentResponse newContentResponse = (NewContentResponse) awS268S0300000_24.l1;
            EnumC1586970rOp enumC1586970rOp = (EnumC1586970rOp) awS268S0300000_24.l2;
            c1587030rOv3.getClass();
            BaseRedDotImpl.LJJIIJ(newContentResponse, enumC1586970rOp);
            super/*com.ss.android.ugc.aweme.dot.BaseRedDotImpl*/.LJIIJ((NewContentResponse) awS268S0300000_24.l1, (EnumC1586970rOp) awS268S0300000_24.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS268S0300000_24 awS268S0300000_24) {
        Object next;
        Iterator it2 = ((List) awS268S0300000_24.l0).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1587090rP1) next).LIZ, "FRIENDS_FEED")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1587090rP1 c1587090rP1 = (C1587090rP1) next;
        if (c1587090rP1 != null) {
            ((C1587030rOv) awS268S0300000_24.l1).LJJIIZ((Aweme) awS268S0300000_24.l2);
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            if (!c1589640rT8.l2()) {
                if (c1589640rT8.W2()) {
                    ((C1587030rOv) awS268S0300000_24.l1).LJJIJ();
                } else {
                    ((C1587030rOv) awS268S0300000_24.l1).LJJIJIIJI("onFriendsFeedRedDotMinus", BaseRedDotImpl.LJJI(c1587090rP1.LIZIZ, ((C1587030rOv) awS268S0300000_24.l1).LLIZ.numberCount, c1587090rP1.LIZJ), null);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS268S0300000_24 awS268S0300000_24) {
        ((PaidContentVideoPanel) awS268S0300000_24.l0).U1((C1612700s4K) awS268S0300000_24.l1, (EnumC1612690s4J) awS268S0300000_24.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS268S0300000_24 awS268S0300000_24) {
        ((PaidContentVideoPanel) awS268S0300000_24.l0).U1((C1612700s4K) awS268S0300000_24.l1, (EnumC1612690s4J) awS268S0300000_24.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS268S0300000_24 awS268S0300000_24) {
        int i;
        LayoutInflater layoutInflater = (LayoutInflater) awS268S0300000_24.l0;
        ((InboxFragmentV2) awS268S0300000_24.l1).getClass();
        if (C1609260rym.LIZ()) {
            i = R.layout.a9_;
        } else {
            i = R.layout.a95;
        }
        return C1906570ziJ.LIZ(layoutInflater, i, (ViewGroup) awS268S0300000_24.l2, false, 16);
    }

    public static final Object invoke$20(AwS268S0300000_24 awS268S0300000_24) {
        ((Function1) awS268S0300000_24.l0).invoke(C1674100tfM.LIZIZ((C05P0) awS268S0300000_24.l2));
        ((Function1) awS268S0300000_24.l1).invoke(new C1556990qcT(C1674100tfM.LIZIZ((C05P0) awS268S0300000_24.l2)));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS268S0300000_24 r7) {
        /*
            java.lang.Object r6 = r7.l0
            com.ss.android.ugc.aweme.profile.model.User r6 = (com.ss.android.ugc.aweme.profile.model.User) r6
            java.lang.Object r5 = r7.l1
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.ss.android.ugc.aweme.profile.model.User) r5
            com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct r0 = r6.getSocialAvatarWithoutBackground()
            r4 = 0
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.avatarLarger
        L11:
            com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct r0 = r5.getSocialAvatarWithoutBackground()
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.avatarLarger
        L19:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo r0 = X.C1245160iVW.LIZIZ(r6)
            if (r0 == 0) goto L66
            java.lang.Integer r1 = r0.socialAvatarBackgroundTag
        L29:
            com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo r0 = X.C1245160iVW.LIZIZ(r5)
            if (r0 == 0) goto L31
            java.lang.Integer r4 = r0.socialAvatarBackgroundTag
        L31:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 != 0) goto L57
        L37:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            boolean r0 = X.C1245160iVW.LIZ(r0)
            if (r0 != 0) goto L5a
            java.lang.Object r0 = r7.l2
            X.0rzK r0 = (X.C1609600rzK) r0
            r0.LJIJ(r2)
        L48:
            java.lang.Object r2 = r7.l2
            X.0rzK r2 = (X.C1609600rzK) r2
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r2.LJIIIZ(r1, r0)
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5a:
            java.lang.Object r1 = r7.l2
            X.0rzK r1 = (X.C1609600rzK) r1
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r1.LJ(r0, r3, r3)
            goto L48
        L66:
            r1 = r4
            goto L29
        L68:
            r0 = r4
            goto L19
        L6a:
            r1 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS268S0300000_24.invoke$21(kotlin.jvm.internal.AwS268S0300000_24):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$22(kotlin.jvm.internal.AwS268S0300000_24 r9) {
        /*
            java.lang.Object r0 = r9.l0
            X.0rzL r0 = (X.C1609610rzL) r0
            com.ss.android.ugc.aweme.avatar.AvatarComponentView r0 = r0.LJIIIIZZ
            X.0rxx r0 = r0.getConfig()
            X.0rz0 r0 = r0.LIZ
            boolean r0 = r0.LJIILLIIL
            r7 = 1
            if (r0 == 0) goto L69
            java.lang.Object r8 = r9.l0
            X.0rzL r8 = (X.C1609610rzL) r8
            java.lang.Object r1 = r9.l1
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            java.lang.Object r6 = r9.l2
            com.ss.android.ugc.aweme.profile.model.User r6 = (com.ss.android.ugc.aweme.profile.model.User) r6
            r8.getClass()
            boolean r0 = X.C1609680rzS.LIZ(r6, r1)
            r5 = 0
            if (r0 != 0) goto L81
            if (r1 != r6) goto L61
            com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo r0 = X.C035F.LIZ(r6)
            if (r0 == 0) goto L66
            java.lang.Integer r4 = r0.avatarChoice
            if (r4 == 0) goto L67
            int r0 = r4.intValue()
            if (r0 != 0) goto L67
            r3 = 1
        L3a:
            X.0rzK r2 = r8.LJIIIZ
            if (r2 == 0) goto L64
            boolean r0 = r2.LJIJI
            if (r0 != r7) goto L64
            r1 = 1
        L43:
            boolean r0 = r8.LJIIJ
            if (r3 == 0) goto L50
            if (r1 != 0) goto L4b
            if (r0 != 0) goto L50
        L4b:
            if (r2 == 0) goto L50
            r2.LJIJ(r7)
        L50:
            if (r4 == 0) goto L81
            int r0 = r4.intValue()
            if (r0 != r7) goto L81
            if (r1 != 0) goto L61
            X.0rzK r0 = r8.LJIIIZ
            if (r0 == 0) goto L61
            r0.LJ(r6, r7, r5)
        L61:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L64:
            r1 = 0
            goto L43
        L66:
            r4 = 0
        L67:
            r3 = 0
            goto L3a
        L69:
            java.lang.Object r2 = r9.l0
            X.0rzL r2 = (X.C1609610rzL) r2
            java.lang.Object r1 = r9.l1
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r2.getClass()
            boolean r0 = X.C1609680rzS.LIZ(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L81
            goto L61
        L81:
            java.lang.Object r0 = r9.l0
            X.0rzL r0 = (X.C1609610rzL) r0
            X.0rzX r1 = r0.LJ
            X.0rzX r2 = r0.LJFF
            com.ss.android.ugc.aweme.avatar.AvatarComponentView r3 = r0.LJIIIIZZ
            java.lang.Object r4 = r9.l2
            com.ss.android.ugc.aweme.profile.model.User r4 = (com.ss.android.ugc.aweme.profile.model.User) r4
            X.0rxx r0 = r3.getConfig()
            X.0rz0 r0 = r0.LIZ
            boolean r6 = r0.LJIJI
            r5 = 0
            X.C1609660rzQ.LIZIZ(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r9.l0
            X.0rzL r2 = (X.C1609610rzL) r2
            java.lang.Object r1 = r9.l1
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            r2.LJIIIZ(r1, r0)
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS268S0300000_24.invoke$22(kotlin.jvm.internal.AwS268S0300000_24):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[PHI: r0
      0x0057: PHI (r0v5 android.view.View) = (r0v4 android.view.View), (r0v215 android.view.View) binds: [B:12:0x0044, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[PHI: r1
      0x00bd: PHI (r1v57 android.view.View) = (r1v56 android.view.View), (r1v60 android.view.View) binds: [B:35:0x00aa, B:40:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v92, types: [X.0rMx, X.0rjb] */
    /* JADX WARN: Type inference failed for: r0v93, types: [X.0rjZ, X.19sM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS268S0300000_24 r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS268S0300000_24.invoke$3(kotlin.jvm.internal.AwS268S0300000_24):java.lang.Object");
    }

    public static final Object invoke$4(AwS268S0300000_24 awS268S0300000_24) {
        C1570120qxe.LIZ((C19EG) awS268S0300000_24.l0).vQ2((ViewGroup) awS268S0300000_24.l2, (Fragment) awS268S0300000_24.l1, (C19EG) awS268S0300000_24.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS268S0300000_24 awS268S0300000_24) {
        ((Assembler) awS268S0300000_24.l0).vQ2((LifecycleOwner) awS268S0300000_24.l1, new AwS603S0100000_24((C13IQ) awS268S0300000_24.l2, (C13IQ<? extends BaseMainContainerAssem>) 131));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS268S0300000_24 awS268S0300000_24) {
        ((Assembler) awS268S0300000_24.l0).vQ2((LifecycleOwner) awS268S0300000_24.l1, new AwS603S0100000_24((C13IQ) awS268S0300000_24.l2, (C13IQ<? extends BaseMainContainerAssem>) 132));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS268S0300000_24 awS268S0300000_24) {
        C19BN c19bnLIZ = C1594190raT.LIZ((Fragment) awS268S0300000_24.l1, (C19EG) awS268S0300000_24.l0);
        if (c19bnLIZ == null) {
            FlexibleComponentCallback flexibleComponentCallback = (FlexibleComponentCallback) awS268S0300000_24.l2;
            if (flexibleComponentCallback == null) {
                return null;
            }
            return new C1594200raU(flexibleComponentCallback);
        }
        return c19bnLIZ;
    }

    public static final Object invoke$8(AwS268S0300000_24 awS268S0300000_24) {
        C19BN c19bnLIZ = C1594190raT.LIZ((Fragment) awS268S0300000_24.l1, (C19EG) awS268S0300000_24.l0);
        if (c19bnLIZ == null) {
            FlexibleComponentCallback flexibleComponentCallback = (FlexibleComponentCallback) awS268S0300000_24.l2;
            if (flexibleComponentCallback == null) {
                return null;
            }
            return new C1594200raU(flexibleComponentCallback);
        }
        return c19bnLIZ;
    }

    public static final Object invoke$9(AwS268S0300000_24 awS268S0300000_24) {
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch,scene=");
        sbLIZ.append(((EnumC19364510pP) awS268S0300000_24.l0).name());
        sbLIZ.append(",hasActivity=");
        boolean z3 = true;
        if (((C1564880qpC) awS268S0300000_24.l1).LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(",hasFragment=");
        if (((C1564880qpC) awS268S0300000_24.l1).LIZJ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(",hasFeedAbility=");
        if (((C1564880qpC) awS268S0300000_24.l1).LIZLLL == null) {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append(',');
        sbLIZ.append(((C21660019pm) awS268S0300000_24.l2).LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(C09DL c09dl, C09DL c09dl2, TypeAdapter<C1598180rgu> typeAdapter, C1598180rgu c1598180rgu) {
        super(0);
        this.$t = c1598180rgu;
        this.l0 = c09dl;
        this.l1 = c09dl2;
        this.l2 = typeAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(C09DL c09dl, C09DL c09dl2, TypeAdapter<StoryInboxItem> typeAdapter, StoryInboxItem storyInboxItem) {
        super(0);
        this.$t = storyInboxItem;
        this.l0 = c09dl;
        this.l1 = c09dl2;
        this.l2 = typeAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(C709070Rrd c709070Rrd, List list, C1580100rDk c1580100rDk, int i) {
        super(0);
        this.$t = i;
        this.l0 = c709070Rrd;
        this.l1 = list;
        this.l2 = c1580100rDk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(C1564880qpC c1564880qpC, C21660019pm c21660019pm, EnumC19364510pP enumC19364510pP, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC19364510pP;
        this.l1 = c1564880qpC;
        this.l2 = c21660019pm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(C1587030rOv c1587030rOv, NewContentResponse newContentResponse, EnumC1586970rOp enumC1586970rOp, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1587030rOv;
        this.l1 = newContentResponse;
        this.l2 = enumC1586970rOp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(C1609610rzL c1609610rzL, User user, User user2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1609610rzL;
        this.l1 = user;
        this.l2 = user2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(C19EG c19eg, Fragment fragment, FlexibleComponentCallback flexibleComponentCallback, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = fragment;
        this.l2 = flexibleComponentCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(LayoutInflater layoutInflater, ViewGroup viewGroup, InboxFragmentV2 inboxFragmentV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = layoutInflater;
        this.l1 = inboxFragmentV2;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(ViewGroup viewGroup, Fragment fragment, C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = fragment;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, C1608210rx5<T> c1608210rx5, Exception exc) {
        super(0);
        this.$t = exc;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.l2 = c1608210rx5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(Assembler assembler, Assembler assembler2, LifecycleOwner lifecycleOwner, C13IQ<? extends BaseMainContainerAssem> c13iq) {
        super(0);
        this.$t = c13iq;
        this.l0 = assembler;
        this.l1 = assembler2;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(RouteIntent routeIntent, DetailRouterInterceptor detailRouterInterceptor, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = routeIntent;
        this.l1 = detailRouterInterceptor;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(FriendsTabProtocolAssem friendsTabProtocolAssem, FriendsTabProtocolAssem friendsTabProtocolAssem2, List<SocialTopTabNode> list, List<SocialTopTabNode> list2) {
        super(0);
        this.$t = list2;
        this.l0 = friendsTabProtocolAssem;
        this.l1 = friendsTabProtocolAssem2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(FriendsV3SkylightBridgeAssem friendsV3SkylightBridgeAssem, FriendsV3SkylightBridgeAssem friendsV3SkylightBridgeAssem2, Function0<Unit> function0, AbstractC1581290rFf abstractC1581290rFf) {
        super(0);
        this.$t = abstractC1581290rFf;
        this.l0 = friendsV3SkylightBridgeAssem;
        this.l1 = friendsV3SkylightBridgeAssem2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(InboxFragmentV2 inboxFragmentV2, View view, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = inboxFragmentV2;
        this.l1 = view;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(User user, User user2, C1609600rzK c1609600rzK, int i) {
        super(0);
        this.$t = i;
        this.l0 = user;
        this.l1 = user2;
        this.l2 = c1609600rzK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS268S0300000_24(PaidContentVideoPanel paidContentVideoPanel, C1612700s4K c1612700s4K, EnumC1612690s4J enumC1612690s4J, int i) {
        super(0);
        this.$t = i;
        this.l0 = paidContentVideoPanel;
        this.l1 = c1612700s4K;
        this.l2 = enumC1612690s4J;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(List list, List<C1587090rP1> list2, C1587030rOv c1587030rOv, Aweme aweme) {
        super(0);
        this.$t = aweme;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c1587030rOv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS268S0300000_24(Function1 function1, Function1<? super PurchaseOptionWithPrice, Unit> function12, Function1<? super AbstractC1556970qcR, Unit> function13, C05P0<PurchaseOptionWithPrice> c05p0) {
        super(0);
        this.$t = c05p0;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = function13;
    }
}
