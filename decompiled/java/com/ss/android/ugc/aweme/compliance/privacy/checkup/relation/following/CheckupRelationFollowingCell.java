package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.following;

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
public final class CheckupRelationFollowingCell extends PowerCell<C994040byU> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CheckupRelationFollowingCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/privacy/checkup/relation/following/CheckupRelationFollowingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CheckupRelationFollowingCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CheckupRelationFollowingViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 906);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(109);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 917), awS563S0100000_19, AFwS207S0000000_19.get$arr$(84), new AwS563S0100000_19((C03K6) this, 892), new AwS563S0100000_19((C03K6) this, 894), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 896), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 898), null, new AwS563S0100000_19((C03K6) this, 899));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 893);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 895);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 897);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 37));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 900);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 901);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 902);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 903);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 904);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 905), awS563S0100000_19, AFwS207S0000000_19.get$arr$(82), new AwS563S0100000_19((C03K6) this, 907), new AwS563S0100000_19((C03K6) this, 908), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 909), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 910), null, new AwS563S0100000_19((C03K6) this, 911));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 912), awS563S0100000_19, AFwS207S0000000_19.get$arr$(83), new AwS563S0100000_19((C03K6) this, 913), new AwS563S0100000_19((C03K6) this, 914), new AwS563S0100000_19((C03K6) this, 915), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 916));
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
        relationButton.setTracker(new AwS563S0100000_19(this, 3180));
        relationButton.getListener().setFollowClickListener(new AwS455S0200000_19(this, c994040byU, 46));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.bdi, false, 4, null);
    }
}
