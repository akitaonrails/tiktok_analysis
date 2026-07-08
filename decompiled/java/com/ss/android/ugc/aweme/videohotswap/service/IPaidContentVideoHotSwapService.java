package com.ss.android.ugc.aweme.videohotswap.service;

import X.C0S81;
import X.C0S88;
import X.C0S89;
import X.C0S8O;
import X.C0S8S;
import X.C0S8V;
import X.C19719912Dl;
import X.EnumC586210Myx;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface IPaidContentVideoHotSwapService {
    C0S8V LIZ(Aweme aweme, List list);

    C19719912Dl LIZIZ();

    void LIZJ(C0S89<?> c0s89);

    void LIZLLL(Aweme aweme, List list, int i, boolean z, String str, String str2, String str3, LifecycleCoroutineScope lifecycleCoroutineScope, C0S88 c0s88, C0S8O c0s8o);

    C0S8S LJ(View view, Function0<String> function0, Function0<String> function02, Function0<String> function03, Function0<? extends Aweme> function04, Function0<? extends InterfaceC665370Q7z> function05, Function1<? super Boolean, Unit> function1);

    List<Aweme> LJFF(List<? extends Aweme> list, List<C0S81> list2);

    C19719912Dl LJI();

    void LJII();

    EnumC586210Myx LJIIIIZZ(Aweme aweme, boolean z);

    void LJIIIZ(C0S8V c0s8v);

    StoryPaywallComponentTrigger LJIIJ();

    void LJIIJJI();
}
