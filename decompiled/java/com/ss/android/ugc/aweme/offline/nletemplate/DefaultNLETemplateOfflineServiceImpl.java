package com.ss.android.ugc.aweme.offline.nletemplate;

import X.C0L9D;
import Y.ARunnableS108S0100000_8;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultNLETemplateOfflineServiceImpl implements INLETemplateOfflineService {
    @Override // X.InterfaceC533110KvV
    public final void LIZ(C0L9D c0l9d, AutomationResult automationResult) {
    }

    @Override // X.InterfaceC533110KvV
    public final void LIZJ(AutomationResult automationResult) {
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final void LIZLLL(String str, LifecycleOwner lifecycleOwner, Runnable runnable) {
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final void LJ(Activity activity, List list, AwS552S0100000_8 awS552S0100000_8, ARunnableS108S0100000_8 aRunnableS108S0100000_8, ARunnableS108S0100000_8 aRunnableS108S0100000_82, AwS587S0100000_8 awS587S0100000_8, ARunnableS108S0100000_8 aRunnableS108S0100000_83) {
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC533110KvV
    public final void LJI(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final Pair<String, String> LIZIZ() {
        return new Pair<>("filter_type", CardStruct.IStatusCode.DEFAULT);
    }
}
