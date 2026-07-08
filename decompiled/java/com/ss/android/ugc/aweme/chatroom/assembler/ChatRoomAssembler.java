package com.ss.android.ugc.aweme.chatroom.assembler;

import X.AbstractViewOnClickListenerC1231770i9v;
import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C11NJ;
import X.C1239300iM4;
import X.C1311205Be;
import X.C1311505Bh;
import X.C1362805Va;
import X.C1383370m6R;
import X.C13LE;
import X.C1598406Nq;
import X.C1618506Vj;
import X.C1659906ej;
import X.C1661206ew;
import X.C1661306ex;
import X.C1661906f3;
import X.C1701940uOG;
import X.C1704806ly;
import X.C1749280vcc;
import X.C2097608Jq;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import X.C899360ZPy;
import X.C903930Zd9;
import X.C907170ZiN;
import X.C909290Zln;
import X.EnumC1660606eq;
import X.InterfaceC1666106fj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import X.InterfaceC905060Zey;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS101S0400000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomAssembler {
    public static final C1661906f3 LJIILIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILJJIL;
    public final Fragment LIZ;
    public final SessionInfo LIZIZ;
    public final EnterChatParams LIZJ;
    public final boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 124));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS546S0100000_2(this, 123));
    public final C11NJ LJI = new C11NJ();
    public final C01GW LJII = C452501pT.LIZIZ(new AwS546S0100000_2(this, 125));
    public final LifecycleEventObserver LJIIIIZZ;
    public IMGroupChatApi LJIIIZ;
    public volatile C1598406Nq LJIIJ;
    public volatile C903930Zd9 LJIIJJI;
    public volatile Set LJIIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.06f3] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomAssembler.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJIILJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ChatRoomAssembler.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0), new C2217381BqS(ChatRoomAssembler.class, "featureProviders", "getFeatureProviders()Ljava/util/Set;", 0)};
        LJIILIIL = new Object() { // from class: X.06f3
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, X.0vcc, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, android.view.View] */
    public final void LIZ() {
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this, 122);
        if (this.LIZIZ.isGroupChat()) {
            IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
            C1618506Vj.LIZ.getClass();
            C1618506Vj.LIZLLL(iMGroupChatApiLIZ, "enter_group_chat");
            if (iMGroupChatApiLIZ == null) {
                IIMChatPerfLogger.LIZ.getClass();
                IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
                if (iIMChatPerfLoggerLIZ != null) {
                    iIMChatPerfLoggerLIZ.LIZ();
                }
                View view = this.LIZ.getView();
                if (view != null) {
                    C259800zU c259800zU = new C259800zU();
                    C259800zU c259800zU2 = new C259800zU();
                    ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.i54);
                    if (viewGroup != 0) {
                        ?? c1749280vcc = new C1749280vcc(view.getContext(), null, 6);
                        c1749280vcc.LJ();
                        c259800zU.element = c1749280vcc;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        viewGroup.addView((View) c1749280vcc, layoutParams);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.dpq);
                    if (viewGroup2 != 0) {
                        int dimensionPixelSize = 0;
                        ?? Td = C786410Ut5.Td(C786410Ut5.ne(viewGroup2.getContext()), R.layout.cqa, viewGroup2, false);
                        c259800zU2.element = Td;
                        TuxIconView tuxIconView = (TuxIconView) Td.findViewById(R.id.p20);
                        if (tuxIconView != null) {
                            tuxIconView.setIconRes(C899360ZPy.LIZIZ);
                            tuxIconView.setContentDescription(C1383370m6R.LJIIJ(R.string.e8n));
                            C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.06f0
                                {
                                    super(300L);
                                }

                                @Override // X.AbstractViewOnClickListenerC1231770i9v
                                public final void LIZ(View view2) {
                                    if (view2 != null) {
                                        IMFoundationBridgeApi.LIZ.getClass();
                                        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
                                        if (iMFoundationBridgeApiLIZ != null) {
                                            iMFoundationBridgeApiLIZ.LIZJ(this.LLILZ.LIZ);
                                        }
                                    }
                                }
                            }, tuxIconView);
                        }
                        Context context = C1383370m6R.LIZ;
                        try {
                            dimensionPixelSize = C2213981Bky.LIZIZ.getApplicationContext().getResources().getDimensionPixelSize(R.dimen.yv);
                        } catch (Resources.NotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        viewGroup2.addView((View) Td, new FrameLayout.LayoutParams(-2, dimensionPixelSize));
                    }
                    C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
                    LifecycleOwner lifecycleOwner = this.LIZ;
                    AwS101S0400000_2 awS101S0400000_2 = new AwS101S0400000_2(this, c259800zU, c259800zU2, awS546S0100000_2, 5);
                    AwS546S0100000_2 awS546S0100000_22 = new AwS546S0100000_2(this, 127);
                    c1618506Vj.getClass();
                    C1311205Be c1311205Be = C1311205Be.LIZ;
                    if (lifecycleOwner == null) {
                        lifecycleOwner = ProcessLifecycleOwner.Companion.get();
                    }
                    C1311505Bh c1311505Bh = new C1311505Bh("com.ss.android.ugc.aweme.IMGroupChatDelegate", awS101S0400000_2, null);
                    c1311205Be.getClass();
                    C1311205Be.LIZJ(lifecycleOwner, c1311505Bh, awS546S0100000_22);
                    return;
                }
                return;
            }
        }
        awS546S0100000_2.invoke();
    }

    public final void LIZJ(Function1<? super Assembler, Unit> function1) {
        if (!C1704806ly.LIZ()) {
            C723850SaN.LIZ(this.LIZ, false, null, new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 81), 3);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C1362805Va(this, function1, null), 3);
        }
    }

    public final void LJI(Assembler assembler) {
        C909290Zln c909290Zln;
        Fragment fragment = this.LIZ;
        SessionInfo sessionInfo = this.LIZIZ;
        if ((sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null) {
            assembler.DQ2(fragment, new AwS581S0100000_2(c909290Zln, 85));
        }
    }

    public static boolean LJ(ChatFeatureListConf chatFeatureListConf, EnumC1660606eq enumC1660606eq) {
        boolean z;
        if (chatFeatureListConf != null && !chatFeatureListConf.componentEnable(enumC1660606eq.getStrRep())) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final void LIZLLL(Assembler assembler, ChatFeatureListConf chatFeatureListConf) {
        EnumC1660606eq enumC1660606eq;
        C1661206ew c1661206ew = new C1661206ew();
        for (Map.Entry entry : ((LinkedHashMap) new C1659906ej(chatFeatureListConf).LIZ).entrySet()) {
            Object key = entry.getKey();
            c1661206ew.LIZ.put((EnumC1660606eq) key, Boolean.valueOf(((Boolean) entry.getValue()).booleanValue()));
        }
        for (Map.Entry entry2 : C2097608Jq.LJ().entrySet()) {
            Object key2 = entry2.getKey();
            Boolean boolValueOf = Boolean.valueOf(((Boolean) entry2.getValue()).booleanValue());
            Map<EnumC1660606eq, Boolean> map = c1661206ew.LIZ;
            EnumC1660606eq.Companion.getClass();
            EnumC1660606eq[] enumC1660606eqArrValues = EnumC1660606eq.values();
            int length = enumC1660606eqArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC1660606eq = enumC1660606eqArrValues[i];
                    if (!Intrinsics.LJFF(key2, enumC1660606eq.getStrRep())) {
                        i++;
                    }
                } else {
                    enumC1660606eq = EnumC1660606eq.NONE;
                    break;
                }
            }
            map.put(enumC1660606eq, boolValueOf);
        }
        assembler.DQ2(this.LIZ, new AwS581S0100000_2(new C1661306ex(C2097608Jq.LJIIZILJ(c1661206ew.LIZ)), 84));
    }

    public final void LJFF(Assembler assembler, EnumC1660606eq enumC1660606eq) {
        InterfaceC1666106fj interfaceC1666106fj = (InterfaceC1666106fj) ((Map) this.LJII.getValue()).get(enumC1660606eq);
        if (interfaceC1666106fj == null) {
            return;
        }
        interfaceC1666106fj.LIZ(this.LIZ, assembler);
    }

    public final void LIZIZ(Fragment fragment, boolean z, Function1<? super Assembler, Unit> function1) {
        if (!z) {
            C723850SaN.LIZ(fragment, false, null, new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 79), 3);
            return;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LIZIZ.getConversationId());
        if (c0y8tLIZ != null && c0y8tLIZ.isTemp()) {
            this.LJI.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LJ.getValue()).LIZ(this.LIZIZ.getConversationId()).LJJJLZIJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS368S0200000_2(fragment, (Fragment) function1, (Function1<? super Assembler, Unit>) 14)));
            return;
        }
        C723850SaN.LIZ(fragment, false, null, new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 80), 3);
    }

    public ChatRoomAssembler(Fragment fragment, SessionInfo sessionInfo, EnterChatParams enterChatParams, boolean z) {
        this.LIZ = fragment;
        this.LIZIZ = sessionInfo;
        this.LIZJ = enterChatParams;
        this.LIZLLL = z;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ChatRoomAssembler chatRoomAssembler = this.LL;
                    chatRoomAssembler.LIZ.getLifecycle().removeObserver(chatRoomAssembler.LJIIIIZZ);
                    chatRoomAssembler.LJI.LJ();
                }
            }
        };
        this.LJIIIIZZ = lifecycleEventObserver;
        fragment.getLifecycle().addObserver(lifecycleEventObserver);
    }
}
