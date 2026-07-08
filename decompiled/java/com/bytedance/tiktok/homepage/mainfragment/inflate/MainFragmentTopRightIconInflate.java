package com.bytedance.tiktok.homepage.mainfragment.inflate;

import X.C01GW;
import X.C0S78;
import X.C1251004uy;
import X.C14TF;
import X.C1582020rGq;
import X.C1586160rNW;
import X.C1586170rNX;
import X.C1AF0;
import X.C422820Gi0;
import X.C424700Gl2;
import X.C452501pT;
import X.C799710VYr;
import X.EnumC799980VZs;
import X.InterfaceC799850VZf;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.search.service.ISearchIconOutService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MainFragmentTopRightIconInflate implements InterfaceC799850VZf {
    public ImageView LL;
    public ImageView LLILLJJLI;
    public C424700Gl2 LLILLL;
    public ImageView LLILZ;
    public ImageView LLILZIL;
    public View LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1586160rNW());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1586170rNX());

    @Override // X.InterfaceC799850VZf
    public final int LIZJ() {
        return R.style.xm;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MainFragmentTopRightIconInflate";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C799710VYr.LIZ();
    }

    public final HomepageIconServiceApi LIZ() {
        return (HomepageIconServiceApi) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC799850VZf
    public final Class<? extends Activity> LIZIZ() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getHomePageInflateActivityClass();
    }

    @Override // X.InterfaceC800080Va2
    public final EnumC799980VZs triggerType() {
        return EnumC799980VZs.INFLATE;
    }

    public final View LJ(int i, Context context) {
        switch (i) {
            case 3:
                HomepageIconServiceApi homepageIconServiceApiLIZ = LIZ();
                if (homepageIconServiceApiLIZ == null) {
                    return null;
                }
                return homepageIconServiceApiLIZ.LJI(context);
            case 4:
                View viewLJIIJ = this.LL;
                if (viewLJIIJ == null) {
                    HomepageIconServiceApi homepageIconServiceApiLIZ2 = LIZ();
                    if (homepageIconServiceApiLIZ2 != null) {
                        viewLJIIJ = homepageIconServiceApiLIZ2.LJIIJ(context);
                    } else {
                        viewLJIIJ = null;
                    }
                }
                this.LL = null;
                return viewLJIIJ;
            case 5:
                C424700Gl2 c424700Gl2LJIIIZ = this.LLILLL;
                if (c424700Gl2LJIIIZ == null) {
                    HomepageIconServiceApi homepageIconServiceApiLIZ3 = LIZ();
                    if (homepageIconServiceApiLIZ3 != null) {
                        c424700Gl2LJIIIZ = homepageIconServiceApiLIZ3.LJIIIZ(context);
                    } else {
                        c424700Gl2LJIIIZ = null;
                    }
                }
                this.LLILLL = null;
                return c424700Gl2LJIIIZ;
            case 6:
            default:
                View viewLIZLLL = this.LLILZ;
                if (viewLIZLLL == null) {
                    HomepageIconServiceApi homepageIconServiceApiLIZ4 = LIZ();
                    if (homepageIconServiceApiLIZ4 != null) {
                        viewLIZLLL = homepageIconServiceApiLIZ4.LIZLLL(context);
                    } else {
                        viewLIZLLL = null;
                    }
                }
                this.LLILZ = null;
                return viewLIZLLL;
            case 7:
                View viewLJII = this.LLILZIL;
                if (viewLJII == null) {
                    HomepageIconServiceApi homepageIconServiceApiLIZ5 = LIZ();
                    if (homepageIconServiceApiLIZ5 != null) {
                        viewLJII = homepageIconServiceApiLIZ5.LJII(context);
                    } else {
                        viewLJII = null;
                    }
                }
                this.LLILZIL = null;
                return viewLJII;
            case 8:
                View viewLJ = this.LLILZLL;
                if (viewLJ == null) {
                    HomepageIconServiceApi homepageIconServiceApiLIZ6 = LIZ();
                    if (homepageIconServiceApiLIZ6 != null) {
                        viewLJ = homepageIconServiceApiLIZ6.LJ(context);
                    } else {
                        viewLJ = null;
                    }
                }
                this.LLILZLL = null;
                return viewLJ;
            case BdTuring.TYPE_ECAF /* 9 */:
                View viewLJIIJJI = this.LLILLJJLI;
                if (viewLJIIJJI == null) {
                    HomepageIconServiceApi homepageIconServiceApiLIZ7 = LIZ();
                    if (homepageIconServiceApiLIZ7 != null) {
                        viewLJIIJJI = homepageIconServiceApiLIZ7.LJIIJJI(context);
                    } else {
                        viewLJIIJJI = null;
                    }
                }
                this.LLILLJJLI = null;
                return viewLJIIJJI;
        }
    }

    @Override // X.InterfaceC799850VZf
    public final void LJII(Activity activity, Context context) {
        View viewLJIIJ;
        ImageView imageView;
        C424700Gl2 c424700Gl2LJIIIZ;
        View viewLIZLLL;
        ImageView imageView2;
        TuxIconView tuxIconViewLJII;
        C422820Gi0 c422820Gi0LJ;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        TuxIconView tuxIconViewLJIIJJI;
        Context context6;
        Context context7;
        try {
            C1582020rGq.LIZJ("scene_top_right_icon_inflate_preload");
            HomepageIconServiceApi homepageIconServiceApiLIZ = LIZ();
            TuxIconView tuxIconView = null;
            if (homepageIconServiceApiLIZ != null) {
                if (activity != null) {
                    context7 = activity;
                } else {
                    context7 = context;
                }
                viewLJIIJ = homepageIconServiceApiLIZ.LJIIJ(context7);
            } else {
                viewLJIIJ = null;
            }
            if (viewLJIIJ instanceof ImageView) {
                imageView = (ImageView) viewLJIIJ;
            } else {
                imageView = null;
            }
            this.LL = imageView;
            if (((Boolean) C1251004uy.LIZLLL.getValue()).booleanValue() || C1251004uy.LIZ()) {
                HomepageIconServiceApi homepageIconServiceApiLIZ2 = LIZ();
                if (homepageIconServiceApiLIZ2 != null) {
                    if (activity != null) {
                        context5 = activity;
                    } else {
                        context5 = context;
                    }
                    c424700Gl2LJIIIZ = homepageIconServiceApiLIZ2.LJIIIZ(context5);
                } else {
                    c424700Gl2LJIIIZ = null;
                }
                if (!(c424700Gl2LJIIIZ instanceof C424700Gl2)) {
                    c424700Gl2LJIIIZ = null;
                }
                this.LLILLL = c424700Gl2LJIIIZ;
                HomepageIconServiceApi homepageIconServiceApiLIZ3 = LIZ();
                if (homepageIconServiceApiLIZ3 != null) {
                    if (activity != null) {
                        context4 = activity;
                    } else {
                        context4 = context;
                    }
                    viewLIZLLL = homepageIconServiceApiLIZ3.LIZLLL(context4);
                } else {
                    viewLIZLLL = null;
                }
                if (viewLIZLLL instanceof ImageView) {
                    imageView2 = (ImageView) viewLIZLLL;
                } else {
                    imageView2 = null;
                }
                this.LLILZ = imageView2;
                HomepageIconServiceApi homepageIconServiceApiLIZ4 = LIZ();
                if (homepageIconServiceApiLIZ4 != null) {
                    if (activity != null) {
                        context3 = activity;
                    } else {
                        context3 = context;
                    }
                    tuxIconViewLJII = homepageIconServiceApiLIZ4.LJII(context3);
                } else {
                    tuxIconViewLJII = null;
                }
                this.LLILZIL = tuxIconViewLJII;
                HomepageIconServiceApi homepageIconServiceApiLIZ5 = LIZ();
                if (homepageIconServiceApiLIZ5 != null) {
                    if (activity != null) {
                        context2 = activity;
                    } else {
                        context2 = context;
                    }
                    c422820Gi0LJ = homepageIconServiceApiLIZ5.LJ(context2);
                } else {
                    c422820Gi0LJ = null;
                }
                this.LLILZLL = c422820Gi0LJ;
            }
            if (C1251004uy.LIZ()) {
                C0S78.LIZJ(new AwS568S0100000_24(this, 18), true);
            }
            ISearchIconOutService iSearchIconOutService = (ISearchIconOutService) this.LLIZLLLIL.getValue();
            if (iSearchIconOutService != null) {
                if (activity != null) {
                    context6 = activity;
                } else {
                    context6 = context;
                }
                iSearchIconOutService.LJ(context6);
            }
            if (C14TF.LIZIZ.LJIILL().LJIILLIIL()) {
                HomepageIconServiceApi homepageIconServiceApiLIZ6 = LIZ();
                Context context8 = activity;
                if (homepageIconServiceApiLIZ6 != null) {
                    if (activity == null) {
                        context8 = context;
                    }
                    tuxIconViewLJIIJJI = homepageIconServiceApiLIZ6.LJIIJJI(context8);
                } else {
                    tuxIconViewLJIIJJI = null;
                }
                if (tuxIconViewLJIIJJI instanceof ImageView) {
                    tuxIconView = tuxIconViewLJIIJJI;
                }
                this.LLILLJJLI = tuxIconView;
            }
            C1582020rGq.LIZ("scene_top_right_icon_inflate_preload");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "MainFragmentTopRightIconInflate error");
        }
    }
}
