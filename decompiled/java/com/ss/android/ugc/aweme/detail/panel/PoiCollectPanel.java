package com.ss.android.ugc.aweme.detail.panel;

import X.C01GW;
import X.C1367960lha;
import X.C1620930sHb;
import X.C2189821An6;
import X.C452501pT;
import X.InterfaceC1605290rsN;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PoiCollectPanel extends DetailFragmentPanel {
    public final C01GW A0;
    public final Bundle z0;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null) {
            return;
        }
        View view = getFragment().getView();
        View view2 = null;
        View viewFindViewById = view != null ? view.findViewById(R.id.cb7) : null;
        if (!(viewFindViewById instanceof ViewGroup) || viewFindViewById == null) {
            View view3 = getFragment().getView();
            if (view3 instanceof ViewGroup) {
                view2 = view3;
            }
        } else {
            view2 = viewFindViewById;
        }
        this.LLJJIJI.LIZJ(new C1620930sHb(this, 4));
        InterfaceC1605290rsN interfaceC1605290rsN = (InterfaceC1605290rsN) this.A0.getValue();
        if (interfaceC1605290rsN != null) {
            interfaceC1605290rsN.LLILLL(o());
        }
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJIILL(this.z0, view2, getChildFragmentManager());
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final Map<String, String> Y() {
        Bundle bundle = this.z0;
        Object obj = null;
        if (bundle != null) {
            try {
                obj = bundle.get("screen_shot_param");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return (Map) obj;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void c0(List<Aweme> list) {
        d0(list, false);
        InterfaceC1605290rsN interfaceC1605290rsN = (InterfaceC1605290rsN) this.A0.getValue();
        if (interfaceC1605290rsN != null) {
            interfaceC1605290rsN.LLILLL(o());
        }
    }

    public PoiCollectPanel(Bundle bundle, C2189821An6 c2189821An6) {
        super(c2189821An6);
        this.z0 = bundle;
        this.A0 = C452501pT.LIZIZ(new AwS568S0100000_24(this, 261));
    }
}
