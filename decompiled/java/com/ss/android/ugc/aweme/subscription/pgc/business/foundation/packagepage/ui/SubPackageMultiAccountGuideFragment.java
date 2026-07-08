package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui;

import X.C098200Yq;
import X.C0HE8;
import X.C0JCX;
import X.C0K0R;
import X.C0KCC;
import X.C0KDQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C511520K4g;
import X.C511970K5z;
import X.C513440KBq;
import X.C786410Ut5;
import X.EnumC513420KBo;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageMultiAccountGuideFragment extends PgcBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmJiEtHELIOSPSY8Jms8KCw4KSIpOS40LWs5IGEAPSccKCw4KSIpBDo/PCwNKiw8PSs4Djo6LCAKOy40JSAiPQ==";
    public Map<String, String> LLILZ;
    public ViewGroup LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C197039127h LLJILJIL;
    public EnumC513420KBo LLILLJJLI = EnumC513420KBo.LATE_CALLBACK_SCENE;
    public C0KCC LLILLL = new C0KCC(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0, 0, false, -1, 15);
    public Function0<Unit> LLJILJILJ = AFwS193S0000000_7.get$arr$(170);

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.je4);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.jdh);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.q58);
        this.LLJ = (TuxTextView) view.findViewById(R.id.je6);
        this.LLJI = (TuxTextView) view.findViewById(R.id.w8t);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.q59);
        this.LLJILJIL = (C197039127h) view.findViewById(R.id.a23);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.pyo);
        C0KDQ c0kdq = C0KDQ.LIZ;
        Map<String, String> map = this.LLILZ;
        EnumC513420KBo enumC513420KBo = this.LLILLJJLI;
        c0kdq.getClass();
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_multi_account_pre_check_show");
        c511970K5z.LIZJ(map);
        C511970K5z.LIZ(c511970K5z);
        if (enumC513420KBo != null) {
            if (enumC513420KBo == EnumC513420KBo.INCORRECT_TIKTOK_OR_GP_ACCOUNT) {
                str = "tiktok_account";
            } else if (enumC513420KBo == EnumC513420KBo.INCORRECT_GP_ACCOUNT) {
                str = "google_account";
            } else if (enumC513420KBo == EnumC513420KBo.INCORRECT_PAYMENT_CHANNEL) {
                str = "payment_channel";
            } else {
                str = "undefined";
            }
        } else {
            str = null;
        }
        c511970K5z.LIZIZ(str, "show_type");
        c511970K5z.LIZLLL();
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(C511520K4g.LJIIIIZZ(2131839382, this.LLILLL.LJJII));
        }
        TuxTextView tuxTextView2 = this.LLJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C511520K4g.LJIIIIZZ(2131839379, this.LLILLL.LJJII));
        }
        TuxTextView tuxTextView3 = this.LLJIJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C511520K4g.LJIIIIZZ(2131839745, this.LLILLL.LJJII));
        }
        EnumC513420KBo enumC513420KBo2 = this.LLILLJJLI;
        if (enumC513420KBo2 != null) {
            int i = C513440KBq.LIZ[enumC513420KBo2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C0JCX.LIZLLL(C511520K4g.LJII(2131839747));
                            this.LLJILJILJ.invoke();
                            return;
                        }
                        return;
                    }
                    ViewGroup viewGroup = this.LLILZIL;
                    if (viewGroup != null) {
                        C0K0R.LIZ(viewGroup);
                    }
                    ViewGroup viewGroup2 = this.LLILZLL;
                    if (viewGroup2 != null) {
                        C0K0R.LIZ(viewGroup2);
                    }
                    ViewGroup viewGroup3 = this.LLIZ;
                    if (viewGroup3 != null) {
                        C0K0R.LIZJ(viewGroup3);
                    }
                    TuxTextView tuxTextView4 = this.LLIZLLLIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(C511520K4g.LJII(2131839746));
                    }
                    C197039127h c197039127h = this.LLJILJIL;
                    if (c197039127h == null) {
                        return;
                    }
                    c197039127h.setText(C511520K4g.LJII(2131839744));
                    C786410Ut5.U8(c197039127h, new ACListenerS142S0100000_7(this, 281));
                    return;
                }
                ViewGroup viewGroup4 = this.LLILZIL;
                if (viewGroup4 != null) {
                    C0K0R.LIZ(viewGroup4);
                }
                ViewGroup viewGroup5 = this.LLILZLL;
                if (viewGroup5 != null) {
                    C0K0R.LIZJ(viewGroup5);
                }
                ViewGroup viewGroup6 = this.LLIZ;
                if (viewGroup6 != null) {
                    C0K0R.LIZ(viewGroup6);
                }
                TuxTextView tuxTextView5 = this.LLIZLLLIL;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(C511520K4g.LJII(2131839380));
                }
                C197039127h c197039127h2 = this.LLJILJIL;
                if (c197039127h2 == null) {
                    return;
                }
                c197039127h2.setText(C511520K4g.LJII(2131839378));
                C786410Ut5.U8(c197039127h2, new ACListenerS111S0200000_7(this, c197039127h2, 52));
                return;
            }
            ViewGroup viewGroup7 = this.LLILZIL;
            if (viewGroup7 != null) {
                C0K0R.LIZJ(viewGroup7);
            }
            ViewGroup viewGroup8 = this.LLILZLL;
            if (viewGroup8 != null) {
                C0K0R.LIZ(viewGroup8);
            }
            ViewGroup viewGroup9 = this.LLIZ;
            if (viewGroup9 != null) {
                C0K0R.LIZ(viewGroup9);
            }
            TuxTextView tuxTextView6 = this.LLIZLLLIL;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(C511520K4g.LJII(2131839386));
            }
            C197039127h c197039127h3 = this.LLJILJIL;
            if (c197039127h3 == null) {
                return;
            }
            c197039127h3.setText(C511520K4g.LJII(2131839381));
            C786410Ut5.U8(c197039127h3, new ACListenerS142S0100000_7(this, 283));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fih, viewGroup, false);
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
