package com.ss.android.ugc.aweme.setting.page.security;

import X.C01GW;
import X.C0OM1;
import X.C0PEM;
import X.C1233040iBy;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C14EU;
import X.C20662415tG;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C484220Iyq;
import X.C852580XcW;
import X.InterfaceC1891350zJl;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS233S0100000_31;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC836760Ws6
public final class SecurityPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6HELIOSJiJiOS40LWs/LCwmOiw4MGEALSY5OyYnMRUtLio=";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1009));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f7a;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv ZR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ms4) : null;
            this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        MutableLiveData<Boolean> mutableLiveData;
        super.onResume();
        SecurityViewModel securityViewModel = (SecurityViewModel) this.LLJI.getValue();
        if (securityViewModel == null || (mutableLiveData = securityViewModel.LL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS274S0000000_30.get$arr$(73));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        try {
            if (TextUtils.equals("incomePlusVerificationSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                c1233040iBy.LIZIZ(2131847246);
                c1233040iBy.LIZLLL();
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<Class<? extends PowerCell<? extends InterfaceC1891350zJl>>> listVQ2;
        MutableLiveData<Boolean> mutableLiveData;
        super.onViewCreated(view, bundle);
        SecurityViewModel securityViewModel = (SecurityViewModel) this.LLJI.getValue();
        if (securityViewModel != null && (mutableLiveData = securityViewModel.LLILLJJLI) != null) {
            mutableLiveData.observe(this, new AObserverS233S0100000_31(this, 18));
        }
        SecurityViewModel securityViewModel2 = (SecurityViewModel) this.LLJI.getValue();
        if (securityViewModel2 != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C852580XcW(securityViewModel2, null), 3);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y1z);
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1237450iJ5.LIZIZ(c0om1, getString(2131826824), new AwS575S0100000_31(this, 1008));
            tuxNavBar.setNavActions(c0om1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, requireContext());
            if (numLIZJ != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
            tuxNavBar.LJIIZILJ(false);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, requireContext());
        if (numLIZJ2 != null) {
            view.setBackgroundColor(numLIZJ2.intValue());
        }
        ZR().getState().LJFF(null);
        SecurityViewModel securityViewModel3 = (SecurityViewModel) this.LLJI.getValue();
        if (securityViewModel3 != null) {
            listVQ2 = securityViewModel3.vQ2();
            if (listVQ2 != null) {
                Iterator<Class<? extends PowerCell<? extends InterfaceC1891350zJl>>> it2 = listVQ2.iterator();
                while (it2.hasNext()) {
                    ZR().LJIILJJIL(it2.next());
                }
            }
        } else {
            listVQ2 = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR = ZR();
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 16);
        C20662415tG c20662415tG = new C20662415tG();
        awS610S0100000_31.invoke(c20662415tG);
        viewOnAttachStateChangeListenerC20604515jvZR.getState().LIZLLL(c20662415tG.LIZ, null);
        viewOnAttachStateChangeListenerC20604515jvZR.setViewTypeMap(c20662415tG.LIZIZ);
        if (listVQ2 != null) {
            for (Class<? extends PowerCell<? extends InterfaceC1891350zJl>> cls : listVQ2) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvZR2 = ZR();
                AwS397S0200000_31 awS397S0200000_31 = new AwS397S0200000_31((Class) cls, (Class<? extends PowerCell<? extends InterfaceC1891350zJl>>) this, (SecurityPage) 11);
                C20662415tG c20662415tG2 = new C20662415tG();
                awS397S0200000_31.invoke(c20662415tG2);
                viewOnAttachStateChangeListenerC20604515jvZR2.getState().LIZLLL(c20662415tG2.LIZ, null);
                viewOnAttachStateChangeListenerC20604515jvZR2.setViewTypeMap(c20662415tG2.LIZIZ);
            }
        }
    }
}
