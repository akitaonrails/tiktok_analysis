package kotlin.jvm.internal;

import X.C09AY;
import X.C0OI5;
import X.C0OI7;
import X.C0OI8;
import X.C0OIH;
import X.C0OII;
import X.C0OK3;
import X.C0OKA;
import X.C0OKY;
import X.C13BV;
import X.C1623606Xi;
import X.C616880OHm;
import X.C617050OId;
import X.C628830OlV;
import X.C713240RyM;
import X.EnumC617010OHz;
import X.EnumC617060OIe;
import X.EnumC617480OJu;
import X.InterfaceC1631620sYq;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS107S0400000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS107S0400000_9 awS107S0400000_9, Object obj) {
        ((Assembler) obj).wQ2((DetailPageContainerAssem) awS107S0400000_9.l0, (List) awS107S0400000_9.l1);
        C713240RyM.LIZ((DetailPageContainerAssem) awS107S0400000_9.l0, new AwS372S0200000_6((Map) awS107S0400000_9.l2, (Map<String, C628830OlV>) awS107S0400000_9.l3, (List<String>) 8));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS107S0400000_9 awS107S0400000_9, Object obj) {
        C616880OHm c616880OHm = (C616880OHm) obj;
        BulletinListViewModel bulletinListViewModel = (BulletinListViewModel) awS107S0400000_9.l0;
        C0OK3 c0ok3BQ2 = bulletinListViewModel.BQ2();
        c616880OHm.getClass();
        List<InterfaceC1891350zJl> list = c616880OHm.getListState().LLILZ;
        BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) awS107S0400000_9.l1;
        BulletinBaseItem bulletinBaseItem2 = (BulletinBaseItem) awS107S0400000_9.l2;
        C0OKA c0oka = (C0OKA) awS107S0400000_9.l3;
        c0ok3BQ2.getClass();
        BulletinListViewModel.NQ2(bulletinListViewModel, c0ok3BQ2.LIZLLL(list, bulletinBaseItem, bulletinBaseItem2, C13BV.INSTANCE, c0oka, null), null, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS107S0400000_9 awS107S0400000_9, Object obj) {
        long jLongValue;
        C0OI7 c0oi7 = (C0OI7) obj;
        c0oi7.LIZ(C0OII.LIZ, C617050OId.LIZ(EnumC617060OIe.Companion, ((BulletinAccountInfoResponse) awS107S0400000_9.l0).identity));
        c0oi7.LIZ(C0OII.LIZJ, (BulletinBoardInfo) awS107S0400000_9.l1);
        c0oi7.LIZ(C0OII.LIZLLL, (EnumC617010OHz) awS107S0400000_9.l2);
        C0OIH<Long> c0oih = C0OII.LJ;
        Long l = ((BulletinBoardInfo) awS107S0400000_9.l1).subscriberCount;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c0oi7.LIZIZ(c0oih, Long.valueOf(jLongValue));
        C0OIH<Long> c0oih2 = C0OII.LJFF;
        Long l2 = ((BulletinBoardInfo) awS107S0400000_9.l1).quota;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        c0oi7.LIZIZ(c0oih2, Long.valueOf(jLongValue2));
        BulletinShareModel bulletinShareModel = (BulletinShareModel) awS107S0400000_9.l3;
        if (bulletinShareModel != null) {
            c0oi7.LIZ(C0OII.LJI, bulletinShareModel);
        }
        BulletinChannelAccessControl bulletinChannelAccessControl = ((BulletinAccountInfoResponse) awS107S0400000_9.l0).channelAccessControl;
        if (bulletinChannelAccessControl != null) {
            c0oi7.LIZ(C0OII.LJII, bulletinChannelAccessControl);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS107S0400000_9 awS107S0400000_9, Object obj) {
        long jLongValue;
        C0OI7 c0oi7 = (C0OI7) obj;
        c0oi7.LIZ(C0OII.LIZ, C617050OId.LIZ(EnumC617060OIe.Companion, ((BulletinAccountInfoResponse) awS107S0400000_9.l0).identity));
        c0oi7.LIZIZ(C0OII.LIZJ, (BulletinBoardInfo) awS107S0400000_9.l1);
        c0oi7.LIZIZ(C0OII.LIZLLL, (EnumC617010OHz) awS107S0400000_9.l2);
        C0OIH<Long> c0oih = C0OII.LJ;
        Long l = ((BulletinBoardInfo) awS107S0400000_9.l1).subscriberCount;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c0oi7.LIZIZ(c0oih, Long.valueOf(jLongValue));
        C0OIH<Long> c0oih2 = C0OII.LJFF;
        Long l2 = ((BulletinBoardInfo) awS107S0400000_9.l1).quota;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        c0oi7.LIZIZ(c0oih2, Long.valueOf(jLongValue2));
        C0OIH<BulletinShareModel> c0oih3 = C0OII.LJI;
        BulletinShareModel bulletinShareModel = (BulletinShareModel) awS107S0400000_9.l3;
        if (bulletinShareModel != null) {
            ((ArrayList) c0oi7.LIZ).add(new C0OI5(c0oih3, bulletinShareModel, C0OI8.SET));
        }
        C0OIH<BulletinChannelAccessControl> c0oih4 = C0OII.LJII;
        BulletinChannelAccessControl bulletinChannelAccessControl = ((BulletinAccountInfoResponse) awS107S0400000_9.l0).channelAccessControl;
        if (bulletinChannelAccessControl != null) {
            ((ArrayList) c0oi7.LIZ).add(new C0OI5(c0oih4, bulletinChannelAccessControl, C0OI8.SET));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS107S0400000_9 awS107S0400000_9, Object obj) {
        C616880OHm c616880OHm = (C616880OHm) obj;
        BulletinListViewModel bulletinListViewModel = (BulletinListViewModel) awS107S0400000_9.l0;
        C0OK3 c0ok3BQ2 = bulletinListViewModel.BQ2();
        c616880OHm.getClass();
        BulletinListViewModel.NQ2(bulletinListViewModel, c0ok3BQ2.LJFF(c616880OHm.getListState().LLILZ, (List) awS107S0400000_9.l1, (C0OKA) awS107S0400000_9.l2, (InterfaceC1631620sYq) awS107S0400000_9.l3), null, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS107S0400000_9 awS107S0400000_9, Object obj) {
        return C0OKY.LIZ((C0OKY) obj, new C1623606Xi((BulletinBoardInfo) awS107S0400000_9.l1), new C1623606Xi((EnumC617060OIe) awS107S0400000_9.l0), (EnumC617010OHz) awS107S0400000_9.l2, null, null, null, 0L, (EnumC617480OJu) awS107S0400000_9.l3, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483512);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0400000_9(EnumC617060OIe enumC617060OIe, BulletinBoardInfo bulletinBoardInfo, EnumC617010OHz enumC617010OHz, EnumC617480OJu enumC617480OJu, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC617060OIe;
        this.l1 = bulletinBoardInfo;
        this.l2 = enumC617010OHz;
        this.l3 = enumC617480OJu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS107S0400000_9(DetailPageContainerAssem detailPageContainerAssem, DetailPageContainerAssem detailPageContainerAssem2, List<C628830OlV> list, Map<String, C628830OlV> map, List<String> list2) {
        super(1);
        this.$t = list2;
        this.l0 = detailPageContainerAssem;
        this.l1 = detailPageContainerAssem2;
        this.l2 = list;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0400000_9(BulletinListViewModel bulletinListViewModel, C13BV c13bv, C0OKA c0oka, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinListViewModel;
        this.l1 = c13bv;
        this.l2 = c0oka;
        this.l3 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0400000_9(BulletinListViewModel bulletinListViewModel, BulletinBaseItem bulletinBaseItem, BulletinBaseItem bulletinBaseItem2, C0OKA c0oka, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinListViewModel;
        this.l1 = bulletinBaseItem;
        this.l2 = bulletinBaseItem2;
        this.l3 = c0oka;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0400000_9(BulletinAccountInfoResponse bulletinAccountInfoResponse, BulletinBoardInfo bulletinBoardInfo, EnumC617010OHz enumC617010OHz, BulletinShareModel bulletinShareModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinAccountInfoResponse;
        this.l1 = bulletinBoardInfo;
        this.l2 = enumC617010OHz;
        this.l3 = bulletinShareModel;
    }
}
