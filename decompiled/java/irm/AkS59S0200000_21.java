package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0JMD;
import X.C0LAB;
import X.C0OM1;
import X.C1247690iZb;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1253930ijf;
import X.C127A;
import X.C127K;
import X.C128Y;
import X.C1308910kAL;
import X.C1355670lNl;
import X.C1356720lPS;
import X.C1356730lPT;
import X.C1358130lRj;
import X.C1358170lRn;
import X.C1358550lSP;
import X.C1359720lUI;
import X.C1360460lVU;
import X.C1383370m6R;
import X.C1388190mED;
import X.C1390380mHk;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1393100mM8;
import X.C1393110mM9;
import X.C1401450mZb;
import X.C1401470mZd;
import X.C1440005kM;
import X.C1445410niV;
import X.C1587170rP9;
import X.C1589640rT8;
import X.C1610870s1N;
import X.C19EG;
import X.C2038407yg;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C259800zU;
import X.C343950De5;
import X.C343970De7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1379590m0L;
import X.EnumC1393020mM0;
import X.InterfaceC1260110itd;
import X.InterfaceC1398220mUO;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.editpost.BizExpiration;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder;
import com.ss.android.ugc.aweme.music.v2.assem.OpenAlbumAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.share.improve.action.delete.DeleteReeditSheetContentFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.ICreatorCenterApi;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelFragmentAbility;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostReplyGuideCell;
import com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes22.dex */
public class AkS59S0200000_21 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS59S0200000_21 akS59S0200000_21, View view) {
        ((OpenAlbumAssem) akS59S0200000_21.l0).zp();
    }

    public static final void LIZ$1(AkS59S0200000_21 akS59S0200000_21, View view) {
        ((Function0) akS59S0200000_21.l0).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((DeleteReeditSheetContentFragment) akS59S0200000_21.l1, new C343950De5());
    }

    public static final void LIZ$10(AkS59S0200000_21 akS59S0200000_21, View view) {
        MusicSquareViewHolder musicSquareViewHolder = (MusicSquareViewHolder) akS59S0200000_21.l0;
        InterfaceC1398220mUO interfaceC1398220mUO = musicSquareViewHolder.LLLI;
        if (interfaceC1398220mUO != null) {
            interfaceC1398220mUO.onClickTopDesc(musicSquareViewHolder.LL, (View) akS59S0200000_21.l1);
        }
    }

    public static final void LIZ$11(AkS59S0200000_21 akS59S0200000_21, View view) {
        C1401450mZb c1401450mZb;
        List<String> queryKeywords;
        C1401450mZb c1401450mZb2;
        String biz;
        int i = ((C1401470mZd) akS59S0200000_21.l0).LLJILLL;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "music_detail_page");
        c0lab.LJ("entrance_type", "pin");
        c0lab.LIZ(i, "draft_cnt");
        c0lab.LJ("click_type", "body");
        c0lab.LJ("land_page", "draft_box");
        C20684815ws.LJIILLIIL("recall_drafts_entrance_click", c0lab.LIZ);
        InterfaceC1260110itd interfaceC1260110itd = ((C1401470mZd) akS59S0200000_21.l0).LLIZ;
        if (interfaceC1260110itd != null) {
            interfaceC1260110itd.NN();
        }
        Aweme aweme = ((C1401470mZd) akS59S0200000_21.l0).LL;
        if ((aweme instanceof C1401450mZb) && (c1401450mZb = (C1401450mZb) aweme) != null && (queryKeywords = c1401450mZb.getQueryKeywords()) != null) {
            Aweme aweme2 = ((C1401470mZd) akS59S0200000_21.l0).LL;
            if ((aweme2 instanceof C1401450mZb) && (c1401450mZb2 = (C1401450mZb) aweme2) != null && (biz = c1401450mZb2.getBiz()) != null) {
                Bundle bundle = new Bundle();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(queryKeywords);
                C786410Ut5.LJJJIL(bundle, "subType_query_keyword", arrayList);
                C786410Ut5.LJJJI("subType_query_type", biz, bundle);
                IAVDraftService iAVDraftService = (IAVDraftService) ((C1401470mZd) akS59S0200000_21.l0).LLIZLLLIL.getValue();
                if (iAVDraftService != null) {
                    iAVDraftService.openDraftActivity(((View) akS59S0200000_21.l1).getContext(), bundle);
                }
            }
        }
    }

    public static final void LIZ$2(AkS59S0200000_21 akS59S0200000_21, View view) {
        String cid;
        String str;
        RepostPanelFragmentAbility repostPanelFragmentAbility;
        VideoItemParams videoItemParams;
        Comment comment;
        UpvotePanelListCell upvotePanelListCell = (UpvotePanelListCell) akS59S0200000_21.l0;
        UpvoteStruct upvoteStruct = (UpvoteStruct) akS59S0200000_21.l1;
        upvotePanelListCell.getClass();
        CommentInfoStruct commentInfoStruct = upvoteStruct.commentInfo;
        if ((commentInfoStruct != null && (comment = commentInfoStruct.comment) != null && (cid = comment.getCid()) != null && cid.length() > 0) || (cid = upvoteStruct.carrierId) != null) {
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            C1358130lRj item = upvotePanelListCell.getItem();
            if (item != null && (videoItemParams = item.LLILLJJLI) != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            C1358550lSP.LJIILIIL(c1358550lSP, str, upvotePanelListCell.f6(), upvotePanelListCell.a6(), "comment_repost_quote", null, null, null, null, null, null, cid, 1008);
            upvotePanelListCell.u6("comment_repost_quote");
            C128Y c128yLIZ = C946803n0.LIZ(upvotePanelListCell.itemView);
            if ((c128yLIZ instanceof RepostPanelFragmentAbility) && (repostPanelFragmentAbility = (RepostPanelFragmentAbility) c128yLIZ) != null) {
                repostPanelFragmentAbility.uz2(C343970De7.LIZ);
            }
            C1440005kM.LIZ(new C2038407yg(cid, C1360460lVU.LIZIZ.LJJJJIZL()));
        }
    }

    public static final void LIZ$3(AkS59S0200000_21 akS59S0200000_21, View view) {
        ((UpvotePanelListCell) akS59S0200000_21.l0).w6(((C1358130lRj) akS59S0200000_21.l1).LL);
        ((UpvotePanelListCell) akS59S0200000_21.l0).u6("other");
    }

    public static final void LIZ$4(AkS59S0200000_21 akS59S0200000_21, View view) {
        String str;
        String aid;
        int iLIZLLL;
        String uid;
        FragmentManager childFragmentManager;
        RepostReplyGuideCell repostReplyGuideCell = (RepostReplyGuideCell) akS59S0200000_21.l0;
        C1355670lNl c1355670lNl = (C1355670lNl) akS59S0200000_21.l1;
        repostReplyGuideCell.getClass();
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = repostReplyGuideCell.I5().LLILLJJLI;
        String str2 = null;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        String strAQ2 = repostReplyGuideCell.I5().AQ2();
        boolean zLJ = C1359720lUI.LJ(c1355670lNl.LL);
        Aweme aweme = repostReplyGuideCell.I5().LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        UpvoteStruct upvoteStruct = c1355670lNl.LL;
        String str3 = upvoteStruct.upvoteId;
        User user = upvoteStruct.user;
        if (user != null) {
            iLIZLLL = C1358170lRn.LIZLLL(user);
        } else {
            iLIZLLL = 0;
        }
        User user2 = c1355670lNl.LL.user;
        if (user2 != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", strAQ2);
        c2344009Gk.LIZJ(zLJ ? 1 : 0, "with_text");
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LIZJ(iLIZLLL, "follow_status");
        C1358170lRn.LIZ(c2344009Gk, "repost_id", str3);
        C1358170lRn.LIZ(c2344009Gk, "replied_uid", uid);
        C1358170lRn.LIZ(c2344009Gk, "reply_to_user_id", null);
        C20684815ws.LJIILLIIL("ttsocial_repost_panel_reply_guide_click", c2344009Gk.LIZ);
        RepostReplyGuideCell repostReplyGuideCell2 = (RepostReplyGuideCell) akS59S0200000_21.l0;
        UpvoteStruct upvoteStruct2 = ((C1355670lNl) akS59S0200000_21.l1).LL;
        Fragment fragmentLIZ = C946803n0.LIZ(repostReplyGuideCell2.itemView);
        if (fragmentLIZ != null && (childFragmentManager = fragmentLIZ.getChildFragmentManager()) != null) {
            String str4 = upvoteStruct2.upvoteId;
            User user3 = upvoteStruct2.user;
            boolean zLJ2 = C1359720lUI.LJ(upvoteStruct2);
            Aweme aweme2 = repostReplyGuideCell2.I5().LL;
            VideoItemParams videoItemParams2 = repostReplyGuideCell2.I5().LLILLJJLI;
            if (videoItemParams2 != null) {
                str2 = videoItemParams2.mEventType;
            }
            C1356720lPS.LIZ(repostReplyGuideCell2.I5().LLILLJJLI, new C1356730lPT(null, str4, user3, zLJ2, aweme2, str2, "click_zero_reply_guide", repostReplyGuideCell2.I5().LLILZLL, repostReplyGuideCell2.I5().AQ2()), false).show(childFragmentManager, "repost_reply_keyboard");
        }
    }

    public static final void LIZ$5(AkS59S0200000_21 akS59S0200000_21, View view) {
        String str;
        EffectProfileViewHolder effectProfileViewHolder = (EffectProfileViewHolder) akS59S0200000_21.l0;
        Context context = effectProfileViewHolder.itemView.getContext();
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) akS59S0200000_21.l1;
        effectProfileViewHolder.getClass();
        ICreatorCenterApi iCreatorCenterApi = (ICreatorCenterApi) ServiceManager.get().getService(ICreatorCenterApi.class);
        int i = newFaceStickerBean.effectSource;
        String str2 = newFaceStickerBean.effectId;
        str2.toString();
        iCreatorCenterApi.LIZ(context, i, str2, "profile_effect_tag", null);
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        boolean z = effectProfileViewHolder.LLJI;
        String str3 = newFaceStickerBean.effectId;
        c1253930ijf.getClass();
        Pair[] pairArr = new Pair[2];
        if (z) {
            str = "self";
        } else {
            str = "others";
        }
        pairArr[0] = new Pair("profile_type", str);
        pairArr[1] = new Pair("resource_id", str3);
        C20684815ws.LJIILLIIL("profile_top_effect_badge_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2 A[PHI: r3
      0x00b2: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean), (r3v3 boolean) binds: [B:43:0x00af, B:23:0x007a, B:25:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$6(irm.AkS59S0200000_21 r18, android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS59S0200000_21.LIZ$6(irm.AkS59S0200000_21, android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static final void LIZ$7(AkS59S0200000_21 akS59S0200000_21, View view) {
        final C19EG c19egLIZIZ;
        final MufUserCell mufUserCell = (MufUserCell) akS59S0200000_21.l0;
        final User user = ((C1247690iZb) akS59S0200000_21.l1).LL;
        mufUserCell.getClass();
        C1393110mM9 c1393110mM9 = new C1393110mM9(C1393100mM8.LIZIZ(user), "relation_tab", "profile_click", "", user.getFollowStatus(), "show", null, 448);
        C1610870s1N.LIZ.getClass();
        if (C1610870s1N.LIZIZ()) {
            C1589640rT8.LIZIZ.b3(mufUserCell.itemView.getContext(), C946803n0.LIZ(mufUserCell.itemView), user, EnumC1393020mM0.FRIENDS_LIST, null, c1393110mM9);
            return;
        }
        Context context = mufUserCell.itemView.getContext();
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19egLIZIZ), R.layout.c_w, null, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.xfs);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c127k.setBackground(c384050F3z.LIZ(c19egLIZIZ));
        final C127A c127a = new C127A(c19egLIZIZ);
        c127a.LJIILJJIL(user.isMuted());
        c127a.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0mM3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
                C1393110mM9 c1393110mM92 = new C1393110mM9(user.isMuted(), "relation_tab", "profile_click", "", user.getFollowStatus(), "click", null, 448);
                c1587170rP9.getClass();
                C1587170rP9.LJIIIZ(c1393110mM92);
                if (z) {
                    C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                    User user2 = user;
                    Fragment fragmentLIZ = C946803n0.LIZ(mufUserCell.itemView);
                    C19EG c19eg = c19egLIZIZ;
                    EnumC1393020mM0 enumC1393020mM0 = EnumC1393020mM0.FRIENDS_LIST;
                    C1393190mMH c1393190mMH = new C1393190mMH(user.getFollowStatus(), "relation_tab", "profile_click", "", null, 112);
                    c1589640rT8.M2(c19eg, viewTd, fragmentLIZ, c1393190mMH, enumC1393020mM0, EnumC1392960mLu.ALL, user2, new AwS230S0300000_21(mufUserCell, user, c127a, 29));
                    return;
                }
                C1589640rT8.LIZIZ.K2(user, C946803n0.LIZ(mufUserCell.itemView), c19egLIZIZ, EnumC1393020mM0.FRIENDS_LIST, EnumC1392960mLu.ALL, viewTd, new AwS230S0300000_21(mufUserCell, user, c127a, 30));
            }
        });
        c127k.setAccessory(c127a);
        c127k.setSubtitle(c19egLIZIZ.getText(2131837830));
        C259800zU c259800zU = new C259800zU();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        String nickname = user.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        c1250250idj.LIZJ = nickname;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LJIIIIZZ = C1383370m6R.LJIIJ(2131823353);
        c1251150ifB.LIZJ(new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 852));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ.LLJJIII = viewTd;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, c19egLIZIZ);
        ?? r2 = c1390920mIc.LIZ;
        r2.LLJI = numLIZJ;
        r2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0mM5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        c259800zU.element = r2;
        r2.show(c19egLIZIZ.getSupportFragmentManager(), "FriendsListMoreSettings");
        C1587170rP9.LIZ.getClass();
        C1587170rP9.LJIIIZ(c1393110mM9);
    }

    public static final void LIZ$8(AkS59S0200000_21 akS59S0200000_21, View view) {
        String string;
        int i;
        Activity activityRequireActivity = ((C1445410niV) akS59S0200000_21.l0).requireActivity();
        Integer num = (Integer) akS59S0200000_21.l1;
        int value = C0JMD.NO_SHOW.getValue();
        if (num != null && num.intValue() == value) {
            string = activityRequireActivity.getResources().getString(2131844839);
        } else {
            int value2 = C0JMD.GRAYED_OUT_FOR_FREQ_CONTROL.getValue();
            if (num != null && num.intValue() == value2) {
                string = activityRequireActivity.getResources().getString(2131833461);
            } else {
                int value3 = C0JMD.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue();
                if (num != null && num.intValue() == value3) {
                    Resources resources = activityRequireActivity.getResources();
                    Object[] objArr = new Object[1];
                    BizExpiration[] editPostBizExPiration = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getEditPostBizExPiration();
                    if (editPostBizExPiration != null) {
                        ArrayList arrayList = new ArrayList();
                        for (BizExpiration bizExpiration : editPostBizExPiration) {
                            if (bizExpiration.bizType <= EnumC1379590m0L.COVER.getValue()) {
                                arrayList.add(bizExpiration);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            i = ((BizExpiration) it2.next()).expirationDay;
                            while (it2.hasNext()) {
                                int i2 = ((BizExpiration) it2.next()).expirationDay;
                                if (i < i2) {
                                    i = i2;
                                }
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        i = 0;
                    }
                    objArr[0] = Integer.valueOf(i);
                    string = resources.getString(2131833460, objArr);
                } else {
                    string = activityRequireActivity.getResources().getString(2131833463);
                }
            }
        }
        Activity activityRequireActivity2 = ((C1445410niV) akS59S0200000_21.l0).requireActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C1390380mHk.LIZ(activityRequireActivity2, 2021, creativeToastBuilder);
    }

    public static final void LIZ$9(AkS59S0200000_21 akS59S0200000_21, View view) {
        MusicSquareViewHolder musicSquareViewHolder = (MusicSquareViewHolder) akS59S0200000_21.l0;
        InterfaceC1398220mUO interfaceC1398220mUO = musicSquareViewHolder.LLLI;
        if (interfaceC1398220mUO != null) {
            interfaceC1398220mUO.onClickBottomDesc(musicSquareViewHolder.LL, (View) akS59S0200000_21.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS59S0200000_21(OpenAlbumAssem openAlbumAssem, View view, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = openAlbumAssem;
        this.l1 = view;
    }

    public AkS59S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
