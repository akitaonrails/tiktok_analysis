package wh6;

import X.AbstractC498420Jge;
import X.AbstractC517820KSm;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C013C;
import X.C01C1;
import X.C0IJT;
import X.C0JCK;
import X.C0JCX;
import X.C0K2G;
import X.C0K34;
import X.C0K35;
import X.C0K36;
import X.C0K38;
import X.C0K3E;
import X.C0K3F;
import X.C0K3J;
import X.C0K3Q;
import X.C0K3R;
import X.C0K4J;
import X.C0K51;
import X.C0K54;
import X.C0KKP;
import X.C0KP3;
import X.C0KP5;
import X.C0KS8;
import X.C0KSA;
import X.C0KSE;
import X.C0KSH;
import X.C0KWU;
import X.C0KX8;
import X.C0TCF;
import X.C0UJ2;
import X.C0UO0;
import X.C0UX6;
import X.C1086960eOM;
import X.C1161920gLG;
import X.C118300cf;
import X.C11NZ;
import X.C11S5;
import X.C1338270kvh;
import X.C16FS;
import X.C1701940uOG;
import X.C19322110iZ;
import X.C19EG;
import X.C20337914i1;
import X.C2097608Jq;
import X.C238400w2;
import X.C259800zU;
import X.C474500IjA;
import X.C475510Ikn;
import X.C475860IlM;
import X.C475870IlN;
import X.C475880IlO;
import X.C475890IlP;
import X.C480460Ism;
import X.C483170Ix9;
import X.C500260Jjc;
import X.C500590Jk9;
import X.C511120K2s;
import X.C511150K2v;
import X.C511340K3o;
import X.C511370K3r;
import X.C517840KSo;
import X.C520860Kbk;
import X.C748880TZe;
import X.C766270U4b;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC521770KdD;
import X.EnumC499440JiI;
import X.EnumC520880Kbm;
import X.InterfaceC1106030et7;
import Y.AfS0S1200100_7;
import Y.AfS103S0300000_7;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment.EmotePollStartDialog;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.PollAndGiftVoteDialog;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.api.IRevenueApi;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS136S0400000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.fans.CreateSuperFanContractResult;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import tikcast.api.fans.PolingSuperFanContractStatusResult;
import tikcast.api.fans.SuperFanPurchaseRequest;
import webcast.api.pgc_sub.PGCPollVoteResponse;
import webcast.data.RechargeCustomError;
import webcast.data.SuperFanPackage;

