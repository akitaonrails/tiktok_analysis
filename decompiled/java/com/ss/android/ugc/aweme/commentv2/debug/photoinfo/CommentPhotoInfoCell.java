package com.ss.android.ugc.aweme.commentv2.debug.photoinfo;

import X.C1350170lEt;
import X.C2188811AlT;
import X.C2208181Bbc;
import X.C2208191Bbd;
import X.InterfaceC1891350zJl;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPhotoInfoCell extends CommentDebugBaseCell<C1350170lEt> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uploadDomain;
        super.onBindItemView(interfaceC1891350zJl);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            StringBuilder sb = new StringBuilder("***** photo info *****\n");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("auth info cache upload domain: ");
            int i = C2208181Bbc.LJII;
            CommentImageUploadAuth commentImageUploadAuth = C2208181Bbc.LJIIIZ;
            String uploadDomain2 = null;
            if (commentImageUploadAuth != null) {
                uploadDomain = commentImageUploadAuth.getUploadDomain();
            } else {
                uploadDomain = null;
            }
            sbLIZ.append(uploadDomain);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("auth info keva upload domain: ");
            CommentImageUploadAuth commentImageUploadAuthLJFF = C2208191Bbd.LJFF();
            if (commentImageUploadAuthLJFF != null) {
                uploadDomain2 = commentImageUploadAuthLJFF.getUploadDomain();
            }
            sbLIZ2.append(uploadDomain2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            tuxTextView.setText(sb.toString());
        }
    }
}
