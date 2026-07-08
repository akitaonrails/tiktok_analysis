package com.ss.android.ugc.aweme.ui.feed.collection;

import X.C01GW;
import X.C0QSJ;
import X.C0RGG;
import X.C0SAP;
import X.C0SLJ;
import X.C0SLS;
import X.C0SUL;
import X.C13LE;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C294910BhB;
import X.C452501pT;
import X.C586380MzE;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C714060Rzg;
import X.C724270Sb3;
import X.C737910Sx3;
import X.EnumC1616310sA9;
import X.EnumC719760SLe;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import X.InterfaceC713360RyY;
import X.InterfaceC737790Swr;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoGestureInterceptComponent;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoTouchInterceptorProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoPinchInterceptorInCollectionComponent extends BaseCellLogicComponent<PhotoGestureInterceptComponent> implements C0SLJ, C0SLS, IPinchMonitorAbility, PhotoTouchInterceptorProtocol, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(498));
    public final PhotoPinchInterceptorInCollectionComponent LLJJIJIIJIL = this;
    public final PhotoPinchInterceptorInCollectionComponent LLJJIJIL = this;
    public final C630740Ooa LLJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 972));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 973));
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public volatile InterfaceC696720RUo LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoPinchInterceptorInCollectionComponent.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC720380SNo
    public final void Ei() {
    }

    @Override // X.C0SLS
    public final void LJJJIL() {
        this.LLJJJJ = true;
    }

    @Override // X.C0SLS
    public final void LJZL() {
        this.LLJJJJ = false;
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

    @Override // X.C0SLJ
    public final void Na(float f, boolean z, EnumC719760SLe enumC719760SLe) {
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

    @Override // X.C0SLJ
    public final void n(float f) {
    }

    @Override // X.C0SLJ
    public final float x7() {
        return 1.0f;
    }

    public final InterfaceC696720RUo Bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJLIIIJLLLLLLLZ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
            this.LLJJLIIIJLLLLLLLZ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC696720RUo interfaceC696720RUo = (InterfaceC696720RUo) c0qsjLIZLLL.getAbility(InterfaceC696720RUo.class);
        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
        return interfaceC696720RUo;
    }

    @Override // X.C0SLS
    public final boolean b1() {
        InterfaceC696720RUo interfaceC696720RUoBo = this.LLJJJJLIIL;
        if (interfaceC696720RUoBo == null) {
            synchronized (this) {
                interfaceC696720RUoBo = this.LLJJJJLIIL;
                if (interfaceC696720RUoBo == null) {
                    interfaceC696720RUoBo = Bo();
                    this.LLJJJJLIIL = interfaceC696720RUoBo;
                }
            }
        }
        return interfaceC696720RUoBo.ke();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        if (this.LLJJJJJIL) {
            Eo(null, false);
        }
        this.LLJJJJJIL = false;
    }

    public final boolean Co() {
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
        if (Co()) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            C0RGG c0rggLIZ = C586380MzE.LIZ();
            C724270Sb3 c724270Sb3 = this.LLJI;
            boolean z = !c0rggLIZ.LIZJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType);
            this.LLJJJJJIL = z;
            if (z) {
                Eo(null, true);
            }
        }
        PhotoViewModelV2 photoViewModelV2 = (PhotoViewModelV2) this.LLJJIJI.getValue();
        photoViewModelV2.getClass();
        photoViewModelV2.setState(AFwS243S0000000_11.get$arr$(822));
        photoViewModelV2.withState(new AwS590S0100000_11(photoViewModelV2, 588));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onDestroy();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJJ.getValue();
        if (commonCellAbility == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        InterfaceC696720RUo interfaceC696720RUoBo = this.LLJJJJLIIL;
        if (interfaceC696720RUoBo == null) {
            synchronized (this) {
                interfaceC696720RUoBo = this.LLJJJJLIIL;
                if (interfaceC696720RUoBo == null) {
                    interfaceC696720RUoBo = Bo();
                    this.LLJJJJLIIL = interfaceC696720RUoBo;
                }
            }
        }
        if (interfaceC696720RUoBo.ie()) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IPinchMonitorAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJJ.getValue();
        if (commonCellAbility != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
            InterfaceC696720RUo interfaceC696720RUoBo = this.LLJJJJLIIL;
            if (interfaceC696720RUoBo == null) {
                synchronized (this) {
                    interfaceC696720RUoBo = this.LLJJJJLIIL;
                    if (interfaceC696720RUoBo == null) {
                        interfaceC696720RUoBo = Bo();
                        this.LLJJJJLIIL = interfaceC696720RUoBo;
                    }
                }
            }
            if (interfaceC696720RUoBo.ie()) {
                C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IPinchMonitorAbility.class, null, null);
            }
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoTouchInterceptorProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.collection.PhotoPinchInterceptorInCollectionComponent$onParentSet$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoTouchInterceptorProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility
    public final boolean Eo0() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLJJIJIL, C0SLJ.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJIJIIJIL, C0SLS.class);
    }

    @Override // X.InterfaceC720380SNo
    public final void onTouchEvent(MotionEvent motionEvent) {
        C0SUL c0sul = (C0SUL) this.LLJJJIL.getValue();
        if (c0sul != null) {
            c0sul.onTouchEvent(motionEvent);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PhotoSlideScope.class});
        c0qsjLIZIZ.bindAbility(this.LLJJIJIL, C0SLJ.class);
        c0qsjLIZIZ.bindAbility(this.LLJJIJIIJIL, C0SLS.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }

    public final void Eo(String str, boolean z) {
        Object obj;
        int type = EnumC1616310sA9.PINCH_ZOOM.getType();
        if (z || str == null) {
            str = "pinch";
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C1440005kM.LIZ(new C714060Rzg(z, type, str, ((VideoItemParams) obj).mEventType));
    }

    @Override // X.C0SLJ
    public final void w2(float f, boolean z, EnumC719760SLe enumC719760SLe, float f2, String str, String str2) {
        Object obj;
        ((PhotoViewModelV2) this.LLJJIJI.getValue()).IQ2(Float.valueOf(f), Boolean.valueOf(z), Float.valueOf(f2), str);
        if (Co() && this.LLJJJJJIL && enumC719760SLe == EnumC719760SLe.NORMAL) {
            Eo(str2, false);
            this.LLJJJJJIL = false;
        }
        if (enumC719760SLe == EnumC719760SLe.NORMAL) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            C0SAP.LIZIZ(f, aweme, ((VideoItemParams) obj2).mEventType, str2);
        }
    }
}
