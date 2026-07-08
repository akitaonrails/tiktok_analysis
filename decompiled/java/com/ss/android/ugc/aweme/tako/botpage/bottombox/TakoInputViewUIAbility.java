package com.ss.android.ugc.aweme.tako.botpage.bottombox;

import X.C1854150yLl;
import X.C1854790yMn;
import X.EnumC1854550yMP;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public interface TakoInputViewUIAbility extends InterfaceC494301wD {
    boolean BF();

    void Jd(TakoReferenceAskInfo takoReferenceAskInfo, boolean z);

    TakoEditAskInfo Oo0();

    void Pd2();

    void Pt2();

    List<BaseImage> TG1();

    void Tc();

    C1854790yMn Y5();

    void eh(String str, Function2<? super BaseImage, ? super Integer, Unit> function2);

    void fg(TakoEditAskInfo takoEditAskInfo, boolean z);

    View getInput();

    void kd();

    void na(String str, Function2<? super BaseImage, ? super Integer, Unit> function2);

    void w7(EnumC1854550yMP enumC1854550yMP, String str, String str2, List<BaseImage> list, Integer num, String str3, TakoTemplateInfo takoTemplateInfo, boolean z, boolean z2);

    TakoReferenceAskInfo xr2();

    C1854150yLl z22();

    String za1();

    String zi1();
}
