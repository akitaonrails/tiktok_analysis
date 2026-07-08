package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C098200Yq;
import X.C0KVU;
import X.C1119920fFW;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C292401Bi;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveFilterCommentApproveFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTHELIOSE4ICE0ZgklPyoVISk4LD0QJyghLCEnCTU8OyAlLQM+KCg+LSs4";
    public LiveIconView LL;
    public C16FS LLILLJJLI;
    public C16FS LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public final C01GW LLILZLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 125));
    public Function0<Unit> LLIZ;
    public ChatMessage LLIZLLLIL;

    public final C16F5 NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nte) : null;
            this.LLILZIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        User user;
        String str;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.jzi);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LiveIconView) viewFindViewById;
        }
        C786410Ut5.g8((LiveIconView) viewFindViewById, new ACListenerS147S0100000_12(this, 108));
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.csf);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (C16FS) viewFindViewById3;
        }
        C786410Ut5.h8((C16FS) viewFindViewById3, new ACListenerS147S0100000_12(this, 109));
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.cx0);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (C16FS) viewFindViewById4;
        }
        C786410Ut5.h8((C16FS) viewFindViewById4, new ACListenerS147S0100000_12(this, 110));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ChatMessage chatMessage = this.LLIZLLLIL;
        if (chatMessage != null) {
            user = chatMessage.userInfo;
        } else {
            user = null;
        }
        String strLIZ = C0KVU.LIZ(user);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(": ");
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, 0, strLIZ.length() + 1, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        ChatMessage chatMessage2 = this.LLIZLLLIL;
        if (chatMessage2 != null) {
            str = chatMessage2.content;
        } else {
            str = null;
        }
        spannableStringBuilder.append((CharSequence) str);
        View view5 = this.LLILZ;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.ntd);
            }
            this.LLILZ = (C16F5) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        ((TextView) view5).setText(spannableStringBuilder);
        if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
            NR().setText(getResources().getText(2131840978));
            C786410Ut5.l8(NR(), new ACListenerS147S0100000_12(this, 111));
        } else {
            NR().setText(getResources().getText(2131840976));
            C786410Ut5.l8(NR(), new ACListenerS147S0100000_12(this, 112));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g6e, viewGroup, false);
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
