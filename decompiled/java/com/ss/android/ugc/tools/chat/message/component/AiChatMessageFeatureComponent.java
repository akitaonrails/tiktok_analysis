package com.ss.android.ugc.tools.chat.message.component;

import X.AbstractC2255721DQs;
import X.C01GW;
import X.C05YF;
import X.C06R4;
import X.C09IC;
import X.C0LAB;
import X.C1153300g7M;
import X.C11NJ;
import X.C13LE;
import X.C1558650qf9;
import X.C1562980qm8;
import X.C1664770tQJ;
import X.C1701940uOG;
import X.C1856320yPG;
import X.C189200o6;
import X.C189Y;
import X.C18T5;
import X.C18T6;
import X.C18T7;
import X.C18UC;
import X.C18UJ;
import X.C18UK;
import X.C18UO;
import X.C18UP;
import X.C18UZ;
import X.C18VB;
import X.C18VC;
import X.C18VD;
import X.C18VE;
import X.C18VF;
import X.C18VG;
import X.C18VH;
import X.C18VI;
import X.C18VJ;
import X.C18VO;
import X.C18VQ;
import X.C18WK;
import X.C18YL;
import X.C1954807lC;
import X.C1DRG;
import X.C20684815ws;
import X.C21163117rp;
import X.C21290818Tq;
import X.C21300118Xf;
import X.C21524019Li;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C300220Bpk;
import X.C300320Bpu;
import X.C452501pT;
import X.C861640Xr8;
import X.C869590Y9l;
import X.C909930Zmp;
import X.C910260ZnM;
import X.C912900Zrc;
import X.EnumC212372189a;
import X.EnumC912790ZrR;
import X.InterfaceC1731706qJ;
import X.InterfaceC21300418Xi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import X.InterfaceC362610EJn;
import X.InterfaceC379610EuV;
import X.InterfaceC905050Zex;
import Y.AfS201S0100000_32;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.tools.chat.message.AiChatMessageInfraApi;
import com.ss.android.ugc.tools.chat.message.api.AiChatMessageFeatureApi;
import com.ss.android.ugc.tools.chat.message.common.AiChatMessageRefreshWorker;
import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.PostButtonAppearance;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS115S1200000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatMessageFeatureComponent extends AbstractC2255721DQs<AiChatMessageFeatureApi> implements AiChatMessageFeatureApi, InterfaceC905050Zex, InterfaceC362610EJn, InterfaceC379610EuV {
    public static final C18VJ LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public C21300118Xf LLILZIL;
    public final AiChatMessageFeatureApi LLILLJJLI = this;
    public final C18UJ LLILLL = (C18UJ) getDiContainer().LJII(C18UJ.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AiChatMessageInfraApi.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 425));
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C18UC.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C18VO.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), C18UK.class, null);
    public final C11NJ LLJI = new C11NJ();
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), C18VQ.class, null);

    /* JADX WARN: Type inference failed for: r0v11, types: [X.18VJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AiChatMessageFeatureComponent.class, "messageInfraComponentApi", "getMessageInfraComponentApi()Lcom/ss/android/ugc/tools/chat/message/AiChatMessageInfraApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AiChatMessageFeatureComponent.class, "messageActionApi", "getMessageActionApi()Lcom/ss/android/ugc/tools/chat/message/api/AiChatMessageActionApi;", 0), new C2217381BqS(AiChatMessageFeatureComponent.class, "chatInputFeatureApi", "getChatInputFeatureApi()Lcom/ss/android/ugc/tools/chat/input/api/AiChatInputFeatureApi;", 0), new C2217381BqS(AiChatMessageFeatureComponent.class, "onBoardingApi", "getOnBoardingApi()Lcom/ss/android/ugc/tools/chat/message/onboarding/api/AiChatOnboardingApi;", 0), new C2217381BqS(AiChatMessageFeatureComponent.class, "saveLocalComponentApi", "getSaveLocalComponentApi()Lcom/ss/android/ugc/tools/chat/common/api/AiChatCommonFeatureApi;", 0)};
        LLJILJIL = new Object() { // from class: X.18VJ
        };
        LLJILLL = 8;
    }

    private final C18UC G2() {
        return (C18UC) this.LLIZ.getValue(this, LLJILJILJ[1]);
    }

    private final C18UK T2() {
        return (C18UK) this.LLJ.getValue(this, LLJILJILJ[3]);
    }

    private final AiChatMessageRefreshWorker W1() {
        return (AiChatMessageRefreshWorker) this.LLILZLL.getValue();
    }

    private final C18VO Z1() {
        return (C18VO) this.LLIZLLLIL.getValue(this, LLJILJILJ[2]);
    }

    public final AiChatMessageInfraApi H2() {
        return (AiChatMessageInfraApi) this.LLILZ.getValue(this, LLJILJILJ[0]);
    }

    public final C18VQ W2() {
        return (C18VQ) this.LLJIJIL.getValue(this, LLJILJILJ[4]);
    }

    private final void c3() {
        IMessageEventProtocol iMessageEventProtocolLIZ;
        C21300118Xf c21300118Xf = (C21300118Xf) H2().Ue1(new AwS646S0100000_32(this, 18));
        this.LLILZIL = c21300118Xf;
        if (c21300118Xf == null || (iMessageEventProtocolLIZ = c21300118Xf.LIZ()) == null) {
            return;
        }
        H2().lb(iMessageEventProtocolLIZ);
    }

    @Override // X.C18UK
    public C869590Y9l PA2() {
        return T2().PA2();
    }

    public final void init() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("chat room is created: ");
        sbLIZ.append(this.LLILLL.LIZLLL);
        C21290818Tq.LIZ("AiChatMessageFeatureComponent", C2188811AlT.LIZIZ(sbLIZ));
        Z1().fn0(new C21524019Li(this, 3));
        C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18T7(null), C21163117rp.LIZIZ().LJI()));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C18T5(this, null), 3);
        if (((Boolean) C300320Bpu.LIZ.getValue()).booleanValue()) {
            C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18T6(this, null), C21163117rp.LIZIZ().LJ()));
        }
        if (C300220Bpk.LIZ()) {
            Z1().r21().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS201S0100000_32(this, 0));
        }
        H2().lb(W1());
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        init();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        H2().pj(W1());
        this.LLJI.dispose();
    }

    public AiChatMessageFeatureApi X1() {
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

    public AiChatMessageFeatureComponent(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final EnumC912790ZrR w2(C910260ZnM c910260ZnM) {
        int i = C18VG.LIZ[c910260ZnM.LJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC912790ZrR.MIDDLE;
                }
                throw new C1954807lC();
            }
            return EnumC912790ZrR.FROM_END;
        }
        return EnumC912790ZrR.FROM_START;
    }

    @Override // X.C18UC
    public void DI0(C189Y c189y) {
        G2().DI0(c189y);
    }

    @Override // X.C18UC
    public void du(C869590Y9l c869590Y9l) {
        G2().du(c869590Y9l);
    }

    @Override // X.C18UC
    public void oX(C189Y c189y) {
        G2().oX(c189y);
    }

    private final List<C1562980qm8<C18VB>> o2(C910260ZnM c910260ZnM, C21300118Xf c21300118Xf) {
        C1562980qm8 c1562980qm8LIZJ;
        int iIntValue;
        int iIntValue2;
        AIChatAppearance aIChatAppearance;
        PostButtonAppearance postButtonAppearance;
        Integer num;
        AIChatAppearance aIChatAppearance2;
        PostButtonAppearance postButtonAppearance2;
        Integer num2;
        List<C18VI> value = c910260ZnM.LIZIZ().LIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (C18VI c18vi : value) {
            if (c18vi instanceof C18VE) {
                C18VE c18ve = (C18VE) c18vi;
                c1562980qm8LIZJ = C1558650qf9.LIZJ("DELETE_MESSAGE", C18VB.DELETE_MESSAGE, R.raw.icon_trash_bin, 2131825556, new C18VF(c18ve.LIZ, this, c18ve.LIZIZ, c21300118Xf, new AwS433S0200000_32(this, c910260ZnM, 36)));
            } else if (c18vi instanceof C1153300g7M) {
                c1562980qm8LIZJ = C1558650qf9.LIZIZ("COPY_TEXT", C18VB.COPY_TEXT, Integer.valueOf(R.raw.icon_doc_on_doc), 2131825554, false, new AwS115S1200000_32(c21300118Xf, ((C1153300g7M) c18vi).LIZ, new AwS433S0200000_32(this, c910260ZnM, 37), 2), 48);
            } else if (c18vi instanceof C18VC) {
                AIChatPageConfig aIChatPageConfig = this.LLILLL.LJI;
                if (aIChatPageConfig != null && (aIChatAppearance2 = aIChatPageConfig.appearance) != null && (postButtonAppearance2 = aIChatAppearance2.postButton) != null && (num2 = postButtonAppearance2.text) != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 2131825514;
                }
                AIChatPageConfig aIChatPageConfig2 = this.LLILLL.LJI;
                if (aIChatPageConfig2 != null && (aIChatAppearance = aIChatPageConfig2.appearance) != null && (postButtonAppearance = aIChatAppearance.postButton) != null && (num = postButtonAppearance.icon) != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = R.raw.icon_post;
                }
                c1562980qm8LIZJ = C1558650qf9.LIZIZ("SAVE_IMAGE", C18VB.SAVE_IMAGE, Integer.valueOf(iIntValue2), iIntValue, false, new AwS398S0200000_32(c21300118Xf, new AwS398S0200000_32(c18vi, this, 41), 44), 48);
            } else if (c18vi instanceof C18VD) {
                c1562980qm8LIZJ = C1558650qf9.LIZIZ("SAVE_IMAGE", C18VB.SAVE_IMAGE, Integer.valueOf(R.raw.icon_arrow_down_to_line), 2131825512, false, new AwS398S0200000_32(c21300118Xf, new AwS398S0200000_32(c18vi, this, 42), 45), 48);
            }
            if (c1562980qm8LIZJ != null) {
                arrayList.add(c1562980qm8LIZJ);
            }
        }
        return arrayList;
    }

    @Override // X.C18UC
    public InterfaceC346201Wa<C189200o6<Unit>> ZE0(C06R4 c06r4, C869590Y9l c869590Y9l) {
        return G2().ZE0(c06r4, c869590Y9l);
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C21300118Xf c21300118Xf;
        if (i == 4 && (c21300118Xf = this.LLILZIL) != null && c21300118Xf.isShowing()) {
            c21300118Xf.LIZIZ(C18VB.DISMISS);
            return true;
        }
        return false;
    }

    @Override // X.C18UC
    public void zk2(C869590Y9l c869590Y9l, EnumC212372189a enumC212372189a) {
        G2().zk2(c869590Y9l, enumC212372189a);
    }

    @Override // X.C18UC
    public void PH0(C18UZ c18uz, C18UJ c18uj, boolean z) {
        G2().PH0(c18uz, c18uj, false);
    }

    @Override // com.ss.android.ugc.tools.chat.message.api.AiChatMessageFeatureApi
    public boolean oR1(View view, C910260ZnM c910260ZnM, C18WK c18wk) {
        AIChatGenNode aIChatGenNodeLIZLLL;
        String str;
        C869590Y9l c869590Y9l;
        boolean z = false;
        if (c910260ZnM.LIZIZ().LIZ.getValue().isEmpty() || view == null) {
            return false;
        }
        if (this.LLILZIL == null) {
            c3();
        }
        C21300118Xf c21300118Xf = this.LLILZIL;
        if (c21300118Xf != null) {
            ((InterfaceC21300418Xi) c21300118Xf.LJ.getValue()).LIZJ(new C18YL(view, w2(c910260ZnM), c18wk), new C912900Zrc(o2(c910260ZnM, c21300118Xf)), C1856320yPG.LIZ);
            C18UP c18up = C18UP.LIZ;
            C18UJ c18uj = this.LLILLL;
            if (c910260ZnM.LJ() == C18VH.END) {
                z = true;
            }
            C909930Zmp c909930ZmpLIZLLL = c910260ZnM.LIZLLL();
            if (c909930ZmpLIZLLL != null && (c869590Y9l = c909930ZmpLIZLLL.LIZ) != null) {
                aIChatGenNodeLIZLLL = C18UO.LIZLLL(c869590Y9l);
            } else {
                aIChatGenNodeLIZLLL = null;
            }
            c18up.getClass();
            C0LAB c0lab = new C0LAB();
            C18UP.LIZ(c0lab, c18uj);
            if (z) {
                str = "user";
            } else {
                str = "bot";
            }
            c0lab.LJ("message_type", str);
            if (aIChatGenNodeLIZLLL != null) {
                String contextPreloadImageSource = aIChatGenNodeLIZLLL.getContextPreloadImageSource();
                if (contextPreloadImageSource != null) {
                    c0lab.LJ("preload_image_status", contextPreloadImageSource);
                }
                Integer contextUserUploadImageCount = aIChatGenNodeLIZLLL.getContextUserUploadImageCount();
                if (contextUserUploadImageCount != null) {
                    c0lab.LJ("upload_image_status", String.valueOf(contextUserUploadImageCount.intValue()));
                }
            }
            C20684815ws.LJIILLIIL("vp_generate_long_press", c0lab.LIZ);
        }
        return true;
    }
}
