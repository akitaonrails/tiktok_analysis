package com.ss.android.ugc.aweme.ecommerce.mall;

import X.AbstractC1767850w6Z;
import X.C01GW;
import X.C1565930qqt;
import X.C1583920rJu;
import X.C1584460rKm;
import X.C1592290rXP;
import X.C1767950w6j;
import X.C1772250wDf;
import X.C452501pT;
import X.EnumC1583960rJy;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class ShopBottomTabProtocol extends BottomTabProtocol {
    public Context LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1772250wDf(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1583920rJu());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1565930qqt());
    public final String LLIZ = "SHOP_MALL";
    public final EnumC1583960rJy LLIZLLLIL = EnumC1583960rJy.TAB_2;
    public final String LLJ = "homepage_shop_mall";

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1584460rKm LIZ() {
        return new C1584460rKm() { // from class: X.0rJt
            @Override // X.C1584460rKm
            public final View LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1593020rYa c1593020rYa) {
                return super.LIZ(interfaceC1583080rIY, c1593020rYa);
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return (C1592290rXP) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return (Class) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTab();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getMob() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) {
        ((AbstractC1767850w6Z) this.LLILZ.getValue()).LIZIZ(null, false, false);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJIIIIZZ(Context context) {
        ((AbstractC1767850w6Z) this.LLILZ.getValue()).LIZIZ(null, false, true);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) throws JSONException {
        this.LLILLL = context;
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        String str = this.LLJ;
        c1767950w6j.getClass();
        C1767950w6j.LJJI(str);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        return context.getResources().getString(2131833076);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C19EG r18, X.C1592130rX9 r19, X.C1592140rXA r20) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.ShopBottomTabProtocol.LJIIIZ(X.19EG, X.0rX9, X.0rXA):void");
    }
}
