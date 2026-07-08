package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.AbstractC2252651DEx;
import X.AnonymousClass0957;
import X.C099G;
import X.C0PEM;
import X.C1056340day;
import X.C1056350daz;
import X.C1069600dwM;
import X.C1069640dwQ;
import X.C1073970e3P;
import X.C1075800e6M;
import X.C1246150iX7;
import X.C1246160iX8;
import X.C1383370m6R;
import X.C1697830uHd;
import X.C1720106oR;
import X.C1DFB;
import X.C1E7L;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C286420BKm;
import X.C295680BiQ;
import X.C296060Bj2;
import X.C491101vh;
import X.EnumC1069580dwK;
import X.EnumC1070410dxf;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.appdiff.IFriendsAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsVM extends AssemViewModel<C1056350daz> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final FindFriendsPageVM LL;
    public final FFPMainFragmentVM LLILLJJLI;
    public final AbstractC2252651DEx LLILLL;
    public final C1073970e3P LLILZ;
    public C1075800e6M LLILZIL;

    public static List zQ2() {
        ArrayList arrayList = new ArrayList();
        boolean z = C296060Bj2.LIZIZ;
        if (z) {
            C1697830uHd.LIZ.getClass();
            if (C1697830uHd.LIZIZ() && C1697830uHd.LIZJ(C1383370m6R.LIZ) && C286420BKm.LIZIZ) {
                arrayList.add(EnumC1069580dwK.NEARBY);
            }
            if (C1246160iX8.LIZ()) {
                C1246150iX7.LIZ.getClass();
                if (!C1246150iX7.LIZ().disableFindSchoolFriends) {
                    arrayList.add(EnumC1069580dwK.SCHOOL_FRIENDS);
                }
            }
            arrayList.add(EnumC1069580dwK.QRCODE);
            arrayList.add(EnumC1069580dwK.INVITE_FRIENDS);
            C1069600dwM.LIZ.getClass();
            C1069600dwM.LIZ("find_friends_page", "show", null);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "find_friends_page");
            C20684815ws.LJIILLIIL("show_share_qr_code", c2344009Gk.LIZ);
        }
        if (!((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJFF().booleanValue()) {
            arrayList.add(EnumC1069580dwK.CONTACT_AUTH);
            vQ2(EnumC1070410dxf.FACEBOOK);
            if (SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB)) {
                arrayList.add(EnumC1069580dwK.FACEBOOK_AUTH);
            }
        }
        if (!z) {
            arrayList.add(EnumC1069580dwK.INVITE_FRIENDS);
        }
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1056350daz(0);
    }

    public final void xQ2() {
        Set<EnumC1070410dxf> setYQ2 = this.LL.yQ2();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh with: ");
        sbLIZ.append(setYQ2);
        C1720106oR.LJI("[ffp]_RecFriends", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS595S0100000_16((Set) setYQ2, (Set<? extends EnumC1070410dxf>) 133));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        yQ2(((Number) C295680BiQ.LIZ.getValue()).intValue() != 0);
        if (!C296060Bj2.LIZIZ) {
            setState(new AwS595S0100000_16(this, 2));
        }
        AssemViewModel.asyncSubscribe$default(this.LL, new C2217381BqS() { // from class: X.0dwN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069810dwh) obj).LLILLJJLI;
            }
        }, null, new AwS595S0100000_16(this, 3), null, new AwS595S0100000_16(this, 5), 10, null);
        AssemViewModel.asyncSubscribe$default(this.LL, new C2217381BqS() { // from class: X.0dwP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069810dwh) obj).LLILLL;
            }
        }, null, new AwS595S0100000_16(this, 6), null, new AwS595S0100000_16(this, 8), 10, null);
    }

    public RecFriendsVM(FindFriendsPageVM findFriendsPageVM) {
        FFPMainFragmentVM fFPMainFragmentVMXQ2 = findFriendsPageVM.xQ2();
        C1DFB c1dfb = C0PEM.LIZJ;
        C1073970e3P c1073970e3P = findFriendsPageVM.getState().LLILZIL;
        this.LL = findFriendsPageVM;
        this.LLILLJJLI = fFPMainFragmentVMXQ2;
        this.LLILLL = c1dfb;
        this.LLILZ = c1073970e3P;
        this.LLILZIL = new C1075800e6M(null, 7);
    }

    public static boolean vQ2(EnumC1070410dxf enumC1070410dxf) {
        if (enumC1070410dxf == EnumC1070410dxf.FACEBOOK) {
            IFriendsAppDiffProtocol.LIZ.getClass();
            C1069640dwQ.LIZIZ.getValue().LIZ();
            return true;
        }
        return true;
    }

    public final void yQ2(boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecFriendsVM refreshUserCard with removeSyncContact as ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(getAssemVMScope(), this.LLILLL, null, new C1056340day(this, z, null), 2);
    }

    public final List<AnonymousClass0957<?>> wQ2(FindFriendsPageVM findFriendsPageVM, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            C099G c099g = findFriendsPageVM.LLJI;
            if (c099g != null) {
                arrayList.add(c099g);
            } else {
                EnumC1070410dxf enumC1070410dxf = EnumC1070410dxf.CONTACT;
                if (enumC1070410dxf.isGrant() && (findFriendsPageVM.getState().LLILLJJLI instanceof C491101vh)) {
                    this.LL.UA0(enumC1070410dxf, "");
                }
            }
        }
        EnumC1070410dxf enumC1070410dxf2 = EnumC1070410dxf.FACEBOOK;
        vQ2(enumC1070410dxf2);
        C099G c099g2 = findFriendsPageVM.LLJ;
        if (c099g2 != null) {
            arrayList.add(c099g2);
        } else if (SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB) && enumC1070410dxf2.isGrant() && (findFriendsPageVM.getState().LLILLL instanceof C491101vh)) {
            this.LL.UA0(enumC1070410dxf2, "");
            return arrayList;
        }
        return arrayList;
    }
}
