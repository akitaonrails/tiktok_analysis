package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1389890mGx;
import X.C13IQ;
import X.C1749280vcc;
import X.C197039127h;
import X.C19EG;
import X.C23250099c;
import X.C418440Gaw;
import X.C604900No0;
import X.C604910No1;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS76S0300000_9;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerWidgetContainer;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerWidget;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS49S1300000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS49S1300000_9 awS49S1300000_9, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setText(awS49S1300000_9.s0);
        c197039127h.setButtonSize(2);
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        C786410Ut5.J6(c197039127h, layoutParams);
        c197039127h.setButtonVariant(2);
        C786410Ut5.U8(c197039127h, new ACListenerS76S0300000_9((OfflineModeSwitchComponent) awS49S1300000_9.l1, (C1749280vcc) awS49S1300000_9.l2, (Drawable) awS49S1300000_9.l3, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS49S1300000_9 awS49S1300000_9, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((InboxBannerWidget) awS49S1300000_9.l1, new AwS588S0100000_9((InboxBannerInfo) awS49S1300000_9.l2, 510));
        assembler.vQ2((InboxBannerWidget) awS49S1300000_9.l1, new AwS123S1100000_9(awS49S1300000_9.s0, (C13IQ) awS49S1300000_9.l3, 8));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS49S1300000_9 awS49S1300000_9, Object obj) {
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModelCp = ((NotificationWidgetContainer) awS49S1300000_9.l1).cp();
        NoticeDisableActionInfo noticeDisableActionInfo = (NoticeDisableActionInfo) awS49S1300000_9.l2;
        C19EG c19egLIZ = C724240Sb0.LIZ((NotificationWidgetContainer) awS49S1300000_9.l1);
        String str = awS49S1300000_9.s0;
        C23250099c.LIZLLL(notificationFragmentV2ViewModelCp.getAssemVMScope(), C0PEM.LIZJ, null, new C604910No1(noticeDisableActionInfo, null), 2);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            if (str == null) {
                str = "";
            }
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        ((NotificationWidgetContainer) awS49S1300000_9.l1).lp((MusNotice) awS49S1300000_9.l3, "click", ((NoticeDisableActionInfo) awS49S1300000_9.l2).muteType);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS49S1300000_9 awS49S1300000_9, Object obj) {
        FollowerViewModel followerViewModelDp = ((FollowerWidgetContainer) awS49S1300000_9.l1).dp();
        NoticeDisableActionInfo noticeDisableActionInfo = (NoticeDisableActionInfo) awS49S1300000_9.l2;
        C19EG c19egLIZ = C724240Sb0.LIZ((FollowerWidgetContainer) awS49S1300000_9.l1);
        String str = awS49S1300000_9.s0;
        C23250099c.LIZLLL(followerViewModelDp.getAssemVMScope(), C0PEM.LIZJ, null, new C604900No0(noticeDisableActionInfo, null), 2);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            if (str == null) {
                str = "";
            }
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        ((FollowerWidgetContainer) awS49S1300000_9.l1).kp((MusNotice) awS49S1300000_9.l3, "click", ((NoticeDisableActionInfo) awS49S1300000_9.l2).muteType);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S1300000_9(FollowerWidgetContainer followerWidgetContainer, NoticeDisableActionInfo noticeDisableActionInfo, String str, MusNotice musNotice, int i) {
        super(1);
        this.$t = i;
        this.l1 = followerWidgetContainer;
        this.l2 = noticeDisableActionInfo;
        this.s0 = str;
        this.l3 = musNotice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS49S1300000_9(InboxBannerWidget inboxBannerWidget, InboxBannerWidget inboxBannerWidget2, InboxBannerInfo inboxBannerInfo, C13IQ<? extends InboxBannerAssem> c13iq, String str) {
        super(1);
        this.$t = str;
        this.l1 = inboxBannerWidget;
        this.l2 = inboxBannerWidget2;
        this.l3 = inboxBannerInfo;
        this.s0 = c13iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S1300000_9(NotificationWidgetContainer notificationWidgetContainer, NoticeDisableActionInfo noticeDisableActionInfo, String str, MusNotice musNotice, int i) {
        super(1);
        this.$t = i;
        this.l1 = notificationWidgetContainer;
        this.l2 = noticeDisableActionInfo;
        this.s0 = str;
        this.l3 = musNotice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S1300000_9(String str, OfflineModeSwitchComponent offlineModeSwitchComponent, C1749280vcc c1749280vcc, Drawable drawable, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = offlineModeSwitchComponent;
        this.l2 = c1749280vcc;
        this.l3 = drawable;
    }
}
