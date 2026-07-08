package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C0M7Y;
import X.C1233040iBy;
import X.C1370940lmO;
import X.C1373180lq0;
import X.C1377850lxX;
import X.C621180OYa;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class UserSharePackage extends LinkDefaultSharePackage {
    public User user;
    public static final C1373180lq0 Companion = new C1373180lq0();
    public static final int $stable = 8;

    public UserSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJIIJJI(InterfaceC1370310llN interfaceC1370310llN, Context context) {
        String shareProfileToast;
        String shareProfileToast2;
        if (interfaceC1370310llN instanceof C1377850lxX) {
            User user = this.user;
            if (user == null) {
                user = null;
            }
            GeneralPermission generalPermission = user.getGeneralPermission();
            if (generalPermission != null) {
                shareProfileToast = generalPermission.getShareProfileToast();
            } else {
                shareProfileToast = null;
            }
            if (!TextUtils.isEmpty(shareProfileToast)) {
                User user2 = this.user;
                if (user2 == null) {
                    user2 = null;
                }
                GeneralPermission generalPermission2 = user2.getGeneralPermission();
                if (generalPermission2 != null && (shareProfileToast2 = generalPermission2.getShareProfileToast()) != null) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZJ(shareProfileToast2);
                    c1233040iBy.LIZLLL();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        String shareProfileToast;
        String shareProfileToast2;
        User user = this.user;
        if (user == null) {
            user = null;
        }
        GeneralPermission generalPermission = user.getGeneralPermission();
        if (generalPermission != null) {
            shareProfileToast = generalPermission.getShareProfileToast();
        } else {
            shareProfileToast = null;
        }
        if (!TextUtils.isEmpty(shareProfileToast)) {
            User user2 = this.user;
            if (user2 == null) {
                user2 = null;
            }
            GeneralPermission generalPermission2 = user2.getGeneralPermission();
            if (generalPermission2 != null && (shareProfileToast2 = generalPermission2.getShareProfileToast()) != null) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZJ(shareProfileToast2);
                c1233040iBy.LIZLLL();
            }
            function1.invoke(Boolean.TRUE);
            return true;
        }
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        return false;
    }
}
