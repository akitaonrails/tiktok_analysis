package com.ss.android.ugc.tools.chat.message.component;

import X.C01GW;
import X.C06P6;
import X.C0DXR;
import X.C0N7O;
import X.C0VWN;
import X.C1357150lQ9;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1664770tQJ;
import X.C18ZE;
import X.C19A3;
import X.C1DRG;
import X.C201955140j;
import X.C20603715jn;
import X.C21290718Tp;
import X.C21373518kf;
import X.C21674119s3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C425140Glk;
import X.C452501pT;
import X.C814420VxA;
import X.C869590Y9l;
import X.C904630ZeH;
import X.C904680ZeM;
import X.C904770ZeV;
import X.C904800ZeY;
import X.C904840Zec;
import X.C904970Zep;
import X.C904980Zeq;
import X.C904990Zer;
import X.C905000Zes;
import X.C905030Zev;
import X.C905120Zf4;
import X.C905180ZfA;
import X.C905220ZfE;
import X.EnumC461200I6s;
import X.InterfaceC1731706qJ;
import X.InterfaceC1755906uD;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC892260YzQ;
import X.InterfaceC904710ZeP;
import X.InterfaceC905050Zex;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS25S0101000_14;
import Y.AsS41S0100000_14;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolder;
import com.ss.android.ugc.tools.chat.common.bridge.AssemCallComponentBridge;
import com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi;
import com.ss.android.ugc.tools.chat.message.compact.AiChatReadStateHandler;
import ge.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class AiChatMessageInfraComponent extends i<AiChatMessageInfraApi, C18ZE, C904980Zeq, C905000Zes> implements AiChatMessageInfraApi, InterfaceC905050Zex, InterfaceC379610EuV {
    public static final C905030Zev LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1DRG LLJILJILJ;
    public final C904840Zec LLJILLL;
    public final C01GW LLJJ;
    public final Set<IMessageEventProtocol> LLJJI;
    public C904770ZeV LLJJIII;
    public View LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public Function1<? super Boolean, Unit> LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public C904970Zep LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Zev] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AiChatMessageInfraComponent.class, "streamingComponent", "getStreamingComponent()Lcom/ss/android/ugc/aweme/im/streaming/sugar/internal/StreamingComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = new Object() { // from class: X.0Zev
        };
    }

    private final void d5() {
        this.LLJJJ = 0;
        if (this.LLJJJIL) {
            this.LLJJJIL = false;
            Function1<? super Boolean, Unit> function1 = this.LLJJIJIL;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
    }

    private final C905180ZfA oU1() {
        return (C905180ZfA) this.LLJJJJJIL.getValue(this, LLJJL[0]);
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public List<C869590Y9l> Fu() {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV == null || (c904680ZeM = c904770ZeV.LJIIIIZZ) == null || (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) == null) {
            return null;
        }
        return messageListAbilityHolderLIZ.vi2();
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void Gv0() {
        AiChatReadStateHandler aiChatReadStateHandler;
        InterfaceC892260YzQ interfaceC892260YzQ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV == null || (aiChatReadStateHandler = c904770ZeV.LJFF) == null || (interfaceC892260YzQ = (InterfaceC892260YzQ) aiChatReadStateHandler.LL.getValue()) == null) {
            return;
        }
        interfaceC892260YzQ.lz0();
    }

    public final C904800ZeY K4() {
        return (C904800ZeY) this.LLJJ.getValue();
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void Sq1() {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV == null || (c904680ZeM = c904770ZeV.LJIIIIZZ) == null || (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) == null) {
            return;
        }
        messageListAbilityHolderLIZ.QU0(new C06P6(false));
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void ca0() {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV == null || (c904680ZeM = c904770ZeV.LJIIIIZZ) == null || (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) == null) {
            return;
        }
        messageListAbilityHolderLIZ.QU0(new C06P6(false));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C904980Zeq> o2() {
        return AFwS201S0000000_14.get$arr$(339);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C905000Zes> w2() {
        return new AwS558S0100000_14(this, 1244);
    }

    public final C904840Zec H4() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    private final void F4(C904970Zep c904970Zep) {
        C425140Glk c425140Glk;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = c904970Zep.LIZIZ;
        this.LLJJIJIIJIL = viewOnAttachStateChangeListenerC20604515jv;
        if ((viewOnAttachStateChangeListenerC20604515jv instanceof C425140Glk) && (c425140Glk = (C425140Glk) viewOnAttachStateChangeListenerC20604515jv) != null) {
            c425140Glk.setAsymmetricFadingEdgeEnabled(this.LLJILLL.LIZLLL);
        }
        c904970Zep.LIZIZ.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJILLL.LJ))));
        Iterator<? extends C0DXR> it2 = this.LLJILLL.LJFF.iterator();
        while (it2.hasNext()) {
            c904970Zep.LIZIZ.addItemDecoration(it2.next());
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = c904970Zep.LIZIZ;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LJIIZILJ = true;
        viewOnAttachStateChangeListenerC20604515jv2.setListConfig(c20603715jn);
        C0VWN.LIZ("ai_chat_message_fps", false).LIZIZ(c904970Zep.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("chat room is created: ");
        sbLIZ.append(K4().LIZIZ);
        C201955140j.LIZLLL(C1357150lQ9.LIZIZ, "AiChatMessageComponent", C2188811AlT.LIZIZ(sbLIZ));
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = c904970Zep.LIZIZ;
            LifecycleOwner lifecycleOwner = c904970Zep.LIZJ;
            ViewModelStoreOwner viewModelStoreOwner = c904970Zep.LIZLLL;
            C905180ZfA c905180ZfAOU1 = oU1();
            C905220ZfE c905220ZfE = new C905220ZfE(true);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(viewOnAttachStateChangeListenerC20604515jv3, 1308));
            C904630ZeH c904630ZeH = c904770ZeV.LJI;
            C21373518kf c21373518kf = c904770ZeV.LJIIIZ;
            if (c21373518kf == null) {
                synchronized (c904770ZeV) {
                    c21373518kf = c904770ZeV.LJIIIZ;
                    if (c21373518kf == null) {
                        c21373518kf = new C21373518kf(c904770ZeV.LIZJ);
                        c904770ZeV.LJIIIZ = c21373518kf;
                    }
                }
            }
            C904680ZeM c904680ZeMLIZ = c904770ZeV.LIZ(viewOnAttachStateChangeListenerC20604515jv3, lifecycleOwner, new C905120Zf4(c01gwLIZIZ, lifecycleOwner, viewModelStoreOwner, c904630ZeH, c21373518kf, c904770ZeV.LIZLLL, c905220ZfE, C0N7O.IC_VISUAL_POET, new InterfaceC904710ZeP() { // from class: X.0Zet
                @Override // X.InterfaceC904710ZeP
                public final Map<String, String> LIZ() {
                    return null;
                }
            }), c905180ZfAOU1);
            c904770ZeV.LJIIIIZZ = c904680ZeMLIZ;
            AiChatReadStateHandler aiChatReadStateHandler = new AiChatReadStateHandler((InterfaceC1755906uD) c904680ZeMLIZ.LIZ.LJIIIZ.getValue(), lifecycleOwner);
            c904770ZeV.LJFF = aiChatReadStateHandler;
            c904770ZeV.LJII.LL.add(aiChatReadStateHandler);
            c904770ZeV.LJII.LLILLJJLI.add(c904770ZeV.LJFF);
        }
        this.LLJILLL.getClass();
        C1558520qew.LJII(C1558360qeg.LJ(c904970Zep.LIZIZ, null), new AssemCallComponentBridge(getDiContainer()), AssemCallComponentBridge.class, null, c904970Zep.LIZJ);
        k5(c904970Zep.LIZIZ);
    }

    private final void O4(int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS25S0101000_14(i, viewOnAttachStateChangeListenerC20604515jv, 4));
    }

    private final boolean Z4(C904800ZeY c904800ZeY) {
        if ((!a0.LJJJIL(c904800ZeY.LIZ)) && (!a0.LJJJIL(c904800ZeY.LIZIZ))) {
            return true;
        }
        return false;
    }

    private final void k5(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS41S0100000_14(this, 2));
    }

    public final void P4(long j) {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null && (c904680ZeM = c904770ZeV.LJIIIIZZ) != null && (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) != null) {
            Iterator<C869590Y9l> it2 = messageListAbilityHolderLIZ.vi2().iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().getMsgId() == j) {
                    if (i != -1) {
                        O4(i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void Pc(int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        if (viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom() == i) {
            viewOnAttachStateChangeListenerC20604515jv.requestLayout();
        } else {
            viewOnAttachStateChangeListenerC20604515jv.setPadding(viewOnAttachStateChangeListenerC20604515jv.getPaddingLeft(), viewOnAttachStateChangeListenerC20604515jv.getPaddingTop(), viewOnAttachStateChangeListenerC20604515jv.getPaddingRight(), i);
        }
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void R80(C904800ZeY c904800ZeY) {
        if (!Z4(c904800ZeY)) {
            return;
        }
        this.LLJILLL.LIZ = c904800ZeY;
        C904970Zep c904970Zep = this.LLJJJJ;
        if (c904970Zep == null || this.LLJJIII != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initSessionInfo: ");
        sbLIZ.append(c904800ZeY);
        C21290718Tp.LIZIZ("AiChatMessageComponent", C2188811AlT.LIZIZ(sbLIZ));
        C904770ZeV c904770ZeV = new C904770ZeV(c904800ZeY, this.LLJILLL);
        Iterator<T> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            c904770ZeV.LJII.LL.add((IMessageEventProtocol) it2.next());
        }
        this.LLJJIII = c904770ZeV;
        F4(c904970Zep);
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void RP1(int i) {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null && (c904680ZeM = c904770ZeV.LJIIIIZZ) != null && (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) != null) {
            messageListAbilityHolderLIZ.nt2(i, EnumC461200I6s.TOP, false, null, null, null);
        }
    }

    public final void T4(String str) {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null && (c904680ZeM = c904770ZeV.LJIIIIZZ) != null && (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) != null) {
            Iterator<C869590Y9l> it2 = messageListAbilityHolderLIZ.vi2().iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getUuid(), str)) {
                    if (i != -1) {
                        O4(i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public <T> T Ue1(Function2<? super View, ? super ViewOnAttachStateChangeListenerC20604515jv, ? extends T> function2) {
        return function2.invoke(this.LLJJIJI, this.LLJJIJIIJIL);
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void Uk(long j) {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null && (c904680ZeM = c904770ZeV.LJIIIIZZ) != null && (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) != null) {
            messageListAbilityHolderLIZ.xh1(j, EnumC461200I6s.TOP, true, null, new C904990Zer(this, j), null);
            d5();
        }
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void g6(Function1<? super Boolean, Unit> function1) {
        this.LLJJIJIL = function1;
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void lb(IMessageEventProtocol iMessageEventProtocol) {
        this.LLJJI.add(iMessageEventProtocol);
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null) {
            c904770ZeV.LJII.LL.add(iMessageEventProtocol);
        }
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void mv(boolean z) {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        if (z) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv == null) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                final Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
                C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0Zeu
                    @Override // X.C21674119s3
                    public final int LJIILL() {
                        return 1;
                    }
                };
                c21674119s3.LIZ = 0;
                layoutManager.startSmoothScroll(c21674119s3);
                return;
            }
            return;
        }
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null && (c904680ZeM = c904770ZeV.LJIIIIZZ) != null && (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) != null) {
            messageListAbilityHolderLIZ.QU0(new C06P6(true));
        }
        d5();
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void pj(IMessageEventProtocol iMessageEventProtocol) {
        this.LLJJI.remove(iMessageEventProtocol);
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null) {
            c904770ZeV.LJII.LL.remove(iMessageEventProtocol);
        }
    }

    public AiChatMessageInfraComponent(C19A3 c19a3, C1DRG c1drg, C904840Zec c904840Zec) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c904840Zec;
        this.LLJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1245));
        this.LLJJI = new LinkedHashSet();
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C905180ZfA.class, null);
    }

    @Override // com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi
    public void kw(String str, long j, boolean z) {
        C904680ZeM c904680ZeM;
        MessageListAbilityHolder messageListAbilityHolderLIZ;
        C904770ZeV c904770ZeV = this.LLJJIII;
        if (c904770ZeV != null && (c904680ZeM = c904770ZeV.LJIIIIZZ) != null && (messageListAbilityHolderLIZ = c904680ZeM.LIZ()) != null) {
            Iterator<C869590Y9l> it2 = messageListAbilityHolderLIZ.vi2().iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getUuid(), str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            AwS128S1100000_14 awS128S1100000_14 = new AwS128S1100000_14(this, str, 9);
            if (i != -1) {
                messageListAbilityHolderLIZ.nt2(i, EnumC461200I6s.TOP, z, null, awS128S1100000_14, null);
            } else {
                messageListAbilityHolderLIZ.d42(j, EnumC461200I6s.TOP, z, null, awS128S1100000_14, null);
            }
            d5();
        }
    }
}
