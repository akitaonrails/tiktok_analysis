package kotlin.jvm.internal;

import X.AbstractC19994813Le;
import X.AnonymousClass1295;
import X.AnonymousClass1298;
import X.C01GW;
import X.C09AY;
import X.C0ZFW;
import X.C1161920gLG;
import X.C11FW;
import X.C1260120ite;
import X.C128V;
import X.C12N4;
import X.C1397620mTQ;
import X.C13LP;
import X.C1528405yc;
import X.C1697810uHb;
import X.C19273110af;
import X.C19618211pE;
import X.C19622411pu;
import X.C19643111tF;
import X.C20694015yM;
import X.C894400Z6w;
import X.EnumC1230500i7s;
import X.EnumC19357210oE;
import X.InterfaceC391240FVq;
import Y.ARunnableS14S2100000_29;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.msg.PublicGroupOnboardingCardAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS143S1100000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS143S1100000_29(X.C12N4 r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            switch(r4) {
                case 14: goto L11;
                case 15: goto L1a;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "click_live_event_icon"
            r1.s0 = r0
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "show"
            r1.s0 = r0
            r0 = 1
            goto Ld
        L1a:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "settings_page"
            r1.s0 = r0
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS143S1100000_29.<init>(X.12N4, int):void");
    }

    public static final Object invoke$0(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        String inviteShortUrl = ((GroupInviteInfoModel) obj).getInviteShortUrl();
        if (inviteShortUrl != null) {
            C1260120ite.LIZIZ(new ARunnableS14S2100000_29((Context) awS143S1100000_29.l1, inviteShortUrl, awS143S1100000_29.s0, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        StickerModel stickerModel = (StickerModel) obj;
        if (stickerModel instanceof AddYoursStickerModel) {
            ((C19643111tF) awS143S1100000_29.l1).i3((AddYoursStickerModel) stickerModel, awS143S1100000_29.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131833413, new AwS143S1100000_29(awS143S1100000_29.s0, (AnonymousClass1298) awS143S1100000_29.l1, 11));
        c1397620mTQ.LJ(R.string.f1_, null);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        if (localTestApiLIZ != null) {
            localTestApiLIZ.copyContent(awS143S1100000_29.s0, ((AnonymousClass1298) awS143S1100000_29.l1).itemView.getContext());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131833413, new AwS143S1100000_29(awS143S1100000_29.s0, (AnonymousClass1295) awS143S1100000_29.l1, 13));
        c1397620mTQ.LJ(R.string.f1_, null);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
        if (localTestApiLIZ != null) {
            localTestApiLIZ.copyContent(awS143S1100000_29.s0, ((AnonymousClass1295) awS143S1100000_29.l1).itemView.getContext());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        return C20694015yM.LJJIJL(((C12N4) awS143S1100000_29.l1).LIZIZ(), false, false, null, null, awS143S1100000_29.s0, false, false, 16773119);
    }

    public static final Object invoke$15(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        return C20694015yM.LJJIJL(((C12N4) awS143S1100000_29.l1).LIZIZ(), false, false, null, awS143S1100000_29.s0, null, false, false, 16775167);
    }

    public static final Object invoke$16(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        return C20694015yM.LJJIJL(((C12N4) awS143S1100000_29.l1).LIZIZ(), false, false, awS143S1100000_29.s0, null, null, false, false, 16776703);
    }

    public static final Object invoke$2(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        ArticleStickerModel articleStickerModel;
        Object objLJJJLL = C13LP.LJJJLL(((InterfaceC391240FVq) awS143S1100000_29.l1).LLLILZLLLI(C19622411pu.LLJIJIL));
        if ((objLJJJLL instanceof ArticleStickerModel) && (articleStickerModel = (ArticleStickerModel) objLJJJLL) != null) {
            articleStickerModel.getBaseStickerModel().setStickerSource(awS143S1100000_29.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        Context context = (Context) obj;
        PublicGroupOnboardingCardAssem publicGroupOnboardingCardAssem = (PublicGroupOnboardingCardAssem) awS143S1100000_29.l1;
        String str = awS143S1100000_29.s0;
        publicGroupOnboardingCardAssem.getClass();
        if (C0ZFW.LIZ.LJIIJJI(str)) {
            C1528405yc.LIZ(((PublicGroupOnboardingCardAssem) awS143S1100000_29.l1).LLL.LIZ(), "group_onboarding_card", "invite_members", awS143S1100000_29.s0);
            C11FW c11fw = C11FW.LIZ;
            String str2 = awS143S1100000_29.s0;
            c11fw.getClass();
            C01GW c01gw = C894400Z6w.LIZ;
            C894400Z6w.LIZ(context, str2, "chat", "group_onboarding_card", EnumC1230500i7s.ADD_MEMBER_GROUP_CHATROOM);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        Context context = (Context) obj;
        PublicGroupOnboardingCardAssem publicGroupOnboardingCardAssem = (PublicGroupOnboardingCardAssem) awS143S1100000_29.l1;
        String str = awS143S1100000_29.s0;
        publicGroupOnboardingCardAssem.getClass();
        if (C0ZFW.LIZ.LJIIJJI(str)) {
            C11FW c11fw = C11FW.LIZ;
            String str2 = awS143S1100000_29.s0;
            Integer numLIZ = ((PublicGroupOnboardingCardAssem) awS143S1100000_29.l1).LLL.LIZ();
            c11fw.getClass();
            C11FW.LJ(context, EnumC19357210oE.RECORD_STICKER, str2, "group_onboarding_card_creation_guide", numLIZ, new AwS112S1200000_29(context, str2, numLIZ, 3), new AwS144S1200000_29(context, str2, numLIZ, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        Context context = (Context) obj;
        PublicGroupOnboardingCardAssem publicGroupOnboardingCardAssem = (PublicGroupOnboardingCardAssem) awS143S1100000_29.l1;
        String str = awS143S1100000_29.s0;
        publicGroupOnboardingCardAssem.getClass();
        if (C0ZFW.LIZ.LJIIJJI(str)) {
            C11FW c11fw = C11FW.LIZ;
            String str2 = awS143S1100000_29.s0;
            Integer numLIZ = ((PublicGroupOnboardingCardAssem) awS143S1100000_29.l1).LLL.LIZ();
            c11fw.getClass();
            C11FW.LJ(context, EnumC19357210oE.COPY_LINK, str2, "group_onboarding_card_comment_guide", numLIZ, new AwS112S1200000_29(context, str2, numLIZ, 1), new AwS144S1200000_29(context, str2, numLIZ, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        String str;
        SecretRepliesStickerModel secretRepliesStickerModel = (SecretRepliesStickerModel) obj;
        C19618211pE c19618211pE = (C19618211pE) awS143S1100000_29.l1;
        String str2 = awS143S1100000_29.s0;
        List listLJIIJJI = C1697810uHb.LJIIJJI(c19618211pE.getContext().getString(2131847224), c19618211pE.getContext().getString(2131847225), c19618211pE.getContext().getString(2131847226), c19618211pE.getContext().getString(2131847227), c19618211pE.getContext().getString(2131847228), c19618211pE.getContext().getString(2131847229), c19618211pE.getContext().getString(2131847230), c19618211pE.getContext().getString(2131847231), c19618211pE.getContext().getString(2131847232), c19618211pE.getContext().getString(2131847222), c19618211pE.getContext().getString(2131847223));
        do {
            str = (String) C13LP.LJLJJI(listLJIIJJI, AbstractC19994813Le.Default);
        } while (Intrinsics.LJFF(str, str2));
        return secretRepliesStickerModel.copy(secretRepliesStickerModel.baseStickerModel, true, str, secretRepliesStickerModel.editable);
    }

    public static final Object invoke$7(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        ArticleStickerModel articleStickerModel = (ArticleStickerModel) obj;
        return articleStickerModel.copy(articleStickerModel.baseStickerModel, articleStickerModel.articleLink, awS143S1100000_29.s0, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, (ArticleStickerModel.StyleModel) awS143S1100000_29.l1, articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight);
    }

    public static final Object invoke$8(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        ArticleStickerModel articleStickerModel = (ArticleStickerModel) obj;
        return articleStickerModel.copy(articleStickerModel.baseStickerModel, articleStickerModel.articleLink, awS143S1100000_29.s0, articleStickerModel.brandIconId, articleStickerModel.brandIconUrl, articleStickerModel.brandThemeColor, (ArticleStickerModel.StyleModel) awS143S1100000_29.l1, articleStickerModel.previewContainerHeightPx, articleStickerModel.realMediaWidth, articleStickerModel.realMediaHeight);
    }

    public static final Object invoke$9(AwS143S1100000_29 awS143S1100000_29, Object obj) {
        boolean z;
        IHostAction iHostAction;
        if (obj == C128V.SUB_TYPE_CTA) {
            if (((LiveCenterTopNoticeWidget) awS143S1100000_29.l1).context != null && (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) != null) {
                iHostAction.handleSchema(((LiveCenterTopNoticeWidget) awS143S1100000_29.l1).context, awS143S1100000_29.s0, new Bundle());
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(InterfaceC391240FVq interfaceC391240FVq, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC391240FVq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(C19618211pE c19618211pE, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19618211pE;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(C19643111tF c19643111tF, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19643111tF;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(LiveCenterTopNoticeWidget liveCenterTopNoticeWidget, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = liveCenterTopNoticeWidget;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(PublicGroupOnboardingCardAssem publicGroupOnboardingCardAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = publicGroupOnboardingCardAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(String str, AnonymousClass1295 anonymousClass1295, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = anonymousClass1295;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(String str, AnonymousClass1298 anonymousClass1298, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = anonymousClass1298;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S1100000_29(String str, ArticleStickerModel.StyleModel styleModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = styleModel;
    }
}
