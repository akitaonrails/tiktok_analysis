package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C098200Yq;
import X.C189200o6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public final class TikTokPublishGroupSceneFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9HELIOSPSxiHSY4HConGToxJCw/IQghJzA8Giw2JiAKOy40JSAiPQ==";
    public WeakReference<TikTokPublishGroupScene> LL;

    @Override // androidx.fragment.app.Fragment
    public final LifecycleOwner getViewLifecycleOwner() {
        throw new IllegalArgumentException("User Scene instead");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        TikTokPublishGroupScene tikTokPublishGroupScene;
        super.onActivityResult(i, i2, intent);
        WeakReference<TikTokPublishGroupScene> weakReference = this.LL;
        if (weakReference != null && (tikTokPublishGroupScene = weakReference.get()) != null) {
            tikTokPublishGroupScene.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b0365", (String) null);
        View view = new View(requireActivity());
        try {
            getViewLifecycleOwner();
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return view;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        TikTokPublishGroupScene tikTokPublishGroupScene;
        super.onRequestPermissionsResult(i, strArr, iArr);
        WeakReference<TikTokPublishGroupScene> weakReference = this.LL;
        if (weakReference != null && (tikTokPublishGroupScene = weakReference.get()) != null) {
            tikTokPublishGroupScene.onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
