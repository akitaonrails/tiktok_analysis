package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0QSJ;
import X.C0RGG;
import X.C0S9L;
import X.C0SAP;
import X.C0SKM;
import X.C0SLJ;
import X.C0SUL;
import X.C13LE;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C2217381BqS;
import X.C294910BhB;
import X.C298560Bn4;
import X.C452501pT;
import X.C586380MzE;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C714060Rzg;
import X.C716990SAn;
import X.C724270Sb3;
import X.C737910Sx3;
import X.EnumC1616310sA9;
import X.EnumC719760SLe;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoTouchInterceptorProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoGestureInterceptComponent extends BaseCellLogicComponent<PhotoGestureInterceptComponent> implements C0SLJ, PanelSingleTapInterceptAbility, PhotoTouchInterceptorProtocol, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final PhotoGestureInterceptComponent LLJJIJI = this;
    public final C01GW LLJJIJIIJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(515));
    public final C630740Ooa LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1020));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1019));
    public boolean LLJJJIL;
    public volatile C0S9L LLJJJJ;
    public InterfaceC665370Q7z LLJJJJJIL;
    public C0QSJ LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoGestureInterceptComponent.class, "photoSlideInternalAbility", "getPhotoSlideInternalAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideInternalAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C0S9L Co() {
        C0S9L c0s9l = this.LLJJJJ;
        if (c0s9l == null) {
            synchronized (this) {
                c0s9l = this.LLJJJJ;
                if (c0s9l == null) {
                    C0S9L c0s9lBo = Bo();
                    this.LLJJJJ = c0s9lBo;
                    return c0s9lBo;
                }
            }
        }
        return c0s9l;
    }

    @Override // X.InterfaceC720380SNo
    public final void Ei() {
    }

    @Override // X.C0SLJ
    public final PointF LLILIL() {
        return null;
    }

    @Override // X.C0SLJ
    public final void LLLL() {
    }

    @Override // X.C0SLJ
    public final void Ld() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class, VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PhotoSlideScope.class);
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.C0SLJ
    public final void n(float f) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1804422228) {
            return null;
        }
        return this;
    }

    @Override // X.C0SLJ
    public final float x7() {
        return 1.0f;
    }

    public final C0S9L Bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJJJLIIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJJJJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
            this.LLJJJJLIIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C0S9L c0s9l = (C0S9L) c0qsjLIZLLL.getAbility(C0S9L.class);
        C687700QyG.LJ(c0s9l, C0S9L.class);
        return c0s9l;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        if (this.LLJJJIL) {
            Go(null, false);
        }
        this.LLJJJIL = false;
    }

    public final boolean Eo() {
        if (C294910BhB.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            if (aweme == null || !aweme.isAd()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0SLJ
    public final void N() {
        if (Eo()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            C0RGG c0rggLIZ = C586380MzE.LIZ();
            C724270Sb3 c724270Sb3 = this.LLJI;
            boolean z = !c0rggLIZ.LIZJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType);
            this.LLJJJIL = z;
            if (z) {
                Go(null, true);
            }
        }
        PhotoViewModelV2 photoViewModelV2 = (PhotoViewModelV2) this.LLJJIJIIJIL.getValue();
        photoViewModelV2.getClass();
        photoViewModelV2.setState(AFwS243S0000000_11.get$arr$(822));
        photoViewModelV2.withState(new AwS590S0100000_11(photoViewModelV2, 588));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoTouchInterceptorProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoGestureInterceptComponent$onParentSet$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoTouchInterceptorProtocol.class, this);
                    }
                }
            });
        }
    }

    public final void Fo(float f) {
        Object obj;
        Object obj2;
        Object obj3;
        if (C0SKM.LJII() && f < PinchToClearModeSettings.LIZ().enterScale) {
            Co().LLJJIJIL(null, false, false);
            return;
        }
        if (C0SKM.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String str = ((VideoItemParams) obj2).mEventType;
            if (C716990SAn.LIZ() && aweme != null) {
                ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
                if ((iCommercePromoteService != null && iCommercePromoteService.LJIIJ(aweme)) || AwemeSaaSExtKt.isLive(aweme)) {
                    return;
                }
                boolean zLJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJLIIIJ().LJIIJ();
                C01GW<C0RGG> c01gw = C0RGG.LJ;
                boolean zLIZJ = C586380MzE.LIZ().LIZJ(str);
                if ((f < PinchToClearModeSettings.LIZ().enterScale && !zLJIIJ) || zLIZJ) {
                    if (f <= PinchToClearModeSettings.LIZ().exitScale && zLIZJ) {
                        return;
                    }
                    if (f >= PinchToClearModeSettings.LIZ().enterScale) {
                        if (!zLIZJ) {
                            return;
                        }
                    } else if (!zLIZJ) {
                        return;
                    }
                }
                C01GW<C0RGG> c01gw2 = C0RGG.LJ;
                C0RGG c0rggLIZ = C586380MzE.LIZ();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                if (c0rggLIZ.LIZJ(((VideoItemParams) obj3).mEventType) && !this.LLJJJIL) {
                    return;
                }
                Co().Nd();
                if (!C0SKM.LJII()) {
                    return;
                }
                Co().LLJJIJIL(null, true, false);
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).unbindAbility(this.LLJJIJI, C0SLJ.class);
    }

    @Override // X.InterfaceC720380SNo
    public final void onTouchEvent(MotionEvent motionEvent) {
        C0SUL c0sul = (C0SUL) this.LLJJJ.getValue();
        if (c0sul != null) {
            c0sul.onTouchEvent(motionEvent);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class}).bindAbility(this.LLJJIJI, C0SLJ.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }

    public final void Go(String str, boolean z) {
        Object obj;
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        C0RGG c0rggLIZ = C586380MzE.LIZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (c0rggLIZ.LIZJ(((VideoItemParams) obj).mEventType) == z) {
            return;
        }
        int type = EnumC1616310sA9.PINCH_ZOOM.getType();
        if (z || str == null) {
            str = "pinch";
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        C1440005kM.LIZ(new C714060Rzg(z, type, str, ((VideoItemParams) obj2).mEventType));
    }

    @Override // X.C0SLJ
    public final void Na(float f, boolean z, EnumC719760SLe enumC719760SLe) {
        Fo(f);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility
    public final boolean tw0(int i, long j, Object obj) {
        Object obj2;
        Object obj3;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        if (C298560Bn4.LIZ() && (iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJJIJIL.getValue()) != null && iPhotoSlidesAbility.UH1()) {
            return true;
        }
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null);
        if (iAdPhotoModeService != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme = ((VideoItemParams) obj2).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj3 = c724270Sb32.LL;
            } else {
                obj3 = null;
            }
            getContext();
            if (iAdPhotoModeService.LJIILIIL(aweme, (IPhotoSlidesAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoSlidesAbility.class, null), obj)) {
                return true;
            }
        }
        ((PhotoViewModelV2) this.LLJJIJIIJIL.getValue()).xQ2();
        return false;
    }

    @Override // X.C0SLJ
    public final void w2(float f, boolean z, EnumC719760SLe enumC719760SLe, float f2, String str, String str2) {
        Object obj;
        Object obj2;
        Object obj3;
        ((PhotoViewModelV2) this.LLJJIJIIJIL.getValue()).IQ2(Float.valueOf(f), Boolean.valueOf(z), Float.valueOf(f2), str);
        if (Eo()) {
            if (enumC719760SLe == EnumC719760SLe.NORMAL) {
                Go(str2, false);
            } else if (enumC719760SLe == EnumC719760SLe.CLEAR_MODE) {
                Go(null, true);
            }
        } else {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            C0SAP.LIZIZ(f, aweme, ((VideoItemParams) obj2).mEventType, str2);
        }
        if (C0SKM.LJII() && enumC719760SLe == EnumC719760SLe.NORMAL) {
            if (f >= PinchToClearModeSettings.LIZ().enterScale) {
                C01GW<C0RGG> c01gw = C0RGG.LJ;
                C0RGG c0rggLIZ = C586380MzE.LIZ();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                if (c0rggLIZ.LIZJ(((VideoItemParams) obj3).mEventType)) {
                    return;
                }
            }
            Co().LLJJIJIL(null, false, true);
        }
    }
}
