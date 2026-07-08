package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0IK5;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C14KS;
import X.C292401Bi;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C748790TYv;
import X.C786410Ut5;
import X.InterfaceC19323110ij;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS112S0100000_12;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentBlockKeywordsOptFragment extends LiveDialogFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoQJyghLCEnCikjKiQYLTw7Jj03Owo8PQkhKSIhLCEn";
    public final String LL;
    public MeasureLinearLayout LLILLJJLI;
    public C748790TYv LLILLL;
    public FrameLayout LLILZ;
    public FrameLayout LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public boolean LLIZLLLIL;

    public LiveCommentBlockKeywordsOptFragment() {
        this(null);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C748790TYv MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c4_) : null;
            this.LLILLL = (C748790TYv) viewFindViewById;
        }
        return (C748790TYv) viewFindViewById;
    }

    public final MeasureLinearLayout NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.o4y) : null;
            this.LLILLJJLI = (MeasureLinearLayout) viewFindViewById;
        }
        return (MeasureLinearLayout) viewFindViewById;
    }

    public final Room OR() {
        return (Room) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gac);
        c500980Jkm.LIZJ = R.style.ahx;
        c500980Jkm.LJIIL = new ColorDrawable(R.drawable.dyl);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.isViewValid) {
            C748790TYv c748790TYvMR = MR();
            if (c748790TYvMR.LLJIJIL) {
                C500260Jjc.LJIILJJIL(c748790TYvMR.getSearchEditFromXml());
            }
        }
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public LiveCommentBlockKeywordsOptFragment(String str) {
        this.LL = str;
        this.LLILZLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 106));
        this.LLIZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 105));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        View view;
        C748790TYv c748790TYv;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/adminsetting/LiveCommentBlockKeywordsOptFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6i5qfP8xlUTU2p2v5UQGOxsyjsvNrEBSRFJOP+oDtJVdxPr5s/eTy2hzVCZwKIYk", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (this.LLIZLLLIL && !z && (view = getView()) != null && (c748790TYv = (C748790TYv) view.findViewById(R.id.c4_)) != null) {
            c748790TYv.getBlockWords();
        }
    }

    public final void PR(int i, boolean z) {
        MeasureLinearLayout measureLinearLayoutNR;
        if (this.LLIZLLLIL || (measureLinearLayoutNR = NR()) == null) {
            return;
        }
        int iMin = Math.min(i + ((int) C497740JfY.LIZIZ(35.0f)), (int) ((((double) C14KS.LIZLLL()) * 0.9d) - ((double) measureLinearLayoutNR.getHeight())));
        if (this.isViewValid) {
            measureLinearLayoutNR.setPadding(measureLinearLayoutNR.getPaddingLeft(), measureLinearLayoutNR.getPaddingTop(), measureLinearLayoutNR.getPaddingRight(), (int) C497740JfY.LIZIZ(16.0f));
            if (!z) {
                iMin = 0;
            }
            C500260Jjc.LJJLJ(iMin, measureLinearLayoutNR);
            C748790TYv c748790TYvMR = MR();
            if (c748790TYvMR.LLJIJIL != z) {
                c748790TYvMR.LLJIJIL = z;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean zBooleanValue;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        String secUid;
        long id;
        Room roomOR;
        User owner;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("ignore_keyboards_change")) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        ViewGroup.LayoutParams layoutParams = NR().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = (NR().getContext().getResources().getDisplayMetrics().heightPixels * 60) / 100;
            MeasureLinearLayout measureLinearLayoutNR = NR();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(measureLinearLayoutNR);
            measureLinearLayoutNR.setLayoutParams(layoutParams);
        }
        PR(0, false);
        C748790TYv c748790TYvMR = MR();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (OR() != null) {
            zBooleanValue = ((Boolean) this.LLIZ.getValue()).booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (OR() == null ? (interfaceC500940JkiUser = UserService.getInstance().user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null : (roomOR = OR()) == null || (owner = roomOR.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        Room roomOR2 = OR();
        if (roomOR2 != null) {
            id = roomOR2.getId();
        } else {
            id = 0;
        }
        c748790TYvMR.LJII(dataChannelLJ, zBooleanValue, secUid, id, "live_take_detail", new AwS591S0100000_12(this, 1));
        View viewFindViewById = this.LLILZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 1), viewFindViewById);
        View view3 = this.LLILZIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.jlf);
            }
            this.LLILZIL = (FrameLayout) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 2), view3);
        if (!this.LLIZLLLIL) {
            NR().setWindowInsetsEnable(true);
            NR().setWindowInsetsKeyboardObserver(this);
        }
        C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS112S0100000_12(this, 41));
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        PR(i, z);
    }
}
