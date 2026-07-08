package com.ss.android.ugc.aweme.friendstab.tab;

import X.C01GW;
import X.C0XQ7;
import X.C1578630rBN;
import X.C1583010rIR;
import X.C1583120rIc;
import X.C1583300rIu;
import X.C1587170rP9;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C295730BiV;
import X.C452501pT;
import X.EnumC1570580qyO;
import X.EnumC1583970rJz;
import X.ViewOnClickListenerC1584850rLP;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendTopTabProtocol extends TopTabProtocol {
    public Context LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1583010rIR(this));
    public final String LLIZLLLIL = "FRIENDS_FEED";
    public final Class<? extends Fragment> LLJ = SocialFriendsFeedFragment.class;
    public final String LLJI = "homepage_friends";
    public final int LLJIJIL = 31;
    public final EnumC1570580qyO LLJILJIL = EnumC1570580qyO.FRIENDS;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        ((ViewOnClickListenerC1584850rLP) this.LLIZ.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc() { // from class: X.0rIA
            @Override // X.C1583120rIc
            public final AbstractC1584410rKh LIZJ() {
                return new C1574880r5K();
            }

            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, final C1584440rKk c1584440rKk) {
                Context context = c1584440rKk.LIZ;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                final View viewLIZJ = C20673215v0.LIZJ(R.layout.cai, C1388190mED.LIZ(context));
                C1587740rQ4.LIZ.getClass();
                if (!C1587740rQ4.LJIJI) {
                    C1587740rQ4.LJIIIIZZ = SystemClock.elapsedRealtime() - jElapsedRealtime;
                }
                final TextView textView = (TextView) viewLIZJ.findViewById(android.R.id.text1);
                if (((Boolean) C0B5V.LIZ.getValue()).booleanValue() && textView != null) {
                    textView.setText(context.getString(2131850692));
                }
                return new InterfaceC1583070rIX() { // from class: X.0rIB
                    @Override // X.InterfaceC1583070rIX
                    public final float getTextWidth() {
                        TextPaint paint;
                        TextView textView2 = textView;
                        if (textView2 == null || (paint = textView2.getPaint()) == null) {
                            return 0.0f;
                        }
                        return paint.measureText(c1584440rKk.LIZJ);
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final int LIZ() {
                        return getView().getWidth();
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final View getView() {
                        return viewLIZJ;
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final void setText(String str) {
                        TextView textView2 = textView;
                        if (textView2 != null) {
                            textView2.setText(str);
                        }
                    }
                };
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return C1589640rT8.LIZIZ.F2();
    }

    public FriendTopTabProtocol() {
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return C0XQ7.LJFF().isLogin() || C1589640rT8.LIZIZ.V1();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1570580qyO LJFF() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundleV9 = super.V9(context);
        C1578630rBN.LJIIIIZZ(bundleV9, "Friends");
        return bundleV9;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        this.LLILZIL = context;
        if (!this.LLILZLL) {
            this.LLILZLL = true;
            C1587170rP9.LIZ.getClass();
            C1587170rP9.LJI();
        }
        C1589640rT8.LIZIZ.Z2();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        int i;
        if (C295730BiV.LIZ()) {
            i = 2131850686;
        } else {
            i = 2131834970;
        }
        return context.getString(i);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        C1583300rIu.LIZ.getClass();
        if (!C1583300rIu.LIZIZ()) {
            C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("FRIENDS_FEED");
        }
    }
}
