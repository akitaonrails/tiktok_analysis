package com.ss.android.ugc.aweme.newfollow.ui;

import X.C01GW;
import X.C1584130rKF;
import X.C1584140rKG;
import X.C1584150rKH;
import X.C1592290rXP;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1583960rJy;
import X.InterfaceC1584160rKI;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;

/* JADX INFO: loaded from: classes25.dex */
public final class DiscoverCompassTabProtocol extends BottomTabProtocol {
    public final C01GW LLILLL;
    public Context LLILZ;
    public final C01GW LLILZIL;
    public final C1592290rXP LLILZLL;
    public final C01GW LLIZ;
    public final String LLIZLLLIL;
    public final EnumC1583960rJy LLJ;
    public final String LLJI;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return (Class) this.LLIZ.getValue();
    }

    public DiscoverCompassTabProtocol() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1584130rKF());
        this.LLILLL = c01gwLIZIZ;
        this.LLILZIL = C452501pT.LIZIZ(new C1584140rKG(this));
        this.LLILZLL = ((InterfaceC1584160rKI) c01gwLIZIZ.getValue()).LIZ();
        this.LLIZ = C452501pT.LIZIZ(new C1584150rKH());
        this.LLIZLLLIL = "DISCOVER";
        this.LLJ = EnumC1583960rJy.TAB_2;
        this.LLJI = "discovery";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getMob() {
        return this.LLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) {
        ((View.OnClickListener) this.LLILZIL.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "i18n_tab_mode", Boolean.TRUE);
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        this.LLILZ = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        return context.getResources().getString(2131830693);
    }
}
