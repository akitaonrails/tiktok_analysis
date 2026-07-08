package com.ss.android.ugc.aweme.service;

import X.AbstractC738140SxQ;
import X.C03H5;
import X.C0M3E;
import X.C0M3F;
import X.C0RQ9;
import X.C0S5R;
import X.C0S5S;
import X.C0SAE;
import X.C120B;
import X.C13IQ;
import X.C19647311tv;
import X.C19714112Bf;
import X.C19715312Br;
import X.C19715412Bs;
import X.C19EG;
import X.C587790N3p;
import X.C720060SMi;
import X.EnumC1334360kpO;
import X.EnumC1781440wSU;
import X.EnumC671230QUn;
import X.InterfaceC1685420txc;
import X.InterfaceC21663219qI;
import X.InterfaceC469401sC;
import X.InterfaceC661560PxC;
import X.InterfaceC710220RtU;
import X.InterfaceC720540SOe;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes36.dex */
public interface IPostModeService {
    int LIZ();

    boolean LIZIZ();

    IInterceptor LIZJ();

    boolean LIZLLL();

    long LJ(String str, String str2, String str3);

    Object LJFF(Object obj);

    boolean LJI(String str);

    InterfaceC720540SOe LJII();

    boolean LJIIIIZZ(Aweme aweme, String str, boolean z);

    void LJIIIZ(Context context);

    void LJIIJ(int i, Context context, String str, List list);

    C0M3E LJIIJJI(ViewGroup viewGroup);

    C13IQ<?> LJIIL();

    boolean LJIILIIL(Aweme aweme, String str);

    void LJIILJJIL();

    void LJIILL();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIILLIIL();

    Object LJIIZILJ(Object obj);

    boolean LJIJ();

    void LJIJI(C19EG c19eg, VideoItemParams videoItemParams, PostModeDetailParams postModeDetailParams, String str, Bitmap bitmap, SlidesImageLoadParams slidesImageLoadParams, Fragment fragment, Function1 function1);

    InterfaceC661560PxC LJIJJ(ViewGroup viewGroup, String str, EnumC671230QUn enumC671230QUn, Function1<? super String, Unit> function1, boolean z, EnumC1781440wSU enumC1781440wSU, InterfaceC21663219qI interfaceC21663219qI);

    boolean LJIJJLI();

    String LJIL(String str);

    boolean LJJ();

    void LJJI(int i, Context context, String str, String str2, String str3, String str4, String str5, String str6, List list, AwS572S0100000_28 awS572S0100000_28);

    void LJJIFFI(Context context, String str, Aweme aweme, IntRange intRange, EnumC1334360kpO enumC1334360kpO);

    ReusedUIContentAssem<? extends C03H5> LJJII();

    Pair LJJIII(Context context, C120B c120b, String str, ClientText clientText, boolean z, boolean z2, Float f, Float f2, int i, C19715412Bs c19715412Bs, C720060SMi c720060SMi, C19714112Bf c19714112Bf);

    Object LJJIIJ(Object obj);

    boolean LJJIIJZLJL(Aweme aweme);

    void LJJIIZ(String str, Context context, Aweme aweme, int i, EnumC1334360kpO enumC1334360kpO, Function1<? super InterfaceC469401sC, Unit> function1, Function2<? super File, ? super Throwable, Unit> function2);

    boolean LJJIIZI(Fragment fragment);

    void LJJIJ(Context context, Aweme aweme, int i, EnumC1334360kpO enumC1334360kpO, C587790N3p c587790N3p);

    boolean LJJIJIIJI();

    C13IQ<? extends AbstractC738140SxQ> LJJIJIIJIL();

    int LJJIJIL(Aweme aweme);

    boolean LJJIJL();

    Object LJJIJLIJ(Object obj);

    IPhotoModeExtraService LJJIL();

    boolean LJJIZ(Aweme aweme);

    C13IQ<?> LJJJ();

    boolean LJJJI(Aweme aweme, String str);

    void LJJJIL(String str);

    float LJJJJ();

    boolean LJJJJI(String str, String str2, String str3);

    Integer LJJJJIZL(String str, String str2, String str3);

    void LJJJJJ(String str);

    FeedContentLayoutInfo LJJJJJL(Context context, C120B c120b, String str, ClientText clientText, boolean z, Float f, int i, C19715312Br c19715312Br);

    void LJJJJL(int i, Context context, String str, List list);

    boolean LJJJJLI(boolean z, boolean z2, Float f, int i, int i2);

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJJJLL();

    void LJJJJZ(String str, Aweme aweme, int i, Function2<? super Bitmap, ? super Throwable, Unit> function2);

    Integer LJJJJZI();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJJLIIL(C0RQ9 c0rq9);

    C19647311tv LJJJLL(Context context, FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, int i3, int i4, boolean z);

    IPhotoModeLogUtil LJJJLZIJ();

    boolean LJJJZ(Activity activity);

    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJL();

    C19647311tv LJJLI(Context context, FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, int i3, int i4, View view, C720060SMi c720060SMi, int i5, boolean z, InterfaceC710220RtU interfaceC710220RtU);

    void LJJLIIIIJ(Aweme aweme, int i, InterfaceC1685420txc<? super Bitmap, ? super Throwable, ? super String, ? super Integer, ? super Integer, Unit> interfaceC1685420txc);

    boolean LJJLIIIJ();

    boolean LJJLIIIJILLIZJL();

    void LJJLIIIJJI(int i, String str, long j, String str2, String str3, boolean z);

    boolean LJJLIIIJJIZ(Aweme aweme);

    boolean LJJLIIIJL();

    int LJJLIIIJLJLI(boolean z);

    C13IQ<? extends ReusedUIContentAssem<?>> LJJLIIIJLLLLLLLZ();

    String LJJLIIJ();

    Object LJJLIL(Aweme aweme, Object obj);

    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJLJ();

    C0M3F LJJLJLI(ViewGroup viewGroup, boolean z);

    boolean LJJLL(Aweme aweme);

    void LJJZ(Activity activity, int i, Object obj, Object obj2);

    Pair<Bitmap.Config, Map<String, Object>> LJJZZI(UrlModel urlModel);

    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJZZIII();

    Pair LJL(Context context, Aweme aweme, C0S5R c0s5r, C0S5S c0s5s, boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, InteractAreaCommonAbility interactAreaCommonAbility, BottomBarPriorityAbility bottomBarPriorityAbility, String str, boolean z5);

    void LJLI(EnumC1334360kpO enumC1334360kpO, String str);

    C0SAE LJLIIIL();

    boolean LJLIIL(Aweme aweme, String str, boolean z);

    void LJLIL(C19EG c19eg);

    boolean showEngagementCount();
}
