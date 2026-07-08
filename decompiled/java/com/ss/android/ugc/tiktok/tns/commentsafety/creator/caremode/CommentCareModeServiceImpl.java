package com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode;

import X.AbstractC848400XPy;
import X.C06TC;
import X.C0HTI;
import X.C0XQ7;
import X.C100Z;
import X.C1390920mIc;
import X.C1415705gR;
import X.C1888220zEi;
import X.C1916480zyI;
import X.C191758100e;
import X.C191761100h;
import X.C191762100i;
import X.C191766100m;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C259800zU;
import X.C770750ULh;
import X.DialogInterfaceOnCancelListenerC1767706w7;
import X.EnumC1490680otW;
import X.EnumC1620106Vz;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class CommentCareModeServiceImpl implements ICommentCareModeService {
    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
    public final boolean LIZJ(Aweme aweme) {
        String authorUid;
        C1415705gR.LIZ.getClass();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (!Intrinsics.LJFF(authorUid, C0XQ7.LJFF().getCurUserId())) {
            return false;
        }
        C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
        int iLJIIJJI = c1888220zEi.LJIIJJI();
        if ((iLJIIJJI != C06TC.EXPIRED.getValue() && (iLJIIJJI != C06TC.NOT_ON.getValue() || !c1888220zEi.LIZLLL())) || !C1916480zyI.LIZIZ.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
    public final boolean LIZLLL(Aweme aweme) {
        String authorUid;
        C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
        int iLIZIZ = c1888220zEi.LIZIZ();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(authorUid, C0XQ7.LJFF().getCurUserId())) {
            if ((iLIZIZ == EnumC1490680otW.VULNERABLE.getValue() || iLIZIZ == EnumC1490680otW.WHITE_LIST.getValue()) && !c1888220zEi.LJFF()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
    public final void LIZ(Fragment fragment, Aweme aweme) {
        Context context;
        if (LIZJ(aweme)) {
            C1415705gR.LIZ.getClass();
            if (fragment != null && (context = fragment.getContext()) != null) {
                C259800zU c259800zU = new C259800zU();
                C770750ULh c770750ULh = new C770750ULh();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.wk;
                c770750ULh.LIZ = c0hti.LIZ(context);
                c770750ULh.LIZLLL = 2;
                c770750ULh.LJ = context.getString(2131830106);
                c770750ULh.LJFF = context.getString(2131830105);
                c770750ULh.LJI(context.getString(2131821883), new AwS581S0100000_2(fragment, 632));
                c770750ULh.LJII(context.getString(2131830107), new AwS211S0300000_2(fragment, (Fragment) c259800zU, (C259800zU<TuxSheet>) context, (Context) 27));
                c770750ULh.LJIJ = true;
                c770750ULh.LJIILLIIL = true;
                C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
                DialogInterfaceOnCancelListenerC1767706w7 dialogInterfaceOnCancelListenerC1767706w7 = new DialogInterfaceOnCancelListenerC1767706w7(fragment, 2);
                ?? r2 = c1390920mIcLIZIZ.LIZ;
                r2.LL = dialogInterfaceOnCancelListenerC1767706w7;
                c259800zU.element = r2;
                r2.show(fragment.getParentFragmentManager(), "filter_all_expired");
                C20684815ws.LJIILLIIL("filter_all_close_reminder_page_show", C2097908Jt.LIZJ(new Pair("enter_from", "comment_zone")));
                C100Z.LJ(C1916480zyI.LIZIZ.LIZ());
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
    public final void LJ(C19EG c19eg, boolean z, EnumC1620106Vz enumC1620106Vz) {
        if (c19eg == null) {
            return;
        }
        C191761100h.LIZ.getClass();
        if (enumC1620106Vz == EnumC1620106Vz.COMMENT_BATCH_DELETE_PUSH && z && C191761100h.LIZ() && !C1888220zEi.LIZIZ.LJFF() && C191761100h.LIZIZ()) {
            PopupManager.LJIJI(new C191762100i(c19eg, enumC1620106Vz), true);
        }
    }

    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
    public final void LIZIZ(C19EG c19eg, Aweme aweme, Comment comment, EnumC1620106Vz enumC1620106Vz) {
        boolean zLIZIZ;
        if (c19eg != null && aweme != null && comment != null) {
            C191761100h.LIZ.getClass();
            if (enumC1620106Vz == EnumC1620106Vz.COMMENT_DELETE_PUSH) {
                if (!Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || Intrinsics.LJFF(Comment.getAuthorUid(comment), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || !C191761100h.LIZ() || C1888220zEi.LIZIZ.LJFF() || !C191761100h.LIZIZ()) {
                    return;
                }
            } else {
                if (enumC1620106Vz != EnumC1620106Vz.COMMENT_DISLIKE_PUSH || !Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || Intrinsics.LJFF(Comment.getAuthorUid(comment), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) || !C191761100h.LIZ()) {
                    return;
                }
                C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
                if (c1888220zEi.LJFF()) {
                    return;
                }
                int iLIZIZ = c1888220zEi.LIZIZ();
                if (iLIZIZ == EnumC1490680otW.VULNERABLE.getValue()) {
                    zLIZIZ = C191758100e.LIZIZ.LIZLLL();
                } else if (iLIZIZ != EnumC1490680otW.WHITE_LIST.getValue()) {
                    return;
                } else {
                    zLIZIZ = C191766100m.LIZIZ.LIZIZ();
                }
                if (!zLIZIZ) {
                    return;
                }
            }
            PopupManager.LJIJI(new C191762100i(c19eg, enumC1620106Vz), true);
        }
    }
}
