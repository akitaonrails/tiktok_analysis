package kotlin.jvm.internal;

import X.AbstractC879060Ye8;
import X.C09AY;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z2F;
import X.C0Z9N;
import X.C1440005kM;
import X.C1459970o5z;
import X.C1462880oAg;
import X.C1511105vp;
import X.C1662100tM0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C461720I8s;
import X.C861080XqE;
import X.C861130XqJ;
import X.C878230Ycn;
import X.C893940Z5c;
import X.C913630Zsn;
import X.EnumC1651790t5N;
import X.InterfaceC867020Xzo;
import X.InterfaceC876950Yaj;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes15.dex */
public class AwS163S1100000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS163S1100000_14 awS163S1100000_14) {
        boolean z = C878230Ycn.LLJILJIL;
        Context context = (Context) awS163S1100000_14.l1;
        String str = awS163S1100000_14.s0;
        if (!C878230Ycn.LLJILJIL) {
            Librarian.LJFF("wcdb");
            C878230Ycn.LLJILJIL = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_search_sdk.db");
        return new C878230Ycn(context, C2188811AlT.LIZIZ(sbLIZ)).LJ();
    }

    public static final Object invoke$1(AwS163S1100000_14 awS163S1100000_14) {
        EventBus.LIZLLL().LJIILL(new C1511105vp(awS163S1100000_14.s0, (AlertToneValueItem) awS163S1100000_14.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS163S1100000_14 awS163S1100000_14) {
        return Boolean.valueOf(((C1459970o5z) awS163S1100000_14.l1).LLLLLLLLLL(4, new C1662100tM0(EnumC1651790t5N.EDIT_STICKER, "", awS163S1100000_14.s0, true, 3000L, null, null, null, null, null, null, null, null, 8160)));
    }

    public static final Object invoke$3(AwS163S1100000_14 awS163S1100000_14) {
        C1459970o5z c1459970o5z = (C1459970o5z) awS163S1100000_14.l1;
        return Boolean.valueOf(c1459970o5z.LLLLLLLLLL(1104, new C1662100tM0(EnumC1651790t5N.PHOTO_TEMPLATE, c1459970o5z.getString(2131846764), awS163S1100000_14.s0, true, Mp4ScreenVideoLoadTimeout.CONTROL, null, null, null, null, null, null, null, null, 8160)));
    }

    public static final Object invoke$4(AwS163S1100000_14 awS163S1100000_14) {
        boolean z;
        int iLJFF = ((C0Z2F) awS163S1100000_14.l1).LJFF(Long.valueOf(C461720I8s.LIZJ()), awS163S1100000_14.s0);
        if (iLJFF != C0Z9N.ADMIN.getValue() && iLJFF != C0Z9N.OWNER.getValue()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS163S1100000_14 awS163S1100000_14) {
        final GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) awS163S1100000_14.l1;
        groupDetailViewModel.getClass();
        C1440005kM.LIZ(new C893940Z5c(true));
        final C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(groupDetailViewModel.wQ2());
        AbstractC879060Ye8 abstractC879060Ye8XQ2 = groupDetailViewModel.xQ2();
        if (abstractC879060Ye8XQ2 != null) {
            abstractC879060Ye8XQ2.LJI(new InterfaceC867020Xzo<String>() { // from class: X.0Z5i
                @Override // X.InterfaceC867020Xzo
                public final void LIZ(C868810Y6l<String> c868810Y6l) {
                    C894010Z5j.LIZIZ.LIZ(c0y8tLIZ, c868810Y6l.LIZJ, 0);
                    groupDetailViewModel.setState(AFwS248S0000000_14.get$arr$(522));
                }

                @Override // X.InterfaceC867020Xzo
                public final void LIZIZ(C0Y00 c0y00) {
                    C742250T9r c742250T9r = c0y00.LIZIZ;
                    C0YMW c0ymw = c0y00.LIZ;
                    C1440005kM.LIZ(new C893940Z5c(false));
                    C894010Z5j.LIZIZ.LIZ(c0y8tLIZ, c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                }
            });
        }
        C913630Zsn.LJIIJJI.LJII("leave_group", C0Z9N.OWNER.getValue(), Collections.singletonList(awS163S1100000_14.s0), ((GroupDetailViewModel) awS163S1100000_14.l1).wQ2(), C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS163S1100000_14 awS163S1100000_14) {
        ((C1462880oAg) awS163S1100000_14.l1).LLILLJJLI.setValue(new C861130XqJ(true, awS163S1100000_14.s0));
        C1462880oAg c1462880oAg = (C1462880oAg) awS163S1100000_14.l1;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) c1462880oAg.LLILZLL.getValue(c1462880oAg, C1462880oAg.LLIZLLLIL[2]));
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C861080XqE(c1462880oAg, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S1100000_14(C0Z2F c0z2f, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0z2f;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S1100000_14(C1459970o5z c1459970o5z, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1459970o5z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S1100000_14(C1462880oAg c1462880oAg, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1462880oAg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S1100000_14(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S1100000_14(GroupDetailViewModel groupDetailViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = groupDetailViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S1100000_14(String str, AlertToneValueItem alertToneValueItem, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = alertToneValueItem;
    }
}
