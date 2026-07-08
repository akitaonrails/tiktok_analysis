package com.bytedance.android.livesdk.broadcast.preview.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BasePreviewDialogFragment extends LiveDialogFragment {
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }
}
