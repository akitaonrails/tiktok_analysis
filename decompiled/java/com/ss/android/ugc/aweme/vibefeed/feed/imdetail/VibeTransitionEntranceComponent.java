package com.ss.android.ugc.aweme.vibefeed.feed.imdetail;

import X.C01GW;
import X.C1566140qrE;
import X.C1603210rp1;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1603260rp6;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class VibeTransitionEntranceComponent extends BasePanelComponent {
    public final C01GW LL;

    public VibeTransitionEntranceComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 639), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 24));
        }
        this.LL = c01gwLIZIZ;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        View view;
        final C1603210rp1 c1603210rp1;
        super.onParentViewCreated();
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (view = fragment.getView()) == null || (c1603210rp1 = (C1603210rp1) view.findViewById(R.id.nns)) == null) {
            return;
        }
        c1603210rp1.setReleaseListener(new InterfaceC1603260rp6() { // from class: X.0T5z
            @Override // X.InterfaceC1603260rp6
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1603260rp6
            public final void onRelease() {
                IVibeEntranceService iVibeEntranceServiceLIZ;
                String chatFromUserId;
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LIZ.LL.getValue();
                if (C1575980r76.LJ(iFeedPanelPlatformAbility != null ? iFeedPanelPlatformAbility.LJIIIIZZ() : null) && (iVibeEntranceServiceLIZ = C1557990qe5.LIZ()) != null) {
                    Context context = c1603210rp1.getContext();
                    C2189821An6 c2189821An6 = this.LIZ.getPanelContext().LIZJ;
                    String conversationId = c2189821An6 != null ? c2189821An6.getConversationId() : null;
                    String str = "";
                    if (conversationId == null) {
                        conversationId = "";
                    }
                    C2189821An6 c2189821An62 = this.LIZ.getPanelContext().LIZJ;
                    if (c2189821An62 != null && (chatFromUserId = c2189821An62.getChatFromUserId()) != null) {
                        str = chatFromUserId;
                    }
                    EnumC638800P3u enumC638800P3u = EnumC638800P3u.END_OF_SHARED_CONTENT;
                    iVibeEntranceServiceLIZ.LJI(context, conversationId, str, "", enumC638800P3u.getValue(), enumC638800P3u.getValue(), null);
                }
            }

            @Override // X.InterfaceC1603260rp6
            public final boolean LIZ(int i, int i2) {
                if (i2 == 1 && i < (-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)))) {
                    return true;
                }
                return false;
            }
        });
    }
}
