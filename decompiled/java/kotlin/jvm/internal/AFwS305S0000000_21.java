package kotlin.jvm.internal;

import X.AbstractC1384320m7y;
import X.AbstractC738140SxQ;
import X.C013C;
import X.C01UH;
import X.C09AY;
import X.C0CAU;
import X.C0N0Y;
import X.C0PEM;
import X.C0R9E;
import X.C0RHH;
import X.C0RQD;
import X.C0SXF;
import X.C0T6L;
import X.C1308910kAL;
import X.C1344030l4z;
import X.C1349270lDR;
import X.C1351190lGX;
import X.C1351250lGd;
import X.C1351290lGh;
import X.C1351950lHl;
import X.C1353500lKG;
import X.C1356720lPS;
import X.C1356800lPa;
import X.C1357800lRC;
import X.C1357860lRI;
import X.C1359510lTx;
import X.C1359520lTy;
import X.C1360090lUt;
import X.C1361150lWb;
import X.C1361160lWc;
import X.C1362270lYP;
import X.C1362630lYz;
import X.C1374540lsC;
import X.C1379100lzY;
import X.C1380480m1m;
import X.C1380540m1s;
import X.C1380550m1t;
import X.C1380610m1z;
import X.C1380620m20;
import X.C1383760m74;
import X.C1383770m75;
import X.C1383870m7F;
import X.C1383930m7L;
import X.C1383980m7Q;
import X.C1384050m7X;
import X.C1384060m7Y;
import X.C1384300m7w;
import X.C1384680m8Y;
import X.C1384750m8f;
import X.C1384850m8p;
import X.C1385060m9A;
import X.C1387870mDh;
import X.C13LP;
import X.C1483410ohn;
import X.C1558520qew;
import X.C1618440sDa;
import X.C1876707Wr;
import X.C2096308Jd;
import X.C2188811AlT;
import X.C2248751Czx;
import X.C23250099c;
import X.C291001Au;
import X.C293760BfK;
import X.C300900Bqq;
import X.C418440Gaw;
import X.C5182020e;
import X.C523420Kfs;
import X.C581630MrZ;
import X.C631370Opb;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1351150lGT;
import X.EnumC1361070lWT;
import X.EnumC1362640lZ0;
import X.EnumC1380570m1v;
import X.EnumC1384040m7W;
import X.EnumC1384370m83;
import X.EnumC255700yp;
import X.EnumC726810Sf9;
import X.InterfaceC1351220lGa;
import X.InterfaceC1353860lKq;
import X.InterfaceC1360060lUq;
import X.InterfaceC1362260lYO;
import X.InterfaceC1369790lkX;
import X.InterfaceC1380500m1o;
import X.InterfaceC1380630m21;
import X.InterfaceC1380640m22;
import X.InterfaceC1380660m24;
import X.InterfaceC1384330m7z;
import X.InterfaceC2217461Bqa;
import X.InterfaceC728100ShE;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel;
import com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem;
import com.ss.android.ugc.aweme.DanmakuLandscapePresentAssem;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.DanmakuSwitchAssem;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardCommentEmojiAssemAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.UpdatePendingAbility;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.repo.RepostCommentStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.repost.FriendsV3RepostCommentBtnAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.repost.FriendsV3RepostDiggAssem;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelOperationRootAssem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.ss.android.ugc.now.interaction.api.CommentDeleteState;
import com.ss.android.ugc.now.interaction.api.CommentPublishState;
import com.ss.android.ugc.now.interaction.api.LikeState;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionSyncVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AFwS305S0000000_21 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(91);
    public final int $t;

    public static AFwS305S0000000_21 get$arr$(int i) {
        AFwS305S0000000_21 aFwS305S0000000_21 = (AFwS305S0000000_21) arr$.get(i);
        if (aFwS305S0000000_21 != null) {
            return aFwS305S0000000_21;
        }
        arr$.compareAndSet(i, null, new AFwS305S0000000_21(i));
        return (AFwS305S0000000_21) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            case 71:
                return invoke$71(this, obj, obj2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj, obj2);
            case 73:
                return invoke$73(this, obj, obj2);
            case 74:
                return invoke$74(this, obj, obj2);
            case 75:
                return invoke$75(this, obj, obj2);
            case 76:
                return invoke$76(this, obj, obj2);
            case 77:
                return invoke$77(this, obj, obj2);
            case 78:
                return invoke$78(this, obj, obj2);
            case 79:
                return invoke$79(this, obj, obj2);
            case 80:
                return invoke$80(this, obj, obj2);
            case 81:
                return invoke$81(this, obj, obj2);
            case 82:
                return invoke$82(this, obj, obj2);
            case 83:
                return invoke$83(this, obj, obj2);
            case 84:
                return invoke$84(this, obj, obj2);
            case 85:
                return invoke$85(this, obj, obj2);
            case 86:
                return invoke$86(this, obj, obj2);
            case 87:
                return invoke$87(this, obj, obj2);
            case 88:
                return invoke$88(this, obj, obj2);
            case 89:
                return invoke$89(this, obj, obj2);
            case 90:
                return invoke$90(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS305S0000000_21(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        boolean z;
        InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) obj;
        ((Boolean) obj2).booleanValue();
        if (C1374540lsC.LIZ().contains(interfaceC1369790lkX.key()) && !Intrinsics.LJFF(interfaceC1369790lkX.key(), "more")) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AFwS305S0000000_21 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            X.0lkX r2 = (X.InterfaceC1369790lkX) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            java.util.List r0 = X.C1374540lsC.LIZ()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L33
            X.0lsO r0 = X.C1374660lsO.LIZ
            r0.getClass()
            java.util.ArrayList<java.lang.String> r1 = X.C1374660lsO.LIZJ
            java.lang.String r0 = r2.key()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L33
            java.util.List r1 = X.C1374540lsC.LIZ()
            java.lang.String r0 = r2.key()
            boolean r0 = r1.contains(r0)
        L2e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L33:
            r0 = 1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$1(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        View view;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (view = (View) c291001Au.LIZ) != null) {
            danmakuPresentAssem.LLLIL = view;
            danmakuPresentAssem.aq();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$11(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            if (((ArrayList) danmakuPresentAssem.LLLILZLLLI).contains(c1384300m7w)) {
                ((ArrayList) danmakuPresentAssem.LLLILZLLLI).remove(c1384300m7w);
            } else {
                InterfaceC1384330m7z interfaceC1384330m7z = danmakuPresentAssem.LLLFF;
                if (interfaceC1384330m7z != null) {
                    interfaceC1384330m7z.LJJIJIIJIL(1004, c1384300m7w, null);
                }
                c1384300m7w.LIZ(false);
                C1385060m9A c1385060m9A = danmakuPresentAssem.LLJZ;
                if (c1385060m9A != null) {
                    c1385060m9A.invalidate();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AFwS305S0000000_21 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$12(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$13(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        long currentPosition;
        Aweme awemeFp;
        Video video;
        String authorUid;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.START;
            C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
            if (c0n0yLJLJJI != null) {
                currentPosition = c0n0yLJLJJI.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, true, currentPosition, 0.0f, 16);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
            if (!C1361160lWc.LIZJ() && (awemeFp = danmakuPresentAssem.Fp()) != null && (video = awemeFp.getVideo()) != null && video.getVideoLength() >= 10000) {
                Aweme awemeFp2 = danmakuPresentAssem.Fp();
                if (awemeFp2 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(awemeFp2);
                } else {
                    authorUid = null;
                }
                if (!Intrinsics.LJFF(authorUid, C1383770m75.LIZ().LJIIJ().getCurUserId())) {
                    danmakuPresentAssem.LLLILZJ.postDelayed(danmakuPresentAssem.LLLJL, 3000L);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AFwS305S0000000_21 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            com.ss.android.ugc.aweme.DanmakuPresentAssem r10 = (com.ss.android.ugc.aweme.DanmakuPresentAssem) r10
            X.01Au r11 = (X.C291001Au) r11
            if (r11 == 0) goto L1f
            T r3 = r11.LIZ
            X.0R9E r3 = (X.C0R9E) r3
            if (r3 == 0) goto L1f
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r10.Gp()
            r2 = 0
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r10.Gp()
            if (r0 == 0) goto L22
            X.0Sf9 r1 = r0.LLJILJIL
        L1b:
            X.0Sf9 r0 = X.EnumC726810Sf9.PORTRAIT
            if (r1 == r0) goto L24
        L1f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L22:
            r1 = r2
            goto L1b
        L24:
            java.lang.String r1 = r3.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.Fp()
            if (r0 == 0) goto L30
            java.lang.String r2 = r0.getAid()
        L30:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            r2 = 0
            if (r0 == 0) goto L42
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r10.Gp()
            if (r0 == 0) goto L4e
            boolean r1 = r0.LLJIJIL
            r0 = 1
            if (r1 != r0) goto L4e
        L42:
            r10.LLLJIL = r2
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r10.Gp()
            if (r0 == 0) goto L1f
            r0.reset()
            goto L1f
        L4e:
            X.0m8Y r3 = new X.0m8Y
            X.0m83 r4 = X.EnumC1384370m83.PLAY_STOP
            r5 = 1
            r6 = 0
            r8 = 0
            r9 = 24
            r3.<init>(r4, r5, r6, r8, r9)
            boolean r0 = X.C1384850m8p.LIZ
            if (r0 == 0) goto L6a
            r10.Vp(r3)
        L62:
            com.ss.android.ugc.aweme.base.SafeHandler r1 = r10.LLLILZJ
            Y.ARunnableS121S0100000_21 r0 = r10.LLLJL
            r1.removeCallbacks(r0)
            goto L42
        L6a:
            com.ss.android.ugc.aweme.core.DanmakuViewModel r0 = r10.Ip()
            r0.IQ2(r3)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$14(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$15(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        Double d = (Double) obj2;
        if (d != null) {
            d.doubleValue();
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.PLAY_PROGRESS_UPDATE;
            Aweme awemeFp = danmakuPresentAssem.Fp();
            if (awemeFp != null) {
                awemeFp.getAid();
            }
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, false, (long) (d.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), 0.0f, 20);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        long currentPosition;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.START;
            C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
            if (c0n0yLJLJJI != null) {
                currentPosition = c0n0yLJLJJI.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, false, currentPosition, 0.0f, 16);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PAUSE, false, 0L, 0.0f, 28);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PLAY_STOP, true, 0L, 0.0f, 24);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AFwS305S0000000_21 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            com.ss.android.ugc.aweme.DanmakuPresentAssem r12 = (com.ss.android.ugc.aweme.DanmakuPresentAssem) r12
            if (r13 == 0) goto L50
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r12.Gp()
            r6 = 0
            if (r0 == 0) goto La3
            boolean r1 = r0.LLJIJIL
            r0 = 1
            if (r1 != r0) goto La3
        L10:
            r4 = 0
            if (r0 == 0) goto L55
            X.0m9A r0 = r12.LLJZ
            if (r0 == 0) goto L1a
            r12.Up(r0)
        L1a:
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r5 = r12.Gp()
            if (r5 == 0) goto L50
            X.0Sf9 r6 = X.EnumC726810Sf9.PORTRAIT
            X.0Sb3 r0 = r12.LLJI
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.LL
        L28:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.getAweme()
            X.0m7z r8 = r12.LLLFF
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            com.ss.android.ugc.aweme.core.DanmakuViewModel r0 = r12.Ip()
            r9.<init>(r0)
            X.0Sb3 r0 = r12.LLJI
            if (r0 == 0) goto L3f
            java.lang.Object r4 = r0.LL
        L3f:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r4 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            java.lang.String r10 = r0.getAid()
            X.0m8G r11 = r12.LLLF
            kotlin.jvm.internal.AwS565S0100000_21 r12 = r12.LLLFFI
            r5.vQ2(r6, r7, r8, r9, r10, r11, r12)
        L50:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            r0 = r4
            goto L28
        L55:
            X.0m7z r0 = r12.LLLFF
            if (r0 != 0) goto L1a
            X.0m9A r0 = r12.LLJZ
            if (r0 == 0) goto L60
            r12.Up(r0)
        L60:
            com.ss.android.ugc.aweme.core.DanmakuViewModel r5 = r12.Ip()
            X.0m7F r3 = new X.0m7F
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto La1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
        L72:
            com.ss.android.ugc.aweme.repo.DanmakuApi r1 = com.ss.android.ugc.aweme.repo.DanmakuApi.LIZ
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.mEventType
            if (r0 != 0) goto L82
        L80:
            java.lang.String r0 = ""
        L82:
            r3.<init>(r2, r1, r0)
            r5.LLILLJJLI = r3
            X.0m7D r1 = new X.0m7D
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L9a
            r0.getAid()
        L9a:
            r1.<init>(r6)
            r5.LLILZIL = r1
            goto L1a
        La1:
            r2 = r4
            goto L72
        La3:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$19(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        View childAt;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        if (obj2 != null) {
            if (danmakuPresentAssem.LLLIL == null) {
                ViewGroup viewGroup = danmakuPresentAssem.LLLILZ;
                if (viewGroup != null) {
                    childAt = viewGroup.getChildAt(0);
                } else {
                    childAt = null;
                }
                danmakuPresentAssem.LLLIL = childAt;
            }
            danmakuPresentAssem.aq();
            danmakuPresentAssem.LLLJIL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PAUSE, true, 0L, 0.0f, 24);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$21(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Aweme aweme;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (C293760BfK.LIZ() && c291001Au != null) {
            int iIntValue = ((Number) c291001Au.LIZ).intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2 && !danmakuPresentAssem.LLJLLL) {
                    C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
                    VideoItemParams item = danmakuPresentAssem.Ip().getItem();
                    if (item != null) {
                        aweme = item.getAweme();
                    } else {
                        aweme = null;
                    }
                    if (c1383760m74.LJJIIJZLJL(aweme)) {
                        InterfaceC1384330m7z interfaceC1384330m7z = danmakuPresentAssem.LLLFF;
                        if (interfaceC1384330m7z != null && !interfaceC1384330m7z.isPlaying() && danmakuPresentAssem.LLLJIL) {
                            InterfaceC1384330m7z interfaceC1384330m7z2 = danmakuPresentAssem.LLLFF;
                            if (interfaceC1384330m7z2 != null) {
                                interfaceC1384330m7z2.resume();
                            }
                            danmakuPresentAssem.LLLJIL = false;
                        }
                        danmakuPresentAssem.xn1(true);
                    }
                }
            } else if (danmakuPresentAssem.LLJLLL) {
                InterfaceC1384330m7z interfaceC1384330m7z3 = danmakuPresentAssem.LLLFF;
                if (interfaceC1384330m7z3 != null && interfaceC1384330m7z3.isPlaying()) {
                    InterfaceC1384330m7z interfaceC1384330m7z4 = danmakuPresentAssem.LLLFF;
                    if (interfaceC1384330m7z4 != null) {
                        interfaceC1384330m7z4.pause();
                    }
                    danmakuPresentAssem.LLLJIL = true;
                }
                danmakuPresentAssem.xn1(false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        long currentPosition;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.SEEK;
            C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
            if (c0n0yLJLJJI != null) {
                currentPosition = c0n0yLJLJJI.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, true, currentPosition, 0.0f, 16);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$23(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1383980m7Q c1383980m7Q;
        InterfaceC1384330m7z interfaceC1384330m7z;
        InterfaceC1384330m7z interfaceC1384330m7z2;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1383980m7Q = (C1383980m7Q) c291001Au.LIZ) != null) {
            int i = C1384050m7X.LIZ[c1383980m7Q.LIZIZ.LIZLLL.ordinal()];
            if (i != 1) {
                if (i == 2 && (interfaceC1384330m7z2 = danmakuPresentAssem.LLLFF) != null) {
                    interfaceC1384330m7z2.LIZLLL(C1383930m7L.LIZ(c1383980m7Q.LIZIZ));
                }
            } else {
                InterfaceC1384330m7z interfaceC1384330m7z3 = danmakuPresentAssem.LLLFF;
                if (interfaceC1384330m7z3 != null) {
                    interfaceC1384330m7z3.LJJIIZ(c1383980m7Q.LIZ, C1383930m7L.LIZ(c1383980m7Q.LIZIZ));
                }
                C1383870m7F c1383870m7F = danmakuPresentAssem.Ip().LLILLJJLI;
                if (c1383870m7F != null) {
                    c1383870m7F.LIZLLL = false;
                }
            }
            if (c1383980m7Q.LIZIZ.LIZLLL != EnumC1384040m7W.NONE && (interfaceC1384330m7z = danmakuPresentAssem.LLLFF) != null) {
                interfaceC1384330m7z.LJJIIZI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        long currentPosition;
        Object obj3;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.START;
            C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
            if (c0n0yLJLJJI != null) {
                currentPosition = c0n0yLJLJJI.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, false, currentPosition, 0.0f, 16);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
            if (!C1361160lWc.LIZJ() && !danmakuLandscapePresentAssem.LLLILZJ) {
                C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
                Object obj4 = null;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                Video video = ((VideoItemParams) obj3).getAweme().getVideo();
                if (video != null && video.getVideoLength() >= 10000) {
                    C724270Sb3 c724270Sb32 = danmakuLandscapePresentAssem.LLJI;
                    if (c724270Sb32 != null) {
                        obj4 = c724270Sb32.LL;
                    }
                    if (!Intrinsics.LJFF(AwemeExtKt.getAuthorUid(((VideoItemParams) obj4).getAweme()), C1383770m75.LIZ().LJIIJ().getCurUserId())) {
                        danmakuLandscapePresentAssem.LLLILZJ = true;
                        ((Handler) danmakuLandscapePresentAssem.LLLJL.getValue()).postDelayed(danmakuLandscapePresentAssem.LLLL, 3000L);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1344030l4z.LIZJ("CommentManagementTitleAssem", "applyManageAssem in action bar");
        IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), IPageActionBarAbility.class, null);
        if (iPageActionBarAbility != null) {
            iPageActionBarAbility.S41(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iLIZ = C1349270lDR.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mutli panel set height last:");
        sbLIZ.append(iLIZ);
        sbLIZ.append("  newHeight:");
        sbLIZ.append(iIntValue);
        C1344030l4z.LIZJ("KeyboardMultiPanelAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (iIntValue > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mutli panel change height ");
            sbLIZ2.append(iIntValue);
            C1344030l4z.LIZJ("KeyboardMultiPanelAssem", C2188811AlT.LIZIZ(sbLIZ2));
            C1351950lHl.LJIJI(iIntValue, uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        IKeyboardCommentEmojiAssemAbility iKeyboardCommentEmojiAssemAbility;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (iIntValue > 0 && (iKeyboardCommentEmojiAssemAbility = (IKeyboardCommentEmojiAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IKeyboardCommentEmojiAssemAbility.class, null)) != null) {
            iKeyboardCommentEmojiAssemAbility.iq2(iIntValue);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$28(kotlin.jvm.internal.AFwS305S0000000_21 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$28(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$29(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PAUSE, false, 0L, 0.0f, 28);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        Integer numLIZJ;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            c1384300m7w.LJIJJLI = Float.valueOf(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            Context context = danmakuPresentAssem.getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
            } else {
                numLIZJ = null;
            }
            c1384300m7w.LJIJJ = numLIZJ;
            c1384300m7w.LJIILL = true;
            InterfaceC1384330m7z interfaceC1384330m7z = danmakuPresentAssem.LLLFF;
            if (interfaceC1384330m7z != null && !interfaceC1384330m7z.isPlaying()) {
                danmakuPresentAssem.LLLIZZ = c1384300m7w;
            } else {
                InterfaceC1384330m7z interfaceC1384330m7z2 = danmakuPresentAssem.LLLFF;
                if (interfaceC1384330m7z2 != null) {
                    interfaceC1384330m7z2.LJIIIZ(c1384300m7w);
                }
                InterfaceC1384330m7z interfaceC1384330m7z3 = danmakuPresentAssem.LLLFF;
                if (interfaceC1384330m7z3 != null) {
                    interfaceC1384330m7z3.LJJIIZI();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$30(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C0R9E c0r9e;
        Object obj3;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c0r9e = (C0R9E) c291001Au.LIZ) != null) {
            danmakuLandscapePresentAssem.LLLIL = false;
            String str = c0r9e.LIZ;
            C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (Intrinsics.LJFF(str, ((VideoItemParams) obj3).getAweme().getAid())) {
                C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PLAY_STOP, true, 0L, 0.0f, 24);
                if (C1384850m8p.LIZ) {
                    danmakuLandscapePresentAssem.Tp(c1384680m8Y);
                } else {
                    danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
                }
                ((Handler) danmakuLandscapePresentAssem.LLLJL.getValue()).removeCallbacks(danmakuLandscapePresentAssem.LLLL);
            }
            danmakuLandscapePresentAssem.LLLIIL = false;
            DanmakuContinuallyPlayViewModel danmakuContinuallyPlayViewModel = (DanmakuContinuallyPlayViewModel) danmakuLandscapePresentAssem.LLLF.getValue();
            if (danmakuContinuallyPlayViewModel != null) {
                danmakuContinuallyPlayViewModel.reset();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PLAY_STOP, true, 0L, 0.0f, 24);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        return Boolean.FALSE;
    }

    public static final Object invoke$33(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String str;
        FriendsV3RepostDiggAssem friendsV3RepostDiggAssem = (FriendsV3RepostDiggAssem) obj;
        C1359520lTy c1359520lTy = (C1359520lTy) obj2;
        if (c1359520lTy != null) {
            String str2 = c1359520lTy.LIZ;
            FriendsV3RepostModel friendsV3RepostModel = friendsV3RepostDiggAssem.LLJL;
            if (friendsV3RepostModel != null) {
                str = friendsV3RepostModel.realRepostId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str2, str) && c1359520lTy.LIZIZ == null) {
                friendsV3RepostDiggAssem.yp(c1359520lTy.LIZLLL, c1359520lTy.LIZJ);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$34(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Object obj3;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (C293760BfK.LIZ() && c291001Au != null) {
            int iIntValue = ((Number) c291001Au.LIZ).intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2 && !danmakuLandscapePresentAssem.LLLIL) {
                    C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
                    C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
                    if (c724270Sb3 != null) {
                        obj3 = c724270Sb3.LL;
                    } else {
                        obj3 = null;
                    }
                    if (c1383760m74.LJJIIJZLJL(((VideoItemParams) obj3).getAweme())) {
                        InterfaceC1384330m7z interfaceC1384330m7z = danmakuLandscapePresentAssem.LLLI;
                        if (interfaceC1384330m7z != null && !interfaceC1384330m7z.isPlaying() && danmakuLandscapePresentAssem.LLLIIL) {
                            InterfaceC1384330m7z interfaceC1384330m7z2 = danmakuLandscapePresentAssem.LLLI;
                            if (interfaceC1384330m7z2 != null) {
                                interfaceC1384330m7z2.resume();
                            }
                            danmakuLandscapePresentAssem.LLLIIL = false;
                        }
                        danmakuLandscapePresentAssem.xn1(true);
                    }
                }
            } else if (danmakuLandscapePresentAssem.LLLIL) {
                InterfaceC1384330m7z interfaceC1384330m7z3 = danmakuLandscapePresentAssem.LLLI;
                if (interfaceC1384330m7z3 != null && interfaceC1384330m7z3.isPlaying()) {
                    InterfaceC1384330m7z interfaceC1384330m7z4 = danmakuLandscapePresentAssem.LLLI;
                    if (interfaceC1384330m7z4 != null) {
                        interfaceC1384330m7z4.pause();
                    }
                    danmakuLandscapePresentAssem.LLLIIL = true;
                }
                danmakuLandscapePresentAssem.xn1(false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PAUSE, true, 0L, 0.0f, 24);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AFwS305S0000000_21 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$36(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$37(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1383980m7Q c1383980m7Q;
        InterfaceC1384330m7z interfaceC1384330m7z;
        InterfaceC1384330m7z interfaceC1384330m7z2;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1383980m7Q = (C1383980m7Q) c291001Au.LIZ) != null) {
            int i = C1384060m7Y.LIZ[c1383980m7Q.LIZIZ.LIZLLL.ordinal()];
            if (i != 1) {
                if (i == 2 && (interfaceC1384330m7z2 = danmakuLandscapePresentAssem.LLLI) != null) {
                    interfaceC1384330m7z2.LIZLLL(C1383930m7L.LIZ(c1383980m7Q.LIZIZ));
                }
            } else {
                InterfaceC1384330m7z interfaceC1384330m7z3 = danmakuLandscapePresentAssem.LLLI;
                if (interfaceC1384330m7z3 != null) {
                    interfaceC1384330m7z3.LJJIIZ(c1383980m7Q.LIZ, C1383930m7L.LIZ(c1383980m7Q.LIZIZ));
                }
                C1383870m7F c1383870m7F = danmakuLandscapePresentAssem.Fp().LLILLJJLI;
                if (c1383870m7F != null) {
                    c1383870m7F.LIZLLL = false;
                }
            }
            if (c1383980m7Q.LIZIZ.LIZLLL != EnumC1384040m7W.NONE && (interfaceC1384330m7z = danmakuLandscapePresentAssem.LLLI) != null) {
                interfaceC1384330m7z.LJJIIZI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        long currentPosition;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.SEEK;
            C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
            if (c0n0yLJLJJI != null) {
                currentPosition = c0n0yLJLJJI.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, true, currentPosition, 0.0f, 16);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        boolean z;
        DanmakuCreateEntranceAssem danmakuCreateEntranceAssem = (DanmakuCreateEntranceAssem) obj;
        if (obj2 != null) {
            DanmakuContinuallyPlayViewModel danmakuContinuallyPlayViewModelBp = danmakuCreateEntranceAssem.Bp();
            if (danmakuContinuallyPlayViewModelBp != null) {
                z = danmakuContinuallyPlayViewModelBp.LLJIJIL;
            } else {
                z = false;
            }
            danmakuCreateEntranceAssem.Fp(z);
            danmakuCreateEntranceAssem.LLLFFI = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Pair pair;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (pair = (Pair) c291001Au.LIZ) != null) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.SPEED_CHANGE;
            pair.getFirst();
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, false, 0L, ((Number) pair.getSecond()).floatValue(), 12);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$40(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        Integer numLIZJ;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            c1384300m7w.LJIJJLI = Float.valueOf(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            Context context = danmakuLandscapePresentAssem.getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
            } else {
                numLIZJ = null;
            }
            c1384300m7w.LJIJJ = numLIZJ;
            c1384300m7w.LJIILL = true;
            InterfaceC1384330m7z interfaceC1384330m7z = danmakuLandscapePresentAssem.LLLI;
            if (interfaceC1384330m7z != null && !interfaceC1384330m7z.isPlaying()) {
                danmakuLandscapePresentAssem.LLLIIIL = c1384300m7w;
            } else {
                InterfaceC1384330m7z interfaceC1384330m7z2 = danmakuLandscapePresentAssem.LLLI;
                if (interfaceC1384330m7z2 != null) {
                    interfaceC1384330m7z2.LJIIIZ(c1384300m7w);
                }
                InterfaceC1384330m7z interfaceC1384330m7z3 = danmakuLandscapePresentAssem.LLLI;
                if (interfaceC1384330m7z3 != null) {
                    interfaceC1384330m7z3.LJJIIZI();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$41(kotlin.jvm.internal.AFwS305S0000000_21 r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem r4 = (com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem) r4
            if (r5 == 0) goto L17
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r4.Bp()
            r3 = 0
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r4.Bp()
            if (r0 == 0) goto L1a
            X.0Sf9 r1 = r0.LLJILJIL
        L13:
            X.0Sf9 r0 = X.EnumC726810Sf9.PORTRAIT
            if (r1 == r0) goto L1c
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r1 = r3
            goto L13
        L1c:
            boolean r0 = r4.LLLFFI
            if (r0 == 0) goto L28
            com.ss.android.ugc.aweme.DanmakuContinuallyPlayViewModel r0 = r4.Bp()
            if (r0 == 0) goto L28
            r0.LLJILJILJ = r3
        L28:
            com.ss.android.ugc.aweme.core.DanmakuViewModel r2 = r4.Ep()
            boolean r0 = r4.LLLFFI
            if (r0 == 0) goto L37
            X.00yp r0 = r2.AQ2()
            r2.EQ2(r0)
        L37:
            r1 = 1
            r0 = 0
            r2.CQ2(r1, r0, r3, r3)
            r2.LLIZ = r0
            r4.LLLFFI = r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$41(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$42(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        Integer numLIZJ;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            c1384300m7w.LJIJJLI = Float.valueOf(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            Context context = danmakuLandscapePresentAssem.getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
            } else {
                numLIZJ = null;
            }
            c1384300m7w.LJIJJ = numLIZJ;
            danmakuLandscapePresentAssem.Bp(c1384300m7w);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$43(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Pair pair;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (pair = (Pair) c291001Au.LIZ) != null) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.SPEED_CHANGE;
            pair.getFirst();
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, false, 0L, ((Number) pair.getSecond()).floatValue(), 12);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PLAY_COMPLETE, false, 0L, 0.0f, 24);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuSwitchAssem danmakuSwitchAssem = (DanmakuSwitchAssem) obj;
        if (danmakuSwitchAssem.Ep().LLIZ && obj2 == C0RQD.IS_NOT_CLEAN) {
            C736680Sv4.LJIJJ(danmakuSwitchAssem.Ep(), new AwS600S0100000_21(danmakuSwitchAssem, 160));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$46(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            DanmakuLandscapePresentAssem.Up(danmakuLandscapePresentAssem, c1384300m7w);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$47(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384680m8Y c1384680m8Y;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (danmakuLandscapePresentAssem.LLLIILIL && c291001Au != null && (c1384680m8Y = (C1384680m8Y) c291001Au.LIZ) != null) {
            danmakuLandscapePresentAssem.Tp(c1384680m8Y);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$48(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        LinearLayout.LayoutParams layoutParams;
        DanmakuSwitchAssem danmakuSwitchAssem = (DanmakuSwitchAssem) obj;
        boolean z = false;
        if (obj2 == EnumC1361070lWT.DISABLED) {
            TuxIconView tuxIconView = danmakuSwitchAssem.LLLFF;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 4);
            }
            LinearLayout linearLayout = danmakuSwitchAssem.LLLFFI;
            if (linearLayout != null) {
                C786410Ut5.LJZL(4, linearLayout);
            }
            LinearLayout linearLayout2 = danmakuSwitchAssem.LLLFFI;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (linearLayout2 != null) {
                layoutParams2 = linearLayout2.getLayoutParams();
            }
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                LinearLayout linearLayout3 = danmakuSwitchAssem.LLLFFI;
                if (linearLayout3 != null) {
                    C786410Ut5.d6(linearLayout3, layoutParams);
                }
            }
        } else {
            EnumC1361070lWT enumC1361070lWT = EnumC1361070lWT.ON;
            if (obj2 == enumC1361070lWT) {
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DanmakuSwitchAssem.LLLII;
                danmakuSwitchAssem.Gp(false);
            }
            if (obj2 == enumC1361070lWT) {
                z = true;
            }
            danmakuSwitchAssem.xn1(z);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$49(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DanmakuLandscapePresentAssem.LLLLII;
            danmakuLandscapePresentAssem.Vp(c1384300m7w, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        Integer numLIZJ;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            c1384300m7w.LJIJJLI = Float.valueOf(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            Context context = danmakuPresentAssem.getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
            } else {
                numLIZJ = null;
            }
            c1384300m7w.LJIJJ = numLIZJ;
            danmakuPresentAssem.Bp(c1384300m7w);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        if (obj2 != null) {
            C0CAU.LIZIZ(new ARunnableS121S0100000_21(danmakuLandscapePresentAssem, 75));
            danmakuLandscapePresentAssem.LLLIIL = false;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$51(kotlin.jvm.internal.AFwS305S0000000_21 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            X.0lkX r2 = (X.InterfaceC1369790lkX) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            java.util.List r0 = X.C1374540lsC.LIZ()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L33
            X.0lsO r0 = X.C1374660lsO.LIZ
            r0.getClass()
            java.util.ArrayList<java.lang.String> r1 = X.C1374660lsO.LIZJ
            java.lang.String r0 = r2.key()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L33
            java.util.List r1 = X.C1374540lsC.LIZ()
            java.lang.String r0 = r2.key()
            boolean r0 = r1.contains(r0)
        L2e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L33:
            r0 = 1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$51(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$52(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$53(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            if (((ArrayList) danmakuLandscapePresentAssem.LLLIIIIL).contains(c1384300m7w)) {
                ((ArrayList) danmakuLandscapePresentAssem.LLLIIIIL).remove(c1384300m7w);
            } else {
                InterfaceC1384330m7z interfaceC1384330m7z = danmakuLandscapePresentAssem.LLLI;
                if (interfaceC1384330m7z != null) {
                    interfaceC1384330m7z.LJJIJIIJIL(1004, c1384300m7w, null);
                }
                c1384300m7w.LIZ(false);
                C1385060m9A c1385060m9A = danmakuLandscapePresentAssem.LLLFZ;
                if (c1385060m9A != null) {
                    c1385060m9A.invalidate();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            danmakuLandscapePresentAssem.Jp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Object obj3;
        EnumC255700yp enumC255700yp;
        DanmakuSwitchAssem danmakuSwitchAssem = (DanmakuSwitchAssem) obj;
        if (obj2 != null) {
            if (C1383760m74.LIZIZ.LJIIIZ(danmakuSwitchAssem.Bp())) {
                C1361150lWb c1361150lWb = C1361150lWb.LIZ;
                Aweme awemeBp = danmakuSwitchAssem.Bp();
                C724270Sb3 c724270Sb3 = danmakuSwitchAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                String str = ((VideoItemParams) obj3).mEventType;
                if (str == null) {
                    str = "";
                }
                if (C0SXF.LJIJ(danmakuSwitchAssem.Bp())) {
                    enumC255700yp = EnumC255700yp.IS_FAKE_LANDSCAPE;
                } else {
                    enumC255700yp = EnumC255700yp.IS_LANDSCAPE;
                }
                c1361150lWb.getClass();
                C1361150lWb.LJFF(awemeBp, str, enumC255700yp);
            }
            danmakuSwitchAssem.Ep().HQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        long currentPosition;
        Video video;
        Object obj3;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.START;
            C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
            if (c0n0yLJLJJI != null) {
                currentPosition = c0n0yLJLJJI.getCurrentPosition();
            } else {
                currentPosition = 0;
            }
            C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, true, currentPosition, 0.0f, 16);
            if (C1384850m8p.LIZ) {
                danmakuLandscapePresentAssem.Tp(c1384680m8Y);
            } else {
                danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
            }
            if (!C1361160lWc.LIZJ() && (video = ((VideoItemParams) C631370Opb.LIZ(danmakuLandscapePresentAssem)).getAweme().getVideo()) != null && video.getVideoLength() >= 10000) {
                C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                if (!Intrinsics.LJFF(AwemeExtKt.getAuthorUid(((VideoItemParams) obj3).getAweme()), C1383770m75.LIZ().LJIIJ().getCurUserId())) {
                    ((Handler) danmakuLandscapePresentAssem.LLLJL.getValue()).postDelayed(danmakuLandscapePresentAssem.LLLL, 3000L);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Object obj3;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        if (obj2 != null) {
            danmakuLandscapePresentAssem.xn1(C1383760m74.LIZIZ.LJJIIJZLJL(((VideoItemParams) C631370Opb.LIZ(danmakuLandscapePresentAssem)).getAweme()));
            DanmakuContinuallyPlayViewModel danmakuContinuallyPlayViewModel = (DanmakuContinuallyPlayViewModel) danmakuLandscapePresentAssem.LLLF.getValue();
            if (danmakuContinuallyPlayViewModel != null) {
                EnumC726810Sf9 enumC726810Sf9 = EnumC726810Sf9.LANDSCAPE;
                C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
                Object obj4 = null;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme = ((VideoItemParams) obj3).getAweme();
                InterfaceC1384330m7z interfaceC1384330m7z = danmakuLandscapePresentAssem.LLLI;
                WeakReference<DanmakuViewModel> weakReference = new WeakReference<>(danmakuLandscapePresentAssem.Fp());
                C724270Sb3 c724270Sb32 = danmakuLandscapePresentAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                }
                danmakuContinuallyPlayViewModel.vQ2(enumC726810Sf9, aweme, interfaceC1384330m7z, weakReference, ((VideoItemParams) obj4).getAweme().getAid(), danmakuLandscapePresentAssem.LLLFFI, danmakuLandscapePresentAssem.LLLII);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuSwitchAssem danmakuSwitchAssem = (DanmakuSwitchAssem) obj;
        if (obj2 != null) {
            DanmakuViewModel danmakuViewModelEp = danmakuSwitchAssem.Ep();
            danmakuViewModelEp.EQ2(danmakuViewModelEp.AQ2());
            danmakuViewModelEp.CQ2(true, false, null, null);
            danmakuViewModelEp.LLIZ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String aid;
        Aweme aweme;
        Video video;
        DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) obj;
        C2248751Czx c2248751Czx = (C2248751Czx) obj2;
        if (c2248751Czx != null) {
            String aid2 = ((VideoItemParams) C631370Opb.LIZ(danmakuLandscapePresentAssem)).getAweme().getAid();
            Aweme aweme2 = c2248751Czx.LIZ;
            Object obj3 = null;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid) && (aweme = c2248751Czx.LIZ) != null && (video = aweme.getVideo()) != null) {
                double duration = (video.getDuration() * (c2248751Czx.LIZJ / 100)) / LSPassThroughRecordSizeConfig.DEFAULT;
                if (danmakuLandscapePresentAssem.LLLILZ < Math.floor(duration)) {
                    EnumC1384370m83 enumC1384370m83 = EnumC1384370m83.PLAY_PROGRESS_UPDATE;
                    C724270Sb3 c724270Sb3 = danmakuLandscapePresentAssem.LLJI;
                    if (c724270Sb3 != null) {
                        obj3 = c724270Sb3.LL;
                    }
                    ((VideoItemParams) obj3).getAweme().getAid();
                    C1384680m8Y c1384680m8Y = new C1384680m8Y(enumC1384370m83, false, (long) (((double) LSPassThroughRecordSizeConfig.DEFAULT) * duration), 0.0f, 20);
                    if (C1384850m8p.LIZ) {
                        danmakuLandscapePresentAssem.Tp(c1384680m8Y);
                    } else {
                        danmakuLandscapePresentAssem.Fp().IQ2(c1384680m8Y);
                    }
                }
                danmakuLandscapePresentAssem.LLLILZ = duration;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            C1384680m8Y c1384680m8Y = new C1384680m8Y(EnumC1384370m83.PLAY_COMPLETE, false, 0L, 0.0f, 24);
            if (C1384850m8p.LIZ) {
                danmakuPresentAssem.Vp(c1384680m8Y);
            } else {
                danmakuPresentAssem.Ip().IQ2(c1384680m8Y);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String str;
        int size;
        C1357800lRC c1357800lRC;
        RepostCommentStruct repostCommentStruct;
        List<RepostReplyStruct> list;
        FriendsV3RepostCommentBtnAssem friendsV3RepostCommentBtnAssem = (FriendsV3RepostCommentBtnAssem) obj;
        C1357860lRI c1357860lRI = (C1357860lRI) obj2;
        String str2 = null;
        if (c1357860lRI != null) {
            str = c1357860lRI.LIZ;
        } else {
            str = null;
        }
        FriendsV3RepostModel friendsV3RepostModel = friendsV3RepostCommentBtnAssem.LLJL;
        if (friendsV3RepostModel != null) {
            str2 = friendsV3RepostModel.realRepostId;
        }
        if (Intrinsics.LJFF(str, str2) && c1357860lRI != null) {
            int i = (int) c1357860lRI.LIZIZ;
            FriendsV3RepostModel friendsV3RepostModel2 = friendsV3RepostCommentBtnAssem.LLJL;
            if (friendsV3RepostModel2 != null && (repostCommentStruct = friendsV3RepostModel2.repostComments) != null && (list = repostCommentStruct.repostCommentList) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (i > size && (c1357800lRC = friendsV3RepostCommentBtnAssem.LLJLIL) != null && c1357800lRC.LIZJ) {
                c1357800lRC.LIZ = i;
                friendsV3RepostCommentBtnAssem.sp(i);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        boolean z;
        InterfaceC1362260lYO interfaceC1362260lYO;
        InterfaceC1362260lYO interfaceC1362260lYO2;
        InterfaceC1362260lYO interfaceC1362260lYO3;
        InterfaceC1362260lYO interfaceC1362260lYO4;
        SharePanelOperationRootAssem sharePanelOperationRootAssem = (SharePanelOperationRootAssem) obj;
        boolean zAQ2 = sharePanelOperationRootAssem.op().AQ2();
        if (!(!((Set) obj2).isEmpty()) && !zAQ2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1362270lYP c1362270lYP = (C1362270lYP) sharePanelOperationRootAssem.LLJJLIIIJLLLLLLLZ.getValue();
            if (c1362270lYP != null && (interfaceC1362260lYO4 = c1362270lYP.LLILZLL) != null) {
                interfaceC1362260lYO4.t1(false);
            }
            if (!sharePanelOperationRootAssem.LLJLILLLLZIIL) {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SHOW_OPERATION_LAYOUT.getValue()));
                }
            }
            C1362270lYP c1362270lYP2 = (C1362270lYP) sharePanelOperationRootAssem.LLJJLIIIJLLLLLLLZ.getValue();
            if (c1362270lYP2 != null && (interfaceC1362260lYO3 = c1362270lYP2.LLILZLL) != null) {
                interfaceC1362260lYO3.u1(true);
            }
            sharePanelOperationRootAssem.op().setState(new AwS34S0010000_21(true, 5));
            sharePanelOperationRootAssem.LLJLILLLLZIIL = true;
        } else {
            C1362270lYP c1362270lYP3 = (C1362270lYP) sharePanelOperationRootAssem.LLJJLIIIJLLLLLLLZ.getValue();
            if (c1362270lYP3 != null && (interfaceC1362260lYO2 = c1362270lYP3.LLILZLL) != null) {
                interfaceC1362260lYO2.u1(false);
            }
            C1362270lYP c1362270lYP4 = (C1362270lYP) sharePanelOperationRootAssem.LLJJLIIIJLLLLLLLZ.getValue();
            if (c1362270lYP4 != null && (interfaceC1362260lYO = c1362270lYP4.LLILZLL) != null) {
                interfaceC1362260lYO.t1(true);
            }
            sharePanelOperationRootAssem.op().setState(new AwS34S0010000_21(false, 5));
            sharePanelOperationRootAssem.LLJLILLLLZIIL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$62(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        View view = (View) obj;
        if (((MotionEvent) obj2).getActionMasked() == 0) {
            C1356720lPS.LIZIZ(view.getContext());
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$63(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        View view = (View) obj;
        if (((MotionEvent) obj2).getActionMasked() == 0) {
            C1356720lPS.LIZIZ(view.getContext());
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$64(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        CharSequence charSequence;
        C1384750m8f c1384750m8f = (C1384750m8f) obj;
        AbstractC1384320m7y abstractC1384320m7y = (AbstractC1384320m7y) obj2;
        if (abstractC1384320m7y != null && (charSequence = abstractC1384320m7y.LIZIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) charSequence);
            sbLIZ.append(", ");
            sbLIZ.append(c1384750m8f.LJ.LIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$65(kotlin.jvm.internal.AFwS305S0000000_21 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$65(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$66(kotlin.jvm.internal.AFwS305S0000000_21 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$66(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$67(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        UpdatePendingAbility updatePendingAbilityJp;
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null) && videoQuickCommentAssem.LLJJIII) {
            Object obj3 = null;
            videoQuickCommentAssem.LLLILZ = null;
            videoQuickCommentAssem.Ep(null, true);
            C1353500lKG c1353500lKG = videoQuickCommentAssem.LLLFF;
            if (c1353500lKG != null) {
                c1353500lKG.setText("");
            }
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().LJJJI(videoQuickCommentAssem.getContext());
            videoQuickCommentAssem.LLLIIIL = true;
            if (C1351290lGh.LIZIZ() && (updatePendingAbilityJp = videoQuickCommentAssem.Jp()) != null) {
                C724270Sb3 c724270Sb3 = videoQuickCommentAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                }
                if (!updatePendingAbilityJp.h2((VideoItemParams) obj3)) {
                    videoQuickCommentAssem.Qp(false, false, EnumC1351150lGT.DEFAULT, null);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$68(kotlin.jvm.internal.AFwS305S0000000_21 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$68(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$69(kotlin.jvm.internal.AFwS305S0000000_21 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem r8 = (com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem) r8
            X.01Au r9 = (X.C291001Au) r9
            boolean r0 = X.C300900Bqq.LIZ()
            if (r0 == 0) goto Lf
            if (r9 != 0) goto Lf
        Lc:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lf:
            boolean r0 = r8.LLJJIII
            if (r0 == 0) goto Lc
            if (r9 == 0) goto Lc
            T r0 = r9.LIZ
            X.0RGn r0 = (X.C693070RGn) r0
            if (r0 == 0) goto Lc
            boolean r2 = r0.LJ
            X.0sDa r0 = X.C1618440sDa.LIZIZ
            X.0ShE r1 = r0.LJJLIIIJLJLI()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getCommentInputAweme()
            r5 = 0
            if (r0 == 0) goto L96
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
        L2e:
            java.lang.String r7 = ""
            if (r0 != 0) goto L33
            r0 = r7
        L33:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LJIIIZ(r0)
            X.0lGa r1 = r8.Gp()
            if (r0 == 0) goto L94
            java.lang.String r0 = r0.getAid()
        L41:
            X.0lGX r0 = r1.get(r0)
            boolean r0 = r0.LIZ
            if (r0 == 0) goto Lc
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getCommentInputAweme()
            if (r0 == 0) goto Lc
            java.lang.String r6 = r0.getAid()
            if (r6 == 0) goto Lc
            X.0lGa r0 = r8.Gp()
            X.0lGX r4 = r0.get(r6)
            boolean r0 = r4.LIZIZ
            if (r0 != 0) goto L98
            X.0lGd r1 = X.C1351250lGd.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getCommentInputAweme()
            r1.getClass()
            boolean r0 = X.C1351250lGd.LIZIZ(r0)
            if (r0 == 0) goto L98
            X.0lGT r0 = X.EnumC1351150lGT.DEFAULT
            r3 = 1
            r8.Qp(r3, r2, r0, r5)
            r8.LLLILZ = r5
            r8.Ep(r5, r3)
            X.0lKG r0 = r8.LLLFF
            if (r0 == 0) goto L82
            r0.setText(r7)
        L82:
            X.0lGa r2 = r8.Gp()
            r1 = 0
            r0 = 6
            X.0lGX r0 = X.C1351190lGX.LIZ(r4, r3, r1, r5, r0)
            r2.LIZ(r6, r0)
            r8.iq()
            goto Lc
        L94:
            r0 = r5
            goto L41
        L96:
            r0 = r5
            goto L2e
        L98:
            X.0lGT r1 = X.EnumC1351150lGT.DEFAULT
            r0 = 0
            r8.Qp(r0, r2, r1, r5)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS305S0000000_21.invoke$69(kotlin.jvm.internal.AFwS305S0000000_21, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            DanmakuPresentAssem.Wp(danmakuPresentAssem, c1384300m7w);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String aid;
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) obj;
        if (videoQuickCommentAssem.LLJJIII) {
            InterfaceC1351220lGa interfaceC1351220lGaGp = videoQuickCommentAssem.Gp();
            Aweme commentInputAweme = videoQuickCommentAssem.getCommentInputAweme();
            if (commentInputAweme != null) {
                aid = commentInputAweme.getAid();
            } else {
                aid = null;
            }
            C1351190lGX c1351190lGX = interfaceC1351220lGaGp.get(aid);
            if (!c1351190lGX.LIZ) {
                videoQuickCommentAssem.Qp(true, false, EnumC1351150lGT.DEFAULT, new AwS422S0200000_21(videoQuickCommentAssem, c1351190lGX, 93));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$71(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) obj;
        VideoQuickCommentVM videoQuickCommentVM = (VideoQuickCommentVM) videoQuickCommentAssem.LLLII.getValue(videoQuickCommentAssem, VideoQuickCommentAssem.LLLLILI[0]);
        if (!videoQuickCommentVM.LL.isActive()) {
            videoQuickCommentVM.LL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(videoQuickCommentVM), C0PEM.LIZJ, null, new C01UH(videoQuickCommentVM, null), 2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$72(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C0RHH c0rhh;
        String authorUid;
        String aid;
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c0rhh = (C0RHH) c291001Au.LIZ) != null && (c0rhh.LIZJ * 1.0f) / 1000 >= 0.5d) {
            InterfaceC728100ShE interfaceC728100ShELJJLIIIJLJLI = C1618440sDa.LIZIZ.LJJLIIIJLJLI();
            Aweme commentInputAweme = videoQuickCommentAssem.getCommentInputAweme();
            String aid2 = null;
            if (commentInputAweme == null || (authorUid = AwemeExtKt.getAuthorUid(commentInputAweme)) == null) {
                authorUid = "";
            }
            Aweme awemeLJIIIZ = interfaceC728100ShELJJLIIIJLJLI.LJIIIZ(authorUid);
            InterfaceC1351220lGa interfaceC1351220lGaGp = videoQuickCommentAssem.Gp();
            if (awemeLJIIIZ != null) {
                aid = awemeLJIIIZ.getAid();
            } else {
                aid = null;
            }
            C1351190lGX c1351190lGX = interfaceC1351220lGaGp.get(aid);
            if (!c1351190lGX.LIZ) {
                C1351250lGd c1351250lGd = C1351250lGd.LIZ;
                Aweme commentInputAweme2 = videoQuickCommentAssem.getCommentInputAweme();
                c1351250lGd.getClass();
                if (C1351250lGd.LIZIZ(commentInputAweme2)) {
                    InterfaceC1351220lGa interfaceC1351220lGaGp2 = videoQuickCommentAssem.Gp();
                    Aweme commentInputAweme3 = videoQuickCommentAssem.getCommentInputAweme();
                    if (commentInputAweme3 != null) {
                        aid2 = commentInputAweme3.getAid();
                    }
                    if (!interfaceC1351220lGaGp2.get(aid2).LIZIZ) {
                        videoQuickCommentAssem.Qp(true, true, EnumC1351150lGT.DEFAULT, new AwS265S0300000_21(videoQuickCommentAssem, awemeLJIIIZ, c1351190lGX, 24));
                    } else {
                        videoQuickCommentAssem.Qp(false, true, EnumC1351150lGT.DEFAULT, null);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$73(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$74(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Aweme aweme;
        Aweme aweme2;
        InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) obj;
        String aid = null;
        if (((Boolean) obj2).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("visible ");
            InterfaceC1353860lKq interfaceC1353860lKq = (InterfaceC1353860lKq) C631370Opb.LIZ(interactionBubbleListAssem);
            if (interfaceC1353860lKq != null && (aweme2 = interfaceC1353860lKq.getAweme()) != null) {
                aid = aweme2.getAid();
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            interactionBubbleListAssem.zp();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invisible ");
            InterfaceC1353860lKq interfaceC1353860lKq2 = (InterfaceC1353860lKq) C631370Opb.LIZ(interactionBubbleListAssem);
            if (interfaceC1353860lKq2 != null && (aweme = interfaceC1353860lKq2.getAweme()) != null) {
                aid = aweme.getAid();
            }
            sbLIZ2.append(aid);
            C2188811AlT.LIZIZ(sbLIZ2);
            interactionBubbleListAssem.tp().LJJII();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$75(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Object obj3;
        String aid;
        Aweme aweme;
        InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            long jLongValue = ((Number) c291001Au.LIZ).longValue();
            InteractionSyncVM interactionSyncVM = (InteractionSyncVM) interactionBubbleListAssem.LLJLILLLLZIIL.getValue();
            C724270Sb3 c724270Sb3 = interactionBubbleListAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            InterfaceC1353860lKq interfaceC1353860lKq = (InterfaceC1353860lKq) obj3;
            if (interfaceC1353860lKq == null || (aweme = interfaceC1353860lKq.getAweme()) == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            interactionSyncVM.sr(jLongValue, aid);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$76(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Object obj3;
        String aid;
        Aweme aweme;
        Aweme aweme2;
        InterfaceC1353860lKq interfaceC1353860lKq;
        Aweme aweme3;
        InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            long jLongValue = ((Number) c291001Au.LIZ).longValue();
            boolean zIsLike = false;
            if (jLongValue == 0 && (interfaceC1353860lKq = (InterfaceC1353860lKq) C631370Opb.LIZ(interactionBubbleListAssem)) != null && (aweme3 = interfaceC1353860lKq.getAweme()) != null && aweme3.isLike()) {
                jLongValue = 1;
            }
            InteractionSyncVM interactionSyncVM = (InteractionSyncVM) interactionBubbleListAssem.LLJLILLLLZIIL.getValue();
            C724270Sb3 c724270Sb3 = interactionBubbleListAssem.LLJI;
            Object obj4 = null;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            InterfaceC1353860lKq interfaceC1353860lKq2 = (InterfaceC1353860lKq) obj3;
            if (interfaceC1353860lKq2 == null || (aweme2 = interfaceC1353860lKq2.getAweme()) == null || (aid = aweme2.getAid()) == null) {
                aid = "";
            }
            C724270Sb3 c724270Sb32 = interactionBubbleListAssem.LLJI;
            if (c724270Sb32 != null) {
                obj4 = c724270Sb32.LL;
            }
            InterfaceC1353860lKq interfaceC1353860lKq3 = (InterfaceC1353860lKq) obj4;
            if (interfaceC1353860lKq3 != null && (aweme = interfaceC1353860lKq3.getAweme()) != null) {
                zIsLike = aweme.isLike();
            }
            interactionSyncVM.bD(jLongValue, aid, zIsLike, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$77(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        ((InteractionBubbleListAssem) obj).zp();
        return Unit.LIZ;
    }

    public static final Object invoke$78(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) obj;
        LikeState likeState = (LikeState) obj2;
        if (likeState != null && !likeState.isRefresh()) {
            C1876707Wr.LIZ(likeState, ((InterfaceC1353860lKq) C631370Opb.LIZ(interactionBubbleListAssem)).getAweme().getAid(), new AwS422S0200000_21(interactionBubbleListAssem, likeState, 103));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$79(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) obj;
        CommentPublishState commentPublishState = (CommentPublishState) obj2;
        if (commentPublishState != null) {
            C1876707Wr.LIZ(commentPublishState, ((InterfaceC1353860lKq) C631370Opb.LIZ(interactionBubbleListAssem)).getAweme().getAid(), new AwS422S0200000_21(commentPublishState, interactionBubbleListAssem, 105));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384680m8Y c1384680m8Y;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (danmakuPresentAssem.LLJLLIL && c291001Au != null && (c1384680m8Y = (C1384680m8Y) c291001Au.LIZ) != null) {
            danmakuPresentAssem.Vp(c1384680m8Y);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$80(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) obj;
        CommentDeleteState commentDeleteState = (CommentDeleteState) obj2;
        if (commentDeleteState != null) {
            C1876707Wr.LIZ(commentDeleteState, ((InterfaceC1353860lKq) C631370Opb.LIZ(interactionBubbleListAssem)).getAweme().getAid(), new AwS422S0200000_21(commentDeleteState, interactionBubbleListAssem, 106));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$81(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        UpvoteVideoAssemNew upvoteVideoAssemNew = (UpvoteVideoAssemNew) obj;
        if (obj2 != null) {
            C1360090lUt c1360090lUt = upvoteVideoAssemNew.LLLF;
            c1360090lUt.getClass();
            c1360090lUt.LIZJ = System.nanoTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            upvoteVideoAssemNew.LLLIZZ = Long.valueOf(System.currentTimeMillis());
            upvoteVideoAssemNew.LLLJIL = Boolean.TRUE;
            upvoteVideoAssemNew.LLLLIILL = true;
            upvoteVideoAssemNew.LLLLIIL = true;
            upvoteVideoAssemNew.qq();
            upvoteVideoAssemNew.iq(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$82(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Object obj3;
        UpvoteVideoAssemNew upvoteVideoAssemNew = (UpvoteVideoAssemNew) obj;
        if (obj2 != null) {
            C1360090lUt c1360090lUt = upvoteVideoAssemNew.LLLF;
            c1360090lUt.LIZJ = -1L;
            c1360090lUt.LIZLLL = -1L;
            c1360090lUt.LJ = -1L;
            upvoteVideoAssemNew.iq(false);
            upvoteVideoAssemNew.LLLLIILL = false;
            upvoteVideoAssemNew.qq();
            HashMap<String, Editable> map = C1356800lPa.LIZ;
            C724270Sb3 c724270Sb3 = upvoteVideoAssemNew.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            String strLIZ = C1356800lPa.LIZ(((VideoItemParams) obj3).getAweme().getAid(), null, null);
            if (strLIZ != null) {
                C1356800lPa.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
                C1356800lPa.LIZ.remove(strLIZ);
            }
            ((LinkedHashMap) C1356800lPa.LIZJ).clear();
            if (strLIZ != null) {
                C1359510lTx.LIZ.remove(strLIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$83(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        UpvoteVideoAssemNew upvoteVideoAssemNew = (UpvoteVideoAssemNew) obj;
        Object objLJIJJ = C736680Sv4.LJIJJ(upvoteVideoAssemNew.Ep(), AFwS243S0000000_11.get$arr$(748));
        new C5182020e((C291001Au) obj2, (C291001Au<Boolean>) 479);
        C0T6L.LIZLLL();
        if (Intrinsics.LJFF(objLJIJJ, upvoteVideoAssemNew.Fp().LLILZ)) {
            C013C c013c = new C013C();
            C736680Sv4.LJIJJ(upvoteVideoAssemNew.Ep(), new AwS377S0200000_11(c013c, upvoteVideoAssemNew, 142));
            if (c013c.element && upvoteVideoAssemNew.LLJJIII && upvoteVideoAssemNew.LJJIJL().getVisibility() != 0) {
                InterfaceC1360060lUq interfaceC1360060lUqGp = upvoteVideoAssemNew.Gp();
                if (interfaceC1360060lUqGp != null) {
                    interfaceC1360060lUqGp.LJIIIZ();
                }
                upvoteVideoAssemNew.wq("update_from_video_tag_decision");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$84(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        boolean zContains;
        InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) obj;
        ((Boolean) obj2).booleanValue();
        if (!C1374540lsC.LIZ().isEmpty() && !Intrinsics.LJFF(interfaceC1369790lkX.key(), "download")) {
            zContains = C1374540lsC.LIZ().contains(interfaceC1369790lkX.key());
        } else {
            zContains = true;
        }
        return Boolean.valueOf(zContains);
    }

    public static final Object invoke$85(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String str;
        C1380480m1m c1380480m1m = (C1380480m1m) ((InterfaceC1380500m1o) obj2);
        LPPProtocol lPPProtocol = c1380480m1m.LIZIZ;
        C1380610m1z c1380610m1z = new C1380610m1z(c1380480m1m.LIZ, lPPProtocol);
        C1380550m1t c1380550m1t = null;
        if (lPPProtocol != null && (str = lPPProtocol.rootKey) != null && str.length() != 0) {
            c1380550m1t = new C1380550m1t(str, c1380610m1z);
            c1380550m1t.LJFF();
        }
        return new C1380540m1s(c1380550m1t, 6);
    }

    public static final Object invoke$86(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        LPPProtocol lPPProtocol;
        List<InterfaceC1380630m21> listLIZ;
        String nodeType;
        String str;
        C1379100lzY c1379100lzY;
        InterfaceC1380660m24 interfaceC1380660m24LIZ;
        C1380610m1z c1380610m1zLIZLLL;
        C1380540m1s c1380540m1s = (C1380540m1s) obj;
        InterfaceC1380640m22 interfaceC1380640m22 = c1380540m1s.LIZ;
        if (interfaceC1380640m22 != null && (c1380610m1zLIZLLL = interfaceC1380640m22.LIZLLL()) != null) {
            lPPProtocol = c1380610m1zLIZLLL.LIZIZ;
        } else {
            lPPProtocol = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (interfaceC1380640m22 != null && (listLIZ = interfaceC1380640m22.LIZ()) != null) {
            List listLJJJJLI = C13LP.LJJJJLI(listLIZ);
            ArrayList<InterfaceC1380640m22> arrayList3 = new ArrayList();
            for (Object obj3 : (ArrayList) listLJJJJLI) {
                if (obj3 instanceof InterfaceC1380640m22) {
                    arrayList3.add(obj3);
                }
            }
            for (InterfaceC1380640m22 interfaceC1380640m222 : arrayList3) {
                if (lPPProtocol != null && (interfaceC1380660m24LIZ = lPPProtocol.LIZ(interfaceC1380640m222.getKey())) != null) {
                    nodeType = interfaceC1380660m24LIZ.getNodeType();
                } else {
                    nodeType = null;
                }
                if (Intrinsics.LJFF(nodeType, "container")) {
                    ArrayList arrayList4 = new ArrayList();
                    interfaceC1380640m222.LIZIZ(new AwS230S0300000_21(interfaceC1380640m222, AFwS259S0000000_21.get$arr$(428), new AwS600S0100000_21(arrayList4, (List<String>) 398), 34));
                    C1380620m20 c1380620m20 = new C1380620m20(interfaceC1380640m222, arrayList4);
                    InterfaceC1380660m24 interfaceC1380660m24LIZJ = c1380620m20.LIZ.LIZJ();
                    if ((interfaceC1380660m24LIZJ instanceof C1379100lzY) && (c1379100lzY = (C1379100lzY) interfaceC1380660m24LIZJ) != null) {
                        str = c1379100lzY.LIZ;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "im_container")) {
                        arrayList.add(c1380620m20);
                    } else {
                        arrayList2.add(c1380620m20);
                    }
                }
            }
        }
        c1380540m1s.LIZ(arrayList, EnumC1380570m1v.HORIZONTAL);
        c1380540m1s.LIZ(arrayList2, EnumC1380570m1v.VERTICAL);
        return c1380540m1s;
    }

    public static final Object invoke$87(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String aid;
        Object obj3;
        ExposedCommentAssem exposedCommentAssem = (ExposedCommentAssem) obj;
        if (obj2 != null && exposedCommentAssem.LLLIIIL) {
            Aweme aweme = exposedCommentAssem.LLLF;
            Object obj4 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C724270Sb3 c724270Sb3 = exposedCommentAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (Intrinsics.LJFF(aid, ((VideoItemParams) obj3).getAweme().getAid())) {
                C724270Sb3 c724270Sb32 = exposedCommentAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                }
                String aid2 = ((VideoItemParams) obj4).getAweme().getAid();
                if (aid2 != null && aid2.length() != 0 && !exposedCommentAssem.LLLI && exposedCommentAssem.LLLILZLLLI) {
                    exposedCommentAssem.Up();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$88(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String aid;
        Object obj3;
        ExposedCommentAssem exposedCommentAssem = (ExposedCommentAssem) obj;
        if (obj2 != null && exposedCommentAssem.LLLIIIL) {
            Aweme aweme = exposedCommentAssem.LLLF;
            Object obj4 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C724270Sb3 c724270Sb3 = exposedCommentAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (Intrinsics.LJFF(aid, ((VideoItemParams) obj3).getAweme().getAid())) {
                C724270Sb3 c724270Sb32 = exposedCommentAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                }
                String aid2 = ((VideoItemParams) obj4).getAweme().getAid();
                if (aid2 != null && aid2.length() != 0) {
                    exposedCommentAssem.Bp();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$89(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        String aid;
        Aweme aweme;
        String aid2;
        ExposedCommentAssem exposedCommentAssem = (ExposedCommentAssem) obj;
        C581630MrZ c581630MrZ = (C581630MrZ) obj2;
        if (exposedCommentAssem.LLLILZJ && !exposedCommentAssem.LLLII && !exposedCommentAssem.LLLIIII && !exposedCommentAssem.LLLI && c581630MrZ != null && c581630MrZ.LIZ == 7) {
            String str = c581630MrZ.LIZIZ;
            C724270Sb3 c724270Sb3 = exposedCommentAssem.LLJI;
            Object obj5 = null;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (Intrinsics.LJFF(str, ((VideoItemParams) obj3).getAweme().getAid())) {
                C724270Sb3 c724270Sb32 = exposedCommentAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                } else {
                    obj4 = null;
                }
                String aid3 = ((VideoItemParams) obj4).getAweme().getAid();
                if (aid3 != null && aid3.length() != 0) {
                    String str2 = c581630MrZ.LIZIZ;
                    Aweme aweme2 = exposedCommentAssem.LLLF;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(str2, aid) && (aweme = exposedCommentAssem.LLLF) != null && (aid2 = aweme.getAid()) != null && aid2.length() != 0) {
                        C1387870mDh c1387870mDh = C1387870mDh.LIZ;
                        C724270Sb3 c724270Sb33 = exposedCommentAssem.LLJI;
                        if (c724270Sb33 != null) {
                            obj5 = c724270Sb33.LL;
                        }
                        String aid4 = ((VideoItemParams) obj5).getAweme().getAid();
                        c1387870mDh.getClass();
                        if (C1387870mDh.LJFF(aid4) || !C1387870mDh.LIZIZ()) {
                            exposedCommentAssem.LLLIIII = true;
                        } else if (exposedCommentAssem.Qp()) {
                            exposedCommentAssem.LLLIIIIL = true;
                            exposedCommentAssem.LLLIIII = true;
                        } else {
                            exposedCommentAssem.LLLILZJ = false;
                            exposedCommentAssem.Vp();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        C1384300m7w c1384300m7w;
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c1384300m7w = (C1384300m7w) c291001Au.LIZ) != null) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DanmakuPresentAssem.LLLLII;
            danmakuPresentAssem.Xp(c1384300m7w, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$90(AFwS305S0000000_21 aFwS305S0000000_21, Object obj, Object obj2) {
        String aid;
        Object obj3;
        Object obj4;
        String aid2;
        String aid3;
        Aweme aweme;
        String aid4;
        int iIntValue;
        ExposedCommentAssem exposedCommentAssem = (ExposedCommentAssem) obj;
        C2248751Czx c2248751Czx = (C2248751Czx) obj2;
        if (exposedCommentAssem.LLLIL && exposedCommentAssem.LLLILZ > 0 && !exposedCommentAssem.LLLFFI && !exposedCommentAssem.LLLII && !exposedCommentAssem.LLLIIII && c2248751Czx != null) {
            Aweme aweme2 = c2248751Czx.LIZ;
            Object obj5 = null;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            C724270Sb3 c724270Sb3 = exposedCommentAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (Intrinsics.LJFF(aid, ((VideoItemParams) obj3).getAweme().getAid())) {
                C724270Sb3 c724270Sb32 = exposedCommentAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                } else {
                    obj4 = null;
                }
                String aid5 = ((VideoItemParams) obj4).getAweme().getAid();
                if (aid5 != null && aid5.length() != 0) {
                    Aweme aweme3 = c2248751Czx.LIZ;
                    if (aweme3 != null) {
                        aid2 = aweme3.getAid();
                    } else {
                        aid2 = null;
                    }
                    Aweme aweme4 = exposedCommentAssem.LLLF;
                    if (aweme4 != null) {
                        aid3 = aweme4.getAid();
                    } else {
                        aid3 = null;
                    }
                    if (Intrinsics.LJFF(aid2, aid3) && (aweme = exposedCommentAssem.LLLF) != null && (aid4 = aweme.getAid()) != null && aid4.length() != 0) {
                        C1387870mDh c1387870mDh = C1387870mDh.LIZ;
                        C724270Sb3 c724270Sb33 = exposedCommentAssem.LLJI;
                        if (c724270Sb33 != null) {
                            obj5 = c724270Sb33.LL;
                        }
                        String aid6 = ((VideoItemParams) obj5).getAweme().getAid();
                        c1387870mDh.getClass();
                        if (C1387870mDh.LJFF(aid6) || !C1387870mDh.LIZIZ()) {
                            exposedCommentAssem.LLLIIII = true;
                        } else if (exposedCommentAssem.Qp()) {
                            exposedCommentAssem.LLLIIIIL = true;
                            exposedCommentAssem.LLLIIII = true;
                        } else {
                            Integer num = exposedCommentAssem.LLLFF;
                            if (num != null) {
                                num.intValue();
                                Integer num2 = exposedCommentAssem.LLLFF;
                                if (num2 != null) {
                                    iIntValue = num2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                if (((int) (((double) iIntValue) * (((double) c2248751Czx.LIZJ) / 100.0d))) >= exposedCommentAssem.LLLILZ && !exposedCommentAssem.LLLFFI) {
                                    exposedCommentAssem.LLLFFI = true;
                                    exposedCommentAssem.LLLIL = false;
                                    exposedCommentAssem.Vp();
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
