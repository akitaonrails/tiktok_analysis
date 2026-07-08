package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0TY1;
import X.C292401Bi;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C748440TXm;
import X.C786410Ut5;
import X.InterfaceC19323110ij;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS147S0100000_12;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentBlockKeywordsFragment extends LiveDialogFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTHELIOSE4ICE0ZgklPyoQJyghLCEnCikjKiQYLTw7Jj03OwM+KCg+LSs4";
    public C748440TXm LL;
    public FrameLayout LLILLJJLI;
    public MeasureLinearLayout LLILLL;
    public String LLILZ;
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 100));
    public final C01GW LLILZLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 99));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0TY1.LIZ = false;
        if (this.isViewValid) {
            C748440TXm c748440TXmMR = MR();
            if (c748440TXmMR.LLJILLL) {
                C500260Jjc.LJIILJJIL(c748440TXmMR.getBlockWordEditTextFromXml());
            }
        }
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    public final C748440TXm MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c4c) : null;
            this.LL = (C748440TXm) viewFindViewById;
        }
        return (C748440TXm) viewFindViewById;
    }

    public final MeasureLinearLayout NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.o4y) : null;
            this.LLILLL = (MeasureLinearLayout) viewFindViewById;
        }
        return (MeasureLinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gab);
        c500980Jkm.LIZJ = R.style.ahx;
        c500980Jkm.LJIIL = new ColorDrawable(R.drawable.dyl);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void OR(int i, boolean z) {
        int i2;
        MeasureLinearLayout measureLinearLayoutNR = NR();
        if (measureLinearLayoutNR != null && this.isViewValid) {
            if (z) {
                ViewGroup.LayoutParams layoutParams = measureLinearLayoutNR.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(measureLinearLayoutNR);
                    measureLinearLayoutNR.setLayoutParams(layoutParams);
                    measureLinearLayoutNR.setPadding(measureLinearLayoutNR.getPaddingLeft(), measureLinearLayoutNR.getPaddingTop(), measureLinearLayoutNR.getPaddingRight(), i);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = measureLinearLayoutNR.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = (measureLinearLayoutNR.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(measureLinearLayoutNR);
                    measureLinearLayoutNR.setLayoutParams(layoutParams2);
                }
            }
            C748440TXm c748440TXmMR = MR();
            if (c748440TXmMR.LLJILLL != z) {
                c748440TXmMR.LLJILLL = z;
            }
            RelativeLayout blockWordInputAreaFromXml = c748440TXmMR.getBlockWordInputAreaFromXml();
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLIIL(blockWordInputAreaFromXml, i2);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC2262081DgM currentUser;
        String secUid;
        long id;
        User owner;
        String secUid2;
        super.onViewCreated(view, bundle);
        C0TY1.LIZ = true;
        OR(0, false);
        String str = "";
        if (this.LLILZIL.getValue() != null) {
            C748440TXm c748440TXmMR = MR();
            boolean zBooleanValue = ((Boolean) this.LLILZLL.getValue()).booleanValue();
            Room room = (Room) this.LLILZIL.getValue();
            if (room != null && (owner = room.getOwner()) != null && (secUid2 = owner.getSecUid()) != null) {
                str = secUid2;
            }
            Room room2 = (Room) this.LLILZIL.getValue();
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            c748440TXmMR.LJII(str, id, "live_take_detail", zBooleanValue, false);
        } else {
            C748440TXm c748440TXmMR2 = MR();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && (secUid = currentUser.getSecUid()) != null) {
                str = secUid;
            }
            c748440TXmMR2.LJII(str, 0L, "live_take_detail", true, false);
        }
        MR().setOnAddSuccessCallback(new AwS556S0100000_12(this, 101));
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 84));
        NR().setWindowInsetsEnable(true);
        NR().setWindowInsetsKeyboardObserver(this);
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        OR(i, z);
    }
}
