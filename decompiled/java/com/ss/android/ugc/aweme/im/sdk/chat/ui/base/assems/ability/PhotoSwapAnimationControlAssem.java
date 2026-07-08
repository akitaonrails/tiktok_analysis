package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C13LE;
import X.C1509305vX;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1593606Lu;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import X.InterfaceC910720Zo6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import java.util.HashSet;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoSwapAnimationControlAssem extends AbstractC738140SxQ implements PhotoSwapAnimationAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C01GW LL = C1509305vX.LIZ(AFwS187S0000000_2.get$arr$(485));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLL;
    public Long LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoSwapAnimationControlAssem.class, "chatCommonViewModel", "getChatCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PhotoSwapAnimationControlAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 392), AFwS229S0000000_2.get$arr$(269), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, ChatRoomScope.class, this, PhotoSwapAnimationAbility.class, null, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        ((HashSet) this.LL.getValue()).clear();
        C1558520qew.LJIIJ(this, ChatRoomScope.class, PhotoSwapAnimationAbility.class, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Long lValueOf;
        super.onResume();
        if (this.LLILZ == null) {
            AssemVMLazy assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
            InterfaceC910720Zo6 interfaceC910720Zo6 = ((C1593606Lu) assemVMLazy.getValue().getState()).LLILZ;
            if (interfaceC910720Zo6 == null || (lValueOf = interfaceC910720Zo6.getReadIndex()) == null) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((C457780HxI) this.LLILLJJLI.getValue()).LL.getConversationId());
                lValueOf = c0y8tLIZ != null ? Long.valueOf(c0y8tLIZ.getReadIndex()) : null;
            }
            this.LLILZ = lValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readIndex=");
            sbLIZ.append(this.LLILZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility
    public final void gE0(String str) {
        ((HashSet) this.LL.getValue()).add(str);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility
    public final boolean ct0(long j, String str) {
        Long l = this.LLILZ;
        if (l != null && j > l.longValue() && !((HashSet) this.LL.getValue()).contains(str)) {
            return true;
        }
        return false;
    }
}
