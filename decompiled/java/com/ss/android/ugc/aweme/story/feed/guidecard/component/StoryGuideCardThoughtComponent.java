package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C01GW;
import X.C12BX;
import X.C15438062q;
import X.C1558520qew;
import X.C197039127h;
import X.C20584815gk;
import X.C418440Gaw;
import X.C452501pT;
import X.C706480RnS;
import X.C712450Rx5;
import X.C713190RyH;
import X.C723830SaL;
import X.C724270Sb3;
import X.C728750SiH;
import X.C735840Sti;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1257160ios;
import X.InterfaceC665370Q7z;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardThoughtAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS83S0100000_11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardThoughtComponent extends StoryGuideCardComponent implements StoryGuideCardThoughtAbility {
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 677));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 676));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 678));

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fbg;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 675);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_guide_card_thought_content", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent
    public final void Ep() {
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 476));
    }

    public final C20584815gk Qp() {
        return (C20584815gk) this.LLLIIIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLII.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryGuideCardThoughtAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardThoughtAbility
    public final C20584815gk YL1() {
        return Qp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void handleOnResume() {
        super.handleOnResume();
        Fp().vQ2("story_card_head");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLII.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryGuideCardThoughtAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent
    /* JADX INFO: renamed from: Ip */
    public final void rr(VideoItemParams videoItemParams) {
        BackgroundModel backgroundModel;
        Fp().vQ2("story_card_head");
        C12BX c12bx = (C12BX) this.LLLIIIL.getValue();
        if (c12bx != null) {
            User author = videoItemParams.getAweme().getAuthor();
            StoryNoteInfo storyNoteInfo = videoItemParams.getAweme().storyNoteInfo;
            if (storyNoteInfo != null) {
                backgroundModel = storyNoteInfo.backGroundInfo;
            } else {
                backgroundModel = null;
            }
            c12bx.LIZIZ(author, backgroundModel, null);
        }
        C20584815gk c20584815gkQp = Qp();
        if (c20584815gkQp != null) {
            C786410Ut5.Ba(c20584815gkQp, new ACListenerS115S0200000_11(this, videoItemParams, 9));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C20584815gk c20584815gkQp = Qp();
        if (c20584815gkQp != null) {
            c20584815gkQp.setBubbleStyle(EnumC1257160ios.NORMAL);
            c20584815gkQp.setEnableDarkMode(false);
            c20584815gkQp.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(262.0f))));
        }
        C197039127h c197039127h = (C197039127h) this.LLLIIL.getValue();
        if (c197039127h != null) {
            c197039127h.LJJJJL(AFwS243S0000000_11.get$arr$(372));
        }
        View view2 = (View) this.LLLIIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AkS83S0100000_11(this, 2), view2);
        }
        C786410Ut5.I7(new AkS83S0100000_11(this, 3), getContentView());
        C20584815gk c20584815gkQp2 = Qp();
        if (c20584815gkQp2 != null) {
            C786410Ut5.I7(new AkS83S0100000_11(this, 4), c20584815gkQp2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        rr(videoItemParams);
    }

    public static final int Up(StoryGuideCardThoughtComponent storyGuideCardThoughtComponent, Aweme aweme) {
        String authorUid;
        Object obj;
        List<C712450Rx5> list;
        ArrayList arrayList = null;
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        C728750SiH c728750SiH = C728750SiH.LIZ;
        C724270Sb3 c724270Sb3 = storyGuideCardThoughtComponent.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj).getAweme();
        c728750SiH.getClass();
        C713190RyH c713190RyHLIZIZ = C728750SiH.LIZIZ(aweme2, null);
        if (c713190RyHLIZIZ != null && (list = c713190RyHLIZIZ.LIZLLL) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C712450Rx5> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LL);
            }
        }
        int i = 0;
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid((Aweme) it3.next()), authorUid)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        return i + 1;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        super.J1(i, aweme);
        Tp(aweme, true);
        Fp().vQ2("story_card_head");
    }

    public final void Tp(Aweme aweme, boolean z) {
        User author;
        String str;
        boolean zLJIILL;
        String notePromptText;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String mentionUidsString = null;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        if (z) {
            str = "note_bubble_show";
        } else {
            str = "note_bubble_click";
        }
        int iUp = Up(this, aweme);
        int iUp2 = Up(this, aweme);
        C20584815gk c20584815gkQp = Qp();
        boolean zLJIJ = false;
        if (c20584815gkQp != null) {
            zLJIILL = c20584815gkQp.LJIILL();
        } else {
            zLJIILL = false;
        }
        C20584815gk c20584815gkQp2 = Qp();
        if (c20584815gkQp2 != null) {
            notePromptText = c20584815gkQp2.getNotePromptText();
        } else {
            notePromptText = null;
        }
        C20584815gk c20584815gkQp3 = Qp();
        if (c20584815gkQp3 != null) {
            zLJIJ = c20584815gkQp3.LJIJ();
        }
        C20584815gk c20584815gkQp4 = Qp();
        if (c20584815gkQp4 != null) {
            mentionUidsString = c20584815gkQp4.getMentionUidsString();
        }
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        c735840Sti.getClass();
        C735840Sti.LJIILLIIL(author, str, "homepage_hot", "story_card_bubble", iUp, iUp2, false, false, aweme, zLJIILL, notePromptText, bool, bool2, zLJIJ, mentionUidsString, null, null);
    }
}
