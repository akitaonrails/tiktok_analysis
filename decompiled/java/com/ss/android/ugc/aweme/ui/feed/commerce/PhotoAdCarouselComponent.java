package com.ss.android.ugc.aweme.ui.feed.commerce;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0H9H;
import X.C0QSJ;
import X.C0SCE;
import X.C0SCF;
import X.C0SCL;
import X.C0SCS;
import X.C0SLX;
import X.C0SM6;
import X.C1220000hqw;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C719880SLq;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1008930cMV;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC696720RUo;
import X.InterfaceC719500SKe;
import X.InterfaceC737790Swr;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoModeAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.commerce.PhotoAdCarouselComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoGetInitPositionProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnIndexSetProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnPageSelectedInterceptProtocol;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoTouchInterceptorProtocol;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS119S0101000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoAdCarouselComponent extends BaseCellContentComponent<PhotoAdCarouselComponent> implements InterfaceC469360Ias, ICarouselComponentTranslationAbility, ICommercePhotoSlideAbility, PhotoOnPageSelectedInterceptProtocol, PhotoGetInitPositionProtocol, PhotoOnIndexSetProtocol, PhotoTouchInterceptorProtocol, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final PhotoAdCarouselComponent LLJJJJLIIL = this;
    public final PhotoAdCarouselComponent LLJJL = this;
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(500));
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(501));
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C630740Ooa LLJLL;
    public final C01GW LLJLLIL;
    public C0SCF LLJLLL;
    public C0SLX LLJZ;
    public ViewGroup LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public int LLLFF;
    public int LLLFFI;
    public volatile InterfaceC696720RUo LLLFZ;
    public InterfaceC665370Q7z LLLI;
    public C0QSJ LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoAdCarouselComponent.class, "photoSlideComponentContext", "getPhotoSlideComponentContext()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoSlideComponentContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoAdCarouselComponent.class, "photoCellLayoutAbility", "getPhotoCellLayoutAbility()Lcom/ss/android/ugc/aweme/ui/feed/ability/IPhotoCellLayoutAbility;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC720380SNo
    public final void Ei() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoSlideScope.class, VideoCellScope.class});
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
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    public final PhotosViewHolderV3 ip() {
        PhotosViewHolderV3 photosViewHolderV3;
        View view;
        View childAt;
        try {
            C0SLX c0slx = this.LLJZ;
            if (c0slx != null) {
                int childCount = c0slx.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0SLX c0slx2 = this.LLJZ;
                    Object tag = (c0slx2 == null || (childAt = c0slx2.getChildAt(i)) == null) ? null : childAt.getTag(R.id.el8);
                    if ((tag instanceof PhotosViewHolderV3) && (photosViewHolderV3 = (PhotosViewHolderV3) tag) != null && (view = photosViewHolderV3.LL) != null && ((TuxIconView) view.findViewById(R.id.qcq)) != null) {
                        return photosViewHolderV3;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -405340695 || iHashCode == 1568720375) {
            return this;
        }
        return null;
    }

    public final InterfaceC696720RUo ep() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLII;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLI;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLI = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PhotoSlideScope.class});
            this.LLLII = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC696720RUo interfaceC696720RUo = (InterfaceC696720RUo) c0qsjLIZLLL.getAbility(InterfaceC696720RUo.class);
        C687700QyG.LJ(interfaceC696720RUo, InterfaceC696720RUo.class);
        return interfaceC696720RUo;
    }

    public final void hp() {
        C0SLX c0slx;
        if (this.LLL) {
            ICommercePhotoModeAbility iCommercePhotoModeAbility = (ICommercePhotoModeAbility) this.LLJLL.getValue();
            if (iCommercePhotoModeAbility != null) {
                iCommercePhotoModeAbility.g00();
            }
            this.LLLF = true;
        }
        if (this.LLLFFI == 1 && (c0slx = this.LLJZ) != null && c0slx.getCurrentItem() == lp()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS111S0100000_11(this, 187));
        }
    }

    public final InterfaceC1008930cMV kp() {
        IFeedService iFeedServiceLIZIZ;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService == null || (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) == null) {
            return null;
        }
        Context context = getContext();
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        return iFeedServiceLIZIZ.LIZJ(context, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), str, true);
    }

    public final PhotoViewModelV2 mp() {
        return (PhotoViewModelV2) this.LLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C719880SLq c719880SLq;
        C0SCF c0scf = this.LLJLLL;
        if (c0scf != null) {
            c0scf.clear();
        }
        C0SLX c0slx = this.LLJZ;
        PagerAdapter adapter = c0slx != null ? c0slx.getAdapter() : null;
        if ((adapter instanceof C719880SLq) && (c719880SLq = (C719880SLq) adapter) != null) {
            c719880SLq.LLJJLIIIJLLLLLLLZ = null;
        }
        this.LLJLLL = null;
    }

    public PhotoAdCarouselComponent() {
        new AwS555S0100000_11(this, 990);
        C13LE.LIZ(PhotoSharedViewModel.class);
        AFwS243S0000000_11.get$arr$(502);
        new AwS555S0100000_11((AbstractC738140SxQ) this, 991);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        this.LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 988));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 989));
        this.LLJLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 986));
        this.LLJLLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS555S0100000_11(this, 987));
        this.LLLFF = -1;
        this.LLLFFI = 1;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility
    public final void C81() {
        mp().C81();
    }

    public final int lp() {
        return mp().zQ2();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnPageSelectedInterceptProtocol
    public final boolean LF0(int i) {
        if (i == lp() - 1 && this.LLLF) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility
    public final void LJJLJ(IAdTranslationData iAdTranslationData) {
        C0SCF c0scf = this.LLJLLL;
        if (c0scf != null) {
            c0scf.LJJLJ(iAdTranslationData);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility
    public final void LJZ(IAdTranslatableData iAdTranslatableData) {
        C0SCF c0scf = this.LLJLLL;
        if (c0scf != null) {
            c0scf.LJZ(iAdTranslatableData);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnIndexSetProtocol
    public final void Sn0(int i) throws JSONException {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        IFeedService iFeedServiceLIZIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ();
        Context context = getContext();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        String str = ((VideoItemParams) obj).mEventType;
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj2 = c724270Sb33.LL;
        }
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(context, ((VideoItemParams) obj2).getAweme(), str, true);
        if (interfaceC1008930cMVLIZJ != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("photo_position_for_product_tiles", i);
            interfaceC1008930cMVLIZJ.LJIILL(new C0SCL(jSONObject));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLJJL, ICommercePhotoSlideAbility.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJJJLIIL, ICarouselComponentTranslationAbility.class);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        C0SLX c0slx;
        View view;
        TuxIconView tuxIconView;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = null;
        if (i != 0) {
            if (i == 2) {
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                if (C0SCS.LIZIZ((VideoItemParams) obj) && !this.LLLF) {
                    C736680Sv4.LJIJJLI(mp(), new AwS590S0100000_11(this, 281));
                    return;
                }
                return;
            }
            return;
        }
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        if (!C0SCS.LIZIZ((VideoItemParams) obj) || (c0slx = this.LLJZ) == null || c0slx.getCurrentItem() != lp()) {
            return;
        }
        hp();
        PhotosViewHolderV3 photosViewHolderV3Ip = ip();
        if (photosViewHolderV3Ip == null || (view = photosViewHolderV3Ip.LL) == null || (tuxIconView = (TuxIconView) view.findViewById(R.id.qcq)) == null) {
            return;
        }
        tuxIconView.setIconRes(R.raw.icon_arrow_left_circle_ltr);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        InterfaceC1008930cMV interfaceC1008930cMVKp;
        C0SM6 c0sm6LJJI;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (this.LLLFF >= 0 && (interfaceC1008930cMVKp = kp()) != null && (c0sm6LJJI = interfaceC1008930cMVKp.LJJI()) != null) {
            c0sm6LJJI.LIZIZ(this.LLLFF);
        }
        this.LLLFF = i;
        if (i == lp()) {
            return;
        }
        if (LF0(i)) {
            this.LLLF = false;
        } else {
            C736680Sv4.LJIJJLI(mp(), new AwS119S0101000_11(this, i, 1));
        }
    }

    @Override // X.InterfaceC720380SNo
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        ICommercePhotoModeAbility iCommercePhotoModeAbility = (ICommercePhotoModeAbility) this.LLJLL.getValue();
        if (iCommercePhotoModeAbility != null) {
            iCommercePhotoModeAbility.sx2(motionEvent);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0SLX c0slx = (C0SLX) view.findViewById(R.id.qez);
        this.LLJZ = c0slx;
        if (c0slx != null) {
            c0slx.LIZLLL(this);
        }
        this.LLJZIJLIL = (ViewGroup) view.findViewById(R.id.qeg);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoGetInitPositionProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.commerce.PhotoAdCarouselComponent$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoGetInitPositionProtocol.class, this);
                    }
                }
            });
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, PhotoOnPageSelectedInterceptProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle2 = getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.commerce.PhotoAdCarouselComponent$onViewCreated$$inlined$registerProtocol$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL2, PhotoOnPageSelectedInterceptProtocol.class, this);
                    }
                }
            });
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL3 = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL3, PhotoOnIndexSetProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle3 = getLifecycle();
        if (lifecycle3 != null) {
            lifecycle3.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.commerce.PhotoAdCarouselComponent$onViewCreated$$inlined$registerProtocol$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL3, PhotoOnIndexSetProtocol.class, this);
                    }
                }
            });
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL4 = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL4, PhotoTouchInterceptorProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle4 = getLifecycle();
        if (lifecycle4 != null) {
            lifecycle4.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ui.feed.commerce.PhotoAdCarouselComponent$onViewCreated$$inlined$registerProtocol$4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL4, PhotoTouchInterceptorProtocol.class, this);
                    }
                }
            });
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLJLILLLLZIIL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.x6(new InterfaceC719500SKe() { // from class: X.0SCG
                @Override // X.InterfaceC719500SKe
                public final void n5(int i, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC719500SKe
                public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
                    C0SM6 c0sm6LJJI;
                    PhotoAdCarouselComponent photoAdCarouselComponent = this.LL;
                    C631370Opb.LIZ(photoAdCarouselComponent);
                    photoAdCarouselComponent.getClass();
                    InterfaceC1008930cMV interfaceC1008930cMVKp = this.LL.kp();
                    if (interfaceC1008930cMVKp != null && (c0sm6LJJI = interfaceC1008930cMVKp.LJJI()) != null) {
                        c0sm6LJJI.LIZ(new C0SCH(slidesImageLoadParams.index));
                    }
                }

                @Override // X.InterfaceC719500SKe
                public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
                    C0SM6 c0sm6LJJI;
                    C631370Opb.LIZ(this.LL);
                    InterfaceC1008930cMV interfaceC1008930cMVKp = this.LL.kp();
                    if (interfaceC1008930cMVKp != null && (c0sm6LJJI = interfaceC1008930cMVKp.LJJI()) != null) {
                        c0sm6LJJI.LIZ(new C0SCI(slidesImageLoadParams.index));
                    }
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0S8i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(148), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0S8k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0S9P) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(149), 4);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class});
        c0qsjLIZIZ.bindAbility(this.LLJJL, ICommercePhotoSlideAbility.class);
        c0qsjLIZIZ.bindAbility(this.LLJJJJLIIL, ICarouselComponentTranslationAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility
    public final void rM1(Drawable drawable) {
        ViewGroup viewGroup = this.LLJZIJLIL;
        if (viewGroup != null) {
            viewGroup.setBackground(drawable);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoOnPageSelectedInterceptProtocol
    public final void rg0(int i) {
        onPageSelected(i);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C719880SLq c719880SLq;
        VideoItemParams videoItemParams2 = videoItemParams;
        C0SCF c0scf = this.LLJLLL;
        if (c0scf != null) {
            c0scf.clear();
        }
        this.LLJLLL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJ(LJJIJL().getContext(), videoItemParams2.getAweme());
        C0SLX c0slx = this.LLJZ;
        PagerAdapter adapter = null;
        if (c0slx != null) {
            adapter = c0slx.getAdapter();
        }
        if ((adapter instanceof C719880SLq) && (c719880SLq = (C719880SLq) adapter) != null) {
            c719880SLq.LLJJLIIIJLLLLLLLZ = this.LLJLLL;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoGetInitPositionProtocol
    public final void BU0(int i, int i2) {
        C0SM6 c0sm6LJJI;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (i == 2) {
            C0SCF c0scf = this.LLJLLL;
            if (c0scf != null) {
                c0scf.J82(i2);
            }
            InterfaceC1008930cMV interfaceC1008930cMVKp = kp();
            if (interfaceC1008930cMVKp != null && (c0sm6LJJI = interfaceC1008930cMVKp.LJJI()) != null) {
                c0sm6LJJI.LJ(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility
    public final void q91(int i, boolean z) {
        C0SLX c0slx = this.LLJZ;
        if (c0slx == null) {
            return;
        }
        if (!z) {
            C0H9H.LJI(0, c0slx);
        } else {
            C0H9H.LJI(i, c0slx);
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        Object obj;
        View view;
        C724270Sb3 c724270Sb3 = this.LLJI;
        TuxIconView tuxIconView = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C0SCS.LIZIZ((VideoItemParams) obj) && lp() != 0) {
            if (i != lp() - 1 && i != lp()) {
                this.LLL = false;
                return;
            }
            PhotosViewHolderV3 photosViewHolderV3Ip = ip();
            if (photosViewHolderV3Ip != null && (view = photosViewHolderV3Ip.LL) != null) {
                tuxIconView = (TuxIconView) view.findViewById(R.id.qcq);
            }
            C736680Sv4.LJIJJLI(mp(), new C0SCE(i2, this, tuxIconView, i));
        }
    }
}
