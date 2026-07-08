package kotlin.jvm.internal;

import X.C09AY;
import X.C0CYM;
import X.C0OM1;
import X.C0OO0;
import X.C0WZX;
import X.C0YEC;
import X.C0YED;
import X.C0YEG;
import X.C0YEM;
import X.C0YEW;
import X.C0YF0;
import X.C0ZI0;
import X.C10EU;
import X.C111C;
import X.C117U;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1360460lVU;
import X.C1584506Ih;
import X.C1727806pg;
import X.C1954807lC;
import X.C1A1M;
import X.C2204961BRm;
import X.C461720I8s;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C856850XjP;
import X.C856940XjY;
import X.C857030Xjh;
import X.C857430XkL;
import X.C870830YEf;
import X.C871360YGg;
import X.C880880Yh4;
import X.C893980Z5g;
import X.C897710ZJp;
import X.EnumC880850Yh1;
import X.InterfaceC1631620sYq;
import android.content.Intent;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.assem.GroupDetailNameAndDescAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoChangeAvatarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.InboxArchivePageTitleBarAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment;
import com.ss.android.ugc.aweme.msg.AwemeCardCenterAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class AwS663S0100000_14 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(C0YEC c0yec, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0yec;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(C897710ZJp c897710ZJp, int i) {
        super(3);
        this.$t = i;
        this.l0 = c897710ZJp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(C111C c111c, int i) {
        super(3);
        this.$t = i;
        this.l0 = c111c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(GroupDetailNameAndDescAssem groupDetailNameAndDescAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = groupDetailNameAndDescAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(EditGroupInfoChangeAvatarAssem editGroupInfoChangeAvatarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = editGroupInfoChangeAvatarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(InboxArchivePageTitleBarAssem inboxArchivePageTitleBarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = inboxArchivePageTitleBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(SessionListSingleChatVH sessionListSingleChatVH, int i) {
        super(3);
        this.$t = i;
        this.l0 = sessionListSingleChatVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(DetailFeedReplyMessageFragment detailFeedReplyMessageFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = detailFeedReplyMessageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS663S0100000_14(AwemeCardCenterAssem awemeCardCenterAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = awemeCardCenterAssem;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        Object value = ((GroupDetailNameAndDescAssem) awS663S0100000_14.l0).mp().LLILZIL.getValue();
        String str = ((C893980Z5g) ((GroupDetailNameAndDescAssem) awS663S0100000_14.l0).LLJJIJI.getValue()).LL;
        value.getClass();
        if (C1727806pg.LIZ.LIZ("group_chat_edit_group_info", str, C461720I8s.LIZIZ(), false)) {
            TuxTextView tuxTextViewIp = ((GroupDetailNameAndDescAssem) awS663S0100000_14.l0).ip();
            GroupDetailNameAndDescAssem groupDetailNameAndDescAssem = (GroupDetailNameAndDescAssem) awS663S0100000_14.l0;
            tuxTextViewIp.setText(tuxTextViewIp.getContext().getString(2131831352));
            tuxTextViewIp.setTextColorRes(R.attr.a1n);
            C786410Ut5.I7(new AbS695S0100000_14(groupDetailNameAndDescAssem, 2), tuxTextViewIp);
            C1584506Ih.LIZIZ(((GroupDetailNameAndDescAssem) awS663S0100000_14.l0).ip());
        } else {
            C1584506Ih.LIZ(((GroupDetailNameAndDescAssem) awS663S0100000_14.l0).ip());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        C0OO0 c0oo0;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        Intent intent = (Intent) obj3;
        if ((iIntValue == 10002 || iIntValue == 10030 || iIntValue == 10031) && intent != null && C724240Sb0.LIZ((EditGroupInfoChangeAvatarAssem) awS663S0100000_14.l0) != null && (c0oo0 = (C0OO0) ((EditGroupInfoChangeAvatarAssem) awS663S0100000_14.l0).LLJIJIL.getValue()) != null) {
            c0oo0.onActivityResult(iIntValue, iIntValue2, intent);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        String aid;
        List<UpvoteStruct> list;
        UpvoteStruct next;
        User user;
        String uid;
        String str = (String) obj2;
        if (((Boolean) obj3).booleanValue()) {
            Aweme awemeAS = ((DetailFeedReplyMessageFragment) awS663S0100000_14.l0).aS();
            String uid2 = null;
            if (awemeAS != null) {
                aid = awemeAS.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, str)) {
                UpvoteList upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(str);
                if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
                    Iterator<UpvoteStruct> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            UpvoteStruct upvoteStruct = next;
                            if (!C10EU.LJIILLIIL(upvoteStruct.user)) {
                                C1A1M c1a1m = C1A1M.LIZIZ;
                                User user2 = upvoteStruct.user;
                                if (user2 != null) {
                                    uid = user2.getUid();
                                } else {
                                    uid = null;
                                }
                                if (c1a1m.LIZ(uid)) {
                                    break;
                                }
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    UpvoteStruct upvoteStruct2 = next;
                    if (upvoteStruct2 != null && (user = upvoteStruct2.user) != null) {
                        uid2 = user.getUid();
                    }
                }
                ((DetailFeedReplyMessageFragment) awS663S0100000_14.l0).nm(uid2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        C1584506Ih.LIZIZ((View) ((AwemeCardCenterAssem) awS663S0100000_14.l0).LLJLLIL.getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        BaseContact baseContact = (BaseContact) obj3;
        if (str != null) {
            ((C897710ZJp) awS663S0100000_14.l0).LJ(baseContact.getAvatarThumb(), str);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        C786410Ut5.R7(((SessionListSingleChatVH) awS663S0100000_14.l0).S6(), null);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) throws Throwable {
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        RecommendHashtag recommendHashtag = (RecommendHashtag) obj3;
        C117U c117u = (C117U) ((C111C) awS663S0100000_14.l0).LIZIZ;
        C856850XjP c856850XjP = c117u.LLJI;
        VideoPublishEditModel videoPublishEditModel = c856850XjP.LJIIL;
        if (videoPublishEditModel != null) {
            videoPublishEditModel.creativeModel.commonMobModel.hasClickRecommendHashtag = true;
        }
        c117u.LLJJIII = false;
        C0ZI0 c0zi0 = c856850XjP.LIZIZ;
        int selectionStart = c0zi0.getSelectionStart();
        if (C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhtMPWgbgcDunV2Ky5uC0=", null)) != null) {
            C857030Xjh c857030XjhLIZIZ = C856940XjY.LIZIZ(C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhtMPWgbgcDunV2Ky5uC0=", null)).toString().substring(0, selectionStart), recommendHashtag.getChallengeName());
            if (c857030XjhLIZIZ.LIZJ != null) {
                C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhtMPWgbgcDunV2Ky5uC0=", null)).replace(selectionStart, selectionStart, c857030XjhLIZIZ.LIZJ);
                c0zi0.LJJJI(true);
                String strTrim = c857030XjhLIZIZ.LIZJ.trim();
                if (!C856940XjY.LIZJ(strTrim)) {
                    ((HashSet) c0zi0.LLJLILLLLZIIL).add(strTrim);
                }
                HashTagMobHelper hashTagMobHelper = c117u.LLJJJJ;
                if (hashTagMobHelper != null) {
                    hashTagMobHelper.yQ2(new C857430XkL(recommendHashtag.getChallengeName(), Integer.valueOf(iIntValue), "auto", recommendHashtag.getCid(), recommendHashtag.getQueryId(), "recommendation_auto", recommendHashtag.getLogId()), c117u.LLJLLIL, c117u.LLJL);
                }
                IAVPublishExtension.IAddHashTagCallback iAddHashTagCallback = c117u.LLJZ;
                if (iAddHashTagCallback != null) {
                    iAddHashTagCallback.onHashTagUpdate(c117u.LLJJJIL.LL);
                }
                if (!c0zi0.LLJILJILJ) {
                    c0zi0.requestFocus();
                    KeyboardUtils.LIZLLL(c0zi0);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        C0YEM c0yem = (C0YEM) obj2;
        C0YEC c0yec = (C0YEC) awS663S0100000_14.l0;
        C871360YGg c871360YGg = c0yec.LIZLLL;
        C0YEG c0yeg = c0yec.LJ;
        C0YF0 c0yf0 = new C0YF0();
        c0yf0.LIZIZ = (C870830YEf) obj3;
        return new C0YED(c0yem, new C0YEW(c0yf0, c0yem), jLongValue, c0yf0, c871360YGg, c0yeg);
    }

    public static final Object invoke$8(AwS663S0100000_14 awS663S0100000_14, Object obj, Object obj2, Object obj3) {
        C0OM1 c0om1;
        EnumC880850Yh1 enumC880850Yh1 = (EnumC880850Yh1) obj2;
        InboxArchivePageTitleBarAssem inboxArchivePageTitleBarAssem = (InboxArchivePageTitleBarAssem) awS663S0100000_14.l0;
        inboxArchivePageTitleBarAssem.getClass();
        int i = C880880Yh4.LIZ[enumC880850Yh1.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = inboxArchivePageTitleBarAssem.Jo().getString(2131845366);
                c0om1.LIZJ = c1250250idj;
                c0om1.LIZIZ(inboxArchivePageTitleBarAssem.Ho(enumC880850Yh1));
            } else {
                throw new C1954807lC();
            }
        } else {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZJ(new AwS558S0100000_14(inboxArchivePageTitleBarAssem, 1676));
            c0om1 = new C0OM1();
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj2 = new C1250250idj();
            c1250250idj2.LIZJ = inboxArchivePageTitleBarAssem.Jo().getString(2131830285);
            c0om1.LIZJ = c1250250idj2;
            if (C0CYM.LIZJ.LJIIIIZZ()) {
                c0om1.LIZIZ(inboxArchivePageTitleBarAssem.Ho(enumC880850Yh1));
            }
        }
        TuxNavBar tuxNavBar = (TuxNavBar) inboxArchivePageTitleBarAssem.LLJ.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        return Unit.LIZ;
    }
}
