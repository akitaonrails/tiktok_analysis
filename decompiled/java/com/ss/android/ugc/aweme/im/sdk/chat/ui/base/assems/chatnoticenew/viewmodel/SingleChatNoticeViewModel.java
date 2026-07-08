package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel;

import X.AnonymousClass0956;
import X.C06OO;
import X.C09AE;
import X.C13LQ;
import X.C15601068x;
import X.C15602068y;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleChatNoticeViewModel extends BaseSingleChatNoticeViewModel {
    public static final /* synthetic */ int LLJILJIL = 0;

    public final AnonymousClass0956 IQ2() {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15602068y(this, null), 3);
    }

    public SingleChatNoticeViewModel(IChatNoticeFlowEngine iChatNoticeFlowEngine) {
        super(iChatNoticeFlowEngine);
    }

    public final String GQ2(String... strArr) {
        return C13LQ.LJJJ(strArr, ",", null, null, null, 62);
    }

    public final C09AE FQ2(Context context, List<IMNoticeMsgStruct> list, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C15601068x(this, list, function2, context, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(java.util.List r18, X.InterfaceC1364105Vn r19, kotlin.jvm.functions.Function2 r20) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel.HQ2(java.util.List, X.05Vn, kotlin.jvm.functions.Function2):java.lang.Object");
    }
}
