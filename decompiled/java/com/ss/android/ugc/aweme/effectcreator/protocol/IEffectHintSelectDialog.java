package com.ss.android.ugc.aweme.effectcreator.protocol;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public interface IEffectHintSelectDialog {
    void LIZ(List<EffectHint> list, EffectHint effectHint, FragmentManager fragmentManager, Integer num, Function1<? super EffectHint, Unit> function1);
}
