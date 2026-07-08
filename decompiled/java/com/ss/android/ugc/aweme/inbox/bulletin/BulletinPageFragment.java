package com.ss.android.ugc.aweme.inbox.bulletin;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C08EX;
import X.C098200Yq;
import X.C0C64;
import X.C0OGP;
import X.C0OI1;
import X.C0OI2;
import X.C0OJR;
import X.C0OJU;
import X.C0OLV;
import X.C0OMV;
import X.C0OO1;
import X.C0OOM;
import X.C0OPG;
import X.C0OPN;
import X.C0OPO;
import X.C0OPQ;
import X.C0OPT;
import X.C0OPX;
import X.C0OTL;
import X.C0OWM;
import X.C0OZB;
import X.C0PEM;
import X.C0QSJ;
import X.C0SY5;
import X.C0XQ7;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1246860iYG;
import X.C127G;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1389890mGx;
import X.C1389910mGz;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1558360qeg;
import X.C1599690rjL;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C338520DOw;
import X.C343970De7;
import X.C345280DgE;
import X.C438520HHm;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C605400Noo;
import X.C619290OQt;
import X.C620010OTn;
import X.C620050OTr;
import X.C665390Q8b;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC617010OHz;
import X.EnumC617060OIe;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC617160OIo;
import X.InterfaceC617290OJb;
import X.InterfaceC622800Obm;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.InterfaceC836760Ws6;
import Y.ACListenerS117S0200000_14;
import Y.AObjectS384S0100000_9;
import Y.AObjectS62S0000000_9;
import Y.ARunnableS104S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListPageStatusViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListScrollToViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinActivityStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BulletinPageFragment extends BaseFragment implements InterfaceC21503819Do, BulletinCommonAbility, InterfaceC724530SbT, Observer<EnumC617010OHz>, InterfaceC1554640qYg, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C0OGP LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final List<String> LLLF;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArHELIOSZic5JSM2PCwiZw0mJCkpPSY9GCQrLAkhKSIhLCEn";
    public long LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL = true;
    public boolean LLJILJIL;
    public C0OLV LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C736950SvV LLJJ;
    public final AssemVMLazy LLJJI;
    public final C736950SvV LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C736950SvV LLJJJIL;
    public final C736950SvV LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C08EX LLJJJJLIIL;
    public C127G LLJJL;
    public C0OTL LLJJLIIIJLLLLLLLZ;
    public InterfaceC622800Obm LLJL;
    public InterfaceC617290OJb LLJLIL;
    public C0OJU LLJLILLLLZIIL;
    public C0OZB LLJLL;
    public InterfaceC617160OIo LLJLLIL;
    public InterfaceC665370Q7z LLJLLL;
    public C0QSJ LLJZ;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0OGP] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPageFragment.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BulletinPageFragment.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0), new C2217381BqS(BulletinPageFragment.class, "pageStatusVM", "getPageStatusVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListPageStatusViewModel;", 0), new C2217381BqS(BulletinPageFragment.class, "holderListVm", "getHolderListVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0), new C2217381BqS(BulletinPageFragment.class, "holderScrollToVm", "getHolderScrollToVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListScrollToViewModel;", 0), new C2217381BqS(BulletinPageFragment.class, "holderPublishVm", "getHolderPublishVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPublishViewModel;", 0), new C2217381BqS(BulletinPageFragment.class, "holderMediaVm", "getHolderMediaVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinMediaViewModel;", 0)};
        LLJZIJLIL = new Object() { // from class: X.0OGP
        };
        LLLF = C1697810uHb.LJIIJJI("share_reflow_page", "push", "in_app_push");
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(VR(), InterfaceC617160OIo.class);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C0OTL.class) {
            this.LLJJLIIIJLLLLLLLZ = (C0OTL) obj;
        } else if (cls == InterfaceC622800Obm.class) {
            this.LLJL = (InterfaceC622800Obm) obj;
        } else if (cls == InterfaceC617290OJb.class) {
            this.LLJLIL = (InterfaceC617290OJb) obj;
        } else if (cls == C0OJU.class) {
            this.LLJLILLLLZIIL = (C0OJU) obj;
        } else if (cls == C0OZB.class) {
            this.LLJLL = (C0OZB) obj;
        } else if (cls == InterfaceC617160OIo.class) {
            this.LLJLLIL = (InterfaceC617160OIo) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinEditFragmentScope.class, BulletinFragmentScope.class, BulletinEditFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C0OTL.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == InterfaceC622800Obm.class) {
            return this.LLJL;
        }
        if (cls == InterfaceC617290OJb.class) {
            return this.LLJLIL;
        }
        if (cls == C0OJU.class) {
            return this.LLJLILLLLZIIL;
        }
        if (cls == C0OZB.class) {
            return this.LLJLL;
        }
        if (cls == InterfaceC617160OIo.class) {
            return this.LLJLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEditFragmentScope.class);
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(VR(), InterfaceC617160OIo.class);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -330571869) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C0OTL.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == InterfaceC622800Obm.class) {
            this.LLJL = null;
        } else if (cls == InterfaceC617290OJb.class) {
            this.LLJLIL = null;
        } else if (cls == C0OJU.class) {
            this.LLJLILLLLZIIL = null;
        } else if (cls == C0OZB.class) {
            this.LLJLL = null;
        } else if (cls == InterfaceC617160OIo.class) {
            this.LLJLLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public BulletinPageFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        AssemVMLazy assemVMLazy3;
        AssemVMLazy assemVMLazy4;
        AssemVMLazy assemVMLazy5;
        AssemVMLazy assemVMLazy6;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 211);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(150);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 194), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 197), aFwS240S0000000_9, null, null, null);
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 200), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(this, 198);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinEditViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(144);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, z);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJ = new C736950SvV(c19719912DlLIZ2, awS553S0100000_92, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_92, c451460Hn6, c451620HnM, c338520DOw);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PanelStateViewModel.class);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(c19719912DlLIZ3, 203);
        AFwS240S0000000_9 aFwS240S0000000_93 = AFwS240S0000000_9.get$arr$(141);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_93, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 205), aFwS240S0000000_93, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            z2 = false;
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_93, new AwS553S0100000_9((Fragment) this, 207), aFwS240S0000000_93, null, null, null);
        } else {
            z2 = false;
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 238), aFwS240S0000000_93, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy2;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(BulletinListPageStatusViewModel.class);
        AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ4, 192);
        AFwS240S0000000_9 aFwS240S0000000_94 = AFwS240S0000000_9.get$arr$(139);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS553S0100000_94, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 196), aFwS240S0000000_94, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS553S0100000_94, new AwS553S0100000_9((Fragment) this, 199), aFwS240S0000000_94, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS553S0100000_94, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 202), aFwS240S0000000_94, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        }
        AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(this, 234);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_95, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(145), new C451460Hn6(this, z2), new C451620HnM(this, true), new C338520DOw(this));
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(BulletinListViewModel.class);
        AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c19719912DlLIZ5, 204);
        AFwS240S0000000_9 aFwS240S0000000_95 = AFwS240S0000000_9.get$arr$(143);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS553S0100000_96, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 206), aFwS240S0000000_95, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS553S0100000_96, new AwS553S0100000_9((Fragment) this, 209), aFwS240S0000000_95, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS553S0100000_96, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 213), aFwS240S0000000_95, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        }
        this.LLJJIJI = assemVMLazy3;
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(BulletinListScrollToViewModel.class);
        AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c19719912DlLIZ6, 215);
        AFwS240S0000000_9 aFwS240S0000000_96 = AFwS240S0000000_9.get$arr$(148);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS553S0100000_97, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 217), aFwS240S0000000_96, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS553S0100000_97, new AwS553S0100000_9((Fragment) this, 219), aFwS240S0000000_96, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS553S0100000_97, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 221), aFwS240S0000000_96, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        }
        this.LLJJIJIIJIL = assemVMLazy4;
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(BulletinPublishViewModel.class);
        AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c19719912DlLIZ7, 223);
        AFwS240S0000000_9 aFwS240S0000000_97 = AFwS240S0000000_9.get$arr$(149);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ7), awS553S0100000_98, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 226), aFwS240S0000000_97, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), awS553S0100000_98, new AwS553S0100000_9((Fragment) this, 228), aFwS240S0000000_97, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ7), awS553S0100000_98, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 231), aFwS240S0000000_97, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        }
        this.LLJJIJIL = assemVMLazy5;
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(BulletinMediaViewModel.class);
        AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c19719912DlLIZ8, 233);
        AFwS240S0000000_9 aFwS240S0000000_98 = AFwS240S0000000_9.get$arr$(151);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            c452070Ho5 = c452070Ho5;
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ8), awS553S0100000_99, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 235), aFwS240S0000000_98, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy6 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), awS553S0100000_99, new AwS553S0100000_9((Fragment) this, 237), aFwS240S0000000_98, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            c452070Ho5 = c452070Ho5;
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ8), awS553S0100000_99, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 193), aFwS240S0000000_98, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        }
        this.LLJJJ = assemVMLazy6;
        this.LLJJJIL = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(146), new C451460Hn6(this, z2), new C451620HnM(this, true), new C338520DOw(this));
        AwS553S0100000_9 awS553S0100000_910 = new AwS553S0100000_9(this, 201);
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(BulletinEmojiViewModel.class), awS553S0100000_910, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(147), new C451460Hn6(this, z2), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 236));
        this.LLJJJJLIIL = new C08EX(new AwS410S0200000_9(new AwS553S0100000_9(this, 195), C724750Sbp.LJII(this), 24));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final void B6() {
        if (this.LLJ) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        } else {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final boolean K82() {
        return this.LLJI && this.LLJ;
    }

    public final C0QSJ SR() {
        C0QSJ c0qsj = this.LLJZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLLL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{BulletinFragmentScope.class});
        this.LLJZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final BulletinInputStateViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (BulletinInputStateViewModel) assemVMLazy.getValue();
    }

    public final BulletinProfileViewModel VR() {
        return (BulletinProfileViewModel) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0OPX.LJIIJJI("bulletin_board_page", "onDestroy");
        Pair[] pairArr = new Pair[4];
        Bundle arguments = getArguments();
        pairArr[0] = new Pair("enter_from", arguments != null ? arguments.getString("previous_page") : null);
        pairArr[1] = new Pair("channel_id", String.valueOf(VR().LLILLJJLI));
        pairArr[2] = new Pair("duration", String.valueOf(System.currentTimeMillis() - this.LLIZLLLIL));
        pairArr[3] = new Pair("is_author", VR().To() ? "1" : CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("bulletin_total_stay_time", C2097608Jq.LJIIIIZZ(pairArr));
        C605400Noo c605400Noo = C605400Noo.LIZ;
        String strValueOf = String.valueOf(this.LLIZ);
        c605400Noo.getClass();
        C605400Noo.LIZ(strValueOf).LIZIZ();
        Context context = getContext();
        if (context != null && C0SY5.LIZIZ(context) != null) {
            C0OI1 c0oi1 = C0OI1.LIZ;
            long j = this.LLIZ;
            c0oi1.getClass();
            C0OI2 c0oi2 = (C0OI2) ((LinkedHashMap) C0OI1.LIZIZ).get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (c0oi2 != null) {
                LiveData liveData = (LiveData) ((LinkedHashMap) c0oi2.LIZIZ).get(Long.valueOf(j));
                if (liveData != null) {
                    liveData.removeObserver(this);
                }
                List list = (List) ((LinkedHashMap) c0oi2.LIZ).get(Long.valueOf(j));
                if (list != null) {
                    list.remove(this);
                }
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_emoji_flow_view_pool_keep_on_exit", true, true)) {
            C619290OQt.LIZ.getClass();
            C619290OQt.LIZJ();
        } else {
            C619290OQt.LIZ.getClass();
            C619290OQt.LIZ();
        }
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C0OPT.LIZ.getClass();
        C0OPT.LIZIZ = false;
        ((LinkedHashMap) C0OO1.LIZJ).clear();
        ((LinkedHashMap) C0OO1.LIZLLL).clear();
        C0OPX.LJII("PostScriptManager.onChannelExit()");
        C0OMV.LIZIZ = null;
        C0OMV.LIZLLL = null;
        C0OMV.LIZJ = 0;
        C0OMV.LIZ.clear();
        BulletinCommentSheetFragment.LLJJIJIIJIL = 0L;
        BulletinCommentListViewModel.LLJILJILJ = 0L;
        BulletinCommentListViewModel.LLJILLL = null;
        BulletinCommentListViewModel.LLJJ = null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final int IE() {
        return VR().IE();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final String J51() {
        List<BulletinActivityStruct> activityList;
        BulletinActivityStruct bulletinActivityStruct;
        String str;
        BulletinHybridResourceResponse bulletinHybridResourceResponseLIZ = VR().getState().LLJJJJJIL.LIZ();
        return (bulletinHybridResourceResponseLIZ == null || (activityList = bulletinHybridResourceResponseLIZ.getActivityList()) == null || (bulletinActivityStruct = (BulletinActivityStruct) C13LP.LJJJLZIJ(0, activityList)) == null || (str = bulletinActivityStruct.activityId) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final boolean Nl() {
        return VR().Nl();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final String P52() {
        Iterator<C0OJR> it2 = VR().getState().LLIZLLLIL.getBulletinAccountStatus().iterator();
        while (it2.hasNext()) {
            C0OJR next = it2.next();
            if (next == C0OJR.BULLETIN_OPEN_NORMAL) {
                return next != null ? "open" : "close";
            }
        }
        return "close";
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final boolean To() {
        return VR().To();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final long Vq() {
        return VR().getState().LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final int bB() {
        EnumC617060OIe enumC617060OIeLIZ = VR().getState().LLILLJJLI.LIZ();
        if (enumC617060OIeLIZ == null) {
            enumC617060OIeLIZ = EnumC617060OIe.INVALID;
        }
        return enumC617060OIeLIZ.getValue();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinListViewModel.class, new AObjectS384S0100000_9(this, 36), BulletinPublishViewModel.class, new AObjectS384S0100000_9(this, 37), BulletinCommentListViewModel.class, new AObjectS62S0000000_9(this, 53)}, defaultViewModelProviderFactory);
                    this.LLJJL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final BulletinBoardInfo nI() {
        return VR().getState().LL.LIZ();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0OPX.LJIIJJI("bulletin_board_page", "onPause");
        C0OPN c0opn = C0OPN.LJI;
        String strValueOf = String.valueOf(VR().LLILLJJLI);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("previous_page") : null;
        boolean zTo = VR().To();
        if (c0opn.LJ()) {
            c0opn.LIZJ = string;
            c0opn.LIZJ("channel_id", strValueOf);
            c0opn.LIZ(zTo ? 1 : 0, "is_author");
            C0OPG c0opg = C0OPN.LJII;
            c0opg.LIZIZ();
            c0opn.LIZIZ("duration", String.valueOf(c0opg.LIZ()));
            c0opn.LJII();
        }
        try {
            AssemVMLazy assemVMLazy = this.LLJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
            ((BulletinMediaViewModel) assemVMLazy.getValue()).vQ2();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InputMethodManager inputMethodManager;
        super.onResume();
        C0OPX.LJIIJJI("bulletin_board_page", "onResume");
        C0OPN c0opn = C0OPN.LJI;
        c0opn.LJIIIIZZ();
        if (c0opn.LJFF()) {
            C0OPN.LJII.LIZJ();
        }
        if (UR().isFullScreen() && UR().getState().LLILLJJLI == C0OWM.KEY_BOARD) {
            View view = getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS104S0100000_4(this, 159), 300L);
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 != null) {
            Object objH2 = C786410Ut5.H2(view2.getContext(), "input_method");
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
            }
            View viewFindFocus = view2.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final boolean q11() {
        return VR().q11();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final int qF() {
        return VR().qF();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final C0OLV Hh2() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final long Og2() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final boolean eb2() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final boolean isHalfScreen() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility
    public final boolean isLive() {
        return this.LLJI;
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(EnumC617010OHz enumC617010OHz) {
        if (enumC617010OHz == EnumC617010OHz.CHANNEL_NOT_SUBSCRIBED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onChanged: CHANNEL_NOT_SUBSCRIBED, delete bbId: ");
            sbLIZ.append(this.LLIZ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            IBulletinBoardDataService iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null);
            if (iBulletinBoardDataService != null) {
                iBulletinBoardDataService.LJI(String.valueOf(this.LLIZ));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        C0OPX.LJIIJJI("bulletin_board_page", "onCreate");
        this.LLIZ = C0OPX.LIZLLL(getArguments(), "bulletin_board_id");
        NR(AFwS240S0000000_9.get$arr$(140));
        activityConfiguration(AFwS240S0000000_9.get$arr$(142));
        C665390Q8b.LIZ(C1558360qeg.LJFF(this, null));
        super.onCreate(bundle);
        C620010OTn c620010OTn = C620010OTn.LIZ;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        c620010OTn.getClass();
        if (C0OPO.LIZ() && C620010OTn.LIZIZ().LIZJ == null) {
            C0OPX.LJII("BulletinBoard starts to fetch emoji gecko data");
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C438520HHm(null), 2);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C0OPT.LIZ.getClass();
        C0OPT.LIZIZ = false;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("bulletin_tasks")) == null || a0.LJJJIL(string)) {
            C1246860iYG c1246860iYG = C1246860iYG.LIZ;
            Bundle arguments2 = getArguments();
            c1246860iYG.getClass();
            C1246860iYG.LIZIZ(this, arguments2, 1001);
        }
    }

    @C14EU
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        String str;
        Object obj;
        String str2;
        String strLIZ;
        if (Intrinsics.LJFF("bulletin_board_page", c1365870leD.LJ)) {
            C0OLV c0olv = this.LLJILJILJ;
            if (c0olv != null && (str = c0olv.LL) != null) {
                C620050OTr c620050OTr = C620050OTr.LIZ;
                String str3 = "chat_merge";
                if (c1365870leD.LIZJ) {
                    obj = "chat_merge";
                } else {
                    obj = "chat_head";
                }
                C620050OTr.LIZIZ(c620050OTr, str, "channel_share", C2097908Jt.LIZJ(new Pair("platform", obj)));
                C0OPQ c0opq = C0OPQ.LIZ;
                if (c1365870leD.LIZJ) {
                    str2 = "chat_merge";
                } else {
                    str2 = "chat_head";
                }
                boolean zTo = VR().To();
                int iQF = VR().qF();
                c0opq.getClass();
                C0OPQ.LJJIJL(str, zTo ? 1 : 0, iQF, str2, "share_panel", "bulletin_board_page", "creation_guide");
                if (!c1365870leD.LIZJ) {
                    str3 = "chat_head";
                }
                C0OPQ.LJJIJLIJ(str, str3, "share_panel", "bulletin_board_page", VR().To() ? 1 : 0, VR().qF(), 1, "creation_guide");
                C19EG activity = getActivity();
                if (activity != null) {
                    strLIZ = C345280DgE.LIZ(activity, c1365870leD);
                } else {
                    strLIZ = null;
                }
                C1389910mGz c1389910mGz = new C1389910mGz(this);
                c1389910mGz.LJIIJ(strLIZ);
                c1389910mGz.LJ(3000L);
                C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                c1360890lWB.LIZIZ = 0;
                c1360890lWB.LIZLLL = 0;
                c1360890lWB.LJIIIIZZ = new ACListenerS117S0200000_14(c1365870leD, this, 12);
                c1389910mGz.LJIIJJI();
            } else {
                return;
            }
        }
        if (TextUtils.equals("live_event", c1365870leD.LIZLLL)) {
            try {
                C19EG activity2 = getActivity();
                if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
                    for (Fragment fragment : listLJJLIIIJL) {
                        String tag = fragment.getTag();
                        if (tag != null && u.LJJIIJZLJL(tag, "SparkPopup", false)) {
                            IMSharePanelApi.LIZ.getClass();
                            C1599690rjL.LIZ().getShareService().LJJIIZ(fragment, c1365870leD);
                            return;
                        }
                    }
                    if (listLJJLIIIJL.size() > 0) {
                        IMSharePanelApi.LIZ.getClass();
                        C1599690rjL.LIZ().getShareService().LJJIIZ((Fragment) ListProtector.get(listLJJLIIIJL, 0), c1365870leD);
                    }
                }
            } catch (Error e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onToastEvent(C0OOM c0oom) {
        if (!isResumed()) {
            return;
        }
        long j = this.LLIZ;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c0oom.LIZ);
        if (lLJIILIIL != null && j == lLJIILIIL.longValue()) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(c0oom.LIZIZ);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        C0OPX.LJIIJJI("bulletin_board_page", "onActivityNewIntent");
        C1246860iYG c1246860iYG = C1246860iYG.LIZ;
        Bundle arguments = getArguments();
        c1246860iYG.getClass();
        C1246860iYG.LIZIZ(this, arguments, 1001);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05b8  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.13BV] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r37, android.os.Bundle r38) {
        /*
            Method dump skipped, instruction units count: 1607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a8x, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
