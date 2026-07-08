package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.AbstractC712240Rwk;
import X.C09R3;
import X.C0HHT;
import X.C0Q4Y;
import X.C0QSJ;
import X.C1173220gdU;
import X.C1202350hOT;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1762010vx9;
import X.C1762310vxd;
import X.C1762380vxk;
import X.C1776160wJy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC10289040p;
import X.InterfaceC1053404Aa;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1733780vDc;
import X.InterfaceC1755020vls;
import X.InterfaceC1761670vwb;
import X.InterfaceC1762000vx8;
import X.InterfaceC1762510vxx;
import X.InterfaceC1763080vys;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.AObjectS400S0100000_26;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPromotionBannerAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselPromotionBannerAssem extends ReusedUISlotAssem<PdpCarouselPromotionBannerAssem> implements InterfaceC712990Rxx<C1762010vx9>, InterfaceC1762000vx8, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final PdpCarouselPromotionBannerAssem LLJJLIIIJLLLLLLLZ = this;
    public PromotionWaist LLJL;
    public C1762380vxk LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJLL;
    public C1202350hOT LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final C1762310vxd LLJZ;
    public volatile InterfaceC1761670vwb LLJZIJLIL;
    public volatile InterfaceC10289040p LLL;
    public volatile InterfaceC1053404Aa LLLF;
    public volatile InterfaceC1755020vls LLLFF;
    public volatile InterfaceC1762510vxx LLLFFI;
    public C127G LLLFZ;
    public InterfaceC665370Q7z LLLI;
    public C0QSJ LLLII;
    public C0QSJ LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselPromotionBannerAssem.class, "pdpVMAbility", "getPdpVMAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselPromotionBannerAssem.class, "pdpWaistMgr", "getPdpWaistMgr()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/waist/IWaistMgr;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselPromotionBannerAssem.class, "pdpBtmManager", "getPdpBtmManager()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/event/btm/IBtmManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PdpCarouselPromotionBannerAssem.class, "configCenter", "getConfigCenter()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpConfigurationAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PdpCarouselPromotionBannerAssem.class, "pagerViewerAbility", "getPagerViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/headerabilities/IPagerViewerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(PdpCarouselPromotionBannerAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        c09r3.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0vxd] */
    public PdpCarouselPromotionBannerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 293), null, AFwS268S0000000_26.get$arr$(227));
        this.LLJZ = new InterfaceC1763080vys() { // from class: X.0vxd
            @Override // X.InterfaceC1763080vys
            public final void LIZIZ(String str, String str2) {
                C1748720vbi.LIZLLL(this.LIZ.getContentView(), new C049G(), new AwS45S2100000_26(str, this.LIZ, str2, 4));
            }

            @Override // X.InterfaceC1763080vys
            public final void LIZ(Context context, WaistJumpSchema waistJumpSchema, String str, String str2) {
                ECBaseFragment eCBaseFragment;
                C1748720vbi.LIZLLL(this.LIZ.getContentView(), new C049H(), new AwS45S2100000_26(str, this.LIZ, str2, 3));
                PdpCarouselPromotionBannerAssem pdpCarouselPromotionBannerAssem = this.LIZ;
                pdpCarouselPromotionBannerAssem.getClass();
                Fragment fragmentLJI = C724240Sb0.LJI(pdpCarouselPromotionBannerAssem);
                if (fragmentLJI != null) {
                    IPdpStarter.PdpEnterParam pdpEnterParamV4 = null;
                    if ((fragmentLJI instanceof PdpFragment) && (eCBaseFragment = (ECBaseFragment) fragmentLJI) != null) {
                        PdpCarouselPromotionBannerAssem pdpCarouselPromotionBannerAssem2 = this.LIZ;
                        InterfaceC10289040p interfaceC10289040p = pdpCarouselPromotionBannerAssem2.LLL;
                        if (interfaceC10289040p == null) {
                            synchronized (pdpCarouselPromotionBannerAssem2) {
                                interfaceC10289040p = pdpCarouselPromotionBannerAssem2.LLL;
                                if (interfaceC10289040p == null) {
                                    C0QSJ c0qsjOp = pdpCarouselPromotionBannerAssem2.op();
                                    if (c0qsjOp != null) {
                                        interfaceC10289040p = (InterfaceC10289040p) c0qsjOp.getAbility(InterfaceC10289040p.class);
                                    } else {
                                        interfaceC10289040p = null;
                                    }
                                    pdpCarouselPromotionBannerAssem2.LLL = interfaceC10289040p;
                                }
                            }
                        }
                        if (interfaceC10289040p != null) {
                            InterfaceC1755020vls interfaceC1755020vlsSp = pdpCarouselPromotionBannerAssem2.sp();
                            if (interfaceC1755020vlsSp != null) {
                                pdpEnterParamV4 = interfaceC1755020vlsSp.v4();
                            }
                            interfaceC10289040p.LIZ(eCBaseFragment, context, pdpEnterParamV4, waistJumpSchema, "product_detail", str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.au5;
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

    @Override // X.InterfaceC1762000vx8
    public final void Y() {
        C1202350hOT c1202350hOT;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD == null || viewOnAttachStateChangeListenerC20631115oD.getParent() == null || viewOnAttachStateChangeListenerC20631115oD.getVisibility() != 0 || (c1202350hOT = this.LLJLLIL) == null) {
            return;
        }
        tp().Qj(c1202350hOT);
        tp().m9(c1202350hOT);
    }

    @Override // X.InterfaceC1762000vx8
    public final void d8() {
        C1202350hOT c1202350hOT = this.LLJLLIL;
        if (c1202350hOT != null) {
            tp().Qj(c1202350hOT);
        }
    }

    public final C0QSJ op() {
        C0QSJ c0qsj = this.LLLII;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLI;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLI = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLII = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1755020vls sp() {
        InterfaceC1755020vls interfaceC1755020vls = this.LLLFF;
        if (interfaceC1755020vls == null) {
            synchronized (this) {
                interfaceC1755020vls = this.LLLFF;
                if (interfaceC1755020vls == null) {
                    C0QSJ c0qsjOp = op();
                    InterfaceC1755020vls interfaceC1755020vls2 = c0qsjOp != null ? (InterfaceC1755020vls) c0qsjOp.getAbility(InterfaceC1755020vls.class) : null;
                    this.LLLFF = interfaceC1755020vls2;
                    return interfaceC1755020vls2;
                }
            }
        }
        return interfaceC1755020vls;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1762510vxx tp() {
        /*
            r4 = this;
            X.0vxx r1 = r4.LLLFFI
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            X.0vxx r1 = r4.LLLFFI     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLLIIII     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLI     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLLI = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope> r1 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLLIIII = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            r1 = 0
            goto L36
        L29:
            java.lang.Class<X.0vxx> r0 = X.InterfaceC1762510vxx.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            X.0vxx r1 = (X.InterfaceC1762510vxx) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<X.0vxx> r0 = X.InterfaceC1762510vxx.class
            X.C687700QyG.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L36:
            r4.LLLFFI = r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            monitor-exit(r4)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPromotionBannerAssem.tp():X.0vxx");
    }

    public final InterfaceC1053404Aa up() {
        InterfaceC1053404Aa interfaceC1053404Aa;
        InterfaceC1053404Aa interfaceC1053404Aa2 = this.LLLF;
        if (interfaceC1053404Aa2 == null) {
            synchronized (this) {
                interfaceC1053404Aa2 = this.LLLF;
                if (interfaceC1053404Aa2 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC1053404Aa = (InterfaceC1053404Aa) c0qsjOp.getAbility(InterfaceC1053404Aa.class);
                        C687700QyG.LJ(interfaceC1053404Aa, InterfaceC1053404Aa.class);
                    } else {
                        interfaceC1053404Aa = null;
                    }
                    this.LLLF = interfaceC1053404Aa;
                    return interfaceC1053404Aa;
                }
            }
        }
        return interfaceC1053404Aa2;
    }

    public final InterfaceC1761670vwb yp() {
        InterfaceC1761670vwb interfaceC1761670vwb;
        InterfaceC1761670vwb interfaceC1761670vwb2 = this.LLJZIJLIL;
        if (interfaceC1761670vwb2 == null) {
            synchronized (this) {
                interfaceC1761670vwb2 = this.LLJZIJLIL;
                if (interfaceC1761670vwb2 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjOp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJZIJLIL = interfaceC1761670vwb;
                    return interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb2;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS400S0100000_26(this, 11)}, defaultViewModelProviderFactory);
                    this.LLLFZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        d8();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC1762000vx8.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (FrameLayout) getContentView().findViewById(R.id.tfb);
        this.LLJLLIL = new C1202350hOT(this);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) getContentView().findViewById(R.id.ei5);
        this.LLJLL = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(PdpCarouselMirrorCell.class);
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LJFF(C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().getState().LIZLLL = C0Q4Y.BUFFER;
            InterfaceC1733780vDc viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator();
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = 1;
            viewItemOperator.LIZLLL(c1173220gdU);
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0vxi
                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i) {
                }
            });
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD, new ARunnableS104S0100000_4(viewOnAttachStateChangeListenerC20631115oD, 147));
        }
        yp().lX().hR2(new C2217381BqS() { // from class: X.0vsj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleCountDown();
            }
        }, new AwS605S0100000_26(this, 814));
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLLL.getValue(this, LLLIIIIL[5]);
        selectSubscribe(assemViewModel, new C2217381BqS() { // from class: X.0vxZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Hi7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0vxg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1761940vx2) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, C1776160wJy.get$arr$(4));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC1762000vx8.class);
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

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
