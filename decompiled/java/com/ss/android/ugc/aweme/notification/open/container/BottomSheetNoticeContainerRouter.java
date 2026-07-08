package com.ss.android.ugc.aweme.notification.open.container;

import X.C1390920mIc;
import X.C1720106oR;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C786410Ut5;
import X.EnumC1902000zaw;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeContainerParam;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class BottomSheetNoticeContainerRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Serializable noticeContainerParam;
        if (!(context instanceof C19GS)) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("BottomSheetNoticeContainerRouter", "context must implements AppCompatActivity");
            return Boolean.FALSE;
        }
        if (Intrinsics.LJFF(str, "aweme://notification/friends")) {
            noticeContainerParam = new NoticeContainerParam(EnumC1902000zaw.FRIENDS);
        } else {
            noticeContainerParam = EnumC1902000zaw.DEFAULT;
        }
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIZ(bundle2, "container_param", noticeContainerParam);
        bundle2.putBoolean("bottom_sheet_fragment_type", true);
        String str2 = NoticeBottomSheetDialogFragment._pnsPageId;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        NoticeBottomSheetDialogFragment noticeBottomSheetDialogFragment = new NoticeBottomSheetDialogFragment();
        noticeBottomSheetDialogFragment.setArguments(bundle2);
        c1390920mIc.LIZ.LLJJIJI = noticeBottomSheetDialogFragment;
        c1390920mIc.LJIIIIZZ(4);
        c1390920mIc.LJI(48);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = false;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(((C19EG) context).getSupportFragmentManager(), "BottomSheetNoticeDialog");
        return Boolean.TRUE;
    }
}
