package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import X.C1571360qze;
import X.C1580100rDk;
import X.InterfaceC1564200qo6;
import X.InterfaceC1570990qz3;
import X.InterfaceC1571000qz4;
import X.InterfaceC1571080qzC;
import X.InterfaceC1617760sCU;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl;
import kotlin.jvm.internal.AFwS213S0000000_24;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class HomepageToolBar implements IHomePageToolbar {
    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1571080qzC LIZ(FrameLayout frameLayout) {
        return new C1580100rDk(frameLayout);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1570990qz3 LIZIZ(final InterfaceC1617760sCU interfaceC1617760sCU) {
        return new InterfaceC1570990qz3(interfaceC1617760sCU) { // from class: X.0qzc
            public final InterfaceC1617760sCU LL;
            public ImageView LLILLJJLI;
            public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(36));
            public final String LLILZ = EnumC1584350rKb.SCAN.getTag();

            @Override // X.InterfaceC1570900qyu
            public final void LIZ() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void S1(boolean z) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void T1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void V1(InterfaceC1617760sCU interfaceC1617760sCU2) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU2) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void X1(int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Z1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void a2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean b2() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean c2() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final void d2(Integer num) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void e2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void g2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onCreate() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onDestroyView() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onPause() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onResume() {
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean enabled() {
                return C1571350qzd.LIZ.LIZ().booleanValue();
            }

            @Override // X.InterfaceC1570900qyu
            public final String getTag() {
                return this.LLILZ;
            }

            {
                this.LL = interfaceC1617760sCU;
            }

            @Override // X.InterfaceC1570900qyu
            public final void U1(View view) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
                C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
                QRCodeServiceImpl.LJII().LIZJ(this.LL.getActivity(), -1, false);
            }

            @Override // X.InterfaceC1570900qyu
            public final View f2(Context context) {
                View viewLIZLLL;
                if (C303200BuY.LIZ == 2) {
                    ImageView imageViewIvScanView = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).ivScanView(this.LL.getActivity());
                    this.LLILLJJLI = imageViewIvScanView;
                    C786410Ut5.LJJJLZIJ(this.LLILLJJLI, (ViewGroup) imageViewIvScanView.getParent());
                } else {
                    C19EG activity = this.LL.getActivity();
                    if (activity != null) {
                        HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LLILLL.getValue();
                        ImageView imageView = null;
                        if (homepageIconServiceApi != null) {
                            viewLIZLLL = homepageIconServiceApi.LIZLLL(activity);
                        } else {
                            viewLIZLLL = null;
                        }
                        if (viewLIZLLL instanceof ImageView) {
                            imageView = (ImageView) viewLIZLLL;
                        }
                        this.LLILLJJLI = imageView;
                    }
                }
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1570990qz3
            public final void LJFF(int i, Aweme aweme) {
                ImageView imageView = this.LLILLJJLI;
                if (imageView == null) {
                    return;
                }
                C1030680cva.LJIILJJIL(aweme, i, imageView);
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1564200qo6 LIZJ(final InterfaceC1617760sCU interfaceC1617760sCU) {
        return new InterfaceC1564200qo6(interfaceC1617760sCU) { // from class: X.0qzh
            public final InterfaceC1617760sCU LL;
            public View LLILLJJLI;
            public final String LLILZIL;
            public final C01GW LLILZ = C452501pT.LIZIZ(new C1571320qza());
            public final DmNoticeProxy LLILLL = DmNoticeProxyImpl.LIZJ();

            @Override // X.InterfaceC1570900qyu
            public final void LIZ() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void S1(boolean z) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void T1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void V1(InterfaceC1617760sCU interfaceC1617760sCU2) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU2) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void X1(int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Z1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void a2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean b2() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean c2() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final void d2(Integer num) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void e2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean enabled() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final void g2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onCreate() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onPause() {
            }

            @Override // X.InterfaceC1564200qo6, X.InterfaceC1570900qyu
            public final void onResume() {
                InterfaceC1617760sCU interfaceC1617760sCU2;
                if (this.LLILLJJLI == null || (interfaceC1617760sCU2 = this.LL) == null) {
                    return;
                }
                this.LLILLL.X0(interfaceC1617760sCU2.f3());
            }

            @Override // X.InterfaceC1564200qo6, X.InterfaceC1570900qyu
            public final void onDestroyView() {
                EventBus.LIZLLL().LJJI(this);
                if (this.LLILLJJLI != null) {
                    this.LLILLL.LIZ();
                }
            }

            @Override // X.InterfaceC1570900qyu
            public final String getTag() {
                return this.LLILZIL;
            }

            {
                this.LL = interfaceC1617760sCU;
                EventBus.LIZLLL().LJIJJ(this);
                this.LLILZIL = EnumC1584350rKb.DM_NOTICE.getTag();
            }

            @Override // X.InterfaceC1570900qyu
            public final void U1(View view) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_from", this.LL.f3(), bundle);
                C786410Ut5.LJJJI("enter_method", "button", bundle);
                C786410Ut5.LJJJI("notice_type", this.LLILLL.T(), bundle);
                bundle.putInt("message_cnt", this.LLILLL.Z0());
                ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).openSessionListActivity(this.LL.getActivity(), bundle);
            }

            @Override // X.InterfaceC1570900qyu
            public final View f2(Context context) {
                View viewLJI = null;
                if (this.LL.getActivity() == null) {
                    return null;
                }
                if (C303200BuY.LIZ == 2) {
                    View viewDmEntranceView = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).dmEntranceView(this.LL.getActivity());
                    this.LLILLJJLI = viewDmEntranceView;
                    if (viewDmEntranceView == null) {
                        return null;
                    }
                    C786410Ut5.LJJJLZIJ(this.LLILLJJLI, (ViewGroup) viewDmEntranceView.getParent());
                } else {
                    C19EG activity = this.LL.getActivity();
                    if (activity != null) {
                        HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LLILZ.getValue();
                        if (homepageIconServiceApi != null) {
                            viewLJI = homepageIconServiceApi.LJI(activity);
                        }
                        this.LLILLJJLI = viewLJI;
                    }
                }
                return this.LLILLJJLI;
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onUnder16RefreshEvent(C885190Yo1 c885190Yo1) {
                if (this.LLILLJJLI != null && this.LLILLL.LIZIZ()) {
                    C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
                }
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1571000qz4 LIZLLL(InterfaceC1617760sCU interfaceC1617760sCU) {
        C1571360qze c1571360qze = new C1571360qze();
        c1571360qze.LLILLJJLI = interfaceC1617760sCU;
        return c1571360qze;
    }
}
