package com.ss.android.ugc.aweme.aime.assem;

import X.C019F;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C626540Oho;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737030Svd;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.aime.AIMEDetailAwemeListFragment;
import com.ss.android.ugc.aweme.aime.AIMEDetailViewModel;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailModel;
import com.ss.android.ugc.aweme.aime.model.AIMEStructModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageScrollAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEDetailListAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public AIMEDetailAwemeListFragment LLJJIII;
    public AIMEDetailModel LLJJIJI;
    public final HashSet<String> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIMEDetailListAssem.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/aime/AIMEDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AIMEDetailListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIMEDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 57), AFwS240S0000000_9.get$arr$(53), null, true);
        this.LLJJIJIIJIL = new HashSet<>();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.ms4);
        Zo(frameLayout);
        super.xo();
    }

    @C14EU
    public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
        Fragment fragmentLJI;
        PageScrollAbility pageScrollAbility;
        Object obj = c737030Svd.LIZIZ;
        if ((obj instanceof Aweme) && obj != null && c737030Svd.LIZ == 21 && Intrinsics.LJFF(c737030Svd.LJ, "aime_detial") && (fragmentLJI = C724240Sb0.LJI(this)) != null && (pageScrollAbility = (PageScrollAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PageScrollAbility.class, null)) != null) {
            pageScrollAbility.QW0(5000);
        }
    }

    @C14EU
    public final void onThisAIMEDetailModEvent(C626540Oho c626540Oho) {
        String styleId;
        String rootStyleId;
        AIMEStructModel aimeInfo;
        AIMEStructModel aimeInfo2;
        if (this.LLJJIJI == null) {
            return;
        }
        Aweme aweme = c626540Oho.LIZ;
        if (this.LLJJIJIIJIL.contains(aweme.getAid())) {
            return;
        }
        this.LLJJIJIIJIL.add(aweme.getAid());
        AIMEDetailModel aIMEDetailModel = this.LLJJIJI;
        String str = "";
        if (aIMEDetailModel == null || (aimeInfo2 = aIMEDetailModel.getAimeInfo()) == null || (styleId = aimeInfo2.getStyleId()) == null) {
            styleId = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "style_page");
        AIMEDetailModel aIMEDetailModel2 = this.LLJJIJI;
        if (aIMEDetailModel2 == null || (aimeInfo = aIMEDetailModel2.getAimeInfo()) == null || (rootStyleId = aimeInfo.getRootStyleId()) == null) {
            rootStyleId = "";
        }
        c2344009Gk.LJIIIIZZ("root_style_id", rootStyleId);
        c2344009Gk.LJIIIIZZ("style_id", styleId);
        String groupId = aweme.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        c2344009Gk.LJIIIIZZ("prop_list", styleId);
        if (aweme.getDetailPageVideoTag() == VideoTag.OFFICIAL) {
            str = "official";
        }
        c2344009Gk.LJIIIIZZ("pin_label", str);
        C20684815ws.LJIILLIIL("show_video", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        if (getContext() == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Oj8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C615700OCy) obj).LL;
            }
        }, null, null, null, new AwS588S0100000_9(this, 60), 14, null);
    }
}