/* JADX INFO: loaded from: classes8.dex */
public class AbS324S0300000_7 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(AbS324S0300000_7 abS324S0300000_7, View view) {
        Long lValueOf;
        Long lValueOf2;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        String secUid;
        User owner;
        Long lValueOf3;
        PollMessage pollMessage;
        C0KX8 c0kx8;
        if (view != null) {
            PollAndGiftVoteDialog pollAndGiftVoteDialog = (PollAndGiftVoteDialog) abS324S0300000_7.l0;
            DataChannel dataChannel = pollAndGiftVoteDialog.dataChannel;
            Room room = pollAndGiftVoteDialog.LLJJIJI;
            int i = ((C118300cf) abS324S0300000_7.l1).element;
            Object obj = ((C259800zU) abS324S0300000_7.l2).element;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_entrance_click");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C0KWU.LIZ(c474500IjALIZ, dataChannel);
            if (room != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            if (room != null) {
                lValueOf2 = Long.valueOf(room.getId());
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJJII(lValueOf2, "room_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "have_red_dot");
            c474500IjALIZ.LJJII(obj, "enter_from");
            c474500IjALIZ.LIZ();
            PollAndGiftVoteDialog pollAndGiftVoteDialog2 = (PollAndGiftVoteDialog) abS324S0300000_7.l0;
            int i2 = pollAndGiftVoteDialog2.LLJJI;
            if (i2 != -1 && i2 != 5) {
                C766270U4b.LIZLLL(2131852589);
                return;
            }
            DataChannel dataChannel2 = pollAndGiftVoteDialog2.dataChannel;
            if (dataChannel2 != null && (c0kx8 = (C0KX8) dataChannel2.gg0(LiveBanCapabilityChannel.class)) != null && c0kx8.LIZLLL) {
                C766270U4b.LIZLLL(2131844184);
                return;
            }
            if (C500260Jjc.LJIIZILJ(((PollAndGiftVoteDialog) abS324S0300000_7.l0).dataChannel)) {
                RedDotExtensionKt.LIZ(C0UX6.RED_DOT_LIVE_BROADCAST_EMOTE_POLL);
            } else {
                RedDotExtensionKt.LIZ(C0UX6.RED_DOT_LIVE_BROADCAST_EMOTE_POLL_MODERATOR);
            }
            PollAndGiftVoteDialog pollAndGiftVoteDialog3 = (PollAndGiftVoteDialog) abS324S0300000_7.l0;
            if (pollAndGiftVoteDialog3.LLJJI == 5) {
                DataChannel dataChannel3 = pollAndGiftVoteDialog3.dataChannel;
                if (dataChannel3 != null) {
                    fragmentManager2 = (FragmentManager) dataChannel3.gg0(C748880TZe.class);
                } else {
                    fragmentManager2 = null;
                }
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).xf().getClass();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("navigate_up_page", "poll_panel", bundle);
                Room room2 = ((PollAndGiftVoteDialog) abS324S0300000_7.l0).LLJJIJI;
                if (room2 != null) {
                    long id = room2.getId();
                    C1086960eOM c1086960eOM = C1086960eOM.LL;
                    C01C1 c01c1LIZJ = C1086960eOM.LIZJ(id);
                    if (c01c1LIZJ != null && (pollMessage = c01c1LIZJ.LJFF) != null) {
                        lValueOf3 = Long.valueOf(pollMessage.pollId);
                    } else {
                        lValueOf3 = null;
                    }
                    C786410Ut5.LJJJI("poll_id", String.valueOf(lValueOf3), bundle);
                }
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(((PollAndGiftVoteDialog) abS324S0300000_7.l0).dataChannel);
                if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                    secUid = owner.getSecUid();
                } else {
                    secUid = null;
                }
                C786410Ut5.LJJJI("sec_anchor_id", secUid, bundle);
                C786410Ut5.LJJJI("enter_from", (String) ((C259800zU) abS324S0300000_7.l2).element, bundle);
                bundle.putBoolean("is_anchor", C500260Jjc.LJIIZILJ(((PollAndGiftVoteDialog) abS324S0300000_7.l0).dataChannel));
                C19322110iZ.LIZLLL(fragmentManager2, EmotePollDetailDialog.class, "sub_emote_poll_detail", null, bundle);
            } else {
                DataChannel dataChannel4 = pollAndGiftVoteDialog3.dataChannel;
                if (dataChannel4 != null) {
                    fragmentManager = (FragmentManager) dataChannel4.gg0(C748880TZe.class);
                } else {
                    fragmentManager = null;
                }
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).xf().getClass();
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI("navigate_up_page", "poll_panel", bundle2);
                C786410Ut5.LJJJI("enter_from", (String) ((C259800zU) abS324S0300000_7.l2).element, bundle2);
                C19322110iZ.LIZLLL(fragmentManager, EmotePollStartDialog.class, "sub_emote_poll_create", null, bundle2);
            }
            ((PollAndGiftVoteDialog) abS324S0300000_7.l0).dismiss();
        }
    }

    public static final void LIZ$1(AbS324S0300000_7 abS324S0300000_7, View view) {
        Object obj;
        if (view != null && ((C520860Kbk) abS324S0300000_7.l0).LJFF()) {
            C520860Kbk c520860Kbk = (C520860Kbk) abS324S0300000_7.l0;
            EnumC520880Kbm enumC520880Kbm = c520860Kbk.LJI;
            EnumC520880Kbm enumC520880Kbm2 = EnumC520880Kbm.READY;
            if (enumC520880Kbm == enumC520880Kbm2) {
                enumC520880Kbm2 = EnumC520880Kbm.INUSE;
            }
            c520860Kbk.LJII(enumC520880Kbm2);
            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.x9;
            String str = "1";
            if (!c20337914i1.LIZIZ().booleanValue()) {
                C520860Kbk c520860Kbk2 = (C520860Kbk) abS324S0300000_7.l0;
                View view2 = (View) abS324S0300000_7.l1;
                boolean z = ((C013C) abS324S0300000_7.l2).element;
                c520860Kbk2.getClass();
                IEnigmaService iEnigmaService = (IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class);
                if (iEnigmaService != null) {
                    iEnigmaService.XD0(view2.getContext());
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_rules_show");
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(obj, "is_with_bubble");
                c474500IjALIZ.LIZ();
                c20337914i1.LJFF(Boolean.TRUE);
            }
            boolean z2 = ((C013C) abS324S0300000_7.l2).element;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_enigma_whisper_icon_click");
            if (!z2) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ2.LJJII(str, "is_with_bubble");
            c474500IjALIZ2.LIZ();
        }
    }

    public static final void LIZ$10(AbS324S0300000_7 abS324S0300000_7, View view) {
        C475860IlM c475860IlM;
        C19EG c19eg;
        if (view != null && (c475860IlM = ((C475870IlN) abS324S0300000_7.l0).LLILZIL) != null) {
            C475890IlP.LIZ(new C475860IlM(c475860IlM.LIZ, c475860IlM.LIZIZ, c475860IlM.LIZJ, false, false, c475860IlM.LJFF));
            C475870IlN c475870IlN = (C475870IlN) abS324S0300000_7.l0;
            Context context = ((C475880IlO) abS324S0300000_7.l1).itemView.getContext();
            c475870IlN.getClass();
            if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
                C483170Ix9 c483170Ix9 = new C483170Ix9(c19eg, c475870IlN.LLILLL, new AwS586S0100000_7(c475870IlN, 442), new DialogInterfaceOnDismissListenerC521770KdD(c475870IlN, 9));
                Map<String, Object> map = C1338270kvh.LIZ;
                c483170Ix9.LIZLLL.show(c19eg.getSupportFragmentManager(), "MoreAvatarSheet");
            }
            C475870IlN.LLLFZ((C475860IlM) abS324S0300000_7.l2);
        }
    }

    public static final void LIZ$11(AbS324S0300000_7 abS324S0300000_7, View view) {
        String idStr;
        String idStr2;
        if (view != null && !((SpacePost) abS324S0300000_7.l0).previewMode) {
            if (C0K51.LJI(Boolean.valueOf(((C511370K3r) abS324S0300000_7.l1).LLILZIL)) && ((C0K2G) abS324S0300000_7.l2).LL.AQ2()) {
                C0JCX.LIZ(2131839561);
                return;
            }
            C0K2G c0k2g = (C0K2G) abS324S0300000_7.l2;
            C511370K3r c511370K3r = (C511370K3r) abS324S0300000_7.l1;
            c0k2g.getClass();
            Uri.Builder builderAppendQueryParameter = UriProtector.parse("sslocal://webcast_subscribe/sub_only_videos").buildUpon().appendQueryParameter("is_fullscreen", "1").appendQueryParameter("enter_from", "SubOnlySpace");
            User user = c511370K3r.LLILLL;
            String str = "";
            if (user == null || (idStr = user.getIdStr()) == null) {
                idStr = "";
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("anchor_id", idStr).appendQueryParameter("sec_anchor_id", c511370K3r.LLILZ);
            User user2 = c511370K3r.LLILLL;
            if (user2 != null && (idStr2 = user2.getIdStr()) != null) {
                str = idStr2;
            }
            C0K54.LIZ().LJ(c0k2g.itemView.getContext(), builderAppendQueryParameter2.appendQueryParameter("actual_anchor_id", str).build().toString(), C2097608Jq.LJ());
            ((C0K2G) abS324S0300000_7.l2).LL.xQ2().LIZ((SpacePost) abS324S0300000_7.l0, "more_video");
        }
    }

    public static final void LIZ$12(AbS324S0300000_7 abS324S0300000_7, View view) {
        long j;
        C11NZ c11nz;
        if (view != null) {
            if (((SpacePoll) abS324S0300000_7.l0).isEnd) {
                C0JCX.LIZ(2131839612);
                return;
            }
            C0K35 c0k35 = (C0K35) abS324S0300000_7.l1;
            SubSpaceFeedVM subSpaceFeedVM = c0k35.LLILLJJLI;
            C0K34 c0k34 = (C0K34) abS324S0300000_7.l2;
            AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(c0k35, 460);
            subSpaceFeedVM.getClass();
            SpacePost spacePost = c0k34.LIZ;
            long j2 = spacePost.postId;
            SpacePoll spacePoll = spacePost.pollInfo;
            if (spacePoll != null) {
                j = spacePoll.pollId;
            } else {
                j = 0;
            }
            C11NZ<DataResponse<PGCPollVoteResponse.ResponseData>> c11nzPollVote = C0K4J.LIZ().pollVote(j2, j, c0k34.LIZIZ.optionId);
            if (c11nzPollVote != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzPollVote.LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()), EnumC499440JiI.GENERAL, "SubSpaceFeedVM", "sub/space/poll/vote", null, 8).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceFeedVM))) != null) {
                c11nz.LJJLL(new AfS103S0300000_7(aFwS193S0000000_7, subSpaceFeedVM, c0k34, 25), new AfS172S0100000_3((Object) awS586S0100000_7, 63));
            }
            ((C0K35) abS324S0300000_7.l1).LLILLJJLI.xQ2().LIZ(((C0K34) abS324S0300000_7.l2).LIZ, "vote");
        }
    }

    public static final void LIZ$13(AbS324S0300000_7 abS324S0300000_7, View view) {
        if (view != null) {
            SpacePost spacePost = (SpacePost) abS324S0300000_7.l0;
            if (!spacePost.previewMode) {
                ((C511340K3o) abS324S0300000_7.l1).U5(spacePost, (C511120K2s) abS324S0300000_7.l2);
            }
        }
    }

    public static final void LIZ$14(AbS324S0300000_7 abS324S0300000_7, View view) {
        if (view != null) {
            SpacePost spacePost = (SpacePost) abS324S0300000_7.l0;
            if (!spacePost.previewMode) {
                ((C511340K3o) abS324S0300000_7.l1).U5(spacePost, (C511120K2s) abS324S0300000_7.l2);
            }
        }
    }

    public static final void LIZ$2(AbS324S0300000_7 abS324S0300000_7, View view) {
        if (view != null) {
            ((TreasureBoxDialog) abS324S0300000_7.l0).yS((AbstractC517820KSm) abS324S0300000_7.l1, (C0KS8) abS324S0300000_7.l2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [X.0KS9] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0KSA] */
    public static final void LIZ$3(AbS324S0300000_7 abS324S0300000_7, View view) {
        String secUid;
        Room roomLJJLIIIIJ;
        String idStr;
        User userLJIIIIZZ;
        long j;
        String idStr2;
        String secUid2;
        Room roomLJJLIIIIJ2;
        String idStr3;
        User userLJIIIIZZ2;
        User userLJIIIIZZ3;
        if (view != null) {
            GetSuperFansTreasureBoxDataResponse.Data data = (GetSuperFansTreasureBoxDataResponse.Data) abS324S0300000_7.l0;
            int i = data.specialAccount;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C766270U4b.LIZLLL(2131856572);
                        return;
                    }
                    return;
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((TreasureBoxDialog) abS324S0300000_7.l1).getContext(), "aweme://roma_redirect/?spark_page=live_super_fan_box_gpppa_popup");
                return;
            }
            int i2 = data.specialRoomType;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return;
                            }
                            C766270U4b.LIZLLL(2131856567);
                            return;
                        }
                        C766270U4b.LIZLLL(2131856576);
                        return;
                    }
                    C766270U4b.LIZLLL(2131856566);
                    return;
                }
                C766270U4b.LIZLLL(2131856568);
                return;
            }
            C16FS c16fs = (C16FS) abS324S0300000_7.l2;
            if (c16fs.LLJJIJI) {
                return;
            }
            TreasureBoxDialog treasureBoxDialog = (TreasureBoxDialog) abS324S0300000_7.l1;
            if (treasureBoxDialog.LLLFZ == null && !treasureBoxDialog.LLLFF) {
                return;
            }
            c16fs.LJ();
            TreasureBoxDialog treasureBoxDialog2 = (TreasureBoxDialog) abS324S0300000_7.l1;
            final C0KS8 c0ks8 = treasureBoxDialog2.LLLFZ;
            String str = "";
            if (c0ks8 != null) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(treasureBoxDialog2);
                String str2 = ((TreasureBoxDialog) abS324S0300000_7.l1).LLJLLL;
                SuperFanPackage superFanPackage = c0ks8.LIZ;
                long j2 = 0;
                if (superFanPackage != null) {
                    j = superFanPackage.usdPriceAmountMicros;
                    j2 = superFanPackage.count;
                } else {
                    j = 0;
                }
                C500590Jk9.LIZ(j, j2, dataChannelLJ, str2, false);
                final TreasureBoxDialog treasureBoxDialog3 = (TreasureBoxDialog) abS324S0300000_7.l1;
                final TreasureBoxViewModel treasureBoxViewModel = treasureBoxDialog3.LLJZIJLIL;
                if (treasureBoxViewModel == null) {
                    return;
                }
                String str3 = treasureBoxDialog3.LLJLLL;
                final C16FS c16fs2 = (C16FS) abS324S0300000_7.l2;
                final ?? r3 = new C0KSE<PolingSuperFanContractStatusResult.SuperFanEnvelopeInfo>() { // from class: X.0KS9
                    @Override // X.C0KSE
                    public final void LJIIJ(String str4) {
                        long j3;
                        if (treasureBoxDialog3.isAdded()) {
                            c16fs2.LJIIL();
                        }
                        DataChannel dataChannelLJ2 = C475510Ikn.LJ(treasureBoxDialog3);
                        SuperFanPackage superFanPackage2 = c0ks8.LIZ;
                        if (superFanPackage2 != null) {
                            j3 = superFanPackage2.count;
                        } else {
                            j3 = 0;
                        }
                        C500590Jk9.LIZIZ(j3, dataChannelLJ2, str4);
                    }

                    @Override // X.C0KSE
                    public final void onSuccess(PolingSuperFanContractStatusResult.SuperFanEnvelopeInfo superFanEnvelopeInfo) {
                        long j3;
                        PolingSuperFanContractStatusResult.SuperFanEnvelopeInfo superFanEnvelopeInfo2 = superFanEnvelopeInfo;
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS551S0100000_7(treasureBoxDialog3, 560));
                        DataChannel dataChannelLJ2 = C475510Ikn.LJ(treasureBoxDialog3);
                        String str4 = treasureBoxDialog3.LLJLLL;
                        SuperFanPackage superFanPackage2 = c0ks8.LIZ;
                        long j4 = 0;
                        if (superFanPackage2 != null) {
                            j3 = superFanPackage2.usdPriceAmountMicros;
                            j4 = superFanPackage2.count;
                        } else {
                            j3 = 0;
                        }
                        C500590Jk9.LIZJ(dataChannelLJ2, str4, false, j3, j4, superFanEnvelopeInfo2.envelopeId, superFanEnvelopeInfo2.unpackAt);
                    }
                };
                C0KSH.LJIILIIL(treasureBoxViewModel.getDataChannel(), CardStruct.IStatusCode.DEFAULT, "treasure_box", str3);
                final C517840KSo c517840KSo = treasureBoxViewModel.LL;
                if (c517840KSo == null) {
                    return;
                }
                DataChannel dataChannel = treasureBoxViewModel.getDataChannel();
                if (dataChannel == null || (userLJIIIIZZ3 = C500260Jjc.LJIIIIZZ(dataChannel)) == null || (idStr2 = userLJIIIIZZ3.getIdStr()) == null) {
                    idStr2 = "";
                }
                DataChannel dataChannel2 = treasureBoxViewModel.getDataChannel();
                if (dataChannel2 == null || (userLJIIIIZZ2 = C500260Jjc.LJIIIIZZ(dataChannel2)) == null || (secUid2 = userLJIIIIZZ2.getSecUid()) == null) {
                    secUid2 = "";
                }
                DataChannel dataChannel3 = treasureBoxViewModel.getDataChannel();
                if (dataChannel3 != null && (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel3)) != null && (idStr3 = roomLJJLIIIIJ2.getIdStr()) != null) {
                    str = idStr3;
                }
                ((C0KKP) treasureBoxViewModel.LLILLJJLI.getValue()).LIZLLL(new C0KP3(c517840KSo.LIZ, "fans_normal_sub", null, "fans_treasure_box", c0ks8, 5, idStr2, secUid2, "fans_treasure_box", str, "treasure_box", str3, new C0KP5() { // from class: X.0KSB
                    @Override // X.C0KP5
                    public final void LIZ(C0KPG c0kpg) {
                        String str4;
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS251S0300000_7(treasureBoxViewModel, c517840KSo, c0kpg, 11));
                        C0KSE<PolingSuperFanContractStatusResult.SuperFanEnvelopeInfo> c0kse = r3;
                        C518080KTm c518080KTm = c0kpg.LJ;
                        if (c518080KTm != null) {
                            str4 = c518080KTm.LJ;
                        } else {
                            str4 = null;
                        }
                        c0kse.LJIIJ(str4);
                    }

                    @Override // X.C0KP5
                    public final void LIZJ(PolingSuperFanContractStatusResult polingSuperFanContractStatusResult) throws JSONException {
                        PolingSuperFanContractStatusResult.SuperFanEnvelopeInfo superFanEnvelopeInfo;
                        Object obj;
                        Room room;
                        String idStr4;
                        List urls;
                        if (polingSuperFanContractStatusResult != null && (superFanEnvelopeInfo = polingSuperFanContractStatusResult.envelopInfo) != null) {
                            r3.onSuccess(superFanEnvelopeInfo);
                            TreasureBoxViewModel treasureBoxViewModel2 = treasureBoxViewModel;
                            treasureBoxViewModel2.getClass();
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, superFanEnvelopeInfo));
                            ImageModel imageModel = superFanEnvelopeInfo.sendUserAvatar;
                            String str4 = "";
                            if (imageModel == null || (urls = imageModel.getUrls()) == null || (obj = ListProtector.get(urls, 0)) == null) {
                                obj = "";
                            }
                            jSONObject2.put("send_user_avatar_url", obj);
                            DataChannel dataChannel4 = treasureBoxViewModel2.getDataChannel();
                            if (dataChannel4 != null && (room = (Room) dataChannel4.gg0(RoomChannel.class)) != null && (idStr4 = room.getIdStr()) != null) {
                                str4 = idStr4;
                            }
                            jSONObject2.put("envelope_room_id", str4);
                            jSONObject2.put("send_time", C158B.LIZ());
                            jSONObject.put("envelope_info", jSONObject2);
                            jSONObject.put("display", 1);
                            C389001fE.LIZ("liveGoldenEnvelopeCreate", jSONObject, System.currentTimeMillis(), false);
                            return;
                        }
                        r3.LJIIJ("envelopInfo is null");
                    }

                    @Override // X.C0KP5
                    public final void LIZLLL(Throwable th) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7(c517840KSo, th, 34));
                        r3.LJIIJ("polling failed");
                    }

                    @Override // X.C0KP5
                    public final void LJ(C0KPG c0kpg) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS551S0100000_7(treasureBoxViewModel, 565));
                    }

                    @Override // X.C0KP5
                    public final void LJFF(CreateSuperFanContractResult createSuperFanContractResult) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS551S0100000_7(treasureBoxViewModel, 564));
                    }

                    @Override // X.C0KP5
                    public final void LIZIZ(Throwable th, RechargeCustomError rechargeCustomError) {
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS136S0400000_7(rechargeCustomError, (RechargeCustomError) c517840KSo, (C517840KSo) th, (Throwable) r3, (C0KSE<PolingSuperFanContractStatusResult.SuperFanEnvelopeInfo>) 1));
                    }
                }));
                return;
            }
            if (!treasureBoxDialog2.LLLFF) {
                return;
            }
            final long j3 = treasureBoxDialog2.LLLFFI;
            long j4 = treasureBoxDialog2.LLL;
            if (j3 > j4) {
                j3 = j4;
            }
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(treasureBoxDialog2);
            TreasureBoxDialog treasureBoxDialog4 = (TreasureBoxDialog) abS324S0300000_7.l1;
            C500590Jk9.LIZ(0L, treasureBoxDialog4.LLLFFI, dataChannelLJ2, treasureBoxDialog4.LLJLLL, true);
            final TreasureBoxDialog treasureBoxDialog5 = (TreasureBoxDialog) abS324S0300000_7.l1;
            TreasureBoxViewModel treasureBoxViewModel2 = treasureBoxDialog5.LLJZIJLIL;
            if (treasureBoxViewModel2 == null) {
                return;
            }
            String str4 = treasureBoxDialog5.LLJLLL;
            final C16FS c16fs3 = (C16FS) abS324S0300000_7.l2;
            ?? r8 = new C0KSE<CreateSuperFanContractResult.SuperFanEnvelopeInfo>() { // from class: X.0KSA
                @Override // X.C0KSE
                public final void LJIIJ(String str5) {
                    if (treasureBoxDialog5.isAdded()) {
                        c16fs3.LJIIL();
                    }
                    C500590Jk9.LIZIZ(j3, C475510Ikn.LJ(treasureBoxDialog5), str5);
                }

                @Override // X.C0KSE
                public final void onSuccess(CreateSuperFanContractResult.SuperFanEnvelopeInfo superFanEnvelopeInfo) {
                    CreateSuperFanContractResult.SuperFanEnvelopeInfo superFanEnvelopeInfo2 = superFanEnvelopeInfo;
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS551S0100000_7(treasureBoxDialog5, 561));
                    DataChannel dataChannelLJ3 = C475510Ikn.LJ(treasureBoxDialog5);
                    TreasureBoxDialog treasureBoxDialog6 = treasureBoxDialog5;
                    C500590Jk9.LIZJ(dataChannelLJ3, treasureBoxDialog6.LLJLLL, true, 0L, treasureBoxDialog6.LLLFFI, superFanEnvelopeInfo2.envelopeId, superFanEnvelopeInfo2.unpackAt);
                }
            };
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0KSH.LJIILIIL(treasureBoxViewModel2.getDataChannel(), CardStruct.IStatusCode.DEFAULT, "treasure_box_in_store", str4);
            DataChannel dataChannel4 = treasureBoxViewModel2.getDataChannel();
            if (dataChannel4 == null || (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel4)) == null || (secUid = userLJIIIIZZ.getSecUid()) == null) {
                secUid = "";
            }
            DataChannel dataChannel5 = treasureBoxViewModel2.getDataChannel();
            if (dataChannel5 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel5)) != null && (idStr = roomLJJLIIIIJ.getIdStr()) != null) {
                str = idStr;
            }
            C480460Ism.LIZ().getClass();
            IRevenueApi iRevenueApi = (IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class);
            SuperFanPurchaseRequest superFanPurchaseRequest = new SuperFanPurchaseRequest();
            superFanPurchaseRequest.roomId = str;
            superFanPurchaseRequest.toUid = secUid;
            superFanPurchaseRequest.createContractIntent = 6;
            superFanPurchaseRequest.purchaseCount = String.valueOf(j3);
            iRevenueApi.purchaseFans(superFanPurchaseRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS0S1200100_7(jCurrentTimeMillis, (C0KSA) r8, treasureBoxViewModel2, str4, 1), new AfS0S1200100_7(jCurrentTimeMillis, (C0KSA) r8, treasureBoxViewModel2, str4, 2));
        }
    }

    public static final void LIZ$4(AbS324S0300000_7 abS324S0300000_7, View view) {
        if (view != null) {
            if (((C0K3R) abS324S0300000_7.l0).LLILLJJLI.BQ2()) {
                ((SpaceCommentItem) abS324S0300000_7.l1).anchorLiked = !r1.userLiked;
            }
            SpaceCommentItem spaceCommentItem = (SpaceCommentItem) abS324S0300000_7.l1;
            if (spaceCommentItem.userLiked) {
                spaceCommentItem.userLiked = false;
                spaceCommentItem.likeCount--;
                ((C0K3R) abS324S0300000_7.l0).U5(spaceCommentItem);
                ((C0K3R) abS324S0300000_7.l0).LLILLJJLI.DQ2(((SpaceCommentItem) abS324S0300000_7.l1).postId, 1, (C0K3J) abS324S0300000_7.l2);
                return;
            }
            ((C0K3R) abS324S0300000_7.l0).U5(spaceCommentItem);
            SpaceCommentItem spaceCommentItem2 = (SpaceCommentItem) abS324S0300000_7.l1;
            spaceCommentItem2.userLiked = true;
            spaceCommentItem2.likeCount++;
            ((C0K3R) abS324S0300000_7.l0).LLILLJJLI.DQ2(spaceCommentItem2.postId, 0, (C0K3J) abS324S0300000_7.l2);
        }
    }

    public static final void LIZ$5(AbS324S0300000_7 abS324S0300000_7, View view) {
        if (view != null) {
            SpacePost spacePost = (SpacePost) abS324S0300000_7.l0;
            if (spacePost.userLiked) {
                ((C0K3E) abS324S0300000_7.l1).U5(spacePost.likeCount - 1, false);
                ((C0K3E) abS324S0300000_7.l1).LLILLJJLI.EQ2(((SpacePost) abS324S0300000_7.l0).postId, 1, (C0K3F) abS324S0300000_7.l2);
            } else {
                ((C0K3E) abS324S0300000_7.l1).U5(spacePost.likeCount + 1, true);
                ((C0K3E) abS324S0300000_7.l1).LLILLJJLI.EQ2(((SpacePost) abS324S0300000_7.l0).postId, 0, (C0K3F) abS324S0300000_7.l2);
            }
        }
    }

    public static final void LIZ$6(AbS324S0300000_7 abS324S0300000_7, View view) {
        boolean z;
        C11NZ c11nz;
        if (view != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            SpacePoll spacePoll = (SpacePoll) abS324S0300000_7.l0;
            long j = spacePoll.endTimeSec;
            long j2 = 0;
            if (j > 0 && jCurrentTimeMillis >= j) {
                z = true;
            } else {
                z = false;
            }
            if (!spacePoll.isEnd && !z) {
                C0K36 c0k36 = (C0K36) abS324S0300000_7.l1;
                SubSpaceDetailVM subSpaceDetailVM = c0k36.LLILLJJLI;
                C0K34 c0k34 = (C0K34) abS324S0300000_7.l2;
                AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(248);
                AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(c0k36, 362);
                subSpaceDetailVM.getClass();
                SpacePost spacePost = c0k34.LIZ;
                long j3 = spacePost.postId;
                SpacePoll spacePoll2 = spacePost.pollInfo;
                if (spacePoll2 != null) {
                    j2 = spacePoll2.pollId;
                }
                C11NZ<DataResponse<PGCPollVoteResponse.ResponseData>> c11nzPollVote = C0K4J.LIZ().pollVote(j3, j2, c0k34.LIZIZ.optionId);
                if (c11nzPollVote != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzPollVote, EnumC499440JiI.GENERAL, "SubSpaceDetailVM", "sub/space/poll/vote", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceDetailVM))) != null) {
                    c11nz.LJJLL(new AfS103S0300000_7(aFwS193S0000000_7, subSpaceDetailVM, c0k34, 15), new AfS172S0100000_3((Object) awS586S0100000_7, 39));
                    return;
                }
                return;
            }
            C0JCX.LIZ(2131839612);
        }
    }

    public static final void LIZ$7(AbS324S0300000_7 abS324S0300000_7, View view) {
        if (view != null) {
            SpacePost spacePost = (SpacePost) abS324S0300000_7.l0;
            if (spacePost.userLiked) {
                ((C0K38) abS324S0300000_7.l1).U5(spacePost.likeCount - 1, false);
                ((C0K38) abS324S0300000_7.l1).LLILLJJLI.EQ2(((SpacePost) abS324S0300000_7.l0).postId, 1, (C511150K2v) abS324S0300000_7.l2);
            } else {
                ((C0K38) abS324S0300000_7.l1).U5(spacePost.likeCount + 1, true);
                ((C0K38) abS324S0300000_7.l1).LLILLJJLI.EQ2(((SpacePost) abS324S0300000_7.l0).postId, 0, (C511150K2v) abS324S0300000_7.l2);
            }
        }
    }

    public static final void LIZ$8(AbS324S0300000_7 abS324S0300000_7, View view) {
        if (view != null) {
            if (((C0K3Q) abS324S0300000_7.l0).LLILLJJLI.BQ2()) {
                ((SpaceCommentItem) abS324S0300000_7.l1).anchorLiked = !r1.userLiked;
            }
            SpaceCommentItem spaceCommentItem = (SpaceCommentItem) abS324S0300000_7.l1;
            if (spaceCommentItem.userLiked) {
                spaceCommentItem.userLiked = false;
                spaceCommentItem.likeCount--;
                ((C0K3Q) abS324S0300000_7.l0).U5(spaceCommentItem);
                ((C0K3Q) abS324S0300000_7.l0).LLILLJJLI.DQ2(((SpaceCommentItem) abS324S0300000_7.l1).postId, 1, (C0K3J) abS324S0300000_7.l2);
                return;
            }
            ((C0K3Q) abS324S0300000_7.l0).U5(spaceCommentItem);
            SpaceCommentItem spaceCommentItem2 = (SpaceCommentItem) abS324S0300000_7.l1;
            spaceCommentItem2.userLiked = true;
            spaceCommentItem2.likeCount++;
            ((C0K3Q) abS324S0300000_7.l0).LLILLJJLI.DQ2(spaceCommentItem2.postId, 0, (C0K3J) abS324S0300000_7.l2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$9(wh6.AbS324S0300000_7 r23, android.view.View r24) {
        /*
            Method dump skipped, instruction units count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS324S0300000_7.LIZ$9(wh6.AbS324S0300000_7, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS324S0300000_7(C475870IlN c475870IlN, C475880IlO c475880IlO, C475860IlM c475860IlM, int i) {
        super(2000L);
        this.$t = i;
        this.l0 = c475870IlN;
        this.l1 = c475880IlO;
        this.l2 = c475860IlM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS324S0300000_7(AbstractC498420Jge abstractC498420Jge, BadgeStruct badgeStruct, C238400w2 c238400w2, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = abstractC498420Jge;
        this.l1 = badgeStruct;
        this.l2 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS324S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
