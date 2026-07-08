package com.ss.android.ugc.aweme.setting.page.accessibility;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0T1N;
import X.C1247340iZ2;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1697630uHJ;
import X.C189200o6;
import X.C197039127h;
import X.C19724512Ff;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21352318hF;
import X.C2344009Gk;
import X.C296090Bj5;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C497270Jen;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC19724812Fi;
import Y.ACListenerS134S0200000_32;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class DynamicFontSizeFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOS40LWHELIOSstKiw2OzYlKyY/ITE1ZwsqJiQhICwVJys4GiYpLQM+KCg+LSs4";
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 237));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 241));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 249));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 253));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 236));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 238));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 247));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 248));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 239));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 240));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 242));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 243));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 251));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 252));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 245));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 244));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS576S0100000_32(this, 254));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 246));
    public boolean LLJJJ = true;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(82));

    public final C21352318hF NR() {
        return (C21352318hF) this.LLJJJIL.getValue();
    }

    public final void MR(int i) {
        LayerDrawable layerDrawableLJIILIIL;
        TuxIconView tuxIconView = (TuxIconView) this.LLILLJJLI.getValue();
        if (tuxIconView != null) {
            tuxIconView.setIconHeight(i);
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLILLJJLI.getValue();
        if (tuxIconView2 != null) {
            tuxIconView2.setIconHeight(i);
        }
        Context context = getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
            c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_light;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = i;
            c384050F3z.LJI = i;
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ej);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            c384050F3z.LJ = -1;
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        } else {
            layerDrawableLJIILIIL = null;
        }
        TuxIconView tuxIconView3 = (TuxIconView) this.LLILLJJLI.getValue();
        if (tuxIconView3 != null) {
            tuxIconView3.setImageDrawable(layerDrawableLJIILIIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(int r13) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeFragment.OR(int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJIJIIJIL = C1697630uHJ.LIZ;
        if (NR() != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("previous_page", "settings_page");
            c2344009Gk.LJIIIIZZ("enter_method", "click_button");
            c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
            C20684815ws.LJIILLIIL("enter_font_size", c2344009Gk.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLIZIZ;
        Drawable drawableLIZ;
        String string;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Drawable drawableLIZ2;
        int i;
        int i2;
        int i3;
        int i4;
        super.onViewCreated(view, bundle);
        if (C296090Bj5.LIZ()) {
            int iLIZIZ = C296090Bj5.LIZIZ();
            if (iLIZIZ != 1) {
                if (iLIZIZ != 2) {
                    if (iLIZIZ != 3) {
                        i = R.raw.icon_color_like_shadow_alt_1;
                    } else {
                        i = R.raw.icon_exp_exp_02_icon_media_like;
                    }
                } else {
                    i = R.raw.icon_exp_exp_01_icon_media_like;
                }
            } else {
                i = R.raw.icon_media_like;
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLIZ.getValue();
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i;
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            int iLIZIZ2 = C296090Bj5.LIZIZ();
            if (iLIZIZ2 != 1) {
                if (iLIZIZ2 != 2) {
                    if (iLIZIZ2 != 3) {
                        i2 = R.raw.icon_color_comment_shadow_alt_1;
                    } else {
                        i2 = R.raw.icon_exp_exp_02_icon_media_comment;
                    }
                } else {
                    i2 = R.raw.icon_exp_exp_01_icon_media_comment;
                }
            } else {
                i2 = R.raw.icon_media_comment;
            }
            TuxIconView tuxIconView2 = (TuxIconView) this.LLJ.getValue();
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = i2;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.ef);
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
            int iLIZIZ3 = C296090Bj5.LIZIZ();
            if (iLIZIZ3 != 1) {
                if (iLIZIZ3 != 2) {
                    if (iLIZIZ3 != 3) {
                        i3 = R.raw.icon_color_bookmark_shadow_alt_1;
                    } else {
                        i3 = R.raw.icon_exp_exp_02_icon_media_favoriate;
                    }
                } else {
                    i3 = R.raw.icon_exp_exp_01_icon_media_favoriate;
                }
            } else {
                i3 = R.raw.icon_media_favoriate;
            }
            TuxIconView tuxIconView3 = (TuxIconView) this.LLJIJIL.getValue();
            if (tuxIconView3 != null) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = i3;
                tuxIconView3.setTuxIcon(c419910GdJ3);
            }
            int iLIZIZ4 = C296090Bj5.LIZIZ();
            if (iLIZIZ4 != 1) {
                if (iLIZIZ4 != 2) {
                    if (iLIZIZ4 != 3) {
                        i4 = R.raw.icon_color_share_shadow_alt_2;
                    } else {
                        i4 = R.raw.icon_exp_exp_02_icon_media_share;
                    }
                } else {
                    i4 = R.raw.icon_exp_exp_01_icon_media_share;
                }
            } else {
                i4 = R.raw.icon_media_share;
            }
            TuxIconView tuxIconView4 = (TuxIconView) this.LLJILJILJ.getValue();
            if (tuxIconView4 != null) {
                C419910GdJ c419910GdJ4 = new C419910GdJ();
                c419910GdJ4.LIZ = i4;
                tuxIconView4.setTuxIcon(c419910GdJ4);
            }
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLILZIL.getValue();
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(102);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LLJJIII.getValue();
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(42);
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.LLJJIJI.getValue();
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(22);
        }
        OR(this.LLJJIJIIJIL);
        Forest forestLIZ = C0T1N.LIZ();
        Drawable drawableLIZ3 = null;
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_dynamic_font_page";
        requestParams.bundle = "dynamic_font_page_background.png";
        String str = "";
        forestLIZ.fetchResourceAsync("", requestParams, new AwS585S0100000_6(this, 342));
        C497270Jen.LJ(getActivity(), false);
        if (getContext() != null) {
            C497270Jen.LIZLLL(0, getActivity());
        }
        this.LLJJIJIL = this.LLJJIJIIJIL;
        MR(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        Context context = getContext();
        if (context != null) {
            zLIZIZ = C960203pA.LIZIZ(context);
        } else {
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            View view2 = (View) this.LLILZLL.getValue();
            if (view2 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
                    c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    drawableLIZ2 = c384050F3z.LIZ(context2);
                } else {
                    drawableLIZ2 = null;
                }
                view2.setBackground(drawableLIZ2);
            }
        } else {
            View view3 = (View) this.LLILZLL.getValue();
            if (view3 != null) {
                Context context3 = getContext();
                if (context3 != null) {
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zp);
                    c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    drawableLIZ = c384050F3z2.LIZ(context3);
                } else {
                    drawableLIZ = null;
                }
                view3.setBackground(drawableLIZ);
            }
        }
        C19724512Ff c19724512Ff = (C19724512Ff) this.LLILZ.getValue();
        if (c19724512Ff != null) {
            c19724512Ff.setIndicator(this.LLJJIJIIJIL);
        }
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            C1247340iZ2.LIZ(onBackPressedDispatcher, getViewLifecycleOwner(), new AwS611S0100000_32(this, 82), 2);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLILLL.getValue();
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ5 = new C419910GdJ();
            c419910GdJ5.LIZ = R.raw.icon_chevron_left_offset_ltr;
            c419910GdJ5.LJ = Integer.valueOf(R.attr.a1h);
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ5;
            c1251150ifB.LIZJ(new AwS576S0100000_32(this, 250));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            Context context4 = getContext();
            if (context4 != null && (string = context4.getString(2131832507)) != null) {
                str = string;
            }
            c1250250idj.LIZJ = str;
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar2 = (TuxNavBar) this.LLILLL.getValue();
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(0);
        }
        C197039127h c197039127h = (C197039127h) this.LLILZIL.getValue();
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS134S0200000_32(this, view, 7));
        }
        C197039127h c197039127h2 = (C197039127h) this.LLILZIL.getValue();
        if (c197039127h2 != null) {
            Context context5 = getContext();
            if (context5 != null) {
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                drawableLIZ3 = c384050F3z3.LIZ(context5);
            }
            c197039127h2.setBackground(drawableLIZ3);
        }
        C19724512Ff c19724512Ff2 = (C19724512Ff) this.LLILZ.getValue();
        if (c19724512Ff2 != null) {
            c19724512Ff2.setOnSliderListener(new InterfaceC19724812Fi() { // from class: X.18hG
                @Override // X.InterfaceC19724812Fi
                public final void onProgressChanged(int i5) {
                    DynamicFontSizeFragment dynamicFontSizeFragment = this.LIZ;
                    dynamicFontSizeFragment.LLJJIJIL = i5;
                    dynamicFontSizeFragment.OR(i5);
                    DynamicFontSizeFragment dynamicFontSizeFragment2 = this.LIZ;
                    if (dynamicFontSizeFragment2.LLJJJ) {
                        if (dynamicFontSizeFragment2.NR() != null) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LIZJ(i5, "font_value");
                            C20684815ws.LJIILLIIL("change_slider_font_size", c2344009Gk.LIZ);
                        }
                        this.LIZ.LLJJJ = false;
                    }
                    Context context6 = this.LIZ.getContext();
                    if (context6 != null) {
                        new C0ZDN(context6).LIZ(0);
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f6m, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
