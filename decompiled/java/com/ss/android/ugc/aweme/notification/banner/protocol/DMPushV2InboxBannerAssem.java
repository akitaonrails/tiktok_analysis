package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C06NU;
import X.C0PEM;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LE;
import X.C1478405qY;
import X.C14EU;
import X.C1558520qew;
import X.C1777820wMe;
import X.C1890430zIH;
import X.C1890440zII;
import X.C1890460zIK;
import X.C19328310jZ;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C346540DiG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C824390WVp;
import X.C889930Yvf;
import X.EnumC637310OzB;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class DMPushV2InboxBannerAssem extends InboxBannerCustomAssem implements InboxAbilityCenter$IInboxBannerWidgetAbility.IDMPushV2Ability, InterfaceC1554640qYg {
    public boolean LLILZ;
    public int LLILZIL = 2;
    public Boolean LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IInboxBannerWidgetAbility.IDMPushV2Ability.class, null, null);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 13011612) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void fo() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C346540DiG(CoroutineExceptionHandler.LJJLIL, 2), null, new C1478405qY(null), 2);
        oo("notification_setting_alert_show");
    }

    public final void so() {
        if (this.LLILZIL == 2 || !Intrinsics.LJFF(this.LLILZLL, Boolean.FALSE)) {
            this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        } else {
            this.LL.setValue(new Pair(EnumC637310OzB.BOTTOM_SHOW, new C1777820wMe(this.LLILZIL, new AwS572S0100000_28(this, 851), new AwS607S0100000_28(this, 276))));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Context context;
        Activity activityLIZ;
        super.onResume();
        if (this.LLILZ) {
            if (!C824390WVp.LIZJ(getContext())) {
                if (C06NU.LIZ()) {
                    this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
                    return;
                }
                return;
            }
            if (this.LLILZIL == 0 && (context = getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131831698);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.a1h);
                c1389890mGx.LJIIJJI();
            }
            if (C19328310jZ.LIZIZ.LIZJ()) {
                H7(2);
                Keva keva = C1890430zIH.LIZ;
                C1890430zIH.LIZ.storeLong("key_unified_push_permission", System.currentTimeMillis());
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C346540DiG(CoroutineExceptionHandler.LJJLIL, 2), null, new C1478405qY(null), 2);
            }
        }
    }

    public static void oo(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("pop_up_type", "dm_push");
        c2344009Gk.LJIIIIZZ("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility.IDMPushV2Ability
    public final void H7(int i) {
        this.LLILZ = true;
        this.LLILZIL = i;
        so();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onContactPodReceive(C1890440zII c1890440zII) {
        this.LLILZLL = Boolean.valueOf(c1890440zII.LIZ);
        so();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1777820wMe.class))) {
            return new C1890460zIK(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a9x, viewGroup, false), C724240Sb0.LJI(this));
        }
        return null;
    }
}
