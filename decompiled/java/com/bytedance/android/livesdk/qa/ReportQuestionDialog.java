package com.bytedance.android.livesdk.qa;

import X.C16F5;
import X.C500980Jkm;
import X.C760120Trm;
import X.C760130Trn;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ReportQuestionDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/HELIOSLSR9OSRiGyojJzc4GDo2OzElJiEXISQgJig=";
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public Question LLILLL;
    public String LLILZ = "";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ga5);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Question question;
        Boolean bool;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            bool.booleanValue();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (str = (String) dataChannel2.gg0(C760120Trm.class)) == null) {
            str = "";
        }
        this.LLILZ = str;
        DataChannel dataChannel3 = this.dataChannel;
        View viewFindViewById = null;
        if (dataChannel3 != null) {
            question = (Question) dataChannel3.gg0(C760130Trn.class);
        } else {
            question = null;
        }
        this.LLILLL = question;
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.t97);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (C16F5) viewFindViewById2;
        }
        C786410Ut5.l8((C16F5) viewFindViewById2, new ACListenerS147S0100000_12(this, 229));
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.dat);
            }
            this.LLILLJJLI = (C16F5) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.l8((C16F5) view3, new ACListenerS147S0100000_12(this, 230));
    }
}
