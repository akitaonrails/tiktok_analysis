package com.ss.android.ugc.aweme.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C12823050b;
import X.C13LE;
import X.C1841350y17;
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
import Y.ACListenerS154S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FavoriteVideoCell extends BaseVideoCell<C12823050b> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final String LLJILJILJ = "FavoriteVideoCell";
    public final AssemVMLazy LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FavoriteVideoCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/viewmodel/MentionFavoriteVideoVM;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FavoriteVideoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionFavoriteVideoVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 427);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(76);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 412), awS563S0100000_19, AFwS207S0000000_19.get$arr$(62), new AwS563S0100000_19((C03K6) this, 413), new AwS563S0100000_19((C03K6) this, 415), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 417), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 419), null, new AwS563S0100000_19((C03K6) this, 420));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 414);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 416);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 418);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 26));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 421);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 422);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 423);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 424);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 425);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 426), awS563S0100000_19, AFwS207S0000000_19.get$arr$(63), new AwS563S0100000_19((C03K6) this, 428), new AwS563S0100000_19((C03K6) this, 429), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 430), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 431), null, new AwS563S0100000_19((C03K6) this, 432));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 433), awS563S0100000_19, AFwS207S0000000_19.get$arr$(64), new AwS563S0100000_19((C03K6) this, 434), new AwS563S0100000_19((C03K6) this, 435), new AwS563S0100000_19((C03K6) this, 436), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 437));
        }
        this.LLJILLL = assemVMLazy;
    }

    public final MentionFavoriteVideoVM U5() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (MentionFavoriteVideoVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C786410Ut5.Q8(N5(), new ACListenerS154S0100000_19(this, 85));
        C786410Ut5.e9(I5(), new ACListenerS154S0100000_19(this, 86));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        UrlModel cover;
        C12823050b c12823050b = (C12823050b) interfaceC1891350zJl;
        super.onBindItemView(c12823050b);
        this.LLIZ = c12823050b.LL;
        S5(c12823050b);
        Video video = c12823050b.LL.getVideo();
        Aweme aweme = null;
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        String str = this.LLJILJILJ;
        Aweme aweme2 = this.LLIZ;
        if (aweme2 != null) {
            aweme = aweme2;
        }
        T5(cover, str, aweme);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dm8, viewGroup, false);
        this.LL = (SmartImageView) viewTd.findViewById(R.id.cover);
        this.LLILZIL = (C1841350y17) viewTd.findViewById(R.id.dqk);
        this.LLILZ = (ViewGroup) viewTd.findViewById(R.id.video_info_container);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.tv_play_count);
        this.LLILZLL = viewTd.findViewById(R.id.video_cover_mask);
        return viewTd;
    }
}
