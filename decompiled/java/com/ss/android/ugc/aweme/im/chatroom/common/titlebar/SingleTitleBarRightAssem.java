package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0YNP;
import X.C1220000hqw;
import X.C127G;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1527105yP;
import X.C1559260qg8;
import X.C1576040r7C;
import X.C1619106Vp;
import X.C1637806bA;
import X.C1637906bB;
import X.C1721406oe;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C300790Bqf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457780HxI;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C909290Zln;
import X.EnumC912680ZrG;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import Y.AObjectS67S0000000_14;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.IVibeFeedEntranceViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleTitleBarRightAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1527105yP.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 496));
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C736950SvV LLJJJ;
    public TuxIconView LLJJJIL;
    public SmartImageView LLJJJJ;
    public TuxAlertBadgeLayout LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public volatile C1721406oe LLJJLIIIJLLLLLLLZ;
    public C127G LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleTitleBarRightAssem.class, "titleBarRightVM", "getTitleBarRightVM()Lcom/ss/android/ugc/aweme/im/chatroom/common/titlebar/SingleTitleBarRightViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SingleTitleBarRightAssem.class, "chatCommonViewModel", "getChatCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SingleTitleBarRightAssem.class, "chatDetailManager", "getChatDetailManager()Lcom/ss/android/ugc/aweme/im/chatdetail/api/ChatDetailManager;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqb;
    }

    public SingleTitleBarRightAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SingleTitleBarRightViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 497), AFwS248S0000000_14.get$arr$(128), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 498), AFwS248S0000000_14.get$arr$(129), null, true);
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(122);
        this.LLJJJ = new C736950SvV(C13LE.LIZ(IVibeFeedEntranceViewModel.class), aFwS201S0000000_14, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(130), new AwS558S0100000_14((AbstractC738140SxQ) this, 499), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJL = true;
    }

    public final C909290Zln hp() {
        return (C909290Zln) this.LLJJIJI.getValue();
    }

    public final SingleTitleBarRightViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (SingleTitleBarRightViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS67S0000000_14(this, 16), IVibeFeedEntranceViewModel.class, new AObjectS67S0000000_14(this, 17)}, defaultViewModelProviderFactory);
                    this.LLJL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void kp(Integer num) {
        String conversationId;
        if (num != null && num.intValue() == 1) {
            TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LLJJJJJIL;
            if (tuxAlertBadgeLayout != null) {
                tuxAlertBadgeLayout.LIZJ();
            }
            VibeEntranceFeature vibeEntranceFeatureLIZ = VibeEntranceFeature.LIZ.LIZ();
            if (vibeEntranceFeatureLIZ != null) {
                C909290Zln c909290ZlnHp = hp();
                if (c909290ZlnHp != null) {
                    conversationId = c909290ZlnHp.getConversationId();
                } else {
                    conversationId = null;
                }
                vibeEntranceFeatureLIZ.LJ(String.valueOf(conversationId), "shared_feed_top_btn", 1, EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE);
            }
            this.LLJJJJLIIL = 1;
            return;
        }
        TuxAlertBadgeLayout tuxAlertBadgeLayout2 = this.LLJJJJJIL;
        if (tuxAlertBadgeLayout2 != null) {
            tuxAlertBadgeLayout2.LIZIZ();
        }
        this.LLJJJJLIIL = 0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String strValueOf;
        super.onViewCreated(view);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k43);
        C786410Ut5.I7(new AbS695S0100000_14(this, 4), tuxIconView);
        this.LLJJJIL = tuxIconView;
        TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view.findViewById(R.id.k2q);
        if (tuxAlertBadgeLayout != null) {
            tuxAlertBadgeLayout.LIZIZ();
            this.LLJJJJLIIL = 0;
        } else {
            tuxAlertBadgeLayout = null;
        }
        this.LLJJJJJIL = tuxAlertBadgeLayout;
        this.LLJJJJ = (SmartImageView) view.findViewById(R.id.k2p);
        if (C1576040r7C.LIZLLL()) {
            C909290Zln c909290ZlnHp = hp();
            if (c909290ZlnHp != null) {
                IVibeFeedEntranceViewModel iVibeFeedEntranceViewModel = (IVibeFeedEntranceViewModel) this.LLJJJ.getValue();
                IMUser fromUser = c909290ZlnHp.getFromUser();
                if (fromUser == null || (strValueOf = fromUser.getUid()) == null) {
                    strValueOf = String.valueOf(C0YNP.LJII(c909290ZlnHp.getConversationId()));
                }
                iVibeFeedEntranceViewModel.vQ2(strValueOf, c909290ZlnHp.getConversationId(), false);
            }
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0ZVF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C908580Zke) obj).LL;
                }
            }, null, new AwS628S0100000_14(this, 20), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0ZVE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C908580Zke) obj).LLILLJJLI;
                }
            }, null, new AwS628S0100000_14(this, 21), 6);
        }
        if (C1576040r7C.LIZLLL() || C300790Bqf.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0ZVC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0ZV9) obj).LLILLJJLI;
                }
            }, null, new AwS450S0200000_14(this, view, 4), 6);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0ZVB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZV9) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 19), 6);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.k02);
        if (tuxIconView2 != null) {
            tuxIconView2.setTintColor(C1383370m6R.LJFF(R.attr.a1h));
            C786410Ut5.LJLLLLLL(0, tuxIconView2);
            tuxIconView2.setContentDescription(C1383370m6R.LJIIJ(R.string.loy));
            C786410Ut5.a9(tuxIconView2, new ACListenerS137S0100000_2(this, 27));
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                iChatCustomizeHelperLIZ.showTooltipGuide(tuxIconView2);
            }
        }
    }
}
