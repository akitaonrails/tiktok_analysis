package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C01GW;
import X.C1362190lYH;
import X.C1362270lYP;
import X.C1362630lYz;
import X.C1368890lj5;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1575980r76;
import X.C1599690rjL;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1362600lYw;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelSendButtonAssem extends UIContentAssem implements ISendAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public int LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelSendButtonAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SharePanelSendButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 647), AFwS259S0000000_21.get$arr$(180), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 646));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 947145260) {
            return null;
        }
        return this;
    }

    public final void Go() {
        int iYQ2;
        Resources resources;
        String quantityString;
        Context context;
        Activity activityLIZ;
        Activity activityLIZ2;
        C1362630lYz.LIZ.getClass();
        C1362630lYz.LIZIZ();
        C1362270lYP c1362270lYPJo = Jo();
        InterfaceC1362600lYw interfaceC1362600lYw = c1362270lYPJo != null ? c1362270lYPJo.LLILZIL : null;
        SharePackage sharePackageNo = No();
        if (sharePackageNo == null || (interfaceC1362600lYw != null && interfaceC1362600lYw.LJIIIIZZ(sharePackageNo))) {
            C1362190lYH state = So().getState();
            if (state.LLIZ.length() > 6000) {
                Context context2 = getContext();
                if (context2 == null || (activityLIZ2 = C1388190mED.LIZ(context2)) == null) {
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ2);
                c1389890mGx.LJIIIZ(2131835733);
                c1389890mGx.LJIIJJI();
                return;
            }
            ArrayList arrayList = new ArrayList(state.LLILLL);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((IMContact) it2.next()).displayPosition));
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            ICreateGroupAbility iCreateGroupAbility = (ICreateGroupAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICreateGroupAbility.class, null);
            if (iCreateGroupAbility != null) {
                if (iCreateGroupAbility.eo()) {
                    String string = UUID.randomUUID().toString();
                    if (sharePackageNo != null) {
                        String str = state.LLIZ;
                        if (interfaceC1362600lYw != null) {
                            interfaceC1362600lYw.LJIILIIL();
                        }
                        sharePackageNo.extras.putBoolean("is_create_group_and_share", true);
                        C786410Ut5.LJJJI("rank_length_when_creating_new_group", String.valueOf(arrayList.size()), sharePackageNo.extras);
                        C786410Ut5.LJJJI("rank_num_when_creating_new_group", strLJJLIIIJ, sharePackageNo.extras);
                        IMSharePanelApi.LIZ.getClass();
                        C1599690rjL.LIZ().getShareService().LJJJJZI(arrayList, str, sharePackageNo, null, null, string, null, interfaceC1362600lYw, null);
                        return;
                    }
                    return;
                }
                if (iCreateGroupAbility.isChecked()) {
                    Boolean boolValueOf = Boolean.valueOf(iCreateGroupAbility.Yq1(new AwS230S0300000_21(this, iCreateGroupAbility, sharePackageNo, 6)));
                    if (boolValueOf.booleanValue()) {
                        boolValueOf.booleanValue();
                        C197039127h c197039127hLo = Lo();
                        if (c197039127hLo != null) {
                            c197039127hLo.setLoading(true);
                        }
                        C197039127h c197039127hLo2 = Lo();
                        if (c197039127hLo2 != null) {
                            c197039127hLo2.setBackgroundResource(R.drawable.c_q);
                        }
                        iCreateGroupAbility.TM1(true);
                        return;
                    }
                    return;
                }
            }
            ICreateGroupAbility iCreateGroupAbility2 = (ICreateGroupAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICreateGroupAbility.class, null);
            if ((iCreateGroupAbility2 != null && (iCreateGroupAbility2.isChecked() || iCreateGroupAbility2.eo())) || state.LLILLL.size() <= (iYQ2 = So().yQ2())) {
                Ho(new ArrayList(arrayList));
                return;
            }
            Context context3 = getContext();
            if (context3 == null || (resources = context3.getResources()) == null || (quantityString = resources.getQuantityString(2131755276, iYQ2, Integer.valueOf(iYQ2))) == null || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
            c1389890mGx2.LJIIJ(quantityString);
            c1389890mGx2.LJIIJJI();
        }
    }

    public final C1362270lYP Jo() {
        return (C1362270lYP) this.LLIZLLLIL.getValue();
    }

    public final C197039127h Lo() {
        return (C197039127h) this.LLJI.getValue();
    }

    public final ShareContactListViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (ShareContactListViewModel) assemVMLazy.getValue();
    }

    public final SharePackage No() {
        C1362270lYP c1362270lYPJo = Jo();
        if (c1362270lYPJo != null) {
            return c1362270lYPJo.LL;
        }
        return null;
    }

    public final void Vo() {
        String strOo;
        int size = So().getState().LLILLL.size();
        ICreateGroupAbility iCreateGroupAbility = (ICreateGroupAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICreateGroupAbility.class, null);
        C197039127h c197039127hLo = Lo();
        if (c197039127hLo != null) {
            if (C1575980r76.LIZLLL(iCreateGroupAbility != null ? Boolean.valueOf(iCreateGroupAbility.eo()) : null)) {
                strOo = Oo(2131835413);
            } else if (size <= 1) {
                strOo = Oo(R.string.sxo);
            } else {
                strOo = C1575980r76.LIZLLL(iCreateGroupAbility != null ? Boolean.valueOf(iCreateGroupAbility.isChecked()) : null) ? Oo(2131835372) : Oo(2131832048);
            }
            c197039127hLo.setText(strOo);
        }
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ISendAbility
    public final void nE() {
        So().setState(new AwS34S0010000_21(8));
        Go();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.tako.ITakoService] */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r32) {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelSendButtonAssem.Ho(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ISendAbility
    public final void N9(boolean z) {
        So().setState(new AwS34S0010000_21(z, 6));
        Vo();
    }

    public final String Oo(int i) {
        String string;
        String strLIZ = C1368890lj5.LIZ(i);
        if (strLIZ == null) {
            Context context = getContext();
            if (context == null || (string = context.getString(i)) == null) {
                return "";
            }
            return string;
        }
        return strLIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127hLo = Lo();
        if (c197039127hLo != null) {
            C1368890lj5.LIZIZ(c197039127hLo, R.string.sxo);
        }
        C197039127h c197039127hLo2 = Lo();
        if (c197039127hLo2 != null) {
            C786410Ut5.U8(c197039127hLo2, new ACListenerS155S0100000_21(this, 122));
        }
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.06VI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1362190lYH) obj).LLILLL;
            }
        }, null, new AwS635S0100000_21(this, 112), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0lYq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1362190lYH) obj).LLILZIL);
            }
        }, null, new AwS635S0100000_21(this, 113), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0lYp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1362190lYH) obj).LLIZLLLIL;
            }
        }, null, new AwS635S0100000_21(this, 114), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0lYR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1362190lYH) obj).LLILZLL);
            }
        }, null, new AwS635S0100000_21(this, 116), 6);
    }
}
