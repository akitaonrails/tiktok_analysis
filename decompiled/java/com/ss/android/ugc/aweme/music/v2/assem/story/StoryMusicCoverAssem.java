package com.ss.android.ugc.aweme.music.v2.assem.story;

import X.C019F;
import X.C01GW;
import X.C0ZP4;
import X.C127G;
import X.C12ES;
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
import X.InterfaceC2217461Bqa;
import X.InterfaceC630530OoF;
import Y.AObjectS62S0000000_9;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryMusicCoverAssem extends MusicCoverAssem implements InterfaceC630530OoF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final InterfaceC630530OoF LLJLLL = new C1611340s28();
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1715));
    public final AssemVMLazy LLJZIJLIL;
    public C0ZP4 LLL;
    public C127G LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryMusicCoverAssem.class, "storyMusicDetailVM", "getStoryMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/assem/story/IStoryMusicCoverEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fdo;
    }

    @Override // X.InterfaceC630530OoF
    public final void Tn(UrlModel urlModel) {
        this.LLJLLL.Tn(urlModel);
    }

    @Override // X.InterfaceC630530OoF
    public final void bh(int i, String str, String str2) {
        this.LLJLLL.bh(i, str, str2);
    }

    @Override // X.InterfaceC630530OoF
    public final void dm(LifecycleOwner lifecycleOwner) {
        this.LLJLLL.dm(lifecycleOwner);
    }

    @Override // X.InterfaceC630530OoF
    public final void wj(AvatarComponentView avatarComponentView, Integer num) {
        this.LLJLLL.wj(avatarComponentView, num);
    }

    public StoryMusicCoverAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IStoryMusicCoverEntranceViewModel.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 286), AFwS240S0000000_9.get$arr$(830), null, true);
    }

    public final IStoryMusicCoverEntranceViewModel yp() {
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (IStoryMusicCoverEntranceViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IStoryMusicCoverEntranceViewModel.class, new AObjectS62S0000000_9(this, 16)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        yp().wQ2();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        ViewParent parent = view.getParent();
        Object parent2 = null;
        if (parent != null) {
            parent2 = parent.getParent();
        }
        if ((parent2 instanceof LinearLayout) && (view2 = (View) parent2) != null) {
            view2.setPadding((int) C12ES.LIZJ(2.0f, view.getContext()), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
        }
        this.LLJLLL.wj((AvatarComponentView) this.LLJZ.getValue(), Integer.valueOf(yp().hashCode()));
        InterfaceC630530OoF interfaceC630530OoF = this.LLJLLL;
        getOwnLifecycleOwner();
        interfaceC630530OoF.dm(this);
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicCoverAssem
    public final void up(View view) {
        AssemViewModel.asyncSubscribe$default(op(), new C2217381BqS() { // from class: X.0OoE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 328), 14, null);
        C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0OoG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C630570OoJ) obj).LLILLL);
            }
        }, null, new AwS623S0100000_9(this, 115), 6);
    }
}
