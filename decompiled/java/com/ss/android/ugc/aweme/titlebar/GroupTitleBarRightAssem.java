package com.ss.android.ugc.aweme.titlebar;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C15606069c;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.group.MockedConvVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.publicgroup.preview.ChatPreviewModeVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupTitleBarRightAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C15606069c.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS558S0100000_14(this, 1145));
    public final C01GW LLJJIJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1143));
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupTitleBarRightAssem.class, "groupChatVM", "getGroupChatVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/group/GroupChatVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupTitleBarRightAssem.class, "mockedConvVM", "getMockedConvVM()Lcom/ss/android/ugc/aweme/group/MockedConvVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(GroupTitleBarRightAssem.class, "previewModeVM", "getPreviewModeVM()Lcom/ss/android/ugc/aweme/publicgroup/preview/ChatPreviewModeVM;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public GroupTitleBarRightAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 1147), AFwS248S0000000_14.get$arr$(339), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MockedConvVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 1148), AFwS248S0000000_14.get$arr$(340), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatPreviewModeVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 1149), AFwS248S0000000_14.get$arr$(341), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1144));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqb;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxIconView tuxIconView = (TuxIconView) this.LLJJJIL.getValue();
        tuxIconView.setTintColor(C1383370m6R.LJFF(R.attr.a1h));
        C786410Ut5.LJLLLLLL(0, tuxIconView);
        tuxIconView.setContentDescription(C1383370m6R.LJIIJ(R.string.loy));
        C786410Ut5.I7(new AbS695S0100000_14(this, 11), tuxIconView);
        View viewFindViewById = view.findViewById(R.id.k2q);
        if (viewFindViewById != null) {
            C1584506Ih.LIZ(viewFindViewById);
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06eK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1657506eL) obj).LLILZ);
            }
        }, null, new AwS628S0100000_14(this, 43), 6);
        if (((SessionInfo) this.LLJJIII.getValue()).isPreviewMode()) {
            C736680Sv4.LJIIIIZZ(this, this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0ZPj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C899290ZPr) obj).LL;
                }
            }, null, new AwS616S0100000_2(this, 83), 6);
        }
    }
}
