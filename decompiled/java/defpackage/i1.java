package defpackage;

import X.AbstractC365860EWa;
import X.C0CHQ;
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
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class i1 extends AbstractC365860EWa<Pair<? extends TextStickerModel, ? extends TextStyleModel>> {
    public final C554970Lpf LIZLLL;
    public final InterfaceC1635410sex LJ;
    public final int LJFF;
    public final int LJI;

    @Override // X.AbstractC365860EWa
    public final void LJIIJ() {
    }

    @Override // X.AbstractC365860EWa
    public final List<Pair<? extends TextStickerModel, ? extends TextStyleModel>> LJIIL() {
        List<TextStickerModel> list = this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels;
        ArrayList<TextStickerModel> arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : list) {
            TextStyleModel textStyle = textStickerModel.getTextStyle();
            if (textStyle != null && !C366770EZn.LIZ(textStyle.styleId) && !C570490MZb.LJ(textStyle.path)) {
                arrayList.add(textStickerModel);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (TextStickerModel textStickerModel2 : arrayList) {
            TextStyleModel textStyle2 = textStickerModel2.getTextStyle();
            if (textStyle2 == null) {
                textStyle2 = new TextStyleModel("", "", "", "", "#FFFFFFFF", null, null, null, false, "", "");
            }
            arrayList2.add(new Pair(textStickerModel2, textStyle2));
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

    public i1(C554970Lpf c554970Lpf) {
        InterfaceC1635410sex interfaceC1635410sexLIZ;
        this.LIZLLL = c554970Lpf;
        if (C297340Bl6.LIZIZ()) {
            interfaceC1635410sexLIZ = EffectService.Companion.getInstance().createFontEffectPlatform(C0CHQ.LIZ);
            if (interfaceC1635410sexLIZ == null) {
                interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(442));
            }
        } else {
            interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(443));
        }
        this.LJ = interfaceC1635410sexLIZ;
        this.LJFF = 21;
        this.LJI = 1600;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return Boolean.valueOf(this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels.isEmpty());
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        String str;
        List<TextStickerModel> list = awemeDraft.LIZ.stickerModel.textStickerModels;
        ArrayList arrayList = new ArrayList();
        Iterator<TextStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            TextStyleModel textStyle = it2.next().getTextStyle();
            if (textStyle != null && (str = textStyle.styleId) != null) {
                arrayList.add(str);
            }
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
    public final String LJIIJJI(Pair<? extends TextStickerModel, ? extends TextStyleModel> pair) {
        return pair.getSecond().styleId;
    }

    @Override // X.AbstractC365860EWa
    public final void LJIIIIZZ(Effect effect, Pair<? extends TextStickerModel, ? extends TextStyleModel> pair) {
        Pair<? extends TextStickerModel, ? extends TextStyleModel> pair2 = pair;
        TextStyleModel textStyle = pair2.getFirst().getTextStyle();
        if (textStyle != null) {
            List<TextStickerModel> list = this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels;
            C1466090oFr.LJIILJJIL(list, new AwS584S0100000_5(pair2, (Pair<Integer, Integer>) 926));
            list.add(TextStickerModel.copy$default(pair2.getFirst(), null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, TextStyleModel.LIZ(textStyle, null, null, null, null, false, effect.getUnzipPath(), 1535), null, null, null, null, false, false, null, false, false, false, null, -1, 65519, null));
        }
    }
}
