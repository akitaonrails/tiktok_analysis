package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C01GW;
import X.C0DX3;
import X.C0Q4Y;
import X.C0QSJ;
import X.C1250860iei;
import X.C1308910kAL;
import X.C1361720lXW;
import X.C1362110lY9;
import X.C1362120lYA;
import X.C1362230lYL;
import X.C1362240lYM;
import X.C1362250lYN;
import X.C1362270lYP;
import X.C1362370lYZ;
import X.C1362560lYs;
import X.C1371590lnR;
import X.C13DA;
import X.C13LE;
import X.C15438062q;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2277621ECy;
import X.C418440Gaw;
import X.C424780GlA;
import X.C426750GoL;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897370ZIh;
import X.EnumC1910450zoZ;
import X.InterfaceC1146704e9;
import X.InterfaceC1361730lXX;
import X.InterfaceC1362260lYO;
import X.InterfaceC1363370laB;
import X.InterfaceC1370690llz;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC897380ZIi;
import X.ViewOnAttachStateChangeListenerC1401940maO;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS32S0101000_21;
import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.ss.android.ugc.aweme.internalshare.api.experiment.SharePanelOperationDelayStrategy;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.ContactAssemScope;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelContactRootAssem;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelHeadPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelContactRootAssem extends UISlotAssem implements IContactActionAbility, InterfaceC1370690llz, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelContactRootAssem.class, "contactListViewModel", "getContactListViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SharePanelContactRootAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 641), AFwS259S0000000_21.get$arr$(178), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 620));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 621));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 619));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.crv;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactAssemScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactAssemScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactAssemScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1602605206) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final ShareContactListViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (ShareContactListViewModel) assemVMLazy.getValue();
    }

    public final C1362270lYP ip() {
        return (C1362270lYP) this.LLJJIJIIJIL.getValue();
    }

    public final boolean kp() {
        SharePackage sharePackage;
        C1362270lYP c1362270lYPIp;
        C1371590lnR c1371590lnR;
        C1362230lYL c1362230lYL;
        C1362270lYP c1362270lYPIp2 = ip();
        return (c1362270lYPIp2 == null || (sharePackage = c1362270lYPIp2.LL) == null || !sharePackage.LJIILL() || (c1362270lYPIp = ip()) == null || (c1371590lnR = c1362270lYPIp.LLILZ) == null || (c1362230lYL = c1371590lnR.LJJLIIIJILLIZJL) == null || !c1362230lYL.LJIJ) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0lYD] */
    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C19EG activity;
        String string;
        SharePackage sharePackage;
        Bundle bundle;
        final SharePackage sharePackage2;
        C1362230lYL c1362230lYL;
        C1371590lnR c1371590lnR;
        super.onParentSet();
        C1362270lYP c1362270lYPIp = ip();
        if (c1362270lYPIp != null && (sharePackage2 = c1362270lYPIp.LL) != null) {
            C1362270lYP c1362270lYPIp2 = ip();
            if (c1362270lYPIp2 == null || (c1371590lnR = c1362270lYPIp2.LLILZ) == null || (c1362230lYL = c1371590lnR.LJJLIIIJILLIZJL) == null) {
                c1362230lYL = new C1362230lYL();
                c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                Context context = getContext();
                c1362230lYL.LJIILLIIL = context != null ? C1308910kAL.LIZJ(R.attr.a1h, context) : null;
            } else if (c1362230lYL.LJIILLIIL == null) {
                Context context2 = getContext();
                c1362230lYL.LJIILLIIL = context2 != null ? C1308910kAL.LIZJ(R.attr.a1h, context2) : null;
            }
            C1362110lY9 c1362110lY9 = new C1362110lY9(c1362230lYL, 511);
            InterfaceC897380ZIi.LIZIZ.getClass();
            C1362120lYA c1362120lYA = new C1362120lYA(sharePackage2, C897370ZIh.LIZ().LJI(C1250860iei.LIZ(sharePackage2) ? EnumC1910450zoZ.SHARE_PANEL : EnumC1910450zoZ.LONG_PRESS_PANEL, false), c1362110lY9, new InterfaceC1363370laB() { // from class: X.0lYD
                @Override // X.InterfaceC1363370laB
                public final C0ZE7 getActivityStatusParams() {
                    EnumC1910440zoY enumC1910440zoY;
                    String str;
                    String str2;
                    SharePanelContactRootAssem sharePanelContactRootAssem = this.LL;
                    SharePackage sharePackage3 = sharePackage2;
                    sharePanelContactRootAssem.getClass();
                    if (C1250860iei.LIZ(sharePackage3)) {
                        enumC1910440zoY = EnumC1910440zoY.SHARE_PANEL;
                        str = "share_panel";
                    } else {
                        enumC1910440zoY = EnumC1910440zoY.LONG_PRESS_PANEL;
                        str = "long_press_panel";
                    }
                    C0ZE7 c0ze7 = new C0ZE7(C724240Sb0.LJI(sharePanelContactRootAssem));
                    c0ze7.LIZIZ(enumC1910440zoY);
                    C1362270lYP c1362270lYPIp3 = sharePanelContactRootAssem.ip();
                    if (c1362270lYPIp3 == null || (str2 = c1362270lYPIp3.LLILLJJLI) == null) {
                        str2 = "";
                    }
                    c0ze7.LIZLLL = str2;
                    c0ze7.LJFF = str;
                    return c0ze7;
                }
            });
            C1554960qZC.LIZ(C1558520qew.LJIIL(this), c1362120lYA, C1362120lYA.class, "source_default_key");
            ShareContactListViewModel shareContactListViewModelHp = hp();
            C1361720lXW c1361720lXW = (C1361720lXW) this.LLJJJIL.getValue();
            shareContactListViewModelHp.LLILLJJLI = c1362120lYA;
            Bundle bundle2 = sharePackage2.extras;
            if (bundle2 != null) {
                C786410Ut5.LJJJI("position", "panel", bundle2);
            }
            shareContactListViewModelHp.LLILZLL = c1361720lXW;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null) {
            SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel = (SharePanelPreloadSortedListViewModel) ViewModelProviders.of(activity).get(SharePanelPreloadSortedListViewModel.class);
            C1362270lYP c1362270lYPIp3 = ip();
            if (c1362270lYPIp3 == null || (sharePackage = c1362270lYPIp3.LL) == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("panel_source")) == null) {
                string = "";
            }
            sharePanelPreloadSortedListViewModel.vQ2(string, new AwS600S0100000_21(this, 235));
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility
    public final void Oy1(InterfaceC1361730lXX interfaceC1361730lXX) {
        OnClickHandler onClickHandler = (OnClickHandler) this.LLJJJJ.getValue();
        if (onClickHandler != null) {
            onClickHandler.Oy1(interfaceC1361730lXX);
        }
    }

    @Override // X.InterfaceC1370690llz
    public final void Pe(int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ((Number) this.LLJJJ.getValue()).intValue() + i;
            } else {
                layoutParams = null;
            }
            C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, layoutParams);
        }
    }

    @Override // X.InterfaceC1370690llz
    public final void k3(int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        if (viewOnAttachStateChangeListenerC20604515jv.getVisibility() == 0 && viewOnAttachStateChangeListenerC20604515jv.getMeasuredHeight() == 0) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS32S0101000_21(i, this, 6));
            return;
        }
        int measuredHeight = viewOnAttachStateChangeListenerC20604515jv.getMeasuredHeight() + i;
        ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
        layoutParams.height = measuredHeight;
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, layoutParams);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        RecyclerView.RecycledViewPool recycledViewPool;
        LinearLayoutManager linearLayoutManager;
        C1362230lYL c1362230lYL;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int recycledViewCount;
        C1362270lYP c1362270lYPIp;
        SharePackage sharePackage;
        InterfaceC1362260lYO interfaceC1362260lYO;
        SkeletonSharePanelFragment skeletonSharePanelFragment;
        C1371590lnR c1371590lnR;
        C1362230lYL c1362230lYL2;
        LinearLayout.LayoutParams layoutParams;
        int i;
        int i2;
        C1371590lnR c1371590lnR2;
        C1362230lYL c1362230lYL3;
        int iIntValue;
        Integer num;
        C1371590lnR c1371590lnR3;
        SharePackage sharePackage2;
        Fragment fragmentLJI;
        C19EG activity;
        Configuration configuration;
        Integer numValueOf;
        super.onViewCreated(view);
        C1362270lYP c1362270lYPIp2 = ip();
        SharePackage sharePackage3 = null;
        if (c1362270lYPIp2 != null && (sharePackage2 = c1362270lYPIp2.LL) != null && C1250860iei.LIZ(sharePackage2) && (C724240Sb0.LJI(this) instanceof SkeletonSharePanelFragment) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (activity = fragmentLJI.getActivity()) != null) {
            SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel = (SharePanelPreloadSortedListViewModel) ViewModelProviders.of(activity).get(SharePanelPreloadSortedListViewModel.class);
            sharePanelPreloadSortedListViewModel.getClass();
            Resources resources = activity.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null && (numValueOf = Integer.valueOf(configuration.uiMode & 48)) != null) {
                Integer num2 = sharePanelPreloadSortedListViewModel.LLILZIL;
                if (num2 != null && !Intrinsics.LJFF(num2, numValueOf)) {
                    sharePanelPreloadSortedListViewModel.LLILZ.clear();
                }
                sharePanelPreloadSortedListViewModel.LLILZIL = numValueOf;
            }
            recycledViewPool = sharePanelPreloadSortedListViewModel.LLILZ;
        } else {
            recycledViewPool = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.tx2);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        int iIntValue2 = 4;
        if (kp()) {
            C1362270lYP c1362270lYPIp3 = ip();
            if (c1362270lYPIp3 != null && (c1371590lnR3 = c1362270lYPIp3.LLILZ) != null) {
                c1362230lYL3 = c1371590lnR3.LJJLIIIJILLIZJL;
            } else {
                c1362230lYL3 = null;
            }
            Context context = getContext();
            if (c1362230lYL3 != null && (num = c1362230lYL3.LJIJI) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 4;
            }
            linearLayoutManager = new GridLayoutManager(iIntValue, 1, context, false);
            linearLayoutManager.mRecycleChildrenOnDetach = true;
        } else {
            linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            linearLayoutManager.mRecycleChildrenOnDetach = true;
        }
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
        viewOnAttachStateChangeListenerC20604515jv.setNestedScrollingEnabled(kp());
        C1362270lYP c1362270lYPIp4 = ip();
        if (c1362270lYPIp4 != null && (c1371590lnR2 = c1362270lYPIp4.LLILZ) != null) {
            c1362230lYL = c1371590lnR2.LJJLIIIJILLIZJL;
        } else {
            c1362230lYL = null;
        }
        if (kp()) {
            if (c1362230lYL != null) {
                Integer num3 = c1362230lYL.LJIJI;
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                }
                i = c1362230lYL.LJIJJ;
                i2 = c1362230lYL.LJIJJLI;
            } else {
                i = 0;
                i2 = 0;
            }
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DX3(iIntValue2, i, i2));
        } else {
            if (c1362230lYL != null) {
                iLIZIZ = c1362230lYL.LJIIIIZZ;
                iLIZIZ2 = c1362230lYL.LJIIIZ;
                iLIZIZ3 = c1362230lYL.LJIIJ;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
            }
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C424780GlA(iLIZIZ, iLIZIZ2, iLIZIZ3));
        }
        C1362270lYP c1362270lYPIp5 = ip();
        if (c1362270lYPIp5 != null && (c1371590lnR = c1362270lYPIp5.LLILZ) != null && (c1362230lYL2 = c1371590lnR.LJJLIIIJILLIZJL) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.height = c1362230lYL2.LIZIZ;
                layoutParams.bottomMargin = c1362230lYL2.LIZLLL;
                layoutParams.topMargin = c1362230lYL2.LIZJ;
            }
            Integer num4 = c1362230lYL2.LJ;
            if (num4 != null) {
                C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jv, c1362230lYL2.LJI, Integer.valueOf(num4.intValue()), c1362230lYL2.LJII, c1362230lYL2.LJFF, 16);
            }
        }
        List list = (List) ((C1361720lXW) this.LLJJJIL.getValue()).LIZIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((IContactListProtocol) obj).enable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IContactListProtocol) it2.next()).getWithCell());
        }
        Class[] clsArr = (Class[]) arrayList2.toArray(new Class[0]);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        int iLJIIJJI = viewOnAttachStateChangeListenerC20604515jv.LJIIJJI(C1362370lYZ.class, null);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LJIIJ = false;
        c20603715jn.LIZ = 0;
        c20603715jn.LIZJ = false;
        c20603715jn.LJIJI = true;
        if (recycledViewPool != null) {
            recycledViewCount = recycledViewPool.getRecycledViewCount(iLJIIJJI);
        } else {
            recycledViewCount = 0;
        }
        if (recycledViewCount < 7) {
            c20603715jn.LJI = true;
            C13DA c13da = new C13DA();
            c13da.put(SharePanelHeadPowerCell.class, 7);
            c20603715jn.LJIIIIZZ = new OptimizeAbility(0, true, c13da.build());
        }
        viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
        if (recycledViewPool != null) {
            recycledViewPool.setMaxRecycledViews(iLJIIJJI, 10);
            viewOnAttachStateChangeListenerC20604515jv.setRecycledViewPool(recycledViewPool);
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
        this.LLJJI = viewOnAttachStateChangeListenerC20604515jv;
        if (kp()) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if ((fragmentLJI2 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment = (SkeletonSharePanelFragment) fragmentLJI2) != null) {
                skeletonSharePanelFragment.NS(this);
            }
        }
        if (((Boolean) C2277621ECy.LIZLLL.getValue()).booleanValue()) {
            C736680Sv4.LJIIIIZZ(this, hp(), C1362250lYN.LL, null, new AwS635S0100000_21(this, 115), 6);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1401940maO(this, 0));
        }
        if (!this.LLJJIII && (c1362270lYPIp = ip()) != null && (sharePackage = c1362270lYPIp.LL) != null && C1250860iei.LIZ(sharePackage) && (C724240Sb0.LJI(this) instanceof SkeletonSharePanelFragment)) {
            OnClickHandler onClickHandler = (OnClickHandler) this.LLJJJJ.getValue();
            if (onClickHandler != null) {
                C1362560lYs c1362560lYs = onClickHandler.LLILLJJLI;
                SharePackage sharePackage4 = c1362560lYs.LIZ.LIZIZ;
                if (sharePackage4 != null) {
                    C786410Ut5.LJJJI("button_type", "search_button", sharePackage4.extras);
                    sharePackage3 = sharePackage4;
                }
                LifecycleOwnerExtensionsKt.LIZ(c1362560lYs.LIZ.LIZ, new ARunnableS90S0200000_21(c1362560lYs, sharePackage3, 43));
            }
            C1362270lYP c1362270lYPIp6 = ip();
            if (c1362270lYPIp6 != null && (interfaceC1362260lYO = c1362270lYPIp6.LLILZLL) != null) {
                interfaceC1362260lYO.v1(new AwS565S0100000_21(this, 1211));
            }
            this.LLJJIII = true;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void vo(View view) {
        super.vo(view);
        C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, view, 49));
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility
    public final void fK0(View view, InterfaceC1361730lXX interfaceC1361730lXX) {
        ILazyLoadAbility iLazyLoadAbility;
        OnClickHandler onClickHandler = (OnClickHandler) this.LLJJJJ.getValue();
        if (onClickHandler != null) {
            onClickHandler.fK0(view, interfaceC1361730lXX);
        }
        SharePanelOperationDelayStrategy sharePanelOperationDelayStrategy = C1362240lYM.LIZ;
        int i = sharePanelOperationDelayStrategy.strategy;
        if (i != 1 && i != 2) {
            return;
        }
        if ((sharePanelOperationDelayStrategy.onlyOnce == 1 && !C1362240lYM.LIZJ) || (iLazyLoadAbility = (ILazyLoadAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ILazyLoadAbility.class, null)) == null) {
            return;
        }
        iLazyLoadAbility.TK(false);
    }
}
