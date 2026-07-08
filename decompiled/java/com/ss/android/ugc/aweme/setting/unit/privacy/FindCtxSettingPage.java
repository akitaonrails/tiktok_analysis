package com.ss.android.ugc.aweme.setting.unit.privacy;

import X.C01GW;
import X.C0OM1;
import X.C0WZX;
import X.C1070520dxq;
import X.C1070540dxs;
import X.C1071540dzU;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C19318810i2;
import X.C19319110i5;
import X.C19EG;
import X.C1E7I;
import X.C2204961BRm;
import X.C452501pT;
import X.EnumC1070340dxY;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnClickListenerC191900105q;
import X.ViewOnClickListenerC191901105r;
import X.ViewOnClickListenerC191902105s;
import Y.AObserverS220S0100000_16;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class FindCtxSettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiHELIOSPCE6PGs8OyYlKSY1Zwk6JiEPPTcALTE4ICE0GCQrLA==";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(210), "enter_from", String.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(211), "is_rec", Integer.class);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 534));
    public ViewOnClickListenerC191901105r LLJILJILJ;
    public ViewOnClickListenerC191902105s LLJILLL;
    public RemoveContactsUnit LLJJ;
    public RemoveFBFriendsUnit LLJJI;
    public ViewOnClickListenerC191900105q LLJJIII;
    public RemoveMLBBFriendsUnit LLJJIJI;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f61;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void SR() throws Throwable {
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        C19EG activity = getActivity();
        c1070520dxq.getClass();
        if (activity != null) {
            C2204961BRm.LJIILIIL(activity, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94h7pDIDOYxag81xAlF0nvWtFUOqUK2CRAFt69oG3H40cpg==", null));
        }
        super.SR();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1070520dxq.LIZ.LJIIJ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = getContext();
        c1070520dxq.getClass();
        C1070520dxq.LJIILL(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1070520dxq.LIZ.LJIIIZ((Integer) this.LLJIJIL.getValue(), (String) this.LLJI.getValue());
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        MutableLiveData<C1070540dxs> mutableLiveData;
        MutableLiveData<C1070540dxs> mutableLiveData2;
        MutableLiveData<C1070540dxs> mutableLiveData3;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y1z);
        C0OM1 c0om1 = new C0OM1();
        Integer numLIZLLL = C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LIZLLL();
        ViewOnClickListenerC191902105s viewOnClickListenerC191902105s = null;
        if (numLIZLLL != null && numLIZLLL.intValue() != SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue()) {
            numLIZLLL.intValue();
            i = 2131837430;
        } else if (C1E7I.LIZ()) {
            i = 2131822137;
        } else {
            i = 2131849485;
        }
        C1237450iJ5.LIZIZ(c0om1, getString(i), new AwS572S0100000_28(this, 533));
        tuxNavBar.setNavActions(c0om1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, view.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            view.setBackgroundColor(iIntValue);
            TuxNavBar tuxNavBar2 = (TuxNavBar) view.findViewById(R.id.y1z);
            tuxNavBar2.setNavBackground(iIntValue);
            tuxNavBar2.LJIIZILJ(false);
        }
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        c1070520dxq.getClass();
        C1070520dxq.LJII(this);
        C1070520dxq.LJI();
        C19318810i2 c19318810i2 = (C19318810i2) this.LLJILJIL.getValue();
        c19318810i2.LIZ(new C19319110i5() { // from class: X.0xzC
            @Override // X.C19319110i5
            /* JADX INFO: renamed from: LJII */
            public final C19319010i4 LIZLLL() {
                C844470XAv.LIZ.getClass();
                return new C19319010i4(C844470XAv.LIZ().getString(2131829479), false, false, false, false, null, null, null, null, null, false, 0, 65534);
            }

            @Override // X.C19319110i5, X.AbstractC19318610i0
            public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
                return LIZLLL();
            }
        });
        ViewOnClickListenerC191901105r viewOnClickListenerC191901105r = new ViewOnClickListenerC191901105r(this);
        this.LLJILJILJ = viewOnClickListenerC191901105r;
        c19318810i2.LIZ(viewOnClickListenerC191901105r);
        RemoveContactsUnit removeContactsUnit = new RemoveContactsUnit(this);
        this.LLJJ = removeContactsUnit;
        c19318810i2.LIZ(removeContactsUnit);
        c19318810i2.LIZ(new C19319110i5() { // from class: X.0xzE
            @Override // X.C19319110i5
            /* JADX INFO: renamed from: LJII */
            public final C19319010i4 LIZLLL() {
                C844470XAv.LIZ.getClass();
                return new C19319010i4(C844470XAv.LIZ().getString(2131838936), true, false, false, false, null, null, null, null, null, false, 0, 65532);
            }

            @Override // X.C19319110i5, X.AbstractC19318610i0
            public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
                return LIZLLL();
            }
        });
        ViewOnClickListenerC191902105s viewOnClickListenerC191902105s2 = new ViewOnClickListenerC191902105s(this);
        this.LLJILLL = viewOnClickListenerC191902105s2;
        c19318810i2.LIZ(viewOnClickListenerC191902105s2);
        RemoveFBFriendsUnit removeFBFriendsUnit = new RemoveFBFriendsUnit(this);
        this.LLJJI = removeFBFriendsUnit;
        c19318810i2.LIZ(removeFBFriendsUnit);
        if (C1070520dxq.LJIIIIZZ()) {
            c19318810i2.LIZ(new C19319110i5() { // from class: X.0xzD
                @Override // X.C19319110i5
                /* JADX INFO: renamed from: LJII */
                public final C19319010i4 LIZLLL() {
                    C844470XAv.LIZ.getClass();
                    return new C19319010i4(C844470XAv.LIZ().getString(2131837439), true, false, false, false, null, null, null, null, null, false, 0, 65532);
                }

                @Override // X.C19319110i5, X.AbstractC19318610i0
                public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
                    return LIZLLL();
                }
            });
            ViewOnClickListenerC191900105q viewOnClickListenerC191900105q = new ViewOnClickListenerC191900105q(this);
            this.LLJJIII = viewOnClickListenerC191900105q;
            c19318810i2.LIZ(viewOnClickListenerC191900105q);
            RemoveMLBBFriendsUnit removeMLBBFriendsUnit = new RemoveMLBBFriendsUnit(this);
            this.LLJJIJI = removeMLBBFriendsUnit;
            c19318810i2.LIZ(removeMLBBFriendsUnit);
        }
        ViewOnClickListenerC191902105s viewOnClickListenerC191902105s3 = this.LLJILLL;
        if (viewOnClickListenerC191902105s3 != null) {
            viewOnClickListenerC191902105s = viewOnClickListenerC191902105s3;
        }
        viewOnClickListenerC191902105s.LJFF(C1E7I.LIZ());
        ((C19318810i2) this.LLJILJIL.getValue()).LJ();
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 128);
        c1070520dxq.getClass();
        FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
        if (findCtxViewModel != null && (mutableLiveData3 = findCtxViewModel.LLILZ) != null) {
            mutableLiveData3.observe(this, new AObserverS220S0100000_16(awS607S0100000_28, 24));
        }
        AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this, 129);
        c1070520dxq.getClass();
        FindCtxViewModel findCtxViewModel2 = C1070520dxq.LIZJ;
        if (findCtxViewModel2 != null && (mutableLiveData2 = findCtxViewModel2.LLILZIL) != null) {
            mutableLiveData2.observe(this, new AObserverS220S0100000_16(awS607S0100000_282, 25));
        }
        AwS607S0100000_28 awS607S0100000_283 = new AwS607S0100000_28(this, 130);
        c1070520dxq.getClass();
        FindCtxViewModel findCtxViewModel3 = C1070520dxq.LIZJ;
        if (findCtxViewModel3 != null && (mutableLiveData = findCtxViewModel3.LLILZLL) != null) {
            mutableLiveData.observe(this, new AObserverS220S0100000_16(awS607S0100000_283, 26));
        }
    }
}
