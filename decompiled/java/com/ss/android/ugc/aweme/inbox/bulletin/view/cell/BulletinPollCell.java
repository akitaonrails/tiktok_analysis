package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0OV6;
import X.C0OVA;
import X.C0P4N;
import X.C1196320hEk;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C19719912Dl;
import X.C21568919b5;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C618680OOk;
import X.C619350OQz;
import X.C619660OSe;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import android.os.CountDownTimer;
import android.view.ViewStub;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPollCell extends BulletinBaseCell<C618680OOk> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public C619350OQz LLJLLL;
    public final AssemVMLazy LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPollCell.class, "pollVM", "getPollVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPollViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinPollCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinPollViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 733);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(330);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 744), awS553S0100000_9, AFwS195S0000000_9.get$arr$(185), new AwS553S0100000_9((C03K6) this, 719), new AwS553S0100000_9((C03K6) this, 721), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 723), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 725), null, new AwS553S0100000_9((C03K6) this, 726));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 720);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 722);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, 724);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 32));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 727);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 728);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 729);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 730);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 731);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 732), awS553S0100000_9, AFwS195S0000000_9.get$arr$(183), new AwS553S0100000_9((C03K6) this, 734), new AwS553S0100000_9((C03K6) this, 735), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 736), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 737), null, new AwS553S0100000_9((C03K6) this, 738));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 739), awS553S0100000_9, AFwS195S0000000_9.get$arr$(184), new AwS553S0100000_9((C03K6) this, 740), new AwS553S0100000_9((C03K6) this, 741), new AwS553S0100000_9((C03K6) this, 742), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 743));
        }
        this.LLJZ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void C6() {
        super.C6();
        if (this.LLJLLL == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d0c);
            boolean zTo = To();
            AssemVMLazy assemVMLazy = this.LLJZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
            BulletinPollViewModel bulletinPollViewModel = (BulletinPollViewModel) assemVMLazy.getValue();
            C0P4N c0p4n = new C0P4N(this, 0);
            BulletinListViewModel bulletinListViewModelF6 = f6();
            BulletinCommonAbility bulletinCommonAbilityA6 = a6();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
            this.LLJLLL = new C619350OQz(viewStub, zTo, bulletinPollViewModel, c0p4n, bulletinListViewModelF6, bulletinCommonAbilityA6, interfaceC665370Q7zLIZ != null ? (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null) : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C619350OQz c619350OQz = this.LLJLLL;
        if (c619350OQz != null) {
            CountDownTimer countDownTimer = c619350OQz.LJIIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c619350OQz.LJIIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void v6() {
        super.v6();
        if (this.LLJLLL == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d0c);
            boolean zTo = To();
            AssemVMLazy assemVMLazy = this.LLJZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
            BulletinPollViewModel bulletinPollViewModel = (BulletinPollViewModel) assemVMLazy.getValue();
            C0P4N c0p4n = new C0P4N(this, 0);
            BulletinListViewModel bulletinListViewModelF6 = f6();
            BulletinCommonAbility bulletinCommonAbilityA6 = a6();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
            this.LLJLLL = new C619350OQz(viewStub, zTo, bulletinPollViewModel, c0p4n, bulletinListViewModelF6, bulletinCommonAbilityA6, interfaceC665370Q7zLIZ != null ? (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null) : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /* JADX INFO: renamed from: K6 */
    public final void onBindItemView(BulletinBaseItem bulletinBaseItem) {
        C618680OOk c618680OOk = (C618680OOk) bulletinBaseItem;
        super.onBindItemView(c618680OOk);
        C619350OQz c619350OQz = this.LLJLLL;
        if (c619350OQz != null) {
            c619350OQz.LJFF(c618680OOk);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C618680OOk c618680OOk = (C618680OOk) interfaceC1891350zJl;
        super.onBindItemView(c618680OOk);
        C619350OQz c619350OQz = this.LLJLLL;
        if (c619350OQz != null) {
            c619350OQz.LJFF(c618680OOk);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void N5(C0OVA c0ova, BulletinBaseItem bulletinBaseItem) {
        int iIntValue;
        C21568919b5 c21568919b5R6 = r6();
        if (c21568919b5R6 != null) {
            C0OV6 c0ov6 = c0ova.LIZ;
            if (c0ov6 != null) {
                c21568919b5R6.setRoundingParams(c0ov6);
            }
            c21568919b5R6.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zo, c21568919b5R6.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c21568919b5R6.setBackgroundColor(iIntValue);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: a7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C618680OOk c618680OOk, List<? extends Object> list) {
        super.onBindItemView(c618680OOk, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C619660OSe)) {
            return;
        }
        if (((C619660OSe) objLJJJLZIJ).LJII) {
            C619350OQz c619350OQz = this.LLJLLL;
            if (c619350OQz != null) {
                c619350OQz.LJIIJ = c618680OOk;
                return;
            }
            return;
        }
        C619350OQz c619350OQz2 = this.LLJLLL;
        if (c619350OQz2 != null) {
            c619350OQz2.LJFF(c618680OOk);
        }
    }
}
