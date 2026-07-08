package com.ss.android.ugc.aweme.component.bio.biometric.enroll;

import X.C01GW;
import X.C098200Yq;
import X.C1238130iKB;
import X.C1389600mGU;
import X.C1390130mHL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1685300txQ;
import X.C168Q;
import X.C1715260ujk;
import X.C1715910ukn;
import X.C189200o6;
import X.C19EG;
import X.C19F0;
import X.C19GS;
import X.C21505619Eg;
import X.C23250099c;
import X.C336720DHy;
import X.C452501pT;
import X.C786410Ut5;
import X.C860760Xpi;
import X.EnumC452301pR;
import Y.ARunnableS83S0200000_14;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.bio.biometric.ui.BioTransparentFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class BioEnrollStepFragment extends BioTransparentFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWExISpiHELIOSKyY8JSA4OyYwZiAiOyA/JGsOICAWJjcjJSMAPCA8Dz0yLygpJzs=";
    public final ViewModelLazy LL;
    public Function2<? super Boolean, ? super String, Unit> LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Integer LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public final C19F0<Intent> LLJIJIL;

    public final BioEnrollViewModel NR() {
        return (BioEnrollViewModel) this.LL.getValue();
    }

    public BioEnrollStepFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26((Function0) new AwS570S0100000_26((Fragment) this, 127), 128));
        this.LL = C336720DHy.LIZ(this, C13LE.LIZ(BioEnrollViewModel.class), new AwS570S0100000_26(c01gwLIZ, 129), new AwS427S0200000_26((Function0) null, c01gwLIZ, 9), new AwS427S0200000_26(this, c01gwLIZ, 10));
        this.LLJIJIL = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.0ukj
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                if (((ActivityResult) obj).resultCode == -1) {
                    C19EG activity = this.LIZ.getActivity();
                    if (activity != null) {
                        this.LIZ.getClass();
                        this.LIZ.LLJI = null;
                        C1715520ukA.LIZLLL("bio_ulk_dv_rsp", "1", null, null);
                        this.LIZ.NR().yQ2(activity);
                        return;
                    }
                    C1715520ukA.LIZLLL("bio_ulk_dv_rsp", "activity_null_after_success", null, null);
                } else {
                    C1715520ukA.LIZLLL("bio_ulk_dv_rsp", CardStruct.IStatusCode.DEFAULT, null, null);
                }
                this.LIZ.NR().EQ2();
            }
        });
    }

    public final void OR(C1715260ujk c1715260ujk) {
        int iIntValue;
        Integer num = this.LLILZLL;
        if (num != null && (iIntValue = num.intValue()) >= 0) {
            int i = this.LLJ + 1;
            this.LLJ = i;
            String str = this.LLIZ;
            if (i > iIntValue && str != null) {
                MR(str, false);
                return;
            }
        }
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJII = false;
            String string = c1715260ujk.LIZ;
            if (string == null) {
                string = getString(2131840142);
            }
            c1397580mTM.LJI(string);
            String string2 = c1715260ujk.LIZIZ;
            if (string2 == null) {
                string2 = getString(2131840141);
            }
            c1397580mTM.LIZIZ(string2);
            C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 78));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        MR(null, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            BioEnrollViewModel bioEnrollViewModelNR = NR();
            String string = arguments.getString("enter_from");
            if (string == null) {
                string = "";
            }
            String string2 = arguments.getString("pipo_product_code");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = arguments.getString("wallet_user_id");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = arguments.getString("host");
            if (string4 == null) {
                string4 = "";
            }
            String string5 = arguments.getString("session_id");
            if (string5 == null) {
                string5 = "";
            }
            String string6 = arguments.getString("flow_type");
            if (string6 == null) {
                string6 = "";
            }
            String string7 = arguments.getString("did");
            if (string7 == null) {
                string7 = "";
            }
            bioEnrollViewModelNR.LLILZ = new C1715910ukn(string, string2, string3, string4, string5, string6, string7, 8064);
        }
    }

    @Override // com.ss.android.ugc.aweme.component.bio.biometric.ui.BioTransparentFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0ukl
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 4;
            }
        });
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.LLILLL) {
            this.LLILLL = true;
            Function2<? super Boolean, ? super String, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, null);
            }
            this.LLILLJJLI = null;
        }
    }

    public final void MR(String str, boolean z) {
        if (!this.LLILLL) {
            this.LLILLL = true;
            Function2<? super Boolean, ? super String, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(Boolean.valueOf(z), str);
            }
            this.LLILLJJLI = null;
        }
        try {
            dismissAllowingStateLoss();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.component.bio.biometric.ui.BioTransparentFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity == null) {
            MR(null, false);
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860760Xpi(this, null), 3);
        if (bundle == null && view.getParent() != null) {
            HandlerHook.viewPost(view, new ARunnableS83S0200000_14(this, activity, 5));
        }
    }

    public final void PR(String str, String str2, String str3) {
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJII = false;
            if (str == null) {
                str = getString(2131840142);
            }
            c1397580mTM.LJI(str);
            if (str2 == null) {
                str2 = getString(2131840141);
            }
            c1397580mTM.LIZIZ(str2);
            C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 79));
            c1397580mTM.LIZLLL(new AwS140S1100000_26(this, str3, 1));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        MR(str3, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        C19GS c19gs = null;
        frameLayout.addView(new C1390130mHL(frameLayout.getContext(), null, 6), new FrameLayout.LayoutParams(-2, -2, 17));
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
