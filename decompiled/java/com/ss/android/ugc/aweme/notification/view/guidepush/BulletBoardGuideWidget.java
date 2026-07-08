package com.ss.android.ugc.aweme.notification.view.guidepush;

import X.C0OKW;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1889340zGW;
import X.C2252408s6;
import X.C624290OeB;
import X.C624310OeD;
import X.C637360OzG;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletBoardGuideWidget extends InboxWidget {
    public C624310OeD LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        C624310OeD c624310OeD = this.LLIZLLLIL;
        return c624310OeD != null ? Collections.singletonList(c624310OeD) : C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Collections.singletonList(C13LE.LIZ(C624310OeD.class));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        C2252408s6.LJIIIZ(new AwS553S0100000_9(this, 1369));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRemoveBannerEvent(C0OKW c0okw) {
        this.LLIZLLLIL = null;
        Co(C1889340zGW.LIZ);
        InboxAbilityCenter$INoticeWidgetAbility inboxAbilityCenter$INoticeWidgetAbility = (InboxAbilityCenter$INoticeWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$INoticeWidgetAbility.class, null);
        if (inboxAbilityCenter$INoticeWidgetAbility != null) {
            inboxAbilityCenter$INoticeWidgetAbility.Wx(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C624290OeB) {
            ((C624290OeB) viewHolder).L5();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C624310OeD.class))) {
            int i = C624290OeB.LLIZLLLIL;
            return new C624290OeB(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a66, viewGroup, false));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void so(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        if (viewHolder instanceof C624290OeB) {
            ((C624290OeB) viewHolder).I5(null, new C637360OzG(this));
        }
    }
}
