package kotlin.jvm.internal;

import X.C050S;
import X.C09AY;
import X.C1246360iXS;
import X.C1902890zcN;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2188921Ale;
import X.C606500Nqa;
import X.C606540Nqe;
import X.C609530NvT;
import X.C638560P2w;
import X.C814730Vxf;
import X.C946803n0;
import X.InterfaceC2217461Bqa;
import X.RunnableC514801zW;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.FanSpotlightBlockVideoAssem;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.sysnotice.cell.SystemNotificationCell;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedProgressInfoAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS135S0201000_9 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS135S0201000_9 awS135S0201000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS135S0201000_9.l0).id);
        sbLIZ.append("] error isn't null, error = ");
        sbLIZ.append(((C609530NvT) awS135S0201000_9.l1).LIZIZ);
        sbLIZ.append(", retry times: {");
        sbLIZ.append(awS135S0201000_9.i2);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS135S0201000_9 awS135S0201000_9) {
        String str;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C946803n0.LIZ(((SystemNotificationCell) awS135S0201000_9.l0).itemView), "aweme://inbox/system_notice/unsubscribe_setting_new/detail");
        smartRouteBuildRoute.withParam("channel_id", String.valueOf(awS135S0201000_9.i2));
        smartRouteBuildRoute.withParam("use_exit_data", true);
        smartRouteBuildRoute.withAnimation(R.anim.fv, R.anim.g0);
        smartRouteBuildRoute.open();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", "notification_page");
        pairArr[1] = new Pair("account_type", ((GroupUnsubscribeSetting) awS135S0201000_9.l1).accountType);
        C1246360iXS c1246360iXS = C1902890zcN.LIZ;
        if (c1246360iXS != null) {
            str = c1246360iXS.LIZJ;
        } else {
            str = null;
        }
        pairArr[2] = new Pair("cell_type", str);
        pairArr[3] = new Pair("enter_method", "template_card");
        C20684815ws.LJFF().execute(new RunnableC514801zW(C2097608Jq.LJIIJ(pairArr), 85));
        return Boolean.TRUE;
    }

    public static final Object invoke$2(AwS135S0201000_9 awS135S0201000_9) {
        C2188921Ale c2188921Ale = (C2188921Ale) ((VibeFeedProgressInfoAssem) awS135S0201000_9.l0).LLJILJIL.getValue();
        if (c2188921Ale != null) {
            float f = awS135S0201000_9.i2;
            float f2 = ((C638560P2w) awS135S0201000_9.l1).LIZ;
            C2188921Ale.LIZ(c2188921Ale, f / f2, ((VibeFeedProgressInfoAssem) awS135S0201000_9.l0).LLJJI / f2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS135S0201000_9 awS135S0201000_9) {
        BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) awS135S0201000_9.l0;
        bulletinProfileViewModel.withState(new AwS95S0201000_9(awS135S0201000_9.i2, bulletinProfileViewModel, (BulletinFunctionSetting) awS135S0201000_9.l1, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS135S0201000_9 awS135S0201000_9) {
        AssemVMLazy assemVMLazy = ((FanSpotlightBlockVideoAssem) awS135S0201000_9.l0).LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FanSpotlightBlockVideoAssem.LLJLLIL;
        ((OriginMusicListViewModel) assemVMLazy.getValue()).JQ2(awS135S0201000_9.i2, ((C050S) awS135S0201000_9.l1).LL);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS135S0201000_9 awS135S0201000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete at ");
        sbLIZ.append(awS135S0201000_9.i2);
        sbLIZ.append(" by ");
        sbLIZ.append(((C606500Nqa) awS135S0201000_9.l0).LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(((C606540Nqe) awS135S0201000_9.l1).LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS135S0201000_9 awS135S0201000_9) {
        ((OriginMusicListViewModel) awS135S0201000_9.l0).JQ2(awS135S0201000_9.i2, ((C050S) awS135S0201000_9.l1).LL);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS135S0201000_9 r20) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS135S0201000_9.invoke$7(kotlin.jvm.internal.AwS135S0201000_9):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(int i, C606500Nqa c606500Nqa, C606540Nqe c606540Nqe, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c606500Nqa;
        this.l1 = c606540Nqe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(int i, FeedItemList feedItemList, FeedItemList feedItemList2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = feedItemList;
        this.i2 = i;
        this.l1 = feedItemList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(int i, BulletinProfileViewModel bulletinProfileViewModel, BulletinFunctionSetting bulletinFunctionSetting, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = bulletinProfileViewModel;
        this.l1 = bulletinFunctionSetting;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(C814730Vxf c814730Vxf, C609530NvT c609530NvT, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c814730Vxf;
        this.l1 = c609530NvT;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(FanSpotlightBlockVideoAssem fanSpotlightBlockVideoAssem, C050S c050s, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = fanSpotlightBlockVideoAssem;
        this.l1 = c050s;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(OriginMusicListViewModel originMusicListViewModel, C050S c050s, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = originMusicListViewModel;
        this.l1 = c050s;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(SystemNotificationCell systemNotificationCell, int i, GroupUnsubscribeSetting groupUnsubscribeSetting, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = systemNotificationCell;
        this.i2 = i;
        this.l1 = groupUnsubscribeSetting;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0201000_9(VibeFeedProgressInfoAssem vibeFeedProgressInfoAssem, int i, C638560P2w c638560P2w, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = vibeFeedProgressInfoAssem;
        this.i2 = i;
        this.l1 = c638560P2w;
    }
}
