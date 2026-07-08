package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C109100bB;
import X.C1210004oM;
import X.C13DA;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C343710Ddh;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C838410Wul;
import X.C960203pA;
import X.InterfaceC1586360rNq;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS124S0200000_21;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3InputFloatAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3InputFloatAssem extends UISlotAssem implements FriendsV3InputPanelAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public TuxTextView LLJJIII;
    public View LLJJIJI;
    public final C630740Ooa LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3InputFloatAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3InputFloatAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 491), AFwS259S0000000_21.get$arr$(161), null, true);
        this.LLJJIJIIJIL = C628500Oky.LIZ(new AwS565S0100000_21(this, 590));
        this.LLJJJ = true;
        this.LLJJJIL = 13;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cav;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility
    public final void Ph2() {
        if (this.LLJJIJIL || this.LLJJJIL != 15) {
            return;
        }
        this.LLJJIJIL = true;
        MainPageSeekAbility mainPageSeekAbility = (MainPageSeekAbility) this.LLJJIJIIJIL.getValue();
        if (mainPageSeekAbility != null) {
            mainPageSeekAbility.fS0(false);
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewLJJIJL);
        viewLJJIJL.animate().translationY(0.0f).setDuration(250L).setListener(null).start();
        if (this.LLJJJ) {
            this.LLJJJ = false;
            C109100bB c109100bB = C109100bB.LIZ;
            C13DA c13da = new C13DA();
            c13da.put("enter_from", "homepage_friends");
            Map mapBuild = c13da.build();
            c109100bB.getClass();
            C109100bB.LIZ("ttsocial_friend_tab_float_publish_cell_show", mapBuild);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility
    public final void bB0() {
        if (!this.LLJJIJIL || this.LLJJJIL == 15) {
            return;
        }
        this.LLJJIJIL = false;
        MainPageSeekAbility mainPageSeekAbility = (MainPageSeekAbility) this.LLJJIJIIJIL.getValue();
        if (mainPageSeekAbility != null) {
            mainPageSeekAbility.fS0(true);
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL == null) {
            return;
        }
        viewLJJIJL.animate().translationY(viewLJJIJL.getHeight()).setDuration(250L).withEndAction(new ARunnableS112S0100000_12(viewLJJIJL, 190)).start();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIII = null;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3InputPanelAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility
    public final void CE1(boolean z) {
        hp(4, z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility
    public final void eb0(boolean z) {
        hp(8, z);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numValueOf;
        TuxTextView tuxTextView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onViewCreated(view);
        this.LLJJIJI = view.findViewById(R.id.krr);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.zhz);
        view.findViewById(R.id.lql);
        C786410Ut5.LJLLLLLL(4, LJJIJL());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            numValueOf = Integer.valueOf(ColorProtector.parseColor("#303030"));
        } else {
            numValueOf = Integer.valueOf(ColorProtector.parseColor("#E0E0E0"));
        }
        c384050F3z.LJ = numValueOf;
        Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = 50.0f;
        c19659111vp.LJ = Integer.valueOf(R.attr.oy);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(999);
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(view.getContext()));
        View contentView = getContentView();
        if ((contentView instanceof ViewGroup) && (viewGroup2 = (ViewGroup) contentView) != null) {
            getContentView().setBackground(layerDrawableLJIILIIL);
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        Context context2 = getContext();
        if (context2 != null && (tuxTextView = this.LLJJIII) != null) {
            String strLIZLLL = (String) C1210004oM.LIZ.getValue();
            if (strLIZLLL.length() == 0) {
                strLIZLLL = C838410Wul.LIZLLL(2131850119, context2);
            }
            tuxTextView.setText(strLIZLLL);
        }
        C786410Ut5.I7(new ACListenerS124S0200000_21(this, view, 18), view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3InputPanelAbility.class, null, null);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C343710Ddh.LIZ(c19egLIZ).wQ2(new InterfaceC1586360rNq() { // from class: X.0mPe
                @Override // X.InterfaceC1586360rNq
                public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
                    if (Intrinsics.LJFF(str, "FRIENDS_TAB")) {
                        FriendsV3InputFloatAssem friendsV3InputFloatAssem = this.LL;
                        friendsV3InputFloatAssem.LLJJJIL |= 2;
                        AssemVMLazy assemVMLazy = friendsV3InputFloatAssem.LLJJI;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FriendsV3InputFloatAssem.LLJJJJ;
                        friendsV3InputFloatAssem.withState(assemVMLazy.getValue(), new AwS600S0100000_21(this.LL, 126));
                        return;
                    }
                    FriendsV3InputFloatAssem friendsV3InputFloatAssem2 = this.LL;
                    friendsV3InputFloatAssem2.LLJJJ = true;
                    friendsV3InputFloatAssem2.LLJJJIL &= -3;
                    friendsV3InputFloatAssem2.bB0();
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0mPf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223430hwT) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 63), 4);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility
    public final void vw0(boolean z) {
        hp(1, z);
    }

    public final void hp(int i, boolean z) {
        if (z) {
            this.LLJJJIL = (~i) & this.LLJJJIL;
            bB0();
        } else {
            this.LLJJJIL = i | this.LLJJJIL;
            Ph2();
        }
    }
}
