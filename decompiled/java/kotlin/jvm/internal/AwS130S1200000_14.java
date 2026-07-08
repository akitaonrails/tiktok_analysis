package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0I0B;
import X.C0Y8T;
import X.C0YNP;
import X.C1736806r8;
import X.C1807670x8n;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C866530Xz1;
import X.C869590Y9l;
import X.C883810Yln;
import X.C890330YwJ;
import X.C890540Ywe;
import X.C890590Ywj;
import X.C901740ZZc;
import X.C902340Zaa;
import X.C902380Zae;
import X.C902390Zaf;
import X.C902410Zah;
import X.C902600Zb0;
import X.C912070ZqH;
import X.EnumC880480YgQ;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS130S1200000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS130S1200000_14 awS130S1200000_14) {
        C912070ZqH.LIZIZ.LJFF().LIZ((C869590Y9l) awS130S1200000_14.l1, C0I0B.LJFF.LIZIZ(), awS130S1200000_14.s0);
        ((Function0) awS130S1200000_14.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS130S1200000_14 awS130S1200000_14) {
        C1736806r8 c1736806r8LJ;
        Long lValueOf;
        C869590Y9l c869590Y9l;
        long minIndex;
        C0Y8T c0y8t = (C0Y8T) awS130S1200000_14.l1;
        Long lValueOf2 = null;
        if (c0y8t != null && c0y8t.getLastShowMessage() != null) {
            C0YNP.LIZIZ(awS130S1200000_14.s0).LJIJI().LLJLLL(awS130S1200000_14.s0);
        } else {
            StoryFriendAnniversaryService.LIZ.getClass();
            StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
            if (storyFriendAnniversaryServiceLIZ != null && storyFriendAnniversaryServiceLIZ.LIZIZ() != null) {
                String str = awS130S1200000_14.s0;
                C0Y8T c0y8t2 = (C0Y8T) awS130S1200000_14.l1;
                if (c0y8t2 != null) {
                    minIndex = c0y8t2.getMinIndex();
                } else {
                    minIndex = 0;
                }
                c1736806r8LJ = C902600Zb0.LJ(minIndex + 1, str);
            } else {
                c1736806r8LJ = null;
            }
            Map<String, C902410Zah> map = C902380Zae.LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setFriendAnniversaryData insert message: ");
            if (c1736806r8LJ != null && (c869590Y9l = c1736806r8LJ.LIZJ) != null) {
                lValueOf = Long.valueOf(c869590Y9l.getIndex());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("popUpInlineMsg: minIndex:");
            C0Y8T c0y8t3 = (C0Y8T) awS130S1200000_14.l1;
            if (c0y8t3 != null) {
                lValueOf2 = Long.valueOf(c0y8t3.getMinIndex());
            }
            sbLIZ2.append(lValueOf2);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (c1736806r8LJ != null) {
                C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(awS130S1200000_14.s0);
                String str2 = awS130S1200000_14.s0;
                C0Y8T c0y8tLJ = c866530Xz1LIZIZ.LJ();
                if (c0y8tLJ != null) {
                    c0y8tLJ.setLastShowMessage(c1736806r8LJ.LIZJ);
                }
                c866530Xz1LIZIZ.LJIJI().LLJLLL(str2);
            }
        }
        RelationshipCelebrationTarget relationshipCelebrationTargetLIZ = ((C902410Zah) awS130S1200000_14.l2).LIZ(awS130S1200000_14.s0);
        if (relationshipCelebrationTargetLIZ != null) {
            String str3 = awS130S1200000_14.s0;
            C902390Zaf.LIZ.getClass();
            C902390Zaf.LJFF("conversation_pop_up_", str3, relationshipCelebrationTargetLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS130S1200000_14 awS130S1200000_14) {
        Long lValueOf;
        long jLongValue;
        NewLiveRoomStruct newLiveRoomStruct;
        LiveCardViewModel liveCardViewModel = (LiveCardViewModel) awS130S1200000_14.l1;
        if (liveCardViewModel.LLJJIII == null) {
            synchronized (liveCardViewModel) {
                if (liveCardViewModel.LLJJIII == null) {
                    liveCardViewModel.LLJJIII = (C901740ZZc) C1807670x8n.LJJJJLI();
                }
            }
        }
        String str = awS130S1200000_14.s0;
        String roomId = ((ShareLiveContent) awS130S1200000_14.l2).getRoomId();
        String roomId2 = ((ShareLiveContent) awS130S1200000_14.l2).getRoomId();
        if (roomId2 != null && (newLiveRoomStruct = ((LiveCardViewModel) awS130S1200000_14.l1).AQ2().get(roomId2)) != null) {
            lValueOf = Long.valueOf(newLiveRoomStruct.maxPreviewTime);
        } else {
            lValueOf = null;
        }
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", "chat");
        c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("anchor_id", str);
        c2344009Gk.LJIIIIZZ("room_id", roomId);
        c2344009Gk.LJIIIIZZ("_params_live_platform", "live");
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        c2344009Gk.LIZLLL(jLongValue / 1000, "maximum_preview_duration");
        C20684815ws.LJIILLIIL("livesdk_sub_only_live_preview_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS130S1200000_14 awS130S1200000_14) {
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LIZIZ().LIZJ("notification_page", "click_close", awS130S1200000_14.s0, "", "");
        ((C013C) awS130S1200000_14.l1).element = true;
        TuxSingleSelectionSheet tuxSingleSelectionSheet = ((C890540Ywe) awS130S1200000_14.l2).LLJJJJ;
        if (tuxSingleSelectionSheet != null) {
            tuxSingleSelectionSheet.dismiss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS130S1200000_14 awS130S1200000_14) {
        Set<EnumC880480YgQ> set;
        InboxFilterBarViewModel inboxFilterBarViewModel;
        C890590Ywj c890590Ywj = ((C890540Ywe) awS130S1200000_14.l1).LLJJIJI;
        if (c890590Ywj != null && (set = c890590Ywj.LLILZLL) != null && C883810Yln.LIZ(set) && (inboxFilterBarViewModel = (InboxFilterBarViewModel) ((C890540Ywe) awS130S1200000_14.l1).LLJJIJIIJIL.getValue()) != null) {
            inboxFilterBarViewModel.Xg2();
        }
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LIZIZ().LIZJ("notification_page", "click_clear", awS130S1200000_14.s0, "", "");
        ((C013C) awS130S1200000_14.l2).element = true;
        TuxSingleSelectionSheet tuxSingleSelectionSheet = ((C890540Ywe) awS130S1200000_14.l1).LLJJJJ;
        if (tuxSingleSelectionSheet != null) {
            tuxSingleSelectionSheet.dismiss();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS130S1200000_14(X.C890540Ywe r3, java.lang.String r4, X.C013C r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 3 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r1.l2 = r5
            r0 = 0
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS130S1200000_14.<init>(X.0Ywe, java.lang.String, X.013C, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S1200000_14(C0Y8T c0y8t, String str, C902410Zah c902410Zah, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0y8t;
        this.s0 = str;
        this.l2 = c902410Zah;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS130S1200000_14(LiveCardViewModel liveCardViewModel, String str, ShareLiveContent shareLiveContent, int i) {
        super(0);
        this.$t = i;
        this.l1 = liveCardViewModel;
        this.s0 = str;
        this.l2 = shareLiveContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS130S1200000_14(String str, String str2, C869590Y9l c869590Y9l, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c869590Y9l;
    }
}
