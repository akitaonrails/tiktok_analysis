package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.networkstate;

import X.C036E;
import X.C0H62;
import X.C0O0L;
import X.C0ZDX;
import X.C804440Vh4;
import X.C869590Y9l;
import X.C902980Zbc;
import X.C903330ZcB;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.networkstate.ChatRoomNetworkStateViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatRoomNetworkStateViewModel extends AssemViewModel<C902980Zbc> {
    public final C804440Vh4 LL = C036E.LIZ;
    public final C903330ZcB LLILLJJLI = new C0H62() { // from class: X.0ZcB
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            ChatRoomNetworkStateViewModel chatRoomNetworkStateViewModel = this.LL;
            chatRoomNetworkStateViewModel.getClass();
            C0O0L c0o0l3 = C0O0L.AVAILABLE;
            if (c0o0l == c0o0l3 && c0o0l2 != c0o0l3) {
                chatRoomNetworkStateViewModel.setState(AFwS248S0000000_14.get$arr$(365));
            } else {
                if (c0o0l2 != c0o0l3) {
                    return;
                }
                chatRoomNetworkStateViewModel.setState(AFwS248S0000000_14.get$arr$(366));
            }
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C902980Zbc(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL.LIZLLL(this.LLILLJJLI);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (this.LL.LIZJ != C0O0L.AVAILABLE) {
            setState(AFwS248S0000000_14.get$arr$(221));
        }
        this.LL.LIZ(this.LLILLJJLI);
    }

    public final void vQ2(List<? extends C869590Y9l> list) {
        C869590Y9l next;
        Iterator<? extends C869590Y9l> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C0ZDX.LJJJJIZL(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C869590Y9l c869590Y9l = next;
        if (c869590Y9l == null) {
            return;
        }
        if (c869590Y9l.getMsgStatus() == 1) {
            withState(new AwS593S0100000_14(this, 90));
        } else {
            withState(new AwS593S0100000_14(this, 91));
        }
    }
}
