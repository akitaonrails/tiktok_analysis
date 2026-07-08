package com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy;

import X.C11RO;
import X.C1604606Qa;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Feature(id = "privacy_settings", name = "Privacy Settings")
public interface PrivacySettingsFeature {
    public static final C1604606Qa LIZ = C1604606Qa.LIZ;

    boolean LIZ();

    boolean LJ();

    void LJFF(String str, int i, C11RO c11ro, C11RO c11ro2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, boolean z);

    boolean LJI();

    boolean LJII();

    String LJIIIIZZ();

    int LJIIIZ(String str);

    boolean LJIIJ();

    int LJIIJJI();

    Boolean LJIIL();

    Integer LJIILIIL(String str);

    boolean LJIILJJIL();

    boolean LJIILL();

    int LJIILLIIL();

    boolean LJIIZILJ();

    boolean LJIJ();

    Boolean LJIJI();

    boolean LJIJJ();

    boolean LJIJJLI(boolean z);

    void LJIL();

    PrivacySettingsRestrictionItem LJJ(int i, String str);

    boolean LJJI();

    void LJJIFFI(Map<String, Integer> map, C11RO c11ro, C11RO c11ro2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, boolean z);

    void LJJII(String str);
}
