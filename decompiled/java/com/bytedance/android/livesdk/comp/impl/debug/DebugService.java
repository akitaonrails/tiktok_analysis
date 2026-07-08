package com.bytedance.android.livesdk.comp.impl.debug;

import X.C0WZX;
import X.C1090190eTZ;
import X.C1090210eTb;
import X.C1090220eTc;
import X.C1090230eTd;
import X.C1090240eTe;
import X.C1090250eTf;
import X.C1100830ekj;
import X.C1161920gLG;
import X.C1954807lC;
import X.C1969107nV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C498970JhX;
import X.EnumC1100810ekh;
import X.EnumC498960JhW;
import X.InterfaceC1095340ebs;
import X.InterfaceC1100800ekg;
import X.InterfaceC1100840ekk;
import X.InterfaceC1100860ekm;
import X.InterfaceC1100870ekn;
import X.InterfaceC1125460fOS;
import X.InterfaceC499240Jhy;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDebugToolsSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pitaya.api.IPitayaCore;
import debugtool.DebugToolsHelper;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class DebugService implements IDebugService {
    public DebugToolsHelper LL;
    public final C1969107nV LLILLJJLI = new C1969107nV();

    public static boolean LIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        String channel = iHostAppContext.getChannel();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isTestChannel(). hostChannel=");
        sbLIZ.append(channel);
        sbLIZ.append(", buildConfigDebug=");
        sbLIZ.append(false);
        C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ));
        return Intrinsics.LJFF(channel, "local_test") || iHostAppContext.isRegressionTest() || iHostAppContext.isLiveInhouse();
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final InterfaceC1095340ebs Az1() {
        InterfaceC1125460fOS interfaceC1125460fOS;
        DebugToolsHelper debugToolsHelper = this.LL;
        if (debugToolsHelper == null || (interfaceC1125460fOS = debugToolsHelper.LLILLL) == null) {
            return null;
        }
        return interfaceC1125460fOS.LJII();
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final InterfaceC499240Jhy Hi() {
        InterfaceC1125460fOS interfaceC1125460fOS;
        DebugToolsHelper debugToolsHelper = this.LL;
        if (debugToolsHelper == null || (interfaceC1125460fOS = debugToolsHelper.LLILLL) == null) {
            return null;
        }
        return interfaceC1125460fOS.Hi();
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final InterfaceC1100860ekm Sg() {
        InterfaceC1125460fOS interfaceC1125460fOS;
        DebugToolsHelper debugToolsHelper = this.LL;
        if (debugToolsHelper == null || (interfaceC1125460fOS = debugToolsHelper.LLILLL) == null) {
            return null;
        }
        return interfaceC1125460fOS.Sg();
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void aq() {
        InterfaceC1100840ekk interfaceC1100840ekk = this.LLILLJJLI.LIZ;
        if (interfaceC1100840ekk != null) {
            interfaceC1100840ekk.aq();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final Function0<Unit> ho() {
        InterfaceC1125460fOS interfaceC1125460fOS;
        DebugToolsHelper debugToolsHelper = this.LL;
        if (debugToolsHelper == null || (interfaceC1125460fOS = debugToolsHelper.LLILLL) == null) {
            return null;
        }
        return interfaceC1125460fOS.ho();
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void onDestroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        DebugToolsHelper debugToolsHelper = this.LL;
        if (debugToolsHelper == null) {
            return;
        }
        DataChannel dataChannel = debugToolsHelper.LL;
        if (dataChannel == null || (lifecycleOwner = dataChannel.LLILZ) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || currentState == Lifecycle.State.DESTROYED) {
            C20441214yg.LJIIIZ("DebugService", "Destroy debugToolsHelper");
            debugToolsHelper.LIZIZ();
            this.LL = null;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void Bj2(DataChannel dataChannel) {
        InterfaceC1100800ekg interfaceC1100800ekgMc1;
        if (!LIZ() || (interfaceC1100800ekgMc1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).mc1(dataChannel)) == null) {
            return;
        }
        interfaceC1100800ekgMc1.LIZIZ().LIZIZ(new C1090250eTf());
        interfaceC1100800ekgMc1.LJIIJ().LIZLLL(new C1090190eTZ(interfaceC1100800ekgMc1));
        interfaceC1100800ekgMc1.message().LIZLLL(new C1090230eTd());
        interfaceC1100800ekgMc1.message().LIZJ(MemberMessage.class, new C1090210eTb());
        interfaceC1100800ekgMc1.LIZJ().LIZ(new C1090240eTe());
        interfaceC1100800ekgMc1.LJI().LIZ(new C1090220eTc());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getByteBenchScore: ");
        sbLIZ.append(interfaceC1100800ekgMc1.LJFF());
        C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void yX1(InterfaceC1100870ekn interfaceC1100870ekn) {
        InterfaceC1125460fOS interfaceC1125460fOS;
        DebugToolsHelper debugToolsHelper = this.LL;
        if (debugToolsHelper != null && (interfaceC1125460fOS = debugToolsHelper.LLILLL) != null) {
            interfaceC1125460fOS.LJIIZILJ();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final void PP2(InterfaceC1125460fOS interfaceC1125460fOS, Context context, DataChannel dataChannel) {
        DebugToolsHelper.LIZ(interfaceC1125460fOS, context, dataChannel);
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final DebugToolsHelper fW1(Context context, DataChannel dataChannel, EnumC498960JhW enumC498960JhW) {
        EnumC1100810ekh enumC1100810ekh;
        boolean z = true;
        if (LIZ() && LiveGiftDebugToolsSetting.INSTANCE.getValue() && context != null) {
            int i = C498970JhX.LIZ[enumC498960JhW.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC1100810ekh = EnumC1100810ekh.AUDIENCE;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC1100810ekh = EnumC1100810ekh.PREVIEW;
                }
            } else {
                enumC1100810ekh = EnumC1100810ekh.BROADCAST;
            }
            DebugToolsHelper debugToolsHelper = this.LL;
            if (debugToolsHelper != null) {
                C20441214yg.LJIIIZ("DebugService", "newFloatDebugTools: releasing previous DebugToolsHelper before attaching new room");
                debugToolsHelper.LIZIZ();
            }
            this.LL = new DebugToolsHelper(context, dataChannel, enumC1100810ekh);
            ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).cQ0();
            ((ILiveTriggerService) C1161920gLG.LIZJ(ILiveTriggerService.class)).Xn0(new C1100830ekj(this));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("newFloatDebugTools(). debugToolsHelper = ");
            sbLIZ.append(this.LL);
            C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ));
            return this.LL;
        }
        boolean zLIZ = LIZ();
        boolean value = LiveGiftDebugToolsSetting.INSTANCE.getValue();
        if (context != null) {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("newFloatDebugTools(). return null. isTestChannel=");
        sbLIZ2.append(zLIZ);
        sbLIZ2.append(", settingValue=");
        sbLIZ2.append(value);
        sbLIZ2.append(", contextIsNull=");
        sbLIZ2.append(z);
        C20441214yg.LJIIIZ("DebugService", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.debug.IDebugService
    public final Object hJ0(IPitayaCore iPitayaCore, Method method, Object[] objArr) {
        InterfaceC1125460fOS interfaceC1125460fOS;
        if (method == null) {
            return null;
        }
        C20441214yg.LIZIZ("DebugService", "runPitayaCoreProxyInvoke: ");
        DebugToolsHelper debugToolsHelper = this.LL;
        if (debugToolsHelper != null) {
            interfaceC1125460fOS = debugToolsHelper.LLILLL;
        } else {
            interfaceC1125460fOS = null;
        }
        C20441214yg.LIZIZ("DebugService", "runPitayaCoreProxyInvoke:, debugToolsHelper=" + this.LL + ", debugToolInitService=" + interfaceC1125460fOS);
        if (interfaceC1125460fOS != null) {
            return interfaceC1125460fOS.LJ();
        }
        if (objArr != null) {
            return C2204961BRm.a0(method, iPitayaCore, Arrays.copyOf(objArr, objArr.length), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VH92vWjlTYRT789iimBbBDWxxg==", null));
        }
        return C2204961BRm.a0(method, iPitayaCore, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VH92vWjlTYRT789iimBbBDWxxg==", null));
    }
}
