package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem;

import X.C01GW;
import X.C06W7;
import X.C0ZPB;
import X.C1509305vX;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1608750rxx;
import X.C19EG;
import X.C2217381BqS;
import X.C427870Gq9;
import X.C452501pT;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737760Swo;
import X.EnumC1606080rte;
import X.InterfaceC1398730mVD;
import X.InterfaceC2135708Yh;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupDetailAvatarWithStoryAssem extends GroupDetailAvatarAssem {
    public final C01GW LLJJIJIIJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 50));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 51));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 52));
    public InterfaceC1398730mVD LLJJJIL;

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailAvatarAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cnu;
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem.GroupDetailAvatarAssem, com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailAvatarAssem
    public final void lp() {
        super.lp();
        AvatarComponentView avatarComponentViewSp = sp();
        C1608750rxx config = avatarComponentViewSp.getConfig();
        new AwS593S0100000_14(this, 10).invoke(config.LIZ);
        config.LIZJ(new C737760Swo(new C1606750ruj(EnumC1606080rte.GROUP_CHAT, new C1606770rul(null, new AwS628S0100000_14(this, 3), new AwS593S0100000_14(this, 11), null, new AwS558S0100000_14(this, 53), null, new AwS593S0100000_14(this, 12), null, null, 425), 4)));
        config.LIZIZ(AFwS248S0000000_14.get$arr$(24));
        avatarComponentViewSp.LJFF(avatarComponentViewSp.getConfig());
        sp().getClickListener().LIZ(1, new ACListenerS149S0100000_14(this, 7));
    }

    public final AvatarComponentView sp() {
        return (AvatarComponentView) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailAvatarAssem
    public final View ip() {
        return sp();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailAvatarAssem
    public final C427870Gq9 kp() {
        return sp().getAvatar();
    }

    @Override // com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem.GroupDetailAvatarAssem, com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailAvatarAssem
    public final void mp() {
        InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl;
        super.mp();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (inboxGroupChatSocialStatusViewModelImpl = (InboxGroupChatSocialStatusViewModelImpl) C06W7.LIZ(c19egLIZ, InboxGroupChatSocialStatusViewModelImpl.class)) == null) {
            return;
        }
        inboxGroupChatSocialStatusViewModelImpl.LLJILJILJ = (InterfaceC2135708Yh) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0ZPB c0zpb = (C0ZPB) this.LLJJIJIL.getValue();
        if (c0zpb != null) {
            c0zpb.release();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailAvatarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0ZC8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 2), 4);
    }

    public final void tp(boolean z) {
        if (z) {
            sp().LJIILJJIL(80, 96);
        } else {
            sp().LJIILJJIL(96, 96);
        }
    }
}
