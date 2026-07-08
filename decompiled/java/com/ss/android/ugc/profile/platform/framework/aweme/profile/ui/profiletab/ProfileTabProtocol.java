package com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab;

import X.C01GW;
import X.C1255210ilj;
import X.C128Y;
import X.C1388190mED;
import X.C1571050qz9;
import X.C1584020rK4;
import X.C1584190rKL;
import X.C1585030rLh;
import X.C1592290rXP;
import X.C1593140rYm;
import X.C19EG;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1583960rJy;
import X.InterfaceC1583930rJv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class ProfileTabProtocol extends BottomTabProtocol {
    public Context LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1571050qz9(this));
    public final C1592290rXP LLILZIL;
    public final Class<? extends Fragment> LLILZLL;
    public final String LLIZ;
    public final EnumC1583960rJy LLIZLLLIL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    public ProfileTabProtocol() {
        C1592290rXP c1592290rXP;
        boolean zLJIIL = C1585030rLh.LJIIL();
        Integer numValueOf = Integer.valueOf(R.id.nw9);
        if (zLJIIL) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_tab_bottom_profile_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_profile_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_profile, R.attr.a1k, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_profile, R.attr.a1k, false, 12), numValueOf, 32);
        } else {
            int i = C1584020rK4.LIZ[C1584190rKL.LIZ().ordinal()];
            if (i == 1) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_profile_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_profile_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_profile_light, R.attr.a1k, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_profile_dark, R.attr.a1k, true, 4), numValueOf, 32);
            } else if (i != 2) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.drawable.cz8, R.attr.a1h, false, 12), new C1593140rYm(R.drawable.cz7, R.attr.ee, false, 12), new C1593140rYm(R.drawable.cz9, R.attr.a1k, false, 12), new C1593140rYm(R.drawable.cz6, R.attr.eg, false, 12), numValueOf, 32);
            } else {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_profile_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_profile_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_profile_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_profile_dark, R.attr.a1h, true, 4), numValueOf, 32);
            }
        }
        this.LLILZIL = c1592290rXP;
        this.LLILZLL = I18nMyProfileFragment.class;
        this.LLIZ = "USER";
        this.LLIZLLLIL = EnumC1583960rJy.TAB_5;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getMob() {
        Context context = this.LLILLL;
        if (context == null) {
            context = null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C128Y c128yKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki(this.LLIZ);
            return c128yKi instanceof I18nUserProfileFragment ? "others_homepage" : c128yKi instanceof InterfaceC1583930rJv ? ((InterfaceC1583930rJv) c128yKi).getEnterFrom() : "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not find activity of context ");
        Context context2 = this.LLILLL;
        sbLIZ.append(context2 != null ? context2 : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean LJI() {
        return C1585030rLh.LJIL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) throws Throwable {
        boolean zLJI = MethodIDManager.LJI(71705);
        ((C1255210ilj) this.LLILZ.getValue()).LIZLLL();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJIIIIZZ(Context context) throws Throwable {
        ((C1255210ilj) this.LLILZ.getValue()).LIZLLL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle V9(Context context) {
        String stringExtra;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("from", "from_main", bundle);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            Intent intent = activityLIZ.getIntent();
            try {
                stringExtra = intent.getStringExtra("profile_from_scene");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            C786410Ut5.LJJJI("profile_from_scene", stringExtra, bundle);
            bundle.putBoolean("show_collect", intent.getBooleanExtra("show_collect", false));
            return bundle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        this.LLILLL = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        return context.getResources().getString(2131845374);
    }
}
