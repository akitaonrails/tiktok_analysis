package com.bytedance.android.livesdk.broadcast.preview.widget.replay;

import X.C01GW;
import X.C0IJT;
import X.C452501pT;
import X.C474500IjA;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class EEALiveReplayPromptDialog extends LiveDialogFragment {
    public static EEALiveReplayPromptDialog LLILZLL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTHELIOSMlLDh9PywoLionZjcpOSMyMWsJDA4fITMpGyojJCQ1GT08JTU4DSYyJCor";
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public Function1<? super Boolean, Unit> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(70));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ge6);
        c500980Jkm.LIZJ = R.style.ahb;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZ = null;
        LLILZLL = null;
    }

    public final void MR(String str) {
        String str2;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_replay_pop_up_click");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LJII((String) this.LLILZIL.getValue());
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.ahb);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.title);
        this.LL = (FrameLayout) view.findViewById(R.id.csa);
        this.LLILLJJLI = (FrameLayout) view.findViewById(R.id.cv5);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.co4);
        FrameLayout frameLayout = this.LL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.O7(frameLayout, new ACListenerS147S0100000_12(this, 155));
        FrameLayout frameLayout3 = this.LLILLJJLI;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        C786410Ut5.O7(frameLayout3, new ACListenerS147S0100000_12(this, 156));
        FrameLayout frameLayout4 = this.LLILLL;
        if (frameLayout4 != null) {
            frameLayout2 = frameLayout4;
        }
        C786410Ut5.O7(frameLayout2, new ACListenerS147S0100000_12(this, 157));
    }
}
