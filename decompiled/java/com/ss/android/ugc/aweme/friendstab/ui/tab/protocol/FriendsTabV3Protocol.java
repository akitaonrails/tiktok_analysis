package com.ss.android.ugc.aweme.friendstab.ui.tab.protocol;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0W17;
import X.C0XQ7;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1584050rK7;
import X.C1584060rK8;
import X.C1584080rKA;
import X.C1584190rKL;
import X.C1584640rL4;
import X.C1585030rLh;
import X.C1587170rP9;
import X.C1592290rXP;
import X.C1593140rYm;
import X.C1599640rjG;
import X.C319860CgK;
import X.C452501pT;
import X.EnumC1583960rJy;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragmentV3;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabV3Protocol extends BottomTabProtocol {
    public Context LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 554));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 555));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 553));
    public final C1592290rXP LLIZ;
    public final Class<? extends Fragment> LLIZLLLIL;
    public final String LLJ;
    public final EnumC1583960rJy LLJI;
    public final String LLJIJIL;

    public FriendsTabV3Protocol() {
        C1592290rXP c1592290rXP;
        boolean zLJIIL = C1585030rLh.LJIIL();
        Integer numValueOf = Integer.valueOf(R.id.jqp);
        Integer numValueOf2 = Integer.valueOf(R.id.nw6);
        if (zLJIIL) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_tab_bottom_friends_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_friends_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_friends, R.attr.a1k, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_friends, R.attr.a1k, false, 12), numValueOf2, numValueOf);
        } else {
            int i = C1584050rK7.LIZ[C1584190rKL.LIZ().ordinal()];
            if (i == 1) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_light, R.attr.a1k, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_dark, R.attr.a1k, true, 4), numValueOf2, numValueOf);
            } else if (i != 2) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.drawable.bv8, R.attr.a1h, false, 12), new C1593140rYm(R.drawable.bv7, R.attr.ee, false, 12), new C1593140rYm(R.drawable.bv9, R.attr.a1k, false, 12), new C1593140rYm(R.drawable.bv6, R.attr.eg, false, 12), numValueOf2, numValueOf);
            } else {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_friends_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_friends_dark, R.attr.a1h, true, 4), numValueOf2, numValueOf);
            }
        }
        this.LLIZ = c1592290rXP;
        this.LLIZLLLIL = SocialFriendsFeedFragmentV3.class;
        this.LLJ = "FRIENDS_TAB";
        this.LLJI = EnumC1583960rJy.TAB_2;
        this.LLJIJIL = "homepage_friends";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return C319860CgK.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getMob() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) {
        boolean z;
        Boolean boolValueOf;
        IFriendsV3RefreshAbility iFriendsV3RefreshAbility;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && !((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C1584640rL4) this.LLILZLL.getValue()).onClick(null);
            return;
        }
        C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
        if (c1599640rjG.Ru()) {
            Fragment fragmentVu = c1599640rjG.Vu();
            if (fragmentVu != null && (iFriendsV3RefreshAbility = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null)) != null) {
                boolValueOf = Boolean.valueOf(iFriendsV3RefreshAbility.LJJIIJZLJL());
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                C0W17.LIZJ("bottomProtocol", "isRefreshing ignore refresh trigger");
                return;
            } else {
                ((C1584060rK8) this.LLILZIL.getValue()).onClick(null);
                return;
            }
        }
        ((C1584080rKA) this.LLILZ.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundleV9 = super.V9(context);
        C1578630rBN.LJIIIIZZ(bundleV9, "Friends_v3");
        bundleV9.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 31);
        return bundleV9;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        this.LLILLL = context;
        C1587170rP9.LIZ.getClass();
        C1587170rP9.LJI();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        return context.getString(2131834970);
    }
}
