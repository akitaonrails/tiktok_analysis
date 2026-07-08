package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell;

import X.C01GW;
import X.C098200Yq;
import X.C0H9H;
import X.C117800ca;
import X.C189200o6;
import X.C293970Bff;
import X.C452501pT;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664000Q2s;
import X.C675370QeN;
import X.C675430QeT;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoVerticalDynamicHeaderCell extends PowerCell<C675370QeN> {
    public C675430QeT LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 132));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bpa;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C675430QeT c675430QeT;
        String str;
        C664000Q2s c664000Q2s;
        super.onItemViewCreated();
        C675430QeT c675430QeT2 = new C675430QeT(C293970Bff.LIZ() ? null : (Fragment) this.LLILLJJLI.getValue(), this.itemView.getContext(), null);
        if (C293970Bff.LIZ()) {
            C646000PVm c646000PVm = C650950Pg5.Companion;
            Fragment fragment = (Fragment) this.LLILLJJLI.getValue();
            c646000PVm.getClass();
            C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, null);
            if (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
                str = "";
            }
            c675430QeT2.LIZJ = str;
        }
        this.LL = c675430QeT2;
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.gd3);
        if (viewGroup == null || (c675430QeT = this.LL) == null) {
            return;
        }
        c675430QeT.LIZ(0, new ViewGroup.LayoutParams(-1, -1), viewGroup);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Object c098200Yq;
        C675370QeN c675370QeN = (C675370QeN) interfaceC1891350zJl;
        super.onBindItemView(c675370QeN);
        try {
            c098200Yq = C117800ca.LIZIZ(new JSONObject(c675370QeN.LL.getRawData()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Map<String, ? extends Object> map = (Map) c098200Yq;
        if (map != null) {
            View view = this.itemView;
            view.getLayoutParams().height = C0H9H.LIZIZ(c675370QeN.LL.getHeight());
            view.requestLayout();
            C675430QeT c675430QeT = this.LL;
            if ((c675430QeT instanceof C675430QeT) && c675430QeT != null) {
                c675430QeT.LIZJ(c675370QeN.LL, map, false);
            }
        }
    }
}
