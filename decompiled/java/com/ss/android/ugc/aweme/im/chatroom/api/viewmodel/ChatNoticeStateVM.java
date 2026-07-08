package com.ss.android.ugc.aweme.im.chatroom.api.viewmodel;

import X.C1BNE;
import X.C2252321DDq;
import X.C463090IDz;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class ChatNoticeStateVM extends AssemViewModel<InterfaceC0148002o> {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(2);
    }

    public ChatNoticeStateVM() {
        Boolean bool = Boolean.FALSE;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(bool);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(bool);
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = c2252321DDqLIZ2;
    }

    public static void vQ2(ChatNoticeStateVM chatNoticeStateVM, Boolean bool, Boolean bool2, int i) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if (bool != null) {
            chatNoticeStateVM.LL.setValue(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            chatNoticeStateVM.LLILLL.setValue(Boolean.valueOf(bool2.booleanValue()));
        }
    }
}
