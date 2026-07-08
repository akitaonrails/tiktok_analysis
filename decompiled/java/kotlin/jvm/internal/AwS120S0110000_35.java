package kotlin.jvm.internal;

import X.C09AY;
import X.C1644450stX;
import X.C1DW6;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS120S0110000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS120S0110000_35 r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState r5 = (com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState) r5
            java.lang.Object r3 = r4.l0
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget r3 = (com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget) r3
            boolean r1 = r4.z1
            java.lang.String r0 = r5.getHidePriceTip()
            r2 = 0
            if (r1 == 0) goto L2e
            X.0vzk r0 = r3.LLJILJIL
            if (r0 == 0) goto L16
            X.C0H1U.LIZIZ(r0)
        L16:
            com.bytedance.tux.input.TuxTextView r0 = r3.LLJILJILJ
            if (r0 == 0) goto L1d
            X.C0H1U.LIZIZ(r0)
        L1d:
            X.0Gtm r0 = r3.LLJILLL
            if (r0 == 0) goto L24
            r0.LIZIZ(r2)
        L24:
            X.0Gnh r0 = r3.LLJJ
            if (r0 == 0) goto L2b
            r0.LIZLLL(r2)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            r1 = 1
            if (r0 == 0) goto L50
            r3.getClass()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L50
            com.bytedance.tux.input.TuxTextView r0 = r3.LLJILJILJ
            if (r0 == 0) goto L41
            X.C12ES.LJIILL(r2, r0)
        L41:
            X.0Gtm r0 = r3.LLJILLL
            if (r0 == 0) goto L48
            r0.LIZIZ(r1)
        L48:
            X.0Gnh r0 = r3.LLJJ
            if (r0 == 0) goto L2b
            r0.LIZLLL(r1)
            goto L2b
        L50:
            X.0vzk r0 = r3.LLJILJIL
            if (r0 == 0) goto L41
            X.C12ES.LJIILL(r2, r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS120S0110000_35.invoke$0(kotlin.jvm.internal.AwS120S0110000_35, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS120S0110000_35 awS120S0110000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, new C1644450stX<>(new Pair((TextStickerData) awS120S0110000_35.l0, Boolean.valueOf(awS120S0110000_35.z1))), editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$2(AwS120S0110000_35 awS120S0110000_35, Object obj) {
        ((C1DW6) obj).u6((List) awS120S0110000_35.l0, awS120S0110000_35.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS120S0110000_35 awS120S0110000_35, Object obj) {
        ((C1DW6) obj).su((C869590Y9l) awS120S0110000_35.l0, awS120S0110000_35.z1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S0110000_35(C869590Y9l c869590Y9l, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S0110000_35(SeaSkuPanelSkcHeaderWidget seaSkuPanelSkcHeaderWidget, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = seaSkuPanelSkcHeaderWidget;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS120S0110000_35(TextStickerData textStickerData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = textStickerData;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS120S0110000_35(List list, List<C869590Y9l> list2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
    }
}
