package com.ss.android.ugc.aweme.story.feed.immersive.dislike;

import X.C01GW;
import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C706480RnS;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS115S0200000_11;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.follow.StoryImmersiveBottomBarVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ImmersiveStoryUndoAssem extends BaseCellSlotComponent<ImmersiveStoryUndoAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 806));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 803));
    public final InterfaceC1731706qJ LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ImmersiveStoryUndoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/follow/StoryImmersiveBottomBarVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ImmersiveStoryUndoAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryImmersiveBottomBarVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 805), null, AFwS243S0000000_11.get$arr$(441));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.feg;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 804);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_video_dislike_undo_toast", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View contentView = getContentView();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
        contentView.setBackground(c384050F3z.LIZ(getContentView().getContext()));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String string;
        String nickname;
        User author;
        VideoItemParams videoItemParams2 = videoItemParams;
        Context context = getContext();
        if (context != null && (string = context.getString(2131836982)) != null) {
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme == null || (author = aweme.getAuthor()) == null || (nickname = author.getNickname()) == null) {
                nickname = "";
            }
            ((TextView) this.LLJLLIL.getValue()).setText(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{nickname}, 1)));
            C786410Ut5.h9((TuxTextView) this.LLJLLL.getValue(), new ACListenerS115S0200000_11(this, videoItemParams2, 24));
        }
    }
}
