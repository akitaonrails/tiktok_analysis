package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C1323820kYO;
import X.C1389910mGz;
import X.C13LE;
import X.C14KQ;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C397901gf;
import X.C457640Hx4;
import X.C457780HxI;
import X.C624430OeP;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarViewInfoAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatRoomOpenAbilityAssem extends AbstractC738140SxQ implements ChatRoomToastAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomOpenAbilityAssem.class, "inputSizeVM", "getInputSizeVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChatRoomOpenAbilityAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 709), AFwS248S0000000_14.get$arr$(174), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        bo(1);
        C1558520qew.LJI(this, ChatRoomScope.class, this, ChatRoomToastAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.ChatRoomToastAbility
    public final C1389910mGz XP1() {
        C19EG c19egLIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return null;
        }
        C1389910mGz c1389910mGz = new C1389910mGz(fragmentLJI);
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        int i = ((C457640Hx4) assemVMLazy.getValue().getState()).LLILLJJLI;
        ActionBarViewInfoAbility actionBarViewInfoAbility = (ActionBarViewInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ActionBarViewInfoAbility.class, null);
        c1389910mGz.LIZIZ(C14KQ.LIZLLL(c19egLIZ) + i + (actionBarViewInfoAbility != null ? actionBarViewInfoAbility.vR0() : 0));
        return c1389910mGz;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException, IllegalAccessException {
        super.onDestroy();
        bo(2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traffic_type", ((C457780HxI) this.LL.getValue()).LL.getTrafficType());
        jSONObject.put("entrance_type", ((C457780HxI) this.LL.getValue()).LL.getEntranceType());
        jSONObject.put("extra_info", ((C457780HxI) this.LL.getValue()).LL.getExtrasInfoMobParams());
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "im_chat_room_close"));
        C1558520qew.LJIIJ(this, ChatRoomScope.class, ChatRoomToastAbility.class, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        bo(4);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        bo(3);
    }

    public final void bo(int i) {
        SessionInfo sessionInfo = ((C457780HxI) this.LL.getValue()).LL;
        IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
        if (iIMChatRoomOpenService != null) {
            sessionInfo.getConversationId();
            sessionInfo.getUuid();
            iIMChatRoomOpenService.LIZIZ(new C624430OeP(i));
        }
    }
}
