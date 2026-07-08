package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0A8H;
import X.C0BJT;
import X.C0CAU;
import X.C0HHT;
import X.C0R93;
import X.C0RSR;
import X.C0RYF;
import X.C0WZX;
import X.C0XQ7;
import X.C1209980ham;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1346240l8Y;
import X.C1346910l9d;
import X.C1346920l9e;
import X.C1347310lAH;
import X.C1351190lGX;
import X.C1351250lGd;
import X.C1351290lGh;
import X.C1353500lKG;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214851BmN;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C2487409ou;
import X.C275960Ari;
import X.C288950BUf;
import X.C294360BgI;
import X.C294380BgK;
import X.C295380Bhw;
import X.C299670Bor;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C453940Hr6;
import X.C523420Kfs;
import X.C697530RXr;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1341680l1C;
import X.EnumC1346360l8k;
import X.EnumC1351150lGT;
import X.EnumC452301pR;
import X.EnumC700430Rdh;
import X.InterfaceC1347460lAW;
import X.InterfaceC1348780lCe;
import X.InterfaceC1351090lGN;
import X.InterfaceC1351180lGW;
import X.InterfaceC1351220lGa;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC737440SwI;
import Y.ACListenerS155S0100000_21;
import Y.ACListenerS48S0201000_21;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.feed.adapter.FypExposedCommentAvoidViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.HelpPostInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.SocialQuickCommentConfig;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AFwS342S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoQuickCommentAssem extends BaseCellSlotComponent<VideoQuickCommentAssem> implements InterfaceC1348780lCe {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLILI;
    public static final int LLLLJ;
    public SmartAvatarImageView LLJLLIL;
    public TuxTextView LLJLLL;
    public View LLJZ;
    public LinearLayout LLJZIJLIL;
    public ViewGroup LLL;
    public InterfaceC1347460lAW LLLF;
    public C1353500lKG LLLFF;
    public final C01GW LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS259S0000000_21.get$arr$(152));
    public final C01GW LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS259S0000000_21.get$arr$(153));
    public final C01GW LLLI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(154));
    public final InterfaceC1731706qJ LLLII;
    public InterfaceC737440SwI LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public String LLLIIL;
    public View LLLIILIL;
    public View LLLIL;
    public CommentInputContent LLLILZ;
    public long LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public InterfaceC1351180lGW LLLLII;
    public String LLLLIIIILLL;
    public boolean LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final InterfaceC1731706qJ LLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoQuickCommentAssem.class, "quickCommentVM", "getQuickCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/quickcomment/VideoQuickCommentVM;", 0);
        C13LE.LIZ.getClass();
        LLLLILI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(VideoQuickCommentAssem.class, "exposedCommentAvoidVM", "getExposedCommentAvoidVM()Lcom/ss/android/ugc/aweme/feed/adapter/FypExposedCommentAvoidViewModel;", 0)};
        LLLLJ = C299670Bor.LIZ() ? 40 : Intrinsics.LJFF(C697530RXr.LIZ().enableQuickComment, Boolean.TRUE) ? 44 : 50;
    }

    public VideoQuickCommentAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoQuickCommentVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLII = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ, 550), null, AFwS259S0000000_21.get$arr$(150));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLLIIIIL = true;
        this.LLLIIIL = true;
        this.LLLIIL = "";
        this.LLLILZLLLI = "";
        this.LLLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 552));
        this.LLLJIL = C452501pT.LIZ(enumC452301pR, AFwS209S0000000_21.get$arr$(259));
        this.LLLJL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 554));
        this.LLLL = C452501pT.LIZ(enumC452301pR, AFwS209S0000000_21.get$arr$(258));
        this.LLLLIIL = true;
        this.LLLLIILL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 548));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 553));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FypExposedCommentAvoidViewModel.class);
        this.LLLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ2, 551), null, AFwS259S0000000_21.get$arr$(151));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbd;
    }

    public final void Up() {
        Context context;
        LinearLayout linearLayout;
        if (Bp() || (context = getContext()) == null) {
            return;
        }
        C1351250lGd c1351250lGd = C1351250lGd.LIZ;
        Aweme commentInputAweme = getCommentInputAweme();
        c1351250lGd.getClass();
        List listLJ = C1351250lGd.LJ(context, commentInputAweme);
        LinearLayout linearLayout2 = this.LLJZIJLIL;
        if (linearLayout2 != null && linearLayout2.getChildCount() > 0 && (linearLayout = this.LLJZIJLIL) != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        int size = listLJ.size();
        for (int i = 0; i < size; i++) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.LJJJJI(C299670Bor.LIZ() ? 24.0f : 22.0f);
            tuxTextView.setGravity(17);
            tuxTextView.setText((CharSequence) ListProtector.get(listLJ, i));
            C786410Ut5.h9(tuxTextView, new ACListenerS48S0201000_21(context, this, listLJ, i, 7));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            if (i < listLJ.size() - 1) {
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            LinearLayout linearLayout3 = this.LLJZIJLIL;
            if (linearLayout3 != null) {
                linearLayout3.addView(tuxTextView, layoutParams);
            }
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final /* bridge */ /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputClick() {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEvent(C1346240l8Y c1346240l8Y) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct) {
    }

    public final boolean Bp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0R93.LIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType) && C0BJT.LIZ();
    }

    public final InterfaceC1351220lGa Gp() {
        return (InterfaceC1351220lGa) this.LLLL.getValue();
    }

    public final HashMap<String, String> Ip() {
        AwemeCommentConfig commentConfig;
        SocialQuickCommentConfig socialQuickCommentConfig;
        Map<String, String> map;
        HashMap<String, String> map2 = new HashMap<>();
        C1351250lGd c1351250lGd = C1351250lGd.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
        c1351250lGd.getClass();
        if (C1351250lGd.LJIILLIIL(aweme, str)) {
            map2.put("social_show_timing", this.LLLIIL);
            Aweme commentInputAweme = getCommentInputAweme();
            if (commentInputAweme != null && (commentConfig = commentInputAweme.getCommentConfig()) != null && (socialQuickCommentConfig = commentConfig.socialQuickCommentConfig) != null && (map = socialQuickCommentConfig.recMetrics) != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    value.toString();
                    map2.put(key, value);
                }
            }
        }
        return map2;
    }

    public final UpdatePendingAbility Jp() {
        return (UpdatePendingAbility) this.LLLLIILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C2487409ou.LIZJ(new ARunnableS121S0100000_21(this, 69));
    }

    @Override // X.InterfaceC1348780lCe
    public final int getCommentInputViewType() {
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLLLII;
        if (interfaceC1351180lGW != null && interfaceC1351180lGW.LJI()) {
            return 10;
        }
        InterfaceC1351180lGW interfaceC1351180lGW2 = this.LLLLII;
        return (interfaceC1351180lGW2 == null || !interfaceC1351180lGW2.LIZJ()) ? 2 : 11;
    }

    @Override // X.InterfaceC1348780lCe
    public final boolean checkCommentInputable() {
        Aweme commentInputAweme;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || (commentInputAweme = getCommentInputAweme()) == null) {
            return false;
        }
        AwemeControl awemeControl = commentInputAweme.getAwemeControl();
        if (awemeControl == null) {
            return true;
        }
        awemeControl.canComment();
        return true;
    }

    @Override // X.InterfaceC1348780lCe
    public final Aweme getCommentInputAweme() {
        return ((VideoItemParams) bo()).getAweme();
    }

    @Override // X.InterfaceC1348780lCe
    public final String getEventType() {
        return ((VideoItemParams) bo()).mEventType;
    }

    public final void iq() {
        String authorUid;
        String str;
        if (!Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            C2487409ou.LIZJ(new ARunnableS121S0100000_21(this, 70));
            return;
        }
        if (LJJIJL().getVisibility() == 0 && getContentView().getVisibility() == 0) {
            Aweme commentInputAweme = getCommentInputAweme();
            if (commentInputAweme == null || !AwemeExtKt.isWithSurvey(commentInputAweme)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) bo()).mEventType);
                Aweme commentInputAweme2 = getCommentInputAweme();
                String aid = commentInputAweme2 != null ? commentInputAweme2.getAid() : null;
                String strLIZIZ = "";
                if (aid == null) {
                    aid = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                LinearLayout linearLayout = this.LLJZIJLIL;
                c2344009Gk.LJFF("show_cnt", String.valueOf(linearLayout != null ? linearLayout.getChildCount() : 0));
                Aweme commentInputAweme3 = getCommentInputAweme();
                if (commentInputAweme3 == null || (authorUid = AwemeExtKt.getAuthorUid(commentInputAweme3)) == null) {
                    authorUid = "";
                }
                c2344009Gk.LJFF("author_id", authorUid);
                LinearLayout linearLayout2 = this.LLJZIJLIL;
                String strLIZIZ2 = "text";
                if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
                    LinearLayout linearLayout3 = this.LLJZIJLIL;
                    if (linearLayout3 != null) {
                        int childCount = linearLayout3.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append((Object) ((AppCompatTextView) linearLayout3.getChildAt(i)).getText());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (i != linearLayout3.getChildCount() - 1) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ);
                                sbLIZ2.append(',');
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                    }
                    c2344009Gk.LJFF("emoji_type", strLIZIZ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("text");
                    sbLIZ3.append(",emoji");
                    c2344009Gk.LJFF("action_type", C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    ViewGroup viewGroup = this.LLL;
                    if (viewGroup == null || viewGroup.getVisibility() != 0) {
                        c2344009Gk.LJFF("action_type", "text");
                    } else {
                        InterfaceC1347460lAW interfaceC1347460lAW = this.LLLF;
                        String strLIZ = interfaceC1347460lAW != null ? interfaceC1347460lAW.LIZ() : null;
                        if (C123100dR.LIZ(strLIZ)) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("text");
                            sbLIZ4.append(',');
                            sbLIZ4.append(strLIZ);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                        }
                        c2344009Gk.LJFF("action_type", strLIZIZ2);
                    }
                }
                if (Bp()) {
                    str = "outer_comment_input_show";
                } else {
                    Vp(c2344009Gk);
                    str = "show_quick_comment_panel";
                }
                UpdatePendingAbility updatePendingAbilityJp = Jp();
                if (updatePendingAbilityJp != null) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    if (!updatePendingAbilityJp.h2((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null))) {
                        return;
                    }
                }
                if (!Intrinsics.LJFF(str, "show_quick_comment_panel") || this.LLLIIIL) {
                    this.LLLIIIL = false;
                    C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        yp();
        if (this.LLJJIJI) {
            Qp(false, false, EnumC1351150lGT.DEFAULT, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // X.InterfaceC1348780lCe
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.FEED_QUICK_COMMENT;
    }

    public static final void dq(VideoQuickCommentAssem videoQuickCommentAssem) {
        Object obj;
        if (!videoQuickCommentAssem.LLJJIII || C729510SjV.LJJ(videoQuickCommentAssem.getCommentInputAweme())) {
            return;
        }
        if ((C288950BUf.LIZ() & 8) == 8) {
            C724270Sb3 c724270Sb3 = videoQuickCommentAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!AwemeBizExtKt.isFriendsVideoUnread(((VideoItemParams) obj).getAweme())) {
                videoQuickCommentAssem.Qp(false, false, EnumC1351150lGT.DEFAULT, null);
            }
        }
        if (videoQuickCommentAssem.LJJIJL().getVisibility() == 0) {
            videoQuickCommentAssem.iq();
        }
    }

    public final void Vp(C2344009Gk c2344009Gk) {
        long commentCount;
        Object obj;
        AwemeStatistics statistics;
        Object obj2;
        AwemeStatistics statistics2;
        PhotoModeImageInfo photoModeImageInfo;
        HelpPostInfo helpPostInfo;
        AwemeStatistics statistics3;
        Aweme commentInputAweme = getCommentInputAweme();
        if (commentInputAweme != null && (statistics3 = commentInputAweme.getStatistics()) != null) {
            commentCount = statistics3.getCommentCount();
        } else {
            commentCount = 0;
        }
        c2344009Gk.LJFF("visible_comment_cnt", String.valueOf(commentCount));
        C1351250lGd c1351250lGd = C1351250lGd.LIZ;
        Aweme commentInputAweme2 = getCommentInputAweme();
        c1351250lGd.getClass();
        if (C1351250lGd.LJIIZILJ(commentInputAweme2)) {
            Aweme commentInputAweme3 = getCommentInputAweme();
            if (commentInputAweme3 != null && (photoModeImageInfo = commentInputAweme3.getPhotoModeImageInfo()) != null && (helpPostInfo = photoModeImageInfo.getHelpPostInfo()) != null) {
                c2344009Gk.LJFF(Scene.SCENE_SERVICE, "quick_help_post_card_search_comment");
                c2344009Gk.LJII(helpPostInfo.mobExtra);
                return;
            }
            return;
        }
        Object obj3 = null;
        if (C1351290lGh.LIZIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj2).mEventType, "homepage_hot") && C294360BgI.LIZ()) {
                if (C1351250lGd.LJIIIZ(getCommentInputAweme()) == EnumC1351150lGT.ZERO_COMMENT) {
                    Aweme commentInputAweme4 = getCommentInputAweme();
                    if (commentInputAweme4 != null && (statistics2 = commentInputAweme4.getStatistics()) != null && statistics2.getCommentCount() == 0) {
                        c2344009Gk.LJFF(Scene.SCENE_SERVICE, "zero_comment");
                        return;
                    } else {
                        c2344009Gk.LJFF(Scene.SCENE_SERVICE, "low_comment");
                        return;
                    }
                }
                if (C1351250lGd.LJIIIZ(getCommentInputAweme()) != EnumC1351150lGT.DOUBLE_FOLLOW) {
                    return;
                }
                c2344009Gk.LJFF(Scene.SCENE_SERVICE, "friends");
                c2344009Gk.LJI(Ip());
                return;
            }
        }
        Aweme commentInputAweme5 = getCommentInputAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        if (C1351250lGd.LJIILJJIL(commentInputAweme5, ((VideoItemParams) obj).mEventType)) {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, "friends");
            c2344009Gk.LJI(Ip());
            return;
        }
        Aweme commentInputAweme6 = getCommentInputAweme();
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        }
        if (!C1351250lGd.LJIIL(commentInputAweme6, ((VideoItemParams) obj3).mEventType)) {
            return;
        }
        Aweme commentInputAweme7 = getCommentInputAweme();
        if (commentInputAweme7 != null && (statistics = commentInputAweme7.getStatistics()) != null && statistics.getCommentCount() == 0) {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, "zero_comment");
        } else {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, "low_comment");
        }
    }

    public final void fq(String str) {
        String aid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEventType());
        Aweme commentInputAweme = getCommentInputAweme();
        String authorUid = null;
        if (commentInputAweme != null) {
            aid = commentInputAweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("action_type", str);
        Aweme commentInputAweme2 = getCommentInputAweme();
        if (commentInputAweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(commentInputAweme2);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        Vp(c2344009Gk);
        C20684815ws.LJIILLIIL("click_quick_comment_panel", c2344009Gk.LIZ);
    }

    public final void jq(String str) {
        Object obj;
        if (C294380BgK.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_hot")) {
                ((FypExposedCommentAvoidViewModel) this.LLLLIL.getValue(this, LLLLILI[1])).vQ2(str);
            }
        }
    }

    public final void lq(boolean z) {
        long commentCount;
        AwemeStatistics statistics;
        String authorUid;
        if (z) {
            View view = this.LLLIILIL;
            if (view != null && view.getVisibility() == 8) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) bo()).mEventType);
                Aweme commentInputAweme = getCommentInputAweme();
                String aid = null;
                if (commentInputAweme != null) {
                    aid = commentInputAweme.getAid();
                }
                String str = "";
                if (aid == null) {
                    aid = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                Aweme commentInputAweme2 = getCommentInputAweme();
                if (commentInputAweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(commentInputAweme2)) != null) {
                    str = authorUid;
                }
                c2344009Gk.LJIIIIZZ("author_id", str);
                Aweme commentInputAweme3 = getCommentInputAweme();
                if (commentInputAweme3 != null && (statistics = commentInputAweme3.getStatistics()) != null) {
                    commentCount = statistics.getCommentCount();
                } else {
                    commentCount = 0;
                }
                c2344009Gk.LIZLLL(commentCount, "visible_comment_cnt");
                c2344009Gk.LJIIIIZZ("element_name", "send");
                Vp(c2344009Gk);
                C20684815ws.LJIILLIIL("ttinter_quick_comment_extend_panel_element_show", c2344009Gk.LIZ);
            }
            View view2 = this.LLLIILIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = this.LLLIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
                return;
            }
            return;
        }
        View view4 = this.LLLIILIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        View view5 = this.LLLIL;
        if (view5 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view5);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishStart(Comment comment) {
        boolean z;
        String awemeId;
        if (comment == null) {
            return;
        }
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 != null && awemeId2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Aweme commentInputAweme = getCommentInputAweme();
            if (commentInputAweme == null || (awemeId = commentInputAweme.getAid()) == null) {
                awemeId = "";
            }
        } else {
            awemeId = comment.getAwemeId();
        }
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(C0RYF.LIZ(getHostLifecycleOwner()), C724240Sb0.LIZ(getHostLifecycleOwner()));
        if (listLJJIZ != null) {
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).ei(comment);
            }
        }
        C0RSR c0rsr = new C0RSR(0, null);
        c0rsr.LIZJ = awemeId;
        C1440005kM.LIZ(c0rsr);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLLIL = (SmartAvatarImageView) view.findViewById(R.id.l9h);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.zld);
        this.LLJZ = view.findViewById(R.id.v_touch_area);
        this.LLJZIJLIL = (LinearLayout) view.findViewById(R.id.ncy);
        this.LLL = (ViewGroup) view.findViewById(R.id.krs);
        this.LLLFF = (C1353500lKG) view.findViewById(R.id.o_j);
        if (C299670Bor.LIZ()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            C786410Ut5.W5(view, layoutParams);
            TuxTextView tuxTextView = this.LLJLLL;
            if (tuxTextView != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                    C786410Ut5.W5(tuxTextView, marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            LinearLayout linearLayout = this.LLJZIJLIL;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    C786410Ut5.W5(linearLayout, marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            SmartAvatarImageView smartAvatarImageView = this.LLJLLIL;
            if (smartAvatarImageView != null) {
                ViewGroup.LayoutParams layoutParams4 = smartAvatarImageView.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    C786410Ut5.W5(smartAvatarImageView, layoutParams4);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        if (((Number) C295380Bhw.LIZ.getValue()).intValue() > 1 && !C275960Ari.LIZ()) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if (layoutParams5 != null) {
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.width = -1;
                C786410Ut5.W5(view, layoutParams6);
                SmartAvatarImageView smartAvatarImageView2 = this.LLJLLIL;
                if (smartAvatarImageView2 != null) {
                    C786410Ut5.o(smartAvatarImageView2, 0);
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJ(this.LLJLLIL);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.eh);
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        Ep(null, true);
        View view2 = this.LLJZ;
        if (view2 != null) {
            setComponentClickStatusExperimental(view2, EnumC700430Rdh.POSITIVE);
        }
        View view3 = this.LLJZ;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 175), view3);
        }
        Up();
        if (C0A8H.LIZ()) {
            this.LLLIILIL = view.findViewById(R.id.cuv);
            this.LLLIL = view.findViewById(R.id.i2d);
            View view4 = this.LLLIILIL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS155S0100000_21(this, 176), view4);
            }
        }
        if (!C1351290lGh.LIZIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLII.getValue(this, LLLLILI[0]), new C2217381BqS() { // from class: X.0Spb
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C733280Spa) obj).LLILLJJLI;
                }
            }, null, AFwS305S0000000_21.get$arr$(70), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0RSt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLILZLL;
                }
            }, null, AFwS305S0000000_21.get$arr$(71), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0RHR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJIJIL;
                }
            }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(72), 4);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLI.getValue(), new C2217381BqS() { // from class: X.0RCH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 134), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLI.getValue(), new C2217381BqS() { // from class: X.0Rsv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJJ;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 133), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLI.getValue(), new C2217381BqS() { // from class: X.0SJy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(67), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0RDo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJJ;
            }
        }, null, AFwS305S0000000_21.get$arr$(68), 6);
        if (C1351290lGh.LIZIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0R8Y
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJ;
                }
            }, null, AFwS305S0000000_21.get$arr$(65), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0cFj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLILZIL;
                }
            }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(66), 4);
            C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0NzR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJI;
                }
            }, new C2217381BqS() { // from class: X.0lUv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJILJIL;
                }
            }, C736820SvI.LIZLLL(), AFwS342S0000000_21.get$arr$(0), 8);
        }
        if (!C1351290lGh.LIZIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLI.getValue(), new C2217381BqS() { // from class: X.0R9n
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJJIJIL;
                }
            }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(69), 4);
        }
        C0CAU.LIZIZ(new ARunnableS121S0100000_21(this, 116));
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem.up(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ep(java.lang.CharSequence r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem.Ep(java.lang.CharSequence, boolean):void");
    }

    public final void Wp(String str, EnumC1341680l1C enumC1341680l1C) {
        CommentService.LIZ.getClass();
        InterfaceC737440SwI interfaceC737440SwILJLILLLLZI = C523420Kfs.LIZ().LJLILLLLZI(C724240Sb0.LIZ(this), C724240Sb0.LJI(this), getCommentInputAweme(), getEventType(), "click_quick_panel", null, new C1346920l9e(false, false, false, false, false, false, EnumC1346360l8k.FEED_QUICK_COMMENT, 0, enumC1341680l1C, false, new C1346910l9d("", null, null, 0, EnumC1341680l1C.TEXT, str, null, "", null, ""), false), null);
        if (interfaceC737440SwILJLILLLLZI != null) {
            interfaceC737440SwILJLILLLLZI.rn(new AwS600S0100000_21(this, 117));
            interfaceC737440SwILJLILLLLZI.e6(new AwS565S0100000_21(this, 549));
            interfaceC737440SwILJLILLLLZI.hr(new AwS600S0100000_21(this, 118));
        } else {
            interfaceC737440SwILJLILLLLZI = null;
        }
        this.LLLIIII = interfaceC737440SwILJLILLLLZI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (X.C1351250lGd.LJIILL(r3, ((com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0).mEventType, false) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aq(com.ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7) {
        /*
            r5 = this;
            X.0lGd r2 = X.C1351250lGd.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.getCommentInputAweme()
            X.0Sb3 r0 = r5.LLJI
            r4 = 0
            if (r0 == 0) goto L69
            java.lang.Object r0 = r0.LL
        Ld:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r0 = r0.mEventType
            r2.getClass()
            r2 = 0
            boolean r0 = X.C1351250lGd.LJIILIIL(r1, r0, r2)
            r1 = 1
            if (r0 == 0) goto L6c
            boolean r0 = X.C294360BgI.LIZ()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.getCommentInputAweme()
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.LL
        L2c:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r0 = r0.mEventType
            boolean r0 = X.C1351250lGd.LJIILL(r3, r0, r2)
            if (r0 != 0) goto L6c
        L36:
            boolean r0 = X.C1351290lGh.LIZJ()
            if (r0 == 0) goto L6b
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L42
            java.lang.Object r4 = r0.LL
        L42:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r4 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig r0 = r0.getCommentConfig()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.feed.model.QuickCommentConfig r0 = r0.quickCommentConfig
            if (r0 == 0) goto L6b
            java.lang.Integer r0 = r0.recLevel
            if (r0 == 0) goto L6b
            int r0 = r0.intValue()
            if (r0 != r1) goto L6b
            com.ss.android.ugc.aweme.experiment.QuickCommentV2Config r0 = X.C1351290lGh.LIZ()
            if (r0 == 0) goto L66
            boolean r0 = r0.enableLikeDecouplingEstimated
            if (r0 != 0) goto L6b
        L66:
            return r2
        L67:
            r0 = r4
            goto L2c
        L69:
            r0 = r4
            goto Ld
        L6b:
            return r1
        L6c:
            boolean r0 = X.C1351270lGf.LIZ()
            if (r0 == 0) goto L85
            boolean r0 = X.C1351250lGd.LJIILLIIL(r6, r7)
            if (r0 == 0) goto L85
            boolean r0 = X.C1351260lGe.LIZIZ(r6, r7)
            if (r0 != 0) goto L85
            boolean r0 = X.C1351260lGe.LIZJ(r6)
            if (r0 == 0) goto L85
            return r1
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem.aq(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):boolean");
    }

    public final void kq(boolean z, EnumC1351150lGT enumC1351150lGT) {
        Object obj;
        if (!this.LLJJIII) {
            return;
        }
        if (z) {
            UpdatePendingAbility updatePendingAbilityJp = Jp();
            if (updatePendingAbilityJp != null) {
                updatePendingAbilityJp.C4();
                return;
            }
            return;
        }
        UpdatePendingAbility updatePendingAbilityJp2 = Jp();
        String aid = null;
        if (updatePendingAbilityJp2 != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!updatePendingAbilityJp2.h2((VideoItemParams) obj)) {
                return;
            }
        }
        InterfaceC1351220lGa interfaceC1351220lGaGp = Gp();
        Aweme commentInputAweme = getCommentInputAweme();
        if (commentInputAweme != null) {
            aid = commentInputAweme.getAid();
        }
        C1351190lGX c1351190lGX = interfaceC1351220lGaGp.get(aid);
        Qp(!c1351190lGX.LIZIZ, true ^ c1351190lGX.LIZ, enumC1351150lGT, new AwS422S0200000_21(this, c1351190lGX, 39));
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputKeyboardDismiss(boolean z, C1347310lAH c1347310lAH) throws Throwable {
        MentionSpan[] mentionSpan;
        SpannableString spannableStringValueOf;
        Editable editableLLLZZIL;
        Editable editableLLLZZIL2;
        Context context = getContext();
        if (context == null) {
            return;
        }
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLLLII;
        if (interfaceC1351180lGW != null) {
            interfaceC1351180lGW.LIZLLL();
        }
        C1353500lKG c1353500lKG = this.LLLFF;
        if (c1353500lKG != null) {
            mentionSpan = c1353500lKG.getMentionSpan();
        } else {
            mentionSpan = null;
        }
        if (mentionSpan != null && mentionSpan.length != 0) {
            int iLIZ = C960203pA.LIZ(R.attr.ee, context);
            C1353500lKG c1353500lKG2 = this.LLLFF;
            if (c1353500lKG2 != null) {
                c1353500lKG2.setMentionTextColor(iLIZ);
            }
            C1353500lKG c1353500lKG3 = this.LLLFF;
            if (c1353500lKG3 != null) {
                c1353500lKG3.LJIIL();
            }
        }
        C1353500lKG c1353500lKG4 = this.LLLFF;
        if (c1353500lKG4 != null && (editableLLLZZIL2 = C2204961BRm.LLLZZIL(c1353500lKG4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3SFFktabgE7A5pkyVLmbVoV/yDyqU8O5K6S5uIJldvdthzfwicSyMgk=", null))) != null) {
            spannableStringValueOf = SpannableString.valueOf(editableLLLZZIL2);
        } else {
            spannableStringValueOf = null;
        }
        C1353500lKG c1353500lKG5 = this.LLLFF;
        if (c1353500lKG5 != null && (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3SFFktabgE7A5pkyVLmbVoV/yDyqU8O5K6S5uIJldvdthzfwicSyMgk=", null))) != null) {
            SpannableString.valueOf(editableLLLZZIL);
        }
        Ep(spannableStringValueOf, true);
        C1440005kM.LIZ(new C453940Hr6(false, false, 4));
    }

    public static void Xp(long j, String str, Boolean bool) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJIIIIZZ("action_type", str);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str2 = "1";
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("is_success", str2);
        C20684815ws.LJIILLIIL("quick_comment_click_duration", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputKeyboardShow(boolean z, String str, C1347310lAH c1347310lAH) {
        C1440005kM.LIZ(new C453940Hr6(true, false, 4));
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        String str;
        String strLJII;
        if (comment == null) {
            return;
        }
        if (comment.getPublishScenario() == 1) {
            if (this.LLLILZJ > 0 && Intrinsics.LJFF(this.LLLILZLLLI, "quick_emoji")) {
                Xp(System.currentTimeMillis() - this.LLLILZJ, this.LLLILZLLLI, Boolean.FALSE);
                this.LLLILZJ = 0L;
            }
        } else {
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().LLD(getContext(), exc);
        }
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(C0RYF.LIZ(getHostLifecycleOwner()), C724240Sb0.LIZ(getHostLifecycleOwner()));
        if (listLJJIZ != null) {
            comment.setIgnoreToast(true);
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).vz(comment);
            }
        }
        if (Bp()) {
            str = "click_out_input_box";
        } else {
            str = "click_quick_panel";
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Aweme commentInputAweme = getCommentInputAweme();
        String eventType = getEventType();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLLLII;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        } else {
            strLJII = null;
        }
        commentServiceLIZ.LJLLI(comment, commentInputAweme, eventType, str, false, strLJII, comment.getImageList());
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse) {
        boolean z2;
        String awemeId;
        boolean z3;
        String str;
        String strSubstring;
        Object obj;
        int length;
        if (!this.LLJJIII) {
            return;
        }
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 != null && awemeId2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        String strLJII = null;
        if (z2) {
            Aweme commentInputAweme = getCommentInputAweme();
            if (commentInputAweme == null || (awemeId = commentInputAweme.getAid()) == null) {
                awemeId = "";
            }
        } else {
            awemeId = comment.getAwemeId();
        }
        if (comment.getPublishScenario() == 1) {
            z3 = true;
            if (this.LLLILZJ > 0 && Intrinsics.LJFF(this.LLLILZLLLI, "quick_emoji")) {
                Xp(System.currentTimeMillis() - this.LLLILZJ, this.LLLILZLLLI, Boolean.TRUE);
                this.LLLILZJ = 0L;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            String text = comment.getText();
            if (text != null) {
                String text2 = comment.getText();
                if (text2 != null) {
                    length = text2.length();
                } else {
                    length = 0;
                }
                strSubstring = text.substring(0, length / 3);
            } else {
                strSubstring = null;
            }
            if (!C729510SjV.LJJ(getCommentInputAweme()) && strSubstring != null && strSubstring.length() != 0) {
                AssemViewModel assemViewModel = (AssemViewModel) this.LLLII.getValue(this, LLLLILI[0]);
                assemViewModel.getClass();
                assemViewModel.setState(new AwS62S1000000_11(strSubstring, 8));
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                DataCenter dataCenter = ((VideoItemParams) obj).dataCenter;
                if (dataCenter != null) {
                    dataCenter.zQ2(strSubstring, "on_click_quick_emoji");
                }
            }
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
            c1389890mGx.LJIIIZ(2131829203);
            c1389890mGx.LJIIJJI();
        }
        C1440005kM.LIZ(new C1209980ham(3, new Object[]{awemeId, comment.m169clone()}));
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(C0RYF.LIZ(getHostLifecycleOwner()), C724240Sb0.LIZ(getHostLifecycleOwner()));
        if (listLJJIZ != null) {
            comment.setIgnoreToast(true);
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).LO(comment);
            }
        }
        if (Bp()) {
            str = "click_out_input_box";
        } else {
            str = "click_quick_panel";
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Aweme commentInputAweme2 = getCommentInputAweme();
        String eventType = getEventType();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLLLII;
        if (interfaceC1351180lGW != null) {
            strLJII = interfaceC1351180lGW.LJII();
        }
        commentServiceLIZ.LJLLI(comment, commentInputAweme2, eventType, str, true, strLJII, comment.getImageList());
        C2214851BmN.LJFF(6);
    }

    @Override // X.InterfaceC1348780lCe
    public final void publishCommentPost(Comment comment, Bitmap bitmap, String str) {
        CommentService.LIZ.getClass();
        C523420Kfs.LIZ().LJJLI(getCommentInputAweme(), comment, getContext(), getEventType());
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0185  */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0kzi, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qp(final boolean r21, final boolean r22, final X.EnumC1351150lGT r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem.Qp(boolean, boolean, X.0lGT, kotlin.jvm.functions.Function0):void");
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C1347310lAH c1347310lAH) {
        String str3;
        boolean zRe2;
        String strLJII;
        if (Bp()) {
            str3 = "click_out_input_box";
        } else {
            str3 = "click_quick_panel";
        }
        IExposedCommentAbility iExposedCommentAbility = (IExposedCommentAbility) this.LLLLIILL.getValue();
        if (iExposedCommentAbility != null) {
            zRe2 = iExposedCommentAbility.Re2();
        } else {
            zRe2 = false;
        }
        c1347310lAH.LJIIJJI = zRe2;
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        Aweme commentInputAweme = getCommentInputAweme();
        String eventType = getEventType();
        InterfaceC1351180lGW interfaceC1351180lGW = this.LLLLII;
        if (interfaceC1351180lGW == null || (strLJII = interfaceC1351180lGW.LJII()) == null) {
            strLJII = this.LLLLIIIILLL;
        }
        commentServiceLIZ.LJLLLL(commentInputAweme, charSequence, eventType, str3, i, c1347310lAH, strLJII);
    }
}
