package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.C01BN;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class LocationServicesHeaderCell extends PowerCell<C01BN> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ((TextView) this.itemView.findViewById(R.id.zw6)).setText(((C01BN) interfaceC1891350zJl).LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bdu, viewGroup, false);
    }
}
