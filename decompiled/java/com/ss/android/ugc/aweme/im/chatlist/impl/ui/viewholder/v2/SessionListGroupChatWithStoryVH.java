package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.C01GW;
import X.C0Z8M;
import X.C0Z93;
import X.C0ZP6;
import X.C0ZPB;
import X.C1229100i5c;
import X.C13BV;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1609500rzA;
import X.C1906880zio;
import X.C19727912Gn;
import X.C1AF0;
import X.C2188811AlT;
import X.C427660Gpo;
import X.C452501pT;
import X.C737760Swo;
import X.C786410Ut5;
import X.C895200Z9y;
import X.C897520ZIw;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1607270rvZ;
import X.InterfaceC1398730mVD;
import X.InterfaceC888500YtM;
import X.InterfaceC903910Zd7;
import Y.ACListenerS117S0200000_14;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SessionListGroupChatWithStoryVH extends SessionListGroupChatVH {
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public InterfaceC1398730mVD LLLLLILLIL;
    public boolean LLLLLJIL;
    public String LLLLLJLJLL;

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH, X.InterfaceC1508640pMU
    public final String T() {
        return "SessionListGroupChatWithStoryVH";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final int T5(C1906880zio c1906880zio) {
        return 52;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final String b6() {
        return "group_chat_vh_with_story";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final AvatarComponentView x7() {
        return (AvatarComponentView) this.LLLLILI.getValue();
    }

    public final void z7() {
        try {
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.uud);
            if (frameLayout != null) {
                C895200Z9y.LIZ(frameLayout);
            }
            C1609500rzA c1609500rzA = (C1609500rzA) this.itemView.findViewById(R.id.i8h);
            if (c1609500rzA != null) {
                C895200Z9y.LIZ(c1609500rzA);
            }
            C19727912Gn c19727912Gn = (C19727912Gn) this.itemView.findViewById(R.id.a6g);
            if (c19727912Gn != null) {
                C895200Z9y.LIZ(c19727912Gn);
            }
            SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.itemView.findViewById(R.id.bir);
            if (smartAvatarImageView != null) {
                smartAvatarImageView.setBackground(null);
            }
            if (frameLayout != null) {
                frameLayout.setLayerType(2, null);
            }
            if (c1609500rzA != null) {
                c1609500rzA.setLayerType(2, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "SessionListGroupChatWithStoryVH Failed to apply optimizeAvatarOverdraw");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final C427660Gpo c6() {
        return x7().getAvatar();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public final void onAttach() {
        super.onAttach();
        C0Z8M c0z8m = (C0Z8M) this.LLJJIJIIJIL;
        if (c0z8m != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAttach: group = ");
            C0Z8M c0z8m2 = (C0Z8M) this.LLJJIJIIJIL;
            sbLIZ.append(c0z8m2 != null ? c0z8m2.getSessionId() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            v7(c0z8m);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public final void onDetach() {
        String sessionId;
        C0ZP6 c0zp6;
        super.onDetach();
        ((C0ZPB) this.LLLLJI.getValue()).release();
        C0Z8M c0z8m = (C0Z8M) this.LLJJIJIIJIL;
        if (c0z8m != null && (sessionId = c0z8m.getSessionId()) != null && C1229100i5c.LIZ.LJIIJ(sessionId) && (c0zp6 = (C0ZP6) this.LLLLL.getValue()) != null) {
            c0zp6.Yx2(sessionId);
        }
        InterfaceC1398730mVD interfaceC1398730mVD = this.LLLLLILLIL;
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.reset();
        }
    }

    public SessionListGroupChatWithStoryVH(View view) {
        super(view);
        this.LLLLILI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 439));
        this.LLLLJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(120));
        this.LLLLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 440));
        this.LLLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 442));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 441));
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final void L5(InterfaceC888500YtM interfaceC888500YtM) {
        C0Z8M c0z8m = (C0Z8M) interfaceC888500YtM;
        v7(c0z8m);
        super.L5(c0z8m);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH
    public final void p7(C0Z8M c0z8m) {
        x7().LJIILIIL(c0z8m.getActivityStatusViewData(), EnumC1607270rvZ.ACTIVE);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH
    /* JADX INFO: renamed from: r7 */
    public final void L5(C0Z8M c0z8m) {
        v7(c0z8m);
        super.L5(c0z8m);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH
    public final void t7(View view) {
        C786410Ut5.Sd(R.layout.cmx, C786410Ut5.ne(view.getContext()), (ViewGroup) this.itemView.findViewById(R.id.uud));
        if (((Boolean) C0Z93.LJ.getValue()).booleanValue()) {
            try {
                if (C0Z93.LIZJ()) {
                    C0Z8M c0z8m = (C0Z8M) this.LLJJIJIIJIL;
                    if (c0z8m != null && c0z8m.getPriority() == 0) {
                        C895200Z9y.LIZ(this.itemView);
                    }
                    View viewFindViewById = this.itemView.findViewById(R.id.uuf);
                    if (viewFindViewById != null) {
                        C895200Z9y.LIZ(viewFindViewById);
                    }
                    View viewFindViewById2 = this.itemView.findViewById(R.id.y1z);
                    if (viewFindViewById2 != null) {
                        C895200Z9y.LIZ(viewFindViewById2);
                    }
                    View viewFindViewById3 = this.itemView.findViewById(R.id.evm);
                    if (viewFindViewById3 != null) {
                        C895200Z9y.LIZ(viewFindViewById3);
                    }
                    View viewFindViewById4 = this.itemView.findViewById(R.id.gy3);
                    if (viewFindViewById4 != null) {
                        C895200Z9y.LIZ(viewFindViewById4);
                    }
                }
                if (C0Z93.LIZIZ()) {
                    z7();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "SessionListGroupChatWithStoryVH Failed to apply optimizations");
            }
        }
    }

    public final void v7(C0Z8M c0z8m) {
        InterfaceC903910Zd7 interfaceC903910Zd7;
        this.LLLLLJLJLL = c0z8m.getSessionId();
        AvatarComponentView avatarComponentViewX7 = x7();
        if (!this.LLLLLJIL) {
            this.LLLLLJIL = true;
            C1608750rxx config = avatarComponentViewX7.getConfig();
            new AwS593S0100000_14(this, 320).invoke(config.LIZ);
            config.LIZLLL(new C737760Swo(new C1606750ruj(EnumC1606080rte.GROUP_CHAT, new C1606770rul(null, new AwS628S0100000_14(this, 70), new AwS593S0100000_14(this, 321), null, new AwS558S0100000_14(this, 1563), AFwS201S0000000_14.get$arr$(527), new AwS593S0100000_14(this, 322), null, null, 393), 4)), new C1607280rva(new C1607310rvd(EnumC1606090rtf.DM, s7(), true, true, (C897520ZIw) this.LLLLJ.getValue(), 14)));
            new AwS593S0100000_14(this, 323).invoke(config.LIZJ);
            avatarComponentViewX7.LJFF(avatarComponentViewX7.getConfig());
            avatarComponentViewX7.getClickListener().LIZ(1, new ACListenerS117S0200000_14(avatarComponentViewX7, this, 34));
            avatarComponentViewX7.getClickListener().LIZ(3, new ACListenerS149S0100000_14(this, 78));
        }
        if (!C1229100i5c.LIZ.LJIIJ(c0z8m.getSessionId())) {
            x7().LJIILJJIL(56, null);
            return;
        }
        String sessionId = c0z8m.getSessionId();
        List<String> memberIdList = c0z8m.getMemberIdList();
        if (memberIdList == null) {
            memberIdList = C13BV.INSTANCE;
        }
        InterfaceC1398730mVD interfaceC1398730mVD = this.LLLLLILLIL;
        if ((interfaceC1398730mVD instanceof InterfaceC903910Zd7) && (interfaceC903910Zd7 = (InterfaceC903910Zd7) interfaceC1398730mVD) != null) {
            ((C0ZPB) this.LLLLJI.getValue()).LIZ(sessionId, memberIdList, interfaceC903910Zd7);
        }
        C0ZP6 c0zp6 = (C0ZP6) this.LLLLL.getValue();
        if (c0zp6 != null) {
            c0zp6.HB(c0z8m.getSessionId());
        }
    }
}
