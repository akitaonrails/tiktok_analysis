package com.ss.android.ugc.aweme.notification.view.guidepush;

import X.C036E;
import X.C0OKW;
import X.C0OP4;
import X.C0OPQ;
import X.C0OPX;
import X.C0PEM;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C624290OeB;
import X.C624310OeD;
import X.C624340OeG;
import X.C624350OeH;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC637310OzB;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardGuideBannerAssem extends InboxBannerCustomAssem {
    public final void oo() {
        this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        InboxAbilityCenter$INoticeWidgetAbility inboxAbilityCenter$INoticeWidgetAbility = (InboxAbilityCenter$INoticeWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$INoticeWidgetAbility.class, null);
        if (inboxAbilityCenter$INoticeWidgetAbility != null) {
            inboxAbilityCenter$INoticeWidgetAbility.Wx(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C0OP4.LIZ.getClass();
        Pair pairLIZIZ = C0OP4.LIZIZ();
        boolean zBooleanValue = ((Boolean) pairLIZIZ.getFirst()).booleanValue();
        String str = (String) pairLIZIZ.getSecond();
        C0OPQ c0opq = C0OPQ.LIZ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("should_show", zBooleanValue ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("cant_show_reason", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        c0opq.getClass();
        C0OPQ.LJIIL("visibility_check", mapLJIIJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create bb guide banner, should show: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", cantShowReason: ");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue) {
            so(false, str, null);
            return;
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C624340OeG(this, str, null), 2);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0OPX.LJII("fetchBulletinAccountInvitation network is unavailable");
        so(true, str, new C624310OeD(0));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void lo(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C624290OeB) {
            ((C624290OeB) viewHolder).L5();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRemoveBannerEvent(C0OKW c0okw) {
        oo();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C624310OeD.class))) {
            int i = C624290OeB.LLIZLLLIL;
            return new C624290OeB(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a66, viewGroup, false));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void ho(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        if (viewHolder instanceof C624290OeB) {
            ((C624290OeB) viewHolder).I5(interfaceC1891350zJl, new C624350OeH(this));
        }
    }

    public final void so(boolean z, String str, C624310OeD c624310OeD) {
        EnumC637310OzB enumC637310OzB;
        String str2;
        if (z) {
            enumC637310OzB = EnumC637310OzB.TOP_SHOW;
        } else {
            enumC637310OzB = EnumC637310OzB.DISMISS;
        }
        this.LL.setValue(new Pair(enumC637310OzB, c624310OeD));
        InboxAbilityCenter$INoticeWidgetAbility inboxAbilityCenter$INoticeWidgetAbility = (InboxAbilityCenter$INoticeWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$INoticeWidgetAbility.class, null);
        if (inboxAbilityCenter$INoticeWidgetAbility != null) {
            inboxAbilityCenter$INoticeWidgetAbility.Wx(z);
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        Pair[] pairArr = new Pair[2];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("should_show", str2);
        pairArr[1] = new Pair("cant_show_reason", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        c0opq.getClass();
        C0OPQ.LJIIL("visibility_check", mapLJIIJ);
    }
}
