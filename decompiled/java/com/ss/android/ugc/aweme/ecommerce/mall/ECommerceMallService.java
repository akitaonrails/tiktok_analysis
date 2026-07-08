package com.ss.android.ugc.aweme.ecommerce.mall;

import X.AbstractC1585770rMt;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C074D;
import X.C0C18;
import X.C0C64;
import X.C0CCZ;
import X.C0CXF;
import X.C1110004Vu;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C1585070rLl;
import X.C1588360rR4;
import X.C1740600vOc;
import X.C1741470vQ1;
import X.C1767950w6j;
import X.C1767960w6k;
import X.C1767980w6m;
import X.C1769480w9C;
import X.C1769520w9G;
import X.C1769530w9H;
import X.C1769570w9L;
import X.C1770080wAA;
import X.C1770900wBU;
import X.C19EG;
import X.C300440Bq6;
import X.C300590BqL;
import X.C343780Ddo;
import X.C426860GoW;
import X.C452501pT;
import X.C597530Nc7;
import X.C672910QaP;
import X.EnumC113600bu;
import X.EnumC1584360rKc;
import X.EnumC1769010w8R;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopBottomTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopTopTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideComponent;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.bottom.EcVideoGuideBottomButtonComponent;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ECMixMallPreloadTask;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.searchentrance.ECMiddleEntranceData;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMallConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.MallMainActivityAssem;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS63S0010000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ECommerceMallService implements IECommerceMallService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1110004Vu());

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIIZ() {
        return C13LE.LIZ(MallMainActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean LJIIJ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void LIZJ() {
        C1767980w6m.LJIIJ++;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean LIZLLL() {
        C0CXF.LIZ.getClass();
        return C0CXF.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final C0CCZ LJFF() {
        return new ECMixMallPreloadTask();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final C0CCZ LJIIJJI() {
        return new ECColdStartFetchTask();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean LJIILL() {
        C597530Nc7 c597530Nc7 = C597530Nc7.LL;
        Boolean bool = C597530Nc7.LLILLL;
        if (bool != null) {
            c597530Nc7.getClass();
            return bool.booleanValue();
        }
        c597530Nc7.getClass();
        return C597530Nc7.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean LJIJ() {
        C1767960w6k.LIZ.getClass();
        return C1767960w6k.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void LJIJJ() {
        if (((Number) C074D.LIZ.getValue()).intValue() == 1) {
            C1770900wBU.LIZ.getClass();
            if (C1770900wBU.LJIJI) {
                return;
            }
            C1770900wBU.LJIJI = true;
            if (C1770900wBU.LJII()) {
                C1770900wBU.LIZJ(new AwS63S0010000_26(true, 2));
            } else {
                C1770900wBU.LIZJ(new AwS63S0010000_26(true, 1));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final List<IInterceptor> LJIJJLI() {
        return (List) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final Object LJIL() {
        return new AbstractC1585770rMt() { // from class: X.0qzf
            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return new C1571360qze();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.SHOP_CART;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final Object LJJI() {
        return new AbstractC1585770rMt() { // from class: X.0qaH
            @Override // X.AbstractC1585770rMt
            public final BottomTabProtocol LIZ() {
                return new ShopBottomTabProtocol();
            }

            @Override // X.AbstractC1585770rMt
            public final TopTabProtocol LIZLLL() {
                return new ShopTopTabProtocol();
            }

            {
                if (((Boolean) C05H7.LIZ.getValue()).booleanValue()) {
                    C07B6.LIZ();
                }
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.MALL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final String LJJIFFI() {
        C1767950w6j.LIZ.getClass();
        return C1767950w6j.LJI();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void onEcOrderSubmit() {
        C1440005kM.LIZ(new IEvent() { // from class: X.0w9R
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean shouldShowMall2TabOrTopTab() {
        C0CXF.LIZ.getClass();
        return C0CXF.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean shouldShowMallTab() {
        C0CXF.LIZ.getClass();
        return C0CXF.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean shouldShowMallTopTab() {
        C0CXF.LIZ.getClass();
        return C0CXF.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final PriorityProtocol LJII() {
        if (shouldShowMall2TabOrTopTab() && C300590BqL.LIZ() && C0C18.LIZ()) {
            return new EcVideoGuideBottomButtonComponent();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final String LJIIIIZZ() {
        String str = EcMallConfigSettings.getValue().videoScene;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final ReusedUIContentAssem<? extends C03H5> LJIILIIL() {
        if (!shouldShowMall2TabOrTopTab()) {
            return null;
        }
        if (C300590BqL.LIZ() || C0C64.LJIILLIIL().LJIJ(31744, 0, "no_cart_feed_video_find_more", true) == 6) {
            return new EcVideoGuideComponent();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean LJIILJJIL() {
        return C300440Bq6.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean hitTopTabExpExperiment() {
        if (!C343780Ddo.LIZIZ()) {
            C0CXF.LIZ.getClass();
            return C0CXF.LIZJ();
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.MALL;
        c1585070rLl.getClass();
        return C1585070rLl.LJFF(enumC1584360rKc, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final Object LIZIZ() {
        return C1588360rR4.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final TuxIconView LJ(C19EG c19eg) {
        return (TuxIconView) C426860GoW.LIZ(c19eg).findViewById(R.id.v8l);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final View LJIIL(C19EG c19eg) {
        return C426860GoW.LIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final int LJIILLIIL(Integer num) {
        return C1769530w9H.LIZ(num);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void LJIIZILJ(boolean z) {
        if (z) {
            C1440005kM.LIZ(new C1769570w9L(EnumC113600bu.SHOW));
        } else {
            C1769520w9G.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final C1740600vOc LJIJI(Fragment fragment) {
        C1741470vQ1.LIZ.getClass();
        return C1741470vQ1.LIZ(fragment, 2, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void onAnchorPanelClose(C1770080wAA c1770080wAA) {
        C1440005kM.LIZ(new C1769480w9C(c1770080wAA, EnumC1769010w8R.HIDE));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void onAnchorPanelOpen(C1770080wAA c1770080wAA) {
        C1440005kM.LIZ(new C1769480w9C(c1770080wAA, EnumC1769010w8R.SHOW));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void LJJ(Context context, ECMiddleEntranceData eCMiddleEntranceData, C1740600vOc c1740600vOc) {
        C672910QaP.LIZIZ(context, eCMiddleEntranceData, c1740600vOc);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final Uri LJI(String str, String str2, Number number, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return C672910QaP.LIZ(str, str2, number, str3, str4, str5, str6, str7, str8, str9, null, str10);
    }
}
