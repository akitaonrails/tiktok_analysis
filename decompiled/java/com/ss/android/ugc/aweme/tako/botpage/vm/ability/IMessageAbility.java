package com.ss.android.ugc.aweme.tako.botpage.vm.ability;

import X.C0ZP4;
import X.C1854150yLl;
import X.C1861290yXH;
import X.C1862000yYQ;
import X.C1863340yaa;
import X.C1875307Wd;
import X.C1875407We;
import X.C291001Au;
import X.C326880Cre;
import X.C665120Q7a;
import X.C830490Whz;
import X.EnumC1858090yS7;
import X.InterfaceC1364105Vn;
import X.InterfaceC1859790yUr;
import X.InterfaceC1861530yXf;
import X.InterfaceC332260D0u;
import X.InterfaceC494301wD;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.NovelStatus;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import defpackage.d8;
import defpackage.u2;
import defpackage.w2;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public interface IMessageAbility extends InterfaceC494301wD {
    void AE1(int i);

    void B30();

    void B82(Function1<? super TakoActiveBotItem, Unit> function1);

    List<Message> CM2(String str);

    void Cs0(String str, BaseVideo baseVideo, BaseImage baseImage, ExtraRequestInfo extraRequestInfo, Map map, C830490Whz c830490Whz, int i, int i2, Integer num, String str2, String str3, String str4, Map map2, TakoEditAskInfo takoEditAskInfo, String str5, int i3);

    void DB();

    boolean DD2(String str);

    void DF0(C1854150yLl c1854150yLl);

    boolean DG();

    Message DL1(String str);

    TakoEnterParams DN1();

    void DZ0(Message message);

    void EG1(Function1<? super SubConversationConfig, Unit> function1);

    void FP1(ConversationInfo conversationInfo);

    void G01(LifecycleOwner lifecycleOwner, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super SearchLandingPageResponse, Unit> function12);

    void Gn2(Function1<? super Long, Unit> function1);

    void H61(InterfaceC1861530yXf interfaceC1861530yXf);

    void IW1(Message message);

    void Ij2(Function1<? super Long, Unit> function1);

    void K12(C1861290yXH c1861290yXH, String str);

    String L81();

    void Le2();

    void MB1(C1854150yLl c1854150yLl);

    void ME(Function1<? super C291001Au<C1875307Wd>, Unit> function1);

    void MF0(C665120Q7a c665120Q7a, String str);

    void Nh1(boolean z);

    void Nl2();

    void O62(String str, d8 d8Var);

    void P92(Message message);

    List<Message> PH2(String str);

    void Q31();

    void QB0(TakoActiveBotItem takoActiveBotItem);

    void QC1(Message message);

    void QN0();

    void R40(Function1<? super Boolean, Unit> function1);

    void Rl2(String str, boolean z, EnumC1858090yS7 enumC1858090yS7, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, TakoActiveActionItem takoActiveActionItem, TakoActiveBotItem takoActiveBotItem, String str2, int i, Integer num, int i2, int i3, ExtraRequestInfo extraRequestInfo, Map<String, String> map4, String str3, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo);

    void S22(String str, boolean z, EnumC1858090yS7 enumC1858090yS7, Map map, C830490Whz c830490Whz, Long l, AwS110S1200000_27 awS110S1200000_27);

    void S81(C1862000yYQ c1862000yYQ);

    void SC2();

    void Sx2(boolean z);

    void Tk2(String str, Function1 function1, boolean z, boolean z2);

    Message U30(Message message);

    void U51();

    void U61(int i, int i2, String str, String str2);

    void Uj0(C1863340yaa c1863340yaa);

    void WJ1();

    void Wk0(Message message, Message message2, int i, int i2, Map<String, String> map, Map<String, String> map2);

    void Wl0();

    void XK2(NovelStatus novelStatus, InterfaceC1859790yUr interfaceC1859790yUr);

    void YJ0();

    void YM(Context context, TakoActiveBotItem takoActiveBotItem, boolean z);

    void YV0(long j, Function1 function1);

    void Zd(Function1<? super TakoActiveActionItem, Unit> function1);

    void aC2(Function1<? super C291001Au<Unit>, Unit> function1);

    void bL0(String str, String str2);

    void c50();

    void cE2(Function1<? super Boolean, Unit> function1);

    void cN0(Context context, Message message, List<Message> list, boolean z);

    void cj1();

    void d11(String str);

    void dO1(Function1<? super List<ConversationInfo>, Unit> function1);

    void dc1(Context context, String str, Function0<Unit> function0);

    void dt0(Message message, boolean z);

    void e12(AwS641S0100000_27 awS641S0100000_27);

    Integer eR0();

    void fc2(Function0<Unit> function0);

    void gC1(int i);

    void gC2();

    void gl2(Function1<? super C1854150yLl, Unit> function1);

    void h42(Context context, SubConversationEntranceInfo subConversationEntranceInfo);

    List<Message> iP();

    void iU(Function1<? super C1854150yLl, Unit> function1);

    void j10(BatchUpdateMessage batchUpdateMessage, List<BatchUpdateMessage> list, boolean z, w2.a aVar);

    void kE1(Message message, Map<String, String> map);

    Message lN();

    InterfaceC332260D0u<Boolean> mK1();

    Message mv2(Message message, Function1<? super Message, Boolean> function1);

    void nB0(Function0<Unit> function0);

    void nX0(int i, String str);

    void nj1(Long l, String str, String str2, Function1<? super TakoSug, Unit> function1, Function1<? super EntityIntro, Unit> function12, Integer num);

    void nv1(TakoSug takoSug);

    void o72(Function1<? super C291001Au<String>, Unit> function1);

    boolean oj();

    SubConversationConfig ou();

    TakoSug ov2();

    void po1(Context context, ConversationInfo conversationInfo);

    Object ql0(InterfaceC1364105Vn<? super u2> interfaceC1364105Vn);

    int rF();

    void ru2(int i);

    void rv1(String str, List list, List list2, boolean z, EnumC1858090yS7 enumC1858090yS7, int i, Integer num, int i2, String str2, String str3, Map map, C830490Whz c830490Whz, boolean z2, ExtraRequestInfo extraRequestInfo, Map map2, Map map3, String str4, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo);

    void sI0(boolean z);

    List<C326880Cre> sL();

    void tU1(Function0<Unit> function0);

    void tV0(String str, String str2, String str3, String str4, String str5, String str6);

    C0ZP4 tx1(Function1<? super Boolean, Unit> function1);

    void ua2(Message message, boolean z, boolean z2);

    void v21(Message message);

    void vL(String str);

    void w41();

    void we1(Function1<? super C291001Au<C1875407We>, Unit> function1);

    void yW1(long j);

    void z52(InterfaceC1861530yXf interfaceC1861530yXf);

    void zG0(Message message);

    void zJ1(boolean z);

    void zN(int i, String str);
}
