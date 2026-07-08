package com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.scene;

import X.AnonymousClass0502;
import X.C01GW;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class MentionReachLimitCell extends PowerCell<AnonymousClass0502> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 57));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.oe;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AnonymousClass0502 anonymousClass0502 = (AnonymousClass0502) interfaceC1891350zJl;
        super.onBindItemView(anonymousClass0502);
        String str = anonymousClass0502.LLILLJJLI;
        if (str != null) {
            ((TextView) this.LL.getValue()).setText(str);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.oe, viewGroup, false);
    }
}
