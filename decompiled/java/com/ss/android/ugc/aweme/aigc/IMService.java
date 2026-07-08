package com.ss.android.ugc.aweme.aigc;

import X.C19EG;
import X.C21350518gx;
import X.InterfaceC1364105Vn;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface IMService {
    void LIZ(Context context, Long l, String str);

    void LIZIZ(Context context, AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03);

    void LIZJ(C19EG c19eg, AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, AwS552S0100000_8 awS552S0100000_83);

    Object LIZLLL(long j, String str, InterfaceC1364105Vn<? super Pair<? extends List<MentionDataItem>, Boolean>> interfaceC1364105Vn);

    MutableLiveData LJ();

    MutableLiveData LJFF();
}
