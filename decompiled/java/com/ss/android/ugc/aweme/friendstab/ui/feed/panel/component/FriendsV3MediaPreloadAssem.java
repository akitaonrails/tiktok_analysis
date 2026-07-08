package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C09R3;
import X.C0W17;
import X.C13LE;
import X.C1478160oZK;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FriendsV3MediaPreloadAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final Set<String> LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3MediaPreloadAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3MediaPreloadAssem.class, "friendsV3PageViewModel", "getFriendsV3PageViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILJIL = "preload_assem";
    }

    public FriendsV3MediaPreloadAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 160), AFwS240S0000000_9.get$arr$(107), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 161), AFwS240S0000000_9.get$arr$(108), null, true);
        this.LLJI = new LinkedHashSet();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0W17.LIZJ(LLJILJIL, "onCreate");
        C1478160oZK.LIZ().LJJJI("social_friends_tab_v3", null);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0O1r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LL;
            }
        }, null, AFwS292S0000000_9.get$arr$(8), 6);
    }

    public final FriendsV3FeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0W17.LIZJ(LLJILJIL, "onDestroy");
        this.LLJI.clear();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1478160oZK.LIZ().LJJJ("social_friends_tab_v3");
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().asyncSubscribe(new C2217381BqS() { // from class: X.0O1p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZLLL(c1223430hwT);
            }
        }, this, C736820SvI.LIZLLL(), AFwS240S0000000_9.get$arr$(105), AFwS195S0000000_9.get$arr$(117), new AwS588S0100000_9(this, 94));
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0O1q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZJ(c1223430hwT);
            }
        }, this, null, AFwS240S0000000_9.get$arr$(106), AFwS195S0000000_9.get$arr$(118), new AwS588S0100000_9(this, 95), 4, null);
    }
}
