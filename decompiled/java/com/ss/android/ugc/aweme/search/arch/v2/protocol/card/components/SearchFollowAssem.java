package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.AbstractC848400XPy;
import X.C07E5;
import X.C0SWE;
import X.C0XQ7;
import X.C1559260qg8;
import X.C1908730zln;
import X.C19EG;
import X.C2097608Jq;
import X.C648540PcC;
import X.C657700Pqy;
import X.C662640Pyw;
import X.C679340Qkm;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1357230lQH;
import X.InterfaceC1587906Jp;
import X.InterfaceC655700Pnk;
import X.InterfaceC712990Rxx;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFollowAssem extends ReusedUISlotAssem<SearchFollowAssem> implements InterfaceC712990Rxx<InterfaceC655700Pnk> {
    public C1908730zln LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C657700Pqy.class, null), checkSupervisorPrepared());
    public final AObserverS214S0100000_10 LLJLIL = new AObserverS214S0100000_10(this, 18);
    public User LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu2;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op() {
        User user = this.LLJLILLLLZIIL;
        if (user != null) {
            C1908730zln c1908730zlnSp = sp();
            C0SWE c0swe = new C0SWE(user);
            c0swe.LIZIZ = EnumC1357230lQH.NO_PREFIX;
            c0swe.LJFF = this;
            c0swe.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(Boolean.TRUE, 62));
            c1908730zlnSp.LLLLZIL(c0swe.LIZ());
        }
        try {
            TuxTextView tuxTextView = (TuxTextView) sp().findViewById(R.id.t4v);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(62);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final C1908730zln sp() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zmb) : null;
            this.LLJJLIIIJLLLLLLLZ = (C1908730zln) viewFindViewById;
        }
        return (C1908730zln) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC655700Pnk interfaceC655700Pnk) {
        String uid;
        int i;
        SearchGlobalViewModel searchGlobalViewModel;
        String uid2;
        C648540PcC c648540PcC;
        Map<String, Integer> map;
        Integer num;
        User currentUser = interfaceC655700Pnk.getCurrentUser();
        this.LLJLILLLLZIIL = currentUser;
        if (currentUser != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        boolean zEquals = TextUtils.equals(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C1908730zln c1908730zlnSp = sp();
        if (!zEquals) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c1908730zlnSp);
        if (!zEquals) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragmentLJI, c19egLIZ);
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                searchGlobalViewModel = (SearchGlobalViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19egLIZ2).get(SearchGlobalViewModel.class);
                if (searchGlobalViewModel != null) {
                    User user = this.LLJLILLLLZIIL;
                    if (user != null && (uid2 = user.getUid()) != null && (c648540PcC = (C648540PcC) searchGlobalViewModel.LL.getValue()) != null && (map = c648540PcC.LIZIZ) != null && (num = map.get(uid2)) != null) {
                        int iIntValue = num.intValue();
                        User user2 = this.LLJLILLLLZIIL;
                        if (user2 != null) {
                            user2.setFollowStatus(iIntValue);
                        }
                    }
                    NextLiveData nextLiveData = searchGlobalViewModel.LLILLJJLI;
                    if (nextLiveData != null) {
                        nextLiveData.removeObserver(this.LLJLIL);
                        if (lifecycleOwnerLJIJJ != null) {
                            nextLiveData.observe(lifecycleOwnerLJIJJ, this.LLJLIL);
                        }
                    }
                }
            } else {
                searchGlobalViewModel = null;
            }
            op();
            sp().setFollowClickInterceptor(new C662640Pyw(this, null));
            sp().setDataChangeListener(new AwS376S0200000_10(this, searchGlobalViewModel, 75));
            sp().setTracker(new AwS554S0100000_10(this, 944));
        }
    }

    public final void tp(FollowStatus followStatus) {
        User user = this.LLJLILLLLZIIL;
        if (user == null || !TextUtils.equals(followStatus.getUserId(), user.getUid())) {
            return;
        }
        user.setFollowStatus(followStatus.getFollowStatus());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655700Pnk interfaceC655700Pnk) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655700Pnk interfaceC655700Pnk) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
