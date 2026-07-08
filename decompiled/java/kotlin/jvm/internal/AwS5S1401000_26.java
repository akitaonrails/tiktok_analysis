package kotlin.jvm.internal;

import X.C09AY;
import X.C1449260noi;
import X.C1732020vAm;
import X.C1732390vBN;
import X.C19EG;
import X.C345120Dfy;
import X.EnumC1733870vDl;
import X.InterfaceC1731950vAf;
import X.InterfaceC1732650vBn;
import X.InterfaceC497601wk;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS5S1401000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S1401000_26 awS5S1401000_26, Object obj) {
        Throwable th = (Throwable) obj;
        if (Intrinsics.LJFF(((SeaLiveEffectRootData) awS5S1401000_26.l1).source, "old_msg")) {
            C1732390vBN c1732390vBN = C1732390vBN.LIZ;
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS5S1401000_26.l2;
            String str = ((SeaLiveEffectRootData) awS5S1401000_26.l3).authorId;
            int i = awS5S1401000_26.i5;
            List listSingletonList = Collections.singletonList(awS5S1401000_26.s0);
            c1732390vBN.getClass();
            C1732390vBN.LJIILL(interfaceC497601wk, str, i, listSingletonList, false);
        }
        ((InterfaceC1732650vBn) awS5S1401000_26.l4).LIZ(String.valueOf(th.getMessage()));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS5S1401000_26 awS5S1401000_26, Object obj) {
        Map<String, String> mapLIZIZ = C345120Dfy.LIZIZ(awS5S1401000_26.i5, awS5S1401000_26.s0, (Effect) awS5S1401000_26.l1, (ShortVideoContext) awS5S1401000_26.l2);
        mapLIZIZ.put("button_name", "edit");
        C1449260noi.LJ("prop_share_window_click", mapLIZIZ);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ame_edit_effect_with_two_icons", true)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS5S1401000_26.l3, "//effect-mobile-template/edit_v2");
            NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) awS5S1401000_26.l4;
            smartRouteBuildRoute.withParam("effect_init_data", new MobileEffectData(EnumC1733870vDl.EDIT, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, newFaceStickerBean, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4078));
            smartRouteBuildRoute.withParam("ENTER_FROM", "video_shoot_page");
            smartRouteBuildRoute.withParam("effect_sdk_extra", ((Effect) awS5S1401000_26.l1).getSdkExtra());
            smartRouteBuildRoute.open(0);
        } else {
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute((Context) awS5S1401000_26.l3, "//effect-mobile-template/edit");
            NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) awS5S1401000_26.l4;
            smartRouteBuildRoute2.withParam("effect_init_data", new MobileEffectData(EnumC1733870vDl.EDIT, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, newFaceStickerBean2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4078));
            smartRouteBuildRoute2.withParam("ENTER_FROM", "video_shoot_page");
            smartRouteBuildRoute2.open(0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S1401000_26 awS5S1401000_26, Object obj) {
        Throwable th = (Throwable) obj;
        if (Intrinsics.LJFF(((EffectRootData) awS5S1401000_26.l1).source, "old_msg")) {
            C1732020vAm c1732020vAm = C1732020vAm.LIZ;
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) awS5S1401000_26.l2;
            String str = ((EffectRootData) awS5S1401000_26.l3).authorId;
            int i = awS5S1401000_26.i5;
            List listSingletonList = Collections.singletonList(awS5S1401000_26.s0);
            c1732020vAm.getClass();
            C1732020vAm.LJIILLIIL(interfaceC497601wk, str, i, listSingletonList, false);
        }
        ((InterfaceC1731950vAf) awS5S1401000_26.l4).LIZ(String.valueOf(th.getMessage()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1401000_26(int i, C19EG c19eg, ShortVideoContext shortVideoContext, NewFaceStickerBean newFaceStickerBean, Effect effect, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i5 = i;
        this.s0 = str;
        this.l1 = effect;
        this.l2 = shortVideoContext;
        this.l3 = c19eg;
        this.l4 = newFaceStickerBean;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1401000_26(SeaLiveEffectRootData seaLiveEffectRootData, InterfaceC497601wk interfaceC497601wk, SeaLiveEffectRootData seaLiveEffectRootData2, int i, String str, InterfaceC1732650vBn interfaceC1732650vBn, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = seaLiveEffectRootData;
        this.l2 = interfaceC497601wk;
        this.l3 = seaLiveEffectRootData2;
        this.i5 = i;
        this.s0 = str;
        this.l4 = interfaceC1732650vBn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1401000_26(EffectRootData effectRootData, InterfaceC497601wk interfaceC497601wk, EffectRootData effectRootData2, int i, String str, InterfaceC1731950vAf interfaceC1731950vAf, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = effectRootData;
        this.l2 = interfaceC497601wk;
        this.l3 = effectRootData2;
        this.i5 = i;
        this.s0 = str;
        this.l4 = interfaceC1731950vAf;
    }
}
