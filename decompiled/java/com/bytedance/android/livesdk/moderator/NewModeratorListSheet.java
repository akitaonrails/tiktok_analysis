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
import X.C13LP;
import X.C15438062q;
import X.C16FZ;
import X.C1826660xdQ;
import X.C20736316Cj;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C749610Tap;
import X.C749670Tav;
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
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.moderator.NewModeratorListSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import tikcast.api.anchor.AnchorSuggestedModerator;

/* JADX INFO: loaded from: classes13.dex */
public final class NewModeratorListSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSHELIOSooLD0yPCo+ZwE2PwgjLSohKTEjOwM6OzEfISo2PA==";
    public C749790Tb7 LLJLLL;
    public RecyclerView LLJZ;
    public C749610Tap LLL;
    public int LLJZIJLIL = 30;
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 334));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 333));
    public final C749670Tav LLLFFI = new InterfaceC749850TbD() { // from class: X.0Tav
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
        @Override // X.InterfaceC749850TbD
        public final void il(AdminUserBean adminUserBean, Exception exc) {
            Integer numValueOf;
            Integer numValueOf2;
            String str;
            C750740Tce c750740Tce;
            List<AnchorSuggestedModerator> list;
            String message = null;
            ArrayList arrayList = null;
            if (exc == null) {
                if (adminUserBean != null) {
                    if ((!((ArrayList) adminUserBean.LIZ).isEmpty()) || ((list = adminUserBean.LIZIZ) != null && (!list.isEmpty()))) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("moderator size: ");
                        List<C750740Tce> list2 = adminUserBean.LIZ;
                        if (list2 != null) {
                            numValueOf = Integer.valueOf(((ArrayList) list2).size());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", suggest size: ");
                        List<AnchorSuggestedModerator> list3 = adminUserBean.LIZIZ;
                        if (list3 != null) {
                            numValueOf2 = Integer.valueOf(list3.size());
                        } else {
                            numValueOf2 = null;
                        }
                        sbLIZ.append(numValueOf2);
                        C20441214yg.LIZIZ("AdminMonitor#error", C2188811AlT.LIZIZ(sbLIZ));
                        this.LL.zS().LIZ();
                        NewModeratorListSheet newModeratorListSheet = this.LL;
                        newModeratorListSheet.LLJZIJLIL = adminUserBean.mMaxCount;
                        DataChannel dataChannelLJ = C475510Ikn.LJ(newModeratorListSheet);
                        if (dataChannelLJ != null) {
                            dataChannelLJ.SX0(C749570Tal.class, Integer.valueOf(this.LL.LLJZIJLIL));
                        }
                        C500260Jjc.LLFFF(this.LL.yS());
                        C749610Tap c749610Tap = this.LL.LLL;
                        if (c749610Tap != null) {
                            List<C750740Tce> list4 = adminUserBean.LIZ;
                            List<AnchorSuggestedModerator> list5 = adminUserBean.LIZIZ;
                            if (list5 != null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list5, 10));
                                for (AnchorSuggestedModerator anchorSuggestedModerator : list5) {
                                    User user = anchorSuggestedModerator.userInfo;
                                    if (user != null) {
                                        c750740Tce = C750540TcK.LIZIZ(user);
                                        c750740Tce.LJIIJ = anchorSuggestedModerator.tag;
                                        c750740Tce.LJIIJJI = anchorSuggestedModerator.tagKey;
                                        c750740Tce.LJI = anchorSuggestedModerator.recentWatchStatus;
                                    } else {
                                        c750740Tce = new C750740Tce(0);
                                    }
                                    arrayList.add(c750740Tce);
                                }
                            }
                            c749610Tap.LLLFZ(list4, arrayList, false);
                        }
                        NewModeratorListSheet newModeratorListSheet2 = this.LL;
                        List<C750740Tce> list6 = adminUserBean.LIZ;
                        newModeratorListSheet2.getClass();
                        DataChannel dataChannelLJ2 = C475510Ikn.LJ(newModeratorListSheet2);
                        if (dataChannelLJ2 != null) {
                            dataChannelLJ2.zW(ModeratorListChannel.class, list6);
                        }
                        if (this.LL.BS() && this.LL.wS().size() > this.LL.LLJZIJLIL) {
                            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f144t5;
                            if (c20337914i1.LIZIZ().booleanValue()) {
                                NewModeratorListSheet newModeratorListSheet3 = this.LL;
                                int size = newModeratorListSheet3.wS().size();
                                C782110Um9 c782110Um9 = new C782110Um9(newModeratorListSheet3.getContext());
                                c782110Um9.LJIIZILJ(2131843033);
                                c782110Um9.LJII(2131843032);
                                c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843699), new InterfaceC743640TFa() { // from class: X.0Taw
                                    @Override // X.InterfaceC743640TFa
                                    public final void LIZ(LiveDialog liveDialog) {
                                        liveDialog.dismiss();
                                    }
                                });
                                c782110Um9.LJIILLIIL = false;
                                C786410Ut5.E4(c782110Um9.LIZ());
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_page_first_popup");
                                c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(newModeratorListSheet3));
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
                        NewModeratorListSheet newModeratorListSheet4 = this.LL;
                        int size2 = newModeratorListSheet4.wS().size();
                        List<C750740Tce> list7 = adminUserBean.LIZ;
                        List list8 = adminUserBean.LIZIZ;
                        if (list8 == null) {
                            list8 = C13BV.INSTANCE;
                        }
                        newModeratorListSheet4.FS(list7, list8, size2, true);
                        C20483915Dh c20483915Dh = this.LL.LLIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(C497740JfY.LJIJI(2131843033));
                        sbLIZ2.append('(');
                        sbLIZ2.append(((ArrayList) adminUserBean.LIZ).size());
                        sbLIZ2.append('/');
                        sbLIZ2.append(adminUserBean.mMaxCount);
                        sbLIZ2.append(')');
                        c20483915Dh.setTitle(C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    C20483915Dh c20483915Dh2 = this.LL.LLIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C497740JfY.LJIJI(2131843033));
                    sbLIZ3.append('(');
                    sbLIZ3.append(((ArrayList) adminUserBean.LIZ).size());
                    sbLIZ3.append('/');
                    sbLIZ3.append(adminUserBean.mMaxCount);
                    sbLIZ3.append(')');
                    c20483915Dh2.setTitle(C2188811AlT.LIZIZ(sbLIZ3));
                    this.LL.zS().LIZIZ();
                    NewModeratorListSheet newModeratorListSheet5 = this.LL;
                    ArrayList arrayList2 = new ArrayList();
                    newModeratorListSheet5.getClass();
                    DataChannel dataChannelLJ3 = C475510Ikn.LJ(newModeratorListSheet5);
                    if (dataChannelLJ3 != null) {
                        dataChannelLJ3.zW(ModeratorListChannel.class, arrayList2);
                    }
                    NewModeratorListSheet newModeratorListSheet6 = this.LL;
                    C13BV c13bv = C13BV.INSTANCE;
                    newModeratorListSheet6.FS(c13bv, c13bv, 0, true);
                    return;
                }
            } else {
                message = exc.getMessage();
            }
            C20441214yg.LIZIZ("AdminMonitor#error", message);
            C749610Tap c749610Tap2 = this.LL.LLL;
            if (c749610Tap2 == null || c749610Tap2.getItemCount() == 0) {
                this.LL.zS().LIZJ();
            }
            C501540Jlg.LIZJ(this.LL.getContext(), exc);
            NewModeratorListSheet newModeratorListSheet7 = this.LL;
            C13BV c13bv2 = C13BV.INSTANCE;
            newModeratorListSheet7.FS(c13bv2, c13bv2, -1, false);
        }
    };

    public final boolean BS() {
        return ((Boolean) this.LLLFF.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131843033));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (BS()) {
            arrayList2.add(new C1826660xdQ(R.drawable.eup, new ACListenerS147S0100000_12(this, 224)));
        }
        c1119170fEJ.LJFF = arrayList2;
        return c1119170fEJ;
    }

    public final void refresh() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        this.LLL = new C749610Tap(((Number) this.LLLF.getValue()).longValue(), C475510Ikn.LJ(this), "moderator_panel", BS());
        yS().setLayoutManager(new SSLinearLayoutManager(getContext(), 1));
        yS().setAdapter(this.LLL);
        uS();
        View view = getView();
        if (view != null && (viewGroup2 = (ViewGroup) view.findViewById(R.id.nza)) != null) {
            C786410Ut5.K7(viewGroup2, new ACListenerS147S0100000_12(this, 225));
        }
        View view2 = getView();
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.ae5)) != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS147S0100000_12(this, 226));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_admin_list_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        Context contextLJJIJIIJI = C520010KaN.LJJIJIIJI(this, false);
        if (contextLJJIJIIJI == null && (contextLJJIJIIJI = getActivity()) == null) {
            return;
        }
        C786410Ut5.LLL(zS(), 0);
        View viewSd = C786410Ut5.Sd(R.layout.fyf, C786410Ut5.ne(contextLJJIJIIJI), null);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 444), viewSd);
        C749750Tb3 c749750Tb3 = new C749750Tb3(contextLJJIJIIJI);
        c749750Tb3.LIZIZ(C20736316Cj.LJ(R.attr.dy0, contextLJJIJIIJI));
        c749750Tb3.LIZJ(getString(2131843141));
        c749750Tb3.LIZLLL(getString(2131843851));
        if (BS() && !C500260Jjc.LJJJIL(C475510Ikn.LJ(this))) {
            c749750Tb3.LIZ(getString(2131843847), new AwS556S0100000_12(this, 970));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c749750Tb3);
        c749750Tb3.setLayoutParams(layoutParams);
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.gp9, zS(), false);
        C749790Tb7 c749790Tb7ZS = zS();
        C749800Tb8 c749800Tb8LIZ = C749800Tb8.LIZ(contextLJJIJIIJI);
        c749800Tb8LIZ.LIZJ = viewTd;
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
                ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).AQ(this.LLLFFI, ((Number) this.LLLF.getValue()).longValue(), C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)));
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

    public final void ES(boolean z) {
        String str;
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
            C749610Tap c749610Tap = this.LLL;
            if (c749610Tap != null) {
                long j = c749730Tb1.LIZIZ;
                C750740Tce c750740Tce2 = null;
                for (C750740Tce c750740Tce3 : (ArrayList) c749610Tap.LLIZ) {
                    if (c750740Tce3.LIZ == j) {
                        c750740Tce2 = c750740Tce3;
                    }
                }
                if (c750740Tce2 != null) {
                    ((ArrayList) c749610Tap.LLIZ).remove(c750740Tce2);
                    ((ArrayList) c749610Tap.LLILZLL).remove(c750740Tce2);
                    c749610Tap.notifyDataSetChanged();
                }
            }
            C749610Tap c749610Tap2 = this.LLL;
            if (c749610Tap2 == null || c749610Tap2.getItemCount() == 0) {
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/moderator/NewModeratorListSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUo3ZqRzRYNt2CpXZIjdj821Izz7Aw==", null)));
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
        C784440Upu.LIZ().LIZJ(this, C749730Tb1.class).LIZJ(new AfS181S0100000_12(this, 115));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g8r, viewGroup, false);
    }

    public final void FS(List list, List list2, int i, boolean z) {
        String strLJJLIIIJ;
        Long lValueOf;
        if (BS()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_page_show");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
            int size = -1;
            if (!z) {
                i = -1;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "moderator_number");
            String strLJJLIIIJ2 = "";
            if (list.isEmpty()) {
                strLJJLIIIJ = "";
            } else {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((C750740Tce) it2.next()).LIZ));
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            }
            c474500IjALIZ.LJJII(strLJJLIIIJ, "moderator_id");
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    User user = ((AnchorSuggestedModerator) it3.next()).userInfo;
                    if (user != null) {
                        lValueOf = Long.valueOf(user.getId());
                    } else {
                        lValueOf = null;
                    }
                    arrayList2.add(lValueOf);
                }
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            }
            c474500IjALIZ.LJJII(strLJJLIIIJ2, "rec_user_id");
            if (z) {
                size = list2.size();
            }
            c474500IjALIZ.LJJII(Integer.valueOf(size), "rec_user_number");
            c474500IjALIZ.LIZ();
        }
    }
}
