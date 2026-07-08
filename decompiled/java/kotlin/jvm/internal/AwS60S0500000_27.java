package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0CNO;
import X.C1785060wYK;
import X.C1786270waH;
import X.C1849810yEl;
import X.C1852860yJg;
import X.C1853060yK0;
import X.C19EG;
import X.C259800zU;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1779320wP4;
import X.InterfaceC1493505sz;
import Y.ARunnableS17S0500000_27;
import Y.ARunnableS35S0400000_27;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PreviewMediaState;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.templateselect.TemplateSelectionPanel;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS60S0500000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS60S0500000_27 awS60S0500000_27, Object obj) {
        ((Boolean) obj).booleanValue();
        C786410Ut5.LJJZZIII((Handler) ((C1849810yEl) awS60S0500000_27.l0).LLILLL.getValue(), new ARunnableS17S0500000_27((C1849810yEl) awS60S0500000_27.l0, (C19EG) awS60S0500000_27.l1, (DialogC1389620mGW) awS60S0500000_27.l2, (AtomicBoolean) awS60S0500000_27.l3, (Runnable) awS60S0500000_27.l4, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS60S0500000_27 awS60S0500000_27, Object obj) {
        List<TikTokMediaModel> list;
        C1853060yK0 c1853060yK0 = (C1853060yK0) obj;
        C1852860yJg c1852860yJgLIZ = C1852860yJg.LIZ(c1853060yK0.LLILZIL, (List) awS60S0500000_27.l0);
        if (((C1853060yK0) awS60S0500000_27.l1).LLILLL) {
            list = (List) awS60S0500000_27.l2;
        } else {
            list = c1853060yK0.LLILLJJLI;
        }
        return C1853060yK0.LIZ(c1853060yK0, (PreviewMediaState) awS60S0500000_27.l3, list, false, null, c1852860yJgLIZ, null, (List) awS60S0500000_27.l4, false, null, null, null, null, null, 0, null, 65452);
    }

    public static final Object invoke$2(AwS60S0500000_27 awS60S0500000_27, Object obj) {
        C0CNO.LIZLLL(0L, new AwS25S0600000_27((C259800zU) awS60S0500000_27.l0, (C259800zU<DialogC1389620mGW>) awS60S0500000_27.l1, (TakoReferenceAssem) obj, (BatchDetailList) awS60S0500000_27.l2, (List<TakoSourceItem>) awS60S0500000_27.l3, (C013C) awS60S0500000_27.l4, (Function0<Unit>) 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS60S0500000_27 awS60S0500000_27, Object obj) {
        InterfaceC1493505sz interfaceC1493505sz = C1785060wYK.LIZ;
        IMAiGroupShotConfig.TemplateConfig.Selecting selecting = (IMAiGroupShotConfig.TemplateConfig.Selecting) awS60S0500000_27.l0;
        C1785060wYK.LIZ(selecting.enterFrom, ((IMAiGroupShotConfig) awS60S0500000_27.l1).entry, selecting.chatType, EnumC1779320wP4.CREATE_GROUP);
        C1786270waH c1786270waH = C1786270waH.LIZ;
        IMAiGroupShotConfig.CustomClick customClick = ((IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction.Visible) ((IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction) awS60S0500000_27.l2)).onClick;
        C19EG c19eg = (C19EG) awS60S0500000_27.l3;
        Fragment fragment = (Fragment) awS60S0500000_27.l4;
        IMAiGroupShotConfig iMAiGroupShotConfigLIZ = IMAiGroupShotConfig.LIZ((IMAiGroupShotConfig) awS60S0500000_27.l1, new IMAiGroupShotConfig.TemplateConfig.Selected((String) obj), null, 5);
        c1786270waH.getClass();
        C1786270waH.LIZ(customClick, c19eg, fragment, iMAiGroupShotConfigLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S0500000_27(C259800zU c259800zU, C259800zU<DialogC1389620mGW> c259800zU2, TakoReferenceAssem takoReferenceAssem, List<TakoSourceItem> list, C013C c013c, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = takoReferenceAssem;
        this.l3 = list;
        this.l4 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S0500000_27(C1849810yEl c1849810yEl, C19EG c19eg, DialogC1389620mGW dialogC1389620mGW, AtomicBoolean atomicBoolean, ARunnableS35S0400000_27 aRunnableS35S0400000_27, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1849810yEl;
        this.l1 = c19eg;
        this.l2 = dialogC1389620mGW;
        this.l3 = atomicBoolean;
        this.l4 = aRunnableS35S0400000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S0500000_27(IMAiGroupShotConfig.TemplateConfig.Selecting selecting, IMAiGroupShotConfig iMAiGroupShotConfig, IMAiGroupShotConfig.TemplateConfig.Selecting.CustomBottomAction customBottomAction, C19EG c19eg, TemplateSelectionPanel templateSelectionPanel, int i) {
        super(1);
        this.$t = i;
        this.l0 = selecting;
        this.l1 = iMAiGroupShotConfig;
        this.l2 = customBottomAction;
        this.l3 = c19eg;
        this.l4 = templateSelectionPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S0500000_27(List list, List<? extends TikTokMediaModel> list2, C1853060yK0 c1853060yK0, List<? extends TikTokMediaModel> list3, PreviewMediaState previewMediaState, List<? extends TikTokMediaModel> list4) {
        super(1);
        this.$t = list4;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c1853060yK0;
        this.l3 = list3;
        this.l4 = previewMediaState;
    }
}
