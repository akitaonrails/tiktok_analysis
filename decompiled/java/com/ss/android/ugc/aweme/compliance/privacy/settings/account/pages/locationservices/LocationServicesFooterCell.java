package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.C431290Gvf;
import X.C431350Gvl;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS289S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class LocationServicesFooterCell extends PowerCell<C431350Gvl> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView = (TextView) this.itemView.findViewById(R.id.zw5);
        textView.setMovementMethod(new C431290Gvf(AFwS289S0000000_6.get$arr$(7)));
        textView.setText(((C431350Gvl) interfaceC1891350zJl).LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bds, viewGroup, false);
    }
}
