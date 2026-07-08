package com.ss.android.ugc.aweme.live.root.tab.room;

import X.C098200Yq;
import X.C0HAS;
import X.C0IEG;
import X.C0IKQ;
import X.C0IL2;
import X.C0IQ7;
import X.C1324720kZq;
import X.C189200o6;
import X.C19EH;
import X.C20441214yg;
import X.C20736316Cj;
import X.C472280Ifa;
import X.C475260IkO;
import X.C475310IkT;
import X.C475460Iki;
import X.C476830Imv;
import X.C477110InN;
import X.C477580Io8;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC471790Ien;
import X.EnumC475180IkG;
import X.InterfaceC463590IFx;
import X.InterfaceC466370IQp;
import X.InterfaceC475150IkD;
import X.InterfaceC475300IkS;
import X.InterfaceC475340IkW;
import X.InterfaceC477100InM;
import X.InterfaceC477170InT;
import X.InterfaceC479830Irl;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.feed.api.TopLiveSkylightEntranceEvent;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIOptSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment;
import com.ss.android.ugc.aweme.live.root.tab.room.LiveRoomPageFragment;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomPageFragment extends AbsTabFragment implements InterfaceC477100InM, InterfaceC463590IFx, InterfaceC475340IkW {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OiojHELIOSPWEnKSdiOyA8JWsAIDk2GiojJB8yLyAKOy40JSAiPQ==";
    public C475310IkT LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public InterfaceC475300IkS LLILZIL;
    public boolean LLILZLL;
    public C472280Ifa LLIZ;
    public final int LLIZLLLIL = View.generateViewId();
    public boolean LLJ;
    public C1324720kZq LLJI;
    public FrameLayout LLJIJIL;
    public C0IEG LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.InterfaceC479810Irj
    public final Fragment LLLIILIL() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void LLLILZLLLI() {
        InterfaceC466370IQp currentFragment;
        InterfaceC466370IQp currentFragment2;
        this.LLJILJILJ = false;
        if (LiveNearbyTabSetting.INSTANCE.getValue().enableSlidingOpt) {
            C0IEG c0ieg = this.LLJILJIL;
            if (c0ieg != null && (currentFragment2 = c0ieg.getCurrentFragment()) != null) {
                currentFragment2.gc();
            }
            C0IEG c0ieg2 = this.LLJILJIL;
            if (c0ieg2 == null || (currentFragment = c0ieg2.getCurrentFragment()) == null) {
                return;
            }
            currentFragment.pause();
        }
    }

    @Override // X.InterfaceC477100InM
    public final Object em() {
        return this;
    }

    @Override // X.InterfaceC477100InM
    public final void fj(Rect rect) {
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void onPageSelected() {
        this.LLJILJILJ = true;
    }

    @Override // X.InterfaceC463590IFx
    public final void LJLL() {
        C1324720kZq c1324720kZq;
        if (LiveNearbyTabSetting.INSTANCE.enable() && this.LLJ) {
            this.LLJ = false;
            FrameLayout frameLayout = this.LLJIJIL;
            if (frameLayout != null && (c1324720kZq = this.LLJI) != null) {
                C786410Ut5.LJJJZ(c1324720kZq, frameLayout);
            }
            C0IEG c0ieg = this.LLJILJIL;
            if (c0ieg != null) {
                c0ieg.aF(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void al() {
        SkylightController skylightController;
        InterfaceC475300IkS interfaceC475300IkS;
        EnterRoomConfig enterRoomConfig;
        C477580Io8 c477580Io8LIZJ;
        if (this.LLILLL == null) {
            return;
        }
        if (LiveNearbyTabSetting.INSTANCE.enable() && this.LLJIJIL != null && !this.LLILZ && !this.LLJ) {
            this.LLJ = true;
            Context context = getContext();
            if (context != null && (((interfaceC475300IkS = this.LLILZIL) != null && (c477580Io8LIZJ = interfaceC475300IkS.LIZJ()) != null && (enterRoomConfig = c477580Io8LIZJ.LJII) != null) || (enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig) != null)) {
                if (this.LLJI == null) {
                    C1324720kZq c1324720kZq = new C1324720kZq(context);
                    this.LLJI = c1324720kZq;
                    c1324720kZq.setPlaceholderImage(C0HAS.LIZ(context));
                    C1324720kZq c1324720kZq2 = this.LLJI;
                    if (c1324720kZq2 != null) {
                        c1324720kZq2.setForeground(new ColorDrawable(C20736316Cj.LIZIZ(R.attr.eui, getContext())));
                    }
                }
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                ArrayList<String> arrayList = roomsData.bgUrls;
                ArrayList<String> arrayList2 = roomsData.gaussianBgUrls;
                if (!BadPhonesWatchLiveCommonUIOptSetting.INSTANCE.getDisableGaussBlurred() && (C0IKQ.LIZIZ(arrayList2) || C0IKQ.LIZIZ(arrayList))) {
                    FrameLayout frameLayout = this.LLJIJIL;
                    if (frameLayout != null) {
                        frameLayout.addView(this.LLJI);
                    }
                    C0IQ7.LIZ(this.LLJI, arrayList2, arrayList, getContext());
                }
            }
        }
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        C475310IkT c475310IkT = this.LLILLJJLI;
        if (c475310IkT != null && (skylightController = c475310IkT.LJFF) != null) {
            C476830Imv c476830Imv = skylightController.LL;
            if (c476830Imv != null) {
                C500260Jjc.LLFFF(c476830Imv.LJIILLIIL);
            }
            skylightController.LLJILJIL = true;
        }
        DataChannelGlobal.LLILZ.FQ2(TopLiveSkylightEntranceEvent.class, new C477110InN(true, "topTab", "topTab", !r6.getValue().enable));
    }

    @Override // X.InterfaceC477100InM
    public final C475460Iki c1() {
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZIL;
        if (interfaceC475300IkS != null) {
            return interfaceC475300IkS.c1();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannelGlobal.LLILZ.zQ2(this);
        C472280Ifa c472280Ifa = this.LLIZ;
        if (c472280Ifa != null) {
            c472280Ifa.setTouchEventInterceptor(null);
        }
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZIL;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.LJIIJ(null);
        }
        C0IEG c0ieg = this.LLJILJIL;
        if (c0ieg != null) {
            c0ieg.aF(null);
        }
        this.LLJILJIL = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewGroup viewGroup;
        super.onDestroyView();
        View view = this.LLILLL;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LLILLL = null;
    }

    @Override // X.InterfaceC477100InM
    public final boolean K4() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC477100InM
    public final EnumC471790Ien getPage() {
        return EnumC471790Ien.ROOM;
    }

    @Override // X.InterfaceC463590IFx
    public final boolean zc() {
        return this.LLJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC479810Irj
    public final void IR(int i) {
        SkylightController skylightController;
        InterfaceC466370IQp currentFragment;
        InterfaceC466370IQp currentFragment2;
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        if (LiveNearbyTabSetting.INSTANCE.getValue().enableSlidingOpt) {
            C0IEG c0ieg = this.LLJILJIL;
            if (c0ieg != null && (currentFragment2 = c0ieg.getCurrentFragment()) != null) {
                currentFragment2.vH();
            }
            C0IEG c0ieg2 = this.LLJILJIL;
            if (c0ieg2 != null && (currentFragment = c0ieg2.getCurrentFragment()) != null) {
                currentFragment.resume();
            }
        }
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZIL;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.LJIIJJI();
        }
        C20441214yg.LJIIIZ("LiveRoomPageFragment", "onSelected");
        InterfaceC475300IkS interfaceC475300IkS2 = this.LLILZIL;
        if (interfaceC475300IkS2 != null) {
            interfaceC475300IkS2.LJIIJ(this.LLIZ);
        }
        InterfaceC475300IkS interfaceC475300IkS3 = this.LLILZIL;
        if (interfaceC475300IkS3 != null) {
            interfaceC475300IkS3.LJII(this.LLIZLLLIL);
        }
        if (!this.LLILZLL) {
            this.LLILZLL = true;
            C475310IkT c475310IkT = this.LLILLJJLI;
            if (c475310IkT != null && (skylightController = c475310IkT.LJFF) != null) {
                C476830Imv c476830Imv = skylightController.LL;
                if (c476830Imv != null) {
                    C500260Jjc.LLFFF(c476830Imv.LJIILLIIL);
                }
                skylightController.LLJILJIL = true;
            }
        }
        InterfaceC475300IkS interfaceC475300IkS4 = this.LLILZIL;
        C0IEG c0iegLJIIIIZZ = null;
        C19EH c19ehPu = null;
        if (interfaceC475300IkS4 != null) {
            InterfaceC475150IkD interfaceC475150IkD = this.LL;
            if (interfaceC475150IkD != null) {
                c19ehPu = interfaceC475150IkD.Pu();
            }
            c0iegLJIIIIZZ = interfaceC475300IkS4.LJIIIIZZ(i, c19ehPu);
        }
        this.LLJILJIL = c0iegLJIIIIZZ;
        if (c0iegLJIIIIZZ != null) {
            c0iegLJIIIIZZ.aF(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void eP(C475260IkO c475260IkO) {
        InterfaceC475150IkD interfaceC475150IkD;
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.getValue().preloadTiming != 0 && c475260IkO.LIZ == EnumC475180IkG.HANGOUT_LOADED_END && (interfaceC475150IkD = this.LL) != null) {
            interfaceC475150IkD.rf();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C472280Ifa c472280Ifa;
        super.onActivityCreated(bundle);
        C20441214yg.LJIIIZ("LiveRoomPageFragment", "onActivityCreated");
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        View view = this.LLILLL;
        C19EH c19ehPu = null;
        if (view instanceof C472280Ifa) {
            c472280Ifa = (C472280Ifa) view;
        } else {
            c472280Ifa = null;
        }
        this.LLIZ = c472280Ifa;
        if (c472280Ifa != null) {
            c472280Ifa.setPageContainer(1);
        }
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZIL;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.LJIIJ(this.LLIZ);
        }
        C475310IkT c475310IkT = this.LLILLJJLI;
        if (c475310IkT != null) {
            InterfaceC475150IkD interfaceC475150IkD = this.LL;
            if (interfaceC475150IkD != null) {
                c19ehPu = interfaceC475150IkD.Pu();
            }
            c475310IkT.LIZIZ(enterRoomConfig, c19ehPu, this.LLIZ);
        }
        C475310IkT c475310IkT2 = this.LLILLJJLI;
        if (c475310IkT2 != null) {
            InterfaceC477170InT interfaceC477170InT = new InterfaceC477170InT() { // from class: X.0IkV
                @Override // X.InterfaceC477170InT
                public final void r(boolean z) {
                    EnumC475180IkG enumC475180IkG;
                    LiveRoomPageFragment liveRoomPageFragment = this.LIZ;
                    if (z) {
                        enumC475180IkG = EnumC475180IkG.TAB_VISIBLE;
                    } else {
                        enumC475180IkG = EnumC475180IkG.TAB_HIDE;
                    }
                    liveRoomPageFragment.Ah(enumC475180IkG);
                }
            };
            SkylightController skylightController = c475310IkT2.LJFF;
            if (skylightController != null) {
                C476830Imv c476830Imv = skylightController.LL;
                if (c476830Imv != null) {
                    c476830Imv.LJIL = interfaceC477170InT;
                }
                skylightController.LLJILLL = interfaceC477170InT;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void onPageScrollStateChanged(int i) {
        InterfaceC466370IQp currentFragment;
        if (LiveNearbyTabSetting.INSTANCE.getValue().enableSlidingOpt && i == 1) {
            C0IEG c0ieg = this.LLJILJIL;
            if (c0ieg != null && (currentFragment = c0ieg.getCurrentFragment()) != null) {
                currentFragment.fN();
                return;
            }
            return;
        }
        if (i != 0 || this.LLJILJILJ) {
            return;
        }
        this.LLILZLL = false;
    }

    @Override // X.InterfaceC479810Irj
    public final void py(int i) {
        C19EH c19ehPu;
        C20441214yg.LJIIIZ("LiveRoomPageFragment", "onUnSelected");
        if (!this.LLILZ) {
            return;
        }
        this.LLILZ = false;
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZIL;
        if (interfaceC475300IkS != null) {
            InterfaceC475150IkD interfaceC475150IkD = this.LL;
            if (interfaceC475150IkD != null) {
                c19ehPu = interfaceC475150IkD.Pu();
            } else {
                c19ehPu = null;
            }
            interfaceC475300IkS.LJIIIIZZ(i, c19ehPu);
        }
        C0IEG c0ieg = this.LLJILJIL;
        if (c0ieg != null) {
            c0ieg.aF(null);
        }
        this.LLJILJIL = null;
    }

    @Override // X.InterfaceC475340IkW
    public final void ya(C0IEG c0ieg) {
        this.LLJILJIL = c0ieg;
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void E2(EnterRoomConfig enterRoomConfig, InterfaceC479830Irl<?> interfaceC479830Irl, C19EH c19eh) {
        C472280Ifa c472280Ifa;
        C20441214yg.LJIIIZ("LiveRoomPageFragment", "onNewIntent");
        View view = this.LLILLL;
        C19EH c19ehPu = null;
        if (view instanceof C472280Ifa) {
            c472280Ifa = (C472280Ifa) view;
            if (c472280Ifa != null) {
                c472280Ifa.setPageContainer(1);
            }
        } else {
            c472280Ifa = null;
        }
        InterfaceC475300IkS interfaceC475300IkS = this.LLILZIL;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.LJIIJ(c472280Ifa);
        }
        C475310IkT c475310IkT = this.LLILLJJLI;
        if (c475310IkT != null) {
            InterfaceC475150IkD interfaceC475150IkD = this.LL;
            if (interfaceC475150IkD != null) {
                c19ehPu = interfaceC475150IkD.Pu();
            }
            c475310IkT.LIZJ(enterRoomConfig, interfaceC479830Irl, c19ehPu, c472280Ifa);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        View viewFindViewById;
        this.LLILLL = viewGroup;
        C786410Ut5.Td(layoutInflater, R.layout.db1, viewGroup, true);
        C475310IkT c475310IkT = this.LLILLJJLI;
        if (c475310IkT != null) {
            View view = this.LLILLL;
            c475310IkT.LJI = view;
            SkylightController skylightController = c475310IkT.LJFF;
            if (skylightController != null) {
                skylightController.LLJILJILJ = view;
            }
        }
        View view2 = this.LLILLL;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.n3v)) != null) {
            viewFindViewById.setId(this.LLIZLLLIL);
        }
        View view3 = this.LLILLL;
        if (view3 != null) {
            frameLayout = (FrameLayout) view3.findViewById(R.id.iiv);
        } else {
            frameLayout = null;
        }
        this.LLJIJIL = frameLayout;
        try {
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
