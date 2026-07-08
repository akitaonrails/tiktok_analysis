package com.ss.android.ugc.aweme;

import X.C03H5;
import X.C13IQ;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;

/* JADX INFO: loaded from: classes12.dex */
public interface ILandscapeFeedService {
    boolean LIZ(Activity activity);

    boolean LIZIZ(Aweme aweme);

    boolean LIZJ(Aweme aweme);

    boolean LIZLLL();

    int LJ(Context context, Aweme aweme);

    void LJFF(InterfaceC665370Q7z interfaceC665370Q7z, int i, boolean z);

    boolean LJI(Context context, InterfaceC665370Q7z interfaceC665370Q7z);

    boolean LJII(String str);

    C13IQ<? extends UIContentAssem> LJIIIIZZ();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIIZ();

    void LJIIJ(ReusedUIAssem<? extends C03H5> reusedUIAssem, int i, Aweme aweme);

    boolean LJIIJJI(int i, Aweme aweme);

    C13IQ<? extends UIContentAssem> LJIIL();

    boolean LJIILIIL(int i, Aweme aweme);

    void LJIILJJIL(Assembler assembler, InteractAreaComponent interactAreaComponent);

    boolean LJIILL(Context context, Aweme aweme);
}
