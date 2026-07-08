package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.preshown;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I9T;
import X.C0I9W;
import X.C0ZHB;
import X.C0ZTD;
import X.C13LE;
import X.C1559260qg8;
import X.C1636906b1;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C346270Dhp;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C898900ZOe;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSuggestedStickersAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.preshown.PreshownStickerBannerReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PreshownStickerBannerReusedUISlotAssem extends ReusedUISlotAssem<PreshownStickerBannerReusedUISlotAssem> implements InterfaceC712990Rxx<C0ZTD> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public PreshownStickerSceneConfig LLJLLL;
    public final C1559260qg8 LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PreshownStickerBannerReusedUISlotAssem.class, "messageListFooterViewModel", "getMessageListFooterViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/mesagelist/MessageListFooterViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(PreshownStickerBannerReusedUISlotAssem.class, "footerViewModel", "<v#0>", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217401BqU};
    }

    public PreshownStickerBannerReusedUISlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageListFooterViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 299), AFwS236S0000000_6.get$arr$(169), null, true);
        this.LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 296));
        this.LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 297));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 298));
        this.LLJZ = new C1559260qg8(new C723580SZw(this, C898900ZOe.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cs5;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SessionInfo op() {
        return (SessionInfo) this.LLJLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        ((RecyclerView) this.LLJLL.getValue()).setLayoutManager(new LinearLayoutManager(LJJIJL().getContext(), 0, false));
        ((RecyclerView) this.LLJLL.getValue()).addItemDecoration(new C346270Dhp(5));
        C786410Ut5.a9((TuxIconView) this.LLJLILLLLZIIL.getValue(), new View.OnClickListener() { // from class: X.06lw
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;

            static {
                C2217401BqU c2217401BqU = new C2217401BqU(PreshownStickerBannerReusedUISlotAssem.class, "footerViewModel", "<v#2>", 0);
                C09R3 c09r3 = C13LE.LIZ;
                c09r3.getClass();
                C2217401BqU c2217401BqU2 = new C2217401BqU(PreshownStickerBannerReusedUISlotAssem.class, "noticeVM", "<v#3>", 0);
                c09r3.getClass();
                LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2};
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AssemVMLazy assemVMLazy;
                EnumC1644606cG enumC1644606cG;
                String str;
                Set setLIZ;
                List<PreshownStickerItem> list;
                Fragment fragmentLIZIZ = C897460ZIq.LIZIZ(view2);
                if (fragmentLIZIZ == null) {
                    return;
                }
                InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageListFooterViewModel.class);
                AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 971);
                AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(597);
                int size = 0;
                if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(fragmentLIZIZ, true), new C338490DOt(fragmentLIZIZ, true), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragmentLIZIZ, 972), aFwS229S0000000_2, new C451460Hn6(fragmentLIZIZ, true), new C451620HnM(fragmentLIZIZ, true), new C987103tV(fragmentLIZIZ, true));
                } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                    assemVMLazy = C451650HnP.LIZ(fragmentLIZIZ, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), awS546S0100000_2, new AwS546S0100000_2(fragmentLIZIZ, 973), aFwS229S0000000_2, null, null, null);
                } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(fragmentLIZIZ), C724750Sbp.LJIIIZ(fragmentLIZIZ), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragmentLIZIZ, 974), aFwS229S0000000_2, new C451460Hn6(fragmentLIZIZ, false), new C451620HnM(fragmentLIZIZ, false), new C987103tV(fragmentLIZIZ, false));
                } else {
                    throw new IllegalArgumentException("Do not support this scope here.");
                }
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                ((MessageListFooterViewModel) assemVMLazy.getValue()).aO1(EnumC1707006mK.CLICK_CLOSE_BTN);
                ((ICommonChatNoticeViewModel) C06IT.LIZ(this.LL).getValue()).BQ2(EnumC1596306Mv.PRESHOWN_STICKERS);
                IMSuggestedStickersAnalytics iMSuggestedStickersAnalytics = IMSuggestedStickersAnalytics.LIZIZ;
                String conversationId = this.LL.op().getConversationId();
                SessionInfo sessionInfoOp = this.LL.op();
                String singleChatFromUserId = null;
                if ((sessionInfoOp instanceof C909290Zln) && sessionInfoOp != null) {
                    singleChatFromUserId = sessionInfoOp.getSingleChatFromUserId();
                }
                if (this.LL.op() instanceof C909290Zln) {
                    enumC1644606cG = EnumC1644606cG.SINGLE;
                } else {
                    enumC1644606cG = EnumC1644606cG.GROUP;
                }
                PreshownStickerSceneConfig preshownStickerSceneConfig = this.LL.LLJLLL;
                if (preshownStickerSceneConfig == null || (str = preshownStickerSceneConfig.sceneId) == null) {
                    str = "";
                }
                if (preshownStickerSceneConfig != null && (list = preshownStickerSceneConfig.preshownStickerItem) != null) {
                    size = list.size();
                }
                C1646106cV c1646106cV = new AbstractC1645706cR() { // from class: X.06cV
                };
                PreshownStickerSceneConfig preshownStickerSceneConfig2 = this.LL.LLJLLL;
                if (preshownStickerSceneConfig2 != null) {
                    setLIZ = C0I9X.LIZ(preshownStickerSceneConfig2);
                } else {
                    setLIZ = C08CX.INSTANCE;
                }
                C1645406cO.LIZ(conversationId, singleChatFromUserId, enumC1644606cG, str, size, c1646106cV, setLIZ, false, 384);
            }
        });
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0ZTD c0ztd) {
        View view;
        String str;
        List<PreshownStickerItem> list;
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        PreshownStickerSceneConfig preshownStickerSceneConfig = ((C1636906b1) assemVMLazy.getValue().getState()).LL;
        this.LLJLLL = preshownStickerSceneConfig;
        if (preshownStickerSceneConfig != null) {
            TextView textView = (TextView) this.LLJLIL.getValue();
            PreshownStickerSceneConfig preshownStickerSceneConfig2 = this.LLJLLL;
            if (preshownStickerSceneConfig2 != null) {
                str = preshownStickerSceneConfig2.headerText;
            } else {
                str = null;
            }
            textView.setText(str);
            PreshownStickerSceneConfig preshownStickerSceneConfig3 = this.LLJLLL;
            if (preshownStickerSceneConfig3 != null && (list = preshownStickerSceneConfig3.preshownStickerItem) != null) {
                ((RecyclerView) this.LLJLL.getValue()).setAdapter(new C0I9T(list, new C0I9W(this)));
                return;
            }
            return;
        }
        C898900ZOe c898900ZOe = (C898900ZOe) this.LLJZ.getValue();
        if (c898900ZOe == null || (view = c898900ZOe.LL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZTD c0ztd) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZTD c0ztd) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
