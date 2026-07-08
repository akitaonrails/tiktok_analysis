package com.ss.android.ugc.aweme.prop.draft;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1737910vKH;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C322450CkV;
import X.C336500DHc;
import X.C346270Dhp;
import X.C346570DiJ;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC322330CkJ;
import X.EnumC638250P1r;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS139S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS653S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EffectDraftDetailAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public View LLJJIJIL;
    public TuxNavBar LLJJJ;
    public ViewGroup LLJJJIL;
    public TuxTextView LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectDraftDetailAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/prop/draft/EffectDraftDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectDraftDetailAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectDraftDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 193), AFwS232S0000000_4.get$arr$(55), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, EffectDraftDetailAssemData.class, "draft_detail_init_data"), checkSupervisorPrepared());
        this.LLJJIJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 190));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ftp;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final EffectDraftDetailViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (EffectDraftDetailViewModel) assemVMLazy.getValue();
    }

    public final void lp() {
        ViewGroup viewGroup = this.LLJJJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        TuxTextView tuxTextView = this.LLJJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
    }

    public final void mp() {
        TuxNavBar tuxNavBar = this.LLJJJ;
        if (tuxNavBar == null) {
            return;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 191));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C1383370m6R.LJIIJ(2131820921);
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = C1383370m6R.LJIIJ(2131847259);
        c1250300ido.LJ = true;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS548S0100000_4(this, 192));
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(c1250300ido);
        tuxNavBar.setNavActions(c0om1);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        if (this.LLJJIJIIJIL && hp().getState().LL != EnumC322330CkJ.SELECTED) {
            hp().wQ2();
        }
        this.LLJJIJIIJIL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        this.LLJJIJIIJIL = true;
    }

    public final void ip(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_name", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(hp().getState().LLILLL.LIZ.size());
        linkedHashMap.put("effect_draft_cnt", C2188811AlT.LIZIZ(sbLIZ));
        C1737910vKH.LIZ("prop_draft_page_button_click", linkedHashMap);
    }

    public final void kp(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C322450CkV c322450CkV = hp().getState().LLILLL;
        c322450CkV.LIZ(linkedHashMap);
        c322450CkV.LIZIZ(linkedHashMap);
        linkedHashMap.put("button_name", str);
        C1737910vKH.LIZ("prop_draft_delete_confirmation_window_click", linkedHashMap);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIL = view;
        this.LLJJJ = (TuxNavBar) view.findViewById(R.id.p15);
        mp();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tuq);
        recyclerView.setAdapter((AbstractC21673619ry) this.LLJJIJI.getValue());
        recyclerView.setLayoutManager(new WrapGridLayoutManager(((EffectDraftDetailAssemData) this.LLJJIII.getValue()).spanSize, 1, getContext(), false));
        recyclerView.addItemDecoration(new C346270Dhp(6));
        this.LLJJJIL = (ViewGroup) view.findViewById(R.id.cbs);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.chr);
        ViewGroup viewGroup = this.LLJJJIL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS139S0100000_4(this, 81));
        }
        lp();
        EffectDraftDetailViewModel effectDraftDetailViewModelHp = hp();
        selectSubscribe(effectDraftDetailViewModelHp, new C2217381BqS() { // from class: X.0DHW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C322320CkI) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0DHY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C322320CkI) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0CkN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C322320CkI) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZIZ(effectDraftDetailViewModelHp.usedInReusedScene), null, new C346570DiJ(this, 2));
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0DHX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C322320CkI) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0CkT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C322320CkI) obj).LLILZ;
            }
        }, null, new AwS653S0100000_4(this, 17), 12);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0CkU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C322320CkI) obj).LLILZIL;
            }
        }, null, AFwS287S0000000_4.get$arr$(24), 6);
        hp().wQ2();
        C336500DHc.LIZ.getClass();
        C336500DHc.LIZIZ = 2;
    }
}
