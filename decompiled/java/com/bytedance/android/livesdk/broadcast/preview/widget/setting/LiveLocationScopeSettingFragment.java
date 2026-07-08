package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.AbstractC1098790ehR;
import X.C098200Yq;
import X.C0IJT;
import X.C0OM1;
import X.C0PEM;
import X.C0UKZ;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C16F5;
import X.C1749280vcc;
import X.C1841350y17;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C20736316Cj;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C474500IjA;
import X.C475510Ikn;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C752100Teq;
import X.C752740Tfs;
import X.C752760Tfu;
import X.C766270U4b;
import X.C786410Ut5;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationDistanceConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.location.LocationSettingsAPI;
import com.bytedance.android.livesdk.locationservice.LocationServiceNotionSheet;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import tikcast.api.anchor.AnchorLocationSettingsUpdateRequest;
import tikcast.api.anchor.AnchorLocationSettingsUpdateResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveLocationScopeSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9HELIOSPywoLionZjYpPTs6JiJiBSYlLQkjKi4nISoiGiw8OCAfLDsnISsrDz0yLygpJzs=";
    public int LLILLJJLI;
    public int LLILLL;
    public C1841350y17 LLILZ;
    public C1841350y17 LLILZIL;
    public C1841350y17 LLILZLL;
    public ViewGroup LLIZLLLIL;
    public ViewGroup LLJ;
    public ViewGroup LLJI;
    public ViewGroup LLJIJIL;
    public C1749280vcc LLJILJIL;
    public ViewGroup LLJILJILJ;
    public C16F5 LLJILLL;
    public C16F5 LLJJ;
    public ValueAnimator LLJJI;
    public boolean LLJJIII;
    public final long LL = -1;
    public final AwS591S0100000_12 LLIZ = new AwS591S0100000_12(this, 406);

    public final void NR() {
        if (!((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).yU0()) {
            UR(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Pm2(), ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1());
            return;
        }
        C500260Jjc.LJIILLIIL(this.LLJIJIL);
        C500260Jjc.LLFFF(this.LLJILJIL);
        C1749280vcc c1749280vcc = this.LLJILJIL;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C752100Teq(this, null), 2);
    }

    public final void SR() {
        C500260Jjc.LLFFF(this.LLJILJILJ);
        C500260Jjc.LJIILIIL(this.LLJILLL);
        C500260Jjc.LLFFF(this.LLJJ);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 4);
        valueAnimatorOfInt.setDuration(1200L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 18));
        this.LLJJI = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.LLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C752740Tfs c752740Tfs = C752740Tfs.LIZ;
        int i = this.LLILLL;
        c752740Tfs.getClass();
        C752740Tfs.LIZIZ = i;
        if (!this.LLJJIII && this.LLILLL != this.LLILLJJLI) {
            C480460Ism.LIZ().getClass();
            LocationSettingsAPI locationSettingsAPI = (LocationSettingsAPI) C480460Ism.LIZLLL(LocationSettingsAPI.class);
            AnchorLocationSettingsUpdateRequest anchorLocationSettingsUpdateRequest = new AnchorLocationSettingsUpdateRequest();
            anchorLocationSettingsUpdateRequest.f91switch = this.LLILLL;
            C11NZ<AnchorLocationSettingsUpdateResponse> c11nzUpdateLocationSettings = locationSettingsAPI.updateLocationSettings(anchorLocationSettingsUpdateRequest);
            if (c11nzUpdateLocationSettings != null) {
                c11nzUpdateLocationSettings.LJL(C11S5.LIZ()).LJJLJ();
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_location_setting_granularity");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL), "result");
        c474500IjALIZ.LIZ();
    }

    public final boolean OR(int i) {
        boolean zIsLocationPermissionGranted;
        Context context = getContext();
        if (context == null) {
            return false;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            zIsLocationPermissionGranted = iHostAppContext.isLocationPermissionGranted(context);
        } else {
            zIsLocationPermissionGranted = false;
        }
        if (zIsLocationPermissionGranted) {
            String strFq1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1();
            if (strFq1.length() == 0) {
                SR();
                return false;
            }
            RR(strFq1);
            return false;
        }
        PR(Integer.valueOf(i));
        return true;
    }

    public final void PR(Integer num) {
        C500260Jjc.LJIILIIL(this.LLJILJIL);
        C500260Jjc.LLFFF(this.LLJIJIL);
        C1841350y17 c1841350y17 = this.LLILZ;
        if (c1841350y17 != null) {
            c1841350y17.setChecked(true);
        }
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        if (getContext() != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C752760Tfu(this, num, null), 2);
        }
    }

    public final void RR(String str) {
        C500260Jjc.LLFFF(this.LLJILJILJ);
        C500260Jjc.LJIILIIL(this.LLJJ);
        ValueAnimator valueAnimator = this.LLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C500260Jjc.LLFFF(this.LLJILLL);
        C16F5 c16f5 = this.LLJILLL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131854895, str));
        }
    }

    public final void UR(int i, String str) {
        C500260Jjc.LJIILIIL(this.LLJILJIL);
        C500260Jjc.LLFFF(this.LLJIJIL);
        this.LLILLJJLI = i;
        this.LLILLL = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C1841350y17 c1841350y17 = this.LLILZ;
                    if (c1841350y17 != null) {
                        c1841350y17.setChecked(true);
                    }
                    C500260Jjc.LJIILIIL(this.LLJILJILJ);
                    return;
                }
                C1841350y17 c1841350y172 = this.LLILZLL;
                if (c1841350y172 != null) {
                    c1841350y172.setChecked(true);
                }
                if (str.length() > 0) {
                    RR(str);
                    return;
                } else {
                    SR();
                    return;
                }
            }
            C1841350y17 c1841350y173 = this.LLILZIL;
            if (c1841350y173 != null) {
                c1841350y173.setChecked(true);
            }
            if (str.length() > 0) {
                RR(str);
                return;
            } else {
                SR();
                return;
            }
        }
        C1841350y17 c1841350y174 = this.LLILZ;
        if (c1841350y174 != null) {
            c1841350y174.setChecked(true);
        }
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!LiveHostSettingsUIConfig.enable()) {
            view.setFitsSystemWindows(true);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.v_q);
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS556S0100000_12(this, 749));
            c0om1.LJ(c1251150ifB);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS551S0100000_7(this, 623));
            c0om1.LIZIZ(c1251150ifB2);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C497740JfY.LJIJI(2131854903);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(0);
            tuxNavBar.setNavActions(c0om1);
        }
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.eu1);
        this.LLJILJIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJILJILJ = (ViewGroup) view.findViewById(R.id.noa);
        this.LLJILLL = (C16F5) view.findViewById(R.id.no9);
        this.LLJJ = (C16F5) view.findViewById(R.id.nog);
        this.LLILZ = (C1841350y17) view.findViewById(R.id.jm8);
        this.LLILZIL = (C1841350y17) view.findViewById(R.id.v_0);
        this.LLILZLL = (C1841350y17) view.findViewById(R.id.v_5);
        C1841350y17 c1841350y17 = this.LLILZ;
        if (c1841350y17 != null) {
            c1841350y17.setInterceptToggleListener(new AwS556S0100000_12(this, 750));
        }
        C1841350y17 c1841350y172 = this.LLILZIL;
        if (c1841350y172 != null) {
            c1841350y172.setInterceptToggleListener(new AwS556S0100000_12(this, 751));
        }
        C1841350y17 c1841350y173 = this.LLILZLL;
        if (c1841350y173 != null) {
            c1841350y173.setInterceptToggleListener(new AwS556S0100000_12(this, 752));
        }
        TextView textView = (TextView) view.findViewById(R.id.v_7);
        if (textView != null) {
            HostAddLocationDistanceConfigSetting hostAddLocationDistanceConfigSetting = HostAddLocationDistanceConfigSetting.INSTANCE;
            textView.setText(C497740JfY.LJIIL(2131755925, hostAddLocationDistanceConfigSetting.getValue(), Integer.valueOf(hostAddLocationDistanceConfigSetting.getValue())));
        }
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.jm7);
        this.LLJ = (ViewGroup) view.findViewById(R.id.v9z);
        this.LLJI = (ViewGroup) view.findViewById(R.id.v_4);
        ViewGroup viewGroup = this.LLIZLLLIL;
        if (viewGroup != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup, new AwS591S0100000_12(this, 799));
        }
        ViewGroup viewGroup2 = this.LLJ;
        if (viewGroup2 != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup2, new AwS591S0100000_12(this, 802));
        }
        ViewGroup viewGroup3 = this.LLJI;
        if (viewGroup3 != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup3, new AwS591S0100000_12(this, 805));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.desc);
        String strLJIJI = C497740JfY.LJIJI(2131854901);
        String strLJIJI2 = C497740JfY.LJIJI(2131854902);
        int length = strLJIJI.length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI);
        sbLIZ.append(' ');
        sbLIZ.append(strLJIJI2);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C1119920fFW.LJ(getContext(), spannableString, length, spannableString.length(), 17, 8, 500);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezs, getContext())), length, spannableString.length(), 17);
        C786410Ut5.p2(spannableString, new AbstractC1098790ehR() { // from class: X.0Ik3
            @Override // X.AbstractC431510Gw1
            public final void LIZ() {
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // X.AbstractC1098790ehR
            public final void LIZIZ(View view2) {
                FragmentManager fragmentManager = this.LLILZIL.getFragmentManager();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("is_anchor", true);
                bundle2.putBoolean("show_dim_behind", true);
                C19322110iZ.LIZLLL(fragmentManager, LocationServiceNotionSheet.class, "location_service", null, bundle2);
            }
        }, length, spannableString.length(), 17);
        if (textView2 != null) {
            textView2.setLinksClickable(true);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setHighlightColor(0);
            textView2.setText(spannableString);
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.isLocationPermissionGranted(view.getContext())) {
            if (C0UKZ.LLJJJJJIL.LIZIZ().booleanValue()) {
                C500260Jjc.LJIILIIL(this.LLJILJIL);
                C500260Jjc.LLFFF(this.LLJIJIL);
                if (HostAddLocationSetting.INSTANCE.isV1()) {
                    C1841350y17 c1841350y174 = this.LLILZ;
                    if (c1841350y174 != null) {
                        c1841350y174.setChecked(false);
                    }
                    C1841350y17 c1841350y175 = this.LLILZLL;
                    if (c1841350y175 != null) {
                        c1841350y175.setChecked(true);
                    }
                    this.LLILLL = 3;
                } else {
                    C1841350y17 c1841350y176 = this.LLILZ;
                    if (c1841350y176 != null) {
                        c1841350y176.setChecked(false);
                    }
                    C1841350y17 c1841350y177 = this.LLILZIL;
                    if (c1841350y177 != null) {
                        c1841350y177.setChecked(true);
                    }
                    this.LLILLL = 2;
                }
                String strFq1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1();
                if (strFq1.length() > 0) {
                    RR(strFq1);
                } else {
                    SR();
                }
            } else {
                NR();
            }
            IHostAppContext iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext2 == null || !iHostAppContext2.isLocationServiceEnabled(getContext())) {
                C766270U4b.LIZLLL(2131854888);
            }
        } else {
            PR(null);
        }
        C0UKZ.LLJJJJJIL.LJFF(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h7a, viewGroup, false);
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
