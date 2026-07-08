package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C09R3;
import X.C0OLV;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS384S0100000_9;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinQuickSendButtonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputTopicRightAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C736950SvV LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public C127G LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputTopicRightAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinInputTopicRightAssem.class, "publishVM", "getPublishVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPublishViewModel;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a6b;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinEditFragmentScope.class, BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    public BulletinInputTopicRightAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 432), AFwS240S0000000_9.get$arr$(246), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinPublishViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 433), AFwS240S0000000_9.get$arr$(247), null, true);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 431);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(248), new AwS553S0100000_9((AbstractC738140SxQ) this, 434), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinPublishViewModel.class, new AObjectS384S0100000_9(this, 29)}, defaultViewModelProviderFactory);
                    this.LLJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (TuxIconView) LJJIJL().findViewById(R.id.d10);
        this.LLJJIJIL = (TuxIconView) LJJIJL().findViewById(R.id.d4i);
        Context context = getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZ = R.raw.icon_arrow_up_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ob);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            TuxIconView tuxIconView = this.LLJJIJIL;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
            }
        }
        TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS144S0100000_9(this, 40));
        }
        TuxIconView tuxIconView3 = this.LLJJIJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS144S0100000_9(this, 41));
        }
        AssemViewModel.asyncSubscribe$default(this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0OW8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 475), 28, null);
        BulletinQuickSendButtonAbility bulletinQuickSendButtonAbility = (BulletinQuickSendButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinQuickSendButtonAbility.class, null);
        if (bulletinQuickSendButtonAbility != null) {
            bulletinQuickSendButtonAbility.Il1(new AwS588S0100000_9(this, 474));
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OWS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0OWI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLJJLI;
            }
        }, null, new AwS658S0100000_9(this, 20), 12);
    }
}
