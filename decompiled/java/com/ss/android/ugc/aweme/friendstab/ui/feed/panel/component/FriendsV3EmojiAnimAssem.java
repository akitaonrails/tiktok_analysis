package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C0O2L;
import X.C0OB8;
import X.C0RSR;
import X.C13LE;
import X.C14EU;
import X.C1605260rsK;
import X.C1637806bA;
import X.C1637906bB;
import X.C19606111nH;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2487409ou;
import X.C291001Au;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC1361270lWn;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS124S0100000_24;
import Y.AsS50S0100000_24;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public class FriendsV3EmojiAnimAssem extends BasePanelUISlotComponent {
    public static final C1605260rsK LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 504));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 505));
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0rsK] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3EmojiAnimAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(FriendsV3EmojiAnimAssem.class, "pageViewModel", "getPageViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0)};
        LLJJJJ = new Object() { // from class: X.0rsK
        };
    }

    public FriendsV3EmojiAnimAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 212), AFwS264S0000000_24.get$arr$(150), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 213), AFwS264S0000000_24.get$arr$(151), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b6a;
    }

    public FriendsV3FeedListViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        C2487409ou.LIZJ(new ARunnableS124S0100000_24(this, 29));
        super.onDestroy();
    }

    @C14EU
    public final void onQuickCommentEvent(C0RSR c0rsr) {
        boolean z;
        boolean z2;
        boolean z3;
        C0OB8 c0ob8;
        Aweme aweme;
        Pair<Boolean, Bundle> pair;
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        C291001Au<Pair<Boolean, Bundle>> c291001Au = ((C0O2L) assemVMLazy.getValue().getState()).LL;
        if (c291001Au != null && (pair = c291001Au.LIZ) != null && pair.getFirst().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        C291001Au<Boolean> c291001Au2 = ((C0O2L) this.LLJJJIL.getValue().getState()).LLILLJJLI;
        if (c291001Au2 != null && c291001Au2.LIZ.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<ITEM> listListGetAll = hp().listGetAll();
        if (listListGetAll != 0) {
            for (ITEM item : listListGetAll) {
                String aid = null;
                if ((item instanceof InterfaceC1361270lWn) && (c0ob8 = (C0OB8) item) != null && (aweme = c0ob8.getAweme()) != null) {
                    aid = aweme.getAid();
                }
                if (Intrinsics.LJFF(aid, c0rsr.LIZJ)) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        LLJJJJ.getClass();
        if (c0rsr != null && c0rsr.LIZLLL.length() != 0 && c0rsr.LIZ == 1 && z && z2 && z3) {
            C19606111nH c19606111nH = (C19606111nH) this.LLJJIJIIJIL.getValue();
            String str = c0rsr.LIZLLL;
            if (str == null) {
                str = "";
            }
            c19606111nH.LIZIZ(str);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLJJIJIL.getValue();
        if (friendsV3FeedListAbility != null) {
            friendsV3FeedListAbility.OD(new AsS50S0100000_24(this, 1));
        }
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }
}
