package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C340320DVu;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C621500OZg;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import Y.AObjectS384S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiDetailFragmentData;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiDetailListFragment extends BaseFragment implements InterfaceC1206390hUz, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5JSM2HELIOSPCwiZw0mJCkpPSY9DSgjIyYXLTEtICMfITY4Dz0yLygpJzs=";
    public final AssemVMLazy LLIZ;
    public C127G LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public C0QSJ LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinEmojiDetailListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinEmojiDetailListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    public BulletinEmojiDetailListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinEmojiDetailListViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 601);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(133);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 188), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS553S0100000_9((Fragment) this, 189), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 190), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZLLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZLLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinEmojiDetailListViewModel.class, new AObjectS384S0100000_9(this, 35)}, defaultViewModelProviderFactory);
                    this.LLIZLLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BulletinEmojiDetailFragmentData bulletinEmojiDetailFragmentData;
        NR(AFwS240S0000000_9.get$arr$(129));
        activityConfiguration(AFwS240S0000000_9.get$arr$(130));
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(131));
        activityConfiguration(AFwS240S0000000_9.get$arr$(132));
        Bundle arguments = getArguments();
        if (arguments != null) {
            bulletinEmojiDetailFragmentData = (BulletinEmojiDetailFragmentData) arguments.getParcelable("power_viewpager_default_key");
        } else {
            bulletinEmojiDetailFragmentData = null;
        }
        C723850SaN.LIZ(this, false, null, new AwS375S0200000_9(this, bulletinEmojiDetailFragmentData, 39), 3);
        if (bulletinEmojiDetailFragmentData != null) {
            AssemVMLazy assemVMLazy = this.LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            ((BulletinEmojiDetailListViewModel) assemVMLazy.getValue()).LLILZLL = bulletinEmojiDetailFragmentData.useCacheData;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        BulletinEmojiDetailListViewModel bulletinEmojiDetailListViewModel = (BulletinEmojiDetailListViewModel) assemVMLazy.getValue();
        C340320DVu c340320DVu = (C340320DVu) bulletinEmojiDetailListViewModel.getState();
        c340320DVu.getClass();
        List<C621500OZg> list = c340320DVu.getListState().LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            Map<String, List<User>> mapHj0 = bulletinEmojiDetailListViewModel.LL.Hj0();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                C621500OZg c621500OZg = (C621500OZg) obj;
                List<User> list2 = mapHj0.get(c621500OZg.LLILLJJLI);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<User> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getUid(), c621500OZg.LL.getUid())) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj);
            }
            if (arrayList.size() != arrayList2.size()) {
                bulletinEmojiDetailListViewModel.listSetItems(arrayList2);
                bulletinEmojiDetailListViewModel.setState(new AwS588S0100000_9(arrayList2, (List<InterfaceC1891350zJl>) 542));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 239), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a6v, viewGroup, false);
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
