package com.ss.android.ugc.aweme.titlebar;

import X.C01GW;
import X.C0Y8T;
import X.C0ZPB;
import X.C0ZPJ;
import X.C1229100i5c;
import X.C1462005nu;
import X.C1509305vX;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607300rvc;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C429270GsP;
import X.C452501pT;
import X.C737760Swo;
import X.C786410Ut5;
import X.C814420VxA;
import X.C866950Xzh;
import X.C894700Z8a;
import X.C899360ZPy;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1607270rvZ;
import X.InterfaceC1398730mVD;
import X.InterfaceC903910Zd7;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class GroupWithStoryTitleBarCenterAssem extends GroupTitleBarCenterAssem {
    public InterfaceC1398730mVD LLLFF;
    public final C01GW LLJZIJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1150));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1151));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1152));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1153));

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cq8;
    }

    public final AvatarComponentView aq() {
        return (AvatarComponentView) this.LLJZIJLIL.getValue();
    }

    public final void dq() {
        AvatarComponentView avatarComponentViewAq = aq();
        C1608750rxx config = avatarComponentViewAq.getConfig();
        new AwS593S0100000_14(this, 159).invoke(config.LIZ);
        config.LIZLLL(new C737760Swo(new C1606750ruj(EnumC1606080rte.GROUP_CHAT, new C1606770rul(null, new AwS628S0100000_14(this, 37), null, null, new AwS558S0100000_14(this, 1154), null, new AwS593S0100000_14(this, 160), null, null, 429), 4)), new C1607280rva(new C1607310rvd(EnumC1606090rtf.DM, null, true, true, null, 158)));
        config.LIZIZ(AFwS248S0000000_14.get$arr$(342));
        avatarComponentViewAq.LJFF(avatarComponentViewAq.getConfig());
        aq().getClickListener().LIZ(1, new ACListenerS149S0100000_14(this, 51));
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final IDMAvatarLoader up() {
        return (IDMAvatarLoader) this.LLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void Ip() {
        aq().LJIILIIL(Ap().getState().LLILLL.LIZ ? C429270GsP.LIZIZ : C429270GsP.LIZJ, EnumC1607270rvZ.ACTIVE);
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final Boolean Jp() {
        return Boolean.valueOf(C1607300rvc.LIZIZ(aq()));
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final View hp() {
        return aq();
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public void init() {
        Ep();
        dq();
        Bp();
        Fp();
        Gp();
        mp();
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final ImageView kp() {
        C427660Gpo avatar = aq().getAvatar();
        if (avatar instanceof ImageView) {
            return avatar;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0ZPB c0zpb = (C0ZPB) this.LLLF.getValue();
        if (c0zpb != null) {
            c0zpb.release();
        }
    }

    public void Xp() {
        C01GW c01gw = C899360ZPy.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public void ip() {
        C01GW c01gw = C899360ZPy.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void Qp(View view) {
        if ((view instanceof ViewGroup) && view != null) {
            C786410Ut5.Sd(R.layout.cq_, C786410Ut5.ne(view.getContext()), (ViewGroup) view.findViewById(R.id.bi2));
        }
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void Tp(List<C1462005nu> list) {
        C0Y8T c0y8tYp;
        String conversationId;
        InterfaceC903910Zd7 interfaceC903910Zd7;
        C0ZPB c0zpb;
        String uid;
        if (C866950Xzh.LIZIZ(list) && (c0y8tYp = yp()) != null && (conversationId = c0y8tYp.getConversationId()) != null && C1229100i5c.LIZ.LJIIJ(conversationId)) {
            ArrayList arrayList = new ArrayList();
            for (C1462005nu c1462005nu : list) {
                String uid2 = c1462005nu.getUid();
                if (uid2 != null && uid2.length() != 0 && (uid = c1462005nu.getUid()) != null) {
                    arrayList.add(uid);
                }
            }
            InterfaceC1398730mVD interfaceC1398730mVD = this.LLLFF;
            if ((interfaceC1398730mVD instanceof InterfaceC903910Zd7) && (interfaceC903910Zd7 = (InterfaceC903910Zd7) interfaceC1398730mVD) != null && (c0zpb = (C0ZPB) this.LLLF.getValue()) != null) {
                c0zpb.LIZ(conversationId, arrayList, interfaceC903910Zd7);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void lp(C0ZPJ c0zpj) {
        C429270GsP c429270GsP;
        C894700Z8a c894700Z8a = c0zpj.LIZIZ;
        if (c0zpj.LIZ) {
            c429270GsP = C429270GsP.LIZIZ;
        } else {
            c429270GsP = C429270GsP.LIZJ;
        }
        aq().LJIILIIL(c429270GsP, EnumC1607270rvZ.ACTIVE);
        Vp(c894700Z8a, c0zpj.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.i0q);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                }
                C786410Ut5.W5(viewFindViewById, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.ugr);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (layoutParams2 != null) {
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                }
                C786410Ut5.W5(viewFindViewById2, layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
