package com.ss.android.ugc.aweme.music.v2.assem;

import X.AbstractC21615419ia;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0P4E;
import X.C118300cf;
import X.C12848051a;
import X.C13LE;
import X.C1400510mY5;
import X.C1400530mY7;
import X.C1400560mYA;
import X.C1481605r4;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20684815ws;
import X.C21616519il;
import X.C2217381BqS;
import X.C2219091BtD;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS54S0300000_21;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.services.StudioMusicExService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicShareToEditAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public View LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C1400530mY7 LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicShareToEditAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MusicShareToEditAssem.class, "musicCollectVM", "getMusicCollectVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicCollectViewModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MusicShareToEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1281), AFwS259S0000000_21.get$arr$(202), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicCollectViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1282), AFwS240S0000000_9.get$arr$(543), null, true);
        this.LLJJIJIIJIL = new C1400530mY7();
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1279));
        this.LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1280));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dqi;
    }

    public final MusicDetailViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    public static final void sp(MusicShareToEditAssem musicShareToEditAssem) {
        Music music;
        ShootAbility shootAbility;
        MusicDetail musicDetailLIZ = musicShareToEditAssem.op().getState().LL.LIZ();
        if (musicDetailLIZ != null) {
            music = musicDetailLIZ.music;
        } else {
            music = null;
        }
        musicShareToEditAssem.LLJJIJIIJIL.LIZ(music, "button");
        Fragment fragmentLJI = C724240Sb0.LJI(musicShareToEditAssem);
        if (fragmentLJI != null && (shootAbility = (ShootAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ShootAbility.class, null)) != null) {
            shootAbility.te0();
        }
    }

    public final void mp(int i) {
        Boolean boolValueOf;
        Music music;
        CollectSuccessDialogAbility collectSuccessDialogAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Long lValueOf = null;
        if (fragmentLJI != null && (collectSuccessDialogAbility = (CollectSuccessDialogAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), CollectSuccessDialogAbility.class, null)) != null) {
            boolValueOf = Boolean.valueOf(collectSuccessDialogAbility.ul1());
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return;
        }
        int i2 = 1;
        if (i == 1) {
            MusicDetail musicDetailLIZ = op().getState().LL.LIZ();
            if (musicDetailLIZ != null) {
                music = musicDetailLIZ.music;
            } else {
                music = null;
            }
            C1400530mY7 c1400530mY7 = this.LLJJIJIIJIL;
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 719);
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(this, 720);
            c1400530mY7.getClass();
            if (C1400560mYA.LIZ().enable && !c1400530mY7.LIZ) {
                c1400530mY7.LIZ = true;
                if (C1400560mYA.LIZ().disableThreshold >= 0) {
                    C12848051a.LIZIZ(c1400530mY7.LJI, Integer.valueOf(c1400530mY7.LJI.getInt("dont_click_to_story", 0) + 1), "dont_click_to_story");
                }
                if (c1400530mY7.LIZJ()) {
                    c1400530mY7.LJIIIIZZ = true;
                    c1400530mY7.LJII.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "single_song");
                    if (music != null) {
                        lValueOf = Long.valueOf(music.getId());
                    }
                    c2344009Gk.LJ(lValueOf, "music_id");
                    c2344009Gk.LJIIIIZZ("type", "show");
                    if (music == null || !music.isPgc()) {
                        i2 = 0;
                    }
                    c2344009Gk.LIZJ(i2, "is_pgc");
                    C20684815ws.LJIILLIIL("add_to_story_music_pop", c2344009Gk.LIZ);
                    if (!C1400530mY7.LJ()) {
                        awS565S0100000_21.invoke();
                        return;
                    } else {
                        awS565S0100000_212.invoke();
                        return;
                    }
                }
                return;
            }
            return;
        }
        C1400530mY7 c1400530mY72 = this.LLJJIJIIJIL;
        AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21(this, 721);
        AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(this, 722);
        if (!c1400530mY72.LIZIZ() || !c1400530mY72.LIZ || c1400530mY72.LIZIZ) {
            return;
        }
        c1400530mY72.LIZIZ = true;
        c1400530mY72.LIZLLL = awS565S0100000_213;
        c1400530mY72.LJ = awS565S0100000_214;
        if (c1400530mY72.LIZJ == 0) {
            c1400530mY72.LJFF = true;
        } else if (System.currentTimeMillis() - c1400530mY72.LIZJ >= C1400560mYA.LIZ().duration) {
            c1400530mY72.LJFF(awS565S0100000_213, awS565S0100000_214);
        } else {
            C1481605r4.LIZ(C1400560mYA.LIZ().duration - (System.currentTimeMillis() - c1400530mY72.LIZJ), new ARunnableS54S0300000_21(awS565S0100000_213, c1400530mY72, awS565S0100000_214, 11));
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (!StudioMusicExService.INSTANCE.enableMusicShareToEditAssem()) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.v1y);
        this.LLJJI = viewFindViewById;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        C786410Ut5.I7(new C0P4E(this, 0), viewFindViewById);
        AssemViewModel.asyncSubscribe$default(op(), new C2217381BqS() { // from class: X.0Oxp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS387S0200000_21(view, this, 32), 14, null);
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Olq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OG4) obj).LLILLL;
            }
        }, C736820SvI.LIZJ(), new AwS635S0100000_21(this, 81), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0Olp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OG4) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 82), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIL.getValue(), new C2217381BqS() { // from class: X.0mY8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LLILZLL;
            }
        }, null, new AwS456S0200000_21(new C118300cf(), this, 8), 6);
    }

    public final void lp(View view, View view2, TuxTextView tuxTextView) {
        String string;
        int marginStart;
        if (view != null) {
            Resources resources = C2219091BtD.LIZ().getResources();
            String str = "";
            if (resources == null || (string = resources.getString(2131857974)) == null) {
                string = "";
            }
            String string2 = C2219091BtD.LIZ().getString(2131848635);
            if (string2 != null) {
                str = string2;
            }
            int width = ((view.getWidth() - view2.getWidth()) - view.getPaddingStart()) - view.getPaddingEnd();
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            int i = width - marginStart;
            float fMeasureText = tuxTextView.getPaint().measureText(str);
            float fMeasureText2 = tuxTextView.getPaint().measureText(string);
            float fMax = Math.max(fMeasureText, fMeasureText2);
            if (fMeasureText > fMeasureText2) {
                string = str;
            }
            int i2 = 15;
            if (fMax > i && string.length() > 0) {
                while (fMax > i && i2 > 11) {
                    i2--;
                    i++;
                    Integer num = MusicDetailViewModel.LLJJLIIIJLLLLLLLZ.get(Integer.valueOf(i2));
                    if (num != null) {
                        tuxTextView.setTuxFont(num.intValue());
                    }
                    fMax = tuxTextView.getPaint().measureText(string);
                }
            }
            op().setState(new AwS34S0001000_21(i2, 10));
            ShootContainerProviderAbility shootContainerProviderAbility = (ShootContainerProviderAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ShootContainerProviderAbility.class, null);
            if (shootContainerProviderAbility != null) {
                shootContainerProviderAbility.To1(i2);
            }
            Integer num2 = MusicDetailViewModel.LLJJLIIIJLLLLLLLZ.get(Integer.valueOf(i2));
            if (num2 != null) {
                tuxTextView.setTuxFont(num2.intValue());
            }
            if (!C1400510mY5.LIZ()) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                int i3 = i2 + 3;
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
                C786410Ut5.W5(view2, layoutParams2);
            }
        }
    }

    public static C21616519il tp(View view, AbstractC21615419ia abstractC21615419ia, float f, float f2, float f3) {
        C21616519il c21616519il = new C21616519il(view, abstractC21615419ia, f);
        c21616519il.LJJ.LIZIZ(f2);
        c21616519il.LJJ.LIZ(f3);
        c21616519il.LJI(0.0f);
        c21616519il.LIZ = 0.0f;
        return c21616519il;
    }
}
