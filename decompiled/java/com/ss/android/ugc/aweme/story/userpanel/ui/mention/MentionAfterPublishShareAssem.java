package com.ss.android.ugc.aweme.story.userpanel.ui.mention;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P0T;
import X.C1220000hqw;
import X.C1391600mJi;
import X.C13LE;
import X.C1403120mcI;
import X.C16HA;
import X.C21411818qq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS116S0100000_16;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionAfterPublishShareAssem extends IStoryUserListContentAssem {
    public final C736950SvV LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public C0P0T LLJJ;
    public boolean LLJJI;

    @Override // com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem
    /* JADX INFO: renamed from: No */
    public final StoryUserListViewModel ip() {
        return (StoryUserListViewModel) this.LLJILJIL.getValue();
    }

    public final C21411818qq Oo() {
        return (C21411818qq) this.LLJILLL.getValue();
    }

    public final void So() {
        C0P0T c0p0t = this.LLJJ;
        if (c0p0t == null || !c0p0t.isShowing()) {
            return;
        }
        C0P0T c0p0t2 = this.LLJJ;
        if (c0p0t2 != null) {
            c0p0t2.dismiss();
        }
        IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
        if (iStoryMentionShareService != null) {
            iStoryMentionShareService.LJ();
        }
    }

    public MentionAfterPublishShareAssem() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(272);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(StoryUserListViewModel.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(212), new AwS575S0100000_31((AbstractC738140SxQ) this, 1082), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1080));
        this.LLJILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1081));
    }

    @Override // com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem, com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final /* bridge */ /* synthetic */ AssemListViewModel ip() {
        return ip();
    }

    public final void PL1(boolean z) {
        int i;
        View view = (View) this.LLJILJILJ.getValue();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        if (z && !this.LLJJI) {
            this.LLJJI = true;
            IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
            if (iStoryMentionShareService != null && iStoryMentionShareService.LJFF()) {
                if (this.LLJJ == null) {
                    C450720Hlu c450720Hlu = new C450720Hlu(Oo().getContext());
                    c450720Hlu.LJIIJ(2131826435);
                    C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                    c1391600mJi.LJII = -1001L;
                    c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                    c450720Hlu.LLILLJJLI.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(-72.0f)));
                    c450720Hlu.LLILLJJLI.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(-16.0f)));
                    c450720Hlu.LLILLJJLI.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(-15.0f)));
                    C21411818qq c21411818qqOo = Oo();
                    C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
                    c1391600mJi2.LIZIZ = c21411818qqOo;
                    c1391600mJi2.LJIJJ = false;
                    c450720Hlu.LJIIIZ(true, new ACListenerS165S0100000_31(this, 203));
                    this.LLJJ = c450720Hlu.LIZIZ();
                }
                HandlerHook.viewPostDelay(Oo(), new ARunnableS116S0100000_16(this, 218), 300L);
            }
            IStoryMentionShareService iStoryMentionShareService2 = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
            if (iStoryMentionShareService2 != null) {
                C1403120mcI c1403120mcI = C1403120mcI.LIZ;
                String str = ip().LLILLL;
                String str2 = ip().LLILLJJLI;
                boolean zIsPrivateAccount = iStoryMentionShareService2.isPrivateAccount();
                boolean zIsChecked = Oo().isChecked();
                c1403120mcI.getClass();
                C1403120mcI.LIZIZ(zIsPrivateAccount, "immersive_story", str, "", "", str2, zIsChecked);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
        boolean z = true;
        if (iStoryMentionShareService != null && iStoryMentionShareService.LJIIIIZZ()) {
            IStoryMentionShareService iStoryMentionShareService2 = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
            if (iStoryMentionShareService2 != null) {
                iStoryMentionShareService2.LIZLLL(ip().LL);
            }
            C21411818qq c21411818qqOo = Oo();
            if (iStoryMentionShareService2 == null || !iStoryMentionShareService2.LJII()) {
                z = false;
            }
            c21411818qqOo.setChecked(z);
            C786410Ut5.C7(Oo(), new C16HA(this, iStoryMentionShareService2, 4));
            AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0CxN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C325570CpX c325570CpX = (C325570CpX) obj;
                    c325570CpX.getClass();
                    return C627260Oiy.LIZLLL(c325570CpX);
                }
            }, null, new AwS610S0100000_31(this, 510), new AwS575S0100000_31(this, 1523), new AwS610S0100000_31(this, 512), 2, null);
            return;
        }
        PL1(false);
    }
}
