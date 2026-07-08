package com.ss.android.ugc.aweme.msg;

import X.C019F;
import X.C01GW;
import X.C06LC;
import X.C09R3;
import X.C0I0B;
import X.C0I73;
import X.C0VSJ;
import X.C0ZFW;
import X.C0ZHB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1529305yl;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1641706bn;
import X.C1646706cb;
import X.C197039127h;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C908760Zkw;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonType;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupSharePostBannerReusedUISlot extends ReusedUISlotAssem<GroupSharePostBannerReusedUISlot> implements InterfaceC712990Rxx<C1641706bn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJL;
    public final AssemVMLazy LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupSharePostBannerReusedUISlot.class, "actionBarLightInteractionVM", "getActionBarLightInteractionVM()Lcom/ss/android/ugc/aweme/im/actionbar/common/viewmodel/SocialActionBarLightInteractionViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupSharePostBannerReusedUISlot.class, "groupChatNoticeViewModel", "getGroupChatNoticeViewModel()Lcom/ss/android/ugc/aweme/chatnotice/GroupChatNoticeViewModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public GroupSharePostBannerReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialActionBarLightInteractionViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 691), AFwS229S0000000_2.get$arr$(417), null, true);
        this.LLJLIL = C06LC.LIZ(this);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 687));
        this.LLJLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 690));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 689));
        this.LLJLLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 688));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cij;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C457780HxI op() {
        return (C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void sp() {
        String strLIZJ;
        C908760Zkw c908760Zkw;
        List<ActionBarButtonConf> list;
        ActionBarButtonConf next;
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        Object value = ((SocialActionBarLightInteractionViewModel) assemVMLazy.getValue()).LLILZIL.getValue();
        String str = null;
        if ((value instanceof C908760Zkw) && (c908760Zkw = (C908760Zkw) value) != null && (list = c908760Zkw.LIZ) != null) {
            Iterator<ActionBarButtonConf> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Integer num = next.type;
                int value2 = ActionBarButtonType.VIDEO_SHARE.getValue();
                if (num != null && num.intValue() == value2) {
                    break;
                }
            }
            ActionBarButtonConf actionBarButtonConf = next;
            if (actionBarButtonConf != null) {
                str = actionBarButtonConf.actionSchema;
            }
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        if (str == null) {
            str = "";
        }
        String conversationId = op().LL.getConversationId();
        if (str.length() > 0) {
            try {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "panel_type");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception caught when parsing URI, schema = ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                    strLIZJ = C1646706cb.LIZJ(conversationId, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
            strLIZJ = C1646706cb.LIZJ(conversationId, C1646706cb.LIZIZ());
        } else {
            strLIZJ = C1646706cb.LIZJ(conversationId, C1646706cb.LIZIZ());
        }
        if (strLIZJ.length() == 0) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), strLIZJ);
        smartRouteBuildRoute.withParam("is_from_action_bar", 0);
        smartRouteBuildRoute.withParam("share_post_panel_enter_method", "group_share_post_banner");
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String strLIZLLL;
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        View view2 = (View) this.LLJLILLLLZIIL.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C0I73.LIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        view2.setBackground(c384050F3z.LIZ(view.getContext()));
        C786410Ut5.I7(new AbS686S0100000_2(this, 7), (View) this.LLJLLIL.getValue());
        View view3 = (View) this.LLJLLIL.getValue();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(999.0f)));
        view3.setBackground(c384050F3z2.LIZ(view.getContext()));
        ((C197039127h) this.LLJLL.getValue()).LJJJJL(new AwS581S0100000_2(view, 270));
        C786410Ut5.I7(new AbS686S0100000_2(this, 8), (View) this.LLJLL.getValue());
        C786410Ut5.I7(new AbS686S0100000_2(this, 9), (View) this.LLJLILLLLZIIL.getValue());
        IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGeckoCommonChannelManager.class);
        if (iDMGeckoCommonChannelManager != null && (strLIZLLL = iDMGeckoCommonChannelManager.LIZLLL(C960203pA.LIZIZ(view.getContext()))) != null && new C0VSJ(strLIZLLL).exists()) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(strLIZLLL));
            c1331670kl3LJII.LJJI((ImageView) this.LLJLLL.getValue());
            C786410Ut5.h3(c1331670kl3LJII);
        } else {
            ViewGroup.LayoutParams layoutParams = ((View) this.LLJLLL.getValue()).getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            C786410Ut5.G6((SmartImageView) this.LLJLLL.getValue(), layoutParams);
        }
        tp("show");
    }

    public final void tp(String str) {
        String conversationId = op().LL.getConversationId();
        boolean zLJIJ = C0ZFW.LJIJ(conversationId);
        C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action", str);
        linkedHashMap.put("conversation_id", conversationId);
        linkedHashMap.put("is_master", C1529305yl.LIZ(Boolean.valueOf(zLJIJ)));
        linkedHashMap.put("chat_type", "group");
        C20684815ws.LJIILLIIL("group_share_post_banner", linkedHashMap);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1641706bn c1641706bn) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(C1641706bn c1641706bn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1641706bn c1641706bn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
