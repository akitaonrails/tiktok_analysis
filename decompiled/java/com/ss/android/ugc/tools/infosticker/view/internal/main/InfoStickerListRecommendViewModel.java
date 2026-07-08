package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.AbstractC1634360sdG;
import X.C11NJ;
import X.C1634350sdF;
import X.EnumC1641470soj;
import X.InterfaceC1423450n95;
import X.InterfaceC1640330smt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerListRecommendViewModel extends HumbleViewModel implements InterfaceC1640330smt<Effect>, InterfaceC1423450n95<EffectCategoryResponse, Effect> {
    public C11NJ LL;

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> LJJIJ() {
        return null;
    }

    @Override // X.InterfaceC1640330smt
    public final void LLIZLLLIL() {
    }

    @Override // X.InterfaceC1423450n95
    public final LiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> getCategories() {
        return null;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<Object> getExtraData() {
        return null;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<EnumC1641470soj> getLoadMoreState() {
        return null;
    }

    @Override // X.InterfaceC1640330smt
    public final LiveData<List<Effect>> he() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1640330smt
    public final void tw(StickerSetCategory stickerSetCategory) {
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11NJ c11nj = this.LL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LL = null;
    }

    @Override // X.InterfaceC1640330smt
    public final void X1() {
        if (!isDestroyed()) {
            throw null;
        }
    }

    @Override // X.InterfaceC1640330smt
    public final void se2() {
        if (!isDestroyed()) {
            throw null;
        }
    }

    @Override // X.InterfaceC1640330smt
    public final void Px2(AbstractC1634360sdG abstractC1634360sdG) {
        if (abstractC1634360sdG instanceof C1634350sdF) {
            X1();
        }
    }
}
