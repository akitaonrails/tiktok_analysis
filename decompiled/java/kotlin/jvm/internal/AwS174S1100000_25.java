package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C0BW6;
import X.C0LAB;
import X.C0PEM;
import X.C0TU3;
import X.C0TU5;
import X.C1324750kZt;
import X.C1429680nJ8;
import X.C1444810nhX;
import X.C1629320sV8;
import X.C1654040t90;
import X.C1660760tJq;
import X.C1662270tMH;
import X.C1667820tVE;
import X.C1667850tVH;
import X.C1669720tYI;
import X.C1675370thP;
import X.C190N;
import X.C1DRG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC1662290tMJ;
import X.ViewOnClickListenerC1636720sh4;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.passwordless.leaked.HasPasskeyPageViewModel;
import com.ss.android.ugc.aweme.shortvideo.filter.k;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.recorder.exit.p;
import com.ss.android.ugc.gamora.recorder.sticker.voicechange.SVCStickerHandler;
import com.ss.android.ugc.trill.feedback.api.FaqSubCategoryItem;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS174S1100000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS174S1100000_25 awS174S1100000_25) {
        C0TU5 c0tu5 = C0TU5.LIZ;
        String str = ((FaqSubCategoryItem) awS174S1100000_25.l1).faqId;
        if (str == null) {
            str = "null";
        }
        String str2 = awS174S1100000_25.s0;
        c0tu5.getClass();
        C20684815ws.LJFF().submit(new C0TU3(str, "faq_item", str2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS174S1100000_25 awS174S1100000_25) {
        C0TU5 c0tu5 = C0TU5.LIZ;
        String str = ((FaqSubCategoryItem) awS174S1100000_25.l1).faqId;
        if (str == null) {
            str = "null";
        }
        String str2 = awS174S1100000_25.s0;
        c0tu5.getClass();
        C20684815ws.LJFF().submit(new C0TU3(str, "faq_topic_category", str2));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS174S1100000_25 awS174S1100000_25) {
        ((p) awS174S1100000_25.l1).PY1(awS174S1100000_25.s0);
        ((p) awS174S1100000_25.l1).Q3().closeRecording();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS174S1100000_25 awS174S1100000_25) {
        ((p) awS174S1100000_25.l1).PY1(awS174S1100000_25.s0);
        ((p) awS174S1100000_25.l1).Q3().LJII();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS174S1100000_25 awS174S1100000_25) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((p) awS174S1100000_25.l1).LLJIJIL.getCreationId());
        c0lab.LJ("shoot_way", ((p) awS174S1100000_25.l1).LLJIJIL.shootWay);
        int i = ((p) awS174S1100000_25.l1).LLJIJIL.draftId;
        if (i != 0) {
            c0lab.LIZ(i, "draft_id");
        }
        if (((p) awS174S1100000_25.l1).LLJIJIL.newDraftId.length() > 0) {
            c0lab.LJ("new_draft_id", ((p) awS174S1100000_25.l1).LLJIJIL.newDraftId);
        }
        C20684815ws.LJIILLIIL("reshoot", c0lab.LIZ);
        ((p) awS174S1100000_25.l1).PY1(awS174S1100000_25.s0);
        ((p) awS174S1100000_25.l1).Q3().closeRecording();
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS174S1100000_25 awS174S1100000_25) {
        ((p) awS174S1100000_25.l1).PY1(awS174S1100000_25.s0);
        ((p) awS174S1100000_25.l1).Q3().LJII();
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS174S1100000_25 awS174S1100000_25) {
        if (((p) awS174S1100000_25.l1).LLJIJIL.LJJJJL()) {
            ((p) awS174S1100000_25.l1).t5();
        } else {
            p pVar = (p) awS174S1100000_25.l1;
            if (pVar.LLJIJIL.isDuetMode) {
                pVar.F4();
            } else {
                C190N c190n = C190N.LIZIZ;
                if (c190n.LIZIZ() >= 3) {
                    c190n.LIZ();
                }
                ((p) awS174S1100000_25.l1).PY1(awS174S1100000_25.s0);
                ((p) awS174S1100000_25.l1).Q3().closeRecording();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS174S1100000_25 awS174S1100000_25) {
        ((p) awS174S1100000_25.l1).yp0(awS174S1100000_25.s0, System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS174S1100000_25 awS174S1100000_25) {
        ((p) awS174S1100000_25.l1).yp0(awS174S1100000_25.s0, System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS174S1100000_25 awS174S1100000_25) {
        SVCStickerHandler sVCStickerHandler = (SVCStickerHandler) awS174S1100000_25.l1;
        sVCStickerHandler.LLILZIL = true;
        sVCStickerHandler.LLILZ.invoke(awS174S1100000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS174S1100000_25 awS174S1100000_25) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1675370thP) awS174S1100000_25.l1).LIZ, awS174S1100000_25.s0));
    }

    public static final Object invoke$19(AwS174S1100000_25 awS174S1100000_25) {
        C1324750kZt.LJIIIZ(((ViewOnClickListenerC1636720sh4) awS174S1100000_25.l1).LLJIJIL, awS174S1100000_25.s0, -1, -1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS174S1100000_25 awS174S1100000_25) {
        HasPasskeyPageViewModel hasPasskeyPageViewModel = (HasPasskeyPageViewModel) awS174S1100000_25.l1;
        String str = awS174S1100000_25.s0;
        hasPasskeyPageViewModel.getClass();
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String str2 = hasPasskeyPageViewModel.LLILLL;
        c1669720tYI.getClass();
        C1669720tYI.LJ(str2, "remove_password");
        hasPasskeyPageViewModel.LL.setValue(C1667850tVH.LIZ);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(hasPasskeyPageViewModel), C0PEM.LIZJ, null, new C1667820tVE(hasPasskeyPageViewModel, str, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS174S1100000_25 awS174S1100000_25) {
        ((C1660760tJq) awS174S1100000_25.l1).LLJILLL = awS174S1100000_25.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS174S1100000_25 awS174S1100000_25) {
        ((Function1) awS174S1100000_25.l1).invoke(awS174S1100000_25.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS174S1100000_25 r6) {
        /*
            java.lang.String r0 = r6.s0
            r5 = 0
            if (r0 == 0) goto L6c
            X.0o0Q r1 = X.C1456510o0P.LIZ(r0)
            X.0sub r0 = new X.0sub
            r0.<init>()
            X.0nuv r3 = new X.0nuv
            r3.<init>(r1, r0)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.shortvideo.filter.k r0 = (com.ss.android.ugc.aweme.shortvideo.filter.k) r0
            androidx.lifecycle.MutableLiveData<java.util.List<X.0ssb>> r0 = r0.LLJJL
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L45
            java.util.Iterator r4 = r0.iterator()
        L25:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.0ssb r0 = (X.C1643870ssb) r0
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "build_in"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L25
            r5 = r2
        L3d:
            X.0ssb r5 = (X.C1643870ssb) r5
            if (r5 == 0) goto L45
            X.0nuC r1 = r5.LIZJ
            if (r1 != 0) goto L5f
        L45:
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.shortvideo.filter.k r1 = (com.ss.android.ugc.aweme.shortvideo.filter.k) r1
            X.0suS r0 = r1.LLILLL
            X.0E2q r2 = r0.LIZIZ
            X.0t2r r0 = r1.getCameraApiComponent()
            X.0sva r1 = r0.getEffectController()
            X.0suW r0 = new X.0suW
            r0.<init>(r1)
            X.0nuv r1 = new X.0nuv
            r1.<init>(r2, r0)
        L5f:
            X.0sse r5 = new X.0sse
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.shortvideo.filter.k r0 = (com.ss.android.ugc.aweme.shortvideo.filter.k) r0
            X.0suS r0 = r0.LLILLL
            X.0sua r0 = r0.LIZJ
            r5.<init>(r3, r1, r0)
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS174S1100000_25.invoke$5(kotlin.jvm.internal.AwS174S1100000_25):java.lang.Object");
    }

    public static final Object invoke$6(AwS174S1100000_25 awS174S1100000_25) {
        ((C1654040t90) awS174S1100000_25.l1).LLJLL.remove(awS174S1100000_25.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS174S1100000_25 awS174S1100000_25) {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25((C1DRG) awS174S1100000_25.l1, 413));
        return new C1629320sV8(awS174S1100000_25.s0, false, C0BW6.LIZ(), null, null, false, false, false, false, false, null, new AwS569S0100000_25(c01gwLIZIZ, 411), new AwS569S0100000_25(c01gwLIZIZ, 412), 4194284);
    }

    public static final Object invoke$8(AwS174S1100000_25 awS174S1100000_25) {
        String strLJFF;
        if (((C1662270tMH) awS174S1100000_25.l1).o2(awS174S1100000_25.s0)) {
            String strLIZJ = C1429680nJ8.LIZJ(((C1662270tMH) awS174S1100000_25.l1).getShortVideoContext().creativeModel.musicBuzModel);
            String strLIZIZ = C1444810nhX.LIZIZ(((C1662270tMH) awS174S1100000_25.l1).getShortVideoContext().creativeModel.musicBuzModel, awS174S1100000_25.s0);
            InterfaceC1662290tMJ interfaceC1662290tMJZ1 = ((C1662270tMH) awS174S1100000_25.l1).Z1();
            if (interfaceC1662290tMJZ1 != null && (strLJFF = interfaceC1662290tMJZ1.LJFF(awS174S1100000_25.s0, strLIZJ, strLIZIZ)) != null) {
                ((C1662270tMH) awS174S1100000_25.l1).getShortVideoContext().creativeModel.musicBuzModel.musicPath = strLJFF;
                ((C1662270tMH) awS174S1100000_25.l1).getShortVideoContext().cameraComponentModel.mWorkspace.MC(strLJFF);
                ((C1662270tMH) awS174S1100000_25.l1).getShortVideoContext().cameraComponentModel.mMusicPath = strLJFF;
                C1662270tMH c1662270tMH = (C1662270tMH) awS174S1100000_25.l1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFinished : replaceMusicPath : ");
                sbLIZ.append(strLJFF);
                c1662270tMH.w2(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS174S1100000_25 awS174S1100000_25) {
        ((p) awS174S1100000_25.l1).yp0(awS174S1100000_25.s0, System.currentTimeMillis());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(C1DRG c1drg, int i) {
        super(0);
        this.$t = i;
        this.s0 = "default";
        this.l1 = c1drg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(ViewOnClickListenerC1636720sh4 viewOnClickListenerC1636720sh4, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = viewOnClickListenerC1636720sh4;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(C1654040t90 c1654040t90, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1654040t90;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(C1660760tJq c1660760tJq, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1660760tJq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(C1662270tMH c1662270tMH, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1662270tMH;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(C1675370thP c1675370thP, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1675370thP;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(HasPasskeyPageViewModel hasPasskeyPageViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = hasPasskeyPageViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(p pVar, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = pVar;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(SVCStickerHandler sVCStickerHandler, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = sVCStickerHandler;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(FaqSubCategoryItem faqSubCategoryItem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = faqSubCategoryItem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(String str, k kVar, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S1100000_25(String str, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l1 = function1;
        this.s0 = str;
    }
}
