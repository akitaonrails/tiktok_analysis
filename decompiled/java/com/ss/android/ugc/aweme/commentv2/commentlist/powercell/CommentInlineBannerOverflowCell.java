package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C1340200kyo;
import X.C1340250kyt;
import X.C1342710l2r;
import X.C1342720l2s;
import X.C1342730l2t;
import X.C1342740l2u;
import X.C1342750l2v;
import X.C1350920lG6;
import X.C1354600lM2;
import X.C21146717pB;
import X.C288890BTz;
import X.C572370Mcd;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInlineBannerOverflowCell extends PowerCell<C1342730l2t> implements InterfaceC1146704e9 {
    public C1340200kyo LL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPageScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1340200kyo) this.itemView.findViewById(R.id.pwi);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String cid;
        String str;
        boolean zAdd;
        String first;
        boolean z;
        String strLJJ;
        String strLJJ2;
        C1342730l2t c1342730l2t = (C1342730l2t) interfaceC1891350zJl;
        super.onBindItemView(c1342730l2t);
        C1340200kyo c1340200kyo = this.LL;
        if (c1340200kyo != null) {
            Context context = c1340200kyo.getContext();
            Aweme aweme = c1342730l2t.LLILLJJLI;
            if (aweme != null && (cid = c1342730l2t.LL.getCid()) != null && cid.length() > 0) {
                Pair<String, String> pairLIZLLL = null;
                if (1 != 0) {
                    if (Intrinsics.LJFF(c1342730l2t.LLILZ, "notification_page")) {
                        str = "comment_to_post_comment_from_inbox";
                    } else {
                        str = "comment_to_post_comment_from_fyp";
                    }
                    ForwardMedia forwardMediaLIZ = C1354600lM2.LIZ(C1354600lM2.LIZ, aweme, c1342730l2t.LLILZ);
                    C572370Mcd c572370Mcd = new C572370Mcd(c1342730l2t.LL, aweme, false, null, str, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, 1048556, null);
                    String str2 = c1342730l2t.LLILZ;
                    C1342740l2u.LIZ.getClass();
                    boolean z2 = C1340250kyt.LIZ;
                    if (z2 && cid.length() != 0) {
                        zAdd = C1342740l2u.LJII.add(cid);
                    } else {
                        zAdd = false;
                    }
                    String str3 = "ai_rewrite";
                    if (zAdd) {
                        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                        if (iTextToImageService == null || (strLJJ2 = iTextToImageService.LJJ(cid)) == null) {
                            if (C288890BTz.LIZ()) {
                                strLJJ2 = "ai_rewrite";
                            } else {
                                strLJJ2 = "original_comment";
                            }
                        }
                        C1350920lG6.LJL(aweme, c1342730l2t.LL, str2, str2, "other_comment", strLJJ2);
                    }
                    boolean z3 = !C1342740l2u.LIZJ(cid);
                    if (z2 && cid.length() != 0) {
                        C1342740l2u.LJI.add(cid);
                    }
                    ITextToImageService iTextToImageService2 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                    if (iTextToImageService2 != null) {
                        pairLIZLLL = iTextToImageService2.LIZLLL(cid);
                    }
                    String string = "";
                    if (pairLIZLLL == null || (first = pairLIZLLL.getFirst()) == null) {
                        first = "";
                    }
                    if ((!a0.LJJJIL(first)) && C288890BTz.LIZ()) {
                        z = true;
                        if (pairLIZLLL == null || (string = pairLIZLLL.getSecond()) == null || string.length() == 0) {
                            string = context.getString(2131821387);
                        }
                    } else {
                        z = false;
                    }
                    ITextToImageService iTextToImageService3 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                    if (iTextToImageService3 != null && (strLJJ = iTextToImageService3.LJJ(cid)) != null) {
                        str3 = strLJJ;
                    } else if (!z) {
                        str3 = "original_comment";
                    }
                    c1340200kyo.LJII(c1342730l2t.LLILLL, string, new C1342720l2s(aweme, c1342730l2t, str2, str3, this, c572370Mcd, first, z, context, forwardMediaLIZ, cid), new C1342710l2r(aweme, c1342730l2t, str2, str3, c572370Mcd, this, forwardMediaLIZ, cid, context, c1340200kyo), new C1342750l2v(aweme, c1342730l2t, str2, str3, cid), z3);
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a2t, viewGroup, false);
    }

    public static void L5(Comment comment, String str) {
        String strLJFF;
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null && (strLJFF = iTextToImageService.LJFF(str)) != null) {
            C1354600lM2.LIZ.getClass();
            C1354600lM2.LIZIZ.put(strLJFF, comment);
        }
    }

    public static Bundle I5(Bundle bundle, String str, String str2) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        C786410Ut5.LJJJI("cmt_to_post_entrance_module", "preview_card", bundle2);
        C786410Ut5.LJJJI("cmt_to_post_entrance_element", str, bundle2);
        C786410Ut5.LJJJI("cmt_to_post_preview_position", "other_comment", bundle2);
        if (str2 != null && str2.length() != 0) {
            C786410Ut5.LJJJI("cmt_to_post_initial_content_source", str2, bundle2);
        }
        return bundle2;
    }
}
