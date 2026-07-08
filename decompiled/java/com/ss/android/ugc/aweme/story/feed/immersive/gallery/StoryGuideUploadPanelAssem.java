package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.AbstractC848400XPy;
import X.C01D1;
import X.C0S1B;
import X.C0XQ7;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1606270rtx;
import X.C1608750rxx;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C727350Sg1;
import X.C728900SiW;
import X.C736680Sv4;
import X.C737750Swn;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.ability.IStoryGuideUploadPanelAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideUploadPanelAssem extends UISlotAssem implements IStoryGuideUploadPanelAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public C197039127h LLJJI;
    public ConstraintLayout LLJJIII;
    public AvatarComponentView LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryGuideUploadPanelAssem.class, "viewListVM", "getViewListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryGuideUploadPanelAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 842), AFwS243S0000000_11.get$arr$(454), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fce;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.gallery.ability.IStoryGuideUploadPanelAbility
    public final boolean sD0() {
        ConstraintLayout constraintLayout = this.LLJJIII;
        return constraintLayout != null && constraintLayout.isShown();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), IStoryGuideUploadPanelAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, IStoryGuideUploadPanelAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        this.LLJJI = (C197039127h) view.findViewById(R.id.cwd);
        this.LLJJIII = (ConstraintLayout) view.findViewById(R.id.dyz);
        AvatarComponentView avatarComponentView = (AvatarComponentView) view.findViewById(R.id.bj2);
        this.LLJJIJI = avatarComponentView;
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS590S0100000_11(this, 422).invoke(config.LIZ);
            WeakReference weakReference = new WeakReference(C724240Sb0.LIZ(this));
            AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            C727350Sg1 c727350Sg1 = ((StoryViewerListViewModel) assemVMLazy.getValue()).LLILLL;
            if (c727350Sg1 == null || (str = c727350Sg1.feedEnterFrom) == null) {
                str = "";
            }
            config.LIZJ(new C737750Swn(new C1606270rtx(false, true, new C728900SiW(str), weakReference, 4)));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        User userM307clone = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().m307clone();
        AvatarComponentView avatarComponentView2 = this.LLJJIJI;
        if (avatarComponentView2 != null) {
            C0S1B.LIZ(avatarComponentView2, userM307clone.getUid(), userM307clone, this, false, null, 56);
        }
        C197039127h c197039127h = this.LLJJI;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS115S0200000_11(view, this, 10));
        }
        AssemVMLazy assemVMLazy2 = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.0SiU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILLJJLI;
            }
        }, null, new AwS625S0100000_11(this, 65), 6);
    }
}
