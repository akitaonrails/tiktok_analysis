package com.ss.android.ugc.aweme.chatnotice.banner;

import X.C098200Yq;
import X.C0OM1;
import X.C0PEM;
import X.C1251150ifB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1369580lkC;
import X.C1608306Rl;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C23250099c;
import X.C461620I8i;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC344240DeY;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareGroupForAIGroupShotPopup extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKDs9JzElKip9HELIOSKiQiJyohZhYkKD02DzcjPD8VJzcNAAghJzA8Gic8PBUjOToj";
    public View LLIZ;
    public C1369580lkC LLIZLLLIL;
    public String LLJ;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 100));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("conversation_id", "")) != null) {
            str = string;
        }
        this.LLJ = str;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        SmartImageView smartImageView;
        String strLIZLLL;
        super.onViewCreated(view, bundle);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1608306Rl(this, null), 2);
        if (getContext() != null && (view2 = this.LLIZ) != null && (smartImageView = (SmartImageView) view2.findViewById(R.id.luu)) != null) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ == null || (strLIZLLL = iMCameraBridgeApiLIZ.LIZLLL(C960203pA.LIZIZ(smartImageView.getContext()))) == null) {
                strLIZLLL = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(strLIZLLL);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1369580lkC c1369580lkC;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cju, viewGroup, false);
        this.LLIZ = viewTd;
        C19GS c19gs = null;
        if (viewTd != null) {
            c1369580lkC = (C1369580lkC) viewTd.findViewById(R.id.uyu);
        } else {
            c1369580lkC = null;
        }
        this.LLIZLLLIL = c1369580lkC;
        View view = this.LLIZ;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
