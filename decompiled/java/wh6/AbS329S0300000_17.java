package wh6;

import X.AbstractC1110790f0n;
import X.AbstractC1110800f0o;
import X.AbstractC1113530f5D;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0KAJ;
import X.C1099770ej1;
import X.C1099800ej4;
import X.C1102690enj;
import X.C1113470f57;
import X.C1113490f59;
import X.C1119210fEN;
import X.C1161920gLG;
import X.C468250IXv;
import X.EnumC1102740eno;
import X.InterfaceC1102810env;
import X.InterfaceC1846850y9z;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.rank.impl.sticker.dialog.TabRankStickerDialog;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.other.ToolbarTipsClickableExperiment;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenSubviewSetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: loaded from: classes18.dex */
public class AbS329S0300000_17 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS329S0300000_17 abS329S0300000_17, View view) {
        if (view != null && !((InterfaceC1846850y9z) abS329S0300000_17.l0).LJIIIZ()) {
            C1119210fEN c1119210fEN = C1119210fEN.LIZ;
            Context context = ((TabRankStickerDialog) abS329S0300000_17.l1).getContext();
            TabRankStickerDialog tabRankStickerDialog = (TabRankStickerDialog) abS329S0300000_17.l1;
            DataChannel dataChannel = tabRankStickerDialog.dataChannel;
            RankTypeV2 rankTypeV2 = (RankTypeV2) abS329S0300000_17.l2;
            InterfaceC1846850y9z interfaceC1846850y9z = (InterfaceC1846850y9z) abS329S0300000_17.l0;
            AwS383S0200000_17 awS383S0200000_17 = new AwS383S0200000_17(tabRankStickerDialog, interfaceC1846850y9z, 15);
            c1119210fEN.getClass();
            C1119210fEN.LJ(context, dataChannel, rankTypeV2, interfaceC1846850y9z, awS383S0200000_17);
        }
    }

    public static final void LIZ$1(AbS329S0300000_17 abS329S0300000_17, View view) {
        InterfaceC1102810env interfaceC1102810envLIZIZ;
        if (view != null) {
            Function0<Unit> function0 = ((C1099800ej4) abS329S0300000_17.l0).LJII;
            if (function0 != null) {
                function0.invoke();
                C1099770ej1 c1099770ej1 = C1099770ej1.LL;
                C0KAJ c0kaj = C0KAJ.MANUALLY_ROUTE;
                c1099770ej1.getClass();
                C1099770ej1.LIZIZ(true, c0kaj);
                return;
            }
            if (!ToolbarTipsClickableExperiment.INSTANCE.getClickable()) {
                return;
            }
            if (C468250IXv.LIZJ((DataChannel) abS329S0300000_17.l1)) {
                C468250IXv.LJ((DataChannel) abS329S0300000_17.l1, "bottom_zone");
                return;
            }
            if (C468250IXv.LIZ((DataChannel) abS329S0300000_17.l1)) {
                C468250IXv.LIZIZ((DataChannel) abS329S0300000_17.l1, "share");
            }
            C1102690enj c1102690enjHy0 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0((DataChannel) abS329S0300000_17.l1);
            if (c1102690enjHy0 != null && (interfaceC1102810envLIZIZ = c1102690enjHy0.LIZIZ((EnumC1102740eno) abS329S0300000_17.l2)) != null) {
                interfaceC1102810envLIZIZ.onClick(view);
            }
            C1099770ej1 c1099770ej12 = C1099770ej1.LL;
            C0KAJ c0kaj2 = C0KAJ.MANUALLY_ROUTE;
            c1099770ej12.getClass();
            C1099770ej1.LIZIZ(true, c0kaj2);
        }
    }

    public static final void LIZ$2(AbS329S0300000_17 abS329S0300000_17, View view) {
        if (view != null) {
            C1113490f59 c1113490f59 = (C1113490f59) abS329S0300000_17.l0;
            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) abS329S0300000_17.l1;
            PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS329S0300000_17.l2;
            AbstractC1113530f5D.LJFF(c1113490f59, abstractC1110800f0o, topic, "tag_none_cta", false, topic.eventTrackingFields, 8);
        }
    }

    public static final void LIZ$3(AbS329S0300000_17 abS329S0300000_17, View view) {
        if (view != null) {
            if (LivePublicScreenSubviewSetting.INSTANCE.onlyShowTag()) {
                ((C1113470f57) abS329S0300000_17.l0).LJIIJ(((AbstractC1110790f0n) abS329S0300000_17.l1).LLIIIILZ(), ((AbstractC1110790f0n) abS329S0300000_17.l1).LLJJIII(), ((AbstractC1110790f0n) abS329S0300000_17.l1).LLIIJI());
            }
            C1113470f57 c1113470f57 = (C1113470f57) abS329S0300000_17.l0;
            AbstractC1110790f0n abstractC1110790f0n = (AbstractC1110790f0n) abS329S0300000_17.l1;
            PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS329S0300000_17.l2;
            AbstractC1113530f5D.LJFF(c1113470f57, abstractC1110790f0n, topic, "others", false, topic.eventTrackingFields, 8);
        }
    }

    public static final void LIZ$4(AbS329S0300000_17 abS329S0300000_17, View view) {
        if (view != null) {
            ((C1113470f57) abS329S0300000_17.l0).LJIIIZ((AbstractC1110790f0n) abS329S0300000_17.l1, (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS329S0300000_17.l2, "add");
        }
    }

    public static final void LIZ$5(AbS329S0300000_17 abS329S0300000_17, View view) {
        if (view != null) {
            ((C1113470f57) abS329S0300000_17.l0).LJIIIZ((AbstractC1110790f0n) abS329S0300000_17.l1, (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) abS329S0300000_17.l2, "others");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS329S0300000_17(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
