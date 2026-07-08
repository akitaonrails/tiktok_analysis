package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1387050mCN;
import X.C13LE;
import X.C19719912Dl;
import X.C214100s7;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C623400Ock;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS144S0100000_9;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinMemberSubscriberCell extends PowerCell<C214100s7> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final ACListenerS144S0100000_9 LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinMemberSubscriberCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinMemberListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_n;
    }

    public BulletinMemberSubscriberCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinMemberListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 709);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(329);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 694), awS553S0100000_9, AFwS195S0000000_9.get$arr$(180), new AwS553S0100000_9((C03K6) this, 695), new AwS553S0100000_9((C03K6) this, 697), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 699), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 701), null, new AwS553S0100000_9((C03K6) this, 702));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 696);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 698);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, OppoPermissionPopupMaskDelayExp.DEFAULT);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 31));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 703);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 704);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 705);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 706);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 707);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 708), awS553S0100000_9, AFwS195S0000000_9.get$arr$(181), new AwS553S0100000_9((C03K6) this, 710), new AwS553S0100000_9((C03K6) this, 711), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 712), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 713), null, new AwS553S0100000_9((C03K6) this, 714));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 715), awS553S0100000_9, AFwS195S0000000_9.get$arr$(182), new AwS553S0100000_9((C03K6) this, 716), new AwS553S0100000_9((C03K6) this, 717), new AwS553S0100000_9((C03K6) this, 691), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 692));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 693));
        this.LLILLL = new ACListenerS144S0100000_9(this, 54);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.T8((C427660Gpo) this.itemView.findViewById(R.id.d1k), this.LLILLL);
        C786410Ut5.R7((LinearLayout) this.itemView.findViewById(R.id.d1l), this.LLILLL);
        ((RelationButton) this.itemView.findViewById(R.id.d1m)).setTracker(AFwS195S0000000_9.get$arr$(179));
        ((RelationButton) this.itemView.findViewById(R.id.d1m)).setFollowClickInterceptor(new C623400Ock(this, null));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C214100s7 c214100s7 = (C214100s7) interfaceC1891350zJl;
        super.onBindItemView(c214100s7);
        UrlModel avatarThumb = c214100s7.LL.getAvatarThumb();
        if (avatarThumb != null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.d1k), C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
        }
        ((TextView) this.itemView.findViewById(R.id.d1o)).setText(c214100s7.LL.getNickname());
        String uniqueId = c214100s7.LL.getUniqueId();
        if (uniqueId != null && uniqueId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.d1n), 8);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.d1n), 0);
            ((TextView) this.itemView.findViewById(R.id.d1n)).setText(c214100s7.LL.getUniqueId());
        }
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.d1m);
        C1387050mCN c1387050mCN = new C1387050mCN(c214100s7.LL);
        c1387050mCN.LIZIZ = true;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
    }
}
