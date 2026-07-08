package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui;

import X.C098200Yq;
import X.C0IJT;
import X.C0J3Y;
import X.C0KCF;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C513330KBf;
import X.C513360KBi;
import X.C786410Ut5;
import X.EnumC513410KBn;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackageMultiAccountGuideFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageMultiAccountGuideFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2HELIOSsqJjo9LCQ4ICA9ZjUtKiQyLyA8KCg2ZjAlZxwmKhUtKiQyLyABPCMnIQQvKiAmJjELPCY3LQM+KCg+LSs4";
    public Map<String, String> LLILLL;
    public ViewGroup LLILZ;
    public ViewGroup LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public C16FS LLJ;
    public EnumC513410KBn LL = EnumC513410KBn.LATE_CALLBACK_SCENE;
    public C0KCF LLILLJJLI = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0, 0, false, -1, 15);
    public Function0<Unit> LLJI = new C513360KBi();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.je4);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.jdh);
        this.LLIZ = (C16F5) view.findViewById(R.id.je6);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.w8t);
        this.LLJ = (C16FS) view.findViewById(R.id.a23);
        this.LLILZLL = (C16F5) view.findViewById(R.id.pyo);
        Map<String, String> map = this.LLILLL;
        EnumC513410KBn enumC513410KBn = this.LL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_multi_account_pre_check_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIIIIZZ();
        if (enumC513410KBn != null) {
            if (enumC513410KBn == EnumC513410KBn.INCORRECT_TIKTOK_OR_GP_ACCOUNT) {
                str = "tiktok_account";
            } else if (enumC513410KBn == EnumC513410KBn.INCORRECT_GP_ACCOUNT) {
                str = "google_account";
            } else {
                str = "undefined";
            }
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "show_type");
        c474500IjALIZ.LIZ();
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131853867, this.LLILLJJLI.LJJI));
        }
        C16F5 c16f52 = this.LLIZLLLIL;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJJ(2131853864, this.LLILLJJLI.LJJI));
        }
        EnumC513410KBn enumC513410KBn2 = this.LL;
        if (enumC513410KBn2 != null) {
            int i = C513330KBf.LIZ[enumC513410KBn2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ViewGroup viewGroup = this.LLILZ;
                    if (viewGroup != null) {
                        C500260Jjc.LJIILIIL(viewGroup);
                    }
                    ViewGroup viewGroup2 = this.LLILZIL;
                    if (viewGroup2 != null) {
                        C500260Jjc.LLFFF(viewGroup2);
                    }
                    C16F5 c16f53 = this.LLILZLL;
                    if (c16f53 != null) {
                        c16f53.setText(C497740JfY.LJIJI(2131853865));
                    }
                    final C16FS c16fs = this.LLJ;
                    if (c16fs != null) {
                        c16fs.setRadius((int) C497740JfY.LIZIZ(8.0f));
                        c16fs.setText(C497740JfY.LJIJI(2131853863));
                        C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0KBh
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                this.LL.LLJI.invoke();
                                ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LIZLLL(EnumC1782240wTm.MAIN_PAGE, c16fs.getContext());
                                SubPackageMultiAccountGuideFragment subPackageMultiAccountGuideFragment = this.LL;
                                C0KDR.LJ(subPackageMultiAccountGuideFragment.LLILLL, subPackageMultiAccountGuideFragment.LL);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            ViewGroup viewGroup3 = this.LLILZ;
            if (viewGroup3 != null) {
                C500260Jjc.LLFFF(viewGroup3);
            }
            ViewGroup viewGroup4 = this.LLILZIL;
            if (viewGroup4 != null) {
                C500260Jjc.LJIILIIL(viewGroup4);
            }
            C16F5 c16f54 = this.LLILZLL;
            if (c16f54 != null) {
                c16f54.setText(C497740JfY.LJIJI(2131853871));
            }
            C16FS c16fs2 = this.LLJ;
            if (c16fs2 == null) {
                return;
            }
            c16fs2.setRadius((int) C497740JfY.LIZIZ(8.0f));
            c16fs2.setText(C497740JfY.LJIJI(2131853866));
            C786410Ut5.h8(c16fs2, new View.OnClickListener() { // from class: X.0KBg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubPackageMultiAccountGuideFragment subPackageMultiAccountGuideFragment = this.LL;
                    C0KDR.LJ(subPackageMultiAccountGuideFragment.LLILLL, subPackageMultiAccountGuideFragment.LL);
                    this.LL.LLJI.invoke();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hps, viewGroup, false, layoutInflater.getContext(), false, 48);
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLJFF;
        }
    }
}
