package com.ss.android.ugc.aweme.im.service;

import X.C0Y8T;
import X.C0Y8Y;
import X.C0YSQ;
import X.C1606620ruW;
import X.C2188811AlT;
import X.C310720CFy;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AuthorSupporterHelper implements IAuthorSupporterHelper {
    public static final int LIZIZ;
    public static final AuthorSupporterHelper LIZ = new AuthorSupporterHelper();
    public static String LIZJ = "";

    static {
        C310720CFy c310720CFyLIZIZ;
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
        LIZIZ = (iAwemeImManager == null || iAwemeImManager.getProxy() == null || (c310720CFyLIZIZ = C1606620ruW.LIZIZ()) == null) ? 3 : c310720CFyLIZIZ.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
    public final boolean LIZJ() {
        return (LIZIZ & 16) == 16;
    }

    public static final class Service implements IAuthorSupporterHelper {
        public final /* synthetic */ AuthorSupporterHelper LIZ = AuthorSupporterHelper.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
        public final void LIZ(C0Y8T c0y8t) {
            this.LIZ.LIZ(c0y8t);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
        public final boolean LIZJ() {
            return this.LIZ.LIZJ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
        public final boolean LIZLLL(String str) {
            return this.LIZ.LIZLLL(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
        public final boolean LJ(C0Y8T c0y8t) {
            return this.LIZ.LJ(c0y8t);
        }

        @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
        public final void LIZIZ(String str) {
            this.LIZ.getClass();
            if (str != null) {
                AuthorSupporterHelper.LIZJ = str;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
    public final void LIZ(C0Y8T c0y8t) {
        String conversationId;
        Map<String, String> localExt;
        Map<String, String> localExt2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markAuthorSupporterChatLocal: ");
        String str = null;
        if (c0y8t != null) {
            conversationId = c0y8t.getConversationId();
        } else {
            conversationId = null;
        }
        sbLIZ.append(conversationId);
        sbLIZ.append(", ");
        if (c0y8t != null && (localExt2 = c0y8t.getLocalExt()) != null) {
            str = localExt2.get("a:s_author_im_supporter");
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0y8t != null && (localExt = c0y8t.getLocalExt()) != null && Intrinsics.LJFF(LIZJ, c0y8t.getConversationId()) && !Intrinsics.LJFF("1", localExt.get("a:s_author_im_supporter"))) {
            localExt.put("a:s_author_im_supporter", "1");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
    public final void LIZIZ(String str) {
        if (str != null) {
            LIZJ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
    public final boolean LIZLLL(String str) {
        if (str != null) {
            return LIZ.LJ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str));
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper
    public final boolean LJ(C0Y8T c0y8t) {
        Map<String, String> ext;
        if (c0y8t != null) {
            C0Y8Y coreInfo = c0y8t.getCoreInfo();
            if (coreInfo != null && (ext = coreInfo.getExt()) != null && Intrinsics.LJFF("1", ext.get("a:s_author_im_supporter"))) {
                return true;
            }
            Map<String, String> localExt = c0y8t.getLocalExt();
            if (localExt != null && Intrinsics.LJFF("1", localExt.get("a:s_author_im_supporter"))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
