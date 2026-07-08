package com.ss.android.ugc.aweme.offlinemode.ui;

import X.AbstractC1604130rqV;
import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.C01D1;
import X.C098200Yq;
import X.C0BVM;
import X.C0NU1;
import X.C0NU2;
import X.C0O10;
import X.C0SR4;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1479130oat;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1637806bA;
import X.C1697810uHb;
import X.C189200o6;
import X.C19319410i8;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C339190DRl;
import X.C419910GdJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C607950Nsv;
import X.C623470Ocr;
import X.C624670Oen;
import X.C624990OfJ;
import X.C625030OfN;
import X.C625120OfW;
import X.C625130OfX;
import X.C625720OgU;
import X.C626160OhC;
import X.C627660Ojc;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC625000OfK;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS78S0200000_9;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.offlinemode.ui.OfflineModeDetailPageComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeDetailPageComponent extends DetailPageComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLL;
    public static final C19319410i8 LLLLLLIL;
    public final C736950SvV LLLJIL;
    public final AssemVMLazy LLLJL;
    public final C625030OfN LLLL;
    public C0NU1 LLLLII;
    public C0SR4 LLLLIIIILLL;
    public final C0NU2 LLLLIIL;
    public TuxTextView LLLLIILL;
    public TuxIconView LLLLIILLL;
    public View LLLLIL;
    public View LLLLILI;
    public String LLLLJ;
    public final C630740Ooa LLLLJI;
    public final C630740Ooa LLLLL;
    public final C630740Ooa LLLLLIL;
    public final C630740Ooa LLLLLILLIL;
    public boolean LLLLLJIL;
    public boolean LLLLLJLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OfflineModeDetailPageComponent.class, "managerVM", "getManagerVM()Lcom/ss/android/ugc/aweme/offlinemode/viewmodel/OfflineModeManagerVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLLIL = new C19319410i8("OfflineModeDetailPageComponent");
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onSaveInstanceState(Bundle bundle) {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0NU2] */
    public OfflineModeDetailPageComponent() {
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(289);
        this.LLLJIL = new C736950SvV(C13LE.LIZ(OfflineModeListVM.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(574), new AwS553S0100000_9((AbstractC738140SxQ) this, 1379), new C451610HnL(this, true, true), new C723700Sa8(this));
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OfflineModeManagerVM.class);
        this.LLLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1378), AFwS240S0000000_9.get$arr$(573), null, true);
        this.LLLL = new C625030OfN();
        this.LLLLIIL = new DataSetObserver() { // from class: X.0NU2
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                OfflineModeDetailPageComponent offlineModeDetailPageComponent = this.LIZ;
                C0NU1 c0nu1 = offlineModeDetailPageComponent.LLLLII;
                if (c0nu1 == null) {
                    return;
                }
                offlineModeDetailPageComponent.LLLLII = null;
                HandlerHook.viewPost(offlineModeDetailPageComponent.LJJIJL(), new ARunnableS78S0200000_9(this.LIZ, c0nu1, 37));
            }
        };
        this.LLLLJI = C628500Oky.LIZ(new AwS553S0100000_9(this, 1376));
        this.LLLLL = C628500Oky.LIZ(new AwS553S0100000_9(this, 1377));
        this.LLLLLIL = C628500Oky.LIZ(new AwS553S0100000_9(this, 1375));
        this.LLLLLILLIL = C628500Oky.LIZ(new AwS553S0100000_9(this, 1374));
    }

    public final OfflineModeManagerVM Ep() {
        AssemVMLazy assemVMLazy = this.LLLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLL;
        return (OfflineModeManagerVM) assemVMLazy.getValue();
    }

    public final OfflineModeListVM Fp() {
        return (OfflineModeListVM) this.LLLJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0333  */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0NtL, X.1BMO] */
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
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAssemPostCreate() {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.ui.OfflineModeDetailPageComponent.onAssemPostCreate():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0SR4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        String str;
        Intent intent;
        C0SR4 c0sr4 = this.LLLLIIIILLL;
        ?? r1 = 0;
        String stringExtra = null;
        r1 = 0;
        if (c0sr4 != null) {
            try {
                c0sr4.LJJIJIIJIL(this.LLLLIIL);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.LLLLIIIILLL = null;
        }
        this.LLLLII = null;
        super.onDestroy();
        if (this.LLLLLJLJLL) {
            return;
        }
        this.LLLLLJLJLL = true;
        if (this.LLLLLJIL) {
            str = "click_go_to_fyp_button";
        } else if (((Boolean) this.LLLLL.getValue()).booleanValue() || ((Boolean) this.LLLLLIL.getValue()).booleanValue() || ((Boolean) this.LLLLLILLIL.getValue()).booleanValue()) {
            str = "back_to_fyp";
        } else if (((Boolean) this.LLLLJI.getValue()).booleanValue()) {
            str = "click_return_fyp";
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (intent = c19egLIZ.getIntent()) != null) {
                try {
                    stringExtra = intent.getStringExtra("event_type");
                    r1 = stringExtra;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    r1 = stringExtra;
                }
            }
            str = Intrinsics.LJFF(r1, "profile_menu") ? "back_to_menu" : "back_to_setting";
        }
        AbstractC1604130rqV.LIZLLL(LLLLLLIL, "exitOfflineMode", str);
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        int detailVvCount = c2189821An6 != null ? c2189821An6.getDetailVvCount() : 0;
        C2189821An6 c2189821An62 = getPanelContext().LIZJ;
        int detailVvFinishCount = c2189821An62 != null ? c2189821An62.getDetailVvFinishCount() : 0;
        C2189821An6 c2189821An63 = getPanelContext().LIZJ;
        long detailPlayDuration = c2189821An63 != null ? c2189821An63.getDetailPlayDuration() : 0L;
        String strLIZ = C625120OfW.LIZ(C786410Ut5.e3(C724240Sb0.LIZ(this)));
        int iLJII = C1479130oat.LJII();
        C625030OfN c625030OfN = this.LLLL;
        String str2 = this.LLLLJ;
        c625030OfN.getClass();
        c625030OfN.LIZ = System.currentTimeMillis() - c625030OfN.LJ;
        C625130OfX.LJ(C625130OfX.LIZ, "exit_offline_mode", "offline_mode_page", str2, strLIZ, Integer.valueOf(iLJII), null, null, null, null, null, null, null, null, Long.valueOf(detailPlayDuration), null, null, str, String.valueOf(detailVvCount), String.valueOf(detailVvFinishCount), String.valueOf(c625030OfN.LIZ), String.valueOf(c625030OfN.LIZIZ), String.valueOf(c625030OfN.LIZJ), String.valueOf(c625030OfN.LIZLLL), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8331296, 131071);
    }

    public final void Bp() {
        C0SR4 c0sr4;
        if (C0BVM.LIZ()) {
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            C0SR4 c0sr42 = detailFragmentPanel != null ? detailFragmentPanel.LLJL : null;
            if (!(c0sr42 instanceof PagerAdapter) || c0sr42 == null || (c0sr4 = this.LLLLIIIILLL) == c0sr42) {
                return;
            }
            if (c0sr4 != null) {
                try {
                    c0sr4.LJJIJIIJIL(this.LLLLIIL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c0sr42.LJJII(this.LLLLIIL);
            this.LLLLIIIILLL = c0sr42;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Ep().NQ2(true);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void LJIJ() {
        super.LJIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Gp(boolean z) {
        DetailFragmentPanel detailFragmentPanel;
        List<Aweme> awemeList;
        DetailFragmentPanel detailFragmentPanel2;
        Aweme awemeO;
        String aid;
        int i;
        IntRange intRangeLJIILJJIL;
        String str;
        Object c098200Yq;
        EnumC625000OfK enumC625000OfK;
        List listLLD;
        C627660Ojc c627660OjcLIZ;
        Collection collection;
        C0SR4 c0sr4;
        if (!C0BVM.LIZ()) {
            return;
        }
        C0O10 c0o10 = (C0O10) Fp().getState();
        c0o10.getClass();
        if (!(c0o10.getListState().LLILLJJLI instanceof C1623706Xj) && !(c0o10.getListState().LLILLL instanceof C1623706Xj) && (detailFragmentPanel = this.LLJL) != null && (awemeList = detailFragmentPanel.getAwemeList()) != null && (detailFragmentPanel2 = this.LLJL) != null && (awemeO = detailFragmentPanel2.o()) != null && (aid = awemeO.getAid()) != null) {
            Iterator<Aweme> it2 = awemeList.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getAid(), aid)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            OfflineModeListVM offlineModeListVMFp = Fp();
            int size = awemeList.size();
            offlineModeListVMFp.getClass();
            Integer numValueOf = null;
            if (C0BVM.LIZ()) {
                int i3 = offlineModeListVMFp.LLILZLL;
                if (size > offlineModeListVMFp.LLIZ + i3 && (i = size - i3) > 0) {
                    if (z) {
                        intRangeLJIILJJIL = C13LZ.LJIILJJIL(i3, size);
                    } else {
                        intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i);
                    }
                    int i4 = intRangeLJIILJJIL.LL;
                    if ((i2 > intRangeLJIILJJIL.LLILLJJLI || i4 > i2) && intRangeLJIILJJIL.LL >= 0 && intRangeLJIILJJIL.LLILLJJLI < awemeList.size()) {
                        if (z) {
                            str = "tail";
                        } else {
                            str = "head";
                        }
                        try {
                            c098200Yq = C13LP.LLIIII(awemeList.subList(intRangeLJIILJJIL.LL, intRangeLJIILJJIL.LLILLJJLI + 1));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        List<Aweme> list = (List) c098200Yq;
                        if (list == null) {
                            list = C13BV.INSTANCE;
                        }
                        if (list.isEmpty()) {
                            LLLLLLIL.LJIIIZ("skip trim: no item to delete");
                            return;
                        }
                        DetailFragmentPanel detailFragmentPanel3 = this.LLJL;
                        if (detailFragmentPanel3 != null) {
                            detailFragmentPanel3.Js(list);
                        }
                        DetailFragmentPanel detailFragmentPanel4 = this.LLJL;
                        if (detailFragmentPanel4 != null && (c0sr4 = detailFragmentPanel4.LLJL) != null) {
                            if (z) {
                                c0sr4.LLJILLL = true;
                            } else {
                                c0sr4.LLJJ = true;
                            }
                        }
                        LLLLLLIL.LJIIIZ("trim by datalayer: delete=" + list.size() + " range=" + str);
                        OfflineModeListVM offlineModeListVMFp2 = Fp();
                        if (z) {
                            enumC625000OfK = EnumC625000OfK.LOAD_LATEST;
                        } else {
                            enumC625000OfK = EnumC625000OfK.LOAD_MORE;
                        }
                        C627660Ojc<C607950Nsv> c627660Ojc = ((C0O10) offlineModeListVMFp2.getState()).LL;
                        List<C607950Nsv> list2 = c627660Ojc.LLILZ;
                        if (C0BVM.LIZ() && !offlineModeListVMFp2.LLIZLLLIL && list2 != null && list2.size() > offlineModeListVMFp2.LLILZLL + offlineModeListVMFp2.LLIZ) {
                            int i5 = C624990OfJ.LIZ[enumC625000OfK.ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    listLLD = C13LP.LL(list2, offlineModeListVMFp2.LLILZLL);
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                listLLD = C13LP.LLD(offlineModeListVMFp2.LLILZLL, list2);
                            }
                            if (listLLD.size() != list2.size()) {
                                offlineModeListVMFp2.LLIZLLLIL = true;
                                try {
                                    int i6 = C624990OfJ.LIZ[enumC625000OfK.ordinal()];
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            if (i6 == 3) {
                                                c627660OjcLIZ = C627660Ojc.LIZ(c627660Ojc, null, null, null, listLLD, 7);
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else {
                                            c627660OjcLIZ = C627660Ojc.LIZ(c627660Ojc, null, new C1623606Xi(new C626160OhC(false, true, 1)), null, listLLD, 5);
                                        }
                                    } else {
                                        c627660OjcLIZ = C627660Ojc.LIZ(c627660Ojc, null, null, new C1623606Xi(new C626160OhC(true, false, 2)), listLLD, 3);
                                    }
                                    if (!Intrinsics.LJFF(((C0O10) offlineModeListVMFp2.getState()).LL, c627660OjcLIZ) && (collection = c627660OjcLIZ.LLILZ) != null) {
                                        offlineModeListVMFp2.listSetItems(collection);
                                        offlineModeListVMFp2.setState(new AwS588S0100000_9(c627660OjcLIZ, (C627660Ojc<C623470Ocr>) 369));
                                        C19319410i8 c19319410i8 = offlineModeListVMFp2.LLJI;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("maybeTrimWindow action=");
                                        sbLIZ.append(enumC625000OfK);
                                        sbLIZ.append(" before=");
                                        List<C607950Nsv> list3 = c627660Ojc.LLILZ;
                                        if (list3 != null) {
                                            numValueOf = Integer.valueOf(list3.size());
                                        }
                                        sbLIZ.append(numValueOf);
                                        sbLIZ.append(" after=");
                                        sbLIZ.append(listLLD.size());
                                        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                    offlineModeListVMFp2.LLIZLLLIL = false;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    offlineModeListVMFp2.LLIZLLLIL = false;
                                    throw th2;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void Ip(int i) {
        int i2;
        float f;
        int i3 = 0;
        for (View view : C1697810uHb.LJIIJJI(this.LLLLIL, this.LLLLILI)) {
            if (view != null) {
                if (i > 0) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                C786410Ut5.T4(view, f);
            }
        }
        if (C624670Oen.LIZIZ()) {
            TuxTextView tuxTextView = this.LLLLIILL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLLLIILL;
            if (tuxTextView2 != null) {
                if (i > 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, i2);
            }
        }
        TuxIconView tuxIconView = this.LLLLIILLL;
        if (tuxIconView != null) {
            if (i <= 0) {
                i3 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        Bp();
        TuxTextView tuxTextView = null;
        String string = null;
        String string2 = null;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(view.getContext(), null);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 5;
        viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
        Fp().setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        final OfflineModeListVM offlineModeListVMFp = Fp();
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(offlineModeListVMFp) { // from class: X.0OfL
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        if (!C624670Oen.LIZIZ() && (viewFindViewById = view.findViewById(R.id.trr)) != null) {
            viewFindViewById.setBackgroundResource(R.drawable.cqs);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e2g);
        this.LLLLIILLL = tuxIconView;
        if (tuxIconView != null) {
            C339190DRl.LIZLLL(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLLLIILLL;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_gear;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0p);
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView3 = this.LLLLIILLL;
        if (tuxIconView3 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 33), tuxIconView3);
        }
        if (C624670Oen.LIZIZ()) {
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.y08);
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(33);
                if (C624670Oen.LIZIZ()) {
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ != null) {
                        string = c19egLIZ.getString(2131838599);
                    }
                    tuxTextView2.setText(string);
                } else {
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                    if (c19egLIZ2 != null) {
                        string2 = c19egLIZ2.getString(2131838543);
                    }
                    tuxTextView2.setText(string2);
                }
                tuxTextView = tuxTextView2;
            }
            this.LLLLIILL = tuxTextView;
        }
        this.LLLLIL = view.findViewById(R.id.ch3);
        this.LLLLILI = view.findViewById(R.id.ydi);
        Ip(Ep().getState().LLILLJJLI);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0OCE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C616100OEm) obj).LLILLJJLI);
            }
        }, null, new AwS623S0100000_9(this, 123), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0OEn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616100OEm) obj).LLJILJILJ;
            }
        }, null, new AwS623S0100000_9(this, 124), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0OfP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O10) obj).LLILLJJLI;
            }
        }, null, new AwS623S0100000_9(this, 122), 6);
        AssemViewModel.asyncSubscribe$default(Fp(), new C2217381BqS() { // from class: X.0O1t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C0O10 c0o10 = (C0O10) obj;
                c0o10.getClass();
                return C627260Oiy.LIZLLL(c0o10);
            }
        }, getFragment(), null, null, null, new AwS375S0200000_9(this, view, 88), 28, null);
        AssemViewModel.asyncSubscribe$default(Fp(), new C2217381BqS() { // from class: X.0O1u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C0O10 c0o10 = (C0O10) obj;
                c0o10.getClass();
                return C627260Oiy.LIZJ(c0o10);
            }
        }, getFragment(), null, null, null, new AwS588S0100000_9(this, 356), 28, null);
        AssemViewModel.asyncSubscribe$default(Fp(), new C2217381BqS() { // from class: X.0OfM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C0O10 c0o10 = (C0O10) obj;
                c0o10.getClass();
                return C627260Oiy.LIZIZ(c0o10);
            }
        }, getFragment(), null, null, null, new AwS588S0100000_9(this, 357), 28, null);
        C625720OgU.LIZIZ().LIZLLL("has_enter_offline_mode", true);
    }
}
