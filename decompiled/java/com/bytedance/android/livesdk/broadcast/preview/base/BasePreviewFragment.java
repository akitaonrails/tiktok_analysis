package com.bytedance.android.livesdk.broadcast.preview.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.android.livesdk.ui.BaseFragment;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BasePreviewFragment extends BaseFragment {
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }
}
