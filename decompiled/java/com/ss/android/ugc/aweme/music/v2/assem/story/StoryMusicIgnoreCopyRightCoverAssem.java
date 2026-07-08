package com.ss.android.ugc.aweme.music.v2.assem.story;

import X.C019F;
import X.C01GW;
import X.C127G;
import X.C13IQ;
import X.C13LE;
import X.C1611340s28;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C5182020e;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC630530OoF;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.v2.assem.MusicIgnoreCopyRightCoverAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryMusicIgnoreCopyRightCoverAssem extends MusicIgnoreCopyRightCoverAssem implements InterfaceC630530OoF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final InterfaceC630530OoF LLJJJJJIL = new C1611340s28();
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1716));
    public final AssemVMLazy LLJJL;
    public C127G LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryMusicIgnoreCopyRightCoverAssem.class, "storyMusicDetailVM", "getStoryMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/assem/story/IStoryMusicCoverEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicIgnoreCopyRightCoverAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fdo;
    }

    @Override // X.InterfaceC630530OoF
    public final void Tn(UrlModel urlModel) {
        this.LLJJJJJIL.Tn(urlModel);
    }

    @Override // X.InterfaceC630530OoF
    public final void bh(int i, String str, String str2) {
        this.LLJJJJJIL.bh(i, str, str2);
    }

    @Override // X.InterfaceC630530OoF
    public final void dm(LifecycleOwner lifecycleOwner) {
        this.LLJJJJJIL.dm(lifecycleOwner);
    }

    @Override // X.InterfaceC630530OoF
    public final void wj(AvatarComponentView avatarComponentView, Integer num) {
        this.LLJJJJJIL.wj(avatarComponentView, num);
    }

    public StoryMusicIgnoreCopyRightCoverAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IStoryMusicCoverEntranceViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 287), AFwS240S0000000_9.get$arr$(831), null, true);
    }

    public final IStoryMusicCoverEntranceViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (IStoryMusicCoverEntranceViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJLIIIJLLLLLLLZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJLIIIJLLLLLLLZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IStoryMusicCoverEntranceViewModel.class, new AObjectS62S0000000_9(this, 17)}, defaultViewModelProviderFactory);
                    this.LLJJLIIIJLLLLLLLZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        op().wQ2();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicIgnoreCopyRightCoverAssem
    public final void mp(View view) {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicIgnoreCopyRightCoverAssem.LLJJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OoI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 329), 14, null);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OoH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C630570OoJ) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 116), 4);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicIgnoreCopyRightCoverAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJJIL.wj((AvatarComponentView) this.LLJJJJLIIL.getValue(), Integer.valueOf(op().hashCode()));
        InterfaceC630530OoF interfaceC630530OoF = this.LLJJJJJIL;
        getOwnLifecycleOwner();
        interfaceC630530OoF.dm(this);
        super.onViewCreated(view);
    }
}
