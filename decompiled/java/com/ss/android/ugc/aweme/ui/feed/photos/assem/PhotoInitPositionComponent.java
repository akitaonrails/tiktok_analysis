package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AnonymousClass0762;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0RH3;
import X.C0S9L;
import X.C0S9P;
import X.C1012040cRW;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1584400rKg;
import X.C1697810uHb;
import X.C1EE2;
import X.C2217381BqS;
import X.C294960BhG;
import X.C452501pT;
import X.C687700QyG;
import X.C696330RTb;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.EnumC721170SQp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoAfterViewPagerItemSetProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoDetailNavigationProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoGetInitPositionProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoInitPositionComponent extends BaseCellLogicComponent<PhotoInitPositionComponent> implements PhotoDetailNavigationProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(516));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1021));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1022));
    public boolean LLJJJ = C1012040cRW.LIZIZ().LJFF;
    public boolean LLJJJIL;
    public volatile InterfaceC696720RUo LLJJJJ;
    public volatile C0S9L LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoInitPositionComponent.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoInitPositionComponent.class, "photoSlideInternalAbility", "getPhotoSlideInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC717050SAt
    public final void Qk(EnumC721170SQp enumC721170SQp) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC717050SAt
    public final void oi() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0RUx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(159), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0RUy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(160), 4);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoDetailNavigationProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoInitPositionComponent$onCreate$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoDetailNavigationProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final C0QSJ Bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJLIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJJLIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
        this.LLJJL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC696720RUo Fo() {
        InterfaceC696720RUo interfaceC696720RUo;
        InterfaceC696720RUo interfaceC696720RUo2 = this.LLJJJJ;
        if (interfaceC696720RUo2 == null) {
            synchronized (this) {
                interfaceC696720RUo2 = this.LLJJJJ;
                if (interfaceC696720RUo2 == null) {
                    C0QSJ c0qsjBo = Bo();
                    if (c0qsjBo != null) {
                        interfaceC696720RUo = (InterfaceC696720RUo) c0qsjBo.getAbility(InterfaceC696720RUo.class);
                        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
                    } else {
                        interfaceC696720RUo = null;
                    }
                    this.LLJJJJ = interfaceC696720RUo;
                    return interfaceC696720RUo;
                }
            }
        }
        return interfaceC696720RUo2;
    }

    public final PhotoViewModelV2 Go() {
        return (PhotoViewModelV2) this.LLJJIJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ho() {
        Fragment fragmentLJI;
        String strCt0;
        C0RH3 c0rh3LIZJ;
        String strZj2;
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        if (c1ee2.LJIJ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (AwemeExtKt.isAdTraffic(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) || Fo().ke() || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
                return;
            }
            C1584400rKg.LIZ.getClass();
            if (C1584400rKg.LIZ(fragmentLJI)) {
                HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJJIJIL.getValue();
                String str = "";
                if (homeTabAbility == null || (strCt0 = homeTabAbility.Ct0()) == null) {
                    strCt0 = "";
                }
                HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJJIJIL.getValue();
                if (homeTabAbility2 != null && (strZj2 = homeTabAbility2.Zj2()) != null) {
                    str = strZj2;
                }
                C696330RTb c696330RTb = (C696330RTb) this.LLJJIJIIJIL.getValue();
                long j = (c696330RTb == null || (c0rh3LIZJ = c696330RTb.LIZJ()) == null) ? 0L : c0rh3LIZJ.LIZ + c0rh3LIZJ.LIZIZ;
                PhotoViewModelV2 photoViewModelV2Go = Go();
                C724270Sb3 c724270Sb32 = this.LLJI;
                photoViewModelV2Go.LLILZLL = c1ee2.LJ(strCt0, str, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid()) + j;
                C724270Sb3 c724270Sb33 = this.LLJI;
                c1ee2.LJJLIIIJJI(((C0S9P) Go().getState()).LL, strCt0, Go().LLILZLL, ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getAid(), str, Go().LLIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Ho();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Co(int r13) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoInitPositionComponent.Co(int):int");
    }

    public final void Eo(int i) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PhotoAfterViewPagerItemSetProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((PhotoAfterViewPagerItemSetProtocol) it2.next()).YQ(i, true);
            }
        }
        List listLIZIZ2 = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PhotoGetInitPositionProtocol.class, false);
        if (listLIZIZ2 != null) {
            Iterator it3 = listLIZIZ2.iterator();
            while (it3.hasNext()) {
                ((PhotoGetInitPositionProtocol) it3.next()).BU0(1, i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        Ho();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        if (!this.LLJJJIL && C294960BhG.LIZ()) {
            C736680Sv4.LJIJJLI(Go(), new AwS377S0200000_11(this, (PhotoInitPositionComponent) new AwS590S0100000_11(this, 290), (Function1<? super Integer, Unit>) 174));
        }
        this.LLJJJIL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        if (((Number) AnonymousClass0762.LIZ.getValue()).intValue() == 1 && this.LLJJJ && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Eo(Co(((C0S9P) Go().getState()).LL));
        } else {
            C736680Sv4.LJIJJLI(Go(), new AwS377S0200000_11(this, (PhotoInitPositionComponent) new AwS590S0100000_11(this, 605), (Function1<? super Integer, Unit>) 174));
        }
    }

    @Override // X.InterfaceC717050SAt
    public final void K6(int i, boolean z) {
        C0S9L c0s9l = this.LLJJJJJIL;
        if (c0s9l == null) {
            synchronized (this) {
                c0s9l = this.LLJJJJJIL;
                if (c0s9l == null) {
                    C0QSJ c0qsjBo = Bo();
                    if (c0qsjBo != null) {
                        c0s9l = (C0S9L) c0qsjBo.getAbility(C0S9L.class);
                    } else {
                        c0s9l = null;
                    }
                    this.LLJJJJJIL = c0s9l;
                }
            }
        }
        if (c0s9l != null) {
            c0s9l.O0(i, false, true);
        }
        if (i > -1) {
            Go().EQ2(i);
            PhotoViewModelV2 photoViewModelV2Go = Go();
            photoViewModelV2Go.getClass();
            photoViewModelV2Go.setState(new AwS26S0010000_11(z, 22));
            Go().LLILZ = i;
        }
        this.LLJJJIL = true;
    }
}
