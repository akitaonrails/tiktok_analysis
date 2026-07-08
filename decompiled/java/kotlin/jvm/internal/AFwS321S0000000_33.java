package kotlin.jvm.internal;

import X.C082N;
import X.C09AY;
import X.C0HIW;
import X.C0HIX;
import X.C0HUY;
import X.C0J55;
import X.C0OB8;
import X.C0RJN;
import X.C0S1U;
import X.C0S7E;
import X.C0SDJ;
import X.C0T0Y;
import X.C0W17;
import X.C123100dR;
import X.C1342130l1v;
import X.C1389300mG0;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1588330rR1;
import X.C1610110s09;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1776900wLA;
import X.C1880107Xz;
import X.C1908930zm7;
import X.C1908940zm8;
import X.C1954807lC;
import X.C197039127h;
import X.C19746312Np;
import X.C19746412Nq;
import X.C1A1F;
import X.C1A1H;
import X.C1A1J;
import X.C1A1K;
import X.C1A1M;
import X.C1A1S;
import X.C1EAU;
import X.C20684815ws;
import X.C21647019ng;
import X.C21697919vt;
import X.C2174831A9p;
import X.C2176211AEx;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189731Amx;
import X.C2276471E8n;
import X.C2344009Gk;
import X.C291001Au;
import X.C300900Bqq;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C570060MXk;
import X.C570110MXp;
import X.C584770Mwd;
import X.C631370Opb;
import X.C675940QfI;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C731170SmB;
import X.C734370SrL;
import X.C786410Ut5;
import X.EnumC19746112Nn;
import X.EnumC21697819vs;
import X.EnumC2174841A9q;
import X.EnumC609120Nuo;
import X.EnumC714710S1t;
import X.EnumC714720S1u;
import X.InterfaceC1588310rQz;
import X.InterfaceC609180Nuu;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS133S0100000_33;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.digg.LongPressDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssemV2;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxTrigger;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxTriggerV2;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickReplyViewModel;
import com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMViewModel;
import com.ss.android.ugc.aweme.feed.assem.quickreply.UpdateContentionAbility;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnVM;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnVMV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.IFriendsV3VHAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendV3LiveAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveTagAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendV3PhotoAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardVideoContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.track.FriendsV3LiveTrackAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video.FriendsV3VideoAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseAwemeCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AFwS321S0000000_33 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(46);
    public final int $t;

    public static AFwS321S0000000_33 get$arr$(int i) {
        AFwS321S0000000_33 aFwS321S0000000_33 = (AFwS321S0000000_33) arr$.get(i);
        if (aFwS321S0000000_33 != null) {
            return aFwS321S0000000_33;
        }
        arr$.compareAndSet(i, null, new AFwS321S0000000_33(i));
        return (AFwS321S0000000_33) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS321S0000000_33(int i) {
        super(2);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        View viewFindViewById;
        UIAssem uIAssem = (UIAssem) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        View viewFindViewById2 = null;
        if (zBooleanValue) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.q9m);
            }
            C337180DJs.LIZ(viewFindViewById2);
        } else {
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById = viewLJJIJL2.findViewById(R.id.zf);
            } else {
                viewFindViewById = null;
            }
            C337180DJs.LIZJ(viewFindViewById);
            C675940QfI.LIZJ("rd_photo_search_button_show", null, AFwS279S0000000_33.get$arr$(100));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && Intrinsics.LJFF(c291001Au.LIZ(), Boolean.TRUE)) {
            videoRelationBtnAssem.Gp().vQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        View view;
        boolean zLIZ;
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null) && videoRelationBtnAssem.Gp().LL != null && (((view = videoRelationBtnAssem.LLJLLIL) == null || view.getVisibility() != 0) && (zLIZ = C2174831A9p.LIZ(videoRelationBtnAssem.LLL, videoRelationBtnAssem.Gp().LL)))) {
            videoRelationBtnAssem.Gp().wQ2(zLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            videoRelationBtnAssem.Jp(false);
            C197039127h c197039127h = videoRelationBtnAssem.LLJZIJLIL;
            if (c197039127h != null && c197039127h.getVisibility() == 0) {
                videoRelationBtnAssem.Ip();
                C197039127h c197039127h2 = videoRelationBtnAssem.LLJZIJLIL;
                if (c197039127h2 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h2, 8);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        ((VideoRelationBtnAssem) obj).Jp(true);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        ((VideoRelationBtnAssem) obj).Jp(true);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) obj;
        Boolean bool = (Boolean) ((C291001Au) obj2).LIZ();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            Aweme aweme = videoRelationBtnAssem.LLL;
            if (aweme != null && aweme.getAuthor() != null) {
                if (zBooleanValue) {
                    HandlerHook.viewPost(videoRelationBtnAssem.LJJIJL(), new ARunnableS133S0100000_33(videoRelationBtnAssem, 51));
                    videoRelationBtnAssem.Jp(false);
                } else {
                    videoRelationBtnAssem.Ip();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        Aweme aweme = videoRelationBtnAssemV2.LLL;
        if (aweme != null) {
            C2276471E8n.LIZIZ.d("VideoRelationBtnAssemV2", "like the video, extend follow button");
            if (c291001Au != null && Intrinsics.LJFF(c291001Au.LIZ(), Boolean.TRUE)) {
                VideoRelationBtnVMV2 videoRelationBtnVMV2Ip = videoRelationBtnAssemV2.Ip();
                videoRelationBtnVMV2Ip.getClass();
                videoRelationBtnVMV2Ip.withState(new AwS399S0200000_33(videoRelationBtnVMV2Ip, aweme, 41));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Aweme aweme;
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null) && videoRelationBtnAssemV2.Ip().LL != null && videoRelationBtnAssemV2.Ip().vQ2(videoRelationBtnAssemV2.Ip().LL) && (aweme = videoRelationBtnAssemV2.LLL) != null) {
            VideoRelationBtnVMV2 videoRelationBtnVMV2Ip = videoRelationBtnAssemV2.Ip();
            videoRelationBtnVMV2Ip.getClass();
            if (C584770Mwd.LIZ(aweme)) {
                videoRelationBtnVMV2Ip.wQ2(aweme, EnumC2174841A9q.FOLLOW_SINGLE);
            } else {
                videoRelationBtnVMV2Ip.wQ2(aweme, EnumC2174841A9q.FOLLOW_DUAL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) obj;
        if (!C300900Bqq.LIZ() || obj2 != null) {
            videoRelationBtnAssemV2.Qp(false);
            C197039127h c197039127h = videoRelationBtnAssemV2.LLJZIJLIL;
            if (c197039127h != null && c197039127h.getVisibility() == 0) {
                videoRelationBtnAssemV2.Jp();
                C197039127h c197039127h2 = videoRelationBtnAssemV2.LLJZIJLIL;
                if (c197039127h2 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h2, 8);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        ((VideoRelationBtnAssemV2) obj).Qp(true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Integer numValueOf;
        String str;
        Rect rectJg1;
        boolean z;
        float fLIZIZ;
        int i;
        int i2;
        LongPressDiggAssem longPressDiggAssem = (LongPressDiggAssem) obj;
        C731170SmB c731170SmB = (C731170SmB) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive long press digg event ");
        String str2 = null;
        if (c731170SmB != null) {
            numValueOf = Integer.valueOf(c731170SmB.LIZIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", aid = ");
        if (c731170SmB != null) {
            str = c731170SmB.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", current aid = ");
        sbLIZ.append(longPressDiggAssem.LLJLL);
        sbLIZ.append(", need perform = ");
        if (c731170SmB != null) {
            str2 = c731170SmB.LIZ;
        }
        sbLIZ.append(Intrinsics.LJFF(str2, longPressDiggAssem.LLJLL));
        sbLIZ.append(", currentState = ");
        sbLIZ.append(longPressDiggAssem.LLLIIIIL);
        sbLIZ.append(", needDowngrade = ");
        sbLIZ.append(longPressDiggAssem.zp());
        C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (c731170SmB != null && Intrinsics.LJFF(c731170SmB.LIZ, longPressDiggAssem.LLJLL)) {
            int i3 = c731170SmB.LIZIZ;
            if (i3 == 1 && 1 != 0 && longPressDiggAssem.LLLIIIIL == 0) {
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(longPressDiggAssem.LLJLL);
                sbLIZ2.append(" perform digg long press");
                C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ2));
                longPressDiggAssem.LLLIIIIL = 1;
                VideoDiggAssemAbility videoDiggAssemAbility = (VideoDiggAssemAbility) longPressDiggAssem.LLJL.getValue();
                if (videoDiggAssemAbility != null && (rectJg1 = videoDiggAssemAbility.Jg1()) != null) {
                    Context context = longPressDiggAssem.getContext();
                    if (context != null && C426750GoL.LIZLLL(context)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        fLIZIZ = rectJg1.right + C418440Gaw.LIZIZ(14);
                    } else {
                        fLIZIZ = (rectJg1.left - longPressDiggAssem.LLLI) - C418440Gaw.LIZIZ(14);
                    }
                    float fHeight = (rectJg1.top + (rectJg1.height() / 2.0f)) - (longPressDiggAssem.LLLII / 2.0f);
                    int[] iArr = new int[2];
                    longPressDiggAssem.getContentView().getLocationOnScreen(iArr);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("view width = ");
                    sbLIZ3.append(longPressDiggAssem.LLLI);
                    sbLIZ3.append(", view height = ");
                    sbLIZ3.append(longPressDiggAssem.LLLII);
                    sbLIZ3.append(", rect = ");
                    sbLIZ3.append(rectJg1);
                    sbLIZ3.append(", parentLocation = (");
                    sbLIZ3.append(iArr[0]);
                    sbLIZ3.append(',');
                    sbLIZ3.append(iArr[1]);
                    sbLIZ3.append("), x = ");
                    sbLIZ3.append(fLIZIZ);
                    sbLIZ3.append(", y = ");
                    sbLIZ3.append(fHeight);
                    sbLIZ3.append(' ');
                    C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ3));
                    C786410Ut5.Fd(longPressDiggAssem.up(), fLIZIZ - iArr[0]);
                    C786410Ut5.Ld(longPressDiggAssem.up(), fHeight - iArr[1]);
                    C786410Ut5.LJLLLLLL(0, longPressDiggAssem.getContentView());
                    Context context2 = longPressDiggAssem.getContext();
                    if (context2 != null && C426750GoL.LIZLLL(context2)) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C19746412Nq("scaleX", new C0HIW(0.0f, 1.0f)), new C19746412Nq("scaleY", new C0HIX(0.0f, 1.0f)));
                    if (!longPressDiggAssem.zp()) {
                        listLJIILJJIL.add(new C19746412Nq("translateX", new C082N(longPressDiggAssem.yp() + (i * longPressDiggAssem.LLLILZ), longPressDiggAssem.yp())));
                    }
                    Context context3 = longPressDiggAssem.up().getContext();
                    View viewUp = longPressDiggAssem.up();
                    EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.BEZIER;
                    C21647019ng c21647019ng = new C21647019ng(context3, viewUp, new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.4f), new C1342130l1v(0.8f), new C1342130l1v(0.74f), new C1342130l1v(1.0f), 250L), listLJIILJJIL), false);
                    c21647019ng.LJI(true);
                    ((ArrayList) longPressDiggAssem.LLLIIL).add(c21647019ng);
                    if (!longPressDiggAssem.zp()) {
                        C21647019ng c21647019ng2 = new C21647019ng(longPressDiggAssem.up().getContext(), longPressDiggAssem.up(), new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 100L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(0.0f, 1.0f)))), false);
                        c21647019ng2.LJI(true);
                        ((ArrayList) longPressDiggAssem.LLLIIL).add(c21647019ng2);
                    }
                    Context context4 = longPressDiggAssem.getContext();
                    if (context4 != null && C426750GoL.LIZLLL(context4)) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    List list = (List) C1EAU.LJFF.getValue();
                    C21647019ng c21647019ng3 = new C21647019ng(((View) longPressDiggAssem.LLL.getValue()).getContext(), (View) longPressDiggAssem.LLL.getValue(), new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(((Number) ListProtector.get(list, 0)).floatValue()), new C1342130l1v(((Number) ListProtector.get(list, 1)).floatValue()), new C1342130l1v(((Number) ListProtector.get(list, 2)).floatValue()), new C1342130l1v(((Number) ListProtector.get(list, 3)).floatValue()), ((Number) longPressDiggAssem.LLLIZZ.getValue()).longValue()), Collections.singletonList(new C19746412Nq("translateX", new C082N(i2 * longPressDiggAssem.LLLILZLLLI * (-1.0f), 0.0f)))), false);
                    c21647019ng3.LIZJ("translateX", (C2189731Amx) longPressDiggAssem.LLLJ.getValue());
                    c21647019ng3.LJI(true);
                    ((ArrayList) longPressDiggAssem.LLLIIL).add(c21647019ng3);
                    if (!longPressDiggAssem.zp()) {
                        ArrayList arrayList = new ArrayList();
                        long jLongValue = ((Number) C1EAU.LJI.getValue()).longValue();
                        if (1 <= jLongValue) {
                            long j = 1;
                            while (true) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("rotation_");
                                sbLIZ4.append(j);
                                sbLIZ4.append("_1");
                                arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ4), new C1880107Xz(-8.0f, 8.0f)));
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("rotation_");
                                sbLIZ5.append(j);
                                sbLIZ5.append("_2");
                                arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ5), new C1880107Xz(8.0f, -8.0f)));
                                if (j == jLongValue) {
                                    break;
                                }
                                j++;
                            }
                        }
                        arrayList.add(new C19746412Nq("rotation_x_3", new C1880107Xz(-8.0f, 0.0f)));
                        C21647019ng c21647019ng4 = new C21647019ng(((View) longPressDiggAssem.LLLFF.getValue()).getContext(), (View) longPressDiggAssem.LLLFF.getValue(), new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.65f), new C1342130l1v(0.0f), new C1342130l1v(0.35f), new C1342130l1v(1.0f), 120L), arrayList), false);
                        c21647019ng4.LJI(false);
                        ((ArrayList) longPressDiggAssem.LLLIIL).add(c21647019ng4);
                    }
                }
            } else if (i3 == 2 && longPressDiggAssem.LLLIIIIL == 1) {
                longPressDiggAssem.LLLIIIIL = 3;
                int i5 = C2187451AjH.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(longPressDiggAssem.LLJLL);
                sbLIZ6.append(" perform dismiss, current state = ");
                sbLIZ6.append(longPressDiggAssem.LLLIIIIL);
                C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ6));
                longPressDiggAssem.Fp();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        ((VideoRelationBtnAssemV2) obj).Qp(true);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Aweme aweme;
        String uid;
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) obj;
        FollowStatusEvent followStatusEvent = (FollowStatusEvent) obj2;
        VideoRelationBtnVMV2 videoRelationBtnVMV2Ip = videoRelationBtnAssemV2.Ip();
        List<Integer> list = videoRelationBtnAssemV2.LLLIL;
        videoRelationBtnVMV2Ip.getClass();
        if (followStatusEvent != null) {
            FollowStatus followStatus = followStatusEvent.status;
            VideoItemParams item = videoRelationBtnVMV2Ip.getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                User author = aweme.getAuthor();
                if (author != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, followStatus.getUserId())) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        author2.setFollowStatus(followStatus.getFollowStatus());
                    }
                    videoRelationBtnVMV2Ip.withState(new AwS127S0400000_33(videoRelationBtnVMV2Ip, (VideoRelationBtnVMV2) followStatus, (FollowStatus) aweme, (Aweme) list, (List<Integer>) 1));
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        String string;
        String str;
        User user;
        FriendV3LiveAssem friendV3LiveAssem = (FriendV3LiveAssem) obj;
        int i = C21697919vt.LIZ[((EnumC21697819vs) obj2).ordinal()];
        String string2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    friendV3LiveAssem.sp(friendV3LiveAssem.Bp());
                    if (friendV3LiveAssem.Gp()) {
                        C786410Ut5.LJLLLLLL(0, friendV3LiveAssem.zp());
                        TuxTextView tuxTextViewZp = friendV3LiveAssem.zp();
                        Context context = friendV3LiveAssem.getContext();
                        if (context != null) {
                            Object[] objArr = new Object[1];
                            LiveRoomStruct liveRoomStructBp = friendV3LiveAssem.Bp();
                            if (liveRoomStructBp != null && (user = liveRoomStructBp.owner) != null) {
                                string2 = user.getNickname();
                            }
                            objArr[0] = string2;
                            string2 = context.getString(2131830200, objArr);
                        }
                        tuxTextViewZp.setText(string2);
                    } else {
                        C786410Ut5.LJLLLLLL(8, friendV3LiveAssem.zp());
                    }
                    C786410Ut5.I7(new AbS712S0100000_33(friendV3LiveAssem, 5), friendV3LiveAssem.up());
                } else {
                    throw new C1954807lC();
                }
            } else if (Intrinsics.LJFF(((C0SDJ) ((AssemViewModel) friendV3LiveAssem.LLJZ.getValue()).getState()).LL, Boolean.TRUE)) {
                HandlerHook.viewPost(friendV3LiveAssem.LJJIJL(), new ARunnableS116S0100000_16(friendV3LiveAssem, 115));
                FriendsV3LivePlayerAbility friendsV3LivePlayerAbility = (FriendsV3LivePlayerAbility) friendV3LiveAssem.LLLF.getValue();
                if (friendsV3LivePlayerAbility != null) {
                    friendsV3LivePlayerAbility.ph2((InterfaceC1588310rQz) friendV3LiveAssem.LLLFZ.getValue(), false);
                }
            }
        } else {
            C786410Ut5.LJLLLLLL(0, friendV3LiveAssem.zp());
            TuxTextView tuxTextViewZp2 = friendV3LiveAssem.zp();
            Context context2 = friendV3LiveAssem.getContext();
            if (context2 != null) {
                string = context2.getString(2131855011);
            } else {
                string = null;
            }
            tuxTextViewZp2.setText(string);
            C786410Ut5.LJLLLLLL(0, friendV3LiveAssem.yp());
            C786410Ut5.p9(friendV3LiveAssem.up(), null);
            FriendsV3LivePlayerAbility friendsV3LivePlayerAbility2 = (FriendsV3LivePlayerAbility) friendV3LiveAssem.LLLF.getValue();
            if (friendsV3LivePlayerAbility2 != null) {
                friendsV3LivePlayerAbility2.oT0((InterfaceC1588310rQz) friendV3LiveAssem.LLLFZ.getValue());
            }
            LiveRoomStruct liveRoomStructBp2 = friendV3LiveAssem.Bp();
            if (liveRoomStructBp2 != null) {
                str = liveRoomStructBp2.title;
            } else {
                str = null;
            }
            if (!C123100dR.LIZ(str)) {
                TextView textView = (TextView) friendV3LiveAssem.LLJLLIL.getValue();
                Context context3 = friendV3LiveAssem.getContext();
                if (context3 != null) {
                    string2 = context3.getString(2131855011);
                }
                textView.setText(string2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        FriendsV3BaseAwemeCell friendsV3BaseAwemeCellSJ1;
        IFriendsV3VHAbility iFriendsV3VHAbility;
        FriendsV3BaseAwemeCell friendsV3BaseAwemeCellSJ12;
        C0RJN c0rjnLIZIZ;
        FriendV3PhotoAssem friendV3PhotoAssem = (FriendV3PhotoAssem) obj;
        if (Intrinsics.LJFF(obj2, Boolean.TRUE)) {
            friendV3PhotoAssem.LLLIILIL = true;
            Aweme awemeLJIIIIZZ = friendV3PhotoAssem.LJIIIIZZ();
            Fragment fragmentLJI = C724240Sb0.LJI(friendV3PhotoAssem);
            if (fragmentLJI != null) {
                c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
            } else {
                c0rjnLIZIZ = null;
            }
            C1588330rR1.LJ(awemeLJIIIIZZ, C1389300mG0.LIZ(c0rjnLIZIZ));
        }
        if (System.currentTimeMillis() - friendV3PhotoAssem.LLLIIII >= Mp4ScreenVideoLoadTimeout.CONTROL && friendV3PhotoAssem.LLLIILIL && Intrinsics.LJFF(obj2, Boolean.FALSE) && !friendV3PhotoAssem.LLLIIIL) {
            Aweme awemeLJIIIIZZ2 = friendV3PhotoAssem.LJIIIIZZ();
            if (awemeLJIIIIZZ2 != null && C0S7E.LIZ(awemeLJIIIIZZ2) > 1) {
                if (friendV3PhotoAssem.LLLIIL && (iFriendsV3VHAbility = (IFriendsV3VHAbility) friendV3PhotoAssem.LLLILZ.getValue()) != null && (friendsV3BaseAwemeCellSJ12 = iFriendsV3VHAbility.SJ1()) != null) {
                    FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) friendV3PhotoAssem.LLLJ.getValue();
                    if (friendsV3PlayerAbility != null) {
                        friendsV3PlayerAbility.aE1(friendsV3BaseAwemeCellSJ12);
                    }
                    friendV3PhotoAssem.LLLIIIL = true;
                }
            } else {
                IFriendsV3VHAbility iFriendsV3VHAbility2 = (IFriendsV3VHAbility) friendV3PhotoAssem.LLLILZ.getValue();
                if (iFriendsV3VHAbility2 != null && (friendsV3BaseAwemeCellSJ1 = iFriendsV3VHAbility2.SJ1()) != null) {
                    FriendsV3PlayerAbility friendsV3PlayerAbility2 = (FriendsV3PlayerAbility) friendV3PhotoAssem.LLLJ.getValue();
                    if (friendsV3PlayerAbility2 != null) {
                        friendsV3PlayerAbility2.aE1(friendsV3BaseAwemeCellSJ1);
                    }
                    friendV3PhotoAssem.LLLIIIL = true;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        IFriendsV3VHAbility iFriendsV3VHAbility;
        FriendsV3BaseAwemeCell friendsV3BaseAwemeCellSJ1;
        FriendsV3RepostCardPhotoContentAssem friendsV3RepostCardPhotoContentAssem = (FriendsV3RepostCardPhotoContentAssem) obj;
        if (Intrinsics.LJFF(obj2, Boolean.TRUE)) {
            friendsV3RepostCardPhotoContentAssem.LLLIIII = true;
        }
        if (System.currentTimeMillis() - friendsV3RepostCardPhotoContentAssem.LLLI >= Mp4ScreenVideoLoadTimeout.CONTROL && friendsV3RepostCardPhotoContentAssem.LLLIIII && Intrinsics.LJFF(obj2, Boolean.FALSE) && !friendsV3RepostCardPhotoContentAssem.LLLII && (iFriendsV3VHAbility = (IFriendsV3VHAbility) friendsV3RepostCardPhotoContentAssem.LLLIIIIL.getValue()) != null && (friendsV3BaseAwemeCellSJ1 = iFriendsV3VHAbility.SJ1()) != null) {
            FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) friendsV3RepostCardPhotoContentAssem.LLLIL.getValue();
            if (friendsV3PlayerAbility != null) {
                friendsV3PlayerAbility.aE1(friendsV3BaseAwemeCellSJ1);
            }
            friendsV3RepostCardPhotoContentAssem.LLLII = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$25(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        String str;
        Object obj3;
        FriendsV3RepostCardVideoContentAssem friendsV3RepostCardVideoContentAssem = (FriendsV3RepostCardVideoContentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null && Intrinsics.LJFF(str, ((C0OB8) C631370Opb.LIZ(friendsV3RepostCardVideoContentAssem)).getAweme().getAid())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRenderFirstFrameEvent, aid=");
            C724270Sb3 c724270Sb3 = friendsV3RepostCardVideoContentAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            sbLIZ.append(((C0OB8) obj3).getAweme().getAid());
            C0W17.LIZJ("FriendsV3RepostVideoContentAssem", C2188811AlT.LIZIZ(sbLIZ));
            friendsV3RepostCardVideoContentAssem.Ap(str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$26(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        String str;
        FriendsV3PlayerAbility friendsV3PlayerAbility;
        FriendsV3RepostCardVideoContentAssem friendsV3RepostCardVideoContentAssem = (FriendsV3RepostCardVideoContentAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null && Intrinsics.LJFF(str, ((C0OB8) C631370Opb.LIZ(friendsV3RepostCardVideoContentAssem)).getAweme().getAid())) {
            Fragment fragmentLJI = C724240Sb0.LJI(friendsV3RepostCardVideoContentAssem);
            Object obj3 = null;
            if (fragmentLJI != null && (friendsV3PlayerAbility = (FriendsV3PlayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3PlayerAbility.class, null)) != null && friendsV3PlayerAbility.isPlaying()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onResumePlayEvent, aid=");
                C724270Sb3 c724270Sb3 = friendsV3RepostCardVideoContentAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                }
                sbLIZ.append(((C0OB8) obj3).getAweme().getAid());
                C0W17.LIZJ("FriendsV3RepostVideoContentAssem", C2188811AlT.LIZIZ(sbLIZ));
                friendsV3RepostCardVideoContentAssem.Ap(str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$27(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        String str;
        Object obj3;
        FriendsV3VideoAssem friendsV3VideoAssem = (FriendsV3VideoAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null && Intrinsics.LJFF(str, ((C0OB8) C631370Opb.LIZ(friendsV3VideoAssem)).getAweme().getAid())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRenderFirstFrameEvent, aid=");
            C724270Sb3 c724270Sb3 = friendsV3VideoAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            sbLIZ.append(((C0OB8) obj3).getAweme().getAid());
            C0W17.LIZJ("FriendsV3VideoAssem", C2188811AlT.LIZIZ(sbLIZ));
            friendsV3VideoAssem.Fp(str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$28(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        String str;
        FriendsV3PlayerAbility friendsV3PlayerAbility;
        FriendsV3VideoAssem friendsV3VideoAssem = (FriendsV3VideoAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null && Intrinsics.LJFF(str, ((C0OB8) C631370Opb.LIZ(friendsV3VideoAssem)).getAweme().getAid())) {
            Fragment fragmentLJI = C724240Sb0.LJI(friendsV3VideoAssem);
            Object obj3 = null;
            if (fragmentLJI != null && (friendsV3PlayerAbility = (FriendsV3PlayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3PlayerAbility.class, null)) != null && friendsV3PlayerAbility.isPlaying()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onResumePlayEvent, aid=");
                C724270Sb3 c724270Sb3 = friendsV3VideoAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                }
                sbLIZ.append(((C0OB8) obj3).getAweme().getAid());
                C0W17.LIZJ("FriendsV3VideoAssem", C2188811AlT.LIZIZ(sbLIZ));
                friendsV3VideoAssem.Fp(str);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        View view = (View) ((FriendsV3LiveTagAssem) obj).LLJJJJJIL.getValue();
        int i = 0;
        if (obj2 == EnumC21697819vs.FINISHED) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$30(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$31(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$32(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$33(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$34(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        C570060MXk c570060MXk;
        MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2 = (MUFQuickDMBoxAssemV2) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c570060MXk = (C570060MXk) c291001Au.LIZ) != null) {
            InterfaceC609180Nuu interfaceC609180Nuu = c570060MXk.LIZIZ;
            if ((interfaceC609180Nuu instanceof C570110MXp) && ((C570110MXp) interfaceC609180Nuu).LIZ == EnumC609120Nuo.UPVOTE_GUIDE) {
                MUFQuickReplyViewModel mUFQuickReplyViewModelGp = mUFQuickDMBoxAssemV2.Gp();
                mUFQuickReplyViewModelGp.getClass();
                mUFQuickReplyViewModelGp.setStateImmediate(new AwS45S0010000_33(6));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Object objLIZ;
        MUFQuickDMBoxAssem mUFQuickDMBoxAssem = (MUFQuickDMBoxAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            objLIZ = c291001Au.LIZ();
        } else {
            objLIZ = null;
        }
        if (objLIZ == C0S1U.EMOJI) {
            mUFQuickDMBoxAssem.Gp().AQ2();
            mUFQuickDMBoxAssem.Qp(EnumC714710S1t.CLICK_OUTER_EMOJI);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$36(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Object objLIZ;
        MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2 = (MUFQuickDMBoxAssemV2) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        Object obj3 = null;
        if (c291001Au != null) {
            objLIZ = c291001Au.LIZ();
        } else {
            objLIZ = null;
        }
        if (objLIZ == C0S1U.REPLY_BOX) {
            mUFQuickDMBoxAssemV2.Gp().CQ2(EnumC714720S1u.CLICK_INPUT_BOX);
            MUFQuickReplyViewModel mUFQuickReplyViewModelGp = mUFQuickDMBoxAssemV2.Gp();
            C724270Sb3 c724270Sb3 = mUFQuickDMBoxAssemV2.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            }
            mUFQuickReplyViewModelGp.getClass();
            C1A1M c1a1m = C1A1M.LIZIZ;
            c1a1m.LIZIZ(((VideoItemParams) obj3).getAweme().getAid());
            C1A1S c1a1sLIZIZ = C1A1H.LIZIZ(((C1A1J) mUFQuickReplyViewModelGp.getState()).LLILLJJLI.LIZ);
            if (c1a1sLIZIZ != null) {
                c1a1m.LJI(c1a1sLIZIZ);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$37(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        C570060MXk c570060MXk;
        MUFQuickDMBoxAssem mUFQuickDMBoxAssem = (MUFQuickDMBoxAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c570060MXk = (C570060MXk) c291001Au.LIZ) != null) {
            InterfaceC609180Nuu interfaceC609180Nuu = c570060MXk.LIZIZ;
            if ((interfaceC609180Nuu instanceof C570110MXp) && ((C570110MXp) interfaceC609180Nuu).LIZ == EnumC609120Nuo.UPVOTE_GUIDE) {
                MUFQuickReplyViewModel mUFQuickReplyViewModelGp = mUFQuickDMBoxAssem.Gp();
                mUFQuickReplyViewModelGp.getClass();
                mUFQuickReplyViewModelGp.setStateImmediate(new AwS45S0010000_33(6));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Object objLIZ;
        MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2 = (MUFQuickDMBoxAssemV2) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            objLIZ = c291001Au.LIZ();
        } else {
            objLIZ = null;
        }
        if (objLIZ == C0S1U.EMOJI) {
            mUFQuickDMBoxAssemV2.Gp().AQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Object obj3;
        MUFQuickDMBoxAssem mUFQuickDMBoxAssem = (MUFQuickDMBoxAssem) obj;
        C734370SrL c734370SrL = (C734370SrL) obj2;
        if (c734370SrL != null && Intrinsics.LJFF(c734370SrL.LIZ, ((VideoItemParams) C631370Opb.LIZ(mUFQuickDMBoxAssem)).getAweme().getAid())) {
            UpdateContentionAbility updateContentionAbilityIp = mUFQuickDMBoxAssem.Ip();
            Object obj4 = null;
            if (updateContentionAbilityIp != null) {
                C724270Sb3 c724270Sb3 = mUFQuickDMBoxAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                if (updateContentionAbilityIp.h2((VideoItemParams) obj3)) {
                    C724270Sb3 c724270Sb32 = mUFQuickDMBoxAssem.LLJI;
                    if (c724270Sb32 != null) {
                        obj4 = c724270Sb32.LL;
                    }
                    mUFQuickDMBoxAssem.Vp((VideoItemParams) obj4, C1A1K.LIKE_MUF_VIDEO);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        FollowStatus followStatus;
        String userId;
        String authorUid;
        Object obj3;
        Object obj4;
        UpdateContentionAbility updateContentionAbilityIp;
        Object obj5;
        User author;
        MUFQuickDMBoxAssem mUFQuickDMBoxAssem = (MUFQuickDMBoxAssem) obj;
        FollowStatusEvent followStatusEvent = (FollowStatusEvent) obj2;
        if (followStatusEvent != null && (followStatus = followStatusEvent.status) != null && (userId = followStatus.getUserId()) != null) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(mUFQuickDMBoxAssem)).getAweme();
            Object obj6 = null;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            if (Intrinsics.LJFF(userId, authorUid)) {
                C724270Sb3 c724270Sb3 = mUFQuickDMBoxAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme2 = ((VideoItemParams) obj3).getAweme();
                if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                    author.setFollowStatus(followStatusEvent.status.getFollowStatus());
                }
                int i = MUFQuickDMBoxTrigger.LLJLL;
                C724270Sb3 c724270Sb32 = mUFQuickDMBoxAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                } else {
                    obj4 = null;
                }
                if (C1908930zm7.LIZ((VideoItemParams) obj4) && (updateContentionAbilityIp = mUFQuickDMBoxAssem.Ip()) != null) {
                    C724270Sb3 c724270Sb33 = mUFQuickDMBoxAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj5 = c724270Sb33.LL;
                    } else {
                        obj5 = null;
                    }
                    if (updateContentionAbilityIp.h2((VideoItemParams) obj5)) {
                        C724270Sb3 c724270Sb34 = mUFQuickDMBoxAssem.LLJI;
                        if (c724270Sb34 != null) {
                            obj6 = c724270Sb34.LL;
                        }
                        mUFQuickDMBoxAssem.Vp((VideoItemParams) obj6, C1A1K.FRIENDS_STABLE_SHOW);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Object obj3;
        MUFQuickDMBoxTriggerV2 mUFQuickDMBoxTriggerV2 = (MUFQuickDMBoxTriggerV2) obj;
        if (obj2 != null) {
            MUFQuickReplyViewModel mUFQuickReplyViewModelYp = mUFQuickDMBoxTriggerV2.yp();
            mUFQuickReplyViewModelYp.getClass();
            mUFQuickReplyViewModelYp.setStateImmediate(new AwS612S0100000_33(mUFQuickReplyViewModelYp, 214));
            ((LinkedHashMap) ((QuickDMViewModel) mUFQuickDMBoxTriggerV2.LLJLL.getValue(mUFQuickDMBoxTriggerV2, MUFQuickDMBoxTriggerV2.LLL[0])).LL).clear();
            C724270Sb3 c724270Sb3 = mUFQuickDMBoxTriggerV2.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (C1A1F.LIZIZ(((VideoItemParams) obj3).mEventType)) {
                mUFQuickDMBoxTriggerV2.zp(C1A1K.FRIENDS_STABLE_SHOW);
            } else {
                C337180DJs.LIZ(mUFQuickDMBoxTriggerV2.LJJIJL());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$41(kotlin.jvm.internal.AFwS321S0000000_33 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem r3 = (com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem) r3
            if (r4 == 0) goto L53
            com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickReplyViewModel r2 = r3.Gp()
            r2.getClass()
            kotlin.jvm.internal.AwS612S0100000_33 r1 = new kotlin.jvm.internal.AwS612S0100000_33
            r0 = 214(0xd6, float:3.0E-43)
            r1.<init>(r2, r0)
            r2.setStateImmediate(r1)
            com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMViewModel r0 = r3.Fp()
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.LL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            X.0Sb3 r0 = r3.LLJI
            r2 = 0
            if (r0 == 0) goto L60
            java.lang.Object r0 = r0.LL
        L27:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r0 = r0.mEventType
            boolean r0 = X.C1A1F.LIZIZ(r0)
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.feed.assem.quickreply.UpdateContentionAbility r1 = r3.Ip()
            if (r1 == 0) goto L58
            X.0Sb3 r0 = r3.LLJI
            if (r0 == 0) goto L56
            java.lang.Object r0 = r0.LL
        L3d:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            boolean r1 = r1.h2(r0)
            r0 = 1
            if (r1 != r0) goto L58
            X.0Sb3 r0 = r3.LLJI
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r0.LL
        L4c:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            X.1A1K r0 = X.C1A1K.FRIENDS_STABLE_SHOW
            r3.Vp(r2, r0)
        L53:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L56:
            r0 = r2
            goto L3d
        L58:
            android.view.View r0 = r3.LJJIJL()
            X.C337180DJs.LIZ(r0)
            goto L53
        L60:
            r0 = r2
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS321S0000000_33.invoke$41(kotlin.jvm.internal.AFwS321S0000000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$42(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        MUFQuickDMBoxTriggerV2 mUFQuickDMBoxTriggerV2 = (MUFQuickDMBoxTriggerV2) obj;
        C734370SrL c734370SrL = (C734370SrL) obj2;
        if (c734370SrL != null && Intrinsics.LJFF(c734370SrL.LIZ, ((VideoItemParams) C631370Opb.LIZ(mUFQuickDMBoxTriggerV2)).getAweme().getAid())) {
            mUFQuickDMBoxTriggerV2.zp(C1A1K.LIKE_MUF_VIDEO);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        boolean z;
        FriendsV3LiveTrackAssem friendsV3LiveTrackAssem = (FriendsV3LiveTrackAssem) obj;
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                friendsV3LiveTrackAssem.LLJJIJIL = System.currentTimeMillis();
            } else if (friendsV3LiveTrackAssem.LLJJIJIL > 0) {
                friendsV3LiveTrackAssem.LLJJIII = System.currentTimeMillis() - friendsV3LiveTrackAssem.LLJJIJIL;
                if (friendsV3LiveTrackAssem.LLJJJ > 0) {
                    friendsV3LiveTrackAssem.LLJJIJI = System.currentTimeMillis() - friendsV3LiveTrackAssem.LLJJJ;
                }
                if (friendsV3LiveTrackAssem.LLJJJIL > 0) {
                    z = true;
                } else {
                    z = false;
                }
                friendsV3LiveTrackAssem.Eo();
                friendsV3LiveTrackAssem.Co(z);
                friendsV3LiveTrackAssem.LLJJJ = 0L;
                friendsV3LiveTrackAssem.LLJJJIL = 0L;
                friendsV3LiveTrackAssem.LLJJIJIL = 0L;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Object obj3;
        String str;
        FriendsV3LiveTrackAssem friendsV3LiveTrackAssem = (FriendsV3LiveTrackAssem) obj;
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                friendsV3LiveTrackAssem.getClass();
                C0J55 c0j55 = C0J55.LIZ;
                LiveRoomStruct liveRoomStructZo = friendsV3LiveTrackAssem.zo();
                C724270Sb3 c724270Sb3 = friendsV3LiveTrackAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme = ((C0OB8) obj3).getAweme();
                int i = friendsV3LiveTrackAssem.LLJJI;
                boolean zAo = friendsV3LiveTrackAssem.Ao();
                String strBo = friendsV3LiveTrackAssem.Bo();
                c0j55.getClass();
                C2344009Gk c2344009GkLIZ = C0J55.LIZ(aweme, liveRoomStructZo);
                c2344009GkLIZ.LJIIIIZZ("enter_method", "live_cell");
                c2344009GkLIZ.LIZJ(i, "room_position");
                if (zAo) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009GkLIZ.LJIIIIZZ("is_guest_connection", str);
                c2344009GkLIZ.LJIIIIZZ("connection_type", strBo);
                C20684815ws.LJIILLIIL("livesdk_live_show", c2344009GkLIZ.LIZ);
                if (((C1610110s09) ((AssemViewModel) friendsV3LiveTrackAssem.LLJJJJ.getValue()).getState()).LL == EnumC21697819vs.FINISHED) {
                    friendsV3LiveTrackAssem.wL0();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$45(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        boolean z;
        FriendsV3LiveTrackAssem friendsV3LiveTrackAssem = (FriendsV3LiveTrackAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tab foreground: ");
            sbLIZ.append(zBooleanValue);
            C0W17.LIZJ("FriendV3LiveAssem", C2188811AlT.LIZIZ(sbLIZ));
            if (zBooleanValue) {
                friendsV3LiveTrackAssem.LLJJIJIL = System.currentTimeMillis();
            } else if (friendsV3LiveTrackAssem.LLJJIJIL > 0) {
                friendsV3LiveTrackAssem.LLJJIII = System.currentTimeMillis() - friendsV3LiveTrackAssem.LLJJIJIL;
                if (friendsV3LiveTrackAssem.LLJJJ > 0) {
                    friendsV3LiveTrackAssem.LLJJIJI = System.currentTimeMillis() - friendsV3LiveTrackAssem.LLJJJ;
                }
                if (friendsV3LiveTrackAssem.LLJJJIL > 0) {
                    z = true;
                } else {
                    z = false;
                }
                friendsV3LiveTrackAssem.Eo();
                friendsV3LiveTrackAssem.Co(z);
                friendsV3LiveTrackAssem.LLJJJ = 0L;
                friendsV3LiveTrackAssem.LLJJJIL = 0L;
                friendsV3LiveTrackAssem.LLJJIJIL = 0L;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        FollowStatus followStatus;
        String userId;
        String authorUid;
        Object obj3;
        User author;
        MUFQuickDMBoxTriggerV2 mUFQuickDMBoxTriggerV2 = (MUFQuickDMBoxTriggerV2) obj;
        FollowStatusEvent followStatusEvent = (FollowStatusEvent) obj2;
        if (followStatusEvent != null && (followStatus = followStatusEvent.status) != null && (userId = followStatus.getUserId()) != null) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(mUFQuickDMBoxTriggerV2)).getAweme();
            Object obj4 = null;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            if (Intrinsics.LJFF(userId, authorUid)) {
                C724270Sb3 c724270Sb3 = mUFQuickDMBoxTriggerV2.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme2 = ((VideoItemParams) obj3).getAweme();
                if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                    author.setFollowStatus(followStatusEvent.status.getFollowStatus());
                }
                C1908940zm8 c1908940zm8 = MUFQuickDMBoxTriggerV2.LLJZIJLIL;
                C724270Sb3 c724270Sb32 = mUFQuickDMBoxTriggerV2.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                }
                c1908940zm8.getClass();
                if (C1908940zm8.LIZ((VideoItemParams) obj4)) {
                    mUFQuickDMBoxTriggerV2.zp(C1A1K.FRIENDS_STABLE_SHOW);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AFwS321S0000000_33 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS321S0000000_33.invoke$6(kotlin.jvm.internal.AFwS321S0000000_33, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (videoRelationBtnAssem.LLL != null && videoRelationBtnAssem.LLJLLIL != null) {
            Object objLIZ = c291001Au.LIZ();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(objLIZ, bool)) {
                if (C2176211AEx.LIZLLL()) {
                    RelationButton relationButton = videoRelationBtnAssem.LLJLLL;
                    if (relationButton != null) {
                        ViewGroup.LayoutParams layoutParams = relationButton.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = videoRelationBtnAssem.LLLF;
                            C786410Ut5.W5(relationButton, layoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    C197039127h c197039127h = videoRelationBtnAssem.LLJZ;
                    if (c197039127h != null) {
                        ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = 0;
                            C786410Ut5.W5(c197039127h, layoutParams2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    String strLIZ = C0T0Y.LIZ(videoRelationBtnAssem.LLL);
                    if (strLIZ != null) {
                        C0T0Y.LIZ.put(strLIZ, bool);
                    }
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(videoRelationBtnAssem.Ep(0, videoRelationBtnAssem.LLJLLL, videoRelationBtnAssem.LLLFF, videoRelationBtnAssem.LLLF, 250L)).with(videoRelationBtnAssem.Ep(0, videoRelationBtnAssem.LLJZ, videoRelationBtnAssem.LLLFF, 0.0f, 250L));
                    animatorSet.addListener(new ALAdapterS9S0100000_12(videoRelationBtnAssem, 45));
                    animatorSet.start();
                }
                videoRelationBtnAssem.Bp("othershow", true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        C197039127h c197039127h;
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) obj;
        Boolean bool = (Boolean) ((C291001Au) obj2).LIZ();
        if (bool != null && !bool.booleanValue() && (c197039127h = videoRelationBtnAssem.LLJZIJLIL) != null && c197039127h.getVisibility() == 0) {
            videoRelationBtnAssem.Ip();
            C197039127h c197039127h2 = videoRelationBtnAssem.LLJZIJLIL;
            if (c197039127h2 != null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 8);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS321S0000000_33 aFwS321S0000000_33, Object obj, Object obj2) {
        Aweme aweme;
        String uid;
        FollowStatusEvent followStatusEvent = (FollowStatusEvent) obj2;
        VideoRelationBtnVM videoRelationBtnVMGp = ((VideoRelationBtnAssem) obj).Gp();
        videoRelationBtnVMGp.getClass();
        if (followStatusEvent != null) {
            FollowStatus followStatus = followStatusEvent.status;
            VideoItemParams item = videoRelationBtnVMGp.getItem();
            if (item != null && (aweme = item.getAweme()) != null) {
                User author = aweme.getAuthor();
                if (author != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, followStatus.getUserId())) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        author2.setFollowStatus(followStatus.getFollowStatus());
                    }
                    videoRelationBtnVMGp.withState(new AwS227S0300000_18(videoRelationBtnVMGp, followStatus, aweme, 65));
                }
            }
        }
        return Unit.LIZ;
    }
}
