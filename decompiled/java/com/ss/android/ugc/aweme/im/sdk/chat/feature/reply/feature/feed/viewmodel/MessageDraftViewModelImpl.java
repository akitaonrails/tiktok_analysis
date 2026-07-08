package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.viewmodel;

import X.C14EU;
import X.C714530S1b;
import X.C738990Syn;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class MessageDraftViewModelImpl extends MessageDraftViewModel {
    public final Map<String, String> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C738990Syn(0);
    }

    @Override // com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel
    public final void resetState() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onVideoPageChangeEvent(C714530S1b c714530S1b) {
        if (c714530S1b.LIZIZ) {
            return;
        }
        resetState();
    }

    @Override // com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel
    public final String vQ2(String str) {
        String str2 = (String) ((LinkedHashMap) this.LL).get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel
    public final void wQ2(String str, String str2) {
        Map<String, String> map = this.LL;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }
}
