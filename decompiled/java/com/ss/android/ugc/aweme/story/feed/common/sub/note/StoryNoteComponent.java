package com.ss.android.ugc.aweme.story.feed.common.sub.note;

import X.C019F;
import X.C01GW;
import X.C034E;
import X.C0RF0;
import X.C0RMW;
import X.C0S1K;
import X.C1256560inu;
import X.C12BX;
import X.C1389300mG0;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1888107aR;
import X.C19719912Dl;
import X.C20584815gk;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1256590inx;
import X.EnumC1257160ios;
import X.EnumC713160RyE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ACListenerS115S0200000_11;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollectionKt;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS335S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryNoteComponent extends BaseCellSlotComponent<StoryNoteComponent> implements StoryThoughtPlayerAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 616));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 617));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 614));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 621));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 613));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 620));
    public final AssemVMLazy LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryNoteComponent.class, "storyNoteConsumptionVM", "getStoryNoteConsumptionVM()Lcom/ss/android/ugc/aweme/story/feed/common/sub/note/StoryNoteConsumptionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryNoteComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryNoteConsumptionViewModel.class);
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 619), AFwS243S0000000_11.get$arr$(326), null, true);
        this.LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(327));
        this.LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 615));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcy;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 618);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_note_view", true, awS555S0100000_11);
        C20584815gk c20584815gkGp = Gp();
        c20584815gkGp.setBubbleStyle(EnumC1257160ios.NORMAL);
        c20584815gkGp.setEnableDarkMode(false);
        c20584815gkGp.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(262.0f))));
        C0RMW c0rmw = C0RMW.LIZ;
        C0RF0 c0rf0 = jm().LIZLLL;
        c20584815gkGp.setIsInImmersiveFeed(c0rmw.LJJIIJZLJL(c0rf0 != null ? c0rf0.LIZJ : null));
        Ep().LJIILJJIL(120, null);
        AvatarComponentView avatarComponentViewEp = Ep();
        new AwS603S0100000_24(this, 302).invoke(avatarComponentViewEp.getConfig().LIZ);
        avatarComponentViewEp.LJFF(avatarComponentViewEp.getConfig());
        Ep().setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ry7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        Ep().setClickable(false);
        Ep().setLongClickable(false);
        Ep().setFocusable(false);
    }

    public final AvatarComponentView Ep() {
        return (AvatarComponentView) this.LLL.getValue();
    }

    public final StoryNoteConsumptionViewModel Fp() {
        AssemVMLazy assemVMLazy = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (StoryNoteConsumptionViewModel) assemVMLazy.getValue();
    }

    public final C20584815gk Gp() {
        return (C20584815gk) this.LLJZIJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryThoughtPlayerAbility.class, null);
            if (C1389300mG0.LJIIJJI(jm().LIZIZ()) && C1888107aR.LIZ()) {
                C1558520qew.LJIIJJI(interfaceC665370Q7z, IPhotoSlidesAbility.class, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.note.StoryThoughtPlayerAbility
    public final long getDuration() {
        return C034E.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryThoughtPlayerAbility.class, null, null);
            if (C1389300mG0.LJIIJJI(jm().LIZIZ()) && C1888107aR.LIZ()) {
                C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) this.LLJLLIL.getValue(), IPhotoSlidesAbility.class, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0Ry5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C713080Ry6) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(107), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0Ry4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(108), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        String uid;
        String uid2;
        VideoItemParams videoItemParams2 = videoItemParams;
        User author = videoItemParams2.getAweme().getAuthor();
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        BackgroundModel backgroundModel = null;
        if (currentUser != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (author != null) {
            uid2 = author.getUid();
        } else {
            uid2 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(uid, uid2);
        if (!zLJFF) {
            currentUser = author;
        }
        StoryNoteDataCollection storyNoteDataCollection = StoryNoteDataCollectionKt.toStoryNoteDataCollection(videoItemParams2.getAweme());
        C20584815gk c20584815gkGp = Gp();
        C1256560inu c1256560inu = C1256560inu.LIZ;
        EnumC1256590inx enumC1256590inx = EnumC1256590inx.IMMERSIVE_FEED;
        c1256560inu.getClass();
        c20584815gkGp.setEnableStarSticker(C1256560inu.LJFF(storyNoteDataCollection, enumC1256590inx, zLJFF, false));
        Gp().setMentionText(storyNoteDataCollection.textExtras);
        Gp().setThoughtData(storyNoteDataCollection);
        Gp().setEnterFrom((String) this.LLLFZ.getValue());
        C12BX c12bx = (C12BX) this.LLLF.getValue();
        StoryNoteInfo storyNoteInfo = videoItemParams2.getAweme().storyNoteInfo;
        if (storyNoteInfo != null) {
            backgroundModel = storyNoteInfo.backGroundInfo;
        }
        c12bx.LIZIZ(currentUser, backgroundModel, AFwS198S0000000_11.get$arr$(319));
        Fragment fragment = null;
        C1256560inu.LIZ(c1256560inu, Ep(), Gp(), this, zLJFF, null, storyNoteDataCollection, false, currentUser, enumC1256590inx, null, null, AFwS335S0000000_11.get$arr$(3), 6568);
        if (!zLJFF && C0S1K.LIZIZ.LIZ(videoItemParams2.getAweme(), EnumC713160RyE.DETAIL, null)) {
            C0RMW c0rmw = C0RMW.LIZ;
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null) {
                fragment = c0rf0.LIZJ;
            }
            if (c0rmw.LJJIIJZLJL(fragment)) {
                Fp().setState(AFwS243S0000000_11.get$arr$(604));
                C786410Ut5.Ba(Gp(), new ACListenerS115S0200000_11(this, videoItemParams2, 16));
                C786410Ut5.y9(Ep(), new ACListenerS115S0200000_11(this, videoItemParams2, 17));
            }
        }
    }
}
