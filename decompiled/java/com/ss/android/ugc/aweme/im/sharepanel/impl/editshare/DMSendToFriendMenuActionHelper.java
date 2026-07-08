package com.ss.android.ugc.aweme.im.sharepanel.impl.editshare;

import X.AnonymousClass0956;
import X.C0I0B;
import X.C0PEM;
import X.C1336205Ku;
import X.C13BV;
import X.C1400340mXo;
import X.C1865360ydq;
import X.C23250099c;
import X.C418440Gaw;
import X.C425790Gmn;
import X.C427660Gpo;
import X.C427860Gq8;
import X.C438710HIf;
import X.C443090HZb;
import X.C451750HnZ;
import X.C463040IDu;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817503Hh;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class DMSendToFriendMenuActionHelper implements IDMSendToFriendMenuActionHelper {
    public boolean LIZIZ;
    public List<? extends IMUser> LIZJ = C13BV.INSTANCE;
    public AnonymousClass0956 LIZLLL;

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper
    public final void LIZLLL() {
        if (this.LIZIZ) {
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LIZLLL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C451750HnZ(this, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper
    public final boolean LIZIZ() {
        User currentUser;
        return (!C1865360ydq.LIZ() || (currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser()) == null || currentUser.getFriendCount() == 0 || C1336205Ku.LIZ(false).getImPrivacySettings().LJI() || C1336205Ku.LIZJ().LIZJ()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper
    public final void LIZJ(boolean z) {
        this.LIZIZ = z;
        if (!z) {
            this.LIZJ = C13BV.INSTANCE;
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper
    public final C443090HZb LIZ(Context context, Function0<Unit> function0) {
        if (this.LIZJ.size() > 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            C427860Gq8 c427860Gq8 = new C427860Gq8(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 17);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427860Gq8);
            c427860Gq8.setLayoutParams(layoutParams);
            c427860Gq8.setClipChildren(false);
            c427860Gq8.setClipToPadding(false);
            c427860Gq8.setSize(24);
            C427860Gq8.LIZ(c427860Gq8, C438710HIf.LIZ(((BaseContact) ListProtector.get(this.LIZJ, 0)).getAvatarThumb()));
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(((BaseContact) ListProtector.get(this.LIZJ, 1)).getAvatarThumb());
            C463040IDu c463040IDu = new C463040IDu(null, c427860Gq8, 2);
            C425790Gmn avatar2 = c427860Gq8.getAvatar2();
            avatar2.LLJZIJLIL = true;
            avatar2.invalidate();
            C427660Gpo.LJIIJJI(c427860Gq8.getAvatar2(), imageUrlModelLIZ, true, null, null, false, false, null, c463040IDu, false, null, 768);
            frameLayout.addView(c427860Gq8);
            return new C443090HZb(context.getString(2131831535), new AwS550S0100000_6(function0, 347), 0, new AwS585S0100000_6(frameLayout, 118), 0, null, 0, false, false, null, 1012);
        }
        return new C443090HZb(context.getString(2131831535), new AwS550S0100000_6(function0, 348), R.raw.icon_paperplane, null, 0, null, 0, false, false, null, 1016);
    }
}
