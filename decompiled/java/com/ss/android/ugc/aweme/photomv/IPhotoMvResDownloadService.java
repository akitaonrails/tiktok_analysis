package com.ss.android.ugc.aweme.photomv;

import X.C19EG;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public interface IPhotoMvResDownloadService {
    void LIZJ(C19EG c19eg);

    void LIZLLL(CreativeModel creativeModel, List<String> list, int i, Function1<? super Effect, Unit> function1, Function0<Unit> function0);

    void reset();
}
