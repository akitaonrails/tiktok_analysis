package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06P2;
import X.C06P3;
import X.C06P4;
import X.C09AY;
import X.C0ZZ5;
import X.C1322110kVd;
import X.C15O7;
import X.C1602306Pd;
import X.C23250099c;
import X.C259800zU;
import X.C565950MHp;
import X.C869590Y9l;
import X.InterfaceC0148002o;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS281S0300000_2 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS281S0300000_2 awS281S0300000_2, Object obj, Object obj2) {
        List<C869590Y9l> listVi2;
        MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ((C01GW) awS281S0300000_2.l0).getValue();
        if (messagePowerListAbility != null && (listVi2 = messagePowerListAbility.vi2()) != null) {
            AssemVMLazy assemVMLazy = (AssemVMLazy) awS281S0300000_2.l1;
            ArrayList arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : listVi2) {
                if (C0ZZ5.LIZLLL(assemVMLazy).LLJ.contains(c869590Y9l.getUuid())) {
                    arrayList.add(c869590Y9l);
                }
            }
            ChatRoomStreakViewModel chatRoomStreakViewModelLIZLLL = C0ZZ5.LIZLLL((AssemVMLazy) awS281S0300000_2.l1);
            C23250099c.LIZLLL(chatRoomStreakViewModelLIZLLL.LLJILJIL, null, null, new C1602306Pd(listVi2, new AwS403S0200000_2(arrayList, (List<? extends C869590Y9l>) awS281S0300000_2.l2, (C01GW<? extends ChatroomEventAbility>) 19), chatRoomStreakViewModelLIZLLL, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS281S0300000_2 awS281S0300000_2, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) obj2;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C06P4((AssemVMLazy) awS281S0300000_2.l0, viewOnAttachStateChangeListenerC20604515jv, (AssemVMLazy) awS281S0300000_2.l1, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C06P3((AssemVMLazy) awS281S0300000_2.l1, viewOnAttachStateChangeListenerC20604515jv, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C06P2((C01GW) awS281S0300000_2.l2, viewOnAttachStateChangeListenerC20604515jv, (AssemVMLazy) awS281S0300000_2.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS281S0300000_2 awS281S0300000_2, Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj;
        final boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (bitmap != null && !bitmap.isRecycled()) {
            ((C1322110kVd) awS281S0300000_2.l0).setImageBitmap(bitmap);
            C565950MHp.LIZ((VideoPublishEditModel) awS281S0300000_2.l1);
            final C259800zU c259800zU = (C259800zU) awS281S0300000_2.l2;
            final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS281S0300000_2.l1;
            C15O7.LIZJ(new Callable() { // from class: X.0LHV
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean zLJFF;
                    C1C7U.LIZ("CoverExtKt@ad6c.loadCoverImage$2$1");
                    if (C493401w4.LIZ()) {
                        C0MH8 c0mh8 = C0MH8.LIZ;
                        String str = c259800zU.element;
                        int i = zBooleanValue ? 5 : 3;
                        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        Bitmap bitmap2 = bitmap;
                        int i2 = C1428470nHB.LJJZZI(videoPublishEditModel2) ? 1001 : LSPassThroughRecordSizeConfig.DEFAULT;
                        c0mh8.getClass();
                        zLJFF = C0MH8.LJIJ(videoPublishEditModel2, bitmap2, i2, i, str, 60);
                    } else {
                        zLJFF = C2475309mx.LJFF(60, Bitmap.CompressFormat.PNG, bitmap, new C0VSJ(c259800zU.element));
                    }
                    Boolean boolValueOf = Boolean.valueOf(zLJFF);
                    C1C7U.LIZIZ("CoverExtKt@ad6c.loadCoverImage$2$1");
                    return boolValueOf;
                }
            });
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS281S0300000_2(C1322110kVd c1322110kVd, C1322110kVd c1322110kVd2, VideoPublishEditModel videoPublishEditModel, C259800zU<String> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = c1322110kVd;
        this.l1 = c1322110kVd2;
        this.l2 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS281S0300000_2(AssemVMLazy assemVMLazy, C01GW c01gw, C01GW c01gw2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c01gw;
        this.l1 = assemVMLazy;
        this.l2 = c01gw2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS281S0300000_2(AssemVMLazy assemVMLazy, AssemVMLazy<InterfaceC0148002o, PanelStateViewModel> assemVMLazy2, AssemVMLazy<InterfaceC0148002o, LiveCardViewModel> assemVMLazy3, C01GW<? extends MessagePowerListAbility> c01gw) {
        super(2);
        this.$t = c01gw;
        this.l0 = assemVMLazy;
        this.l1 = assemVMLazy2;
        this.l2 = assemVMLazy3;
    }
}
