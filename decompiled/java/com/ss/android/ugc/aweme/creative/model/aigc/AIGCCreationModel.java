package com.ss.android.ugc.aweme.creative.model.aigc;

import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGCCreationModel extends Parcelable {
    AIGCSessionModel SN();

    AIGCGenerationModel ZG();

    <T> T kx(Function1<? super WritableAIGCGenerationModel, ? extends T> function1);
}
