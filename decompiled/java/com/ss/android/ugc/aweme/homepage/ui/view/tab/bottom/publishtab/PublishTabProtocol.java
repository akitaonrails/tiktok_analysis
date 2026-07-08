package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab;

import X.C01GW;
import X.C0CXL;
import X.C1564440qoU;
import X.C1584460rKm;
import X.C1585030rLh;
import X.C1592290rXP;
import X.C1593140rYm;
import X.C452501pT;
import X.EnumC1583960rJy;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PublishTabProtocol extends BottomTabProtocol {
    public Context LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 581));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1564440qoU());
    public final C1592290rXP LLILZLL;
    public final String LLIZ;
    public final EnumC1583960rJy LLIZLLLIL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    public PublishTabProtocol() {
        C1592290rXP c1592290rXP;
        C0CXL.LIZ.getClass();
        boolean zLIZJ = C0CXL.LIZJ();
        Integer numValueOf = Integer.valueOf(R.id.nw3);
        if (zLIZJ) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_tab_bottom_create_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_create_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_create, R.attr.a1k, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_create, R.attr.a1k, false, 12), numValueOf, 32);
        } else if (((ICoinService) ServiceManager.get().getService(ICoinService.class)).LJIJJ()) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_tab_bottom_create_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_create_fill, R.attr.ee, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_create, R.attr.a1k, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_create, R.attr.eg, false, 12), numValueOf, 32);
        } else {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.id.nw3, R.attr.a1h, false, 12), (C1593140rYm) null, new C1593140rYm(R.id.nw3, R.attr.a1h, false, 12), new C1593140rYm(R.id.nw3, R.attr.eg, false, 12), numValueOf, 34);
        }
        this.LLILZLL = c1592290rXP;
        this.LLIZ = "PUBLISH";
        this.LLIZLLLIL = EnumC1583960rJy.TAB_3;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1584460rKm LIZ() {
        return new PublishBottomTabViewFactory();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) {
        if (C1585030rLh.LJIIL()) {
            ((Keva) this.LLILZIL.getValue()).storeBoolean("has_enter_publish", true);
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter().setCustomTag("creative_content_user_action", "creative_content_enter_record_page");
        ((Keva) this.LLILZIL.getValue()).storeBoolean("has_enter_publish", true);
        ((View.OnClickListener) this.LLILZ.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        this.LLILLL = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        C0CXL.LIZ.getClass();
        if (!C0CXL.LIZJ() && !((ICoinService) ServiceManager.get().getService(ICoinService.class)).LJIJJ()) {
            return "";
        }
        return context.getResources().getString(2131834311);
    }
}
