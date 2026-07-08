package kotlin.jvm.internal;

import X.C09AY;
import X.C109U;
import X.C1623606Xi;
import X.C1900610zYh;
import X.C1900660zYm;
import X.C191976108o;
import X.C191983108v;
import X.EnumC1900710zYr;
import android.view.View;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS51S0301000_28 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS51S0301000_28 awS51S0301000_28, Object obj) {
        C191983108v c191983108v = (C191983108v) awS51S0301000_28.l0;
        C109U c109u = (C109U) awS51S0301000_28.l1;
        String str = c109u.LLJILJILJ.LIZLLL;
        c191983108v.LIZJ(awS51S0301000_28.i3, c109u.LLJILJIL.LLILLL.getValue(), str);
        ((C109U) awS51S0301000_28.l1).LJIJI(awS51S0301000_28.i3, (View) obj);
        ((C191976108o) awS51S0301000_28.l2).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS51S0301000_28 awS51S0301000_28, Object obj) {
        NoticeTabModel noticeTabModel = (NoticeTabModel) awS51S0301000_28.l0;
        return C1900660zYm.LIZ((C1900660zYm) obj, noticeTabModel.index, null, noticeTabModel, null, new C1623606Xi(new C1900610zYh(awS51S0301000_28.i3, (EnumC1900710zYr) awS51S0301000_28.l1, (List) awS51S0301000_28.l2)), null, null, null, null, null, 1002);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0301000_28(C191983108v c191983108v, C109U c109u, int i, C191976108o c191976108o, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c191983108v;
        this.l1 = c109u;
        this.i3 = i;
        this.l2 = c191976108o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS51S0301000_28(NoticeTabModel noticeTabModel, NoticeTabModel noticeTabModel2, EnumC1900710zYr enumC1900710zYr, int i, List<NoticeTabModel> list) {
        super(1);
        this.$t = list;
        this.l0 = noticeTabModel;
        this.l1 = noticeTabModel2;
        this.i3 = enumC1900710zYr;
        this.l2 = i;
    }
}
