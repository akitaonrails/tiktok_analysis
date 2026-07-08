package com.ss.android.ugc.aweme.detailpage.manageadmin.view;

import X.AbstractC1218280hoA;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0ZK1;
import X.C0ZKF;
import X.C1218270ho9;
import X.C1218290hoB;
import X.C1218300hoC;
import X.C1218310hoD;
import X.C13LE;
import X.C1584506Ih;
import X.C1908830zlx;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C898270ZLt;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS331S0300000_19;
import wh6.AbS509S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageAdminCell extends PowerCell<C1218270ho9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageAdminCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/manageadmin/viewmodel/ManageAdminViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageAdminCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageAdminViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1063);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(146);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1046), awS563S0100000_19, AFwS207S0000000_19.get$arr$(101), new AwS563S0100000_19((C03K6) this, 1049), new AwS563S0100000_19((C03K6) this, 1051), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1053), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 1055), null, new AwS563S0100000_19((C03K6) this, 1056));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 1050);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1052);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 1054);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 43));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1057);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 1058);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 1059);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 1060);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 1061);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1062), awS563S0100000_19, AFwS207S0000000_19.get$arr$(102), new AwS563S0100000_19((C03K6) this, 1064), new AwS563S0100000_19((C03K6) this, 1065), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1066), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 1067), null, new AwS563S0100000_19((C03K6) this, 1068));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1069), awS563S0100000_19, AFwS207S0000000_19.get$arr$(103), new AwS563S0100000_19((C03K6) this, 1037), new AwS563S0100000_19((C03K6) this, 1039), new AwS563S0100000_19((C03K6) this, 1042), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 1044));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1038));
        this.LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1040));
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1048));
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1045));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1043));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1041));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1047));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        ((IDMAvatarLoader) this.LLIZLLLIL.getValue()).LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1908830zlx c1908830zlxLJIIIIZZ;
        C1218270ho9 c1218270ho9 = (C1218270ho9) interfaceC1891350zJl;
        ((IDMAvatarLoader) this.LLIZLLLIL.getValue()).LIZIZ(c1218270ho9.LL.getUid(), c1218270ho9.LL.getDisplayAvatar(), new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        ((TextView) this.LLILLL.getValue()).setText(c1218270ho9.LL.getDisplayName());
        ((TextView) this.LLILZIL.getValue()).setText(c1218270ho9.LL.getUniqueId());
        TextView textView = (TextView) this.LLILZ.getValue();
        Integer num = c1218270ho9.LLILLJJLI.LIZ;
        if (num != null) {
            textView.setText(this.itemView.getContext().getString(num.intValue()));
            C1584506Ih.LIZIZ(textView);
        } else {
            C1584506Ih.LIZ(textView);
        }
        AbstractC1218280hoA abstractC1218280hoA = c1218270ho9.LLILLL;
        if (Intrinsics.LJFF(abstractC1218280hoA, C1218290hoB.LIZ)) {
            C1584506Ih.LIZ((View) this.LLILZLL.getValue());
            C1584506Ih.LIZ((View) this.LLIZ.getValue());
        } else if (Intrinsics.LJFF(abstractC1218280hoA, C1218310hoD.LIZ)) {
            C197039127h c197039127h = (C197039127h) this.LLILZLL.getValue();
            C1584506Ih.LIZIZ(c197039127h);
            C786410Ut5.I7(new AbS331S0300000_19(c1218270ho9, this, c197039127h, 4), c197039127h);
            C1584506Ih.LIZ((View) this.LLIZ.getValue());
        } else if (Intrinsics.LJFF(abstractC1218280hoA, C1218300hoC.LIZ)) {
            C1584506Ih.LIZ((View) this.LLILZLL.getValue());
            RelationButton relationButton = (RelationButton) this.LLIZ.getValue();
            C1584506Ih.LIZIZ(relationButton);
            C2201941BFw c2201941BFw = IMUser.Companion;
            IMUser iMUser = c1218270ho9.LL;
            c2201941BFw.getClass();
            User userLJII = C2201941BFw.LJII(iMUser);
            IMFriendsService.LIZ.getClass();
            IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
            if (iMFriendsServiceLIZ != null && (c1908830zlxLJIIIIZZ = iMFriendsServiceLIZ.LJIIIIZZ(userLJII)) != null) {
                relationButton.LLLLZIL(c1908830zlxLJIIIIZZ);
            }
        } else {
            throw new C1954807lC();
        }
        C786410Ut5.I7(new AbS509S0200000_19(this, c1218270ho9, 12), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cix, viewGroup, false);
    }
}
