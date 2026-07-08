package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import X.C01GW;
import X.C1388190mED;
import X.C1659630tI1;
import X.C19EG;
import X.C452501pT;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicRecyclerViewPoolViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(43));

    public static final RecyclerView.RecycledViewPool vQ2(Context context) {
        C19EG c19egLIZIZ;
        ViewModelProvider viewModelProviderOf;
        Scene currentScene;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return null;
        }
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService != null && (currentScene = iCreativeSAAService.getCurrentScene(c19egLIZIZ)) != null) {
            viewModelProviderOf = C1659630tI1.LJIIIIZZ(currentScene, null, null, 6);
        } else {
            viewModelProviderOf = ViewModelProviders.of(c19egLIZIZ);
        }
        return (RecyclerView.RecycledViewPool) ((MusicRecyclerViewPoolViewModel) viewModelProviderOf.get(MusicRecyclerViewPoolViewModel.class)).LL.getValue();
    }
}
