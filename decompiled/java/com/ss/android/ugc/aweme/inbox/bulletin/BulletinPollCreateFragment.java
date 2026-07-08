package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C098200Yq;
import X.C0OM1;
import X.C0OPX;
import X.C0OU6;
import X.C1220000hqw;
import X.C1227904rF;
import X.C1251150ifB;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2188811AlT;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollCreateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BulletinPollCreateFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5HELIOSJSM2PCwiZw0mJCkpPSY9GCogJQwhLSQ4LAkhKSIhLCEn";
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public final C736950SvV LLJI;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public BulletinPollCreateFragment() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 240);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinPollCreateViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(153), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fragment onDestroy ");
        sbLIZ.append(this.LLJI.getValue());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        BulletinPollCreateViewModel bulletinPollCreateViewModel = (BulletinPollCreateViewModel) this.LLJI.getValue();
        bulletinPollCreateViewModel.LL = "";
        ((ArrayList) bulletinPollCreateViewModel.LLILLL).clear();
        bulletinPollCreateViewModel.LLILLJJLI = 0;
        bulletinPollCreateViewModel.LLILZ = 1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        this.LLIZ = C0OPX.LJ(getArguments());
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("previous_page")) == null) {
            string = "";
        }
        this.LLIZLLLIL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string3 = arguments2.getString("enter_method")) != null) {
            str = string3;
        }
        this.LLJ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fragment onCreate ");
        sbLIZ.append(this.LLJI.getValue());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (C0OU6.LIZ()) {
            try {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    string2 = arguments3.getString("bulletin_template_poll_content");
                } else {
                    string2 = null;
                }
                C1227904rF.LIZ.getClass();
                ((BulletinPollCreateViewModel) this.LLJI.getValue()).wQ2((Map) C1227904rF.LIZJ(string2, Map.class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PollCreateFragment onCreate exception: ");
                sbLIZ2.append(e);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(152));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.d2u);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 239));
        c0om1.LJ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 105), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a91, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
