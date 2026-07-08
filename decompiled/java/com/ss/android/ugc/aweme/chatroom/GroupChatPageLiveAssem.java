package com.ss.android.ugc.aweme.chatroom;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1612006Sw;
import X.C1612106Sx;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.dynamic.DynamicCardViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatPageLiveAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS546S0100000_2(this, 117));
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupChatPageLiveAssem.class, "actionBarLightInteractionVM", "getActionBarLightInteractionVM()Lcom/ss/android/ugc/aweme/im/actionbar/common/viewmodel/SocialActionBarLightInteractionViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupChatPageLiveAssem.class, "dynamicCardViewModel", "getDynamicCardViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/dynamic/DynamicCardViewModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public GroupChatPageLiveAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialActionBarLightInteractionViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 118), AFwS229S0000000_2.get$arr$(111), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(DynamicCardViewModel.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 119), AFwS229S0000000_2.get$arr$(112), null, true);
        this.LLILZIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 116));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final SocialActionBarLightInteractionViewModel bo() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (SocialActionBarLightInteractionViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1612106Sx(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1612006Sw(this, null), 3);
    }
}
