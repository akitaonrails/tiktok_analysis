package kotlin.jvm.internal;

import X.C09AY;
import X.C1558520qew;
import X.C19719512Dh;
import X.C2255108sX;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.discovery.ability.IDiscoverySectionVisibleAbility;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewsListAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AwS75S1300000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiDetailPermanentBottomBarAssem$onViewCreated$lambda$0$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, ContainerEventDispatcher$IPoiDetailVisibilityAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, ContainerEventDispatcher$IPoiDetailVisibilityAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBottomBarAssem$onViewCreated$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, ContainerEventDispatcher$PageScrollCallBackAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, ContainerEventDispatcher$PageScrollCallBackAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabAssem$onViewCreated$$inlined$loadAbility$default$3$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, PoiRecommendFeatureDetailTabEntityIdAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, PoiRecommendFeatureDetailTabEntityIdAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem$onViewCreated$$inlined$loadAbility$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, PoiReviewsListAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, PoiReviewsListAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailStatusAssem$onViewCreated$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, ContainerEventDispatcher$RefreshActionCallBackAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, ContainerEventDispatcher$RefreshActionCallBackAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3$loadAbility$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, IDiscoverySectionVisibleAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, IDiscoverySectionVisibleAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3$loadAbility$$inlined$loadAbility$default$3$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, IPoiDetailDiscoveryAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, IPoiDetailDiscoveryAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent$loadAbility$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, IPoiDetailNearbyAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, IPoiDetailNearbyAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsAssem$onViewCreated$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, IPoiReviewsAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, IPoiReviewsAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailWriteReviewAssem$onViewCreated$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, IPoiWriteReviewsAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, IPoiWriteReviewsAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.reviews.v2.PoiDetailWriteReviewAssemV2$onViewCreated$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, IPoiWriteReviewsAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, IPoiWriteReviewsAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS75S1300000_6 awS75S1300000_6) {
        Lifecycle lifecycle = ((LifecycleOwner) awS75S1300000_6.l1).getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS75S1300000_6.l2;
        final InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS75S1300000_6.l3;
        final String str = awS75S1300000_6.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabAssem$onViewCreated$$inlined$loadAbility$default$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                    InterfaceC494301wD interfaceC494301wD2 = interfaceC494301wD;
                    String str2 = str;
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z2, PoiRecommendFeatureDetailTabClickAbility.class, str2);
                    if (interfaceC494301wDLIZ != null) {
                        try {
                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                            if (invocationHandler instanceof C2255108sX) {
                                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(interfaceC494301wD2);
                                return;
                            }
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (Intrinsics.LJFF(interfaceC494301wDLIZ, interfaceC494301wD2)) {
                                C1558520qew.LJIIJJI(interfaceC665370Q7z2, PoiRecommendFeatureDetailTabClickAbility.class, str2);
                            }
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S1300000_6(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC494301wD interfaceC494301wD, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = lifecycleOwner;
        this.l2 = interfaceC665370Q7z;
        this.l3 = interfaceC494301wD;
        this.s0 = str;
    }
}
