package com.ss.android.ugc.aweme.dynamic.card;

import X.AbstractC1549150qPp;
import X.C01GW;
import X.C056W;
import X.C0ZVX;
import X.C13LE;
import X.C189W;
import X.C18SP;
import X.C18SQ;
import X.C18SU;
import X.C19719912Dl;
import X.C21286618Sa;
import X.C21286818Sc;
import X.C2241941Coy;
import X.C2242041Cp8;
import X.C2242071CpB;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService;
import com.ss.android.ugc.aweme.dynamic.card.assem.DynamicCardAbilityAssem;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot;
import com.ss.android.ugc.aweme.im.messagelist.protocols.IMDynamicCardFrame;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import okio.ByteString;

/* JADX INFO: loaded from: classes33.dex */
public final class DynamicCardServiceImpl implements DynamicCardService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(80));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(79));

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService
    public final C19719912Dl LJFF() {
        return C13LE.LIZ(DynamicCardAbilityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZIZ() {
        return (List) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService
    public final C056W LIZLLL() {
        return (C056W) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService
    public final Pair<Integer, Integer> LJ(ByteString byteString) {
        C2242041Cp8 c2242041Cp8;
        C2242071CpB c2242071CpB;
        DynamicInfoComponent dynamicInfoComponentLIZ;
        C21286618Sa.LIZIZ.getClass();
        C2241941Coy c2241941CoyDecode = C2241941Coy.ADAPTER.decode(byteString);
        if (c2241941CoyDecode == null || (c2242041Cp8 = c2241941CoyDecode.dynamic_card) == null || (c2242071CpB = c2242041Cp8.dynamic_info) == null || (dynamicInfoComponentLIZ = C21286818Sc.LIZ(c2242071CpB)) == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(dynamicInfoComponentLIZ.defaultWidth), Integer.valueOf(dynamicInfoComponentLIZ.defaultHeight));
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService
    public final C0ZVX LIZ(IMDynamicCardFrame iMDynamicCardFrame, DynamicCardReusedUISlot dynamicCardReusedUISlot, C18SU c18su, DynamicCardReusedUISlot dynamicCardReusedUISlot2, C189W c189w) {
        if (c189w.LIZ) {
            return new C18SQ(iMDynamicCardFrame, dynamicCardReusedUISlot, c18su, dynamicCardReusedUISlot2, c189w);
        }
        return new C18SP(iMDynamicCardFrame, dynamicCardReusedUISlot, c18su, dynamicCardReusedUISlot2, c189w);
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService
    public final Object LIZJ(ViewGroup viewGroup, ByteString byteString, String str, Float f, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super View> interfaceC1364105Vn) {
        return C21286618Sa.LIZIZ.LIZ(viewGroup, byteString, str, f, map, map2, function0, function02, interfaceC1364105Vn);
    }
}
