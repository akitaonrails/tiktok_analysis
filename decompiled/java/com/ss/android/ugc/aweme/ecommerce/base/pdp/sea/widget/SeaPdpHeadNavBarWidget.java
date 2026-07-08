package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C041G;
import X.C04GM;
import X.C07KX;
import X.C0QY2;
import X.C1005503wT;
import X.C1017603yQ;
import X.C1054104Ah;
import X.C1058404By;
import X.C1120604Zw;
import X.C11EA;
import X.C1247530iZL;
import X.C1308910kAL;
import X.C1338770kwV;
import X.C1390850mIV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1743360vT4;
import X.C1745060vVo;
import X.C1745680vWo;
import X.C1748020vaa;
import X.C1748720vbi;
import X.C1752790viH;
import X.C1753200viw;
import X.C1753280vj4;
import X.C1753300vj6;
import X.C1753310vj7;
import X.C1753370vjD;
import X.C1753400vjG;
import X.C1753460vjM;
import X.C1753490vjP;
import X.C1753580vjY;
import X.C1753590vjZ;
import X.C1753840vjy;
import X.C1754020vkG;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C1AQS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C289730BXf;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C7879035x;
import X.C7937038d;
import X.C7938038e;
import X.C814420VxA;
import X.C919503ib;
import X.C958103op;
import X.C990503u3;
import X.EnumC1743310vSz;
import X.InterfaceC1018003yU;
import X.InterfaceC1389230mFt;
import X.InterfaceC1748810vbr;
import X.InterfaceC1753440vjK;
import X.InterfaceC1753900vk4;
import X.InterfaceC1753920vk6;
import X.InterfaceC1754210vkZ;
import X.InterfaceC1754230vkb;
import X.InterfaceC1846110y8n;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpCutPriceSettings;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.share.ShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.EnterCartParams;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import g1c.AjS8S0400000_26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS164S0101000_26;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS5S1500000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpHeadNavBarWidget extends JediBaseWidget implements InterfaceC1389230mFt {
    public static final int LLLIIII = C958103op.LIZLLL();
    public final SeaPdpFragment LLJ;
    public final FragmentManager LLJI;
    public ConstraintLayout LLJIJIL;
    public C1753460vjM LLJILJIL;
    public C1753460vjM LLJILJILJ;
    public C1753460vjM LLJILLL;
    public C1753460vjM LLJJ;
    public ConstraintLayout LLJJI;
    public FrameLayout LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;
    public C1753840vjy LLJJIJIL;
    public C1753840vjy LLJJJ;
    public View LLJJJIL;
    public C1846060y8i LLJJJJ;
    public C1753460vjM LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public C1753400vjG LLJJL;
    public C1753400vjG LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public C0QY2 LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public String LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public final C1753310vj7 LLLII;

    public static String LJIJJ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "recommendation" : "description" : "review" : "overview";
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.awa;
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLILLJJLI = false;
        if (LJIL().n == null) {
            SeaPdpViewModel seaPdpViewModelLJIL = LJIL();
            C1754020vkG c1754020vkG = new C1754020vkG(C1745060vVo.LIZ(this));
            c1754020vkG.LJIL = !EcSeaPdpCutPriceSettings.LIZ();
            seaPdpViewModelLJIL.n = c1754020vkG;
        }
        C1754020vkG c1754020vkG2 = LJIL().n;
        if (c1754020vkG2 != null) {
            c1754020vkG2.LIZIZ = new AwS570S0100000_26(this, 1199);
            c1754020vkG2.LJIILJJIL = new InterfaceC1754210vkZ() { // from class: X.0vk0
                @Override // X.InterfaceC1754210vkZ
                public final void LIZIZ(CartBenefitInfo cartBenefitInfo) {
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
                @Override // X.InterfaceC1754210vkZ
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo r3) {
                    /*
                        r2 = this;
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget r0 = r2.LIZ
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r1 = r0.LJIL()
                        if (r3 == 0) goto L28
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r3.dynamicItem
                        if (r0 == 0) goto L14
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r0.contentInfo
                        if (r0 == 0) goto L14
                        java.lang.String r0 = r0.schema
                        if (r0 != 0) goto L1e
                    L14:
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r3.staticItem
                        if (r0 == 0) goto L28
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r0.contentInfo
                        if (r0 == 0) goto L28
                        java.lang.String r0 = r0.schema
                    L1e:
                        r1.LLLZZ = r0
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget r1 = r2.LIZ
                        r1.getClass()
                        if (r3 == 0) goto L39
                        goto L2a
                    L28:
                        r0 = 0
                        goto L1e
                    L2a:
                        java.lang.String r0 = r3.daInfo     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L34
                        r1.LLLFF = r0     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L34
                        return
                    L2f:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        return
                    L34:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        throw r0
                    L39:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1753860vk0.LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo):void");
                }
            };
            c1754020vkG2.LJIILL = new InterfaceC1754230vkb() { // from class: X.0vk2
                /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
                @Override // X.InterfaceC1754230vkb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo r3) {
                    /*
                        r2 = this;
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget r0 = r2.LIZ
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r1 = r0.LJIL()
                        if (r3 == 0) goto L21
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r3.dynamicItem
                        if (r0 == 0) goto L14
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r0.contentInfo
                        if (r0 == 0) goto L14
                        java.lang.String r0 = r0.schema
                        if (r0 != 0) goto L1e
                    L14:
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r3.staticItem
                        if (r0 == 0) goto L21
                        com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r0.contentInfo
                        if (r0 == 0) goto L21
                        java.lang.String r0 = r0.schema
                    L1e:
                        r1.LLLZZ = r0
                        return
                    L21:
                        r0 = 0
                        goto L1e
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1753880vk2.LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo):void");
                }
            };
            c1754020vkG2.LJIILLIIL = new InterfaceC1753920vk6() { // from class: X.0viQ
                @Override // X.InterfaceC1753920vk6
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1753920vk6
                public final EnterCartParams LIZ() {
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.LIZ.LJIL().LLJILLL;
                    String str = packedDeliverySelectResult != null ? packedDeliverySelectResult.selectedBuyerAddressId : null;
                    IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LJIL().LLIZ;
                    return new EnterCartParams(str, this.LIZ.LJIL().LLLLL.LJI("c35259.d6786", null), this.LIZ.LJIL().RR2(this.LIZ.LJIL().Tg2()), pdpEnterParam != null ? pdpEnterParam.trackParams : null);
                }
            };
        }
        if (EcSeaPdpCutPriceSettings.LIZ()) {
            if (LJIL().o == null) {
                LJIL().o = new C1753490vjP(C1745060vVo.LIZ(this), LJIL().LLLLL);
            }
            C1753490vjP c1753490vjP = LJIL().o;
            if (c1753490vjP != null) {
                c1753490vjP.LIZJ = new AwS570S0100000_26(this, 1200);
            }
        }
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = this.LLILZ;
            viewFindViewById = view != null ? view.findViewById(R.id.q7k) : null;
            this.LLJIJIL = (ConstraintLayout) viewFindViewById;
        }
        if (viewFindViewById != null) {
            LJIL().getClass();
            C1005503wT.LIZ.getClass();
            C426750GoL.LJIIIZ(viewFindViewById, null, 0, null, null, false, 29);
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 42), LJIIL());
        C786410Ut5.I7(new AjS70S0100000_26(this, 43), LJIIJJI());
        C1753840vjy c1753840vjyLJII = LJII();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        CardView cdShoppingCartRedBadgeFromXml = c1753840vjyLJII.getCdShoppingCartRedBadgeFromXml();
        ViewGroup.LayoutParams layoutParams = cdShoppingCartRedBadgeFromXml.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = iLIZIZ;
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.bottomMargin = 0;
            C786410Ut5.j6(cdShoppingCartRedBadgeFromXml, marginLayoutParams);
        }
        View view2 = this.LLILZ;
        if (view2 != null && (context = view2.getContext()) != null) {
            HandlerHook.viewPost(LIZIZ(), new ARunnableS79S0200000_10(this, context, 47));
        }
        LJIIIIZZ().setBackgroundColor(0);
        LJIIIIZZ().setTintColorRes(R.attr.a1h);
        LJIIL().setBackgroundColor(0);
        LJIIL().setTintColorRes(R.attr.a1h);
        LJIJ().setBackgroundColor(0);
        LJIJ().setTintColorRes(R.attr.a1h);
        LJJIIZ();
        LJJIJ(0.0f);
        C1846060y8i c1846060y8iLJIILL = LJIILL();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, C1745060vVo.LIZ(this));
        c1846060y8iLJIILL.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : -16777216);
        LJIL().hR2(new C2217381BqS() { // from class: X.0viu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getBodyContent());
            }
        }, new AwS605S0100000_26(this, 442));
        LJIL().hR2(new C2217381BqS() { // from class: X.0vj1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getCartTip();
            }
        }, new AwS605S0100000_26(this, 448));
        if (C289730BXf.LIZ()) {
            SeaPdpViewModel seaPdpViewModelLJIL2 = LJIL();
            C1753280vj4 c1753280vj4 = new C2217381BqS() { // from class: X.0vj4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SeaPdpMainState) obj).getTabs();
                }
            };
            C1753370vjD c1753370vjD = new C2217381BqS() { // from class: X.0vjD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SeaPdpMainState) obj).getContentList();
                }
            };
            C1753200viw c1753200viw = new C2217381BqS() { // from class: X.0viw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((SeaPdpMainState) obj).getBodyContent());
                }
            };
            AwS675S0100000_26 awS675S0100000_26 = new AwS675S0100000_26(this, 14);
            seaPdpViewModelLJIL2.getClass();
            JediViewModel.ZQ2(seaPdpViewModelLJIL2, c1753280vj4, c1753370vjD, c1753200viw, null, awS675S0100000_26, 8, null);
        } else {
            C11EA.LJIIIIZZ(this, LJIL(), new C2217381BqS() { // from class: X.0vj3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SeaPdpMainState) obj).getTabs();
                }
            }, new C2217381BqS() { // from class: X.0viv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((SeaPdpMainState) obj).getBodyContent());
                }
            }, new AwS675S0100000_26(this, 13));
        }
        LJIL().hR2(new C2217381BqS() { // from class: X.0viG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getShareInfo();
            }
        }, new AwS605S0100000_26(this, 456));
        LJIL().hR2(new C2217381BqS() { // from class: X.0vix
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((SeaPdpMainState) obj).getBottomSheetSlideOffset());
            }
        }, new AwS605S0100000_26(this, 460));
        C11EA.LJIIIIZZ(this, LJIL(), new C2217381BqS() { // from class: X.0vhY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getScrollOffset());
            }
        }, new C2217381BqS() { // from class: X.0viy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getScrollOrientation());
            }
        }, new AwS675S0100000_26(this, 11));
        LJIL().hR2(new C2217381BqS() { // from class: X.0viF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getCartEntry();
            }
        }, new AwS605S0100000_26(this, 445));
        LJIL().hR2(new C2217381BqS() { // from class: X.0vkc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getSheetState());
            }
        }, new AwS605S0100000_26(this, 447));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IShareDependencyService.class.getName(), anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).subscribeShareEvent(this);
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        this.LLILLJJLI = true;
        C1846060y8i c1846060y8iLJIILL = LJIILL();
        if (c1846060y8iLJIILL != null) {
            c1846060y8iLJIILL.LJIIL(this.LLLII);
        }
        View view = this.LLILZ;
        (view != null ? (C1846060y8i) view.findViewById(R.id.q7w) : null).LJIIL(this.LLLII);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IShareDependencyService.class.getName(), anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).unsubscribeShareEvent(this);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1753840vjy LJI() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dmr) : null;
            this.LLJJJ = (C1753840vjy) viewFindViewById;
        }
        return (C1753840vjy) viewFindViewById;
    }

    public final C1753840vjy LJII() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f692dmt) : null;
            this.LLJJIJIL = (C1753840vjy) viewFindViewById;
        }
        return (C1753840vjy) viewFindViewById;
    }

    public final C1753460vjM LJIIIIZZ() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.e27) : null;
            this.LLJILLL = (C1753460vjM) viewFindViewById;
        }
        return (C1753460vjM) viewFindViewById;
    }

    public final FrameLayout LJIIIZ() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i9y) : null;
            this.LLJJJJLIIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout LJIIJ() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i_3) : null;
            this.LLJJIII = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1753460vjM LJIIJJI() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.okx) : null;
            this.LLJILJILJ = (C1753460vjM) viewFindViewById;
        }
        return (C1753460vjM) viewFindViewById;
    }

    public final C1753460vjM LJIIL() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.okw) : null;
            this.LLJILJIL = (C1753460vjM) viewFindViewById;
        }
        return (C1753460vjM) viewFindViewById;
    }

    public final View LJIILIIL() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q7f) : null;
            this.LLJJJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final ConstraintLayout LJIILJJIL() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q7j) : null;
            this.LLJJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C1846060y8i LJIILL() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q7w) : null;
            this.LLJJJJ = (C1846060y8i) viewFindViewById;
        }
        return (C1846060y8i) viewFindViewById;
    }

    public final ViewGroup LJIILLIIL() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.thb) : null;
            this.LLJL = (ViewGroup) viewFindViewById;
        }
        return (ViewGroup) viewFindViewById;
    }

    public final C1753400vjG LJIIZILJ() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.uzi) : null;
            this.LLJJL = (C1753400vjG) viewFindViewById;
        }
        return (C1753400vjG) viewFindViewById;
    }

    public final C1753460vjM LJIJ() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.uzg) : null;
            this.LLJJ = (C1753460vjM) viewFindViewById;
        }
        return (C1753460vjM) viewFindViewById;
    }

    public final C1753400vjG LJIJI() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.uzl) : null;
            this.LLJJLIIIJLLLLLLLZ = (C1753400vjG) viewFindViewById;
        }
        return (C1753400vjG) viewFindViewById;
    }

    public final TuxTextView LJIJJLI() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.title) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SeaPdpViewModel LJIL() {
        return (SeaPdpViewModel) this.LLJLL.getValue();
    }

    public final void LJJIIJ() {
        C1753840vjy c1753840vjyLJI;
        View view;
        View viewFindViewById;
        CartEntry cartEntry;
        Integer num;
        View view2;
        View viewFindViewById2;
        if (LJIL().LLJJJJLIIL) {
            return;
        }
        C1753840vjy c1753840vjyLJII = LJII();
        int iIntValue = 0;
        if ((!(c1753840vjyLJII != null && c1753840vjyLJII.getVisibility() == 0) || (view2 = this.LLILZ) == null || (viewFindViewById2 = view2.findViewById(R.id.q7j)) == null || viewFindViewById2.getVisibility() != 0) && ((c1753840vjyLJI = LJI()) == null || c1753840vjyLJI.getVisibility() != 0 || (view = this.LLILZ) == null || (viewFindViewById = view.findViewById(R.id.q7f)) == null || viewFindViewById.getVisibility() != 0)) {
            return;
        }
        LJIL().LLJJJJLIIL = true;
        ProductPackStruct productPackStruct = LJIL().LLJIJIL;
        if (productPackStruct != null && (cartEntry = productPackStruct.cartEntry) != null && (num = cartEntry.itemCount) != null) {
            iIntValue = num.intValue();
        }
        if (LJIL().LLJLIL != null) {
            new AwS164S0101000_26(iIntValue, this, 0).invoke();
        }
    }

    public final void LJJIIZ() {
        C1753840vjy c1753840vjyLJII = LJIL().LLIZLLLIL ? LJII() : LJI();
        C7937038d tagView = LJIL().LLIZLLLIL ? LJII().getTagView() : LJI().getTagView();
        CardView tagViewContainer = LJIL().LLIZLLLIL ? LJII().getTagViewContainer() : LJI().getTagViewContainer();
        C1754020vkG c1754020vkG = LJIL().n;
        if (c1754020vkG != null) {
            c1754020vkG.LJI(this.LLJ.rS(), c1753840vjyLJII, tagView, 10.0f, LJIL().LLIZLLLIL ? -3.0f : -4.5f, tagViewContainer, null);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onResume() {
        if (EcSeaPdpCutPriceSettings.LIZ()) {
            return;
        }
        LJIL().yR2();
    }

    public final void LJJ(View view) {
        Map<String, Object> mapLJ;
        String str;
        String str2;
        String str3;
        Pair pair;
        String str4;
        SellerInfo sellerInfo;
        String str5;
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        boolean z;
        ProductBase productBase;
        List<Image> list;
        Image image;
        List<String> urls;
        Object objLJJJLL;
        String str6;
        SellerInfo sellerInfo2;
        ProductBase productBase2;
        SellerInfo sellerInfo3;
        String str7;
        SellerInfo sellerInfo4;
        C1054104Ah c1054104Ah = LJIL().LLJLIL;
        Object obj = "";
        if (c1054104Ah != null) {
            ProductPackStruct productPackStruct = LJIL().LLJIJIL;
            if (productPackStruct == null || (sellerInfo4 = productPackStruct.sellerInfo) == null || (str7 = sellerInfo4.sellerId) == null) {
                str7 = "";
            }
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C1748020vaa(), new AwS140S1100000_26(c1054104Ah, str7, 34));
            }
        }
        C1017603yQ c1017603yQ = InterfaceC1018003yU.LIZ;
        Context context = view.getContext();
        FragmentManager fragmentManager = this.LLJI;
        SeaPdpViewModel seaPdpViewModelLJIL = LJIL();
        seaPdpViewModelLJIL.getClass();
        IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpViewModelLJIL.LLIZ;
        if (pdpEnterParam == null || (mapLJ = pdpEnterParam.trackParams) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        HashMap map = new HashMap(mapLJ);
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        String[] strArr = C1752790viH.LIZ;
        String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_report_params_disable_list", String[].class, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        for (String str8 : strArr) {
            map.remove(str8);
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("track_params", map);
        ProductPackStruct productPackStruct2 = seaPdpViewModelLJIL.LLJIJIL;
        if (productPackStruct2 == null || (sellerInfo3 = productPackStruct2.sellerInfo) == null || (str = sellerInfo3.name) == null) {
            str = "";
        }
        pairArr[1] = new Pair("store_name", str);
        ProductPackStruct productPackStruct3 = seaPdpViewModelLJIL.LLJIJIL;
        if (productPackStruct3 == null || (productBase2 = productPackStruct3.baseInfo) == null || (str2 = productBase2.title) == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("product_name", str2);
        ProductPackStruct productPackStruct4 = seaPdpViewModelLJIL.LLJIJIL;
        if (productPackStruct4 == null || (str3 = productPackStruct4.productId) == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("product_id", str3);
        if (C041G.LJIILLIIL(seaPdpViewModelLJIL.LLJIJIL)) {
            ProductPackStruct productPackStruct5 = seaPdpViewModelLJIL.LLJIJIL;
            if (productPackStruct5 == null || (sellerInfo2 = productPackStruct5.sellerInfo) == null || (str6 = sellerInfo2.platformSellerId) == null) {
                str6 = "";
            }
            pair = new Pair("shop_id", str6);
        } else {
            ProductPackStruct productPackStruct6 = seaPdpViewModelLJIL.LLJIJIL;
            if (productPackStruct6 == null || (sellerInfo = productPackStruct6.sellerInfo) == null || (str4 = sellerInfo.sellerId) == null) {
                str4 = "";
            }
            pair = new Pair("shop_id", str4);
        }
        pairArr[4] = pair;
        ProductPackStruct productPackStruct7 = seaPdpViewModelLJIL.LLJIJIL;
        if (productPackStruct7 != null && (productBase = productPackStruct7.baseInfo) != null && (list = productBase.images) != null && (image = (Image) C13LP.LJJJLL(list)) != null && (urls = image.getUrls()) != null && (objLJJJLL = C13LP.LJJJLL(urls)) != null) {
            obj = objLJJJLL;
        }
        pairArr[5] = new Pair("product_image_url", obj);
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        LJIL();
        ProductPackStruct productPackStruct8 = LJIL().LLJIJIL;
        String name = null;
        if (productPackStruct8 != null) {
            str5 = productPackStruct8.helpCenterSchemaUrl;
        } else {
            str5 = null;
        }
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 443);
        AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(this, 444);
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 217);
        c1017603yQ.getClass();
        HashMap map2 = new HashMap();
        map2.put("hide_nav_bar", 1);
        map2.put("disableBounces", 1);
        map2.put("soft_input_adjust", "pan");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAppSettingDependencyService.class.getName();
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
        }
        map2.put("locale", ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getCurrentLocaleStr(context));
        map2.putAll(mapLJI);
        C990503u3.LIZ.getClass();
        C990503u3.LIZJ(map2);
        Uri uriBuild = C919503ib.LIZJ("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_report/index.html/reasons", map2).build();
        ArrayList arrayList = new ArrayList();
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZIZ(2131832558);
        c1247530iZL.LIZJ(R.raw.icon_flag);
        c1247530iZL.LIZ(new AwS121S0400000_26(fragmentManager, context, uriBuild, awS570S0100000_26, 12));
        arrayList.add(c1247530iZL);
        if (str5 != null) {
            C1247530iZL c1247530iZL2 = new C1247530iZL();
            c1247530iZL2.LIZIZ(2131832570);
            c1247530iZL2.LIZJ(R.raw.icon_question_mark_circle_ltr);
            c1247530iZL2.LIZ(new AwS140S1100000_26(str5, awS605S0100000_26, 38));
            arrayList.add(c1247530iZL2);
            awS570S0100000_262.invoke();
        }
        if (C7879035x.LIZLLL() || C7879035x.LJ()) {
            C1247530iZL c1247530iZL3 = new C1247530iZL();
            c1247530iZL3.LIZ = "debug panel";
            c1247530iZL3.LIZJ(R.raw.icon_color_queue);
            c1247530iZL3.LIZ(AFwS228S0000000_1.get$arr$(582));
            arrayList.add(c1247530iZL3);
            C1247530iZL c1247530iZL4 = new C1247530iZL();
            c1247530iZL4.LIZ = "Delete Cache";
            c1247530iZL4.LIZJ(R.raw.icon_3pt_refresh);
            c1247530iZL4.LIZ(new AwS605S0100000_26(context, 583));
            arrayList.add(c1247530iZL4);
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJFF(arrayList);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        if (fragmentManager != null) {
            tuxActionSheetLIZJ.show(fragmentManager, "pdp_more");
        }
        C1054104Ah c1054104Ah2 = LJIL().LLJLIL;
        if (c1054104Ah2 != null) {
            C1054104Ah.LJJI(c1054104Ah2, "more_function", null, null, null, null, 30);
        }
    }

    public final void LJJIFFI(C1753840vjy c1753840vjy) {
        C786410Ut5.LJLLLLLL(0, c1753840vjy);
        C1058404By c1058404By = LJIL().LLZZ;
        if (c1058404By != null) {
            c1058404By.LIZ.LLJJJJ = c1753840vjy;
        }
        C1058404By c1058404By2 = LJIL().LLZZ;
        if (c1058404By2 != null) {
            c1058404By2.LIZ.LLJJJJLIIL = new AwS605S0100000_26(c1753840vjy, 218);
        }
    }

    public final void LJJII(C1753460vjM c1753460vjM) {
        C786410Ut5.LJLLLLLL(0, c1753460vjM);
        C1058404By c1058404By = LJIL().LLZZ;
        if (c1058404By != null) {
            c1058404By.LIZ.LLJJJJJIL = c1753460vjM;
        }
        C1058404By c1058404By2 = LJIL().LLZZ;
        if (c1058404By2 != null) {
            c1058404By2.LIZ.LLJJL = new AwS392S0200000_26(this, c1753460vjM, 92);
        }
        if (LJIL().LLJLIL != null) {
            new AwS570S0100000_26(this, 1205).invoke();
        }
    }

    public final void LJJIII(int i) {
        if (i == 3 && !this.LLL && this.LLJZ != null) {
            this.LLL = true;
            Map<String, Object> mapLJ = LJIL().LLLLL.LJ("c35259.d8823");
            if (LJIL().LLJLIL != null) {
                new AwS427S0200000_26(this, (SeaPdpHeadNavBarWidget) mapLJ, (Map<String, ? extends Object>) 27).invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo r5) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget.LJJIIJZLJL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo):void");
    }

    public final void LJJIJ(float f) {
        boolean z;
        C1753400vjG c1753400vjGLJIIZILJ;
        C7938038e tagView;
        CardView tagViewContainer;
        float fFloatValue;
        Float f2;
        boolean z2;
        PDPBenefitInfo pDPBenefitInfo;
        Float f3;
        Float f4;
        if (f >= 0.6f) {
            z = true;
            c1753400vjGLJIIZILJ = LJIJI();
            tagView = LJIJI().getTagView();
            tagViewContainer = LJIJI().getTagViewContainer();
        } else {
            z = false;
            c1753400vjGLJIIZILJ = LJIIZILJ();
            tagView = LJIIZILJ().getTagView();
            tagViewContainer = LJIIZILJ().getTagViewContainer();
        }
        EcSeaPdpCutPriceSettings.SeaPdpCutPriceBubble seaPdpCutPriceBubble = EcSeaPdpCutPriceSettings.LIZ.bubbleConfig;
        final C1753490vjP c1753490vjP = LJIL().o;
        if (c1753490vjP != null) {
            C1338770kwV c1338770kwVRS = this.LLJ.rS();
            float fFloatValue2 = 4.0f;
            if (seaPdpCutPriceBubble != null && (f4 = seaPdpCutPriceBubble.shareBubbleXOffset) != null) {
                fFloatValue = f4.floatValue();
            } else {
                fFloatValue = 4.0f;
            }
            if (z) {
                fFloatValue2 = (seaPdpCutPriceBubble == null || (f3 = seaPdpCutPriceBubble.shareBubbleFullScreenYOffset) == null) ? -1.0f : f3.floatValue();
            } else if (seaPdpCutPriceBubble != null && (f2 = seaPdpCutPriceBubble.shareBubbleHalfScreenYOffset) != null) {
                fFloatValue2 = f2.floatValue();
            }
            if (Intrinsics.LJFF(c1338770kwVRS, c1753490vjP.LJFF) && Intrinsics.LJFF(c1753400vjGLJIIZILJ, c1753490vjP.LJI) && Intrinsics.LJFF(tagView, c1753490vjP.LJII)) {
                z2 = false;
            } else {
                c1753490vjP.LIZLLL();
                z2 = true;
            }
            c1753490vjP.LJFF = c1338770kwVRS;
            c1753490vjP.LJI = c1753400vjGLJIIZILJ;
            c1753490vjP.LJII = tagView;
            c1753490vjP.LJIIIIZZ = tagViewContainer;
            c1753490vjP.LJIIIZ = C418440Gaw.LIZIZ(Float.valueOf(fFloatValue));
            c1753490vjP.LJIIJ = C418440Gaw.LIZIZ(Float.valueOf(fFloatValue2));
            if (c1753490vjP.LJIILJJIL) {
                if (z2 && (pDPBenefitInfo = c1753490vjP.LJIIL) != null) {
                    c1753490vjP.LIZJ(pDPBenefitInfo, false);
                }
            } else {
                c1753490vjP.LIZIZ(true);
            }
            if ((c1753400vjGLJIIZILJ instanceof C1753400vjG) && c1753400vjGLJIIZILJ != null) {
                c1753400vjGLJIIZILJ.setOnClickListener(new InterfaceC1753440vjK() { // from class: X.0vit
                    @Override // X.InterfaceC1753440vjK
                    public final void LIZIZ() {
                        C1753590vjZ c1753590vjZ;
                        C1753590vjZ c1753590vjZ2 = c1753490vjP.LIZLLL;
                        if (c1753590vjZ2 != null && c1753590vjZ2.LIZIZ() && (c1753590vjZ = c1753490vjP.LIZLLL) != null) {
                            c1753590vjZ.LIZ(true);
                        }
                        C1753490vjP c1753490vjP2 = c1753490vjP;
                        if (c1753490vjP2.LJIILIIL) {
                            c1753490vjP2.LIZIZ(true);
                        }
                        c1753490vjP.LJIILJJIL = false;
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0vj7] */
    public SeaPdpHeadNavBarWidget(SeaPdpFragment seaPdpFragment, FragmentManager fragmentManager) {
        this.LLJ = seaPdpFragment;
        this.LLJI = fragmentManager;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJLL = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 13));
        this.LLJLLIL = -1;
        this.LLJLLL = true;
        this.LLLII = new InterfaceC1846110y8n() { // from class: X.0vj7
            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v8 */
            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                int i;
                C1753300vj6 c1753300vj6;
                if (C289730BXf.LIZ() && this.LIZ.LLLI) {
                    return;
                }
                this.LIZ.LJIL().LLZLLIL = true;
                C259800zU c259800zU = new C259800zU();
                String str = "";
                c259800zU.element = "";
                if (!C289730BXf.LIZ()) {
                    SeaPdpViewModel seaPdpViewModelLJIL = this.LIZ.LJIL();
                    Object obj = c1845940y8W.LIZ;
                    if ((obj instanceof C1753300vj6) && (c1753300vj6 = (C1753300vj6) obj) != null) {
                        i = c1753300vj6.LIZ;
                    } else {
                        i = 0;
                    }
                    seaPdpViewModelLJIL.NS2(i, true);
                    SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget = this.LIZ;
                    int iLIZIZ = C1753340vjA.LIZIZ(c1845940y8W);
                    seaPdpHeadNavBarWidget.getClass();
                    c259800zU.element = SeaPdpHeadNavBarWidget.LJIJJ(iLIZIZ);
                } else {
                    this.LIZ.LJIL().OS2(C1753340vjA.LIZ(c1845940y8W), true);
                    Object obj2 = c1845940y8W.LIZ;
                    ?? r2 = str;
                    if (obj2 instanceof C1753300vj6) {
                        C1753300vj6 c1753300vj62 = (C1753300vj6) obj2;
                        r2 = str;
                        if (c1753300vj62 != null) {
                            String str2 = c1753300vj62.LJ;
                            r2 = str;
                            if (str2 != null) {
                                r2 = str2;
                            }
                        }
                    }
                    c259800zU.element = r2;
                    if (a0.LJJJIL(r2)) {
                        SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget2 = this.LIZ;
                        int iLIZIZ2 = C1753340vjA.LIZIZ(c1845940y8W);
                        seaPdpHeadNavBarWidget2.getClass();
                        c259800zU.element = SeaPdpHeadNavBarWidget.LJIJJ(iLIZIZ2);
                    }
                }
                if (this.LIZ.LJIL().LLJLIL != null) {
                    new AwS427S0200000_26(this.LIZ, (SeaPdpHeadNavBarWidget) c259800zU, (C259800zU<String>) 26).invoke();
                }
                SeaPdpViewModel seaPdpViewModelLJIL2 = this.LIZ.LJIL();
                int iLIZIZ3 = C1753340vjA.LIZIZ(c1845940y8W);
                seaPdpViewModelLJIL2.getClass();
                seaPdpViewModelLJIL2.setState(new AwS38S0001000_26(iLIZIZ3, 9));
            }
        };
    }

    public final void LJJI(int i, View view) {
        if (view instanceof C1753460vjM) {
            ((C1753460vjM) view).setIconRes(i);
        } else {
            if (!(view instanceof TuxIconView)) {
                return;
            }
            ((TuxIconView) view).setIconRes(i);
        }
    }

    public final void LJJIJLIJ(List<Tab> list, List<? extends Object> list2) {
        int iIntValue;
        int i;
        int iIntValue2;
        boolean z;
        C1753300vj6 c1753300vj6;
        C1753300vj6 c1753300vj62;
        if (this.LLLFZ) {
            LJJIL(list, list2);
            return;
        }
        this.LLLFZ = true;
        C1846060y8i c1846060y8iLJIILL = LJIILL();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1846060y8iLJIILL);
        c1846060y8iLJIILL.setAlpha(0.0f);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        int i3 = 0;
        for (Tab tab : list) {
            int i4 = i2 + 1;
            if (i2 >= 0) {
                Tab tab2 = tab;
                C1845940y8W c1845940y8WLJIIIZ = c1846060y8iLJIILL.LJIIIZ();
                c1845940y8WLJIIIZ.LIZIZ(tab2.tabTitle);
                Integer num = tab2.toBrick;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Object obj = c1845940y8WLJIIIZ.LIZ;
                if ((obj instanceof C1753300vj6) && (c1753300vj62 = (C1753300vj6) obj) != null) {
                    i = 0;
                    c1845940y8WLJIIIZ.LIZ = C1753300vj6.LIZ(c1753300vj62, iIntValue, 0, 0, null, 30);
                } else {
                    i = 0;
                    c1845940y8WLJIIIZ.LIZ = new C1753300vj6(iIntValue, 0, 0, (String) null, 30);
                }
                Integer num2 = tab2.tabName;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Object obj2 = c1845940y8WLJIIIZ.LIZ;
                if ((obj2 instanceof C1753300vj6) && (c1753300vj6 = (C1753300vj6) obj2) != null) {
                    int i5 = i;
                    c1845940y8WLJIIIZ.LIZ = C1753300vj6.LIZ(c1753300vj6, i5, iIntValue2, i5, null, 29);
                } else {
                    int i6 = i;
                    c1845940y8WLJIIIZ.LIZ = new C1753300vj6(i6, iIntValue2, i6, (String) null, 29);
                }
                if (i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1846060y8iLJIILL.LIZIZ(c1845940y8WLJIIIZ, i3, z);
                i3++;
                arrayList.add(c1845940y8WLJIIIZ);
                i2 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LJJIL(list, list2);
        List listLJJJJLI = C13LP.LJJJJLI(arrayList);
        c1846060y8iLJIILL.LIZ(this.LLLII);
        if (!C289730BXf.LIZ()) {
            LJIL().hR2(new C2217381BqS() { // from class: X.0vj8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj3) {
                    return ((SeaPdpMainState) obj3).getSeaFocusTabAction();
                }
            }, new AwS605S0100000_26(listLJJJJLI, (List<C1745680vWo>) 219));
        } else {
            LJIL().hR2(new C2217381BqS() { // from class: X.0vj9
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj3) {
                    return ((SeaPdpMainState) obj3).getSeaFocusTabActionNew();
                }
            }, new AwS392S0200000_26(listLJJJJLI, (List<C1845940y8W>) this, (SeaPdpHeadNavBarWidget) 42));
        }
    }

    public final void LJJIL(List<Tab> list, List<? extends Object> list2) {
        C1845940y8W c1845940y8WLJII;
        int iZR2;
        int i;
        String str;
        C1753300vj6 c1753300vj6;
        C1753300vj6 c1753300vj62;
        int i2 = 0;
        for (Tab tab : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Tab tab2 = tab;
                C1846060y8i c1846060y8iLJIILL = LJIILL();
                if (c1846060y8iLJIILL != null && (c1845940y8WLJII = c1846060y8iLJIILL.LJII(i2)) != null) {
                    if (C289730BXf.LIZ()) {
                        SeaPdpViewModel seaPdpViewModelLJIL = LJIL();
                        String str2 = tab2.nodeId;
                        Integer num = tab2.toBrick;
                        seaPdpViewModelLJIL.getClass();
                        iZR2 = SeaPdpViewModel.zR2(num, str2, list2);
                    } else {
                        iZR2 = -1;
                    }
                    Object obj = c1845940y8WLJII.LIZ;
                    if ((obj instanceof C1753300vj6) && (c1753300vj62 = (C1753300vj6) obj) != null) {
                        i = 0;
                        c1845940y8WLJII.LIZ = C1753300vj6.LIZ(c1753300vj62, 0, 0, iZR2, null, 23);
                    } else {
                        i = 0;
                        c1845940y8WLJII.LIZ = new C1753300vj6(0, 0, iZR2, (String) null, 23);
                    }
                    if (!C289730BXf.LIZ() || (str = tab2.tabNameEn) == null) {
                        str = "";
                    }
                    Object obj2 = c1845940y8WLJII.LIZ;
                    if ((obj2 instanceof C1753300vj6) && (c1753300vj6 = (C1753300vj6) obj2) != null) {
                        int i4 = i;
                        c1845940y8WLJII.LIZ = C1753300vj6.LIZ(c1753300vj6, i4, i4, i4, str, 15);
                    } else {
                        int i5 = i;
                        c1845940y8WLJII.LIZ = new C1753300vj6(i5, i5, i5, str, 15);
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJJIIZI(float f, float f2, boolean z) {
        boolean z2;
        C1753840vjy c1753840vjyLJI;
        C7937038d tagView;
        CardView tagViewContainer;
        float f3;
        if (z) {
            if (f >= 0.6f) {
                z2 = true;
                c1753840vjyLJI = LJII();
            } else {
                z2 = false;
                c1753840vjyLJI = LJI();
            }
            if (z2) {
                tagView = LJII().getTagView();
            } else {
                tagView = LJI().getTagView();
            }
            if (z2) {
                tagViewContainer = LJII().getTagViewContainer();
            } else {
                tagViewContainer = LJI().getTagViewContainer();
            }
            C1754020vkG c1754020vkG = LJIL().n;
            if (c1754020vkG != null) {
                C1338770kwV c1338770kwVRS = this.LLJ.rS();
                if (z2) {
                    f3 = -3.0f;
                } else {
                    f3 = -4.5f;
                }
                c1754020vkG.LJI(c1338770kwVRS, c1753840vjyLJI, tagView, 10.0f, f3, tagViewContainer, null);
            }
        }
        C1754020vkG c1754020vkG2 = LJIL().n;
        if (c1754020vkG2 != null) {
            c1754020vkG2.LIZIZ(Float.valueOf(f2));
        }
    }

    public final void LJJIJIIJI(float f, float f2, boolean z) {
        C1753580vjY c1753580vjY;
        if (z) {
            LJJIJ(f);
        }
        C1753490vjP c1753490vjP = LJIL().o;
        if (c1753490vjP != null) {
            Float fValueOf = Float.valueOf(f2);
            C1753590vjZ c1753590vjZ = c1753490vjP.LIZLLL;
            if (c1753590vjZ != null && c1753590vjZ.LIZIZ() && !c1753590vjZ.LJ) {
                if (fValueOf != null && fValueOf.floatValue() >= 0.0f && fValueOf.floatValue() <= 1.0f && (c1753580vjY = c1753590vjZ.LIZIZ) != null) {
                    float fFloatValue = fValueOf.floatValue();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1753580vjY);
                    c1753580vjY.setAlpha(fFloatValue);
                }
                C1753580vjY c1753580vjY2 = c1753590vjZ.LIZIZ;
                if (c1753580vjY2 != null && c1753580vjY2.LLILLL) {
                    if (c1753580vjY2.LLILZ.isRunning()) {
                        c1753580vjY2.LLILZ.cancel();
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1753580vjY2);
                        c1753580vjY2.setAlpha(1.0f);
                    }
                    c1753580vjY2.LIZ();
                }
            }
        }
    }

    public final void LJJIJIIJIL(ShareInfo shareInfo, ConstraintLayout constraintLayout, PDPBenefitInfo pDPBenefitInfo) {
        if (shareInfo != null && Intrinsics.LJFF(shareInfo.canShare, Boolean.FALSE)) {
            C786410Ut5.LJLLLLLL(8, constraintLayout);
            return;
        }
        C786410Ut5.LJLLLLLL(0, constraintLayout);
        if (shareInfo != null && Intrinsics.LJFF(shareInfo.canShare, Boolean.TRUE)) {
            C786410Ut5.I7(new AjS8S0400000_26(constraintLayout, this, pDPBenefitInfo, shareInfo, 1), constraintLayout);
            LJJIIJZLJL(pDPBenefitInfo);
        }
    }

    public final void LJJIJIL(CartEntry cartEntry, C1753840vjy c1753840vjy, EnumC1743310vSz enumC1743310vSz) {
        String str;
        String str2;
        final View view = this.LLILZ;
        if (view != null) {
            Integer num = null;
            if (cartEntry != null) {
                str = cartEntry.link;
            } else {
                str = null;
            }
            if (str != null && !a0.LJJJIL(str)) {
                str2 = cartEntry.link;
            } else {
                str2 = (String) C07KX.LIZ.getValue();
            }
            if (cartEntry != null) {
                num = cartEntry.itemCount;
            }
            C1743360vT4 c1743360vT4 = new C1743360vT4(num, enumC1743310vSz, str2);
            float f = C1753840vjy.LLJJIII;
            c1753840vjy.h0(c1743360vT4, false);
            c1753840vjy.setDelegate(new InterfaceC1753900vk4() { // from class: X.04HD
                @Override // X.InterfaceC1753900vk4
                public final Map<String, Object> LIZ() {
                    return null;
                }

                @Override // X.InterfaceC1753900vk4
                public final String LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC1753900vk4
                public final String LIZLLL() {
                    return null;
                }

                @Override // X.InterfaceC1753900vk4
                public final boolean LIZIZ(C1753460vjM c1753460vjM) {
                    String str3;
                    ProductPackStruct productPackStruct;
                    CartEntry cartEntry2;
                    SeaPdpViewModel seaPdpViewModelLJIL = this.LIZ.LJIL();
                    Context context = view.getContext();
                    String string = (String) C07KX.LIZ.getValue();
                    if (context == null) {
                        seaPdpViewModelLJIL.getClass();
                        C1AF0.LIZJ("Open cart failed. Context is NULL");
                    } else {
                        if (seaPdpViewModelLJIL.LLJJJ) {
                            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("monitor_name", "rd_add_cart_optimize_event");
                            linkedHashMap.put("monitor_type", CardStruct.IStatusCode.DEFAULT);
                            c1507790pL7.getClass();
                            C1507790pL7.LIZJ("tiktok_gec_monitor_event", linkedHashMap);
                        }
                        String strRR2 = seaPdpViewModelLJIL.RR2(seaPdpViewModelLJIL.Tg2());
                        String str4 = seaPdpViewModelLJIL.LLLZZ;
                        if (str4 != null || ((productPackStruct = seaPdpViewModelLJIL.LLJIJIL) != null && (cartEntry2 = productPackStruct.cartEntry) != null && (str4 = cartEntry2.link) != null)) {
                            string = str4;
                        }
                        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = seaPdpViewModelLJIL.LLJILLL;
                        if (packedDeliverySelectResult != null && (str3 = packedDeliverySelectResult.selectedBuyerAddressId) != null) {
                            string = UriProtector.parse(string).buildUpon().appendQueryParameter("buyer_addr_id", str3).toString();
                        }
                        C1025203ze c1025203ze = C1025203ze.LIZ;
                        IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpViewModelLJIL.LLIZ;
                        String strLJI = seaPdpViewModelLJIL.LLLLL.LJI("c35259.d6786", null);
                        c1025203ze.getClass();
                        C1025203ze.LIZIZ(context, pdpEnterParam, strRR2, string, false, strLJI);
                    }
                    SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget = this.LIZ;
                    seaPdpHeadNavBarWidget.withState(seaPdpHeadNavBarWidget.LJIL(), new AwS580S0100000_1(seaPdpHeadNavBarWidget, 364));
                    return true;
                }
            });
            LJJIIJ();
        }
    }

    @Override // X.InterfaceC1389230mFt
    public final void LIZ(String str, List list, List list2, List list3) {
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IShareDependencyService.class.getName();
            if (anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).showShareSnakeBar(this.LLILZ);
        C1054104Ah c1054104Ah = LJIL().LLJLIL;
        if (c1054104Ah != null) {
            SeaPdpViewModel seaPdpViewModelLJIL = LJIL();
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04GM(), new AwS5S1500000_1(c1054104Ah, (C1054104Ah) seaPdpViewModelLJIL, (SeaPdpViewModel) list, (List<String>) list2, (List<String>) list3, (List<String>) str, (String) 6));
            }
        }
    }
}
