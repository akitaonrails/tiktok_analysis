package com.ss.android.ugc.aweme.live.notification;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1390920mIc;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class NotificationFoldFragment extends Fragment implements View.OnClickListener, InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9Jio4ICHELIOSk6KyQ4ICA9ZgsjPSY1ISYtPSY8JgMjJSsVOiQrJCo9PA==";
    public final User LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public LinearLayout LLIZ;

    public NotificationFoldFragment() {
        this(new User(), "", "");
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131849285);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 165));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    public final void MR(C19EG c19eg) {
        int i;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = this;
        if (C960203pA.LIZIZ(c19eg)) {
            i = R.attr.c3;
        } else {
            i = R.attr.zp;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, c19eg);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "NotificationFoldFragment");
    }

    public final void NR(int i) {
        NotificationDetailSettingFragment notificationDetailSettingFragment = new NotificationDetailSettingFragment(this.LL, i, this.LLILLJJLI, this.LLILLL, 16);
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && parentFragment != null && parentFragment.isAdded()) {
            C19EH c19ehLJIIJ = parentFragment.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJJLI(R.anim.fn, R.anim.fo, R.anim.fm, R.anim.fp);
            c19ehLJIIJ.LJIJ(R.id.v4a, notificationDetailSettingFragment, "NotificationDetailSettingFragment");
            c19ehLJIIJ.LJII("NotificationDetailSettingFragment");
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.rmb) {
                NR(1);
            } else {
                if (numValueOf.intValue() != R.id.n5v) {
                    return;
                }
                NR(4);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String string = getString(2131849286);
        String string2 = getString(2131849287);
        String string3 = getString(2131849288);
        View viewFindViewById = this.LLILZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.rlp);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        int postNotificationStatus = this.LL.getPostNotificationStatus();
        if (postNotificationStatus != 1) {
            if (postNotificationStatus != 2) {
                if (postNotificationStatus != 3) {
                    str = "";
                } else {
                    str = string3;
                }
            } else {
                str = string2;
            }
        } else {
            str = string;
        }
        textView.setText(str);
        View viewFindViewById3 = this.LLILZIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.n35);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZIL = (TuxTextView) viewFindViewById3;
        }
        TextView textView2 = (TextView) viewFindViewById3;
        int livePushNotificationStatus = this.LL.getLivePushNotificationStatus();
        if (livePushNotificationStatus != 1) {
            if (livePushNotificationStatus != 2) {
                if (livePushNotificationStatus != 3) {
                    string = "";
                } else {
                    string = string3;
                }
            } else {
                string = string2;
            }
        }
        textView2.setText(string);
        View viewFindViewById4 = this.LLILZLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.rmb);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZLL = (LinearLayout) viewFindViewById4;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById4, this);
        View view5 = this.LLIZ;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.n5v);
            }
            this.LLIZ = (LinearLayout) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        C786410Ut5.R7((LinearLayout) view5, this);
    }

    public NotificationFoldFragment(User user, String str, String str2) {
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dfv, viewGroup, false);
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
