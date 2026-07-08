package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03IT;
import X.C0OO0;
import X.C0XGR;
import X.C0XQ7;
import X.C1266210j3T;
import X.C1389890mGx;
import X.C197039127h;
import X.C20684815ws;
import X.C2097608Jq;
import X.C427660Gpo;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS154S0100000_19;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CommonSetAvatarFragment extends BaseI18nLoginFragment {
    public FrameLayout LLLIILIL;
    public C427660Gpo LLLIL;
    public LinearLayout LLLILZ;
    public TuxIconView LLLILZJ;
    public C197039127h LLLILZLLLI;
    public boolean LLLL;
    public long LLLLII;
    public final C01GW LLLIZZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(39));
    public final C01GW LLLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(41));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 247));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 248));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(40));
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 245));
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 246));

    public final HashMap<String, String> NS() {
        return C2097608Jq.LJI(new Pair("login_panel_type", "signup"), new Pair("platform", this.LLLJL.getValue()), new Pair("enter_from", getEnterFrom()), new Pair("enter_method", getEnterMethod()));
    }

    public final C0XGR PS() {
        C0XGR c0xgr = new C0XGR();
        for (Map.Entry<String, String> entry : NS().entrySet()) {
            c0xgr.LIZJ(entry.getKey(), entry.getValue());
        }
        return c0xgr;
    }

    public final C197039127h QS() {
        C197039127h c197039127h = this.LLLILZLLLI;
        if (c197039127h != null) {
            return c197039127h;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public void ES() {
        C20684815ws.LJIILLIIL("set_avatar_skip", PS().LIZ);
    }

    public final void US(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.LLLILZ;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C786410Ut5.LJZL(8, linearLayout);
            TuxIconView tuxIconView = this.LLLILZJ;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            TuxIconView tuxIconView2 = this.LLLILZJ;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            GS(new ACListenerS154S0100000_19(this, 59), tuxIconView2);
            LinearLayout linearLayout2 = this.LLLILZ;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C786410Ut5.R7(linearLayout2, null);
            return;
        }
        LinearLayout linearLayout3 = this.LLLILZ;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        C786410Ut5.LJZL(0, linearLayout3);
        TuxIconView tuxIconView3 = this.LLLILZJ;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        LinearLayout linearLayout4 = this.LLLILZ;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        GS(new ACListenerS154S0100000_19(this, 60), linearLayout4);
        TuxIconView tuxIconView4 = this.LLLILZJ;
        if (tuxIconView4 == null) {
            tuxIconView4 = null;
        }
        C786410Ut5.a9(tuxIconView4, null);
    }

    public static void RS(Long l, String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("action_type", str);
        if (l != null) {
            c0xgr.LIZIZ(l.longValue(), "prefill_duration");
        }
        C20684815ws.LJIILLIIL("set_avatar_prefill", c0xgr.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        super.onViewCreated(view, bundle);
        this.LLLIILIL = (FrameLayout) view.findViewById(R.id.bj1);
        this.LLLIL = (C427660Gpo) view.findViewById(R.id.bh2);
        this.LLLILZ = (LinearLayout) view.findViewById(R.id.bhy);
        this.LLLILZJ = (TuxIconView) view.findViewById(R.id.bie);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.uun);
        c197039127h.setEnabled(false);
        this.LLLILZLLLI = c197039127h;
        if (((String) this.LLLJ.getValue()).length() > 0) {
            this.LLLL = true;
            QS().setEnabled(true);
            C427660Gpo c427660Gpo = this.LLLIL;
            if (c427660Gpo == null) {
                c427660Gpo = null;
            }
            C427660Gpo.LJIIJJI(c427660Gpo, this.LLLJ.getValue(), false, null, null, false, false, null, new C1266210j3T(this, 0), false, null, 894);
        }
        if (((String) this.LLLJ.getValue()).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        US(z);
        C0XGR c0xgrPS = PS();
        if (((Boolean) this.LLLJIL.getValue()).booleanValue()) {
            if (((String) this.LLLJ.getValue()).length() > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0xgrPS.LIZJ("is_prefilled", str);
        }
        C20684815ws.LJIILLIIL("set_avatar_show", c0xgrPS.LIZ);
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializableExtra;
        UrlModel urlModel;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent2);
        if (i == 10002) {
            C427660Gpo c427660Gpo = null;
            if (intent2 != null) {
                serializableExtra = intent2.getSerializableExtra("path");
            } else {
                serializableExtra = null;
            }
            if ((serializableExtra instanceof UrlModel) && (urlModel = (UrlModel) serializableExtra) != null) {
                this.LLLL = true;
                QS().setEnabled(true);
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJJL(urlModel, urlModel, urlModel);
                C427660Gpo c427660Gpo2 = this.LLLIL;
                if (c427660Gpo2 != null) {
                    c427660Gpo = c427660Gpo2;
                }
                C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(urlModel.getUrlList()), false, null, null, false, false, null, null, false, null, 1006);
                US(true);
                return;
            }
            return;
        }
        C0OO0 c0oo0 = (C0OO0) this.LLLLIIL.getValue();
        if (intent2 == null) {
            intent2 = (Intent) this.LLLLIIIILLL.getValue();
        }
        c0oo0.onActivityResult(i, i2, intent2);
    }
}
