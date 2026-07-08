package com.ss.android.ugc.aweme.shortvideo.model;

import X.C11G4;
import X.C127K;
import X.C127M;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;

/* JADX INFO: loaded from: classes20.dex */
public final class AddToPlaylistItemStatus extends CommonViewStatus {
    public static final int $stable = 8;
    public final MutableLiveData<String> _nameText = new MutableLiveData<>();

    public final MutableLiveData<String> getNameText() {
        return this._nameText;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public void bindView(final View view, LifecycleOwner lifecycleOwner) {
        super.bindView(view, lifecycleOwner);
        this._nameText.removeObservers(lifecycleOwner);
        this._nameText.observe(lifecycleOwner, new Observer() { // from class: com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus.bindView.1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(String str) {
                C11G4 c11g4;
                View view2 = view;
                if (view2 instanceof C127K) {
                    C127M accessory = ((C127K) view2).getAccessory();
                    if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
                        c11g4.LJIILJJIL(str);
                    }
                }
            }
        });
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJ();
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus.bindView.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJ();
                }
            }
        });
    }
}
