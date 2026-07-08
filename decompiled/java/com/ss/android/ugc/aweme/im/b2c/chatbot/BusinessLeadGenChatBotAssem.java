package com.ss.android.ugc.aweme.im.b2c.chatbot;

import X.AbstractC1643906c9;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06LD;
import X.C06LG;
import X.C06NH;
import X.C06OO;
import X.C09R3;
import X.C0QSJ;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YAE;
import X.C0YSQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1636306av;
import X.C1637506b7;
import X.C1655206dy;
import X.C1711306n1;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C461720I8s;
import X.C687700QyG;
import X.C723590SZx;
import X.C882340YjQ;
import X.C882400YjW;
import X.C883250Ykt;
import X.EnumC1596306Mv;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC866830XzV;
import X.InterfaceC876950Yaj;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessLeadGenChatBotAssem extends AbstractC738140SxQ implements InterfaceC866830XzV, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 309));
    public final AssemVMLazy LLILLL = C06LD.LIZ(this);
    public final AssemVMLazy LLILZ = C06LG.LIZ(this);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 308));
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public volatile IInputFieldAbility LLJ;
    public InterfaceC665370Q7z LLJI;
    public C0QSJ LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessLeadGenChatBotAssem.class, "inputFieldAbility", "getInputFieldAbility()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/IInputFieldAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BusinessLeadGenChatBotAssem.class, "singleChatNoticeViewModel", "getSingleChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/chatnoticenew/viewmodel/SingleChatNoticeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BusinessLeadGenChatBotAssem.class, "commonChatNoticeViewModel", "getCommonChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/chatnoticenew/viewmodel/CommonChatNoticeViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLIIIJ(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLJLI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLL(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJZZI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLI(String str, List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLILLLLZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIIII(int i, String str) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIILZL(int i, String str, List list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final int LLLIIII() {
        return 0;
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
    public final void LLLIZZ(Map<String, C0Y8T> map) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    public final IInputFieldAbility bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJIJIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJI;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJI = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJIJIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) c0qsjLIZLLL.getAbility(IInputFieldAbility.class);
        C687700QyG.LJ(iInputFieldAbility, IInputFieldAbility.class);
        return iInputFieldAbility;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final SessionInfo m229do() {
        return (SessionInfo) this.LLILLJJLI.getValue();
    }

    public final void fo() {
        String str;
        ChatNoticeAbility chatNoticeAbility;
        final ViewGroup viewGroupE50;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        if (!this.LLIZ) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(m229do().getConversationId());
            if (c0y8tLIZ == null || (coreInfo = c0y8tLIZ.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:conv_routing")) == null) {
                str = "";
            }
            if (str.length() != 0) {
                try {
                    String strOptString = new JSONObject(str).optString("biz_uid");
                    if (strOptString != null && strOptString.length() != 0) {
                        C882400YjW.LIZ.getClass();
                        C882400YjW.LIZ();
                        C883250Ykt c883250Ykt = C883250Ykt.LL;
                        if (Intrinsics.LJFF(strOptString, C461720I8s.LIZIZ())) {
                            if (!C1636306av.LIZ() && (chatNoticeAbility = (ChatNoticeAbility) this.LLILZIL.getValue()) != null && (viewGroupE50 = chatNoticeAbility.e50(C06NH.BOTTOM)) != null) {
                                AssemVMLazy assemVMLazy = this.LLILLL;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
                                BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel = (BaseSingleChatNoticeViewModel) assemVMLazy.getValue();
                                final String conversationId = m229do().getConversationId();
                                baseSingleChatNoticeViewModel.CQ2(new AbstractC1643906c9<C06OO, C1637506b7>(conversationId, viewGroupE50) { // from class: X.06c6
                                    public final String LLILZLL;

                                    @Override // X.C06OD
                                    public final void LIZLLL() {
                                        C1637506b7 c1637506b7 = (C1637506b7) this.LLILZIL;
                                        if (c1637506b7 != null) {
                                            int visibility = c1637506b7.getVisibility();
                                            c1637506b7.setVisibility(8);
                                            C1602160rnK.LIZIZ(visibility, 8, c1637506b7);
                                            c1637506b7.LLZLI();
                                        }
                                    }

                                    @Override // X.C06OD
                                    public final Object LJI(C06OO c06oo) {
                                        V v = this.LLILZIL;
                                        if (v != 0) {
                                            int visibility = v.getVisibility();
                                            v.setVisibility(0);
                                            C1602160rnK.LIZIZ(visibility, 0, v);
                                            return v;
                                        }
                                        return null;
                                    }

                                    {
                                        super(EnumC1596306Mv.CHAT_BOT_TYPING_NOTICE, viewGroupE50, R.layout.cf3);
                                        this.LLILZLL = conversationId;
                                    }

                                    @Override // X.C06OD
                                    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                                        return Boolean.valueOf(Intrinsics.LJFF(C882340YjQ.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZLL)), "active"));
                                    }
                                });
                            }
                            this.LLIZLLLIL = Intrinsics.LJFF(C882340YjQ.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(m229do().getConversationId())), "active");
                            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1655206dy(this, null), 3);
                            this.LLIZ = true;
                            return;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (!this.LLIZ) {
            this.LLIZLLLIL = Intrinsics.LJFF(C882340YjQ.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(m229do().getConversationId())), "active");
            return;
        }
        if (Intrinsics.LJFF(C882340YjQ.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(m229do().getConversationId())), "pause")) {
            AssemVMLazy assemVMLazy2 = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJILJIL;
            ((ICommonChatNoticeViewModel) assemVMLazy2.getValue()).BQ2(EnumC1596306Mv.CHAT_BOT_TYPING_NOTICE);
            this.LLILZLL = false;
            this.LLIZLLLIL = false;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI(this);
        fo();
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
        String conversationId;
        if (i == 10) {
            return;
        }
        if (c0y8t != null) {
            conversationId = c0y8t.getConversationId();
        } else {
            conversationId = null;
        }
        if (Intrinsics.LJFF(conversationId, m229do().getConversationId())) {
            fo();
        }
    }
}
