package com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction;

import X.AnonymousClass1084;
import X.AnonymousClass1086;
import X.C105F;
import X.C1251150ifB;
import X.C191821102p;
import X.C191880104w;
import X.C197039127h;
import X.C20684815ws;
import X.C2097608Jq;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.vm.PauseInteractionsVM;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container.AbstractPageContainer;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class PauseInteractionsPage extends AbstractPageContainer {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wHELIOSMWs8KDogLSwiPSohKSY4ICA9ZhUtPDw2ASs4LD0yKzElJiEgGCQrLA==";
    public PauseInteractionsVM LLILLL;
    public LinearLayout LLILZ;
    public TuxTextView LLILZIL;
    public C197039127h LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container.AbstractPageContainer
    public final Integer OR() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container.AbstractPageContainer
    public final Integer PR() {
        return Integer.valueOf(this.LLIZLLLIL);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container.AbstractPageContainer
    public final boolean SR() {
        C191880104w.LIZ.getClass();
        boolean z = false;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "pause_interaction");
        if (privacySettingsRestrictionItemLJIIJJI != null && privacySettingsRestrictionItemLJIIJJI.showType == 0) {
            z = true;
        }
        return !z;
    }

    public PauseInteractionsPage() {
        C191821102p.LIZJ().getClass();
        this.LL = TPSCRenderManager.LJ("pause_interactions");
        this.LLIZ = R.layout.bdw;
        this.LLIZLLLIL = R.style.abi;
    }

    public final void UR() {
        if (!AnonymousClass1084.LIZIZ()) {
            C197039127h c197039127h = this.LLILZLL;
            if (c197039127h != null) {
                c197039127h.setText(getString(2131839135));
            }
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
                return;
            }
            return;
        }
        C197039127h c197039127h2 = this.LLILZLL;
        if (c197039127h2 != null) {
            c197039127h2.setText(getString(2131839136));
        }
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
        int iLIZ = AnonymousClass1084.LIZ();
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setText(iLIZ >= 7 ? getString(2131839154) : getResources().getQuantityString(2131755454, iLIZ, Integer.valueOf(iLIZ)));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container.AbstractPageContainer
    public final void NR(TuxNavBar tuxNavBar) {
        C786410Ut5.LLLLZLLLI(tuxNavBar, 0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 166));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.setNavBackground(0);
        tuxNavBar.LJIIZILJ(false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container.AbstractPageContainer
    public final void RR(View view) {
        String string;
        Integer value;
        String str;
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5;
        this.LLILZ = (LinearLayout) view.findViewById(R.id.gch);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.gcl);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.q3v);
        Integer value2 = null;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(this, 45));
        } else {
            c197039127h = null;
        }
        this.LLILZLL = c197039127h;
        ViewModelStoreOwner activity = getActivity();
        if (activity == null) {
            activity = this;
        }
        this.LLILLL = (PauseInteractionsVM) new ViewModelProvider(activity).get(PauseInteractionsVM.class);
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        int iLIZ = C105F.LIZ(privacyUserSettingsV2LJIIL, "pause_interaction_from", 0);
        if (iLIZ != 0) {
            int iLIZ2 = C105F.LIZ(privacyUserSettingsV2LJIIL, "pause_interaction_duration", 0);
            PauseInteractionsVM pauseInteractionsVM = this.LLILLL;
            if (pauseInteractionsVM != null && (mutableLiveData5 = pauseInteractionsVM.LL) != null) {
                mutableLiveData5.setValue(Integer.valueOf(iLIZ));
            }
            PauseInteractionsVM pauseInteractionsVM2 = this.LLILLL;
            if (pauseInteractionsVM2 != null && (mutableLiveData4 = pauseInteractionsVM2.LLILLJJLI) != null) {
                mutableLiveData4.setValue(Integer.valueOf(iLIZ2));
            }
        }
        PauseInteractionsVM pauseInteractionsVM3 = this.LLILLL;
        if (pauseInteractionsVM3 != null && (mutableLiveData3 = pauseInteractionsVM3.LLILLJJLI) != null) {
            mutableLiveData3.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 17));
        }
        AnonymousClass1086 anonymousClass1086 = AnonymousClass1086.LIZ;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        PauseInteractionsVM pauseInteractionsVM4 = this.LLILLL;
        if (pauseInteractionsVM4 != null && (mutableLiveData2 = pauseInteractionsVM4.LL) != null) {
            value = mutableLiveData2.getValue();
        } else {
            value = null;
        }
        PauseInteractionsVM pauseInteractionsVM5 = this.LLILLL;
        if (pauseInteractionsVM5 != null && (mutableLiveData = pauseInteractionsVM5.LLILLJJLI) != null) {
            value2 = mutableLiveData.getValue();
        }
        anonymousClass1086.getClass();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", string);
        if (AnonymousClass1084.LIZIZ()) {
            str = "paused";
        } else {
            str = "not_paused";
        }
        pairArr[1] = new Pair("current_status", str);
        pairArr[2] = new Pair("current_interaction_selection", AnonymousClass1086.LIZIZ(value));
        pairArr[3] = new Pair("current_duration_selection", AnonymousClass1086.LIZ(value2));
        C20684815ws.LJIILLIIL("enter_pause_interaction_page", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container.AbstractPageContainer, com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "inbox_notification")) {
            C191880104w c191880104w = C191880104w.LIZ;
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 167);
            c191880104w.getClass();
            C191880104w.LIZLLL("enter_pause_from_inbox", awS572S0100000_28, true);
        }
    }
}
