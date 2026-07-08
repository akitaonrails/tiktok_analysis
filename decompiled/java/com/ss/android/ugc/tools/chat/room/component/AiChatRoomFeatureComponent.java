package com.ss.android.ugc.tools.chat.room.component;

import X.AbstractC2255721DQs;
import X.C05YF;
import X.C0WZX;
import X.C1153740g84;
import X.C13LE;
import X.C1664770tQJ;
import X.C18U5;
import X.C18UJ;
import X.C18WV;
import X.C19EG;
import X.C1DRG;
import X.C21297518Wf;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C443120HZe;
import X.C560530Lyd;
import X.InterfaceC1731706qJ;
import X.InterfaceC1737690vJv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC484050IyZ;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi;
import com.ss.android.ugc.tools.data.AIChatCallbacks;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.CallbackAction;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatRoomFeatureComponent extends AbstractC2255721DQs<AiChatRoomFeatureApi> implements AiChatRoomFeatureApi, InterfaceC484050IyZ, InterfaceC379610EuV, InterfaceC1737690vJv {
    public static final C21297518Wf LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final AiChatRoomFeatureApi LLILLJJLI = this;
    public final C560530Lyd<C443120HZe<Integer, Integer, Intent>> LLILLL = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C18WV.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C18U5.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);

    /* JADX WARN: Type inference failed for: r0v7, types: [X.18Wf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AiChatRoomFeatureComponent.class, "navigationApi", "getNavigationApi()Lcom/ss/android/ugc/tools/chat/room/api/AiChatRoomNavigationApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AiChatRoomFeatureComponent.class, "chatRoomMobApi", "getChatRoomMobApi()Lcom/ss/android/ugc/tools/chat/room/api/AiChatRoomMobApi;", 0), new C2217381BqS(AiChatRoomFeatureComponent.class, "chatSession", "getChatSession()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0)};
        LLIZ = new Object() { // from class: X.18Wf
        };
        LLJ = 8;
    }

    private final C18U5 X1() {
        return (C18U5) this.LLILZIL.getValue(this, LLIZLLLIL[1]);
    }

    private final C18UJ Z1() {
        return (C18UJ) this.LLILZLL.getValue(this, LLIZLLLIL[2]);
    }

    private final C18WV o2() {
        return (C18WV) this.LLILZ.getValue(this, LLIZLLLIL[0]);
    }

    @Override // com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi, X.InterfaceC21297418We
    public boolean J7() throws Throwable {
        AIChatCallbacks aIChatCallbacks;
        CallbackAction callbackAction;
        AIChatPageConfig aIChatPageConfig = Z1().LJI;
        if (aIChatPageConfig != null && (aIChatCallbacks = aIChatPageConfig.callbacks) != null && (callbackAction = aIChatCallbacks.onPostAction) != null) {
            C2204961BRm.LLJJIJIL(callbackAction.callbackID, new Intent(), (C19EG) getDiContainer().LJII(C19EG.class, null), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOmgYouAzj1yMvyIgA/0FNxb0l03LrrrJAoEZXwa6lpVXTKtHCDvOoO/ClBhdI4=", null));
        }
        o2().eV(false);
        return true;
    }

    @Override // X.InterfaceC1737690vJv
    public boolean onBackPressed() {
        return J7();
    }

    @Override // com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi
    public /* bridge */ /* synthetic */ LiveEvent LLZIL() {
        return this.LLILLL;
    }

    public AiChatRoomFeatureApi W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C560530Lyd<C443120HZe<Integer, Integer, Intent>> w2() {
        return this.LLILLL;
    }

    public AiChatRoomFeatureComponent(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C18U5
    public void eT1(String str) {
        X1().eT1(str);
    }

    @Override // X.C18WV
    public void eV(boolean z) {
        o2().eV(false);
    }

    @Override // X.C18U5
    public C1153740g84 kT(String str) {
        return X1().kT(str);
    }

    @Override // X.C18U5
    public void lK2(String str) {
        X1().lK2(str);
    }

    @Override // X.C18WV
    public void rE0(AIChatGenNode aIChatGenNode) {
        o2().rE0(aIChatGenNode);
    }

    @Override // X.C18WV
    public void zw2(AIChatGenNode aIChatGenNode) {
        o2().zw2(aIChatGenNode);
    }

    @Override // com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi, X.InterfaceC21297418We
    public boolean M7(int i, Parcelable parcelable, boolean z) throws Throwable {
        C19EG c19eg = (C19EG) getDiContainer().LJII(C19EG.class, null);
        Intent intent = new Intent();
        intent.putExtra("key_ai_chat_callback_data", parcelable);
        C2204961BRm.LLJJIJIL(i, intent, c19eg, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOmgYouAzj1yMvyIgA/0FNxb0l03LrrrJAoEZXwa6lpVXTKtHCDvOoO/ClBhdI4=", null));
        o2().eV(z);
        return true;
    }

    @Override // X.InterfaceC484050IyZ
    public boolean onActivityResult(int i, int i2, Intent intent) {
        this.LLILLL.LJIIJ(new C443120HZe<>(Integer.valueOf(i), Integer.valueOf(i2), intent));
        return false;
    }
}
