package com.ss.android.ugc.aweme.socialavatar.mixstudio.share;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01GW;
import X.C0HSS;
import X.C1110404Vy;
import X.C1356540lPA;
import X.C1356560lPC;
import X.C1356570lPD;
import X.C1362230lYL;
import X.C1363630lab;
import X.C1370970lmR;
import X.C1371590lnR;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C1590970rVH;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C19MB;
import X.C19ME;
import X.C20742216Eq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C424780GlA;
import X.C452501pT;
import X.C454520Hs2;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897520ZIw;
import X.EnumC1364050lbH;
import X.InterfaceC1355580lNc;
import X.InterfaceC1356370lOt;
import X.InterfaceC1356390lOv;
import X.InterfaceC1356400lOw;
import X.InterfaceC1362600lYw;
import X.InterfaceC1364710lcL;
import X.InterfaceC1366280les;
import X.InterfaceC2217461Bqa;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class MixStudioShareDMAssem extends UIContentAssem implements IMixStudioShareDMAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public InterfaceC1356370lOt LLJI;
    public InterfaceC1356400lOw LLJIJIL;
    public InterfaceC1356390lOv LLJILJIL;
    public RecyclerView LLJILJILJ;
    public ViewGroup LLJILLL;
    public ViewGroup LLJJ;
    public FrameLayout LLJJI;
    public InterfaceC1366280les LLJJIII;
    public InterfaceC1355580lNc LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public C20742216Eq LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C454520Hs2 LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixStudioShareDMAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/share/MixStudioShareViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0Hs2] */
    public MixStudioShareDMAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioShareViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 689), AFwS236S0000000_6.get$arr$(332), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C0HSS.class, null), checkSupervisorPrepared());
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 688));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(329));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 824));
        this.LLJJJJLIIL = new InterfaceC1362600lYw() { // from class: X.0Hs2
            @Override // X.InterfaceC1362600lYw
            public final void LIZ(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZIZ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LIZLLL(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJFF(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJI(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJII(Dialog dialog, SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final boolean LJIIIIZZ(SharePackage sharePackage) {
                return true;
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIJ(SharePackage sharePackage, String str) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIJJI(SharePackage sharePackage) {
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIILIIL() {
                Fragment fragmentLJI = C724240Sb0.LJI(this.LIZ);
                if (fragmentLJI != null) {
                    String str = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
                }
            }

            @Override // X.InterfaceC1362600lYw
            public final void LJIIL(SharePackage sharePackage) {
                this.LIZ.Go().vQ2();
            }
        };
        this.LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 826));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 825));
    }

    public final MixStudioShareViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (MixStudioShareViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.share.IMixStudioShareDMAbility
    public final C1371590lnR Z2() {
        return (C1371590lnR) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLJJJJ.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
        C897520ZIw c897520ZIw2 = (C897520ZIw) this.LLJJJJ.getValue();
        if (c897520ZIw2 != null) {
            c897520ZIw2.destroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        BaseSharePackage baseSharePackage;
        SharePackage sharePackage;
        Window window;
        C1371590lnR c1371590lnR;
        Fragment fragmentLJI;
        ConstraintLayout constraintLayout;
        BaseSharePackage baseSharePackage2;
        SharePackage sharePackage2;
        AbstractC21673619ry abstractC21673619ry;
        super.onViewCreated(view);
        this.LLJILJILJ = (RecyclerView) view.findViewById(R.id.g1l);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.nwo);
        this.LLJJ = (ViewGroup) view.findViewById(R.id.a2s);
        C1371590lnR c1371590lnR2 = (C1371590lnR) this.LLJJJIL.getValue();
        View decorView = null;
        if (c1371590lnR2 != null) {
            baseSharePackage = c1371590lnR2.LJIJJ;
        } else {
            baseSharePackage = null;
        }
        if (baseSharePackage instanceof SharePackage) {
            sharePackage = (SharePackage) baseSharePackage;
        } else {
            sharePackage = null;
        }
        if (sharePackage != null) {
            IInternalShareApi.LIZ.getClass();
            InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
            C1356540lPA c1356540lPA = (C1356540lPA) this.LLJJL.getValue();
            Fragment fragmentLIZ = C1590970rVH.LIZ(this);
            C897520ZIw c897520ZIw = (C897520ZIw) this.LLJJJJ.getValue();
            C1356570lPD c1356570lPD = (C1356570lPD) this.LLJJJJJIL.getValue();
            C1362230lYL c1362230lYL = new C1362230lYL();
            c1362230lYL.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            c1362230lYL.LJIILL = Integer.valueOf(R.attr.a1e);
            Pair<InterfaceC1356400lOw, InterfaceC1356370lOt> pairLJJJJL = interfaceC1364710lcLLIZIZ.LJJJJL(sharePackage, c1356540lPA, false, false, false, fragmentLIZ, null, new C1363630lab(false, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)), 2, true, EnumC1364050lbH.MASK_WITH_CHECK_MARK), true, c1362230lYL, c897520ZIw, c1356570lPD, null);
            InterfaceC1356400lOw first = pairLJJJJL.getFirst();
            InterfaceC1356370lOt second = pairLJJJJL.getSecond();
            this.LLJIJIL = first;
            RecyclerView recyclerView = this.LLJILJILJ;
            if (recyclerView != null) {
                if (first instanceof AbstractC21673619ry) {
                    abstractC21673619ry = (AbstractC21673619ry) first;
                } else {
                    abstractC21673619ry = null;
                }
                recyclerView.setAdapter(abstractC21673619ry);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
                recyclerView.addItemDecoration(new C424780GlA(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
            }
            this.LLJI = second;
            if (second != null) {
                second.refresh();
            }
            C897520ZIw c897520ZIw2 = (C897520ZIw) this.LLJJJJ.getValue();
            if (c897520ZIw2 != null) {
                c897520ZIw2.LJ();
            }
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C1371590lnR c1371590lnR3 = (C1371590lnR) this.LLJJJIL.getValue();
            if (c1371590lnR3 != null) {
                baseSharePackage2 = c1371590lnR3.LJIJJ;
            } else {
                baseSharePackage2 = null;
            }
            if ((baseSharePackage2 instanceof SharePackage) && (sharePackage2 = (SharePackage) baseSharePackage2) != null) {
                IInternalShareApi.LIZ.getClass();
                this.LLJILJIL = C1370970lmR.LIZ().LIZIZ().LJJIJIIJI(fragmentLJI2, sharePackage2, C13BV.INSTANCE, this.LLJJJJLIIL, this.LLJI);
            }
        }
        Context context = getContext();
        if (context != null && (c1371590lnR = (C1371590lnR) this.LLJJJIL.getValue()) != null && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            Bundle bundle = c1371590lnR.LJIJJ.extras;
            bundle.putBoolean("comment_direct_share", false);
            bundle.putBoolean("key_force_cover_style", true);
            bundle.putBoolean("key_force_operation_layout_background", true);
            bundle.putBoolean("key_force_operation_layout_divider", true);
            this.LLJJJ = (C20742216Eq) LJJIJL().findViewById(R.id.jcw);
            IInternalShareApi.LIZ.getClass();
            this.LLJJIJIL = C1370970lmR.LIZ().LIZIZ().LJJIL();
            Pair<FrameLayout, InterfaceC1366280les> pairLJJIJIL = C1370970lmR.LIZ().LIZIZ().LJJIJIL(context, c1371590lnR, fragmentLJI, this.LLJJJJLIIL);
            FrameLayout first2 = pairLJJIJIL.getFirst();
            InterfaceC1366280les second2 = pairLJJIJIL.getSecond();
            if (first2 != null) {
                first2.setId(R.id.kwx);
                first2.setClickable(true);
            }
            this.LLJJI = first2;
            this.LLJJIII = second2;
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) viewLJJIJL) != null) {
                constraintLayout.addView(this.LLJJI, new C19ME(-1, -2));
                FrameLayout frameLayout = this.LLJJI;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJIIIIZZ(R.id.kwx, 4, R.id.jcw, 3);
                c19mb.LIZIZ(constraintLayout);
            }
        }
        IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
        Context context2 = getContext();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(context2, decorView);
        this.LLJJIJI = keyboardFakePopupWindowLIZ;
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = (C1356560lPC) this.LLJJLIIIJLLLLLLLZ.getValue();
        }
        InterfaceC1355580lNc interfaceC1355580lNc = this.LLJJIJI;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.show();
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0HTN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HTL) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 84), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0HTK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HTL) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 85), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0HTO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HTL) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 86), 4);
    }
}
