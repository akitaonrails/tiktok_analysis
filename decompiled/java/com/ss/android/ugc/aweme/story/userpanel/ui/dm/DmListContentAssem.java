package com.ss.android.ugc.aweme.story.userpanel.ui.dm;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1408930mlf;
import X.C197039127h;
import X.C20622315mn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import Y.AObserverS226S0100000_24;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem;
import com.ss.android.ugc.aweme.story.userpanel.vm.DmViewModel;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import irm.AkS68S0200000_31;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class DmListContentAssem extends IStoryUserListContentAssem {
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1198));
    public final C736950SvV LLJILJILJ;
    public final C01GW LLJILLL;

    public final C197039127h Oo() {
        return (C197039127h) this.LLJILLL.getValue();
    }

    public final StoryUserListViewModel So() {
        return (StoryUserListViewModel) this.LLJILJILJ.getValue();
    }

    public DmListContentAssem() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(266);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(StoryUserListViewModel.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(208), new AwS568S0100000_24((AbstractC738140SxQ) this, 1199), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1197));
    }

    public final void Vo(boolean z) {
        String string = null;
        if (C20622315mn.LIZ() && Intrinsics.LJFF(ip().LLILZLL, "dm_followup")) {
            if (z) {
                C197039127h c197039127hOo = Oo();
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131834695);
                }
                c197039127hOo.setText(string);
                Oo().setButtonVariant(0);
            } else {
                C197039127h c197039127hOo2 = Oo();
                Context context2 = getContext();
                if (context2 != null) {
                    string = context2.getString(2131848938);
                }
                c197039127hOo2.setText(string);
                Oo().setButtonVariant(1);
            }
            C786410Ut5.LLLLLLJ(Oo(), 0);
            return;
        }
        if (z) {
            C197039127h c197039127hOo3 = Oo();
            Context context3 = getContext();
            if (context3 != null) {
                string = context3.getString(2131834695);
            }
            c197039127hOo3.setText(string);
            Oo().setButtonVariant(0);
            C786410Ut5.LLLLLLJ(Oo(), 0);
            return;
        }
        C786410Ut5.LLLLLLJ(Oo(), 8);
    }

    @Override // com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        DmViewModel dmViewModel = (DmViewModel) this.LLJILJIL.getValue();
        if (dmViewModel != null) {
            dmViewModel.LLIZ = So().LLJILJIL;
        }
        Go().LJIILJJIL(DmListCell.class);
        Vo(false);
        C786410Ut5.I7(new AkS68S0200000_31(this, view, 3), Oo());
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0CxL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325570CpX c325570CpX = (C325570CpX) obj;
                c325570CpX.getClass();
                return C627260Oiy.LIZLLL(c325570CpX);
            }
        }, null, new AwS610S0100000_31(this, 492), new AwS575S0100000_31(this, 1501), new AwS610S0100000_31(this, 494), 2, null);
        DmViewModel dmViewModel2 = (DmViewModel) this.LLJILJIL.getValue();
        if (dmViewModel2 != null) {
            dmViewModel2.LLILZ.observe(this, new AObserverS226S0100000_24(this, 29));
        }
        if (Intrinsics.LJFF(So().LLILZLL, "dm_primary")) {
            C1408930mlf c1408930mlf = C1408930mlf.LIZ;
            VideoPublishEditModel videoPublishEditModel = ip().LLJ;
            String str = ip().LLJI;
            c1408930mlf.getClass();
            C1408930mlf.LIZIZ(videoPublishEditModel, str, "story_edit_page_message_panel_show");
            return;
        }
        if (!Intrinsics.LJFF(So().LLILZLL, "dm_followup")) {
            return;
        }
        C1408930mlf c1408930mlf2 = C1408930mlf.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = ip().LLJ;
        c1408930mlf2.getClass();
        C1408930mlf.LIZIZ(videoPublishEditModel2, null, "story_edit_page_also_share_to_panel_show");
    }
}
