package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings;

import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296908zH;
import X.C23250099c;
import X.C356901a3;
import X.C522560KeU;
import X.C529000Kos;
import X.C533680KwQ;
import X.EnumC538220L8y;
import X.InterfaceC528570KoB;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsConfigResponse;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRepository;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveRecordingsDataManager implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final LiveRecordingsRepository LLILLJJLI;
    public final LiveRecordingsService LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public Long LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public TikTokMediaModel LLJ;
    public List<? extends TikTokMediaModel> LLJI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final TikTokMediaModel LIZ() {
        Long l = this.LLILZLL;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        String str = this.LLILZIL;
        if (str == null) {
            return null;
        }
        if (this.LLJ == null) {
            TikTokMediaModel tikTokMediaModel = new TikTokMediaModel(UUID.randomUUID().toString(), EnumC538220L8y.LIVE_RECORDINGS, 4);
            tikTokMediaModel.LJIILL(str);
            tikTokMediaModel.isLiveRecordingsGuide = true;
            tikTokMediaModel.date = jLongValue;
            this.LLJ = tikTokMediaModel;
        }
        return this.LLJ;
    }

    public final boolean LIZJ() {
        Long l = this.LLILZLL;
        if (l == null) {
            return false;
        }
        long jLongValue = l.longValue();
        LiveRecordingsRepository liveRecordingsRepository = this.LLILLJJLI;
        return jLongValue > (liveRecordingsRepository != null ? liveRecordingsRepository.LIZ() : 0L);
    }

    public LiveRecordingsDataManager(LifecycleOwner lifecycleOwner) {
        LiveRecordingsConfigResponse liveRecordingsConfigResponseLIZLLL;
        this.LL = lifecycleOwner;
        LiveRecordingsRepository.LIZ.getClass();
        LiveRecordingsRepository liveRecordingsRepository = (LiveRecordingsRepository) PluggableExtentionKt.pluggableSpi$default(LiveRecordingsRepository.class, false, false, false, 14, null);
        this.LLILLJJLI = liveRecordingsRepository;
        LiveRecordingsService.LIZ.getClass();
        LiveRecordingsService liveRecordingsServiceLIZ = C522560KeU.LIZ();
        this.LLILLL = liveRecordingsServiceLIZ;
        this.LLIZLLLIL = true;
        lifecycleOwner.getLifecycle().addObserver(this);
        if (liveRecordingsServiceLIZ != null && liveRecordingsServiceLIZ.isEnable() && liveRecordingsRepository != null && (liveRecordingsConfigResponseLIZLLL = liveRecordingsRepository.LIZLLL()) != null) {
            this.LLILZ = Intrinsics.LJFF(liveRecordingsConfigResponseLIZLLL.showTab, Boolean.TRUE);
            this.LLILZIL = liveRecordingsConfigResponseLIZLLL.coverUrl;
            this.LLILZLL = liveRecordingsConfigResponseLIZLLL.createTime;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        LiveRecordingsRepository liveRecordingsRepository;
        C356901a3.LIZIZ(this, lifecycleOwner);
        LiveRecordingsService liveRecordingsService = this.LLILLL;
        if (liveRecordingsService != null && liveRecordingsService.isEnable() && this.LLIZ && (liveRecordingsRepository = this.LLILLJJLI) != null) {
            liveRecordingsRepository.LJI();
        }
        this.LLIZ = false;
        LiveRecordingsRepository liveRecordingsRepository2 = this.LLILLJJLI;
        if (liveRecordingsRepository2 != null) {
            liveRecordingsRepository2.onDestroy();
        }
        this.LLILZ = false;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLIZLLLIL = true;
        this.LL.getLifecycle().removeObserver(this);
    }

    public final void LIZIZ(C533680KwQ c533680KwQ, int i, boolean z, InterfaceC528570KoB interfaceC528570KoB) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.plus(C2296908zH.LIZ()), null, new C529000Kos(this, c533680KwQ, i, z, interfaceC528570KoB, null), 2);
    }
}
