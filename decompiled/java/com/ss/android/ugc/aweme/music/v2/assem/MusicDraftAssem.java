package com.ss.android.ugc.aweme.music.v2.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09HN;
import X.C09R3;
import X.C0C0Z;
import X.C0CHQ;
import X.C0LAB;
import X.C0M4M;
import X.C0PEM;
import X.C13LE;
import X.C1410250mnn;
import X.C1415860mwq;
import X.C1443040neg;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C306580C0a;
import X.C452501pT;
import X.C562260M3k;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.creative.model.DetailPageRecallDraftModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDraftVM;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicDraftAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public AnonymousClass0956 LLJJI;
    public C0M4M LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C1415860mwq LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicDraftAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicDraftAssem.class, "musicDraftVM", "getMusicDraftVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDraftVM;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicDraftAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS566S0100000_22(c19719912DlLIZ, 225), AFwS261S0000000_22.get$arr$(82), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicDraftVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS566S0100000_22(c19719912DlLIZ2, 226), AFwS261S0000000_22.get$arr$(83), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(99));
        this.LLJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(100));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 217));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 228));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 218));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 219));
        this.LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 220));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 221));
        this.LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 227));
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 216));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 224));
        this.LLJLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 223));
        this.LLJLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 222));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dpz;
    }

    public final FrameLayout lp() {
        return (FrameLayout) this.LLJLILLLLZIIL.getValue();
    }

    public final MusicDraftVM mp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (MusicDraftVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (!C0C0Z.LIZ() || C306580C0a.LIZ()) {
            return;
        }
        C0CHQ.LIZ().LJI().LIZ().unregisterListener((C1443040neg) this.LLJLLL.getValue());
    }

    public final void yp() {
        AbstractC738140SxQ abstractC738140SxQ;
        ViewGroup viewGroup;
        ViewParent parent = getContentView().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(getContentView(), viewGroup);
        }
        LifecycleOwner parent2 = getParent();
        if (!(parent2 instanceof AbstractC738140SxQ) || (abstractC738140SxQ = (AbstractC738140SxQ) parent2) == null) {
            return;
        }
        C723850SaN.LJII(abstractC738140SxQ, C13LE.LIZ(MusicDraftAssem.class), null);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        mo127do();
        ViewParent parent = getContentView().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null && viewGroup.getChildCount() == 1 && Intrinsics.LJFF(viewGroup.getChildAt(0), getContentView())) {
            C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0nks
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C630870Oon) obj).LLILLJJLI;
                }
            }, null, new AwS636S0100000_22(this, 6), 6);
            C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0nkq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C630870Oon) obj).LL);
                }
            }, null, new AwS636S0100000_22(view, 7), 6);
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
            AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0mZY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C629660Omq) obj).LL;
                }
            }, this, null, null, null, new AwS600S0100000_21(this, 156), 28, null);
            C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0nkr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C630870Oon) obj).LLILLL);
                }
            }, null, new AwS636S0100000_22(this, 8), 6);
            if (C0C0Z.LIZ() && !C306580C0a.LIZ()) {
                C0CHQ.LIZ().LJI().LIZ().registerListener((C1443040neg) this.LLJLLL.getValue());
                return;
            }
            return;
        }
        yp();
    }

    public final void op(Context context) {
        ArrayList arrayListLIZ;
        C562260M3k c562260M3k;
        List<String> list;
        Bundle bundle = new Bundle();
        C0M4M c0m4m = this.LLJJIII;
        if (c0m4m != null && (c562260M3k = c0m4m.LIZLLL) != null && (list = c562260M3k.LIZIZ) != null) {
            arrayListLIZ = C09HN.LIZ(list);
        } else {
            arrayListLIZ = null;
        }
        C786410Ut5.LJJJIL(bundle, "subType_query_keyword", arrayListLIZ);
        C786410Ut5.LJJJI("subType_query_type", "music_detail", bundle);
        IAVDraftService iAVDraftService = (IAVDraftService) this.LLJJIJIL.getValue();
        if (iAVDraftService != null) {
            iAVDraftService.openDraftActivity(context, bundle);
        }
    }

    public final void sp(AwemeDraft awemeDraft) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            awemeDraft.LJIJI = 10;
            DetailPageRecallDraftModel detailPageRecallDraftModel = awemeDraft.LIZ.detailPageRecallDraftModel;
            detailPageRecallDraftModel.isDetailPageRecallDraft = 1;
            detailPageRecallDraftModel.isDetailPageRecallPath = 1;
            C0CHQ.LIZ().LJI().LJJ(c19egLIZ, awemeDraft, 10, null);
        }
    }

    public final void tp(boolean z) {
        C0M4M c0m4m = this.LLJJIII;
        if (c0m4m != null) {
            AnonymousClass0956 anonymousClass0956 = this.LLJJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJJI = C23250099c.LIZLLL((InterfaceC497601wk) this.LLJJJ.getValue(), C0PEM.LIZJ, null, new C1410250mnn(this, c0m4m, z, null), 2);
        }
    }

    public static void up(int i, String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "music_detail_page");
        c0lab.LJ("entrance_type", "cell");
        c0lab.LIZ(i, "draft_cnt");
        c0lab.LJ("click_type", str);
        c0lab.LJ("land_page", str2);
        C20684815ws.LJIILLIIL("recall_drafts_entrance_click", c0lab.LIZ);
    }
}
