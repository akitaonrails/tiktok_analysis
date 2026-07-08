package com.ss.android.ugc.aweme.story.userpanel.ui.mention;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C197039127h;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C844470XAv;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import irm.AkS97S0100000_31;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionAfterPublishListContentAssem extends IStoryUserListContentAssem {
    public final C736950SvV LLJILJIL;
    public final C01GW LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public int LLJJ;

    @Override // com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem
    /* JADX INFO: renamed from: No */
    public final StoryUserListViewModel ip() {
        return (StoryUserListViewModel) this.LLJILJIL.getValue();
    }

    public final C197039127h So() {
        return (C197039127h) this.LLJILJILJ.getValue();
    }

    public MentionAfterPublishListContentAssem() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(271);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(StoryUserListViewModel.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(211), new AwS575S0100000_31((AbstractC738140SxQ) this, 1079), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1078));
    }

    @Override // com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem, com.bytedance.ext_power_list.UIListContentAssem
    public final /* bridge */ /* synthetic */ AssemListViewModel Jo() {
        return ip();
    }

    public final void Oo() {
        Long l;
        if (ip().LLJJIII == null || (l = ip().LLJJIII) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        int i = ip().LLJJIJIIJIL;
        int i2 = ip().LLJJIJI;
        String str = ip().LLILZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "mention_after_publish");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LIZJ(i, "selection_count");
        c2344009Gk.LIZJ(i2, "query_count");
        c2344009Gk.LJIIIIZZ("search_keyword", str);
        C20684815ws.LJIILLIIL("social_search_session_summary", c2344009Gk.LIZ);
        ip().LLJJIII = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Oo();
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void Vo(int i) {
        C786410Ut5.LLLLLLJ(So(), i);
        C786410Ut5.LLF(i, Go());
    }

    public final void Zo(int i) {
        String quantityString;
        if (i == 0) {
            So().setEnabled(false);
        } else {
            So().setEnabled(true);
        }
        C197039127h c197039127hSo = So();
        int size = ip().LLIZLLLIL.size() + i;
        if (size == 0) {
            quantityString = So().getContext().getString(2131849027);
        } else {
            C844470XAv.LIZ.getClass();
            quantityString = C844470XAv.LIZ().getResources().getQuantityString(2131755723, size, Integer.valueOf(size));
        }
        c197039127hSo.setText(quantityString);
    }

    @Override // com.ss.android.ugc.aweme.story.userpanel.ui.IStoryUserListContentAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(MentionAfterPublishListCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        C786410Ut5.I7(new AkS97S0100000_31(this, 8), So());
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.15lT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20614415lW) obj).LLILLL;
            }
        }, null, new AwS645S0100000_31(this, 114), 6);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0CxM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325570CpX c325570CpX = (C325570CpX) obj;
                c325570CpX.getClass();
                return C627260Oiy.LIZLLL(c325570CpX);
            }
        }, null, new AwS610S0100000_31(this, 507), new AwS575S0100000_31(this, 1522), new AwS610S0100000_31(this, 509), 2, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0CxP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C325570CpX) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 115), 4);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.15lS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20614415lW) obj).LLIZ);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 190), 4);
    }
}
