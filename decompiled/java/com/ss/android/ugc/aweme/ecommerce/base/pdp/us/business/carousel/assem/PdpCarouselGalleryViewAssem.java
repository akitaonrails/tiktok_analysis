package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1761770vwl;
import X.C1762010vx9;
import X.C1762200vxS;
import X.C1762250vxX;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1755020vls;
import X.InterfaceC1761670vwb;
import X.InterfaceC1761750vwj;
import X.InterfaceC1762510vxx;
import X.InterfaceC1763030vyn;
import X.InterfaceC1763420vzQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import Y.AObjectS400S0100000_26;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselGalleryViewAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselGalleryViewAssem extends ReusedAssem<PdpCarouselGalleryViewAssem> implements InterfaceC712990Rxx<C1762010vx9>, InterfaceC1763030vyn, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final InterfaceC1731706qJ LLJJ;
    public final PdpCarouselGalleryViewAssem LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C1761770vwl LLJJIJIL;
    public volatile InterfaceC1762510vxx LLJJJ;
    public volatile InterfaceC1761670vwb LLJJJIL;
    public volatile InterfaceC1755020vls LLJJJJ;
    public volatile C1762200vxS LLJJJJJIL;
    public volatile IPdpPiPAbility LLJJJJLIIL;
    public volatile C1762250vxX LLJJL;
    public C127G LLJJLIIIJLLLLLLLZ;
    public InterfaceC665370Q7z LLJL;
    public C0QSJ LLJLIL;
    public C0QSJ LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselGalleryViewAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselGalleryViewAssem.class, "pagerViewerAbility", "getPagerViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/headerabilities/IPagerViewerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselGalleryViewAssem.class, "pdpVMAbility", "getPdpVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PdpCarouselGalleryViewAssem.class, "configurationAbility", "getConfigurationAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpConfigurationAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PdpCarouselGalleryViewAssem.class, "halfPageAnimator", "getHalfPageAnimator()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/adapter/HeaderHalfScreenAnimator;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(PdpCarouselGalleryViewAssem.class, "pipAbility", "getPipAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/pictureinpicture/IPdpPiPAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(PdpCarouselGalleryViewAssem.class, "playbackCoordinator", "getPlaybackCoordinator()Lcom/ss/android/ugc/aweme/ecommerce/video/PdpCarouselVideoPlaybackCoordinator;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0vwl] */
    public PdpCarouselGalleryViewAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 291), null, AFwS268S0000000_26.get$arr$(222));
        this.LLJJI = this;
        this.LLJJIII = true;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(129));
        this.LLJJIJIL = new InterfaceC1763420vzQ() { // from class: X.0vwl
            @Override // X.InterfaceC1763420vzQ
            public final void LIZIZ() {
                Video video;
                Aweme awemeLIZ;
                com.ss.android.ugc.aweme.feed.model.Video video2;
                List<CarouselElement> list = ((C1762010vx9) C631370Opb.LIZ(this.LIZ)).LL;
                PdpCarouselGalleryViewAssem pdpCarouselGalleryViewAssem = this.LIZ;
                InterfaceC1731706qJ interfaceC1731706qJ = pdpCarouselGalleryViewAssem.LLJJ;
                InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = PdpCarouselGalleryViewAssem.LLJLL;
                CarouselElement carouselElement = (CarouselElement) C13LP.LJJJLZIJ(((C1761940vx2) ((AssemViewModel) interfaceC1731706qJ.getValue(pdpCarouselGalleryViewAssem, interfaceC2217461BqaArr[0])).getState()).LLILZLL, list);
                if (carouselElement == null || (video = carouselElement.video) == null || (video2 = (awemeLIZ = video.LIZ()).getVideo()) == null) {
                    return;
                }
                PdpCarouselGalleryViewAssem pdpCarouselGalleryViewAssem2 = this.LIZ;
                C1054004Ag c1054004Ag = pdpCarouselGalleryViewAssem2.Eo().lX().LLJLILLLLZIIL;
                if (c1054004Ag != null) {
                    c1054004Ag.LJJIIJ(video2.getVideoLength() * LSPassThroughRecordSizeConfig.DEFAULT, awemeLIZ.getAid(), Integer.valueOf(((C1761940vx2) ((AssemViewModel) pdpCarouselGalleryViewAssem2.LLJJ.getValue(pdpCarouselGalleryViewAssem2, interfaceC2217461BqaArr[0])).getState()).LLILZLL), "head_pic");
                }
            }
        };
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

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C0QSJ Ao() {
        C0QSJ c0qsj = this.LLJLILLLLZIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLJLILLLLZIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1755020vls Bo() {
        InterfaceC1755020vls interfaceC1755020vls = this.LLJJJJ;
        if (interfaceC1755020vls == null) {
            synchronized (this) {
                interfaceC1755020vls = this.LLJJJJ;
                if (interfaceC1755020vls == null) {
                    C0QSJ c0qsjAo = Ao();
                    InterfaceC1755020vls interfaceC1755020vls2 = c0qsjAo != null ? (InterfaceC1755020vls) c0qsjAo.getAbility(InterfaceC1755020vls.class) : null;
                    this.LLJJJJ = interfaceC1755020vls2;
                    return interfaceC1755020vls2;
                }
            }
        }
        return interfaceC1755020vls;
    }

    public final InterfaceC1762510vxx Co() {
        InterfaceC1762510vxx interfaceC1762510vxx;
        InterfaceC1762510vxx interfaceC1762510vxx2 = this.LLJJJ;
        if (interfaceC1762510vxx2 == null) {
            synchronized (this) {
                interfaceC1762510vxx2 = this.LLJJJ;
                if (interfaceC1762510vxx2 == null) {
                    C0QSJ c0qsjZo = zo();
                    if (c0qsjZo != null) {
                        interfaceC1762510vxx = (InterfaceC1762510vxx) c0qsjZo.getAbility(InterfaceC1762510vxx.class);
                        C687700QyG.LJ(interfaceC1762510vxx, InterfaceC1762510vxx.class);
                    } else {
                        interfaceC1762510vxx = null;
                    }
                    this.LLJJJ = interfaceC1762510vxx;
                    return interfaceC1762510vxx;
                }
            }
        }
        return interfaceC1762510vxx2;
    }

    public final InterfaceC1761670vwb Eo() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLJJJIL;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLJJJIL;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjAo = Ao();
                    if (c0qsjAo != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjAo.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJJJIL = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    public final Set<InterfaceC1761750vwj> Fo() {
        return (Set) this.LLJJIJIIJIL.getValue();
    }

    public final C0QSJ zo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJLIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpCarouselScope.class});
        this.LLJLIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJLIIIJLLLLLLLZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJLIIIJLLLLLLLZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS400S0100000_26(this, 18)}, defaultViewModelProviderFactory);
                    this.LLJJLIIIJLLLLLLLZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC1763030vyn
    public final boolean D9() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1763030vyn
    public final boolean wh() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1763030vyn
    public final void Ec(InterfaceC1761750vwj interfaceC1761750vwj) {
        if (!Fo().contains(interfaceC1761750vwj)) {
            Fo().add(interfaceC1761750vwj);
        }
    }

    @Override // X.InterfaceC1763030vyn
    public final void Kd(InterfaceC1761750vwj interfaceC1761750vwj) {
        if (Fo().contains(interfaceC1761750vwj)) {
            Fo().remove(interfaceC1761750vwj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0vwA, X.0vwk] */
    @Override // X.InterfaceC1763030vyn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O2(final java.lang.String r61) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselGalleryViewAssem.O2(java.lang.String):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LLJJI, InterfaceC1763030vyn.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LLJJI, InterfaceC1763030vyn.class);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1762010vx9 c1762010vx9) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(C1762010vx9 c1762010vx9) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1762010vx9 c1762010vx9) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
