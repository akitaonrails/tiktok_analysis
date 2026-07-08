package kotlin.jvm.internal;

import X.C09AY;
import X.C0BM1;
import X.C0P08;
import X.C1391190mJ3;
import X.C1671390taz;
import X.C197039127h;
import X.C343970De7;
import X.C623610Od5;
import X.C623820OdQ;
import X.C631230OpN;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS113S0200000_9;
import Y.ACListenerS144S0100000_9;
import Y.ACListenerS76S0300000_9;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS63S0210000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS63S0210000_9 awS63S0210000_9, Object obj) {
        int i;
        Context context = (Context) obj;
        View viewSd = C786410Ut5.Sd(R.layout.egg, C786410Ut5.ne(context), null);
        C0P08 c0p08 = (C0P08) viewSd.findViewById(R.id.osy);
        C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.otk);
        if (C0BM1.LIZ()) {
            i = 2;
        } else {
            i = 3;
        }
        AddSongEntranceViewModel addSongEntranceViewModel = (AddSongEntranceViewModel) awS63S0210000_9.l0;
        boolean z = awS63S0210000_9.z2;
        c0p08.setButtonSize(i);
        c0p08.setTag(R.id.ih9, "font_sync");
        C1671390taz.LJIILJJIL(addSongEntranceViewModel, c0p08);
        if (z) {
            addSongEntranceViewModel.onShow(true);
            C631230OpN.LIZJ(c0p08);
        } else {
            C631230OpN.LIZ(c0p08);
        }
        C786410Ut5.ea(c0p08, new ACListenerS76S0300000_9(context, c0p08, addSongEntranceViewModel, 4));
        C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9((Function0) awS63S0210000_9.l1, 60));
        c197039127h.setButtonSize(i);
        c197039127h.setTag(R.id.ih9, "font_sync");
        return viewSd;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS63S0210000_9 awS63S0210000_9, Object obj) {
        View view = (View) obj;
        C0P08 c0p08 = (C0P08) view.findViewById(R.id.osy);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.otk);
        C1671390taz.LJIILJJIL((AddSongEntranceViewModel) awS63S0210000_9.l0, c0p08);
        boolean z = awS63S0210000_9.z2;
        AddSongEntranceViewModel addSongEntranceViewModel = (AddSongEntranceViewModel) awS63S0210000_9.l0;
        if (z) {
            C631230OpN.LIZJ(c0p08);
        } else {
            C631230OpN.LIZ(c0p08);
        }
        C786410Ut5.ea(c0p08, new ACListenerS113S0200000_9(c0p08, addSongEntranceViewModel, 13));
        C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9((Function0) awS63S0210000_9.l1, 61));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS63S0210000_9 awS63S0210000_9, Object obj) {
        if (awS63S0210000_9.z2) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((MusicListPanelFragment) awS63S0210000_9.l0, C343970De7.LIZ);
        }
        ((Function1) awS63S0210000_9.l1).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS63S0210000_9 awS63S0210000_9, Object obj) {
        ArrayList arrayList = new ArrayList();
        List<InterfaceC1891350zJl> list = ((C623610Od5) obj).LLILZIL;
        C623820OdQ c623820OdQ = (C623820OdQ) awS63S0210000_9.l1;
        boolean z = awS63S0210000_9.z2;
        for (Object objLIZ : list) {
            if (objLIZ instanceof C623820OdQ) {
                C623820OdQ c623820OdQ2 = (C623820OdQ) objLIZ;
                if (Intrinsics.LJFF(c623820OdQ2.LLILLJJLI, c623820OdQ.LLILLJJLI) && c623820OdQ2.LLILLL == c623820OdQ.LLILLL && Intrinsics.LJFF(c623820OdQ2.LL, c623820OdQ.LL)) {
                    objLIZ = C623820OdQ.LIZ(c623820OdQ2, z);
                }
            }
            arrayList.add(objLIZ);
        }
        ((WorkBenchViewModel) awS63S0210000_9.l0).setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 446));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S0210000_9(WorkBenchViewModel workBenchViewModel, C623820OdQ c623820OdQ, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = workBenchViewModel;
        this.l1 = c623820OdQ;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS63S0210000_9(AddSongEntranceViewModel addSongEntranceViewModel, AddSongEntranceViewModel addSongEntranceViewModel2, boolean z, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = addSongEntranceViewModel;
        this.z2 = addSongEntranceViewModel2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S0210000_9(boolean z, MusicListPanelFragment musicListPanelFragment, AwS387S0200000_21 awS387S0200000_21, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = musicListPanelFragment;
        this.l1 = awS387S0200000_21;
    }
}
