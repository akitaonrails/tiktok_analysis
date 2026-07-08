package kotlin.jvm.internal;

import X.C09AY;
import X.C0OOY;
import X.C0OTS;
import X.C2097608Jq;
import X.EnumC617610OKh;
import X.InterfaceC618630OOf;
import android.content.Context;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS77S1300000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS77S1300000_9 awS77S1300000_9) {
        ((InterfaceC618630OOf) awS77S1300000_9.l1).LIZIZ(-402L, C2097608Jq.LJ());
        C0OOY c0ooy = C0OOY.LIZ;
        String str = awS77S1300000_9.s0;
        BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) awS77S1300000_9.l2;
        int statusCode = EnumC617610OKh.API_PARAMETER_LOST_ERROR.getStatusCode();
        Map map = (Map) awS77S1300000_9.l3;
        c0ooy.getClass();
        C0OOY.LJIIL(str, bulletinBaseItem, statusCode, "item_info is Null", map);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS77S1300000_9 awS77S1300000_9) {
        BulletinCommentActionViewModel bulletinCommentActionViewModel = (BulletinCommentActionViewModel) awS77S1300000_9.l1;
        String str = awS77S1300000_9.s0;
        bulletinCommentActionViewModel.getClass();
        bulletinCommentActionViewModel.setState(new AwS60S1000000_9(str, 17));
        BulletinCommentActionViewModel.vQ2((BulletinCommentActionViewModel) awS77S1300000_9.l1, (Context) awS77S1300000_9.l2, (C0OTS) awS77S1300000_9.l3, true, null, null, 24);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS77S1300000_9(InterfaceC618630OOf interfaceC618630OOf, InterfaceC618630OOf interfaceC618630OOf2, String str, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = interfaceC618630OOf;
        this.s0 = interfaceC618630OOf2;
        this.l2 = str;
        this.l3 = bulletinBaseItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S1300000_9(BulletinCommentActionViewModel bulletinCommentActionViewModel, String str, Context context, C0OTS c0ots, int i) {
        super(0);
        this.$t = i;
        this.l1 = bulletinCommentActionViewModel;
        this.s0 = str;
        this.l2 = context;
        this.l3 = c0ots;
    }
}
