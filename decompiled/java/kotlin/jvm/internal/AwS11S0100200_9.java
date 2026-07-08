package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AwS11S0100200_9 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0100200_9(BulletinListViewModel bulletinListViewModel, long j, long j2, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinListViewModel;
        this.j1 = j;
        this.j2 = j2;
    }

    public static final Object invoke$0(AwS11S0100200_9 awS11S0100200_9, Object obj, Object obj2, Object obj3) {
        BulletinListViewModel bulletinListViewModel = (BulletinListViewModel) awS11S0100200_9.l0;
        long j = awS11S0100200_9.j1;
        long j2 = awS11S0100200_9.j2;
        bulletinListViewModel.getClass();
        return BulletinListViewModel.LQ2((List) obj, (List) obj2, j, j2);
    }

    public static final Object invoke$1(AwS11S0100200_9 awS11S0100200_9, Object obj, Object obj2, Object obj3) {
        BulletinListViewModel bulletinListViewModel = (BulletinListViewModel) awS11S0100200_9.l0;
        long j = awS11S0100200_9.j1;
        long j2 = awS11S0100200_9.j2;
        bulletinListViewModel.getClass();
        return BulletinListViewModel.LQ2((List) obj, (List) obj2, j, j2);
    }
}
