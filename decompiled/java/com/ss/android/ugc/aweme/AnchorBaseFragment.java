package com.ss.android.ugc.aweme;

import X.AnonymousClass1192;
import X.EnumC1430380nKG;
import X.InterfaceC1670800ta2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes30.dex */
public class AnchorBaseFragment extends Fragment {
    public static EnumC1430380nKG LLILLJJLI = EnumC1430380nKG.NO_TYPE;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCHELIOSI2ZgQiKic8OgctOioVOiQrJCo9PA==";
    public AnonymousClass1192 LL;

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        AnonymousClass1192 anonymousClass1192;
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            InterfaceC1670800ta2 activity = getActivity();
            if (activity instanceof AnonymousClass1192) {
                anonymousClass1192 = (AnonymousClass1192) activity;
            } else {
                anonymousClass1192 = null;
            }
            this.LL = anonymousClass1192;
        }
    }
}
