package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.follower;

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
import X.C786410Ut5;
import X.C994040byU;
import X.EnumC1387060mCO;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS122S0200000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckupRelationFollowerCell extends PowerCell<C994040byU> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CheckupRelationFollowerCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/privacy/checkup/relation/follower/CheckupRelationFollowerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CheckupRelationFollowerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CheckupRelationFollowerViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 876);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(106);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 887), awS563S0100000_19, AFwS207S0000000_19.get$arr$(81), new AwS563S0100000_19((C03K6) this, 862), new AwS563S0100000_19((C03K6) this, 864), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 866), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 868), null, new AwS563S0100000_19((C03K6) this, 869));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 863);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 865);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 867);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 36));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 870);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 871);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 872);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 873);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 874);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 875), awS563S0100000_19, AFwS207S0000000_19.get$arr$(79), new AwS563S0100000_19((C03K6) this, 877), new AwS563S0100000_19((C03K6) this, 878), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 879), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 880), null, new AwS563S0100000_19((C03K6) this, 881));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 882), awS563S0100000_19, AFwS207S0000000_19.get$arr$(80), new AwS563S0100000_19((C03K6) this, 883), new AwS563S0100000_19((C03K6) this, 884), new AwS563S0100000_19((C03K6) this, 885), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 886));
        }
        this.LL = assemVMLazy;
    }

    public final CheckupRelationFollowerViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (CheckupRelationFollowerViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C994040byU c994040byU = (C994040byU) interfaceC1891350zJl;
        super.onBindItemView(c994040byU);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.oko);
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C786410Ut5.a9(tuxIconView, new ACListenerS122S0200000_19(this, c994040byU, 64));
        ((TextView) this.itemView.findViewById(R.id.p94)).setText(c994040byU.LL.getNickname());
        ((TextView) this.itemView.findViewById(R.id.user_name)).setText(c994040byU.LL.getUniqueId());
        C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.user_avatar), new C03IT(c994040byU.LL.getAvatarThumb().getUrlList()), false, null, null, false, false, null, null, false, null, 1022);
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.t4m);
        C1387050mCN c1387050mCN = new C1387050mCN(c994040byU.LL);
        c1387050mCN.LIZIZ = false;
        c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        relationButton.setTracker(new AwS563S0100000_19(this, 3162));
        relationButton.getListener().setFollowClickListener(new AwS455S0200000_19(this, c994040byU, 44));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.bdi, false, 4, null);
    }
}
