package com.ss.android.ugc.aweme.interfaces;

import X.C0L7K;
import X.C1418100n0S;
import X.C1428780nHg;
import X.C1428840nHm;
import X.C1429200nIM;
import X.C532330KuF;
import X.C573580Mea;
import X.C573920Mf8;
import X.EnumC1412640mre;
import X.InterfaceC1428880nHq;
import X.InterfaceC1635410sex;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS3S2400000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public interface ITemplateResourceService {
    C1429200nIM LIZ(Context context, String str, String str2, AVMusic aVMusic, Boolean bool, C1418100n0S c1418100n0S, InterfaceC1428880nHq interfaceC1428880nHq);

    void LIZIZ(InterfaceC1635410sex interfaceC1635410sex, String str, AssetType assetType, boolean z, boolean z2, IFetchAssetItemInfo iFetchAssetItemInfo);

    void LIZJ(String str, Pair pair, int i, AwS3S2400000_8 awS3S2400000_8, AwS587S0100000_8 awS587S0100000_8);

    C1428780nHg LIZLLL(Context context, String str, EnumC1412640mre enumC1412640mre, CutsameDataItem cutsameDataItem, String str2, String str3, Boolean bool, C573920Mf8 c573920Mf8, TemplateSourceConfig templateSourceConfig, C1418100n0S c1418100n0S, boolean z, C0L7K c0l7k);

    void LJ(List list, Pair pair, AwS587S0100000_8 awS587S0100000_8, AwS622S0100000_8 awS622S0100000_8, String str, String str2, String str3);

    void LJFF(Context context, CutSource cutSource, C1428840nHm c1428840nHm, LifecycleOwner lifecycleOwner, Integer num);

    void LJI(String str, Pair pair, int i, String str2, Function1 function1, Function2 function2, AFwS239S0000000_8 aFwS239S0000000_8, String str3, String str4);

    void LJII(InterfaceC1635410sex interfaceC1635410sex, String str, C573580Mea c573580Mea);

    C532330KuF LJIIIIZZ(String str);

    void LJIIIZ(Context context, String str, C1428840nHm c1428840nHm, LifecycleOwner lifecycleOwner, Integer num);

    void LJIIJ();

    String getRegion();
}
