package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C098200Yq;
import X.C12ES;
import X.C1597740rgC;
import X.C189200o6;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.InterfaceC1594910rbd;
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseFollowingLiveOnlySkylightCell<T extends InterfaceC1594910rbd> extends BaseSkylightCell<T> {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24((BaseFollowingLiveOnlySkylightCell) this, 147));

    public final String V5(Context context) {
        Object c098200Yq;
        try {
            c098200Yq = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIIJZLJL().LIZ(context);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            return "LIVE";
        }
        return str;
    }

    public final void W5(TextView textView) {
        try {
            String strV5 = V5(textView.getContext());
            textView.setText(strV5);
            U5(textView, strV5, 12.0f);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            textView.setText("LIVE");
            U5(textView, "LIVE", 12.0f);
        }
    }

    public final void X5(Context context, long j) {
        Boolean value;
        InboxFollowGuideViewModel inboxFollowGuideViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        InboxFollowGuideViewModel inboxFollowGuideViewModel2 = (InboxFollowGuideViewModel) this.LLILLJJLI.getValue();
        if (inboxFollowGuideViewModel2 != null && (mutableLiveData2 = inboxFollowGuideViewModel2.LL) != null) {
            value = mutableLiveData2.getValue();
        } else {
            value = null;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool) && (inboxFollowGuideViewModel = (InboxFollowGuideViewModel) this.LLILLJJLI.getValue()) != null && (mutableLiveData = inboxFollowGuideViewModel.LLILLJJLI) != null) {
            mutableLiveData.setValue(bool);
        }
        C1597740rgC.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("is_live", "1");
        C20684815ws.LJIILLIIL("click_play_following_window", c2344009Gk.LIZ);
    }

    public final void U5(TextView textView, String str, float f) {
        textView.setTextSize(1, f);
        if (textView.getPaint().measureText(str) > C12ES.LIZJ(46.0f, textView.getContext())) {
            float f2 = f - 1;
            if (f2 >= 10.0f) {
                U5(textView, str, f2);
            }
        }
    }
}
