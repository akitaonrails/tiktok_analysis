package com.ss.android.ugc.aweme.tag;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1324840ka2;
import X.C13LE;
import X.C14EU;
import X.C15N5;
import X.C15NZ;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes32.dex */
public final class SelectedListCell extends PowerCell<C15NZ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectedListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagFriendsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectedListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTagFriendsListViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 1149);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(216);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1160), awS575S0100000_31, AFwS221S0000000_31.get$arr$(281), new AwS575S0100000_31((C03K6) this, 1135), new AwS575S0100000_31((C03K6) this, 1137), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1139), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1141), null, new AwS575S0100000_31((C03K6) this, 1142));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 1136);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1138);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 1140);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 75));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 1143);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 1144);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 1145);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 1146);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 1147);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1148), awS575S0100000_31, AFwS221S0000000_31.get$arr$(282), new AwS575S0100000_31((C03K6) this, 1150), new AwS575S0100000_31((C03K6) this, 1151), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1152), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1153), null, new AwS575S0100000_31((C03K6) this, 1154));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1155), awS575S0100000_31, AFwS221S0000000_31.get$arr$(283), new AwS575S0100000_31((C03K6) this, 1156), new AwS575S0100000_31((C03K6) this, 1157), new AwS575S0100000_31((C03K6) this, 1158), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 1159));
        }
        this.LL = assemVMLazy;
    }

    public final VideoTagFriendsListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (VideoTagFriendsListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 87), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C15NZ c15nz = (C15NZ) interfaceC1891350zJl;
        View view = this.itemView;
        C1324840ka2.LJFF((RemoteImageView) view.findViewById(R.id.bi2), c15nz.LL.getDisplayAvatar());
        TextView textView = (TextView) view.findViewById(R.id.x2n);
        I5();
        textView.setText(VideoTagFriendsListViewModel.wQ2(c15nz.LL));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBrandedContentPageEvent(C15N5 c15n5) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        VideoTagFriendsListViewModel videoTagFriendsListViewModelI5 = I5();
        int i = c15n5.LIZ;
        boolean z = c15n5.LIZIZ;
        Aweme aweme = videoTagFriendsListViewModelI5.vQ2().getAweme();
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            commerceVideoAuthInfo.setBrandedContentType(i);
            commerceVideoAuthInfo.setAdvPromotable(z);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dln, viewGroup, false);
    }
}
