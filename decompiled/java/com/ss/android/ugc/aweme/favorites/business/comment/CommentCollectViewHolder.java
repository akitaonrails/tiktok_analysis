package com.ss.android.ugc.aweme.favorites.business.comment;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.AnonymousClass0175;
import X.C036E;
import X.C0IKF;
import X.C0XQ7;
import X.C10EU;
import X.C1206450hV5;
import X.C123100dR;
import X.C1260870iur;
import X.C12ES;
import X.C1324840ka2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1339660kxw;
import X.C1342220l24;
import X.C1343720l4U;
import X.C1344480l5i;
import X.C1345080l6g;
import X.C1345700l7g;
import X.C1346060l8G;
import X.C1346070l8H;
import X.C1346090l8J;
import X.C1346240l8Y;
import X.C1346440l8s;
import X.C1347310lAH;
import X.C1348710lCX;
import X.C1348730lCZ;
import X.C1350750lFp;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1353700lKa;
import X.C1354920lMY;
import X.C1381440m3K;
import X.C1389890mGx;
import X.C1395000mPC;
import X.C15O7;
import X.C1602160rnK;
import X.C1906580ziK;
import X.C19738412Ko;
import X.C19EG;
import X.C20145813s8;
import X.C20244914Jj;
import X.C20684815ws;
import X.C207069161b;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C294190Bg1;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C420090Gdb;
import X.C426750GoL;
import X.C427870Gq9;
import X.C438710HIf;
import X.C465320IMo;
import X.C616460OFw;
import X.C631450Opj;
import X.C737370SwB;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.DialogInterfaceOnCancelListenerC1401970maR;
import X.DialogInterfaceOnClickListenerC1401900maK;
import X.EnumC1346360l8k;
import X.InterfaceC1206560hVG;
import X.InterfaceC1345780l7o;
import X.InterfaceC1346080l8I;
import X.InterfaceC1346260l8a;
import X.InterfaceC1348780lCe;
import X.InterfaceC2385309Wh;
import Y.ACListenerS155S0100000_21;
import Y.ACallableS426S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectListAdapter;
import com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.ICreativeAppDiffService;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCollectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener, InterfaceC1206560hVG, InterfaceC1348780lCe, InterfaceC1345780l7o, InterfaceC1346080l8I, Observer<C1339660kxw> {
    public static final int $stable = 8;
    public C427870Gq9 commentAvatar;
    public final int commentAvatarSize;
    public CommentCollectListAdapter commentCollectAdapter;
    public TuxTextView commentMessage;
    public TuxTextView commentUserName;
    public RemoteImageView commentVideoCover;
    public final boolean isFromMyProfile;
    public Activity mActivity;
    public InterfaceC1346260l8a mCommentActionSheetClickListener;
    public C1346070l8H mCommentDeletePresenter;
    public C1348730lCZ mCommentInputManager;
    public C1343720l4U mCommentTranslateRepository;
    public Fragment mFragment;
    public Comment mItem;
    public TuxTextView regularReplyButton;
    public C420090Gdb translateStatusView;
    public TuxActionSheet tuxLongPressDialog;
    public TuxTextView videoReplyButton;

    public boolean checkCommentInputAtUserClickable() {
        return true;
    }

    @Override // X.InterfaceC1348780lCe
    public boolean checkCommentInputable() {
        return true;
    }

    @Override // X.InterfaceC1348780lCe
    public int getCommentInputViewType() {
        return 3;
    }

    @Override // X.InterfaceC1348780lCe
    public String getEnterMethod() {
        return "collection_comment";
    }

    @Override // X.InterfaceC1348780lCe
    public String getEventType() {
        return "collection_comment";
    }

    public Comment getForwardComment() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ String getSessionId() {
        return null;
    }

    public boolean isEventBusRegistered() {
        return false;
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    public void onCommentInputAtUserClick(boolean z) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onCommentInputClick() {
    }

    @Override // X.InterfaceC1348780lCe
    public void onCommentInputKeyboardDismiss(boolean z, C1347310lAH c1347310lAH) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onCommentInputKeyboardShow(boolean z, String str, C1347310lAH c1347310lAH) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onCommentInputPublishStart(Comment comment) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEvent(C1346240l8Y c1346240l8Y) {
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ void publishCommentPost(Comment comment, Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct) {
    }

    private final InterfaceC1346260l8a createCommentActionSheetClickListener() {
        return new InterfaceC1346260l8a() { // from class: X.0l8X
            @Override // X.InterfaceC1346260l8a
            public final /* synthetic */ void LIZIZ() {
            }

            @Override // X.InterfaceC1346260l8a
            public final /* synthetic */ void LIZJ() {
            }

            @Override // X.InterfaceC1346260l8a
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJ() {
            }

            @Override // X.InterfaceC1346260l8a
            public final /* synthetic */ void LJIIIZ() {
            }

            @Override // X.InterfaceC1346260l8a
            public final /* synthetic */ void LJIIJ() {
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJIILJJIL(Comment comment, PhotoToStickerExtra photoToStickerExtra) {
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1346260l8a
            public final /* synthetic */ void LJIIZILJ() {
            }

            @Override // X.InterfaceC1346260l8a
            public final void onCancel() {
            }

            @Override // X.InterfaceC1346260l8a
            public final void LIZ() {
                Comment comment;
                CommentCollectViewHolder commentCollectViewHolder = this.LIZ;
                Activity activity = commentCollectViewHolder.mActivity;
                if (activity == null || (comment = commentCollectViewHolder.mItem) == null) {
                    return;
                }
                commentCollectViewHolder.report(activity, comment);
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJFF() {
                this.LIZ.resetTranslate();
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJI() {
                CommentCollectViewHolder commentCollectViewHolder = this.LIZ;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.commentCollect(comment, 1);
                }
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJIIIIZZ() {
                this.LIZ.translate();
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJIIL() {
                CommentCollectViewHolder commentCollectViewHolder = this.LIZ;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.commentCollect(comment, 0);
                }
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJIILL() {
                CommentCollectViewHolder commentCollectViewHolder = this.LIZ;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.copy(comment);
                }
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJJJLIIL() {
                CommentCollectViewHolder commentCollectViewHolder = this.LIZ;
                Comment comment = commentCollectViewHolder.mItem;
                if (comment != null) {
                    commentCollectViewHolder.delete(comment);
                }
            }

            @Override // X.InterfaceC1346260l8a
            public final void LJII(CommentVideoModel.Type type, Comment comment) {
                CommentVideoModel.Type type2 = CommentVideoModel.Type.COMMENT;
                if (type == type2) {
                    C294190Bg1.LIZ.getClass();
                    if (C294190Bg1.LIZ()) {
                        this.LIZ.openRecord("comment_press", type, comment);
                        return;
                    }
                }
                C1348730lCZ c1348730lCZ = this.LIZ.mCommentInputManager;
                if (c1348730lCZ != null && c1348730lCZ.LLL && type == type2 && c1348730lCZ != null) {
                    c1348730lCZ.LJJIIZ("comment_press", type, comment);
                }
            }
        };
    }

    private final SpannableString getItemText() {
        List<TextExtraStruct> textExtra;
        int i;
        Comment comment = this.mItem;
        SpannableString spannableString = new SpannableString(comment != null ? comment.getText() : null);
        Comment comment2 = this.mItem;
        if (comment2 != null && (textExtra = comment2.getTextExtra()) != null) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct.getType() == 8 || textExtraStruct.getType() == 9) {
                    int length = spannableString.length();
                    int start = textExtraStruct.getStart() < 0 ? 0 : textExtraStruct.getStart();
                    if (textExtraStruct.getEnd() <= length) {
                        textExtraStruct.getEnd();
                    }
                    if (start > spannableString.length() || (i = start + 1) > spannableString.length()) {
                        break;
                    }
                    C786410Ut5.p2(spannableString, getIcon(textExtraStruct.getType()), start, i, 18);
                }
            }
        }
        return spannableString;
    }

    private final boolean invalidNetwork() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return true;
        }
        if (INVOKESTATIC_com_ss_android_ugc_aweme_favorites_business_comment_CommentCollectViewHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(activity)) {
            return false;
        }
        tuxToastGenerator(2131837962, 0);
        return true;
    }

    private final void onTranslating() {
        this.translateStatusView.setLoading(true);
        this.translateStatusView.setLoadingText(2131829235);
    }

    private final void regularReplyButtonAction() {
        C786410Ut5.h9(this.regularReplyButton, new ACListenerS155S0100000_21(this, 65));
    }

    private final void videoReplyButtonAction() {
        C786410Ut5.h9(this.videoReplyButton, new ACListenerS155S0100000_21(this, 66));
    }

    @Override // X.InterfaceC1348780lCe
    public Aweme getCommentInputAweme() {
        Comment comment = this.mItem;
        if (comment != null) {
            return comment.getAliasAweme();
        }
        return null;
    }

    @Override // X.InterfaceC1206560hVG
    public void onShowItem() {
        Comment comment = this.mItem;
        if (comment != null) {
            String cid = comment.getCid();
            String strLIZJ = C1206450hV5.LIZJ(1);
            C2344009Gk c2344009GkLIZIZ = C1206450hV5.LIZIZ("comment", "collection_comment");
            c2344009GkLIZIZ.LJIIIIZZ("comment_id", cid);
            C20684815ws.LJIILLIIL(strLIZJ, c2344009GkLIZIZ.LIZ);
        }
    }

    @Override // X.InterfaceC1345780l7o
    public void resetTranslate() {
        Comment comment = this.mItem;
        if (comment == null || this.mCommentTranslateRepository == null) {
            return;
        }
        C1343720l4U.LIZLLL(comment);
    }

    @Override // X.InterfaceC1345780l7o
    public void translate() {
        String uid;
        User author;
        Comment comment = this.mItem;
        if (comment != null) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            String curUserId = iAccountUserServiceLJFF != null ? ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId() : null;
            String strLIZ = C1350750lFp.LIZ(comment);
            if (!C123100dR.LIZ(strLIZ)) {
                strLIZ = "text_comment";
            }
            CommentStickerStruct stickerStruct = comment.getStickerStruct();
            String id = stickerStruct != null ? stickerStruct.getId() : null;
            C2344009Gk c2344009Gk = new C2344009Gk();
            Aweme aliasAweme = comment.getAliasAweme();
            if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            c2344009Gk.LJIIIIZZ("enter_from", "collection_comment");
            String cid = comment.getCid();
            if (cid == null) {
                cid = "";
            }
            c2344009Gk.LJIIIIZZ("comment_id", cid);
            if (curUserId == null) {
                curUserId = "";
            }
            c2344009Gk.LJIIIIZZ("user_id", curUserId);
            String awemeId = comment.getAwemeId();
            c2344009Gk.LJIIIIZZ("group_id", awemeId != null ? awemeId : "");
            Aweme aliasAweme2 = comment.getAliasAweme();
            c2344009Gk.LIZJ(C10EU.LJIIZILJ(aliasAweme2 != null ? AwemeExtKt.getAuthorUid(aliasAweme2) : null) ? 1 : 0, "is_video_author");
            c2344009Gk.LJIIIIZZ("message_type", strLIZ);
            if (C123100dR.LIZ(id)) {
                c2344009Gk.LJFF("sticker_id", id);
            }
            C207069161b.LJFF(new AnonymousClass0175(), "translate_comment", c2344009Gk.LIZ);
            if (this.mCommentTranslateRepository != null) {
                C1343720l4U.LJFF(Collections.singletonList(comment), null, true);
            }
        }
    }

    @Override // X.InterfaceC1348780lCe
    public Comment getCommentInputReplyComment() {
        return this.mItem;
    }

    @Override // X.InterfaceC1348780lCe
    public EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.COMMENT_COLLECTION;
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_favorites_business_comment_CommentCollectViewHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private final C419890GdH getIcon(int i) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Integer numValueOf = Integer.valueOf(R.attr.a1h);
        if (i != 8) {
            C419890GdH c419890GdHLIZIZ = null;
            if (i == 9) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_bubble_left_right;
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LJ = numValueOf;
                C844470XAv.LIZ.getClass();
                c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, C844470XAv.LIZ());
                Context contextLIZ = this.mActivity;
                if (contextLIZ == null && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (contextLIZ = abstractC1387200mCcLJ.LIZIZ()) == null)) {
                    contextLIZ = C844470XAv.LIZ();
                }
                c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C426750GoL.LIZLLL(contextLIZ));
            }
            return c419890GdHLIZIZ;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_bag;
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        c419910GdJ2.LJ = numValueOf;
        C844470XAv.LIZ.getClass();
        return c419910GdJ2.LIZIZ(2, C844470XAv.LIZ());
    }

    private final int getWindowHeight(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0IKF.LIZ.getClass();
            C19738412Ko c19738412KoLIZIZ = C465320IMo.LIZ().LIZIZ(context);
            C20244914Jj c20244914JjLIZIZ = c19738412KoLIZIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
            return (c19738412KoLIZIZ.LIZ().height() - c20244914JjLIZIZ.LIZIZ) - c20244914JjLIZIZ.LIZLLL;
        }
        return C12ES.LJIIIIZZ(context);
    }

    private final void onTranslateFailure(C1339660kxw c1339660kxw) {
        this.translateStatusView.setLoading(false);
        Activity activity = this.mActivity;
        if (activity != null) {
            C1354920lMY.LIZJ(activity, c1339660kxw.LIZJ);
        }
    }

    private final void onTranslateSuccess(Comment comment) {
        this.translateStatusView.setLoading(false);
        Comment comment2 = this.mItem;
        if (comment2 != null) {
            comment2.setTranslated(comment.isTranslated());
        }
        this.commentMessage.setText(comment.getText());
    }

    public final void copy(Comment comment) {
        String curUserId;
        String uid;
        String uid2;
        User author;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        String authorUid = null;
        if (iAccountUserServiceLJFF != null) {
            curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        } else {
            curUserId = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        Aweme aliasAweme = comment.getAliasAweme();
        String str = "";
        if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("enter_from", "collection_comment");
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", awemeId);
        String cid = comment.getCid();
        if (cid == null) {
            cid = "";
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        if (curUserId == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("user_id", curUserId);
        User user = comment.getUser();
        if (user != null && (uid2 = user.getUid()) != null) {
            str = uid2;
        }
        c2344009Gk.LJIIIIZZ("to_user_id", str);
        Aweme aliasAweme2 = comment.getAliasAweme();
        if (aliasAweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aliasAweme2);
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        C20684815ws.LJIILLIIL("copy_comment", c2344009Gk.LIZ);
        C294190Bg1.LIZ.getClass();
        if (C294190Bg1.LIZ()) {
            copy(comment, CertProviderManagerKt.findCert("bpea-copy_favorite_comment", 1476399117));
        } else {
            C1348730lCZ c1348730lCZ = this.mCommentInputManager;
            if (c1348730lCZ != null) {
                Cert certFindCert = CertProviderManagerKt.findCert("bpea-copy_favorite_comment", 1476399117);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C844470XAv.LIZ.getClass();
                    sbLIZ.append(C844470XAv.LIZ().getResources().getString(2131829539, C1342220l24.LJ(comment.getUser(), c1348730lCZ.LLILZIL.getEventType(), true, true)));
                    sbLIZ.append(comment.getText());
                    C20145813s8.LIZ("copy_label", C2188811AlT.LIZIZ(sbLIZ), C844470XAv.LIZ(), certFindCert);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        tuxToastGenerator(2131834430, 0);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0l8J] */
    public final void delete(Comment comment) {
        String authorUid;
        if (invalidNetwork()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "collection_comment");
        String cid = comment.getCid();
        String str = "";
        if (cid == null) {
            cid = "";
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        String awemeId = comment.getAwemeId();
        if (awemeId != null) {
            str = awemeId;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("is_video", CardStruct.IStatusCode.DEFAULT);
        Aweme aliasAweme = comment.getAliasAweme();
        if (aliasAweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aliasAweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        C20684815ws.LJIILLIIL("delete_comment", c2344009Gk.LIZ);
        C1346070l8H c1346070l8H = this.mCommentDeletePresenter;
        if (c1346070l8H != null) {
            C1346060l8G c1346060l8G = (C1346060l8G) c1346070l8H.LL;
            if (c1346060l8G != null) {
                c1346060l8G.LLILZ = new Object() { // from class: X.0l8J
                };
            }
            String cid2 = comment.getCid();
            comment.getAwemeId();
            int iLIZ = C737370SwB.LIZ(getEventType());
            c1346070l8H.LL.getClass();
            c1346070l8H.LIZJ(cid2, Integer.valueOf(iLIZ), 0);
        }
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(C1339660kxw c1339660kxw) {
        Activity activity;
        if (c1339660kxw.LIZ != null && (activity = this.mActivity) != null && !activity.isFinishing()) {
            if (c1339660kxw.LIZLLL == 1) {
                onTranslating();
            } else if (c1339660kxw.LIZIZ) {
                onTranslateSuccess(c1339660kxw.LIZ);
            } else {
                onTranslateFailure(c1339660kxw);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String awemeId;
        String aid;
        Aweme aliasAweme;
        String cid;
        Comment comment = this.mItem;
        String str = "";
        if (comment != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "collection_comment");
            String awemeId2 = comment.getAwemeId();
            if (awemeId2 == null) {
                awemeId2 = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", awemeId2);
            String cid2 = comment.getCid();
            if (cid2 == null) {
                cid2 = "";
            }
            c2344009Gk.LJIIIIZZ("trigger_comment_id", cid2);
            C20684815ws.LJIILLIIL("enter_comment_list", c2344009Gk.LIZ);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.mActivity, "aweme://aweme/detail/");
        Comment comment2 = this.mItem;
        if (comment2 == null || (awemeId = comment2.getAwemeId()) == null) {
            awemeId = "";
        }
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, awemeId);
        smartRouteBuildRoute.withParam("refer", "collection_comment");
        Comment comment3 = this.mItem;
        if (comment3 != null && (cid = comment3.getCid()) != null) {
            str = cid;
        }
        smartRouteBuildRoute.withParam("cid", str);
        smartRouteBuildRoute.withParam("video_from", "collection_comment");
        smartRouteBuildRoute.withParam("enter_method", "click_comment_icon");
        Comment comment4 = this.mItem;
        if (comment4 != null && (aliasAweme = comment4.getAliasAweme()) != null) {
            aid = aliasAweme.getAid();
        } else {
            aid = null;
        }
        smartRouteBuildRoute.withParam("last_group_id", aid);
        smartRouteBuildRoute.withParam("is_my_profile", this.isFromMyProfile);
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC1346080l8I
    public void onDeleteFailed(Exception exc) {
        Activity activity = this.mActivity;
        if (activity != null) {
            C1354920lMY.LIZJ(activity, exc);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        C19EG activity;
        String curUserId;
        String uid;
        User author;
        if (view == null || this.mActivity == null || this.mCommentActionSheetClickListener == null) {
            return false;
        }
        if (this.mCommentInputManager == null) {
            C294190Bg1.LIZ.getClass();
            if (!C294190Bg1.LIZ()) {
                return false;
            }
        }
        Comment comment = this.mItem;
        if (comment == null) {
            return false;
        }
        boolean zEquals = TextUtils.equals(Comment.getAuthorUid(comment), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        ArrayList arrayList = new ArrayList();
        Activity activity2 = this.mActivity;
        if (activity2 != null) {
            Comment comment2 = this.mItem;
            if (comment2 != null && !comment2.getForbidVideoReply()) {
                C1348710lCX.LIZ.getClass();
                if (!C1348710lCX.LIZ()) {
                    arrayList.add(activity2.getString(2131829220));
                }
            }
            arrayList.add(activity2.getString(2131834428));
            arrayList.add(activity2.getString(2131829536));
            if (!zEquals) {
                Comment comment3 = this.mItem;
                if (comment3 != null && comment3.isTranslated()) {
                    arrayList.add(activity2.getString(2131829221));
                } else {
                    arrayList.add(activity2.getString(2131829234));
                }
            }
            arrayList.add(activity2.getString(R.string.s65));
            if (zEquals) {
                arrayList.add(activity2.getString(R.string.gm7));
            }
        }
        Fragment fragment = this.mFragment;
        String uid2 = null;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        C1381440m3K c1381440m3K = new C1381440m3K(activity);
        c1381440m3K.LIZ((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterfaceOnClickListenerC1401900maK(this, arrayList, 0));
        c1381440m3K.LIZ.LIZ.LJIILIIL = new DialogInterfaceOnCancelListenerC1401970maR(this, 4);
        if (!(!arrayList.isEmpty())) {
            return false;
        }
        Comment comment4 = this.mItem;
        if (comment4 != null) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null) {
                curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
            } else {
                curUserId = null;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "collection_comment");
            String cid = comment4.getCid();
            if (cid == null) {
                cid = "";
            }
            c2344009Gk.LJIIIIZZ("comment_id", cid);
            Aweme aliasAweme = comment4.getAliasAweme();
            if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            String awemeId = comment4.getAwemeId();
            if (awemeId == null) {
                awemeId = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", awemeId);
            User user = comment4.getUser();
            if (user != null) {
                uid2 = user.getUid();
            }
            c2344009Gk.LJ(Boolean.valueOf(Intrinsics.LJFF(uid2, curUserId)), "is_author");
            if (curUserId == null) {
                curUserId = "";
            }
            c2344009Gk.LJIIIIZZ("user_id", curUserId);
            C20684815ws.LJIILLIIL("tap_comment", c2344009Gk.LIZ);
        }
        c1381440m3K.LIZIZ();
        return true;
    }

    public CommentCollectViewHolder(View view, boolean z) {
        super(view);
        this.isFromMyProfile = z;
        this.regularReplyButton = (TuxTextView) view.findViewById(R.id.uvl);
        this.videoReplyButton = (TuxTextView) view.findViewById(R.id.uvm);
        this.commentVideoCover = (RemoteImageView) view.findViewById(R.id.uvp);
        this.commentAvatar = (C427870Gq9) view.findViewById(R.id.uvk);
        this.commentUserName = (TuxTextView) view.findViewById(R.id.uvo);
        this.commentMessage = (TuxTextView) view.findViewById(R.id.uvn);
        this.translateStatusView = (C420090Gdb) view.findViewById(R.id.yj5);
        this.commentAvatarSize = 40;
    }

    public final void commentCollect(final Comment comment, final int i) {
        String authorUid;
        if (invalidNetwork()) {
            return;
        }
        Aweme commentInputAweme = getCommentInputAweme();
        if (commentInputAweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(commentInputAweme);
        } else {
            authorUid = null;
        }
        C1350920lG6.LJLLI("collection_comment", i, comment, authorUid, null, null, false, null, Boolean.FALSE, false);
        C15O7<BaseResponse> c15o7LIZIZ = C616460OFw.LIZ.LIZIZ(comment.getCid(), i);
        if (c15o7LIZIZ != null) {
            c15o7LIZIZ.LJ(new InterfaceC2385309Wh() { // from class: X.0l8W
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("CommentCollectViewHolder@56cd.commentCollect$1");
                    if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
                        CommentCollectListAdapter commentCollectListAdapter = this.LIZ.commentCollectAdapter;
                        if (commentCollectListAdapter != null) {
                            commentCollectListAdapter.removeItem(comment);
                        }
                        if (i == 1) {
                            comment.setCollectStatus(1);
                        } else {
                            comment.setCollectStatus(0);
                        }
                        Comment comment2 = comment;
                        C1440005kM.LIZ(new C0T3Q(comment2, comment2.getAliasAweme()));
                        CommentFavoriteServiceImpl.LIZJ().LIZIZ(i, comment.getCid());
                        this.LIZ.tuxToastGenerator(2131834429, 0);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CommentCollectViewHolder@56cd.commentCollect$1");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    public final void copy(Comment comment, Cert cert) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LIZ().getResources().getString(2131829539, C1342220l24.LJ(comment.getUser(), "collection_comment", true, true)));
            sbLIZ.append(comment.getText());
            C20145813s8.LIZ("copy_label", C2188811AlT.LIZIZ(sbLIZ), C844470XAv.LIZ(), cert);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1346080l8I
    public void onDeleteSuccess(String str, C1346090l8J c1346090l8J) {
        String aid;
        Aweme aliasAweme;
        Comment comment = this.mItem;
        if (comment != null) {
            CommentCollectListAdapter commentCollectListAdapter = this.commentCollectAdapter;
            if (commentCollectListAdapter != null) {
                commentCollectListAdapter.removeItem(comment);
            }
            Comment comment2 = this.mItem;
            if (comment2 != null && (aliasAweme = comment2.getAliasAweme()) != null) {
                aid = aliasAweme.getAid();
            } else {
                aid = null;
            }
            C1344480l5i.LIZ(aid, null, false);
        }
    }

    public final void report(Activity activity, Comment comment) {
        String curUserId;
        String string;
        String id;
        String rootCommentId;
        String uid;
        int iLJIIL;
        User author;
        Long setId;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        String authorUid = null;
        if (iAccountUserServiceLJFF != null) {
            curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        } else {
            curUserId = null;
        }
        String strLIZ = C1350750lFp.LIZ(comment);
        if (!C123100dR.LIZ(strLIZ)) {
            strLIZ = "text_comment";
        }
        CommentStickerStruct stickerStruct = comment.getStickerStruct();
        if (stickerStruct != null && (setId = stickerStruct.getSetId()) != null) {
            string = setId.toString();
        } else {
            string = null;
        }
        CommentStickerStruct stickerStruct2 = comment.getStickerStruct();
        if (stickerStruct2 != null) {
            id = stickerStruct2.getId();
        } else {
            id = null;
        }
        if (comment.getCommentType() == 2 || (C123100dR.LIZ(comment.getRootCommentId()) && !Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT))) {
            rootCommentId = comment.getRootCommentId();
        } else {
            rootCommentId = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "collection_comment");
        c2344009Gk.LJIIIIZZ("enter_method", "click_report_button");
        Aweme aliasAweme = comment.getAliasAweme();
        String str = "";
        if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", awemeId);
        String cid = comment.getCid();
        if (cid == null) {
            cid = "";
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        if (curUserId == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("user_id", curUserId);
        c2344009Gk.LJIIIIZZ("is_video", CardStruct.IStatusCode.DEFAULT);
        List<CommentImageStruct> imageList = comment.getImageList();
        if (imageList != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        } else {
            iLJIIL = 0;
        }
        c2344009Gk.LIZJ(iLJIIL, "is_photo_contained");
        Aweme aliasAweme2 = comment.getAliasAweme();
        if (aliasAweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aliasAweme2);
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        c2344009Gk.LJIIIIZZ("message_type", strLIZ);
        if (C123100dR.LIZ(id)) {
            c2344009Gk.LJFF("sticker_id", id);
        }
        if (C123100dR.LIZ(string)) {
            c2344009Gk.LJFF("sticker_set_name", string);
        }
        if (C123100dR.LIZ(rootCommentId)) {
            c2344009Gk.LJFF("parent_comment_id", rootCommentId);
        }
        if (C123100dR.LIZ(C1345700l7g.LIZ(comment))) {
            String rootCommentId2 = comment.getRootCommentId();
            if (rootCommentId2 != null && rootCommentId2.length() != 0 && !Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT)) {
                if (C123100dR.LIZ(comment.getRootCommentId()) && !Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT)) {
                    str = (!C123100dR.LIZ(comment.getReplyToReplyCommentId()) || Intrinsics.LJFF(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) ? "reply" : "reply_to_reply";
                }
            } else {
                str = "original";
            }
            c2344009Gk.LJFF("comment_category", str);
        }
        C20684815ws.LJIILLIIL("report_comment", c2344009Gk.LIZ);
        C1345080l6g.LIZIZ(activity, getCommentInputAweme(), comment, comment.getUser().getUid(), getWindowHeight(activity), "collection_comment", null, false, false);
    }

    public final void tuxToastGenerator(int i, int i2) {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (i2 != 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(activity.getString(i));
                c1389890mGx.LJFF(i2);
                c1389890mGx.LJIIJJI();
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJIIJ(activity.getString(i));
            c1389890mGx2.LJIIJJI();
        }
    }

    private final void collectionReplyViaVideoEvent(Comment comment, String str, String str2) {
        C1350920lG6.LLD(str2, comment, getCommentInputAweme(), -1, -1, str, null, null);
    }

    @Override // X.InterfaceC1348780lCe
    public void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        Aweme aliasAweme;
        List<CommentImageStruct> imageList;
        int iLJIIL = 0;
        tuxToastGenerator(2131846284, 0);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Comment comment2 = this.mItem;
        if (comment2 != null) {
            aliasAweme = comment2.getAliasAweme();
        } else {
            aliasAweme = null;
        }
        Comment comment3 = this.mItem;
        if (comment != null && (imageList = comment.getImageList()) != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        }
        Integer numValueOf = Integer.valueOf(iLJIIL);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        c1350920lG6.getClass();
        C1350920lG6.LJZ("collection_comment", "collection_text_panel", aliasAweme, comment3, false, null, null, bool, null, null, null, null, null, null, null, numValueOf, bool2, null, null, null, null, 0, null, null);
    }

    @Override // X.InterfaceC1348780lCe
    public void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse) {
        Aweme aliasAweme;
        int iLJIIL;
        List<CommentImageStruct> imageList;
        tuxToastGenerator(2131834431, R.drawable.bs4);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Comment comment2 = this.mItem;
        if (comment2 != null) {
            aliasAweme = comment2.getAliasAweme();
        } else {
            aliasAweme = null;
        }
        Comment comment3 = this.mItem;
        if (comment != null && (imageList = comment.getImageList()) != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        } else {
            iLJIIL = 0;
        }
        Integer numValueOf = Integer.valueOf(iLJIIL);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        c1350920lG6.getClass();
        C1350920lG6.LJZ("collection_comment", "collection_text_panel", aliasAweme, comment3, true, comment, null, bool, null, null, null, null, null, null, null, numValueOf, bool2, null, null, null, null, 0, null, null);
    }

    public final void openRecord(String str, CommentVideoModel.Type type, Comment comment) {
        User user;
        String cid;
        String cid2;
        String text;
        C19EG activity;
        String str2;
        String authorUid;
        List<CommentImageStruct> imageList;
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            String string = null;
            if (fragment.getActivity() != null && comment != null && (user = comment.getUser()) != null) {
                String str3 = "";
                if (comment.getCommentType() == 2) {
                    cid = comment.getRootCommentId();
                    cid2 = comment.getCid();
                } else {
                    cid = comment.getCid();
                    cid2 = "";
                }
                if (comment.getImageList() != null && (imageList = comment.getImageList()) != null && !imageList.isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(comment.getText());
                    sbLIZ.append(' ');
                    Fragment fragment2 = this.mFragment;
                    if (fragment2 != null) {
                        string = fragment2.getString(2131826734);
                    }
                    sbLIZ.append(string);
                    text = C2188811AlT.LIZIZ(sbLIZ);
                } else if (comment.getStickerStruct() != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(comment.getText());
                    sbLIZ2.append(' ');
                    Fragment fragment3 = this.mFragment;
                    if (fragment3 != null) {
                        string = fragment3.getString(2131826735);
                    }
                    sbLIZ2.append(string);
                    text = C2188811AlT.LIZIZ(sbLIZ2);
                } else if (C1351950lHl.LJI(comment)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(comment.getText());
                    sbLIZ3.append(' ');
                    Fragment fragment4 = this.mFragment;
                    if (fragment4 != null) {
                        string = fragment4.getString(2131826733);
                    }
                    sbLIZ3.append(string);
                    text = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    text = comment.getText();
                }
                Fragment fragment5 = this.mFragment;
                if (fragment5 != null && (activity = fragment5.getActivity()) != null) {
                    String uid = user.getUid();
                    String strLIZJ = C10EU.LIZJ(user);
                    UrlModel avatarThumb = user.getAvatarThumb();
                    String cid3 = comment.getCid();
                    String awemeId = comment.getAwemeId();
                    Aweme commentInputAweme = getCommentInputAweme();
                    if (commentInputAweme != null && (authorUid = AwemeExtKt.getAuthorUid(commentInputAweme)) != null) {
                        str3 = authorUid;
                    }
                    int iLIZ = C737370SwB.LIZ("collection_comment");
                    if (type == CommentVideoModel.Type.COMMENT) {
                        str2 = "comment_reply";
                    } else {
                        str2 = "question_and_answer";
                    }
                    C1395000mPC.LIZ(activity, new CommentVideoModel(uid, strLIZJ, avatarThumb, text, null, cid3, awemeId, str3, cid, cid2, iLIZ, str, 0, 0, type, str2, "collection_comment", null));
                    if (Intrinsics.LJFF("collection_comment", "collection_comment")) {
                        collectionReplyViaVideoEvent(comment, "collection_comment", str);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.0iur, X.0l8H] */
    public final void bindView(Comment comment, Activity activity, Fragment fragment, CommentCollectListAdapter commentCollectListAdapter) {
        C1348730lCZ c1348730lCZ;
        User user;
        Aweme aliasAweme;
        Video video;
        UrlModel cover;
        User user2;
        UrlModel avatarThumb;
        NextLiveData nextLiveDataLIZIZ;
        if (comment != null && activity != null && fragment != null) {
            this.mActivity = activity;
            this.mFragment = fragment;
            this.mItem = comment;
            this.commentCollectAdapter = commentCollectListAdapter;
            String cid = comment.getCid();
            C420090Gdb c420090Gdb = this.translateStatusView;
            int visibility = c420090Gdb.getVisibility();
            c420090Gdb.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c420090Gdb);
            C1343720l4U c1343720l4U = C1343720l4U.LIZ;
            this.mCommentTranslateRepository = c1343720l4U;
            if (c1343720l4U != null && (nextLiveDataLIZIZ = C1343720l4U.LIZIZ(cid)) != null) {
                nextLiveDataLIZIZ.observeForever(this, false);
            }
            this.mCommentActionSheetClickListener = createCommentActionSheetClickListener();
            C294190Bg1.LIZ.getClass();
            if (C294190Bg1.LIZ()) {
                c1348730lCZ = null;
            } else {
                c1348730lCZ = new C1348730lCZ(fragment, this);
            }
            this.mCommentInputManager = c1348730lCZ;
            if (c1348730lCZ != null) {
                c1348730lCZ.LLL = true;
            }
            if (c1348730lCZ != null) {
                c1348730lCZ.LLJJ = "collection_comment";
                c1348730lCZ.LL = "";
            }
            ?? r3 = new C1260870iur<C1346060l8G, InterfaceC1346080l8I>() { // from class: X.0l8H
                @Override // X.C1260870iur, X.InterfaceC1526205yG
                public final void onSuccess() {
                    T t;
                    CommentPerfMonitorUtil.LIZ.getClass();
                    C1345400l7C c1345400l7C = CommentPerfMonitorUtil.LIZLLL;
                    c1345400l7C.LJ = System.currentTimeMillis();
                    C15O7.LIZJ(new ACallableS426S0100000_21(c1345400l7C, 10));
                    K k = this.LLILLJJLI;
                    if (k == 0 || (t = this.LL) == 0) {
                        return;
                    }
                    C1346060l8G c1346060l8G = (C1346060l8G) t;
                    ((InterfaceC1346080l8I) k).onDeleteSuccess(c1346060l8G.LLILLL, c1346060l8G.LLILZ);
                }

                @Override // X.C1260870iur, X.InterfaceC1526205yG
                public final void onFailed(Exception exc) {
                    CommentPerfMonitorUtil.LIZ.getClass();
                    C1345400l7C c1345400l7C = CommentPerfMonitorUtil.LIZLLL;
                    c1345400l7C.LJ = System.currentTimeMillis();
                    C15O7.LIZJ(new ACallableS426S0100000_21(c1345400l7C, 10));
                    K k = this.LLILLJJLI;
                    if (k != 0) {
                        ((InterfaceC1346080l8I) k).onDeleteFailed(exc);
                    }
                }
            };
            this.mCommentDeletePresenter = r3;
            r3.LJIIJ(new C1346060l8G());
            C1346070l8H c1346070l8H = this.mCommentDeletePresenter;
            if (c1346070l8H != null) {
                c1346070l8H.LLILLJJLI = this;
            }
            Comment comment2 = this.mItem;
            if (comment2 != null && (user2 = comment2.getUser()) != null && (avatarThumb = user2.getAvatarThumb()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                c1331670kl3LJIIIIZZ.LIZLLL("collection_comment");
                c1331670kl3LJIIIIZZ.LJJ(this.commentAvatar);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            C631450Opj.LIZ(this.commentVideoCover, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
            Comment comment3 = this.mItem;
            if (comment3 != null && (aliasAweme = comment3.getAliasAweme()) != null && (video = aliasAweme.getVideo()) != null && (cover = video.getCover()) != null) {
                C1324840ka2.LJFF(this.commentVideoCover, cover);
                C786410Ut5.l(this.commentVideoCover, 0);
            } else {
                C786410Ut5.l(this.commentVideoCover, 8);
            }
            Comment comment4 = this.mItem;
            if (comment4 != null && comment4.getText() != null) {
                this.commentMessage.setText(getItemText());
            }
            if (C1353700lKa.LIZ()) {
                this.commentMessage.setMaxLines(4);
                this.commentMessage.setEllipsize(TextUtils.TruncateAt.END);
            }
            Comment comment5 = this.mItem;
            if (comment5 != null && (user = comment5.getUser()) != null) {
                this.commentUserName.setText(C1342220l24.LJ(user, getEventType(), true, true));
            }
            C786410Ut5.I7(this, this.itemView);
            this.itemView.setOnLongClickListener(this);
            regularReplyButtonAction();
            if (!comment.getForbidVideoReply() && !C1351950lHl.LJI(comment)) {
                ICreativeAppDiffService.LIZ.getClass();
                C1346440l8s.LIZ().LIZIZ();
                videoReplyButtonAction();
                C786410Ut5.LLLLZLL(this.videoReplyButton, 0);
            } else {
                C786410Ut5.LLLLZLL(this.videoReplyButton, 8);
            }
            onShowItem();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    @Override // X.InterfaceC1348780lCe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCommentInputPublishClick(int r31, int r32, java.lang.CharSequence r33, java.lang.String r34, java.lang.String r35, boolean r36, X.C1347310lAH r37) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectViewHolder.onCommentInputPublishClick(int, int, java.lang.CharSequence, java.lang.String, java.lang.String, boolean, X.0lAH):void");
    }
}
