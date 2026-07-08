package com.ss.android.ugc.aweme.follow;

import X.C0IJT;
import X.C0IPN;
import X.C1143680frq;
import X.C1295960jpS;
import X.C16F5;
import X.C450320HlG;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C519480KYw;
import X.C766270U4b;
import X.C785410UrT;
import X.C786410Ut5;
import X.C849850XVn;
import X.InterfaceC1106030et7;
import X.InterfaceC469360Ias;
import Y.ARunnableS107S0100000_7;
import android.app.Dialog;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.follow.widget.FollowBigWidgetProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowGuideWidgetDialog extends LiveDialogFragment implements View.OnClickListener, InterfaceC469360Ias {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMjJSHELIOSM8P2sKJiM/JzILPCY3LRIlLSg2PAElKCM8Lw==";
    public LiveIconView LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public ViewPager LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public C450320HlG LLJIJIL;
    public int LLJILJIL;
    public long LLJJ;
    public final List<C1295960jpS> LLJI = new ArrayList();
    public String LLJILJILJ = "";
    public String LLJILLL = "close";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void NR() {
        if (((ArrayList) this.LLJI).isEmpty() || this.LLJILJIL > ((ArrayList) this.LLJI).size()) {
            return;
        }
        C1295960jpS c1295960jpS = (C1295960jpS) ListProtector.get(this.LLJI, this.LLJILJIL);
        C519480KYw c519480KYw = C519480KYw.LIZ;
        Context context = getContext();
        c519480KYw.getClass();
        HandlerHook.viewPostDelay(c1295960jpS, new ARunnableS107S0100000_7(c1295960jpS, 118), C519480KYw.LIZ(context) ? 300L : 0L);
    }

    public final void OR() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_widget_tutorial_popup_show");
        c474500IjALIZ.LJJII(this.LLJILJILJ, "from_position");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJILJIL + 1), "page");
        c474500IjALIZ.LIZ();
    }

    public final void PR() {
        View view = this.LLIZ;
        if (view == null) {
            view = null;
        }
        view.setBackground(C497740JfY.LJIIJ(R.drawable.ci9));
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            view2 = null;
        }
        view2.setBackground(C497740JfY.LJIIJ(R.drawable.ci9));
        View view3 = this.LLJ;
        if (view3 == null) {
            view3 = null;
        }
        view3.setBackground(C497740JfY.LJIIJ(R.drawable.ci9));
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setBackground(C497740JfY.LJIIJ(R.drawable.ci6));
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 == null) {
            c16f52 = null;
        }
        c16f52.setTextColor(a.LIZIZ(R.attr.a1h, getContext()));
        int i = this.LLJILJIL;
        if (i == 0) {
            View view4 = this.LLIZ;
            if (view4 == null) {
                view4 = null;
            }
            view4.setBackground(C497740JfY.LJIIJ(R.drawable.ci8));
            C519480KYw c519480KYw = C519480KYw.LIZ;
            Context context = getContext();
            c519480KYw.getClass();
            if (C519480KYw.LIZ(context)) {
                C16F5 c16f53 = this.LLILLL;
                if (c16f53 == null) {
                    c16f53 = null;
                }
                c16f53.setText(getString(2131840968));
                C16F5 c16f54 = this.LLILZ;
                if (c16f54 == null) {
                    c16f54 = null;
                }
                c16f54.setBackground(C497740JfY.LJIIJ(R.drawable.b_5));
                C16F5 c16f55 = this.LLILZ;
                if (c16f55 == null) {
                    c16f55 = null;
                }
                c16f55.setTextColor(a.LIZIZ(R.attr.c3, getContext()));
                C16F5 c16f56 = this.LLILZ;
                (c16f56 != null ? c16f56 : null).setText(getString(2131844175));
            } else {
                C16F5 c16f57 = this.LLILLL;
                if (c16f57 == null) {
                    c16f57 = null;
                }
                c16f57.setText(getString(2131842214));
                C16F5 c16f58 = this.LLILZ;
                (c16f58 != null ? c16f58 : null).setText(getString(2131844176));
            }
            NR();
            OR();
            return;
        }
        if (i == 1) {
            View view5 = this.LLIZLLLIL;
            if (view5 == null) {
                view5 = null;
            }
            view5.setBackground(C497740JfY.LJIIJ(R.drawable.ci8));
            C16F5 c16f59 = this.LLILLL;
            if (c16f59 == null) {
                c16f59 = null;
            }
            c16f59.setText(getString(2131842215));
            C16F5 c16f510 = this.LLILZ;
            (c16f510 != null ? c16f510 : null).setText(getString(2131844176));
            NR();
            OR();
            return;
        }
        if (i == 2) {
            View view6 = this.LLJ;
            if (view6 == null) {
                view6 = null;
            }
            view6.setBackground(C497740JfY.LJIIJ(R.drawable.ci8));
            C16F5 c16f511 = this.LLILLL;
            if (c16f511 == null) {
                c16f511 = null;
            }
            c16f511.setText(getString(2131842216));
            C16F5 c16f512 = this.LLILZ;
            if (c16f512 == null) {
                c16f512 = null;
            }
            c16f512.setBackground(C497740JfY.LJIIJ(R.drawable.b_5));
            C16F5 c16f513 = this.LLILZ;
            if (c16f513 == null) {
                c16f513 = null;
            }
            c16f513.setTextColor(a.LIZIZ(R.attr.c3, getContext()));
            C16F5 c16f514 = this.LLILZ;
            (c16f514 != null ? c16f514 : null).setText(getString(2131844175));
            NR();
            OR();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.dcw);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog;
        super.onDestroyView();
        if (!isShowing() || (dialog = getDialog()) == null) {
            return;
        }
        dialog.dismiss();
        C785410UrT.LIZ(dialog);
    }

    public final void MR(String str) {
        C1295960jpS c1295960jpS = new C1295960jpS(getContext());
        C786410Ut5.s6(c1295960jpS, new ViewGroup.LayoutParams(-1, -1));
        c1295960jpS.setRepeatCount(-1);
        C1143680frq.LJIIJJI(c1295960jpS, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_outside_demand_1"), str);
        ((ArrayList) this.LLJI).add(c1295960jpS);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Context context;
        ViewPager viewPager = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == R.id.ft4) {
                C849850XVn.LIZIZ.LIZJ().LJIJI("add_live_watch_nscreen", "popup_close", true);
                this.LLJILLL = "close";
                dismiss();
                return;
            }
            if (numValueOf.intValue() != R.id.zo2 || this.LLILZIL == null) {
                return;
            }
            if (this.LLJILJIL < 2) {
                C519480KYw c519480KYw = C519480KYw.LIZ;
                Context context2 = getContext();
                c519480KYw.getClass();
                if (!C519480KYw.LIZ(context2)) {
                    C849850XVn.LIZIZ.LIZJ().LJIJI("add_live_watch_nscreen", "pm_story_widget_tutorial_btn_next", true);
                    int i = this.LLJILJIL + 1;
                    this.LLJILJIL = i;
                    ViewPager viewPager2 = this.LLILZIL;
                    if (viewPager2 != null) {
                        viewPager = viewPager2;
                    }
                    viewPager.setCurrentItem(i);
                    return;
                }
            }
            C849850XVn.LIZIZ.LIZJ().LJIJI("add_live_watch_nscreen", "pm_story_widget_tutorial_btn_done", true);
            C519480KYw.LIZ.getClass();
            if (C519480KYw.LIZIZ() == 1 && (context = getContext()) != null && Build.VERSION.SDK_INT >= 26) {
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                ComponentName componentName = new ComponentName(context, (Class<?>) FollowBigWidgetProvider.class);
                if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                    appWidgetManager.requestPinAppWidget(componentName, null, null);
                }
            }
            if (InterfaceC1106030et7.h7.LIZIZ().booleanValue()) {
                C766270U4b.LIZLLL(2131842218);
            }
            this.LLJILLL = "set widget";
            C473410IhP.LIZJ(new ARunnableS107S0100000_7(this, 119), 100L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r8) {
        /*
            r7 = this;
            java.lang.String r4 = r7.LLJILLL
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r7.LLJJ
            long r5 = r5 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L58
            long r0 = java.lang.System.currentTimeMillis()
            r7.LLJJ = r0
            java.lang.String r0 = "livesdk_widget_tutorial_popup_click"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "from_position"
            java.lang.String r0 = r7.LLJILJILJ
            r3.LJJII(r0, r1)
            java.lang.String r0 = "click_type"
            r3.LJJII(r4, r0)
            X.0KYw r0 = X.C519480KYw.LIZ
            r0.getClass()
            int r0 = X.C519480KYw.LIZIZ()
            r2 = 1
            if (r2 != r0) goto L66
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L66
            r0 = 0
            int[] r0 = X.C519480KYw.LJI(r1, r0)
            int r0 = r0.length
            if (r0 != 0) goto L5c
            java.lang.String r1 = "small"
        L43:
            java.lang.String r0 = "widget_type"
            r3.LJJII(r1, r0)
            int r0 = r7.LLJILJIL
            int r0 = r0 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "page"
            r3.LJJII(r1, r0)
            r3.LIZ()
        L58:
            super.onDismiss(r8)
            return
        L5c:
            int[] r0 = X.C519480KYw.LJI(r1, r2)
            int r0 = r0.length
            if (r0 != 0) goto L66
            java.lang.String r1 = "medium"
            goto L43
        L66:
            java.lang.String r1 = ""
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.follow.FollowGuideWidgetDialog.onDismiss(android.content.DialogInterface):void");
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        if (!((ArrayList) this.LLJI).isEmpty()) {
            for (C1295960jpS c1295960jpS : (ArrayList) this.LLJI) {
                c1295960jpS.cancelAnimation();
                c1295960jpS.clearAnimation();
            }
        }
        this.LLJILJIL = i;
        PR();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        this.LL = (LiveIconView) view.findViewById(R.id.ft4);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.zih);
        this.LLILLL = (C16F5) view.findViewById(R.id.zhx);
        this.LLILZ = (C16F5) view.findViewById(R.id.zo2);
        this.LLILZIL = (ViewPager) view.findViewById(R.id.jel);
        this.LLILZLL = view.findViewById(R.id.jd7);
        this.LLIZ = view.findViewById(R.id.view_point_index_1);
        this.LLIZLLLIL = view.findViewById(R.id.view_point_index_2);
        this.LLJ = view.findViewById(R.id.view_point_index_3);
        C16F5 c16f5 = this.LLILLJJLI;
        C450320HlG c450320HlG = null;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(getString(2131842644));
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 == null) {
            c16f52 = null;
        }
        c16f52.setText(getString(2131844175));
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("from_position", "")) != null) {
            str = string;
        }
        this.LLJILJILJ = str;
        LiveIconView liveIconView = this.LL;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C786410Ut5.g8(liveIconView, this);
        C16F5 c16f53 = this.LLILZ;
        if (c16f53 == null) {
            c16f53 = null;
        }
        C786410Ut5.l8(c16f53, this);
        C450320HlG c450320HlG2 = new C450320HlG();
        this.LLJIJIL = c450320HlG2;
        ViewPager viewPager = this.LLILZIL;
        if (viewPager == null) {
            viewPager = null;
        }
        viewPager.setAdapter(c450320HlG2);
        ViewPager viewPager2 = this.LLILZIL;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.addOnPageChangeListener(this);
        ((ArrayList) this.LLJI).clear();
        C519480KYw c519480KYw = C519480KYw.LIZ;
        Context context = getContext();
        c519480KYw.getClass();
        if (C519480KYw.LIZ(context)) {
            View view2 = this.LLILZLL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2);
            MR("ttlive_load_follow_guide.zip");
        } else {
            View view3 = this.LLILZLL;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(0, view3);
            int i = 0;
            loop0: while (true) {
                MR("live_following_widget_step1_light.zip");
                while (true) {
                    i++;
                    if (i >= 3) {
                        break loop0;
                    }
                    if (i != 0) {
                        if (i != 1) {
                            MR("ttlive_load_follow_guide.zip");
                        } else {
                            MR("live_following_widget_step2_light.zip");
                        }
                    }
                }
            }
        }
        C450320HlG c450320HlG3 = this.LLJIJIL;
        if (c450320HlG3 != null) {
            c450320HlG = c450320HlG3;
        }
        c450320HlG.LLILLJJLI = this.LLJI;
        c450320HlG.notifyDataSetChanged();
        this.LLJILJIL = 0;
        PR();
    }
}
