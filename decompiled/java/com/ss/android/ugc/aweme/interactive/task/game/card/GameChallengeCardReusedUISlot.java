package com.ss.android.ugc.aweme.interactive.task.game.card;

import X.AbstractC738140SxQ;
import X.AbstractC900170ZTb;
import X.C01GW;
import X.C0I0B;
import X.C0ICA;
import X.C0ICC;
import X.C0ZTQ;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1400340mXo;
import X.C2095008Iq;
import X.C21368018jm;
import X.C21652419oY;
import X.C448440HiE;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736950SvV;
import X.C898860ZOa;
import X.C912070ZqH;
import X.EnumC1729006ps;
import X.EnumC1729106pt;
import X.EnumC2241721Coc;
import X.EnumC900290ZTn;
import X.InterfaceC900180ZTc;
import Y.AObjectS59S0000000_6;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import com.ss.android.ugc.aweme.interactive.task.base.card.BaseInteractiveTaskCardAssem;
import com.ss.android.ugc.aweme.interactive.task.game.GameChallengeChatroomVM;
import java.util.Collections;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GameChallengeCardReusedUISlot extends BaseInteractiveTaskCardAssem<GameChallengeCardReusedUISlot, GameChallengeCardTemplate, C0ICC> {
    public static final /* synthetic */ int LLLFF = 0;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1067));
    public final C736950SvV LLJLLL = new C736950SvV(C13LE.LIZ(GameChallengeChatroomVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS248S0000000_14.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), new AwS558S0100000_14((AbstractC738140SxQ) this, 1070), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1066));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1068));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(280));
    public C127G LLLF;

    @Override // com.ss.android.ugc.aweme.interactive.task.base.card.BaseInteractiveTaskCardAssem
    public final InterfaceC900180ZTc<GameChallengeCardTemplate> sp() {
        return (InterfaceC900180ZTc) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.interactive.task.base.card.BaseInteractiveTaskCardAssem
    public final C0ZTQ up() {
        return (C0ZTQ) this.LLL.getValue();
    }

    public final C21368018jm zp() {
        return (C21368018jm) this.LLJZ.getValue();
    }

    public final GameMainFlowEventParameters Ap() {
        String conversationId = tp().getConversationId();
        String value = EnumC1729106pt.CHAT_GAME_BANNER.getValue();
        String value2 = EnumC1729006ps.CHAT_GAME_BANNER.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0ICA.LIZ(conversationId, value, value2, ((C0ICC) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILZ);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{GameChallengeChatroomVM.class, new AObjectS59S0000000_6(this, 13)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.interactive.task.base.card.BaseInteractiveTaskCardAssem
    public final C21368018jm op() {
        return zp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C21652419oY c21652419oY = (C21652419oY) this.LLJLIL.getValue();
        c21652419oY.getClass();
        c21652419oY.LL = EnumC900290ZTn.REFACTOR;
        c21652419oY.setGestureConfig(C898860ZOa.LIZ(c21652419oY.getGestureConfig(), false, false, 7));
        c21652419oY.setDefaultOnLongPressAction(new AwS415S0200000_14(this, c21652419oY, 49));
        c21652419oY.setSingleClickInterceptor(new AwS558S0100000_14(this, 1069));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.interactive.task.base.card.BaseInteractiveTaskCardAssem
    public final void yp(AbstractC900170ZTb abstractC900170ZTb) {
        long jLongValue;
        Long lLJIILIIL;
        C0ICC c0icc = (C0ICC) abstractC900170ZTb;
        if (c0icc.LLILZIL != null) {
            C21368018jm c21368018jmZp = zp();
            C0I0B c0i0b = C0I0B.LJFF;
            String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            GameInfoComponent gameInfoComponent = new GameInfoComponent("", null, c0icc.LLILZIL.LLILLJJLI, new ImageComponent(Collections.singletonList(c0icc.LLILZIL.LL), (String) null, (ResolutionComponent) null, (String) null, (IconTypeComponent) null, 62), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2);
            String curUserId2 = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
            if (curUserId2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            c21368018jmZp.LIZ(new GameChallengeCardTemplate("fake-id", curUserId, false, 0, gameInfoComponent, Collections.singletonList(new GameParticipantScoreComponent(jLongValue, c0icc.LLILZIL.LLILLL, 4)), false, null, EnumC2241721Coc.TASK_STATUS_IN_PROGRESS, null, null, null, null, null, null, 130321), tp(), true);
            return;
        }
        zp().LIZ(c0icc.LLILZ, tp(), false);
        if (((C448440HiE) ((AssemViewModel) this.LLJLLL.getValue()).getState()).LLILLJJLI.contains(Long.valueOf(c0icc.LLIZ.LIZ.LIZ.getMsgId()))) {
            return;
        }
        C912070ZqH.LIZIZ.LJIIIIZZ().LIZLLL().LJII(Ap());
        ((GameChallengeChatroomVM) this.LLJLLL.getValue()).wQ2(c0icc.LLIZ.LIZ.LIZ.getMsgId());
    }
}
