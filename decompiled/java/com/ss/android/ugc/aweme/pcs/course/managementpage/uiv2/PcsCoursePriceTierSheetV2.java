package com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2;

import X.C0JHC;
import X.C11NZ;
import X.C11S5;
import X.C1220000hqw;
import X.C12KV;
import X.C1390410mHn;
import X.C13LE;
import X.C13LP;
import X.C1554960qZC;
import X.C1697506kn;
import X.C16F5;
import X.C1701940uOG;
import X.C1808280x9m;
import X.C197039127h;
import X.C19737012Ka;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C470590Icr;
import X.C480460Ism;
import X.C488550JDx;
import X.C489110JGb;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.chatroom.api.PriceTier;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.smb.ListSMBCoursePriceTiersResponse;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCoursePriceTierSheetV2 extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9JSQiKCHELIOSg2JSAiPT8yLyBiPCYlemscKjwQJzA+OioDOiwvLBs6LTcfISo2PBN+";
    public List<String> LLJLLL;
    public Long LLJZ;
    public final C736950SvV LLJZIJLIL = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(150), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public C0JHC LLL;
    public C19737012Ka LLLF;
    public ViewGroup LLLFF;
    public C197039127h LLLFFI;
    public C16F5 LLLFZ;
    public C1390410mHn LLLI;
    public ViewGroup LLLII;
    public ViewGroup LLLIIII;
    public ListSMBCoursePriceTiersResponse.Data LLLIIIIL;

    public final PriceTier wS() {
        List<PriceTier> list;
        try {
            C19737012Ka c19737012Ka = this.LLLF;
            if (c19737012Ka == null) {
                return null;
            }
            int index$tux_theme_release = ((C12KV) ListProtector.get(c19737012Ka.getColumnPickers$tux_theme_release(), 0)).getIndex$tux_theme_release();
            ListSMBCoursePriceTiersResponse.Data data = this.LLLIIIIL;
            if (data == null || (list = data.priceTierList) == null) {
                return null;
            }
            return (PriceTier) C13LP.LJJJLZIJ(index$tux_theme_release, list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void BS() {
        ((AssemViewModel) this.LLJZIJLIL.getValue()).setState(new AwS586S0100000_7(wS(), 439));
        ((PcsCourseManageVM) this.LLJZIJLIL.getValue()).FQ2(true);
        C489110JGb.LJI(uS(), "confirm", "click", wS());
        close(1);
    }

    public final C0JHC uS() {
        if (this.LLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLL = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLL;
    }

    public final void zS() {
        String str;
        Long l;
        C1390410mHn c1390410mHn = this.LLLI;
        if (c1390410mHn != null) {
            C500260Jjc.LLFFF(c1390410mHn);
            c1390410mHn.LIZJ();
        }
        ViewGroup viewGroup = this.LLLII;
        if (viewGroup != null) {
            C500260Jjc.LJIILLIIL(viewGroup);
        }
        ViewGroup viewGroup2 = this.LLLIIII;
        if (viewGroup2 != null) {
            C500260Jjc.LJIILIIL(viewGroup2);
        }
        C480460Ism.LIZ().getClass();
        IPcsCourseApi iPcsCourseApi = (IPcsCourseApi) C480460Ism.LIZLLL(IPcsCourseApi.class);
        C0JHC c0jhcUS = uS();
        C11NZ<C470590Icr<ListSMBCoursePriceTiersResponse.Data>> c11nzLoadCoursePriceTierList = iPcsCourseApi.loadCoursePriceTierList((c0jhcUS == null || (l = c0jhcUS.LLILLJJLI) == null) ? 0L : l.longValue());
        C0JHC c0jhcUS2 = uS();
        if (c0jhcUS2 == null || (str = c0jhcUS2.LLILLL) == null) {
            str = "";
        }
        C1808280x9m.LJFF(c11nzLoadCoursePriceTierList, str, "/smb/course/price_tier/list/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 114), new AfS176S0100000_7(this, 115));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(13.0f);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    public final void yS(boolean z) {
        C1390410mHn c1390410mHn = this.LLLI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLLI;
        if (c1390410mHn2 != null) {
            C500260Jjc.LJIILIIL(c1390410mHn2);
        }
        if (z) {
            ViewGroup viewGroup = this.LLLII;
            if (viewGroup != null) {
                C500260Jjc.LLFFF(viewGroup);
            }
            ViewGroup viewGroup2 = this.LLLIIII;
            if (viewGroup2 != null) {
                C500260Jjc.LJIILIIL(viewGroup2);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.LLLIIII;
        if (viewGroup3 != null) {
            C500260Jjc.LLFFF(viewGroup3);
        }
        ViewGroup viewGroup4 = this.LLLII;
        if (viewGroup4 == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(viewGroup4);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long lValueOf;
        super.onViewCreated(view, bundle);
        PriceTier priceTier = ((C488550JDx) ((AssemViewModel) this.LLJZIJLIL.getValue()).getState()).LLILZIL;
        C197039127h c197039127h = null;
        if (priceTier != null) {
            lValueOf = Long.valueOf(priceTier.priceTierGrade);
        } else {
            lValueOf = null;
        }
        this.LLJZ = lValueOf;
        this.LLLF = (C19737012Ka) view.findViewById(R.id.rtd);
        this.LLLI = (C1390410mHn) view.findViewById(R.id.nld);
        View viewFindViewById = view.findViewById(R.id.hbl);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 21), viewFindViewById);
        }
        this.LLLIIII = (ViewGroup) view.findViewById(R.id.hjv);
        this.LLLII = (ViewGroup) view.findViewById(R.id.eux);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.e1v);
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS142S0100000_7(this, 220));
        } else {
            viewGroup = null;
        }
        this.LLLFF = viewGroup;
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.tzb);
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(new AwS583S0100000_4(c197039127h2, 356));
            c197039127h2.setEnabled(false);
            C786410Ut5.U8(c197039127h2, new ACListenerS142S0100000_7(this, 221));
            c197039127h = c197039127h2;
        }
        this.LLLFFI = c197039127h;
        this.LLLFZ = (C16F5) view.findViewById(R.id.xj5);
        String strLJIJI = C497740JfY.LJIJI(2131855785);
        C1697506kn.LIZ(this.LLLFZ, strLJIJI, C497740JfY.LJIJJ(2131855784, 50, strLJIJI), 8, R.attr.ezq, R.attr.ezs, new AwS551S0100000_7(this, 662));
        zS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.dhb, viewGroup, false);
    }
}
