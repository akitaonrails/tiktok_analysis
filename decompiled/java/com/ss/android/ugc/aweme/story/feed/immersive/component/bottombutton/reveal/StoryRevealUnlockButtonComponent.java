package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.reveal;

import X.C1399270mW5;
import X.C1558520qew;
import X.C1602160rnK;
import X.C384050F3z;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C729510SjV;
import X.C729980SkG;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import Y.ARunnableS111S0100000_11;
import android.os.Build;
import android.view.View;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.reveal.StoryRevealPhotoAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS83S0100000_11;
import irm.AkS88S0100000_19;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealUnlockButtonComponent extends BaseCellSlotComponent<StoryRevealUnlockButtonComponent> implements StoryRevealUnlockButtonAbility {
    public TuxTextView LLJLLIL;
    public C1399270mW5 LLJLLL;
    public boolean LLJZ;
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 740));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 742));
    public Function1<? super Boolean, Boolean> LLLF = AFwS243S0000000_11.get$arr$(395);
    public boolean LLLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fe0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 741);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_reveal_unlock_button", true, awS555S0100000_11);
    }

    public final void Ep() {
        C1399270mW5 c1399270mW5 = this.LLJLLL;
        if (c1399270mW5 != null) {
            c1399270mW5.setText(this.LLJZ ? 2131849068 : 2131849069);
            c1399270mW5.setButtonStartIcon(Integer.valueOf(!this.LLJZ ? R.raw.icon_eye_slash_fill : R.raw.icon_eye_fill));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.reveal.StoryRevealUnlockButtonAbility
    public final void NY0() {
        LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS111S0100000_11(this, 52));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZIJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryRevealUnlockButtonAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.reveal.StoryRevealUnlockButtonAbility
    public final void hide() {
        C786410Ut5.LJLLLLLL(8, getContentView());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZIJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryRevealUnlockButtonAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.reveal.StoryRevealUnlockButtonAbility
    public final void iD(boolean z) {
        if (this.LLJZ == z) {
            return;
        }
        this.LLJZ = z;
        Ep();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.tfm);
        C1399270mW5 c1399270mW5 = (C1399270mW5) view.findViewById(R.id.d6g);
        this.LLJLLL = c1399270mW5;
        if (c1399270mW5 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.af9);
            c384050F3z.LIZJ = Float.valueOf(200.0f);
            c1399270mW5.setBackground(c384050F3z.LIZ(c1399270mW5.getContext()));
            c1399270mW5.setIconTintColorRes(R.attr.av0);
            c1399270mW5.setTextColorRes(R.attr.av0);
        }
        TuxTextView tuxTextView = this.LLJLLIL;
        if (tuxTextView != null && Build.VERSION.SDK_INT >= 33) {
            tuxTextView.setLineBreakWordStyle(1);
            tuxTextView.setBreakStrategy(1);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        boolean zZH1;
        StoryRevealPhotoAbility storyRevealPhotoAbility;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (C729510SjV.LJIJI(videoItemParams2.getAweme())) {
            if (C729980SkG.LJIIIIZZ(videoItemParams2.getAweme())) {
                InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZIJLIL.getValue();
                if (interfaceC665370Q7z != null && (storyRevealPhotoAbility = (StoryRevealPhotoAbility) C1558520qew.LIZ(interfaceC665370Q7z, StoryRevealPhotoAbility.class, null)) != null) {
                    zZH1 = storyRevealPhotoAbility.ZH1();
                } else {
                    zZH1 = this.LLJZ;
                }
                this.LLJZ = zZH1;
                TuxTextView tuxTextView = this.LLJLLIL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                C1399270mW5 c1399270mW5 = this.LLJLLL;
                if (c1399270mW5 != null) {
                    int visibility = c1399270mW5.getVisibility();
                    c1399270mW5.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c1399270mW5);
                    Ep();
                    C786410Ut5.I7(new AkS83S0100000_11(this, 7), c1399270mW5);
                }
                C786410Ut5.LJLLLLLL(0, getContentView());
                return;
            }
            if (!C729510SjV.LJIJJ(videoItemParams2.getAweme())) {
                this.LLLFF = false;
                TuxTextView tuxTextView2 = this.LLJLLIL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
                TuxTextView tuxTextView3 = this.LLJLLIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(2131849104);
                }
                C1399270mW5 c1399270mW52 = this.LLJLLL;
                if (c1399270mW52 != null) {
                    int visibility2 = c1399270mW52.getVisibility();
                    c1399270mW52.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c1399270mW52);
                    c1399270mW52.setText(2131849101);
                    c1399270mW52.setButtonStartIcon(Integer.valueOf(R.raw.icon_camera_fill));
                    C786410Ut5.I7(new AkS88S0100000_19(this, 8), c1399270mW52);
                }
                C786410Ut5.LJLLLLLL(0, getContentView());
                return;
            }
        }
        TuxTextView tuxTextView4 = this.LLJLLIL;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
        }
        C1399270mW5 c1399270mW53 = this.LLJLLL;
        if (c1399270mW53 == null) {
            return;
        }
        int visibility3 = c1399270mW53.getVisibility();
        c1399270mW53.setVisibility(8);
        C1602160rnK.LIZIZ(visibility3, 8, c1399270mW53);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.reveal.StoryRevealUnlockButtonAbility
    public final void sJ2(AwS590S0100000_11 awS590S0100000_11) {
        this.LLLF = awS590S0100000_11;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
