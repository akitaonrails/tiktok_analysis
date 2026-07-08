package com.bytedance.android.livesdk.moderator;

import X.C01GW;
import X.C036E;
import X.C0IJT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C16FZ;
import X.C1826660xdQ;
import X.C20736316Cj;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C749600Tao;
import X.C749700Tay;
import X.C749730Tb1;
import X.C749750Tb3;
import X.C749790Tb7;
import X.C749800Tb8;
import X.C750740Tce;
import X.C758170Tod;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC749850TbD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.moderator.ModeratorListFragmentSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ModeratorListFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSooHELIOSLD0yPCo+ZwI8LCA+KDs8OgklOjsVOiQrJCo9PBYkLCon";
    public C749790Tb7 LLJLLL;
    public RecyclerView LLJZ;
    public C749600Tao LLL;
    public int LLJZIJLIL = 30;
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 324));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 323));
    public final C749700Tay LLLFFI = new InterfaceC749850TbD() { // from class: X.0Tay
        @Override // X.InterfaceC749850TbD
        public final void OO(long j, boolean z) {
        }

        @Override // X.InterfaceC749850TbD
        public final void Rk(Exception exc) {
        }

        @Override // X.InterfaceC749850TbD
        public final void Xa(int i) {
        }

        @Override // X.InterfaceC749850TbD
        public final void gx(int i, Exception exc) {
        }

        @Override // X.InterfaceC749850TbD
        public final void il(AdminUserBean adminUserBean, Exception exc) {
            String str;
            C749600Tao c749600Tao = null;
            if (exc == null && adminUserBean != null) {
                if (!C086I.LIZIZ(adminUserBean.LIZ)) {
                    this.LL.zS().LIZ();
                    ModeratorListFragmentSheet moderatorListFragmentSheet = this.LL;
                    moderatorListFragmentSheet.LLJZIJLIL = adminUserBean.mMaxCount;
                    DataChannel dataChannelLJ = C475510Ikn.LJ(moderatorListFragmentSheet);
                    if (dataChannelLJ != null) {
                        dataChannelLJ.SX0(C749570Tal.class, Integer.valueOf(this.LL.LLJZIJLIL));
                    }
                    C500260Jjc.LLFFF(this.LL.yS());
                    C749600Tao c749600Tao2 = this.LL.LLL;
                    if (c749600Tao2 != null) {
                        c749600Tao = c749600Tao2;
                    }
                    c749600Tao.setData(adminUserBean.LIZ);
                    ModeratorListFragmentSheet moderatorListFragmentSheet2 = this.LL;
                    List<C750740Tce> list = adminUserBean.LIZ;
                    moderatorListFragmentSheet2.getClass();
                    DataChannel dataChannelLJ2 = C475510Ikn.LJ(moderatorListFragmentSheet2);
                    if (dataChannelLJ2 != null) {
                        dataChannelLJ2.zW(ModeratorListChannel.class, list);
                    }
                    if (this.LL.BS() && this.LL.wS().size() > this.LL.LLJZIJLIL) {
                        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f144t5;
                        if (c20337914i1.LIZIZ().booleanValue()) {
                            ModeratorListFragmentSheet moderatorListFragmentSheet3 = this.LL;
                            int size = moderatorListFragmentSheet3.wS().size();
                            C782110Um9 c782110Um9 = new C782110Um9(moderatorListFragmentSheet3.getContext());
                            c782110Um9.LJIIZILJ(2131843033);
                            c782110Um9.LJII(2131843032);
                            c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843699), new InterfaceC743640TFa() { // from class: X.0Taz
                                @Override // X.InterfaceC743640TFa
                                public final void LIZ(LiveDialog liveDialog) {
                                    liveDialog.dismiss();
                                }
                            });
                            c782110Um9.LJIILLIIL = false;
                            C786410Ut5.E4(c782110Um9.LIZ());
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_page_first_popup");
                            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(moderatorListFragmentSheet3));
                            if (C500260Jjc.LJJIJLIJ()) {
                                str = "live_take_page";
                            } else {
                                str = "live_take_detail";
                            }
                            c474500IjALIZ.LJJII(str, "event_page");
                            c474500IjALIZ.LJJII(Integer.valueOf(size), "moderator_number");
                            c474500IjALIZ.LIZ();
                            c20337914i1.LJFF(Boolean.FALSE);
                        }
                    }
                    ModeratorListFragmentSheet moderatorListFragmentSheet4 = this.LL;
                    moderatorListFragmentSheet4.ES(moderatorListFragmentSheet4.wS().size());
                    return;
                }
                this.LL.zS().LIZIZ();
                ModeratorListFragmentSheet moderatorListFragmentSheet5 = this.LL;
                ArrayList arrayList = new ArrayList();
                moderatorListFragmentSheet5.getClass();
                DataChannel dataChannelLJ3 = C475510Ikn.LJ(moderatorListFragmentSheet5);
                if (dataChannelLJ3 != null) {
                    dataChannelLJ3.zW(ModeratorListChannel.class, arrayList);
                }
                this.LL.ES(0);
                return;
            }
            C749600Tao c749600Tao3 = this.LL.LLL;
            if (c749600Tao3 != null) {
                c749600Tao = c749600Tao3;
            }
            if (c749600Tao.getItemCount() == 0) {
                this.LL.zS().LIZJ();
            }
            C501540Jlg.LIZJ(this.LL.getContext(), exc);
        }
    };

    public final boolean BS() {
        return ((Boolean) this.LLLFF.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842824));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (BS()) {
            arrayList2.add(new C758170Tod(R.attr.e82, new ACListenerS147S0100000_12(this, 220)));
            arrayList2.add(new C1826660xdQ(R.drawable.eup, new ACListenerS147S0100000_12(this, 221)));
        }
        c1119170fEJ.LJFF = arrayList2;
        return c1119170fEJ;
    }

    public final void refresh() {
        this.LLL = new C749600Tao(((Number) this.LLLF.getValue()).longValue(), C475510Ikn.LJ(this), "moderator_panel", BS(), false);
        yS().setLayoutManager(new SSLinearLayoutManager(getContext(), 1));
        RecyclerView recyclerViewYS = yS();
        C749600Tao c749600Tao = this.LLL;
        if (c749600Tao == null) {
            c749600Tao = null;
        }
        recyclerViewYS.setAdapter(c749600Tao);
        uS();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_admin_list_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        Context contextLJJIJIIJI = C520010KaN.LJJIJIIJI(this, false);
        if (contextLJJIJIIJI == null && (contextLJJIJIIJI = getActivity()) == null) {
            return;
        }
        C786410Ut5.LLL(zS(), 0);
        View viewSd = C786410Ut5.Sd(R.layout.fyf, C786410Ut5.ne(contextLJJIJIIJI), null);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 443), viewSd);
        C749750Tb3 c749750Tb3 = new C749750Tb3(contextLJJIJIIJI);
        c749750Tb3.LIZIZ(C20736316Cj.LJ(R.attr.dy0, contextLJJIJIIJI));
        c749750Tb3.LIZJ(getString(2131843141));
        c749750Tb3.LIZLLL(getString(2131843851));
        if (BS() && !C500260Jjc.LJJJIL(C475510Ikn.LJ(this))) {
            c749750Tb3.LIZ(getString(2131843847), new AwS556S0100000_12(this, 974));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c749750Tb3);
        c749750Tb3.setLayoutParams(layoutParams);
        C749790Tb7 c749790Tb7ZS = zS();
        C749800Tb8 c749800Tb8LIZ = C749800Tb8.LIZ(contextLJJIJIIJI);
        c749800Tb8LIZ.LIZJ = c749750Tb3;
        c749800Tb8LIZ.LIZLLL = viewSd;
        c749800Tb8LIZ.LIZIZ = new C16FZ(contextLJJIJIIJI, null);
        c749790Tb7ZS.setBuilder(c749800Tb8LIZ);
    }

    public final RecyclerView yS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqo) : null;
            this.LLJZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C749790Tb7 zS() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqq) : null;
            this.LLJLLL = (C749790Tb7) viewFindViewById;
        }
        return (C749790Tb7) viewFindViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
    }

    public final void uS() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                zS().LIZLLL();
                ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Sw0(this.LLLFFI, ((Number) this.LLLF.getValue()).longValue());
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LJFF(2131843092, getContext());
    }

    public final List<C750740Tce> wS() {
        List<C750740Tce> list;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        return (dataChannelLJ == null || (list = (List) dataChannelLJ.gg0(ModeratorListChannel.class)) == null) ? new ArrayList() : list;
    }

    public final void ES(int i) {
        if (BS()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_page_show");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
            c474500IjALIZ.LJJII(Integer.valueOf(i), "moderator_number");
            c474500IjALIZ.LIZ();
        }
    }

    public final void FS(boolean z) {
        String str;
        this.LLJJIJIL.LJIIIZ(AddModeratorFragmentSheet.class, "add_moderator", null, null);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_moderator_click");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        if (z) {
            str = "add_icon";
        } else {
            str = "add_button";
        }
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    public final void onEvent(C749730Tb1 c749730Tb1) {
        if (c749730Tb1 == null) {
            return;
        }
        List<C750740Tce> listWS = wS();
        ArrayList arrayList = new ArrayList();
        for (C750740Tce c750740Tce : listWS) {
            if (c750740Tce.LIZ != c749730Tb1.LIZIZ) {
                arrayList.add(c750740Tce);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(ModeratorListChannel.class, arrayList2);
        }
        if (getView() != null && !c749730Tb1.LIZ) {
            C749600Tao c749600Tao = this.LLL;
            C749600Tao c749600Tao2 = null;
            if (c749600Tao == null) {
                c749600Tao = null;
            }
            c749600Tao.LLLI(c749730Tb1.LIZIZ);
            C749600Tao c749600Tao3 = this.LLL;
            if (c749600Tao3 != null) {
                c749600Tao2 = c749600Tao3;
            }
            if (c749600Tao2.getItemCount() == 0) {
                C500260Jjc.LJIILIIL(yS());
                zS().LIZIZ();
            }
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/moderator/ModeratorListFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUk9dYxuQJJwtbar1anvEdfTEGddU8sc0Pjp", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            C500260Jjc.LJIILIIL(yS());
            refresh();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        refresh();
        C784440Upu.LIZ().LIZJ(this, C749730Tb1.class).LIZJ(new AfS181S0100000_12(this, 114));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g8q, viewGroup, false);
    }
}
