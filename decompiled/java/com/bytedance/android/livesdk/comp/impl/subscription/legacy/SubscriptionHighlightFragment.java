package com.bytedance.android.livesdk.comp.impl.subscription.legacy;

import X.C500980Jkm;
import X.InterfaceC509940JzE;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionHighlightFragment extends LiveDialogFragment implements InterfaceC509940JzE {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvHELIOSOyYjPCwjJ2E/LSItKjZ9GzAuOiwhITU4ICA9ACwrISM6Ly04Dz0yLygpJzs=";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.InterfaceC509940JzE
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        return new C500980Jkm(R.layout.gbf);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }
}
