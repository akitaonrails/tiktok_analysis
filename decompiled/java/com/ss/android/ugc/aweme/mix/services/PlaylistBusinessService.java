package com.ss.android.ugc.aweme.mix.services;

import X.C1220000hqw;
import X.C13LE;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C452070Ho5;
import X.C723000SXq;
import X.C724750Sbp;
import X.C736950SvV;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS96S1000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PlaylistBusinessService implements IPlaylistBusinessService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.mix.services.IPlaylistBusinessService
    public final PlaylistConsumptionViewModel LIZ(String str, C723000SXq c723000SXq) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        AwS96S1000000_11 awS96S1000000_11 = new AwS96S1000000_11(str, 10);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistConsumptionViewModel.class);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(675);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(c723000SXq);
        if (c723000SXq instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) c723000SXq;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        return (PlaylistConsumptionViewModel) new C736950SvV(c19719912DlLIZ, awS96S1000000_11, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS243S0000000_11, null, null, null).getValue();
    }
}
