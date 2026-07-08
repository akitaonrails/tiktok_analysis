package com.ss.android.ugc.aweme.service;

import X.AbstractC738140SxQ;
import X.C03H5;
import X.C0SJF;
import X.C13IQ;
import X.C19EG;
import X.C690870R8b;
import X.C718360SFu;
import X.C718840SHq;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface IPaidContentFeedSeries {
    void LIZ(C19EG c19eg, Context context, String str, Aweme aweme, String str2, Boolean bool, String str3, Function1<? super SmartRoute, Unit> function1);

    C0SJF LIZIZ(C0SJF c0sjf, Context context, Aweme aweme);

    Object LIZJ(C718360SFu c718360SFu);

    ReusedAssem<? extends C03H5> LIZLLL();

    void LJ(TuxTextView tuxTextView, List<String> list);

    C718840SHq LJFF(C718840SHq c718840SHq, Context context, Aweme aweme);

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJI();

    ReusedAssem<? extends C03H5> LJII();

    boolean LJIIIIZZ(Aweme aweme);

    Function0<C13IQ<? extends ReusedUISlotAssem<?>>> LJIIIZ();

    C13IQ<? extends AbstractC738140SxQ> LJIIJ();

    Object LJIIJJI();

    Object LJIIL(C718360SFu c718360SFu);

    boolean LJIILIIL(Fragment fragment);

    Object LJIILJJIL();

    Object LJIILL();

    boolean LJIILLIIL(Aweme aweme);

    C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJIIZILJ(String str);

    Object LJIJ();

    Object LJIJI(Object obj);

    Object LJIJJ(Object obj);

    Object LJIJJLI(Object obj);

    boolean LJIL(Aweme aweme);

    C13IQ LJJ(C690870R8b c690870R8b);

    Object LJJI();
}
