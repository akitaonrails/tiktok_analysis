package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import X.AnonymousClass0716;
import X.C01GW;
import X.C070T;
import X.C0A5E;
import X.C0C0H;
import X.C0C64;
import X.C0CN5;
import X.C0CUL;
import X.C0DMM;
import X.C0J0B;
import X.C0J58;
import X.C0J5C;
import X.C0J5E;
import X.C0J5H;
import X.C0J5L;
import X.C0J5V;
import X.C0J5Z;
import X.C0J60;
import X.C0J65;
import X.C0J66;
import X.C0J6N;
import X.C0J6Q;
import X.C0J6R;
import X.C0J6S;
import X.C0J6T;
import X.C0J6U;
import X.C0J6V;
import X.C0J6W;
import X.C0J6X;
import X.C0J6Y;
import X.C0J6Z;
import X.C0J71;
import X.C0J8Q;
import X.C0JAM;
import X.C0JAU;
import X.C0PEM;
import X.C0S4U;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1561720qk6;
import X.C1581510rG1;
import X.C1585070rLl;
import X.C1591480rW6;
import X.C1593860rZw;
import X.C15O7;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C199Y;
import X.C19EG;
import X.C1AV2;
import X.C1AVH;
import X.C1C7U;
import X.C20441214yg;
import X.C20629915o1;
import X.C20684815ws;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C23250099c;
import X.C260020AGy;
import X.C285090BFj;
import X.C295430Bi1;
import X.C303200BuY;
import X.C304490Bwd;
import X.C341940Daq;
import X.C343780Ddo;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C468770IZv;
import X.C474920Ijq;
import X.C480270IsT;
import X.C481640Iug;
import X.C481660Iui;
import X.C481670Iuj;
import X.C481940IvA;
import X.C482240Ive;
import X.C482470Iw1;
import X.C483480Ixe;
import X.C483490Ixf;
import X.C486300J5g;
import X.C486320J5i;
import X.C486330J5j;
import X.C486370J5n;
import X.C486380J5o;
import X.C486500J6a;
import X.C486530J6d;
import X.C486540J6e;
import X.C486550J6f;
import X.C486660J6q;
import X.C486860J7k;
import X.C521950KdV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C924810aAp;
import X.EnumC1584350rKb;
import X.EnumC1584360rKc;
import X.InterfaceC1570900qyu;
import X.InterfaceC1571160qzK;
import X.InterfaceC1585190rLx;
import X.InterfaceC1617760sCU;
import X.InterfaceC1711206n0;
import X.InterfaceC20622815ms;
import X.InterfaceC482890Iwh;
import X.InterfaceC486260J5c;
import Y.ARunnableS107S0100000_7;
import Y.ATListenerS441S0100000_7;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.LiveActiveWatchGuideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightNearByEntranceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterBubbleFetchThrottleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IHomeTabService;
import com.ss.android.ugc.aweme.ab.FollowTopliveBubbleConfig;
import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.ss.android.ugc.aweme.ab.ToplivePagePreloadConfig;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.experiment.LiveColdBootFirstTabApiOpt;
import com.ss.android.ugc.aweme.experiment.LiveFeedFcpConfig;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import webcast.api.room.NearbyGuideConfig;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyData;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveIconGenerator implements InterfaceC1570900qyu {
    public static Rect LLJJIJIIJIL = new Rect();
    public static final C01GW<IHomeTabService> LLJJIJIL = C452501pT.LIZIZ(new C0J6Z());
    public static boolean LLJJJ;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public AbsFragment LLILLL;
    public InterfaceC1617760sCU LLILZ;
    public final int LLILZIL;
    public ImageView LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public C0J6Q LLJ;
    public InterfaceC486260J5c LLJI;
    public C0J5C LLJIJIL;
    public C0J5H LLJILJIL;
    public C0J6U LLJILJILJ;
    public LifecycleEventObserver LLJILLL;
    public final C0J6T LLJJ;
    public final C0J6S LLJJI;
    public final C0J6R LLJJIII;
    public final String LLJJIJI;

    @Override // X.InterfaceC1570900qyu
    public final void LIZ() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void S1(boolean z) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void T1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void a2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean b2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean c2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void e2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean enabled() {
        return true;
    }

    @Override // X.InterfaceC1570900qyu
    public final void g2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onPause() {
        C0J5C c0j5c;
        ImageView imageView;
        C0J6U c0j6u;
        C0J6U c0j6u2;
        this.LLIZLLLIL = true;
        if (LLJJJ && (imageView = this.LLILZLL) != null && imageView.getVisibility() == 0 && (c0j6u = this.LLJILJILJ) != null && c0j6u.LJ() && (c0j6u2 = this.LLJILJILJ) != null) {
            c0j6u2.LIZIZ();
        }
        ImageView imageView2 = this.LLILZLL;
        if (imageView2 == null || imageView2.getVisibility() != 0 || (c0j5c = this.LLJIJIL) == null) {
            return;
        }
        ((C0J58) c0j5c).LLILZLL = false;
    }

    public static boolean LIZLLL() {
        if (((Boolean) C260020AGy.LIZ.getValue()).booleanValue()) {
            return true;
        }
        C1585070rLl.LIZ.getClass();
        return C1585070rLl.LIZJ.isEmpty() ^ true ? C1585070rLl.LJII(EnumC1584360rKc.LIVE) : LiveFeedFcpConfig.enableBottomTab();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0J6T] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0J6S] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0J6R] */
    public LiveIconGenerator() {
        this.LL = C452501pT.LIZIZ(new C0J6Y());
        this.LLILLJJLI = C452501pT.LIZIZ(new C0J6W());
        this.LLILZIL = 8388627;
        this.LLJJ = new InterfaceC1585190rLx() { // from class: X.0J6T
            @Override // X.InterfaceC1585190rLx
            public final void p1(String str, String str2) {
                C0J6Q c0j6q = this.LL.LLJ;
                if (c0j6q != null) {
                    c0j6q.LJII(str2);
                }
                C0J6U c0j6u = this.LL.LLJILJILJ;
                if (c0j6u != null) {
                    c0j6u.LJFF();
                }
            }
        };
        this.LLJJI = new InterfaceC1585190rLx() { // from class: X.0J6S
            @Override // X.InterfaceC1585190rLx
            public final void p1(String str, String str2) {
                C0J6Q c0j6q = this.LL.LLJ;
                if (c0j6q != null) {
                    c0j6q.LJFF(str2);
                }
                C0J6U c0j6u = this.LL.LLJILJILJ;
                if (c0j6u != null) {
                    c0j6u.LJI();
                }
            }
        };
        this.LLJJIII = new InterfaceC482890Iwh() { // from class: X.0J6R
            @Override // X.InterfaceC482890Iwh
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC482890Iwh
            public final void LIZJ() {
            }

            @Override // X.InterfaceC482890Iwh
            public final void LIZ() {
                LiveIconGenerator liveIconGenerator = this.LIZ;
                liveIconGenerator.U1(liveIconGenerator.LLILZLL);
                this.LIZ.getClass();
                Keva repo = Keva.getRepo("top_live_tab");
                if (repo != null) {
                    repo.storeInt("landing_tab_position", 0);
                }
            }
        };
        this.LLJJIJI = EnumC1584350rKb.LIVE.getTag();
    }

    @Override // X.InterfaceC1570900qyu
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202302);
        C0JAU.LJ().LJFF();
        C0JAU.LJ().LJII(0L);
        EventBus.LIZLLL().LJIJJ(this);
        long jLongValue = ((Number) AnonymousClass0716.LJJIJIIJIL.getValue()).longValue();
        if (C343780Ddo.LIZIZ() || LiveColdBootFirstTabApiOpt.INSTANCE.isEnable()) {
            C0J6V.LIZ(!LIZLLL());
        } else if (C070T.LIZ(jLongValue)) {
            C0CN5.LIZIZ(Long.valueOf(jLongValue), new Runnable() { // from class: X.0J6L
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveIconGenerator@b777.onCreate$1");
                    try {
                        C15O7.LIZIZ(new Callable() { // from class: X.0J6M
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1C7U.LIZ("LiveIconGenerator@b777.onCreate$1$1");
                                C0JAU.LJ().LJIIIIZZ(0L);
                                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().LJIIL();
                                C1C7U.LIZIZ("LiveIconGenerator@b777.onCreate$1$1");
                                return null;
                            }
                        }, C823050WQl.LIZLLL(), null);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveIconGenerator@b777.onCreate$1");
                }
            });
        } else {
            C15O7.LIZIZ(new Callable() { // from class: X.0J6K
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("LiveIconGenerator@b777.onCreate$2");
                    C0JAU.LJ().LJIIIIZZ(0L);
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().LJIIL();
                    C1C7U.LIZIZ("LiveIconGenerator@b777.onCreate$2");
                    return null;
                }
            }, C823050WQl.LIZLLL(), null);
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJIIJ(this.LLILZIL, this.LLILZLL, true);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1570900qyu
    public final void onDestroyView() {
        EventBus.LIZLLL().LJJI(this);
        C0JAU.LJ().LIZIZ();
        InterfaceC486260J5c interfaceC486260J5c = this.LLJI;
        if (interfaceC486260J5c != null) {
            C0J5V c0j5v = (C0J5V) interfaceC486260J5c;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispose position: ");
            sbLIZ.append(c0j5v.LLILLL);
            C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ));
            if (c0j5v.LLILZLL) {
                C481670Iuj c481670Iuj = C481670Iuj.LIZ;
                Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
                Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                if (obj == null) {
                    synchronized (c481670Iuj) {
                        try {
                            Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                            obj = obj2;
                            if (obj2 == null) {
                                C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                                C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                                map.put(C13LE.LIZ(C486370J5n.class), c486370J5n);
                                obj = c486370J5n;
                                if (c486370J5n != null) {
                                    C0J65.LL.LJI(c486370J5n);
                                    obj = c486370J5n;
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                boolean z = obj instanceof C486370J5n;
                Object obj3 = obj;
                if (!z) {
                    obj3 = null;
                }
                C0J66 c0j66 = (C0J66) obj3;
                if (c0j66 != null) {
                    c0j66.LJII(c0j5v);
                }
                c0j5v.LLILZLL = false;
            }
            c0j5v.LL = null;
            c0j5v.LLILLJJLI = null;
            C0J71 c0j71 = c0j5v.LLILZIL;
            if (c0j71 != null) {
                c0j71.LLZZ();
            }
            C0J71 c0j712 = c0j5v.LLILZIL;
            if (c0j712 != null) {
                c0j712.LIZIZ(c0j5v.LLJI);
            }
            c0j5v.LLILZIL = null;
        }
        this.LLJI = null;
        C0J5C c0j5c = this.LLJIJIL;
        if (c0j5c != null) {
            ((C0J58) c0j5c).LIZJ();
        }
        this.LLJIJIL = null;
        C0J5H c0j5h = this.LLJILJIL;
        if (c0j5h != null) {
            c0j5h.LIZ = null;
            c0j5h.LIZIZ = null;
            C0J71 c0j713 = c0j5h.LIZLLL;
            if (c0j713 != null) {
                c0j713.LLZZ();
            }
            C0J71 c0j714 = c0j5h.LIZLLL;
            if (c0j714 != null) {
                c0j714.LIZIZ(c0j5h.LJ);
            }
            c0j5h.LIZLLL = null;
            C0J71 c0j715 = c0j5h.LJI;
            if (c0j715 != null) {
                c0j715.LLZZ();
            }
            C0J71 c0j716 = c0j5h.LJI;
            if (c0j716 != null) {
                c0j716.LIZIZ(c0j5h.LJIIJ);
            }
            c0j5h.LJI = null;
        }
        this.LLJILJIL = null;
    }

    @Override // X.InterfaceC1570900qyu
    public final void onResume() {
        IInteractService iInteractService;
        ImageView imageView;
        Hox hox;
        ImageView imageView2;
        C0J6U c0j6u;
        C0J6U c0j6u2;
        ImageView imageView3;
        Pair pairLJJIIJZLJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().v3().LJJIIJZLJL();
        if (this.LLIZLLLIL && pairLJJIIJZLJL != null && ((Number) pairLJJIIJZLJL.getFirst()).longValue() != 0 && C0J0B.LIZ().enable && !C480270IsT.LIZ() && (imageView3 = this.LLILZLL) != null && imageView3.getVisibility() == 0) {
            FollowTopliveBubbleConfig followTopliveBubbleConfigLIZ = C0J0B.LIZ();
            C0J6Q c0j6q = this.LLJ;
            if (c0j6q != null) {
                c0j6q.LJIIIZ(followTopliveBubbleConfigLIZ.delayDuration, pairLJJIIJZLJL);
            }
        }
        if (this.LLIZLLLIL && LLJJJ && (imageView2 = this.LLILZLL) != null && imageView2.getVisibility() == 0 && (c0j6u = this.LLJILJILJ) != null && c0j6u.LJ() && (c0j6u2 = this.LLJILJILJ) != null) {
            c0j6u2.LJIIIIZZ();
        }
        if (this.LLIZLLLIL && (imageView = this.LLILZLL) != null && imageView.getVisibility() == 0) {
            C0J5C c0j5c = this.LLJIJIL;
            if (c0j5c != null) {
                C0J58 c0j58 = (C0J58) c0j5c;
                if (c0j58.LLIZ == 4 && c0j58.LLILZLL && (hox = (Hox) c0j58.LLIZLLLIL.getValue()) != null && hox.KQ2("For You") && !c0j58.LJFF()) {
                    c0j58.LJIIJ();
                }
                c0j58.LLILZLL = false;
            }
            C0J5H c0j5h = this.LLJILJIL;
            if (c0j5h != null) {
                c0j5h.LJ();
            }
        }
        this.LLIZLLLIL = false;
        if (C924810aAp.LJJJJZ && !LIZLLL() && (iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) != null) {
            AbsFragment absFragment = this.LLILLL;
            AbsFragment absFragment2 = absFragment == null ? null : absFragment;
            ImageView imageView4 = this.LLILZLL;
            if (absFragment == null) {
                absFragment = null;
            }
            HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(absFragment);
            iInteractService.Vd0(imageView4, absFragment2, homeViewPagerAbilityLIZIZ != null && homeViewPagerAbilityLIZIZ.gk1() == 0);
        }
        C924810aAp.LJJJJZ = false;
    }

    @Override // X.InterfaceC1570900qyu
    public final String getTag() {
        return this.LLJJIJI;
    }

    public final void LIZIZ(C0J6N c0j6n) {
        C486530J6d c486530J6dLIZJ;
        ImageView imageView;
        Integer numValueOf;
        ImageView imageView2;
        if (!C0C0H.LIZ() && C1591480rW6.LJI()) {
            HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LL.getValue();
            AbsFragment absFragment = null;
            if (homepageIconServiceApi != null && (c486530J6dLIZJ = homepageIconServiceApi.LIZJ()) != null) {
                C0J6N c0j6n2 = C0J6N.DARK;
                if ((c0j6n != c0j6n2 || !C295430Bi1.LIZ()) && !c486530J6dLIZJ.LIZIZ) {
                    if (c0j6n == c0j6n2 && !C295430Bi1.LIZ()) {
                        LIZJ(c0j6n);
                    } else {
                        AbsFragment absFragment2 = this.LLILLL;
                        if (absFragment2 != null) {
                            absFragment = absFragment2;
                        }
                        if (absFragment.getContext() != null && (imageView = this.LLILZLL) != null) {
                            imageView.setImageResource(c486530J6dLIZJ.LIZ);
                        }
                    }
                } else {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    c419910GdJ.LIZ = R.raw.icon_live_entrance;
                    AbsFragment absFragment3 = this.LLILLL;
                    if (absFragment3 == null) {
                        absFragment3 = null;
                    }
                    Context context = absFragment3.getContext();
                    if (context == null || (numValueOf = C1308910kAL.LIZJ(c0j6n.getColorResId(), context)) == null) {
                        numValueOf = Integer.valueOf(c0j6n.getDefaultColor());
                    }
                    c419910GdJ.LIZLLL = numValueOf;
                    c419910GdJ.LJFF = c0j6n.getHasShadow();
                    AbsFragment absFragment4 = this.LLILLL;
                    if (absFragment4 != null) {
                        absFragment = absFragment4;
                    }
                    Context context2 = absFragment.getContext();
                    if (context2 != null && (imageView2 = this.LLILZLL) != null) {
                        imageView2.setImageDrawable(c419910GdJ.LIZ(context2));
                    }
                }
            } else {
                LIZJ(c0j6n);
            }
        } else {
            LIZJ(c0j6n);
        }
        LJIIIZ(LLJJJ);
    }

    public final void LIZJ(C0J6N c0j6n) {
        float fLIZIZ;
        float fLIZIZ2;
        int i;
        Integer numValueOf;
        ImageView imageView;
        boolean zLIZ = C0C0H.LIZ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (zLIZ) {
            fLIZIZ = C418440Gaw.LIZIZ(26);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(24);
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(fLIZIZ);
        if (zLIZ) {
            fLIZIZ2 = C418440Gaw.LIZIZ(26);
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(24);
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(fLIZIZ2);
        if (zLIZ) {
            i = R.raw.icon_live_wave;
        } else {
            i = R.raw.icon_live;
        }
        c419910GdJ.LIZ = i;
        AbsFragment absFragment = this.LLILLL;
        AbsFragment absFragment2 = null;
        if (absFragment == null) {
            absFragment = null;
        }
        Context context = absFragment.getContext();
        if (context == null || (numValueOf = C1308910kAL.LIZJ(c0j6n.getColorResId(), context)) == null) {
            numValueOf = Integer.valueOf(c0j6n.getDefaultColor());
        }
        c419910GdJ.LIZLLL = numValueOf;
        c419910GdJ.LJFF = c0j6n.getHasShadow();
        AbsFragment absFragment3 = this.LLILLL;
        if (absFragment3 != null) {
            absFragment2 = absFragment3;
        }
        Context context2 = absFragment2.getContext();
        if (context2 != null && (imageView = this.LLILZLL) != null) {
            imageView.setImageDrawable(c419910GdJ.LIZ(context2));
        }
    }

    public final void LJ(ImageView imageView) {
        final C19EG c19egLIZIZ;
        LiveActiveWatchGuideSetting liveActiveWatchGuideSetting = LiveActiveWatchGuideSetting.INSTANCE;
        if (liveActiveWatchGuideSetting.getConfig().enable && Intrinsics.LJFF(liveActiveWatchGuideSetting.getConfig().guidePosition, "toplive") && (c19egLIZIZ = C1388190mED.LIZIZ(imageView.getContext())) != null) {
            this.LLJI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).h4(c19egLIZIZ, imageView, liveActiveWatchGuideSetting.getConfig().guidePosition, Integer.valueOf(liveActiveWatchGuideSetting.getConfig().guideStyle));
            HandlerHook.viewPost(imageView, new Runnable() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initActiveWatchGuideManager$1$1
                public final void LIZ() {
                    Lifecycle lifecycle;
                    final C521950KdV c521950KdV = new C521950KdV(this, 0);
                    LifecycleOwner lifecycleOwner = c19egLIZIZ;
                    if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0)) {
                        Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwner);
                        if (objLIZ == null || !(objLIZ instanceof C0J5E)) {
                            return;
                        } else {
                            lifecycleOwner = (Fragment) objLIZ;
                        }
                    }
                    if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                        return;
                    }
                    final C19EG c19eg = c19egLIZIZ;
                    lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initActiveWatchGuideManager$1$1.1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_START) {
                                onStart();
                            } else if (event == Lifecycle.Event.ON_STOP) {
                                onStop();
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_START)
                        public final void onStart() {
                            HomeTabAbility homeTabAbilityLIZ;
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            homeTabAbilityLIZ.UC1(c521950KdV);
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                        public final void onStop() {
                            HomeTabAbility homeTabAbilityLIZ;
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            homeTabAbilityLIZ.Ik0(c521950KdV);
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveIconGenerator@b777.initActiveWatchGuideManager$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveIconGenerator@b777.initActiveWatchGuideManager$1$1");
                }
            });
        }
    }

    public final void LJI(ImageView imageView) {
        C0J5C c0j5cS6;
        final C19EG c19egLIZIZ = C1388190mED.LIZIZ(imageView.getContext());
        if (c19egLIZIZ != null) {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null) {
                c0j5cS6 = iLiveOuterService.s6(imageView, c19egLIZIZ);
            } else {
                c0j5cS6 = null;
            }
            this.LLJIJIL = c0j5cS6;
            if (c0j5cS6 != null) {
                ((C0J58) c0j5cS6).LLJIJIL = this.LLJJIII;
            }
            HandlerHook.viewPost(imageView, new Runnable() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initNearByGuideManager$1$1
                public final void LIZ() {
                    Lifecycle lifecycle;
                    final C521950KdV c521950KdV = new C521950KdV(this, 1);
                    LifecycleOwner lifecycleOwner = c19egLIZIZ;
                    if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0)) {
                        Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwner);
                        if (objLIZ == null || !(objLIZ instanceof C0J5E)) {
                            return;
                        } else {
                            lifecycleOwner = (Fragment) objLIZ;
                        }
                    }
                    if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                        return;
                    }
                    final C19EG c19eg = c19egLIZIZ;
                    lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initNearByGuideManager$1$1.1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_START) {
                                onStart();
                            } else if (event == Lifecycle.Event.ON_STOP) {
                                onStop();
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_START)
                        public final void onStart() {
                            HomeTabAbility homeTabAbilityLIZ;
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            homeTabAbilityLIZ.UC1(c521950KdV);
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                        public final void onStop() {
                            HomeTabAbility homeTabAbilityLIZ;
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            homeTabAbilityLIZ.Ik0(c521950KdV);
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveIconGenerator@b777.initNearByGuideManager$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveIconGenerator@b777.initNearByGuideManager$1$1");
                }
            });
        }
    }

    public final void LJII(ImageView imageView) {
        final C19EG c19egLIZIZ;
        if ((C0J8Q.LIZ() || C0J0B.LIZ().enable) && (c19egLIZIZ = C1388190mED.LIZIZ(imageView.getContext())) != null) {
            C0J6Q c0j6qLJIILJJIL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJIILJJIL();
            this.LLJ = c0j6qLJIILJJIL;
            if (c0j6qLJIILJJIL != null) {
                c0j6qLJIILJJIL.LIZJ(c19egLIZIZ);
            }
            C0J6Q c0j6q = this.LLJ;
            if (c0j6q != null) {
                c0j6q.LIZ(imageView);
            }
            C0J6Q c0j6q2 = this.LLJ;
            if (c0j6q2 != null) {
                c0j6q2.LJ(this.LLJJIII);
            }
            HandlerHook.viewPost(imageView, new Runnable() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initTopLiveBubbleManager$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    Lifecycle lifecycle;
                    C1C7U.LIZ("LiveIconGenerator@b777.initTopLiveBubbleManager$1$1");
                    try {
                        LifecycleOwner lifecycleOwner = c19egLIZIZ;
                        if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0)) {
                            Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwner);
                            if (objLIZ != null && (objLIZ instanceof C0J5E)) {
                                lifecycleOwner = (Fragment) objLIZ;
                                if (lifecycleOwner != null) {
                                    final C19EG c19eg = c19egLIZIZ;
                                    final LiveIconGenerator liveIconGenerator = this;
                                    lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initTopLiveBubbleManager$1$1.1
                                        @Override // androidx.lifecycle.LifecycleEventObserver
                                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                            if (event == Lifecycle.Event.ON_START) {
                                                onStart();
                                            } else if (event == Lifecycle.Event.ON_STOP) {
                                                onStop();
                                            }
                                        }

                                        @OnLifecycleEvent(Lifecycle.Event.ON_START)
                                        public final void onStart() {
                                            HomeTabAbility homeTabAbilityLIZ;
                                            HomeTabAbility homeTabAbilityLIZ2;
                                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                                homeTabAbilityLIZ2.ao(liveIconGenerator.LLJJ);
                                            }
                                            MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                                return;
                                            }
                                            homeTabAbilityLIZ.UC1(liveIconGenerator.LLJJI);
                                        }

                                        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                                        public final void onStop() {
                                            HomeTabAbility homeTabAbilityLIZ;
                                            HomeTabAbility homeTabAbilityLIZ2;
                                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                                homeTabAbilityLIZ2.tx0(liveIconGenerator.LLJJ);
                                            }
                                            MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
                                            if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                                return;
                                            }
                                            homeTabAbilityLIZ.Ik0(liveIconGenerator.LLJJI);
                                        }
                                    });
                                }
                            }
                        } else if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                            final C19EG c19eg2 = c19egLIZIZ;
                            final LiveIconGenerator liveIconGenerator2 = this;
                            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initTopLiveBubbleManager$1$1.1
                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                    if (event == Lifecycle.Event.ON_START) {
                                        onStart();
                                    } else if (event == Lifecycle.Event.ON_STOP) {
                                        onStop();
                                    }
                                }

                                @OnLifecycleEvent(Lifecycle.Event.ON_START)
                                public final void onStart() {
                                    HomeTabAbility homeTabAbilityLIZ;
                                    HomeTabAbility homeTabAbilityLIZ2;
                                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                        homeTabAbilityLIZ2.ao(liveIconGenerator2.LLJJ);
                                    }
                                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                        return;
                                    }
                                    homeTabAbilityLIZ.UC1(liveIconGenerator2.LLJJI);
                                }

                                @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                                public final void onStop() {
                                    HomeTabAbility homeTabAbilityLIZ;
                                    HomeTabAbility homeTabAbilityLIZ2;
                                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                        homeTabAbilityLIZ2.tx0(liveIconGenerator2.LLJJ);
                                    }
                                    MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg2);
                                    if (mainActivityScopeLIZJ2 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) {
                                        return;
                                    }
                                    homeTabAbilityLIZ.Ik0(liveIconGenerator2.LLJJI);
                                }
                            });
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveIconGenerator@b777.initTopLiveBubbleManager$1$1");
                }
            });
            final ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZIZ);
            scrollSwitchStateManagerLIZIZ.IQ2(c19egLIZIZ, new Observer() { // from class: X.0J6P
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int iIntValue = ((Number) obj).intValue();
                    LiveIconGenerator liveIconGenerator = this.LL;
                    ScrollSwitchStateManager scrollSwitchStateManager = scrollSwitchStateManagerLIZIZ;
                    C0J6Q c0j6q3 = liveIconGenerator.LLJ;
                    if (c0j6q3 != null) {
                        c0j6q3.LIZLLL(!Intrinsics.LJFF(scrollSwitchStateManager.CQ2(iIntValue), "page_feed"));
                    }
                }
            });
        }
    }

    public final void LJIIIIZZ(ImageView imageView) {
        final C19EG c19egLIZIZ;
        if (LiveWatchLaterSettingSetting.INSTANCE.getValue() > 0 && LiveWatchLaterBubbleFetchThrottleSetting.INSTANCE.getValue() > 0 && (c19egLIZIZ = C1388190mED.LIZIZ(imageView.getContext())) != null) {
            C0J5H c0j5h = new C0J5H(imageView, c19egLIZIZ);
            this.LLJILJIL = c0j5h;
            c0j5h.LIZJ = this.LLJJIII;
            HandlerHook.viewPost(imageView, new Runnable() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initWatchLaterGuideManager$1$1
                public final void LIZ() {
                    Lifecycle lifecycle;
                    final C521950KdV c521950KdV = new C521950KdV(this, 2);
                    LifecycleOwner lifecycleOwner = c19egLIZIZ;
                    if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0)) {
                        Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwner);
                        if (objLIZ == null || !(objLIZ instanceof C0J5E)) {
                            return;
                        } else {
                            lifecycleOwner = (Fragment) objLIZ;
                        }
                    }
                    if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                        return;
                    }
                    final C19EG c19eg = c19egLIZIZ;
                    lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$initWatchLaterGuideManager$1$1.1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_START) {
                                onStart();
                            } else if (event == Lifecycle.Event.ON_STOP) {
                                onStop();
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_START)
                        public final void onStart() {
                            HomeTabAbility homeTabAbilityLIZ;
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            homeTabAbilityLIZ.UC1(c521950KdV);
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                        public final void onStop() {
                            HomeTabAbility homeTabAbilityLIZ;
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
                            if (mainActivityScopeLIZJ == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            homeTabAbilityLIZ.Ik0(c521950KdV);
                        }
                    });
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveIconGenerator@b777.initWatchLaterGuideManager$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveIconGenerator@b777.initWatchLaterGuideManager$1$1");
                }
            });
        }
    }

    public final void LJIIIZ(boolean z) {
        ImageView imageView;
        ImageView imageView2;
        C0J6U c0j6u;
        ImageView imageView3;
        IMFToolBarAbility iMFToolBarAbilityLIZIZ;
        IMFToolBarAbility iMFToolBarAbilityLIZIZ2;
        AbsFragment absFragment = null;
        if (!z) {
            C1AV2 c1av2 = (C1AV2) C1AVH.LJJJJI.getValue();
            if (C1581510rG1.LIZIZ()) {
                AbsFragment absFragment2 = this.LLILLL;
                if (absFragment2 == null) {
                    absFragment2 = null;
                }
                C19EG activity = absFragment2.getActivity();
                if (activity != null && (iMFToolBarAbilityLIZIZ2 = C0CUL.LIZIZ(C1558360qeg.LJI(activity, null))) != null) {
                    String tag = this.LLJJIJI;
                    if (tag == null) {
                        tag = EnumC1584350rKb.LIVE.getTag();
                    }
                    iMFToolBarAbilityLIZIZ2.rn0(tag, 8, false, c1av2);
                }
            }
            ImageView imageView4 = this.LLILZLL;
            if (imageView4 != null) {
                C2180521AVm.LIZLLL(imageView4, 8, c1av2);
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJIIJ(this.LLILZIL, this.LLILZLL, false);
            return;
        }
        boolean zLIZ = C480270IsT.LIZ();
        if (C1581510rG1.LIZIZ()) {
            AbsFragment absFragment3 = this.LLILLL;
            if (absFragment3 == null) {
                absFragment3 = null;
            }
            C19EG activity2 = absFragment3.getActivity();
            if (activity2 != null && (iMFToolBarAbilityLIZIZ = C0CUL.LIZIZ(C1558360qeg.LJI(activity2, null))) != null) {
                String tag2 = this.LLJJIJI;
                if (tag2 == null) {
                    tag2 = EnumC1584350rKb.LIVE.getTag();
                }
                iMFToolBarAbilityLIZIZ.rn0(tag2, 0, false, null);
            }
        }
        ImageView imageView5 = this.LLILZLL;
        if (imageView5 != null) {
            C786410Ut5.LJZI(0, imageView5);
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJIIJ(this.LLILZIL, this.LLILZLL, true);
        if (!zLIZ && ((Boolean) C0A5E.LIZ.getValue()).booleanValue() && (imageView3 = this.LLILZLL) != null) {
            imageView3.setOnTouchListener(new View.OnTouchListener() { // from class: X.0J6O
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean zLJI = MethodIDManager.LJI(71699);
                    ImageView imageView6 = this.LL.LLILZLL;
                    if (imageView6 != null && imageView6.getVisibility() == 0 && motionEvent != null && motionEvent.getAction() == 0) {
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).I9();
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return false;
                }
            });
        }
        if (this.LLJILLL == null && (c0j6u = this.LLJILJILJ) != null && c0j6u.LJ()) {
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$show$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    C0J6U c0j6u2;
                    int i = C483490Ixf.LIZ[event.ordinal()];
                    if (i != 1) {
                        if (i == 2 && (c0j6u2 = this.LL.LLJILJILJ) != null) {
                            c0j6u2.LIZJ(1);
                            return;
                        }
                        return;
                    }
                    AbsFragment absFragment4 = this.LL.LLILLL;
                    if (absFragment4 == null) {
                        absFragment4 = null;
                    }
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(absFragment4), C0PEM.LIZJ, null, new C483480Ixe(this.LL, null), 2);
                }
            };
            this.LLJILLL = lifecycleEventObserver;
            AbsFragment absFragment4 = this.LLILLL;
            if (absFragment4 != null) {
                absFragment = absFragment4;
            }
            absFragment.getLifecycle().addObserver(lifecycleEventObserver);
        }
        if (zLIZ) {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ToplivePagePreloadConfig toplivePagePreloadConfig = C482470Iw1.LIZ;
            ToplivePagePreloadConfig toplivePagePreloadConfig2 = (ToplivePagePreloadConfig) c0c64LJIILLIIL.LJJII(ToplivePagePreloadConfig.class, toplivePagePreloadConfig, "live_new_toplive_preload_config", true);
            if (toplivePagePreloadConfig2 != null) {
                toplivePagePreloadConfig = toplivePagePreloadConfig2;
            }
            if (toplivePagePreloadConfig.enable && (imageView2 = this.LLILZLL) != null) {
                HandlerHook.viewPostDelay(imageView2, new Runnable() { // from class: X.0IwE
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ2;
                        C1C7U.LIZ("LiveIconGenerator@b777.show$3");
                        try {
                            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().P5(EnumC482480Iw2.PULLING, Boolean.TRUE);
                        } finally {
                            if (!zLIZ2) {
                            }
                        }
                        C1C7U.LIZIZ("LiveIconGenerator@b777.show$3");
                    }
                }, ((long) toplivePagePreloadConfig.startDelay) * 1000);
            }
            if (ToplivePageLoadAdvanceSetting.LIZ().enableTouchPreload && (imageView = this.LLILZLL) != null) {
                imageView.setOnTouchListener(new ATListenerS441S0100000_7(this, 6));
            }
        }
        ImageView imageView6 = this.LLILZLL;
        if (imageView6 != null) {
            HandlerHook.viewPost(imageView6, new ARunnableS107S0100000_7(this, 109));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x018f  */
    @Override // X.InterfaceC1570900qyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U1(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator.U1(android.view.View):void");
    }

    @Override // X.InterfaceC1570900qyu
    public final void d2(Integer num) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C1593860rZw.LIZ(imageView, num, true);
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final View f2(Context context) {
        boolean z;
        ImageView imageView;
        ImageView imageViewLJIIIIZZ;
        int i = C303200BuY.LIZ;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i != 1) {
            InterfaceC1617760sCU interfaceC1617760sCU = this.LLILZ;
            if (interfaceC1617760sCU == null) {
                interfaceC1617760sCU = null;
            }
            C19EG activity = interfaceC1617760sCU.getActivity();
            if (activity != null) {
                HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LL.getValue();
                if (homepageIconServiceApi != null) {
                    imageViewLJIIIIZZ = homepageIconServiceApi.LJIIIIZZ(activity);
                } else {
                    imageViewLJIIIIZZ = null;
                }
                this.LLILZLL = imageViewLJIIIIZZ;
            }
        } else {
            HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class);
            InterfaceC1617760sCU interfaceC1617760sCU2 = this.LLILZ;
            if (interfaceC1617760sCU2 == null) {
                interfaceC1617760sCU2 = null;
            }
            View inflatedLiveIcon = homePageUIFrameService.getInflatedLiveIcon(interfaceC1617760sCU2.getActivity());
            if (inflatedLiveIcon instanceof ImageView) {
                imageView = (ImageView) inflatedLiveIcon;
            } else {
                imageView = null;
            }
            this.LLILZLL = imageView;
            if (((Boolean) C285090BFj.LJII.getValue()).booleanValue()) {
                if (C343780Ddo.LIZIZ()) {
                    LJIIIZ(LLJJJ);
                }
                ImageView imageView2 = this.LLILZLL;
                if (imageView2 == null) {
                    return null;
                }
                LJII(imageView2);
                LJ(imageView2);
                LJI(imageView2);
                LJIIIIZZ(imageView2);
                return imageView2;
            }
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJII()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C341940Daq.LIZ(56.0d), C341940Daq.LIZ(56.0d));
            ImageView imageView3 = this.LLILZLL;
            if (imageView3 != null) {
                C786410Ut5.c6(imageView3, layoutParams);
            }
        }
        if (C343780Ddo.LIZIZ()) {
            LJIIIZ(LLJJJ);
        }
        ImageView imageView4 = this.LLILZLL;
        if (imageView4 == null) {
            return null;
        }
        LJII(imageView4);
        LJ(imageView4);
        LJI(imageView4);
        LJIIIIZZ(imageView4);
        return imageView4;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveIconEntranceEnable(C486500J6a c486500J6a) {
        boolean z;
        C0JAU.LJ().LJIIIZ();
        if (c486500J6a.LIZ && ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            z = true;
        } else {
            z = false;
        }
        C0J6V.LIZ(z);
        String strI0 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().i0();
        if (Intrinsics.LJFF(strI0, "live_tab_single") || Intrinsics.LJFF(strI0, "live_tab_double")) {
            C0J6V.LIZ(false);
        }
        if (LIZLLL()) {
            C0J6V.LIZ(false);
        }
        if (LLJJJ) {
            if (this.LLJILJILJ == null && !C480270IsT.LIZ()) {
                this.LLJILJILJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).mk();
            }
            if (!this.LLIZ) {
                this.LLIZ = true;
                C0J6U c0j6u = this.LLJILJILJ;
                if (c0j6u != null) {
                    c0j6u.LIZ();
                }
                C0CN5.LIZIZ(30000L, new ARunnableS107S0100000_7(this, 108));
                C0J6U c0j6u2 = this.LLJILJILJ;
                if (c0j6u2 != null && c0j6u2.LIZLLL()) {
                    C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.0J6J
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveIconGenerator@b777.onLiveIconEntranceEnable$2");
                            try {
                                boolean z2 = C486660J6q.LIZ;
                                HashMap map = new HashMap();
                                map.put("enter_from_merge", "homepage_hot");
                                map.put("_param_live_platform", "live");
                                C20684815ws.LJIILLIIL("livesdk_live_merge_show", map);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveIconGenerator@b777.onLiveIconEntranceEnable$2");
                        }
                    });
                } else {
                    boolean z2 = C486660J6q.LIZ;
                    HashMap map = new HashMap();
                    map.put("enter_from_merge", "homepage_hot");
                    map.put("_param_live_platform", "live");
                    C20684815ws.LJIILLIIL("livesdk_live_merge_show", map);
                }
            }
            C0JAU.LJ().LJI();
            ILiveOuterService iLiveOuterServiceQ4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4();
            if (iLiveOuterServiceQ4.B4().LJFF(0.0d, "ttlive_homepage_toplives_entrance")) {
                HashMap map2 = new HashMap();
                map2.put("source", "for_you_feed_toplives");
                iLiveOuterServiceQ4.r3().LIZ(0, "ttlive_homepage_toplives_entrance", map2);
            }
        }
        C0JAM c0jamLJ = C0JAU.LJ();
        c0jamLJ.LJIIJ(null, null, null, null, false);
        c0jamLJ.LIZJ();
        LJIIIZ(LLJJJ);
        IHomeTabService iHomeTabService = (IHomeTabService) this.LLILLJJLI.getValue();
        if (iHomeTabService != null) {
            iHomeTabService.LJ(LLJJJ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onTopLiveBubbleShowEvent(C0J6X c0j6x) {
        C19EG c19eg;
        Context baseContext;
        StrategyData strategyData;
        ShowMode showMode;
        NearbyGuideConfig nearbyGuideConfig;
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        ShowMode showMode2;
        NearbyGuideConfig nearbyGuideConfig2;
        C19EG c19eg2;
        LifecycleCoroutineScope lifecycleScope;
        ImageView imageView = this.LLILZLL;
        int i = 0;
        if (imageView != null && imageView.getVisibility() == 0) {
            C0J6Q c0j6q = this.LLJ;
            if (c0j6q != null) {
                c0j6q.LIZIZ(c0j6x.LIZ, c0j6x.LIZIZ);
            }
            InterfaceC486260J5c interfaceC486260J5c = this.LLJI;
            if (interfaceC486260J5c != null) {
                C0J5V c0j5v = (C0J5V) interfaceC486260J5c;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryShowAtColdStart position: ");
                sbLIZ.append(c0j5v.LLILLL);
                C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ));
                if (c0j5v.LJIIIIZZ(true) && (c19eg2 = c0j5v.LL) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg2)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C0J5Z(c0j5v, null), 2);
                }
            }
            C0J5C c0j5c = this.LLJIJIL;
            if (c0j5c != null) {
                C0J58 c0j58 = (C0J58) c0j5c;
                if (!c0j58.LLJ) {
                    c0j58.LLJ = true;
                    if (LiveSkylightNearByEntranceSetting.INSTANCE.config().entranceEnable && (c19eg = c0j58.LL) != null && (baseContext = c19eg.getBaseContext()) != null && C474920Ijq.LIZ(baseContext) && (strategyData = (StrategyData) c0j58.LLILZ.getValue()) != null && (showMode = strategyData.showMode) != null && (nearbyGuideConfig = showMode.nearbyGuideConfig) != null && nearbyGuideConfig.group > 0 && !c0j58.LJFF()) {
                        StrategyData strategyData2 = (StrategyData) c0j58.LLILZ.getValue();
                        if (strategyData2 != null && (showMode2 = strategyData2.showMode) != null && (nearbyGuideConfig2 = showMode2.nearbyGuideConfig) != null) {
                            i = nearbyGuideConfig2.group;
                        }
                        c0j58.LLIZ = i;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("tryShowNearByBubble = ");
                        sbLIZ2.append(c0j58.LLIZ);
                        C20441214yg.LJIIIZ("LiveNearByGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                        int i2 = c0j58.LLIZ;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        EventBus.LIZLLL().LJIJJ(c0j58);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                if (c0j58.LLJI) {
                                    return;
                                }
                                c0j58.LLJI = true;
                                C481670Iuj c481670Iuj = C481670Iuj.LIZ;
                                Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
                                Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                                if (obj == null) {
                                    synchronized (c481670Iuj) {
                                        try {
                                            Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                                            obj = obj2;
                                            if (obj2 == null) {
                                                C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                                                if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                                                    multiTopLiveRoomMatchScene = new C486370J5n();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                                                    multiTopLiveRoomMatchScene = new C0J60();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                                                    multiTopLiveRoomMatchScene = new C486330J5j();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                                                    multiTopLiveRoomMatchScene = new C486320J5i();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                                                    multiTopLiveRoomMatchScene = new C486300J5g();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                                                    multiTopLiveRoomMatchScene = new C481940IvA();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                                                    multiTopLiveRoomMatchScene = new C481660Iui();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                                                    multiTopLiveRoomMatchScene = new C482240Ive();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                                                    multiTopLiveRoomMatchScene = new C481640Iug();
                                                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                                                    multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                                                } else {
                                                    multiTopLiveRoomMatchScene = null;
                                                }
                                                map.put(C13LE.LIZ(C486370J5n.class), multiTopLiveRoomMatchScene);
                                                obj = multiTopLiveRoomMatchScene;
                                                if (multiTopLiveRoomMatchScene != null) {
                                                    C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                                                    obj = multiTopLiveRoomMatchScene;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                                boolean z = obj instanceof C486370J5n;
                                Object obj3 = obj;
                                if (!z) {
                                    obj3 = null;
                                }
                                C0J66 c0j66 = (C0J66) obj3;
                                if (c0j66 == null) {
                                    return;
                                }
                                c0j66.LIZ(c0j58, C1697810uHb.LJIIJJI("fyp_skylight_refresh", "home_unfollow"));
                                c0j66.LJIIJ(new C486380J5o(null, "fyp_skylight_refresh", null, 59));
                                c0j66.LJIIJ(new C486380J5o(null, "home_unfollow", null, 59));
                                return;
                            }
                        }
                        c0j58.LJIIJ();
                    }
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserLoginSuccessfully(C486550J6f c486550J6f) {
        IHomeTabService iHomeTabService = (IHomeTabService) this.LLILLJJLI.getValue();
        if (iHomeTabService != null) {
            iHomeTabService.LIZ();
        }
        if (((Boolean) C304490Bwd.LIZIZ.getValue()).booleanValue()) {
            C486540J6e.LIZ = System.currentTimeMillis();
        }
        if (!((Boolean) C304490Bwd.LIZJ.getValue()).booleanValue() || c486550J6f == null || 1 != c486550J6f.LIZ) {
            C0J6V.LIZ(false);
            LJIIIZ(false);
        }
        if (!C343780Ddo.LIZIZ()) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().i4().LJIIL();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onWatchLaterGuideBubbleEvent(C468770IZv c468770IZv) {
        C19EG c19eg;
        View view;
        long jLongValue;
        long jLongValue2;
        C0J5H c0j5h;
        ImageView imageView = this.LLILZLL;
        if (imageView != null && imageView.getVisibility() == 0) {
            int i = c468770IZv.LIZLLL;
            if (i != 0) {
                if (i == 1 && (c0j5h = this.LLJILJIL) != null) {
                    c0j5h.LJ();
                    return;
                }
                return;
            }
            C0J5H c0j5h2 = this.LLJILJIL;
            if (c0j5h2 == null || (c19eg = c0j5h2.LIZ) == null || !c0j5h2.LIZJ() || (view = c0j5h2.LIZIZ) == null) {
                return;
            }
            Long l = c468770IZv.LIZ;
            long jLongValue3 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = c468770IZv.LIZIZ;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            Long l3 = c468770IZv.LIZJ;
            if (l3 != null) {
                jLongValue3 = l3.longValue();
            }
            C0J71 c0j71 = new C0J71(c19eg, view, new C0J5L(null, 1, false, jLongValue, jLongValue2, jLongValue3, null, view.getContext().getString(2131856907), "live_toplive_watch_later_guide", 2186));
            c0j71.LJ.add(c0j5h2.LJ);
            HandlerHook.viewPost(view, new ARunnableS107S0100000_7(c0j71, 143));
            c0j5h2.LIZLLL = c0j71;
        }
    }

    public LiveIconGenerator(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
        this();
        this.LLILLL = mainFragment;
        this.LLILZ = interfaceC1617760sCU;
    }

    @Override // X.InterfaceC1570900qyu
    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LLILLL = mainFragment;
        this.LLILZ = interfaceC1617760sCU;
    }
}
