package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0BKL;
import X.C0CNO;
import X.C0QSJ;
import X.C0RHE;
import X.C0S9L;
import X.C0S9P;
import X.C0S9U;
import X.C0SKM;
import X.C0SKY;
import X.C1386360mBG;
import X.C13LE;
import X.C14LC;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C2245741Cv6;
import X.C438910HIz;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C707520Rp8;
import X.C716660S9g;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1603190roz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import X.InterfaceC710220RtU;
import X.InterfaceC716630S9d;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObserverS215S0100000_11;
import Y.ARunnableS111S0100000_11;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Transformations;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoNumIndicatorVM;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnIndexSetProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS10S0002000_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoNumIndicatorAssem extends BaseCellContentComponent<PhotoNumIndicatorAssem> implements PhotoOnIndexSetProtocol, C0SKY, InterfaceC716630S9d, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final PhotoNumIndicatorAssem LLJJJJLIIL = this;
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public C716660S9g LLJL;
    public ViewPropertyAnimator LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final ARunnableS111S0100000_11 LLJLL;
    public final C01GW LLJLLIL;
    public C0S9U LLJLLL;
    public final BPEAHandler LLJZ;
    public IAutoAScrollAbility LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public volatile InterfaceC696720RUo LLLFF;
    public volatile C0S9L LLLFFI;
    public InterfaceC665370Q7z LLLFZ;
    public C0QSJ LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoNumIndicatorAssem.class, "photoNumIndicatorVM", "getPhotoNumIndicatorVM()Lcom/ss/android/ugc/aweme/ui/feed/photos/PhotoNumIndicatorVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoNumIndicatorAssem.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PhotoNumIndicatorAssem.class, "photoSlideInternalAbility", "getPhotoSlideInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class});
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        return arrayList;
    }

    private C0QSJ ep() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLI;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLFZ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLFZ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
        this.LLLI = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    private final boolean ie() {
        InterfaceC696720RUo interfaceC696720RUo = this.LLLFF;
        if (interfaceC696720RUo == null) {
            synchronized (this) {
                interfaceC696720RUo = this.LLLFF;
                if (interfaceC696720RUo == null) {
                    C0QSJ c0qsjEp = ep();
                    if (c0qsjEp != null) {
                        interfaceC696720RUo = (InterfaceC696720RUo) c0qsjEp.getAbility(InterfaceC696720RUo.class);
                        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
                    } else {
                        interfaceC696720RUo = null;
                    }
                    this.LLLFF = interfaceC696720RUo;
                }
            }
        }
        return interfaceC696720RUo.ie();
    }

    private final C0S9L op() {
        C0S9L c0s9l = this.LLLFFI;
        if (c0s9l == null) {
            synchronized (this) {
                c0s9l = this.LLLFFI;
                if (c0s9l == null) {
                    C0QSJ c0qsjEp = ep();
                    C0S9L c0s9l2 = c0qsjEp != null ? (C0S9L) c0qsjEp.getAbility(C0S9L.class) : null;
                    this.LLLFFI = c0s9l2;
                    return c0s9l2;
                }
            }
        }
        return c0s9l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hp() {
        C716660S9g c716660S9g = this.LLJL;
        if (c716660S9g == null) {
            return;
        }
        if (((Number) C0BKL.LIZ.getValue()).intValue() < 1 || !((C0S9P) sp().getState()).LLJJJJLIIL) {
            if (sp().zQ2() > 1) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (!AwemeExtKt.isAdTraffic(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
                    this.LLJZ.removeCallbacks(this.LLJLL);
                    C0CNO.LIZLLL(0L, new AwS412S0200000_11(this, c716660S9g, 34));
                    yp();
                    return;
                }
            }
            if (C0RHE.LIZLLL() && sp().zQ2() == 1) {
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (!AwemeExtKt.isAdTraffic(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme())) {
                    return;
                }
            }
            ViewPropertyAnimator viewPropertyAnimator = this.LLJLIL;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.LLJLIL = C438910HIz.LIZ(c716660S9g, 150L, 2);
        }
    }

    public final PhotoNumIndicatorVM mp() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        return (PhotoNumIndicatorVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C716660S9g c716660S9g = this.LLJL;
        if (c716660S9g != null) {
            C786410Ut5.k1(c716660S9g, 8);
        }
    }

    public final PhotoViewModelV2 sp() {
        return (PhotoViewModelV2) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (AwemeExtKt.isAdTraffic(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) || ie()) {
            return;
        }
        C0CNO.LIZLLL(0L, new AwS555S0100000_11(this, 1039));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJZ.removeCallbacks(this.LLJLL);
        Ap();
        ViewPropertyAnimator viewPropertyAnimator = this.LLJLIL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = false;
    }

    public final void yp() {
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ;
        if (this.LLJZIJLIL == null && (iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(C724240Sb0.LIZ(this))) != null) {
            this.LLJZIJLIL = iAutoAScrollAbilityLIZIZ;
            Transformations.distinctUntilChanged(iAutoAScrollAbilityLIZIZ.dr1()).observe(this, new AObserverS215S0100000_11(this, 5));
        }
    }

    public PhotoNumIndicatorAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhotoNumIndicatorVM.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 1043);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(524);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS555S0100000_11, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((AbstractC738140SxQ) this, 1038), aFwS243S0000000_11, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJL = assemVMLazy;
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(523));
        this.LLJLL = new ARunnableS111S0100000_11(this, 56);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1040));
        this.LLJZ = new BPEAHandler(Looper.getMainLooper());
        this.LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1041));
        this.LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1042));
    }

    public final void Ap() {
        if (kp()) {
            C716660S9g c716660S9g = this.LLJL;
            if (c716660S9g != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c716660S9g);
                c716660S9g.setAlpha(0.0f);
            }
            C0S9U c0s9u = this.LLJLLL;
            if (c0s9u != null) {
                this.LLJZ.removeCallbacks(c0s9u);
                this.LLJLLL = null;
            }
        }
    }

    public final boolean Bp() {
        if (sp().zQ2() <= 1) {
            return false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (C2245741Cv6.LIZJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            return false;
        }
        IPausePanelAbility iPausePanelAbility = (IPausePanelAbility) this.LLL.getValue();
        return (iPausePanelAbility == null || !iPausePanelAbility.VA0()) && !ie();
    }

    public final boolean kp() {
        return lp() && C0SKM.LJIIIIZZ().uiPieceDelayTime > 0;
    }

    public final boolean lp() {
        InterfaceC710220RtU interfaceC710220RtUYn;
        C0S9L c0s9lOp = op();
        return (c0s9lOp == null || (interfaceC710220RtUYn = c0s9lOp.yn()) == null || !interfaceC710220RtUYn.LJIILJJIL()) ? false : true;
    }

    public final boolean up() {
        if (!kp()) {
            hp();
            return false;
        }
        C0S9U c0s9u = this.LLJLLL;
        if (c0s9u != null) {
            String str = c0s9u.LLILLJJLI;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (Intrinsics.LJFF(str, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid())) {
                return true;
            }
        }
        this.LLJZ.removeCallbacks((C0S9U) this.LLJLLIL.getValue());
        this.LLJLLL = (C0S9U) this.LLJLLIL.getValue();
        C0S9U c0s9u2 = (C0S9U) this.LLJLLIL.getValue();
        C724270Sb3 c724270Sb32 = this.LLJI;
        c0s9u2.LLILLJJLI = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid();
        C786410Ut5.LJLIIL(C0SKM.LJIIIIZZ().uiPieceDelayTime, this.LLJZ, (C0S9U) this.LLJLLIL.getValue());
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        tp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        final View viewFindViewById;
        ViewTreeObserver viewTreeObserver;
        InterfaceC710220RtU interfaceC710220RtUYn;
        C0S9L c0s9lOp = op();
        final boolean z = true;
        if (c0s9lOp != null && (interfaceC710220RtUYn = c0s9lOp.yn()) != null && interfaceC710220RtUYn.isEnable()) {
            return;
        }
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLF.getValue();
        if ((iScreenComponentAbility == null || iScreenComponentAbility.z71()) && C14LC.LJIILL > 0) {
            z = false;
        }
        if (C724240Sb0.LIZ(this) instanceof InterfaceC1603190roz) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null) {
                return;
            } else {
                viewFindViewById = c19egLIZ.findViewById(R.id.tpm);
            }
        } else {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 == null) {
                return;
            } else {
                viewFindViewById = c19egLIZ2.findViewById(R.id.ija);
            }
        }
        if (viewFindViewById == null || (viewTreeObserver = viewFindViewById.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0S9V
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C716660S9g c716660S9g;
                ViewTreeObserver viewTreeObserver2 = viewFindViewById.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + (z ? viewFindViewById.getHeight() : 0);
                if (this.mp().getState().LLILLJJLI <= 0 && (c716660S9g = this.LLJL) != null) {
                    C0H9H.LJI(iLIZIZ, c716660S9g);
                }
                PhotoNumIndicatorVM photoNumIndicatorVMMp = this.mp();
                IScreenComponentAbility iScreenComponentAbility2 = (IScreenComponentAbility) this.LLLF.getValue();
                photoNumIndicatorVMMp.setState(new AwS10S0002000_11(iLIZIZ, iScreenComponentAbility2 != null ? iScreenComponentAbility2.eD2() : 0, 2));
            }
        };
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        tp();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnIndexSetProtocol
    public final void Sn0(int i) {
        mp().setState(new AwS26S0001000_11(i + 1, 11));
    }

    @Override // X.C0SKY
    public final void Zk(int i) {
        mp().setState(new AwS26S0001000_11(i, 12));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).unbindAbility(this.LLJJJJLIIL, C0SKY.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (C716660S9g) view.findViewById(R.id.qen);
        mp().setState(new AwS26S0001000_11(((C0S9P) sp().getState()).LL + 1, 11));
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0S9Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9Z) obj).LLIZ);
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(167), 4);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0S9a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9Z) obj).LLILZLL);
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(168), 4);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0S9W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0S9Z) obj).LLILZ);
            }
        }, null, AFwS294S0000000_11.get$arr$(169), 6);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0RVM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, AFwS294S0000000_11.get$arr$(170), 6);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0S9X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLILZIL);
            }
        }, null, AFwS294S0000000_11.get$arr$(163), 6);
        if (((Number) C0BKL.LIZ.getValue()).intValue() >= 1) {
            C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0S9T
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C0S9P) obj).LLJJJJLIIL);
                }
            }, null, AFwS294S0000000_11.get$arr$(164), 6);
        }
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0RVO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(165), 4);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0RVP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(166), 4);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoOnIndexSetProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoOnIndexSetProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).bindAbility(this.LLJJJJLIIL, C0SKY.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC716630S9d
    public final void pg(String str) {
        Object obj = null;
        this.LLJLLL = null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        if (!Intrinsics.LJFF(((VideoItemParams) obj).getAweme().getAid(), str)) {
            return;
        }
        hp();
        if (((C0S9P) sp().getState()).LLJJIJIL || !((C0S9P) sp().getState()).LLILZIL) {
            ip(this, false, true, Mp4ScreenVideoLoadTimeout.CONTROL, 8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        InterfaceC710220RtU interfaceC710220RtUYn;
        C0S9L c0s9lOp;
        InterfaceC710220RtU interfaceC710220RtUYn2;
        C716660S9g c716660S9g = this.LLJL;
        if (c716660S9g != null) {
            c716660S9g.setTotalNum(sp().zQ2());
        }
        C0S9L c0s9lOp2 = op();
        if (c0s9lOp2 != null && (interfaceC710220RtUYn = c0s9lOp2.yn()) != null && interfaceC710220RtUYn.isEnable() && (c0s9lOp = op()) != null && (interfaceC710220RtUYn2 = c0s9lOp.yn()) != null) {
            interfaceC710220RtUYn2.LJIIIZ(videoItemParams.getAweme().getAid());
        }
    }

    @Override // X.C0SKY
    public final void R3(int i, int i2) {
        mp().setState(new AwS10S0002000_11(i, i2, 3));
    }

    public static void ip(PhotoNumIndicatorAssem photoNumIndicatorAssem, boolean z, boolean z2, long j, int i) {
        boolean z3;
        long j2 = j;
        boolean z4 = z2;
        boolean z5 = z;
        if ((i & 1) != 0) {
            z5 = false;
        }
        if ((i & 2) != 0) {
            z4 = true;
        }
        if ((i & 4) != 0) {
            j2 = 2000;
        }
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        photoNumIndicatorAssem.getClass();
        C0CNO.LIZLLL(0L, new C707520Rp8(photoNumIndicatorAssem, z3, z4, j2, z5));
    }
}
