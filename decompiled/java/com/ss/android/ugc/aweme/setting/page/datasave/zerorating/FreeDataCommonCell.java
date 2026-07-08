package com.ss.android.ugc.aweme.setting.page.datasave.zerorating;

import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class FreeDataCommonCell<T extends InterfaceC1891350zJl> extends PowerCell<T> implements View.OnClickListener {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(T t) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c_1, viewGroup, false);
        C786410Ut5.I7(this, viewTd);
        return viewTd;
    }
}
