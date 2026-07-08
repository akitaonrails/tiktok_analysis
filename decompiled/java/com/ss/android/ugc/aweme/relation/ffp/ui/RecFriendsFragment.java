package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC1261460ivo;
import X.AbstractC1263540izA;
import X.AbstractC1263550izB;
import X.AbstractC1623806Xk;
import X.AbstractC1890380zIC;
import X.AbstractC1903730zdj;
import X.AbstractC2361009My;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C1056250dap;
import X.C1056290dat;
import X.C1069780dwe;
import X.C1073830e3B;
import X.C1073940e3M;
import X.C1075800e6M;
import X.C1261360ive;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262300ixA;
import X.C1262310ixB;
import X.C1262320ixC;
import X.C1262400ixK;
import X.C1262590ixd;
import X.C1262780ixw;
import X.C1262790ixx;
import X.C1262970iyF;
import X.C1263420iyy;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1720106oR;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2001407si;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C295680BiQ;
import X.C296060Bj2;
import X.C304890BxH;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C491001vg;
import X.C491101vh;
import X.C626160OhC;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1056240dao;
import X.EnumC1070410dxf;
import X.EnumC1262370ixH;
import X.InterfaceC1073860e3E;
import X.InterfaceC1261750iwH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS22S0201000_16;
import Y.AsS43S0100000_16;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.experiment.TriadRecMoreConfig;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsFragment extends FFPBaseFragment implements InterfaceC1261750iwH {
    public static final C1073830e3B LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nHELIOSISoiZyk1OGs5IGEBLSYKOyY2JiE/Dz0yLygpJzs=";
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public C1749280vcc LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public AbstractC1263550izB LLJILJIL;
    public C1069780dwe LLJILJILJ;
    public LinearLayout LLJILLL;
    public final C01GW LLJJ;
    public final int LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0e3B] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecFriendsFragment.class, "recFriendsVM", "getRecFriendsVM()Lcom/ss/android/ugc/aweme/relation/ffp/vm/RecFriendsVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0e3B
        };
        LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void cS() {
        C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0db0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1056350daz) obj).LL;
            }
        }, null, new AwS630S0100000_16(this, 29), 6);
        AssemViewModel.asyncSubscribe$default(gS(), new C2217381BqS() { // from class: X.0e37
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1056350daz) obj).LLILLJJLI;
            }
        }, null, new AwS595S0100000_16(this, 131), new AwS560S0100000_16(this, 508), new AwS595S0100000_16(this, 132), 2, null);
        C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0e38
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1056350daz) obj).LLILLJJLI;
            }
        }, null, new AwS630S0100000_16(this, 30), 6);
        if (C296060Bj2.LIZJ) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, gS(), new C2217381BqS() { // from class: X.0e39
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1056350daz) obj).LLILLL;
            }
        }, null, new AwS630S0100000_16(this, 28), 6);
    }

    public RecFriendsFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 505);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecFriendsVM.class);
        AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 507);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(318);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_162, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), awS560S0100000_16, aFwS252S0000000_16, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_162, awS560S0100000_16, aFwS252S0000000_16, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_162, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS560S0100000_16, aFwS252S0000000_16, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 504));
        this.LLJ = c01gwLIZIZ;
        this.LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 506));
        this.LLJJI = R.layout.c_j;
        this.LLJJIII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(243));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(244));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(242));
        InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) c01gwLIZIZ.getValue();
        if (interfaceC1073860e3E != null) {
            interfaceC1073860e3E.av(null);
        }
    }

    public final boolean dS() {
        return ((Boolean) this.LLJJIJI.getValue()).booleanValue();
    }

    public final RecFriendsVM gS() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (RecFriendsVM) assemVMLazy.getValue();
    }

    public final boolean hS() {
        return ((Boolean) this.LLJJIII.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC1263550izB abstractC1263550izB = this.LLJILJIL;
        if (abstractC1263550izB == null) {
            abstractC1263550izB = null;
        }
        ((C1262970iyF) abstractC1263550izB).ng(this);
        InterfaceC1261750iwH interfaceC1261750iwH = (InterfaceC1261750iwH) this.LLJ.getValue();
        if (interfaceC1261750iwH != null) {
            AbstractC1263550izB abstractC1263550izB2 = this.LLJILJIL;
            ((C1262970iyF) (abstractC1263550izB2 != null ? abstractC1263550izB2 : null)).ng(interfaceC1261750iwH);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ("friends_find_friends_page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJI("friends_find_friends_page", new AbstractC2361009My() { // from class: X.0e36
            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                return C2097908Jt.LIZJ(new Pair("enter_from", "friends_find_friends_page"));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        LinearLayoutManager linearLayoutManager;
        String strItemUniqueId;
        C1261650iw7 c1261650iw7;
        C1261650iw7 c1261650iw72;
        String nickname;
        C1261860iwS c1261860iwS;
        C1261860iwS c1261860iwS2;
        C1261650iw7 c1261650iw73;
        C1261860iwS c1261860iwS3;
        if (C304890BxH.LIZIZ()) {
            int i = 0;
            if (((TriadRecMoreConfig) C1263420iyy.LIZIZ.getValue()).withAutoScroll == 1 && (abstractC1261460ivo instanceof C1261360ive)) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJIJIL;
                String nickname2 = null;
                if (viewOnAttachStateChangeListenerC20604515jv == null) {
                    viewOnAttachStateChangeListenerC20604515jv = null;
                }
                C1261360ive c1261360ive = (C1261360ive) abstractC1261460ivo;
                RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    String strItemUniqueId2 = ((C1261860iwS) c1261360ive.LIZ).itemUniqueId();
                    for (InterfaceC1891350zJl interfaceC1891350zJl : viewOnAttachStateChangeListenerC20604515jv.getListItems()) {
                        if ((interfaceC1891350zJl instanceof C1261650iw7) && (c1261650iw73 = (C1261650iw7) interfaceC1891350zJl) != null && (c1261860iwS3 = c1261650iw73.LLILLJJLI) != null) {
                            strItemUniqueId = c1261860iwS3.itemUniqueId();
                        } else {
                            strItemUniqueId = null;
                        }
                        if (Intrinsics.LJFF(strItemUniqueId, strItemUniqueId2)) {
                            if (i > 0) {
                                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                                Object obj = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), iFindLastCompletelyVisibleItemPosition);
                                if (obj instanceof C1261650iw7) {
                                    c1261650iw7 = (C1261650iw7) obj;
                                } else {
                                    c1261650iw7 = null;
                                }
                                Object obj2 = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), i);
                                if (obj2 instanceof C1261650iw7) {
                                    c1261650iw72 = (C1261650iw7) obj2;
                                } else {
                                    c1261650iw72 = null;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AUTOSCROLL - rec more inserted, visibleItemIndex: ");
                                sbLIZ.append(iFindLastCompletelyVisibleItemPosition);
                                sbLIZ.append(", nickname ");
                                if (c1261650iw7 != null && (c1261860iwS2 = c1261650iw7.LLILLJJLI) != null) {
                                    nickname = c1261860iwS2.getNickname();
                                } else {
                                    nickname = null;
                                }
                                sbLIZ.append(nickname);
                                C1720106oR.LJI("[ffp]", C2188811AlT.LIZIZ(sbLIZ));
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("AUTOSCROLL - rec more inserted, targetItemIndex: ");
                                sbLIZ2.append(i);
                                sbLIZ2.append(", nickname ");
                                if (c1261650iw72 != null && (c1261860iwS = c1261650iw72.LLILLJJLI) != null) {
                                    nickname2 = c1261860iwS.getNickname();
                                }
                                sbLIZ2.append(nickname2);
                                C1720106oR.LJI("[ffp]", C2188811AlT.LIZIZ(sbLIZ2));
                                int size = c1261360ive.LIZJ.size();
                                if (size > 1) {
                                    size = 1;
                                }
                                int i2 = i + size;
                                int size2 = viewOnAttachStateChangeListenerC20604515jv.getListItems().size() - 1;
                                if (i2 > size2) {
                                    i2 = size2;
                                }
                                if (i2 > iFindLastCompletelyVisibleItemPosition) {
                                    int i3 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("AUTOSCROLL - by count ");
                                    sbLIZ3.append(i2 - iFindLastCompletelyVisibleItemPosition);
                                    C1720106oR.LJI("[ffp]", C2188811AlT.LIZIZ(sbLIZ3));
                                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS22S0201000_16(i2, linearLayoutManager, this, 6));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i++;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void aS(C13IQ<? extends Fragment> c13iq) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("[ffp]", "rec friends show again!");
        if (!SR().getState().LLILZLL) {
            new C2001407si("normal", VR().getPreviousPage(), VR().getNewMafCount()).LIZLLL(null);
        }
        if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(SearchFriendsV2Fragment.class))) {
            gS().yQ2(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        EnumC1262370ixH enumC1262370ixHLIZ;
        int i;
        Object objLJ;
        View view2;
        this.LLJI = (C1749280vcc) view.findViewById(R.id.w28);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
        boolean z = false;
        if (dS() && (view2 = (View) this.LLJJ.getValue()) != null) {
            C1749280vcc c1749280vcc = this.LLJI;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            c1749280vcc.LIZIZ(view2);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        int i2 = 1;
        viewOnAttachStateChangeListenerC20604515jv2.setOrientation(1);
        viewOnAttachStateChangeListenerC20604515jv2.setLifecycleOwner(this);
        this.LLJIJIL = viewOnAttachStateChangeListenerC20604515jv2;
        if (dS()) {
            enumC1262370ixHLIZ = EnumC1262370ixH.MAF_ADD_NEW_FRIENDS_UI_REDESIGN;
        } else {
            C1262400ixK c1262400ixK = EnumC1262370ixH.Companion;
            int mafApiScene = VR().getMafApiScene();
            c1262400ixK.getClass();
            enumC1262370ixHLIZ = C1262400ixK.LIZ(mafApiScene);
            if (enumC1262370ixHLIZ == null) {
                enumC1262370ixHLIZ = EnumC1262370ixH.FIND_FRIENDS;
            }
        }
        if (dS()) {
            i = 106;
        } else {
            i = 101;
        }
        C1262310ixB c1262310ixB = new C1262310ixB(z ? 1 : 0, this, i2);
        new AwS382S0200000_16(enumC1262370ixHLIZ, this, 106).invoke(c1262310ixB.LJFF);
        new AwS595S0100000_16(this, 423).invoke(c1262310ixB.LJ);
        new AwS127S0101000_19(i, this, 2).invoke(c1262310ixB.LIZJ);
        c1262310ixB.LIZIZ(AFwS252S0000000_16.get$arr$(623));
        IRelationUserCardInternalService.LIZ.getClass();
        IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ = C1073940e3M.LIZ();
        C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
        if (c1262320ixC.LIZLLL == -1) {
            int i3 = c1262310ixB.LJFF.LIZJ - 10;
            if (i3 < 5) {
                i3 = 5;
            }
            c1262320ixC.LIZLLL = i3;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AbstractC1263550izB.class);
        if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
            C1262590ixd c1262590ixd = c1262310ixB.LJFF;
            if (c1262590ixd.LJIILJJIL == null) {
                c1262590ixd.LJIILJJIL = Boolean.TRUE;
            }
        }
        C1262300ixA c1262300ixA = new C1262300ixA(c1262310ixB.LIZ, c1262310ixB.LIZIZ, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AbstractC1263550izB.class);
        boolean z2 = false;
        if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262790ixx.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 1).getLayout();
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262780ixw.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 0).getLayout();
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263550izB.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZIZ(c1262300ixA);
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1890380zIC.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZJ(c1262300ixA);
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1903730zdj.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZLLL(c1262300ixA);
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263540izA.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LJ(c1262300ixA);
        } else {
            "type is error!".toString();
            throw new IllegalStateException("type is error!");
        }
        if (objLJ != null) {
            AbstractC1263550izB abstractC1263550izB = (AbstractC1263550izB) objLJ;
            this.LLJILJIL = abstractC1263550izB;
            ((C1262970iyF) abstractC1263550izB).LJI(null);
            AbstractC1263550izB abstractC1263550izB2 = this.LLJILJIL;
            if (abstractC1263550izB2 == null) {
                abstractC1263550izB2 = null;
            }
            ((C1262970iyF) abstractC1263550izB2).Eg(this);
            RecFriendsVM recFriendsVMGS = gS();
            if (((Number) C295680BiQ.LIZ.getValue()).intValue() != 0) {
                z2 = true;
            }
            recFriendsVMGS.yQ2(z2);
            InterfaceC1261750iwH interfaceC1261750iwH = (InterfaceC1261750iwH) this.LLJ.getValue();
            if (interfaceC1261750iwH != null) {
                AbstractC1263550izB abstractC1263550izB3 = this.LLJILJIL;
                if (abstractC1263550izB3 == null) {
                    abstractC1263550izB3 = null;
                }
                ((C1262970iyF) abstractC1263550izB3).Eg(interfaceC1261750iwH);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
                viewOnAttachStateChangeListenerC20604515jv3 = null;
            }
            AbstractC1263550izB abstractC1263550izB4 = this.LLJILJIL;
            if (abstractC1263550izB4 == null) {
                abstractC1263550izB4 = null;
            }
            viewOnAttachStateChangeListenerC20604515jv3.setItemAnimator(((C1262970iyF) abstractC1263550izB4).getItemAnimator());
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv4 == null) {
                viewOnAttachStateChangeListenerC20604515jv4 = null;
            }
            viewOnAttachStateChangeListenerC20604515jv4.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1));
            this.LLJILJILJ = new C1069780dwe();
            if (!C296060Bj2.LIZJ) {
                RecFriendsVM recFriendsVMGS2 = gS();
                recFriendsVMGS2.setState(new AwS595S0100000_16(recFriendsVMGS2, 2));
            }
            if (!SR().getState().LLILZLL) {
                new C2001407si("normal", VR().getPreviousPage(), VR().getNewMafCount()).LIZLLL(null);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                viewOnAttachStateChangeListenerC20604515jv = viewOnAttachStateChangeListenerC20604515jv5;
            }
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS43S0100000_16(this, 1));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        AbstractC1623806Xk c1623706Xj;
        List<InterfaceC1891350zJl> listLIZ;
        List<InterfaceC1891350zJl> listLIZ2;
        C1056250dap c1056250dap = SR().LLIZLLLIL.LIZJ;
        if (c1056250dap != null && c1056250dap.LIZLLL.LIZ == -1) {
            AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
            if (abstractC1623806Xk instanceof C491001vg) {
                c1056250dap.LIZLLL = C1056290dat.LIZ(c1056250dap.LIZLLL, System.currentTimeMillis() - c1056250dap.LJFF, EnumC1056240dao.FAIL, 10);
            } else if (abstractC1623806Xk instanceof C1623606Xi) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c1056250dap.LJFF;
                C1056290dat c1056290dat = c1056250dap.LIZLLL;
                EnumC1056240dao enumC1056240dao = EnumC1056240dao.SUCCESS;
                int iLIZIZ = c1075800e6M.LIZIZ();
                boolean z = ((C626160OhC) ((C1623606Xi) abstractC1623806Xk).LIZ).LIZIZ;
                c1056290dat.getClass();
                c1056250dap.LIZLLL = new C1056290dat(jCurrentTimeMillis, iLIZIZ, enumC1056240dao, z);
            }
        }
        RecFriendsVM recFriendsVMGS = gS();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user card state: ");
        sbLIZ.append(c1075800e6M);
        C1720106oR.LJI("[ffp]_RecFriends", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk2 = c1075800e6M.LIZJ;
        if ((c1075800e6M.LIZ instanceof C1623606Xi) && (abstractC1623806Xk2 instanceof C1623606Xi) && ((List) ((C1623606Xi) abstractC1623806Xk2).LIZ).isEmpty()) {
            if (C296060Bj2.LIZIZ) {
                recFriendsVMGS.LLILLJJLI.vQ2(C13LE.LIZ(RecFriendsEmptyFragment.class));
            } else {
                EnumC1070410dxf[] enumC1070410dxfArrValues = EnumC1070410dxf.values();
                int length = enumC1070410dxfArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        EnumC1070410dxf enumC1070410dxf = enumC1070410dxfArrValues[i2];
                        RecFriendsVM.vQ2(enumC1070410dxf);
                        if (!enumC1070410dxf.isGrant()) {
                            recFriendsVMGS.LLILLJJLI.vQ2(C13LE.LIZ(NeedAuthFragment.class));
                            break;
                        }
                        i2++;
                    } else {
                        recFriendsVMGS.LLILLJJLI.vQ2(C13LE.LIZ(RecEmptyFragment.class));
                        break;
                    }
                }
            }
        }
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3 = c1075800e6M.LIZ;
        if (abstractC1623806Xk3 instanceof C491001vg) {
            c1623706Xj = new C491001vg(((C491001vg) abstractC1623806Xk3).LIZ);
        } else {
            C1075800e6M c1075800e6M2 = recFriendsVMGS.LLILZIL;
            AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk4 = c1075800e6M.LIZJ;
            if ((abstractC1623806Xk4 instanceof C491101vh) || (abstractC1623806Xk4 instanceof C1623706Xj) || (((listLIZ = c1075800e6M2.LIZJ.LIZ()) != null && listLIZ.isEmpty() && (c1075800e6M.LIZ instanceof C1623706Xj)) || ((listLIZ2 = abstractC1623806Xk4.LIZ()) != null && listLIZ2.isEmpty()))) {
                c1623706Xj = new C1623706Xj();
            } else {
                c1623706Xj = new C1623606Xi(Unit.LIZ);
            }
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("rec friends page status: ");
        sbLIZ2.append(c1623706Xj.getClass().getSimpleName());
        C1720106oR.LJI("[ffp]_RecFriends", C2188811AlT.LIZIZ(sbLIZ2));
        recFriendsVMGS.LLILZIL = c1075800e6M;
        recFriendsVMGS.setState(new AwS595S0100000_16(c1623706Xj, (AbstractC1623806Xk<Unit>) 10));
    }
}
