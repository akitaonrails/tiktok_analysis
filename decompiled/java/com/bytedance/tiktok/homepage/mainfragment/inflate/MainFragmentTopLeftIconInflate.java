package com.bytedance.tiktok.homepage.mainfragment.inflate;

import X.C01GW;
import X.C0S78;
import X.C1251004uy;
import X.C1582020rGq;
import X.C1586150rNV;
import X.C285090BFj;
import X.C341940Daq;
import X.C452501pT;
import X.C786410Ut5;
import X.C799710VYr;
import X.EnumC799980VZs;
import X.InterfaceC799850VZf;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MainFragmentTopLeftIconInflate implements InterfaceC799850VZf {
    public ImageView LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1586150rNV());

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
        return "MainFragmentTopLeftIconInflate";
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

    @Override // X.InterfaceC799850VZf
    public final Class<? extends Activity> LIZIZ() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getHomePageInflateActivityClass();
    }

    @Override // X.InterfaceC800080Va2
    public final EnumC799980VZs triggerType() {
        return EnumC799980VZs.INFLATE;
    }

    @Override // X.InterfaceC799850VZf
    public final void LJII(Activity activity, Context context) {
        ImageView imageViewLJIIIIZZ;
        C1582020rGq.LIZJ("scene_top_left_icon_inflate_preload");
        if (((Boolean) C1251004uy.LIZLLL.getValue()).booleanValue() || C1251004uy.LIZ()) {
            HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LLILLJJLI.getValue();
            Context context2 = activity;
            if (homepageIconServiceApi != null) {
                if (activity == null) {
                    context2 = context;
                }
                imageViewLJIIIIZZ = homepageIconServiceApi.LJIIIIZZ(context2);
            } else {
                imageViewLJIIIIZZ = null;
            }
            this.LL = imageViewLJIIIIZZ;
            if (((Boolean) C285090BFj.LJII.getValue()).booleanValue()) {
                C786410Ut5.c6(this.LL, new FrameLayout.LayoutParams(C341940Daq.LIZ(56.0d), C341940Daq.LIZ(56.0d)));
            }
        }
        if (C1251004uy.LIZ()) {
            C0S78.LIZJ(new AwS568S0100000_24(this, 17), true);
        }
        C1582020rGq.LIZ("scene_top_left_icon_inflate_preload");
    }
}
