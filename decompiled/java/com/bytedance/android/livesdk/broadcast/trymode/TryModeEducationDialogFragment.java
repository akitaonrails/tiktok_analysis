package com.bytedance.android.livesdk.broadcast.trymode;

import X.C01GW;
import X.C0IJT;
import X.C1143920fsE;
import X.C1324720kZq;
import X.C16FS;
import X.C16FV;
import X.C1766560w4U;
import X.C20743416Fc;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC772600USk;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class TryModeEducationDialogFragment extends AbTryModeEducationDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4HELIOSZzshMSgjLSp9HDc1BCA3LQAoPCwyPCwjJws6KSkjLgkhKSIhLCEn";
    public String LL;
    public View.OnClickListener LLILLJJLI;
    public C1324720kZq LLILLL;
    public C20743416Fc LLILZ;
    public LinearLayout LLILZIL;
    public C16FV LLILZLL;
    public C20743416Fc LLIZ;
    public LinearLayout LLIZLLLIL;
    public C16FV LLJ;
    public C20743416Fc LLJI;
    public C16FS LLJIJIL;
    public C20743416Fc LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(95));
    public final String LLJILLL = String.valueOf(UserService.getInstance().user().LJIJJLI().getId());

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hqp);
        c500980Jkm.LIZJ = R.style.akr;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (C500260Jjc.LJ(getContext()) != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
            tuxImmersionBarLIZJ.LIZJ(false, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    public static void OR(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_practice_edu_show");
        c474500IjALIZ.LJJII(str, "function");
        c474500IjALIZ.LIZ();
    }

    public final void MR(String str) {
        C1143920fsE c1143920fsE = (C1143920fsE) this.LLJILJILJ.getValue();
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq == null) {
            c1324720kZq = null;
        }
        c1143920fsE.LIZ = c1324720kZq;
        c1143920fsE.LIZIZ = "tiktok_live_broadcast_demand_6";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttlive_try_mode_education_guide_");
        sbLIZ.append(str);
        sbLIZ.append(".webp");
        c1143920fsE.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        c1143920fsE.LJI = 1;
        c1143920fsE.LJFF = true;
        c1143920fsE.LIZLLL();
        ((C1143920fsE) this.LLJILJILJ.getValue()).LJFF();
    }

    public final void NR(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("practice_edu_click");
        c474500IjALIZ.LJJII(this.LLJILLL, "anchor_id");
        c474500IjALIZ.LJJII(str, "function");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("WebpFileName")) == null) {
            string = "";
        }
        this.LL = string;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 176), view.findViewById(R.id.fy1));
        this.LLILLL = (C1324720kZq) view.findViewById(R.id.webp_view);
        this.LLILZ = (C20743416Fc) view.findViewById(R.id.gv6);
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.foi);
        this.LLILZLL = (C16FV) view.findViewById(R.id.foj);
        this.LLIZ = (C20743416Fc) view.findViewById(R.id.fok);
        this.LLIZLLLIL = (LinearLayout) view.findViewById(R.id.fol);
        this.LLJ = (C16FV) view.findViewById(R.id.fom);
        this.LLJI = (C20743416Fc) view.findViewById(R.id.fon);
        this.LLJILJIL = (C20743416Fc) view.findViewById(R.id.foo);
        this.LLJIJIL = (C16FS) view.findViewById(R.id.j42);
        String str = this.LL;
        C16FS c16fs = null;
        if (str == null) {
            str = null;
        }
        switch (str.hashCode()) {
            case 3172656:
                if (!str.equals("gift")) {
                    return;
                }
                OR("gift");
                C1324720kZq c1324720kZq = this.LLILLL;
                if (c1324720kZq == null) {
                    c1324720kZq = null;
                }
                C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(220.0f), c1324720kZq);
                C1324720kZq c1324720kZq2 = this.LLILLL;
                if (c1324720kZq2 == null) {
                    c1324720kZq2 = null;
                }
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(0.0f), c1324720kZq2);
                C20743416Fc c20743416Fc = this.LLILZ;
                if (c20743416Fc == null) {
                    c20743416Fc = null;
                }
                c20743416Fc.setText(2131842621);
                LinearLayout linearLayout = this.LLILZIL;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                C500260Jjc.LJIILIIL(linearLayout);
                LinearLayout linearLayout2 = this.LLIZLLLIL;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                C500260Jjc.LJIILIIL(linearLayout2);
                C20743416Fc c20743416Fc2 = this.LLJILJIL;
                if (c20743416Fc2 == null) {
                    c20743416Fc2 = null;
                }
                C500260Jjc.LLFFF(c20743416Fc2);
                C20743416Fc c20743416Fc3 = this.LLJILJIL;
                if (c20743416Fc3 == null) {
                    c20743416Fc3 = null;
                }
                c20743416Fc3.setText(2131842619);
                MR("gift");
                C16FS c16fs2 = this.LLJIJIL;
                if (c16fs2 != null) {
                    c16fs = c16fs2;
                }
                C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 307));
                InterfaceC772600USk.Ef.LJFF(Boolean.FALSE);
                return;
            case 71620434:
                if (!str.equals("multi_guest")) {
                    return;
                }
                OR("multi");
                C20743416Fc c20743416Fc4 = this.LLILZ;
                if (c20743416Fc4 == null) {
                    c20743416Fc4 = null;
                }
                c20743416Fc4.setText(2131842633);
                C16FV c16fv = this.LLILZLL;
                if (c16fv == null) {
                    c16fv = null;
                }
                c16fv.setImageResource(R.drawable.fe8);
                C20743416Fc c20743416Fc5 = this.LLIZ;
                if (c20743416Fc5 == null) {
                    c20743416Fc5 = null;
                }
                c20743416Fc5.setText(2131842628);
                C16FV c16fv2 = this.LLJ;
                if (c16fv2 == null) {
                    c16fv2 = null;
                }
                c16fv2.setImageResource(R.drawable.fe7);
                C20743416Fc c20743416Fc6 = this.LLJI;
                if (c20743416Fc6 == null) {
                    c20743416Fc6 = null;
                }
                c20743416Fc6.setText(2131842629);
                MR("multi_guest");
                C16FS c16fs3 = this.LLJIJIL;
                if (c16fs3 != null) {
                    c16fs = c16fs3;
                }
                C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 310));
                InterfaceC772600USk.Cf.LJFF(Boolean.FALSE);
                return;
            case 103668165:
                if (!str.equals("match")) {
                    return;
                }
                break;
            case 570398262:
                if (!str.equals("interact")) {
                    return;
                }
                OR("interaction");
                C1324720kZq c1324720kZq3 = this.LLILLL;
                if (c1324720kZq3 == null) {
                    c1324720kZq3 = null;
                }
                C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(212.0f), c1324720kZq3);
                C1324720kZq c1324720kZq4 = this.LLILLL;
                if (c1324720kZq4 == null) {
                    c1324720kZq4 = null;
                }
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(0.0f), c1324720kZq4);
                C20743416Fc c20743416Fc7 = this.LLILZ;
                if (c20743416Fc7 == null) {
                    c20743416Fc7 = null;
                }
                c20743416Fc7.setText(2131842624);
                LinearLayout linearLayout3 = this.LLILZIL;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                C500260Jjc.LJIILIIL(linearLayout3);
                LinearLayout linearLayout4 = this.LLIZLLLIL;
                if (linearLayout4 == null) {
                    linearLayout4 = null;
                }
                C500260Jjc.LJIILIIL(linearLayout4);
                C20743416Fc c20743416Fc8 = this.LLJILJIL;
                if (c20743416Fc8 == null) {
                    c20743416Fc8 = null;
                }
                C500260Jjc.LLFFF(c20743416Fc8);
                C20743416Fc c20743416Fc9 = this.LLJILJIL;
                if (c20743416Fc9 == null) {
                    c20743416Fc9 = null;
                }
                c20743416Fc9.setText(2131842622);
                MR("interact");
                C16FS c16fs4 = this.LLJIJIL;
                if (c16fs4 != null) {
                    c16fs = c16fs4;
                }
                C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 308));
                InterfaceC772600USk.Df.LJFF(Boolean.FALSE);
                return;
            case 937330075:
                if (!str.equals("co_host")) {
                    return;
                }
                break;
            default:
                return;
        }
        OR("cohost");
        C20743416Fc c20743416Fc10 = this.LLILZ;
        if (c20743416Fc10 == null) {
            c20743416Fc10 = null;
        }
        c20743416Fc10.setText(2131842618);
        C16FV c16fv3 = this.LLILZLL;
        if (c16fv3 == null) {
            c16fv3 = null;
        }
        c16fv3.setImageResource(R.drawable.fe5);
        C20743416Fc c20743416Fc11 = this.LLIZ;
        if (c20743416Fc11 == null) {
            c20743416Fc11 = null;
        }
        c20743416Fc11.setText(2131842614);
        C16FV c16fv4 = this.LLJ;
        if (c16fv4 == null) {
            c16fv4 = null;
        }
        c16fv4.setImageResource(R.drawable.fe2);
        C20743416Fc c20743416Fc12 = this.LLJI;
        if (c20743416Fc12 == null) {
            c20743416Fc12 = null;
        }
        c20743416Fc12.setText(2131842615);
        C16FS c16fs5 = this.LLJIJIL;
        if (c16fs5 == null) {
            c16fs5 = null;
        }
        c16fs5.setText(2131842634);
        MR("co_host");
        C16FS c16fs6 = this.LLJIJIL;
        if (c16fs6 != null) {
            c16fs = c16fs6;
        }
        C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 306));
        InterfaceC772600USk.Bf.LJFF(Boolean.FALSE);
    }
}
