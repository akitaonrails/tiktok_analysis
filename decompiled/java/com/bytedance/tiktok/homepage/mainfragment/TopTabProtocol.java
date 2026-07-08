package com.bytedance.tiktok.homepage.mainfragment;

import X.C01GW;
import X.C1583120rIc;
import X.C1584430rKj;
import X.C1591550rWD;
import X.C1591640rWM;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1570580qyO;
import X.EnumC1571190qzN;
import X.InterfaceC1589850rTT;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public abstract class TopTabProtocol implements CommonTabProtocol {
    public final String LL = "";
    public final Map<String, String> LLILLJJLI = C2097608Jq.LJ();
    public final int LLILLL = -2;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1584430rKj(this));

    public void LIZIZ() {
    }

    public InterfaceC1589850rTT LJ() {
        return null;
    }

    public EnumC1570580qyO LJFF() {
        return null;
    }

    public void LJIIIIZZ() {
    }

    public void LJIIIZ(String str, String str2) {
    }

    public void LJIIJ(String str) {
    }

    public void LJIILIIL(C1591640rWM c1591640rWM, C1591550rWD c1591550rWD) {
    }

    public void LJIILJJIL(EnumC1571190qzN enumC1571190qzN, EnumC1571190qzN enumC1571190qzN2) {
    }

    public boolean LJIILL() {
        return true;
    }

    public abstract Class<? extends Fragment> LLJIJIL();

    public abstract boolean enable();

    public abstract String getTag();

    public void init(Context context) {
    }

    public abstract String mc(Context context);

    public C1583120rIc LIZJ() {
        return new C1583120rIc();
    }

    public final C1583120rIc LJI() {
        return (C1583120rIc) this.LLILZ.getValue();
    }

    public EnumC1571190qzN LJIIJJI() {
        return LJIIL();
    }

    public Map<String, String> LIZLLL() {
        return this.LLILLJJLI;
    }

    public int LJII() {
        return this.LLILLL;
    }

    public EnumC1571190qzN LJIIL() {
        return EnumC1571190qzN.DARK;
    }

    public String getMob() {
        return this.LL;
    }

    public Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.TAB_HOX_AND_PROTOCOL_TAG", getTag(), bundle);
        return bundle;
    }
}
