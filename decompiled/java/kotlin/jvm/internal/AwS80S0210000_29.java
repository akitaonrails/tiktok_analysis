package kotlin.jvm.internal;

import X.C09AY;
import X.C111S;
import X.C12G1;
import X.C1697810uHb;
import X.C19723912Ez;
import X.C325310Cp7;
import X.C419910GdJ;
import X.C450840Hm6;
import X.C451220Hmi;
import X.C568750MSj;
import Y.ACListenerS131S0200000_29;
import Y.ACListenerS163S0100000_29;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS80S0210000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS80S0210000_29 awS80S0210000_29, Object obj) {
        C451220Hmi c451220Hmi = (C451220Hmi) obj;
        if (awS80S0210000_29.z2) {
            C12G1 c12g1 = (C12G1) awS80S0210000_29.l0;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) awS80S0210000_29.l1;
            c12g1.getClass();
            C450840Hm6 c450840Hm6 = new C450840Hm6();
            c450840Hm6.LIZJ = 2131821409;
            c450840Hm6.LJ = R.attr.zs;
            c450840Hm6.LIZIZ = R.attr.zs;
            c450840Hm6.LIZ = R.raw.icon_trash_bin;
            c450840Hm6.LJFF = new ACListenerS131S0200000_29(c12g1, viewHolder, 9);
            c451220Hmi.LIZIZ(c450840Hm6);
            C450840Hm6 c450840Hm62 = new C450840Hm6();
            c450840Hm62.LIZJ = 2131821408;
            c450840Hm62.LJ = R.attr.ee;
            c450840Hm62.LIZIZ = R.attr.ee;
            c450840Hm62.LIZ = R.raw.icon_arrow_double_direction_circle;
            c450840Hm62.LJFF = new ACListenerS163S0100000_29(c12g1, 58);
            c451220Hmi.LIZIZ(c450840Hm62);
        } else {
            C12G1 c12g12 = (C12G1) awS80S0210000_29.l0;
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) awS80S0210000_29.l1;
            c12g12.getClass();
            C450840Hm6 c450840Hm63 = new C450840Hm6();
            c450840Hm63.LIZJ = R.string.gm7;
            c450840Hm63.LJ = R.attr.zs;
            c450840Hm63.LIZIZ = R.attr.zs;
            c450840Hm63.LIZ = R.raw.icon_trash_bin;
            c450840Hm63.LJFF = new ACListenerS131S0200000_29(c12g12, viewHolder2, 10);
            c451220Hmi.LIZIZ(c450840Hm63);
            if (!C568750MSj.LIZIZ(c12g12.LLLLLLIL())) {
                C450840Hm6 c450840Hm64 = new C450840Hm6();
                c450840Hm64.LIZJ = 2131846248;
                c450840Hm64.LJ = R.attr.ee;
                c450840Hm64.LIZIZ = R.attr.ee;
                c450840Hm64.LIZ = R.raw.icon_arrow_left_arrow_right;
                c450840Hm64.LJFF = new ACListenerS163S0100000_29(c12g12, 59);
                c451220Hmi.LIZIZ(c450840Hm64);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:0|2|(4:121|3|(1:5)(1:13)|6)|(8:14|(1:16)|103|114|104|(1:111)(1:108)|112|113)(1:12)|17|119|18|(2:20|(2:22|(1:26)))|27|(1:29)|32|127|33|(8:36|125|37|130|38|132|131|34)|129|41|117|42|(4:45|(4:135|47|(4:50|(3:139|52|142)(1:141)|140|48)|138)(1:137)|136|43)|134|53|(4:56|(4:144|58|(4:61|(7:148|63|123|64|149|65|152)(1:151)|150|59)|147)(1:146)|145|54)|143|68|(7:71|(4:74|(1:161)(3:158|78|162)|159|72)|156|79|(2:82|80)|155|69)|154|83|23c|102|103|114|104|(2:106|111)(0)|112|113) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:0|2|121|3|(1:5)(1:13)|6|(8:14|(1:16)|103|114|104|(1:111)(1:108)|112|113)(1:12)|17|119|18|(2:20|(2:22|(1:26)))|27|(1:29)|32|127|33|(8:36|125|37|130|38|132|131|34)|129|41|117|42|(4:45|(4:135|47|(4:50|(3:139|52|142)(1:141)|140|48)|138)(1:137)|136|43)|134|53|(4:56|(4:144|58|(4:61|(7:148|63|123|64|149|65|152)(1:151)|150|59)|147)(1:146)|145|54)|143|68|(7:71|(4:74|(1:161)(3:158|78|162)|159|72)|156|79|(2:82|80)|155|69)|154|83|23c|102|103|114|104|(2:106|111)(0)|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b2, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0269, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0271, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0272, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5  */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS80S0210000_29 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS80S0210000_29.invoke$1(kotlin.jvm.internal.AwS80S0210000_29, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS80S0210000_29 awS80S0210000_29, Object obj) {
        int i;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZJ = 2131822516;
        C419910GdJ c419910GdJ = new C419910GdJ();
        C325310Cp7.LIZ.getClass();
        if (C325310Cp7.LIZIZ()) {
            i = R.raw.icon_arrow_down_to_line;
        } else {
            i = R.raw.icon_arrow_to_down;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS598S0100000_19((Function0) awS80S0210000_29.l0, (Function0<Unit>) 617);
        if (awS80S0210000_29.z2) {
            c19723912Ez.LJIIJJI = new AwS608S0100000_29((TakoMultipleSelectVM) awS80S0210000_29.l1, 628);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS80S0210000_29 awS80S0210000_29, Object obj) {
        int i;
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        c19723912Ez.LIZJ = 2131822510;
        C419910GdJ c419910GdJ = new C419910GdJ();
        C325310Cp7.LIZ.getClass();
        if (C325310Cp7.LIZIZ()) {
            i = R.raw.icon_plus;
        } else {
            i = R.raw.icon_post;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c19723912Ez.LJ = c419910GdJ;
        c19723912Ez.LJIIJ = new AwS598S0100000_19((Function0) awS80S0210000_29.l0, (Function0<Unit>) 618);
        if (awS80S0210000_29.z2) {
            c19723912Ez.LJIIJJI = new AwS608S0100000_29((TakoMultipleSelectVM) awS80S0210000_29.l1, 629);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS80S0210000_29 awS80S0210000_29, Object obj) {
        int selectedIndex;
        int i;
        int i2;
        NaviAvatarListViewState naviAvatarListViewState = (NaviAvatarListViewState) obj;
        if (awS80S0210000_29.z2) {
            selectedIndex = ((NaviAvatarListViewState) awS80S0210000_29.l0).getSelectedIndex();
        } else {
            selectedIndex = 0;
        }
        List list = (List) awS80S0210000_29.l1;
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((C111S) it2.next()).LIZ != null && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        List list2 = (List) awS80S0210000_29.l1;
        if (list2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = list2.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (((C111S) it3.next()).LIZIZ != null && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return naviAvatarListViewState.copy((List) awS80S0210000_29.l1, i, i2, naviAvatarListViewState.loadingIndex, selectedIndex, naviAvatarListViewState.isEditDone);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0210000_29(ProfileNaviEditorViewModel profileNaviEditorViewModel, Effect effect, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileNaviEditorViewModel;
        this.l1 = effect;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S0210000_29(boolean z, C12G1 c12g1, RecyclerView.ViewHolder viewHolder, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c12g1;
        this.l1 = viewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS80S0210000_29(boolean z, boolean z2, NaviAvatarListViewState naviAvatarListViewState, List<C111S> list) {
        super(1);
        this.$t = list;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = naviAvatarListViewState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS80S0210000_29(boolean z, boolean z2, Function0<Unit> function0, TakoMultipleSelectVM takoMultipleSelectVM) {
        super(1);
        this.$t = takoMultipleSelectVM;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = function0;
    }
}
