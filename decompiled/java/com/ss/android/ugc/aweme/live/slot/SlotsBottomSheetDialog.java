package com.ss.android.ugc.aweme.live.slot;

import X.C1834150xpV;
import X.C20684815ws;
import X.C2344009Gk;
import X.C500980Jkm;
import X.C756060TlE;
import X.C756080TlG;
import X.C756100TlI;
import X.C786410Ut5;
import X.EnumC756810TmR;
import X.InterfaceC1124060fMC;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS125S0300000_12;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class SlotsBottomSheetDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyHELIOSp9OykjPWEAJCo4Og08PDEjJBw7LSA4DSYyJCor";
    public C756060TlE LL;
    public RecyclerView LLILLJJLI;
    public final EnumC756810TmR LLILLL;
    public final C756100TlI LLILZ;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7b);
        c500980Jkm.LIZIZ = 2;
        c500980Jkm.LIZJ = R.style.ahi;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strLIZ;
        super.onCreate(bundle);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        if (this.LLILZ.LIZLLL.equals("before_live")) {
            strLIZ = CardStruct.IStatusCode.DEFAULT;
        } else {
            strLIZ = this.LLILZ.LIZ();
        }
        c2344009Gk.LJIIIIZZ("room_id", strLIZ);
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk.LJIIIIZZ("live_status", this.LLILZ.LIZLLL);
        c2344009Gk.LJIIIIZZ("page_name", "business_action_sheet");
        HashSet hashSet = new HashSet();
        Iterator it2 = ((HashMap) this.LL.LIZJ).keySet().iterator();
        while (it2.hasNext()) {
            hashSet.add(((InterfaceC1124060fMC) it2.next()).LIZ());
        }
        c2344009Gk.LJFF("button_options", TextUtils.join(",", hashSet));
        C20684815ws.LJIILLIIL("livesdk_tiktokec_action_sheet_show", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C1834150xpV.LJIIIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    public SlotsBottomSheetDialog(EnumC756810TmR enumC756810TmR, C756100TlI c756100TlI) {
        this.LLILLL = enumC756810TmR;
        this.LLILZ = c756100TlI;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 253), view.findViewById(R.id.pw6));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vl_);
        this.LLILLJJLI = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getActivity(), 1));
            C756080TlG c756080TlG = new C756080TlG(this, this.LLILLL, this.LLILZ);
            for (Map.Entry entry : ((HashMap) this.LL.LIZJ).entrySet()) {
                ((IIconSlot.SlotViewModel) entry.getValue()).LLILZ.observe(getViewLifecycleOwner(), new AObserverS125S0300000_12(this, c756080TlG, entry, 15));
            }
            c756080TlG.LLILZIL = this.LL.LIZ.booleanValue();
            this.LLILLJJLI.setAdapter(c756080TlG);
        }
    }
}
