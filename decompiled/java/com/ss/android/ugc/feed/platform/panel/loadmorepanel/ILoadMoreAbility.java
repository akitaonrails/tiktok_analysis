package com.ss.android.ugc.feed.platform.panel.loadmorepanel;

import X.AbstractC1616230sA1;
import X.C0O0I;
import X.C734320SrG;
import X.InterfaceC1568180quW;
import X.InterfaceC1603270rp7;
import X.InterfaceC1603280rp8;
import X.InterfaceC494301wD;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes25.dex */
public interface ILoadMoreAbility extends InterfaceC494301wD {
    void CV(String str);

    void DR0();

    void JU0(C734320SrG c734320SrG);

    void La2(AbstractC1616230sA1 abstractC1616230sA1);

    void Qx2(String str);

    void Sp0(InterfaceC1568180quW interfaceC1568180quW);

    void Xl1(InterfaceC1603280rp8 interfaceC1603280rp8);

    void addView(View view);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    boolean ea2();

    void f22();

    void g82(boolean z);

    void hJ2(String str);

    void jb1(InterfaceC1603270rp7 interfaceC1603270rp7);

    void oE1();

    void p41(InterfaceC1603270rp7 interfaceC1603270rp7);

    void removeView(View view);

    void resetLoadMoreState();

    void setLoadEmptyText(CharSequence charSequence);

    void showLoadMoreEmpty();

    void showLoadMoreError();

    void u31(C0O0I c0o0i);
}
