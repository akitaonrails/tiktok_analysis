package com.ss.android.ugc.gamora.editor;

import X.C0CHQ;
import X.C0GTR;
import X.C1324750kZt;
import X.C19292410dm;
import X.C427870Gq9;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.services.IEditStoryAvatarIconService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class EditStoryAvatarIconServiceImpl implements IEditStoryAvatarIconService {
    @Override // com.ss.android.ugc.aweme.services.IEditStoryAvatarIconService
    public final FrameLayout genStoryAvatarIcon(Context context, int i, int i2, float f) {
        UrlModel avatarThumb;
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        C0GTR c0gtr = new C0GTR(context, null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gtr);
        c0gtr.setLayoutParams(layoutParams);
        c0gtr.setRingWidth(f);
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        C786410Ut5.F6(c427870Gq9, layoutParams2);
        c427870Gq9.setPlaceholderImage(R.drawable.a6l);
        c427870Gq9.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null) {
            C1324750kZt.LJI(c427870Gq9, avatarThumb, -1, -1);
        }
        frameLayout.addView(c0gtr);
        frameLayout.addView(c427870Gq9);
        return frameLayout;
    }
}
