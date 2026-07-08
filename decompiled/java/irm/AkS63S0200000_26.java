package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1710280ubi;
import X.C1711930ueN;
import X.C1711990ueT;
import X.C1712010ueV;
import X.C1757320vpa;
import X.C1757630vq5;
import X.C1757660vq8;
import X.C1759850vtf;
import X.C2097608Jq;
import X.C786410Ut5;
import X.C919503ib;
import X.EnumC1757650vq7;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AkS63S0200000_26 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS63S0200000_26 akS63S0200000_26, View view) {
        InterfaceC1631620sYq<? super View, ? super PdpComponentAction, ? super String, Unit> interfaceC1631620sYq = ((C1759850vtf) akS63S0200000_26.l0).LJ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke((SmartImageView) akS63S0200000_26.l1, null, null);
        }
    }

    public static final void LIZ$1(AkS63S0200000_26 akS63S0200000_26, View view) {
        ViewGroup viewGroup;
        ViewParent parent = ((View) akS63S0200000_26.l0).getParent();
        ConcurrentHashMap<String, Object> concurrentHashMap = null;
        if (parent != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ((View) akS63S0200000_26.l0, viewGroup);
        }
        ((C1757630vq5) akS63S0200000_26.l1).getMediaController().LIZ();
        ISeaPdpCommunicationService eventCenter = ((C1757630vq5) akS63S0200000_26.l1).getEventCenter();
        if (eventCenter != null) {
            eventCenter.kC2(((C1757630vq5) akS63S0200000_26.l1).getVScope(), "sea_pdp_mini_window_manually_close", C2097608Jq.LJIIJ(new Pair("window_key", ((C1757630vq5) akS63S0200000_26.l1).getConfig().LIZ)), null, new C1757320vpa(null));
        }
        EnumC1757650vq7 enumC1757650vq7 = EnumC1757650vq7.MANUAL;
        long playDuration = ((C1757630vq5) akS63S0200000_26.l1).getPlayDuration();
        Map<String, Object> windowTrackParams = ((C1757630vq5) akS63S0200000_26.l1).getWindowTrackParams();
        CommonParamsContext commonParamsContext = ((C1757630vq5) akS63S0200000_26.l1).getCommonParamsContext();
        if (commonParamsContext != null) {
            concurrentHashMap = commonParamsContext.LL;
        }
        C1757660vq8.LIZ(enumC1757650vq7, playDuration, windowTrackParams, concurrentHashMap);
    }

    public static final void LIZ$2(AkS63S0200000_26 akS63S0200000_26, View view) {
        String str = ((SalePropTag) akS63S0200000_26.l0).descriptionSchema;
        if (str != null && str.length() != 0) {
            C919503ib.LIZIZ((Context) akS63S0200000_26.l1, str, new HashMap(), false).open();
        }
    }

    public static final void LIZ$3(AkS63S0200000_26 akS63S0200000_26, View view) {
        ((C1711930ueN) akS63S0200000_26.l0).getSaveCheckBox().setChecked(!((C1711930ueN) akS63S0200000_26.l0).getSaveCheckBox().isChecked());
        ((Function0) akS63S0200000_26.l1).invoke();
    }

    public static final void LIZ$4(AkS63S0200000_26 akS63S0200000_26, View view) {
        ((C1711930ueN) akS63S0200000_26.l0).getSaveCheckBox().setChecked(!((C1711930ueN) akS63S0200000_26.l0).getSaveCheckBox().isChecked());
        ((Function0) akS63S0200000_26.l1).invoke();
    }

    public static final void LIZ$5(AkS63S0200000_26 akS63S0200000_26, View view) {
        C786410Ut5.LJLLLLLL(8, ((C1710280ubi) akS63S0200000_26.l0).getRedDot());
        C1710280ubi c1710280ubi = (C1710280ubi) akS63S0200000_26.l0;
        c1710280ubi.LL = true;
        ((View.OnClickListener) akS63S0200000_26.l1).onClick(c1710280ubi);
    }

    public static final void LIZ$6(AkS63S0200000_26 akS63S0200000_26, View view) {
        ((C1711990ueT) akS63S0200000_26.l0).LL.invoke(((C1712010ueV) akS63S0200000_26.l1).LIZIZ);
    }

    public AkS63S0200000_26(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
