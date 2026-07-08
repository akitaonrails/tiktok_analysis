package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header;

import X.AbstractC1700300uLc;
import X.AnonymousClass0317;
import X.AnonymousClass0497;
import X.C01GW;
import X.C034S;
import X.C041G;
import X.C04GM;
import X.C04GX;
import X.C0QY2;
import X.C1013003xg;
import X.C10515049h;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C11EA;
import X.C1247530iZL;
import X.C1390850mIV;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1743360vT4;
import X.C1745060vVo;
import X.C1748020vaa;
import X.C1748720vbi;
import X.C1751630vgP;
import X.C1751640vgQ;
import X.C1752790viH;
import X.C1753460vjM;
import X.C1753840vjy;
import X.C1756440voA;
import X.C1773900wGK;
import X.C19719912Dl;
import X.C1AQS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2197308jD;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C687700QyG;
import X.C770702zh;
import X.C786410Ut5;
import X.C7879035x;
import X.C7937038d;
import X.C814420VxA;
import X.C919503ib;
import X.C958103op;
import X.C990503u3;
import X.EnumC1743310vSz;
import X.EnumC1752710vi9;
import X.InterfaceC1389230mFt;
import X.InterfaceC1748810vbr;
import X.InterfaceC1752700vi8;
import X.InterfaceC1753900vk4;
import X.InterfaceC1753920vk6;
import X.InterfaceC1754210vkZ;
import X.InterfaceC1754230vkb;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC737790Swr;
import X.RunnableC514801zW;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObserverS228S0100000_26;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS79S0200000_10;
import Y.ARunnableS95S0200000_26;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Favorite;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.ability.IPdpNavBarAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.ability.PdpNavBarAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.EcPdpLockupFrameworkUpgradeConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpSearchBarBehaviorAB;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.friend.FriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.share.ShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.EnterCartParams;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS141S0101000_1;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS5S1500000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;
import r4b.e;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpHeadNavBarWidget extends JediBaseWidget implements c, InterfaceC1389230mFt, InterfaceC713360RyY, InterfaceC737790Swr {
    public static final int LLLILZJ = C958103op.LIZLLL();
    public final PdpFragment LLJ;
    public final FragmentManager LLJI;
    public ConstraintLayout LLJIJIL;
    public C1753460vjM LLJILJIL;
    public C1753460vjM LLJILJILJ;
    public C1753460vjM LLJILLL;
    public C1753460vjM LLJJ;
    public ConstraintLayout LLJJI;
    public FrameLayout LLJJIII;
    public FrameLayout LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public C1753840vjy LLJJJ;
    public C1753840vjy LLJJJIL;
    public View LLJJJJ;
    public C1753460vjM LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public final C01GW LLJJL;
    public C0QY2 LLJJLIIIJLLLLLLLZ;
    public C0QY2 LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public C1751630vgP LLL;
    public final PdpNavBarAbility LLLF;
    public final ViewModelStore LLLFF;
    public final InterfaceC665370Q7z LLLFFI;
    public final PdpFragment LLLFZ;
    public final Lifecycle LLLI;
    public final PdpNavBarAbility LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public C1751640vgQ LLLIIIL;
    public String LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.arw;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "PdpHeadNavBarWidget";
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        AnonymousClass0317 anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        final Context context;
        this.LLILLJJLI = false;
        C687700QyG.LJIIIIZZ(this);
        if (LJIJI().x == null) {
            PdpViewModel pdpViewModelLJIJI = LJIJI();
            ICartService iCartService = (ICartService) PluggableExtentionKt.pluggableSpi$default(ICartService.class, false, false, false, 14, null);
            pdpViewModelLJIJI.x = iCartService != null ? iCartService.LJFF(C1745060vVo.LIZ(this)) : null;
        }
        InterfaceC1752700vi8 interfaceC1752700vi8 = LJIJI().x;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.LJII(new AwS570S0100000_26(this, 1613));
            interfaceC1752700vi8.LIZLLL(new InterfaceC1754210vkZ() { // from class: X.0vk1
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
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget r0 = r2.LIZ
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r1 = r0.LJIJI()
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
                        r1.LLZZJLIL = r0
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget r1 = r2.LIZ
                        r1.getClass()
                        if (r3 == 0) goto L39
                        goto L2a
                    L28:
                        r0 = 0
                        goto L1e
                    L2a:
                        java.lang.String r0 = r3.daInfo     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L34
                        r1.LLLIIL = r0     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L34
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
                    throw new UnsupportedOperationException("Method not decompiled: X.C1753870vk1.LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo):void");
                }
            });
            interfaceC1752700vi8.LJFF(new InterfaceC1754230vkb() { // from class: X.0vk3
                /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
                @Override // X.InterfaceC1754230vkb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo r3) {
                    /*
                        r2 = this;
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget r0 = r2.LIZ
                        com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r1 = r0.LJIJI()
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
                        r1.LLZZJLIL = r0
                        return
                    L21:
                        r0 = 0
                        goto L1e
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1753890vk3.LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo):void");
                }
            });
            interfaceC1752700vi8.LIZJ(new InterfaceC1753920vk6() { // from class: X.0viP
                @Override // X.InterfaceC1753920vk6
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1753920vk6
                public final EnterCartParams LIZ() {
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.LIZ.LJIJI().LLJJIII;
                    String str = packedDeliverySelectResult != null ? packedDeliverySelectResult.selectedBuyerAddressId : null;
                    IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LJIJI().LLJI;
                    return new EnterCartParams(str, this.LIZ.LJIJI().LLILZIL.LJI("c35259.d6786", null), this.LIZ.LJIJI().iH1(Integer.valueOf(this.LIZ.LJIJI().Tg2())), pdpEnterParam != null ? pdpEnterParam.trackParams : null);
                }
            });
        }
        if (!EcPdpLockupFrameworkUpgradeConfig.LIZIZ()) {
            ConstraintLayout constraintLayoutLJIILJJIL = LJIILJJIL();
            if (constraintLayoutLJIILJJIL != null) {
                C426750GoL.LJIIIZ(constraintLayoutLJIILJJIL, null, Integer.valueOf(LJIJI().TR2()), null, null, false, 29);
            }
        } else if (this.LLJ.isHalfScreen()) {
            ConstraintLayout constraintLayoutLJIILJJIL2 = LJIILJJIL();
            if (constraintLayoutLJIILJJIL2 != null) {
                C426750GoL.LJIIIZ(constraintLayoutLJIILJJIL2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, null, false, 29);
            }
            C786410Ut5.LJLLLLLL(8, LJIIIZ());
        } else {
            ConstraintLayout constraintLayoutLJIILJJIL3 = LJIILJJIL();
            if (constraintLayoutLJIILJJIL3 != null) {
                C426750GoL.LJIIIZ(constraintLayoutLJIILJJIL3, null, Integer.valueOf(LJIJI().TR2()), null, null, false, 29);
            }
            C786410Ut5.LJLLLLLL(0, LJIIIZ());
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 104), LJIIL());
        C786410Ut5.I7(new AjS70S0100000_26(this, 105), LJIIJJI());
        View view = this.LLILZ;
        if (view != null && (context = view.getContext()) != null) {
            if (LJIIZILJ().LJJJJZI()) {
                LJIJI().LLILZLL.LIZIZ(new AbstractC1700300uLc() { // from class: X.0vgl
                    @Override // X.AbstractC1700300uLc
                    public final void LIZ() {
                        PdpHeadNavBarWidget pdpHeadNavBarWidget = this.LIZIZ;
                        LifecycleOwnerExtensionsKt.LIZ(pdpHeadNavBarWidget, new ARunnableS95S0200000_26(pdpHeadNavBarWidget, context, 58));
                    }
                });
            }
            LJIJI().LLILZLL.LIZIZ(new AbstractC1700300uLc() { // from class: X.0QYO
                @Override // X.AbstractC1700300uLc
                public final void LIZ() {
                    PdpHeadNavBarWidget pdpHeadNavBarWidget = this.LIZIZ;
                    LifecycleOwnerExtensionsKt.LIZ(pdpHeadNavBarWidget, new ARunnableS79S0200000_10(pdpHeadNavBarWidget, context, 99));
                }
            });
        }
        LJIIIIZZ().setBackgroundColor(0);
        LJIIIIZZ().setTintColorRes(R.attr.a1h);
        LJIIL().setBackgroundColor(0);
        LJIIL().setTintColorRes(R.attr.a1h);
        LJIILL().setBackgroundColor(0);
        LJIILL().setTintColorRes(R.attr.a1h);
        LJJIIJ();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJ), null, null, new C2197308jD(this, null), 3);
        LJIJI().hR2(new C2217381BqS() { // from class: X.0viB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getBodyContent());
            }
        }, new AwS605S0100000_26(this, 891));
        LJIJI().hR2(new C2217381BqS() { // from class: X.0viC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getCartTip();
            }
        }, new AwS605S0100000_26(this, 892));
        LJIJI().hR2(new C2217381BqS() { // from class: X.0viD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getShareInfo();
            }
        }, new AwS605S0100000_26(this, 893));
        LJIJI().hR2(new C2217381BqS() { // from class: X.0viq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((PdpMainState) obj).getBottomSheetSlideOffset());
            }
        }, new AwS605S0100000_26(this, 894));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = FriendDependencyService.createIFriendDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IFriendDependencyService.class.getName(), anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IFriendDependencyService.class);
        }
        ((IFriendDependencyService) anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin).getRelationObservable().observe(this, new AObserverS228S0100000_26(this, 15));
        C11EA.LJIIIIZZ(this, LJIJI(), new C2217381BqS() { // from class: X.0vhV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        }, new C2217381BqS() { // from class: X.0viK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOrientation());
            }
        }, new AwS675S0100000_26(this, 49));
        LJIJI().hR2(new C2217381BqS() { // from class: X.0viE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getCartEntry();
            }
        }, new AwS605S0100000_26(this, 902));
        LJIJI().hR2(new C2217381BqS() { // from class: X.0vkd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getSheetState());
            }
        }, new AwS605S0100000_26(this, 890));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IShareDependencyService.class.getName(), anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).subscribeShareEvent(this);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1753840vjy LJI() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dmr) : null;
            this.LLJJJIL = (C1753840vjy) viewFindViewById;
        }
        return (C1753840vjy) viewFindViewById;
    }

    public final C1753840vjy LJII() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f692dmt) : null;
            this.LLJJJ = (C1753840vjy) viewFindViewById;
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

    public final ConstraintLayout LJIILIIL() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q7j) : null;
            this.LLJJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final ConstraintLayout LJIILJJIL() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q7k) : null;
            this.LLJIJIL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C1753460vjM LJIILL() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.uzg) : null;
            this.LLJJ = (C1753460vjM) viewFindViewById;
        }
        return (C1753460vjM) viewFindViewById;
    }

    public final FrameLayout LJIILLIIL() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v6f) : null;
            this.LLJJIJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final e LJIIZILJ() {
        return (e) this.LLJZIJLIL.getValue();
    }

    public final TuxTextView LJIJ() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.title) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final PdpViewModel LJIJI() {
        return (PdpViewModel) this.LLJJL.getValue();
    }

    public final void LJJIFFI() {
        C0QY2 c0qy2;
        FrameLayout frameLayoutLJIIIZ;
        C0QY2 c0qy22;
        FrameLayout frameLayoutLJIIJ;
        if (!this.LLJLL && (c0qy22 = this.LLJJLIIIJLLLLLLLZ) != null && (!EcPdpSearchBarBehaviorAB.LIZ() || ((frameLayoutLJIIJ = LJIIJ()) != null && frameLayoutLJIIJ.getVisibility() == 0))) {
            this.LLJLL = true;
            Map<String, Object> mapLJ = LJIJI().LLILZIL.LJ("c35259.d8823");
            if (LJIJI().LLJLILLLLZIIL != null) {
                C1054004Ag.LJJJJZ(new AwS270S0300000_26(this, (PdpHeadNavBarWidget) mapLJ, (Map<String, ? extends Object>) c0qy22, (C0QY2) 153), true);
            }
        }
        if (!EcPdpSearchBarBehaviorAB.LIZ() || this.LLJLLIL || (c0qy2 = this.LLJL) == null || (frameLayoutLJIIIZ = LJIIIZ()) == null || frameLayoutLJIIIZ.getVisibility() != 0) {
            return;
        }
        this.LLJLLIL = true;
        if (LJIJI().LLJLILLLLZIIL != null) {
            C1054004Ag.LJJJJZ(new AwS570S0100000_26(c0qy2, 1615), true);
        }
    }

    public final void LJJII() {
        C1753840vjy c1753840vjyLJI;
        View view;
        View viewFindViewById;
        CartEntry cartEntry;
        Integer num;
        View view2;
        View viewFindViewById2;
        if (LJIJI().LLJL) {
            return;
        }
        C1753840vjy c1753840vjyLJII = LJII();
        int iIntValue = 0;
        if ((!(c1753840vjyLJII != null && c1753840vjyLJII.getVisibility() == 0) || (view2 = this.LLILZ) == null || (viewFindViewById2 = view2.findViewById(R.id.q7j)) == null || viewFindViewById2.getVisibility() != 0) && ((c1753840vjyLJI = LJI()) == null || c1753840vjyLJI.getVisibility() != 0 || (view = this.LLILZ) == null || (viewFindViewById = view.findViewById(R.id.q7f)) == null || viewFindViewById.getVisibility() != 0)) {
            return;
        }
        LJIJI().LLJL = true;
        ProductPackStruct productPackStruct = LJIJI().LLJILLL;
        if (productPackStruct != null && (cartEntry = productPackStruct.cartEntry) != null && (num = cartEntry.itemCount) != null) {
            iIntValue = num.intValue();
        }
        if (LJIJI().LLJLILLLLZIIL != null) {
            C1054004Ag.LJJJJZ(new AwS141S0101000_1(this, iIntValue, 4), true);
        }
    }

    public final void LJJIIJ() {
        C1753840vjy c1753840vjyLJII = LJIJI().LLJIJIL ? LJII() : LJI();
        C7937038d tagView = LJIJI().LLJIJIL ? LJII().getTagView() : LJI().getTagView();
        CardView tagViewContainer = LJIJI().LLJIJIL ? LJII().getTagViewContainer() : LJI().getTagViewContainer();
        InterfaceC1752700vi8 interfaceC1752700vi8 = LJIJI().x;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.LJI(this.LLJ.uS(), c1753840vjyLJII, tagView, 10.0f, LJIJI().LLJIJIL ? -3.0f : -4.5f, tagViewContainer, null);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        InterfaceC737790Swr interfaceC737790Swr;
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        C1751630vgP c1751630vgP;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        Object host = interfaceC665370Q7zLIZIZ.getHost();
        if (!(host instanceof InterfaceC737790Swr) || (interfaceC737790Swr = (InterfaceC737790Swr) host) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The host of ");
            sbLIZ.append(interfaceC665370Q7zLIZIZ);
            sbLIZ.append(" is not an ability provider, have you forget to write @ProvidesTo in ");
            sbLIZ.append(interfaceC665370Q7zLIZIZ.getHost());
            sbLIZ.append('?');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        interfaceC737790Swr.be(interfaceC665370Q7zLIZIZ);
        this.LLLFF.clear();
        this.LLILLJJLI = true;
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
        if (C1773900wGK.LIZ() && (c1751630vgP = this.LLL) != null) {
            ValueAnimator valueAnimator = c1751630vgP.LLJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c1751630vgP.LLJ = null;
            SmartImageView avatarFromXml = c1751630vgP.getAvatarFromXml();
            if (avatarFromXml != null) {
                C786410Ut5.fc(avatarFromXml, 1.0f);
            }
            SmartImageView avatarFromXml2 = c1751630vgP.getAvatarFromXml();
            if (avatarFromXml2 != null) {
                C786410Ut5.Bc(avatarFromXml2, 1.0f);
            }
        }
        C1751630vgP c1751630vgP2 = this.LLL;
        if (c1751630vgP2 != null) {
            c1751630vgP2.setHeaderShopViewListener(null);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onResume() {
        if (C1756440voA.LIZ().postExpensiveTasks) {
            LJIJI().LLILZLL.LIZIZ(new AbstractC1700300uLc() { // from class: X.0viA
                @Override // X.AbstractC1700300uLc
                public final void LIZ() {
                    PdpHeadNavBarWidget pdpHeadNavBarWidget = this.LIZIZ;
                    LifecycleOwnerExtensionsKt.LIZ(pdpHeadNavBarWidget, new ARunnableS126S0100000_26(pdpHeadNavBarWidget, 38));
                }
            });
        } else {
            LJIJI().vR2();
        }
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLLFZ;
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLLI;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLLFFI;
    }

    public final void LJIJJ(View view) {
        Map<String, Object> mapLJ;
        String str;
        String str2;
        String str3;
        Pair pair;
        String str4;
        SellerInfo sellerInfo;
        Object objLJJJLL;
        Favorite favorite;
        String str5;
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        ProductBase productBase;
        List<Image> list;
        Image image;
        List<String> urls;
        String str6;
        SellerInfo sellerInfo2;
        ProductBase productBase2;
        SellerInfo sellerInfo3;
        String str7;
        SellerInfo sellerInfo4;
        C1054004Ag c1054004Ag = LJIJI().LLJLILLLLZIIL;
        String str8 = "";
        if (c1054004Ag != null) {
            ProductPackStruct productPackStruct = LJIJI().LLJILLL;
            if (productPackStruct == null || (sellerInfo4 = productPackStruct.sellerInfo) == null || (str7 = sellerInfo4.sellerId) == null) {
                str7 = "";
            }
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C1748020vaa(), new AwS140S1100000_26(c1054004Ag, str7, 67));
            }
        }
        C1013003xg c1013003xg = IPdpStarter.LIZ;
        Context context = view.getContext();
        FragmentManager fragmentManager = this.LLJI;
        PdpViewModel pdpViewModelLJIJI = LJIJI();
        pdpViewModelLJIJI.getClass();
        IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModelLJIJI.LLJI;
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
        for (String str9 : strArr) {
            map.remove(str9);
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("track_params", map);
        ProductPackStruct productPackStruct2 = pdpViewModelLJIJI.LLJILLL;
        if (productPackStruct2 == null || (sellerInfo3 = productPackStruct2.sellerInfo) == null || (str = sellerInfo3.name) == null) {
            str = "";
        }
        pairArr[1] = new Pair("store_name", str);
        ProductPackStruct productPackStruct3 = pdpViewModelLJIJI.LLJILLL;
        if (productPackStruct3 == null || (productBase2 = productPackStruct3.baseInfo) == null || (str2 = productBase2.title) == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("product_name", str2);
        ProductPackStruct productPackStruct4 = pdpViewModelLJIJI.LLJILLL;
        if (productPackStruct4 == null || (str3 = productPackStruct4.productId) == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("product_id", str3);
        if (C041G.LJIILLIIL(pdpViewModelLJIJI.LLJILLL)) {
            ProductPackStruct productPackStruct5 = pdpViewModelLJIJI.LLJILLL;
            if (productPackStruct5 == null || (sellerInfo2 = productPackStruct5.sellerInfo) == null || (str6 = sellerInfo2.platformSellerId) == null) {
                str6 = "";
            }
            pair = new Pair("shop_id", str6);
        } else {
            ProductPackStruct productPackStruct6 = pdpViewModelLJIJI.LLJILLL;
            if (productPackStruct6 == null || (sellerInfo = productPackStruct6.sellerInfo) == null || (str4 = sellerInfo.sellerId) == null) {
                str4 = "";
            }
            pair = new Pair("shop_id", str4);
        }
        pairArr[4] = pair;
        ProductPackStruct productPackStruct7 = pdpViewModelLJIJI.LLJILLL;
        if (productPackStruct7 == null || (productBase = productPackStruct7.baseInfo) == null || (list = productBase.images) == null || (image = (Image) C13LP.LJJJLL(list)) == null || (urls = image.getUrls()) == null || (objLJJJLL = C13LP.LJJJLL(urls)) == null) {
            objLJJJLL = "";
        }
        pairArr[5] = new Pair("product_image_url", objLJJJLL);
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        LJIJI();
        ProductPackStruct productPackStruct8 = LJIJI().LLJILLL;
        if (productPackStruct8 != null) {
            favorite = productPackStruct8.favorite;
        } else {
            favorite = null;
        }
        ProductPackStruct productPackStruct9 = LJIJI().LLJILLL;
        if (productPackStruct9 != null) {
            str5 = productPackStruct9.helpCenterSchemaUrl;
        } else {
            str5 = null;
        }
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 481);
        AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(this, 482);
        AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(this, view, 47);
        AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26(this, 483);
        AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 243);
        c1013003xg.getClass();
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
            } else {
                name = null;
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
        if (favorite != null && C770702zh.LIZIZ(favorite.favoriteSchemaLink)) {
            C1247530iZL c1247530iZL = new C1247530iZL();
            String str10 = favorite.favoriteText;
            if (str10 != null) {
                str8 = str10;
            }
            c1247530iZL.LIZ = str8;
            c1247530iZL.LIZJ(R.raw.icon_bookmark);
            c1247530iZL.LIZ(new AwS392S0200000_26(awS392S0200000_26, favorite, 43));
            arrayList.add(c1247530iZL);
            awS570S0100000_262.invoke();
        }
        C1247530iZL c1247530iZL2 = new C1247530iZL();
        c1247530iZL2.LIZIZ(2131832558);
        c1247530iZL2.LIZJ(R.raw.icon_flag);
        c1247530iZL2.LIZ(new AwS121S0400000_26(fragmentManager, context, uriBuild, awS570S0100000_26, 2));
        arrayList.add(c1247530iZL2);
        if (str5 != null) {
            C1247530iZL c1247530iZL3 = new C1247530iZL();
            c1247530iZL3.LIZIZ(2131832570);
            c1247530iZL3.LIZJ(R.raw.icon_question_mark_circle_ltr);
            c1247530iZL3.LIZ(new AwS140S1100000_26(str5, awS605S0100000_26, 13));
            arrayList.add(c1247530iZL3);
            awS570S0100000_263.invoke();
        }
        if (C7879035x.LIZLLL() || C7879035x.LJ()) {
            C1247530iZL c1247530iZL4 = new C1247530iZL();
            c1247530iZL4.LIZ = "debug panel";
            c1247530iZL4.LIZJ(R.raw.icon_color_queue);
            c1247530iZL4.LIZ(AFwS228S0000000_1.get$arr$(341));
            arrayList.add(c1247530iZL4);
            C1247530iZL c1247530iZL5 = new C1247530iZL();
            c1247530iZL5.LIZ = "Delete Cache";
            c1247530iZL5.LIZJ(R.raw.icon_3pt_refresh);
            c1247530iZL5.LIZ(new AwS605S0100000_26(context, 220));
            arrayList.add(c1247530iZL5);
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJFF(arrayList);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        if (fragmentManager != null) {
            tuxActionSheetLIZJ.show(fragmentManager, "pdp_more");
        }
        C1054004Ag c1054004Ag2 = LJIJI().LLJLILLLLZIIL;
        if (c1054004Ag2 != null) {
            C1054004Ag.LJIL(c1054004Ag2, "more_function", null, null, null, null, 30);
        }
    }

    public final void LJIJJLI(boolean z) {
        boolean z2;
        int i;
        SellerInfo sellerInfo;
        String str;
        StoreLabel storeLabel;
        StoreIdentityLabel storeIdentityLabel;
        if (this.LLLIIIIL && !this.LLLIIII && !this.LLJLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1751630vgP c1751630vgP = this.LLL;
        if (c1751630vgP != null) {
            c1751630vgP.animate().cancel();
            if (z && c1751630vgP.isAttachedToWindow()) {
                if (z2) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1751630vgP);
                    c1751630vgP.setAlpha(0.0f);
                    C786410Ut5.LJLLLLLL(0, c1751630vgP);
                    c1751630vgP.animate().alpha(1.0f).setDuration(180L).withEndAction(new RunnableC514801zW(c1751630vgP, 191)).start();
                } else {
                    c1751630vgP.animate().alpha(0.0f).setDuration(180L).withEndAction(new RunnableC514801zW(c1751630vgP, 192)).start();
                }
            } else {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1751630vgP);
                c1751630vgP.setAlpha(1.0f);
                if (z2) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, c1751630vgP);
            }
            if (c1751630vgP.getVisibility() == 0) {
                ProductPackStruct productPackStruct = LJIJI().LLJILLL;
                Integer num = null;
                if (productPackStruct != null) {
                    sellerInfo = productPackStruct.sellerInfo;
                } else {
                    sellerInfo = null;
                }
                if (!this.LLLIL) {
                    this.LLLIL = true;
                    if (sellerInfo != null && (storeLabel = sellerInfo.storeLabel) != null && (storeIdentityLabel = storeLabel.storeIdentityLabel) != null) {
                        num = storeIdentityLabel.storeIdentityLabel;
                    }
                    int value = EnumC1752710vi9.TOP_BRAND.getValue();
                    if (num != null && num.intValue() == value) {
                        str = "top_brand";
                    } else {
                        int value2 = EnumC1752710vi9.OFFICIAL_SHOP.getValue();
                        if (num != null && num.intValue() == value2) {
                            str = "official";
                        } else {
                            int value3 = EnumC1752710vi9.AUTHORIZED_SHOP.getValue();
                            if (num != null && num.intValue() == value3) {
                                str = "authorized";
                            } else {
                                int value4 = EnumC1752710vi9.GOLDEN_SHOP.getValue();
                                if (num != null && num.intValue() == value4) {
                                    str = "gold";
                                } else {
                                    int value5 = EnumC1752710vi9.SILVER_SHOP.getValue();
                                    if (num != null && num.intValue() == value5) {
                                        str = "silver";
                                    } else {
                                        str = "";
                                    }
                                }
                            }
                        }
                    }
                    C1748720vbi.LIZIZ(this.LLJ, new AnonymousClass0497(), new AwS109S1200000_26(sellerInfo, str, this, 42));
                    C1748720vbi.LIZIZ(this.LLJ, new C10515049h(), new AwS605S0100000_26(sellerInfo, 900));
                }
            }
        }
    }

    public final void LJJ(C1753840vjy c1753840vjy) {
        C786410Ut5.LJLLLLLL(0, c1753840vjy);
        C04GX c04gx = LJIJI().l;
        if (c04gx != null) {
            c04gx.LIZ.LLJLILLLLZIIL = c1753840vjy;
        }
        C04GX c04gx2 = LJIJI().l;
        if (c04gx2 != null) {
            c04gx2.LIZ.LLJLLIL = new AwS605S0100000_26(c1753840vjy, 244);
        }
    }

    public final void LJJI(C1753460vjM c1753460vjM) {
        C786410Ut5.LJLLLLLL(0, c1753460vjM);
        C04GX c04gx = LJIJI().l;
        if (c04gx != null) {
            c04gx.LIZ.LLJLL = c1753460vjM;
        }
        C04GX c04gx2 = LJIJI().l;
        if (c04gx2 != null) {
            c04gx2.LIZ.LLJLLL = new AwS392S0200000_26(this, c1753460vjM, 255);
        }
        if (LJIJI().LLJLILLLLZIIL != null) {
            C1054004Ag.LJJJJZ(new AwS570S0100000_26(this, 1614), true);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LLLII, IPdpNavBarAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LLLII, IPdpNavBarAbility.class);
    }

    public PdpHeadNavBarWidget(PdpFragment pdpFragment, FragmentManager fragmentManager) {
        this.LLJ = pdpFragment;
        this.LLJI = fragmentManager;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpViewModel.class);
        this.LLJJL = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 15));
        this.LLJLILLLLZIIL = -1;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1386));
        PdpNavBarAbility pdpNavBarAbility = new PdpNavBarAbility();
        this.LLLF = pdpNavBarAbility;
        this.LLLFF = new ViewModelStore();
        this.LLLFFI = C1558360qeg.LJFF(this.LLJ, null);
        this.LLLFZ = pdpFragment;
        this.LLLI = pdpFragment.getLifecycle();
        this.LLLII = pdpNavBarAbility;
        this.LLLIIIIL = true;
    }

    public final void LJIL(int i, View view) {
        if (view instanceof C1753460vjM) {
            ((C1753460vjM) view).setIconRes(i);
        } else {
            if (!(view instanceof TuxIconView)) {
                return;
            }
            ((TuxIconView) view).setIconRes(i);
        }
    }

    public final void LJJIIJZLJL(ShareInfo shareInfo, C1753460vjM c1753460vjM) {
        if (!LJIIZILJ().LJJLI() || (shareInfo != null && Intrinsics.LJFF(shareInfo.canShare, Boolean.FALSE))) {
            C786410Ut5.LJLLLLLL(8, c1753460vjM);
            return;
        }
        C786410Ut5.LJLLLLLL(0, c1753460vjM);
        if (shareInfo != null && Intrinsics.LJFF(shareInfo.canShare, Boolean.TRUE)) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 103), c1753460vjM);
        }
    }

    public final void LJJIIZ(CartEntry cartEntry, C1753840vjy c1753840vjy, EnumC1743310vSz enumC1743310vSz) {
        String str;
        final View view = this.LLILZ;
        if (view != null) {
            Integer num = null;
            if (cartEntry != null) {
                str = cartEntry.link;
            } else {
                str = null;
            }
            if (cartEntry != null) {
                num = cartEntry.itemCount;
            }
            C1743360vT4 c1743360vT4 = new C1743360vT4(num, enumC1743310vSz, str);
            float f = C1753840vjy.LLJJIII;
            c1753840vjy.h0(c1743360vT4, false);
            c1753840vjy.setDelegate(new InterfaceC1753900vk4() { // from class: X.04HE
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
                    PdpViewModel.eS2(this.LIZ.LJIJI(), view.getContext(), "", 2);
                    PdpHeadNavBarWidget pdpHeadNavBarWidget = this.LIZ;
                    pdpHeadNavBarWidget.withState(pdpHeadNavBarWidget.LJIJI(), new AwS580S0100000_1(pdpHeadNavBarWidget, 996));
                    return true;
                }
            });
            LJJII();
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
        C1054004Ag c1054004Ag = LJIJI().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            PdpViewModel pdpViewModelLJIJI = LJIJI();
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C04GM(), new AwS5S1500000_1(c1054004Ag, (C1054004Ag) pdpViewModelLJIJI, (PdpViewModel) list, (List<String>) list2, (List<String>) list3, (List<String>) str, (String) 8));
            }
        }
    }

    public static void LJJIII(PdpHeadNavBarWidget pdpHeadNavBarWidget, boolean z, boolean z2, boolean z3, Boolean bool, int i) {
        boolean z4;
        boolean zBooleanValue;
        boolean z5;
        int i2;
        int i3 = 0;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if (z3 && pdpHeadNavBarWidget.LLLIIIIL != z) {
            z4 = true;
        } else {
            z4 = false;
        }
        pdpHeadNavBarWidget.LLLIIIIL = z;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = ((Boolean) pdpHeadNavBarWidget.withState(pdpHeadNavBarWidget.LJIJI(), AFwS268S0000000_26.get$arr$(759))).booleanValue();
        }
        boolean z6 = !zBooleanValue;
        if (EcPdpSearchBarBehaviorAB.LIZ()) {
            if (z6) {
                FrameLayout frameLayoutLJIIJ = pdpHeadNavBarWidget.LJIIJ();
                if (frameLayoutLJIIJ != null) {
                    C786410Ut5.LJLLLLLL(8, frameLayoutLJIIJ);
                }
                FrameLayout frameLayoutLJIIIZ = pdpHeadNavBarWidget.LJIIIZ();
                if (frameLayoutLJIIIZ != null) {
                    C786410Ut5.LJLLLLLL(8, frameLayoutLJIIIZ);
                }
                pdpHeadNavBarWidget.LLJLLL = false;
            } else {
                if (z2) {
                    z5 = EcPdpSearchBarBehaviorAB.LIZLLL;
                } else {
                    z5 = EcPdpSearchBarBehaviorAB.LIZJ;
                }
                FrameLayout frameLayoutLJIIJ2 = pdpHeadNavBarWidget.LJIIJ();
                if (frameLayoutLJIIJ2 != null) {
                    if (z5) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, frameLayoutLJIIJ2);
                }
                FrameLayout frameLayoutLJIIIZ2 = pdpHeadNavBarWidget.LJIIIZ();
                if (frameLayoutLJIIIZ2 != null) {
                    if (!(!z5)) {
                        i3 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i3, frameLayoutLJIIIZ2);
                }
                pdpHeadNavBarWidget.LLJLLL = z5;
                pdpHeadNavBarWidget.LJJIFFI();
            }
        }
        pdpHeadNavBarWidget.LJIJJLI(z4);
    }
}
