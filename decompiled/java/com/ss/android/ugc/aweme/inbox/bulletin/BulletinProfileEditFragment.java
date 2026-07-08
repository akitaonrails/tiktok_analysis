package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0OP5;
import X.C0OPQ;
import X.C1220000hqw;
import X.C1390130mHL;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338490DOt;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BulletinProfileEditFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5JSHELIOSM2PCwiZw0mJCkpPSY9GDcjLyY/LQAoIDsVOiQrJCo9PA==";
    public final boolean LLIZ;
    public final long LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public C1390130mHL LLJIJIL;
    public String LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C736950SvV LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinProfileEditFragment.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinBoardEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinProfileEditFragment() {
        this(0L, null, null, true);
    }

    public final C1390130mHL SR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.czd) : null;
            this.LLJIJIL = (C1390130mHL) viewFindViewById;
        }
        return (C1390130mHL) viewFindViewById;
    }

    public final BulletinBoardEditViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (BulletinBoardEditViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLIZ) {
            C0OP5.LJI.LJIIIZ(0);
            return;
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(this.LLIZLLLIL);
        String str = this.LLJJ;
        String str2 = this.LLJJI;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LLJJIII;
        BulletinBoardEditViewModel bulletinBoardEditViewModelUR = UR();
        int i = !Intrinsics.LJFF(bulletinBoardEditViewModelUR.LLJ, bulletinBoardEditViewModelUR.LLILZ) ? 1 : 0;
        int i2 = UR().LLJIJIL != null ? 1 : 0;
        BulletinBoardEditViewModel bulletinBoardEditViewModelUR2 = UR();
        int i3 = 1 ^ (Intrinsics.LJFF(bulletinBoardEditViewModelUR2.LLJI, bulletinBoardEditViewModelUR2.LLILZIL) ? 1 : 0);
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("channel_id", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("exit_method", str3);
        c2344009Gk.LIZJ(i, "is_name_edited");
        c2344009Gk.LIZJ(i2, "is_avatar_edited");
        c2344009Gk.LIZJ(i3, "is_desc_edited");
        C20684815ws.LJIILLIIL("exit_bulletin_desc_edit_page", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJIJIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(156));
        activityConfiguration(AFwS240S0000000_9.get$arr$(157));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.BulletinProfileEditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a90, viewGroup, false);
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

    public BulletinProfileEditFragment(long j, String str, String str2, boolean z) {
        AssemVMLazy assemVMLazy;
        boolean z2;
        this.LLIZ = z;
        this.LLIZLLLIL = j;
        this.LLJ = str;
        this.LLJI = str2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinBoardEditViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 647);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(983);
        boolean z3 = false;
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1856), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new AwS553S0100000_9((Fragment) this, 1857), aFwS240S0000000_9, null, null, null);
            z3 = false;
            z2 = true;
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1858), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJILJILJ = assemVMLazy;
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1855);
        this.LLJILLL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(986), new C451460Hn6(this, z3), new C451620HnM(this, z2), new C338520DOw(this));
        this.LLJJ = "notification_page";
        this.LLJJIII = "cancel";
    }
}
