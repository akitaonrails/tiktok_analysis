package com.ss.android.ugc.aweme.translation.service;

import X.C00I7;
import X.C03H5;
import X.C05YD;
import X.C0S5G;
import X.C0S5N;
import X.C0SBA;
import X.C0SBD;
import X.C11NZ;
import X.C13IQ;
import X.C161Q;
import X.C161R;
import X.C162M;
import X.C1760006us;
import X.C194349111v;
import X.C19595011lU;
import X.C19EG;
import X.C207134163o;
import X.C705930RmZ;
import X.C710770RuN;
import X.EnumC207101162h;
import X.EnumC634640Ous;
import X.EnumC715680S5m;
import X.InterfaceC1339640kxu;
import X.InterfaceC1344290l5P;
import X.InterfaceC1731706qJ;
import X.InterfaceC19594611lQ;
import X.InterfaceC346201Wa;
import X.InterfaceC386401eo;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate;
import com.ss.android.ugc.aweme.translation.model.AutoDubbingStatusResponse;
import com.ss.android.ugc.aweme.translation.model.FeedbackReportInfoResponse;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public interface ITranslationService {
    C11NZ<FeedbackReportInfoResponse> LIZ(String str, String str2);

    C11NZ<AutoDubbingStatusResponse> LIZIZ(String str);

    boolean LIZJ(Aweme aweme, String str, String str2);

    ITranslationFeedbackDelegate LIZLLL();

    boolean LJ(Aweme aweme, Boolean bool);

    InterfaceC19594611lQ LJFF(Context context, C705930RmZ c705930RmZ, InteractStickerStruct interactStickerStruct, C194349111v c194349111v, InterfaceC386401eo interfaceC386401eo);

    C0SBA LJI(Fragment fragment, VideoItemParams videoItemParams);

    CaptionItemModel LJII(Aweme aweme, String str);

    InterfaceC1339640kxu LJIIIIZZ(LifecycleCoroutineScope lifecycleCoroutineScope);

    void LJIIIZ(EnumC715680S5m enumC715680S5m, String str);

    boolean LJIIJ(Aweme aweme, String str);

    C11NZ LJIIJJI(String str, List list);

    C11NZ<TranslationResult> LJIIL(String str);

    boolean LJIILIIL(Comment comment);

    C11NZ LJIILJJIL(long j, Aweme aweme, String str, String str2);

    boolean LJIILL(Aweme aweme, Boolean bool, Boolean bool2);

    boolean LJIILLIIL(Comment comment, EnumC715680S5m enumC715680S5m);

    String LJIIZILJ(Aweme aweme);

    int LJIJ(Aweme aweme);

    boolean LJIJI(Aweme aweme);

    boolean LJIJJ(Aweme aweme);

    void LJIJJLI(Aweme aweme, boolean z);

    <DATA extends C161R> void LJIL(EnumC207101162h enumC207101162h, C161Q<DATA> c161q, Function1<? super DATA, Unit> function1);

    boolean LJJ();

    String LJJI(Aweme aweme);

    boolean LJJIFFI(boolean z, boolean z2);

    boolean LJJII(Comment comment);

    boolean LJJIII(Aweme aweme, C0S5N c0s5n);

    void LJJIIJ(String str);

    Map<String, Object> LJJIIJZLJL(List<C19595011lU> list);

    boolean LJJIIZ(Aweme aweme, String str);

    boolean LJJIIZI(Aweme aweme, boolean z);

    boolean LJJIJ(Aweme aweme, Boolean bool, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map);

    String LJJIJIIJI(Aweme aweme);

    C00I7 LJJIJIIJIL(WeakReference<Context> weakReference, Aweme aweme, String str);

    boolean LJJIJIL(Aweme aweme);

    String LJJIJL(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map);

    void LJJIJLIJ(List<C19595011lU> list, boolean z, InterfaceC386401eo interfaceC386401eo);

    boolean LJJIL(C207134163o c207134163o, EnumC715680S5m enumC715680S5m);

    boolean LJJIZ(int i, Aweme aweme);

    boolean LJJJ(Aweme aweme);

    void LJJJI();

    void LJJJIL(int i, List list);

    String LJJJJ(Aweme aweme, String str);

    int LJJJJI(Aweme aweme);

    void LJJJJIZL(Comment comment, boolean z);

    InterfaceC346201Wa<String> LJJJJJ();

    String LJJJJJL(Aweme aweme);

    boolean LJJJJL(Aweme aweme, Boolean bool);

    boolean LJJJJLI(C207134163o c207134163o);

    String LJJJJLL();

    boolean LJJJJZ(Aweme aweme);

    void LJJJJZI(EnumC715680S5m enumC715680S5m, String str);

    int LJJJLIIL(Aweme aweme);

    void LJJJLL(List<C19595011lU> list, boolean z, InterfaceC386401eo interfaceC386401eo, HashMap<String, String> map);

    void LJJJLZIJ(String str, String str2);

    Map<String, String> LJJJZ(TextExtraStruct textExtraStruct);

    boolean LJJL(Aweme aweme);

    boolean LJJLI(C207134163o c207134163o);

    boolean LJJLIIIIJ(Aweme aweme);

    InterfaceC1344290l5P LJJLIIIJ();

    void LJJLIIIJILLIZJL();

    void LJJLIIIJJI(C207134163o c207134163o, boolean z);

    boolean LJJLIIIJJIZ(Aweme aweme);

    String LJJLIIIJL(Aweme aweme, C161Q<?> c161q);

    boolean LJJLIIIJLJLI();

    ICLATranslatabilityService LJJLIIIJLLLLLLLZ();

    void LJJLIIJ();

    boolean LJJLIL(Comment comment);

    C05YD<C710770RuN> LJJLJ();

    boolean LJJLJLI(C207134163o c207134163o);

    boolean LJJLL(Aweme aweme, C161Q c161q);

    void LJJZ();

    EnumC715680S5m LJJZZI(String str);

    C0SBA LJJZZIII(C19EG c19eg, VideoItemParams videoItemParams);

    boolean LJL(boolean z, boolean z2);

    Map<String, Object> LJLI();

    boolean LJLIIIL(Comment comment);

    int LJLIIL();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJLIL();

    String LJLILLLLZI(Aweme aweme);

    String LJLJI(Aweme aweme);

    C162M LJLJJI(EnumC634640Ous enumC634640Ous, String str);

    boolean LJLJJL(Aweme aweme, C161Q<?> c161q);

    void LJLJJLL(EnumC207101162h enumC207101162h, C1760006us c1760006us);

    <T extends ReusedAssem<T> & C03H5 & InterfaceC712990Rxx<X>, X> InterfaceC1731706qJ<Object, AssemViewModel<C0S5G>> LJLJL(T t);

    boolean LJLJLJ();

    boolean LJLJLLL(Aweme aweme);

    void LJLL(EnumC207101162h enumC207101162h);

    void LJLLI(String str);

    String LJLLILLLL(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map);

    boolean LJLLJ(Aweme aweme, C0SBD c0sbd, String str);

    void LJLLL();

    void LJLLLL(List<? extends Comment> list, Fragment fragment, String str);

    String LJLLLLLL(Aweme aweme, C161Q<?> c161q);

    boolean LJLZ(Aweme aweme);

    EnumC715680S5m LJZ(String str);

    boolean LJZI(Aweme aweme);

    boolean LJZL(String str);

    String[] LL();

    boolean LLD(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map);

    boolean LLF(Aweme aweme, Boolean bool);

    Map<EnumC207101162h, Pair<C161Q<?>, Function1<Object, Unit>>> LLFF();

    boolean LLFFF(Aweme aweme, boolean z);

    boolean LLFII(Aweme aweme, Boolean bool);

    int LLFZ(Aweme aweme);

    int LLI(String str);

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedAssem<+LX/03H5;>;:LX/0Rxx<TITEM;>;ITEM:Ljava/lang/Object;>(TT;)LX/06qJ<Ljava/lang/Object;LX/0SBA;>; */
    InterfaceC1731706qJ LLIFFJFJJ(ReusedAssem reusedAssem);

    Map<String, String> LLII(Aweme aweme);

    boolean LLIIII(Aweme aweme, boolean z);

    Map<EnumC207101162h, C1760006us> LLIIIILZ();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LLIIIJ();

    boolean LLIIIL(Aweme aweme, String str);

    C05YD<String> LLIIIZ();

    String LLIIJI(Comment comment, EnumC715680S5m enumC715680S5m);

    ListenableFuture LLIIJLIL(String str, String str2);

    String LLIIL(Aweme aweme);

    Handler LLIILII();

    void LLIILZL(EnumC207101162h enumC207101162h);

    String LLIIZ();
}
