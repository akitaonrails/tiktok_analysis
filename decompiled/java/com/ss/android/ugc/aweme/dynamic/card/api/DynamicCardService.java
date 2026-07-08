package com.ss.android.ugc.aweme.dynamic.card.api;

import X.AbstractC1549150qPp;
import X.C056W;
import X.C0ZVX;
import X.C1765306vj;
import X.C189W;
import X.C18SU;
import X.C19719912Dl;
import X.InterfaceC1364105Vn;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot;
import com.ss.android.ugc.aweme.im.messagelist.protocols.IMDynamicCardFrame;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public interface DynamicCardService {
    public static final C1765306vj LIZ = C1765306vj.LIZ;

    C0ZVX LIZ(IMDynamicCardFrame iMDynamicCardFrame, DynamicCardReusedUISlot dynamicCardReusedUISlot, C18SU c18su, DynamicCardReusedUISlot dynamicCardReusedUISlot2, C189W c189w);

    List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZIZ();

    Object LIZJ(ViewGroup viewGroup, ByteString byteString, String str, Float f, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super View> interfaceC1364105Vn);

    C056W LIZLLL();

    Pair<Integer, Integer> LJ(ByteString byteString);

    C19719912Dl LJFF();
}
