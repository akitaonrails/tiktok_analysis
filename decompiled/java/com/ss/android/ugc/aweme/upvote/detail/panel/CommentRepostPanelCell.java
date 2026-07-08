package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.AbstractC468201s0;
import X.C01GW;
import X.C10EU;
import X.C123100dR;
import X.C1243240iSQ;
import X.C1247510iZJ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1355210lN1;
import X.C1357250lQJ;
import X.C1358040lRa;
import X.C1358550lSP;
import X.C1360460lVU;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C1388190mED;
import X.C1390850mIV;
import X.C13LP;
import X.C1402390mb7;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2211751BhN;
import X.C2344009Gk;
import X.C263730AVf;
import X.C298740BnM;
import X.C416570GVb;
import X.C427690Gpr;
import X.C430840Guw;
import X.C431100GvM;
import X.C438710HIf;
import X.C444920HcY;
import X.C452501pT;
import X.C786410Ut5;
import X.C946803n0;
import X.C991390buD;
import X.InterfaceC1358050lRb;
import X.InterfaceC1891350zJl;
import X.ViewOnLongClickListenerC1401960maQ;
import Y.ARunnableS0S3500000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanel;
import com.zhiliaoapp.musically.R;
import irm.AkS17S0000000_21;
import irm.AkS89S0100000_21;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentRepostPanelCell extends PowerCell<C1357250lQJ> {
    public UpvotePanelListViewModel LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(344));

    public final int P5() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public final Aweme R5() {
        UpvotePanelListViewModel upvotePanelListViewModel = this.LL;
        if (upvotePanelListViewModel != null) {
            return upvotePanelListViewModel.LLJIJIL;
        }
        return null;
    }

    public final VideoItemParams S5() {
        UpvotePanelListViewModel upvotePanelListViewModel = this.LL;
        if (upvotePanelListViewModel != null) {
            return upvotePanelListViewModel.LLJI;
        }
        return null;
    }

    public final void T5() {
        String str;
        String str2;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String tabName;
        MutableLiveData<UpvoteList> mutableLiveDataWQ2;
        UpvoteList value;
        List<UpvoteStruct> list;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Fragment fragmentLIZ;
        C1357250lQJ item = getItem();
        if (item == null) {
            return;
        }
        UpvoteStruct upvoteStruct = item.LL;
        if (upvoteStruct.isPublished()) {
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            VideoItemParams videoItemParams = item.LLILLL;
            String str3 = videoItemParams != null ? videoItemParams.mEventType : null;
            UpvotePanelListViewModel upvotePanelListViewModel = this.LL;
            if (upvotePanelListViewModel == null || (str = upvotePanelListViewModel.LL) == null) {
                str = "click_recommend_avatar";
            }
            C1358550lSP.LJIILIIL(c1358550lSP, str3, str, R5(), "long_press", null, null, null, null, null, null, item.LL.carrierId, 1008);
            if (!C10EU.LJIILLIIL(upvoteStruct.user)) {
                Aweme awemeR5 = R5();
                if (awemeR5 != null) {
                    UpvoteStruct upvoteStruct2 = item.LL;
                    C1355210lN1 c1355210lN1 = RepostSharePanel.LLJLILLLLZIIL;
                    UpvotePanelListViewModel upvotePanelListViewModel2 = this.LL;
                    boolean z = (upvotePanelListViewModel2 == null || (mutableLiveDataWQ2 = upvotePanelListViewModel2.wQ2()) == null || (value = mutableLiveDataWQ2.getValue()) == null || (list = value.upvotes) == null || list.size() != 1) ? false : true;
                    VideoItemParams videoItemParamsS5 = S5();
                    String str4 = "";
                    if (videoItemParamsS5 == null || (str2 = videoItemParamsS5.mEventType) == null) {
                        str2 = "";
                    }
                    VideoItemParams videoItemParamsS52 = S5();
                    if (videoItemParamsS52 != null && (baseFeedPageParams = videoItemParamsS52.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null && (tabName = c2189821An6.getTabName()) != null) {
                        str4 = tabName;
                    }
                    Fragment fragmentLIZ2 = C946803n0.LIZ(this.itemView);
                    c1355210lN1.getClass();
                    C1355210lN1.LIZ(awemeR5, upvoteStruct2, null, z, str2, str4, "long_press", null, null, null, fragmentLIZ2, false);
                    return;
                }
                return;
            }
            boolean z2 = !C123100dR.LIZ(item.LL.text);
            Context context = this.itemView.getContext();
            if (!(context instanceof C19GS) || (c19eg = (C19EG) context) == null) {
                return;
            }
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService == null || (fragmentLIZ = iDetailFeedSafService.LIZ(this.itemView)) == null || (supportFragmentManager = fragmentLIZ.getChildFragmentManager()) == null) {
                supportFragmentManager = c19eg.getSupportFragmentManager();
            }
            ArrayList arrayList = new ArrayList();
            if (z2 && C263730AVf.LIZ()) {
                U5(item, "show");
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZJ = 0;
                c1247510iZJ.LIZ = this.itemView.getContext().getString(2131846405);
                c1247510iZJ.LIZ(new AwS387S0200000_21(this, item, 51));
                arrayList.add(c1247510iZJ);
            }
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZJ = 0;
            c1247510iZJ2.LIZ = this.itemView.getContext().getString(2131846404);
            c1247510iZJ2.LIZ(new AwS600S0100000_21(this, 247));
            arrayList.add(c1247510iZJ2);
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJI(arrayList);
            c1390850mIV.LIZJ().show(supportFragmentManager, "comment_repost_panel_cell");
            VideoItemParams videoItemParamsS53 = S5();
            String str5 = videoItemParamsS53 != null ? videoItemParamsS53.mEventType : null;
            boolean zLIZ = C123100dR.LIZ(item.LL.text);
            String str6 = item.LL.carrierId;
            Aweme awemeR52 = R5();
            String aid = awemeR52 != null ? awemeR52.getAid() : null;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str5);
            c2344009Gk.LJIIIIZZ("enter_method", "recommend_panel");
            c2344009Gk.LIZJ(zLIZ ? 1 : 0, "with_recommendation");
            c2344009Gk.LJIIIIZZ("comment_id", str6);
            c2344009Gk.LJIIIIZZ("group_id", aid);
            C20684815ws.LJIILLIIL("ttsocial_repost_comment_menu_show", c2344009Gk.LIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (c19egLIZIZ != null) {
            this.LL = (UpvotePanelListViewModel) ViewModelProviders.of(c19egLIZIZ).get(UpvotePanelListViewModel.class);
        }
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 1));
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.zhz);
        TuxTextView tuxTextView2 = null;
        if (tuxTextView != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, tuxTextView.getContext());
            tuxTextView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.e_r);
        if (tuxTextView3 != null) {
            tuxTextView3.setMaxLines(3);
            C430840Guw c430840Guw = C430840Guw.LIZ;
            Context context = tuxTextView3.getContext();
            c430840Guw.getClass();
            tuxTextView3.setBackground(C430840Guw.LIZJ(context));
            tuxTextView2 = tuxTextView3;
        }
        this.LLILLL = tuxTextView2;
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 0));
        TuxTextView tuxTextView4 = this.LLILLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 1));
        }
        C427690Gpr.LIZLLL(this.itemView, 0);
    }

    public final void I5(CommentInfoStruct commentInfoStruct) {
        String text;
        Comment comment;
        final String strLIZ;
        UrlModel avatarThumb;
        UpvoteStruct upvoteStruct;
        Comment comment2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" -- bindCommentBlock: ");
        final String str = null;
        if (commentInfoStruct != null && (comment2 = commentInfoStruct.comment) != null) {
            text = comment2.getText();
        } else {
            text = null;
        }
        sbLIZ.append(text);
        C2188811AlT.LIZIZ(sbLIZ);
        final TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView == null) {
            return;
        }
        if (commentInfoStruct != null && (comment = commentInfoStruct.comment) != null) {
            User user = comment.getUser();
            if (user != null) {
                C1243240iSQ.LIZ.getClass();
                strLIZ = C1243240iSQ.LIZ(user, true);
            } else {
                strLIZ = null;
            }
            final String str2 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            String text2 = comment.getText();
            if (text2 != null) {
                str2 = text2;
            }
            final List<String> list = commentInfoStruct.contentTypeTags;
            final List<TextExtraStruct> textExtra = comment.getTextExtra();
            C1360500lVY c1360500lVYN5 = N5(strLIZ, str2, null, list, textExtra);
            C430840Guw c430840Guw = C430840Guw.LIZ;
            Context context = this.itemView.getContext();
            c430840Guw.getClass();
            C430840Guw.LIZLLL(tuxTextView, c1360500lVYN5, context);
            User user2 = comment.getUser();
            if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null) {
                C1357250lQJ item = getItem();
                if (item != null && (upvoteStruct = item.LL) != null) {
                    str = upvoteStruct.upvoteId;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                int iP5 = P5();
                int iP52 = P5();
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iP5;
                c1331670kl3LJIIIIZZ.LJIIIZ = iP52;
                c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.0lRZ
                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        if (bitmap == null) {
                            return;
                        }
                        TuxTextView tuxTextView2 = tuxTextView;
                        HandlerHook.viewPost(tuxTextView2, new ARunnableS0S3500000_21(this, str, strLIZ, str2, bitmap, list, textExtra, tuxTextView2, 0));
                    }
                });
            }
            C786410Ut5.I7(new AkS89S0100000_21(this, 7), tuxTextView);
            return;
        }
        tuxTextView.setText(this.itemView.getContext().getString(2131846406));
        C786410Ut5.I7(new AkS17S0000000_21(0), tuxTextView);
    }

    public final void L5(UpvoteStruct upvoteStruct) {
        String string;
        List<? extends TextExtraStruct> list;
        String str = upvoteStruct.text;
        boolean zLIZ = C1360460lVU.LIZIZ.LIZ();
        int iIntValue = 0;
        if (C123100dR.LIZ(str) && zLIZ) {
            string = this.itemView.getContext().getString(2131846407, str);
        } else {
            string = this.itemView.getContext().getString(2131846408);
        }
        C430840Guw c430840Guw = C430840Guw.LIZ;
        Context context = this.itemView.getContext();
        Long lValueOf = Long.valueOf(upvoteStruct.createTime);
        c430840Guw.getClass();
        CharSequence charSequenceLIZ = C430840Guw.LIZ(context, lValueOf, string);
        if (zLIZ && C123100dR.LIZ(str) && (list = upvoteStruct.textExtra) != null && !list.isEmpty() && C298740BnM.LIZ()) {
            List<? extends TextExtraStruct> list2 = upvoteStruct.textExtra;
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                int iLJJJ = a0.LJJJ(charSequenceLIZ.toString(), str, 0, false, 6);
                if (iLJJJ >= 0 && list2 != null && !list2.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceLIZ);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ba, this.itemView.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    }
                    InterfaceC1358050lRb interfaceC1358050lRb = new InterfaceC1358050lRb() { // from class: X.0lRY
                        @Override // X.InterfaceC1358050lRb
                        public final void LIZ(TextExtraStruct textExtraStruct) {
                            String userId;
                            UpvoteStruct upvoteStruct2;
                            String str2;
                            String tabName;
                            String str3;
                            String strLIZIZ;
                            UpvoteStruct upvoteStruct3;
                            UpvoteStruct upvoteStruct4;
                            VideoItemParams videoItemParams;
                            BaseFeedPageParams baseFeedPageParams;
                            C2189821An6 c2189821An6;
                            C1358110lRh c1358110lRh = C1358110lRh.LIZ;
                            Activity activityLIZ = C1388190mED.LIZ(this.LIZ.itemView.getContext());
                            String str4 = null;
                            if (textExtraStruct != null) {
                                userId = textExtraStruct.getUserId();
                            } else {
                                userId = null;
                            }
                            C1357250lQJ item = this.LIZ.getItem();
                            if (item != null) {
                                upvoteStruct2 = item.LLILLJJLI;
                            } else {
                                upvoteStruct2 = null;
                            }
                            VideoItemParams videoItemParamsS5 = this.LIZ.S5();
                            if (videoItemParamsS5 != null) {
                                str2 = videoItemParamsS5.mEventType;
                            } else {
                                str2 = null;
                            }
                            C1357250lQJ item2 = this.LIZ.getItem();
                            if (item2 == null || (videoItemParams = item2.LLILLL) == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                                tabName = "";
                            }
                            c1358110lRh.getClass();
                            C1358110lRh.LIZ(activityLIZ, userId, upvoteStruct2, str2, "repost_panel_mention", tabName);
                            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                            VideoItemParams videoItemParamsS52 = this.LIZ.S5();
                            if (videoItemParamsS52 != null) {
                                str3 = videoItemParamsS52.mEventType;
                            } else {
                                str3 = null;
                            }
                            VideoItemParams videoItemParamsS53 = this.LIZ.S5();
                            if (videoItemParamsS53 != null) {
                                UpvotePanelListViewModel.LLJJIJI.getClass();
                                strLIZIZ = C1358120lRi.LIZIZ(videoItemParamsS53, null);
                            } else {
                                strLIZIZ = null;
                            }
                            C1357250lQJ item3 = this.LIZ.getItem();
                            if (item3 != null) {
                                upvoteStruct3 = item3.LL;
                            } else {
                                upvoteStruct3 = null;
                            }
                            C1357250lQJ item4 = this.LIZ.getItem();
                            if (item4 != null && (upvoteStruct4 = item4.LL) != null) {
                                str4 = upvoteStruct4.carrierId;
                            }
                            C1358550lSP.LJIILJJIL(c1358550lSP, str3, strLIZIZ, upvoteStruct3, null, "mention", false, null, str4, "comment", Boolean.valueOf(C298420Bmq.LIZ()), 136);
                        }
                    };
                    for (TextExtraStruct textExtraStruct : list2) {
                        int start = textExtraStruct.getStart() + iLJJJ;
                        int end = textExtraStruct.getEnd() + iLJJJ;
                        if (start >= 0 && end <= spannableStringBuilder.length() && start < end) {
                            C786410Ut5.q2(spannableStringBuilder, new C1358040lRa(interfaceC1358050lRb, iIntValue, textExtraStruct), start, end, 33);
                        }
                    }
                    tuxTextView.setMovementMethod(new C431100GvM(AFwS209S0000000_21.get$arr$(452), new AwS600S0100000_21(this, 246)));
                    tuxTextView.setText(spannableStringBuilder);
                    return;
                }
                tuxTextView.setText(charSequenceLIZ);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setMovementMethod(null);
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(charSequenceLIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String nickname;
        Comment comment;
        User user;
        C1357250lQJ c1357250lQJ = (C1357250lQJ) interfaceC1891350zJl;
        super.onBindItemView(c1357250lQJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindItemView: ");
        CommentInfoStruct commentInfoStruct = c1357250lQJ.LL.commentInfo;
        if (commentInfoStruct != null && (comment = commentInfoStruct.comment) != null && (user = comment.getUser()) != null) {
            nickname = user.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        L5(c1357250lQJ.LL);
        I5(c1357250lQJ.LL.commentInfo);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6_, viewGroup, false);
    }

    public final void U5(C1357250lQJ c1357250lQJ, String str) {
        String str2;
        Comment comment;
        User user;
        UpvoteStruct upvoteStruct = c1357250lQJ.LL;
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParamsS5 = S5();
        String uid = null;
        if (videoItemParamsS5 != null) {
            str2 = videoItemParamsS5.mEventType;
        } else {
            str2 = null;
        }
        Aweme awemeR5 = R5();
        String str3 = upvoteStruct.carrierId;
        CommentInfoStruct commentInfoStruct = upvoteStruct.commentInfo;
        if (commentInfoStruct != null && (comment = commentInfoStruct.comment) != null && (user = comment.getUser()) != null) {
            uid = user.getUid();
        }
        C1358550lSP.LJIJJLI(c1358550lSP, str2, "recommend_panel_add_note", awemeR5, str, null, 0, null, str3, uid, "comment", 112);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1357250lQJ c1357250lQJ = (C1357250lQJ) interfaceC1891350zJl;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ instanceof C991390buD) {
            UpvoteStruct upvoteStruct = c1357250lQJ.LL;
            C991390buD c991390buD = (C991390buD) objLJJJLZIJ;
            if (c991390buD.LIZ || c991390buD.LIZIZ) {
                L5(upvoteStruct);
            }
            if (c991390buD.LIZJ) {
                I5(upvoteStruct.commentInfo);
            }
        }
    }

    public final C1360500lVY N5(String str, String str2, Bitmap bitmap, List list, List list2) {
        boolean z;
        String strLIZIZ;
        int iIntValue;
        int iIntValue2;
        Bitmap bitmapCreateBitmap = bitmap;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(C13LP.LJJLIIIJ(list, " ", null, null, 0, null, null, 62));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" ");
        sbLIZ2.append(str);
        sbLIZ2.append(' ');
        sbLIZ2.append(str2);
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZLLL(strLIZIZ2);
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        if (bitmapCreateBitmap == null) {
            int iP5 = P5();
            bitmapCreateBitmap = Bitmap.createBitmap(iP5, iP5, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            paint.setColor(-2500135);
            float f = iP5 / 2.0f;
            canvas.drawCircle(f, f, f, paint);
        }
        int iP52 = P5();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iP52, iP52, true);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iP52, iP52, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint2 = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateScaledBitmap, tileMode, tileMode));
        float f2 = iP52 / 2.0f;
        canvas2.drawCircle(f2, f2, f2, paint2);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.itemView.getContext().getResources(), bitmapCreateBitmap2);
        bitmapDrawable.setBounds(0, 0, P5(), P5());
        C786410Ut5.r2(c1360500lVY, new C416570GVb(bitmapDrawable), 0, 1, 33);
        int length = str.length() + 1;
        c1360500lVY.LIZJ(1, length, new C444920HcY(42, false));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1360500lVY.LIZJ(1, length, new ForegroundColorSpan(iIntValue));
        int i = length + 1;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ba, this.itemView.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it2.next();
                int start = textExtraStruct.getStart() + i;
                int end = textExtraStruct.getEnd() + i;
                if (start >= 0 && end <= c1360500lVY.length() && start < end) {
                    c1360500lVY.LIZJ(start, end, new C1358040lRa(null, iIntValue2, textExtraStruct));
                }
            }
        }
        if (list != null && !list.isEmpty() && strLIZIZ.length() > 0) {
            c1360500lVY.LIZJ((strLIZIZ2.length() - strLIZIZ.length()) + 1, strLIZIZ2.length(), new ForegroundColorSpan(iIntValue2));
        }
        return c1360500lVY;
    }
}
