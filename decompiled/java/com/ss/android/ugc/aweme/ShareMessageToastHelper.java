package com.ss.android.ugc.aweme;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C07S7;
import X.C0AFB;
import X.C1365810le7;
import X.C13LP;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C452501pT;
import X.EnumC1365740le0;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareMessageToastHelper implements IShareMessageToastHelper {
    public static final List<String> LJ = C1697810uHb.LJIIJJI("aweme", "aweme_card", "aweme_photo", "minis", "repost", "web", "video_sticker", "live_event", "imagine_studio", "mix_videos", "story_highlight", "user");
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(78));
    public final C07S7 LIZJ = new C07S7();
    public final Set<Integer> LIZLLL = new LinkedHashSet();

    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    public final void Bs() {
        this.LIZJ.LIZ.remove("ChatFragment");
    }

    public static Context LIZIZ() {
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            return abstractC1387200mCcLJ.LIZIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    public final Set<Integer> As() {
        return this.LIZLLL;
    }

    public static Aweme LIZ(String str) {
        IMAwemeService iMAwemeService = (IMAwemeService) PluggableExtentionKt.pluggableSpiForReal(IMAwemeService.class);
        if (iMAwemeService != null) {
            return iMAwemeService.LLILZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    public final void ws(Function1 function1) {
        this.LIZJ.LIZ.put("ChatFragment", function1);
    }

    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    public final boolean xs(String str) {
        if (!LJ.contains(str)) {
            if (Intrinsics.LJFF(str, "comment") && ((Boolean) C0AFB.LIZ.getValue()).booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    public final String ys(String str) {
        Context contextLIZIZ = LIZIZ();
        if (contextLIZIZ == null) {
            return null;
        }
        return contextLIZIZ.getString(2131835475, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zs(X.C1365810le7 r27) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ShareMessageToastHelper.zs(X.0le7):void");
    }

    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    public final String Cs(C1365810le7 c1365810le7, EnumC1365740le0 enumC1365740le0) {
        return Ds(c1365810le7.LIZ, enumC1365740le0, c1365810le7.LJI, c1365810le7.LJFF, c1365810le7.LJII);
    }

    @Override // com.ss.android.ugc.aweme.IShareMessageToastHelper
    public final String Ds(List list, EnumC1365740le0 enumC1365740le0, boolean z, boolean z2, int i) {
        BaseContact baseContact;
        Context contextLIZIZ = LIZIZ();
        if (contextLIZIZ == null || (baseContact = (BaseContact) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        if (enumC1365740le0 == EnumC1365740le0.CENTER) {
            return contextLIZIZ.getString(2131822805);
        }
        if (z) {
            return contextLIZIZ.getString(2131832049);
        }
        if (z2) {
            return contextLIZIZ.getString(2131835378);
        }
        if (list.size() == 2) {
            return contextLIZIZ.getString(2131825152, baseContact.getDisplayName());
        }
        if (list.size() > 2) {
            return contextLIZIZ.getString(2131825153, baseContact.getDisplayName(), Integer.valueOf((list.size() + i) - 1));
        }
        return contextLIZIZ.getString(2131835475, baseContact.getDisplayName());
    }
}
