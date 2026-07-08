package defpackage;

import X.AbstractC365860EWa;
import X.C0CHQ;
import X.C0F7U;
import X.C0FAO;
import X.C1466090oFr;
import X.C15438062q;
import X.C1633850scR;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C297340Bl6;
import X.C366770EZn;
import X.C554970Lpf;
import X.C570490MZb;
import X.InterfaceC1364105Vn;
import X.InterfaceC1635410sex;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class k1 extends AbstractC365860EWa<Pair<? extends TextStickerModel, ? extends TextMotionModel>> {
    public final C554970Lpf LIZLLL;
    public final InterfaceC1635410sex LJ;
    public final int LJFF;
    public final int LJI;

    @Override // X.AbstractC365860EWa
    public final void LJIIJ() {
    }

    @Override // X.AbstractC365860EWa
    public final List<Pair<? extends TextStickerModel, ? extends TextMotionModel>> LJIIL() {
        List<TextStickerModel> list = this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (TextStickerModel textStickerModel : list) {
            C0F7U.LIZJ(textStickerModel);
            arrayList.add(new Pair(textStickerModel, textStickerModel.getTextMotionModel()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            TextMotionModel textMotionModel = (TextMotionModel) ((Pair) obj).getSecond();
            if (!C366770EZn.LIZ(textMotionModel.motionId) && !C570490MZb.LJ(textMotionModel.motionPath)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC365860EWa
    public final InterfaceC1635410sex LJIIIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return this.LJI;
    }

    public k1(C554970Lpf c554970Lpf) {
        InterfaceC1635410sex interfaceC1635410sexLIZ;
        this.LIZLLL = c554970Lpf;
        if (C297340Bl6.LIZIZ()) {
            interfaceC1635410sexLIZ = EffectService.Companion.getInstance().createFontEffectPlatform(C0CHQ.LIZ);
            if (interfaceC1635410sexLIZ == null) {
                interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(447));
            }
        } else {
            interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(448));
        }
        this.LJ = interfaceC1635410sexLIZ;
        this.LJFF = 19;
        this.LJI = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return Boolean.valueOf(this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels.isEmpty());
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        List<TextStickerModel> list = awemeDraft.LIZ.stickerModel.textStickerModels;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TextStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getTextMotionModel().motionId);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!C366770EZn.LIZ((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return C2097608Jq.LJ();
        }
        return C2097908Jt.LIZJ(new Pair(C0FAO.FONT, arrayList2));
    }

    @Override // X.AbstractC365860EWa
    public final String LJIIJJI(Pair<? extends TextStickerModel, ? extends TextMotionModel> pair) {
        return pair.getSecond().motionId;
    }

    @Override // X.AbstractC365860EWa
    public final void LJIIIIZZ(Effect effect, Pair<? extends TextStickerModel, ? extends TextMotionModel> pair) {
        Pair<? extends TextStickerModel, ? extends TextMotionModel> pair2 = pair;
        List<TextStickerModel> list = this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels;
        C1466090oFr.LJIILJJIL(list, new AwS584S0100000_5(pair2, (Pair<Integer, Integer>) 945));
        list.add(TextStickerModel.copy$default(pair2.getFirst(), null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, TextMotionModel.LIZ(pair2.getFirst().getTextMotionModel(), effect.getUnzipPath(), 0.0f, 0, null, null, 0, false, 1022), null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -268435457, 65535, null));
    }
}
