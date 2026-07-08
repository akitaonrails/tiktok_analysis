package com.bytedance.android.livesdk.moderator;

import X.C098200Yq;
import X.C0GY9;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C14KS;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C749560Tak;
import X.C749600Tao;
import X.C786410Ut5;
import X.InterfaceC19323110ij;
import X.InterfaceC749850TbD;
import Y.ACListenerS147S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class AddModeratorFragment extends BaseFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSJSooLD0yPCo+Zw43LAgjLSohKTEjOwkhKSIhLCEn";
    public LinearLayout LL;
    public LiveEditText LLILLJJLI;
    public C16F5 LLILLL;
    public LinearLayout LLILZ;
    public RecyclerView LLILZIL;
    public LinearLayout LLILZLL;
    public ConstraintLayout LLIZ;
    public LiveIconView LLIZLLLIL;
    public C749600Tao LLJ;
    public MeasureLinearLayout LLJI;
    public View LLJIJIL;
    public String LLJILJIL;
    public final C749560Tak LLJILJILJ = new InterfaceC749850TbD() { // from class: X.0Tak
        @Override // X.InterfaceC749850TbD
        public final void OO(long j, boolean z) {
        }

        @Override // X.InterfaceC749850TbD
        public final void Rk(Exception exc) {
        }

        @Override // X.InterfaceC749850TbD
        public final void Xa(int i) {
        }

        @Override // X.InterfaceC749850TbD
        public final void gx(int i, Exception exc) {
        }

        @Override // X.InterfaceC749850TbD
        public final void il(AdminUserBean adminUserBean, Exception exc) {
            View view;
            View viewFindViewById;
            if (adminUserBean != null) {
                AddModeratorFragment addModeratorFragment = this.LL;
                DataChannel dataChannelLJ = C475510Ikn.LJ(addModeratorFragment);
                if (dataChannelLJ != null) {
                    dataChannelLJ.SX0(C749570Tal.class, Integer.valueOf(adminUserBean.mMaxCount));
                }
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(addModeratorFragment);
                if (dataChannelLJ2 != null) {
                    dataChannelLJ2.zW(ModeratorListChannel.class, adminUserBean.LIZ);
                }
            }
            this.LL.initData();
            if (C500260Jjc.LJIJJLI(C475510Ikn.LJ(this.LL)) && (view = this.LL.getView()) != null && (viewFindViewById = view.findViewById(R.id.xyz)) != null) {
                C500260Jjc.LLFFF(viewFindViewById);
            }
        }
    };

    public final LiveEditText OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u9t) : null;
            this.LLILLJJLI = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final LiveIconView PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uba) : null;
            this.LLIZLLLIL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final RecyclerView RR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.udy) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final long NR() {
        Room room;
        if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJIJJLI(C475510Ikn.LJ(this)) || C500260Jjc.LJIJJ(C475510Ikn.LJ(this))) {
            return UserService.getInstance().user().getCurrentUserId();
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) == null) {
            return 0L;
        }
        return room.getOwnerUserId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initData() {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.AddModeratorFragment.initData():void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        String str;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                obj = arguments.get("entrance");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LLJILJIL = str;
        this.LLJIJIL = view;
        this.LLJI = (MeasureLinearLayout) view.findViewById(R.id.ubq);
        if (!C500260Jjc.LJIJJLI(C475510Ikn.LJ(this))) {
            initData();
            MeasureLinearLayout measureLinearLayout = this.LLJI;
            if (measureLinearLayout != null) {
                measureLinearLayout.setWindowInsetsEnable(true);
            }
            MeasureLinearLayout measureLinearLayout2 = this.LLJI;
            if (measureLinearLayout2 != null) {
                measureLinearLayout2.setWindowInsetsKeyboardObserver(this);
            }
        }
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bna);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 213));
        if (C500260Jjc.LJIJJLI(C475510Ikn.LJ(this))) {
            View viewFindViewById2 = this.LLILLL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.title);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLL = (C16F5) viewFindViewById2;
            }
            ((C16F5) viewFindViewById2).LJJJI(R.style.a8x);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                C786410Ut5.W5(view, layoutParams);
            }
            TextView textView = (TextView) view.findViewById(R.id.woo);
            if (textView != null) {
                String strLJIJI = C497740JfY.LJIJI(2131842824);
                String strLJIJJ = C497740JfY.LJIJJ(2131840987, strLJIJI);
                SpannableString spannableString = new SpannableString(strLJIJJ);
                int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
                C1119920fFW.LJ(textView.getContext(), spannableString, iLJJJ, iLJJJ + strLJIJI.length(), 33, 8, 500);
                textView.setText(spannableString);
            }
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null && dataChannelLJ.gg0(ModeratorListChannel.class) != null) {
                initData();
                View viewFindViewById3 = view.findViewById(R.id.xyz);
                if (viewFindViewById3 != null) {
                    C500260Jjc.LLFFF(viewFindViewById3);
                }
            } else {
                ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Sw0(this.LLJILJILJ, NR());
            }
        }
        if (C500260Jjc.LJIJJ(C475510Ikn.LJ(this))) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null && dataChannelLJ2.gg0(ModeratorListChannel.class) != null) {
                initData();
            } else {
                ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Sw0(this.LLJILJILJ, NR());
            }
        }
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        int height;
        ValueAnimator valueAnimatorOfInt;
        if (getContext() == null) {
            return;
        }
        int iLIZIZ = i + ((int) C497740JfY.LIZIZ(35.0f));
        double dLIZLLL = ((double) C14KS.LIZLLL()) * 0.9d;
        View view = this.LLJIJIL;
        if (view != null) {
            height = view.getHeight();
        } else {
            height = 0;
        }
        int iMin = Math.min(iLIZIZ, (int) (dLIZLLL - ((double) height)));
        if (z) {
            valueAnimatorOfInt = ValueAnimator.ofInt(0, iMin);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(iMin, 0);
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        }
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 68));
        valueAnimatorOfInt.start();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g4l, viewGroup, false);
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
