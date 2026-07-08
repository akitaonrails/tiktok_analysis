package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.AbstractC712240Rwk;
import X.C01GW;
import X.C09R3;
import X.C0HAU;
import X.C0HHT;
import X.C0Q4Y;
import X.C0QSJ;
import X.C1054004Ag;
import X.C127G;
import X.C1320310kSj;
import X.C1322200kVm;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1723500ux2;
import X.C1761650vwZ;
import X.C1761660vwa;
import X.C1761890vwx;
import X.C1761910vwz;
import X.C1761940vx2;
import X.C1762010vx9;
import X.C1762070vxF;
import X.C1762200vxS;
import X.C1775700wJE;
import X.C19719912Dl;
import X.C2132808Xe;
import X.C2217381BqS;
import X.C259800zU;
import X.C268670Afx;
import X.C452501pT;
import X.C603820NmG;
import X.C687700QyG;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C770702zh;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1320380kSq;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1733780vDc;
import X.InterfaceC1755020vls;
import X.InterfaceC1755770vn5;
import X.InterfaceC1756840voo;
import X.InterfaceC1761670vwb;
import X.InterfaceC1761990vx7;
import X.InterfaceC1762000vx8;
import X.InterfaceC1762510vxx;
import X.InterfaceC1762910vyb;
import X.InterfaceC1763030vyn;
import X.InterfaceC21676019sM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import X.RunnableC514801zW;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.AObjectS400S0100000_26;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselSparkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPageViewerAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselImageCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselSparkContainerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselVideoCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AFwS348S0000000_26;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselPageViewerAssem extends ReusedUISlotAssem<PdpCarouselPageViewerAssem> implements InterfaceC1762510vxx, InterfaceC712990Rxx<C1762010vx9>, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIIILLL;
    public final PdpCarouselPageViewerAssem LLJJLIIIJLLLLLLLZ = this;
    public final C603820NmG<String, Bitmap> LLJL = new C603820NmG<>(20);
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(132));
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJLL;
    public AppCompatImageView LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public final Set<String> LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public boolean LLLFF;
    public ViewOnAttachStateChangeListenerC20631115oD LLLFFI;
    public List<Image> LLLFZ;
    public final C1775700wJE LLLI;
    public final C1761660vwa LLLII;
    public final HashSet<String> LLLIIII;
    public final Set<String> LLLIIIIL;
    public final Set<String> LLLIIIL;
    public boolean LLLIIL;
    public volatile InterfaceC1761670vwb LLLIILIL;
    public volatile InterfaceC1755770vn5 LLLIL;
    public volatile InterfaceC1762910vyb LLLILZ;
    public volatile InterfaceC1762000vx8 LLLILZJ;
    public volatile InterfaceC1756840voo LLLILZLLLI;
    public volatile InterfaceC1763030vyn LLLIZZ;
    public volatile InterfaceC1761990vx7 LLLJ;
    public C127G LLLJIL;
    public InterfaceC665370Q7z LLLJL;
    public C0QSJ LLLL;
    public C0QSJ LLLLII;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0vwa] */
    public PdpCarouselPageViewerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 417), null, AFwS268S0000000_26.get$arr$(226));
        this.LLJZ = true;
        this.LLJZIJLIL = new LinkedHashSet();
        this.LLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(131));
        this.LLLF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 449));
        this.LLLFF = true;
        this.LLLI = new C1775700wJE(this, 0);
        this.LLLII = new InterfaceC21676019sM() { // from class: X.0vwa
            public float LL;
            public float LLILLJJLI;
            public final C01GW LLILLL;
            public final C01GW LLILZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(98));

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            {
                this.LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this.LLILZIL, 190));
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                InterfaceC1756840voo interfaceC1756840vooYp = this.LLILZIL.yp();
                if (interfaceC1756840vooYp == null) {
                    return;
                }
                interfaceC1756840vooYp.V0(true);
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
            @Override // X.InterfaceC21676019sM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJJIFFI(androidx.recyclerview.widget.RecyclerView r9, android.view.MotionEvent r10) {
                /*
                    Method dump skipped, instruction units count: 323
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1761660vwa.LJJIFFI(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
            }
        };
        this.LLLIIII = new HashSet<>();
        this.LLLIIIIL = new LinkedHashSet();
        this.LLLIIIL = new LinkedHashSet();
        this.LLLIIL = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.au4;
    }

    @Override // X.InterfaceC1762510vxx
    public final int Y9() {
        return 0;
    }

    @Override // X.InterfaceC1762510vxx
    public final void ag() {
        this.LLLIIL = false;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class, PdpCarouselScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        arrayList.add(PdpCarouselScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselPageViewerAssem.class, "pdpVMAbility", "getPdpVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "pdpBodyAbility", "getPdpBodyAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/body/IPdpBodyAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "detectBlankHandler", "getDetectBlankHandler()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/module/header/opt2/IHeadBlankDetectHandler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "pdpEventCenter", "getPdpEventCenter()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/eventcenter/IPdpEventCenter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "bannerAbility", "getBannerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/ICarouselBanner;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "swipeGestureAbility", "getSwipeGestureAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/body/ISwipeGestureAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "galleryViewerAbility", "getGalleryViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/ICarouselGalleryViewerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "lynxOverlayAbility", "getLynxOverlayAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/ICarouselLynxOverlayAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(PdpCarouselPageViewerAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        c09r3.getClass();
        LLLLIIIILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    @Override // X.InterfaceC1762510vxx
    public final HeaderDisplayImageOpt B0() {
        return (HeaderDisplayImageOpt) this.LLLF.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.unregisterOnPageChangeCallback(this.LLLI);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLLFFI;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            viewOnAttachStateChangeListenerC20631115oD2.removeOnItemTouchListener(this.LLLII);
        }
    }

    public final C0QSJ op() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.InterfaceC1762510vxx
    public final float qd() {
        Image image;
        C724270Sb3 c724270Sb3 = this.LLJI;
        List<Image> list = ((C1762010vx9) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI;
        if (list == null || (image = (Image) C13LP.LJJJLL(list)) == null) {
            return 1.0f;
        }
        return image.getRadio();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1762000vx8 sp() {
        /*
            r4 = this;
            X.0vx8 r0 = r4.LLLILZJ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0vx8 r0 = r4.LLLILZJ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLLII     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLJL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLJL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLLII = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0vx8> r0 = X.InterfaceC1762000vx8.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0vx8 r0 = (X.InterfaceC1762000vx8) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLILZJ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPageViewerAssem.sp():X.0vx8");
    }

    public final InterfaceC1761670vwb tp() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLLIILIL;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLLIILIL;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjOp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLLIILIL = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    public final InterfaceC1756840voo yp() {
        InterfaceC1756840voo interfaceC1756840voo = this.LLLILZLLLI;
        if (interfaceC1756840voo == null) {
            synchronized (this) {
                interfaceC1756840voo = this.LLLILZLLLI;
                if (interfaceC1756840voo == null) {
                    C0QSJ c0qsjOp = op();
                    InterfaceC1756840voo interfaceC1756840voo2 = c0qsjOp != null ? (InterfaceC1756840voo) c0qsjOp.getAbility(InterfaceC1756840voo.class) : null;
                    this.LLLILZLLLI = interfaceC1756840voo2;
                    return interfaceC1756840voo2;
                }
            }
        }
        return interfaceC1756840voo;
    }

    @Override // X.InterfaceC1762510vxx
    public final InterfaceC497601wk zd() {
        InterfaceC1755770vn5 interfaceC1755770vn5 = this.LLLIL;
        if (interfaceC1755770vn5 == null) {
            synchronized (this) {
                interfaceC1755770vn5 = this.LLLIL;
                if (interfaceC1755770vn5 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC1755770vn5 = (InterfaceC1755770vn5) c0qsjOp.getAbility(InterfaceC1755770vn5.class);
                        C687700QyG.LJ(interfaceC1755770vn5, InterfaceC1755770vn5.class);
                    } else {
                        interfaceC1755770vn5 = null;
                    }
                    this.LLLIL = interfaceC1755770vn5;
                }
            }
        }
        return interfaceC1755770vn5.zd();
    }

    public final PdpCarouselViewModel zp() {
        return (PdpCarouselViewModel) this.LLJLILLLLZIIL.getValue(this, LLLLIIIILLL[8]);
    }

    public final PdpViewModel Ap() {
        return tp().lX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1762510vxx
    public final boolean Vm() {
        return ((C1761940vx2) zp().getState()).LLILZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1762510vxx
    public final int getCurrentPosition() {
        return ((C1761940vx2) zp().getState()).LLILZLL;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS400S0100000_26(this, 15)}, defaultViewModelProviderFactory);
                    this.LLLJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1762510vxx
    public final int o2() {
        Integer num = ((C1761940vx2) zp().getState()).LLILLL;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC1762510vxx
    public final Set<String> O3() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC1762510vxx
    public final C1320310kSj getScaleType() {
        return InterfaceC1320380kSq.LIZJ;
    }

    @Override // X.InterfaceC1762510vxx
    public final boolean tl() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1762510vxx
    public final Set<String> u7() {
        return this.LLLIIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[Catch: all -> 0x009c, PHI: r4
      0x008e: PHI (r4v4 X.0QSJ) = (r4v3 X.0QSJ), (r4v6 X.0QSJ) binds: [B:38:0x0072, B:43:0x008a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:35:0x006c, B:37:0x0070, B:39:0x0074, B:41:0x0078, B:42:0x007e, B:46:0x0096, B:47:0x0098, B:45:0x008e), top: B:88:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bp(int r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPageViewerAssem.Bp(int):void");
    }

    @Override // X.InterfaceC1762510vxx
    public final void Qj(AbstractC712240Rwk abstractC712240Rwk) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.unregisterOnPageChangeCallback(abstractC712240Rwk);
        }
    }

    @Override // X.InterfaceC1762510vxx
    public final void Vc(String str) {
        Object obj;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        if (str.length() == 0) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Iterator<CarouselElement> it2 = ((C1762010vx9) obj).LL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            String str2 = it2.next().elementId;
            if (str2 != null && Intrinsics.LJFF(str2, str)) {
                if (i != -1 && (viewOnAttachStateChangeListenerC20631115oD = this.LLJLL) != null) {
                    viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(i, false);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.InterfaceC1762510vxx
    public final CarouselWidget Vk(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Map<String, CarouselWidget> map = ((C1762010vx9) obj).LLILZIL;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // X.InterfaceC1762510vxx
    public final void X3(String str) {
        Object obj;
        CarouselElement next;
        Object obj2;
        String uri;
        String str2;
        boolean z;
        String str3;
        if (str.length() == 0) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Iterator<CarouselElement> it2 = ((C1762010vx9) obj).LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                String str4 = next.elementId;
                if (str4 != null && Intrinsics.LJFF(str4, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        CarouselElement carouselElement = next;
        if (carouselElement == null) {
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        Iterator<CarouselElement> it3 = ((C1762010vx9) obj2).LL.iterator();
        int i = 0;
        while (it3.hasNext()) {
            String str5 = it3.next().elementId;
            if (str5 != null && Intrinsics.LJFF(str5, str)) {
                if (i != -1) {
                    Integer num = carouselElement.elementType;
                    int value = C0HAU.IMAGE.getValue();
                    if (num != null && num.intValue() == value) {
                        Image image = carouselElement.image;
                        if (image != null) {
                            uri = image.getUri();
                        } else {
                            return;
                        }
                    } else {
                        Integer num2 = carouselElement.elementType;
                        int value2 = C0HAU.VIDEO.getValue();
                        if (num2 != null && num2.intValue() == value2) {
                            uri = "";
                        } else {
                            return;
                        }
                    }
                    if (uri != null) {
                        CarouselWidget carouselWidgetUp = up(i);
                        if (carouselWidgetUp != null) {
                            str2 = carouselWidgetUp.daInfo;
                        } else {
                            str2 = null;
                        }
                        C1054004Ag c1054004Ag = Ap().LLJLILLLLZIIL;
                        if (c1054004Ag != null) {
                            Integer num3 = carouselElement.elementType;
                            int value3 = C0HAU.VIDEO.getValue();
                            if (num3 != null && num3.intValue() == value3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Integer numValueOf = Integer.valueOf(i);
                            Video video = carouselElement.video;
                            if (video != null) {
                                str3 = video.id;
                            } else {
                                str3 = null;
                            }
                            C724270Sb3 c724270Sb33 = this.LLJI;
                            if (c724270Sb33 != null) {
                                obj3 = c724270Sb33.LL;
                            }
                            C1054004Ag.LJJIFFI(c1054004Ag, uri, null, "head_pic", z, numValueOf, null, "viewer", "enter_viewer", str3, String.valueOf(((C1762010vx9) obj3).LL.size()), str2, carouselElement.daInfo, 34);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLL.getValue(), C1762200vxS.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC1762510vxx.class);
    }

    @Override // X.InterfaceC1762510vxx
    public final void gk(Function2<? super Integer, ? super Integer, Unit> function2) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        if (this.LLJLL != null && (viewOnAttachStateChangeListenerC20631115oD = this.LLJLL) != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS81S0200000_12(function2, viewOnAttachStateChangeListenerC20631115oD, 50));
        }
    }

    @Override // X.InterfaceC1762510vxx
    public final void m9(AbstractC712240Rwk abstractC712240Rwk) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(abstractC712240Rwk);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLLFFI = (ViewOnAttachStateChangeListenerC20631115oD) getContentView().findViewById(R.id.egt);
        this.LLJLLIL = (AppCompatImageView) getContentView().findViewById(R.id.egs);
        this.LLJLL = (ViewOnAttachStateChangeListenerC20631115oD) getContentView().findViewById(R.id.egt);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLLFFI;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(PdpCarouselImageCell.class, PdpCarouselVideoCell.class);
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LJFF(C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20631115oD.setScrollFixView(AFwS243S0000000_11.get$arr$(779));
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS112S0100000_12(this, 467));
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            viewOnAttachStateChangeListenerC20631115oD2.registerOnPageChangeCallback(this.LLLI);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLLFFI;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
            viewOnAttachStateChangeListenerC20631115oD3.addOnItemTouchListener(this.LLLII);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLLFFI;
        if (viewOnAttachStateChangeListenerC20631115oD4 != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD4, new ARunnableS118S0100000_18(this, 89));
        }
        C736680Sv4.LJIIIZ(this, zp(), new C2217381BqS() { // from class: X.0vx5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Hi9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLILLL;
            }
        }, null, AFwS348S0000000_26.get$arr$(7), 12);
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.0vx4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1761940vx2) obj).LLILZ);
            }
        }, null, AFwS313S0000000_26.get$arr$(49), 6);
        C723830SaL.LIZ(this, null, new AwS605S0100000_26(this, 228));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class});
        c0qsjLIZIZ.bindAbility(this.LLL.getValue(), C1762200vxS.class);
        c0qsjLIZIZ.bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC1762510vxx.class);
    }

    @Override // X.InterfaceC1762510vxx
    public final Bitmap t3(String str) {
        return this.LLJL.LIZJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget up(int r7) {
        /*
            r6 = this;
            X.0Sb3 r0 = r6.LLJI
            r5 = 0
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.LL
        L7:
            X.0vx9 r0 = (X.C1762010vx9) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r0 = r0.LL
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r7, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement) r1
            if (r1 != 0) goto L16
            return r5
        L14:
            r0 = r5
            goto L7
        L16:
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.LL
        L1c:
            X.0vx9 r0 = (X.C1762010vx9) r0
            boolean r0 = r0.LLJILLL
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L69
            java.util.List<java.lang.String> r0 = r0.pdpCarouselWidgetKeys
        L28:
            if (r0 == 0) goto L69
            X.07ik r2 = new X.07ik
            r2.<init>(r0)
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 227(0xe3, float:3.18E-43)
            r1.<init>(r6, r0)
            X.08QU r0 = X.C09RB.LJIJI(r2, r1)
            X.08QT r4 = new X.08QT
            r4.<init>(r0)
        L3f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget) r0
            java.lang.Integer r2 = r0.widgetType
            X.0vxL r0 = X.EnumC1762130vxL.PROMOTION_STICKER
            int r1 = r0.getValue()
            if (r2 == 0) goto L3f
            int r0 = r2.intValue()
            if (r0 != r1) goto L3f
            r5 = r3
        L5d:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget r5 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget) r5
            return r5
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys r0 = r1.carouselWidgetKeys
            if (r0 == 0) goto L69
            java.util.List<java.lang.String> r0 = r0.halfPdpCarouselHeaderKeys
            goto L28
        L67:
            r0 = r5
            goto L1c
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPageViewerAssem.up(int):com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1762010vx9 c1762010vx9) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C1762010vx9 c1762010vx9) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1762010vx9 c1762010vx9) {
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, X.0vwz] */
    public final void Ep(final C1762010vx9 c1762010vx9, final int i) throws Throwable {
        PdpViewModel pdpViewModelAp;
        ProductPackStruct productPackStruct;
        List<Image> list;
        List<String> urls;
        String str;
        Uri uri;
        CarouselSparkInfo carouselSparkInfo;
        String str2;
        Integer num;
        InterfaceC1733780vDc viewItemOperator;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2;
        if (((Boolean) C268670Afx.LIZ.getValue()).booleanValue() && Ap().LLLI && (((viewOnAttachStateChangeListenerC20631115oD = this.LLJLL) == null || viewOnAttachStateChangeListenerC20631115oD.getOffscreenPageLimit() != 1) && (viewOnAttachStateChangeListenerC20631115oD2 = this.LLJLL) != null)) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD2, new ARunnableS126S0100000_26(this, 33));
        }
        C1762200vxS c1762200vxS = (C1762200vxS) this.LLL.getValue();
        Image image = (Image) C13LP.LJJJLL(c1762010vx9.LLILLJJLI);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJLL;
        InterfaceC1755020vls interfaceC1755020vls = zp().LL;
        if (interfaceC1755020vls != null) {
            interfaceC1755020vls.LIZ();
        }
        c1762200vxS.LIZ(image, viewOnAttachStateChangeListenerC20631115oD3);
        Context context = getContext();
        if (context == null) {
            return;
        }
        C2132808Xe.LJ(context);
        Image image2 = (Image) C13LP.LJJJLL(c1762010vx9.LLILLJJLI);
        if (image2 != null) {
            image2.getRadio();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (CarouselElement carouselElement : c1762010vx9.LL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                CarouselElement carouselElement2 = carouselElement;
                Integer num2 = carouselElement2.elementType;
                int value = C0HAU.IMAGE.getValue();
                String str3 = "";
                if (num2 != null && num2.intValue() == value) {
                    Image image3 = carouselElement2.image;
                    if (image3 != null) {
                        String str4 = carouselElement2.elementId;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        arrayList.add(new C1762070vxF(str3, i2, image3));
                    }
                } else {
                    int value2 = C0HAU.VIDEO.getValue();
                    if (num2 != null && num2.intValue() == value2) {
                        Video video = carouselElement2.video;
                        if (video != null) {
                            String str5 = carouselElement2.elementId;
                            if (str5 == null) {
                                str5 = "";
                            }
                            arrayList.add(new C1761890vwx(str5, i2, video, carouselElement2.image, carouselElement2.videoConfig));
                        }
                    } else {
                        int value3 = C0HAU.SPARK_CONTAINER.getValue();
                        if (num2 != null && num2.intValue() == value3 && (carouselSparkInfo = carouselElement2.sparkInfo) != null && (str2 = carouselSparkInfo.schema) != null && C770702zh.LIZ(str2) && (num = carouselSparkInfo.dynamicCellType) != null) {
                            String str6 = carouselElement2.elementId;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String str7 = carouselSparkInfo.schema;
                            if (str7 != null) {
                                str3 = str7;
                            }
                            String str8 = carouselSparkInfo.data;
                            int iIntValue = num.intValue();
                            C1761650vwZ c1761650vwZ = new C1761650vwZ(i2, iIntValue, str3, str8, str6);
                            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLLFFI;
                            if (viewOnAttachStateChangeListenerC20631115oD4 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD4.getViewItemOperator()) != null) {
                                viewItemOperator.LJII(new C1723500ux2(iIntValue, PdpCarouselSparkContainerCell.class));
                            }
                            arrayList.add(c1761650vwZ);
                        }
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            AppCompatImageView appCompatImageView = this.LLJLLIL;
            if (appCompatImageView != null) {
                C786410Ut5.LJLLLLLL(0, appCompatImageView);
                return;
            }
            return;
        }
        List<Image> list2 = this.LLLFZ;
        if (list2 != null && !Intrinsics.LJFF(list2, c1762010vx9.LLILLJJLI) && (productPackStruct = Ap().LLJILLL) != null && productPackStruct.LJII() && (list = this.LLLFZ) != null) {
            int i4 = 0;
            for (Image image4 : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    Image image5 = image4;
                    if (i4 != 0 && (urls = image5.getUrls()) != null && (str = (String) C13LP.LJJJLL(urls)) != null && (uri = UriProtector.parse(str)) != null) {
                        C1322200kVm.LIZ().LJ(uri);
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        AppCompatImageView appCompatImageView2 = this.LLJLLIL;
        if (appCompatImageView2 != null) {
            C786410Ut5.LJLLLLLL(8, appCompatImageView2);
        }
        this.LLLFZ = c1762010vx9.LLILLJJLI;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD5 == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C1761910vwz(this, viewOnAttachStateChangeListenerC20631115oD5, i);
        viewOnAttachStateChangeListenerC20631115oD5.getViewItemOperator().getState().LJIILL(arrayList, new RunnableC514801zW(c259800zU, 178));
        Image image6 = (Image) C13LP.LJJJLL(c1762010vx9.LLILLJJLI);
        if (image6 != null && (Ap().LLLILZ == null || (pdpViewModelAp = Ap()) == null || pdpViewModelAp.LLLILZLLLI == null)) {
            Ap().LLLILZ = image6;
        }
        final boolean z = !Ap().LLLF;
        if (z) {
            this.LLJZ = false;
        }
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD5, new Runnable() { // from class: X.0vww
            public final void LIZ() {
                boolean z2;
                if (z) {
                    this.Bp(i);
                    C1054004Ag c1054004Ag = this.tp().lX().LLJLILLLLZIIL;
                    if (c1054004Ag != null) {
                        Image image7 = (Image) C13LP.LJJJLZIJ(this.LLJLLL, c1762010vx9.LLILLJJLI);
                        c1054004Ag.LJJJIL(image7 != null ? image7.getUri() : null);
                    }
                }
                PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem = this;
                C724270Sb3 c724270Sb3 = pdpCarouselPageViewerAssem.LLJI;
                List<CarouselElement> list3 = ((C1762010vx9) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator<CarouselElement> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = it2.next().elementType;
                        int value4 = C0HAU.VIDEO.getValue();
                        if (num3 != null && num3.intValue() == value4) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                }
                C1054004Ag c1054004Ag2 = pdpCarouselPageViewerAssem.Ap().LLJLILLLLZIIL;
                if (c1054004Ag2 != null) {
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("has_video", z2 ? "1" : CardStruct.IStatusCode.DEFAULT);
                    pairArr[1] = new Pair("photo_size", Integer.valueOf((int) (((C1762200vxS) pdpCarouselPageViewerAssem.LLL.getValue()).LIZ * 100)));
                    C1054004Ag.LJJI(c1054004Ag2, "head_pic", false, null, C2097608Jq.LJIIIIZZ(pairArr), 6);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PdpCarouselPageViewerAssem@9e00.setContentList$2$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PdpCarouselPageViewerAssem@9e00.setContentList$2$3");
            }
        });
    }

    @Override // X.InterfaceC1762510vxx
    public final void j9(Bitmap bitmap, String str) {
        this.LLJL.LIZLLL(str, bitmap);
    }

    @Override // X.InterfaceC1762510vxx
    public final void v1(int i, Float f) {
        if (this.LLJZ || i == this.LLJLLL) {
            InterfaceC1762910vyb interfaceC1762910vyb = this.LLLILZ;
            Object obj = null;
            if (interfaceC1762910vyb == null) {
                synchronized (this) {
                    interfaceC1762910vyb = this.LLLILZ;
                    if (interfaceC1762910vyb == null) {
                        C0QSJ c0qsjOp = op();
                        if (c0qsjOp != null) {
                            interfaceC1762910vyb = (InterfaceC1762910vyb) c0qsjOp.getAbility(InterfaceC1762910vyb.class);
                        } else {
                            interfaceC1762910vyb = null;
                        }
                        this.LLLILZ = interfaceC1762910vyb;
                        if (interfaceC1762910vyb == null) {
                            return;
                        }
                    }
                }
            }
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJLL;
            String productId = Ap().getProductId();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            interfaceC1762910vyb.LIZ(viewOnAttachStateChangeListenerC20631115oD, productId, ((C1762010vx9) obj).LLILLJJLI, i, f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
