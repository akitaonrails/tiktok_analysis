package com.bytedance.tiktok.homepage.mainfragment;

import X.AbstractC1583860rJo;
import X.C01GW;
import X.C1584250rKR;
import X.C1584460rKm;
import X.C1592130rX9;
import X.C1592140rXA;
import X.C1592290rXP;
import X.C19EG;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1583960rJy;
import X.InterfaceC1589850rTT;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BottomTabProtocol implements CommonTabProtocol {
    public final C01GW LL = C452501pT.LIZIZ(new C1584250rKR(this));
    public final String LLILLJJLI = "";

    public abstract C1592290rXP LIZJ();

    public abstract EnumC1583960rJy LIZLLL();

    public InterfaceC1589850rTT LJ() {
        return null;
    }

    public AbstractC1583860rJo LJFF() {
        return null;
    }

    public boolean LJI() {
        return false;
    }

    public void LJII(Context context) {
    }

    public void LJIIIIZZ(Context context) {
    }

    public void LJIIIZ(C19EG c19eg, C1592130rX9 c1592130rX9, C1592140rXA c1592140rXA) {
    }

    public abstract Class<? extends Fragment> LLJIJIL();

    public abstract boolean enable();

    public abstract String getTag();

    public void init(Context context) {
    }

    public abstract String mc(Context context);

    public C1584460rKm LIZ() {
        return new C1584460rKm();
    }

    public String getMob() {
        return this.LLILLJJLI;
    }

    public Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.TAB_HOX_AND_PROTOCOL_TAG", getTag(), bundle);
        return bundle;
    }
}
