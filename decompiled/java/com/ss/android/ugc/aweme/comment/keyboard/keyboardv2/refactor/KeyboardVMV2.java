package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC1347290lAF;
import X.AbstractC848400XPy;
import X.C0SYU;
import X.C0XQ7;
import X.C1017070cZd;
import X.C10EU;
import X.C123100dR;
import X.C1340510kzJ;
import X.C1341320l0c;
import X.C1341800l1O;
import X.C1342200l22;
import X.C1342260l28;
import X.C1344030l4z;
import X.C1346370l8l;
import X.C1346390l8n;
import X.C1346420l8q;
import X.C1346480l8w;
import X.C1346490l8x;
import X.C1346500l8y;
import X.C1346540l92;
import X.C1346560l94;
import X.C1346570l95;
import X.C1346950l9h;
import X.C1347070l9t;
import X.C1347080l9u;
import X.C1347100l9w;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1348710lCX;
import X.C1350650lFf;
import X.C1350750lFp;
import X.C1350920lG6;
import X.C1353540lKK;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C19EG;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C291001Au;
import X.C439870HMr;
import X.C523420Kfs;
import X.C603820NmG;
import X.C729510SjV;
import X.C735840Sti;
import X.C844470XAv;
import X.EnumC1341660l1A;
import X.EnumC1346360l8k;
import X.InterfaceC0148002o;
import X.InterfaceC1346530l91;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AComparatorS25S0000000_6;
import android.text.Editable;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContentTypeMobParams;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.ZeroCommentConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS107S0110000_21;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS5S0020000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS72S0210000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class KeyboardVMV2 extends AssemViewModel<C1346950l9h> implements IKeyboardVMAbility {
    public static final C1341800l1O LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public InterfaceC665370Q7z LL;
    public WeakReference<Fragment> LLILLJJLI;
    public Function0<Unit> LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public List<CommentImageModel> LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public volatile boolean LLJJ;
    public volatile boolean LLJJI;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C1342260l28 LLILLL = new C1342260l28(new AwS565S0100000_21(this, 155));
    public final C603820NmG<String, CommentInputContent> LLILZ = new C603820NmG<>(20);
    public final CopyOnWriteArraySet<InterfaceC1346530l91> LLILZIL = new CopyOnWriteArraySet<>();
    public volatile String LLJJIII = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(KeyboardVMV2.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new C1341800l1O();
    }

    public final CommentContextSource BQ2() {
        C1342260l28 c1342260l28 = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return c1342260l28.LIZIZ();
    }

    public final void OQ2() {
        C1344030l4z.LIZJ("KeyboardVM", "resetReplyCommentStateWhenSwitchAweme");
        C1346480l8w c1346480l8w = getState().LLILZIL;
        if (c1346480l8w == null || c1346480l8w.LIZJ) {
            setState(AFwS259S0000000_21.get$arr$(74));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1346950l9h(0);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility
    public final boolean jc2() {
        return !Intrinsics.LJFF(((C1346950l9h) this.vmDispatcher.getState()).LL, C1347120l9y.LIZ);
    }

    public final CommentContentTypeMobParams AQ2() {
        boolean z;
        List<CommentImageModel> list;
        CommentInputContent commentInputContent = getState().LLJI.LIZ;
        Editable editableFQ2 = FQ2(commentInputContent != null ? commentInputContent.text : null);
        ArrayList arrayListLIZIZ = C1353540lKK.LIZIZ(editableFQ2);
        List listLLIIII = arrayListLIZIZ != null ? C13LP.LLIIII(arrayListLIZIZ) : null;
        C1350920lG6.LIZ.getClass();
        CharSequence string = editableFQ2;
        if (editableFQ2 == null) {
            string = "";
        } else if (listLLIIII != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLLIIII) {
                if (((TextExtraStruct) obj).getType() == 0) {
                    arrayList.add(obj);
                }
            }
            List<TextExtraStruct> listLJLLLL = C13LP.LJLLLL(new AComparatorS25S0000000_6(11), arrayList);
            string = editableFQ2;
            if (!listLJLLLL.isEmpty()) {
                int i = 0;
                for (TextExtraStruct textExtraStruct : listLJLLLL) {
                    int iLJ = C13LZ.LJ(textExtraStruct.getStart(), 0, editableFQ2.length());
                    int iLJ2 = C13LZ.LJ(textExtraStruct.getEnd(), 0, editableFQ2.length());
                    if (i < iLJ) {
                        sb.append(editableFQ2.subSequence(i, iLJ));
                    }
                    if (i < iLJ2) {
                        i = iLJ2;
                    }
                }
                if (i < editableFQ2.length()) {
                    sb.append(editableFQ2.subSequence(i, editableFQ2.length()));
                }
                string = sb.toString();
            }
        }
        String strLIZIZ = C1350750lFp.LIZIZ(string);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        int iLIZIZ = C439870HMr.LIZIZ(strLIZIZ);
        boolean z2 = iLIZIZ == 2 || iLIZIZ == 1;
        boolean z3 = (iLIZIZ == 2 || iLIZIZ == 0) && strLIZIZ.length() > 0;
        List<CommentImageModel> listCQ2 = CQ2();
        boolean z4 = !(listCQ2 == null || listCQ2.isEmpty());
        if (!z4 && (list = this.LLJ) != null && !list.isEmpty()) {
            z4 = true;
        }
        if (listLLIIII == null || listLLIIII.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                if (((TextExtraStruct) it2.next()).getType() == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z5 = GQ2() != null;
        List<AudioCommentModel> listXQ2 = xQ2();
        return new CommentContentTypeMobParams(z3, z, z2, z4, z5, !(listXQ2 == null || listXQ2.isEmpty()));
    }

    public final List<CommentImageModel> CQ2() {
        CommentInputContent commentInputContent;
        C291001Au<CommentInputContent> c291001Au = getState().LLJI;
        if (c291001Au == null || (commentInputContent = c291001Au.LIZ) == null) {
            return null;
        }
        return commentInputContent.imageList;
    }

    public final CommentStickerStruct GQ2() {
        CommentInputContent commentInputContent;
        C291001Au<CommentInputContent> c291001Au = getState().LLJI;
        if (c291001Au == null || (commentInputContent = c291001Au.LIZ) == null) {
            return null;
        }
        return commentInputContent.stickerStruct;
    }

    public final boolean HQ2() {
        CommentInputContent commentInputContent;
        C291001Au<CommentInputContent> c291001Au = getState().LLJI;
        Editable editable = (c291001Au == null || (commentInputContent = c291001Au.LIZ) == null) ? null : commentInputContent.text;
        return ((editable == null || a0.LJLIIIL(editable.toString()).toString().length() <= 0) && CQ2() == null && GQ2() == null && xQ2() == null) ? false : true;
    }

    public final boolean JQ2() {
        C1346480l8w c1346480l8w = getState().LLILZIL;
        return (c1346480l8w == null || c1346480l8w.LIZ == null) ? false : true;
    }

    public final void KQ2() {
        CommentKeyboardModel keyboardModel;
        AwemeCommentConfig commentConfig;
        ZeroCommentConfig zeroCommentConfig;
        User author;
        CommentKeyboardModel keyboardModel2;
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 == null || (keyboardModel = commentContextSourceBQ2.getKeyboardModel()) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - keyboardModel.getKeyBoardShowTime();
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        CommentContextSource commentContextSourceBQ22 = BQ2();
        if (commentContextSourceBQ22 != null && (keyboardModel2 = commentContextSourceBQ22.getKeyboardModel()) != null) {
            keyboardModel2.setKeyBoardShowTime(0L);
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBQ23 = BQ2();
        CommentContentTypeMobParams commentContentTypeMobParamsAQ2 = AQ2();
        c1350920lG6.getClass();
        if (commentContextSourceBQ23 != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", commentContextSourceBQ23.getCommonModel().enterFrom);
            Aweme aweme = commentContextSourceBQ23.getCommonModel().aweme;
            C1341320l0c.LIZ(c2344009Gk, "author_id", aweme != null ? AwemeExtKt.getAuthorUid(aweme) : null);
            Aweme aweme2 = commentContextSourceBQ23.getCommonModel().aweme;
            C1341320l0c.LIZ(c2344009Gk, "group_id", aweme2 != null ? aweme2.getAid() : null);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "stay_time");
            if (Intrinsics.LJFF("homepage_country", commentContextSourceBQ23.getCommonModel().enterFrom)) {
                Aweme aweme3 = commentContextSourceBQ23.getCommonModel().aweme;
                c2344009Gk.LJFF("country_name", (aweme3 == null || (author = aweme3.getAuthor()) == null) ? null : author.getRegion());
            }
            C1341320l0c.LIZ(c2344009Gk, "from_location", commentContextSourceBQ23.getKeyboardModel().getFromLocation());
            C1341320l0c.LIZ(c2344009Gk, "from_page", commentContextSourceBQ23.getEventModel().fromPage);
            Aweme aweme4 = commentContextSourceBQ23.getCommonModel().aweme;
            C1341320l0c.LIZ(c2344009Gk, "aweme_type", aweme4 != null ? Integer.valueOf(aweme4.getAwemeType()).toString() : null);
            C735840Sti c735840Sti = C735840Sti.LIZ;
            Aweme aweme5 = commentContextSourceBQ23.getCommonModel().aweme;
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme5, c2344009Gk);
            Aweme aweme6 = commentContextSourceBQ23.getCommonModel().aweme;
            c2344009Gk.LIZJ(C10EU.LJIIZILJ(aweme6 != null ? AwemeExtKt.getAuthorUid(aweme6) : null) ? 1 : 0, "is_video_author");
            C1341320l0c.LIZ(c2344009Gk, "session_id", CommentContextSourceKt.getSessionId(commentContextSourceBQ23));
            c2344009Gk.LJFF("enter_method", commentContextSourceBQ23.getCommonModel().enterMethod);
            Aweme aweme7 = commentContextSourceBQ23.getCommonModel().aweme;
            if (aweme7 != null && (commentConfig = aweme7.getCommentConfig()) != null && (zeroCommentConfig = commentConfig.zeroCommentConfig) != null && Intrinsics.LJFF(commentContextSourceBQ23.getCommonModel().enterMethod, "click_zero_comment_entrance")) {
                c2344009Gk.LJ(zeroCommentConfig.iconType, "show_sticker_type");
                c2344009Gk.LJFF("guide_text", zeroCommentConfig.titleText);
                c2344009Gk.LJFF("writing_entrance_text", zeroCommentConfig.buttonText);
            }
            c2344009Gk.LIZJ(commentContentTypeMobParamsAQ2.isText ? 1 : 0, "is_text");
            c2344009Gk.LIZJ(commentContentTypeMobParamsAQ2.isMention ? 1 : 0, "is_mention");
            c2344009Gk.LIZJ(commentContentTypeMobParamsAQ2.isEmoji ? 1 : 0, "is_emoji");
            c2344009Gk.LIZJ(commentContentTypeMobParamsAQ2.isPhoto ? 1 : 0, "is_photo");
            c2344009Gk.LIZJ(commentContentTypeMobParamsAQ2.isSticker ? 1 : 0, "is_sticker");
            c2344009Gk.LIZJ(commentContentTypeMobParamsAQ2.isAudio ? 1 : 0, "is_audio");
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, C1350920lG6.LJJIIJZLJL(commentContextSourceBQ23.getCommonModel().aweme, commentContextSourceBQ23.getCommonModel().enterFrom, Intrinsics.LJFF("click_quick_panel", commentContextSourceBQ23.getKeyboardModel().getClickFrom())));
            C1350920lG6.LJJJ(c2344009Gk, "close_text");
        }
    }

    public final void LQ2() {
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 != null && (keyboardModel = commentContextSourceBQ2.getKeyboardModel()) != null) {
            keyboardModel.setKeyBoardShowTime(System.currentTimeMillis());
        }
        C1346560l94 c1346560l94 = getState().LLJILLL;
        Boolean boolValueOf = c1346560l94 != null ? Boolean.valueOf(c1346560l94.LIZ) : null;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBQ22 = BQ2();
        C1346480l8w c1346480l8w = getState().LLILZIL;
        Comment comment = c1346480l8w != null ? c1346480l8w.LIZ : null;
        CommentContentTypeMobParams commentContentTypeMobParamsAQ2 = AQ2();
        c1350920lG6.getClass();
        C1350920lG6.LJLL(commentContextSourceBQ22, comment, boolValueOf, commentContentTypeMobParamsAQ2);
        this.LLJ = null;
    }

    public final boolean RQ2() {
        CommentKeyboardModel keyboardModel;
        C1346480l8w c1346480l8w = getState().LLILZIL;
        if (c1346480l8w == null || c1346480l8w.LIZ == null) {
            return false;
        }
        if (!C1346420l8q.LIZJ(c1346480l8w != null ? Boolean.valueOf(c1346480l8w.LIZJ) : null)) {
            return false;
        }
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (C1346420l8q.LIZIZ((commentContextSourceBQ2 == null || (keyboardModel = commentContextSourceBQ2.getKeyboardModel()) == null) ? null : Boolean.valueOf(keyboardModel.getForceDisableReplyWithVideo()))) {
            return vQ2(c1346480l8w != null ? c1346480l8w.LIZ : null);
        }
        return false;
    }

    public final AbstractC1347290lAF wQ2() {
        return getState().LL;
    }

    public final List<AudioCommentModel> xQ2() {
        CommentInputContent commentInputContent;
        C291001Au<CommentInputContent> c291001Au = getState().LLJI;
        if (c291001Au == null || (commentInputContent = c291001Au.LIZ) == null) {
            return null;
        }
        return commentInputContent.audioList;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJJIJIIJIL;
    }

    public final int EQ2(EnumC1346360l8k enumC1346360l8k) {
        CommentCommonModel commonModel;
        if (enumC1346360l8k != null) {
            switch (C1346370l8l.LIZ[enumC1346360l8k.ordinal()]) {
                case 1:
                    return 6;
                case 2:
                case 3:
                    CommentContextSource commentContextSourceBQ2 = BQ2();
                    if (commentContextSourceBQ2 != null && (commonModel = commentContextSourceBQ2.getCommonModel()) != null && !commonModel.isLandscapeMode()) {
                        return 3;
                    }
                    return 4;
                case 4:
                    return 8;
                case 5:
                    return 9;
                case 6:
                    return 2;
                case 7:
                    return 1;
            }
        }
        return 0;
    }

    public final Editable FQ2(Editable editable) {
        if (editable == null) {
            return null;
        }
        Editable editableNewEditable = Editable.Factory.getInstance().newEditable(editable);
        if (this.LLJILJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C20642515q3.LJI(2131826734));
            sbLIZ.append(' ');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C20642515q3.LJI(2131826735));
            sbLIZ2.append(' ');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (editableNewEditable != null && ((!a0.LJJLIIIJL(editableNewEditable, strLIZIZ) || (editableNewEditable = editableNewEditable.replace(0, strLIZIZ.length(), "")) != null) && a0.LJJLIIIJL(editableNewEditable, strLIZIZ2))) {
                editableNewEditable = editableNewEditable.replace(0, strLIZIZ2.length(), "");
            }
        }
        if (this.LLJILJILJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(C20642515q3.LJI(2131826733));
            sbLIZ3.append(' ');
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            if (editableNewEditable != null && a0.LJJLIIIJL(editableNewEditable, strLIZIZ3)) {
                return editableNewEditable.replace(0, strLIZIZ3.length(), "");
            }
            return editableNewEditable;
        }
        return editableNewEditable;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility
    public final void Qu0(InterfaceC1346530l91 interfaceC1346530l91) {
        this.LLILZIL.add(interfaceC1346530l91);
    }

    public final void TQ2(boolean z) {
        CommentCommonModel commonModel;
        setState(new AwS5S0020000_21(z, 4));
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 != null && (commonModel = commentContextSourceBQ2.getCommonModel()) != null && commonModel.isInPhotoCommentDetailPage()) {
            setState(AFwS259S0000000_21.get$arr$(456));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility
    public final void Ti1(EnumC1341660l1A enumC1341660l1A) {
        setState(new AwS600S0100000_21(enumC1341660l1A, 57));
    }

    public final void XQ2(Aweme aweme) {
        C1341800l1O c1341800l1O = LLJJIJIL;
        CommentContextSource commentContextSourceBQ2 = BQ2();
        c1341800l1O.getClass();
        EnumC1341660l1A enumC1341660l1ALIZ = C1341800l1O.LIZ(commentContextSourceBQ2, aweme);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update input view status: ");
        sbLIZ.append(enumC1341660l1ALIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        Ti1(enumC1341660l1ALIZ);
    }

    public final void ZQ2(C1346950l9h c1346950l9h) {
        Boolean boolValueOf;
        List<CommentImageModel> listCQ2;
        List<AudioCommentModel> listXQ2;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 != null && (commonModel = commentContextSourceBQ2.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel.isInPhotoCommentDetailPage());
        } else {
            boolValueOf = null;
        }
        if (!C1346420l8q.LIZ(boolValueOf) && (c1346950l9h.LLILZIL == null || (!c1346950l9h.LLJ && (((listCQ2 = CQ2()) == null || listCQ2.isEmpty()) && GQ2() == null && !this.LLJI && ((listXQ2 = xQ2()) == null || listXQ2.isEmpty()))))) {
            setState(AFwS259S0000000_21.get$arr$(75));
        } else {
            setState(new AwS600S0100000_21(c1346950l9h.LLILZIL, 58));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility
    public final void tP1(InterfaceC1346530l91 interfaceC1346530l91) {
        this.LLILZIL.remove(interfaceC1346530l91);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vQ2(com.ss.android.ugc.aweme.comment.model.Comment r7) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2.vQ2(com.ss.android.ugc.aweme.comment.model.Comment):boolean");
    }

    public static void MQ2(KeyboardVMV2 keyboardVMV2, boolean z) {
        keyboardVMV2.getClass();
        keyboardVMV2.withState(new C1346570l95(keyboardVMV2, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0358  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1345120l6k DQ2(X.EnumC1346360l8k r33, android.text.Editable r34) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2.DQ2(X.0l8k, android.text.Editable):X.0l6k");
    }

    public final void NQ2(Aweme aweme, EnumC1346360l8k enumC1346360l8k) {
        if (aweme == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inputContentHistory==>removeCommentInputContent ");
        LLJJIJIL.getClass();
        sbLIZ.append(C1341800l1O.LIZIZ(aweme, enumC1346360l8k));
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.LJ(C1341800l1O.LIZIZ(aweme, enumC1346360l8k));
        setState(new AwS387S0200000_21(aweme, enumC1346360l8k, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PQ2(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            X.0lG6 r3 = X.C1350920lG6.LIZ
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r5.BQ2()
            r2 = 0
            if (r0 == 0) goto L87
            java.lang.String r1 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.enterFrom(r0)
        Ld:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r5.BQ2()
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
        L17:
            r3.getClass()
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r3.LJIIIIZZ(r0, r1)
            if (r4 == 0) goto L83
            java.lang.String r1 = r4.getAid()
        L2a:
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r1)
            if (r4 == 0) goto L35
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r4)
        L35:
            java.lang.String r0 = "author_id"
            r3.LJIIIIZZ(r0, r2)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "user_id"
            r3.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "is_follow"
            int r0 = X.C1345170l6p.LIZ(r4)
            r3.LIZJ(r0, r1)
            r2 = 0
            if (r4 == 0) goto L81
            boolean r0 = r4.isLike()
            r1 = 1
            if (r0 != r1) goto L81
        L5c:
            java.lang.String r0 = "is_like"
            r3.LIZJ(r1, r0)
            java.lang.String r0 = "enter_method"
            r3.LJIIIIZZ(r0, r6)
            java.lang.String r0 = "sub_position"
            r3.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "show_gift_panel"
            X.C1350920lG6.LJJJ(r3, r0)
            X.0XVn r0 = X.C849850XVn.LIZIZ
            X.0rSd r1 = r0.LIZJ()
            java.lang.String r0 = "100006"
            r1.LJFF(r0)
            X.0l9w r0 = X.C1347100l9w.LIZ
            r5.SQ2(r0, r2)
            return
        L81:
            r1 = 0
            goto L5c
        L83:
            r1 = r2
            goto L2a
        L85:
            r4 = r2
            goto L17
        L87:
            r1 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2.PQ2(java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility
    public final void QK0(Comment comment, String str) {
        Boolean boolValueOf;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 != null && (commonModel = commentContextSourceBQ2.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel.isNoPermissionVideoFromCommentHistory());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf)) {
            return;
        }
        withState(new AwS104S1200000_21(this, str, comment, 3));
    }

    public final void QQ2(C19EG c19eg, CommentContextSource commentContextSource) {
        CommentContextSource commentContextSourceBQ2;
        long commentCount;
        Aweme aweme;
        AwemeStatistics statistics;
        Aweme aweme2;
        CommentCommonModel commonModel;
        String insertCid;
        String authorUid;
        AwemeControl awemeControl;
        CommentContextSource commentContextSourceBQ22;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        CommentListModel listModel;
        Aweme aweme3;
        if ((commentContextSource != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSource)) != null && (statistics = aweme3.getStatistics()) != null) || ((commentContextSourceBQ2 = BQ2()) != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceBQ2)) != null && (statistics = aweme.getStatistics()) != null)) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        Boolean boolValueOf = null;
        if (commentContextSource == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSource)) == null) {
            CommentContextSource commentContextSourceBQ23 = BQ2();
            if (commentContextSourceBQ23 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceBQ23);
            } else {
                aweme2 = null;
            }
            if (commentContextSource == null) {
                commentContextSource = BQ2();
            }
        }
        C1340510kzJ.LIZ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSource)) {
            return;
        }
        C1348710lCX.LIZ.getClass();
        if (!C1348710lCX.LIZ() && !CommentContextSourceKt.isFromTitlePanel(commentContextSource) && commentContextSource != null) {
            CommentCommonModel commonModel5 = commentContextSource.getCommonModel();
            if (((commonModel5 == null || commonModel5.locatePageType != 1) && ((commonModel = commentContextSource.getCommonModel()) == null || commonModel.locatePageType != 1)) || C729510SjV.LJJI(aweme2)) {
                return;
            }
            if (commentContextSource != null && (listModel = commentContextSource.getListModel()) != null) {
                insertCid = listModel.getInsertCid();
            } else {
                insertCid = null;
            }
            if (C123100dR.LIZ(insertCid)) {
                return;
            }
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (aweme2 != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme2);
            } else {
                authorUid = null;
            }
            if ((((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid) && C729510SjV.LJJ(aweme2)) || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
            ICommentCareModeService.LIZ.getClass();
            if (C1342200l22.LIZ().LIZJ(aweme2)) {
                return;
            }
            if ((commentCount == 0 || (commentContextSource != null && (commonModel4 = commentContextSource.getCommonModel()) != null && commonModel4.forceOpenKeyboard)) && aweme2 != null && (awemeControl = aweme2.getAwemeControl()) != null && awemeControl.canComment()) {
                CommentService.LIZ.getClass();
                if (!C523420Kfs.LIZ().LJIILLIIL(aweme2) && !aweme2.isCmtSwt() && !C1017070cZd.LJJLIL(aweme2) && !C0SYU.LIZ(c19eg, aweme2, true) && (commentContextSourceBQ22 = BQ2()) != null && (commonModel2 = commentContextSourceBQ22.getCommonModel()) != null && !commonModel2.forceHideAutoKeyboard) {
                    if (commentContextSource != null && (commonModel3 = commentContextSource.getCommonModel()) != null) {
                        boolValueOf = Boolean.valueOf(commonModel3.isPreCreate());
                    }
                    if (C1346420l8q.LIZIZ(boolValueOf)) {
                        setState(AFwS259S0000000_21.get$arr$(457));
                    }
                }
            }
        }
    }

    public final void SQ2(AbstractC1347290lAF abstractC1347290lAF, boolean z) {
        C1344030l4z.LIZJ("KeyboardVM", "switchPanel current:" + getState().LL + "  to:" + abstractC1347290lAF + " ");
        withState(new AwS72S0210000_21(abstractC1347290lAF, this, z, 1));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility
    public final void Xx(Comment comment, Boolean bool) {
        boolean zBooleanValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setReplyCommentStateAfterInsertCid ");
        sbLIZ.append(bool);
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        withState(new AwS72S0210000_21(this, comment, zBooleanValue, 0));
    }

    public final void aR2(C1346950l9h c1346950l9h, AbstractC1347290lAF abstractC1347290lAF) {
        boolean z;
        boolean zLJFF = Intrinsics.LJFF(abstractC1347290lAF, C1347100l9w.LIZ);
        List<CommentImageModel> listCQ2 = CQ2();
        boolean z2 = false;
        if (listCQ2 != null && !listCQ2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = !z;
        boolean z4 = c1346950l9h.LLJJL;
        List<AudioCommentModel> listXQ2 = xQ2();
        if (listXQ2 == null || listXQ2.isEmpty()) {
            z2 = true;
        }
        boolean z5 = !z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSingleCommentPostViewStatus isGiftPanel = ");
        sbLIZ.append(zLJFF);
        sbLIZ.append(" hasPhoto = ");
        sbLIZ.append(z3);
        sbLIZ.append(" hasSelectGift = ");
        sbLIZ.append(z4);
        sbLIZ.append(", hasAudio = ");
        sbLIZ.append(z5);
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new C1346490l8x(zLJFF, z3, z4, z5));
    }

    public final void bR2(C1346950l9h c1346950l9h, AbstractC1347290lAF abstractC1347290lAF) {
        Comment comment;
        boolean z;
        C1346480l8w c1346480l8w = c1346950l9h.LLILZIL;
        Aweme aweme = null;
        if (c1346480l8w != null) {
            comment = c1346480l8w.LIZ;
        } else {
            comment = null;
        }
        boolean z2 = true;
        if (comment != null) {
            z = true;
        } else {
            z = false;
        }
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceBQ2);
        }
        boolean zLIZLLL = C1346390l8n.LIZLLL(aweme);
        C1350650lFf.LIZ.getClass();
        if (!Intrinsics.LJFF(abstractC1347290lAF, C1347110l9x.LIZ) && Intrinsics.LJFF(abstractC1347290lAF, C1347120l9y.LIZ)) {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSingleCommentPostViewStatus ");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(zLIZLLL);
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new C1346540l92(z, zLIZLLL, z2));
    }

    public final void cR2(C1346950l9h c1346950l9h, AbstractC1347290lAF abstractC1347290lAF) {
        Comment comment;
        boolean z;
        C1346480l8w c1346480l8w = c1346950l9h.LLILZIL;
        if (c1346480l8w != null) {
            comment = c1346480l8w.LIZ;
        } else {
            comment = null;
        }
        boolean z2 = true;
        if (comment != null) {
            z = true;
        } else {
            z = false;
        }
        C1350650lFf.LIZ.getClass();
        if (!Intrinsics.LJFF(abstractC1347290lAF, C1347110l9x.LIZ) && !Intrinsics.LJFF(abstractC1347290lAF, C1347070l9t.LIZ) && Intrinsics.LJFF(abstractC1347290lAF, C1347120l9y.LIZ)) {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSingleRepostViewStatus ");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(z2);
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS5S0020000_21(z, z2, 2));
    }

    public final void dR2(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSoftKeyboardState ");
        sbLIZ.append(z);
        sbLIZ.append("  ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            withState(new AwS107S0110000_21(this, z, 7));
        } else {
            this.LLJJIJI = false;
            withState(new C1346500l8y(this, z, i));
        }
    }

    public final CommentInputContent yQ2(Aweme aweme, EnumC1346360l8k enumC1346360l8k) {
        if (aweme.getAid() == null) {
            return new CommentInputContent("", null, null, null, null);
        }
        LLJJIJIL.getClass();
        String strLIZIZ = C1341800l1O.LIZIZ(aweme, enumC1346360l8k);
        CommentInputContent commentInputContentLIZJ = this.LLILZ.LIZJ(strLIZIZ);
        if (commentInputContentLIZJ == null) {
            CommentInputContent commentInputContent = new CommentInputContent("", null, null, null, null);
            this.LLILZ.LIZLLL(strLIZIZ, commentInputContent);
            return commentInputContent;
        }
        return commentInputContentLIZJ;
    }

    public final CommentInputContent zQ2(Aweme aweme, EnumC1346360l8k enumC1346360l8k) {
        if (aweme == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inputContentHistory==>getCommentInputContent ");
        LLJJIJIL.getClass();
        sbLIZ.append(C1341800l1O.LIZIZ(aweme, enumC1346360l8k));
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        return this.LLILZ.LIZJ(C1341800l1O.LIZIZ(aweme, enumC1346360l8k));
    }

    public final void IQ2(boolean z, C1346950l9h c1346950l9h, boolean z2) {
        AbstractC1347290lAF abstractC1347290lAF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyOffScreen ");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(c1346950l9h.LL);
        C1344030l4z.LIZJ("KeyboardVM", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(c1346950l9h.LL, C1347120l9y.LIZ)) {
            if (z) {
                AbstractC1347290lAF abstractC1347290lAF2 = c1346950l9h.LL;
                C1347080l9u c1347080l9u = C1347080l9u.LIZ;
                if (Intrinsics.LJFF(abstractC1347290lAF2, c1347080l9u) && z2) {
                    c1347080l9u.getClass();
                    abstractC1347290lAF = C1347080l9u.LIZIZ;
                    if (abstractC1347290lAF == null) {
                        abstractC1347290lAF = C1347110l9x.LIZ;
                    }
                } else {
                    abstractC1347290lAF = c1346950l9h.LL;
                }
                C1347070l9t c1347070l9t = C1347070l9t.LIZ;
                if (!Intrinsics.LJFF(abstractC1347290lAF, c1347070l9t)) {
                    c1347070l9t.getClass();
                    C1347070l9t.LIZIZ = abstractC1347290lAF;
                    SQ2(c1347070l9t, true);
                    return;
                }
                return;
            }
            AbstractC1347290lAF abstractC1347290lAF3 = c1346950l9h.LL;
            if (!(abstractC1347290lAF3 instanceof C1347070l9t)) {
                return;
            }
            abstractC1347290lAF3.getClass();
            AbstractC1347290lAF abstractC1347290lAF4 = C1347070l9t.LIZIZ;
            if (abstractC1347290lAF4 != null) {
                SQ2(abstractC1347290lAF4, false);
            }
            if (!Intrinsics.LJFF(abstractC1347290lAF4, C1347110l9x.LIZ)) {
                return;
            }
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("tt_comment_reshow_panel_after_return", true)) {
                return;
            }
            this.LLJJIJI = true;
        }
    }

    public final void UQ2(Aweme aweme, List<CommentImageModel> list, EnumC1346360l8k enumC1346360l8k) {
        Integer numValueOf;
        Aweme aweme2 = aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCommentInputContentImage ");
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 != null) {
            numValueOf = Integer.valueOf(commentContextSourceBQ2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme2 == null) {
            CommentContextSource commentContextSourceBQ22 = BQ2();
            if (commentContextSourceBQ22 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceBQ22);
            } else {
                aweme2 = null;
            }
        }
        this.LLJ = list;
        withState(new AwS117S0400000_21(aweme2, (Aweme) this, (KeyboardVMV2) enumC1346360l8k, (EnumC1346360l8k) list, (List<CommentImageModel>) 2));
    }

    public final void VQ2(Aweme aweme, CommentStickerStruct commentStickerStruct, EnumC1346360l8k enumC1346360l8k) {
        Integer numValueOf;
        Aweme aweme2 = aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCommentInputContentSticker ");
        CommentContextSource commentContextSourceBQ2 = BQ2();
        if (commentContextSourceBQ2 != null) {
            numValueOf = Integer.valueOf(commentContextSourceBQ2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme2 == null) {
            CommentContextSource commentContextSourceBQ22 = BQ2();
            if (commentContextSourceBQ22 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceBQ22);
            } else {
                aweme2 = null;
            }
        }
        withState(new AwS117S0400000_21(aweme2, this, enumC1346360l8k, commentStickerStruct, 3));
    }

    public final void WQ2(Aweme aweme, Editable editable, EnumC1346360l8k enumC1346360l8k) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCommentInputContentText start ");
        LLJJIJIL.getClass();
        sbLIZ.append(C1341800l1O.LIZIZ(aweme, enumC1346360l8k));
        sbLIZ.append(' ');
        sbLIZ.append((Object) editable);
        C2188811AlT.LIZIZ(sbLIZ);
        withState(new AwS117S0400000_21(aweme, enumC1346360l8k, editable, this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void YQ2(X.C1346950l9h r10, X.AbstractC1347290lAF r11, X.AbstractC1347290lAF r12) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2.YQ2(X.0l9h, X.0lAF, X.0lAF):void");
    }
}
