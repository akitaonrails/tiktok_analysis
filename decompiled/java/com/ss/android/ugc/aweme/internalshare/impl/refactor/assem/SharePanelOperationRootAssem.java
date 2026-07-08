package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1362230lYL;
import X.C1362270lYP;
import X.C1370370llT;
import X.C1371590lnR;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C673150Qan;
import X.C687700QyG;
import X.C723580SZw;
import X.C723830SaL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1362600lYw;
import X.InterfaceC1370540llk;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelOperationRootAssem extends ReusedUISlotAssem<SharePanelOperationRootAssem> implements IShareCallbackAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJL;
    public InterfaceC1362600lYw LLJLIL;
    public boolean LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelOperationRootAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SharePanelOperationRootAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 490), AFwS259S0000000_21.get$arr$(179), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.crw;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{OperationAssemScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(OperationAssemScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(OperationAssemScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1973353692) {
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

    public final ShareContactListViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (ShareContactListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1362270lYP c1362270lYP = (C1362270lYP) this.LLJJLIIIJLLLLLLLZ.getValue();
        this.LLJLIL = c1362270lYP != null ? c1362270lYP.LLILZIL : null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        SharePackage sharePackage;
        Context context;
        C1371590lnR c1371590lnR;
        boolean z;
        BaseSharePackage baseSharePackage;
        C1362270lYP c1362270lYP;
        C1371590lnR c1371590lnR2;
        C1362230lYL c1362230lYL;
        InterfaceC1370540llk interfaceC1370540llk;
        int iIntValue;
        int i;
        int iIntValue2;
        SharePackage sharePackage2;
        C1362230lYL c1362230lYL2;
        C1362270lYP c1362270lYP2 = (C1362270lYP) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c1362270lYP2 != null && (sharePackage = c1362270lYP2.LL) != null && (context = view.getContext()) != null) {
            C1362270lYP c1362270lYP3 = (C1362270lYP) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (c1362270lYP3 != null) {
                c1371590lnR = c1362270lYP3.LLILZ;
            } else {
                c1371590lnR = null;
            }
            View viewFindViewById = view.findViewById(R.id.ne1);
            if (viewFindViewById != null) {
                Bundle bundle = sharePackage.extras;
                if (bundle != null) {
                    z = bundle.getBoolean("key_force_ui_sheet_flat_background");
                } else {
                    z = false;
                }
                if (!z) {
                    if (c1371590lnR != null && (c1362230lYL2 = c1371590lnR.LJJLIIIJILLIZJL) != null && c1362230lYL2.LJIILJJIL) {
                        viewFindViewById.setBackgroundResource(R.drawable.cab);
                    } else {
                        viewFindViewById.setBackgroundResource(R.drawable.caa);
                    }
                } else {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
                    viewFindViewById.setBackground(c384050F3z.LIZ(context));
                }
                Bundle bundle2 = sharePackage.extras;
                if (bundle2 != null && bundle2.getBoolean("key_force_operation_layout_divider") && (view instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    View view2 = new View(context);
                    C1362270lYP c1362270lYP4 = (C1362270lYP) this.LLJJLIIIJLLLLLLLZ.getValue();
                    if (c1362270lYP4 != null && (sharePackage2 = c1362270lYP4.LL) != null && sharePackage2.LJIILL()) {
                        i = R.attr.a02;
                    } else {
                        i = R.attr.ng;
                    }
                    Integer numLIZJ = C1308910kAL.LIZJ(i, context);
                    if (numLIZJ != null) {
                        iIntValue2 = numLIZJ.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    view2.setBackgroundColor(iIntValue2);
                    viewGroup.addView(view2, 0, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 48));
                }
                Bundle bundle3 = sharePackage.extras;
                if (bundle3 != null && bundle3.getBoolean("key_force_operation_layout_background")) {
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c3, context);
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    view.setBackgroundColor(iIntValue);
                }
                View viewFindViewById2 = view.findViewById(R.id.opq);
                View viewFindViewById3 = view.findViewById(R.id.opr);
                if (viewFindViewById2 != null && viewFindViewById3 != null && (interfaceC1370540llk = C1370370llT.LJII) != null) {
                    interfaceC1370540llk.LIZLLL(sharePackage.LJFF(), viewFindViewById2, viewFindViewById3, sharePackage.LJIJJ());
                }
                if (c1371590lnR != null && (baseSharePackage = c1371590lnR.LJIJJ) != null && baseSharePackage.LJIILL() && (c1362270lYP = (C1362270lYP) this.LLJJLIIIJLLLLLLLZ.getValue()) != null && (c1371590lnR2 = c1362270lYP.LLILZ) != null && (c1362230lYL = c1371590lnR2.LJJLIIIJILLIZJL) != null) {
                    if (c1362230lYL.LJIIL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) {
                        ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                        C786410Ut5.W5(viewFindViewById3, layoutParams);
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                        C786410Ut5.W5(viewFindViewById3, layoutParams2);
                    }
                }
            }
        }
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 256));
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.06VH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1362190lYH) obj).LLILLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(61), 6);
    }
}
