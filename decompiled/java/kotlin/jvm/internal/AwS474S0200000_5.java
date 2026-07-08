package kotlin.jvm.internal;

import X.AbstractC370530Efr;
import X.C09AY;
import X.C123100dR;
import X.C189200o6;
import X.C2252611DEt;
import X.C366940Ea4;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import X.InterfaceC20236714Gf;
import android.graphics.PointF;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedEditFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public class AwS474S0200000_5 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
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
    public AwS474S0200000_5(AwemeDraft awemeDraft, C2252611DEt c2252611DEt, int i) {
        super(3);
        this.$t = i;
        this.l0 = awemeDraft;
        this.l1 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS474S0200000_5(CurveSpeedEditFragment curveSpeedEditFragment, C366940Ea4 c366940Ea4, int i) {
        super(3);
        this.$t = i;
        this.l0 = curveSpeedEditFragment;
        this.l1 = c366940Ea4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$0(AwS474S0200000_5 awS474S0200000_5, Object obj, Object obj2, Object obj3) {
        Pair pair;
        TextView textView;
        float f;
        float fFloatValue = ((Number) obj).floatValue();
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (iIntValue >= 0) {
            View contentView = ((PopupWindow) ((CurveSpeedEditFragment) awS474S0200000_5.l0).LLLIIL.getValue()).getContentView();
            if (contentView != null && (textView = (TextView) contentView.findViewById(R.id.zf0)) != null) {
                C366940Ea4 c366940Ea4 = (C366940Ea4) awS474S0200000_5.l1;
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[1];
                if (iIntValue <= ((ArrayList) c366940Ea4.LLILLJJLI).size() - 1) {
                    c366940Ea4.LJ((PointF) ListProtector.get(c366940Ea4.LLILLJJLI, iIntValue), c366940Ea4.LLILZ);
                    f = c366940Ea4.LLILZ.y;
                } else {
                    f = 1.0f;
                }
                objArr[0] = Float.valueOf(f);
                textView.setText(C786410Ut5.k4(locale, "%.1fx", Arrays.copyOf(objArr, 1)));
            }
            if (zBooleanValue) {
                C366940Ea4 c366940Ea42 = (C366940Ea4) awS474S0200000_5.l1;
                if (iIntValue <= ((ArrayList) c366940Ea42.LLILLJJLI).size() - 1) {
                    PointF pointF = (PointF) ListProtector.get(c366940Ea42.LLILLJJLI, iIntValue);
                    pair = new Pair(Float.valueOf(pointF.x), Float.valueOf(pointF.y));
                } else {
                    pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
                }
                CurveSpeedEditFragment curveSpeedEditFragment = (CurveSpeedEditFragment) awS474S0200000_5.l0;
                ((AbstractC370530Efr) curveSpeedEditFragment.LLLIIL.getValue()).LJJIJ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), curveSpeedEditFragment.jT());
            }
        }
        ((SpeedViewModel) ((CurveSpeedEditFragment) awS474S0200000_5.l0).wS()).pausePlay();
        ((SpeedViewModel) ((CurveSpeedEditFragment) awS474S0200000_5.l0).wS()).seekToFromSegDelta(fFloatValue, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS474S0200000_5 awS474S0200000_5, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        String str = (String) obj3;
        if (((Boolean) obj2).booleanValue() && C123100dR.LIZ(str)) {
            ((AwemeDraft) awS474S0200000_5.l0).LJIJJ(str);
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS474S0200000_5.l1;
        DraftFileRestoreResult draftFileRestoreResult = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, null, false, new DraftFileRestoreException(0, null, "Unknown"));
        C189200o6.m2constructorimpl(draftFileRestoreResult);
        interfaceC20236714Gf.resumeWith(draftFileRestoreResult);
        return Unit.LIZ;
    }
}
