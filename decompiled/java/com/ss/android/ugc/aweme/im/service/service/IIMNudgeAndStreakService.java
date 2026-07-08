package com.ss.android.ugc.aweme.im.service.service;

import X.C0Z9Z;
import X.C0ZF8;
import X.C869590Y9l;
import X.C896120ZDm;
import X.C896140ZDo;
import X.InterfaceC1365230ldB;
import X.InterfaceC895030Z9h;
import X.InterfaceC895790ZCf;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public interface IIMNudgeAndStreakService extends InterfaceC1365230ldB, InterfaceC895790ZCf, InterfaceC895030Z9h, C0Z9Z {
    public static final C0ZF8 LIZ = C0ZF8.LIZ;

    boolean LIZ(int i);

    boolean LJI(SetSticker setSticker);

    C896140ZDo LJII();

    boolean LJIIIZ(C869590Y9l c869590Y9l);

    boolean LJIIJ(int i);

    boolean LJIIJJI(C869590Y9l c869590Y9l);

    String LJIILJJIL(boolean z);

    boolean LJIILL(Map<String, String> map);

    boolean LJIILLIIL(C869590Y9l c869590Y9l);

    boolean LJIIZILJ(C869590Y9l c869590Y9l);

    boolean LJIJ(C869590Y9l c869590Y9l);

    boolean LJIJI(C869590Y9l c869590Y9l);

    Map LJIJJLI(Long l, Long l2);

    boolean LJIL(C869590Y9l c869590Y9l);

    String LJJ(boolean z);

    Drawable LJJI();

    String LJJIII(Long l, Long l2);

    boolean LJJIIJ(Long l, Long l2);

    boolean LJJIIJZLJL(InnerPushMessage innerPushMessage, Function0<Unit> function0);

    String LJJIIZ(C869590Y9l c869590Y9l, boolean z);

    C896120ZDm LJJIIZI();

    void LJJIJIIJI(View view);

    String LJJIJL(C869590Y9l c869590Y9l, boolean z);

    boolean LJJIJLIJ(Bundle bundle);

    boolean LJJIZ();

    int LJJJI();

    boolean LJJJIL(Map<String, String> map);
}
