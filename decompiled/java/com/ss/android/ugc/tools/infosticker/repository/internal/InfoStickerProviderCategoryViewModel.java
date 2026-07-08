package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C11ON;
import X.C13LP;
import X.C1634100scq;
import X.C1635160seY;
import X.C1638610sk7;
import X.EnumC1641420soe;
import X.InterfaceC1423450n95;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public class InfoStickerProviderCategoryViewModel extends InfoStickerProviderListViewModel implements InterfaceC1423450n95<EffectCategoryResponse, ProviderEffect> {
    @Override // X.InterfaceC1423450n95
    public final LiveData<List<Pair<EffectCategoryResponse, List<ProviderEffect>>>> getCategories() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel
    public final /* bridge */ /* synthetic */ InfoStickerProviderListViewModel.ProviderStateViewModel wQ2() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel
    public final void BQ2() {
        super.BQ2();
        throw null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel
    public final InfoStickerProviderListViewModel.TrendListViewModel vQ2() {
        throw null;
    }

    public final class ProviderCategoryStateViewModel extends InfoStickerProviderListViewModel.ProviderStateViewModel {
        @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel.ProviderStateViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel.ProviderStateViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        public final /* bridge */ /* synthetic */ C11NZ<C1634100scq<ProviderEffect, EnumC1641420soe, Integer>> vQ2(ProviderEffect providerEffect) {
            return vQ2(providerEffect);
        }

        @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel.ProviderStateViewModel
        /* JADX INFO: renamed from: xQ2 */
        public final C11ON vQ2(ProviderEffect providerEffect) {
            List<String> listLLIIII;
            List listLJJLIIIJILLIZJL;
            if (C1635160seY.LJ(providerEffect)) {
                Effect effectLIZ = C1638610sk7.LIZ(providerEffect);
                effectLIZ.setResourceId(providerEffect.getId());
                String extra = providerEffect.getExtra();
                if (extra != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6)) != null) {
                    listLLIIII = C13LP.LLIIII(listLJJLIIIJILLIZJL);
                } else {
                    listLLIIII = null;
                }
                effectLIZ.setTags(listLLIIII);
                throw null;
            }
            return super.vQ2(providerEffect);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel
    public final void AQ2(String str) {
        throw null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel
    public final void xQ2(final String str) {
        final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 737);
        InfoStickerProviderListViewModel.SearchListViewModel searchListViewModel = new InfoStickerProviderListViewModel.SearchListViewModel(str, awS569S0100000_25) { // from class: com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderCategoryViewModel$initSearchDataViewModel$1
            @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel.SearchListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                super.onStateChanged(lifecycleOwner, event);
            }

            @Override // com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerProviderListViewModel.SearchListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
            public final AbstractC19484711Kz<List<ProviderEffect>> wQ2() {
                this.getClass();
                throw null;
            }
        };
        searchListViewModel.X1();
        this.LLJ = searchListViewModel;
    }
}
