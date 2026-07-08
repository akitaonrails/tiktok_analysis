package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0BB4;
import X.C0I6Y;
import X.C1220000hqw;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19M4;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C457780HxI;
import X.C462510IBt;
import X.C487370J9j;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.C898960ZOk;
import X.EnumC898940ZOi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import Y.ARunnableS114S0100000_14;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AddToFavorites;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ErrorIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ForwardOrReply;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LoadingIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NoButton;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.OpenGreetingCard;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.QuickLiveReact;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReplyToSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VoiceTranscribeIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VoiceTranscribeText;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.replytosticker.ReplyToStickerRecommendationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class SideMessageStatusReusedSkeletonUISlot extends ReusedSkeletonUISlotAssem<SideMessageStatusReusedSkeletonUISlot, MessageLeftIconState> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public final C1559260qg8 LLJLLIL;
    public final C1559260qg8 LLJLLL;
    public final C01GW LLJZ;
    public final C736950SvV LLJZIJLIL;
    public final AssemVMLazy LLL;
    public final AssemVMLazy LLLF;
    public final AssemVMLazy LLLFF;
    public final AssemVMLazy LLLFFI;
    public final AssemVMLazy LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public ARunnableS114S0100000_14 LLLIILIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SideMessageStatusReusedSkeletonUISlot.class, "sideMessageStatusViewModel", "getSideMessageStatusViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/slots/SideMessageStatusViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SideMessageStatusReusedSkeletonUISlot.class, "chatRoomCameraVM", "getChatRoomCameraVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/camera/ChatRoomCameraVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SideMessageStatusReusedSkeletonUISlot.class, "replyToStickerVM", "getReplyToStickerVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/replytosticker/ReplyToStickerRecommendationViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SideMessageStatusReusedSkeletonUISlot.class, "addStickerToFavVM", "getAddStickerToFavVM()Lcom/ss/android/ugc/aweme/im/sticker/api/viewmodel/IAddStickerToFavViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SideMessageStatusReusedSkeletonUISlot.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cs3;
    }

    public SideMessageStatusReusedSkeletonUISlot() {
        super(C462510IBt.LIZ);
        this.LLJLLIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJLLL = new C1559260qg8(new C723580SZw(this, C898900ZOe.class, null), checkSupervisorPrepared());
        this.LLJZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 884));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 883);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageReplyVM.class);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(253);
        this.LLJZIJLIL = new C736950SvV(c19719912DlLIZ, new AwS558S0100000_14(awS558S0100000_14, 878), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS248S0000000_14, new AwS558S0100000_14((AbstractC738140SxQ) this, 880), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SideMessageStatusViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 885), AFwS248S0000000_14.get$arr$(256), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatRoomCameraVM.class);
        this.LLLF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 886), AFwS248S0000000_14.get$arr$(257), null, true);
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS248S0000000_14.get$arr$(254));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ReplyToStickerRecommendationViewModel.class);
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bBLIZ, new AwS558S0100000_14(c19719912DlLIZ4, 887), AFwS248S0000000_14.get$arr$(251), null, true);
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(219);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(IAddStickerToFavViewModel.class);
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ5, 874), AFwS248S0000000_14.get$arr$(252), aFwS201S0000000_14, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLLFZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ6, 875), AFwS248S0000000_14.get$arr$(255), null, true);
        this.LLLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 879));
        this.LLLII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 881));
        this.LLLIIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 876));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 882));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 877));
        this.LLLIIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(220));
    }

    public final FrameLayout Ep() {
        return (FrameLayout) this.LLLIIIL.getValue();
    }

    public final boolean Fp() {
        C898900ZOe c898900ZOe;
        View view;
        View view2 = (View) this.LLLIIIIL.getValue();
        if (view2 == null || view2.getVisibility() != 0 || (c898900ZOe = (C898900ZOe) this.LLJLLL.getValue()) == null || (view = c898900ZOe.LL) == null) {
            return false;
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i = iArr[1];
        int i2 = iArr2[1];
        return i >= i2 && view2.getHeight() + i <= view.getHeight() + i2;
    }

    public final C457780HxI getChatHierarchyData() {
        return (C457780HxI) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public void unBind() {
        AssemVMLazy assemVMLazy = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
        ReplyToStickerRecommendationViewModel replyToStickerRecommendationViewModel = (ReplyToStickerRecommendationViewModel) assemVMLazy.getValue();
        if (Intrinsics.LJFF(replyToStickerRecommendationViewModel.LLILZLL, new C898960ZOk(this))) {
            replyToStickerRecommendationViewModel.LLILZLL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void zp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object objOp = op();
        if (Intrinsics.LJFF(objOp, ForwardOrReply.INSTANCE)) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb32 != null ? c724270Sb32.LL : null));
            C724270Sb3 c724270Sb33 = this.LLJI;
            tp(c869590Y9lLIZ, (MessageLeftIconState) op());
            return;
        }
        if (!Intrinsics.LJFF(objOp, NoButton.INSTANCE) && !Intrinsics.LJFF(objOp, ReplyToSticker.INSTANCE) && !Intrinsics.LJFF(objOp, ErrorIcon.INSTANCE) && !Intrinsics.LJFF(objOp, LoadingIcon.INSTANCE) && !Intrinsics.LJFF(objOp, QuickLiveReact.INSTANCE) && !Intrinsics.LJFF(objOp, VoiceTranscribeText.INSTANCE) && !Intrinsics.LJFF(objOp, VoiceTranscribeIcon.INSTANCE) && !Intrinsics.LJFF(objOp, OpenGreetingCard.INSTANCE) && !Intrinsics.LJFF(objOp, AddToFavorites.INSTANCE)) {
            throw new C1954807lC();
        }
    }

    public static void Ip(C19M4 c19m4) {
        c19m4.setTextColorRes(R.attr.a1j);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_turn_up_left;
        C426750GoL.LJIIL(c19m4, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        c19m4.setStartIcon(c419910GdJ);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public void Ap(View view) {
        getChatHierarchyData();
        SkeletonLayoutCellAbility skeletonLayoutCellAbility = (SkeletonLayoutCellAbility) this.LLJZ.getValue();
        if (skeletonLayoutCellAbility != null) {
            skeletonLayoutCellAbility.dM(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[PHI: r1
      0x008d: PHI (r1v41 boolean) = (r1v40 boolean), (r1v49 boolean), (r1v49 boolean), (r1v49 boolean) binds: [B:33:0x008a, B:17:0x0033, B:19:0x0037, B:21:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    /* JADX INFO: renamed from: Gp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tp(final X.C869590Y9l r11, com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState r12) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot.tp(X.0Y9l, com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState):void");
    }

    public final void Bp(FrameLayout frameLayout, EnumC898940ZOi enumC898940ZOi, boolean z) {
        int i;
        int i2;
        View viewLJJIJL = LJJIJL();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        if (!z && ((Boolean) C0BB4.LIZ.getValue()).booleanValue()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        int childCount = frameLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = frameLayout.getChildAt(i3);
            if (i3 == enumC898940ZOi.ordinal()) {
                if (childAt instanceof ViewStub) {
                    ViewStub viewStub = (ViewStub) childAt;
                    viewStub.setLayoutInflater(new C487370J9j(LJJIJL().getContext()));
                    C786410Ut5.LJLLLLLL(i2, C786410Ut5.LJLLLL(viewStub));
                } else {
                    C786410Ut5.LJLLLLLL(i2, childAt);
                }
            } else {
                C786410Ut5.LJLLLLLL(8, childAt);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void up(C869590Y9l c869590Y9l, MessageLeftIconState messageLeftIconState, boolean z) {
        tp(c869590Y9l, messageLeftIconState);
    }
}
