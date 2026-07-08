package com.ss.android.ugc.aweme.ecommerce.search.searchbar;

import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C09R3;
import X.C0I7D;
import X.C0QER;
import X.C0QL2;
import X.C0QPB;
import X.C0QR7;
import X.C0QT8;
import X.C0QUG;
import X.C0QUT;
import X.C0QVH;
import X.C0QVP;
import X.C0QWS;
import X.C0QWU;
import X.C0QXC;
import X.C0WZX;
import X.C107800ay;
import X.C1202404n8;
import X.C123100dR;
import X.C1357120lQ6;
import X.C1361400lX0;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19U1;
import X.C20575915fJ;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C274980Aq8;
import X.C418060GaK;
import X.C418440Gaw;
import X.C427110Gov;
import X.C452501pT;
import X.C646000PVm;
import X.C650500PfM;
import X.C650950Pg5;
import X.C651580Ph6;
import X.C670080QQc;
import X.C670090QQd;
import X.C671710QWj;
import X.C671720QWk;
import X.C671780QWq;
import X.C672020QXo;
import X.C672250QYl;
import X.C674040QcE;
import X.C674620QdA;
import X.C674630QdB;
import X.C680790Qn7;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.ChoreographerFrameCallbackC674130QcN;
import X.EnumC671640QWc;
import X.EnumC671650QWd;
import X.EnumC671670QWf;
import X.EnumC674020QcC;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC671770QWp;
import X.InterfaceC674710QdJ;
import X.InterfaceC676430Qg5;
import X.RunnableC514801zW;
import Y.ARunnableS29S0110000_10;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.EcSearchSugInputABModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.cart.vm.SearchCartVM;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddlePageContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.TriggerRetentionPopUpAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr.EcSearchBarAsrHelper;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.ECPhotoSearchBubbleVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.EcomPersonalizedToastAbility;
import com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility;
import com.ss.android.ugc.aweme.search.ecommerce.cart.ISearchCartContextAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchBarAssem extends UISlotAssem implements ISearchBarAbility, SwitchThemeAbility, HandleBackPressAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLILI;
    public TuxIconView LLJJI;
    public C0I7D LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public LinearLayout LLJJJIL;
    public ViewGroup LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxIconView LLJJL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public TuxIconView LLJLIL;
    public C19U1 LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public C418060GaK LLJLLIL;
    public C1357120lQ6 LLJLLL;
    public C1357120lQ6 LLJZ;
    public ChoreographerFrameCallbackC674130QcN LLJZIJLIL;
    public C427110Gov LLL;
    public TuxTextView LLLF;
    public TuxIconView LLLFF;
    public View LLLFFI;
    public TuxIconView LLLFZ;
    public ViewGroup LLLI;
    public TuxTextView LLLII;
    public C671720QWk LLLIIII;
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 144));
    public C1361400lX0 LLLIIIL;
    public C674040QcE LLLIIL;
    public EcSearchBarAsrHelper LLLIILIL;
    public C20575915fJ LLLIL;
    public final AssemVMLazy LLLILZ;
    public C0QUT LLLILZJ;
    public final AssemVMLazy LLLILZLLLI;
    public final AssemVMLazy LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public final C671710QWj LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECSearchBarAssem.class, "searchCartVM", "getSearchCartVM()Lcom/ss/android/ugc/aweme/ecommerce/search/cart/vm/SearchCartVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ECSearchBarAssem.class, "searchBarVM", "getSearchBarVM()Lcom/ss/android/ugc/aweme/ecommerce/search/searchbar/vm/ECSearchBarAssemVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ECSearchBarAssem.class, "photoSearchBubbleVM", "getPhotoSearchBubbleVM()Lcom/ss/android/ugc/aweme/ecommerce/search/vision/guide/ECPhotoSearchBubbleVM;", 0);
        c09r3.getClass();
        LLLLILI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    public final void BF2(boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2 A[PHI: r1
      0x00d2: PHI (r1v8 int) = (r1v6 int), (r1v17 int), (r1v22 int) binds: [B:49:0x00cb, B:35:0x008d, B:31:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLZL() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.LLLZL():int");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    public final void WL1(LifecycleOwner lifecycleOwner, AwS589S0100000_10 awS589S0100000_10) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0QPH
    public final void q8(C0QUT c0qut, C0QUT c0qut2, SearchResultParam searchResultParam) {
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0QWj] */
    public ECSearchBarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCartVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 149), AFwS241S0000000_10.get$arr$(71), null, true);
        C03IJ c03ij = C03IJ.LIZ;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 145);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ECSearchBarAssemVM.class);
        this.LLLILZLLLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c03ij, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 150), AFwS241S0000000_10.get$arr$(72), awS554S0100000_10, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ECPhotoSearchBubbleVM.class);
        this.LLLIZZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ3, 151), AFwS241S0000000_10.get$arr$(73), null, true);
        this.LLLJ = true;
        this.LLLLIIL = new InterfaceC674710QdJ() { // from class: X.0QWj
            @Override // X.InterfaceC674710QdJ
            public final void LIZ(C674650QdD c674650QdD) throws Throwable {
                EnumC674020QcC enumC674020QcC;
                Activity activityLIZ;
                Activity activityLIZIZ;
                View viewFindViewById = null;
                Activity activity = null;
                Editable editableLLZ = null;
                switch (C674670QdF.LIZ[c674650QdD.LIZ.ordinal()]) {
                    case 1:
                        C674040QcE c674040QcE = this.LIZ.LLLIIL;
                        if (c674040QcE != null && (enumC674020QcC = c674040QcE.LIZIZ) == EnumC674020QcC.AI_SEARCH) {
                            c674040QcE.LIZ(enumC674020QcC, EnumC674020QcC.AI_SEARCH_RECORDING);
                            return;
                        }
                        return;
                    case 2:
                        C674040QcE c674040QcE2 = this.LIZ.LLLIIL;
                        if (c674040QcE2 != null && c674040QcE2.LIZIZ.isRecording()) {
                            c674040QcE2.LIZ(c674040QcE2.LIZIZ, EnumC674020QcC.AI_SEARCH_TRANSCRIBING);
                            return;
                        }
                        return;
                    case 3:
                        ECSearchBarAssem eCSearchBarAssem = this.LIZ;
                        View view = eCSearchBarAssem.LLJZ;
                        if (view == null) {
                            View viewLJJIJL = eCSearchBarAssem.LJJIJL();
                            if (viewLJJIJL != null) {
                                viewFindViewById = viewLJJIJL.findViewById(R.id.ggu);
                            }
                            eCSearchBarAssem.LLJZ = (C1357120lQ6) viewFindViewById;
                            view = viewFindViewById;
                        }
                        TextView textView = (TextView) view;
                        if (textView != null) {
                            textView.setHint(C20642515q3.LJI(2131857237));
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                        StringBuilder sb = new StringBuilder();
                        C1357120lQ6 c1357120lQ6Hp = this.LIZ.hp();
                        if (c1357120lQ6Hp != null) {
                            editableLLZ = C2204961BRm.LLZ(c1357120lQ6Hp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null));
                        }
                        sb.append((Object) editableLLZ);
                        sb.append(c674650QdD.LIZJ);
                        String string = sb.toString();
                        C1357120lQ6 c1357120lQ6Hp2 = this.LIZ.hp();
                        if (c1357120lQ6Hp2 != null) {
                            c1357120lQ6Hp2.setText(string);
                        }
                        C674630QdB c674630QdB = c674650QdD.LIZIZ;
                        if (c674630QdB != null) {
                            c674630QdB.LJIIL = string;
                        }
                        C674040QcE c674040QcE3 = this.LIZ.LLLIIL;
                        if (c674040QcE3 != null && c674040QcE3.LIZIZ.isVoiceFlow()) {
                            c674040QcE3.LIZ(c674040QcE3.LIZIZ, EnumC674020QcC.AI_SEARCH);
                            return;
                        }
                        return;
                    case 6:
                        C674040QcE c674040QcE4 = this.LIZ.LLLIIL;
                        if (c674040QcE4 != null && c674040QcE4.LIZIZ.isVoiceFlow()) {
                            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                            } else {
                                activityLIZ = null;
                            }
                            if (activityLIZ instanceof C19EG) {
                                activity = activityLIZ;
                            }
                            if (activity != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                c1389890mGx.LJFF(R.raw.icon_x_mark_circle_fill);
                                c1389890mGx.LJII(R.attr.a1h);
                                c1389890mGx.LJIIIZ(2131857240);
                                c1389890mGx.LJIIJJI();
                            }
                            C674630QdB c674630QdB2 = c674650QdD.LIZIZ;
                            if (c674630QdB2 != null) {
                                c674630QdB2.LJIIJ = 1;
                                c674630QdB2.LJIIJJI = C20642515q3.LJI(2131857240);
                                C674620QdA.LIZLLL(c674630QdB2);
                            }
                        }
                        C674040QcE c674040QcE5 = this.LIZ.LLLIIL;
                        if (c674040QcE5 != null) {
                            c674040QcE5.LIZJ();
                            return;
                        }
                        return;
                    case 7:
                        C674040QcE c674040QcE6 = this.LIZ.LLLIIL;
                        if (c674040QcE6 != null) {
                            c674040QcE6.LIZJ();
                            return;
                        }
                        return;
                    default:
                        throw new C1954807lC();
                }
            }

            @Override // X.InterfaceC674710QdJ
            public final void LIZIZ(List<Float> list) {
                C674040QcE c674040QcE = this.LIZ.LLLIIL;
                if (c674040QcE != null) {
                    c674040QcE.LJ(list);
                }
            }

            @Override // X.InterfaceC674710QdJ
            public final void t3(C674630QdB c674630QdB) {
                InterfaceC671770QWp interfaceC671770QWpHh1;
                ISearchBarContextAbility iSearchBarContextAbility = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), ISearchBarContextAbility.class, null);
                if (iSearchBarContextAbility != null && (interfaceC671770QWpHh1 = iSearchBarContextAbility.Hh1()) != null) {
                    interfaceC671770QWpHh1.t3(c674630QdB);
                }
            }
        };
        this.LLLLIILL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 147));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 146));
        this.LLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 148));
    }

    public final FrameLayout Ap() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u7m) : null;
            this.LLJJIJIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C0I7D Bp() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u9v) : null;
            this.LLJJIII = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return ((Boolean) C274980Aq8.LIZ.getValue()).booleanValue() ? R.layout.br0 : R.layout.bqz;
    }

    public final C427110Gov Ep() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tv_search_textview_enhanced) : null;
            this.LLL = (C427110Gov) viewFindViewById;
        }
        return (C427110Gov) viewFindViewById;
    }

    public final TuxIconView Fp() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ufd) : null;
            this.LLJJL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxIconView Gp() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ggz) : null;
            this.LLJLIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final ViewGroup Ip() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.gh0) : null;
            this.LLJL = (ViewGroup) viewFindViewById;
        }
        return (ViewGroup) viewFindViewById;
    }

    public final C19U1 Jp() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.gh1) : null;
            this.LLJLILLLLZIIL = (C19U1) viewFindViewById;
        }
        return (C19U1) viewFindViewById;
    }

    public final TuxTextView Qp() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tv_search_textview) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Up() {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.Up():void");
    }

    public final C1357120lQ6 hp() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ggv) : null;
            this.LLJLLL = (C1357120lQ6) viewFindViewById;
        }
        return (C1357120lQ6) viewFindViewById;
    }

    public final TuxIconView ip() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f677bn3) : null;
            this.LLJJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxIconView kp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cor) : null;
            this.LLJJIJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final boolean lp() {
        return ((Boolean) this.LLLIIIIL.getValue()).booleanValue();
    }

    public final ViewGroup mp() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jp2) : null;
            this.LLJJJJ = (ViewGroup) viewFindViewById;
        }
        return (ViewGroup) viewFindViewById;
    }

    public final TuxIconView op() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kp6) : null;
            this.LLJJJJJIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final LinearLayout sp() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ng_) : null;
            this.LLJJJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout tp() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ng9) : null;
            this.LLJJJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final NextLiveData<Boolean> uO() {
        C674040QcE c674040QcE = this.LLLIIL;
        if (c674040QcE != null) {
            return c674040QcE.LIZJ;
        }
        return null;
    }

    public final TuxTextView up() {
        View viewFindViewById = this.LLLF;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ggw) : null;
            this.LLLF = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ECSearchBarAssemVM yp() {
        AssemVMLazy assemVMLazy = this.LLLILZLLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLILI;
        return (ECSearchBarAssemVM) assemVMLazy.getValue();
    }

    public final View zp() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u7c) : null;
            this.LLJJJJLIIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    public final View Gu() {
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility != null) {
            return iSearchResultSubPageAbility.Gu();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.HandleBackPressAbility
    public final void LLZLL() {
        TriggerRetentionPopUpAbility triggerRetentionPopUpAbility;
        Editable editableLLLLJI;
        C0QUT c0qut = yp().LLILZLL;
        EcSearchSugInputABModel ecSearchSugInputABModelLIZ = C0QXC.LIZ();
        if (c0qut == C0QUT.SUG && ecSearchSugInputABModelLIZ.enable) {
            C0I7D c0i7dBp = Bp();
            C0QT8.LIZIZ(Xp(), (c0i7dBp == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7dBp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null))) == null) ? null : editableLLLLJI.toString());
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL == null || (triggerRetentionPopUpAbility = (TriggerRetentionPopUpAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, TriggerRetentionPopUpAbility.class, null)) == null || !triggerRetentionPopUpAbility.Bs()) {
            C0QUG.LIZJ = true;
            C672020QXo c672020QXoLIZ = C671780QWq.LIZ(C1558520qew.LJIIL(this));
            if (c672020QXoLIZ != null) {
                c672020QXoLIZ.LIZJ("click_return");
            }
            ISearchBarContextAbility iSearchBarContextAbility = yp().LLILZ;
            if (iSearchBarContextAbility != null) {
                iSearchBarContextAbility.X6();
            }
            C0QUG.LIZJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    public final View Le() {
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility != null) {
            return iSearchResultSubPageAbility.Le();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    public final View Lu() {
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility != null) {
            return iSearchResultSubPageAbility.Lu();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final C19U1 R01() {
        return Jp();
    }

    public final void Tp() {
        boolean z;
        ISearchBarContextAbility iSearchBarContextAbility;
        InterfaceC671770QWp interfaceC671770QWpHh1;
        Editable editableLLZ;
        String string;
        String string2;
        CharSequence hint;
        EcSearchBarAsrHelper ecSearchBarAsrHelper;
        C674630QdB c674630QdB;
        String string3;
        Editable editableLLZ2;
        if (C672250QYl.LIZLLL() && (ecSearchBarAsrHelper = this.LLLIILIL) != null && (c674630QdB = ecSearchBarAsrHelper.LJ) != null) {
            C1357120lQ6 c1357120lQ6Hp = hp();
            if (c1357120lQ6Hp == null || (editableLLZ2 = C2204961BRm.LLZ(c1357120lQ6Hp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null))) == null || (string3 = editableLLZ2.toString()) == null) {
                string3 = "";
            }
            c674630QdB.LJIILL = string3;
            C674620QdA.LIZJ(c674630QdB);
        }
        C1357120lQ6 c1357120lQ6Hp2 = hp();
        String string4 = (c1357120lQ6Hp2 == null || (hint = c1357120lQ6Hp2.getHint()) == null) ? null : hint.toString();
        C1357120lQ6 c1357120lQ6Hp3 = hp();
        if (c1357120lQ6Hp3 == null || (editableLLZ = C2204961BRm.LLZ(c1357120lQ6Hp3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null))) == null || (string = editableLLZ.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null || string2.length() == 0) {
            z = true;
        } else {
            z = false;
            string4 = string2;
        }
        if (!C123100dR.LIZ(string4) || (iSearchBarContextAbility = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchBarContextAbility.class, null)) == null || (interfaceC671770QWpHh1 = iSearchBarContextAbility.Hh1()) == null) {
            return;
        }
        interfaceC671770QWpHh1.NQ(z, string4, yp().LLIZLLLIL);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    public final View Wu() {
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility != null) {
            return iSearchResultSubPageAbility.Wu();
        }
        return null;
    }

    public final int Xp() {
        int iLIZ;
        C0QVH c0qvhBf;
        ISearchBarContextAbility iSearchBarContextAbility = yp().LLILZ;
        C0QER c0qer = (iSearchBarContextAbility == null || (c0qvhBf = iSearchBarContextAbility.Bf()) == null) ? null : c0qvhBf.LJIILL;
        if (c0qer == null) {
            return 0;
        }
        try {
            iLIZ = c0qer.getEcSearchEntranceData() != null ? C650500PfM.LIZ(c0qer.getEcSearchEntranceData()) : c0qer.getEcSearchEntranceValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (iLIZ > 0) {
            return iLIZ;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final EditText Xv() {
        return Bp();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void f7() {
        View viewZp = zp();
        C0I7D c0i7dBp = Bp();
        if (c0i7dBp == null || viewZp == null) {
            return;
        }
        C20575915fJ c20575915fJ = new C20575915fJ(viewZp, c0i7dBp);
        this.LLLIL = c20575915fJ;
        c20575915fJ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final MutableLiveData h02() {
        return yp().LLILLL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (lp()) {
            C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), IEcSearchMiddlePageContextAbility.class, null);
        }
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), ISearchCartContextAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), ISearchBarAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), SwitchThemeAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), HandleBackPressAbility.class, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ, null);
            if (lp()) {
                C1558520qew.LJII(interfaceC665370Q7zLJI, (InterfaceC494301wD) this.LLLLIL.getValue(), IEcSearchMiddlePageContextAbility.class, null, null);
            }
            C1558520qew.LJII(interfaceC665370Q7zLJI, this, ISearchBarAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJI, this, SwitchThemeAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJI, this, HandleBackPressAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final boolean dv() {
        return this.LLLJIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void O6(String str) {
        Bp().setText(str);
        if (Bp().isFocused()) {
            Bp().setSelection(str.length());
        }
    }

    public final void Vp(EnumC671650QWd enumC671650QWd) {
        View viewLJI;
        int i;
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = null;
        if (context != null && (viewLJI = ((IPhotoSearchService) ServiceManager.get().getService(IPhotoSearchService.class)).LJI(context, C0QL2.SEARCH_MIDDLE, new InterfaceC676430Qg5() { // from class: X.0QVG
            @Override // X.InterfaceC676430Qg5
            public final PhotoSearchBusinessEnterParams LIZ() {
                C0QER c0qer;
                ISearchBarContextAbility iSearchBarContextAbility = this.LIZ.yp().LLILZ;
                C0QVH c0qvhBf = iSearchBarContextAbility != null ? iSearchBarContextAbility.Bf() : null;
                ISearchBarContextAbility iSearchBarContextAbility2 = this.LIZ.yp().LLILZ;
                C0QVP c0qvpZm = iSearchBarContextAbility2 != null ? iSearchBarContextAbility2.Zm() : null;
                PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(null, null, null, null, "", 0, "", "", "", null, null, null, "", "", "", null, null, null, null, C0QXR.MALL.getValue(), null, null, null, null, null, null, null, String.valueOf(System.currentTimeMillis()));
                photoSearchBusinessEnterParams.setEnterFrom(C0QR7.LIZIZ(c0qvhBf != null ? c0qvhBf.LJIILL : null));
                photoSearchBusinessEnterParams.setRootEnterFromType(C650500PfM.LIZIZ(c0qvhBf != null ? c0qvhBf.LJIILL : null));
                photoSearchBusinessEnterParams.setTrafficSourceList(c0qvhBf != null ? c0qvhBf.LJIIIIZZ : null);
                C0QUT c0qut = c0qvpZm != null ? c0qvpZm.LIZLLL : null;
                C0QUT c0qut2 = C0QUT.RESULT;
                photoSearchBusinessEnterParams.setFromMiddleBackFromResult(c0qut == c0qut2 ? "1" : CardStruct.IStatusCode.DEFAULT);
                photoSearchBusinessEnterParams.setGroupId((c0qvhBf == null || (c0qer = c0qvhBf.LJIILL) == null) ? null : c0qer.getGroupId());
                photoSearchBusinessEnterParams.setFromVideo(c0qvhBf != null ? Integer.valueOf(c0qvhBf.LJIIIZ) : null);
                photoSearchBusinessEnterParams.setFromComment(c0qvhBf != null ? c0qvhBf.LJIIJ : null);
                photoSearchBusinessEnterParams.setLastFromGroupId(c0qvhBf != null ? c0qvhBf.LJIIJJI : null);
                photoSearchBusinessEnterParams.setAttachProducts(c0qvhBf != null ? c0qvhBf.LJIIL : null);
                photoSearchBusinessEnterParams.setPersonalContextInfo(c0qvhBf != null ? c0qvhBf.LJIILJJIL : null);
                photoSearchBusinessEnterParams.setPhotoSearchPreviousPage((c0qvpZm != null ? c0qvpZm.LIZLLL : null) == c0qut2 ? "search_result_page" : "search_middle_page");
                photoSearchBusinessEnterParams.setPhotoSearchPreviousSearchType("shop");
                photoSearchBusinessEnterParams.setOriginIsMallTab("mall");
                photoSearchBusinessEnterParams.setSearchChannel("tiktok_mall_photo_search");
                return photoSearchBusinessEnterParams;
            }

            @Override // X.InterfaceC676430Qg5
            public final PhotoSearchLogEnterParams LIZIZ() {
                C0QVP c0qvpZm;
                C0QVP c0qvpZm2;
                C0QVH c0qvhBf;
                C0QUT c0qut = null;
                PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(null, null, null, null, null, null, null, null, null, null, null, null, null);
                ECSearchBarAssem eCSearchBarAssem = this.LIZ;
                ISearchBarContextAbility iSearchBarContextAbility = eCSearchBarAssem.yp().LLILZ;
                C0QER c0qer = (iSearchBarContextAbility == null || (c0qvhBf = iSearchBarContextAbility.Bf()) == null) ? null : c0qvhBf.LJIILL;
                ISearchBarContextAbility iSearchBarContextAbility2 = eCSearchBarAssem.yp().LLILZ;
                photoSearchLogEnterParams.setSearchType((iSearchBarContextAbility2 == null || (c0qvpZm2 = iSearchBarContextAbility2.Zm()) == null) ? null : c0qvpZm2.LIZIZ);
                ISearchBarContextAbility iSearchBarContextAbility3 = eCSearchBarAssem.yp().LLILZ;
                if (iSearchBarContextAbility3 != null && (c0qvpZm = iSearchBarContextAbility3.Zm()) != null) {
                    c0qut = c0qvpZm.LIZLLL;
                }
                photoSearchLogEnterParams.setSourcePageName(c0qut == C0QUT.RESULT ? "search_result_page" : "search_middle_page");
                photoSearchLogEnterParams.setSearchEntrance(C0QR7.LIZJ(c0qer));
                photoSearchLogEnterParams.setEnterFromSecond(C0QR7.LIZIZ(c0qer));
                photoSearchLogEnterParams.setSearchEntranceSecond(C0QR7.LIZIZ(c0qer));
                photoSearchLogEnterParams.setPhotoSearchModule("visual_search");
                return photoSearchLogEnterParams;
            }
        }, new AwS554S0100000_10(this, 1180))) != null) {
            if (enumC671650QWd == EnumC671650QWd.END_WITH_SPLIT || enumC671650QWd == EnumC671650QWd.END_WITHOUT_SPLIT) {
                sp().addView(viewLJI);
                this.LLLL = true;
            }
            if (enumC671650QWd == EnumC671650QWd.START_WITH_SPLIT) {
                LinearLayout linearLayoutTp = tp();
                if (linearLayoutTp != null) {
                    linearLayoutTp.addView(viewLJI);
                }
                this.LLLL = true;
            }
            this.LLLFFI = viewLJI.findViewById(R.id.qdh);
            this.LLLI = (ViewGroup) viewLJI.findViewById(R.id.qde);
            this.LLLFZ = (TuxIconView) viewLJI.findViewById(R.id.qdd);
            if (((Boolean) C274980Aq8.LIZ.getValue()).booleanValue()) {
                View view = this.LLLFFI;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                        C786410Ut5.W5(view, marginLayoutParams);
                    }
                }
                TuxIconView tuxIconView = this.LLLFZ;
                if (tuxIconView != null) {
                    if (lp()) {
                        i = 16;
                    } else {
                        i = 14;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                    tuxIconView.setPadding(0, 0, 0, 0);
                    ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        layoutParams = layoutParams3;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        marginLayoutParams2.setMarginStart(0);
                        marginLayoutParams2.setMarginEnd(iLIZIZ);
                        C786410Ut5.W5(tuxIconView, marginLayoutParams2);
                    }
                }
            }
        }
    }

    public final void aq(boolean z) {
        C0QER c0qer;
        String strWQ2;
        String string;
        Object objObtainLogData;
        String string2;
        C0QVP c0qvpZm;
        C0QVH c0qvhBf;
        if (getContext() == null) {
            return;
        }
        if (!z) {
            ViewGroup viewGroupMp = mp();
            if (viewGroupMp != null) {
                C786410Ut5.LJLZ(8, viewGroupMp);
            }
            C0I7D c0i7dBp = Bp();
            if (c0i7dBp != null) {
                c0i7dBp.setPadding(0, 0, 0, 0);
                return;
            }
            return;
        }
        C0QWU c0qwu = yp().LLILZIL;
        if (c0qwu != null) {
            C670090QQd c670090QQd = new C670090QQd();
            ISearchBarContextAbility iSearchBarContextAbility = yp().LLILZ;
            String str = null;
            if (iSearchBarContextAbility != null && (c0qvhBf = iSearchBarContextAbility.Bf()) != null) {
                c0qer = c0qvhBf.LJIILL;
            } else {
                c0qer = null;
            }
            c670090QQd.setEnterParam(c0qer);
            ISearchBarContextAbility iSearchBarContextAbility2 = yp().LLILZ;
            if (iSearchBarContextAbility2 != null && (c0qvpZm = iSearchBarContextAbility2.Zm()) != null) {
                str = c0qvpZm.LIZIZ;
            }
            c670090QQd.setReentrantSearch(C123100dR.LIZ(str));
            CharSequence hint = Bp().getHint();
            if (hint == null || (string2 = hint.toString()) == null || (strWQ2 = a0.LJLIIIL(string2).toString()) == null) {
                strWQ2 = yp().wQ2();
            }
            c670090QQd.setHintWord(strWQ2);
            C0QER enterParam = c670090QQd.getEnterParam();
            if (enterParam == null || (objObtainLogData = enterParam.obtainLogData("hint_imp_id")) == null || (string = objObtainLogData.toString()) == null) {
                string = "";
            }
            c670090QQd.setImprId(string);
            C0I7D c0i7dBp2 = Bp();
            if (c0i7dBp2 != null) {
                C680790Qn7 c680790Qn7 = C680790Qn7.LIZ;
                AwS254S0300000_10 awS254S0300000_10 = new AwS254S0300000_10(this, c0qwu, c670090QQd, 2);
                c680790Qn7.getClass();
                HandlerHook.viewPost(c0i7dBp2, new RunnableC514801zW(awS254S0300000_10, (Function0<Unit>) 195));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dq(boolean r9) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.dq(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void fc(Long l) {
        C20575915fJ c20575915fJ = this.LLLIL;
        if (c20575915fJ == null) {
            return;
        }
        c20575915fJ.LIZJ(l);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void gw(EnumC671640QWc enumC671640QWc) {
        if (this.LLLIL == null) {
            return;
        }
        int i = C0QWS.LIZ[enumC671640QWc.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C20575915fJ c20575915fJ = this.LLLIL;
                if (c20575915fJ != null) {
                    c20575915fJ.LJFF = false;
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C20575915fJ c20575915fJ2 = this.LLLIL;
        if (c20575915fJ2 == null) {
            return;
        }
        c20575915fJ2.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void kA0(EnumC671670QWf enumC671670QWf) throws Throwable {
        Editable editableLLZ;
        Editable editableLLZ2;
        Editable editableLLLLJI;
        Editable editableLLLLJI2;
        C674040QcE c674040QcE;
        int length = 0;
        if (C672250QYl.LIZLLL() && (c674040QcE = this.LLLIIL) != null && c674040QcE.LIZIZ.isVoiceFlow()) {
            EcSearchBarAsrHelper ecSearchBarAsrHelper = this.LLLIILIL;
            if (ecSearchBarAsrHelper != null) {
                ecSearchBarAsrHelper.LIZIZ(true);
            }
            C674040QcE c674040QcE2 = this.LLLIIL;
            if (c674040QcE2 != null && c674040QcE2.LIZIZ.isRecording()) {
                c674040QcE2.LIZ(c674040QcE2.LIZIZ, EnumC674020QcC.AI_SEARCH);
            }
        }
        int i = C0QWS.LIZLLL[enumC671670QWf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1357120lQ6 c1357120lQ6Hp = hp();
                if (c1357120lQ6Hp != null) {
                    C0I7D c0i7dBp = Bp();
                    if (c0i7dBp != null) {
                        editableLLLLJI2 = C2204961BRm.LLLLJI(c0i7dBp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null));
                    } else {
                        editableLLLLJI2 = null;
                    }
                    c1357120lQ6Hp.setText(editableLLLLJI2);
                }
                C1357120lQ6 c1357120lQ6Hp2 = hp();
                if (c1357120lQ6Hp2 != null) {
                    C0I7D c0i7dBp2 = Bp();
                    if (c0i7dBp2 != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7dBp2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null))) != null) {
                        length = editableLLLLJI.length();
                    }
                    c1357120lQ6Hp2.setSelection(length);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C0I7D c0i7dBp3 = Bp();
        if (c0i7dBp3 != null) {
            C1357120lQ6 c1357120lQ6Hp3 = hp();
            if (c1357120lQ6Hp3 != null) {
                editableLLZ2 = C2204961BRm.LLZ(c1357120lQ6Hp3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null));
            } else {
                editableLLZ2 = null;
            }
            c0i7dBp3.setText(editableLLZ2);
        }
        C0I7D c0i7dBp4 = Bp();
        if (c0i7dBp4 == null) {
            return;
        }
        C1357120lQ6 c1357120lQ6Hp4 = hp();
        if (c1357120lQ6Hp4 != null && (editableLLZ = C2204961BRm.LLZ(c1357120lQ6Hp4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null))) != null) {
            length = editableLLZ.length();
        }
        c0i7dBp4.setSelection(length);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6 A[PHI: r7
      0x00d6: PHI (r7v22 android.view.View) = (r7v21 android.view.View), (r7v30 android.view.View) binds: [B:36:0x00c3, B:41:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f A[PHI: r7
      0x010f: PHI (r7v25 android.view.View) = (r7v24 android.view.View), (r7v27 android.view.View) binds: [B:47:0x00fc, B:52:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void pD0(EnumC671670QWf enumC671670QWf) {
        C674040QcE c674040QcE = this.LLLIIL;
        if (c674040QcE != null) {
            c674040QcE.LIZLLL(enumC671670QWf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void sJ1(Word word) {
        C0QER c0qer;
        String string;
        C0QVP c0qvpZm;
        String str;
        SearchResultParam searchResultParam;
        String str2;
        String str3;
        C0QVH c0qvhBf;
        C0QVH c0qvhBf2;
        C0QPB c0qpbLLJILJIL;
        C0QVP c0qvpZm2;
        String string2;
        C0QVH c0qvhBf3;
        ISearchBarContextAbility iSearchBarContextAbility = yp().LLILZ;
        String str4 = null;
        if (iSearchBarContextAbility != null && (c0qvhBf3 = iSearchBarContextAbility.Bf()) != null) {
            c0qer = c0qvhBf3.LJIILL;
        } else {
            c0qer = null;
        }
        String strWQ2 = yp().wQ2();
        CharSequence hint = Bp().getHint();
        if (hint != null && (string2 = hint.toString()) != null) {
            string = a0.LJLIIIL(string2).toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(strWQ2, string) && C123100dR.LIZ(word.getWord())) {
            if (((Number) C107800ay.LIZ.getValue()).intValue() == 1 || (c0qer != null && c0qer.isSetHintBySugWord())) {
                Bp().setHint(word.getWord());
                C646000PVm c646000PVm = C650950Pg5.Companion;
                Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(LJJIJL());
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(word, 78);
                c646000PVm.getClass();
                C646000PVm.LJIILJJIL(fragmentLIZLLL, c19egLIZ, awS589S0100000_10);
                if (c0qer != null) {
                    c0qer.setSearchHint(word.getWord());
                }
                yp().LLIZ = word;
                ISearchBarContextAbility iSearchBarContextAbility2 = yp().LLILZ;
                if (iSearchBarContextAbility2 != null) {
                    c0qvpZm = iSearchBarContextAbility2.Zm();
                } else {
                    c0qvpZm = null;
                }
                if (C1202404n8.LIZ()) {
                    ISearchBarContextAbility iSearchBarContextAbility3 = yp().LLILZ;
                    if (iSearchBarContextAbility3 != null && (c0qvpZm2 = iSearchBarContextAbility3.Zm()) != null) {
                        str = c0qvpZm2.LIZIZ;
                    } else {
                        str = null;
                    }
                    String strLIZLLL = C0QR7.LIZLLL(c0qer, str);
                    String word2 = word.getWord();
                    String implId = word.getImplId();
                    ISearchBarContextAbility iSearchBarContextAbility4 = (ISearchBarContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchBarContextAbility.class, null);
                    if (iSearchBarContextAbility4 != null && (c0qpbLLJILJIL = iSearchBarContextAbility4.LLJILJIL()) != null) {
                        searchResultParam = c0qpbLLJILJIL.LLILZ;
                    } else {
                        searchResultParam = null;
                    }
                    ISearchBarContextAbility iSearchBarContextAbility5 = yp().LLILZ;
                    if (iSearchBarContextAbility5 != null && (c0qvhBf2 = iSearchBarContextAbility5.Bf()) != null) {
                        str2 = c0qvhBf2.LJIIZILJ;
                    } else {
                        str2 = null;
                    }
                    ISearchBarContextAbility iSearchBarContextAbility6 = yp().LLILZ;
                    if (iSearchBarContextAbility6 != null && (c0qvhBf = iSearchBarContextAbility6.Bf()) != null) {
                        str3 = c0qvhBf.LJIJ;
                    } else {
                        str3 = null;
                    }
                    C670080QQc.LIZJ(true, strLIZLLL, word2, implId, null, searchResultParam, c0qer, null, str2, str3);
                }
                if (c0qvpZm != null) {
                    str4 = c0qvpZm.LIZIZ;
                }
                C670080QQc.LIZIZ(c0qer, word, C123100dR.LIZ(str4));
            }
        }
    }

    public final void Wp(Long l, boolean z) {
        EcomPersonalizedToastAbility ecomPersonalizedToastAbility = (EcomPersonalizedToastAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), EcomPersonalizedToastAbility.class, null);
        if (ecomPersonalizedToastAbility != null) {
            ecomPersonalizedToastAbility.dismiss();
        }
        if (l == null) {
            KeyboardUtils.LIZLLL(Bp());
        } else {
            if (l.longValue() < 0) {
                return;
            }
            HandlerHook.viewPostDelay(Bp(), new ARunnableS29S0110000_10(this, z, 0), l.longValue());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(2:4|(1:6))|7|(9:9|(1:11)(1:259)|12|(1:258)(1:16)|17|(1:19)(1:257)|20|(1:(1:23)(1:255))(1:256)|24)|25|(1:253)(17:29|(0)(1:35)|36|(6:(1:(1:169)(2:237|SW:238))|170|(3:(1:(1:(1:(2:176|(1:178)(2:301|302))(3:223|(1:225)|235))(3:226|(1:228)|235))(3:229|(1:231)|235))(3:232|(1:234)|235)|199|(1:(3:(1:203)(1:222)|204|(2:(2:209|(1:211))|(2:215|(1:217)))(1:(3:207|(0)|(3:213|215|(0)))))(3:(1:219)(0)|204|(0)(0)))(3:(1:221)(0)|204|(0)(0)))(1:236)|(4:180|(8:182|(1:184)|185|(1:187)|188|(1:190)|191|(1:193))|194|(2:196|(1:198)))|199|(0)(0))|39|(11:41|(8:43|(4:45|(1:47)|48|(1:50))|51|(4:53|(1:55)|56|(1:58))|59|(1:61)|62|(1:64))|65|(1:67)|68|(1:80)|81|(1:101)(1:85)|86|(1:100)(1:96)|97)(10:102|(8:104|(4:106|(1:108)|109|(1:111))|112|(4:114|(1:116)|117|(1:119))|120|(1:122)|123|(1:125))|126|(1:128)|129|(1:156)(1:133)|134|(1:155)(1:138)|139|(4:142|(1:154)(1:148)|149|(1:153)))|304|(2:260|(1:262))(9:(1:264)|267|(1:300)(1:275)|276|(3:296|(1:298)|299)(1:280)|281|(2:283|(1:(1:294))(3:286|(1:288)|289))|290|291)|303|267|(2:269|300)(0)|276|(4:278|296|(0)|299)(3:296|(0)|299)|281|(0)|290|291)|254|36|(1:(7:158|(2:167|169)(1:252)|170|(0)(0)|(0)|199|(0)(0))(0))(0)|39|(0)(0)|304|(0)(0)|303|267|(0)(0)|276|(0)(0)|281|(0)|290|291) */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x042c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x042d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x032c A[PHI: r7
      0x032c: PHI (r7v6 java.lang.Integer) = (r7v5 java.lang.Integer), (r7v9 java.lang.Integer) binds: [B:205:0x0324, B:207:0x0328] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x040a A[Catch: all -> 0x042c, TRY_ENTER, TryCatch #0 {all -> 0x042c, blocks: (B:264:0x041e, B:260:0x040a, B:262:0x040e), top: B:304:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    @Override // X.C0QPH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pc(X.C0QUT r14, X.C0QUT r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.pc(X.0QUT, X.0QUT):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void rc2(boolean z, boolean z2) {
        C0I7D c0i7dBp;
        if (z2) {
            c0i7dBp = hp();
        } else {
            c0i7dBp = Bp();
        }
        int length = 0;
        if (c0i7dBp != null && c0i7dBp.isFocused() == z) {
            return;
        }
        if (z) {
            if (c0i7dBp != null) {
                if (!c0i7dBp.isFocused()) {
                    c0i7dBp.requestFocus();
                    Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7dBp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs=", null));
                    if (editableLLLLJI != null) {
                        length = editableLLLLJI.length();
                    }
                    c0i7dBp.setSelection(length);
                    return;
                }
            } else {
                return;
            }
        } else if (c0i7dBp == null) {
            return;
        }
        c0i7dBp.clearFocus();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136  */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sf1(final X.C0QLM r19, android.view.View r20, final com.bytedance.lighten.loader.SmartImageView r21, java.lang.String r22, final boolean r23) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.sf1(X.0QLM, android.view.View, com.bytedance.lighten.loader.SmartImageView, java.lang.String, boolean):void");
    }
}
