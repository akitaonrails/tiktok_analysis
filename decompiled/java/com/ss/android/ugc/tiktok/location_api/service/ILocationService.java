package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC1549150qPp;
import X.AbstractC738140SxQ;
import X.C0CCZ;
import X.C1202170hOB;
import X.C13IQ;
import X.InterfaceC1207490hWl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public interface ILocationService extends InterfaceC1207490hWl {
    Map<String, String> LIZ();

    void LIZIZ(Fragment fragment, Aweme aweme, String str, boolean z);

    View LIZJ(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv);

    boolean LJ();

    C0CCZ LJFF();

    void LJIIIZ(View view, boolean z);

    View LJIIJ(View view);

    boolean LJIIJJI();

    List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIILIIL();

    void LJIILJJIL();

    void LJIILL(C1202170hOB c1202170hOB);

    void LJIILLIIL(Context context, View view, Function0 function0);

    boolean LJIIZILJ();

    boolean LJIJ();

    C13IQ<? extends AbstractC738140SxQ> LJIJI();

    void LJIJJLI();

    boolean LJIL(String... strArr);
}
