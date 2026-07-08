package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.friends;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C1387050mCN;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C994040byU;
import X.EnumC1387060mCO;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckupRelationFriendsCell extends PowerCell<C994040byU> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CheckupRelationFriendsCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/privacy/checkup/relation/friends/CheckupRelationFriendsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CheckupRelationFriendsCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CheckupRelationFriendsViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 936);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(112);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 947), awS563S0100000_19, AFwS207S0000000_19.get$arr$(87), new AwS563S0100000_19((C03K6) this, 922), new AwS563S0100000_19((C03K6) this, 924), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 926), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 928), null, new AwS563S0100000_19((C03K6) this, 929));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 923);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 925);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 927);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 38));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 930);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 931);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 932);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 933);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 934);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 935), awS563S0100000_19, AFwS207S0000000_19.get$arr$(85), new AwS563S0100000_19((C03K6) this, 937), new AwS563S0100000_19((C03K6) this, 938), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 939), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 940), null, new AwS563S0100000_19((C03K6) this, 941));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 942), awS563S0100000_19, AFwS207S0000000_19.get$arr$(86), new AwS563S0100000_19((C03K6) this, 943), new AwS563S0100000_19((C03K6) this, 944), new AwS563S0100000_19((C03K6) this, 945), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 946));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C994040byU c994040byU = (C994040byU) interfaceC1891350zJl;
        super.onBindItemView(c994040byU);
        ((TextView) this.itemView.findViewById(R.id.p94)).setText(c994040byU.LL.getNickname());
        ((TextView) this.itemView.findViewById(R.id.user_name)).setText(c994040byU.LL.getUniqueId());
        C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.user_avatar), new C03IT(c994040byU.LL.getAvatarThumb().getUrlList()), false, null, null, false, false, null, null, false, null, 1022);
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.t4m);
        C1387050mCN c1387050mCN = new C1387050mCN(c994040byU.LL);
        c1387050mCN.LIZIZ = false;
        c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        relationButton.setTracker(new AwS563S0100000_19(this, 3251));
        relationButton.getListener().setFollowClickListener(new AwS455S0200000_19(this, c994040byU, 48));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.bdi, false, 4, null);
    }
}
