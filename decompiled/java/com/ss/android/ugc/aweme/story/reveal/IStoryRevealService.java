package com.ss.android.ugc.aweme.story.reveal;

import X.C19EG;
import X.EnumC1231540i9Y;
import X.EnumC717440SCg;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.story.model.TiktokV1StoryGetSocialProofResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public interface IStoryRevealService {
    boolean LIZ(C19EG c19eg, String str, EnumC717440SCg enumC717440SCg, Function0<Unit> function0);

    EnumC717440SCg LIZIZ();

    void LIZJ(String str, EnumC1231540i9Y enumC1231540i9Y);

    boolean LIZLLL(int i);

    boolean LJ();

    void LJFF();

    boolean LJI();

    void LJII();

    void LJIIIIZZ();

    long LJIIIZ();

    void LJIIJ();

    void LJIIJJI();

    void LJIIL(String str, boolean z);

    boolean LJIILIIL();

    boolean LJIILJJIL();

    void LJIILL();

    void LJIILLIIL(String str, boolean z);

    void LJIIZILJ(String str, String str2, boolean z);

    Object getSocialProof(int i, InterfaceC1364105Vn<? super TiktokV1StoryGetSocialProofResponse> interfaceC1364105Vn);
}
